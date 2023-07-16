package X;

import java.util.List;

/* renamed from: X.5Kl  reason: invalid class name and case insensitive filesystem */
public final class C90085Kl extends AnonymousClass0Sf implements C21146Bpb {
    public final Integer A00;
    public final List A01;
    public final List A02;

    public final C90085Kl Cz0() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90085Kl) {
                C90085Kl r5 = (C90085Kl) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass0wJ.A03(this.A01) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + C18200wM.A07(this.A00);
    }

    public C90085Kl(Integer num, List list, List list2) {
        this.A01 = list;
        this.A02 = list2;
        this.A00 = num;
    }
}
