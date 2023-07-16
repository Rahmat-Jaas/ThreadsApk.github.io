package X;

import java.io.Serializable;

/* renamed from: X.4Nn  reason: invalid class name and case insensitive filesystem */
public final class C72334Nn implements Serializable {
    public Object A00;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() == obj.getClass()) {
            return this.A00.equals(((C72334Nn) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A03(this.A00);
    }

    public final String toString() {
        Object obj = this.A00;
        if (obj == null) {
            return "null";
        }
        return obj.toString();
    }
}
