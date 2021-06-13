// Generated by data binding compiler. Do not edit!
package com.example.rickandmorty.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.rickandmorty.R;
import com.example.rickandmorty.model.CharacterDetail;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentCharacterDetailsBinding extends ViewDataBinding {
  @NonNull
  public final ImageView ivCharacterProfile;

  @NonNull
  public final TextView tvCharacterGender;

  @NonNull
  public final TextView tvCharacterLastLocation;

  @NonNull
  public final TextView tvCharacterName;

  @NonNull
  public final TextView tvCharacterNumberOfEpisodes;

  @NonNull
  public final TextView tvCharacterOriginLocation;

  @NonNull
  public final TextView tvCharacterSpecies;

  @NonNull
  public final TextView tvCharacterStatus;

  @Bindable
  protected CharacterDetail mCharacterDetail;

  protected FragmentCharacterDetailsBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView ivCharacterProfile, TextView tvCharacterGender,
      TextView tvCharacterLastLocation, TextView tvCharacterName,
      TextView tvCharacterNumberOfEpisodes, TextView tvCharacterOriginLocation,
      TextView tvCharacterSpecies, TextView tvCharacterStatus) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivCharacterProfile = ivCharacterProfile;
    this.tvCharacterGender = tvCharacterGender;
    this.tvCharacterLastLocation = tvCharacterLastLocation;
    this.tvCharacterName = tvCharacterName;
    this.tvCharacterNumberOfEpisodes = tvCharacterNumberOfEpisodes;
    this.tvCharacterOriginLocation = tvCharacterOriginLocation;
    this.tvCharacterSpecies = tvCharacterSpecies;
    this.tvCharacterStatus = tvCharacterStatus;
  }

  public abstract void setCharacterDetail(@Nullable CharacterDetail characterDetail);

  @Nullable
  public CharacterDetail getCharacterDetail() {
    return mCharacterDetail;
  }

  @NonNull
  public static FragmentCharacterDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_character_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCharacterDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCharacterDetailsBinding>inflateInternal(inflater, R.layout.fragment_character_details, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCharacterDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_character_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCharacterDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCharacterDetailsBinding>inflateInternal(inflater, R.layout.fragment_character_details, null, false, component);
  }

  public static FragmentCharacterDetailsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentCharacterDetailsBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentCharacterDetailsBinding)bind(component, view, R.layout.fragment_character_details);
  }
}
