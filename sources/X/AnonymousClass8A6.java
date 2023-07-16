package X;

import java.util.Set;

/* renamed from: X.8A6  reason: invalid class name */
public abstract class AnonymousClass8A6<E> extends AnonymousClass83X<E> implements Set<E>, C03740Kn {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        boolean A1V = C18210wN.A1V(set);
        if (size() == set.size()) {
            return containsAll(set);
        }
        return A1V;
    }

    public final int hashCode() {
        int i = 0;
        for (Object A05 : this) {
            i += C18230wP.A05(A05);
        }
        return i;
    }
}
