package X;

import java.util.List;

/* renamed from: X.1pO  reason: invalid class name */
public final class AnonymousClass1pO extends AnonymousClass2OB {
    public final List A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1pO) {
                AnonymousClass1pO r5 = (AnonymousClass1pO) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A04 = C18210wN.A04(this.A00);
        boolean z = this.A01;
        if (z) {
            z = true;
        }
        return A04 + (z ? 1 : 0);
    }

    public AnonymousClass1pO(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }
}
