package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5qa  reason: invalid class name and case insensitive filesystem */
public final class C93635qa extends C93645qb {
    public final transient int A00;
    public final transient AnonymousClass84U A01;
    public final transient Object[] A02;

    public final int size() {
        return this.A00;
    }

    public final AnonymousClass5qX A07() {
        return new AnonymousClass5qT(this);
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.A01.get(key))) {
            return false;
        }
        return true;
    }

    public C93635qa(AnonymousClass84U r1, Object[] objArr, int i) {
        this.A01 = r1;
        this.A02 = objArr;
        this.A00 = i;
    }

    public final int A06(Object[] objArr, int i) {
        return A08().A06(objArr, 0);
    }

    public final /* synthetic */ Iterator iterator() {
        return A08().listIterator(0);
    }
}
