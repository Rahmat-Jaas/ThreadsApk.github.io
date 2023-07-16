package com.facebook.redex;

import X.AnonymousClass3TG;
import X.AnonymousClass3Z9;
import X.C11630kW;
import X.C14030oh;
import X.C63783iL;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public class IDxCListenerShape0S1501000_1_I2 implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public final int A07;

    public IDxCListenerShape0S1501000_1_I2(FragmentActivity fragmentActivity, C11630kW r2, UserSession userSession, AnonymousClass3TG r4, AnonymousClass3Z9 r5, String str, int i, int i2) {
        this.A07 = i2;
        this.A01 = fragmentActivity;
        this.A02 = r2;
        this.A05 = userSession;
        this.A04 = r5;
        this.A06 = str;
        this.A00 = i;
        this.A03 = r4;
    }

    public final void onClick(View view) {
        int A052;
        int i;
        if (this.A07 != 0) {
            A052 = C14030oh.A05(1461130147);
            String str = this.A06;
            int i2 = this.A00;
            C63783iL.A07((FragmentActivity) this.A01, (C11630kW) this.A02, (UserSession) this.A05, (AnonymousClass3TG) this.A03, (AnonymousClass3Z9) this.A04, str, i2, false);
            i = -781407742;
        } else {
            A052 = C14030oh.A05(528216232);
            String str2 = this.A06;
            int i3 = this.A00;
            C63783iL.A07((FragmentActivity) this.A01, (C11630kW) this.A02, (UserSession) this.A05, (AnonymousClass3TG) this.A03, (AnonymousClass3Z9) this.A04, str2, i3, true);
            i = 1178816008;
        }
        C14030oh.A0C(i, A052);
    }
}
