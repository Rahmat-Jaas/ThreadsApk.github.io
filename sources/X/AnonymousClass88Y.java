package X;

/* renamed from: X.88Y  reason: invalid class name */
public final class AnonymousClass88Y extends RuntimeException {
    public final Integer A00;
    public final Throwable A01;

    public final Throwable getCause() {
        return this.A01;
    }

    public AnonymousClass88Y(Integer num, Throwable th) {
        super(th);
        this.A00 = num;
        this.A01 = th;
    }
}
