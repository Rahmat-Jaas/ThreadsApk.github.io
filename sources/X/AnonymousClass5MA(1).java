package X;

import java.util.List;

/* renamed from: X.5MA  reason: invalid class name */
public final class AnonymousClass5MA extends AnonymousClass0Sf implements C144508ic {
    public final List A00;

    public AnonymousClass5MA(List list) {
        C04220Ms.A0B(list, 1);
        this.A00 = list;
    }

    public final AnonymousClass5MA D3P() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5MA) && C04220Ms.A0I(this.A00, ((AnonymousClass5MA) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
