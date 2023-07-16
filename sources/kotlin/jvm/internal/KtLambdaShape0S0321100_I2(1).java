package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass6FI;
import X.AnonymousClass7FJ;
import X.AnonymousClass7GN;
import X.AnonymousClass7W3;
import X.C02220Ah;
import X.C115796vv;
import X.C147188nY;
import X.C86104wH;
import X.C86124wJ;
import X.C967466n;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape0S0321100_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public boolean A06;
    public final int A07;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj;
        if (this.A07 != 0) {
            C147188nY A0H = C86104wH.A0H(obj, obj2);
            long j = this.A01;
            boolean z = this.A06;
            boolean z2 = this.A05;
            AnonymousClass7FJ.A03(A0H, (Modifier) this.A04, (C967466n) this.A03, (AnonymousClass0YP) this.A02, C115796vv.A00(this.A00), j, z, z2);
        } else {
            C147188nY r6 = (C147188nY) obj3;
            if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r6.BCM()) {
                AnonymousClass0YP r1 = (AnonymousClass0YP) this.A02;
                if (r1 == null) {
                    r6.Cvb(386443790);
                    Modifier modifier = (Modifier) this.A04;
                    boolean z3 = this.A06;
                    Boolean valueOf = Boolean.valueOf(z3);
                    long j2 = this.A01;
                    boolean A10 = C147188nY.A10(r6, valueOf, C86124wJ.A0O(j2), 511388516);
                    AnonymousClass7W3 r4 = (AnonymousClass7W3) r6;
                    Object A13 = r4.A13();
                    if (A10 || A13 == AnonymousClass7GN.A00) {
                        A13 = new KtLambdaShape2S0010100_I2(0, j2, z3);
                        r4.A14(A13);
                    }
                    boolean z4 = this.A05;
                    int i = this.A00;
                    AnonymousClass7FJ.A02(r6, AnonymousClass6FI.A00(modifier, AnonymousClass7W3.A0B(r4, A13, false), false), (C967466n) this.A03, (i & 112) | (i & 896) | (i & 7168), z3, z4);
                } else {
                    r6.Cvb(386444465);
                    C86104wH.A1S(r6, r1, this.A00 >> 15);
                }
                AnonymousClass7W3.A0y(r6);
            } else {
                r6.CuJ();
            }
        }
        return Unit.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0321100_I2(Object obj, Object obj2, Object obj3, int i, int i2, long j, boolean z, boolean z2) {
        super(2);
        this.A07 = i2;
        this.A01 = j;
        this.A06 = z;
        this.A03 = obj;
        this.A05 = z2;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A00 = i;
    }
}
