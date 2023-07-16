package X;

/* renamed from: X.72A  reason: invalid class name */
public final class AnonymousClass72A {
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0089, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.C102596Vu.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0095, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.AnonymousClass721.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e3, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e4, code lost:
        X.C102596Vu.A00(r2, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A01(java.lang.ClassLoader r8) {
        /*
            java.lang.Class<X.8lX> r4 = X.C146048lX.class
            java.lang.String r1 = "META-INF/services/"
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ all -> 0x00ef }
            java.util.Enumeration r0 = r8.getResources(r0)     // Catch:{ all -> 0x00ef }
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch:{ all -> 0x00ef }
            X.C04220Ms.A06(r0)     // Catch:{ all -> 0x00ef }
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()     // Catch:{ all -> 0x00ef }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x00ef }
        L_0x001f:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x009c
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x00ef }
            java.net.URL r1 = (java.net.URL) r1     // Catch:{ all -> 0x00ef }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = "jar"
            r6 = 0
            X.AnonymousClass0wJ.A1Y(r3, r0)     // Catch:{ all -> 0x00ef }
            boolean r0 = r3.startsWith(r0)     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = "jar:file:"
            java.lang.String r1 = X.AnonymousClass8bP.A0Z(r3, r0, r3)     // Catch:{ all -> 0x00ef }
            r0 = 33
            java.lang.String r2 = X.AnonymousClass8bP.A0V(r1, r0)     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = "!/"
            java.lang.String r1 = X.AnonymousClass8bP.A0Z(r3, r0, r3)     // Catch:{ all -> 0x00ef }
            java.util.jar.JarFile r3 = new java.util.jar.JarFile     // Catch:{ all -> 0x00ef }
            r3.<init>(r2, r6)     // Catch:{ all -> 0x00ef }
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x008e }
            r0.<init>(r1)     // Catch:{ all -> 0x008e }
            java.io.InputStream r2 = r3.getInputStream(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "UTF-8"
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x008e }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x008e }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x008e }
            r2.<init>(r0)     // Catch:{ all -> 0x008e }
            java.util.List r0 = A00(r2)     // Catch:{ all -> 0x0087 }
            r2.close()     // Catch:{ all -> 0x008e }
            r3.close()     // Catch:{ all -> 0x0085 }
            goto L_0x0081
        L_0x0072:
            java.io.InputStream r0 = r1.openStream()     // Catch:{ all -> 0x00ef }
            java.io.BufferedReader r2 = X.C86144wL.A0Y(r0)     // Catch:{ all -> 0x00ef }
            java.util.List r0 = A00(r2)     // Catch:{ all -> 0x009a }
            r2.close()     // Catch:{ all -> 0x00ef }
        L_0x0081:
            X.C000300e.A0r(r0, r5)     // Catch:{ all -> 0x00ef }
            goto L_0x001f
        L_0x0085:
            r1 = move-exception
            goto L_0x00e7
        L_0x0087:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r0 = move-exception
            X.C102596Vu.A00(r2, r1)     // Catch:{ all -> 0x008e }
            throw r0     // Catch:{ all -> 0x008e }
        L_0x008e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0095 }
            goto L_0x00ee
        L_0x0095:
            r0 = move-exception
            X.AnonymousClass721.A01(r1, r0)     // Catch:{ all -> 0x00ef }
            goto L_0x00e7
        L_0x009a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00e3 }
        L_0x009c:
            java.util.Set r1 = X.AnonymousClass00J.A0c(r5)     // Catch:{ all -> 0x00ef }
            boolean r0 = X.C18190wL.A1a(r1)     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00e8
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0w(r1)     // Catch:{ all -> 0x00ef }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x00ef }
        L_0x00ae:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00f7
            java.lang.String r1 = X.C18180wK.A0k(r3)     // Catch:{ all -> 0x00ef }
            r0 = 0
            java.lang.Class r2 = java.lang.Class.forName(r1, r0, r8)     // Catch:{ all -> 0x00ef }
            boolean r0 = r4.isAssignableFrom(r2)     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r0 = X.C86134wK.A0g(r2)     // Catch:{ all -> 0x00ef }
            java.lang.Object r0 = r4.cast(r0)     // Catch:{ all -> 0x00ef }
            r5.add(r0)     // Catch:{ all -> 0x00ef }
            goto L_0x00ae
        L_0x00cf:
            java.lang.String r0 = "Expected service of class "
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)     // Catch:{ all -> 0x00ef }
            r1.append(r4)     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = ", but found "
            java.lang.String r0 = X.C86104wH.A0x(r2, r0, r1)     // Catch:{ all -> 0x00ef }
            java.lang.IllegalArgumentException r1 = X.C18190wL.A0a(r0)     // Catch:{ all -> 0x00ef }
            goto L_0x00e7
        L_0x00e3:
            r1 = move-exception
            X.C102596Vu.A00(r2, r0)     // Catch:{ all -> 0x00ef }
        L_0x00e7:
            throw r1     // Catch:{ all -> 0x00ef }
        L_0x00e8:
            java.lang.String r0 = "No providers were loaded with FastServiceLoader"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ all -> 0x00ef }
        L_0x00ee:
            throw r0     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r4, r8)
            java.util.List r5 = X.AnonymousClass00J.A0N(r0)
        L_0x00f7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72A.A01(java.lang.ClassLoader):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r0 <= 0) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r4.add(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(java.io.BufferedReader r5) {
        /*
            java.util.LinkedHashSet r4 = X.C86134wK.A0u()
        L_0x0004:
            java.lang.String r1 = r5.readLine()
            if (r1 != 0) goto L_0x000f
            java.util.List r0 = X.AnonymousClass00J.A0N(r4)
            return r0
        L_0x000f:
            java.lang.String r0 = "#"
            java.lang.String r0 = X.AnonymousClass8bP.A0Y(r1, r0)
            java.lang.String r3 = X.AnonymousClass8bP.A0P(r0)
            r2 = 0
        L_0x001a:
            int r0 = r3.length()
            if (r2 >= r0) goto L_0x003c
            char r1 = r3.charAt(r2)
            r0 = 46
            if (r1 == r0) goto L_0x0039
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r1)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "Illegal service provider class name: "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r3)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0039:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x003c:
            if (r0 <= 0) goto L_0x0004
            r4.add(r3)
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72A.A00(java.io.BufferedReader):java.util.List");
    }
}
