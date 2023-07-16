package X;

/* renamed from: X.7n3  reason: invalid class name */
public final class AnonymousClass7n3 implements C143968hb {
    public static final Object A02 = C86144wL.A0d();
    public volatile C143968hb A00;
    public volatile Object A01 = A02;

    public AnonymousClass7n3(C143968hb r2) {
        this.A00 = r2;
    }

    public final Object A4t() {
        Object obj;
        Object obj2 = this.A01;
        Object obj3 = A02;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A01;
            if (obj == obj3) {
                obj = this.A00.A4t();
                Object obj4 = this.A01;
                if (obj4 == obj3 || obj4 == obj) {
                    this.A01 = obj;
                    this.A00 = null;
                } else {
                    StringBuilder A0r = C18200wM.A0r();
                    A0r.append("Scoped provider was invoked recursively returning different results: ");
                    A0r.append(obj4);
                    A0r.append(" & ");
                    A0r.append(obj);
                    throw C18180wK.A0a(C18180wK.A0i(C18170wI.A00(243), A0r));
                }
            }
        }
        return obj;
    }
}
