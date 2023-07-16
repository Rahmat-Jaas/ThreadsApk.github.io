package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.internal.KtLambdaShape31S0201000_I2;

/* renamed from: X.7XX  reason: invalid class name */
public final class AnonymousClass7XX implements C147528pU {
    public final C122847Ub A00;
    public final boolean A01;

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final int BfA(C147148nT r2, C147838q0 r3, int i) {
        C04220Ms.A0B(r2, 1);
        if (!this.A01) {
            i = Integer.MAX_VALUE;
        }
        return r2.Bf8(i);
    }

    public final int BfD(C147148nT r2, C147838q0 r3, int i) {
        C04220Ms.A0B(r2, 1);
        if (this.A01) {
            return r2.BfB(Integer.MAX_VALUE);
        }
        return r2.BfB(i);
    }

    public final int BgL(C147148nT r2, C147838q0 r3, int i) {
        C04220Ms.A0B(r2, 1);
        if (!this.A01) {
            i = Integer.MAX_VALUE;
        }
        return r2.BgJ(i);
    }

    public final int BgO(C147148nT r2, C147838q0 r3, int i) {
        C04220Ms.A0B(r2, 1);
        if (this.A01) {
            return r2.BgM(Integer.MAX_VALUE);
        }
        return r2.BgM(i);
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7XX) {
                AnonymousClass7XX r5 = (AnonymousClass7XX) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        int A04 = C18210wN.A04(this.A00) * 31;
        if (!this.A01) {
            i = 0;
        }
        return A04 + i;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ScrollingLayoutModifier(scrollerState=");
        A0s.append(this.A00);
        C86134wK.A1U(A0s, ", isReversed=");
        A0s.append(", isVertical=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass7XX(C122847Ub r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }

    public final C146098ld Bg3(C147578pZ r11, C147618pd r12, long j) {
        C967266l r0;
        int A012;
        int i;
        boolean A1Y = AnonymousClass0wJ.A1Y(r12, r11);
        boolean z = this.A01;
        if (z) {
            r0 = C967266l.Vertical;
        } else {
            r0 = C967266l.Horizontal;
        }
        C97826Da.A00(r0, j);
        if (z) {
            A012 = Integer.MAX_VALUE;
            i = Constraints.A02(j);
        } else {
            A012 = Constraints.A01(j);
            i = Integer.MAX_VALUE;
        }
        C123657Xy Bg4 = r11.Bg4(Constraints.A05(Constraints.A04(j), i, Constraints.A03(j), A012));
        int i2 = Bg4.A01;
        int i3 = i2;
        int A02 = Constraints.A02(j);
        if (i2 > A02) {
            i2 = A02;
        }
        int i4 = Bg4.A00;
        int i5 = i4;
        int A013 = Constraints.A01(j);
        if (i4 > A013) {
            i4 = A013;
        }
        int i6 = i5 - i4;
        int i7 = i3 - i2;
        if (!z) {
            i6 = i7;
        }
        C122847Ub r9 = this.A00;
        C147368pE r02 = r9.A01;
        Integer valueOf = Integer.valueOf(i6);
        r02.CrC(valueOf);
        C147368pE r1 = r9.A03;
        if (AnonymousClass0wJ.A04(r1.getValue()) > i6) {
            r1.CrC(valueOf);
        }
        int i8 = i2;
        if (z) {
            i8 = i4;
        }
        C147368pE.A03(r9.A04, i8);
        return C147618pd.A00(r12, new KtLambdaShape31S0201000_I2(i6, A1Y ? 1 : 0, this, Bg4), i2, i4);
    }
}
