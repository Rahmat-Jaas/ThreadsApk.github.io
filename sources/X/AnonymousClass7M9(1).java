package X;

import android.database.DatabaseErrorHandler;

/* renamed from: X.7M9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7M9 implements DatabaseErrorHandler {
    public final /* synthetic */ AnonymousClass7A7 A00;
    public final /* synthetic */ C104256bU A01;

    public /* synthetic */ AnonymousClass7M9(AnonymousClass7A7 r1, C104256bU r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r0 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        r1 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        if (r1.hasNext() != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        r0 = ((android.util.Pair) r1.next()).second;
        X.C04220Ms.A05(r0);
        X.AnonymousClass7A7.A00((java.lang.String) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        r0 = r1.getPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r0 != null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        X.AnonymousClass7A7.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003d */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d A[ExcHandler: all (r2v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
      PHI: (r0v6 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v5 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v13 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v13 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:8:0x0039, B:10:0x003d, B:11:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:8:0x0039] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCorruption(android.database.sqlite.SQLiteDatabase r5) {
        /*
            r4 = this;
            X.6bU r3 = r4.A01
            r1 = 0
            X.C04220Ms.A07(r5)
            X.K01 r2 = r3.A00
            if (r2 == 0) goto L_0x0012
            android.database.sqlite.SQLiteDatabase r0 = r2.A00
            boolean r0 = X.C04220Ms.A0I(r0, r5)
            if (r0 != 0) goto L_0x0019
        L_0x0012:
            X.K01 r2 = new X.K01
            r2.<init>(r5)
            r3.A00 = r2
        L_0x0019:
            X.C04220Ms.A0B(r2, r1)
            java.lang.String r0 = "Corruption reported by sqlite on database: "
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            r1.append(r2)
            java.lang.String r0 = ".path"
            java.lang.String r1 = X.C18180wK.A0i(r0, r1)
            java.lang.String r0 = "SupportSQLite"
            android.util.Log.e(r0, r1)
            android.database.sqlite.SQLiteDatabase r1 = r2.A00
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x0085
            r0 = 0
            java.util.List r0 = r1.getAttachedDbs()     // Catch:{ SQLiteException -> 0x003d, all -> 0x005d }
        L_0x003d:
            r2.close()     // Catch:{ IOException -> 0x0040, all -> 0x005d }
        L_0x0040:
            if (r0 == 0) goto L_0x0085
            java.util.Iterator r1 = r0.iterator()
        L_0x0046:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008e
            java.lang.Object r0 = r1.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            X.C04220Ms.A05(r0)
            java.lang.String r0 = (java.lang.String) r0
            X.AnonymousClass7A7.A00(r0)
            goto L_0x0046
        L_0x005d:
            r2 = move-exception
            if (r0 == 0) goto L_0x007b
            java.util.Iterator r1 = r0.iterator()
        L_0x0064:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r0 = r1.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            X.C04220Ms.A05(r0)
            java.lang.String r0 = (java.lang.String) r0
            X.AnonymousClass7A7.A00(r0)
            goto L_0x0064
        L_0x007b:
            java.lang.String r0 = r1.getPath()
            if (r0 == 0) goto L_0x0084
            X.AnonymousClass7A7.A00(r0)
        L_0x0084:
            throw r2
        L_0x0085:
            java.lang.String r0 = r1.getPath()
            if (r0 == 0) goto L_0x008e
            X.AnonymousClass7A7.A00(r0)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7M9.onCorruption(android.database.sqlite.SQLiteDatabase):void");
    }
}
