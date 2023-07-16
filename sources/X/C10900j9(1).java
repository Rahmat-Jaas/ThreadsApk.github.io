package X;

/* renamed from: X.0j9  reason: invalid class name and case insensitive filesystem */
public final class C10900j9 extends AnonymousClass0gG {
    public final /* synthetic */ C10890j8 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10900j9(C10890j8 r5) {
        super(109, 5, true, false);
        this.A00 = r5;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00c9 */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r0 = r18
            X.0j8 r9 = r0.A00
            android.content.Context r1 = r9.A00
            X.0nS r0 = r9.A01
            X.C10830j1.A00(r1, r0)
            long[] r8 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.getLoadedClassIdsInternal()
            com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.getThreadIdToNameMapping()
            r17 = 0
            boolean r0 = X.AnonymousClass0LT.A02(r1)
            r7 = 0
            if (r0 == 0) goto L_0x010d
            java.io.File r0 = X.AnonymousClass0LT.A00(r1)
            if (r0 == 0) goto L_0x010d
            java.io.File[] r6 = r0.listFiles()
            if (r6 == 0) goto L_0x010a
            int r5 = r6.length
            if (r5 == 0) goto L_0x010a
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r4 = 0
        L_0x0030:
            if (r4 >= r5) goto L_0x010d
            r12 = r6[r4]
            java.lang.String r3 = r12.getName()
            java.lang.String r0 = "_"
            java.lang.String[] r2 = r3.split(r0)
            int r1 = r2.length
            r11 = 0
            r0 = 2
            if (r1 != r0) goto L_0x00db
            r10 = r2[r11]
            if (r10 == 0) goto L_0x0106
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00ca }
            r1.<init>(r12)     // Catch:{ IOException -> 0x00ca }
            java.util.zip.InflaterInputStream r0 = new java.util.zip.InflaterInputStream     // Catch:{ IOException -> 0x00ca }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00ca }
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch:{ IOException -> 0x00ca }
            r3.<init>(r0)     // Catch:{ IOException -> 0x00ca }
            int r14 = r3.readInt()     // Catch:{ all -> 0x00c5 }
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r14 <= r0) goto L_0x006a
            java.lang.Class<X.0LT> r1 = X.AnonymousClass0LT.class
            java.lang.String r0 = "Trace contains too many thread mappings, probably corrupt, skipping"
            X.AnonymousClass0LU.A01(r1, r0)     // Catch:{ all -> 0x00c5 }
        L_0x0066:
            r12.delete()     // Catch:{ all -> 0x00c5 }
            goto L_0x0095
        L_0x006a:
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ all -> 0x00c5 }
            r13.<init>()     // Catch:{ all -> 0x00c5 }
            r2 = 0
        L_0x0070:
            if (r2 >= r14) goto L_0x0084
            long r15 = r3.readLong()     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = r3.readUTF()     // Catch:{ all -> 0x00c5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x00c5 }
            r13.put(r0, r1)     // Catch:{ all -> 0x00c5 }
            int r2 = r2 + 1
            goto L_0x0070
        L_0x0084:
            int r15 = r3.readInt()     // Catch:{ all -> 0x00c5 }
            r0 = 100000(0x186a0, float:1.4013E-40)
            if (r15 <= r0) goto L_0x0099
            java.lang.Class<X.0LT> r1 = X.AnonymousClass0LT.class
            java.lang.String r0 = "Trace is too large, probably corrupt, skipping"
            X.AnonymousClass0LU.A01(r1, r0)     // Catch:{ all -> 0x00c5 }
            goto L_0x0066
        L_0x0095:
            r3.close()     // Catch:{ IOException -> 0x00ca }
            goto L_0x00f1
        L_0x0099:
            long[] r2 = new long[r15]     // Catch:{ all -> 0x00c5 }
            r14 = 0
        L_0x009c:
            if (r14 >= r15) goto L_0x00a7
            long r0 = r3.readLong()     // Catch:{ all -> 0x00c5 }
            r2[r14] = r0     // Catch:{ all -> 0x00c5 }
            int r14 = r14 + 1
            goto L_0x009c
        L_0x00a7:
            boolean r0 = r12.delete()     // Catch:{ all -> 0x00c5 }
            if (r0 != 0) goto L_0x00bc
            java.lang.Class<X.0LT> r14 = X.AnonymousClass0LT.class
            java.lang.String r1 = "Couldn't delete '%s'"
            java.lang.String r0 = r12.getCanonicalPath()     // Catch:{ all -> 0x00c5 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00c5 }
            X.AnonymousClass0LU.A08(r14, r1, r0)     // Catch:{ all -> 0x00c5 }
        L_0x00bc:
            X.0Hq r1 = new X.0Hq     // Catch:{ all -> 0x00c5 }
            r1.<init>(r13, r2)     // Catch:{ all -> 0x00c5 }
            r3.close()     // Catch:{ IOException -> 0x00ca }
            goto L_0x00f3
        L_0x00c5:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            throw r0     // Catch:{ IOException -> 0x00ca }
        L_0x00ca:
            r3 = move-exception
            java.lang.Class<X.0LT> r2 = X.AnonymousClass0LT.class
            java.lang.String r1 = "Couldn't read trace from '%s'"
            java.lang.String r0 = r12.getCanonicalPath()     // Catch:{ IOException -> 0x00e7 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ IOException -> 0x00e7 }
            X.AnonymousClass0LU.A05(r2, r1, r3, r0)     // Catch:{ IOException -> 0x00e7 }
            goto L_0x00f1
        L_0x00db:
            java.lang.Class<X.0LT> r2 = X.AnonymousClass0LT.class
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.lang.String r0 = "Unexpected file: %s"
            X.AnonymousClass0LU.A09(r2, r0, r1)
            goto L_0x0106
        L_0x00e7:
            r3 = move-exception
            java.lang.Class<X.0LT> r2 = X.AnonymousClass0LT.class
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.String r0 = "Couldn't read trace or file path"
            X.AnonymousClass0LU.A05(r2, r0, r3, r1)
        L_0x00f1:
            r1 = r17
        L_0x00f3:
            java.lang.Object r0 = r7.get(r10)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x0103
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.put(r10, r0)
        L_0x0103:
            r0.add(r1)
        L_0x0106:
            int r4 = r4 + 1
            goto L_0x0030
        L_0x010a:
            r0.getAbsolutePath()
        L_0x010d:
            int r0 = r8.length
            if (r0 != 0) goto L_0x0119
            if (r7 == 0) goto L_0x0118
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0119
        L_0x0118:
            return
        L_0x0119:
            com.instagram.service.session.UserSession r0 = r9.A03
            X.C09100er.A01(r0, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10900j9.run():void");
    }
}
