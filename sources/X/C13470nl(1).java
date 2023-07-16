package X;

import java.util.Locale;

/* renamed from: X.0nl  reason: invalid class name and case insensitive filesystem */
public final class C13470nl implements Comparable {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C13470nl r5 = (C13470nl) obj;
            String str = this.A02;
            String str2 = r5.A02;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!this.A03.equals(r5.A03) || !this.A01.equals(r5.A01)) {
                return false;
            }
            String str3 = this.A00;
            String str4 = r5.A00;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (this.A05 != r5.A05) {
                return false;
            }
            String str5 = this.A04;
            String str6 = r5.A04;
            return str5 == null ? str6 == null : str5.equals(str6);
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C13470nl r3 = (C13470nl) obj;
        int compareTo = this.A03.compareTo(r3.A03);
        if (compareTo == 0) {
            return this.A01.compareTo(r3.A01);
        }
        return compareTo;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.A02;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode = ((((i * 31) + this.A03.hashCode()) * 31) + this.A01.hashCode()) * 31;
        String str2 = this.A00;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (hashCode + i2) * 31;
        String str3 = this.A04;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return ((i4 + i3) * 31) + (this.A05 ? 1 : 0);
    }

    public final String toString() {
        return String.format(Locale.US, "[name: %s, hash: %s, id: %s, downloadUri: %s, path: %s, disabled: %b]", new Object[]{this.A03, this.A01, this.A02, this.A00, this.A04, Boolean.valueOf(this.A05)});
    }

    public C13470nl(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = str4;
        this.A04 = str5;
        this.A05 = z;
    }
}
