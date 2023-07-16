package X;

/* renamed from: X.5L4  reason: invalid class name */
public final class AnonymousClass5L4 extends AnonymousClass0Sf implements C144338iD {
    public final int A00;
    public final String A01;

    public AnonymousClass5L4(int i, String str) {
        C04220Ms.A0B(str, 2);
        this.A00 = i;
        this.A01 = str;
    }

    public final AnonymousClass5L4 D0h() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5L4) {
                AnonymousClass5L4 r5 = (AnonymousClass5L4) obj;
                if (this.A00 != r5.A00 || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, this.A00 * 31);
    }
}
