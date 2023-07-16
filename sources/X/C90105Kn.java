package X;

/* renamed from: X.5Kn  reason: invalid class name and case insensitive filesystem */
public final class C90105Kn extends AnonymousClass0Sf implements C144218i1 {
    public final Integer A00;
    public final Integer A01;
    public final String A02;

    public final C90105Kn Cz2() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90105Kn) {
                C90105Kn r5 = (C90105Kn) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass0wJ.A03(this.A00) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + C18200wM.A09(this.A02);
    }

    public C90105Kn(Integer num, Integer num2, String str) {
        this.A00 = num;
        this.A01 = num2;
        this.A02 = str;
    }
}
