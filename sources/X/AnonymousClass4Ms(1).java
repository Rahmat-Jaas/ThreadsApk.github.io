package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Ms  reason: invalid class name */
public final class AnonymousClass4Ms implements C84774tq {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ boolean ABr(AnonymousClass3DI r4, Object obj) {
        AnonymousClass3D9 r5 = (AnonymousClass3D9) obj;
        if (r4.A04 != null) {
            return true;
        }
        C566538a r0 = r5.A02;
        if ((r0 == null || r0.A00 == null) && !C18210wN.A1U(r5.A07) && !C18210wN.A1U(r5.A06)) {
            return true;
        }
        C60093Nq.A00(this.A01, r4.A07, AnonymousClass006.A02);
        C25828Dsm A0W = C18190wL.A0W(this.A00);
        A0W.A0L(2131835131);
        A0W.A0K(2131832974);
        A0W.A0P(C18250wR.A0E(this, r4, r5, 36), 2131835130);
        C18230wP.A1M(A0W, this, r4, 46, 2131826135);
        AnonymousClass0wJ.A1K(A0W);
        return false;
    }

    public AnonymousClass4Ms(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
