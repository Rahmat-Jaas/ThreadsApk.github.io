package X;

/* renamed from: X.59N  reason: invalid class name */
public final class AnonymousClass59N extends C113226qx {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass67E A03;

    public AnonymousClass59N(AnonymousClass67E r3, int i, int i2, int i3) {
        C04220Ms.A0B(r3, 1);
        this.A03 = r3;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        if (r3 != AnonymousClass67E.REFRESH) {
            int i4 = (i2 - i) + 1;
            if (i4 <= 0) {
                throw C18190wL.A0a(AnonymousClass00U.A0J("Drop count must be > 0, but was ", i4));
            } else if (i3 < 0) {
                throw C18190wL.A0a(AnonymousClass00U.A0J("Invalid placeholdersRemaining ", i3));
            }
        } else {
            throw C18190wL.A0a("Drop load type must be PREPEND or APPEND");
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass59N) {
                AnonymousClass59N r5 = (AnonymousClass59N) obj;
                if (!(this.A03 == r5.A03 && this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((C18210wN.A04(this.A03) + this.A01) * 31) + this.A00) * 31) + this.A02;
    }

    public final String toString() {
        String str;
        int ordinal = this.A03.ordinal();
        if (ordinal == 2) {
            str = "end";
        } else if (ordinal == 1) {
            str = "front";
        } else {
            throw C18190wL.A0a("Drop load type must be PREPEND or APPEND");
        }
        StringBuilder A0s = C18190wL.A0s("PageEvent.Drop from the ");
        A0s.append(str);
        A0s.append(" (\n                    |   minPageOffset: ");
        A0s.append(this.A01);
        A0s.append("\n                    |   maxPageOffset: ");
        A0s.append(this.A00);
        A0s.append("\n                    |   placeholdersRemaining: ");
        A0s.append(this.A02);
        return AnonymousClass4n8.A09(C18180wK.A0i("\n                    |)", A0s), "|");
    }
}
