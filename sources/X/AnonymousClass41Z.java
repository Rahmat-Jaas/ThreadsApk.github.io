package X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.41Z  reason: invalid class name */
public final class AnonymousClass41Z implements C143978hc, Serializable {
    public final Object A00;

    public final boolean equals(Object obj) {
        if (obj instanceof AnonymousClass41Z) {
            return C32572Cj.A00(this.A00, ((AnonymousClass41Z) obj).A00);
        }
        return false;
    }

    public final Object get() {
        return this.A00;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Suppliers.ofInstance(");
        A0s.append(this.A00);
        return C18180wK.A0i(")", A0s);
    }

    public AnonymousClass41Z(Object obj) {
        this.A00 = obj;
    }
}
