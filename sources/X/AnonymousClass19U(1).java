package X;

import java.util.List;

/* renamed from: X.19U  reason: invalid class name */
public final class AnonymousClass19U extends AnonymousClass0Sf implements C84224sl {
    public final String A00;
    public final List A01;

    public final AnonymousClass19U D7E() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass19U) {
                AnonymousClass19U r5 = (AnonymousClass19U) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List Afx() {
        return this.A01;
    }

    public final String B5p() {
        return this.A00;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A00, C18210wN.A04(this.A01));
    }

    public AnonymousClass19U(List list, String str) {
        AnonymousClass0wJ.A1O(list, str);
        this.A01 = list;
        this.A00 = str;
    }
}
