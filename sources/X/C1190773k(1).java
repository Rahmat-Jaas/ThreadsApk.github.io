package X;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.api.schemas.ActionButtonPartnerType;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.73k  reason: invalid class name and case insensitive filesystem */
public final class C1190773k {
    public static final C16240si A00 = new C127907hv();

    public static void A00(C34640IcN icN, UserSession userSession, User user, User user2) {
        SMBPartnerType sMBPartnerType;
        String url;
        C146558mR A08;
        FragmentActivity activity = icN.getActivity();
        activity.getClass();
        C109166jZ r8 = new C109166jZ(icN, userSession, C18180wK.A0e());
        ActionButtonPartnerType actionButtonPartnerType = null;
        try {
            C146558mR A082 = user.A08();
            A082.getClass();
            sMBPartnerType = C99726Kn.A00(A082.AWx());
            if (sMBPartnerType == null) {
                throw C18190wL.A0a("No SMBPartnerType for provided category type");
            }
        } catch (IllegalArgumentException unused) {
            sMBPartnerType = null;
        }
        if (sMBPartnerType == SMBPartnerType.GET_QUOTE) {
            C121527Go.A00(activity, C170809vb.A04, userSession, user);
            return;
        }
        C146558mR A083 = user.A08();
        if (A083 == null) {
            url = "";
        } else {
            url = A083.getUrl();
        }
        if (!TextUtils.isEmpty(url)) {
            if (user.A08() != null) {
                actionButtonPartnerType = user.A08().B09();
            }
            if (!C121877Ip.A04(activity, actionButtonPartnerType, sMBPartnerType, url)) {
                C37350Jpy jpy = new C37350Jpy((Activity) activity, userSession, C171209wF.A2I, url);
                jpy.A06(userSession.getUserId());
                jpy.A07(icN.getModuleName());
                jpy.A04();
            } else if (C121877Ip.A05(user2) && (A08 = user2.A08()) != null) {
                String AQz = A08.AQz();
                String B08 = A08.B08();
                String url2 = A08.getUrl();
                String id = user2.getId();
                String AWx = A08.AWx();
                AWx.getClass();
                long A0D = C86144wL.A0D(id);
                USLEBaseShape0S0000000 A0H = USLEBaseShape0S0000000.A0H(r8.A01);
                long j = r8.A00;
                A0H.A0S("igid", Long.valueOf(j));
                C18190wL.A1I(A0H, "open_deeplink");
                C18210wN.A1A(A0H, "open");
                A0H.A0T(C61933Wk.A00(21, 10, 47), r8.A02);
                A0H.A0Q("is_profile_owner", Boolean.valueOf(C18180wK.A1W((j > A0D ? 1 : (j == A0D ? 0 : -1)))));
                A0H.A0S("profile_owner_id", Long.valueOf(A0D));
                A0H.A0T("service_type", AWx);
                A0H.A0S("partner_id", AnonymousClass0wJ.A0d(AQz));
                C86114wI.A1F(A0H, B08, url2);
                A0H.Bb4();
            }
        }
    }
}
