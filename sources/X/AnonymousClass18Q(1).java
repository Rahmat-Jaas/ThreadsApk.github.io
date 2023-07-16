package X;

import java.util.List;

/* renamed from: X.18Q  reason: invalid class name */
public final class AnonymousClass18Q extends AnonymousClass0Sf implements C82064p1 {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final AnonymousClass18Q Cyk(C112176p7 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18Q) {
                AnonymousClass18Q r5 = (AnonymousClass18Q) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass0wJ.A06(this.A01) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + C18200wM.A07(this.A03);
    }

    public AnonymousClass18Q(Boolean bool, String str, String str2, List list) {
        this.A01 = str;
        this.A00 = bool;
        this.A02 = str2;
        this.A03 = list;
    }
}
