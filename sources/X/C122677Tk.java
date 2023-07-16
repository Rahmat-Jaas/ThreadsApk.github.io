package X;

/* renamed from: X.7Tk  reason: invalid class name and case insensitive filesystem */
public final class C122677Tk implements C142638fL {
    public final long A00;
    public final C147208oy A01;
    public final Integer A02;

    public final C146248lu DAN(AnonymousClass8cW r5) {
        C04220Ms.A0B(r5, 0);
        return new AnonymousClass7U3(this.A01.DAO(r5), this.A00);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C122677Tk)) {
            return false;
        }
        C122677Tk r7 = (C122677Tk) obj;
        if (!C04220Ms.A0I(r7.A01, this.A01) || r7.A00 != this.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((C18210wN.A04(this.A01) - 1532807697) * 31) + C18190wL.A02(this.A00);
    }

    public C122677Tk(C147208oy r1, Integer num, long j) {
        this.A01 = r1;
        this.A02 = num;
        this.A00 = j;
    }
}
