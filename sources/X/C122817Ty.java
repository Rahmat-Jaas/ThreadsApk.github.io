package X;

/* renamed from: X.7Ty  reason: invalid class name and case insensitive filesystem */
public final class C122817Ty implements C145678ku {
    public final Object A00;
    public final Object A01;

    public final Object Aot() {
        return this.A00;
    }

    public final Object BFg() {
        return this.A01;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C145678ku) {
            C145678ku r3 = (C145678ku) obj;
            if (!C04220Ms.A0I(this.A00, r3.Aot()) || !C04220Ms.A0I(this.A01, r3.BFg())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int A05 = C18230wP.A05(this.A00) * 31;
        Object obj = this.A01;
        if (obj != null) {
            i = obj.hashCode();
        }
        return A05 + i;
    }

    public C122817Ty(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final /* synthetic */ boolean BZF(Object obj, Object obj2) {
        if (!C04220Ms.A0I(obj, Aot()) || !C04220Ms.A0I(obj2, BFg())) {
            return false;
        }
        return true;
    }
}
