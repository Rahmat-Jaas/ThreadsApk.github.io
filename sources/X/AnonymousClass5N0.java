package X;

import java.util.List;

/* renamed from: X.5N0  reason: invalid class name */
public final class AnonymousClass5N0 extends AnonymousClass0Sf implements C144898jT {
    public final List A00;

    public AnonymousClass5N0(List list) {
        C04220Ms.A0B(list, 1);
        this.A00 = list;
    }

    public final AnonymousClass5N0 D70(C112176p7 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5N0) && C04220Ms.A0I(this.A00, ((AnonymousClass5N0) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
