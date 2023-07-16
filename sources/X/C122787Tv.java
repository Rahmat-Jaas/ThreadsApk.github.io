package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7Tv  reason: invalid class name and case insensitive filesystem */
public final class C122787Tv implements C147228p0 {
    public final float A00;
    public final C112946qS A01;

    public final float Aft(float f, float f2, float f3) {
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01a9 A[EDGE_INSN: B:91:0x01a9->B:53:0x01a9 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long AeM(float r26, float r27, float r28) {
        /*
            r25 = this;
            r4 = r25
            X.6qS r3 = r4.A01
            double r0 = r3.A03
            double r0 = r0 * r0
            float r2 = (float) r0
            float r1 = r3.A04
            float r8 = r26 - r27
            float r0 = r4.A00
            float r8 = r8 / r0
            float r7 = r28 / r0
            r6 = 1065353216(0x3f800000, float:1.0)
            double r4 = (double) r2
            double r14 = (double) r1
            double r2 = (double) r7
            double r0 = (double) r8
            r20 = r0
            double r10 = (double) r6
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = r6 * r14
            double r0 = java.lang.Math.sqrt(r4)
            double r6 = r6 * r0
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = -r6
            r16 = r0
            double r6 = r6 * r6
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r0 = r0 * r18
            double r0 = r0 * r4
            double r6 = r6 - r0
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0282
            double r0 = java.lang.Math.abs(r6)
            double r0 = java.lang.Math.sqrt(r0)
            X.6tK r13 = new X.6tK
            r13.<init>(r4, r0)
        L_0x0041:
            double r0 = r13.A01
            double r0 = r0 + r16
            r13.A01 = r0
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r18 = r18 * r8
            double r0 = r0 / r18
            r13.A01 = r0
            double r0 = r13.A00
            double r0 = r0 / r18
            r13.A00 = r0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0277
            double r0 = java.lang.Math.abs(r6)
            double r0 = java.lang.Math.sqrt(r0)
            X.6tK r12 = new X.6tK
            r12.<init>(r4, r0)
        L_0x0066:
            double r8 = r12.A01
            r0 = -1
            double r6 = (double) r0
            double r8 = r8 * r6
            r12.A01 = r8
            double r0 = r12.A00
            double r0 = r0 * r6
            r12.A00 = r0
            double r8 = r8 + r16
            r12.A01 = r8
            double r8 = r8 / r18
            r12.A01 = r8
            double r0 = r0 / r18
            r12.A00 = r0
            int r0 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x008d
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x008d
            r2 = 0
        L_0x0088:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            return r2
        L_0x008d:
            int r0 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0092
            double r2 = -r2
        L_0x0092:
            double r19 = java.lang.Math.abs(r20)
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x018e
            double r6 = r13.A01
            double r4 = r6 * r19
            double r4 = r4 - r2
            double r23 = r6 - r8
            double r4 = r4 / r23
            double r19 = r19 - r4
            double r0 = r10 / r19
            double r0 = java.lang.Math.abs(r0)
            double r0 = java.lang.Math.log(r0)
            double r0 = r0 / r6
            double r2 = r10 / r4
            double r2 = java.lang.Math.abs(r2)
            double r2 = java.lang.Math.log(r2)
            double r2 = r2 / r8
            boolean r12 = java.lang.Double.isInfinite(r0)
            if (r12 != 0) goto L_0x018b
            boolean r12 = java.lang.Double.isNaN(r0)
            if (r12 != 0) goto L_0x018b
            boolean r12 = java.lang.Double.isInfinite(r2)
            if (r12 != 0) goto L_0x00d9
            boolean r12 = java.lang.Double.isNaN(r2)
            if (r12 != 0) goto L_0x00d9
            double r0 = java.lang.Math.max(r0, r2)
        L_0x00d9:
            double r21 = r19 * r6
            double r2 = -r4
            double r2 = r2 * r8
            double r12 = r21 / r2
            double r2 = java.lang.Math.log(r12)
            double r12 = r8 - r6
            double r2 = r2 / r12
            boolean r12 = java.lang.Double.isNaN(r2)
            if (r12 != 0) goto L_0x0112
            r16 = 0
            int r12 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r12 <= 0) goto L_0x0112
            int r12 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r12 <= 0) goto L_0x017c
            double r14 = X.C86164wN.A00(r6, r2)
            double r12 = r19 * r14
            double r14 = X.C86164wN.A00(r8, r2)
            double r2 = r4 * r14
            double r12 = r12 + r2
            double r2 = -r12
            int r12 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x017c
            int r2 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x0112
            int r2 = (r19 > r16 ? 1 : (r19 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x0112
            r0 = 0
        L_0x0112:
            double r10 = -r10
        L_0x0113:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            double r2 = r2.doubleValue()
            double r12 = X.C86164wN.A00(r6, r2)
            double r14 = r19 * r12
            double r12 = X.C86164wN.A00(r8, r2)
            double r2 = r4 * r12
            double r14 = r14 + r2
            double r14 = r14 + r10
            double r14 = java.lang.Math.abs(r14)
            r12 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 < 0) goto L_0x01a9
            r12 = 0
        L_0x0137:
            int r12 = r12 + 1
            java.lang.Double r15 = java.lang.Double.valueOf(r0)
            double r2 = r15.doubleValue()
            double r13 = X.C86164wN.A00(r6, r2)
            double r17 = r19 * r13
            double r13 = X.C86164wN.A00(r8, r2)
            double r2 = r4 * r13
            double r17 = r17 + r2
            double r17 = r17 + r10
            double r2 = r15.doubleValue()
            double r15 = r19 * r6
            double r13 = X.C86164wN.A00(r6, r2)
            double r15 = r15 * r13
            double r13 = r4 * r8
            double r2 = X.C86164wN.A00(r8, r2)
            double r13 = r13 * r2
            double r15 = r15 + r13
            double r17 = r17 / r15
            double r2 = r0 - r17
            double r0 = r0 - r2
            double r15 = java.lang.Math.abs(r0)
            r0 = r2
            r13 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r2 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r2 <= 0) goto L_0x01a9
            r2 = 100
            if (r12 >= r2) goto L_0x01a9
            goto L_0x0137
        L_0x017c:
            double r2 = r4 * r8
            double r2 = r2 * r8
            double r0 = -r2
            double r21 = r21 * r6
            double r0 = r0 / r21
            double r0 = java.lang.Math.log(r0)
            double r0 = r0 / r23
            goto L_0x0113
        L_0x018b:
            r0 = r2
            goto L_0x00d9
        L_0x018e:
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b2
            double r4 = r13.A01
            double r0 = r4 * r19
            double r2 = r2 - r0
            double r0 = r13.A00
            double r2 = r2 / r0
            double r19 = r19 * r19
            double r2 = r2 * r2
            double r19 = r19 + r2
            double r0 = java.lang.Math.sqrt(r19)
            double r10 = r10 / r0
            double r0 = java.lang.Math.log(r10)
            double r0 = r0 / r4
        L_0x01a9:
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 * r2
            long r2 = (long) r0
            goto L_0x0088
        L_0x01b2:
            double r6 = r13.A01
            double r8 = r6 * r19
            double r2 = r2 - r8
            double r0 = r10 / r19
            double r0 = java.lang.Math.abs(r0)
            double r0 = java.lang.Math.log(r0)
            double r0 = r0 / r6
            double r4 = r10 / r2
            double r4 = java.lang.Math.abs(r4)
            double r15 = java.lang.Math.log(r4)
            r14 = 0
            r4 = r15
        L_0x01ce:
            double r4 = r4 / r6
            double r4 = java.lang.Math.abs(r4)
            double r12 = java.lang.Math.log(r4)
            double r4 = r15 - r12
            int r14 = r14 + 1
            r12 = 6
            if (r14 < r12) goto L_0x01ce
            double r4 = r4 / r6
            boolean r13 = java.lang.Double.isInfinite(r0)
            r12 = 0
            if (r13 != 0) goto L_0x0275
            boolean r13 = java.lang.Double.isNaN(r0)
            if (r13 != 0) goto L_0x0275
            boolean r13 = java.lang.Double.isInfinite(r4)
            if (r13 != 0) goto L_0x01fc
            boolean r13 = java.lang.Double.isNaN(r4)
            if (r13 != 0) goto L_0x01fc
            double r0 = java.lang.Math.max(r0, r4)
        L_0x01fc:
            double r8 = r8 + r2
            double r4 = -r8
            double r8 = r6 * r2
            double r4 = r4 / r8
            boolean r8 = java.lang.Double.isNaN(r4)
            if (r8 != 0) goto L_0x022a
            r17 = 0
            int r8 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r8 <= 0) goto L_0x022a
            int r8 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r8 <= 0) goto L_0x026d
            double r15 = X.C86164wN.A00(r6, r4)
            double r8 = r19 * r15
            double r13 = r2 * r4
            double r13 = r13 * r15
            double r8 = r8 + r13
            double r4 = -r8
            int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x026d
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 >= 0) goto L_0x022a
            int r4 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r4 <= 0) goto L_0x022a
            r0 = 0
        L_0x022a:
            double r10 = -r10
        L_0x022b:
            int r12 = r12 + 1
            java.lang.Double r13 = java.lang.Double.valueOf(r0)
            double r4 = r13.doubleValue()
            double r8 = r2 * r4
            double r17 = r19 + r8
            double r4 = X.C86164wN.A00(r6, r4)
            double r17 = r17 * r4
            double r17 = r17 + r10
            double r4 = r13.doubleValue()
            double r15 = r6 * r4
            r4 = 1
            double r4 = (double) r4
            double r13 = r15 + r4
            double r8 = r2 * r13
            double r4 = r19 * r6
            double r8 = r8 + r4
            double r4 = java.lang.Math.exp(r15)
            double r8 = r8 * r4
            double r17 = r17 / r8
            double r4 = r0 - r17
            double r0 = r0 - r4
            double r13 = java.lang.Math.abs(r0)
            r0 = r4
            r8 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r4 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x01a9
            r4 = 100
            if (r12 >= r4) goto L_0x01a9
            goto L_0x022b
        L_0x026d:
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r4 / r6
            double r0 = -r4
            double r4 = r19 / r2
            double r0 = r0 - r4
            goto L_0x022b
        L_0x0275:
            r0 = r4
            goto L_0x01fc
        L_0x0277:
            double r0 = java.lang.Math.sqrt(r6)
            X.6tK r12 = new X.6tK
            r12.<init>(r0, r4)
            goto L_0x0066
        L_0x0282:
            double r0 = java.lang.Math.sqrt(r6)
            X.6tK r13 = new X.6tK
            r13.<init>(r0, r4)
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122787Tv.AeM(float, float, float):long");
    }

    public final /* bridge */ /* synthetic */ C146248lu DAN(AnonymousClass8cW r3) {
        return new AnonymousClass7U2(new C122707Tn(this));
    }

    public C122787Tv(float f, float f2, float f3) {
        this.A00 = f3;
        C112946qS r5 = new C112946qS();
        if (f >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            r5.A04 = f;
            r5.A06 = false;
            double d = r5.A03;
            if (((float) (d * d)) > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                r5.A03 = Math.sqrt((double) f2);
                r5.A06 = false;
                this.A01 = r5;
                return;
            }
            throw C18190wL.A0a(AnonymousClass000.A00(730));
        }
        throw C18190wL.A0a(AnonymousClass000.A00(643));
    }

    public final float BKL(float f, float f2, float f3, long j) {
        C112946qS r0 = this.A01;
        r0.A05 = f2;
        return C86104wH.A00(r0.A00(f, f3, j / 1000000));
    }

    public final float BKV(float f, float f2, float f3, long j) {
        C112946qS r0 = this.A01;
        r0.A05 = f2;
        return Float.intBitsToFloat(C86104wH.A08(r0.A00(f, f3, j / 1000000)));
    }

    public C122787Tv() {
        this(1.0f, 1500.0f, 0.01f);
    }
}
