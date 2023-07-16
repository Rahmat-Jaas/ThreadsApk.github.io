package X;

import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.7Rh  reason: invalid class name and case insensitive filesystem */
public final class C122347Rh implements View.OnTouchListener {
    public float A00 = Float.MAX_VALUE;
    public float A01 = Float.MAX_VALUE;
    public boolean A02 = false;
    public final GestureDetector A03;
    public final ScaleGestureDetector A04;
    public final AnonymousClass509 A05;
    public final C112366pS A06;

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bc, code lost:
        if (r2.A02(r0) != null) goto L_0x00be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c5 A[Catch:{ all -> 0x0149 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ce A[Catch:{ all -> 0x0149 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            X.6pS r0 = r11.A06
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r13)
            android.view.View r2 = r0.A00
            android.graphics.Matrix r0 = r2.getMatrix()
            r5.transform(r0)
            int r0 = r2.getLeft()
            float r1 = (float) r0
            int r0 = r2.getTop()
            float r0 = (float) r0
            r5.offsetLocation(r1, r0)
            android.view.ScaleGestureDetector r0 = r11.A04     // Catch:{ all -> 0x0149 }
            r0.onTouchEvent(r5)     // Catch:{ all -> 0x0149 }
            android.view.ViewParent r7 = r12.getParent()     // Catch:{ all -> 0x0149 }
            boolean r0 = r0.isInProgress()     // Catch:{ all -> 0x0149 }
            r6 = 1
            if (r0 == 0) goto L_0x003f
            X.509 r1 = r11.A05     // Catch:{ all -> 0x0149 }
            r0 = 44
            X.6jp r0 = r1.A02(r0)     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x003f
            if (r7 == 0) goto L_0x003d
            r7.requestDisallowInterceptTouchEvent(r6)     // Catch:{ all -> 0x0149 }
            r11.A02 = r6     // Catch:{ all -> 0x0149 }
        L_0x003d:
            r4 = 1
            goto L_0x0045
        L_0x003f:
            android.view.GestureDetector r0 = r11.A03     // Catch:{ all -> 0x0149 }
            boolean r4 = r0.onTouchEvent(r5)     // Catch:{ all -> 0x0149 }
        L_0x0045:
            int r1 = r5.getActionMasked()     // Catch:{ all -> 0x0149 }
            if (r7 == 0) goto L_0x0128
            if (r1 == 0) goto L_0x0117
            if (r1 == r6) goto L_0x00d1
            r0 = 2
            if (r1 == r0) goto L_0x0057
            r0 = 3
            if (r1 != r0) goto L_0x0128
            goto L_0x012a
        L_0x0057:
            float r0 = r11.A00     // Catch:{ all -> 0x0149 }
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00c0
            float r0 = r11.A01     // Catch:{ all -> 0x0149 }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00c0
            int r0 = r5.getPointerCount()     // Catch:{ all -> 0x0149 }
            if (r0 <= r6) goto L_0x0077
            X.509 r1 = r11.A05     // Catch:{ all -> 0x0149 }
            r0 = 44
            X.6jp r0 = r1.A02(r0)     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x0077
            goto L_0x00be
        L_0x0077:
            X.509 r2 = r11.A05     // Catch:{ all -> 0x0149 }
            boolean r0 = r2.A03     // Catch:{ all -> 0x0149 }
            if (r0 != 0) goto L_0x0081
            boolean r0 = r2.A02     // Catch:{ all -> 0x0149 }
            if (r0 != 0) goto L_0x008a
        L_0x0081:
            r0 = 48
            X.6jp r0 = r2.A02(r0)     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x008a
            goto L_0x00be
        L_0x008a:
            float r3 = r5.getX()     // Catch:{ all -> 0x0149 }
            float r0 = r11.A00     // Catch:{ all -> 0x0149 }
            float r3 = r3 - r0
            float r1 = r5.getY()     // Catch:{ all -> 0x0149 }
            float r0 = r11.A01     // Catch:{ all -> 0x0149 }
            float r1 = X.C86124wJ.A01(r1, r0)     // Catch:{ all -> 0x0149 }
            float r0 = java.lang.Math.abs(r3)     // Catch:{ all -> 0x0149 }
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ae
            r0 = 38
            X.6jp r0 = r2.A02(r0)     // Catch:{ all -> 0x0149 }
            if (r0 != 0) goto L_0x00be
            r0 = 42
            goto L_0x00b8
        L_0x00ae:
            r0 = 40
            X.6jp r0 = r2.A02(r0)     // Catch:{ all -> 0x0149 }
            if (r0 != 0) goto L_0x00be
            r0 = 41
        L_0x00b8:
            X.6jp r0 = r2.A02(r0)     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x00c0
        L_0x00be:
            r1 = 1
            goto L_0x00c1
        L_0x00c0:
            r1 = 0
        L_0x00c1:
            boolean r0 = r11.A02     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x00ce
            if (r1 != 0) goto L_0x0128
            r0 = 0
            r7.requestDisallowInterceptTouchEvent(r0)     // Catch:{ all -> 0x0149 }
            r11.A02 = r0     // Catch:{ all -> 0x0149 }
            goto L_0x0128
        L_0x00ce:
            if (r1 == 0) goto L_0x0128
            goto L_0x0123
        L_0x00d1:
            X.509 r9 = r11.A05     // Catch:{ all -> 0x0149 }
            r10 = 0
            r9.A03 = r10     // Catch:{ all -> 0x0149 }
            boolean r0 = r9.A01     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x00e7
            r0 = 53
            X.6jp r0 = r9.A02(r0)     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x00e5
            X.C122047Jt.A05(r5, r9, r0)     // Catch:{ all -> 0x0149 }
        L_0x00e5:
            r9.A01 = r10     // Catch:{ all -> 0x0149 }
        L_0x00e7:
            r0 = 50
            X.6jp r8 = r9.A02(r0)     // Catch:{ all -> 0x0149 }
            if (r8 == 0) goto L_0x012f
            X.6pS r3 = r9.A05     // Catch:{ all -> 0x0149 }
            float r2 = r5.getX()     // Catch:{ all -> 0x0149 }
            float r1 = r5.getY()     // Catch:{ all -> 0x0149 }
            android.graphics.PointF r0 = new android.graphics.PointF     // Catch:{ all -> 0x0149 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0149 }
            android.graphics.PointF r4 = r3.A00(r0)     // Catch:{ all -> 0x0149 }
            X.7h3 r3 = r9.A08     // Catch:{ all -> 0x0149 }
            X.3VO r2 = X.AnonymousClass3VO.A00()     // Catch:{ all -> 0x0149 }
            X.7h3 r0 = r9.A07     // Catch:{ all -> 0x0149 }
            r2.A02(r0, r10)     // Catch:{ all -> 0x0149 }
            X.3HX r1 = r9.A06     // Catch:{ all -> 0x0149 }
            X.3iY r0 = X.AnonymousClass509.A00(r4, r9, r2, r1)     // Catch:{ all -> 0x0149 }
            X.C122047Jt.A03(r1, r3, r0, r8)     // Catch:{ all -> 0x0149 }
            goto L_0x012f
        L_0x0117:
            float r0 = r5.getX()     // Catch:{ all -> 0x0149 }
            r11.A00 = r0     // Catch:{ all -> 0x0149 }
            float r0 = r5.getY()     // Catch:{ all -> 0x0149 }
            r11.A01 = r0     // Catch:{ all -> 0x0149 }
        L_0x0123:
            r7.requestDisallowInterceptTouchEvent(r6)     // Catch:{ all -> 0x0149 }
            r11.A02 = r6     // Catch:{ all -> 0x0149 }
        L_0x0128:
            r6 = r4
            goto L_0x0140
        L_0x012a:
            X.509 r1 = r11.A05     // Catch:{ all -> 0x0149 }
            r0 = 0
            r1.A01 = r0     // Catch:{ all -> 0x0149 }
        L_0x012f:
            boolean r0 = r11.A02     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x0139
            r0 = 0
            r7.requestDisallowInterceptTouchEvent(r0)     // Catch:{ all -> 0x0149 }
            r11.A02 = r0     // Catch:{ all -> 0x0149 }
        L_0x0139:
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r11.A01 = r0     // Catch:{ all -> 0x0149 }
            r11.A00 = r0     // Catch:{ all -> 0x0149 }
        L_0x0140:
            X.509 r1 = r11.A05     // Catch:{ all -> 0x0149 }
            r0 = 0
            r1.A02 = r0     // Catch:{ all -> 0x0149 }
            r5.recycle()
            return r6
        L_0x0149:
            r0 = move-exception
            r5.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122347Rh.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C122347Rh(GestureDetector gestureDetector, ScaleGestureDetector scaleGestureDetector, C112366pS r4, AnonymousClass509 r5) {
        this.A05 = r5;
        this.A03 = gestureDetector;
        this.A04 = scaleGestureDetector;
        this.A06 = r4;
    }
}
