package X;

/* renamed from: X.6ro  reason: invalid class name and case insensitive filesystem */
public final class C113616ro {
    public final AnonymousClass7A1 A00;
    public final C127397h3 A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C113616ro)) {
            return false;
        }
        C113616ro r4 = (C113616ro) obj;
        if (this.A01 != r4.A01 || !this.A00.equals(r4.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode() ^ this.A00.hashCode();
    }

    public C113616ro(AnonymousClass7A1 r1, C127397h3 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
