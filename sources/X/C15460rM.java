package X;

import java.io.Serializable;

/* renamed from: X.0rM  reason: invalid class name and case insensitive filesystem */
public final class C15460rM implements Serializable {
    public String A00;
    public String A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15460rM)) {
            return false;
        }
        C15460rM r4 = (C15460rM) obj;
        String str = this.A01;
        String str2 = r4.A01;
        if (str != null && str2 != null) {
            return str.equals(str2);
        }
        String str3 = this.A00;
        String str4 = r4.A00;
        if (str3 == null || str4 == null || !str3.equals(str4)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        if (str == null) {
            str = this.A00;
        }
        return str.hashCode();
    }

    public C15460rM(String str, String str2) {
        if (str == null) {
            throw new SecurityException("Must provide SHA1 key hash.");
        } else if (str.length() == 27) {
            this.A00 = str;
            if (str2 == null) {
                return;
            }
            if (str2.length() == 43) {
                this.A01 = str2;
                return;
            }
            throw new SecurityException("Invalid SHA256 key hash - should be 256-bit.");
        } else {
            throw new SecurityException("Invalid SHA1 key hash - should be 160-bit.");
        }
    }
}
