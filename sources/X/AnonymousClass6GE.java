package X;

/* renamed from: X.6GE  reason: invalid class name */
public final class AnonymousClass6GE {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (r0 == 0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b4, code lost:
        if ((r1 + r0) >= r8) goto L_0x00b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x013a A[EDGE_INSN: B:116:0x013a->B:84:0x013a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass601 r14, X.C63893iY r15) {
        /*
            r1 = 0
            boolean r0 = X.AnonymousClass0wJ.A1Z(r15, r14)
            java.lang.Object r3 = X.C63893iY.A0B(r15, r1)
            r3.getClass()
            X.7h3 r3 = (X.C127397h3) r3
            java.util.List r1 = r15.A00
            java.lang.String r4 = X.C18190wL.A0q(r1, r0)
            r0 = 2
            java.lang.String r9 = X.C18190wL.A0q(r1, r0)
            if (r9 != 0) goto L_0x001d
            java.lang.String r9 = "start"
        L_0x001d:
            X.3HX r0 = r14.A00
            if (r0 == 0) goto L_0x01da
            java.util.LinkedHashMap r2 = X.C18220wO.A0y()
            java.lang.Object r7 = X.AnonymousClass7K7.A04(r0, r3)
            X.7qj r7 = (X.C130767qj) r7
            if (r7 == 0) goto L_0x01d9
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            X.6n2 r0 = r7.A03
            androidx.recyclerview.widget.RecyclerView r1 = r0.A07
            if (r1 == 0) goto L_0x01d9
            X.M6x r6 = r1.A0H
            if (r6 == 0) goto L_0x01d9
            boolean r0 = r6 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r14 = 0
            if (r0 == 0) goto L_0x012f
            r0 = r6
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.A01
        L_0x0045:
            if (r0 != 0) goto L_0x0048
        L_0x0047:
            r14 = 1
        L_0x0048:
            androidx.recyclerview.widget.RecyclerView r0 = r6.A08
            int r0 = r0.getLayoutDirection()
            boolean r13 = X.C18180wK.A1W(r0)
            if (r4 != 0) goto L_0x00ed
            r8 = 0
        L_0x0055:
            boolean r1 = r6 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r1 != 0) goto L_0x00ea
            boolean r0 = r6 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x00ea
            r0 = r6
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r5 = r0.A1i()
        L_0x0064:
            r4 = r5
            if (r1 != 0) goto L_0x00e8
            boolean r0 = r6 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x00e8
            r0 = r6
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r3 = r0.A1j()
        L_0x0072:
            r0 = -1
            if (r5 == r0) goto L_0x01d9
            if (r3 == r0) goto L_0x01d9
            java.lang.String r0 = "end"
            boolean r12 = r9.equals(r0)
            if (r12 == 0) goto L_0x0080
            r5 = r3
        L_0x0080:
            android.view.View r11 = r6.A0q(r5)
            android.view.ViewGroup$MarginLayoutParams r9 = X.C130767qj.A09
            r15 = r9
        L_0x0087:
            if (r11 == 0) goto L_0x013a
            if (r5 < r4) goto L_0x013a
            if (r5 > r3) goto L_0x013a
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00e6
            android.view.ViewGroup$LayoutParams r9 = r11.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
        L_0x009b:
            r10 = 1
            if (r14 == 0) goto L_0x00d4
            if (r13 == 0) goto L_0x00c4
            int r1 = r11.getLeft()
            int r0 = r9.getMarginStart()
            int r1 = r1 - r0
            if (r1 > r8) goto L_0x00e4
            int r1 = r11.getRight()
        L_0x00af:
            int r0 = r9.getMarginEnd()
        L_0x00b3:
            int r1 = r1 + r0
            if (r1 < r8) goto L_0x00e4
        L_0x00b6:
            if (r10 != 0) goto L_0x013a
            if (r12 == 0) goto L_0x00c1
            int r5 = r5 + -1
        L_0x00bc:
            android.view.View r11 = r6.A0q(r5)
            goto L_0x0087
        L_0x00c1:
            int r5 = r5 + 1
            goto L_0x00bc
        L_0x00c4:
            int r1 = r11.getRight()
            int r0 = r9.getMarginStart()
            int r1 = r1 - r0
            if (r1 > r8) goto L_0x00e4
            int r1 = r11.getLeft()
            goto L_0x00af
        L_0x00d4:
            int r1 = r11.getTop()
            int r0 = r9.topMargin
            int r1 = r1 - r0
            if (r1 > r8) goto L_0x00e4
            int r1 = r11.getBottom()
            int r0 = r9.bottomMargin
            goto L_0x00b3
        L_0x00e4:
            r10 = 0
            goto L_0x00b6
        L_0x00e6:
            r9 = r15
            goto L_0x009b
        L_0x00e8:
            r3 = -1
            goto L_0x0072
        L_0x00ea:
            r5 = -1
            goto L_0x0064
        L_0x00ed:
            if (r14 == 0) goto L_0x00f0
            goto L_0x00f5
        L_0x00f0:
            int r3 = r1.getHeight()     // Catch:{ 1zB -> 0x0125 }
            goto L_0x00f9
        L_0x00f5:
            int r3 = r1.getWidth()     // Catch:{ 1zB -> 0x0125 }
        L_0x00f9:
            boolean r0 = X.C86144wL.A1Y(r4)     // Catch:{ 1zB -> 0x0125 }
            if (r0 == 0) goto L_0x011b
            float r0 = X.AnonymousClass7Kk.A00(r4)     // Catch:{ 1zB -> 0x0125 }
            float r1 = (float) r3     // Catch:{ 1zB -> 0x0125 }
            float r1 = r1 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
        L_0x0108:
            r0 = 0
            float r0 = java.lang.Math.max(r0, r1)     // Catch:{ 1zB -> 0x0125 }
            float r3 = (float) r3     // Catch:{ 1zB -> 0x0125 }
            float r1 = java.lang.Math.min(r3, r0)     // Catch:{ 1zB -> 0x0125 }
            java.lang.String r0 = "end"
            boolean r0 = r9.equals(r0)     // Catch:{ 1zB -> 0x0125 }
            if (r0 == 0) goto L_0x0122
            goto L_0x0120
        L_0x011b:
            float r1 = X.AnonymousClass7Kk.A01(r4)     // Catch:{ 1zB -> 0x0125 }
            goto L_0x0108
        L_0x0120:
            float r1 = r3 - r1
        L_0x0122:
            int r8 = (int) r1     // Catch:{ 1zB -> 0x0125 }
            goto L_0x0055
        L_0x0125:
            java.lang.String r1 = "CollectionBinderUtils"
            java.lang.String r0 = "Error parsing offset"
            X.C30967GcS.A02(r1, r0)
            r8 = 0
            goto L_0x0055
        L_0x012f:
            boolean r0 = r6 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r0 == 0) goto L_0x0047
            r0 = r6
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            int r0 = r0.A02
            goto L_0x0045
        L_0x013a:
            if (r11 == 0) goto L_0x01d9
            int r4 = r11.getWidth()
            int r0 = r9.getMarginStart()
            int r4 = r4 + r0
            int r0 = r9.getMarginEnd()
            int r4 = r4 + r0
            int r3 = r11.getHeight()
            int r0 = r9.topMargin
            int r3 = r3 + r0
            int r0 = r9.bottomMargin
            int r3 = r3 + r0
            if (r14 == 0) goto L_0x01c6
            if (r13 == 0) goto L_0x01bd
            int r6 = r11.getLeft()
            int r1 = r11.getRight()
        L_0x0160:
            if (r12 == 0) goto L_0x01b5
            int r0 = r9.leftMargin
        L_0x0164:
            int r6 = r6 + r0
            int r8 = r8 - r6
        L_0x0166:
            r6 = 1065353216(0x3f800000, float:1.0)
            float r1 = (float) r8
            float r0 = (float) r3
            if (r14 == 0) goto L_0x016d
            float r0 = (float) r4
        L_0x016d:
            float r1 = r1 / r0
            float r6 = r6 - r1
            X.5fZ r0 = r7.A02
            java.util.List r1 = r0.A03
            if (r5 < 0) goto L_0x01b3
            int r0 = r1.size()
            if (r5 >= r0) goto L_0x01b3
            java.lang.Object r0 = r1.get(r5)
            X.6hm r0 = (X.C108076hm) r0
            X.7h3 r0 = r0.A01
            java.lang.String r1 = r0.A0M()
        L_0x0187:
            if (r1 == 0) goto L_0x018e
            java.lang.String r0 = "visibleItemId"
            r2.put(r0, r1)
        L_0x018e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = "visibleItemIndex"
            r2.put(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = "visibleItemWidth"
            r2.put(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = "visibleItemHeight"
            r2.put(r0, r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r6)
            java.lang.String r0 = "visibleItemFractionFromOffset"
            r2.put(r0, r1)
            return r2
        L_0x01b3:
            r1 = 0
            goto L_0x0187
        L_0x01b5:
            int r0 = r9.getMarginEnd()
            int r1 = r1 + r0
            int r8 = r1 - r8
            goto L_0x0166
        L_0x01bd:
            int r6 = r11.getRight()
            int r1 = r11.getLeft()
            goto L_0x0160
        L_0x01c6:
            if (r12 == 0) goto L_0x01cf
            int r6 = r11.getTop()
            int r0 = r9.topMargin
            goto L_0x0164
        L_0x01cf:
            int r1 = r11.getBottom()
            int r0 = r9.bottomMargin
            int r1 = r1 + r0
            int r1 = r1 - r8
            r8 = r1
            goto L_0x0166
        L_0x01d9:
            return r2
        L_0x01da:
            java.lang.String r0 = "Called GetVisibleCollectionItemAt when not attached to a tree"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6GE.A00(X.601, X.3iY):java.lang.Object");
    }
}
