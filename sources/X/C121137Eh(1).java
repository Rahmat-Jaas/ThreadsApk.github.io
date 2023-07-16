package X;

/* renamed from: X.7Eh  reason: invalid class name and case insensitive filesystem */
public final class C121137Eh {
    public static final C111626o2 A01 = new C111626o2();
    public final Object A00;

    public static final void A00(Object obj) {
        Throwable th;
        if (obj instanceof C111626o2) {
            if (!(obj instanceof C141488bh) || (th = ((C141488bh) obj).A00) == null) {
                throw C18180wK.A0a(AnonymousClass0wJ.A0t("Trying to call 'getOrThrow' on a failed channel result: ", obj));
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        Object obj2 = this.A00;
        if (!(obj instanceof C121137Eh) || !C04220Ms.A0I(obj2, ((C121137Eh) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A03(this.A00);
    }

    public final String toString() {
        StringBuilder sb;
        Object obj = this.A00;
        if (obj instanceof C141488bh) {
            sb = obj;
        } else {
            StringBuilder A0s = C18190wL.A0s("Value(");
            A0s.append(obj);
            A0s.append(')');
            sb = A0s;
        }
        return sb.toString();
    }

    public /* synthetic */ C121137Eh(Object obj) {
        this.A00 = obj;
    }
}
