package com.example.rickandmorty

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class loginDirections private constructor() {
  public companion object {
    public fun actionLoginToSignup(): NavDirections =
        ActionOnlyNavDirections(R.id.action_login_to_signup)
  }
}
