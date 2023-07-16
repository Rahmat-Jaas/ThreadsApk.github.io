package com.facebook.redex;

import X.C11630kW;
import X.C18240wQ;
import X.C18250wR;
import X.C18330wh;
import X.C38040KHr;
import X.C63733iD;
import X.C63813iO;
import X.C83534rZ;
import X.I0W;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public class IDxCallbackShape48S0400000_1_I2 implements C83534rZ {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxCallbackShape48S0400000_1_I2(FragmentActivity fragmentActivity, C11630kW r2, UserSession userSession, C18330wh r4, int i) {
        this.A04 = i;
        if (i != 0) {
            this.A00 = fragmentActivity;
            this.A02 = userSession;
            this.A01 = r2;
            this.A03 = r4;
        } else {
            this.A03 = r4;
            this.A00 = fragmentActivity;
            this.A02 = userSession;
            this.A01 = r2;
        }
    }

    public final void CN7(I0W i0w) {
        if (this.A04 == 0) {
            C18250wR.A1C(this.A03);
        }
        C18240wQ.A0o();
        throw null;
    }

    public final void onFailure() {
        int i = this.A04;
        Object obj = this.A03;
        if (i != 0) {
            C18250wR.A1C(obj);
            C63813iO.A03((Context) this.A00, "general_error_try_again", 2131827947, 0);
            return;
        }
        C18250wR.A1C(obj);
        C63733iD A022 = C63733iD.A02();
        C63733iD.A07((Context) this.A00, A022, 2131827947);
        C63733iD.A09(C38040KHr.A01, A022);
    }
}
