// Generated code from Butter Knife. Do not modify!
package com.stickercamera.app.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MainActivity$$ViewInjector<T extends com.stickercamera.app.ui.MainActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427452, "field 'fab'");
    target.fab = finder.castView(view, 2131427452, "field 'fab'");
    view = finder.findRequiredView(source, 2131427451, "field 'mRecyclerView'");
    target.mRecyclerView = finder.castView(view, 2131427451, "field 'mRecyclerView'");
  }

  @Override public void reset(T target) {
    target.fab = null;
    target.mRecyclerView = null;
  }
}
