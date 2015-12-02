// Generated code from Butter Knife. Do not modify!
package com.stickercamera.app.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MainActivity$ViewHolder$$ViewInjector<T extends com.stickercamera.app.ui.MainActivity.ViewHolder> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 0, "field 'picture'");
    target.picture = finder.castView(view, 0, "field 'picture'");
  }

  @Override public void reset(T target) {
    target.picture = null;
  }
}
