package X;

/* renamed from: X.6tn  reason: invalid class name and case insensitive filesystem */
public final class C114726tn {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114726tn) {
                C114726tn r5 = (C114726tn) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass00U.A0e("ProductConfigKey(productId=", this.A00, ", receiverId=", this.A01, ')');
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, C18180wK.A03(this.A00));
    }

    public C114726tn(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
