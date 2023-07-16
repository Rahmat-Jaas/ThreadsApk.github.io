package X;

import android.graphics.Rect;

/* renamed from: X.7Hj  reason: invalid class name and case insensitive filesystem */
public final class C121677Hj {
    public static int A00(Rect rect, Rect rect2, int i) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw C18190wL.A0a("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i2 - i3);
    }

    public static int A01(Rect rect, Rect rect2, int i) {
        int i2;
        int i3;
        int i4;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw C18190wL.A0a("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            i2 = rect.left + (rect.width() >> 1);
            i3 = rect2.left;
            i4 = rect2.width();
            return Math.abs(i2 - (i3 + (i4 >> 1)));
        }
        i2 = rect.top + (rect.height() >> 1);
        i3 = rect2.top;
        i4 = rect2.height();
        return Math.abs(i2 - (i3 + (i4 >> 1)));
    }

    public static boolean A02(Rect rect, Rect rect2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i == 17) {
            int i6 = rect.right;
            int i7 = rect2.right;
            if (i6 <= i7 && rect.left < i7) {
                return false;
            }
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i != 33) {
            if (i == 66) {
                int i8 = rect.left;
                int i9 = rect2.left;
                if (i8 >= i9 && rect.right > i9) {
                    return false;
                }
                i4 = rect.right;
                i5 = rect2.right;
            } else if (i == 130) {
                int i10 = rect.top;
                int i11 = rect2.top;
                if (i10 >= i11 && rect.bottom > i11) {
                    return false;
                }
                i4 = rect.bottom;
                i5 = rect2.bottom;
            } else {
                throw C18190wL.A0a("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            if (i4 < i5) {
                return true;
            }
            return false;
        } else {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            if (i12 <= i13 && rect.top < i13) {
                return false;
            }
            i2 = rect.top;
            i3 = rect2.top;
        }
        if (i2 > i3) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(android.graphics.Rect r3, android.graphics.Rect r4, int r5) {
        /*
            r0 = 17
            r2 = 1
            if (r5 == r0) goto L_0x0023
            r0 = 33
            if (r5 == r0) goto L_0x0018
            r0 = 66
            if (r5 == r0) goto L_0x0023
            r0 = 130(0x82, float:1.82E-43)
            if (r5 == r0) goto L_0x0018
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0018:
            int r1 = r4.right
            int r0 = r3.left
            if (r1 < r0) goto L_0x0030
            int r1 = r4.left
            int r0 = r3.right
            goto L_0x002d
        L_0x0023:
            int r1 = r4.bottom
            int r0 = r3.top
            if (r1 < r0) goto L_0x0030
            int r1 = r4.top
            int r0 = r3.bottom
        L_0x002d:
            if (r1 > r0) goto L_0x0030
            return r2
        L_0x0030:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121677Hj.A03(android.graphics.Rect, android.graphics.Rect, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r1 <= r0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0062, code lost:
        if (r1 < r0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0065, code lost:
        r2 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(android.graphics.Rect r5, android.graphics.Rect r6, android.graphics.Rect r7, int r8) {
        /*
            boolean r1 = A03(r5, r6, r8)
            boolean r0 = A03(r5, r7, r8)
            r4 = 0
            if (r0 != 0) goto L_0x0049
            if (r1 == 0) goto L_0x0049
            r0 = 17
            r2 = 1
            if (r8 == r0) goto L_0x0059
            r0 = 33
            if (r8 == r0) goto L_0x005e
            r0 = 66
            if (r8 == r0) goto L_0x0054
            r0 = 130(0x82, float:1.82E-43)
            if (r8 != r0) goto L_0x006f
            int r1 = r5.bottom
            int r0 = r7.top
        L_0x0022:
            if (r1 > r0) goto L_0x0065
        L_0x0024:
            r3 = 1
            if (r2 == 0) goto L_0x006e
            r0 = 17
            if (r8 == r0) goto L_0x006e
            r1 = 66
            if (r8 == r1) goto L_0x006e
            int r2 = A00(r5, r6, r8)
            r0 = 33
            if (r8 == r0) goto L_0x004f
            if (r8 == r1) goto L_0x004a
            r0 = 130(0x82, float:1.82E-43)
            if (r8 != r0) goto L_0x0067
            int r1 = r7.bottom
            int r0 = r5.bottom
        L_0x0041:
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r3, r1)
            if (r2 >= r0) goto L_0x0049
            r4 = 1
        L_0x0049:
            return r4
        L_0x004a:
            int r1 = r7.right
            int r0 = r5.right
            goto L_0x0041
        L_0x004f:
            int r1 = r5.top
            int r0 = r7.top
            goto L_0x0041
        L_0x0054:
            int r1 = r5.right
            int r0 = r7.left
            goto L_0x0022
        L_0x0059:
            int r1 = r5.left
            int r0 = r7.right
            goto L_0x0062
        L_0x005e:
            int r1 = r5.top
            int r0 = r7.bottom
        L_0x0062:
            if (r1 < r0) goto L_0x0065
            goto L_0x0024
        L_0x0065:
            r2 = 0
            goto L_0x0024
        L_0x0067:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x006e:
            return r3
        L_0x006f:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121677Hj.A04(android.graphics.Rect, android.graphics.Rect, android.graphics.Rect, int):boolean");
    }
}
