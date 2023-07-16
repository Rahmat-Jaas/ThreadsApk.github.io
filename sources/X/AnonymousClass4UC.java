package X;

/* renamed from: X.4UC  reason: invalid class name */
public final class AnonymousClass4UC implements C04560Oe {
    public final C04560Oe A00;
    public volatile Object A01 = null;

    public final Object get() {
        if (this.A01 != null) {
            return this.A01;
        }
        synchronized (this) {
            if (this.A01 != null) {
                Object obj = this.A01;
                return obj;
            }
            this.A01 = this.A00.get();
            Object obj2 = this.A01;
            return obj2;
        }
    }

    public AnonymousClass4UC(C04560Oe r2) {
        this.A00 = r2;
    }
}
