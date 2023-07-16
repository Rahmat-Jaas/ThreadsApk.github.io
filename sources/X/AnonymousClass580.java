package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000100_I2;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2;

/* renamed from: X.580  reason: invalid class name */
public final class AnonymousClass580 extends C62793ak {
    public C148838sG A00;
    public final M5J A01;
    public final AnonymousClass48v A02;
    public final C880356k A03;
    public final C86064wD A04;
    public final C84714tk A05;
    public final C86074wE A06;
    public final C86094wG A07;
    public final C86094wG A08;
    public final AnonymousClass37P A09;
    public final C11630kW A0A;
    public final C86074wE A0B;

    public AnonymousClass580(AnonymousClass37P r6, AnonymousClass48v r7, C11630kW r8) {
        C04220Ms.A0B(r7, 1);
        this.A02 = r7;
        this.A09 = r6;
        this.A0A = r8;
        C880356k r4 = new C880356k();
        this.A03 = r4;
        this.A01 = r4;
        C27457Enn A0z = C18190wL.A0z(new AnonymousClass3I1());
        this.A0B = A0z;
        this.A08 = C18230wP.A0x((C148838sG) null, A0z);
        C27457Enn A0z2 = C18190wL.A0z(AnonymousClass69F.SUCCESS);
        this.A06 = A0z2;
        this.A07 = C18230wP.A0x((C148838sG) null, A0z2);
        C27441EnX enX = new C27441EnX();
        this.A04 = enX;
        this.A05 = AnonymousClass7C4.A02(enX);
        C880356k r3 = new C880356k();
        r3.A0K(r4, C86164wN.A0O(AnonymousClass0wJ.A0F(), new C1360281b(r4, r3), 36));
        r3.A0E(C86114wI.A0Q(this, 284));
    }

    public final void A01(List list) {
        this.A06.CrC(AnonymousClass69F.SUCCESS);
        AnonymousClass3I1 r4 = new AnonymousClass3I1();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r4.A01(new C131817sr((KtCSuperShape0S2000100_I2) it.next(), this.A0A));
        }
        this.A0B.CrC(r4);
    }

    public static final void A00(AnonymousClass580 r4, String str) {
        if (str.length() == 0) {
            r4.A01(AnonymousClass0ZV.A00);
            return;
        }
        C148838sG r0 = r4.A00;
        if (r0 != null) {
            r0.AC7((CancellationException) null);
        }
        r4.A00 = C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S1101000_I2(r4, str, (C146958n9) null, 4), AnonymousClass3J5.A00(r4), 3);
    }
}
