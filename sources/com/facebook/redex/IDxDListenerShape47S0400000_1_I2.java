package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass3VO;
import X.AnonymousClass601;
import X.C109326jp;
import X.C63893iY;
import X.C84214sk;

public class IDxDListenerShape47S0400000_1_I2 implements C84214sk {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public final void BrC(String str, String str2) {
        boolean A1Z = AnonymousClass0wJ.A1Z(str, str2);
        AnonymousClass3VO A002 = AnonymousClass3VO.A00();
        A002.A02(str, 0);
        C63893iY.A0F((AnonymousClass601) this.A00, A002, (C109326jp) this.A03, str2, A1Z ? 1 : 0);
    }

    public IDxDListenerShape47S0400000_1_I2(AnonymousClass601 r1, C109326jp r2, C109326jp r3, C109326jp r4, int i) {
        this.A04 = i;
        this.A00 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    public final void BwY() {
        C63893iY.A0G((AnonymousClass601) this.A00, (C109326jp) this.A02);
    }

    public final void onCancel() {
        C63893iY.A0G((AnonymousClass601) this.A00, (C109326jp) this.A01);
    }
}
