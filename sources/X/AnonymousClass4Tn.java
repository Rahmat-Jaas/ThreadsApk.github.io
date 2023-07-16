package X;

import java.util.Map;

/* renamed from: X.4Tn  reason: invalid class name */
public final class AnonymousClass4Tn implements Map.Entry, C03740Kn {
    public final Object A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4Tn) {
                AnonymousClass4Tn r5 = (AnonymousClass4Tn) obj;
                if (!C04220Ms.A0I(getKey(), r5.getKey()) || !C04220Ms.A0I(getValue(), r5.getValue())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Object getKey() {
        return this.A00;
    }

    public final Object getValue() {
        return this.A01;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("MapEntry(key=");
        A0s.append(getKey());
        A0s.append(", value=");
        A0s.append(getValue());
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass4Tn(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A03(getKey()) * 31) + C18200wM.A07(getValue());
    }

    public final Object setValue(Object obj) {
        throw C18220wO.A0v();
    }
}
