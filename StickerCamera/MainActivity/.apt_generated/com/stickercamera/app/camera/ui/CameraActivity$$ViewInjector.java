// Generated code from Butter Knife. Do not modify!
package com.stickercamera.app.camera.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class CameraActivity$$ViewInjector<T extends com.stickercamera.app.camera.ui.CameraActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427436, "field 'changeBtn'");
    target.changeBtn = finder.castView(view, 2131427436, "field 'changeBtn'");
    view = finder.findRequiredView(source, 2131427431, "field 'backBtn'");
    target.backBtn = finder.castView(view, 2131427431, "field 'backBtn'");
    view = finder.findRequiredView(source, 2131427429, "field 'takePhotoPanel'");
    target.takePhotoPanel = view;
    view = finder.findRequiredView(source, 2131427433, "field 'photoArea'");
    target.photoArea = finder.castView(view, 2131427433, "field 'photoArea'");
    view = finder.findRequiredView(source, 2131427437, "field 'cameraGrid'");
    target.cameraGrid = finder.castView(view, 2131427437, "field 'cameraGrid'");
    view = finder.findRequiredView(source, 2131427430, "field 'takePicture'");
    target.takePicture = view;
    view = finder.findRequiredView(source, 2131427432, "field 'galaryBtn'");
    target.galaryBtn = finder.castView(view, 2131427432, "field 'galaryBtn'");
    view = finder.findRequiredView(source, 2131427427, "field 'surfaceView'");
    target.surfaceView = finder.castView(view, 2131427427, "field 'surfaceView'");
    view = finder.findRequiredView(source, 2131427438, "field 'focusIndex'");
    target.focusIndex = view;
    view = finder.findRequiredView(source, 2131427435, "field 'flashBtn'");
    target.flashBtn = finder.castView(view, 2131427435, "field 'flashBtn'");
  }

  @Override public void reset(T target) {
    target.changeBtn = null;
    target.backBtn = null;
    target.takePhotoPanel = null;
    target.photoArea = null;
    target.cameraGrid = null;
    target.takePicture = null;
    target.galaryBtn = null;
    target.surfaceView = null;
    target.focusIndex = null;
    target.flashBtn = null;
  }
}
