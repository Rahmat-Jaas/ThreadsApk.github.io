package com.facebook.redex;

import X.AnonymousClass0wJ;
import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;

public class IDxKListenerShape735S0100000_1_I2 implements DialogInterface.OnKeyListener {
    public Object A00;
    public final int A01;

    public IDxKListenerShape735S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (this.A01 != 0) {
            return AnonymousClass0wJ.A1T(i, 4);
        }
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        ((Activity) this.A00).finish();
        return false;
    }
}
