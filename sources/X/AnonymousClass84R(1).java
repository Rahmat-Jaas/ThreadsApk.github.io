package X;

import java.util.Map;

/* renamed from: X.84R  reason: invalid class name */
public class AnonymousClass84R implements Map.Entry, C03740Kn {
    public final Object A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        Map.Entry entry;
        if (obj instanceof Map.Entry) {
            entry = (Map.Entry) obj;
        } else {
            entry = null;
        }
        if (entry == null || !C04220Ms.A0I(entry.getKey(), getKey())) {
            return false;
        }
        return C86134wK.A1a(entry.getValue(), getValue(), false);
    }

    public final Object getKey() {
        return this.A00;
    }

    public Object getValue() {
        return this.A01;
    }

    public AnonymousClass84R(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final int hashCode() {
        int i = 0;
        int A05 = C18230wP.A05(getKey());
        Object value = getValue();
        if (value != null) {
            i = value.hashCode();
        }
        return A05 ^ i;
    }

    public Object setValue(Object obj) {
        throw C18220wO.A0v();
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(getKey());
        A0r.append('=');
        return C18200wM.A0m(getValue(), A0r);
    }
}
