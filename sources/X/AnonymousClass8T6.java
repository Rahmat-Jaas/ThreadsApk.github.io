package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0000000_I2;

/* renamed from: X.8T6  reason: invalid class name */
public final class AnonymousClass8T6 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass79L A02;
    public final /* synthetic */ C142668fO A03;
    public final /* synthetic */ C147258p3 A04;
    public final /* synthetic */ Modifier A05;
    public final /* synthetic */ C142918fo A06;
    public final /* synthetic */ AnonymousClass0ZU A07;
    public final /* synthetic */ AnonymousClass0YP A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8T6(AnonymousClass79L r2, C142668fO r3, C147258p3 r4, Modifier modifier, C142918fo r6, AnonymousClass0ZU r7, AnonymousClass0YP r8, int i, long j, boolean z) {
        super(2);
        this.A05 = modifier;
        this.A02 = r2;
        this.A06 = r6;
        this.A01 = j;
        this.A07 = r7;
        this.A04 = r4;
        this.A03 = r3;
        this.A09 = z;
        this.A08 = r8;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Modifier A012;
        C147188nY r15 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r15.BCM()) {
            Modifier modifier = this.A05;
            AnonymousClass79L r2 = this.A02;
            Modifier modifier2 = Modifier.A00;
            Modifier modifier3 = modifier2;
            if (r2 != null) {
                modifier2 = AnonymousClass7Ac.A01(r2, modifier2, this.A06);
            }
            Modifier Cx6 = modifier.Cx6(modifier2);
            long j = this.A01;
            C142918fo r1 = this.A06;
            Modifier A013 = C115826vy.A01(C115656vh.A01(Cx6, r1, j), r1);
            AnonymousClass0ZU r12 = this.A07;
            if (r12 != null) {
                Modifier A002 = AnonymousClass6FI.A00(modifier3, C139728Pb.A00, true);
                C147258p3 r8 = this.A04;
                A012 = AnonymousClass7HZ.A00(this.A03, r8, A002, AnonymousClass799.A00(0), (String) null, r12, this.A09);
            } else {
                A012 = AnonymousClass7CA.A01(AnonymousClass6FI.A00(modifier3, C79124jX.A00, false), Unit.A00, new KtSLambdaShape0S0000000_I2(10, (C146958n9) null));
            }
            Modifier Cx62 = A013.Cx6(A012);
            AnonymousClass0YP r9 = this.A08;
            int i = this.A00;
            C146288ly A072 = AnonymousClass7KV.A07(r15, true);
            Object A0p = C147188nY.A0p(r15);
            Object A0n = C147188nY.A0n(r15);
            Object A0m = C147188nY.A0m(r15);
            AnonymousClass0ZU r22 = AnonymousClass74X.A00;
            AnonymousClass0YM A003 = C98236Es.A00(Cx62);
            AnonymousClass7W3 r13 = (AnonymousClass7W3) r15;
            C147188nY.A0w(r15, r13, r22);
            AnonymousClass7W3.A0a(r15, r13, A072, A0p);
            AnonymousClass7KP.A07(r15, A0n, A0m, A003);
            r15.Cvb(1087175908);
            C86104wH.A1S(r15, r9, i >> 27);
            AnonymousClass7W3.A0v(r13, true);
        } else {
            r15.CuJ();
        }
        return Unit.A00;
    }
}
