package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.551  reason: invalid class name */
public final class AnonymousClass551 extends AnonymousClass7YV implements C147528pU {
    public final C81784oM A00;
    public final C81784oM A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass551(C81784oM r2, C81784oM r3, AnonymousClass0YY r4) {
        super(r4);
        C04220Ms.A0B(r4, 2);
        this.A01 = r2;
        this.A00 = r3;
    }

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
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass551)) {
            return false;
        }
        AnonymousClass551 r4 = (AnonymousClass551) obj;
        return C04220Ms.A0I(this.A01, r4.A01) && C04220Ms.A0I(this.A00, r4.A00);
    }

    public final int hashCode() {
        return C86144wL.A03(AnonymousClass0wJ.A05(this.A00, C18230wP.A05(this.A01) * 31), 1.0f);
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }

    public final C146098ld Bg3(C147578pZ r6, C147618pd r7, long j) {
        int i;
        int i2;
        int A04;
        int A03;
        AnonymousClass0wJ.A1N(r7, r6);
        C81784oM r1 = this.A01;
        if (r1 == null || AnonymousClass0wJ.A04(r1.getValue()) == Integer.MAX_VALUE) {
            i = Integer.MAX_VALUE;
        } else {
            i = AnonymousClass8bA.A03(C18240wQ.A00(r1.getValue()), 1.0f);
        }
        C81784oM r12 = this.A00;
        if (AnonymousClass0wJ.A04(r12.getValue()) != Integer.MAX_VALUE) {
            i2 = AnonymousClass8bA.A03(C18240wQ.A00(r12.getValue()), 1.0f);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        if (i != Integer.MAX_VALUE) {
            A04 = i;
        } else {
            A04 = Constraints.A04(j);
        }
        if (i2 != Integer.MAX_VALUE) {
            A03 = i2;
        } else {
            A03 = Constraints.A03(j);
        }
        if (i == Integer.MAX_VALUE) {
            i = Constraints.A02(j);
        }
        if (i2 == Integer.MAX_VALUE) {
            i2 = Constraints.A01(j);
        }
        C123657Xy Bg4 = r6.Bg4(AnonymousClass7JT.A02(A04, i, A03, i2));
        return C147618pd.A00(r7, C86144wL.A16(Bg4, 48), Bg4.A01, Bg4.A00);
    }
}
