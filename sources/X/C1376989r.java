package X;

import java.util.HashSet;

/* renamed from: X.89r  reason: invalid class name and case insensitive filesystem */
public final class C1376989r extends HashSet<String> {
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return super.contains(obj);
        }
        return false;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return super.remove(obj);
        }
        return false;
    }

    public C1376989r() {
        add(C18170wI.A00(1064));
    }

    public final /* bridge */ int size() {
        return super.size();
    }
}
