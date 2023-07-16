package X;

import java.util.Arrays;

/* renamed from: X.3VA  reason: invalid class name */
public final class AnonymousClass3VA {
    public String A00;
    public AnonymousClass3VD A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass3VA)) {
            return false;
        }
        AnonymousClass3VA r4 = (AnonymousClass3VA) obj;
        if (!this.A01.equals(r4.A01) || !this.A00.equals(r4.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A01, this.A00});
    }

    public AnonymousClass3VA(String str, AnonymousClass3VD r2) {
        this.A01 = r2;
        this.A00 = str;
    }

    public AnonymousClass3VA() {
        this.A01 = new AnonymousClass3VD();
        this.A00 = "";
    }
}
