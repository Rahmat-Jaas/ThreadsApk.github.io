package X;

/* renamed from: X.5Mm  reason: invalid class name and case insensitive filesystem */
public final class C90565Mm extends AnonymousClass0Sf implements C144788jH {
    public final Integer A00;
    public final String A01;
    public final String A02;

    public final C90565Mm D52() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90565Mm) {
                C90565Mm r5 = (C90565Mm) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A02, AnonymousClass0wJ.A07(this.A01, AnonymousClass0wJ.A03(this.A00) * 31));
    }

    public C90565Mm(String str, Integer num, String str2) {
        AnonymousClass0wJ.A1Q(str, str2);
        this.A00 = num;
        this.A01 = str;
        this.A02 = str2;
    }
}
