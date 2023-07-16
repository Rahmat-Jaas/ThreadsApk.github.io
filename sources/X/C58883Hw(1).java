package X;

/* renamed from: X.3Hw  reason: invalid class name and case insensitive filesystem */
public final class C58883Hw {
    public final Class A00;
    public final String A01;

    public C58883Hw(Class cls, String str) {
        C04220Ms.A0B(cls, 2);
        this.A01 = str;
        this.A00 = cls;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C58883Hw) {
                C58883Hw r5 = (C58883Hw) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, C18180wK.A03(this.A01));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("FieldCacheKey(fieldName=");
        A0s.append(this.A01);
        A0s.append(", clazz=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
