package X;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.84U  reason: invalid class name */
public abstract class AnonymousClass84U implements Map, Serializable {
    public transient AnonymousClass89B A00;
    public transient C93645qb A01;
    public transient C93645qb A02;

    public abstract AnonymousClass89B A03();

    public abstract C93645qb A04();

    public abstract C93645qb A05();

    public abstract Object get(Object obj);

    /* renamed from: A01 */
    public final AnonymousClass89B values() {
        AnonymousClass89B r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass89B A03 = A03();
        this.A00 = A03;
        return A03;
    }

    /* renamed from: A02 */
    public final C93645qb entrySet() {
        C93645qb r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C93645qb A04 = A04();
        this.A01 = A04;
        return A04;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        C93645qb r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C93645qb A05 = A05();
        this.A02 = A05;
        return A05;
    }

    public final void clear() {
        throw C18240wQ.A0j();
    }

    public final boolean containsKey(Object obj) {
        return AnonymousClass0wJ.A1W(get(obj));
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    public final int hashCode() {
        return AnonymousClass6J4.A00(entrySet());
    }

    public final boolean isEmpty() {
        return C18180wK.A1W(size());
    }

    public final Object put(Object obj, Object obj2) {
        throw C18240wQ.A0j();
    }

    public final void putAll(Map map) {
        throw C18240wQ.A0j();
    }

    public final Object remove(Object obj) {
        throw C18240wQ.A0j();
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder A0s = C86114wI.A0s((int) Math.min(((long) size) * 8, 1073741824));
            A0s.append('{');
            Iterator it = entrySet().iterator();
            boolean z = true;
            while (it.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(it);
                if (!z) {
                    C86144wL.A1T(A0s);
                }
                A0s.append(A0o.getKey());
                A0s.append('=');
                A0s.append(A0o.getValue());
                z = false;
            }
            return C18190wL.A0o(A0s);
        }
        throw C18190wL.A0a(AnonymousClass00U.A0J("size cannot be negative but was: ", size));
    }
}
