package X;

/* renamed from: X.7EC  reason: invalid class name */
public final class AnonymousClass7EC {
    public final Integer A00;
    public final Object A01;
    public final Throwable A02;

    public static AnonymousClass7EC A01(Throwable th) {
        return new AnonymousClass7EC((Integer) null, (Object) null, th);
    }

    public static AnonymousClass7EC A00(Object obj) {
        return new AnonymousClass7EC(AnonymousClass006.A00, obj, (Throwable) null);
    }

    public final AnonymousClass7Kx A02() {
        Throwable th = this.A02;
        Object obj = this.A01;
        if (th == null) {
            return AnonymousClass7Kx.A0A(obj);
        }
        return AnonymousClass7Kx.A0B(obj, th);
    }

    public AnonymousClass7EC(Integer num, Object obj, Throwable th) {
        this.A01 = obj;
        this.A02 = th;
        this.A00 = num;
    }
}
