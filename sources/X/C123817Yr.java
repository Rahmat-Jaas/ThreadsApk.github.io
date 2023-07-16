package X;

/* renamed from: X.7Yr  reason: invalid class name and case insensitive filesystem */
public final class C123817Yr implements C143088g5 {
    public final int A00;
    public final int A01;

    public final void A91(C115546vR r9) {
        C04220Ms.A0B(r9, 0);
        int i = this.A01;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2++;
            int i4 = r9.A03;
            if (i4 > i2) {
                char A002 = r9.A00((i4 - i2) - 1);
                char A003 = r9.A00(r9.A03 - i2);
                if (Character.isHighSurrogate(A002) && Character.isLowSurrogate(A003)) {
                    i2++;
                }
            }
            if (i2 == r9.A03) {
                break;
            }
        }
        int i5 = this.A00;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6++;
            int i8 = r9.A02;
            int i9 = i8 + i6;
            C115086uU r3 = r9.A04;
            if (i9 < r3.A00()) {
                char A004 = r9.A00((i8 + i6) - 1);
                char A005 = r9.A00(r9.A02 + i6);
                if (Character.isHighSurrogate(A004) && Character.isLowSurrogate(A005)) {
                    i6++;
                }
            }
            if (r9.A02 + i6 == r3.A00()) {
                break;
            }
        }
        int i10 = r9.A02;
        r9.A01(i10, i10 + i6);
        int i11 = r9.A03;
        r9.A01(i11 - i2, i11);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C123817Yr) {
                C123817Yr r5 = (C123817Yr) obj;
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
        return C86134wK.A0l(this.A01, this.A00, "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=", ", lengthAfterCursor=");
    }

    public C123817Yr(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (i < 0 || i2 < 0) {
            throw C18190wL.A0a(AnonymousClass00U.A0Z("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", " and ", " respectively.", i, i2));
        }
    }
}
