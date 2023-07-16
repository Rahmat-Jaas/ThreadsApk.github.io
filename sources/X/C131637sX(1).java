package X;

/* renamed from: X.7sX  reason: invalid class name and case insensitive filesystem */
public final class C131637sX implements C82414pa {
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0128, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object AKb(X.C63893iY r7, X.C105926eD r8, X.C110486ll r9) {
        /*
            r6 = this;
            java.lang.String r1 = r8.A00     // Catch:{ all -> 0x0129 }
            X.C41228M0s.A01(r1)     // Catch:{ all -> 0x0129 }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x0129 }
            r2 = -1
            switch(r0) {
                case -1814595434: goto L_0x00b1;
                case -1354940068: goto L_0x00bc;
                case -1073187624: goto L_0x00c7;
                case -267542603: goto L_0x00d2;
                case 444030908: goto L_0x00dd;
                case 920099319: goto L_0x00e8;
                default: goto L_0x000d;
            }     // Catch:{ all -> 0x0129 }
        L_0x000d:
            java.lang.String r5 = "Pando GraphQL Module not found"
            java.lang.String r4 = "gql"
            r3 = 0
            switch(r2) {
                case 0: goto L_0x00f3;
                case 1: goto L_0x0021;
                case 2: goto L_0x0108;
                case 3: goto L_0x0044;
                case 4: goto L_0x007a;
                case 5: goto L_0x011b;
                default: goto L_0x0015;
            }     // Catch:{ all -> 0x0129 }
        L_0x0015:
            java.lang.String r0 = "Unknown function "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r1)     // Catch:{ all -> 0x0129 }
            X.4VX r0 = new X.4VX     // Catch:{ all -> 0x0129 }
            r0.<init>(r1)     // Catch:{ all -> 0x0129 }
        L_0x0020:
            throw r0     // Catch:{ all -> 0x0129 }
        L_0x0021:
            r0 = 0
            java.util.List r2 = r7.A00     // Catch:{ all -> 0x0129 }
            java.lang.Object r1 = r2.get(r0)     // Catch:{ all -> 0x0129 }
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1     // Catch:{ all -> 0x0129 }
            r0 = 1
            java.lang.String r2 = X.C18190wL.A0q(r2, r0)     // Catch:{ all -> 0x0129 }
            if (r1 == 0) goto L_0x0037
            java.lang.Object r3 = r1.getField_UNTYPED(r2)     // Catch:{ all -> 0x0129 }
            goto L_0x0125
        L_0x0037:
            java.lang.String r1 = "Tried to read field '"
            java.lang.String r0 = "' on null tree."
            java.lang.String r0 = X.AnonymousClass00U.A0V(r1, r2, r0)     // Catch:{ all -> 0x0129 }
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)     // Catch:{ all -> 0x0129 }
            goto L_0x0020
        L_0x0044:
            r0 = 0
            java.util.List r1 = r7.A00     // Catch:{ all -> 0x0129 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0129 }
            X.3HX r0 = (X.AnonymousClass3HX) r0     // Catch:{ all -> 0x0129 }
            java.lang.Object r2 = X.C86134wK.A0k(r1)     // Catch:{ all -> 0x0129 }
            com.facebook.pando.TreeUpdaterJNI r2 = (com.facebook.pando.TreeUpdaterJNI) r2     // Catch:{ all -> 0x0129 }
            if (r2 == 0) goto L_0x0073
            X.8ij r1 = X.AnonymousClass7K7.A02(r0, r4)     // Catch:{ all -> 0x0129 }
            if (r1 == 0) goto L_0x006e
            boolean r0 = r1 instanceof X.AnonymousClass7r1     // Catch:{ all -> 0x0129 }
            if (r0 == 0) goto L_0x006e
            X.7r1 r1 = (X.AnonymousClass7r1) r1     // Catch:{ all -> 0x0129 }
            X.6pD r0 = r1.A00     // Catch:{ all -> 0x0129 }
            java.lang.Object r0 = r0.A00()     // Catch:{ all -> 0x0129 }
            com.facebook.pando.IPandoGraphQLService r0 = (com.facebook.pando.IPandoGraphQLService) r0     // Catch:{ all -> 0x0129 }
            r0.publishTreeUpdater(r2)     // Catch:{ all -> 0x0129 }
            goto L_0x0125
        L_0x006e:
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r5)     // Catch:{ all -> 0x0129 }
            goto L_0x0020
        L_0x0073:
            java.lang.String r0 = "Tried to publish null TreeUpdater"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)     // Catch:{ all -> 0x0129 }
            goto L_0x0020
        L_0x007a:
            r0 = 0
            java.util.List r2 = r7.A00     // Catch:{ all -> 0x0129 }
            java.lang.Object r1 = r2.get(r0)     // Catch:{ all -> 0x0129 }
            X.3HX r1 = (X.AnonymousClass3HX) r1     // Catch:{ all -> 0x0129 }
            r0 = 1
            java.lang.String r2 = X.C18190wL.A0q(r2, r0)     // Catch:{ all -> 0x0129 }
            if (r2 == 0) goto L_0x00a9
            X.8ij r1 = X.AnonymousClass7K7.A02(r1, r4)     // Catch:{ all -> 0x0129 }
            if (r1 == 0) goto L_0x00a3
            boolean r0 = r1 instanceof X.AnonymousClass7r1     // Catch:{ all -> 0x0129 }
            if (r0 == 0) goto L_0x00a3
            X.7r1 r1 = (X.AnonymousClass7r1) r1     // Catch:{ all -> 0x0129 }
            X.6pD r0 = r1.A00     // Catch:{ all -> 0x0129 }
            java.lang.Object r0 = r0.A00()     // Catch:{ all -> 0x0129 }
            com.facebook.pando.IPandoGraphQLService r0 = (com.facebook.pando.IPandoGraphQLService) r0     // Catch:{ all -> 0x0129 }
            r0.publish(r2)     // Catch:{ all -> 0x0129 }
            goto L_0x0125
        L_0x00a3:
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r5)     // Catch:{ all -> 0x0129 }
            goto L_0x0020
        L_0x00a9:
            java.lang.String r0 = "Tried to publish a null GraphQL payload to Pando."
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)     // Catch:{ all -> 0x0129 }
            goto L_0x0020
        L_0x00b1:
            java.lang.String r0 = "bk.action.pando.CreateTreeUpdater"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0129 }
            if (r0 == 0) goto L_0x000d
            r2 = 0
            goto L_0x000d
        L_0x00bc:
            java.lang.String r0 = "bk.action.bloks.ReadPandoField"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0129 }
            if (r0 == 0) goto L_0x000d
            r2 = 1
            goto L_0x000d
        L_0x00c7:
            java.lang.String r0 = "bk.action.pando.CreateRawTreeUpdater"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0129 }
            if (r0 == 0) goto L_0x000d
            r2 = 2
            goto L_0x000d
        L_0x00d2:
            java.lang.String r0 = "bk.action.pando.PublishTreeUpdater"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0129 }
            if (r0 == 0) goto L_0x000d
            r2 = 3
            goto L_0x000d
        L_0x00dd:
            java.lang.String r0 = "bk.action.bloks.pando.PublishGraphQLJSON"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0129 }
            if (r0 == 0) goto L_0x000d
            r2 = 4
            goto L_0x000d
        L_0x00e8:
            java.lang.String r0 = "bk.action.pando.MaybeUpdateActiveFields"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0129 }
            if (r0 == 0) goto L_0x000d
            r2 = 5
            goto L_0x000d
        L_0x00f3:
            r1 = 0
            java.util.List r0 = r7.A00     // Catch:{ all -> 0x0129 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0129 }
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1     // Catch:{ all -> 0x0129 }
            java.lang.Object r0 = X.C86134wK.A0k(r0)     // Catch:{ all -> 0x0129 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0129 }
            com.facebook.pando.TreeUpdaterJNI r3 = new com.facebook.pando.TreeUpdaterJNI     // Catch:{ all -> 0x0129 }
            r3.<init>((java.util.Map) r0, (com.facebook.pando.TreeJNI) r1)     // Catch:{ all -> 0x0129 }
            goto L_0x0125
        L_0x0108:
            r1 = 0
            java.util.List r0 = r7.A00     // Catch:{ all -> 0x0129 }
            java.lang.String r1 = X.C18190wL.A0q(r0, r1)     // Catch:{ all -> 0x0129 }
            java.lang.Object r0 = X.C86134wK.A0k(r0)     // Catch:{ all -> 0x0129 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0129 }
            com.facebook.pando.TreeUpdaterJNI r3 = new com.facebook.pando.TreeUpdaterJNI     // Catch:{ all -> 0x0129 }
            r3.<init>((java.lang.String) r1, (java.util.Map) r0)     // Catch:{ all -> 0x0129 }
            goto L_0x0125
        L_0x011b:
            r0 = 0
            java.lang.Object r0 = X.C63893iY.A0B(r7, r0)     // Catch:{ all -> 0x0129 }
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0     // Catch:{ all -> 0x0129 }
            r0.maybeUpdateActiveFields()     // Catch:{ all -> 0x0129 }
        L_0x0125:
            X.C41228M0s.A00()
            return r3
        L_0x0129:
            r0 = move-exception
            X.C41228M0s.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131637sX.AKb(X.3iY, X.6eD, X.6ll):java.lang.Object");
    }
}
