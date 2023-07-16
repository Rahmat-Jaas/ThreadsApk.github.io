package X;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.89P  reason: invalid class name */
public abstract class AnonymousClass89P<K, V> extends AbstractMap<K, V> implements Map<K, V>, AnonymousClass0WC {
    public abstract /* bridge */ int A01();

    public abstract /* bridge */ Collection A02();

    public abstract Set A03();

    public abstract /* bridge */ Set A04();

    public abstract Object put(Object obj, Object obj2);

    public static C41627MVz A00(Object obj) {
        C04220Ms.A0A(obj);
        return new C41627MVz((C41622MVu) obj);
    }

    public final /* bridge */ Set entrySet() {
        return A03();
    }

    public final /* bridge */ Set keySet() {
        return A04();
    }

    public final /* bridge */ int size() {
        return A01();
    }

    public final /* bridge */ Collection values() {
        return A02();
    }
}
