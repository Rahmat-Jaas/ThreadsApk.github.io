package X;

import com.facebook.pando.TreeJNI;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: X.1Pt  reason: invalid class name */
public final class AnonymousClass1Pt extends TreeJNI implements Map, C03740Kn {
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return hasFieldValue(C18210wN.A0f(obj));
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Long)) {
            return false;
        }
        ((Number) obj).longValue();
        throw C18240wQ.A0j();
    }

    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        throw C18210wN.A0W("get");
    }

    public final void clear() {
        throw C18220wO.A0v();
    }

    public final /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw C18220wO.A0v();
    }

    public final /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw C18220wO.A0v();
    }

    public final /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw C18220wO.A0v();
    }

    public final /* bridge */ Set entrySet() {
        throw C18240wQ.A0j();
    }

    public final boolean isEmpty() {
        throw C18240wQ.A0j();
    }

    public final /* bridge */ Set keySet() {
        throw C18240wQ.A0j();
    }

    public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw C18220wO.A0v();
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw C18220wO.A0v();
    }

    public final void putAll(Map map) {
        throw C18220wO.A0v();
    }

    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw C18220wO.A0v();
    }

    public final Object remove(Object obj) {
        throw C18220wO.A0v();
    }

    public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw C18220wO.A0v();
    }

    public final void replaceAll(BiFunction biFunction) {
        throw C18220wO.A0v();
    }

    public final /* bridge */ int size() {
        throw C18240wQ.A0j();
    }

    public final /* bridge */ Collection values() {
        throw C18240wQ.A0j();
    }

    public final boolean remove(Object obj, Object obj2) {
        throw C18220wO.A0v();
    }

    public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw C18220wO.A0v();
    }
}
