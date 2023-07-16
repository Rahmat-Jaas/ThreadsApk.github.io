package X;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.79O  reason: invalid class name */
public final class AnonymousClass79O {
    public int[] A00;
    public Object[] A01;

    public AnonymousClass79O() {
        this((DefaultConstructorMarker) null, 0, 1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            try {
                return (obj instanceof AnonymousClass79O) || ((obj instanceof Map) && 0 == ((Map) obj).size());
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    public /* synthetic */ AnonymousClass79O(DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this.A00 = AnonymousClass6ZT.A00;
        this.A01 = AnonymousClass6ZT.A01;
    }
}
