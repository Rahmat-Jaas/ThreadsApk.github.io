package X;

import java.util.List;

/* renamed from: X.1tf  reason: invalid class name and case insensitive filesystem */
public final class C28101tf extends AnonymousClass2SA {
    public final List A00;

    public C28101tf(List list) {
        C04220Ms.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C28101tf) && C04220Ms.A0I(this.A00, ((C28101tf) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
