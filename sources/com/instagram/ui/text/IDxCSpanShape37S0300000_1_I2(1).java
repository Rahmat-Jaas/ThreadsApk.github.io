package com.instagram.ui.text;

import X.AnonymousClass1Xf;
import X.C10300i6;
import X.C171209wF;
import X.C18210wN;
import X.C18230wP;
import X.C18730xl;
import X.C37032Jj9;
import X.C37350Jpy;
import X.C37383Jqm;
import android.content.Context;
import android.view.View;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import com.instagram.service.session.UserSession;

public class IDxCSpanShape37S0300000_1_I2 extends C18730xl {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxCSpanShape37S0300000_1_I2(int i, int i2, Object obj, Object obj2, Object obj3) {
        super(i);
        this.A03 = i2;
        this.A02 = obj3;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void onClick(View view) {
        if (this.A03 != 0) {
            new C37350Jpy((Context) this.A00, (UserSession) this.A02, C171209wF.A15, ((KtCSuperShape0S2000000_I2) this.A01).A01).A04();
            return;
        }
        C37032Jj9 A0L = C18210wN.A0L((C10300i6) this.A02);
        C18230wP.A10((Context) this.A00, A0L, 2131832164);
        C37383Jqm.A00((Context) this.A01, new AnonymousClass1Xf(), A0L.A00());
    }
}
