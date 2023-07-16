package X;

/* renamed from: X.6th  reason: invalid class name and case insensitive filesystem */
public final class C114666th {
    public final Object A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C114666th r5 = (C114666th) obj;
            if (this.A01 == r5.A01) {
                Object obj2 = this.A00;
                Object obj3 = r5.A00;
                if (obj2 != null) {
                    return obj2.equals(obj3);
                }
                return obj3 == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.A01 ? 1 : 0) * true) + C18230wP.A05(this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("GeneratorValue{done=");
        A0s.append(this.A01);
        A0s.append(", value=");
        A0s.append(this.A00);
        return C18190wL.A0o(A0s);
    }

    public C114666th(boolean z, Object obj) {
        this.A01 = z;
        this.A00 = obj;
    }
}
