package X;

/* renamed from: X.5uo  reason: invalid class name and case insensitive filesystem */
public final class C94375uo extends AnonymousClass6LP {
    public final C171209wF A00;
    public final String A01;

    public C94375uo(C171209wF r2, String str) {
        C04220Ms.A0B(r2, 2);
        this.A01 = str;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C94375uo) {
                C94375uo r5 = (C94375uo) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, C18180wK.A03(this.A01));
    }
}
