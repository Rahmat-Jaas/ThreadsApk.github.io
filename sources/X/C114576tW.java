package X;

/* renamed from: X.6tW  reason: invalid class name and case insensitive filesystem */
public final class C114576tW {
    public final C134747yH A00;
    public final C146978nB A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114576tW) {
                C114576tW r5 = (C114576tW) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C18210wN.A04(this.A00));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("TransformedText(text=");
        A0s.append(this.A00);
        A0s.append(", offsetMapping=");
        return C86104wH.A0y(this.A01, A0s);
    }

    public C114576tW(C134747yH r1, C146978nB r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
