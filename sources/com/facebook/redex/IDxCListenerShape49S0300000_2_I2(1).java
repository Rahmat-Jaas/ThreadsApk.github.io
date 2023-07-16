package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass6BF;
import X.AnonymousClass6VS;
import X.AnonymousClass7G1;
import X.BKU;
import X.C105966eH;
import X.C11630kW;
import X.C120597Bq;
import X.C18190wL;
import X.C18220wO;
import X.C25917DvL;
import X.C28174Ezk;
import X.C30857GZr;
import X.C86104wH;
import android.content.Context;
import android.content.DialogInterface;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

public class IDxCListenerShape49S0300000_2_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCListenerShape49S0300000_2_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A03) {
            case 0:
                C120597Bq.A00((Context) this.A00, (BKU) this.A01, (UserSession) this.A02, (Integer) null, "media/%s/decline_coauthor_invite/", 2131824819);
                return;
            case 1:
                UserSession userSession = ((C30857GZr) this.A02).A07;
                USLEBaseShape0S0000000 A0I = USLEBaseShape0S0000000.A0I(C18220wO.A0V((C11630kW) this.A01, userSession));
                A0I.A0S("igid", AnonymousClass0wJ.A0d(userSession.getUserId()));
                C18190wL.A1I(A0I, C28174Ezk.A00(270));
                C86104wH.A1J(A0I, "tap");
                A0I.A0Q("is_support_partner_enabled", Boolean.valueOf(AnonymousClass7G1.A03(userSession)));
                A0I.Bb4();
                ((C105966eH) this.A00).A00.A0m.A00();
                return;
            default:
                UserSession userSession2 = (UserSession) this.A01;
                AnonymousClass6VS.A00(AnonymousClass6BF.USER_SELECTED_CANCEL_ON_DIALOG, userSession2, (User) this.A00);
                ((C25917DvL) this.A02).A0C.setEnabled(true);
                return;
        }
    }
}
