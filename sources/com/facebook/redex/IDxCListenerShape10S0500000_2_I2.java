package com.facebook.redex;

import X.AnonymousClass06E;
import X.AnonymousClass0wJ;
import X.AnonymousClass6BF;
import X.AnonymousClass9KX;
import X.BKN;
import X.BKU;
import X.C04220Ms;
import X.C10300i6;
import X.C120747Ch;
import X.C18170wI;
import X.C18180wK;
import X.C18563Ahd;
import X.C31155GhB;
import X.C32165H8c;
import X.C63873iU;
import X.H1T;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

public class IDxCListenerShape10S0500000_2_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public IDxCListenerShape10S0500000_2_I2(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A05 = i;
        this.A00 = obj5;
        this.A01 = obj4;
        this.A02 = obj3;
        this.A03 = obj;
        this.A04 = obj2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A05 != 0) {
            GrowthFrictionInterventionDetail growthFrictionInterventionDetail = (GrowthFrictionInterventionDetail) this.A01;
            Integer num = (Integer) this.A02;
            C04220Ms.A0B(num, 3);
            C120747Ch.A00(AnonymousClass6BF.USER_SELECTED_CONTINUE_ON_DIALOG, growthFrictionInterventionDetail, (UserSession) this.A04, (User) this.A03, num);
            dialogInterface.dismiss();
            ((Runnable) this.A00).run();
            return;
        }
        BKU bku = (BKU) this.A01;
        H1T A0N = AnonymousClass0wJ.A0N((C10300i6) this.A00);
        BKN bkn = bku.A0f;
        A0N.A0J(C18180wK.A0j(C18170wI.A00(91), new Object[]{bkn.A4Y, bku.Aup()}));
        A0N.A0O("media_id", bkn.A4Y);
        A0N.A0R("igtv_feed_preview", bku.A4J());
        C32165H8c A0T = C18180wK.A0T(A0N, AnonymousClass9KX.class, C18563Ahd.class);
        A0T.A00 = (C63873iU) this.A02;
        C31155GhB.A01((Context) this.A03, (AnonymousClass06E) this.A04, A0T);
    }
}
