package X;

/* renamed from: X.6rc  reason: invalid class name and case insensitive filesystem */
public final class C113556rc {
    public String A00;
    public String A01;

    public final boolean equals(Object obj) {
        if (obj instanceof C113556rc) {
            C113556rc r3 = (C113556rc) obj;
            if (!r3.A00.equals(this.A00) || !r3.A01.equals(this.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, C18180wK.A03(this.A00));
    }

    public C113556rc(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
