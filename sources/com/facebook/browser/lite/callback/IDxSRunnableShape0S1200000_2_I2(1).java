package com.facebook.browser.lite.callback;

import X.AnonymousClass7Ep;
import X.C111716oC;
import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import java.util.List;

public class IDxSRunnableShape0S1200000_2_I2 extends C111716oC {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxSRunnableShape0S1200000_2_I2(AnonymousClass7Ep r2, String str, List list) {
        super(r2);
        this.A00 = r2;
        this.A02 = str;
        this.A01 = list;
    }

    public final void A00(BrowserLiteCallback browserLiteCallback) {
        if (this.A03 != 0) {
            browserLiteCallback.BsK(this.A02, (Bundle) this.A01);
        } else {
            browserLiteCallback.C1n(this.A02, (List) this.A01);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxSRunnableShape0S1200000_2_I2(Bundle bundle, AnonymousClass7Ep r3, String str) {
        super(r3);
        this.A00 = r3;
        this.A02 = str;
        this.A01 = bundle;
    }
}
