package X;

import java.util.List;

/* renamed from: X.18l  reason: invalid class name and case insensitive filesystem */
public final class C210018l extends AnonymousClass0Sf implements C82154pA {
    public final BKU A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final C210018l D2e(C112176p7 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C210018l) {
                C210018l r5 = (C210018l) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass0wJ.A06(this.A01) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + C18200wM.A09(this.A02);
    }

    public C210018l(BKU bku, String str, String str2, List list) {
        this.A01 = str;
        this.A00 = bku;
        this.A03 = list;
        this.A02 = str2;
    }
}
