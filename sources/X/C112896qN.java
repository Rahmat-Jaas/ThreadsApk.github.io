package X;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import java.util.List;

/* renamed from: X.6qN  reason: invalid class name and case insensitive filesystem */
public final class C112896qN {
    public int A00 = -1;
    public int A01 = -1;
    public long A02;
    public final SparseBooleanArray A03 = new SparseBooleanArray();
    public final SparseLongArray A04 = new SparseLongArray();
    public final List A05 = AnonymousClass0wJ.A0v();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (r2 == 9) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f0, code lost:
        if (r11 != 4) goto L_0x00f2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C106806fe A00(android.view.MotionEvent r44, X.C142948fr r45) {
        /*
            r43 = this;
            r3 = 1
            r4 = r44
            int r2 = r4.getActionMasked()
            r9 = 3
            r5 = r43
            if (r2 != r9) goto L_0x0018
            android.util.SparseLongArray r0 = r5.A04
            r0.clear()
            android.util.SparseBooleanArray r0 = r5.A03
            r0.clear()
            r1 = 0
            return r1
        L_0x0018:
            int r0 = r4.getPointerCount()
            if (r0 != r3) goto L_0x003d
            r0 = 0
            int r6 = r4.getToolType(r0)
            int r1 = r4.getSource()
            int r0 = r5.A01
            if (r6 != r0) goto L_0x002f
            int r0 = r5.A00
            if (r1 == r0) goto L_0x003d
        L_0x002f:
            r5.A01 = r6
            r5.A00 = r1
            android.util.SparseBooleanArray r0 = r5.A03
            r0.clear()
            android.util.SparseLongArray r0 = r5.A04
            r0.clear()
        L_0x003d:
            int r1 = r4.getActionMasked()
            r24 = 1
            if (r1 == 0) goto L_0x01b3
            r0 = 5
            if (r1 == r0) goto L_0x01b3
            r0 = 9
            if (r1 != r0) goto L_0x0062
            r0 = 0
            int r10 = r4.getPointerId(r0)
            android.util.SparseLongArray r8 = r5.A04
            int r0 = r8.indexOfKey(r10)
            if (r0 >= 0) goto L_0x0062
            long r0 = r5.A02
            long r6 = r24 + r0
            r5.A02 = r6
            r8.put(r10, r0)
        L_0x0062:
            r0 = 10
            if (r2 == r0) goto L_0x006f
            r0 = 7
            if (r2 == r0) goto L_0x006f
            r0 = 9
            r23 = 0
            if (r2 != r0) goto L_0x0071
        L_0x006f:
            r23 = 1
        L_0x0071:
            r22 = 8
            r0 = r22
            boolean r21 = X.AnonymousClass0wJ.A1T(r2, r0)
            if (r23 == 0) goto L_0x0088
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            android.util.SparseBooleanArray r0 = r5.A03
            r0.put(r1, r3)
        L_0x0088:
            if (r2 == r3) goto L_0x01b0
            r0 = 6
            if (r2 == r0) goto L_0x01aa
            r8 = -1
        L_0x008e:
            java.util.List r0 = r5.A05
            r42 = r0
            r42.clear()
            int r20 = r4.getPointerCount()
            r2 = 0
        L_0x009a:
            r0 = r20
            if (r2 >= r0) goto L_0x01d9
            if (r23 != 0) goto L_0x01a6
            if (r2 == r8) goto L_0x01a6
            if (r21 == 0) goto L_0x00aa
            int r0 = r4.getButtonState()
            if (r0 == 0) goto L_0x01a6
        L_0x00aa:
            r40 = 1
        L_0x00ac:
            int r11 = r4.getPointerId(r2)
            android.util.SparseLongArray r10 = r5.A04
            int r0 = r10.indexOfKey(r11)
            if (r0 < 0) goto L_0x019b
            long r6 = r10.valueAt(r0)
        L_0x00bc:
            float r28 = r4.getPressure(r2)
            float r1 = r4.getX(r2)
            float r0 = r4.getY(r2)
            long r18 = X.C86104wH.A0C(r1, r0)
            r10 = r45
            if (r2 != 0) goto L_0x0187
            float r1 = r4.getRawX()
            float r0 = r4.getRawY()
            long r0 = X.C86104wH.A0C(r1, r0)
        L_0x00dc:
            long r18 = X.AnonymousClass7FN.A02(r10, r0)
        L_0x00e0:
            int r11 = r4.getToolType(r2)
            if (r11 == 0) goto L_0x00f2
            if (r11 == r3) goto L_0x0183
            r10 = 2
            if (r11 == r10) goto L_0x017f
            if (r11 == r9) goto L_0x017b
            r10 = 4
            r29 = 4
            if (r11 == r10) goto L_0x00f4
        L_0x00f2:
            r29 = 0
        L_0x00f4:
            java.util.ArrayList r17 = X.AnonymousClass0wJ.A0v()
            int r16 = r4.getHistorySize()
            r11 = 0
        L_0x00fd:
            r10 = r16
            if (r11 >= r10) goto L_0x0136
            float r12 = r4.getHistoricalX(r2, r11)
            float r10 = r4.getHistoricalY(r2, r11)
            boolean r13 = java.lang.Float.isInfinite(r12)
            if (r13 != 0) goto L_0x0133
            boolean r13 = java.lang.Float.isNaN(r12)
            if (r13 != 0) goto L_0x0133
            boolean r13 = java.lang.Float.isInfinite(r10)
            if (r13 != 0) goto L_0x0133
            boolean r13 = java.lang.Float.isNaN(r10)
            if (r13 != 0) goto L_0x0133
            long r14 = r4.getHistoricalEventTime(r11)
            long r12 = X.C86104wH.A0C(r12, r10)
            X.6oq r10 = new X.6oq
            r10.<init>(r14, r12)
            r12 = r17
            r12.add(r10)
        L_0x0133:
            int r11 = r11 + 1
            goto L_0x00fd
        L_0x0136:
            int r11 = r4.getActionMasked()
            r10 = r22
            if (r11 != r10) goto L_0x0178
            r10 = 10
            float r12 = r4.getAxisValue(r10)
            r10 = 9
            float r10 = r4.getAxisValue(r10)
            float r11 = -r10
            r10 = 0
            float r11 = r11 + r10
            long r38 = X.C86104wH.A0C(r12, r11)
        L_0x0151:
            android.util.SparseBooleanArray r12 = r5.A03
            int r11 = r4.getPointerId(r2)
            r10 = 0
            boolean r41 = r12.get(r11, r10)
            long r32 = r4.getEventTime()
            X.6uy r10 = new X.6uy
            r26 = r10
            r27 = r17
            r30 = r6
            r34 = r0
            r36 = r18
            r26.<init>(r27, r28, r29, r30, r32, r34, r36, r38, r40, r41)
            r0 = r42
            r0.add(r10)
            int r2 = r2 + 1
            goto L_0x009a
        L_0x0178:
            long r38 = X.AnonymousClass7KC.A03
            goto L_0x0151
        L_0x017b:
            r29 = 2
            goto L_0x00f4
        L_0x017f:
            r29 = 3
            goto L_0x00f4
        L_0x0183:
            r29 = 1
            goto L_0x00f4
        L_0x0187:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0193
            long r0 = X.C98196Eo.A00(r4, r2)
            goto L_0x00dc
        L_0x0193:
            r0 = r18
            long r0 = r10.Bb1(r0)
            goto L_0x00e0
        L_0x019b:
            long r6 = r5.A02
            long r0 = r24 + r6
            r5.A02 = r0
            r10.put(r11, r6)
            goto L_0x00bc
        L_0x01a6:
            r40 = 0
            goto L_0x00ac
        L_0x01aa:
            int r8 = r4.getActionIndex()
            goto L_0x008e
        L_0x01b0:
            r8 = 0
            goto L_0x008e
        L_0x01b3:
            int r11 = r4.getActionIndex()
            int r10 = r4.getPointerId(r11)
            android.util.SparseLongArray r8 = r5.A04
            int r0 = r8.indexOfKey(r10)
            if (r0 >= 0) goto L_0x0062
            long r0 = r5.A02
            long r6 = r24 + r0
            r5.A02 = r6
            r8.put(r10, r0)
            int r0 = r4.getToolType(r11)
            if (r0 != r9) goto L_0x0062
            android.util.SparseBooleanArray r0 = r5.A03
            r0.put(r10, r3)
            goto L_0x0062
        L_0x01d9:
            int r1 = r4.getActionMasked()
            if (r1 == r3) goto L_0x0215
            r0 = 6
            if (r1 == r0) goto L_0x0215
        L_0x01e2:
            android.util.SparseLongArray r7 = r5.A04
            int r1 = r7.size()
            int r0 = r4.getPointerCount()
            if (r1 <= r0) goto L_0x022f
            int r6 = r7.size()
            int r6 = r6 - r3
        L_0x01f3:
            r0 = -1
            if (r0 >= r6) goto L_0x022f
            int r3 = r7.keyAt(r6)
            int r2 = r4.getPointerCount()
            r1 = 0
        L_0x01ff:
            if (r1 >= r2) goto L_0x020a
            int r0 = r4.getPointerId(r1)
            if (r0 == r3) goto L_0x0212
            int r1 = r1 + 1
            goto L_0x01ff
        L_0x020a:
            r7.removeAt(r6)
            android.util.SparseBooleanArray r0 = r5.A03
            r0.delete(r3)
        L_0x0212:
            int r6 = r6 + -1
            goto L_0x01f3
        L_0x0215:
            int r0 = r4.getActionIndex()
            int r2 = r4.getPointerId(r0)
            android.util.SparseBooleanArray r1 = r5.A03
            r0 = 0
            boolean r0 = r1.get(r2, r0)
            if (r0 != 0) goto L_0x01e2
            android.util.SparseLongArray r0 = r5.A04
            r0.delete(r2)
            r1.delete(r2)
            goto L_0x01e2
        L_0x022f:
            r4.getEventTime()
            X.6fe r1 = new X.6fe
            r0 = r42
            r1.<init>(r4, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112896qN.A00(android.view.MotionEvent, X.8fr):X.6fe");
    }
}
