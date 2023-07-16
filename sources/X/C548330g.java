package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.30g  reason: invalid class name and case insensitive filesystem */
public final class C548330g {
    public static int A00;

    public static void A00(C10300i6 r3, long j, boolean z) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01((C11630kW) null, r3), "emoji_support_font_download"), 580);
        A0I.A00.A6J("emoji_infra", Integer.valueOf(A00));
        A0I.A0Q("font_download_success", Boolean.valueOf(z));
        if (z) {
            A0I.A0S("result_time", Long.valueOf(j));
        }
        A0I.Bb4();
    }
}
