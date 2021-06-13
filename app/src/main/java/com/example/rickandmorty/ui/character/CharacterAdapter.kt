package com.example.rickandmorty.ui.character

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmorty.R
import com.example.rickandmorty.enum.CharacterStatusEnums
import com.example.rickandmorty.enum.SwitchLayoutEnums
import com.example.rickandmorty.extensions.loadFromUrl
import com.example.rickandmorty.model.Character
import kotlinx.android.synthetic.main.item_character.view.*
class CharacterAdapter() : RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {

    private val characterList by lazy { mutableListOf<Character>() }

    class CharacterViewHolder(var view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {

        val view: View
        val inflater = LayoutInflater.from(parent.context)
        view = if (viewType == SwitchLayoutEnums.VIEW_TYPE_BIG.value) {
            inflater.inflate(R.layout.item_character, parent, false)
        } else {
            inflater.inflate(R.layout.item_character_grid, parent, false)
        }

        return CharacterViewHolder(view)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {

        holder.view.ivCharacterProfile.loadFromUrl(characterList[position].image.toString())
        holder.view.tvCharacterName.text = characterList[position].name
        holder.view.tvCharacterSpecies.text = characterList[position].status + " - " + characterList[position].species
        holder.view.tvCharacterGender.text = characterList[position].gender

        holder.view.setOnClickListener {
            val characterId = characterList[position].id.toString().toInt()
            val action =
                    CharacterFragmentDirections.actionCharacterFragmentToCharacterDetailFragment(
                            characterId
                    )

            Navigation.findNavController(it).navigate(action)
        }

        when (characterList[position].status) {
            CharacterStatusEnums.CHARACTER_ALIVE.value -> holder.view.dead_status.setBackgroundColor(Color.parseColor("#14D91B"))
            CharacterStatusEnums.CHARACTER_DEAD.value -> holder.view.dead_status.setBackgroundColor(Color.parseColor("#FF0800"))
            CharacterStatusEnums.CHARACTER_UNKNOWN.value -> holder.view.dead_status.setBackgroundColor(Color.parseColor("#F8F816"))
            else -> {
                holder.view.dead_status.setBackgroundColor(Color.parseColor("#F8F816"))
            }
        }
    }

    override fun getItemViewType(position: Int): Int {

        return SwitchLayoutEnums.VIEW_TYPE_BIG.value
    }

    override fun getItemCount(): Int {

        return characterList.size
    }

    fun updateList(newCountryList: List<Character>) {

        if (characterList.isNotEmpty()) {
            this.characterList.clear()
        }
        characterList.addAll(newCountryList)
        notifyDataSetChanged()
    }
}
