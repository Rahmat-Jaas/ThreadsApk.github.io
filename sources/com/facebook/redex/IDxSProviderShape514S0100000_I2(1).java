package com.facebook.redex;

import X.C015106z;
import X.C12560m7;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;

public class IDxSProviderShape514S0100000_I2 implements C015106z {
    public Object A00;
    public final int A01;

    public IDxSProviderShape514S0100000_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Bundle Cfz() {
        switch (this.A01) {
            case 0:
                return ((ComponentActivity) this.A00).m1lambda$new$1$androidxactivityComponentActivity();
            case 1:
                return ((FragmentActivity) this.A00).m3lambda$init$0$androidxfragmentappFragmentActivity();
            default:
                return ((C12560m7) this.A00).A0J();
        }
    }
}
