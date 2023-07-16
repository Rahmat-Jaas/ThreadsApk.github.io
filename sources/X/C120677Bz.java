package X;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;

/* renamed from: X.7Bz  reason: invalid class name and case insensitive filesystem */
public final class C120677Bz {
    public static final String A00(Reader reader) {
        C04220Ms.A0B(reader, 0);
        StringWriter A0d = C18230wP.A0d();
        char[] cArr = new char[8192];
        while (true) {
            int read = reader.read(cArr);
            if (read < 0) {
                return C18190wL.A0n(A0d);
            }
            A0d.write(cArr, 0, read);
        }
    }

    public static final C146838mw A01(BufferedReader bufferedReader) {
        C04220Ms.A0B(bufferedReader, 0);
        return new AnonymousClass86Z(new AnonymousClass86Y(bufferedReader));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        X.C102596Vu.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(java.io.Reader r2, X.AnonymousClass0YY r3) {
        /*
            boolean r0 = r2 instanceof java.io.BufferedReader
            if (r0 == 0) goto L_0x0007
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2
            goto L_0x000f
        L_0x0007:
            r1 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r2, r1)
            r2 = r0
        L_0x000f:
            X.8mw r0 = A01(r2)     // Catch:{ all -> 0x002b }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x002b }
        L_0x0017:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x002b }
            r3.invoke(r0)     // Catch:{ all -> 0x002b }
            goto L_0x0017
        L_0x0025:
            if (r2 == 0) goto L_0x002a
            r2.close()
        L_0x002a:
            return
        L_0x002b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002d }
        L_0x002d:
            r0 = move-exception
            X.C102596Vu.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120677Bz.A02(java.io.Reader, X.0YY):void");
    }
}
