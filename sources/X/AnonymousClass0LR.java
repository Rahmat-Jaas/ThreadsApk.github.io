package X;

import android.content.Context;

/* renamed from: X.0LR  reason: invalid class name */
public final class AnonymousClass0LR implements Runnable {
    public int A00 = 0;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ String A02;

    public AnonymousClass0LR(Context context, String str) {
        this.A02 = str;
        this.A01 = context;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0090 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            java.lang.String r4 = r9.A02
            long[] r8 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.getLoadedClassIdsInternal()
            java.util.Map r3 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.getThreadIdToNameMapping()
            int r7 = r8.length
            if (r7 == 0) goto L_0x009b
            int r0 = r9.A00
            if (r7 == r0) goto L_0x009b
            r5 = 0
            android.content.Context r0 = r9.A01     // Catch:{ IOException -> 0x0091 }
            java.io.File r2 = X.AnonymousClass0LT.A00(r0)     // Catch:{ IOException -> 0x0091 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0091 }
            r1.<init>()     // Catch:{ IOException -> 0x0091 }
            r1.append(r4)     // Catch:{ IOException -> 0x0091 }
            java.lang.String r0 = "_"
            r1.append(r0)     // Catch:{ IOException -> 0x0091 }
            java.util.UUID r0 = X.C03480Iw.A00()     // Catch:{ IOException -> 0x0091 }
            r1.append(r0)     // Catch:{ IOException -> 0x0091 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0091 }
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x0091 }
            r6.<init>(r2, r0)     // Catch:{ IOException -> 0x0091 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0091 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x0091 }
            java.util.zip.DeflaterOutputStream r0 = new java.util.zip.DeflaterOutputStream     // Catch:{ IOException -> 0x0091 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0091 }
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0091 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0091 }
            int r0 = r3.size()     // Catch:{ all -> 0x008c }
            r4.writeInt(r0)     // Catch:{ all -> 0x008c }
            java.util.Set r0 = r3.entrySet()     // Catch:{ all -> 0x008c }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x008c }
        L_0x0053:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x0076
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x008c }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r2.getKey()     // Catch:{ all -> 0x008c }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x008c }
            long r0 = r0.longValue()     // Catch:{ all -> 0x008c }
            r4.writeLong(r0)     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x008c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x008c }
            r4.writeUTF(r0)     // Catch:{ all -> 0x008c }
            goto L_0x0053
        L_0x0076:
            r4.writeInt(r7)     // Catch:{ all -> 0x008c }
            r2 = 0
        L_0x007a:
            r0 = r8[r2]     // Catch:{ all -> 0x008c }
            r4.writeLong(r0)     // Catch:{ all -> 0x008c }
            int r2 = r2 + 1
            if (r2 < r7) goto L_0x007a
            r4.close()     // Catch:{ IOException -> 0x0091 }
            r6.getCanonicalPath()     // Catch:{ IOException -> 0x0091 }
            r9.A00 = r7     // Catch:{ IOException -> 0x0091 }
            return
        L_0x008c:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0090 }
        L_0x0090:
            throw r0     // Catch:{ IOException -> 0x0091 }
        L_0x0091:
            r3 = move-exception
            java.lang.Class<X.0LT> r2 = X.AnonymousClass0LT.class
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "Couldn't write class traces"
            X.AnonymousClass0LU.A05(r2, r0, r3, r1)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0LR.run():void");
    }
}
