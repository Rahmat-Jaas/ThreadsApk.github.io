package X;

/* renamed from: X.3E8  reason: invalid class name */
public final class AnonymousClass3E8 {
    public C81964on A00;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3Uk A00(android.os.Bundle r9) {
        /*
            r8 = this;
            java.lang.String r0 = "error_code"
            r3 = 1
            int r7 = r9.getInt(r0, r3)
            java.lang.String r1 = "exception"
            android.os.Parcelable r0 = r9.getParcelable(r1)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r6 = 0
            if (r0 == 0) goto L_0x0024
            java.io.Serializable r0 = r0.getSerializable(r1)     // Catch:{ all -> 0x0027 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x001d
            java.lang.Integer r1 = X.AnonymousClass006.A00     // Catch:{ all -> 0x0021 }
            goto L_0x001f
        L_0x001d:
            java.lang.Integer r1 = X.AnonymousClass006.A0N     // Catch:{ all -> 0x0021 }
        L_0x001f:
            r6 = r0
            goto L_0x0031
        L_0x0021:
            r2 = move-exception
            r6 = r0
            goto L_0x0028
        L_0x0024:
            java.lang.Integer r1 = X.AnonymousClass006.A0N
            goto L_0x0031
        L_0x0027:
            r2 = move-exception
        L_0x0028:
            X.4on r1 = r8.A00
            java.lang.String r0 = "IpcExceptionFactory_DESERIALIZATION_FAILED"
            r1.Ccx(r0, r2)
            java.lang.Integer r1 = X.AnonymousClass006.A0C
        L_0x0031:
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            if (r1 != r0) goto L_0x003a
            java.lang.String r0 = "serialization_result"
            r9.getBoolean(r0, r3)
        L_0x003a:
            java.lang.String r0 = "stringified_exception"
            java.lang.String r5 = r9.getString(r0)
            java.lang.String r0 = "exception_hierarchies"
            java.util.ArrayList r0 = r9.getStringArrayList(r0)
            com.google.common.collect.ImmutableList$Builder r4 = com.google.common.collect.ImmutableList.builder()
            if (r0 == 0) goto L_0x0076
            com.google.common.collect.ImmutableList$Builder r3 = com.google.common.collect.ImmutableList.builder()
            java.util.Iterator r2 = r0.iterator()
        L_0x0054:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.String r1 = X.C18180wK.A0k(r2)
            java.lang.String r0 = "--"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0072
            com.google.common.collect.ImmutableList r0 = r3.build()
            r4.add((java.lang.Object) r0)
            com.google.common.collect.ImmutableList$Builder r3 = com.google.common.collect.ImmutableList.builder()
            goto L_0x0054
        L_0x0072:
            r3.add((java.lang.Object) r1)
            goto L_0x0054
        L_0x0076:
            com.google.common.collect.ImmutableList r1 = r4.build()
            X.3Uk r0 = new X.3Uk
            r0.<init>(r1, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3E8.A00(android.os.Bundle):X.3Uk");
    }

    public AnonymousClass3E8(C81964on r1) {
        this.A00 = r1;
    }
}
