package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.3bJ  reason: invalid class name and case insensitive filesystem */
public final class C63003bJ {
    public static final C63003bJ A00 = new C63003bJ();

    public static void A01(UserSession userSession, Object obj, Throwable th) {
        String obj2 = obj.toString();
        String format = String.format("Failed to check user eligibility for IGPC to AC Upsell! \n%s", Arrays.copyOf(new Object[]{th.getMessage()}, 1));
        C04220Ms.A06(format);
        A02(userSession, obj2, format);
    }

    public static final void A02(UserSession userSession, String str, String str2) {
        C04220Ms.A0B(str, 1);
        A00(AnonymousClass2AF.A0b, userSession, str, str2);
    }

    public static final void A00(AnonymousClass2AF r6, C10300i6 r7, String str, String str2) {
        String str3;
        AnonymousClass2A2 r1;
        Long l = null;
        if (r7 instanceof UserSession) {
            str3 = ((UserSession) r7).getUserId();
        } else {
            str3 = null;
        }
        String A0g = C18200wM.A0g();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r7), "fxcal_linking_product"), 693);
        C18220wO.A1D(r6, A0I);
        try {
            r1 = AnonymousClass2A2.valueOf(C18220wO.A0u(Locale.ROOT, str));
        } catch (IllegalArgumentException unused) {
            r1 = AnonymousClass2A2.A04;
        }
        A0I.A0O(r1, "linking_flow_entry_point");
        if (str3 != null) {
            l = AnonymousClass0wJ.A0d(str3);
        }
        A0I.A0S("initiator_account_id", l);
        A0I.A0O(C317028q.INSTAGRAM, "initiator_account_type");
        A0I.A0T("app_device_id", A0g);
        A0I.A0T("debug_data", str2);
        A0I.Bb4();
    }
}
