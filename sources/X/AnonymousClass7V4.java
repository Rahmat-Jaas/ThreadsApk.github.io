package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.7V4  reason: invalid class name */
public final class AnonymousClass7V4 implements C142748fW, C147278p5 {
    public final long A00;
    public final C147168nV A01;
    public final /* synthetic */ AnonymousClass7V3 A02 = AnonymousClass7V3.A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7V4) {
                AnonymousClass7V4 r8 = (AnonymousClass7V4) obj;
                if (!C04220Ms.A0I(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A04(this.A01) + C18190wL.A02(this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("BoxWithConstraintsScopeImpl(density=");
        A0s.append(this.A01);
        A0s.append(", constraints=");
        return C86104wH.A0y(Constraints.A06(this.A00), A0s);
    }

    public AnonymousClass7V4(C147168nV r2, long j) {
        this.A01 = r2;
        this.A00 = j;
    }

    public final Modifier A86(Alignment alignment, Modifier modifier) {
        AnonymousClass0wJ.A1N(modifier, alignment);
        return this.A02.A86(alignment, modifier);
    }
}
