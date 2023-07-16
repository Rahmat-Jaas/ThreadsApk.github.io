package com.facebook.redex;

import X.AnonymousClass3DL;
import X.BKU;
import X.C34640IcN;
import X.C63023bL;
import X.C83004qd;
import X.CUV;
import android.content.Context;
import com.instagram.service.session.UserSession;

public class IDxCListenerShape2S1600000_1_I2 implements C83004qd {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public final int A07;

    public IDxCListenerShape2S1600000_1_I2(Context context, C34640IcN icN, BKU bku, UserSession userSession, AnonymousClass3DL r5, CUV cuv, String str, int i) {
        this.A07 = i;
        this.A04 = bku;
        this.A00 = context;
        this.A03 = r5;
        this.A01 = cuv;
        this.A06 = str;
        this.A05 = userSession;
        this.A02 = icN;
    }

    public final void afterSelection(boolean z) {
        int i = this.A07;
        Object obj = this.A04;
        if (i != 0) {
            Context context = (Context) this.A00;
            String str = this.A06;
            UserSession userSession = (UserSession) this.A05;
            C63023bL.A01(context, (C34640IcN) this.A02, (BKU) obj, userSession, (AnonymousClass3DL) this.A03, (CUV) this.A01, str);
            return;
        }
        Context context2 = (Context) this.A00;
        String str2 = this.A06;
        UserSession userSession2 = (UserSession) this.A05;
        C63023bL.A02(context2, (C34640IcN) this.A02, (BKU) obj, userSession2, (AnonymousClass3DL) this.A03, (CUV) this.A01, str2);
    }
}
