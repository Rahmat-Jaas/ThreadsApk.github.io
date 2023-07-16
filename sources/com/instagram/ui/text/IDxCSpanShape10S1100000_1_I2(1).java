package com.instagram.ui.text;

import X.C171209wF;
import X.C18210wN;
import X.C18230wP;
import X.C18720xk;
import X.C22601Ys;
import X.C34613Ibj;
import X.C35394Iu2;
import X.C37350Jpy;
import X.C37741K2b;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public class IDxCSpanShape10S1100000_1_I2 extends C18720xk {
    public Object A00;
    public String A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxCSpanShape10S1100000_1_I2(Object obj, String str, int i, int i2) {
        super(i);
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void onClick(View view) {
        C37350Jpy A0Y;
        String str;
        if (this.A02 != 0) {
            C34613Ibj ibj = (C34613Ibj) this.A00;
            C37741K2b k2b = ibj.A07;
            if (k2b != null) {
                k2b.A0I(C35394Iu2.A19, "audience_validation_learn_more");
            }
            FragmentActivity requireActivity = ibj.requireActivity();
            UserSession userSession = ibj.A0H;
            if (userSession != null) {
                A0Y = C18230wP.A0Y(requireActivity, userSession, C171209wF.A20, this.A01);
                str = "promote_review";
            }
            C18210wN.A0m();
            throw null;
        }
        C22601Ys r0 = (C22601Ys) this.A00;
        FragmentActivity requireActivity2 = r0.requireActivity();
        UserSession userSession2 = r0.A01;
        if (userSession2 != null) {
            A0Y = C18230wP.A0Y(requireActivity2, userSession2, C171209wF.A20, this.A01);
            str = "promote";
        }
        C18210wN.A0m();
        throw null;
        A0Y.A07(str);
        A0Y.A04();
    }
}
