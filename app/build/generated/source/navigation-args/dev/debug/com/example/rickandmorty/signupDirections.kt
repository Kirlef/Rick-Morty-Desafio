package com.example.rickandmorty

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class signupDirections private constructor() {
  public companion object {
    public fun actionSignupToLogin(): NavDirections =
        ActionOnlyNavDirections(R.id.action_signup_to_login)
  }
}
