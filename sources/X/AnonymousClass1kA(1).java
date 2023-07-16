package X;

import java.util.List;

/* renamed from: X.1kA  reason: invalid class name */
public final class AnonymousClass1kA extends C57943Dd {
    public final List A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1kA) {
                AnonymousClass1kA r5 = (AnonymousClass1kA) obj;
                if (!"".equals("") || !"".equals("") || !"".equals("") || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CompoundString(prefix=");
        A0s.append("");
        A0s.append(", postfix=");
        A0s.append("");
        A0s.append(", separator=");
        A0s.append("");
        A0s.append(", strings=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass1kA(List list) {
        this.A00 = list;
    }
}
