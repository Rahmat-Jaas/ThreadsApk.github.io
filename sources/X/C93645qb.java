package X;

import java.util.Set;

/* renamed from: X.5qb  reason: invalid class name and case insensitive filesystem */
public abstract class C93645qb extends AnonymousClass89B implements Set {
    public transient AnonymousClass5qX A00;

    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    public AnonymousClass5qX A08() {
        AnonymousClass5qX r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass5qX A07 = A07();
        this.A00 = A07;
        return A07;
    }

    public AnonymousClass5qX A07() {
        return AnonymousClass5qX.A01(toArray());
    }

    public final int hashCode() {
        return AnonymousClass6J4.A00(this);
    }
}
