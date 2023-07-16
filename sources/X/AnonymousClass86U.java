package X;

import kotlin.Function;

/* renamed from: X.86U  reason: invalid class name */
public final /* synthetic */ class AnonymousClass86U implements C04270Mx, C143178gE {
    public final /* synthetic */ C885759f A00;

    public AnonymousClass86U(C885759f r1) {
        this.A00 = r1;
    }

    public final Function Ak7() {
        return new AnonymousClass019(0, this.A00, C885759f.class, "invalidate", "invalidate()V", 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C143178gE) || !(obj instanceof C04270Mx)) {
            return false;
        }
        return C04220Ms.A0I(Ak7(), ((C04270Mx) obj).Ak7());
    }

    public final int hashCode() {
        return Ak7().hashCode();
    }

    public final void C3E() {
        this.A00.A03();
    }
}
