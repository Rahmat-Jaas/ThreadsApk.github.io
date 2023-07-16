package X;

/* renamed from: X.79W  reason: invalid class name */
public final class AnonymousClass79W {
    public static final AnonymousClass79W A02 = new AnonymousClass79W(AnonymousClass7Hi.A03(0), AnonymousClass7Hi.A03(0));
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass79W) {
                AnonymousClass79W r8 = (AnonymousClass79W) obj;
                if (!(this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86134wK.A06(C86154wM.A04(this.A00), this.A01);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("TextIndent(firstLine=");
        A0s.append(AnonymousClass7HC.A01(this.A00));
        A0s.append(", restLine=");
        return C86104wH.A0y(AnonymousClass7HC.A01(this.A01), A0s);
    }

    public AnonymousClass79W(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }
}
