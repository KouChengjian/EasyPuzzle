// Generated code from Butter Knife. Do not modify!
package com.stickercamera.app.camera.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class CropPhotoActivity$$ViewInjector<T extends com.stickercamera.app.camera.ui.CropPhotoActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427457, "field 'btnCropType'");
    target.btnCropType = view;
    view = finder.findRequiredView(source, 2131427454, "field 'wrapImage'");
    target.wrapImage = view;
    view = finder.findRequiredView(source, 2131427456, "field 'cropImage'");
    target.cropImage = finder.castView(view, 2131427456, "field 'cropImage'");
    view = finder.findRequiredView(source, 2131427453, "field 'drawArea'");
    target.drawArea = finder.castView(view, 2131427453, "field 'drawArea'");
    view = finder.findRequiredView(source, 2131427455, "field 'imageCenter'");
    target.imageCenter = finder.castView(view, 2131427455, "field 'imageCenter'");
  }

  @Override public void reset(T target) {
    target.btnCropType = null;
    target.wrapImage = null;
    target.cropImage = null;
    target.drawArea = null;
    target.imageCenter = null;
  }
}
