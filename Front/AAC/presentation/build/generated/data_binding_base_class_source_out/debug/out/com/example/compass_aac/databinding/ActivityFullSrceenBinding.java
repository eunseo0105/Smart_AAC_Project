// Generated by view binder compiler. Do not edit!
package com.example.compass_aac.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.compass_aac.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFullSrceenBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView UrgencySentence;

  @NonNull
  public final ImageButton UrgencyVoice;

  @NonNull
  public final ImageButton urgencyClose;

  private ActivityFullSrceenBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView UrgencySentence, @NonNull ImageButton UrgencyVoice,
      @NonNull ImageButton urgencyClose) {
    this.rootView = rootView;
    this.UrgencySentence = UrgencySentence;
    this.UrgencyVoice = UrgencyVoice;
    this.urgencyClose = urgencyClose;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFullSrceenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFullSrceenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_full_srceen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFullSrceenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.UrgencySentence;
      TextView UrgencySentence = ViewBindings.findChildViewById(rootView, id);
      if (UrgencySentence == null) {
        break missingId;
      }

      id = R.id.UrgencyVoice;
      ImageButton UrgencyVoice = ViewBindings.findChildViewById(rootView, id);
      if (UrgencyVoice == null) {
        break missingId;
      }

      id = R.id.urgencyClose;
      ImageButton urgencyClose = ViewBindings.findChildViewById(rootView, id);
      if (urgencyClose == null) {
        break missingId;
      }

      return new ActivityFullSrceenBinding((ConstraintLayout) rootView, UrgencySentence,
          UrgencyVoice, urgencyClose);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
