package X;

import java.util.List;

/* renamed from: X.18U  reason: invalid class name */
public final class AnonymousClass18U extends AnonymousClass0Sf implements C21544Bw8 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final AnonymousClass18U CzL(C112176p7 r1) {
        return this;
    }

    public final AnonymousClass18U CzM(C144028hi r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18U) {
                AnonymousClass18U r5 = (AnonymousClass18U) obj;
                if (!C04220Ms.A0I(this.A03, r5.A03) || this.A00 != r5.A00 || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A02, AnonymousClass0wJ.A07(this.A01, ((AnonymousClass0wJ.A03(this.A03) * 31) + this.A00) * 31));
    }

    public AnonymousClass18U(String str, String str2, List list, int i) {
        AnonymousClass0wJ.A1R(str, str2);
        this.A03 = list;
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }
}
