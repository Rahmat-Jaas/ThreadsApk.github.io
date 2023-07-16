package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6qh  reason: invalid class name and case insensitive filesystem */
public final class C113086qh {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C113156qq[] A03;
    public final int A04;
    public final int A05;
    public final AnonymousClass69J A06;
    public final List A07;
    public final boolean A08;

    public final List A00(int i, int i2, int i3) {
        int i4;
        int i5;
        C113156qq[] r7 = this.A03;
        int length = r7.length;
        ArrayList A0k = C18240wQ.A0k(length);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i6 < length) {
            C113156qq r11 = r7[i6];
            int i10 = i7 + 1;
            int i11 = (int) ((C114096sg) this.A07.get(i7)).A00;
            if (this.A06 == AnonymousClass69J.Rtl) {
                i4 = (this.A05 - i8) - i11;
            } else {
                i4 = i8;
            }
            if (this.A08) {
                i5 = this.A00;
            } else {
                i5 = i4;
                i4 = this.A00;
            }
            AnonymousClass7VN A002 = r11.A00(i, i9, i2, i3, i5, i4);
            i9 += r11.A00 + this.A04;
            i8 += i11;
            A0k.add(A002);
            i6++;
            i7 = i10;
        }
        return A0k;
    }

    public C113086qh(AnonymousClass69J r5, List list, C113156qq[] r7, int i, int i2, int i3, int i4, boolean z) {
        this.A00 = i;
        this.A03 = r7;
        this.A07 = list;
        this.A08 = z;
        this.A05 = i2;
        this.A06 = r5;
        this.A04 = i4;
        int i5 = 0;
        for (C113156qq r0 : r7) {
            i5 = Math.max(i5, r0.A02);
        }
        this.A01 = i5;
        int i6 = i5 + i3;
        this.A02 = i6 < 0 ? 0 : i6;
    }
}
