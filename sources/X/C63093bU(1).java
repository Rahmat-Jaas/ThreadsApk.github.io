package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.base.activity.IgFragmentActivity;

/* renamed from: X.3bU  reason: invalid class name and case insensitive filesystem */
public final class C63093bU {
    public static C63093bU A03;
    public Integer A00;
    public String A01;
    public String A02;

    public final void A04(C11630kW r7, C10300i6 r8, Integer num, Integer num2, Integer num3, String str) {
        String str2;
        if (AnonymousClass006.A0N == num) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r7, r8), "instagram_gdpr_consent_flow_actions"), 1827);
            if (AnonymousClass0wJ.A1U(A0I)) {
                String str3 = this.A02;
                str3.getClass();
                A0I.A0T(C63213h0.A01(106, 10, 104), str3);
                Integer num4 = this.A00;
                num4.getClass();
                A0I.A0T("user_state", AnonymousClass2PB.A00(num4));
                C18210wN.A1A(A0I, AnonymousClass2P5.A00(num2));
                if (num2 != AnonymousClass006.A0C) {
                    str = null;
                }
                A0I.A0T("click_point", str);
                A0I.A0T("email", (String) null);
                A0I.A0T("guid", A01());
                C18180wK.A1C(A0I, r7);
                A0I.A0T("stage", AnonymousClass2P4.A00(num3));
                if (AnonymousClass3VH.A00().A04 == AnonymousClass006.A00) {
                    str2 = AnonymousClass269.A04();
                } else {
                    str2 = null;
                }
                C18250wR.A0y(A0I, str2);
                A0I.Bb4();
            }
        } else if (AnonymousClass006.A0Y == num) {
            A03(r7, r8, this, num3, num2);
        }
        C126197ek A0C = C18250wR.A0C(r8);
        this.A00.getClass();
        synchronized (A0C) {
        }
    }

    public final synchronized void A05(String str, Integer num) {
        C63093bU r1 = A03;
        if (r1 != null) {
            r1.A01 = str;
            r1.A00 = num;
            r1.A02 = C18180wK.A0e();
        }
    }

    public static synchronized C63093bU A00() {
        C63093bU r0;
        synchronized (C63093bU.class) {
            if (A03 == null) {
                C63093bU r2 = new C63093bU();
                A03 = r2;
                r2.A05("", AnonymousClass006.A0C);
            }
            r0 = A03;
        }
        return r0;
    }

    public static String A01() {
        if (AnonymousClass3VH.A00().A04 == AnonymousClass006.A00) {
            return C18200wM.A0g();
        }
        return null;
    }

    public static String A02(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, C11630kW r3, String str, String str2) {
        uSLEBaseShape0S0000000.A0T(str, str2);
        uSLEBaseShape0S0000000.A0T("guid", A01());
        uSLEBaseShape0S0000000.A0T(IgFragmentActivity.MODULE_KEY, r3.getModuleName());
        if (AnonymousClass3VH.A00().A04 == AnonymousClass006.A00) {
            return AnonymousClass269.A04();
        }
        return null;
    }

    public static void A03(C11630kW r5, C10300i6 r6, C63093bU r7, Integer num, Integer num2) {
        String str;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r5, r6), "instagram_gdpr_consent_flow_view"), 1830);
        if (AnonymousClass0wJ.A1U(A0I)) {
            String str2 = r7.A02;
            str2.getClass();
            A0I.A0T(C63213h0.A01(106, 10, 104), str2);
            A0I.A0T("stage", AnonymousClass2P4.A00(num));
            Integer num3 = r7.A00;
            num3.getClass();
            A0I.A0T("user_state", AnonymousClass2PB.A00(num3));
            if (num2 != null) {
                str = AnonymousClass2P5.A00(num2);
            } else {
                str = null;
            }
            C18250wR.A0y(A0I, A02(A0I, r5, "action", str));
            A0I.Bb4();
        }
    }
}
