package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.1ho  reason: invalid class name and case insensitive filesystem */
public class C24281ho extends C63873iU {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final String A03;

    public C24281ho(Context context, Fragment fragment, UserSession userSession, String str) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = fragment;
        this.A03 = str;
    }

    public void A00(C21991Sy r18) {
        C11630kW r9;
        Context context;
        String str;
        boolean z;
        String A0V;
        String str2;
        String str3;
        int A032 = C14030oh.A03(-107269438);
        UserSession userSession = this.A02;
        C04620Ok r7 = C06810aP.A01;
        String A18 = r7.A01(userSession).A18();
        if (A18 != null) {
            Fragment fragment = this.A01;
            if (fragment instanceof C83404rK) {
                ((C83404rK) fragment).BpC(A18);
            }
        }
        C21991Sy r6 = r18;
        if (r18 != null) {
            User user = r6.A00;
            if (user != null) {
                user.A1t(userSession);
            }
            String str4 = this.A03;
            if (!"share_table".equals(str4)) {
                User user2 = r6.A00;
                if (!(user2 == null || user2.A17() == null)) {
                    str3 = "ig_profile_side_tray";
                    if (str4.equals(str3)) {
                        r9 = new AnonymousClass43O(this);
                        context = this.A00;
                        str = AnonymousClass00U.A0d("https://m.facebook.com/", C18240wQ.A0e(userSession, r7), "?referrer=", "ig_side_tray");
                        z = false;
                        A0V = AnonymousClass00U.A0d("fb://page/", C18240wQ.A0e(userSession, r7), "?referrer=", "ig_side_tray");
                        str2 = null;
                        C60903Qz.A00(context, r9, userSession, str3, str, A0V, str2, str2, z);
                    }
                }
                User user3 = r6.A00;
                if (!(user3 == null || user3.A17() == null || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36313931307812595L))) {
                    r9 = new AnonymousClass43P(this);
                    context = this.A00;
                    str = r6.A01;
                    z = true;
                    A0V = AnonymousClass00U.A0V("fb://page/", r6.A00.A17(), "?referrer=ig_onboarding_flow");
                    str2 = null;
                    str3 = "ig_business_profile";
                    C60903Qz.A00(context, r9, userSession, str3, str, A0V, str2, str2, z);
                }
            }
        }
        C62423Zt.A02(userSession);
        C37076Jk8.A01(C311924p.EDIT_PROFILE, userSession, "facebook_page_claim_helper", C18180wK.A0e()).Bdx(new C37408JrQ("claim_page", this.A03, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        C14030oh.A0A(-1775593916, A032);
    }

    public final void onFail(AnonymousClass3XX r14) {
        int A032 = C14030oh.A03(1722123554);
        UserSession userSession = this.A02;
        C62423Zt.A02(userSession);
        Context context = this.A00;
        C63813iO.A01(context, C63483hZ.A04(r14, context.getString(2131834837)));
        C37076Jk8.A01(C311924p.EDIT_PROFILE, userSession, "facebook_page_claim_helper", C18180wK.A0e()).Bdy(new C37408JrQ("claim_page", this.A03, (String) null, C63483hZ.A02(r14), (String) null, (Map) null, (Map) null, (Map) null));
        C14030oh.A0A(-1171885686, A032);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(-763345508);
        A00((C21991Sy) obj);
        C14030oh.A0A(-1523529237, A032);
    }
}
