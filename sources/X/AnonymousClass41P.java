package X;

import java.io.Serializable;

/* renamed from: X.41P  reason: invalid class name */
public final class AnonymousClass41P implements C41836MeS, Serializable {
    public final Object A00 = Object.class;

    public final boolean apply(Object obj) {
        return Object.class.equals(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass41P)) {
            return false;
        }
        Class<Object> cls = Object.class;
        return cls.equals(cls);
    }

    public final int hashCode() {
        return Object.class.hashCode();
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Predicates.equalTo(");
        A0s.append(Object.class);
        return C18180wK.A0i(")", A0s);
    }
}
