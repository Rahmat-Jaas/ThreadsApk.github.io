package X;

import android.app.Activity;
import android.widget.AutoCompleteTextView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.3Su  reason: invalid class name and case insensitive filesystem */
public final class C61333Su {
    public final Activity A00;
    public final AutoCompleteTextView A01;
    public final C10300i6 A02;
    public final AnonymousClass265 A03;

    public C61333Su(Activity activity, AutoCompleteTextView autoCompleteTextView, C10300i6 r4, AnonymousClass265 r5) {
        AnonymousClass0wJ.A1O(r4, activity);
        C04220Ms.A0B(autoCompleteTextView, 3);
        this.A02 = r4;
        this.A00 = activity;
        this.A01 = autoCompleteTextView;
        this.A03 = r5;
    }

    public static final void A00(C61333Su r11, Integer num, String str, String str2, String str3, int i, boolean z) {
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        C10300i6 r5 = r11.A02;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r5), "email_field_prefilled"), 578);
        AnonymousClass0wJ.A1A(A0I, A002, A003);
        C18180wK.A19(A0I);
        AnonymousClass265 r6 = r11.A03;
        AnonymousClass269.A08(A0I, "email");
        C18180wK.A1A(A0I, A003);
        C18180wK.A1B(A0I, A002);
        A0I.A0Q("is_valid", Boolean.valueOf(z));
        A0I.A0T("source", str2);
        A0I.A0S("avail_emails", C18230wP.A0f(i));
        C63683i7.A08(A0I);
        Activity activity = r11.A00;
        A0I.A0T("available_prefills", C61893Wf.A01(activity, C60053Nl.A00(activity), (String) null, str3, C63573hp.A04(activity, r5, r6, num), AnonymousClass3PY.A01(activity, r5, num)));
        if (!(str == null || str.length() == 0)) {
            A0I.A0T("error", str);
        }
        A0I.Bb4();
    }
}
