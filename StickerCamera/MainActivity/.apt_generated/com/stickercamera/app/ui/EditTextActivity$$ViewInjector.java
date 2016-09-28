// Generated code from Butter Knife. Do not modify!
package com.stickercamera.app.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class EditTextActivity$$ViewInjector<T extends com.stickercamera.app.ui.EditTextActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427441, "field 'numberTips'");
    target.numberTips = finder.castView(view, 2131427441, "field 'numberTips'");
    view = finder.findRequiredView(source, 2131427440, "field 'contentView'");
    target.contentView = finder.castView(view, 2131427440, "field 'contentView'");
  }

  @Override public void reset(T target) {
    target.numberTips = null;
    target.contentView = null;
  }
}
