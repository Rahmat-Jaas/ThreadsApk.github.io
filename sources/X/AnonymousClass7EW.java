package X;

/* renamed from: X.7EW  reason: invalid class name */
public final class AnonymousClass7EW {
    public String A00;
    public String A01;
    public boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass7EW r5 = (AnonymousClass7EW) obj;
            if (this.A02 != r5.A02 || !this.A01.equals(r5.A01) || !C98336Fc.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public static AnonymousClass7EW A00(C127397h3 r4) {
        return new AnonymousClass7EW(r4.A0O(38, ""), r4.A0O(36, ""), AnonymousClass2LL.A00(C127397h3.A0A(r4, 35), false));
    }

    public final int hashCode() {
        return C86124wJ.A0I(this.A01, this.A00, Boolean.valueOf(this.A02));
    }

    public AnonymousClass7EW(String str, String str2, boolean z) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = z;
    }

    public AnonymousClass7EW() {
    }
}
