package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.6rA  reason: invalid class name and case insensitive filesystem */
public final class C113326rA {
    public final C115396uz A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C113326rA) {
                C115396uz r3 = this.A00;
                C134747yH r1 = r3.A03;
                C115396uz r2 = ((C113326rA) obj).A00;
                if (C04220Ms.A0I(r1, r2.A03)) {
                    C121807If r5 = r3.A04;
                    C121807If r4 = r2.A04;
                    C04220Ms.A0B(r4, 0);
                    if ((r5 == r4 || (C04220Ms.A0I(r5.A00, r4.A00) && r5.A02.A02(r4.A02))) && C04220Ms.A0I(r3.A08, r2.A08) && C04220Ms.A0I(r3.A06, r2.A06) && r3.A07 == r2.A07 && r3.A05 == r2.A05) {
                        long j = r3.A02;
                        int A02 = Constraints.A02(j);
                        long j2 = r2.A02;
                        if (!(A02 == Constraints.A02(j2) && Constraints.A01(j) == Constraints.A01(j2))) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        C115396uz r2 = this.A00;
        int A04 = C18210wN.A04(r2.A03);
        C121807If r4 = r2.A04;
        AnonymousClass7F0 r5 = r4.A02;
        int i4 = 0;
        int A042 = (C86154wM.A04(r5.A01) + C18230wP.A05(r5.A09)) * 31;
        C114236su r0 = r5.A07;
        if (r0 != null) {
            i = r0.A00;
        } else {
            i = 0;
        }
        int i5 = (A042 + i) * 31;
        C114246sv r02 = r5.A08;
        if (r02 != null) {
            i2 = r02.A00;
        } else {
            i2 = 0;
        }
        int A06 = C86104wH.A06((((((i5 + i2) * 31) + C18230wP.A05(r5.A06)) * 31) + C18220wO.A07(r5.A0F)) * 31, r5.A02);
        C114266sx r03 = r5.A0B;
        if (r03 != null) {
            i3 = Float.floatToIntBits(r03.A00);
        } else {
            i3 = 0;
        }
        int A062 = C86104wH.A06((((((A06 + i3) * 31) + C18230wP.A05(r5.A0E)) * 31) + C18230wP.A05(r5.A0A)) * 31, r5.A00);
        C113216qw r04 = r5.A05;
        if (r04 != null) {
            i4 = r04.hashCode();
        }
        C121237Ex r05 = r4.A00;
        int A05 = AnonymousClass0wJ.A05(r2.A05, AnonymousClass0wJ.A05(r2.A07, AnonymousClass0wJ.A05(r2.A06, (((((AnonymousClass0wJ.A05(r2.A08, (A04 + AnonymousClass0wJ.A05(r05, (A062 + i4) * 31) + C18230wP.A05(r4.A01)) * 31) + Integer.MAX_VALUE) * 31) + 1231) * 31) + 1) * 31)));
        long j = r2.A02;
        return ((A05 + Constraints.A02(j)) * 31) + Constraints.A01(j);
    }

    public C113326rA(C115396uz r1) {
        this.A00 = r1;
    }
}
