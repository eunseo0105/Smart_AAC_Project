// Generated by view binder compiler. Do not edit!
package com.example.compass_aac.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.compass_aac.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityChooseWordItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final TextView chooseWordName;

  @NonNull
  public final MaterialButton chooseWordPassBtn;

  @NonNull
  public final ImageView chooseWordPassImg;

  private ActivityChooseWordItemBinding(@NonNull MaterialCardView rootView,
      @NonNull TextView chooseWordName, @NonNull MaterialButton chooseWordPassBtn,
      @NonNull ImageView chooseWordPassImg) {
    this.rootView = rootView;
    this.chooseWordName = chooseWordName;
    this.chooseWordPassBtn = chooseWordPassBtn;
    this.chooseWordPassImg = chooseWordPassImg;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityChooseWordItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityChooseWordItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_choose_word_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityChooseWordItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.chooseWordName;
      TextView chooseWordName = ViewBindings.findChildViewById(rootView, id);
      if (chooseWordName == null) {
        break missingId;
      }

      id = R.id.chooseWordPassBtn;
      MaterialButton chooseWordPassBtn = ViewBindings.findChildViewById(rootView, id);
      if (chooseWordPassBtn == null) {
        break missingId;
      }

      id = R.id.chooseWordPassImg;
      ImageView chooseWordPassImg = ViewBindings.findChildViewById(rootView, id);
      if (chooseWordPassImg == null) {
        break missingId;
      }

      return new ActivityChooseWordItemBinding((MaterialCardView) rootView, chooseWordName,
          chooseWordPassBtn, chooseWordPassImg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
