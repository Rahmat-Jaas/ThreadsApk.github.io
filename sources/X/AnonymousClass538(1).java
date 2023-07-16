package X;

/* renamed from: X.538  reason: invalid class name */
public final class AnonymousClass538 extends AnonymousClass84K {
    public int A00;
    public boolean A01;
    public Object[] A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass538(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        C04220Ms.A0B(objArr, 1);
        this.A00 = i3;
        Object[] objArr2 = new Object[i3];
        this.A02 = objArr2;
        boolean A1T = AnonymousClass0wJ.A1T(i, i2);
        this.A01 = A1T;
        objArr2[0] = objArr;
        A00(this, i - (A1T ? 1 : 0), 1);
    }

    public static final void A00(AnonymousClass538 r4, int i, int i2) {
        int i3 = (r4.A00 - i2) * 5;
        while (i2 < r4.A00) {
            Object[] objArr = r4.A02;
            Object[] objArr2 = objArr[i2 - 1];
            C04220Ms.A0C(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = objArr2[(i >> i3) & 31];
            i3 -= 5;
            i2++;
        }
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.A00 - 1;
            this.A00 = i;
            if (this.A01) {
                this.A01 = false;
            } else {
                int i2 = 0;
                while (((i >> i2) & 31) == 31) {
                    i2 += 5;
                }
                if (i2 > 0) {
                    A00(this, i, ((this.A00 - 1) - (i2 / 5)) + 1);
                }
            }
            int i3 = this.A00 & 31;
            Object obj = this.A02[this.A00 - 1];
            C04220Ms.A0C(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
            return ((Object[]) obj)[i3];
        }
        throw C86154wM.A0u();
    }
}
