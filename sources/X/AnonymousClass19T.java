package X;

import java.util.List;

/* renamed from: X.19T  reason: invalid class name */
public final class AnonymousClass19T extends AnonymousClass0Sf implements C81694oD {
    public final List A00;

    public AnonymousClass19T(List list) {
        C04220Ms.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass19T) && C04220Ms.A0I(this.A00, ((AnonymousClass19T) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
