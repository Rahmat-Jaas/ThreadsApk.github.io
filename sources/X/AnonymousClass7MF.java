package X;

import android.os.Handler;

/* renamed from: X.7MF  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7MF implements Handler.Callback {
    public final AnonymousClass7M4 A00;

    public AnonymousClass7MF(AnonymousClass7M4 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        r2 = r8.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r2.getBoolean("unsupported", false) == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r3.A00(new X.AnonymousClass6CH(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if ((r3 instanceof X.C93885rw) == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        r2 = r2.getBundle("data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        if (r2 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        r2 = android.os.Bundle.EMPTY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        r1 = java.lang.String.valueOf(r3);
        r0 = java.lang.String.valueOf(r2);
        java.lang.String.valueOf(r1);
        java.lang.String.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        r3.A03.A00.A0B(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        if (r2.getBoolean("ack", false) == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        r3.A00(new X.AnonymousClass6CH(4, "Invalid response to one way request"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            X.7M4 r6 = r7.A00
            int r2 = r8.arg1
            java.lang.String r4 = "MessengerIpcClient"
            r5 = 3
            android.util.Log.isLoggable(r4, r5)
            monitor-enter(r6)
            android.util.SparseArray r0 = r6.A04     // Catch:{ all -> 0x0087 }
            java.lang.Object r3 = r0.get(r2)     // Catch:{ all -> 0x0087 }
            X.6sE r3 = (X.C113836sE) r3     // Catch:{ all -> 0x0087 }
            if (r3 != 0) goto L_0x0026
            r0 = 50
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "Received response for unknown request: "
            java.lang.String r0 = X.C86104wH.A10(r0, r1, r2)     // Catch:{ all -> 0x0087 }
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x0087 }
            monitor-exit(r6)     // Catch:{ all -> 0x0087 }
            goto L_0x0045
        L_0x0026:
            r0.remove(r2)     // Catch:{ all -> 0x0087 }
            r6.A00()     // Catch:{ all -> 0x0087 }
            monitor-exit(r6)     // Catch:{ all -> 0x0087 }
            android.os.Bundle r2 = r8.getData()
            java.lang.String r0 = "unsupported"
            r1 = 0
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x0047
            r2 = 4
            java.lang.String r1 = "Not supported by GmsCore"
            X.6CH r0 = new X.6CH
            r0.<init>(r2, r1)
            r3.A00(r0)
        L_0x0045:
            r0 = 1
            return r0
        L_0x0047:
            boolean r0 = r3 instanceof X.C93885rw
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = "data"
            android.os.Bundle r2 = r2.getBundle(r0)
            if (r2 != 0) goto L_0x0055
            android.os.Bundle r2 = android.os.Bundle.EMPTY
        L_0x0055:
            boolean r0 = android.util.Log.isLoggable(r4, r5)
            if (r0 == 0) goto L_0x0069
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String.valueOf(r1)
            java.lang.String.valueOf(r0)
        L_0x0069:
            X.6rN r0 = r3.A03
            X.7HU r0 = r0.A00
            r0.A0B(r2)
            goto L_0x0045
        L_0x0071:
            java.lang.String r0 = "ack"
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x007b
            r2 = 0
            goto L_0x0055
        L_0x007b:
            r2 = 4
            java.lang.String r1 = "Invalid response to one way request"
            X.6CH r0 = new X.6CH
            r0.<init>(r2, r1)
            r3.A00(r0)
            goto L_0x0045
        L_0x0087:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0087 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7MF.handleMessage(android.os.Message):boolean");
    }
}
