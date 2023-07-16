package X;

import java.util.Map;

/* renamed from: X.6tL  reason: invalid class name and case insensitive filesystem */
public final class C114466tL {
    public int A00 = 300;
    public final Map A01 = C18220wO.A0y();

    public final C113506rX A00(Object obj, int i) {
        C113506rX r2 = new C113506rX(obj);
        this.A01.put(Integer.valueOf(i), r2);
        return r2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C114466tL) {
            C114466tL r3 = (C114466tL) obj;
            if (this.A00 != r3.A00 || !C04220Ms.A0I(this.A01, r3.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, this.A00 * 31 * 31);
    }
}
