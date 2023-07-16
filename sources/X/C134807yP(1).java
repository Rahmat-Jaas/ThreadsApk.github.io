package X;

/* renamed from: X.7yP  reason: invalid class name and case insensitive filesystem */
public final class C134807yP implements Comparable {
    public static final C134807yP A01 = new C134807yP();
    public final int A00;

    public C134807yP() {
        if (!AnonymousClass8bH.A02(0, 255).A06(1) || !AnonymousClass8bH.A02(0, 255).A06(8) || !AnonymousClass8bH.A02(0, 255).A06(0)) {
            StringBuilder A0s = C18190wL.A0s("Version components are out of range: ");
            A0s.append(1);
            A0s.append('.');
            A0s.append(8);
            A0s.append('.');
            throw C18190wL.A0a(C86144wL.A0v(A0s, 0));
        }
        this.A00 = 67584;
    }

    public final boolean equals(Object obj) {
        C134807yP r4;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C134807yP) {
            r4 = (C134807yP) obj;
        } else {
            r4 = null;
        }
        return r4 != null && this.A00 == r4.A00;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C134807yP r3 = (C134807yP) obj;
        C04220Ms.A0B(r3, 0);
        return this.A00 - r3.A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(1);
        A0r.append('.');
        A0r.append(8);
        A0r.append('.');
        return C86144wL.A0v(A0r, 0);
    }
}
