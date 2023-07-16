package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass582;
import X.AnonymousClass7GN;
import X.AnonymousClass7W3;
import X.AnonymousClass8K1;
import X.C02220Ah;
import X.C04220Ms;
import X.C100216Ml;
import X.C114126sj;
import X.C115796vv;
import X.C115906w6;
import X.C121367Fq;
import X.C147178nW;
import X.C147188nY;
import X.C147258p3;
import X.C147608pc;
import X.C147618pd;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

public class KtLambdaShape0S0512000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public boolean A07;
    public final int A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0512000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, int i3, boolean z) {
        super(2);
        this.A08 = i3;
        this.A05 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A07 = z;
        this.A02 = obj4;
        this.A06 = obj5;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (this.A08) {
            case 0:
                C147608pc r4 = (C147608pc) obj4;
                long j = ((Constraints) obj3).A00;
                C04220Ms.A0B(r4, 0);
                int A022 = Constraints.A02(j);
                int A012 = Constraints.A01(j);
                long A052 = Constraints.A05(0, A022, 0, A012);
                int i2 = this.A01;
                boolean z = this.A07;
                return C147618pd.A00(r4, new AnonymousClass8K1(r4, (AnonymousClass0YP) this.A06, (AnonymousClass0YP) this.A05, (AnonymousClass0YP) this.A04, (AnonymousClass0YP) this.A02, (AnonymousClass0YM) this.A03, i2, A022, A012, this.A00, A052, z), A022, A012);
            case 1:
                C147188nY A0H = C86104wH.A0H(obj4, obj3);
                boolean z2 = this.A07;
                int i3 = this.A01;
                AnonymousClass0YP r15 = (AnonymousClass0YP) this.A06;
                AnonymousClass0YM r12 = (AnonymousClass0YM) this.A03;
                AnonymousClass0YP r11 = (AnonymousClass0YP) this.A05;
                AnonymousClass0YP r13 = (AnonymousClass0YP) this.A04;
                AnonymousClass0YP r14 = (AnonymousClass0YP) this.A02;
                int A002 = C115796vv.A00(this.A00);
                A0H.Cvd(-1401632215);
                if ((A002 & 14) == 0) {
                    i = C147188nY.A0L(A0H, z2) | A002;
                } else {
                    i = A002;
                }
                if ((A002 & 112) == 0) {
                    i |= C147188nY.A04(A0H, i3);
                }
                if ((A002 & 896) == 0) {
                    i |= C147188nY.A0B(A0H, r15);
                }
                if ((A002 & 7168) == 0) {
                    i |= C147188nY.A0C(A0H, r12);
                }
                if ((57344 & A002) == 0) {
                    i |= C147188nY.A0D(A0H, r11);
                }
                if ((458752 & A002) == 0) {
                    i |= C147188nY.A0E(A0H, r13);
                }
                if ((3670016 & A002) == 0) {
                    i |= C86104wH.A01(A0H.ACa(r14) ? 1 : 0);
                }
                if ((2995931 & i) != 599186 || !A0H.BCM()) {
                    Object[] objArr = {r15, r11, r13, new C114126sj(i3), Boolean.valueOf(z2), r14, r12};
                    A0H.Cvb(-568225417);
                    int i4 = 0;
                    boolean z3 = false;
                    do {
                        z3 = C147188nY.A12(A0H, objArr[i4], z3);
                        i4++;
                    } while (i4 < 7);
                    AnonymousClass7W3 r7 = (AnonymousClass7W3) A0H;
                    Object A13 = r7.A13();
                    if (z3 || A13 == AnonymousClass7GN.A00) {
                        A13 = new KtLambdaShape0S0512000_I2(r11, r12, r13, r14, r15, i, i3, 0, z2);
                        r7.A14(A13);
                    }
                    AnonymousClass7W3.A0w(r7, false);
                    C115906w6.A01(A0H, (Modifier) null, (AnonymousClass0YP) A13, 0, 1);
                } else {
                    A0H.CuJ();
                }
                C147178nW AKE = A0H.AKE();
                if (AKE != null) {
                    AKE.D9d(new KtLambdaShape0S0512000_I2(r11, r12, r13, r14, r15, A002, i3, 1, z2));
                    break;
                }
                break;
            case 2:
                C147188nY A0H2 = C86104wH.A0H(obj4, obj3);
                boolean z4 = this.A07;
                C100216Ml.A00((C147258p3) this.A03, A0H2, (Modifier) this.A04, (AnonymousClass0ZU) this.A05, (AnonymousClass0ZU) this.A06, (AnonymousClass0YM) this.A02, C115796vv.A00(this.A00), this.A01, z4);
                break;
            default:
                boolean z5 = this.A07;
                C121367Fq.A01(C86104wH.A0H(obj4, obj3), (Modifier) this.A02, (AnonymousClass582) this.A06, (AnonymousClass0ZU) this.A05, (AnonymousClass0ZU) this.A03, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01, z5);
                break;
        }
        return Unit.A00;
    }
}
