package X;

/* renamed from: X.08W  reason: invalid class name */
public final class AnonymousClass08W extends Exception {
    public boolean A00;

    public AnonymousClass08W(String str) {
        super(str);
        this.A00 = true;
        this.A00 = false;
    }

    public final synchronized Throwable fillInStackTrace() {
        if (this.A00) {
            super.fillInStackTrace();
        }
        return this;
    }

    public AnonymousClass08W() {
        this.A00 = true;
    }
}
