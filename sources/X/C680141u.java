package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.lang.ref.WeakReference;

/* renamed from: X.41u  reason: invalid class name and case insensitive filesystem */
public final class C680141u implements C13190nB {
    public final C10300i6 A00;

    public C680141u(C10300i6 r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public final /* synthetic */ void CdH(String str, String str2, String str3, String str4, WeakReference weakReference, boolean z) {
        CdG(str, str2, str3, str4, true);
    }

    public final void CdG(String str, String str2, String str3, String str4, boolean z) {
        C10680ik r0 = new C10680ik(this.A00);
        r0.A02 = str2;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r0.A00(), "nav_chain_debug"), 2429);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0T("desired_endpoint", str2);
            A0I.A0T("current_endpoint", AnonymousClass4WE.A00().A00);
            A0I.A0S("delay_ms_between_navigation_and_self", C18210wN.A0V());
            A0I.A0T("navigation_history", "");
            A0I.Bb4();
        }
    }
}
