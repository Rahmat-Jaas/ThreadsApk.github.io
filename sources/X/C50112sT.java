package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2sT  reason: invalid class name and case insensitive filesystem */
public final class C50112sT {
    public static final void A00(FragmentActivity fragmentActivity, C21277Brj brj, BKU bku, C21839C2o c2o, UserSession userSession, C39797L0o l0o, int i) {
        String A03 = C19609AzA.A03(bku, userSession);
        if (A03 != null) {
            C12090lI.A00(userSession);
            BK1 A01 = C19606Az7.A01(brj, bku, c2o, "political_ad_unit_action");
            A01.A3l = "about_this_political_ad_bottom_sheet";
            C19606Az7.A0E(A01, c2o, userSession, AnonymousClass006.A01);
            User A2Z = bku.A2Z(userSession);
            if (A2Z != null) {
                String A1J = A2Z.A1J();
                boolean z = false;
                int i2 = i;
                if (!(A1J == null || A1J.length() == 0 || 1 != i2)) {
                    z = true;
                }
                String str = null;
                if (z) {
                    C684543w r0 = new C684543w(userSession);
                    String str2 = bku.A0N;
                    String id = A2Z.getId();
                    USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r0.A00, "ig_authenticity_consumer"), 801);
                    A0I.A0T("product", C29014FgO.STATE_RUN_MEDIA.toString());
                    C18220wO.A1E(C318829i.OPENED_SIEP_BOTTOMSHEET, A0I);
                    A0I.A0O(C29027Fgb.FEED, "screen");
                    A0I.A0S("post_id", AnonymousClass0wJ.A0d(str2));
                    A0I.A0S("target_user_id", AnonymousClass0wJ.A0d(id));
                    A0I.A0Q("target_location_shared", (Boolean) null);
                    A0I.Bb4();
                }
                String str3 = bku.A0N;
                String id2 = A2Z.getId();
                String BI1 = bku.BI1();
                if (z) {
                    str = A2Z.A1J();
                }
                C18180wK.A1P(str3, 2, id2);
                Bundle A06 = C18180wK.A06();
                A06.putString("ad_id", A03);
                A06.putString("media_id", str3);
                A06.putString("tracking_token", BI1);
                A06.putString("state_run_media_country", str);
                A06.putString("user_id", id2);
                C05050Qq.A00(A06, userSession);
                A06.putInt("entry_point", i2);
                AnonymousClass1d0 r1 = new AnonymousClass1d0();
                r1.setArguments(A06);
                C04220Ms.A0C(r1, "null cannot be cast to non-null type com.instagram.sponsored.politicalad.fragment.PoliticalAdInfoSheetFragment");
                C37032Jj9 A0L = C18210wN.A0L(userSession);
                A0L.A0I = r1;
                C39797L0o l0o2 = l0o;
                if (l0o != null) {
                    A0L.A0K = l0o2;
                }
                C37383Jqm A00 = A0L.A00();
                r1.A02 = A00;
                C37383Jqm.A00(fragmentActivity, r1, A00);
                return;
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }
}
