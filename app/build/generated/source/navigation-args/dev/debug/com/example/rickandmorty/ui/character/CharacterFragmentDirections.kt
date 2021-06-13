package com.example.rickandmorty.ui.character

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.rickandmorty.R
import kotlin.Int

public class CharacterFragmentDirections private constructor() {
  private data class ActionCharacterFragmentToCharacterDetailFragment(
    public val characterId: Int = 0
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_characterFragment_to_characterDetailFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("characterId", this.characterId)
      return result
    }
  }

  public companion object {
    public fun actionCharacterFragmentToCharacterDetailFragment(characterId: Int = 0): NavDirections
        = ActionCharacterFragmentToCharacterDetailFragment(characterId)
  }
}
