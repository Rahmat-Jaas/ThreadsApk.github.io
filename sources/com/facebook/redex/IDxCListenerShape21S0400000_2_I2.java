package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass6BF;
import X.BKU;
import X.C04220Ms;
import X.C11630kW;
import X.C120597Bq;
import X.C120747Ch;
import X.C13330nS;
import X.C145578kj;
import X.C18180wK;
import X.C18220wO;
import X.C36421JUf;
import X.C86104wH;
import X.C86134wK;
import android.content.Context;
import android.content.DialogInterface;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.mediatype.ProductType;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

public class IDxCListenerShape21S0400000_2_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxCListenerShape21S0400000_2_I2(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A04 = i;
        this.A03 = obj4;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A00 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A04) {
            case 0:
                UserSession userSession = (UserSession) this.A03;
                C11630kW r3 = (C11630kW) this.A01;
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r3, userSession), "coauthor_invite_accept"), HttpStatus.SC_REQUEST_URI_TOO_LONG);
                BKU bku = (BKU) this.A02;
                String str = bku.A0N;
                C04220Ms.A06(str);
                A0I.A0S("media_id", AnonymousClass0wJ.A0d(str));
                C86104wH.A1L(A0I, r3, bku, userSession, C86134wK.A0p(bku.A2Z(userSession)));
                Context context = (Context) this.A00;
                int i2 = 2131820819;
                if (ProductType.CLIPS == bku.A2M()) {
                    i2 = 2131820820;
                }
                C120597Bq.A00(context, bku, userSession, Integer.valueOf(i2), "media/%s/accept_coauthor_invite/", 2131820821);
                return;
            case 1:
                C36421JUf jUf = new C36421JUf((Hashtag) this.A03);
                jUf.A07 = C18220wO.A0d();
                Hashtag A002 = jUf.A00();
                C145578kj r0 = (C145578kj) this.A02;
                ((HashtagFollowButton) this.A00).A01((C11630kW) this.A01, r0, A002);
                r0.Bpy(A002);
                return;
            default:
                GrowthFrictionInterventionDetail growthFrictionInterventionDetail = (GrowthFrictionInterventionDetail) this.A00;
                Integer num = (Integer) this.A01;
                C04220Ms.A0B(num, 3);
                C120747Ch.A00(AnonymousClass6BF.USER_SELECTED_CANCEL_ON_DIALOG, growthFrictionInterventionDetail, (UserSession) this.A03, (User) this.A02, num);
                return;
        }
    }
}
