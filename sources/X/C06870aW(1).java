package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0aW  reason: invalid class name and case insensitive filesystem */
public final class C06870aW {
    public int A00;
    public int A01;
    public int A02 = 0;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public File A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final AnonymousClass0Q4 A0T;
    public final List A0U = new ArrayList();
    public final C04560Oe A0V;
    public final C04560Oe A0W;
    public final C04560Oe A0X;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        r0 = r2.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        if (r2 != null) goto L_0x005c;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0043 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0044 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0207 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C06870aW r8) {
        /*
            r3 = 0
            X.0Mn r4 = new X.0Mn
            r4.<init>(r3)
            java.lang.String r2 = r8.A0M     // Catch:{ all -> 0x01da }
            if (r2 != 0) goto L_0x005c
            java.lang.String r0 = r8.A0I     // Catch:{ all -> 0x01da }
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = r8.A0J     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x0051
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x01da }
            r1.<init>(r0)     // Catch:{ all -> 0x01da }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x0051
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01da }
            r2.<init>()     // Catch:{ all -> 0x01da }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x0044 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0044 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0044 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0044 }
        L_0x002c:
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x003b
            r2.append(r0)     // Catch:{ all -> 0x003f }
            java.lang.String r0 = "\n"
            r2.append(r0)     // Catch:{ all -> 0x003f }
            goto L_0x002c
        L_0x003b:
            r1.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x004b
        L_0x003f:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0043 }
        L_0x0043:
            throw r0     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            X.C04790Pd.A00()     // Catch:{ all -> 0x01da }
            r2 = 0
            r8.A0M = r3     // Catch:{ all -> 0x01da }
            goto L_0x0055
        L_0x004b:
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01da }
        L_0x004f:
            r8.A0M = r0     // Catch:{ all -> 0x01da }
        L_0x0051:
            java.lang.String r2 = r8.A0M     // Catch:{ all -> 0x01da }
            if (r2 != 0) goto L_0x005c
        L_0x0055:
            boolean r0 = r8.A0O     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x005c
            r8.A0B = r3     // Catch:{ all -> 0x01da }
            return
        L_0x005c:
            X.0Q4 r7 = r8.A0T     // Catch:{ all -> 0x01da }
            java.io.File r5 = r7.A04     // Catch:{ all -> 0x01da }
            java.lang.String r0 = "Did you call SessionManager.init()?"
            X.C002801h.A02(r5, r0)     // Catch:{ all -> 0x01da }
            java.lang.String r3 = "anr_report_"
            int r1 = r8.A02     // Catch:{ all -> 0x01da }
            java.lang.String r0 = ".dmp"
            java.lang.String r1 = X.AnonymousClass00U.A0S(r3, r0, r1)     // Catch:{ all -> 0x01da }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x01da }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x01da }
            r8.A0B = r0     // Catch:{ all -> 0x01da }
            boolean r0 = r8.A0O     // Catch:{ all -> 0x01da }
            if (r0 != 0) goto L_0x0081
            X.0ON r1 = X.AnonymousClass0MU.A7p     // Catch:{ all -> 0x01da }
            java.lang.String r0 = "true"
            r4.A03(r1, r0)     // Catch:{ all -> 0x01da }
        L_0x0081:
            if (r2 == 0) goto L_0x00bd
            X.0ON r5 = X.AnonymousClass0MU.A8T     // Catch:{ all -> 0x01da }
            r3 = 0
            int r0 = r2.length()     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x00ba
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ IOException -> 0x00b2 }
            X.C04220Ms.A08(r0)     // Catch:{ IOException -> 0x00b2 }
            byte[] r2 = r2.getBytes(r0)     // Catch:{ IOException -> 0x00b2 }
            X.C04220Ms.A06(r2)     // Catch:{ IOException -> 0x00b2 }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00b2 }
            r1.<init>()     // Catch:{ IOException -> 0x00b2 }
            java.util.zip.GZIPOutputStream r0 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x00b2 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00b2 }
            r0.write(r2)     // Catch:{ IOException -> 0x00b2 }
            r0.close()     // Catch:{ IOException -> 0x00b2 }
            byte[] r1 = r1.toByteArray()     // Catch:{ IOException -> 0x00b2 }
            r0 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ IOException -> 0x00b2 }
            goto L_0x00ba
        L_0x00b2:
            r2 = move-exception
            java.lang.String r1 = "ReportFieldHelper"
            java.lang.String r0 = "Failed to compress string"
            X.AnonymousClass0LU.A0F(r1, r0, r2)     // Catch:{ all -> 0x01da }
        L_0x00ba:
            r4.A03(r5, r3)     // Catch:{ all -> 0x01da }
        L_0x00bd:
            X.0ON r1 = X.AnonymousClass0MU.A3n     // Catch:{ all -> 0x01da }
            boolean r0 = r8.A0S     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x01d6
            java.lang.String r0 = "1"
        L_0x00c5:
            r4.A03(r1, r0)     // Catch:{ all -> 0x01da }
            long r5 = r8.A04     // Catch:{ all -> 0x01da }
            long r0 = r7.A01     // Catch:{ all -> 0x01da }
            long r2 = r5 - r0
            X.0OO r1 = X.AnonymousClass0MU.A0c     // Catch:{ all -> 0x01da }
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x01da }
            r4.A02(r1, r0)     // Catch:{ all -> 0x01da }
            X.0OO r1 = X.AnonymousClass0MU.A0h     // Catch:{ all -> 0x01da }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x01da }
            r4.A02(r1, r0)     // Catch:{ all -> 0x01da }
            X.0ON r1 = X.AnonymousClass0MU.A3Q     // Catch:{ all -> 0x01da }
            boolean r0 = r8.A0R     // Catch:{ all -> 0x01da }
            java.lang.String r0 = java.lang.Boolean.toString(r0)     // Catch:{ all -> 0x01da }
            r4.A03(r1, r0)     // Catch:{ all -> 0x01da }
            X.0OO r1 = X.AnonymousClass0MU.A0e     // Catch:{ all -> 0x01da }
            int r0 = r8.A00     // Catch:{ all -> 0x01da }
            r4.A01(r1, r0)     // Catch:{ all -> 0x01da }
            X.0OO r2 = X.AnonymousClass0MU.A0f     // Catch:{ all -> 0x01da }
            long r0 = r8.A05     // Catch:{ all -> 0x01da }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01da }
            r4.A02(r2, r0)     // Catch:{ all -> 0x01da }
            X.0OZ r1 = X.AnonymousClass0MU.A00     // Catch:{ all -> 0x01da }
            boolean r0 = r8.A0P     // Catch:{ all -> 0x01da }
            r4.A00(r1, r0)     // Catch:{ all -> 0x01da }
            X.0OZ r1 = X.AnonymousClass0MU.A01     // Catch:{ all -> 0x01da }
            boolean r0 = r8.A0Q     // Catch:{ all -> 0x01da }
            r4.A00(r1, r0)     // Catch:{ all -> 0x01da }
            X.0OO r1 = X.AnonymousClass0MU.A0k     // Catch:{ all -> 0x01da }
            java.lang.Long r0 = r8.A0D     // Catch:{ all -> 0x01da }
            r4.A02(r1, r0)     // Catch:{ all -> 0x01da }
            X.0OO r1 = X.AnonymousClass0MU.A0j     // Catch:{ all -> 0x01da }
            java.lang.Long r0 = r8.A0C     // Catch:{ all -> 0x01da }
            r4.A02(r1, r0)     // Catch:{ all -> 0x01da }
            X.0OO r1 = X.AnonymousClass0MU.A0s     // Catch:{ all -> 0x01da }
            java.lang.Long r0 = r8.A0F     // Catch:{ all -> 0x01da }
            r4.A02(r1, r0)     // Catch:{ all -> 0x01da }
            X.0OO r1 = X.AnonymousClass0MU.A0r     // Catch:{ all -> 0x01da }
            java.lang.Long r0 = r8.A0E     // Catch:{ all -> 0x01da }
            r4.A02(r1, r0)     // Catch:{ all -> 0x01da }
            X.0ON r1 = X.AnonymousClass0MU.A3g     // Catch:{ all -> 0x01da }
            java.lang.String r0 = r8.A0L     // Catch:{ all -> 0x01da }
            r4.A03(r1, r0)     // Catch:{ all -> 0x01da }
            X.0ON r1 = X.AnonymousClass0MU.A3f     // Catch:{ all -> 0x01da }
            java.lang.String r0 = r8.A0K     // Catch:{ all -> 0x01da }
            r4.A03(r1, r0)     // Catch:{ all -> 0x01da }
            X.0OO r2 = X.AnonymousClass0MU.A0Z     // Catch:{ all -> 0x01da }
            long r0 = r8.A03     // Catch:{ all -> 0x01da }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01da }
            r4.A02(r2, r0)     // Catch:{ all -> 0x01da }
            X.0OO r2 = X.AnonymousClass0MU.A0o     // Catch:{ all -> 0x01da }
            long r0 = r8.A09     // Catch:{ all -> 0x01da }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01da }
            r4.A02(r2, r0)     // Catch:{ all -> 0x01da }
            X.0OO r2 = X.AnonymousClass0MU.A0n     // Catch:{ all -> 0x01da }
            int r0 = r8.A01     // Catch:{ all -> 0x01da }
            long r0 = (long) r0     // Catch:{ all -> 0x01da }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01da }
            r4.A02(r2, r0)     // Catch:{ all -> 0x01da }
            X.0OO r2 = X.AnonymousClass0MU.A0p     // Catch:{ all -> 0x01da }
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01da }
            r4.A02(r2, r0)     // Catch:{ all -> 0x01da }
            X.0OO r2 = X.AnonymousClass0MU.A0i     // Catch:{ all -> 0x01da }
            long r0 = r8.A06     // Catch:{ all -> 0x01da }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01da }
            r4.A02(r2, r0)     // Catch:{ all -> 0x01da }
            X.0OO r2 = X.AnonymousClass0MU.A0m     // Catch:{ all -> 0x01da }
            long r0 = r8.A08     // Catch:{ all -> 0x01da }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01da }
            r4.A02(r2, r0)     // Catch:{ all -> 0x01da }
            X.0OO r2 = X.AnonymousClass0MU.A0l     // Catch:{ all -> 0x01da }
            long r0 = r8.A07     // Catch:{ all -> 0x01da }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01da }
            r4.A02(r2, r0)     // Catch:{ all -> 0x01da }
            X.0ON r1 = X.AnonymousClass0MU.A8z     // Catch:{ all -> 0x01da }
            java.lang.String r0 = r8.A0N     // Catch:{ all -> 0x01da }
            r4.A03(r1, r0)     // Catch:{ all -> 0x01da }
            X.0ON r1 = X.AnonymousClass0MU.A3I     // Catch:{ all -> 0x01da }
            java.lang.String r0 = r8.A0H     // Catch:{ all -> 0x01da }
            r4.A03(r1, r0)     // Catch:{ all -> 0x01da }
            X.0ON r1 = X.AnonymousClass0MU.A3F     // Catch:{ all -> 0x01da }
            java.lang.String r0 = r8.A0G     // Catch:{ all -> 0x01da }
            r4.A03(r1, r0)     // Catch:{ all -> 0x01da }
            X.0ON r0 = X.AnonymousClass0MU.A4L     // Catch:{ all -> 0x01da }
            r1 = 0
            r4.A03(r0, r1)     // Catch:{ all -> 0x01da }
            X.0ON r0 = X.AnonymousClass0MU.A6K     // Catch:{ all -> 0x01da }
            r4.A03(r0, r1)     // Catch:{ all -> 0x01da }
            X.0OO r2 = X.AnonymousClass0MU.A0q     // Catch:{ all -> 0x01da }
            long r0 = r8.A0A     // Catch:{ all -> 0x01da }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01da }
            r4.A02(r2, r0)     // Catch:{ all -> 0x01da }
            r1 = 0
            java.util.List r0 = r8.A0U     // Catch:{ all -> 0x01da }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x01da }
        L_0x01b5:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x01e7
            java.lang.Object r3 = r5.next()     // Catch:{ all -> 0x01da }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01da }
            X.0ON r0 = X.AnonymousClass0MU.A3W     // Catch:{ all -> 0x01da }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x01da }
            int r2 = r1 + 1
            java.lang.String r1 = X.AnonymousClass00U.A0J(r0, r1)     // Catch:{ all -> 0x01da }
            java.util.Map r0 = r4.A03     // Catch:{ all -> 0x01da }
            if (r3 != 0) goto L_0x01d1
            java.lang.String r3 = "unknown"
        L_0x01d1:
            r0.put(r1, r3)     // Catch:{ all -> 0x01da }
            r1 = r2
            goto L_0x01b5
        L_0x01d6:
            java.lang.String r0 = "0"
            goto L_0x00c5
        L_0x01da:
            r0 = move-exception
            X.C04790Pd.A00()
            X.0ON r1 = X.AnonymousClass0MU.A5Z
            java.lang.String r0 = r0.getMessage()
            r4.A03(r1, r0)
        L_0x01e7:
            java.io.File r0 = r8.A0B
            if (r0 == 0) goto L_0x0213
            java.util.Properties r2 = new java.util.Properties     // Catch:{ IOException -> 0x0208 }
            r2.<init>()     // Catch:{ IOException -> 0x0208 }
            r4.A05(r2)     // Catch:{ IOException -> 0x0208 }
            java.io.File r0 = r8.A0B     // Catch:{ IOException -> 0x0208 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0208 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0208 }
            java.lang.String r0 = "no pool"
            r2.store(r1, r0)     // Catch:{ all -> 0x0203 }
            r1.close()     // Catch:{ IOException -> 0x0208 }
            return
        L_0x0203:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0207 }
        L_0x0207:
            throw r0     // Catch:{ IOException -> 0x0208 }
        L_0x0208:
            r2 = move-exception
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Could not save ANR report file"
            X.AnonymousClass0LU.A0G(r1, r0, r2)
            X.C04790Pd.A00()
        L_0x0213:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06870aW.A00(X.0aW):void");
    }

    public C06870aW(AnonymousClass0Q4 r5, C04560Oe r6, C04560Oe r7, C04560Oe r8) {
        this.A0T = r5;
        this.A0X = r6;
        this.A0W = r7;
        this.A0V = r8;
        File file = r5.A04;
        C002801h.A02(file, "Did you call SessionManager.init()?");
        this.A0B = new File(file, AnonymousClass00U.A0S("anr_report_", ".dmp", 0));
    }
}
