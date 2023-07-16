package com.facebook.redex;

import X.C550831r;
import android.content.DialogInterface;

public class IDxCListenerShape122S0000000_1_I2 implements DialogInterface.OnClickListener {
    public final int A00;

    public IDxCListenerShape122S0000000_1_I2(int i) {
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 1:
                dialogInterface.cancel();
                C550831r.A00();
                return;
            case 2:
                return;
            default:
                dialogInterface.dismiss();
                return;
        }
    }
}
