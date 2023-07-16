package X;

import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.7Rg  reason: invalid class name and case insensitive filesystem */
public final class C122337Rg implements View.OnTouchListener {
    public C104326bb A00;
    public final AnonymousClass3HX A01;
    public final C127397h3 A02;
    public final C127397h3 A03;
    public final float A04;

    public C122337Rg(AnonymousClass3HX r2, C127397h3 r3, C127397h3 r4) {
        this.A03 = r3;
        this.A01 = r2;
        this.A02 = r4;
        this.A00 = (C104326bb) AnonymousClass7K7.A04(r2, r3);
        this.A04 = (float) ViewConfiguration.get(r2.A00).getScaledTouchSlop();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        if (r6.A00.A00 == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r1 != 4) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            int r1 = r8.getAction()
            r4 = 0
            if (r1 == 0) goto L_0x0015
            r0 = 1
            if (r1 == r0) goto L_0x003e
            r0 = 3
            if (r1 == r0) goto L_0x009a
            r0 = 4
            if (r1 == r0) goto L_0x009a
        L_0x0010:
            X.6bb r0 = r6.A00
            boolean r0 = r0.A00
            return r0
        L_0x0015:
            X.7h3 r3 = r6.A03
            X.6jp r2 = X.C127397h3.A08(r3)
            if (r2 != 0) goto L_0x001e
            return r4
        L_0x001e:
            X.3VO r1 = X.AnonymousClass3VO.A00()
            X.7h3 r0 = r6.A02
            X.3iY r1 = X.C86154wM.A0S(r1, r0, r4)
            X.3HX r0 = r6.A01
            java.lang.Object r2 = X.C122047Jt.A03(r0, r3, r1, r2)
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 != 0) goto L_0x00a5
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 != 0) goto L_0x00a5
            java.lang.String r1 = "bk.components.FoaTouchExtension"
            java.lang.String r0 = "Got non-boolean result while evaluating touch down expression"
            X.C30967GcS.A02(r1, r0)
            goto L_0x0094
        L_0x003e:
            X.6bb r0 = r6.A00
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0010
            float r5 = r8.getX()
            float r3 = r8.getY()
            float r2 = r6.A04
            X.C04220Ms.A0B(r7, r4)
            float r1 = -r2
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00a0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00a0
            int r1 = r7.getRight()
            int r0 = r7.getLeft()
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 + r2
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a0
            int r1 = r7.getBottom()
            int r0 = r7.getTop()
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 + r2
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a0
            X.7h3 r5 = r6.A03
            r0 = 38
        L_0x007c:
            X.6jp r3 = r5.A0L(r0)
            if (r3 == 0) goto L_0x0094
            X.3VO r2 = X.AnonymousClass3VO.A00()
            X.7h3 r0 = r6.A02
            r2.A03(r0, r4)
            r1 = 1
            X.3HX r0 = r6.A01
            r2.A03(r0, r1)
            X.C122047Jt.A07(r0, r5, r2, r3)
        L_0x0094:
            X.6bb r0 = r6.A00
            r0.A00 = r4
            goto L_0x0010
        L_0x009a:
            X.6bb r0 = r6.A00
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0010
        L_0x00a0:
            X.7h3 r5 = r6.A03
            r0 = 35
            goto L_0x007c
        L_0x00a5:
            X.6bb r1 = r6.A00
            boolean r0 = X.AnonymousClass3WF.A02(r2)
            r1.A00 = r0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122337Rg.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
