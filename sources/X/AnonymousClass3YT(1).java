package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3YT  reason: invalid class name */
public final class AnonymousClass3YT {
    public static final AnonymousClass3YT A00 = new AnonymousClass3YT();

    public final void A01(C10300i6 r7, C313625r r8, String str) {
        AnonymousClass0wJ.A1N(r7, str);
        A00(r7, (AnonymousClass3V1) null, r8, (Integer) null, str, (String) null);
    }

    public final void A02(C10300i6 r7, String str) {
        AnonymousClass0wJ.A1N(r7, str);
        A00(r7, (AnonymousClass3V1) null, (C313625r) null, (Integer) null, str, (String) null);
    }

    public static final void A00(C10300i6 r7, AnonymousClass3V1 r8, C313625r r9, Integer num, String str, String str2) {
        boolean z;
        String str3;
        String str4;
        String str5;
        String A002;
        AnonymousClass0wJ.A1N(r7, str);
        double A003 = C18200wM.A00();
        double A004 = AnonymousClass269.A00();
        Context context = C10600ic.A00;
        C04220Ms.A06(context);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r7), "step_view_loaded"), 2741);
        AnonymousClass269.A07(A0I, A003, A004);
        C18180wK.A1A(A0I, A004);
        C18190wL.A1I(A0I, str);
        C63683i7.A08(A0I);
        A0I.A0Q("is_facebook_app_installed", Boolean.valueOf(C09650fs.A03(context)));
        try {
            context.getPackageManager().getPackageInfo("com.facebook.orca", 128);
            z = true;
        } catch (PackageManager.NameNotFoundException unused) {
            z = false;
        }
        A0I.A0Q("messenger_installed", Boolean.valueOf(z));
        A0I.A0Q("whatsapp_installed", Boolean.valueOf(C09650fs.A07(context)));
        A0I.A0Q("fb_lite_installed", Boolean.valueOf(C10170hq.A02("com.facebook.lite")));
        C63683i7.A09(A0I, r7);
        List list = null;
        if (r9 != null) {
            str3 = r9.A00;
        } else {
            str3 = null;
        }
        C18210wN.A19(A0I, str3);
        if (num == null || (A002 = AnonymousClass2TT.A00(num)) == null) {
            str4 = null;
        } else {
            Locale locale = Locale.US;
            C04220Ms.A08(locale);
            str4 = C18190wL.A0r(locale, A002);
        }
        A0I.A0T("cp_type_given", str4);
        if (r8 != null) {
            str5 = r8.A00.getString(C18240wQ.A0g("CP_TYPE_GIVEN"));
        } else {
            str5 = null;
        }
        A0I.A0T("cp_type_given", str5);
        if (str2 != null) {
            list = C18180wK.A0n(str2);
        }
        A0I.A0U("type", list);
        A0I.Bb4();
    }
}
