package com.facebook.redex;

import X.AnonymousClass3HX;
import X.AnonymousClass3VO;
import X.C109326jp;
import X.C122047Jt;
import X.C127397h3;
import X.C63893iY;
import android.view.View;

public class IDxCListenerShape46S0400000_1_I2 implements View.OnFocusChangeListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxCListenerShape46S0400000_1_I2(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A04 = i;
        this.A00 = obj;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A01 = obj2;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            C127397h3 r4 = (C127397h3) this.A02;
            AnonymousClass3VO A002 = AnonymousClass3VO.A00();
            A002.A03(r4, 0);
            AnonymousClass3HX r1 = (AnonymousClass3HX) this.A01;
            C122047Jt.A03(r1, r4, C63893iY.A04(A002, r1, 1), (C109326jp) this.A03);
        }
    }
}
