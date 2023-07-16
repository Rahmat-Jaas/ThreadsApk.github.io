package com.facebook.redex;

import X.C13330nS;
import X.C61863Wc;
import android.content.DialogInterface;

public class IDxCListenerShape32S1100000_1_I2 implements DialogInterface.OnCancelListener {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxCListenerShape32S1100000_1_I2(C13330nS r1, String str, int i) {
        this.A02 = i;
        this.A00 = r1;
        this.A01 = str;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C61863Wc.A02((C13330nS) this.A00, "dialog_tap_outside", this.A01);
    }
}
