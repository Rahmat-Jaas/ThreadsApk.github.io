package X;

/* renamed from: X.6tT  reason: invalid class name and case insensitive filesystem */
public final class C114546tT {
    public final int A00;
    public final C113956sR A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114546tT) {
                C114546tT r5 = (C114546tT) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A04(this.A01) + this.A00;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ImageVectorEntry(imageVector=");
        A0s.append(this.A01);
        A0s.append(", configFlags=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C114546tT(C113956sR r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
