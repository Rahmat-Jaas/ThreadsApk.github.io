package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.44T  reason: invalid class name */
public final class AnonymousClass44T implements C11630kW {
    public static final String __redex_internal_original_name = "UserOptionsOverflowHelper";
    public final Context A00;
    public final FragmentActivity A01;
    public final AnonymousClass06E A02;
    public final C34640IcN A03;
    public final C11630kW A04;
    public final C13330nS A05;
    public final UserSession A06;
    public final C83894sA A07 = new C72124Mj(this);
    public final AnonymousClass3HG A08;
    public final User A09;
    public final L1Q A0A = new C72164Mq(this);
    public final C81764oK A0B;
    public final C18330wh A0C;
    public final L1B A0D = new C29661z4(this);

    public final String getModuleName() {
        return "UserOptionsDialog";
    }

    public static void A00(AnonymousClass44T r7, String str) {
        UserSession userSession = r7.A06;
        C34640IcN icN = r7.A03;
        User user = r7.A09;
        C63513hd.A03(icN, C63513hd.A00(user.Aj4()), userSession, str, user.getId(), "more_menu");
    }

    public static void A01(AnonymousClass44T r9, boolean z) {
        String str;
        UserSession userSession = r9.A06;
        C37232Jmy jmy = new C37232Jmy(r9.A01, r9.A04, userSession, C29009Fg4.A0s, C29008Fg3.A0e, r9.A09.getId());
        L1B l1b = r9.A0D;
        C04220Ms.A0B(l1b, 0);
        jmy.A03 = l1b;
        jmy.A08("shopping_session_id", (String) null);
        if (z) {
            str = "profile_block";
        } else {
            str = "";
        }
        jmy.A08("nua_action", str);
        jmy.A08("profile_media_attribution", (String) null);
        jmy.A06();
    }

    public AnonymousClass44T(Context context, FragmentActivity fragmentActivity, AnonymousClass06E r6, C34640IcN icN, C11630kW r8, C13330nS r9, UserSession userSession, User user, C81764oK r12) {
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A03 = icN;
        this.A06 = userSession;
        this.A09 = user;
        this.A08 = new AnonymousClass3HG(icN, userSession);
        C18330wh r2 = new C18330wh(this.A03.getContext());
        this.A0C = r2;
        C18330wh.A02(this.A03.getContext(), r2, 2131830080);
        this.A0B = r12;
        this.A04 = r8;
        this.A02 = r6;
        this.A05 = r9;
    }
}
