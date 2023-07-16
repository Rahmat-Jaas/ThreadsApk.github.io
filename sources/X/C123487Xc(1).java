package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.7Xc  reason: invalid class name and case insensitive filesystem */
public final class C123487Xc implements C147578pZ {
    public final C147148nT A00;
    public final Integer A01;
    public final Integer A02;

    public final Object B01() {
        return this.A00.B01();
    }

    public final int Bf8(int i) {
        return this.A00.Bf8(i);
    }

    public final int BfB(int i) {
        return this.A00.BfB(i);
    }

    public final C123657Xy Bg4(long j) {
        int BgJ;
        int BgM;
        Integer num = this.A02;
        Integer num2 = AnonymousClass006.A00;
        Integer num3 = this.A01;
        Integer num4 = AnonymousClass006.A01;
        if (num == num2) {
            C147148nT r1 = this.A00;
            int A012 = Constraints.A01(j);
            if (num3 == num4) {
                BgM = r1.BfB(A012);
            } else {
                BgM = r1.BgM(A012);
            }
            return new AnonymousClass54H(BgM, Constraints.A01(j));
        }
        C147148nT r12 = this.A00;
        int A022 = Constraints.A02(j);
        if (num3 == num4) {
            BgJ = r12.Bf8(A022);
        } else {
            BgJ = r12.BgJ(A022);
        }
        return new AnonymousClass54H(Constraints.A02(j), BgJ);
    }

    public final int BgJ(int i) {
        return this.A00.BgJ(i);
    }

    public final int BgM(int i) {
        return this.A00.BgM(i);
    }

    public C123487Xc(C147148nT r1, Integer num, Integer num2) {
        this.A00 = r1;
        this.A01 = num;
        this.A02 = num2;
    }
}
