package X;

import java.util.List;

/* renamed from: X.7VN  reason: invalid class name */
public final class AnonymousClass7VN implements C28 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final C120997Do A09;
    public final Object A0A;
    public final List A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public final int A00() {
        long j;
        boolean z = this.A0D;
        long j2 = this.A07;
        if (z) {
            j = j2 & 4294967295L;
        } else {
            j = j2 >> 32;
        }
        return (int) j;
    }

    public AnonymousClass7VN(C120997Do r6, Object obj, List list, int i, int i2, int i3, int i4, int i5, int i6, long j, long j2, long j3, boolean z, boolean z2) {
        this.A06 = j;
        this.A01 = i;
        this.A0A = obj;
        this.A05 = i2;
        this.A00 = i3;
        this.A07 = j2;
        this.A04 = i4;
        this.A03 = i5;
        this.A0D = z;
        this.A0B = list;
        this.A09 = r6;
        this.A08 = j3;
        this.A02 = i6;
        this.A0E = z2;
        int size = list.size();
        boolean z3 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            Object B01 = ((C123657Xy) this.A0B.get(i7)).B01();
            if ((B01 instanceof C147218oz) && B01 != null) {
                z3 = true;
                break;
            }
            i7++;
        }
        this.A0C = z3;
    }
}
