package X;

/* renamed from: X.6ZB  reason: invalid class name */
public final class AnonymousClass6ZB {
    public static final C141478bg A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:43|44) */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r5 = X.AnonymousClass72A.A01(r3.getClassLoader());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00a8 */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            r1 = 1
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x000d }
            if (r0 == 0) goto L_0x000d
            boolean r1 = java.lang.Boolean.parseBoolean(r0)
        L_0x000d:
            r4 = 0
            if (r1 == 0) goto L_0x0011
            goto L_0x002c
        L_0x0011:
            java.lang.Class<X.8lX> r1 = X.C146048lX.class
            java.lang.ClassLoader r0 = r1.getClassLoader()     // Catch:{ all -> 0x00ca }
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r1, r0)     // Catch:{ all -> 0x00ca }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00ca }
            X.8mw r0 = X.AnonymousClass8bL.A09(r0)     // Catch:{ all -> 0x00ca }
            java.util.List r0 = X.AnonymousClass8bJ.A02(r0)     // Catch:{ all -> 0x00ca }
            java.util.List r5 = X.C06750aI.A16(r0)     // Catch:{ all -> 0x00ca }
            goto L_0x003a
        L_0x002c:
            java.lang.Class<X.8lX> r3 = X.C146048lX.class
            boolean r0 = X.AnonymousClass6ZA.A00     // Catch:{ all -> 0x00ca }
            if (r0 != 0) goto L_0x006f
            java.lang.ClassLoader r0 = r3.getClassLoader()     // Catch:{ all -> 0x00ca }
            java.util.List r5 = X.AnonymousClass72A.A01(r0)     // Catch:{ all -> 0x00ca }
        L_0x003a:
            java.util.Iterator r3 = r5.iterator()     // Catch:{ all -> 0x00ca }
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x006a
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00ca }
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x006a
            r0 = r4
            X.8lX r0 = (X.C146048lX) r0     // Catch:{ all -> 0x00ca }
            int r2 = r0.getLoadPriority()     // Catch:{ all -> 0x00ca }
        L_0x0055:
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x00ca }
            r0 = r1
            X.8lX r0 = (X.C146048lX) r0     // Catch:{ all -> 0x00ca }
            int r0 = r0.getLoadPriority()     // Catch:{ all -> 0x00ca }
            if (r2 >= r0) goto L_0x0064
            r4 = r1
            r2 = r0
        L_0x0064:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00ca }
            if (r0 != 0) goto L_0x0055
        L_0x006a:
            X.8lX r4 = (X.C146048lX) r4     // Catch:{ all -> 0x00ca }
            if (r4 == 0) goto L_0x00c3
            goto L_0x00b1
        L_0x006f:
            r0 = 2
            java.util.ArrayList r5 = X.C18240wQ.A0k(r0)     // Catch:{ all -> 0x00a8 }
            java.lang.String r1 = "kotlinx.coroutines.android.AndroidDispatcherFactory"
            r2 = 1
            java.lang.ClassLoader r0 = r3.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x008e }
            java.lang.Class r0 = java.lang.Class.forName(r1, r2, r0)     // Catch:{ ClassNotFoundException -> 0x008e }
            java.lang.Object r0 = X.C86134wK.A0g(r0)     // Catch:{ ClassNotFoundException -> 0x008e }
            java.lang.Object r0 = r3.cast(r0)     // Catch:{ ClassNotFoundException -> 0x008e }
            X.8lX r0 = (X.C146048lX) r0     // Catch:{ ClassNotFoundException -> 0x008e }
            if (r0 == 0) goto L_0x008e
            r5.add(r0)     // Catch:{ all -> 0x00a8 }
        L_0x008e:
            java.lang.String r1 = "kotlinx.coroutines.test.internal.TestMainDispatcherFactory"
            java.lang.ClassLoader r0 = r3.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x003a }
            java.lang.Class r0 = java.lang.Class.forName(r1, r2, r0)     // Catch:{ ClassNotFoundException -> 0x003a }
            java.lang.Object r0 = X.C86134wK.A0g(r0)     // Catch:{ ClassNotFoundException -> 0x003a }
            java.lang.Object r0 = r3.cast(r0)     // Catch:{ ClassNotFoundException -> 0x003a }
            X.8lX r0 = (X.C146048lX) r0     // Catch:{ ClassNotFoundException -> 0x003a }
            if (r0 == 0) goto L_0x003a
            r5.add(r0)     // Catch:{ all -> 0x00a8 }
            goto L_0x003a
        L_0x00a8:
            java.lang.ClassLoader r0 = r3.getClassLoader()     // Catch:{ all -> 0x00ca }
            java.util.List r5 = X.AnonymousClass72A.A01(r0)     // Catch:{ all -> 0x00ca }
            goto L_0x003a
        L_0x00b1:
            X.8bg r2 = r4.createDispatcher(r5)     // Catch:{ all -> 0x00b8 }
            if (r2 != 0) goto L_0x00d1
            goto L_0x00c3
        L_0x00b8:
            r1 = move-exception
            java.lang.String r0 = r4.hintOnError()     // Catch:{ all -> 0x00ca }
            X.8bd r2 = new X.8bd     // Catch:{ all -> 0x00ca }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x00ca }
            goto L_0x00d1
        L_0x00c3:
            r0 = 0
            X.8bd r2 = new X.8bd     // Catch:{ all -> 0x00ca }
            r2.<init>(r0, r0)     // Catch:{ all -> 0x00ca }
            goto L_0x00d1
        L_0x00ca:
            r1 = move-exception
            r0 = 0
            X.8bd r2 = new X.8bd
            r2.<init>(r1, r0)
        L_0x00d1:
            A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6ZB.<clinit>():void");
    }
}
