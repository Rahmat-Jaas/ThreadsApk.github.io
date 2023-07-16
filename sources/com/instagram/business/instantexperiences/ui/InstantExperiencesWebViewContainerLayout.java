package com.instagram.business.instantexperiences.ui;

import X.C142418ep;
import X.C91225fq;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class InstantExperiencesWebViewContainerLayout extends FrameLayout {
    public C91225fq A00;
    public C142418ep A01;

    public C91225fq getWebView() {
        return this.A00;
    }

    public void setWebView(C91225fq r1) {
        removeAllViews();
        addView(r1);
        this.A00 = r1;
    }

    public void setWebViewChangeListner(C142418ep r1) {
        this.A01 = r1;
    }

    public InstantExperiencesWebViewContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InstantExperiencesWebViewContainerLayout(Context context) {
        super(context);
    }

    public InstantExperiencesWebViewContainerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
