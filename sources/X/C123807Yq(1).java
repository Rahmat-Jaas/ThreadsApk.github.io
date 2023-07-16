package X;

/* renamed from: X.7Yq  reason: invalid class name and case insensitive filesystem */
public final class C123807Yq implements C143088g5 {
    public final int A00;
    public final int A01;

    public final void A91(C115546vR r5) {
        C04220Ms.A0B(r5, 0);
        int i = r5.A02;
        r5.A01(i, Math.min(i + this.A00, r5.A04.A00()));
        int i2 = r5.A03;
        r5.A01(Math.max(0, i2 - this.A01), i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C123807Yq) {
                C123807Yq r5 = (C123807Yq) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return C86134wK.A0l(this.A01, this.A00, "DeleteSurroundingTextCommand(lengthBeforeCursor=", ", lengthAfterCursor=");
    }

    public C123807Yq(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (i < 0 || i2 < 0) {
            throw C18190wL.A0a(AnonymousClass00U.A0Z("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", " and ", " respectively.", i, i2));
        }
    }
}
