package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2;
import java.util.List;

/* renamed from: X.5HY  reason: invalid class name */
public final class AnonymousClass5HY extends AnonymousClass0Sf {
    public final KtCSuperShape0S1100000_I2 A00;
    public final C157389Rz A01;
    public final List A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;

    public AnonymousClass5HY(KtCSuperShape0S1100000_I2 ktCSuperShape0S1100000_I2, C157389Rz r3, List list, List list2, boolean z, boolean z2) {
        C04220Ms.A0B(r3, 3);
        this.A02 = list;
        this.A03 = list2;
        this.A01 = r3;
        this.A00 = ktCSuperShape0S1100000_I2;
        this.A05 = z;
        this.A04 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5HY) {
                AnonymousClass5HY r5 = (AnonymousClass5HY) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || this.A05 != r5.A05 || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A052 = (AnonymousClass0wJ.A05(this.A01, AnonymousClass0wJ.A05(this.A03, C18210wN.A04(this.A02))) + AnonymousClass0wJ.A03(this.A00)) * 31;
        boolean z = this.A05;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A052 + (z ? 1 : 0)) * 31;
        if (!this.A04) {
            i = 0;
        }
        return i2 + i;
    }
}
