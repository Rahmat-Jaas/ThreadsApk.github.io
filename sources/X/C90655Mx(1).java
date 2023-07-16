package X;

/* renamed from: X.5Mx  reason: invalid class name and case insensitive filesystem */
public final class C90655Mx extends AnonymousClass0Sf implements C28032ExM {
    public final int A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90655Mx) {
                C90655Mx r5 = (C90655Mx) obj;
                if (this.A00 != r5.A00 || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + AnonymousClass0wJ.A03(this.A01);
    }

    public C90655Mx(Integer num, int i) {
        this.A00 = i;
        this.A01 = num;
    }
}
