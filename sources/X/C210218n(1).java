package X;

/* renamed from: X.18n  reason: invalid class name and case insensitive filesystem */
public final class C210218n extends AnonymousClass0Sf implements AnonymousClass8iO {
    public final Float A00;
    public final Integer A01;
    public final String A02;

    public final C210218n D2o() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C210218n) {
                C210218n r5 = (C210218n) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass0wJ.A03(this.A01) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A09(this.A02);
    }

    public C210218n(Float f, Integer num, String str) {
        this.A01 = num;
        this.A00 = f;
        this.A02 = str;
    }
}
