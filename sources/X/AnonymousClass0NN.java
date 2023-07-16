package X;

import java.io.File;

/* renamed from: X.0NN  reason: invalid class name */
public final class AnonymousClass0NN {
    public final File A00;

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008f, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x005e */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0056=Splitter:B:23:0x0056, B:28:0x005e=Splitter:B:28:0x005e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized X.AnonymousClass0NL A00(X.AnonymousClass0NN r9, java.lang.String r10, long r11) {
        /*
            monitor-enter(r9)
            r7 = 0
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0090
            java.io.File r4 = r9.A00     // Catch:{ all -> 0x0096 }
            boolean r0 = r4.exists()     // Catch:{ all -> 0x0096 }
            r3 = 0
            if (r0 == 0) goto L_0x008e
            long r1 = r4.length()     // Catch:{ all -> 0x0096 }
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x008e
            r1 = 1
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0076, NumberFormatException -> 0x005f }
            r6.<init>(r4, r0)     // Catch:{ IOException -> 0x0076, NumberFormatException -> 0x005f }
            r6.seek(r11)     // Catch:{ all -> 0x005a }
            byte r0 = r6.readByte()     // Catch:{ all -> 0x005a }
            if (r0 != r1) goto L_0x0031
            r0 = -425(0xfffffffffffffe57, double:NaN)
            X.0NL r5 = new X.0NL     // Catch:{ all -> 0x005a }
            r5.<init>(r0)     // Catch:{ all -> 0x005a }
            goto L_0x0056
        L_0x0031:
            long r3 = r6.readLong()     // Catch:{ all -> 0x005a }
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0041
            r0 = -869(0xfffffffffffffc9b, double:NaN)
            X.0NL r5 = new X.0NL     // Catch:{ all -> 0x005a }
            r5.<init>(r0)     // Catch:{ all -> 0x005a }
            goto L_0x0056
        L_0x0041:
            long r1 = r6.readLong()     // Catch:{ all -> 0x005a }
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0051
            r0 = -869(0xfffffffffffffc9b, double:NaN)
            X.0NL r5 = new X.0NL     // Catch:{ all -> 0x005a }
            r5.<init>(r0)     // Catch:{ all -> 0x005a }
            goto L_0x0056
        L_0x0051:
            X.0NL r5 = new X.0NL     // Catch:{ all -> 0x005a }
            r5.<init>(r3, r1)     // Catch:{ all -> 0x005a }
        L_0x0056:
            r6.close()     // Catch:{ IOException -> 0x0076, NumberFormatException -> 0x005f }
            goto L_0x008c
        L_0x005a:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x005e }
        L_0x005e:
            throw r0     // Catch:{ IOException -> 0x0076, NumberFormatException -> 0x005f }
        L_0x005f:
            r3 = move-exception
            X.C04790Pd.A00()     // Catch:{ all -> 0x0096 }
            java.lang.String r2 = "lacrima"
            java.lang.String r1 = "Could not read %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r10}     // Catch:{ all -> 0x0096 }
            X.AnonymousClass0LU.A0L(r2, r1, r3, r0)     // Catch:{ all -> 0x0096 }
            r0 = -647(0xfffffffffffffd79, double:NaN)
            X.0NL r5 = new X.0NL     // Catch:{ all -> 0x0096 }
            r5.<init>(r0)     // Catch:{ all -> 0x0096 }
            goto L_0x008c
        L_0x0076:
            r3 = move-exception
            X.C04790Pd.A00()     // Catch:{ all -> 0x0096 }
            java.lang.String r2 = "lacrima"
            java.lang.String r1 = "Could not read %s due to IO issue"
            java.lang.Object[] r0 = new java.lang.Object[]{r10}     // Catch:{ all -> 0x0096 }
            X.AnonymousClass0LU.A0L(r2, r1, r3, r0)     // Catch:{ all -> 0x0096 }
            r0 = -536(0xfffffffffffffde8, double:NaN)
            X.0NL r5 = new X.0NL     // Catch:{ all -> 0x0096 }
            r5.<init>(r0)     // Catch:{ all -> 0x0096 }
        L_0x008c:
            monitor-exit(r9)
            return r5
        L_0x008e:
            monitor-exit(r9)
            return r3
        L_0x0090:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0096 }
            r0.<init>()     // Catch:{ all -> 0x0096 }
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0NN.A00(X.0NN, java.lang.String, long):X.0NL");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:25|26|28|29|30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0064, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0052 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized X.AnonymousClass0NM A01(X.AnonymousClass0NN r10, int r11, int r12) {
        /*
            monitor-enter(r10)
            java.io.File r8 = r10.A00     // Catch:{ all -> 0x0065 }
            boolean r0 = r8.exists()     // Catch:{ all -> 0x0065 }
            r9 = 0
            if (r0 == 0) goto L_0x0063
            long r3 = r8.length()     // Catch:{ all -> 0x0065 }
            long r0 = (long) r11     // Catch:{ all -> 0x0065 }
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0063
            long r6 = r8.length()     // Catch:{ all -> 0x0065 }
            long r4 = (long) r12     // Catch:{ all -> 0x0065 }
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0063
            r6 = 0
            java.lang.String r2 = "r"
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0053 }
            r3.<init>(r8, r2)     // Catch:{ IOException -> 0x0053 }
            r3.seek(r0)     // Catch:{ all -> 0x004e }
            byte r0 = r3.readByte()     // Catch:{ all -> 0x004e }
            r2 = 0
            if (r0 == 0) goto L_0x002f
            r2 = 1
        L_0x002f:
            r3.seek(r4)     // Catch:{ all -> 0x004b }
            byte r1 = r3.readByte()     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x0043
            byte[] r0 = new byte[r1]     // Catch:{ all -> 0x004b }
            r3.readFully(r0, r6, r1)     // Catch:{ all -> 0x004b }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x004b }
            r1.<init>(r0)     // Catch:{ all -> 0x004b }
            goto L_0x0044
        L_0x0043:
            r1 = r9
        L_0x0044:
            r3.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x005c
        L_0x0048:
            r0 = move-exception
            r6 = r2
            goto L_0x0055
        L_0x004b:
            r0 = move-exception
            r6 = r2
            goto L_0x004f
        L_0x004e:
            r0 = move-exception
        L_0x004f:
            r3.close()     // Catch:{ all -> 0x0052 }
        L_0x0052:
            throw r0     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            r1 = r9
        L_0x0055:
            X.C04790Pd.A00()     // Catch:{ all -> 0x0065 }
            r0.getMessage()     // Catch:{ all -> 0x0065 }
            r2 = r6
        L_0x005c:
            X.0NM r0 = new X.0NM     // Catch:{ all -> 0x0065 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0065 }
            monitor-exit(r10)
            return r0
        L_0x0063:
            monitor-exit(r10)
            return r9
        L_0x0065:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0NN.A01(X.0NN, int, int):X.0NM");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized char A02() {
        /*
            r7 = this;
            monitor-enter(r7)
            java.io.File r6 = r7.A00     // Catch:{ all -> 0x003a }
            boolean r0 = r6.exists()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0036
            long r4 = r6.length()     // Catch:{ all -> 0x003a }
            r2 = 1
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0036
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x002b }
            r1.<init>(r6, r0)     // Catch:{ IOException -> 0x002b }
            r1.seek(r2)     // Catch:{ all -> 0x0026 }
            byte r0 = r1.readByte()     // Catch:{ all -> 0x0026 }
            char r0 = (char) r0     // Catch:{ all -> 0x0026 }
            r1.close()     // Catch:{ IOException -> 0x002b }
            goto L_0x0038
        L_0x0026:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x002a }
        L_0x002a:
            throw r0     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            r2 = move-exception
            X.C04790Pd.A00()     // Catch:{ all -> 0x003a }
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Could not read activity state"
            X.AnonymousClass0LU.A0G(r1, r0, r2)     // Catch:{ all -> 0x003a }
        L_0x0036:
            r0 = 63
        L_0x0038:
            monitor-exit(r7)
            return r0
        L_0x003a:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0NN.A02():char");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized char A03() {
        /*
            r7 = this;
            monitor-enter(r7)
            java.io.File r6 = r7.A00     // Catch:{ all -> 0x003a }
            boolean r0 = r6.exists()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0036
            long r4 = r6.length()     // Catch:{ all -> 0x003a }
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0036
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x002b }
            r1.<init>(r6, r0)     // Catch:{ IOException -> 0x002b }
            r1.seek(r2)     // Catch:{ all -> 0x0026 }
            byte r0 = r1.readByte()     // Catch:{ all -> 0x0026 }
            char r0 = (char) r0     // Catch:{ all -> 0x0026 }
            r1.close()     // Catch:{ IOException -> 0x002b }
            goto L_0x0038
        L_0x0026:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x002a }
        L_0x002a:
            throw r0     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            r2 = move-exception
            X.C04790Pd.A00()     // Catch:{ all -> 0x003a }
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Could not read status"
            X.AnonymousClass0LU.A0G(r1, r0, r2)     // Catch:{ all -> 0x003a }
        L_0x0036:
            r0 = 48
        L_0x0038:
            monitor-exit(r7)
            return r0
        L_0x003a:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0NN.A03():char");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int A04(boolean r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r1 = 204(0xcc, float:2.86E-43)
            if (r8 == 0) goto L_0x0007
            r1 = 203(0xcb, float:2.84E-43)
        L_0x0007:
            java.io.File r6 = r7.A00     // Catch:{ all -> 0x003d }
            boolean r0 = r6.exists()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x003a
            long r4 = r6.length()     // Catch:{ all -> 0x003d }
            long r2 = (long) r1     // Catch:{ all -> 0x003d }
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x003a
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x002f }
            r1.<init>(r6, r0)     // Catch:{ IOException -> 0x002f }
            r1.seek(r2)     // Catch:{ all -> 0x002a }
            byte r0 = r1.readByte()     // Catch:{ all -> 0x002a }
            r1.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x003b
        L_0x002a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r0     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            r2 = move-exception
            X.C04790Pd.A00()     // Catch:{ all -> 0x003d }
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Could not read number of activities byte"
            X.AnonymousClass0LU.A0G(r1, r0, r2)     // Catch:{ all -> 0x003d }
        L_0x003a:
            r0 = 0
        L_0x003b:
            monitor-exit(r7)
            return r0
        L_0x003d:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0NN.A04(boolean):int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0033 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x0093 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004e A[Catch:{ IOException -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0051 A[Catch:{ IOException -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String A05(X.C019809f r11) {
        /*
            r10 = this;
            r9 = r10
            monitor-enter(r9)
            java.io.File r8 = r10.A00     // Catch:{ IOException -> 0x009f }
            java.lang.String r5 = r8.getCanonicalPath()     // Catch:{ IOException -> 0x009f }
            if (r11 == 0) goto L_0x009c
            r4 = 32
            boolean r0 = r8.exists()     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x003f
            long r6 = r8.length()     // Catch:{ all -> 0x009a }
            r2 = 2
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x003f
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0034 }
            r1.<init>(r8, r0)     // Catch:{ IOException -> 0x0034 }
            r1.seek(r2)     // Catch:{ all -> 0x002f }
            byte r0 = r1.readByte()     // Catch:{ all -> 0x002f }
            char r6 = (char) r0     // Catch:{ all -> 0x002f }
            r1.close()     // Catch:{ IOException -> 0x0034 }
            goto L_0x0041
        L_0x002f:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0033 }
        L_0x0033:
            throw r0     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            r2 = move-exception
            X.C04790Pd.A00()     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Could not read foreground entity"
            X.AnonymousClass0LU.A0G(r1, r0, r2)     // Catch:{ all -> 0x009a }
        L_0x003f:
            r6 = 32
        L_0x0041:
            java.lang.String r0 = "_entity"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r5, r0)     // Catch:{ all -> 0x00a6 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00a6 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a6 }
            if (r6 != r4) goto L_0x0051
            java.lang.String r5 = "NONE"
            goto L_0x0095
        L_0x0051:
            r0 = 33
            if (r6 != r0) goto L_0x0058
            java.lang.String r5 = "OTHERS"
            goto L_0x0095
        L_0x0058:
            java.util.Properties r4 = new java.util.Properties     // Catch:{ all -> 0x00a6 }
            r4.<init>()     // Catch:{ all -> 0x00a6 }
            r5 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0095 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0095 }
            r4.load(r1)     // Catch:{ all -> 0x008f }
            r1.close()     // Catch:{ IOException -> 0x0095 }
            java.util.Set r0 = r4.stringPropertyNames()     // Catch:{ all -> 0x00a6 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x00a6 }
        L_0x0071:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x0095
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = r4.getProperty(r2)     // Catch:{ all -> 0x00a6 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00a6 }
            if (r0 != 0) goto L_0x0071
            r0 = 0
            char r0 = r1.charAt(r0)     // Catch:{ all -> 0x00a6 }
            if (r6 != r0) goto L_0x0071
            goto L_0x0094
        L_0x008f:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0093 }
        L_0x0093:
            throw r0     // Catch:{ IOException -> 0x0095 }
        L_0x0094:
            r5 = r2
        L_0x0095:
            if (r5 != 0) goto L_0x00a4
            java.lang.String r5 = ""
            goto L_0x00a4
        L_0x009a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00a6 }
        L_0x009c:
            java.lang.String r5 = "NONE"
            goto L_0x00a4
        L_0x009f:
            X.C04790Pd.A00()     // Catch:{ all -> 0x00a6 }
            java.lang.String r5 = ""
        L_0x00a4:
            monitor-exit(r9)
            return r5
        L_0x00a6:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0NN.A05(X.09f):java.lang.String");
    }

    public AnonymousClass0NN(File file) {
        this.A00 = file;
    }

    public AnonymousClass0NN(File file, boolean z) {
        this.A00 = file;
    }
}
