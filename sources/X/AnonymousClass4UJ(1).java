package X;

/* renamed from: X.4UJ  reason: invalid class name */
public final class AnonymousClass4UJ implements C04560Oe {
    public volatile Object A00;
    public volatile C04560Oe A01;
    public volatile boolean A02 = false;

    public final Object get() {
        Object obj;
        Object obj2 = this.A00;
        if (this.A02) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A00;
            if (!this.A02) {
                obj = this.A01.get();
                Object obj3 = this.A00;
                if (obj3 == null || obj3 == obj) {
                    this.A00 = obj;
                    this.A02 = true;
                    this.A01 = null;
                } else {
                    StringBuilder A0r = C18200wM.A0r();
                    A0r.append("Provider was invoked recursively returning different results: ");
                    A0r.append(obj3);
                    A0r.append(" & ");
                    A0r.append(obj);
                    throw C18180wK.A0a(C18180wK.A0i(". This is likely due to a circular dependency.", A0r));
                }
            }
        }
        return obj;
    }

    public AnonymousClass4UJ(C04560Oe r2) {
        this.A01 = r2;
    }

    public static C04560Oe A00(C04560Oe r1) {
        r1.getClass();
        if (r1 instanceof AnonymousClass4UJ) {
            return r1;
        }
        return new AnonymousClass4UJ(r1);
    }
}
