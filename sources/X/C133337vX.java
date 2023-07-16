package X;

/* renamed from: X.7vX  reason: invalid class name and case insensitive filesystem */
public final class C133337vX implements C148708ri {
    public boolean A00;
    public final C146418mD A01;

    public final void Cly(boolean z) {
        this.A00 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0103, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010a, code lost:
        X.C102596Vu.A00(r3, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object then(java.lang.Object r13) {
        /*
            r12 = this;
            X.GJX r13 = (X.GJX) r13
            if (r13 == 0) goto L_0x011a
            X.8rm r0 = r13.A00()     // Catch:{ 6CF -> 0x010e }
            if (r0 == 0) goto L_0x0105
            java.io.InputStream r3 = r0.AUn()     // Catch:{ 6CF -> 0x010e }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0101 }
            r0.<init>(r3)     // Catch:{ all -> 0x0101 }
            java.lang.String r1 = X.AnonymousClass6JG.A00(r0)     // Catch:{ all -> 0x0101 }
            if (r1 == 0) goto L_0x00db
            int r0 = r1.length()     // Catch:{ all -> 0x0101 }
            if (r0 == 0) goto L_0x00db
            X.8mD r8 = r12.A01     // Catch:{ all -> 0x0101 }
            boolean r10 = r12.A00     // Catch:{ all -> 0x0101 }
            java.lang.Class r7 = r8.getTreeModelType()     // Catch:{ all -> 0x0101 }
            org.json.JSONObject r6 = X.C18250wR.A0j(r1)     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = "error"
            org.json.JSONObject r9 = r6.optJSONObject(r0)     // Catch:{ all -> 0x0101 }
            if (r9 != 0) goto L_0x00a4
            java.lang.String r0 = "errors"
            org.json.JSONArray r5 = r6.optJSONArray(r0)     // Catch:{ all -> 0x0101 }
            if (r5 == 0) goto L_0x007d
            int r0 = r5.length()     // Catch:{ all -> 0x0101 }
            if (r0 <= 0) goto L_0x007d
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x0101 }
            r2 = 0
        L_0x0046:
            int r0 = r5.length()     // Catch:{ all -> 0x0101 }
            if (r2 >= r0) goto L_0x005b
            org.json.JSONObject r1 = r5.getJSONObject(r2)     // Catch:{ all -> 0x0101 }
            X.7el r0 = new X.7el     // Catch:{ all -> 0x0101 }
            r0.<init>(r1)     // Catch:{ all -> 0x0101 }
            r4.add(r0)     // Catch:{ all -> 0x0101 }
            int r2 = r2 + 1
            goto L_0x0046
        L_0x005b:
            r9 = 0
            java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x0101 }
        L_0x0060:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0101 }
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0101 }
            X.8lh r0 = (X.C146138lh) r0     // Catch:{ all -> 0x0101 }
            java.lang.String r1 = r0.BAh()     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = "CRITICAL"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0101 }
            if (r0 == 0) goto L_0x0060
            r9 = 1
        L_0x0079:
            if (r10 == 0) goto L_0x00c7
            if (r9 != 0) goto L_0x00c7
        L_0x007d:
            java.lang.String r0 = "data"
            org.json.JSONObject r1 = r6.optJSONObject(r0)     // Catch:{ all -> 0x0101 }
            if (r1 == 0) goto L_0x008c
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            java.lang.Object r2 = X.C86134wK.A0h(r0, r7, r1)     // Catch:{ all -> 0x0101 }
            goto L_0x00dc
        L_0x008c:
            java.lang.String r2 = r8.getCallName()     // Catch:{ all -> 0x0101 }
            java.lang.String r1 = " Response Error: missing or invalid 'data' in response: "
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0101 }
            java.lang.String r1 = X.AnonymousClass00U.A0V(r2, r1, r0)     // Catch:{ all -> 0x0101 }
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()     // Catch:{ all -> 0x0101 }
            X.6CF r2 = new X.6CF     // Catch:{ all -> 0x0101 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0101 }
            goto L_0x00da
        L_0x00a4:
            java.lang.String r5 = r8.getCallName()     // Catch:{ all -> 0x0101 }
            java.lang.String r4 = " Response Error: "
            java.lang.String r2 = r9.toString()     // Catch:{ all -> 0x0101 }
            java.lang.String r1 = " in response: "
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0101 }
            java.lang.String r1 = X.AnonymousClass00U.A0h(r5, r4, r2, r1, r0)     // Catch:{ all -> 0x0101 }
            X.7el r0 = new X.7el     // Catch:{ all -> 0x0101 }
            r0.<init>(r9)     // Catch:{ all -> 0x0101 }
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r0)     // Catch:{ all -> 0x0101 }
            X.6CF r2 = new X.6CF     // Catch:{ all -> 0x0101 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0101 }
            goto L_0x00da
        L_0x00c7:
            java.lang.String r2 = r8.getCallName()     // Catch:{ all -> 0x0101 }
            java.lang.String r1 = " Response Errors: "
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = X.AnonymousClass00U.A0V(r2, r1, r0)     // Catch:{ all -> 0x0101 }
            X.6CF r2 = new X.6CF     // Catch:{ all -> 0x0101 }
            r2.<init>(r0, r4)     // Catch:{ all -> 0x0101 }
        L_0x00da:
            throw r2     // Catch:{ all -> 0x0101 }
        L_0x00db:
            r2 = 0
        L_0x00dc:
            r3.close()     // Catch:{ 6CF -> 0x010e }
            r0 = 6
            java.lang.String r0 = X.I17.A00(r0)
            X.3Ud r0 = r13.A01(r0)
            if (r0 == 0) goto L_0x00fe
            java.lang.String r4 = "fresh_cache"
        L_0x00ec:
            r5 = 1
            r6 = 0
            com.facebook.pando.Summary r3 = new com.facebook.pando.Summary
            r8 = r6
            r10 = r6
            r3.<init>(r4, r5, r6, r8, r10)
            int r1 = r13.A02
            X.5z0 r0 = new X.5z0
            r0.<init>(r3, r2, r1)
            return r0
        L_0x00fe:
            java.lang.String r4 = "network"
            goto L_0x00ec
        L_0x0101:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0103 }
        L_0x0103:
            r0 = move-exception
            goto L_0x010a
        L_0x0105:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()     // Catch:{ 6CF -> 0x010e }
            goto L_0x010d
        L_0x010a:
            X.C102596Vu.A00(r3, r1)     // Catch:{ 6CF -> 0x010e }
        L_0x010d:
            throw r0     // Catch:{ 6CF -> 0x010e }
        L_0x010e:
            r0 = move-exception
            com.google.common.collect.ImmutableList r1 = r0.A00
            X.C04220Ms.A06(r1)
            X.6CK r0 = new X.6CK
            r0.<init>(r1)
            throw r0
        L_0x011a:
            java.lang.String r0 = "Something went wrong parsing the response"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133337vX.then(java.lang.Object):java.lang.Object");
    }

    public C133337vX(C146418mD r1) {
        this.A01 = r1;
    }
}
