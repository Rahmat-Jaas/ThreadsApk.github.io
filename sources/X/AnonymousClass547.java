package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.547  reason: invalid class name */
public final class AnonymousClass547 extends AnonymousClass798 {
    public float A00;
    public float A01;
    public AnonymousClass0ZU A02 = AnonymousClass4Zi.A00;
    public boolean A03 = true;
    public long A04 = AnonymousClass7JK.A01;
    public final C147368pE A05 = C86104wH.A0I(AnonymousClass7WR.A00, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    public final AnonymousClass548 A06;
    public final C110226lK A07 = new C110226lK();
    public final AnonymousClass0YY A08 = C86154wM.A10(this, 25);

    public AnonymousClass547() {
        AnonymousClass548 r2 = new AnonymousClass548();
        r2.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        r2.A0D = true;
        r2.A02();
        r2.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        r2.A0D = true;
        r2.A02();
        r2.A04(C86154wM.A13(this, 14));
        this.A06 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a1, code lost:
        if (X.C86104wH.A08(r0) <= r10.getHeight()) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C104136bI r30, X.C147848q1 r31, float r32) {
        /*
            r29 = this;
            r2 = r30
            r13 = 0
            r8 = r29
            if (r30 != 0) goto L_0x000f
            X.8pE r0 = r8.A05
            java.lang.Object r2 = r0.getValue()
            X.6bI r2 = (X.C104136bI) r2
        L_0x000f:
            boolean r0 = r8.A03
            r28 = r31
            if (r0 != 0) goto L_0x0038
            long r5 = r8.A04
            long r3 = r28.BCH()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0038
        L_0x001f:
            X.6lK r0 = r8.A07
            X.8n0 r3 = r0.A02
            if (r3 == 0) goto L_0x0112
            long r0 = r0.A00
            long r8 = X.C121127Eg.A01
            X.53x r4 = X.C877353x.A00
            r6 = 3
            r7 = 1
            r5 = r32
            r10 = r0
            r12 = r8
            r14 = r0
            r1 = r28
            r1.AIu(r2, r3, r4, r5, r6, r7, r8, r10, r12, r14)
            return
        L_0x0038:
            X.548 r4 = r8.A06
            long r0 = r28.BCH()
            float r1 = X.AnonymousClass7JK.A02(r0)
            float r0 = r8.A01
            float r1 = r1 / r0
            r4.A03 = r1
            r3 = 1
            r4.A0D = r3
            r4.A02()
            float r1 = X.C147848q1.A00(r28)
            float r0 = r8.A00
            float r1 = r1 / r0
            r4.A04 = r1
            r4.A0D = r3
            r4.A02()
            X.6lK r9 = r8.A07
            long r3 = r28.BCH()
            float r0 = X.AnonymousClass7JK.A02(r3)
            int r1 = X.C86124wJ.A03(r0)
            float r0 = X.AnonymousClass7JK.A00(r3)
            int r0 = X.C86124wJ.A03(r0)
            long r0 = X.AnonymousClass7FV.A00(r1, r0)
            X.69J r3 = r28.getLayoutDirection()
            X.0YY r12 = r8.A08
            X.AnonymousClass0wJ.A1Q(r3, r12)
            r4 = r28
            r9.A03 = r4
            X.8n0 r7 = r9.A02
            X.8mg r6 = r9.A01
            if (r7 == 0) goto L_0x00a3
            if (r6 == 0) goto L_0x00a3
            int r5 = X.C86104wH.A07(r0)
            r4 = r7
            X.Gmy r4 = (X.C31336Gmy) r4
            android.graphics.Bitmap r10 = r4.A00
            int r4 = r10.getWidth()
            if (r5 > r4) goto L_0x00a3
            int r5 = X.C86104wH.A08(r0)
            int r4 = r10.getHeight()
            if (r5 <= r4) goto L_0x00b9
        L_0x00a3:
            int r6 = X.C86104wH.A07(r0)
            int r5 = X.C86104wH.A08(r0)
            r4 = 28
            X.8n0 r7 = X.C29102Fi4.A00(r6, r5, r13, r4)
            X.8mg r6 = X.C98086Ed.A00(r7)
            r9.A02 = r7
            r9.A01 = r6
        L_0x00b9:
            r9.A00 = r0
            X.7XA r9 = r9.A04
            long r0 = X.AnonymousClass7FV.A02(r0)
            X.7El r5 = r9.A02
            X.8nV r4 = r5.A02
            r27 = r4
            X.69J r15 = r5.A03
            X.8mg r14 = r5.A01
            long r10 = r5.A00
            r4 = r28
            r5.A02 = r4
            r5.A03 = r3
            r5.A01 = r6
            r5.A00 = r0
            r6.Cfm()
            long r21 = X.AnonymousClass7KE.A01
            r17 = 0
            long r0 = X.AnonymousClass7KC.A03
            long r3 = r9.BCH()
            long r25 = X.C115886w4.A00(r3, r0)
            r19 = 1065353216(0x3f800000, float:1.0)
            X.53x r18 = X.C877353x.A00
            r16 = r9
            r20 = r13
            r23 = r0
            r16.AJA(r17, r18, r19, r20, r21, r23, r25)
            r12.invoke(r9)
            r0 = r27
            X.C121167El.A01(r6, r5, r0, r15)
            r5.A01 = r14
            r5.A00 = r10
            X.Gmy r7 = (X.C31336Gmy) r7
            android.graphics.Bitmap r0 = r7.A00
            r0.prepareToDraw()
            r8.A03 = r13
            long r0 = r28.BCH()
            r8.A04 = r0
            goto L_0x001f
        L_0x0112:
            java.lang.String r0 = "drawCachedImage must be invoked first before attempting to draw the result into another destination"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass547.A05(X.6bI, X.8q1, float):void");
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Params: ");
        A0s.append("\tname: ");
        A0s.append(this.A06.A09);
        A0s.append("\n");
        A0s.append("\tviewportWidth: ");
        A0s.append(this.A01);
        A0s.append("\n");
        A0s.append("\tviewportHeight: ");
        A0s.append(this.A00);
        String A0i = C18180wK.A0i("\n", A0s);
        C04220Ms.A06(A0i);
        return A0i;
    }
}
