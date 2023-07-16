package X;

/* renamed from: X.7V1  reason: invalid class name */
public final class AnonymousClass7V1 implements C145058jl {
    public final /* synthetic */ float BD3() {
        return (float) 0;
    }

    public final String toString() {
        return "Arrangement#Bottom";
    }

    public final void A9G(C147168nV r6, int[] iArr, int[] iArr2, int i) {
        AnonymousClass0wJ.A1Q(iArr, iArr2);
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
    }
}
