package com.instagram.ui.text;

import X.C171209wF;
import X.C18230wP;
import X.C18730xl;
import X.C37350Jpy;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public class IDxCSpanShape6S1200000_1_I2 extends C18730xl {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxCSpanShape6S1200000_1_I2(FragmentActivity fragmentActivity, UserSession userSession, String str, int i, int i2) {
        super(i);
        this.A03 = i2;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = str;
    }

    public final void onClick(View view) {
        C37350Jpy A0Y;
        int i = this.A03;
        Activity activity = (Activity) this.A00;
        UserSession userSession = (UserSession) this.A01;
        if (i != 0) {
            A0Y = C18230wP.A0Y(activity, userSession, C171209wF.A0K, this.A02);
        } else {
            A0Y = C18230wP.A0Y(activity, userSession, C171209wF.A0P, "https://help.instagram.com/1695974997209192");
            A0Y.A07(this.A02);
        }
        A0Y.A04();
    }
}
