package com.facebook.redex;

import X.C10300i6;
import X.C171209wF;
import X.C18210wN;
import X.C18230wP;
import X.C34462Jq;
import X.C36941JhV;
import X.C37350Jpy;
import X.I17;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.service.session.UserSession;

public class IDxCListenerShape0S2200000_1_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    public IDxCListenerShape0S2200000_1_I2(Object obj, Object obj2, String str, String str2, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = str;
        this.A03 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A04 != 0) {
            String str = this.A02;
            C18210wN.A0t((Context) this.A00, (C10300i6) this.A01, new C36941JhV(str), this.A03);
            return;
        }
        UserSession userSession = (UserSession) this.A01;
        C34462Jq.A00(userSession).A07("promotion_list", "view_appeal", this.A03, (String) null);
        C37350Jpy A0Y = C18230wP.A0Y((Activity) this.A00, userSession, C171209wF.A20, this.A02);
        A0Y.A07(I17.A00(294));
        A0Y.A04();
    }
}
