package X;

import java.util.Arrays;

/* renamed from: X.4O0  reason: invalid class name */
public final class AnonymousClass4O0 implements Comparable {
    public final String A00;

    public AnonymousClass4O0() {
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{3, this.A00});
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        String str = this.A00;
        int length = str.length();
        String str2 = ((AnonymousClass4O0) obj).A00;
        int length2 = str2.length();
        if (length != length2) {
            return length - length2;
        }
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((AnonymousClass4O0) obj).A00);
    }

    public final String toString() {
        return AnonymousClass00U.A0V("\"", this.A00, "\"");
    }

    public AnonymousClass4O0(String str) {
        this.A00 = str;
    }
}
