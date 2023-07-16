package X;

import android.content.Context;
import android.view.View;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.simplewebview.SimpleWebViewActivity;

/* renamed from: X.1xz  reason: invalid class name and case insensitive filesystem */
public final class C29401xz extends C18720xk {
    public final Context A00;
    public final C10300i6 A01;
    public final AnonymousClass36D A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29401xz(Context context, C10300i6 r3, AnonymousClass36D r4, String str, int i) {
        super(i);
        C04220Ms.A0B(r3, 2);
        this.A00 = context;
        this.A01 = r3;
        this.A03 = str;
        this.A02 = r4;
    }

    public final void onClick(View view) {
        AnonymousClass36D r0 = this.A02;
        if (r0 != null) {
            AnonymousClass3US r4 = r0.A00.A06;
            USLEBaseShape0S0000000 A0K = USLEBaseShape0S0000000.A0K(r4.A00);
            A0K.A0T("event", "tap_component");
            C18210wN.A1B(A0K, r4.A01);
            A0K.A0T("component", "learn_more");
            C18190wL.A1I(A0K, "ig_message_settings");
            C18230wP.A1E(A0K);
        }
        Context context = this.A00;
        String A0k = AnonymousClass0wJ.A0k(context, 2131829574);
        AnonymousClass3Xr.A01(context, this.A01, SimpleWebViewActivity.A01, new C36941JhV(this.A03), A0k);
    }
}
