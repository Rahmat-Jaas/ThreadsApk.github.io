package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7yX  reason: invalid class name and case insensitive filesystem */
public final class C134887yX implements Iterable, C146828mv, C03740Kn {
    public boolean A00;
    public boolean A01;
    public final Map A02 = C18220wO.A0y();

    public final Object A00(AnonymousClass77Z r3) {
        C04220Ms.A0B(r3, 0);
        Object obj = this.A02.get(r3);
        if (obj != null) {
            return obj;
        }
        StringBuilder A0s = C18190wL.A0s("Key not present: ");
        A0s.append(r3);
        throw C18180wK.A0a(C18180wK.A0i(" - consider getOrElse or getOrNull", A0s));
    }

    public final boolean A01(AnonymousClass77Z r2) {
        C04220Ms.A0B(r2, 0);
        return this.A02.containsKey(r2);
    }

    public final void ChN(AnonymousClass77Z r2, Object obj) {
        C04220Ms.A0B(r2, 0);
        this.A02.put(r2, obj);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134887yX) {
                C134887yX r5 = (C134887yX) obj;
                if (!(C04220Ms.A0I(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((C18210wN.A04(this.A02) + C86124wJ.A04(this.A01 ? 1 : 0)) * 31) + C86124wJ.A04(this.A00 ? 1 : 0);
    }

    public final Iterator iterator() {
        return AnonymousClass0wJ.A0z(this.A02);
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        String str = "";
        if (this.A01) {
            A0r.append(str);
            A0r.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.A00) {
            A0r.append(str);
            A0r.append("isClearingSemantics=true");
            str = ", ";
        }
        Iterator A0z = AnonymousClass0wJ.A0z(this.A02);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            Object value = A0o.getValue();
            A0r.append(str);
            A0r.append(((AnonymousClass77Z) A0o.getKey()).A00);
            A0r.append(" : ");
            A0r.append(value);
            str = ", ";
        }
        StringBuilder A0r2 = C18200wM.A0r();
        A0r2.append(AnonymousClass6F7.A00(this));
        A0r2.append("{ ");
        A0r2.append(A0r);
        return C18180wK.A0i(" }", A0r2);
    }
}
