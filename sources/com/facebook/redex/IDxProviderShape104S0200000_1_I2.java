package com.facebook.redex;

import X.AnonymousClass3VP;
import X.C04560Oe;
import X.C10300i6;
import X.C103066Xr;
import X.C18180wK;
import androidx.fragment.app.FragmentActivity;

public class IDxProviderShape104S0200000_1_I2 implements C04560Oe {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxProviderShape104S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.A02) {
            case 0:
                String str = C103066Xr.A00.A02.A00;
                if (str == null) {
                    return "";
                }
                return str;
            case 1:
                return C18180wK.A0Q((FragmentActivity) this.A00, (C10300i6) this.A01);
            default:
                return new AnonymousClass3VP((C10300i6) this.A00);
        }
    }
}
