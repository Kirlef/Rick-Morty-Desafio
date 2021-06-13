package com.example.rickandmorty.ui.characterdetail

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class CharacterDetailFragmentArgs(
  public val characterId: Int = 0
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("characterId", this.characterId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CharacterDetailFragmentArgs {
      bundle.setClassLoader(CharacterDetailFragmentArgs::class.java.classLoader)
      val __characterId : Int
      if (bundle.containsKey("characterId")) {
        __characterId = bundle.getInt("characterId")
      } else {
        __characterId = 0
      }
      return CharacterDetailFragmentArgs(__characterId)
    }
  }
}
