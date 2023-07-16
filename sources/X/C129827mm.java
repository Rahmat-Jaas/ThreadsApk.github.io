package X;

/* renamed from: X.7mm  reason: invalid class name and case insensitive filesystem */
public final class C129827mm implements C143928hX, C143918hW {
    public static final Object A02 = C86144wL.A0d();
    public volatile C143928hX A00;
    public volatile Object A01 = A02;

    public C129827mm(C143928hX r2) {
        this.A00 = r2;
    }

    public final Object DBu() {
        Object obj;
        Object obj2 = this.A01;
        Object obj3 = A02;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A01;
            if (obj == obj3) {
                obj = this.A00.DBu();
                Object obj4 = this.A01;
                if (obj4 == obj3 || obj4 == obj) {
                    this.A01 = obj;
                    this.A00 = null;
                } else {
                    String valueOf = String.valueOf(obj4);
                    String valueOf2 = String.valueOf(obj);
                    StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(valueOf) + 118 + C86104wH.A0A(valueOf2));
                    A0s.append("Scoped provider was invoked recursively returning different results: ");
                    A0s.append(valueOf);
                    A0s.append(" & ");
                    A0s.append(valueOf2);
                    throw C18180wK.A0a(C18180wK.A0i(C18170wI.A00(243), A0s));
                }
            }
        }
        return obj;
    }
}
