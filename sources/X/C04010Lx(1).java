package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import java.util.List;

/* renamed from: X.0Lx  reason: invalid class name and case insensitive filesystem */
public final class C04010Lx {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public static C04010Lx A00(Context context, int i) {
        ApplicationExitInfo applicationExitInfo;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
        if (activityManager == null) {
            return null;
        }
        String packageName = context.getPackageName();
        if (i == -1) {
            i = 0;
        }
        List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(packageName, i, 1);
        if (historicalProcessExitReasons == null || historicalProcessExitReasons.isEmpty() || (applicationExitInfo = (ApplicationExitInfo) historicalProcessExitReasons.get(0)) == null) {
            return null;
        }
        return new C04010Lx(applicationExitInfo, ActivityManager.isLowMemoryKillReportSupported());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x003c, code lost:
        r4 = r7.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C04010Lx(android.app.ApplicationExitInfo r7, boolean r8) {
        /*
            r6 = this;
            r6.<init>()
            int r0 = r7.getPid()
            r6.A01 = r0
            java.lang.String r0 = r7.getDescription()
            r6.A07 = r0
            int r0 = r7.getReason()
            r6.A02 = r0
            int r0 = r7.getStatus()
            r6.A03 = r0
            int r0 = r7.getImportance()
            r6.A00 = r0
            long r0 = r7.getTimestamp()
            r6.A06 = r0
            r6.A09 = r8
            long r0 = r7.getPss()
            r6.A04 = r0
            long r0 = r7.getRss()
            r6.A05 = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 0
            r0 = 30
            if (r1 == r0) goto L_0x006d
            java.lang.String r4 = r7.toString()
            java.lang.String r0 = "subreason="
            int r2 = r4.indexOf(r0)
            r3 = -1
            if (r2 == r3) goto L_0x006d
            java.lang.String r0 = " status="
            int r1 = r4.indexOf(r0, r2)
            int r0 = r2 + 10
            if (r1 != r3) goto L_0x0070
            java.lang.String r5 = r4.substring(r0)
        L_0x0057:
            r0 = 40
            int r2 = r5.indexOf(r0)
            if (r2 == r3) goto L_0x006d
            r0 = 41
            int r1 = r5.indexOf(r0, r2)
            if (r1 == r3) goto L_0x006d
            int r0 = r2 + 1
            java.lang.String r5 = r5.substring(r0, r1)
        L_0x006d:
            r6.A08 = r5
            return
        L_0x0070:
            java.lang.String r5 = r4.substring(r0, r1)
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04010Lx.<init>(android.app.ApplicationExitInfo, boolean):void");
    }

    public final int A01() {
        return this.A00;
    }

    public final int A02() {
        return this.A01;
    }

    public final int A03() {
        return this.A02;
    }

    public final int A04() {
        return this.A03;
    }

    public final long A05() {
        return this.A04;
    }

    public final long A06() {
        return this.A05;
    }

    public final long A07() {
        return this.A06;
    }

    public final String A08() {
        return this.A07;
    }

    public final String A09() {
        return this.A08;
    }

    public final String A0A() {
        return null;
    }

    public final boolean A0B() {
        return this.A09;
    }
}
