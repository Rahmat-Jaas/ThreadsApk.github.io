package com.facebook.redex;

import X.AnonymousClass0Wh;
import X.C02970Dp;
import X.C04220Ms;
import X.C04560Oe;
import X.C09050em;
import X.C12070lG;
import android.content.Context;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Arrays;

public class IDxProviderShape243S0100000_I2 implements C04560Oe {
    public Object A00;
    public final int A01;

    public IDxProviderShape243S0100000_I2(Object obj, int i, int i2) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object get() {
        AnonymousClass0Wh[] r5;
        switch (this.A01) {
            case 6:
            case 7:
                return Arrays.asList((Object[]) ((C04560Oe) this.A00).get());
            case 10:
                C02970Dp r4 = new C02970Dp(new C09050em());
                AnonymousClass0Wh[] r3 = (AnonymousClass0Wh[]) this.A00;
                int i = 0;
                if (r3 == null) {
                    r5 = new AnonymousClass0Wh[1];
                } else {
                    int length = r3.length;
                    r5 = new AnonymousClass0Wh[(length + 1)];
                    while (i < length) {
                        r5[i] = r3[i];
                        i++;
                    }
                }
                r5[i] = r4;
                return r5;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                Context context = (Context) this.A00;
                C04220Ms.A0A(context);
                return new C12070lG(context);
            default:
                return this.A00;
        }
    }

    public IDxProviderShape243S0100000_I2(Object obj, int i) {
        this.A01 = i;
        if (i != 0) {
            this.A00 = obj;
        } else {
            this.A00 = obj;
        }
    }
}
