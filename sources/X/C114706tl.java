package X;

/* renamed from: X.6tl  reason: invalid class name and case insensitive filesystem */
public final class C114706tl {
    public final String A00;
    public final String A01;

    public C114706tl(String str, String str2) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114706tl) {
                C114706tl r5 = (C114706tl) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass00U.A0e("ECPInitDataKey(productId=", this.A00, ", receiverId=", this.A01, ')');
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, C18180wK.A03(this.A00));
    }
}
