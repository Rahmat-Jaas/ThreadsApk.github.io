package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape3S0402000_I2;
import kotlin.jvm.internal.KtLambdaShape4S0600000_I2;

/* renamed from: X.7Xg  reason: invalid class name and case insensitive filesystem */
public final class C123527Xg implements C146288ly {
    public final /* synthetic */ Alignment A00;
    public final /* synthetic */ boolean A01;

    public C123527Xg(Alignment alignment, boolean z) {
        this.A01 = z;
        this.A00 = alignment;
    }

    public final /* synthetic */ int Bf9(C147838q0 r2, List list, int i) {
        return AnonymousClass7FP.A00(r2, this, list, i);
    }

    public final /* synthetic */ int BfC(C147838q0 r2, List list, int i) {
        return AnonymousClass7FP.A01(r2, this, list, i);
    }

    public final C146098ld Bg2(C147618pd r21, List list, long j) {
        long A05;
        int i;
        int i2;
        AnonymousClass0YY ktLambdaShape4S0600000_I2;
        AnonymousClass55I r9;
        AnonymousClass55I r92;
        C123657Xy Bg4;
        int max;
        int max2;
        AnonymousClass55I r3;
        C147618pd r15 = r21;
        List list2 = list;
        boolean A1Z = AnonymousClass0wJ.A1Z(r15, list2);
        if (list2.isEmpty()) {
            i = Constraints.A04(j);
            i2 = Constraints.A03(j);
            ktLambdaShape4S0600000_I2 = C77674hC.A00;
        } else {
            if (this.A01) {
                A05 = j;
            } else {
                A05 = Constraints.A05(0, Constraints.A02(j), 0, Constraints.A01(j));
            }
            if (list2.size() == A1Z) {
                C147578pZ r14 = (C147578pZ) list2.get(0);
                Object B01 = r14.B01();
                if (!(B01 instanceof AnonymousClass55I) || (r3 = (AnonymousClass55I) B01) == null || !r3.A01) {
                    Bg4 = r14.Bg4(A05);
                    max = Math.max(Constraints.A04(j), Bg4.A01);
                    max2 = Math.max(Constraints.A03(j), Bg4.A00);
                } else {
                    max = Constraints.A04(j);
                    max2 = Constraints.A03(j);
                    Bg4 = r14.Bg4(Constraints.A01.A03(max, max2));
                }
                int i3 = max;
                return C147618pd.A00(r15, new KtLambdaShape3S0402000_I2(Bg4, r14, r15, this.A00, i3, max2, 0), max, max2);
            }
            C123657Xy[] r6 = new C123657Xy[list2.size()];
            AnonymousClass0MZ r4 = new AnonymousClass0MZ();
            r4.A00 = Constraints.A04(j);
            AnonymousClass0MZ r32 = new AnonymousClass0MZ();
            r32.A00 = Constraints.A03(j);
            int size = list2.size();
            boolean z = false;
            for (int i4 = 0; i4 < size; i4++) {
                C147578pZ r13 = (C147578pZ) list2.get(i4);
                Object B012 = r13.B01();
                if (!(B012 instanceof AnonymousClass55I) || (r92 = (AnonymousClass55I) B012) == null || !r92.A01) {
                    C123657Xy Bg42 = r13.Bg4(A05);
                    r6[i4] = Bg42;
                    r4.A00 = Math.max(r4.A00, Bg42.A01);
                    r32.A00 = Math.max(r32.A00, Bg42.A00);
                } else {
                    z = true;
                }
            }
            if (z) {
                int i5 = r4.A00;
                int i6 = i5;
                if (i5 == Integer.MAX_VALUE) {
                    i5 = 0;
                }
                int i7 = r32.A00;
                int i8 = 0;
                if (i7 != Integer.MAX_VALUE) {
                    i8 = i7;
                }
                long A02 = AnonymousClass7JT.A02(i5, i6, i8, i7);
                int size2 = list2.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    C147578pZ r11 = (C147578pZ) list2.get(i9);
                    Object B013 = r11.B01();
                    if ((B013 instanceof AnonymousClass55I) && (r9 = (AnonymousClass55I) B013) != null && r9.A01) {
                        r6[i9] = r11.Bg4(A02);
                    }
                }
            }
            i = r4.A00;
            i2 = r32.A00;
            ktLambdaShape4S0600000_I2 = new KtLambdaShape4S0600000_I2(r6, r4, r15, this.A00, list2, r32, 0);
        }
        return C147618pd.A00(r15, ktLambdaShape4S0600000_I2, i, i2);
    }

    public final /* synthetic */ int BgK(C147838q0 r2, List list, int i) {
        return AnonymousClass7FP.A02(r2, this, list, i);
    }

    public final /* synthetic */ int BgN(C147838q0 r2, List list, int i) {
        return AnonymousClass7FP.A03(r2, this, list, i);
    }
}
