package X;

import java.util.List;

/* renamed from: X.5KV  reason: invalid class name */
public final class AnonymousClass5KV extends AnonymousClass0Sf implements C21120BpB {
    public final List A00;

    public AnonymousClass5KV(List list) {
        C04220Ms.A0B(list, 1);
        this.A00 = list;
    }

    public final AnonymousClass5KV Cy3() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5KV) && C04220Ms.A0I(this.A00, ((AnonymousClass5KV) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
