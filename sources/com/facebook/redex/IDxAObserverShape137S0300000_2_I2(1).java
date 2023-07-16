package com.facebook.redex;

import X.AnonymousClass4WJ;
import X.AnonymousClass601;
import X.C04220Ms;
import X.C109326jp;
import X.C145358kN;
import X.C18180wK;
import X.C61043Rr;
import X.C63893iY;
import X.C86104wH;
import kotlin.Pair;

public class IDxAObserverShape137S0300000_2_I2 implements C145358kN {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public final void CDn(Boolean bool, Integer num, Throwable th) {
        String str;
        C04220Ms.A0B(th, 0);
        Pair A0p = C18180wK.A0p("exception", th.toString());
        if (num != null) {
            str = num.toString();
        } else {
            str = null;
        }
        C63893iY A0W = C86104wH.A0W(AnonymousClass4WJ.A0H(A0p, C18180wK.A0p("remaining_attempts", str), C18180wK.A0p("auth_factor_expired", bool)));
        C61043Rr.A00((AnonymousClass601) this.A00, A0W, (C109326jp) this.A01);
    }

    public final void CDo(String str) {
        C04220Ms.A0B(str, 0);
        C63893iY A0W = C86104wH.A0W(str);
        C61043Rr.A00((AnonymousClass601) this.A00, A0W, (C109326jp) this.A02);
    }

    public IDxAObserverShape137S0300000_2_I2(AnonymousClass601 r1, C109326jp r2, C109326jp r3, int i) {
        this.A03 = i;
        this.A02 = r2;
        this.A00 = r1;
        this.A01 = r3;
    }
}
