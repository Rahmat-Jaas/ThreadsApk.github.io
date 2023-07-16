package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.4HM  reason: invalid class name */
public final class AnonymousClass4HM implements C82924qU {
    public final Activity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        AnonymousClass2AA r0;
        AnonymousClass2AG r1;
        C31014GdU gdU = C548530j.A00;
        UserSession userSession = this.A01;
        if (AnonymousClass2MS.A00(userSession) || gdU.A05(userSession)) {
            AnonymousClass49Y A012 = AnonymousClass3Zh.A01(userSession);
            boolean A05 = gdU.A05(userSession);
            A012.A00 = C18180wK.A0e();
            USLEBaseShape0S0000000 A002 = AnonymousClass49Y.A00(A012);
            if (AnonymousClass0wJ.A1U(A002)) {
                AnonymousClass49Y.A03(A002, A012);
                AnonymousClass2A4.A00(AnonymousClass2AE.A06, A002);
                C18230wP.A1D(C40328Lci.A0T, A002);
                if (A05) {
                    r0 = AnonymousClass2AA.A08;
                } else {
                    r0 = AnonymousClass2AA.A07;
                }
                C18240wQ.A13(r0, A002);
                if (A05) {
                    r1 = AnonymousClass2AG.SUBSCRIBER_BROADCAST;
                } else {
                    r1 = AnonymousClass2AG.INSTAGRAM;
                }
                A002.A0O(r1, "parent_surface");
                A002.A0T(C63833iQ.A03(), A012.A00);
                A002.Bb4();
            }
            Activity activity = this.A00;
            C04220Ms.A0C(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AnonymousClass2MZ.A00((FragmentActivity) activity, AnonymousClass24S.QUICK_PROMOTION, userSession).A00();
        }
    }

    public AnonymousClass4HM(Activity activity, UserSession userSession) {
        this.A00 = activity;
        this.A01 = userSession;
    }
}
