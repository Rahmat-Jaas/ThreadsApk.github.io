package X;

/* renamed from: X.828  reason: invalid class name */
public final class AnonymousClass828 implements Runnable {
    public final /* synthetic */ AnonymousClass7r0 A00;
    public final /* synthetic */ AnonymousClass3HX A01;
    public final /* synthetic */ String A02;

    public AnonymousClass828(AnonymousClass7r0 r1, AnonymousClass3HX r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c9, code lost:
        X.C102596Vu.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cc, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            X.7r0 r4 = r13.A00
            X.3HX r0 = r13.A01
            android.content.Context r3 = r0.A00
            X.C04220Ms.A06(r3)
            java.lang.String r1 = r13.A02
            r0 = 2
            kotlin.jvm.internal.KtLambdaShape6S1100000_I2 r2 = new kotlin.jvm.internal.KtLambdaShape6S1100000_I2
            r2.<init>(r1, r4, r0)
            boolean r0 = X.AnonymousClass6G8.A00()
            if (r0 == 0) goto L_0x00cd
            android.content.Context r0 = r3.getApplicationContext()
            android.content.ContentResolver r6 = r0.getContentResolver()
            java.lang.String r0 = "external"
            android.net.Uri r7 = android.provider.MediaStore.Files.getContentUri(r0)
            java.lang.String r5 = "bucket_id"
            r0 = 473(0x1d9, float:6.63E-43)
            java.lang.String r4 = X.C28174Ezk.A00(r0)
            java.lang.String[] r10 = new java.lang.String[]{r5, r4}
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            java.lang.String r8 = X.AnonymousClass6G9.A00(r0)
            java.lang.String r0 = "Querying albums:\n        |uri = "
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            r1.append(r7)
            java.lang.String r0 = ",\n        |projection = "
            r1.append(r0)
            java.lang.String r0 = java.util.Arrays.toString(r10)
            X.C04220Ms.A06(r0)
            r1.append(r0)
            java.lang.String r0 = "\n      "
            java.lang.String r1 = X.C18180wK.A0i(r0, r1)
            r9 = 0
            java.lang.String r0 = "|"
            X.AnonymousClass4n8.A09(r1, r0)
            r12 = 732311764(0x2ba630d4, float:1.1808562E-12)
            r11 = r9
            android.database.Cursor r3 = X.C13960oa.A00(r6, r7, r8, r9, r10, r11, r12)
            if (r3 == 0) goto L_0x00cd
            int r0 = r3.getCount()     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00c2
            int r8 = r3.getColumnIndex(r5)     // Catch:{ all -> 0x00c6 }
            int r7 = r3.getColumnIndex(r4)     // Catch:{ all -> 0x00c6 }
            java.util.LinkedHashMap r6 = X.C18220wO.A0y()     // Catch:{ all -> 0x00c6 }
        L_0x0077:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00af
            int r9 = r3.getInt(r8)     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = r3.getString(r7)     // Catch:{ all -> 0x00c6 }
            if (r5 == 0) goto L_0x0077
            boolean r0 = X.AnonymousClass8bQ.A0m(r5)     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x0077
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00c6 }
            boolean r0 = r6.containsKey(r4)     // Catch:{ all -> 0x00c6 }
            if (r0 != 0) goto L_0x0077
            java.lang.String r1 = "id"
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00c6 }
            kotlin.Pair r1 = X.C18180wK.A0p(r1, r0)     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = "name"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r5)     // Catch:{ all -> 0x00c6 }
            java.util.Map r0 = X.AnonymousClass4WJ.A0G(r1, r0)     // Catch:{ all -> 0x00c6 }
            r6.put(r4, r0)     // Catch:{ all -> 0x00c6 }
            goto L_0x0077
        L_0x00af:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x00c6 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00c2
            java.util.Collection r0 = r6.values()     // Catch:{ all -> 0x00c6 }
            java.util.List r0 = X.AnonymousClass00J.A0N(r0)     // Catch:{ all -> 0x00c6 }
            r2.invoke(r0)     // Catch:{ all -> 0x00c6 }
        L_0x00c2:
            r3.close()
            return
        L_0x00c6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r0 = move-exception
            X.C102596Vu.A00(r3, r1)
            throw r0
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass828.run():void");
    }
}
