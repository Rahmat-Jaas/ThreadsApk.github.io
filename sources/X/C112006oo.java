package X;

/* renamed from: X.6oo  reason: invalid class name and case insensitive filesystem */
public final class C112006oo {
    public final AnonymousClass0ZU A00;
    public final AnonymousClass8s9 A01;

    public final String toString() {
        AnonymousClass8s9 r3 = this.A01;
        r3.getContext().AOA(AnonymousClass8AT.A00);
        StringBuilder A0s = C18190wL.A0s("Request@");
        int hashCode = hashCode();
        AnonymousClass725.A00(16);
        String num = Integer.toString(hashCode, 16);
        C04220Ms.A06(num);
        A0s.append(num);
        A0s.append("(");
        A0s.append("currentBounds()=");
        A0s.append(this.A00.invoke());
        A0s.append(", continuation=");
        return C86104wH.A0y(r3, A0s);
    }

    public C112006oo(AnonymousClass0ZU r1, AnonymousClass8s9 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
