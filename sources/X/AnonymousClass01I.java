package X;

/* renamed from: X.01I  reason: invalid class name */
public final class AnonymousClass01I extends AnonymousClass04Z {
    public AnonymousClass04o A00;
    public boolean A01;
    public boolean A02 = false;

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b7, code lost:
        if (r2 != 0) goto L_0x0079;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x00d8 */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d8 A[SYNTHETIC, Splitter:B:64:0x00d8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass04o A04(android.content.Context r10) {
        /*
            r9 = this;
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x0007
            X.04o r4 = r9.A00
            return r4
        L_0x0007:
            X.0nZ r0 = r9.A00
            androidx.fragment.app.Fragment r8 = r0.A04
            java.lang.Integer r2 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r5 = 1
            r1 = 0
            if (r2 != r0) goto L_0x0014
            r1 = 1
        L_0x0014:
            boolean r0 = r9.A01
            int r6 = r8.getNextTransition()
            if (r0 == 0) goto L_0x00fb
            if (r1 == 0) goto L_0x00f5
            int r2 = r8.getPopEnterAnim()
        L_0x0022:
            r3 = 0
            r8.setAnimations(r3, r3, r3, r3)
            android.view.ViewGroup r0 = r8.mContainer
            r4 = 0
            if (r0 == 0) goto L_0x0039
            r7 = 2131309037(0x7f0931ed, float:1.8236346E38)
            java.lang.Object r0 = r0.getTag(r7)
            if (r0 == 0) goto L_0x0039
            android.view.ViewGroup r0 = r8.mContainer
            r0.setTag(r7, r4)
        L_0x0039:
            android.view.ViewGroup r0 = r8.mContainer
            if (r0 == 0) goto L_0x0048
            android.animation.LayoutTransition r0 = r0.getLayoutTransition()
            if (r0 == 0) goto L_0x0048
        L_0x0043:
            r9.A00 = r4
            r9.A02 = r5
            return r4
        L_0x0048:
            android.view.animation.Animation r0 = r8.onCreateAnimation(r6, r1, r2)
            if (r0 == 0) goto L_0x0054
            X.04o r4 = new X.04o
            r4.<init>((android.view.animation.Animation) r0)
            goto L_0x0043
        L_0x0054:
            android.animation.Animator r0 = r8.onCreateAnimator(r6, r1, r2)
            if (r0 == 0) goto L_0x0060
            X.04o r4 = new X.04o
            r4.<init>((android.animation.Animator) r0)
            goto L_0x0043
        L_0x0060:
            if (r2 != 0) goto L_0x0079
            if (r6 == 0) goto L_0x0043
            r0 = 4097(0x1001, float:5.741E-42)
            if (r6 == r0) goto L_0x00c3
            r0 = 8194(0x2002, float:1.1482E-41)
            if (r6 == r0) goto L_0x00ba
            r0 = 8197(0x2005, float:1.1486E-41)
            if (r6 == r0) goto L_0x009c
            r0 = 4099(0x1003, float:5.744E-42)
            if (r6 == r0) goto L_0x0093
            r0 = 4100(0x1004, float:5.745E-42)
            if (r6 == r0) goto L_0x008a
            r2 = -1
        L_0x0079:
            android.content.res.Resources r0 = r10.getResources()
            java.lang.String r1 = r0.getResourceTypeName(r2)
            java.lang.String r0 = "anim"
            boolean r3 = r0.equals(r1)
            if (r3 == 0) goto L_0x00d8
            goto L_0x00cc
        L_0x008a:
            r0 = 16842937(0x10100b9, float:2.3694076E-38)
            if (r1 == 0) goto L_0x00a4
            r0 = 16842936(0x10100b8, float:2.3694074E-38)
            goto L_0x00a4
        L_0x0093:
            r2 = 2130837510(0x7f020006, float:1.7279976E38)
            if (r1 == 0) goto L_0x0079
            r2 = 2130837509(0x7f020005, float:1.7279974E38)
            goto L_0x0079
        L_0x009c:
            r0 = 16842939(0x10100bb, float:2.3694082E-38)
            if (r1 == 0) goto L_0x00a4
            r0 = 16842938(0x10100ba, float:2.369408E-38)
        L_0x00a4:
            int[] r1 = new int[]{r0}
            r0 = 16973825(0x1030001, float:2.4060903E-38)
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r0, r1)
            r0 = -1
            int r2 = r1.getResourceId(r3, r0)
            r1.recycle()
            if (r2 == 0) goto L_0x0043
            goto L_0x0079
        L_0x00ba:
            r2 = 2130837508(0x7f020004, float:1.7279972E38)
            if (r1 == 0) goto L_0x0079
            r2 = 2130837507(0x7f020003, float:1.727997E38)
            goto L_0x0079
        L_0x00c3:
            r2 = 2130837512(0x7f020008, float:1.727998E38)
            if (r1 == 0) goto L_0x0079
            r2 = 2130837511(0x7f020007, float:1.7279978E38)
            goto L_0x0079
        L_0x00cc:
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r10, r2)     // Catch:{ NotFoundException -> 0x0109, RuntimeException -> 0x00d8 }
            if (r0 == 0) goto L_0x0043
            X.04o r1 = new X.04o     // Catch:{ NotFoundException -> 0x0109, RuntimeException -> 0x00d8 }
            r1.<init>((android.view.animation.Animation) r0)     // Catch:{ NotFoundException -> 0x0109, RuntimeException -> 0x00d8 }
            goto L_0x00f2
        L_0x00d8:
            android.animation.Animator r0 = android.animation.AnimatorInflater.loadAnimator(r10, r2)     // Catch:{ RuntimeException -> 0x00e4 }
            if (r0 == 0) goto L_0x0043
            X.04o r1 = new X.04o     // Catch:{ RuntimeException -> 0x00e4 }
            r1.<init>((android.animation.Animator) r0)     // Catch:{ RuntimeException -> 0x00e4 }
            goto L_0x00f2
        L_0x00e4:
            r0 = move-exception
            if (r3 != 0) goto L_0x010b
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r10, r2)
            if (r0 == 0) goto L_0x0043
            X.04o r1 = new X.04o
            r1.<init>((android.view.animation.Animation) r0)
        L_0x00f2:
            r4 = r1
            goto L_0x0043
        L_0x00f5:
            int r2 = r8.getPopExitAnim()
            goto L_0x0022
        L_0x00fb:
            if (r1 == 0) goto L_0x0103
            int r2 = r8.getEnterAnim()
            goto L_0x0022
        L_0x0103:
            int r2 = r8.getExitAnim()
            goto L_0x0022
        L_0x0109:
            r0 = move-exception
            throw r0
        L_0x010b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01I.A04(android.content.Context):X.04o");
    }

    public AnonymousClass01I(C113806sA r2, C13370nZ r3, boolean z) {
        super(r2, r3);
        this.A01 = z;
    }
}
