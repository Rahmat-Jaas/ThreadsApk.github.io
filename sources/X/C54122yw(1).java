package X;

import android.os.Build;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.2yw  reason: invalid class name and case insensitive filesystem */
public final class C54122yw {
    public static final void A00(C10300i6 r6, String str) {
        AnonymousClass0wJ.A1N(r6, str);
        double A00 = C18200wM.A00();
        double A002 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r6), "first_party_token_acquired"), 648);
        AnonymousClass0wJ.A1B(A0I, A00, A002);
        C18180wK.A19(A0I);
        C18200wM.A1K(A0I, A002);
        AnonymousClass269.A05(A0I);
        C18190wL.A1I(A0I, str);
        A0I.A0S("os_version", C18230wP.A0f(Build.VERSION.SDK_INT));
        C63683i7.A0A(A0I, r6);
    }
}
