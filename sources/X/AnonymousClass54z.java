package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.54z  reason: invalid class name */
public final class AnonymousClass54z extends AnonymousClass7YV implements C147528pU {
    public final Integer A00;

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final /* synthetic */ int BfA(C147148nT r2, C147838q0 r3, int i) {
        return AnonymousClass7FO.A00(r2, r3, this, i);
    }

    public final /* synthetic */ int BfD(C147148nT r2, C147838q0 r3, int i) {
        return AnonymousClass7FO.A01(r2, r3, this, i);
    }

    public final /* synthetic */ int BgL(C147148nT r2, C147838q0 r3, int i) {
        return AnonymousClass7FO.A02(r2, r3, this, i);
    }

    public final /* synthetic */ int BgO(C147148nT r2, C147838q0 r3, int i) {
        return AnonymousClass7FO.A03(r2, r3, this, i);
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass54z) || this.A00 != ((AnonymousClass54z) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 0:
                str = "Vertical";
                break;
            case 1:
                str = "Horizontal";
                break;
            default:
                str = "Both";
                break;
        }
        return C86144wL.A03(C86144wL.A0B(str, intValue) * 31, 1.0f);
    }

    public AnonymousClass54z(Integer num, AnonymousClass0YY r2) {
        super(r2);
        this.A00 = num;
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }

    public final C146098ld Bg3(C147578pZ r7, C147618pd r8, long j) {
        int A04;
        int A02;
        int A03;
        int A01;
        AnonymousClass0wJ.A1N(r8, r7);
        if (!C18180wK.A1V(((int) (j >> 33)) & Constraints.A04[(int) (j & 3)]) || this.A00 == AnonymousClass006.A00) {
            A04 = Constraints.A04(j);
            A02 = Constraints.A02(j);
        } else {
            int A022 = Constraints.A02(j);
            A04 = AnonymousClass8bI.A02(AnonymousClass8bA.A03((float) A022, 1.0f), Constraints.A04(j), A022);
            A02 = A04;
        }
        if (Constraints.A00(j) == 0 || this.A00 == AnonymousClass006.A01) {
            A03 = Constraints.A03(j);
            A01 = Constraints.A01(j);
        } else {
            int A012 = Constraints.A01(j);
            A03 = AnonymousClass8bI.A02(AnonymousClass8bA.A03((float) A012, 1.0f), Constraints.A03(j), A012);
            A01 = A03;
        }
        C123657Xy Bg4 = r7.Bg4(AnonymousClass7JT.A02(A04, A02, A03, A01));
        return C147618pd.A00(r8, C86144wL.A16(Bg4, 35), Bg4.A01, Bg4.A00);
    }
}
