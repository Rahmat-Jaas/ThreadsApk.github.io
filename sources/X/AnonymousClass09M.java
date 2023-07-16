package X;

import java.util.Locale;

/* renamed from: X.09M  reason: invalid class name */
public final class AnonymousClass09M {
    public final long A00;
    public final String A01;

    public final String toString() {
        return String.format(Locale.US, "[%d] %s", new Object[]{Long.valueOf(this.A00), this.A01});
    }

    public AnonymousClass09M(String str, long j) {
        this.A01 = str;
        this.A00 = j;
    }
}
