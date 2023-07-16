package X;

import java.util.List;

/* renamed from: X.6qq  reason: invalid class name and case insensitive filesystem */
public final class C113156qq {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final C120997Do A09;
    public final AnonymousClass69J A0A;
    public final List A0B;
    public final boolean A0C;
    public final boolean A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r3 != false) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass7VN A00(int r23, int r24, int r25, int r26, int r27, int r28) {
        /*
            r22 = this;
            r2 = r22
            r4 = r25
            boolean r3 = r2.A0C
            r13 = r4
            r6 = r23
            r5 = r24
            if (r3 == 0) goto L_0x0054
            r13 = r26
            X.69J r1 = r2.A0A
            X.69J r0 = X.AnonymousClass69J.Rtl
            if (r1 != r0) goto L_0x0050
            int r4 = r25 - r24
            int r0 = r2.A00
            int r4 = r4 - r0
        L_0x001a:
            long r14 = X.AnonymousClass7Hh.A00(r4, r6)
        L_0x001e:
            int r8 = r2.A01
            java.lang.Object r6 = r2.A04
            if (r3 == 0) goto L_0x004b
            int r1 = r2.A00
            int r0 = r2.A02
        L_0x0028:
            long r16 = X.AnonymousClass7FV.A00(r1, r0)
            int r0 = r2.A06
            int r11 = -r0
            int r0 = r2.A05
            int r12 = r13 + r0
            java.util.List r7 = r2.A0B
            X.7Do r5 = r2.A09
            long r0 = r2.A08
            boolean r2 = r2.A0D
            X.7VN r4 = new X.7VN
            r9 = r27
            r10 = r28
            r20 = r3
            r21 = r2
            r18 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r20, r21)
            return r4
        L_0x004b:
            int r1 = r2.A02
            int r0 = r2.A00
            goto L_0x0028
        L_0x0050:
            r4 = r5
            if (r3 == 0) goto L_0x0054
            goto L_0x001a
        L_0x0054:
            long r14 = X.AnonymousClass7Hh.A00(r6, r5)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113156qq.A00(int, int, int, int, int, int):X.7VN");
    }

    public C113156qq(C120997Do r6, AnonymousClass69J r7, Object obj, List list, int i, int i2, int i3, int i4, int i5, long j, boolean z, boolean z2) {
        int i6;
        this.A01 = i;
        this.A04 = obj;
        this.A0C = z;
        this.A00 = i2;
        this.A07 = i3;
        this.A0D = z2;
        this.A0A = r7;
        this.A06 = i4;
        this.A05 = i5;
        this.A0B = list;
        this.A09 = r6;
        this.A08 = j;
        int size = list.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            C123657Xy r1 = (C123657Xy) list.get(i8);
            if (this.A0C) {
                i6 = r1.A00;
            } else {
                i6 = r1.A01;
            }
            i7 = Math.max(i7, i6);
        }
        this.A02 = i7;
        int i9 = i7 + this.A07;
        this.A03 = i9 < 0 ? 0 : i9;
    }
}
