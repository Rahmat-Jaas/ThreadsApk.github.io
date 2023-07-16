package X;

/* renamed from: X.7Yu  reason: invalid class name and case insensitive filesystem */
public final class C123847Yu implements C143088g5 {
    public final int A00;
    public final int A01;

    public final void A91(C115546vR r5) {
        C04220Ms.A0B(r5, 0);
        int i = this.A01;
        int A002 = r5.A04.A00();
        int A02 = AnonymousClass8bI.A02(i, 0, A002);
        int A022 = AnonymousClass8bI.A02(this.A00, 0, A002);
        if (A02 < A022) {
            r5.A03(A02, A022);
        } else {
            r5.A03(A022, A02);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C123847Yu) {
                C123847Yu r5 = (C123847Yu) obj;
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
        return C86134wK.A0l(this.A01, this.A00, "SetSelectionCommand(start=", ", end=");
    }

    public C123847Yu(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
