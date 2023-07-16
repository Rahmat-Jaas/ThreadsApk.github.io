package X;

/* renamed from: X.18N  reason: invalid class name */
public final class AnonymousClass18N extends AnonymousClass0Sf implements C83344rE {
    public final Integer A00;
    public final String A01;

    public final AnonymousClass18N CyO() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18N) {
                AnonymousClass18N r5 = (AnonymousClass18N) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BKC() {
        return this.A01;
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A03(this.A00) * 31) + C18200wM.A09(this.A01);
    }

    public AnonymousClass18N(Integer num, String str) {
        this.A00 = num;
        this.A01 = str;
    }
}
