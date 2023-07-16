package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.7te  reason: invalid class name and case insensitive filesystem */
public final class C132287te implements AnonymousClass0i1 {
    public final C145188k1 A00;
    public final C04530Oa A01 = AnonymousClass0OY.A02(AnonymousClass8GM.A00);
    public final AnonymousClass7e8 A02;
    public final C1200878l A03;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public C132287te(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        C1200878l A002 = C132467tw.A00(userSession);
        this.A03 = A002;
        AnonymousClass7e8 r7 = new AnonymousClass7e8(A002);
        this.A02 = r7;
        this.A00 = new AnonymousClass7e0((C03700Kj) C18190wL.A0f(this.A01), new C125777dy(A002, new KtCSuperShape0S0200000_I2((List) AnonymousClass0ZV.A00, AnonymousClass6XF.A00, 0)), r7, C18180wK.A0Y(), "IG_SCROLLING_SPEED");
    }
}
