package X;

import java.util.concurrent.Callable;

/* renamed from: X.84p  reason: invalid class name and case insensitive filesystem */
public final class C1368384p implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass684 A03;
    public final /* synthetic */ C112976qV A04;
    public final /* synthetic */ C127397h3 A05;
    public final /* synthetic */ C109276jk A06;
    public final /* synthetic */ C114816tw A07;
    public final /* synthetic */ C114816tw A08;
    public final /* synthetic */ boolean A09;

    public C1368384p(AnonymousClass684 r1, C112976qV r2, C127397h3 r3, C109276jk r4, C114816tw r5, C114816tw r6, int i, int i2, int i3, boolean z) {
        this.A08 = r5;
        this.A07 = r6;
        this.A06 = r4;
        this.A05 = r3;
        this.A04 = r2;
        this.A00 = i;
        this.A03 = r1;
        this.A02 = i2;
        this.A01 = i3;
        this.A09 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x019b, code lost:
        if (X.C04220Ms.A00(r10.A00 ^ com.facebook.forker.Process.WAIT_RESULT_TIMEOUT, r0.A00 ^ com.facebook.forker.Process.WAIT_RESULT_TIMEOUT) <= 0) goto L_0x019d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0176  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r26 = this;
            r10 = r26
            X.6tw r9 = r10.A08
            int r18 = r9.A00()
            X.6tw r8 = r10.A07
            int r19 = r8.A00()
            X.6jk r2 = r10.A06
            X.7h3 r5 = r10.A05
            r7 = 1
            int r0 = r5.A02
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r7)
            int r0 = X.C86124wJ.A0H(r4, r12)
            long r0 = (long) r0
            android.util.LongSparseArray r3 = r2.A00
            java.lang.Object r11 = r3.get(r0)
            X.7J7 r11 = (X.AnonymousClass7J7) r11
            if (r11 != 0) goto L_0x0034
            X.Lyh r6 = r2.A01
            java.lang.Object r11 = r6.A00(r0)
            X.7J7 r11 = (X.AnonymousClass7J7) r11
        L_0x0034:
            X.6qV r13 = r10.A04
            android.content.Context r0 = r13.A04
            r25 = r0
            r6 = 0
            X.7h5 r1 = new X.7h5
            r1.<init>(r5, r6)
            java.lang.Object r0 = r13.A05
            r24 = r0
            r20 = r0
            r0 = r20
            X.3HX r0 = (X.AnonymousClass3HX) r0
            r20 = r0
            X.AnonymousClass2LE.A00(r20)
            int r0 = r13.A03
            r23 = r0
            r13 = r25
            r14 = r11
            r15 = r1
            r16 = r24
            r17 = r0
            X.7J7 r11 = X.AnonymousClass7J7.A01(r13, r14, r15, r16, r17, r18, r19)
            int r0 = X.C86124wJ.A0H(r4, r12)
            long r0 = (long) r0
            r3.put(r0, r11)
            X.Lyh r2 = r2.A01
            r2.A01(r0, r11)
            boolean r0 = r9.A02()
            if (r0 == 0) goto L_0x0079
            boolean r0 = r8.A02()
            if (r0 == 0) goto L_0x0079
        L_0x0078:
            return r11
        L_0x0079:
            X.7Di r0 = r11.A02
            com.facebook.rendercore.RenderTreeNode r0 = r0.A04
            android.graphics.Rect r0 = r0.A04
            int r12 = r0.width()
            int r9 = r0.height()
            int r8 = r10.A00
            X.684 r0 = r10.A03
            r22 = r0
            int r1 = r10.A02
            int r15 = r10.A01
            boolean r0 = r10.A09
            r19 = r0
            X.7h3 r18 = X.AnonymousClass70H.A00(r5)
            if (r18 != 0) goto L_0x00ef
            kotlin.UInt r13 = new kotlin.UInt
            r13.<init>(r12)
            kotlin.UInt r0 = new kotlin.UInt
            r0.<init>(r9)
        L_0x00a5:
            int r7 = r13.A00
            int r1 = r0.A00
            if (r7 != r12) goto L_0x00ad
            if (r1 == r9) goto L_0x0078
        L_0x00ad:
            r0 = 1073741824(0x40000000, float:2.0)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            r0 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            int r0 = X.C86124wJ.A0H(r4, r8)
            long r0 = (long) r0
            java.lang.Object r7 = r3.get(r0)
            X.7J7 r7 = (X.AnonymousClass7J7) r7
            if (r7 != 0) goto L_0x00cf
            java.lang.Object r7 = r2.A00(r0)
            X.7J7 r7 = (X.AnonymousClass7J7) r7
        L_0x00cf:
            X.7h5 r0 = new X.7h5
            r0.<init>(r5, r6)
            X.AnonymousClass2LE.A00(r20)
            r9 = r25
            r10 = r7
            r11 = r0
            r12 = r24
            r13 = r23
            X.7J7 r11 = X.AnonymousClass7J7.A01(r9, r10, r11, r12, r13, r14, r15)
            int r0 = X.C86124wJ.A0H(r4, r8)
            long r0 = (long) r0
            r3.put(r0, r11)
            r2.A01(r0, r11)
            return r11
        L_0x00ef:
            r13 = r9
            r21 = r12
            if (r8 != r7) goto L_0x00f7
            r13 = r12
            r21 = r9
        L_0x00f7:
            int r14 = android.view.View.MeasureSpec.getMode(r15)
            int r17 = android.view.View.MeasureSpec.getSize(r15)
            int r10 = android.view.View.MeasureSpec.getMode(r1)
            int r1 = android.view.View.MeasureSpec.getSize(r1)
            X.7h3 r0 = X.AnonymousClass70H.A00(r5)
            X.6tw r16 = X.C121957Iy.A02(r0, r10, r1, r8)
            X.7h3 r1 = X.AnonymousClass70H.A00(r5)
            r0 = r17
            X.6tw r10 = X.C121957Iy.A01(r1, r14, r0, r8)
            X.7h3 r0 = X.AnonymousClass70H.A00(r5)
            r1 = 0
            if (r14 == 0) goto L_0x0122
            r1 = r17
        L_0x0122:
            if (r8 != r7) goto L_0x01ac
            if (r0 == 0) goto L_0x01b2
            r15 = 41
        L_0x0128:
            android.util.SparseArray r0 = r0.A04
            java.lang.String r0 = X.C86114wI.A0m(r0, r15)
        L_0x012e:
            kotlin.UInt r15 = X.C121957Iy.A03(r0, r6, r1)
            if (r15 == 0) goto L_0x013f
            int r0 = r15.A00
            int r0 = r10.A01(r0)
            kotlin.UInt r15 = new kotlin.UInt
            r15.<init>(r0)
        L_0x013f:
            java.lang.Float r0 = X.AnonymousClass70H.A01(r18)
            if (r0 == 0) goto L_0x0176
            double r13 = X.AnonymousClass7G2.A00(r21)
            float r0 = r0.floatValue()
            double r0 = (double) r0
            if (r8 != r7) goto L_0x0174
            double r13 = r13 * r0
        L_0x0151:
            int r13 = X.AnonymousClass8bA.A00(r13)
        L_0x0155:
            int r10 = r10.A01(r13)
            r1 = r16
            r0 = r21
            int r1 = r1.A01(r0)
            r0 = r1
            if (r8 != r7) goto L_0x0165
            r0 = r10
        L_0x0165:
            kotlin.UInt r13 = new kotlin.UInt
            r13.<init>(r0)
            if (r8 != r7) goto L_0x016d
            r10 = r1
        L_0x016d:
            kotlin.UInt r0 = new kotlin.UInt
            r0.<init>(r10)
            goto L_0x00a5
        L_0x0174:
            double r13 = r13 / r0
            goto L_0x0151
        L_0x0176:
            r1 = 0
            if (r14 == 0) goto L_0x017b
            r1 = r17
        L_0x017b:
            if (r19 == 0) goto L_0x0155
            X.684 r14 = X.AnonymousClass684.STRETCH
            r0 = r22
            if (r0 != r14) goto L_0x0155
            if (r15 != 0) goto L_0x0155
            boolean r0 = r10.A02()
            if (r0 != 0) goto L_0x0155
            kotlin.UInt r0 = r10.A01
            if (r0 == 0) goto L_0x019d
            int r15 = r10.A00
            int r14 = r0.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = r15 ^ r0
            r14 = r14 ^ r0
            int r0 = X.C04220Ms.A00(r15, r14)
            if (r0 > 0) goto L_0x0155
        L_0x019d:
            int r14 = r10.A01(r1)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r13 ^ r0
            r0 = r0 ^ r14
            if (r1 == r0) goto L_0x0155
            if (r1 >= r0) goto L_0x0155
            r13 = r14
            goto L_0x0155
        L_0x01ac:
            if (r0 == 0) goto L_0x01b2
            r15 = 35
            goto L_0x0128
        L_0x01b2:
            r0 = r6
            goto L_0x012e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1368384p.call():java.lang.Object");
    }
}
