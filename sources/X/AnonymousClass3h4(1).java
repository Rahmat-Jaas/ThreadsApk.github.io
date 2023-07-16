package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3h4  reason: invalid class name */
public final class AnonymousClass3h4 {
    public static boolean A00;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r2.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS") == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass3GC A00(androidx.fragment.app.Fragment r11, X.C11630kW r12, X.C82844qM r13, com.instagram.service.session.UserSession r14, java.lang.String r15, boolean r16) {
        /*
            r3 = r11
            androidx.fragment.app.FragmentActivity r4 = r11.requireActivity()
            android.app.Activity r2 = r4.getParent()
            if (r2 != 0) goto L_0x000c
            r2 = r4
        L_0x000c:
            java.lang.String r0 = "ci_nux_step"
            r8 = r15
            boolean r9 = X.C04220Ms.A0I(r15, r0)
            android.content.Context r0 = r11.requireContext()
            java.lang.String r1 = "android.permission.READ_CONTACTS"
            int r0 = r0.checkSelfPermission(r1)
            boolean r0 = X.C18180wK.A1W(r0)
            if (r0 != 0) goto L_0x002a
            boolean r0 = r2.shouldShowRequestPermissionRationale(r1)
            r11 = 1
            if (r0 != 0) goto L_0x002b
        L_0x002a:
            r11 = 0
        L_0x002b:
            X.3GC r1 = new X.3GC
            r5 = r12
            r6 = r13
            r7 = r14
            r10 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3h4.A00(androidx.fragment.app.Fragment, X.0kW, X.4qM, com.instagram.service.session.UserSession, java.lang.String, boolean):X.3GC");
    }

    public static final void A01(Fragment fragment, C11630kW r9, C82844qM r10, UserSession userSession, String str, boolean z) {
        C18190wL.A1S(userSession, 1, str);
        C54092yt.A00(fragment.requireContext(), r9, userSession, (String) null);
        A00(fragment, r9, r10, userSession, str, false).A00(z, str);
    }

    public static final void A02(Fragment fragment, C11630kW r6, UserSession userSession, Integer num) {
        C04220Ms.A0B(userSession, 0);
        A03(fragment, r6, userSession, num, false, false);
    }

    public static final void A03(Fragment fragment, C11630kW r10, UserSession userSession, Integer num, boolean z, boolean z2) {
        String str;
        Fragment fragment2 = fragment;
        Context requireContext = fragment.requireContext();
        C11630kW r7 = r10;
        UserSession userSession2 = userSession;
        C54092yt.A00(requireContext, r10, userSession, (String) null);
        if (C34832Lb.A00(fragment2.requireContext(), userSession)) {
            A05(r10, userSession, true);
            return;
        }
        A05(r10, userSession, false);
        switch (num.intValue()) {
            case 0:
                str = "inline_upsell";
                break;
            case 1:
                str = "su_upsell";
                break;
            case 2:
                str = "serp_users_ci_upsell";
                break;
            case 3:
                str = "qp";
                break;
            case 4:
                str = "non_feed_activator_card";
                break;
            case 5:
                str = "ci_nux_step";
                break;
            default:
                str = "account_settings";
                break;
        }
        AnonymousClass3GC A002 = A00(fragment2, r7, (C82844qM) null, userSession2, str, z2);
        Context requireContext2 = fragment2.requireContext();
        C61603Ul r4 = new C61603Ul(r7, userSession2);
        int i = 2131824323;
        if (z) {
            i = 2131824325;
        }
        String A0k = AnonymousClass0wJ.A0k(requireContext2, i);
        String A0k2 = AnonymousClass0wJ.A0k(requireContext2, 2131824326);
        C25828Dsm A0W = C18190wL.A0W(requireContext2);
        A0W.A02 = A0k;
        String A0k3 = AnonymousClass0wJ.A0k(requireContext2, 2131824327);
        A0W.A0Z(C18250wR.A0E(requireContext2, r4, userSession2, 16), AnonymousClass00U.A0N(A0k2, A0k3, ' '), A0k3);
        A0W.A0P(C64163jj.A00, 2131824321);
        A0W.A0O(C64173jk.A00, 2131824322);
        A0W.A0e(new C64353kI(requireContext2, A002, r4, userSession2));
        AnonymousClass0wJ.A1K(A0W);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r4.A00, "ci_modal_impression"), 154);
        A0I.A0Q("user_initiated", C18190wL.A0Z(A0I, "entry_point", r4.A01, true));
        A0I.Bb4();
    }

    public static final void A04(C11630kW r4, UserSession userSession, int i) {
        C04220Ms.A0B(r4, 1);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r4, userSession), "feed_contact_upsell_card_seen"), 645);
        A0I.A00.A6J("position", Integer.valueOf(i));
        C18180wK.A1C(A0I, r4);
        A0I.Bb4();
    }

    public static final void A05(C11630kW r2, UserSession userSession, boolean z) {
        AnonymousClass3WS.A01(userSession).A0N(z);
        if (r2 == null) {
            C10450iM.A03("contact_connect_helper", "logContactsPermission() analyticsModule is null");
            return;
        }
        C15730rn A002 = C15730rn.A00(r2, "contacts_import_permissions");
        A002.A09("enabled", Boolean.valueOf(z));
        AnonymousClass3FH A0N = C18220wO.A0N(userSession);
        if (A0N != null) {
            A002.A0D("phone_id", A0N.A01);
        }
        C18180wK.A1K(A002, userSession);
    }
}
