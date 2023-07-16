package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.559  reason: invalid class name */
public final class AnonymousClass559 extends AnonymousClass7YV implements C147528pU {
    public final float A00;
    public final float A01;

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass559)) {
            return false;
        }
        AnonymousClass559 r4 = (AnonymousClass559) obj;
        if (!C18180wK.A1W(Float.compare(this.A01, r4.A01)) || !C18180wK.A1W(Float.compare(this.A00, r4.A00))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86144wL.A03(C86134wK.A03(this.A01), this.A00);
    }

    public AnonymousClass559(AnonymousClass0YY r1, float f, float f2) {
        super(r1);
        this.A01 = f;
        this.A00 = f2;
    }

    public static int A00(C147168nV r1, float f) {
        if (!C134847yT.A03(f)) {
            return r1.CfL(f);
        }
        return 0;
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }

    public final int BfA(C147148nT r3, C147838q0 r4, int i) {
        AnonymousClass0wJ.A1N(r4, r3);
        int Bf8 = r3.Bf8(i);
        int A002 = A00(r4, this.A00);
        if (Bf8 < A002) {
            return A002;
        }
        return Bf8;
    }

    public final int BfD(C147148nT r3, C147838q0 r4, int i) {
        AnonymousClass0wJ.A1N(r4, r3);
        int BfB = r3.BfB(i);
        int A002 = A00(r4, this.A01);
        if (BfB < A002) {
            return A002;
        }
        return BfB;
    }

    public final C146098ld Bg3(C147578pZ r7, C147618pd r8, long j) {
        int A04;
        int A03;
        int A1Y = AnonymousClass0wJ.A1Y(r8, r7);
        float f = this.A01;
        if (C18180wK.A1W(Float.compare(f, Float.NaN)) || Constraints.A04(j) != 0) {
            A04 = Constraints.A04(j);
        } else {
            A04 = r8.CfL(f);
            int A02 = Constraints.A02(j);
            if (A04 > A02) {
                A04 = A02;
            }
            if (A04 < A1Y) {
                A04 = 0;
            }
        }
        int A022 = Constraints.A02(j);
        float f2 = this.A00;
        if (C18180wK.A1W(Float.compare(f2, Float.NaN)) || Constraints.A03(j) != 0) {
            A03 = Constraints.A03(j);
        } else {
            A03 = r8.CfL(f2);
            int A012 = Constraints.A01(j);
            if (A03 > A012) {
                A03 = A012;
            }
            if (A03 < A1Y) {
                A03 = 0;
            }
        }
        C123657Xy Bg4 = r7.Bg4(AnonymousClass7JT.A02(A04, A022, A03, Constraints.A01(j)));
        return C147618pd.A00(r8, C86144wL.A16(Bg4, 44), Bg4.A01, Bg4.A00);
    }

    public final int BgL(C147148nT r3, C147838q0 r4, int i) {
        AnonymousClass0wJ.A1N(r4, r3);
        int BgJ = r3.BgJ(i);
        int A002 = A00(r4, this.A00);
        if (BgJ < A002) {
            return A002;
        }
        return BgJ;
    }

    public final int BgO(C147148nT r3, C147838q0 r4, int i) {
        AnonymousClass0wJ.A1N(r4, r3);
        int BgM = r3.BgM(i);
        int A002 = A00(r4, this.A01);
        if (BgM < A002) {
            return A002;
        }
        return BgM;
    }
}
