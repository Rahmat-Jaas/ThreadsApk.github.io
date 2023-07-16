package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.7tx  reason: invalid class name and case insensitive filesystem */
public final class C132477tx implements AnonymousClass0i1 {
    public final Context A00;
    public final C104556by A01;
    public final UserSession A02;
    public final List A03;
    public final List A04;
    public final C04530Oa A05;
    public final C04530Oa A06 = C86114wI.A0w(this, 28);
    public final C04530Oa A07 = C86114wI.A0w(this, 29);
    public final C126027eS A08;
    public final C126037eT A09;

    static {
        C132477tx.class.getCanonicalName();
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A02.getUserId();
    }

    public C132477tx(Context context, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
        C126027eS r3 = new C126027eS(userSession);
        this.A08 = r3;
        C126037eT r0 = new C126037eT(userSession);
        this.A09 = r0;
        this.A04 = C06750aI.A17(r3, r0);
        C04220Ms.A0B(userSession, 0);
        C04220Ms.A0B(context, 1);
        this.A03 = C06750aI.A17((C145208k3) C86124wJ.A0o(userSession, C132527u3.class, context, 38), (C145208k3) C86124wJ.A0o(userSession, C132517u2.class, context, 44));
        C04530Oa A0w = C86114wI.A0w(this, 27);
        this.A05 = A0w;
        this.A01 = new C104556by((C07810cE) A0w.getValue());
    }
}
