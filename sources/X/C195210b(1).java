package X;

import android.app.Activity;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;
import com.facebook.redex.IDxFlowShape250S0100000_1_I2;
import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.facebook.redex.IDxFunctionShape368S0100000_4_I2;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0102000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0200000_I2_4;

/* renamed from: X.10b  reason: invalid class name and case insensitive filesystem */
public final class C195210b extends C62793ak {
    public final M5J A00;
    public final C84874u0 A01;
    public final C31153Gh5 A02;
    public final C37010Jil A03 = new C37010Jil((C30087FzX) null);
    public final C8A A04;
    public final AnonymousClass1oT A05;
    public final EAB A06;
    public final UserSession A07;
    public final C04530Oa A08 = AnonymousClass0OY.A02(C18250wR.A0e(this, 14));
    public final C04530Oa A09;
    public final C04530Oa A0A = AnonymousClass0OY.A02(C18250wR.A0e(this, 16));
    public final C86064wD A0B;
    public final C84714tk A0C;
    public final C86074wE A0D;
    public final C86074wE A0E;
    public final C86094wG A0F;
    public final C86094wG A0G;
    public final C86094wG A0H;

    public /* synthetic */ C195210b(C31153Gh5 gh5, C8A c8a, AnonymousClass1oT r27, EAB eab, UserSession userSession) {
        E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
        EAB eab2 = eab;
        C04220Ms.A0B(eab2, 3);
        this.A07 = userSession;
        this.A02 = gh5;
        this.A06 = eab2;
        this.A04 = c8a;
        this.A05 = r27;
        this.A01 = A0J;
        C27444Ena ena = new C27444Ena(AnonymousClass006.A00, AnonymousClass743.A00);
        this.A0B = ena;
        this.A0C = AnonymousClass7C4.A02(ena);
        C27457Enn A0z = C18190wL.A0z(C304020x.OFF);
        this.A0E = A0z;
        C84714tk A012 = C84874u0.A01(A0J, new IDxFlowShape93S0200000_1_I2((AnonymousClass0YP) new KtSLambdaShape9S0200000_I2_4(this, (C146958n9) null, 41), (C84714tk) new IDxFlowShape93S0200000_1_I2(6, (Object) this, (Object) eab2.A04()), 34), 1705805791, 3);
        C83224qz A002 = AnonymousClass3J5.A00(this);
        C146938n7 r7 = AnonymousClass74I.A01;
        C305922a r15 = C305922a.LOADING;
        C86094wG A042 = C25753DrP.A04(r15, A002, A012, r7);
        this.A0F = A042;
        AnonymousClass1oW r5 = AnonymousClass1oW.A00;
        C27457Enn A0z2 = C18190wL.A0z(new KtCSuperShape0S0200000_I2((C24115D9m) r5, (C24115D9m) r5));
        this.A0D = A0z2;
        EAB.A03(eab2);
        C86094wG A043 = C25753DrP.A04(false, AnonymousClass3J5.A00(this), C84874u0.A01(A0J, new IDxFlowShape250S0100000_1_I2(C18230wP.A0x((C148838sG) null, eab2.A0C), 8), 1705805791, 3), r7);
        this.A0G = A043;
        EAB.A03(eab2);
        C86094wG A044 = C25753DrP.A04(false, AnonymousClass3J5.A00(this), C84874u0.A01(A0J, new IDxFlowShape250S0100000_1_I2(C18230wP.A0x((C148838sG) null, eab2.A0D), 9), 1705805791, 3), r7);
        this.A0H = A044;
        C86094wG r18 = A042;
        C27457Enn enn = A0z;
        C84714tk A013 = C84874u0.A01(A0J, C25807DsL.A04(AnonymousClass4Xk.A00, enn, r18, A0z2, A043, A044), 1705805791, 3);
        C83224qz A003 = AnonymousClass3J5.A00(this);
        C146938n7 r2 = AnonymousClass74I.A00;
        C304020x r21 = C304020x.ON;
        this.A00 = C29110FiC.A00((C27952Ew2) null, C25753DrP.A04(new C209116p(new KtCSuperShape0S0200000_I2((C24115D9m) r5, (C24115D9m) r5), r15, r21, false, false), A003, A013, r2), 3);
        this.A09 = AnonymousClass0OY.A02(C18250wR.A0e(this, 15));
    }

    public final void A01(Activity activity, boolean z) {
        if (z) {
            AnonymousClass2MW.A00(this.A07).A01(activity, C303820v.FULLSCREEN_MODAL, AnonymousClass006.A0j, AnonymousClass006.A0C);
            return;
        }
        this.A0E.D7t(C304020x.ON);
        this.A03.A02(C131527sG.A00, this.A02.A0E(new IDxFunctionShape368S0100000_4_I2(this, 11)));
    }

    public final void onCleared() {
        this.A03.A01();
    }

    public static final void A00(C195210b r4, int i) {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape2S0102000_I2(r4, (C146958n9) null, i, 13), AnonymousClass3J5.A00(r4), 3);
    }
}
