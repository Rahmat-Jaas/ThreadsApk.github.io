package X;

/* renamed from: X.7Uy  reason: invalid class name and case insensitive filesystem */
public final class C123017Uy implements C145048jk {
    public final /* synthetic */ float BD3() {
        return (float) 0;
    }

    public final String toString() {
        return "Arrangement#Start";
    }

    public final void A9H(C147168nV r7, AnonymousClass69J r8, int[] iArr, int[] iArr2, int i) {
        AnonymousClass0wJ.A1Q(iArr, r8);
        C04220Ms.A0B(iArr2, 4);
        if (r8 == AnonymousClass69J.Ltr) {
            int i2 = 0;
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
            return;
        }
        int i6 = 0;
        for (int i7 : iArr) {
            i6 += i7;
        }
        int i8 = i - i6;
        for (int i9 = r3 - 1; -1 < i9; i9--) {
            int i10 = iArr[i9];
            iArr2[i9] = i8;
            i8 += i10;
        }
    }
}
