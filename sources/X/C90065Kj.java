package X;

import java.util.List;

/* renamed from: X.5Kj  reason: invalid class name and case insensitive filesystem */
public final class C90065Kj extends AnonymousClass0Sf implements C144188hy {
    public final List A00;

    public C90065Kj(List list) {
        C04220Ms.A0B(list, 1);
        this.A00 = list;
    }

    public final C90065Kj Cyp() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C90065Kj) && C04220Ms.A0I(this.A00, ((C90065Kj) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
