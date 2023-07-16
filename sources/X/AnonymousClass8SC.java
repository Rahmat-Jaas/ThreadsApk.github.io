package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0000000_I2;

/* renamed from: X.8SC  reason: invalid class name */
public final class AnonymousClass8SC extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ AnonymousClass79L A04;
    public final /* synthetic */ Modifier A05;
    public final /* synthetic */ C142918fo A06;
    public final /* synthetic */ AnonymousClass0YP A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8SC(AnonymousClass79L r2, Modifier modifier, C142918fo r4, AnonymousClass0YP r5, float f, float f2, int i, long j) {
        super(2);
        this.A05 = modifier;
        this.A06 = r4;
        this.A03 = j;
        this.A00 = f;
        this.A02 = i;
        this.A04 = r2;
        this.A01 = f2;
        this.A07 = r5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY r15 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r15.BCM()) {
            Modifier modifier = this.A05;
            C142918fo r7 = this.A06;
            long j = this.A03;
            float f = this.A00;
            int i = this.A02;
            long A002 = AnonymousClass7Ah.A00((C141708cp) r15.AEA(AnonymousClass6ZL.A01), r15, f, j);
            AnonymousClass79L r5 = this.A04;
            float f2 = this.A01;
            long j2 = C102736Wi.A00;
            Modifier A003 = AnonymousClass6EW.A00(modifier, r7, f2, j2, j2, false);
            Modifier modifier2 = Modifier.A00;
            if (r5 != null) {
                modifier2 = AnonymousClass7Ac.A01(r5, modifier2, r7);
            }
            Modifier A012 = AnonymousClass7CA.A01(AnonymousClass6FI.A00(C115826vy.A01(C115656vh.A01(A003.Cx6(modifier2), r7, A002), r7), AnonymousClass8LQ.A00, false), Unit.A00, new KtSLambdaShape0S0000000_I2(0, (C146958n9) null));
            AnonymousClass0YP r8 = this.A07;
            C146288ly A072 = AnonymousClass7KV.A07(r15, true);
            Object A0p = C147188nY.A0p(r15);
            Object A0n = C147188nY.A0n(r15);
            Object A0m = C147188nY.A0m(r15);
            AnonymousClass0ZU r2 = AnonymousClass74X.A00;
            AnonymousClass0YM A004 = C98236Es.A00(A012);
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r15;
            C147188nY.A0w(r15, r1, r2);
            AnonymousClass7W3.A0a(r15, r1, A072, A0p);
            AnonymousClass7KP.A07(r15, A0n, A0m, A004);
            C86104wH.A1S(r15, r8, i >> 18);
            AnonymousClass7W3.A0w(r1, false);
            AnonymousClass7W3.A0e(r1);
        } else {
            r15.CuJ();
        }
        return Unit.A00;
    }
}
