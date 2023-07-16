package X;

/* renamed from: X.6tY  reason: invalid class name and case insensitive filesystem */
public final class C114596tY {
    public final int A00;
    public final C1202279h A01;

    public C114596tY(C1202279h r2, int i) {
        C04220Ms.A0B(r2, 2);
        this.A00 = i;
        this.A01 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114596tY) {
                C114596tY r5 = (C114596tY) obj;
                if (this.A00 != r5.A00 || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, this.A00 * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("GenerationalViewportHint(generationId=");
        A0s.append(this.A00);
        A0s.append(", hint=");
        return C86104wH.A0y(this.A01, A0s);
    }
}
