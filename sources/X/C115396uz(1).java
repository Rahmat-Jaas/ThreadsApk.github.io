package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.6uz  reason: invalid class name and case insensitive filesystem */
public final class C115396uz {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C134747yH A03;
    public final C121807If A04;
    public final C143078g4 A05;
    public final C147168nV A06;
    public final AnonymousClass69J A07;
    public final List A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115396uz) {
                C115396uz r8 = (C115396uz) obj;
                if (!C04220Ms.A0I(this.A03, r8.A03) || !C04220Ms.A0I(this.A04, r8.A04) || !C04220Ms.A0I(this.A08, r8.A08) || this.A00 != r8.A00 || this.A09 != r8.A09 || this.A01 != r8.A01 || !C04220Ms.A0I(this.A06, r8.A06) || this.A07 != r8.A07 || !C04220Ms.A0I(this.A05, r8.A05) || this.A02 != r8.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A052 = AnonymousClass0wJ.A05(this.A04, C18210wN.A04(this.A03));
        return AnonymousClass0wJ.A05(this.A05, AnonymousClass0wJ.A05(this.A07, AnonymousClass0wJ.A05(this.A06, (((((AnonymousClass0wJ.A05(this.A08, A052) + this.A00) * 31) + C86124wJ.A04(this.A09 ? 1 : 0)) * 31) + this.A01) * 31))) + C18190wL.A02(this.A02);
    }

    public final String toString() {
        String str;
        StringBuilder A0s = C18190wL.A0s("TextLayoutInput(text=");
        A0s.append(this.A03);
        A0s.append(", style=");
        A0s.append(this.A04);
        A0s.append(", placeholders=");
        A0s.append(this.A08);
        A0s.append(", maxLines=");
        A0s.append(this.A00);
        A0s.append(", softWrap=");
        A0s.append(this.A09);
        A0s.append(", overflow=");
        int i = this.A01;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else if (i == 3) {
            str = "Visible";
        } else {
            str = "Invalid";
        }
        A0s.append(str);
        A0s.append(", density=");
        A0s.append(this.A06);
        A0s.append(", layoutDirection=");
        A0s.append(this.A07);
        A0s.append(", fontFamilyResolver=");
        A0s.append(this.A05);
        A0s.append(", constraints=");
        return C86104wH.A0y(Constraints.A06(this.A02), A0s);
    }

    public C115396uz(C134747yH r1, C121807If r2, C143078g4 r3, C147168nV r4, AnonymousClass69J r5, List list, int i, int i2, long j, boolean z) {
        this.A03 = r1;
        this.A04 = r2;
        this.A08 = list;
        this.A00 = i;
        this.A09 = z;
        this.A01 = i2;
        this.A06 = r4;
        this.A07 = r5;
        this.A05 = r3;
        this.A02 = j;
    }
}
