// Generated code from Butter Knife. Do not modify!
package com.stickercamera.app.camera.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class CameraActivity$$ViewInjector<T extends com.stickercamera.app.camera.ui.CameraActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 0, "field 'takePicture'");
    target.takePicture = view;
  }

  @Override public void reset(T target) {
    target.takePicture = null;
  }
}
