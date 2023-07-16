package X;

import java.util.concurrent.Executor;

/* renamed from: X.7r1  reason: invalid class name */
public final class AnonymousClass7r1 implements C144578ij {
    public static final Executor A01 = new C1368984x();
    public final C112226pD A00;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0186, code lost:
        r16.setPublishMode(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018b, code lost:
        if (r1 != X.AnonymousClass68Z.STALE) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018d, code lost:
        r16.setPerformOptimisticMerge(true);
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C108136hs Cr0(X.AnonymousClass3HX r28, X.AnonymousClass7HV r29, X.AnonymousClass73X r30, X.AnonymousClass769 r31, X.C110486ll r32) {
        /*
            r27 = this;
            r15 = r27
            X.6pD r0 = r15.A00
            java.lang.Object r7 = r0.A00()
            com.facebook.pando.IPandoGraphQLService r7 = (com.facebook.pando.IPandoGraphQLService) r7
            r1 = r31
            java.util.Map r8 = r1.A02
            java.lang.String r0 = "data"
            java.lang.String r6 = X.C18220wO.A0r(r0, r8)
            r10 = 0
            if (r6 != 0) goto L_0x001d
            X.6hs r1 = new X.6hs
            r1.<init>(r10, r10)
            return r1
        L_0x001d:
            java.lang.String r5 = r1.A00
            X.7gH r4 = new X.7gH
            r0 = r29
            r4.<init>(r0, r5)
            java.lang.String r2 = "query_name"
            java.lang.Object r1 = X.AnonymousClass6G4.A00(r2, r8)
            if (r1 != 0) goto L_0x0062
            java.lang.String r1 = ""
        L_0x0030:
            java.lang.String r0 = "doc_id"
            java.lang.Object r0 = X.AnonymousClass6G4.A00(r0, r8)
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = ""
        L_0x003a:
            X.7fj r14 = new X.7fj
            r14.<init>(r1, r0)
            java.lang.Object r9 = X.AnonymousClass6G4.A00(r2, r8)
            if (r9 != 0) goto L_0x005a
            java.lang.String r9 = ""
        L_0x0047:
            java.lang.String r0 = "variables"
            java.lang.Object r0 = r8.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x0080
            java.lang.String r0 = "variables_expr"
            java.lang.String r1 = X.C18220wO.A0r(r0, r8)
            if (r1 == 0) goto L_0x007c
            goto L_0x0065
        L_0x005a:
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x0047
        L_0x005d:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x003a
        L_0x0062:
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0030
        L_0x0065:
            com.instagram.common.lispy.lang.BloksScript r0 = new com.instagram.common.lispy.lang.BloksScript     // Catch:{ 6C9 -> 0x007c }
            r0.<init>(r1)     // Catch:{ 6C9 -> 0x007c }
            X.6jp r1 = new X.6jp     // Catch:{ 6C9 -> 0x007c }
            r1.<init>(r0, r10, r10)     // Catch:{ 6C9 -> 0x007c }
            X.3iY r0 = X.C63893iY.A01     // Catch:{ 6C9 -> 0x007c }
            r2 = r32
            java.lang.Object r0 = X.AnonymousClass70N.A00(r0, r2, r1)     // Catch:{ 6C9 -> 0x007c }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ 6C9 -> 0x007c }
            if (r0 == 0) goto L_0x007c
            goto L_0x0080
        L_0x007c:
            java.util.Map r0 = java.util.Collections.emptyMap()
        L_0x0080:
            java.util.Map r20 = java.util.Collections.emptyMap()
            java.lang.Class<com.facebook.pando.TreeJNI> r21 = com.facebook.pando.TreeJNI.class
            java.lang.String r3 = "metadata"
            java.lang.Object r1 = r8.get(r3)
            if (r1 == 0) goto L_0x0197
            java.lang.Object r11 = r8.get(r3)
            java.util.Map r11 = (java.util.Map) r11
            java.lang.String r2 = "live_query"
            boolean r1 = r11.containsKey(r2)
            if (r1 == 0) goto L_0x0197
            java.lang.Object r13 = r11.get(r2)
            java.util.Map r13 = (java.util.Map) r13
            java.lang.String r1 = "config_id"
            boolean r2 = r13.containsKey(r1)
            java.lang.String r12 = ""
            if (r2 == 0) goto L_0x0194
            java.lang.String r11 = X.C18220wO.A0r(r1, r13)
        L_0x00b0:
            java.lang.String r1 = "digest"
            boolean r2 = r13.containsKey(r1)
            if (r2 == 0) goto L_0x0191
            java.lang.String r2 = X.C18220wO.A0r(r1, r13)
        L_0x00bc:
            java.lang.String r1 = "priming_token"
            boolean r16 = r13.containsKey(r1)
            if (r16 == 0) goto L_0x00c8
            java.lang.String r12 = X.C18210wN.A0g(r1, r13)
        L_0x00c8:
            com.facebook.pando.PandoRealtimeInfoJNI r23 = com.facebook.pando.PandoRealtimeInfoJNI.forLiveQuery(r11, r2, r12)
        L_0x00cc:
            r22 = 0
            com.facebook.pando.PandoGraphQLRequest r2 = new com.facebook.pando.PandoGraphQLRequest
            r24 = r22
            r25 = r10
            r26 = r10
            r19 = r0
            r18 = r9
            r17 = r14
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.String r0 = "cache_config"
            java.lang.Object r11 = X.AnonymousClass6G4.A00(r0, r8)
            java.util.Map r11 = (java.util.Map) r11
            if (r11 == 0) goto L_0x010d
            java.lang.String r0 = "fresh_cache_ttl_secs"
            java.lang.Number r0 = X.C86124wJ.A0j(r0, r11)
            r9 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x00fd
            long r0 = r0.longValue()
            long r0 = r0 * r9
            r2.setFreshCacheAgeMs((long) r0)
        L_0x00fd:
            java.lang.String r0 = "cache_ttl_secs"
            java.lang.Number r0 = X.C86124wJ.A0j(r0, r11)
            if (r0 == 0) goto L_0x010d
            long r0 = r0.longValue()
            long r0 = r0 * r9
            r2.setMaxToleratedCacheAgeMs((long) r0)
        L_0x010d:
            r9 = 1
            r2.setManuallyManageActiveFieldUpdates(r9)
            boolean r0 = r8.containsKey(r3)
            if (r0 == 0) goto L_0x0134
            java.lang.Object r3 = r8.get(r3)
            java.util.Map r3 = (java.util.Map) r3
            r0 = 210(0xd2, float:2.94E-43)
            java.lang.String r1 = X.C18170wI.A00(r0)
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0134
            java.lang.String r1 = X.C18220wO.A0r(r1, r3)
            int r0 = r1.hashCode()
            switch(r0) {
                case -74056953: goto L_0x017c;
                case 79219577: goto L_0x0171;
                case 1925346054: goto L_0x0166;
                default: goto L_0x0134;
            }
        L_0x0134:
            java.util.concurrent.Executor r0 = A01
            com.facebook.pando.IPandoGraphQLService$Result r6 = r7.initiate(r6, r2, r4, r0)
            com.facebook.pando.IPandoGraphQLService$Token r0 = r6.cancelToken
            X.7yx r3 = new X.7yx
            r3.<init>(r0)
            X.7HV r2 = X.AnonymousClass7K7.A01(r28)
            X.6fw r1 = new X.6fw
            r1.<init>(r15, r5)
            java.util.List r0 = r2.A0E
            r0.add(r1)
            X.6mO r8 = new X.6mO
            r9 = r4
            r10 = r15
            r11 = r7
            r12 = r3
            r13 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            java.util.List r0 = r2.A0F
            r0.add(r8)
            java.lang.Object r0 = r6.tree
            X.6hs r1 = new X.6hs
            r1.<init>(r3, r0)
            return r1
        L_0x0166:
            java.lang.String r0 = "ACTIVE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0134
            X.68Z r1 = X.AnonymousClass68Z.ACTIVE
            goto L_0x0186
        L_0x0171:
            java.lang.String r0 = "STALE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0134
            X.68Z r1 = X.AnonymousClass68Z.STALE
            goto L_0x0186
        L_0x017c:
            java.lang.String r0 = "PASSIVE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0134
            X.68Z r1 = X.AnonymousClass68Z.PASSIVE
        L_0x0186:
            r2.setPublishMode((X.AnonymousClass68Z) r1)
            X.68Z r0 = X.AnonymousClass68Z.STALE
            if (r1 != r0) goto L_0x0134
            r2.setPerformOptimisticMerge(r9)
            goto L_0x0134
        L_0x0191:
            r2 = r12
            goto L_0x00bc
        L_0x0194:
            r11 = r12
            goto L_0x00b0
        L_0x0197:
            r23 = 0
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7r1.Cr0(X.3HX, X.7HV, X.73X, X.769, X.6ll):X.6hs");
    }

    public AnonymousClass7r1(C112226pD r1) {
        this.A00 = r1;
    }
}
