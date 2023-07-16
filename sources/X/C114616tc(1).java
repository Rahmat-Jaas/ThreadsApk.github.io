package X;

/* renamed from: X.6tc  reason: invalid class name and case insensitive filesystem */
public final class C114616tc {
    public final C115296up A00;
    public final C115246uk A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114616tc) {
                C114616tc r5 = (C114616tc) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, C18210wN.A04(this.A01));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("TooltipInfo(tooltipPositionInfo=");
        A0s.append(this.A01);
        A0s.append(", tooltipAttributes=");
        return C86104wH.A0y(this.A00, A0s);
    }

    public C114616tc(C115296up r1, C115246uk r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
