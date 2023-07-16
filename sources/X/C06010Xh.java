package X;

/* renamed from: X.0Xh  reason: invalid class name and case insensitive filesystem */
public abstract class C06010Xh implements C04560Oe {
    public Object A00;

    public abstract Object A00();

    public final synchronized Object get() {
        Object obj;
        obj = this.A00;
        if (obj == null) {
            obj = A00();
            this.A00 = obj;
        }
        return obj;
    }
}
