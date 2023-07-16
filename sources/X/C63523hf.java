package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.proxygen.TraceFieldType;
import com.google.android.gms.common.api.Status;

/* renamed from: X.3hf  reason: invalid class name and case insensitive filesystem */
public final class C63523hf {
    public static final C63523hf A00 = new C63523hf();

    public static /* synthetic */ void A00(Status status, C10300i6 r8, String str, int i, boolean z) {
        Boolean bool;
        Long l;
        Boolean bool2;
        Boolean bool3;
        C04220Ms.A0B(r8, 0);
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r8), "ig_android_smart_lock_account_dialog_displayed"), 781);
        AnonymousClass269.A07(A0I, A002, A003);
        C63683i7.A0B(A0I, str, A003);
        Boolean bool4 = null;
        String str2 = null;
        C18210wN.A19(A0I, (String) null);
        A0I.A0Q("has_status", Boolean.valueOf(AnonymousClass0wJ.A1W(status)));
        if (status != null) {
            bool = Boolean.valueOf(AnonymousClass0wJ.A1W(status.A02));
        } else {
            bool = null;
        }
        A0I.A0Q("has_resolution", bool);
        if (status != null) {
            l = C18230wP.A0f(status.A01);
        } else {
            l = null;
        }
        A0I.A0S(TraceFieldType.StatusCode, l);
        if (status != null) {
            str2 = status.A04;
        }
        A0I.A0T(TraceFieldType.StatusMessage, str2);
        if (status != null) {
            bool2 = Boolean.valueOf(AnonymousClass0wJ.A1T(status.A01, 16));
        } else {
            bool2 = null;
        }
        A0I.A0Q("status_is_cancelled", bool2);
        if (status != null) {
            boolean z2 = false;
            if (status.A01 <= 0) {
                z2 = true;
            }
            bool3 = Boolean.valueOf(z2);
        } else {
            bool3 = null;
        }
        A0I.A0Q("status_is_success", bool3);
        if (status != null) {
            bool4 = Boolean.valueOf(AnonymousClass0wJ.A1T(status.A01, 14));
        }
        A0I.A0Q("status_is_interrupted", bool4);
        A0I.A0S("num_one_tap_accounts", C18230wP.A0f(i));
        A0I.A0Q("is_auto_login_enable", C18210wN.A0R(A0I, false, "is_internal_build", z));
        A0I.Bb4();
    }

    public final void A06(Status status, C10300i6 r6, String str, String str2, String str3, int i, boolean z) {
        C04220Ms.A0B(r6, 0);
        USLEBaseShape0S0000000 A02 = AnonymousClass269.A02(AnonymousClass0wJ.A0M(C13330nS.A02(r6), "ig_android_smart_lock_error"), str, 785, System.currentTimeMillis());
        C18180wK.A1G(A02);
        C18210wN.A1A(A02, str2);
        A02.A0T("error", str3);
        A02.A0S("num_one_tap_accounts", C18230wP.A0f(i));
        A02.A0Q("is_auto_login_enable", Boolean.valueOf(z));
        A02.A0Q("has_status", Boolean.valueOf(AnonymousClass0wJ.A1W(status)));
        if (status != null) {
            A02.A0Q("has_resolution", Boolean.valueOf(AnonymousClass0wJ.A1W(status.A02)));
            int i2 = status.A01;
            A02.A0S(TraceFieldType.StatusCode, C18230wP.A0f(i2));
            A02.A0T(TraceFieldType.StatusMessage, status.A04);
            A02.A0Q("status_is_cancelled", Boolean.valueOf(AnonymousClass0wJ.A1T(i2, 16)));
            boolean z2 = false;
            if (i2 <= 0) {
                z2 = true;
            }
            A02.A0Q("status_is_success", Boolean.valueOf(z2));
            A02.A0Q("status_is_interrupted", Boolean.valueOf(AnonymousClass0wJ.A1T(i2, 14)));
        }
        A02.Bb4();
    }

    public static /* synthetic */ void A04(C10300i6 r5, String str, String str2, int i, boolean z, boolean z2) {
        if ((i & 16) != 0) {
            str2 = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long A01 = AnonymousClass269.A01();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r5), "ig_android_smart_lock_save_password"), 787);
        AnonymousClass269.A05(A0I);
        C18180wK.A19(A0I);
        C18190wL.A1G(A0I, currentTimeMillis, A01);
        C18200wM.A1K(A0I, (double) A01);
        C18190wL.A1I(A0I, str);
        C18180wK.A1G(A0I);
        A0I.A0Q("dialog_shown", C18210wN.A0R(A0I, Boolean.valueOf(z), "success", z2));
        if (str2 != null) {
            A0I.A0T("error", str2);
        }
        A0I.Bb4();
    }

    public static /* synthetic */ void A01(C10300i6 r7, String str) {
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r7), "ig_android_smart_lock_account_dialog_dismissed"), 780);
        AnonymousClass269.A07(A0I, A002, A003);
        C63683i7.A0B(A0I, str, A003);
        A0I.A0Q("is_internal_build", C18180wK.A0X());
        C18210wN.A19(A0I, (String) null);
        A0I.Bb4();
    }

    public static /* synthetic */ void A02(C10300i6 r7, String str) {
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r7), "ig_android_smart_lock_dialog_account_selected"), 783);
        AnonymousClass269.A07(A0I, A002, A003);
        C63683i7.A0B(A0I, str, A003);
        A0I.A0Q("is_internal_build", C18180wK.A0X());
        A0I.Bb4();
    }

    public static /* synthetic */ void A03(C10300i6 r7, String str) {
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r7), "ig_android_smart_lock_dialog_no_account_selected"), 784);
        AnonymousClass269.A07(A0I, A002, A003);
        C63683i7.A0B(A0I, str, A003);
        A0I.A0Q("is_internal_build", C18180wK.A0X());
        C18210wN.A19(A0I, (String) null);
        A0I.Bb4();
    }

    public static /* synthetic */ void A05(C10300i6 r3, String str, String str2, String str3) {
        USLEBaseShape0S0000000 A02 = AnonymousClass269.A02(AnonymousClass0wJ.A0M(C13330nS.A02(r3), "ig_android_smart_lock_error"), str, 785, System.currentTimeMillis());
        C18180wK.A1G(A02);
        C18210wN.A1A(A02, str2);
        A02.A0T("error", str3);
        A02.Bb4();
    }
}
