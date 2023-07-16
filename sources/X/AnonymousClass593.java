package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.593  reason: invalid class name */
public final class AnonymousClass593 extends AnonymousClass7AO implements Iterable, C03740Kn {
    public int A00;
    public String A01;
    public String A02;
    public final C002100y A03 = new C002100y();

    public final C134777yK A01(C112346pQ r5) {
        C04220Ms.A0B(r5, 0);
        C134777yK A012 = super.A01(r5);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = iterator();
        while (it.hasNext()) {
            C134777yK A013 = ((AnonymousClass7AO) it.next()).A01(r5);
            if (A013 != null) {
                A0v.add(A013);
            }
        }
        return (C134777yK) AnonymousClass00J.A02(AnonymousClass8AP.A0A(new C134777yK[]{A012, (C134777yK) AnonymousClass00J.A02(A0v)}));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AnonymousClass593)) {
            return false;
        }
        C002100y r5 = this.A03;
        List A022 = AnonymousClass8bJ.A02(AnonymousClass8bL.A09(new C012705x(r5)));
        AnonymousClass593 r3 = (AnonymousClass593) obj;
        C002100y r2 = r3.A03;
        C012705x r1 = new C012705x(r2);
        while (r1.hasNext()) {
            A022.remove(r1.next());
        }
        return super.equals(obj) && r5.A01() == r2.A01() && this.A00 == r3.A00 && A022.isEmpty();
    }

    public final AnonymousClass7AO A04(int i) {
        AnonymousClass7AO r0 = (AnonymousClass7AO) this.A03.A04(i);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass593 r02 = this.A01;
        if (r02 != null) {
            return r02.A04(i);
        }
        return null;
    }

    public final AnonymousClass7AO A05(String str) {
        if (str == null || AnonymousClass8bQ.A0n(str)) {
            return null;
        }
        AnonymousClass7AO r0 = (AnonymousClass7AO) this.A03.A04(AnonymousClass00U.A0L("android-app://androidx.navigation/", str).hashCode());
        if (r0 != null) {
            return r0;
        }
        AnonymousClass593 r02 = this.A01;
        if (r02 != null) {
            return r02.A05(str);
        }
        return null;
    }

    public final int hashCode() {
        int i = this.A00;
        C002100y r5 = this.A03;
        int A012 = r5.A01();
        for (int i2 = 0; i2 < A012; i2++) {
            i = C18220wO.A06(r5.A05(i2), ((i * 31) + r5.A02(i2)) * 31);
        }
        return i;
    }

    public final Iterator iterator() {
        return new AnonymousClass84B(this);
    }

    public AnonymousClass593(C114586tX r2) {
        super(r2);
    }

    public final String toString() {
        String str;
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(super.toString());
        AnonymousClass7AO A05 = A05(this.A02);
        if (A05 == null) {
            A05 = A04(this.A00);
        }
        A0r.append(" startDestination=");
        if (A05 == null) {
            str = this.A02;
            if (str == null && (str = this.A01) == null) {
                str = AnonymousClass00U.A0L("0x", Integer.toHexString(this.A00));
            }
        } else {
            A0r.append("{");
            A0r.append(A05.toString());
            str = "}";
        }
        String A0i = C18180wK.A0i(str, A0r);
        C04220Ms.A06(A0i);
        return A0i;
    }
}
