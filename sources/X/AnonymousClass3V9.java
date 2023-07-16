package X;

import java.util.Arrays;

/* renamed from: X.3V9  reason: invalid class name */
public final class AnonymousClass3V9 {
    public int A00 = -16777216;
    public String A01 = "";

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AnonymousClass3V9)) {
            return false;
        }
        AnonymousClass3V9 r4 = (AnonymousClass3V9) obj;
        String str = this.A01;
        String str2 = r4.A01;
        if (str != str2 && (str == null || !str.equals(str2))) {
            return false;
        }
        Integer valueOf = Integer.valueOf(this.A00);
        Integer valueOf2 = Integer.valueOf(r4.A00);
        return valueOf == valueOf2 || (valueOf != null && valueOf.equals(valueOf2));
    }

    public final int hashCode() {
        return Arrays.hashCode(C18210wN.A1Y(this.A01, this.A00));
    }

    public AnonymousClass3V9(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public AnonymousClass3V9() {
    }
}
