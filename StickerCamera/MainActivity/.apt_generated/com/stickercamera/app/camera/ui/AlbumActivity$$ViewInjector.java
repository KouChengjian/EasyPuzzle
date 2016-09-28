// Generated code from Butter Knife. Do not modify!
package com.stickercamera.app.camera.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class AlbumActivity$$ViewInjector<T extends com.stickercamera.app.camera.ui.AlbumActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427426, "field 'pager'");
    target.pager = finder.castView(view, 2131427426, "field 'pager'");
    view = finder.findRequiredView(source, 2131427425, "field 'tab'");
    target.tab = finder.castView(view, 2131427425, "field 'tab'");
  }

  @Override public void reset(T target) {
    target.pager = null;
    target.tab = null;
  }
}
