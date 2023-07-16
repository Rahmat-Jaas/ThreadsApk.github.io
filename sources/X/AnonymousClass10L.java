package X;

import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0120000_I2;
import kotlin.jvm.internal.KtLambdaShape62S0100000_I2_42;

/* renamed from: X.10L  reason: invalid class name */
public final class AnonymousClass10L extends C62793ak {
    public boolean A00;
    public final M5J A01;
    public final C31153Gh5 A02;
    public final C37010Jil A03 = new C37010Jil((C30087FzX) null);
    public final UserSession A04;
    public final C04530Oa A05;
    public final C86074wE A06;
    public final C86074wE A07;
    public final C86074wE A08;

    public AnonymousClass10L(C84874u0 r10, C31153Gh5 gh5, UserSession userSession) {
        C04220Ms.A0B(gh5, 2);
        this.A04 = userSession;
        this.A02 = gh5;
        C27457Enn A0z = C18190wL.A0z(new C58863Hu(false));
        this.A07 = A0z;
        C27457Enn A0z2 = C18190wL.A0z("");
        this.A08 = A0z2;
        C27457Enn A0z3 = C18190wL.A0z(new C58853Ht(false));
        this.A06 = A0z3;
        this.A05 = AnonymousClass0OY.A02(new KtLambdaShape62S0100000_I2_42(this, 9));
        C84714tk A012 = C84874u0.A01(r10, C25807DsL.A02(new KtSLambdaShape2S0120000_I2(0, (C146958n9) null), A0z, A0z3, A0z2), 1705805791, 3);
        this.A01 = C29110FiC.A00((C27952Ew2) null, C25753DrP.A04(new C208316h("", false, false), AnonymousClass3J5.A00(this), A012, AnonymousClass74I.A00), 3);
    }

    public final void onCleared() {
        this.A00 = true;
        this.A03.A01();
    }
}
