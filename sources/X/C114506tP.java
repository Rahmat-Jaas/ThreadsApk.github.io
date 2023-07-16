package X;

/* renamed from: X.6tP  reason: invalid class name and case insensitive filesystem */
public final class C114506tP {
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114506tP) {
                C114506tP r8 = (C114506tP) obj;
                if (!(this.A01 == r8.A01 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86134wK.A06(C86154wM.A04(this.A01), this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("SelectionColors(selectionHandleColor=");
        C86154wM.A18(this.A01, A0s);
        A0s.append(", selectionBackgroundColor=");
        return C86104wH.A0y(AnonymousClass7KE.A06(this.A00), A0s);
    }

    public C114506tP(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
