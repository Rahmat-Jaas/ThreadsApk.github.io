package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.internal.KtLambdaShape19S0301000_I2;

/* renamed from: X.7XZ  reason: invalid class name */
public final class AnonymousClass7XZ implements C147528pU {
    public final int A00;
    public final AnonymousClass7EJ A01;
    public final C114576tW A02;
    public final AnonymousClass0ZU A03;

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final /* synthetic */ int BfA(C147148nT r2, C147838q0 r3, int i) {
        return AnonymousClass7FO.A00(r2, r3, this, i);
    }

    public final /* synthetic */ int BfD(C147148nT r2, C147838q0 r3, int i) {
        return AnonymousClass7FO.A01(r2, r3, this, i);
    }

    public final C146098ld Bg3(C147578pZ r8, C147618pd r9, long j) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r9, r8);
        C123657Xy Bg4 = r8.Bg4(Constraints.A05(Constraints.A04(j), Constraints.A02(j), Constraints.A03(j), Integer.MAX_VALUE));
        int min = Math.min(Bg4.A00, Constraints.A01(j));
        return C147618pd.A00(r9, new KtLambdaShape19S0301000_I2(min, A1Z ? 1 : 0, Bg4, r9, this), Bg4.A01, min);
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
        if (this != obj) {
            if (obj instanceof AnonymousClass7XZ) {
                AnonymousClass7XZ r5 = (AnonymousClass7XZ) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || this.A00 != r5.A00 || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A03, AnonymousClass0wJ.A05(this.A02, (C18210wN.A04(this.A01) + this.A00) * 31));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("VerticalScrollLayoutModifier(scrollerPosition=");
        A0s.append(this.A01);
        A0s.append(", cursorOffset=");
        A0s.append(this.A00);
        A0s.append(", transformedText=");
        A0s.append(this.A02);
        A0s.append(", textLayoutResultProvider=");
        return C86104wH.A0y(this.A03, A0s);
    }

    public AnonymousClass7XZ(AnonymousClass7EJ r1, C114576tW r2, AnonymousClass0ZU r3, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = r2;
        this.A03 = r3;
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }
}
