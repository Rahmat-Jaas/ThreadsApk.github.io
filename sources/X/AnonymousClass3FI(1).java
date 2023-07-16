package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.3FI  reason: invalid class name */
public final class AnonymousClass3FI {
    public final C14090on A00;
    public final C021209x A01;
    public final boolean A02;

    public AnonymousClass3FI(C021209x r1, C14090on r2, boolean z) {
        this.A00 = r2;
        this.A01 = r1;
        this.A02 = z;
    }

    public final void A00(String str, String str2, boolean z) {
        AnonymousClass0wJ.A1N(str, str2);
        if (this.A02) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M((C13330nS) this.A01, "android_privacy_xapp_outgoing_intent_logging"), 34);
            if (AnonymousClass0wJ.A1U(A0I)) {
                A0I.A0T("uri_scheme", str2);
                A0I.A0Q("has_detected_uii", C18190wL.A0Z(A0I, "uri_authority", str, z));
                A0I.Bb4();
            }
        }
    }
}
