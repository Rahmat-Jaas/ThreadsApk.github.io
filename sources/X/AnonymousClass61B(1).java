package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.common.api.base.IDxACallbackShape39S0200000_5_I2;
import com.instagram.service.session.UserSession;
import java.util.UUID;

/* renamed from: X.61B  reason: invalid class name */
public final class AnonymousClass61B extends AnonymousClass0gG {
    public final /* synthetic */ IDxACallbackShape39S0200000_5_I2 A00;
    public final /* synthetic */ C31237Gkc A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61B(IDxACallbackShape39S0200000_5_I2 iDxACallbackShape39S0200000_5_I2, C31237Gkc gkc) {
        super(602);
        this.A01 = gkc;
        this.A00 = iDxACallbackShape39S0200000_5_I2;
    }

    public final void run() {
        C31237Gkc gkc = this.A01;
        UserSession userSession = gkc.A0N;
        USLEBaseShape0S0000000 A0I = USLEBaseShape0S0000000.A0I(C13330nS.A01(gkc.A0J, userSession));
        A0I.A0S("igid", AnonymousClass0wJ.A0d(userSession.getUserId()));
        C18190wL.A1I(A0I, "share_business_sticker_fetch_ranked_media");
        C18210wN.A1A(A0I, "timeout");
        A0I.A0T(C63213h0.A01(106, 10, 104), C18190wL.A0n(UUID.randomUUID()));
        A0I.A0Q("is_support_partner_enabled", false);
        A0I.A0T("sticker_type", C30940GbY.A16.A0R);
        A0I.Bb4();
        this.A00.onFail(new AnonymousClass3XX((Object) null));
    }
}
