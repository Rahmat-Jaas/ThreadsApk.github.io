package X;

/* renamed from: X.3XX  reason: invalid class name */
public final class AnonymousClass3XX {
    public final Object A00;
    public final Throwable A01;

    public AnonymousClass3XX(Object obj) {
        this.A00 = obj;
        this.A01 = null;
    }

    public static AnonymousClass3XX A00(Throwable th) {
        th.getClass();
        return new AnonymousClass3XX(th);
    }

    public AnonymousClass3XX(Throwable th) {
        this.A00 = null;
        this.A01 = th;
    }
}
