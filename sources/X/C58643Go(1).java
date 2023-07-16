package X;

import java.util.Arrays;

/* renamed from: X.3Go  reason: invalid class name and case insensitive filesystem */
public final class C58643Go {
    public final String A00;
    public final Object[] A01;

    public C58643Go(String str, Object[] objArr) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
        this.A01 = objArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18190wL.A1Y(this, obj)) {
                return false;
            }
            C58643Go r4 = (C58643Go) obj;
            if (!C04220Ms.A0I(this.A00, r4.A00) || !Arrays.equals(this.A01, r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return C18180wK.A03(this.A00) + Arrays.hashCode(this.A01);
    }
}
