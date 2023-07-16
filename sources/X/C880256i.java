package X;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2;
import kotlin.jvm.internal.KtLambdaShape22S0100000_I2_2;

/* renamed from: X.56i  reason: invalid class name and case insensitive filesystem */
public final class C880256i extends M5J {
    public AnonymousClass89E A00;
    public C148838sG A01;
    public final C98476Fr A02;
    public final Runnable A03;
    public final AnonymousClass0ZU A04 = new KtLambdaShape22S0100000_I2_2(this, 7);
    public final AnonymousClass0ZU A05;
    public final C27219EgD A06;
    public final C27219EgD A07;
    public final C83224qz A08;

    public C880256i(C98476Fr r3, AnonymousClass0ZU r4, C27219EgD egD, C27219EgD egD2, C83224qz r7) {
        super(new AnonymousClass59G(r3, egD, egD2, r7));
        this.A08 = r7;
        this.A02 = r3;
        this.A05 = r4;
        this.A07 = egD;
        this.A06 = egD2;
        C135127yv r1 = new C135127yv(this);
        this.A03 = r1;
        Object A082 = A08();
        C04220Ms.A0A(A082);
        AnonymousClass89E r0 = (AnonymousClass89E) A082;
        this.A00 = r0;
        r0.A00 = r1;
    }

    public final void A09() {
        A00(this, false);
    }

    public static final void A00(C880256i r6, boolean z) {
        C148838sG r0 = r6.A01;
        if (r0 == null || z) {
            if (r0 != null) {
                r0.AC7((CancellationException) null);
            }
            r6.A01 = C25237DiI.A00((Integer) null, r6.A06, new KtSLambdaShape8S0301000_I2((Object) r6, (C146958n9) null, 34, 42), r6.A08, 2);
        }
    }
}
