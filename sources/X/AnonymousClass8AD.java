package X;

import java.util.Collection;

/* renamed from: X.8AD  reason: invalid class name */
public abstract class AnonymousClass8AD<E> extends AnonymousClass8AJ<E> implements C147378pF<E> {
    public final C147378pF CbO(Collection collection) {
        return CbP(C86154wM.A10(collection, 7));
    }

    public final C147378pF CbG(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf != -1) {
            return CbV(indexOf);
        }
        return this;
    }

    public final boolean contains(Object obj) {
        return C86114wI.A1T(indexOf(obj), -1);
    }
}
