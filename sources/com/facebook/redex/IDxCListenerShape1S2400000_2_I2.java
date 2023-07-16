package com.facebook.redex;

import X.C14030oh;
import X.C166839oK;
import X.C21839C2o;
import X.C86124wJ;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public class IDxCListenerShape1S2400000_2_I2 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public String A05;
    public final int A06;

    public IDxCListenerShape1S2400000_2_I2(FragmentActivity fragmentActivity, C21839C2o c2o, UserSession userSession, C166839oK r4, String str, String str2, int i) {
        this.A06 = i;
        this.A00 = r4;
        this.A01 = fragmentActivity;
        this.A03 = userSession;
        this.A05 = str;
        this.A02 = c2o;
        this.A04 = str2;
    }

    public final void onClick(View view) {
        int A0C;
        int i;
        if (this.A06 != 0) {
            A0C = C86124wJ.A0C(this, -616497829);
            i = 1611727189;
        } else {
            A0C = C86124wJ.A0C(this, -58845582);
            i = -1995977809;
        }
        C14030oh.A0C(i, A0C);
    }
}
