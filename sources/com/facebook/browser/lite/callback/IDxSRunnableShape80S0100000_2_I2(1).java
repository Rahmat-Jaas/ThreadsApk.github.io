package com.facebook.browser.lite.callback;

import X.AnonymousClass7Ep;
import X.C111716oC;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;

public class IDxSRunnableShape80S0100000_2_I2 extends C111716oC {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxSRunnableShape80S0100000_2_I2(AnonymousClass7Ep r1, int i) {
        super(r1);
        this.A01 = i;
        this.A00 = r1;
    }

    public final void A00(BrowserLiteCallback browserLiteCallback) {
        if (this.A01 != 0) {
            browserLiteCallback.CJy();
        } else {
            browserLiteCallback.BzT();
        }
    }
}
