package X;

import java.io.Serializable;

/* renamed from: X.4Nm  reason: invalid class name and case insensitive filesystem */
public final class C72324Nm implements Serializable {
    public final int A00;
    public final Class A01;
    public final Class A02;
    public final Object A03;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C72324Nm r5 = (C72324Nm) obj;
            if (!(r5.A03.equals(this.A03) && r5.A02 == this.A02 && r5.A01 == this.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public C72324Nm(Class cls, Class cls2, Object obj) {
        this.A02 = cls;
        this.A01 = cls2;
        this.A03 = obj;
        int A05 = C18210wN.A05(cls.getName(), obj.hashCode());
        this.A00 = cls2 != null ? A05 ^ cls2.getName().hashCode() : A05;
    }
}
