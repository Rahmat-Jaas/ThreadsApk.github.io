package X;

import com.facebook.redex.IDxFFilterShape148S0000000_I2;
import java.io.File;
import java.io.FileFilter;

/* renamed from: X.0Lu  reason: invalid class name and case insensitive filesystem */
public final class C03990Lu {
    public static final FileFilter A00 = new IDxFFilterShape148S0000000_I2(2);

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x00c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00() {
        /*
            r11 = 0
            r4 = -1
            r7 = 0
            r5 = -1
        L_0x0004:
            int r0 = A01()     // Catch:{ IOException -> 0x00ca }
            if (r7 >= r0) goto L_0x004f
            java.lang.String r1 = "/sys/devices/system/cpu/cpu"
            java.lang.String r0 = "/cpufreq/cpuinfo_max_freq"
            java.lang.String r0 = X.AnonymousClass00U.A0S(r1, r0, r7)     // Catch:{ IOException -> 0x00ca }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x00ca }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00ca }
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x00ca }
            if (r0 == 0) goto L_0x004c
            boolean r0 = r1.canRead()     // Catch:{ IOException -> 0x00ca }
            if (r0 == 0) goto L_0x004c
            r6 = 128(0x80, float:1.794E-43)
            byte[] r2 = new byte[r6]     // Catch:{ IOException -> 0x00ca }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00ca }
            r3.<init>(r1)     // Catch:{ IOException -> 0x00ca }
            r3.read(r2)     // Catch:{ NumberFormatException -> 0x0049 }
            r1 = 0
        L_0x0030:
            byte r0 = r2[r1]     // Catch:{ NumberFormatException -> 0x0049 }
            boolean r0 = java.lang.Character.isDigit(r0)     // Catch:{ NumberFormatException -> 0x0049 }
            if (r0 == 0) goto L_0x003d
            if (r1 >= r6) goto L_0x003d
            int r1 = r1 + 1
            goto L_0x0030
        L_0x003d:
            java.lang.String r0 = new java.lang.String     // Catch:{ NumberFormatException -> 0x0049 }
            r0.<init>(r2, r11, r1)     // Catch:{ NumberFormatException -> 0x0049 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0049 }
            if (r0 <= r5) goto L_0x0049
            r5 = r0
        L_0x0049:
            r3.close()     // Catch:{ IOException -> 0x00ca }
        L_0x004c:
            int r7 = r7 + 1
            goto L_0x0004
        L_0x004f:
            if (r5 != r4) goto L_0x00c9
            java.lang.String r0 = "/proc/cpuinfo"
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00ca }
            r3.<init>(r0)     // Catch:{ IOException -> 0x00ca }
            java.lang.String r10 = "cpu MHz"
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r8]     // Catch:{ all -> 0x00c4 }
            int r9 = r3.read(r7)     // Catch:{ IOException | NumberFormatException -> 0x00c0 }
        L_0x0062:
            if (r11 >= r9) goto L_0x00c0
            byte r0 = r7[r11]     // Catch:{ IOException | NumberFormatException -> 0x00c0 }
            r1 = 10
            if (r0 == r1) goto L_0x006c
            if (r11 != 0) goto L_0x008a
        L_0x006c:
            byte r0 = r7[r11]     // Catch:{ IOException | NumberFormatException -> 0x00c0 }
            if (r0 != r1) goto L_0x0072
            int r11 = r11 + 1
        L_0x0072:
            r6 = r11
        L_0x0073:
            if (r6 >= r9) goto L_0x008a
            int r2 = r6 - r11
            byte r1 = r7[r6]     // Catch:{ IOException | NumberFormatException -> 0x00c0 }
            char r0 = r10.charAt(r2)     // Catch:{ IOException | NumberFormatException -> 0x00c0 }
            if (r1 != r0) goto L_0x008a
            int r0 = r10.length()     // Catch:{ IOException | NumberFormatException -> 0x00c0 }
            int r0 = r0 + -1
            if (r2 == r0) goto L_0x008d
            int r6 = r6 + 1
            goto L_0x0073
        L_0x008a:
            int r11 = r11 + 1
            goto L_0x0062
        L_0x008d:
            if (r6 >= r8) goto L_0x00c0
            byte r1 = r7[r6]     // Catch:{ IOException | NumberFormatException -> 0x00c0 }
            r0 = 10
            if (r1 == r0) goto L_0x00c0
            byte r0 = r7[r6]     // Catch:{ IOException | NumberFormatException -> 0x00c0 }
            boolean r0 = java.lang.Character.isDigit(r0)     // Catch:{ IOException | NumberFormatException -> 0x00c0 }
            if (r0 == 0) goto L_0x009e
            goto L_0x00a1
        L_0x009e:
            int r6 = r6 + 1
            goto L_0x008d
        L_0x00a1:
            int r2 = r6 + 1
        L_0x00a3:
            if (r2 >= r8) goto L_0x00b0
            byte r0 = r7[r2]     // Catch:{ IOException | NumberFormatException -> 0x00c0 }
            boolean r0 = java.lang.Character.isDigit(r0)     // Catch:{ IOException | NumberFormatException -> 0x00c0 }
            if (r0 == 0) goto L_0x00b0
            int r2 = r2 + 1
            goto L_0x00a3
        L_0x00b0:
            r1 = 0
            int r2 = r2 - r6
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException | NumberFormatException -> 0x00c0 }
            r0.<init>(r7, r1, r6, r2)     // Catch:{ IOException | NumberFormatException -> 0x00c0 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ IOException | NumberFormatException -> 0x00c0 }
            int r0 = r0 * 1000
            if (r0 <= r5) goto L_0x00c0
            r5 = r0
        L_0x00c0:
            r3.close()     // Catch:{ IOException -> 0x00ca }
            return r5
        L_0x00c4:
            r0 = move-exception
            r3.close()     // Catch:{ IOException -> 0x00ca }
            throw r0     // Catch:{ IOException -> 0x00ca }
        L_0x00c9:
            return r5
        L_0x00ca:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03990Lu.A00():int");
    }

    public static int A01() {
        try {
            int A02 = A02("/sys/devices/system/cpu/possible");
            if (A02 == -1) {
                A02 = A02("/sys/devices/system/cpu/present");
            }
            if (A02 == -1) {
                return new File("/sys/devices/system/cpu/").listFiles(A00).length;
            }
            return A02;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041 A[SYNTHETIC, Splitter:B:25:0x0041] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(java.lang.String r3) {
        /*
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            r2.<init>(r3)     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x003d, all -> 0x0036 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x003d, all -> 0x0036 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003d, all -> 0x0036 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x003d, all -> 0x0036 }
            java.lang.String r1 = r0.readLine()     // Catch:{ IOException -> 0x003d, all -> 0x0036 }
            r0.close()     // Catch:{ IOException -> 0x003d, all -> 0x0036 }
            if (r1 == 0) goto L_0x0031
            java.lang.String r0 = "0-[\\d]+$"
            boolean r0 = r1.matches(r0)     // Catch:{ IOException -> 0x003d, all -> 0x0036 }
            if (r0 == 0) goto L_0x0031
            r0 = 2
            java.lang.String r0 = r1.substring(r0)     // Catch:{ IOException -> 0x003d, all -> 0x0036 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x003d, all -> 0x0036 }
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x003d, all -> 0x0036 }
            int r0 = r0 + 1
            goto L_0x0032
        L_0x0031:
            r0 = -1
        L_0x0032:
            r2.close()     // Catch:{ IOException -> 0x0044 }
            return r0
        L_0x0036:
            r0 = move-exception
            r2.close()     // Catch:{ IOException -> 0x003c }
            throw r0
        L_0x003b:
            r0 = move-exception
        L_0x003c:
            throw r0
        L_0x003d:
            r1 = r2
        L_0x003e:
            r0 = -1
            if (r1 == 0) goto L_0x0044
            r1.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03990Lu.A02(java.lang.String):int");
    }
}
