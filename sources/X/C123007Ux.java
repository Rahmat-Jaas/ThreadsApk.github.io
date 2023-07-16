package X;

/* renamed from: X.7Ux  reason: invalid class name and case insensitive filesystem */
public final class C123007Ux implements C145048jk {
    public final /* synthetic */ float BD3() {
        return (float) 0;
    }

    public final String toString() {
        return "Arrangement#End";
    }

    public final void A9H(C147168nV r6, AnonymousClass69J r7, int[] iArr, int[] iArr2, int i) {
        AnonymousClass0wJ.A1Q(iArr, r7);
        C04220Ms.A0B(iArr2, 4);
        if (r7 == AnonymousClass69J.Ltr) {
            int i2 = 0;
            int i3 = 0;
            for (int i4 : iArr) {
                i3 += i4;
            }
            int i5 = i - i3;
            int i6 = 0;
            while (i2 < r4) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        int i8 = 0;
        int length = iArr.length;
        while (true) {
            length--;
            if (-1 < length) {
                int i9 = iArr[length];
                iArr2[length] = i8;
                i8 += i9;
            } else {
                return;
            }
        }
    }
}
