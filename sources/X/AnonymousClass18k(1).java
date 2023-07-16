package X;

import java.util.List;

/* renamed from: X.18k  reason: invalid class name */
public final class AnonymousClass18k extends AnonymousClass0Sf implements C82144p9 {
    public final C210018l A00;
    public final String A01;
    public final List A02;

    public AnonymousClass18k(C210018l r2, String str, List list) {
        C04220Ms.A0B(str, 2);
        this.A02 = list;
        this.A01 = str;
        this.A00 = r2;
    }

    public final AnonymousClass18k D2d(C112176p7 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18k) {
                AnonymousClass18k r5 = (AnonymousClass18k) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A07(this.A01, AnonymousClass0wJ.A03(this.A02) * 31) + C18200wM.A07(this.A00);
    }
}
