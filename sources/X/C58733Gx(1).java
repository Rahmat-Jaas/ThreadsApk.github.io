package X;

import java.util.Arrays;

/* renamed from: X.3Gx  reason: invalid class name and case insensitive filesystem */
public final class C58733Gx {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18190wL.A1Y(this, obj)) {
                return false;
            }
            C58733Gx r4 = (C58733Gx) obj;
            if (!C04220Ms.A0I(this.A00, r4.A00) || !C04220Ms.A0I(this.A01, r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public C58733Gx(String str, String str2) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
