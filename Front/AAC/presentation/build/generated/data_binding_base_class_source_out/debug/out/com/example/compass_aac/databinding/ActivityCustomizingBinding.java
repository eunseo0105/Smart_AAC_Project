// Generated by view binder compiler. Do not edit!
package com.example.compass_aac.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.compass_aac.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCustomizingBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText customizeEdit;

  @NonNull
  public final MaterialButton customizeOkBtn;

  private ActivityCustomizingBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText customizeEdit, @NonNull MaterialButton customizeOkBtn) {
    this.rootView = rootView;
    this.customizeEdit = customizeEdit;
    this.customizeOkBtn = customizeOkBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCustomizingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCustomizingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_customizing, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCustomizingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.customizeEdit;
      EditText customizeEdit = ViewBindings.findChildViewById(rootView, id);
      if (customizeEdit == null) {
        break missingId;
      }

      id = R.id.customizeOkBtn;
      MaterialButton customizeOkBtn = ViewBindings.findChildViewById(rootView, id);
      if (customizeOkBtn == null) {
        break missingId;
      }

      return new ActivityCustomizingBinding((ConstraintLayout) rootView, customizeEdit,
          customizeOkBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
