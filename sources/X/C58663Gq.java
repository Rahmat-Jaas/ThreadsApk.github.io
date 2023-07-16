package X;

import java.util.Arrays;

/* renamed from: X.3Gq  reason: invalid class name and case insensitive filesystem */
public final class C58663Gq {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C58663Gq r5 = (C58663Gq) obj;
            if (this.A00 != r5.A00 || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(C18210wN.A1Y(this.A01, this.A00));
    }

    public C58663Gq(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
