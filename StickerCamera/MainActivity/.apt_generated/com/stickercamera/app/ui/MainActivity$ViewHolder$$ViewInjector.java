// Generated code from Butter Knife. Do not modify!
package com.stickercamera.app.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MainActivity$ViewHolder$$ViewInjector<T extends com.stickercamera.app.ui.MainActivity.ViewHolder> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427477, "field 'picture'");
    target.picture = finder.castView(view, 2131427477, "field 'picture'");
    view = finder.findRequiredView(source, 2131427476, "field 'pictureLayout'");
    target.pictureLayout = finder.castView(view, 2131427476, "field 'pictureLayout'");
  }

  @Override public void reset(T target) {
    target.picture = null;
    target.pictureLayout = null;
  }
}
