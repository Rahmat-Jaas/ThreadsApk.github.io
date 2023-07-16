package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.3Hz  reason: invalid class name and case insensitive filesystem */
public final class C58913Hz {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C58913Hz)) {
                return false;
            }
            C58913Hz r4 = (C58913Hz) obj;
            if (!(this.A01 == r4.A01 && this.A00 == r4.A00)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        String format = String.format((Locale) null, "%dx%d", Arrays.copyOf(C18210wN.A1Y(Integer.valueOf(this.A01), this.A00), 2));
        C04220Ms.A06(format);
        return format;
    }

    public final int hashCode() {
        return ((this.A01 + 31) * 31) + this.A00;
    }

    public /* synthetic */ C58913Hz(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
