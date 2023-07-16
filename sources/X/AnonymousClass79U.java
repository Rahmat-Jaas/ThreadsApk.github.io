package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.79U  reason: invalid class name */
public final class AnonymousClass79U {
    public List A00;
    public String A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass79U)) {
            return false;
        }
        return this.A00.equals(((AnonymousClass79U) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        StringBuilder A0r = C18200wM.A0r();
        int size = this.A00.size();
        for (int i = 0; i < size; i++) {
            A0r.append(C18190wL.A0p(this.A00, i));
            if (i < size - 1) {
                A0r.append(" ");
            }
        }
        String obj = A0r.toString();
        this.A01 = obj;
        return obj;
    }

    public AnonymousClass79U(List list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    public AnonymousClass79U() {
        this(Collections.emptyList());
    }
}
