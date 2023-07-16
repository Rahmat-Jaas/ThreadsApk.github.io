package X;

/* renamed from: X.6rX  reason: invalid class name and case insensitive filesystem */
public final class C113506rX {
    public C142658fN A00;
    public final Object A01;

    public /* synthetic */ C113506rX(Object obj) {
        C142658fN r0 = AnonymousClass6aT.A01;
        this.A01 = obj;
        this.A00 = r0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C113506rX) {
            C113506rX r3 = (C113506rX) obj;
            if (!C04220Ms.A0I(r3.A01, this.A01) || !C04220Ms.A0I(r3.A00, this.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, C18230wP.A05(this.A01) * 31);
    }
}
