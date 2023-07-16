package com.facebook.redex;

import X.C04560Oe;
import com.facebook.common.util.TriState;

public class IDxProviderShape104S0000000_I2 implements C04560Oe {
    public final int A00;

    public IDxProviderShape104S0000000_I2(int i) {
        this.A00 = i;
    }

    public final Object get() {
        switch (this.A00) {
            case 0:
                return null;
            case 1:
                return TriState.NO;
            default:
                return false;
        }
    }
}
