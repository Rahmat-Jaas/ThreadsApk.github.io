package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1020000_I2;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: X.57l  reason: invalid class name and case insensitive filesystem */
public final class C882857l extends C62793ak {
    public C148838sG A00;
    public final C18532Ah8 A01;
    public final Map A02 = AnonymousClass4WJ.A0H(C18180wK.A0p(5L, 200L), C18180wK.A0p(10L, 200L), C18180wK.A0p(C18210wN.A0V(), 2000L));
    public final C86084wF A03;
    public final C86074wE A04;
    public final C28172Ezi A05;
    public final C86094wG A06;

    public C882857l(C18532Ah8 ah8) {
        C04220Ms.A0B(ah8, 1);
        this.A01 = ah8;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S1020000_I2(AnonymousClass6R1.A00(this.A01.A00()), false, false, 1));
        this.A04 = A0z;
        this.A06 = C18230wP.A0x((C148838sG) null, A0z);
        C27456Enm enm = new C27456Enm(AnonymousClass006.A00, 0, 0);
        this.A03 = enm;
        this.A05 = new C27198Efl((C148838sG) null, enm);
    }

    public final void A00() {
        C86074wE r4 = this.A04;
        String str = ((KtCSuperShape0S1020000_I2) r4.getValue()).A00;
        boolean z = ((KtCSuperShape0S1020000_I2) r4.getValue()).A01;
        C04220Ms.A0B(str, 1);
        r4.CrC(new KtCSuperShape0S1020000_I2(str, false, z, 1));
    }

    public final void onCleared() {
        C148838sG r1 = this.A00;
        if (r1 != null) {
            r1.AC7((CancellationException) null);
        }
        this.A00 = null;
    }
}
