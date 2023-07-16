package com.facebook.redex;

import X.AnonymousClass066;
import X.AnonymousClass0MJ;
import X.AnonymousClass6FB;
import X.AnonymousClass7IJ;
import X.C116066wM;
import X.C18180wK;
import X.C18190wL;
import X.C41030Luu;
import X.C871950n;
import android.app.Activity;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.recyclerview.widget.RecyclerView;

public class IDxCListenerShape201S0200000_2_I2 implements View.OnAttachStateChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape201S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onViewAttachedToWindow(View view) {
        switch (this.A02) {
            case 0:
                C871950n r2 = (C871950n) this.A01;
                AnonymousClass066 A002 = C116066wM.A00(r2);
                if (A002 != null) {
                    ((AnonymousClass0MJ) this.A00).A00 = AnonymousClass6FB.A00(r2, A002.getLifecycle());
                    r2.removeOnAttachStateChangeListener(this);
                    return;
                }
                StringBuilder A0s = C18190wL.A0s("View tree for ");
                A0s.append(r2);
                throw C18180wK.A0a(C18180wK.A0i(" has no ViewTreeLifecycleOwner", A0s));
            case 4:
                AnonymousClass7IJ.A00((Activity) this.A01, (AnonymousClass7IJ) this.A00);
                return;
            default:
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.A02) {
            case 1:
                ((View) this.A01).removeOnAttachStateChangeListener(this);
                ((Recomposer) this.A00).A0B();
                return;
            case 2:
            case 3:
                ((RecyclerView) this.A00).setAdapter((C41030Luu) this.A01);
                return;
            default:
                return;
        }
    }
}
