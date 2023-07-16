package kotlin;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C18200wM;
import java.io.Serializable;

public final class Pair implements Serializable {
    public final Object A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Pair) {
                Pair pair = (Pair) obj;
                if (!C04220Ms.A0I(this.A00, pair.A00) || !C04220Ms.A0I(this.A01, pair.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Object A00() {
        return this.A00;
    }

    public final Object A01() {
        return this.A01;
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A03(this.A00) * 31) + C18200wM.A07(this.A01);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("(");
        A0s.append(this.A00);
        A0s.append(", ");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public Pair(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }
}
