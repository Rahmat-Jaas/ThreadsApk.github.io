package X;

/* renamed from: X.879  reason: invalid class name */
public final class AnonymousClass879 implements C83234r0 {
    public final /* synthetic */ C972268l A00;
    public final /* synthetic */ AnonymousClass56Y A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass879(C972268l r1, AnonymousClass56Y r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        if (r0.A00 == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        if (r1 == null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r11, X.C146958n9 r12) {
        /*
            r10 = this;
            X.DZz r11 = (X.C24787DZz) r11
            boolean r0 = r11 instanceof X.C23401CrQ
            r6 = 1
            if (r0 == 0) goto L_0x0043
            r0 = r11
            X.CrQ r0 = (X.C23401CrQ) r0
            java.lang.Object r7 = r0.A00
            X.CJx r7 = (X.C22164CJx) r7
            X.56Y r5 = r10.A01
            X.4wE r4 = r5.A0B
            java.lang.Object r0 = r4.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r0
            java.lang.Object r1 = r0.A00
            X.68G r0 = X.AnonymousClass68G.LOADING_MORE
            if (r1 != r0) goto L_0x00bd
            X.68G r8 = X.AnonymousClass68G.LOADED
        L_0x0020:
            java.util.Map r1 = r5.A0A
            X.68l r0 = r10.A00
            r1.put(r0, r7)
        L_0x0027:
            java.lang.Object r3 = r4.getValue()
            java.util.List r1 = r7.A0A
            java.util.List r0 = r7.A0C
            X.8s2 r2 = X.C25603Doe.A01(r1, r0)
            com.instagram.newsfeed.data.ActivityPagedData r0 = r5.A01
            if (r0 == 0) goto L_0x003c
            java.lang.Object r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            boolean r0 = X.C86154wM.A1a(r8, r3, r2, r4, r0)
            if (r0 == 0) goto L_0x0027
        L_0x0043:
            boolean r0 = r11 instanceof X.C23402CrR
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r7 = r11.A00()
            X.CJx r7 = (X.C22164CJx) r7
            X.56Y r5 = r10.A01
            X.4wE r4 = r5.A0B
            X.68l r3 = r10.A00
        L_0x0053:
            java.lang.Object r8 = r4.getValue()
            r9 = r8
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r9 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r9
            if (r7 == 0) goto L_0x00b0
            java.util.List r1 = r7.A0A
            if (r1 == 0) goto L_0x00a5
            boolean r0 = X.C18190wL.A1a(r1)
            if (r0 != r6) goto L_0x00a5
        L_0x0066:
            java.util.Map r0 = r5.A0A
            r0.put(r3, r7)
            java.util.List r0 = r7.A0C
            X.8s2 r2 = X.C25603Doe.A01(r1, r0)
            com.instagram.newsfeed.data.ActivityPagedData r0 = r5.A01
            if (r0 == 0) goto L_0x007a
            java.lang.Object r0 = r0.A00
            r1 = 1
            if (r0 != 0) goto L_0x007b
        L_0x007a:
            r1 = 0
        L_0x007b:
            X.68G r0 = X.AnonymousClass68G.LOADED
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2.A00(r0, r2, r1)
        L_0x0081:
            boolean r0 = r4.ADi(r8, r0)
            if (r0 == 0) goto L_0x0053
            java.lang.String r1 = r3.name()
            X.CrR r11 = (X.C23402CrR) r11
            java.lang.Throwable r0 = r11.A00
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = r0.getMessage()
        L_0x0095:
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r0}
            java.lang.String r1 = "ActivityFeedViewModel"
            java.lang.String r0 = "Fail to load activity feed for filter %s, error message: %s"
            X.AnonymousClass0LU.A0N(r1, r0, r2)
        L_0x00a0:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x00a3:
            r0 = 0
            goto L_0x0095
        L_0x00a5:
            java.util.List r0 = r7.A0C
            if (r0 == 0) goto L_0x00b0
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 != r6) goto L_0x00b0
            goto L_0x0066
        L_0x00b0:
            X.68G r2 = X.AnonymousClass68G.ERROR
            java.lang.Object r1 = r9.A01
            X.8s2 r1 = (X.AnonymousClass8s2) r1
            boolean r0 = r9.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2.A00(r2, r1, r0)
            goto L_0x0081
        L_0x00bd:
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x00c5
            X.68G r8 = X.AnonymousClass68G.SILENT_REFRESHED
            goto L_0x0020
        L_0x00c5:
            X.68G r8 = X.AnonymousClass68G.REFRESHED
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass879.emit(java.lang.Object, X.8n9):java.lang.Object");
    }
}
