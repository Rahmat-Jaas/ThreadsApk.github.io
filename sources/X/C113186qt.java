package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6qt  reason: invalid class name and case insensitive filesystem */
public final class C113186qt {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final C120987Dn A09;
    public final C142878fk A0A;
    public final C141758cu A0B;
    public final AnonymousClass69J A0C;
    public final List A0D;
    public final boolean A0E;
    public final boolean A0F;

    public C113186qt(C120987Dn r8, C142878fk r9, C141758cu r10, AnonymousClass69J r11, Object obj, List list, int i, int i2, int i3, int i4, long j, boolean z, boolean z2) {
        int i5;
        int i6;
        this.A01 = i;
        this.A0D = list;
        this.A0E = z;
        this.A0A = r9;
        this.A0B = r10;
        this.A0C = r11;
        this.A0F = z2;
        this.A06 = i2;
        this.A05 = i3;
        this.A09 = r8;
        this.A07 = i4;
        this.A08 = j;
        this.A04 = obj;
        int size = list.size();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            C123657Xy r2 = (C123657Xy) list.get(i9);
            boolean z3 = this.A0E;
            if (z3) {
                i5 = r2.A00;
            } else {
                i5 = r2.A01;
            }
            i7 += i5;
            if (!z3) {
                i6 = r2.A00;
            } else {
                i6 = r2.A01;
            }
            i8 = Math.max(i8, i6);
        }
        this.A02 = i7;
        int i10 = i7 + this.A07;
        this.A03 = i10 < 0 ? 0 : i10;
        this.A00 = i8;
    }

    public final AnonymousClass7VH A00(int i, int i2, int i3) {
        long A002;
        int i4;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        boolean z = this.A0E;
        int i5 = i2;
        int i6 = i5;
        if (z) {
            i6 = i3;
        }
        List list = this.A0D;
        int size = list.size();
        int i7 = i;
        int i8 = i7;
        for (int i9 = 0; i9 < size; i9++) {
            C123657Xy r3 = (C123657Xy) list.get(i9);
            if (z) {
                C142878fk r10 = this.A0A;
                if (r10 != null) {
                    A002 = AnonymousClass7Hh.A00(r10.A87(this.A0C, r3.A01, i5), i8);
                    i4 = r3.A00;
                } else {
                    throw C18190wL.A0a("Required value was null.");
                }
            } else {
                C141758cu r11 = this.A0B;
                if (r11 != null) {
                    A002 = AnonymousClass7Hh.A00(i8, AnonymousClass8bA.A03(C86134wK.A01(i3 - r3.A00), ((float) 1) + ((AnonymousClass7Wh) r11).A00));
                    i4 = r3.A01;
                } else {
                    throw C18190wL.A0a("Required value was null.");
                }
            }
            i8 += i4;
            A0v.add(new C106736fW(r3, A002));
        }
        int i10 = this.A01;
        Object obj = this.A04;
        int i11 = this.A02;
        int i12 = -this.A06;
        int i13 = i6 + this.A05;
        return new AnonymousClass7VH(this.A09, obj, A0v, i7, i10, i11, i12, i13, i6, this.A08, z, this.A0F);
    }
}
