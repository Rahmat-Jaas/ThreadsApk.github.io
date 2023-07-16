package X;

import java.util.ArrayList;

/* renamed from: X.79I  reason: invalid class name */
public final class AnonymousClass79I {
    public static final AnonymousClass79I A01 = new AnonymousClass79I(2);
    public static final AnonymousClass79I A02 = new AnonymousClass79I(0);
    public static final AnonymousClass79I A03 = new AnonymousClass79I(1);
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass79I) && this.A00 == ((AnonymousClass79I) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        StringBuilder A0s;
        int i = this.A00;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if ((i & 1) != 0) {
            A0v.add("Underline");
        }
        if ((i & 2) != 0) {
            A0v.add("LineThrough");
        }
        if (A0v.size() == 1) {
            A0s = C18190wL.A0s("TextDecoration.");
            A0s.append((String) A0v.get(0));
        } else {
            A0s = C18190wL.A0s("TextDecoration[");
            StringBuilder A0r = C18200wM.A0r();
            A0r.append("");
            int size = A0v.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = A0v.get(i3);
                i2++;
                if (i2 > 1) {
                    A0r.append(", ");
                }
                if (obj != null && !(obj instanceof CharSequence)) {
                    if (obj instanceof Character) {
                        A0r.append(((Character) obj).charValue());
                    } else {
                        obj = String.valueOf(obj);
                    }
                }
                A0r.append((CharSequence) obj);
            }
            A0r.append("");
            A0s.append(C18190wL.A0n(A0r));
            A0s.append(']');
        }
        return A0s.toString();
    }

    public AnonymousClass79I(int i) {
        this.A00 = i;
    }
}
