package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.00h  reason: invalid class name and case insensitive filesystem */
public final class C000600h extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ C013306f A00;

    public C000600h(C013306f r1) {
        this.A00 = r1;
    }

    public final Iterator iterator() {
        return new C000800j(this.A00);
    }

    public final int size() {
        return this.A00.A01;
    }
}
