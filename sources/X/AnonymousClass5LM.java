package X;

import java.util.List;

/* renamed from: X.5LM  reason: invalid class name */
public final class AnonymousClass5LM extends AnonymousClass0Sf implements C142268ea {
    public final List A00;
    public final boolean A01;

    public AnonymousClass5LM(List list, boolean z) {
        C04220Ms.A0B(list, 1);
        this.A00 = list;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5LM) {
                AnonymousClass5LM r5 = (AnonymousClass5LM) obj;
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
}
