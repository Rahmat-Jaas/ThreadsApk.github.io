package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.3kI  reason: invalid class name and case insensitive filesystem */
public final class C64353kI implements DialogInterface.OnDismissListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass3GC A01;
    public final /* synthetic */ C61603Ul A02;
    public final /* synthetic */ UserSession A03;

    public C64353kI(Context context, AnonymousClass3GC r2, C61603Ul r3, UserSession userSession) {
        this.A03 = userSession;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = context;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        boolean z = AnonymousClass3h4.A00;
        UserSession userSession = this.A03;
        if (z) {
            AnonymousClass3GC r3 = this.A01;
            C61603Ul r2 = this.A02;
            r3.A00(true, "ci");
            AnonymousClass3LY.A01(userSession);
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r2.A00, "ci_modal_accepted"), 152);
            C18210wN.A1B(A0I, r2.A01);
            A0I.Bb4();
            AnonymousClass3h4.A00 = false;
            return;
        }
        Context context = this.A00;
        C61603Ul r22 = this.A02;
        C31155GhB.A03(AnonymousClass3Zx.A01(context, userSession, (String) null, false));
        AnonymousClass3LY.A01(userSession);
        USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(r22.A00, "ci_modal_denied"), 153);
        C18210wN.A1B(A0I2, r22.A01);
        A0I2.Bb4();
    }
}
