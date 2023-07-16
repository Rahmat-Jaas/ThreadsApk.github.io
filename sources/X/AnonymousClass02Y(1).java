package X;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.02Y  reason: invalid class name */
public final class AnonymousClass02Y {
    public ViewParent A00;
    public ViewParent A01;
    public boolean A02;
    public int[] A03;
    public final View A04;

    public static boolean A00(AnonymousClass02Y r8, int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5) {
        ViewParent viewParent;
        int i6;
        int i7;
        AnonymousClass02Y r1 = r8;
        if (r8.A02) {
            if (i5 == 0) {
                viewParent = r8.A01;
            } else if (i5 == 1) {
                viewParent = r8.A00;
            }
            if (viewParent != null) {
                int[] iArr3 = iArr;
                if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                    if (iArr != null) {
                        r1.A04.getLocationInWindow(iArr);
                        i6 = iArr[0];
                        i7 = iArr[1];
                    } else {
                        i6 = 0;
                        i7 = 0;
                    }
                    if (iArr2 == null) {
                        iArr2 = r1.A03;
                        if (iArr2 == null) {
                            iArr2 = new int[2];
                            r1.A03 = iArr2;
                        }
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                    }
                    View view = r1.A04;
                    if (viewParent instanceof AnonymousClass0S2) {
                        ((AnonymousClass0S2) viewParent).C8n(view, iArr2, i, i2, i3, i4, i5);
                    } else {
                        iArr2[0] = iArr2[0] + i3;
                        iArr2[1] = iArr2[1] + i4;
                        if (viewParent instanceof AnonymousClass035) {
                            ((AnonymousClass035) viewParent).C8m(view, i, i2, i3, i4, i5);
                        } else if (i5 == 0) {
                            try {
                                viewParent.onNestedScroll(view, i, i2, i3, i4);
                            } catch (AbstractMethodError e) {
                                StringBuilder sb = new StringBuilder("ViewParent ");
                                sb.append(viewParent);
                                sb.append(" does not implement interface method onNestedScroll");
                                Log.e("ViewParentCompat", sb.toString(), e);
                            }
                        }
                    }
                    if (iArr3 != null) {
                        view.getLocationInWindow(iArr3);
                        iArr3[0] = iArr3[0] - i6;
                        iArr3[1] = iArr3[1] - i7;
                    }
                    return true;
                } else if (iArr != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                }
            }
        }
        return false;
    }

    public final boolean A06(int i, int i2, int i3, int i4, int[] iArr) {
        return A00(this, iArr, (int[]) null, i, i2, i3, i4, 0);
    }

    public final boolean A07(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        ViewParent viewParent;
        int i4;
        int i5;
        int[] iArr3 = iArr;
        if (this.A02) {
            int i6 = i3;
            if (i3 == 0) {
                viewParent = this.A01;
            } else if (i6 == 1) {
                viewParent = this.A00;
            }
            if (viewParent != null) {
                int i7 = i2;
                int i8 = i;
                if (i != 0 || i2 != 0) {
                    if (iArr2 != null) {
                        this.A04.getLocationInWindow(iArr2);
                        i4 = iArr2[0];
                        i5 = iArr2[1];
                    } else {
                        i4 = 0;
                        i5 = 0;
                    }
                    if (iArr == null && (iArr3 = this.A03) == null) {
                        iArr3 = new int[2];
                        this.A03 = iArr3;
                    }
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    View view = this.A04;
                    if (viewParent instanceof AnonymousClass035) {
                        ((AnonymousClass035) viewParent).C8l(view, iArr3, i8, i7, i6);
                    } else if (i3 == 0) {
                        try {
                            viewParent.onNestedPreScroll(view, i8, i7, iArr3);
                        } catch (AbstractMethodError e) {
                            StringBuilder sb = new StringBuilder("ViewParent ");
                            sb.append(viewParent);
                            sb.append(" does not implement interface method onNestedPreScroll");
                            Log.e("ViewParentCompat", sb.toString(), e);
                        }
                    }
                    if (iArr2 != null) {
                        view.getLocationInWindow(iArr2);
                        iArr2[0] = iArr2[0] - i4;
                        iArr2[1] = iArr2[1] - i5;
                    }
                    if (!(iArr3[0] == 0 && iArr3[1] == 0)) {
                        return true;
                    }
                } else if (iArr2 != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                }
            }
        }
        return false;
    }

    public final void A01(int i) {
        ViewParent viewParent;
        if (i == 0) {
            viewParent = this.A01;
        } else if (i == 1) {
            viewParent = this.A00;
        } else {
            return;
        }
        if (viewParent != null) {
            View view = this.A04;
            if (viewParent instanceof AnonymousClass035) {
                ((AnonymousClass035) viewParent).CMY(view, i);
            } else if (i == 0) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onStopNestedScroll");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            }
            if (i != 0) {
                this.A00 = null;
            } else {
                this.A01 = null;
            }
        }
    }

    public final void A02(boolean z) {
        if (this.A02) {
            this.A04.stopNestedScroll();
        }
        this.A02 = z;
    }

    public final boolean A03(float f, float f2) {
        ViewParent viewParent;
        if (!this.A02 || (viewParent = this.A01) == null) {
            return false;
        }
        try {
            return viewParent.onNestedPreFling(this.A04, f, f2);
        } catch (AbstractMethodError e) {
            StringBuilder sb = new StringBuilder("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onNestedPreFling");
            Log.e("ViewParentCompat", sb.toString(), e);
            return false;
        }
    }

    public final boolean A04(float f, float f2, boolean z) {
        ViewParent viewParent;
        if (!this.A02 || (viewParent = this.A01) == null) {
            return false;
        }
        try {
            return viewParent.onNestedFling(this.A04, f, f2, z);
        } catch (AbstractMethodError e) {
            StringBuilder sb = new StringBuilder("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onNestedFling");
            Log.e("ViewParentCompat", sb.toString(), e);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r0 == null) goto L_0x000a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0065 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(int r8, int r9) {
        /*
            r7 = this;
            if (r9 == 0) goto L_0x006a
            r0 = 1
            if (r9 != r0) goto L_0x000a
            android.view.ViewParent r0 = r7.A00
        L_0x0007:
            r1 = 1
            if (r0 != 0) goto L_0x000b
        L_0x000a:
            r1 = 0
        L_0x000b:
            r3 = 1
            if (r1 != 0) goto L_0x0037
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x008c
            android.view.View r6 = r7.A04
            android.view.ViewParent r4 = r6.getParent()
            r5 = r6
        L_0x0019:
            if (r4 == 0) goto L_0x008c
            boolean r0 = r4 instanceof X.AnonymousClass035
            if (r0 == 0) goto L_0x003e
            r0 = r4
            X.035 r0 = (X.AnonymousClass035) r0
            boolean r0 = r0.CM1(r5, r6, r8, r9)
        L_0x0026:
            if (r0 == 0) goto L_0x005e
            if (r9 == 0) goto L_0x003b
            if (r9 != r3) goto L_0x002e
            r7.A00 = r4
        L_0x002e:
            boolean r0 = r4 instanceof X.AnonymousClass035
            if (r0 == 0) goto L_0x0038
            X.035 r4 = (X.AnonymousClass035) r4
            r4.C8o(r5, r6, r8, r9)
        L_0x0037:
            return r3
        L_0x0038:
            if (r9 != 0) goto L_0x0037
            goto L_0x006d
        L_0x003b:
            r7.A01 = r4
            goto L_0x002e
        L_0x003e:
            if (r9 != 0) goto L_0x005e
            boolean r0 = r4.onStartNestedScroll(r5, r6, r8)     // Catch:{ AbstractMethodError -> 0x0045 }
            goto L_0x0026
        L_0x0045:
            r2 = move-exception
            java.lang.String r0 = "ViewParent "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = " does not implement interface method onStartNestedScroll"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ViewParentCompat"
            android.util.Log.e(r0, r1, r2)
        L_0x005e:
            boolean r0 = r4 instanceof android.view.View
            if (r0 == 0) goto L_0x0065
            r5 = r4
            android.view.View r5 = (android.view.View) r5
        L_0x0065:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0019
        L_0x006a:
            android.view.ViewParent r0 = r7.A01
            goto L_0x0007
        L_0x006d:
            r4.onNestedScrollAccepted(r5, r6, r8)     // Catch:{ AbstractMethodError -> 0x0071 }
            goto L_0x008b
        L_0x0071:
            r2 = move-exception
            java.lang.String r0 = "ViewParent "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = " does not implement interface method onNestedScrollAccepted"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ViewParentCompat"
            android.util.Log.e(r0, r1, r2)
            return r3
        L_0x008b:
            return r3
        L_0x008c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02Y.A05(int, int):boolean");
    }

    public AnonymousClass02Y(View view) {
        this.A04 = view;
    }
}
