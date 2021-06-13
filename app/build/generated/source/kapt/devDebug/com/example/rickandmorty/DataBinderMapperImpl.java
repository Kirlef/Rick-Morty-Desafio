package com.example.rickandmorty;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.rickandmorty.databinding.FragmentCharacterBindingImpl;
import com.example.rickandmorty.databinding.FragmentCharacterDetailBindingImpl;
import com.example.rickandmorty.databinding.FragmentCharacterDetailsBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTCHARACTER = 1;

  private static final int LAYOUT_FRAGMENTCHARACTERDETAIL = 2;

  private static final int LAYOUT_FRAGMENTCHARACTERDETAILS = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.rickandmorty.R.layout.fragment_character, LAYOUT_FRAGMENTCHARACTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.rickandmorty.R.layout.fragment_character_detail, LAYOUT_FRAGMENTCHARACTERDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.rickandmorty.R.layout.fragment_character_details, LAYOUT_FRAGMENTCHARACTERDETAILS);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTCHARACTER: {
          if ("layout/fragment_character_0".equals(tag)) {
            return new FragmentCharacterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_character is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHARACTERDETAIL: {
          if ("layout/fragment_character_detail_0".equals(tag)) {
            return new FragmentCharacterDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_character_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHARACTERDETAILS: {
          if ("layout/fragment_character_details_0".equals(tag)) {
            return new FragmentCharacterDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_character_details is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "characterDetail");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_character_0", com.example.rickandmorty.R.layout.fragment_character);
      sKeys.put("layout/fragment_character_detail_0", com.example.rickandmorty.R.layout.fragment_character_detail);
      sKeys.put("layout/fragment_character_details_0", com.example.rickandmorty.R.layout.fragment_character_details);
    }
  }
}
