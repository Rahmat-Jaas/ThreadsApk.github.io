package X;

import java.util.List;

/* renamed from: X.18M  reason: invalid class name */
public final class AnonymousClass18M extends AnonymousClass0Sf implements C21543Bw7 {
    public final Integer A00;
    public final List A01;

    public final AnonymousClass18M Cxi(C112176p7 r1) {
        return this;
    }

    public final AnonymousClass18M Cxj(C144028hi r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18M) {
                AnonymousClass18M r5 = (AnonymousClass18M) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A03(this.A00) * 31) + C18200wM.A07(this.A01);
    }

    public AnonymousClass18M(Integer num, List list) {
        this.A00 = num;
        this.A01 = list;
    }
}
