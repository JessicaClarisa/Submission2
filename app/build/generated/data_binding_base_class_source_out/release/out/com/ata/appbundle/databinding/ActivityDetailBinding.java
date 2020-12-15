// Generated by view binder compiler. Do not edit!
package com.ata.appbundle.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.viewbinding.ViewBinding;
import com.ata.appbundle.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final AppCompatImageButton buttonFavorite;

  @NonNull
  public final TextView genre;

  @NonNull
  public final LinearLayout ln1;

  @NonNull
  public final LinearLayout ln2;

  @NonNull
  public final TextView originalLang;

  @NonNull
  public final TextView overview;

  @NonNull
  public final ImageView poster;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView runningTime;

  @NonNull
  public final TextView titleDetail;

  private ActivityDetailBinding(@NonNull RelativeLayout rootView,
      @NonNull AppCompatImageButton buttonFavorite, @NonNull TextView genre,
      @NonNull LinearLayout ln1, @NonNull LinearLayout ln2, @NonNull TextView originalLang,
      @NonNull TextView overview, @NonNull ImageView poster, @NonNull ProgressBar progressBar,
      @NonNull TextView runningTime, @NonNull TextView titleDetail) {
    this.rootView = rootView;
    this.buttonFavorite = buttonFavorite;
    this.genre = genre;
    this.ln1 = ln1;
    this.ln2 = ln2;
    this.originalLang = originalLang;
    this.overview = overview;
    this.poster = poster;
    this.progressBar = progressBar;
    this.runningTime = runningTime;
    this.titleDetail = titleDetail;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_favorite;
      AppCompatImageButton buttonFavorite = rootView.findViewById(id);
      if (buttonFavorite == null) {
        break missingId;
      }

      id = R.id.genre;
      TextView genre = rootView.findViewById(id);
      if (genre == null) {
        break missingId;
      }

      id = R.id.ln1;
      LinearLayout ln1 = rootView.findViewById(id);
      if (ln1 == null) {
        break missingId;
      }

      id = R.id.ln2;
      LinearLayout ln2 = rootView.findViewById(id);
      if (ln2 == null) {
        break missingId;
      }

      id = R.id.original_lang;
      TextView originalLang = rootView.findViewById(id);
      if (originalLang == null) {
        break missingId;
      }

      id = R.id.overview;
      TextView overview = rootView.findViewById(id);
      if (overview == null) {
        break missingId;
      }

      id = R.id.poster;
      ImageView poster = rootView.findViewById(id);
      if (poster == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = rootView.findViewById(id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.running_time;
      TextView runningTime = rootView.findViewById(id);
      if (runningTime == null) {
        break missingId;
      }

      id = R.id.titleDetail;
      TextView titleDetail = rootView.findViewById(id);
      if (titleDetail == null) {
        break missingId;
      }

      return new ActivityDetailBinding((RelativeLayout) rootView, buttonFavorite, genre, ln1, ln2,
          originalLang, overview, poster, progressBar, runningTime, titleDetail);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
