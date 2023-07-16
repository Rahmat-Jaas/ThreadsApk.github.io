package X;

/* renamed from: X.7oM  reason: invalid class name */
public final class AnonymousClass7oM implements C143998hf {
    public static final Object A02 = C86144wL.A0d();
    public volatile C143998hf A00;
    public volatile Object A01 = A02;

    public final Object get() {
        Object obj;
        Object obj2 = this.A01;
        Object obj3 = A02;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A01;
            if (obj == obj3) {
                obj = this.A00.get();
                this.A01 = obj;
                this.A00 = null;
            }
        }
        return obj;
    }

    public AnonymousClass7oM(C143998hf r2) {
        this.A00 = r2;
    }
}
