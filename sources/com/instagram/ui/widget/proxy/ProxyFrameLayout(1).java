package com.instagram.ui.widget.proxy;

import X.AnonymousClass0wJ;
import X.C64573oL;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

public class ProxyFrameLayout extends FrameLayout {
    public View.OnClickListener A00;
    public boolean A01 = true;
    public final ArrayList A02 = AnonymousClass0wJ.A0v();

    public ProxyFrameLayout(Context context) {
        super(context);
        super.setOnClickListener(new C64573oL(this));
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    public void setProxyToOnClickListener(boolean z) {
        this.A01 = z;
    }

    public ProxyFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setOnClickListener(new C64573oL(this));
    }

    public ProxyFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setOnClickListener(new C64573oL(this));
    }
}
