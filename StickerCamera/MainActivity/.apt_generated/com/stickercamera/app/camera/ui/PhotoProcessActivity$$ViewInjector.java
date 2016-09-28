// Generated code from Butter Knife. Do not modify!
package com.stickercamera.app.camera.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class PhotoProcessActivity$$ViewInjector<T extends com.stickercamera.app.camera.ui.PhotoProcessActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427449, "field 'filterBtn'");
    target.filterBtn = finder.castView(view, 2131427449, "field 'filterBtn'");
    view = finder.findRequiredView(source, 2131427448, "field 'stickerBtn'");
    target.stickerBtn = finder.castView(view, 2131427448, "field 'stickerBtn'");
    view = finder.findRequiredView(source, 2131427450, "field 'labelBtn'");
    target.labelBtn = finder.castView(view, 2131427450, "field 'labelBtn'");
    view = finder.findRequiredView(source, 2131427446, "field 'bottomToolBar'");
    target.bottomToolBar = finder.castView(view, 2131427446, "field 'bottomToolBar'");
    view = finder.findRequiredView(source, 2131427444, "field 'mGPUImageView'");
    target.mGPUImageView = finder.castView(view, 2131427444, "field 'mGPUImageView'");
    view = finder.findRequiredView(source, 2131427443, "field 'drawArea'");
    target.drawArea = finder.castView(view, 2131427443, "field 'drawArea'");
    view = finder.findRequiredView(source, 2131427445, "field 'toolArea'");
    target.toolArea = finder.castView(view, 2131427445, "field 'toolArea'");
  }

  @Override public void reset(T target) {
    target.filterBtn = null;
    target.stickerBtn = null;
    target.labelBtn = null;
    target.bottomToolBar = null;
    target.mGPUImageView = null;
    target.drawArea = null;
    target.toolArea = null;
  }
}
