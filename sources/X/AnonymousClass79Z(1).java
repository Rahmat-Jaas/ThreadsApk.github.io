package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.79Z  reason: invalid class name */
public final class AnonymousClass79Z {
    public final AnonymousClass7X6 A00;
    public final AnonymousClass7X6 A01;
    public final AnonymousClass7X6 A02;

    public AnonymousClass79Z() {
        this((AnonymousClass7X6) null, (AnonymousClass7X6) null, (AnonymousClass7X6) null, (DefaultConstructorMarker) null, 7);
    }

    public /* synthetic */ AnonymousClass79Z(AnonymousClass7X6 r4, AnonymousClass7X6 r5, AnonymousClass7X6 r6, DefaultConstructorMarker defaultConstructorMarker, int i) {
        float f = (float) 4;
        C874352s A002 = AnonymousClass7G5.A00(f);
        C874352s A003 = AnonymousClass7G5.A00(f);
        C874352s A004 = AnonymousClass7G5.A00((float) 0);
        this.A02 = A002;
        this.A01 = A003;
        this.A00 = A004;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass79Z) {
                AnonymousClass79Z r5 = (AnonymousClass79Z) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, AnonymousClass0wJ.A05(this.A01, C18210wN.A04(this.A02)));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Shapes(small=");
        A0s.append(this.A02);
        A0s.append(", medium=");
        A0s.append(this.A01);
        A0s.append(", large=");
        return C86104wH.A0y(this.A00, A0s);
    }
}
