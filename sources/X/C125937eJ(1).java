package X;

/* renamed from: X.7eJ  reason: invalid class name and case insensitive filesystem */
public final class C125937eJ implements C146918n5 {
    public final C121547Gq A00;
    public final C147128nR A01;
    public final C112666pz A02;

    /* JADX WARNING: type inference failed for: r5v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b8 A[Catch:{ Exception -> 0x01c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01bf A[Catch:{ Exception -> 0x01c2 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass5Id CX6(X.AnonymousClass68S r26, java.util.List r27) {
        /*
            r25 = this;
            r12 = 0
            r11 = 1
            r13 = r26
            X.C04220Ms.A0B(r13, r11)
            r14 = r25
            X.8nR r3 = r14.A01     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r1 = r3.BJq()     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r0 = "use_case_name"
            r2 = 4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r1 = X.C86134wK.A0N(r0, r1, r2, r12)     // Catch:{ Exception -> 0x01c2 }
            X.7Gq r0 = r14.A00     // Catch:{ Exception -> 0x01c2 }
            r24 = r0
            java.lang.String r10 = "no_use_case"
            r0.A02(r13, r1, r10)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r1 = r3.BJs()     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r0 = "use_case_version"
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r1 = X.C86134wK.A0N(r0, r1, r2, r12)     // Catch:{ Exception -> 0x01c2 }
            r0 = r24
            r0.A02(r13, r1, r10)     // Catch:{ Exception -> 0x01c2 }
            r0 = r27
            java.lang.Object r0 = r0.get(r12)     // Catch:{ Exception -> 0x01c2 }
            com.facebook.dcp.model.Example r0 = (com.facebook.dcp.model.Example) r0     // Catch:{ Exception -> 0x01c2 }
            java.util.HashMap r9 = r0.A02     // Catch:{ Exception -> 0x01c2 }
            X.6pz r0 = r14.A02     // Catch:{ Exception -> 0x01c2 }
            X.0Oa r1 = r0.A02     // Catch:{ Exception -> 0x01c2 }
            java.lang.Object r8 = r1.getValue()     // Catch:{ Exception -> 0x01c2 }
            X.8mN r8 = (X.C146518mN) r8     // Catch:{ Exception -> 0x01c2 }
            boolean r0 = r9.isEmpty()     // Catch:{ Exception -> 0x01c2 }
            if (r0 != 0) goto L_0x0198
            int[] r0 = r8.AxG()     // Catch:{ Exception -> 0x01c2 }
            int r7 = r0.length     // Catch:{ Exception -> 0x01c2 }
            r6 = 0
            if (r7 == 0) goto L_0x0198
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x01c2 }
            X.8mN r1 = (X.C146518mN) r1     // Catch:{ Exception -> 0x01c2 }
            java.util.List r5 = r1.B2V()     // Catch:{ Exception -> 0x01c2 }
            int r0 = r5.size()     // Catch:{ Exception -> 0x01c2 }
            float[] r4 = new float[r0]     // Catch:{ Exception -> 0x01c2 }
            int r0 = r5.size()     // Catch:{ Exception -> 0x01c2 }
            float[] r17 = r1.Ats(r0)     // Catch:{ Exception -> 0x01c2 }
            int r0 = r5.size()     // Catch:{ Exception -> 0x01c2 }
            float[] r16 = r1.BKD(r0)     // Catch:{ Exception -> 0x01c2 }
            int r15 = r5.size()     // Catch:{ Exception -> 0x01c2 }
            r3 = 0
        L_0x0075:
            if (r3 >= r15) goto L_0x00bd
            java.lang.Object r0 = r5.get(r3)     // Catch:{ Exception -> 0x01c2 }
            java.lang.Object r0 = r9.get(r0)     // Catch:{ Exception -> 0x01c2 }
            com.facebook.dcp.model.FeatureData r0 = (com.facebook.dcp.model.FeatureData) r0     // Catch:{ Exception -> 0x01c2 }
            if (r0 == 0) goto L_0x008c
            com.facebook.dcp.model.Type r0 = r0.A02     // Catch:{ Exception -> 0x01c2 }
            if (r0 == 0) goto L_0x008c
            int r0 = r0.ordinal()     // Catch:{ Exception -> 0x01c2 }
            goto L_0x008d
        L_0x008c:
            r0 = -1
        L_0x008d:
            r2 = 0
            if (r0 == r11) goto L_0x0093
            if (r0 != r12) goto L_0x00b2
            goto L_0x00a3
        L_0x0093:
            java.lang.Object r0 = r5.get(r3)     // Catch:{ Exception -> 0x01c2 }
            java.lang.Object r0 = r9.get(r0)     // Catch:{ Exception -> 0x01c2 }
            com.facebook.dcp.model.FeatureData r0 = (com.facebook.dcp.model.FeatureData) r0     // Catch:{ Exception -> 0x01c2 }
            if (r0 == 0) goto L_0x00b2
            double r0 = r0.A00     // Catch:{ Exception -> 0x01c2 }
            float r2 = (float) r0     // Catch:{ Exception -> 0x01c2 }
            goto L_0x00b2
        L_0x00a3:
            java.lang.Object r0 = r5.get(r3)     // Catch:{ Exception -> 0x01c2 }
            java.lang.Object r0 = r9.get(r0)     // Catch:{ Exception -> 0x01c2 }
            com.facebook.dcp.model.FeatureData r0 = (com.facebook.dcp.model.FeatureData) r0     // Catch:{ Exception -> 0x01c2 }
            if (r0 == 0) goto L_0x00b2
            long r0 = r0.A01     // Catch:{ Exception -> 0x01c2 }
            float r2 = (float) r0     // Catch:{ Exception -> 0x01c2 }
        L_0x00b2:
            r0 = r17[r3]     // Catch:{ Exception -> 0x01c2 }
            float r2 = r2 - r0
            r0 = r16[r3]     // Catch:{ Exception -> 0x01c2 }
            float r2 = r2 / r0
            r4[r3] = r2     // Catch:{ Exception -> 0x01c2 }
            int r3 = r3 + 1
            goto L_0x0075
        L_0x00bd:
            r22 = 0
            r21 = 6
            java.lang.String r2 = "normalize_features_complete"
            r1 = r22
            r0 = r21
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r1 = X.C86134wK.A0N(r2, r1, r0, r11)     // Catch:{ Exception -> 0x01c2 }
            r0 = r24
            r0.A02(r13, r1, r10)     // Catch:{ Exception -> 0x01c2 }
            int r20 = r7 - r11
            r3 = 0
        L_0x00d3:
            r0 = r20
            if (r3 >= r0) goto L_0x0127
            int r3 = r3 + 1
            float[] r19 = r14.A00(r4, r3)     // Catch:{ Exception -> 0x01c2 }
            com.facebook.dcp.model.Matrix r0 = r8.BM5(r3)     // Catch:{ Exception -> 0x01c2 }
            float[] r18 = r8.ATH(r3)     // Catch:{ Exception -> 0x01c2 }
            float[][] r0 = r0.A00     // Catch:{ Exception -> 0x01c2 }
            r17 = r0
            int r9 = r0.length     // Catch:{ Exception -> 0x01c2 }
            float[] r5 = new float[r9]     // Catch:{ Exception -> 0x01c2 }
            r4 = 0
        L_0x00ed:
            if (r4 >= r9) goto L_0x0115
            r0 = r19
            int r0 = r0.length     // Catch:{ Exception -> 0x01c2 }
            r23 = r0
            r15 = 0
        L_0x00f5:
            r0 = r23
            if (r15 >= r0) goto L_0x010b
            r16 = r5[r4]     // Catch:{ Exception -> 0x01c2 }
            r1 = r19[r15]     // Catch:{ Exception -> 0x01c2 }
            r0 = r17[r4]     // Catch:{ Exception -> 0x01c2 }
            r2 = r1
            r1 = r16
            float r0 = X.C86164wN.A03(r0, r2, r1, r15)     // Catch:{ Exception -> 0x01c2 }
            r5[r4] = r0     // Catch:{ Exception -> 0x01c2 }
            int r15 = r15 + 1
            goto L_0x00f5
        L_0x010b:
            r1 = r5[r4]     // Catch:{ Exception -> 0x01c2 }
            r0 = r18[r4]     // Catch:{ Exception -> 0x01c2 }
            float r1 = r1 + r0
            r5[r4] = r1     // Catch:{ Exception -> 0x01c2 }
            int r4 = r4 + 1
            goto L_0x00ed
        L_0x0115:
            int r9 = r5.length     // Catch:{ Exception -> 0x01c2 }
            float[] r4 = new float[r9]     // Catch:{ Exception -> 0x01c2 }
            r2 = 0
        L_0x0119:
            if (r2 >= r9) goto L_0x00d3
            r1 = 0
            r0 = r5[r2]     // Catch:{ Exception -> 0x01c2 }
            float r0 = java.lang.Math.max(r1, r0)     // Catch:{ Exception -> 0x01c2 }
            r4[r2] = r0     // Catch:{ Exception -> 0x01c2 }
            int r2 = r2 + 1
            goto L_0x0119
        L_0x0127:
            float[] r3 = r14.A00(r4, r7)     // Catch:{ Exception -> 0x01c2 }
            com.facebook.dcp.model.Matrix r0 = r8.BM5(r7)     // Catch:{ Exception -> 0x01c2 }
            float[] r15 = r8.ATH(r7)     // Catch:{ Exception -> 0x01c2 }
            float[][] r8 = r0.A00     // Catch:{ Exception -> 0x01c2 }
            int r4 = r8.length     // Catch:{ Exception -> 0x01c2 }
            float[] r7 = new float[r4]     // Catch:{ Exception -> 0x01c2 }
            r5 = 0
        L_0x0139:
            if (r5 >= r4) goto L_0x0158
            int r14 = r3.length     // Catch:{ Exception -> 0x01c2 }
            r9 = 0
        L_0x013d:
            if (r9 >= r14) goto L_0x014e
            r2 = r7[r5]     // Catch:{ Exception -> 0x01c2 }
            r1 = r3[r9]     // Catch:{ Exception -> 0x01c2 }
            r0 = r8[r5]     // Catch:{ Exception -> 0x01c2 }
            float r0 = X.C86164wN.A03(r0, r1, r2, r9)     // Catch:{ Exception -> 0x01c2 }
            r7[r5] = r0     // Catch:{ Exception -> 0x01c2 }
            int r9 = r9 + 1
            goto L_0x013d
        L_0x014e:
            r1 = r7[r5]     // Catch:{ Exception -> 0x01c2 }
            r0 = r15[r5]     // Catch:{ Exception -> 0x01c2 }
            float r1 = r1 + r0
            r7[r5] = r1     // Catch:{ Exception -> 0x01c2 }
            int r5 = r5 + 1
            goto L_0x0139
        L_0x0158:
            float[] r3 = new float[r4]     // Catch:{ Exception -> 0x01c2 }
            r5 = 0
        L_0x015b:
            if (r5 >= r4) goto L_0x0185
            r1 = r7[r5]     // Catch:{ Exception -> 0x01c2 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            float r2 = (float) r11     // Catch:{ Exception -> 0x01c2 }
            if (r0 >= 0) goto L_0x0174
            r0 = r7[r5]     // Catch:{ Exception -> 0x01c2 }
            double r0 = (double) r0     // Catch:{ Exception -> 0x01c2 }
            double r0 = java.lang.Math.exp(r0)     // Catch:{ Exception -> 0x01c2 }
            float r8 = (float) r0     // Catch:{ Exception -> 0x01c2 }
            float r8 = r8 + r2
            float r0 = r2 / r8
            float r2 = r2 - r0
        L_0x0171:
            r3[r5] = r2     // Catch:{ Exception -> 0x01c2 }
            goto L_0x0182
        L_0x0174:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = r7[r5]     // Catch:{ Exception -> 0x01c2 }
            float r0 = r0 * r1
            double r0 = (double) r0     // Catch:{ Exception -> 0x01c2 }
            double r0 = java.lang.Math.exp(r0)     // Catch:{ Exception -> 0x01c2 }
            float r8 = (float) r0     // Catch:{ Exception -> 0x01c2 }
            float r8 = r8 + r2
            float r2 = r2 / r8
            goto L_0x0171
        L_0x0182:
            int r5 = r5 + 1
            goto L_0x015b
        L_0x0185:
            java.util.ArrayList r5 = X.C18240wQ.A0k(r4)     // Catch:{ Exception -> 0x01c2 }
        L_0x0189:
            if (r6 >= r4) goto L_0x019b
            r0 = r3[r6]     // Catch:{ Exception -> 0x01c2 }
            double r0 = (double) r0     // Catch:{ Exception -> 0x01c2 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x01c2 }
            r5.add(r0)     // Catch:{ Exception -> 0x01c2 }
            int r6 = r6 + 1
            goto L_0x0189
        L_0x0198:
            X.0ZV r5 = X.AnonymousClass0ZV.A00     // Catch:{ Exception -> 0x01c2 }
            goto L_0x01aa
        L_0x019b:
            java.lang.String r2 = "prediction_computations_complete"
            r1 = r22
            r0 = r21
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2 r1 = X.C86134wK.A0N(r2, r1, r0, r11)     // Catch:{ Exception -> 0x01c2 }
            r0 = r24
            r0.A02(r13, r1, r10)     // Catch:{ Exception -> 0x01c2 }
        L_0x01aa:
            boolean r0 = r5.isEmpty()     // Catch:{ Exception -> 0x01c2 }
            boolean r1 = X.C18180wK.A1W(r0)
            boolean r0 = X.C18190wL.A1a(r5)     // Catch:{ Exception -> 0x01c2 }
            if (r0 == 0) goto L_0x01bf
            java.lang.String r0 = ""
        L_0x01ba:
            X.5Id r0 = X.AnonymousClass5Id.A01(r5, r0, r1)     // Catch:{ Exception -> 0x01c2 }
            return r0
        L_0x01bf:
            java.lang.String r0 = "params not available"
            goto L_0x01ba
        L_0x01c2:
            r0 = move-exception
            X.0ZV r1 = X.AnonymousClass0ZV.A00
            java.lang.String r0 = r0.getMessage()
            X.5Id r0 = X.AnonymousClass5Id.A01(r1, r0, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125937eJ.CX6(X.68S, java.util.List):X.5Id");
    }

    private final float[] A00(float[] fArr, int i) {
        C04530Oa r1 = this.A02.A02;
        if (((C146518mN) r1.getValue()).AT5(i).length == 0 || ((C146518mN) r1.getValue()).AT6(i).length == 0) {
            return fArr;
        }
        int length = fArr.length;
        float[] fArr2 = new float[length];
        float[] AT5 = ((C146518mN) r1.getValue()).AT5(i);
        float[] AT6 = ((C146518mN) r1.getValue()).AT6(i);
        for (int i2 = 0; i2 < length; i2++) {
            fArr2[i2] = (fArr[i2] * AT5[i2]) + AT6[i2];
        }
        return fArr2;
    }

    public C125937eJ(C121547Gq r2, C147128nR r3, C112666pz r4) {
        AnonymousClass0wJ.A1O(r3, r2);
        C04220Ms.A0B(r4, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }
}
