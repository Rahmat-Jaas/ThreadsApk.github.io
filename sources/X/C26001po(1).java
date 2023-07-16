package X;

import java.util.List;

/* renamed from: X.1po  reason: invalid class name and case insensitive filesystem */
public final class C26001po extends AnonymousClass2OK {
    public final List A00;

    public C26001po(List list) {
        C04220Ms.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C26001po) && C04220Ms.A0I(this.A00, ((C26001po) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
