package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4To  reason: invalid class name */
public final class AnonymousClass4To implements Map, Serializable, C03740Kn {
    public static final AnonymousClass4To A00 = new AnonymousClass4To();

    public final boolean containsKey(Object obj) {
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final String toString() {
        return "{}";
    }

    public static AnonymousClass4To A00() {
        AnonymousClass4To r1 = A00;
        C04220Ms.A0C(r1, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return r1;
    }

    public final /* bridge */ Set entrySet() {
        return AnonymousClass84Y.A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Map) || !((Map) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ Set keySet() {
        return AnonymousClass84Y.A00;
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final /* bridge */ Collection values() {
        return AnonymousClass0ZV.A00;
    }

    public final void clear() {
        throw C18220wO.A0v();
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw C18220wO.A0v();
    }

    public final void putAll(Map map) {
        throw C18220wO.A0v();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        throw C18220wO.A0v();
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        return false;
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }
}
