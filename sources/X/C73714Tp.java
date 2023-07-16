package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4Tp  reason: invalid class name and case insensitive filesystem */
public final class C73714Tp implements Map, C03740Kn, AnonymousClass0WC {
    public final Map A00;
    public final AnonymousClass0YY A01;

    public final void putAll(Map map) {
        C04220Ms.A0B(map, 0);
        this.A00.putAll(map);
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean containsKey(Object obj) {
        return this.A00.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.A00.containsValue(obj);
    }

    public final /* bridge */ Set entrySet() {
        return this.A00.entrySet();
    }

    public final boolean equals(Object obj) {
        return this.A00.equals(obj);
    }

    public final Object get(Object obj) {
        return this.A00.get(obj);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final /* bridge */ Set keySet() {
        return this.A00.keySet();
    }

    public final Object put(Object obj, Object obj2) {
        return this.A00.put(obj, obj2);
    }

    public final Object remove(Object obj) {
        return this.A00.remove(obj);
    }

    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public final /* bridge */ Collection values() {
        return this.A00.values();
    }

    public C73714Tp(Map map, AnonymousClass0YY r2) {
        this.A00 = map;
        this.A01 = r2;
    }
}
