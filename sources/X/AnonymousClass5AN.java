package X;

/* renamed from: X.5AN  reason: invalid class name */
public final class AnonymousClass5AN extends C61803Vq {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5AN) && C04220Ms.A0I(this.A00, ((AnonymousClass5AN) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A03(this.A00) * 31 * 31;
    }

    public AnonymousClass5AN(Integer num) {
        this.A00 = num;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r2.A08.getLayoutDirection() != r3) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getItemOffsets(android.graphics.Rect r10, android.view.View r11, androidx.recyclerview.widget.RecyclerView r12, X.C41006Ltt r13) {
        /*
            r9 = this;
            boolean r3 = X.AnonymousClass0wJ.A1Z(r10, r11)
            r0 = 2
            X.C04220Ms.A0B(r12, r0)
            X.M6x r2 = r12.A0H
            boolean r0 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x0055
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            if (r2 == 0) goto L_0x0055
            int r0 = r2.A01
            r8 = 1
            r6 = 0
            r7 = 0
            if (r0 != 0) goto L_0x0023
            r7 = 1
            androidx.recyclerview.widget.RecyclerView r0 = r2.A08
            int r1 = r0.getLayoutDirection()
            r0 = 1
            if (r1 == r3) goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            boolean r5 = r2.A08
            r5 = r5 ^ r0
            java.lang.Integer r0 = r9.A00
            int r4 = X.C18210wN.A03(r0)
            int r3 = androidx.recyclerview.widget.RecyclerView.A03(r11)
            r2 = -1
            if (r3 == r2) goto L_0x0055
            boolean r1 = X.C18180wK.A1W(r3)
            X.Luu r0 = r12.A0F
            if (r0 == 0) goto L_0x0042
            int r0 = r0.getItemCount()
            int r2 = r0 + -1
        L_0x0042:
            if (r3 == r2) goto L_0x0045
            r8 = 0
        L_0x0045:
            if (r1 == 0) goto L_0x004d
            if (r5 == 0) goto L_0x0062
            r10.right = r6
            r10.bottom = r6
        L_0x004d:
            if (r8 == 0) goto L_0x0056
            if (r5 == 0) goto L_0x0070
            r10.left = r6
        L_0x0053:
            r10.top = r6
        L_0x0055:
            return
        L_0x0056:
            r0 = 0
            if (r5 == 0) goto L_0x0067
            if (r7 == 0) goto L_0x005c
            r0 = r4
        L_0x005c:
            r10.left = r0
            if (r7 != 0) goto L_0x0053
            r6 = r4
            goto L_0x0053
        L_0x0062:
            r10.left = r6
            r10.top = r6
            goto L_0x004d
        L_0x0067:
            if (r7 == 0) goto L_0x006a
            r0 = r4
        L_0x006a:
            r10.right = r0
            if (r7 != 0) goto L_0x0072
            r6 = r4
            goto L_0x0072
        L_0x0070:
            r10.right = r6
        L_0x0072:
            r10.bottom = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5AN.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.Ltt):void");
    }

    public AnonymousClass5AN() {
        this((Integer) null);
    }
}
