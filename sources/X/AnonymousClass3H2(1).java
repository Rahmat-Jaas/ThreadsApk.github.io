package X;

import java.util.Arrays;

/* renamed from: X.3H2  reason: invalid class name */
public final class AnonymousClass3H2 {
    public final C62273Yb A00;
    public final AnonymousClass3VA A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass3H2)) {
            return false;
        }
        AnonymousClass3H2 r4 = (AnonymousClass3H2) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A01, this.A00});
    }

    public AnonymousClass3H2(C62273Yb r1, AnonymousClass3VA r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
