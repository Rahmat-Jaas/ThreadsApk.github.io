package X;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: X.0MN  reason: invalid class name */
public final class AnonymousClass0MN {
    public static PrintWriter A00;
    public static StringWriter A01;

    static {
        StringWriter stringWriter = new StringWriter(16000);
        A01 = stringWriter;
        A00 = new PrintWriter(stringWriter);
    }

    public static String A01(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.close();
        return stringWriter.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = (r6 * 3) >> 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.lang.String r5, int r6) {
        /*
            int r3 = r5.length()
            if (r3 <= r6) goto L_0x002d
            int r0 = r6 * 3
            int r2 = r0 >> 2
            java.lang.String r1 = "\n"
            int r0 = r5.lastIndexOf(r1, r2)
            if (r0 < 0) goto L_0x002d
            int r6 = r6 - r2
            int r3 = r3 - r6
            int r4 = r5.indexOf(r1, r3)
            if (r4 < 0) goto L_0x002d
            r1 = 0
            int r0 = r0 + 1
            java.lang.String r3 = r5.substring(r1, r0)
            java.lang.String r2 = "\t"
            java.lang.String r1 = "--------- TRIMMED FOR OVERFLOW ---------"
            java.lang.String r0 = r5.substring(r4)
            java.lang.String r5 = X.AnonymousClass00U.A0d(r3, r2, r1, r0)
        L_0x002d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0MN.A00(java.lang.String, int):java.lang.String");
    }
}
