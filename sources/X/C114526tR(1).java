package X;

/* renamed from: X.6tR  reason: invalid class name and case insensitive filesystem */
public final class C114526tR {
    public final Object A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114526tR) {
                C114526tR r5 = (C114526tR) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A05;
        int hashCode;
        Object obj = this.A00;
        if (obj instanceof Enum) {
            A05 = ((Enum) obj).ordinal();
        } else {
            A05 = C18230wP.A05(obj);
        }
        int i = A05 * 31;
        Object obj2 = this.A01;
        if (obj2 instanceof Enum) {
            hashCode = ((Enum) obj2).ordinal();
        } else {
            hashCode = obj2.hashCode();
        }
        return i + hashCode;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("JoinedKey(left=");
        A0s.append(this.A00);
        A0s.append(", right=");
        return C86104wH.A0y(this.A01, A0s);
    }

    public C114526tR(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }
}
