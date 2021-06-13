package com.example.rickandmorty.databinding;
import com.example.rickandmorty.R;
import com.example.rickandmorty.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCharacterDetailsBindingImpl extends FragmentCharacterDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCharacterDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentCharacterDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.ivCharacterProfile.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvCharacterGender.setTag(null);
        this.tvCharacterLastLocation.setTag(null);
        this.tvCharacterName.setTag(null);
        this.tvCharacterNumberOfEpisodes.setTag(null);
        this.tvCharacterOriginLocation.setTag(null);
        this.tvCharacterSpecies.setTag(null);
        this.tvCharacterStatus.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.characterDetail == variableId) {
            setCharacterDetail((com.example.rickandmorty.model.CharacterDetail) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCharacterDetail(@Nullable com.example.rickandmorty.model.CharacterDetail CharacterDetail) {
        this.mCharacterDetail = CharacterDetail;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.characterDetail);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String characterDetailOriginName = null;
        java.lang.String characterDetailGender = null;
        com.example.rickandmorty.model.CharacterDetail characterDetail = mCharacterDetail;
        com.example.rickandmorty.model.Origin characterDetailOrigin = null;
        int characterDetailEpisodeSize = 0;
        java.util.List<java.lang.String> characterDetailEpisode = null;
        java.lang.String characterDetailName = null;
        java.lang.String stringFormatTvCharacterSpeciesAndroidStringSpeciesCharacterDetailSpecies = null;
        java.lang.String characterDetailSpecies = null;
        java.lang.String characterDetailLocationName = null;
        java.lang.String characterDetailImage = null;
        java.lang.String stringFormatTvCharacterLastLocationAndroidStringLastKnownLocationNameCharacterDetailLocationName = null;
        java.lang.String characterDetailStatus = null;
        com.example.rickandmorty.model.Location characterDetailLocation = null;
        java.lang.String stringFormatTvCharacterStatusAndroidStringStatusCharacterDetailStatus = null;
        java.lang.String stringFormatTvCharacterGenderAndroidStringGenderCharacterDetailGender = null;
        java.lang.String stringFormatTvCharacterOriginLocationAndroidStringOriginLocationNameCharacterDetailOriginName = null;
        java.lang.String stringFormatTvCharacterNameAndroidStringNameCharacterDetailName = null;
        java.lang.String stringFormatTvCharacterNumberOfEpisodesAndroidStringNumberOfEpisodesCharacterDetailEpisodeSize = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (characterDetail != null) {
                    // read characterDetail.gender
                    characterDetailGender = characterDetail.getGender();
                    // read characterDetail.origin
                    characterDetailOrigin = characterDetail.getOrigin();
                    // read characterDetail.episode
                    characterDetailEpisode = characterDetail.getEpisode();
                    // read characterDetail.name
                    characterDetailName = characterDetail.getName();
                    // read characterDetail.species
                    characterDetailSpecies = characterDetail.getSpecies();
                    // read characterDetail.image
                    characterDetailImage = characterDetail.getImage();
                    // read characterDetail.status
                    characterDetailStatus = characterDetail.getStatus();
                    // read characterDetail.location
                    characterDetailLocation = characterDetail.getLocation();
                }


                // read String.format(@android:string/gender, characterDetail.gender)
                stringFormatTvCharacterGenderAndroidStringGenderCharacterDetailGender = java.lang.String.format(tvCharacterGender.getResources().getString(R.string.gender), characterDetailGender);
                // read String.format(@android:string/name, characterDetail.name)
                stringFormatTvCharacterNameAndroidStringNameCharacterDetailName = java.lang.String.format(tvCharacterName.getResources().getString(R.string.name), characterDetailName);
                // read String.format(@android:string/species, characterDetail.species)
                stringFormatTvCharacterSpeciesAndroidStringSpeciesCharacterDetailSpecies = java.lang.String.format(tvCharacterSpecies.getResources().getString(R.string.species), characterDetailSpecies);
                // read String.format(@android:string/status, characterDetail.status)
                stringFormatTvCharacterStatusAndroidStringStatusCharacterDetailStatus = java.lang.String.format(tvCharacterStatus.getResources().getString(R.string.status), characterDetailStatus);
                if (characterDetailOrigin != null) {
                    // read characterDetail.origin.name
                    characterDetailOriginName = characterDetailOrigin.getName();
                }
                if (characterDetailEpisode != null) {
                    // read characterDetail.episode.size()
                    characterDetailEpisodeSize = characterDetailEpisode.size();
                }
                if (characterDetailLocation != null) {
                    // read characterDetail.location.name
                    characterDetailLocationName = characterDetailLocation.getName();
                }


                // read String.format(@android:string/origin_location_name, characterDetail.origin.name)
                stringFormatTvCharacterOriginLocationAndroidStringOriginLocationNameCharacterDetailOriginName = java.lang.String.format(tvCharacterOriginLocation.getResources().getString(R.string.origin_location_name), characterDetailOriginName);
                // read String.format(@android:string/number_of_episodes, characterDetail.episode.size())
                stringFormatTvCharacterNumberOfEpisodesAndroidStringNumberOfEpisodesCharacterDetailEpisodeSize = java.lang.String.format(tvCharacterNumberOfEpisodes.getResources().getString(R.string.number_of_episodes), characterDetailEpisodeSize);
                // read String.format(@android:string/last_known_location_name, characterDetail.location.name)
                stringFormatTvCharacterLastLocationAndroidStringLastKnownLocationNameCharacterDetailLocationName = java.lang.String.format(tvCharacterLastLocation.getResources().getString(R.string.last_known_location_name), characterDetailLocationName);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.rickandmorty.extensions.LoadImageKt.loadImage(this.ivCharacterProfile, characterDetailImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCharacterGender, stringFormatTvCharacterGenderAndroidStringGenderCharacterDetailGender);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCharacterLastLocation, stringFormatTvCharacterLastLocationAndroidStringLastKnownLocationNameCharacterDetailLocationName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCharacterName, stringFormatTvCharacterNameAndroidStringNameCharacterDetailName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCharacterNumberOfEpisodes, stringFormatTvCharacterNumberOfEpisodesAndroidStringNumberOfEpisodesCharacterDetailEpisodeSize);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCharacterOriginLocation, stringFormatTvCharacterOriginLocationAndroidStringOriginLocationNameCharacterDetailOriginName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCharacterSpecies, stringFormatTvCharacterSpeciesAndroidStringSpeciesCharacterDetailSpecies);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCharacterStatus, stringFormatTvCharacterStatusAndroidStringStatusCharacterDetailStatus);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): characterDetail
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}