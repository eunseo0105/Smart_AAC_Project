// Generated by view binder compiler. Do not edit!
package com.example.compass_aac.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
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

public final class ActivityLoginMainBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ConstraintLayout constraintLayout3;

  @NonNull
  public final ConstraintLayout constraintLayout4;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ConstraintLayout loginAppBar;

  @NonNull
  public final ImageButton loginBackBtn;

  @NonNull
  public final MaterialButton loginBtn;

  @NonNull
  public final EditText loginPhoneEdt;

  @NonNull
  public final EditText loginPwEdt;

  @NonNull
  public final MaterialButton loginRegisterBtn;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView4;

  private ActivityLoginMainBinding(@NonNull ScrollView rootView,
      @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4,
      @NonNull ImageView imageView2, @NonNull ConstraintLayout loginAppBar,
      @NonNull ImageButton loginBackBtn, @NonNull MaterialButton loginBtn,
      @NonNull EditText loginPhoneEdt, @NonNull EditText loginPwEdt,
      @NonNull MaterialButton loginRegisterBtn, @NonNull TextView textView2,
      @NonNull TextView textView4) {
    this.rootView = rootView;
    this.constraintLayout3 = constraintLayout3;
    this.constraintLayout4 = constraintLayout4;
    this.imageView2 = imageView2;
    this.loginAppBar = loginAppBar;
    this.loginBackBtn = loginBackBtn;
    this.loginBtn = loginBtn;
    this.loginPhoneEdt = loginPhoneEdt;
    this.loginPwEdt = loginPwEdt;
    this.loginRegisterBtn = loginRegisterBtn;
    this.textView2 = textView2;
    this.textView4 = textView4;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.constraintLayout3;
      ConstraintLayout constraintLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout3 == null) {
        break missingId;
      }

      id = R.id.constraintLayout4;
      ConstraintLayout constraintLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout4 == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.login_app_bar;
      ConstraintLayout loginAppBar = ViewBindings.findChildViewById(rootView, id);
      if (loginAppBar == null) {
        break missingId;
      }

      id = R.id.login_back_btn;
      ImageButton loginBackBtn = ViewBindings.findChildViewById(rootView, id);
      if (loginBackBtn == null) {
        break missingId;
      }

      id = R.id.login_btn;
      MaterialButton loginBtn = ViewBindings.findChildViewById(rootView, id);
      if (loginBtn == null) {
        break missingId;
      }

      id = R.id.login_phone_edt;
      EditText loginPhoneEdt = ViewBindings.findChildViewById(rootView, id);
      if (loginPhoneEdt == null) {
        break missingId;
      }

      id = R.id.login_pw_edt;
      EditText loginPwEdt = ViewBindings.findChildViewById(rootView, id);
      if (loginPwEdt == null) {
        break missingId;
      }

      id = R.id.login_register_btn;
      MaterialButton loginRegisterBtn = ViewBindings.findChildViewById(rootView, id);
      if (loginRegisterBtn == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      return new ActivityLoginMainBinding((ScrollView) rootView, constraintLayout3,
          constraintLayout4, imageView2, loginAppBar, loginBackBtn, loginBtn, loginPhoneEdt,
          loginPwEdt, loginRegisterBtn, textView2, textView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
