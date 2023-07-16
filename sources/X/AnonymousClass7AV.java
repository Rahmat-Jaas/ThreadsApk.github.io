package X;

import java.util.ArrayList;

/* renamed from: X.7AV  reason: invalid class name */
public final class AnonymousClass7AV {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = -1;
    public boolean A06;
    public final int A07;
    public final C134927yb A08;
    public final int[] A09;
    public final Object[] A0A;
    public final int A0B;

    public final void A07() {
        int i;
        this.A06 = true;
        C134927yb r1 = this.A08;
        if (r1 != r1 || (i = r1.A01) <= 0) {
            AnonymousClass7J4.A02("Unexpected reader close()");
            throw null;
        } else {
            r1.A01 = i - 1;
        }
    }

    public static final Object A00(AnonymousClass7AV r4, int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) != 0) {
            return r4.A0A[iArr[i2 + 4] + C121627Hb.A00(i3 >> 30)];
        }
        return null;
    }

    public final int A01() {
        int i = 1;
        if (this.A04 == 0) {
            int[] iArr = this.A09;
            int i2 = this.A01;
            if (!C121627Hb.A04(i2, iArr)) {
                i = C86144wL.A05(i2 * 5, iArr);
            }
            this.A01 = i2 + C86154wM.A03(i2, iArr);
            return i;
        }
        AnonymousClass7J4.A02("Cannot skip while in an empty region");
        throw null;
    }

    public final C104036b8 A02(int i) {
        ArrayList arrayList = this.A08.A04;
        int A022 = C121627Hb.A02(arrayList, i, this.A07);
        if (A022 >= 0) {
            return (C104036b8) C86164wN.A0b(arrayList, A022);
        }
        C104036b8 r0 = new C104036b8(i);
        arrayList.add(-(A022 + 1), r0);
        return r0;
    }

    public final Object A03() {
        int i = this.A01;
        if (i >= this.A00) {
            return C18220wO.A0d();
        }
        int[] iArr = this.A09;
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) == 0) {
            return AnonymousClass7GN.A00;
        }
        Object[] objArr = this.A0A;
        int length = iArr.length;
        if (i2 < length) {
            length = C121627Hb.A00(i3 >> 29) + iArr[i2 + 4];
        }
        return objArr[length];
    }

    public final Object A04(int i) {
        int[] iArr = this.A09;
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) == 0) {
            return AnonymousClass7GN.A00;
        }
        Object[] objArr = this.A0A;
        int length = iArr.length;
        if (i2 < length) {
            length = C121627Hb.A00(i3 >> 29) + iArr[i2 + 4];
        }
        return objArr[length];
    }

    public final Object A05(int i) {
        int[] iArr = this.A09;
        if (C121627Hb.A04(i, iArr)) {
            return this.A0A[iArr[(i * 5) + 4]];
        }
        return null;
    }

    public final Object A06(int i, int i2) {
        int i3;
        int[] iArr = this.A09;
        int A012 = C121627Hb.A01(i, iArr);
        int i4 = i + 1;
        if (i4 < this.A07) {
            i3 = iArr[(i4 * 5) + 4];
        } else {
            i3 = this.A0B;
        }
        int i5 = A012 + i2;
        if (i5 < i3) {
            return this.A0A[i5];
        }
        return AnonymousClass7GN.A00;
    }

    public final void A08() {
        int A032;
        if (this.A04 != 0) {
            return;
        }
        if (this.A01 == this.A00) {
            int[] iArr = this.A09;
            int i = iArr[(this.A05 * 5) + 2];
            this.A05 = i;
            if (i < 0) {
                A032 = this.A07;
            } else {
                A032 = i + C86154wM.A03(i, iArr);
            }
            this.A00 = A032;
            return;
        }
        AnonymousClass7J4.A02("endGroup() not called at the end of a group");
        throw null;
    }

    public final void A09() {
        if (this.A04 == 0) {
            this.A01 = this.A00;
        } else {
            AnonymousClass7J4.A02("Cannot skip the enclosing group while in an empty region");
            throw null;
        }
    }

    public final void A0A() {
        int i;
        if (this.A04 <= 0) {
            int[] iArr = this.A09;
            int i2 = this.A01;
            int i3 = i2 * 5;
            if (iArr[i3 + 2] == this.A05) {
                this.A05 = i2;
                this.A00 = iArr[i3 + 3] + i2;
                int i4 = i2 + 1;
                this.A01 = i4;
                this.A02 = C121627Hb.A01(i2, iArr);
                if (i2 >= this.A07 - 1) {
                    i = this.A0B;
                } else {
                    i = iArr[(i4 * 5) + 4];
                }
                this.A03 = i;
                return;
            }
            throw C18190wL.A0a("Invalid slot table detected");
        }
    }

    public final void A0B(int i) {
        int i2;
        if (this.A04 == 0) {
            this.A01 = i;
            int i3 = this.A07;
            if (i < i3) {
                i2 = this.A09[(i * 5) + 2];
            } else {
                i2 = -1;
            }
            this.A05 = i2;
            if (i2 >= 0) {
                i3 = i2 + C86154wM.A03(i2, this.A09);
            }
            this.A00 = i3;
            this.A02 = 0;
            this.A03 = 0;
            return;
        }
        AnonymousClass7J4.A02("Cannot reposition while in an empty region");
        throw null;
    }

    public final String toString() {
        int i;
        int i2 = this.A01;
        int i3 = this.A00;
        if (i2 < i3) {
            i = this.A09[i2 * 5];
        } else {
            i = 0;
        }
        return AnonymousClass00U.A0f("SlotReader(current=", ", key=", AnonymousClass000.A00(524), ", end=", ')', i2, i, this.A05, i3);
    }

    public AnonymousClass7AV(C134927yb r3) {
        this.A08 = r3;
        this.A09 = r3.A06;
        int i = r3.A00;
        this.A07 = i;
        this.A0A = r3.A07;
        this.A0B = r3.A02;
        this.A00 = i;
    }
}
