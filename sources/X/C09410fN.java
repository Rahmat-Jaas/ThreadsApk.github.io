package X;

import android.app.ActivityManager;
import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.redex.IDxFFilterShape519S0100000_I2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* renamed from: X.0fN  reason: invalid class name and case insensitive filesystem */
public final class C09410fN {
    public static C09410fN A04;
    public int A00 = 0;
    public int A01 = Integer.MAX_VALUE;
    public int A02;
    public int A03;

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0065 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x0065=Splitter:B:26:0x0065, B:21:0x005d=Splitter:B:21:0x005d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.C09410fN r4) {
        /*
            r0 = 0
            r3 = -1
            r4.A03(r0)     // Catch:{ Exception -> 0x0066 }
            int r0 = r4.A07()     // Catch:{ Exception -> 0x0066 }
            r1 = 1
            if (r0 <= r1) goto L_0x0014
            int r0 = r4.A07()     // Catch:{ Exception -> 0x0066 }
            int r0 = r0 - r1
            r4.A03(r0)     // Catch:{ Exception -> 0x0066 }
        L_0x0014:
            int r0 = r4.A00     // Catch:{ Exception -> 0x0066 }
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = "/proc/cpuinfo"
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0066 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0066 }
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x0066 }
            if (r0 == 0) goto L_0x0070
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ Exception -> 0x0066 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0066 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0066 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0066 }
        L_0x002f:
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x005d
            java.lang.String r0 = "cpu MHz"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x002f
            r0 = 58
            int r0 = r1.lastIndexOf(r0)     // Catch:{ all -> 0x0061 }
            int r0 = r0 + 2
            java.lang.String r0 = r1.substring(r0)     // Catch:{ all -> 0x0061 }
            float r1 = java.lang.Float.parseFloat(r0)     // Catch:{ all -> 0x0061 }
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x0061 }
            int r0 = r4.A00     // Catch:{ all -> 0x0061 }
            if (r1 <= r0) goto L_0x0057
            r4.A00 = r1     // Catch:{ all -> 0x0061 }
        L_0x0057:
            int r0 = r4.A01     // Catch:{ all -> 0x0061 }
            if (r1 >= r0) goto L_0x005d
            r4.A01 = r1     // Catch:{ all -> 0x0061 }
        L_0x005d:
            r2.close()     // Catch:{ Exception -> 0x0066 }
            goto L_0x0070
        L_0x0061:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0065 }
        L_0x0065:
            throw r0     // Catch:{ Exception -> 0x0066 }
        L_0x0066:
            r2 = move-exception
            java.lang.String r1 = "ProcessorInfoUtil"
            java.lang.String r0 = "Unable to read a CPU core maximum frequency"
            X.AnonymousClass0LU.A0G(r1, r0, r2)
            r4.A00 = r3
        L_0x0070:
            int r1 = r4.A00
            int r0 = r4.A01
            if (r1 > r0) goto L_0x007c
            if (r1 != 0) goto L_0x007a
            r4.A00 = r3
        L_0x007a:
            r4.A01 = r3
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09410fN.A04(X.0fN):void");
    }

    public static final long A00(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return -1;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static final long A01(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return -1;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static C09410fN A02() {
        C09410fN r0 = A04;
        if (r0 != null) {
            return r0;
        }
        C09410fN r02 = new C09410fN();
        A04 = r02;
        return r02;
    }

    public final int A06() {
        int i = this.A03;
        if (i != 0) {
            return i;
        }
        int max = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        this.A03 = max;
        return max;
    }

    public final int A07() {
        int i;
        int i2 = this.A02;
        if (i2 != 0) {
            return i2;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new IDxFFilterShape519S0100000_I2(this, 9));
            if (listFiles != null) {
                i = listFiles.length;
            } else {
                i = -1;
            }
            this.A02 = i;
            if (i != 0) {
                return i;
            }
            this.A02 = -1;
            return -1;
        } catch (Exception e) {
            AnonymousClass0LU.A0G("ProcessorInfoUtil", "Unable to get reliable CPU Core count", e);
            this.A02 = -1;
            return -1;
        }
    }

    private void A03(int i) {
        File file = new File(StringFormatUtil.formatStrLocaleSafe("/sys/devices/system/cpu/cpu%d/cpufreq/cpuinfo_max_freq", (Object) Integer.valueOf(i)));
        if (file.exists()) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String readLine = bufferedReader.readLine();
                readLine.getClass();
                int parseInt = Integer.parseInt(readLine);
                if (parseInt > this.A00) {
                    this.A00 = parseInt;
                }
                if (parseInt < this.A01) {
                    this.A01 = parseInt;
                }
                bufferedReader.close();
                return;
            } catch (Throwable unused) {
            }
        } else {
            return;
        }
        throw th;
    }

    public final int A05() {
        int A07 = A07();
        if (A07 == -1) {
            return A06();
        }
        return A07;
    }
}
