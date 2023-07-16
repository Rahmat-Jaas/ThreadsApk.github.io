package X;

import java.io.Serializable;

/* renamed from: X.4O2  reason: invalid class name */
public final class AnonymousClass4O2 implements Comparable, Serializable {
    public String A00;
    public int A01;
    public Class A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            return obj != null && obj.getClass() == getClass() && ((AnonymousClass4O2) obj).A02 == this.A02;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A00.compareTo(((AnonymousClass4O2) obj).A00);
    }

    public final int hashCode() {
        return this.A01;
    }

    public final String toString() {
        return this.A00;
    }

    public AnonymousClass4O2(Class cls) {
        this.A02 = cls;
        String name = cls.getName();
        this.A00 = name;
        this.A01 = name.hashCode();
    }

    public AnonymousClass4O2() {
        this.A02 = null;
        this.A00 = null;
        this.A01 = 0;
    }
}
