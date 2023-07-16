package X;

/* renamed from: X.6rl  reason: invalid class name and case insensitive filesystem */
public final class C113586rl {
    public final String A00;
    public final String A01;

    public C113586rl(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C113586rl) {
                C113586rl r5 = (C113586rl) obj;
                if (!AnonymousClass3ZT.A03(this.A00, r5.A00) || !AnonymousClass3ZT.A03(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C86124wJ.A0E(this.A00) * 31) + AnonymousClass0wJ.A03(this.A01);
    }
}
