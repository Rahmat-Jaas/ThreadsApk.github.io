package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.6uQ  reason: invalid class name and case insensitive filesystem */
public final class C115056uQ {
    public final C147218oz A00;
    public final Alignment A01;
    public final AnonymousClass0YY A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115056uQ) {
                C115056uQ r5 = (C115056uQ) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A05 = AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A05(this.A02, C18210wN.A04(this.A01)));
        boolean z = this.A03;
        if (z) {
            z = true;
        }
        return A05 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ChangeSize(alignment=");
        A0s.append(this.A01);
        A0s.append(", size=");
        A0s.append(this.A02);
        A0s.append(", animationSpec=");
        A0s.append(this.A00);
        A0s.append(", clip=");
        A0s.append(this.A03);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C115056uQ(C147218oz r1, Alignment alignment, AnonymousClass0YY r3, boolean z) {
        this.A01 = alignment;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = z;
    }
}
