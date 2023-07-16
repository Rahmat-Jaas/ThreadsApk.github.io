package X;

/* renamed from: X.11X  reason: invalid class name */
public final class AnonymousClass11X extends C61803Vq {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r5 < r4) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getItemOffsets(android.graphics.Rect r7, android.view.View r8, androidx.recyclerview.widget.RecyclerView r9, X.C41006Ltt r10) {
        /*
            r6 = this;
            r1 = 0
            X.C04220Ms.A0B(r7, r1)
            X.AnonymousClass0wJ.A1O(r8, r9)
            int r5 = androidx.recyclerview.widget.RecyclerView.A03(r8)
            r0 = -1
            if (r5 == r0) goto L_0x0014
            boolean r3 = r6.A03
            if (r3 == 0) goto L_0x001d
            if (r5 != 0) goto L_0x001d
        L_0x0014:
            r7.left = r1
            r7.right = r1
        L_0x0018:
            r7.top = r1
        L_0x001a:
            r7.bottom = r1
            return
        L_0x001d:
            X.Luu r0 = r9.A0F
            if (r0 == 0) goto L_0x0031
            r2 = 5
            int r0 = r0.getItemViewType(r5)
            if (r2 != r0) goto L_0x0031
            int r0 = r6.A00
            r7.left = r0
            r7.right = r0
            r7.top = r0
            goto L_0x001a
        L_0x0031:
            if (r3 == 0) goto L_0x0035
            int r5 = r5 + -1
        L_0x0035:
            int r4 = r6.A01
            int r3 = r5 % r4
            boolean r2 = r6.A02
            int r1 = r6.A00
            int r0 = r3 * r1
            int r0 = r0 / r4
            int r0 = r1 - r0
            if (r2 == 0) goto L_0x004f
            r7.right = r0
            int r0 = r3 + 1
            int r0 = r0 * r1
            int r0 = r0 / r4
            r7.left = r0
        L_0x004c:
            if (r5 >= r4) goto L_0x001a
            goto L_0x0018
        L_0x004f:
            r7.left = r0
            int r0 = r3 + 1
            int r0 = r0 * r1
            int r0 = r0 / r4
            r7.right = r0
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11X.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.Ltt):void");
    }

    public AnonymousClass11X(int i, int i2, boolean z, boolean z2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
        this.A02 = z2;
    }
}
