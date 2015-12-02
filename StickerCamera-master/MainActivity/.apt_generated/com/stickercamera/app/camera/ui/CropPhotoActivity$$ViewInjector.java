// Generated code from Butter Knife. Do not modify!
package com.stickercamera.app.camera.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class CropPhotoActivity$$ViewInjector<T extends com.stickercamera.app.camera.ui.CropPhotoActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 0, "field 'cropImage'");
    target.cropImage = finder.castView(view, 0, "field 'cropImage'");
  }

  @Override public void reset(T target) {
    target.cropImage = null;
  }
}
