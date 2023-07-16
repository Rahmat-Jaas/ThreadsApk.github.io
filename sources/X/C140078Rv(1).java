package X;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0101100_I2;

/* renamed from: X.8Rv  reason: invalid class name and case insensitive filesystem */
public final class C140078Rv extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass672 A02;
    public final /* synthetic */ C305121p A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ AnonymousClass0ZU A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140078Rv(AnonymousClass672 r2, C305121p r3, String str, AnonymousClass0ZU r5, int i, long j, boolean z) {
        super(2);
        this.A04 = str;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = i;
        this.A06 = z;
        this.A01 = j;
        this.A05 = r5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY r10 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r10.BCM()) {
            String str = this.A04;
            AnonymousClass672 r4 = this.A02;
            C305121p r3 = this.A03;
            int i = this.A00;
            AnonymousClass7Hx.A03(r10, r4, r3, str, ((i >> 6) & 896) | (i & 14) | ((i >> 3) & 112));
            if (this.A06) {
                Unit unit = Unit.A00;
                long j = this.A01;
                Long valueOf = Long.valueOf(j);
                AnonymousClass0ZU r42 = this.A05;
                boolean A10 = C147188nY.A10(r10, valueOf, r42, 511388516);
                AnonymousClass7W3 r1 = (AnonymousClass7W3) r10;
                Object A13 = r1.A13();
                if (A10 || A13 == AnonymousClass7GN.A00) {
                    A13 = new KtSLambdaShape0S0101100_I2(r42, (C146958n9) null, 8, j);
                    r1.A14(A13);
                }
                AnonymousClass7W3.A0b(r10, r1, A13, unit, false);
            }
        } else {
            r10.CuJ();
        }
        return Unit.A00;
    }
}
