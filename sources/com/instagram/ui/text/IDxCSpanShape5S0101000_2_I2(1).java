package com.instagram.ui.text;

import X.AnonymousClass3J5;
import X.AnonymousClass5xb;
import X.C146958n9;
import X.C18200wM;
import X.C18730xl;
import X.C25237DiI;
import X.C27952Ew2;
import X.C62793ak;
import X.C83224qz;
import android.view.View;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0102000_I2;

public class IDxCSpanShape5S0101000_2_I2 extends C18730xl {
    public int A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxCSpanShape5S0101000_2_I2(AnonymousClass5xb r1, int i, int i2, int i3) {
        super(i2);
        this.A02 = i3;
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onClick(View view) {
        int i;
        int i2 = this.A02;
        C62793ak A0N = C18200wM.A0N(((AnonymousClass5xb) this.A01).A08);
        int i3 = this.A00;
        C83224qz A002 = AnonymousClass3J5.A00(A0N);
        if (i2 != 0) {
            i = 6;
        } else {
            i = 5;
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape2S0102000_I2(A0N, (C146958n9) null, i3, i), A002, 3);
    }
}
