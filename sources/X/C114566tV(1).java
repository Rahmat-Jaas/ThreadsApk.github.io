package X;

/* renamed from: X.6tV  reason: invalid class name and case insensitive filesystem */
public final class C114566tV {
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114566tV) {
                C114566tV r8 = (C114566tV) obj;
                if (!(this.A01 == r8.A01 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86104wH.A06(C86154wM.A04(this.A01), this.A00) + 4;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Placeholder(width=");
        A0s.append(AnonymousClass7HC.A01(this.A01));
        A0s.append(", height=");
        A0s.append(AnonymousClass7HC.A01(this.A00));
        A0s.append(", placeholderVerticalAlign=");
        return C86104wH.A0y("Center", A0s);
    }

    public C114566tV(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
        if (!(!AnonymousClass7Hi.A04(j))) {
            throw C18190wL.A0a("width cannot be TextUnit.Unspecified");
        } else if (!(!AnonymousClass7Hi.A04(j2))) {
            throw C18190wL.A0a("height cannot be TextUnit.Unspecified");
        }
    }
}
