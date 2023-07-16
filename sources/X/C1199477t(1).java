package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.77t  reason: invalid class name and case insensitive filesystem */
public final class C1199477t {
    public int A00;
    public final int A01;
    public final C114536tS[] A02;

    public C1199477t() {
        this((Integer) null, (DefaultConstructorMarker) null, 3, false);
    }

    public /* synthetic */ C1199477t(Integer num, DefaultConstructorMarker defaultConstructorMarker, int i, boolean z) {
        this.A01 = 3;
        int i2 = 0;
        C114536tS[] r1 = new C114536tS[20];
        do {
            r1[i2] = null;
            i2++;
        } while (i2 < 20);
        this.A02 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r7 < 3) goto L_0x0221;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float A00() {
        /*
            r18 = this;
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r11 = X.AnonymousClass0wJ.A0v()
            r0 = r18
            int r10 = r0.A00
            X.6tS[] r9 = r0.A02
            r8 = r9[r10]
            r15 = 0
            if (r8 == 0) goto L_0x0221
            r7 = 0
            r13 = r8
        L_0x0015:
            r6 = r9[r10]
            r5 = 1
            if (r6 == 0) goto L_0x0052
            long r0 = r8.A01
            long r3 = r6.A01
            long r0 = r0 - r3
            float r2 = (float) r0
            long r0 = r13.A01
            long r3 = r3 - r0
            long r0 = java.lang.Math.abs(r3)
            float r3 = (float) r0
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0052
            r0 = 1109393408(0x42200000, float:40.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0052
            float r0 = r6.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r12.add(r0)
            float r0 = -r2
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r11.add(r0)
            r0 = 20
            if (r10 != 0) goto L_0x004b
            r10 = 20
        L_0x004b:
            int r10 = r10 - r5
            int r7 = r7 + 1
            if (r7 >= r0) goto L_0x0055
            r13 = r6
            goto L_0x0015
        L_0x0052:
            r0 = 3
            if (r7 < r0) goto L_0x0221
        L_0x0055:
            r13 = 1000(0x3e8, float:1.401E-42)
            r14 = 0
            r2 = 2
            int r1 = r11.size()     // Catch:{ IllegalArgumentException -> 0x021d }
            int r0 = r12.size()     // Catch:{ IllegalArgumentException -> 0x021d }
            if (r1 != r0) goto L_0x020f
            boolean r0 = r11.isEmpty()     // Catch:{ IllegalArgumentException -> 0x021d }
            if (r0 != 0) goto L_0x0208
            int r0 = r11.size()     // Catch:{ IllegalArgumentException -> 0x021d }
            if (r2 < r0) goto L_0x0079
            int r3 = X.C86144wL.A0C(r11, r5)     // Catch:{ IllegalArgumentException -> 0x021d }
        L_0x0073:
            r2 = 3
            java.util.ArrayList r10 = X.C18240wQ.A0k(r2)     // Catch:{ IllegalArgumentException -> 0x021d }
            goto L_0x007b
        L_0x0079:
            r3 = 2
            goto L_0x0073
        L_0x007b:
            r9 = 0
            r1 = 0
        L_0x007d:
            java.lang.Float r0 = java.lang.Float.valueOf(r15)     // Catch:{ IllegalArgumentException -> 0x021d }
            r10.add(r0)     // Catch:{ IllegalArgumentException -> 0x021d }
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x007d
            int r8 = r11.size()     // Catch:{ IllegalArgumentException -> 0x021d }
            int r7 = r3 + 1
            X.6or[] r6 = new X.C112026or[r7]     // Catch:{ IllegalArgumentException -> 0x021d }
            r1 = 0
        L_0x0091:
            if (r1 >= r7) goto L_0x009d
            X.6or r0 = new X.6or     // Catch:{ IllegalArgumentException -> 0x021d }
            r0.<init>(r8)     // Catch:{ IllegalArgumentException -> 0x021d }
            r6[r1] = r0     // Catch:{ IllegalArgumentException -> 0x021d }
            int r1 = r1 + 1
            goto L_0x0091
        L_0x009d:
            r3 = 0
        L_0x009e:
            r17 = 1065353216(0x3f800000, float:1.0)
            if (r3 >= r8) goto L_0x00d4
            r0 = r6[r14]     // Catch:{ IllegalArgumentException -> 0x021d }
            java.lang.Float[] r1 = r0.A00     // Catch:{ IllegalArgumentException -> 0x021d }
            java.lang.Float r0 = java.lang.Float.valueOf(r17)     // Catch:{ IllegalArgumentException -> 0x021d }
            r1[r3] = r0     // Catch:{ IllegalArgumentException -> 0x021d }
            r2 = 1
        L_0x00ad:
            if (r2 >= r7) goto L_0x00d1
            int r0 = r2 + -1
            r0 = r6[r0]     // Catch:{ IllegalArgumentException -> 0x021d }
            java.lang.Float[] r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x021d }
            r0 = r0[r3]     // Catch:{ IllegalArgumentException -> 0x021d }
            float r4 = r0.floatValue()     // Catch:{ IllegalArgumentException -> 0x021d }
            java.lang.Object r0 = r11.get(r3)     // Catch:{ IllegalArgumentException -> 0x021d }
            float r0 = X.C18240wQ.A00(r0)     // Catch:{ IllegalArgumentException -> 0x021d }
            float r4 = r4 * r0
            r0 = r6[r2]     // Catch:{ IllegalArgumentException -> 0x021d }
            java.lang.Float[] r1 = r0.A00     // Catch:{ IllegalArgumentException -> 0x021d }
            java.lang.Float r0 = java.lang.Float.valueOf(r4)     // Catch:{ IllegalArgumentException -> 0x021d }
            r1[r3] = r0     // Catch:{ IllegalArgumentException -> 0x021d }
            int r2 = r2 + 1
            goto L_0x00ad
        L_0x00d1:
            int r3 = r3 + 1
            goto L_0x009e
        L_0x00d4:
            X.6or[] r4 = new X.C112026or[r7]     // Catch:{ IllegalArgumentException -> 0x021d }
            r1 = 0
        L_0x00d7:
            if (r1 >= r7) goto L_0x00e3
            X.6or r0 = new X.6or     // Catch:{ IllegalArgumentException -> 0x021d }
            r0.<init>(r8)     // Catch:{ IllegalArgumentException -> 0x021d }
            r4[r1] = r0     // Catch:{ IllegalArgumentException -> 0x021d }
            int r1 = r1 + 1
            goto L_0x00d7
        L_0x00e3:
            X.6or[] r3 = new X.C112026or[r7]     // Catch:{ IllegalArgumentException -> 0x021d }
            r1 = 0
        L_0x00e6:
            if (r1 >= r7) goto L_0x00f2
            X.6or r0 = new X.6or     // Catch:{ IllegalArgumentException -> 0x021d }
            r0.<init>(r7)     // Catch:{ IllegalArgumentException -> 0x021d }
            r3[r1] = r0     // Catch:{ IllegalArgumentException -> 0x021d }
            int r1 = r1 + 1
            goto L_0x00e6
        L_0x00f2:
            r2 = 0
        L_0x00f3:
            if (r2 >= r7) goto L_0x0187
            r11 = 0
        L_0x00f6:
            if (r11 >= r8) goto L_0x0107
            r0 = r6[r2]     // Catch:{ IllegalArgumentException -> 0x021d }
            java.lang.Float[] r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x021d }
            r1 = r0[r11]     // Catch:{ IllegalArgumentException -> 0x021d }
            r0 = r4[r2]     // Catch:{ IllegalArgumentException -> 0x021d }
            java.lang.Float[] r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x021d }
            r0[r11] = r1     // Catch:{ IllegalArgumentException -> 0x021d }
            int r11 = r11 + 1
            goto L_0x00f6
        L_0x0107:
            r14 = 0
        L_0x0108:
            if (r14 >= r2) goto L_0x0138
            r1 = r4[r2]     // Catch:{ IllegalArgumentException -> 0x021d }
            r0 = r4[r14]     // Catch:{ IllegalArgumentException -> 0x021d }
            float r16 = r1.A00(r0)     // Catch:{ IllegalArgumentException -> 0x021d }
            r11 = 0
        L_0x0113:
            if (r11 >= r8) goto L_0x0135
            r0 = r4[r2]     // Catch:{ IllegalArgumentException -> 0x021d }
            java.lang.Float[] r1 = r0.A00     // Catch:{ IllegalArgumentException -> 0x021d }
            r0 = r1[r11]     // Catch:{ IllegalArgumentException -> 0x021d }
            float r15 = r0.floatValue()     // Catch:{ IllegalArgumentException -> 0x021d }
            r0 = r4[r14]     // Catch:{ IllegalArgumentException -> 0x021d }
            java.lang.Float[] r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x021d }
            r0 = r0[r11]     // Catch:{ IllegalArgumentException -> 0x021d }
            float r0 = r0.floatValue()     // Catch:{ IllegalArgumentException -> 0x021d }
            float r0 = r0 * r16
            float r15 = r15 - r0
            java.lang.Float r0 = java.lang.Float.valueOf(r15)     // Catch:{ IllegalArgumentException -> 0x021d }
            r1[r11] = r0     // Catch:{ IllegalArgumentException -> 0x021d }
            int r11 = r11 + 1
            goto L_0x0113
        L_0x0135:
            int r14 = r14 + 1
            goto L_0x0108
        L_0x0138:
            r0 = r4[r2]     // Catch:{ IllegalArgumentException -> 0x021d }
            float r0 = r0.A00(r0)     // Catch:{ IllegalArgumentException -> 0x021d }
            double r0 = (double) r0     // Catch:{ IllegalArgumentException -> 0x021d }
            double r0 = java.lang.Math.sqrt(r0)     // Catch:{ IllegalArgumentException -> 0x021d }
            float r11 = (float) r0     // Catch:{ IllegalArgumentException -> 0x021d }
            double r0 = (double) r11     // Catch:{ IllegalArgumentException -> 0x021d }
            r15 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 < 0) goto L_0x0216
            float r14 = r17 / r11
            r11 = 0
        L_0x0151:
            if (r11 >= r8) goto L_0x0167
            r0 = r4[r2]     // Catch:{ IllegalArgumentException -> 0x021d }
            java.lang.Float[] r1 = r0.A00     // Catch:{ IllegalArgumentException -> 0x021d }
            r0 = r1[r11]     // Catch:{ IllegalArgumentException -> 0x021d }
            float r0 = r0.floatValue()     // Catch:{ IllegalArgumentException -> 0x021d }
            float r0 = r0 * r14
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x021d }
            r1[r11] = r0     // Catch:{ IllegalArgumentException -> 0x021d }
            int r11 = r11 + 1
            goto L_0x0151
        L_0x0167:
            r11 = 0
        L_0x0168:
            if (r11 >= r7) goto L_0x0183
            if (r11 >= r2) goto L_0x016e
            r14 = 0
            goto L_0x0176
        L_0x016e:
            r1 = r4[r2]     // Catch:{ IllegalArgumentException -> 0x021d }
            r0 = r6[r11]     // Catch:{ IllegalArgumentException -> 0x021d }
            float r14 = r1.A00(r0)     // Catch:{ IllegalArgumentException -> 0x021d }
        L_0x0176:
            r0 = r3[r2]     // Catch:{ IllegalArgumentException -> 0x021d }
            java.lang.Float[] r1 = r0.A00     // Catch:{ IllegalArgumentException -> 0x021d }
            java.lang.Float r0 = java.lang.Float.valueOf(r14)     // Catch:{ IllegalArgumentException -> 0x021d }
            r1[r11] = r0     // Catch:{ IllegalArgumentException -> 0x021d }
            int r11 = r11 + 1
            goto L_0x0168
        L_0x0183:
            int r2 = r2 + 1
            goto L_0x00f3
        L_0x0187:
            X.6or r2 = new X.6or     // Catch:{ IllegalArgumentException -> 0x021d }
            r2.<init>(r8)     // Catch:{ IllegalArgumentException -> 0x021d }
        L_0x018c:
            if (r9 >= r8) goto L_0x01a3
            java.lang.Object r0 = r12.get(r9)     // Catch:{ IllegalArgumentException -> 0x021d }
            float r0 = X.C18240wQ.A00(r0)     // Catch:{ IllegalArgumentException -> 0x021d }
            float r0 = r0 * r17
            java.lang.Float[] r1 = r2.A00     // Catch:{ IllegalArgumentException -> 0x021d }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x021d }
            r1[r9] = r0     // Catch:{ IllegalArgumentException -> 0x021d }
            int r9 = r9 + 1
            goto L_0x018c
        L_0x01a3:
            int r7 = r7 - r5
            r6 = r7
        L_0x01a5:
            r0 = -1
            if (r0 >= r6) goto L_0x01ff
            r0 = r4[r6]     // Catch:{ IllegalArgumentException -> 0x021d }
            float r0 = r0.A00(r2)     // Catch:{ IllegalArgumentException -> 0x021d }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x021d }
            r10.set(r6, r0)     // Catch:{ IllegalArgumentException -> 0x021d }
            int r9 = r6 + 1
            if (r9 > r7) goto L_0x01e2
            r8 = r7
        L_0x01ba:
            java.lang.Object r0 = r10.get(r6)     // Catch:{ IllegalArgumentException -> 0x021d }
            float r11 = X.C18240wQ.A00(r0)     // Catch:{ IllegalArgumentException -> 0x021d }
            r0 = r3[r6]     // Catch:{ IllegalArgumentException -> 0x021d }
            java.lang.Float[] r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x021d }
            r0 = r0[r8]     // Catch:{ IllegalArgumentException -> 0x021d }
            float r1 = r0.floatValue()     // Catch:{ IllegalArgumentException -> 0x021d }
            java.lang.Object r0 = r10.get(r8)     // Catch:{ IllegalArgumentException -> 0x021d }
            float r0 = X.C18240wQ.A00(r0)     // Catch:{ IllegalArgumentException -> 0x021d }
            float r1 = r1 * r0
            float r11 = r11 - r1
            java.lang.Float r0 = java.lang.Float.valueOf(r11)     // Catch:{ IllegalArgumentException -> 0x021d }
            r10.set(r6, r0)     // Catch:{ IllegalArgumentException -> 0x021d }
            if (r8 == r9) goto L_0x01e2
            int r8 = r8 + -1
            goto L_0x01ba
        L_0x01e2:
            java.lang.Object r0 = r10.get(r6)     // Catch:{ IllegalArgumentException -> 0x021d }
            float r1 = X.C18240wQ.A00(r0)     // Catch:{ IllegalArgumentException -> 0x021d }
            r0 = r3[r6]     // Catch:{ IllegalArgumentException -> 0x021d }
            java.lang.Float[] r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x021d }
            r0 = r0[r6]     // Catch:{ IllegalArgumentException -> 0x021d }
            float r0 = r0.floatValue()     // Catch:{ IllegalArgumentException -> 0x021d }
            float r1 = r1 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x021d }
            r10.set(r6, r0)     // Catch:{ IllegalArgumentException -> 0x021d }
            int r6 = r6 + -1
            goto L_0x01a5
        L_0x01ff:
            java.lang.Object r0 = r10.get(r5)     // Catch:{ IllegalArgumentException -> 0x021d }
            float r1 = X.C18240wQ.A00(r0)     // Catch:{ IllegalArgumentException -> 0x021d }
            goto L_0x021e
        L_0x0208:
            java.lang.String r0 = "At least one point must be provided"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ IllegalArgumentException -> 0x021d }
            goto L_0x021c
        L_0x020f:
            java.lang.String r0 = "x and y must be the same length"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ IllegalArgumentException -> 0x021d }
            goto L_0x021c
        L_0x0216:
            java.lang.String r0 = "Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ IllegalArgumentException -> 0x021d }
        L_0x021c:
            throw r0     // Catch:{ IllegalArgumentException -> 0x021d }
        L_0x021d:
            r1 = 0
        L_0x021e:
            float r0 = (float) r13
            float r1 = r1 * r0
            return r1
        L_0x0221:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1199477t.A00():float");
    }
}
