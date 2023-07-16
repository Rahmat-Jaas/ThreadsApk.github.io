package X;

/* renamed from: X.6tu  reason: invalid class name and case insensitive filesystem */
public final class C114796tu {
    public final float A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114796tu) {
                C114796tu r5 = (C114796tu) obj;
                if (!C18180wK.A1W(Float.compare(this.A00, r5.A00)) || !C18180wK.A1W(Float.compare(this.A01, r5.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86144wL.A03(C86134wK.A03(this.A00), this.A01);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("TabPosition(left=");
        float f = this.A00;
        C134847yT.A02(A0s, f);
        A0s.append(", right=");
        float f2 = this.A01;
        C134847yT.A02(A0s, f + f2);
        A0s.append(", width=");
        return C86104wH.A0y(C134847yT.A01(f2), A0s);
    }

    public C114796tu(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
