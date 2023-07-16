package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.UUID;

/* renamed from: X.2qq  reason: invalid class name and case insensitive filesystem */
public final class C49102qq {
    public static final void A00(FragmentActivity fragmentActivity, AnonymousClass22H r6, C11630kW r7, UserSession userSession, boolean z) {
        C25786Drz A0Q;
        String str;
        C04220Ms.A0B(userSession, 0);
        AnonymousClass0wJ.A1O(fragmentActivity, r6);
        if (r6 == AnonymousClass22H.CHILD_ACCOUNT) {
            SharedPreferences A04 = C28161tl.A04(userSession);
            AnonymousClass0wJ.A11(A04.edit(), "account_linking_login_info_tapped_count", A04.getInt("account_linking_login_info_tapped_count", 0) + 1);
            Class<C551832c> cls = C551832c.class;
            C77494gf r3 = C77494gf.A00;
            ((C551832c) userSession.A01(cls, r3)).A00 = UUID.randomUUID();
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "ig_my_main_account_settings_click"), 1360);
            A0I.A0T("account_linking_session_id", String.valueOf(((C551832c) userSession.A01(cls, r3)).A00));
            A0I.Bb4();
            C58163Ei.A01.A00();
            Bundle A0E = AnonymousClass0wJ.A0E(userSession);
            AnonymousClass1cA r0 = new AnonymousClass1cA();
            r0.setArguments(A0E);
            A0Q = C18180wK.A0Q(fragmentActivity, userSession);
            A0Q.A03 = r0;
            str = "AccountLinkingChildGroupManagementFragment.BACK_STACK_STATE_NAME";
        } else if (r6 == AnonymousClass22H.MAIN_ACCOUNT) {
            SharedPreferences A042 = C28161tl.A04(userSession);
            AnonymousClass0wJ.A11(A042.edit(), "account_linking_login_info_tapped_count", A042.getInt("account_linking_login_info_tapped_count", 0) + 1);
            Class<C551832c> cls2 = C551832c.class;
            C77494gf r32 = C77494gf.A00;
            ((C551832c) userSession.A01(cls2, r32)).A00 = UUID.randomUUID();
            C15730rn A00 = C15730rn.A00(r7, "ig_manage_main_account_settings_click");
            A00.A0D("account_linking_session_id", String.valueOf(((C551832c) userSession.A01(cls2, r32)).A00));
            C18180wK.A1K(A00, userSession);
            C58163Ei.A01.A00();
            Bundle A0E2 = AnonymousClass0wJ.A0E(userSession);
            A0E2.putBoolean("should_pop_back_stack_without_name", z);
            AnonymousClass1cB r1 = new AnonymousClass1cB();
            r1.setArguments(A0E2);
            A0Q = C18180wK.A0Q(fragmentActivity, userSession);
            A0Q.A09 = r1.mTag;
            A0Q.A03 = r1;
            str = "AccountLinkingMainGroupManagementFragment.BACK_STACK_STATE_NAME";
        } else {
            return;
        }
        A0Q.A07 = str;
        A0Q.A05();
    }
}
