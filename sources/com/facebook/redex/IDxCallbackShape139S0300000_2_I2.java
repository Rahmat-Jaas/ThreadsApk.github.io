package com.facebook.redex;

import X.AnonymousClass00U;
import X.C04220Ms;
import X.C105636dk;
import X.C30967GcS;
import X.C33755Htt;
import X.C33828HvI;
import X.F1D;
import android.widget.ImageView;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class IDxCallbackShape139S0300000_2_I2 implements C33755Htt {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCallbackShape139S0300000_2_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public final void C5F(C33828HvI hvI, String str, String str2) {
        if (this.A03 != 0) {
            C04220Ms.A0B(str2, 2);
            ((AtomicReference) this.A02).set(str2);
            ((CountDownLatch) this.A00).countDown();
            return;
        }
        ImageView imageView = (ImageView) this.A01;
        if (imageView.getTag() == this) {
            F1D f1d = new F1D(hvI);
            ((C105636dk) this.A02).A00 = f1d;
            imageView.setImageDrawable(f1d);
        }
    }

    public final void onError(String str) {
        if (this.A03 != 0) {
            ((AtomicBoolean) this.A01).set(true);
            ((CountDownLatch) this.A00).countDown();
            return;
        }
        C30967GcS.A02("BloksGif", AnonymousClass00U.A0L("Failed to load gif: ", str));
    }

    public final void CDG(String str, float f) {
    }
}
