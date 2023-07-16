package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.06f  reason: invalid class name and case insensitive filesystem */
public final class C013306f<K, V> extends C002000x<K, V> implements Map<K, V> {
    public C000600h A00;
    public C000700i A01;
    public C000900k A02;

    public final boolean A09(Collection collection) {
        int i = this.A01;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.A02[i2 << 1])) {
                A06(i2);
            }
        }
        if (i == this.A01) {
            return false;
        }
        return true;
    }

    public final Set entrySet() {
        C000600h r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C000600h r02 = new C000600h(this);
        this.A00 = r02;
        return r02;
    }

    public final Set keySet() {
        C000700i r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C000700i r02 = new C000700i(this);
        this.A01 = r02;
        return r02;
    }

    public final void putAll(Map map) {
        A07(this.A01 + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Collection values() {
        C000900k r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C000900k r02 = new C000900k(this);
        this.A02 = r02;
        return r02;
    }

    public C013306f(C002000x r1) {
        A08(r1);
    }

    public C013306f(int i) {
        super(i);
    }

    public C013306f() {
    }
}
