package X;

import android.os.Process;

/* renamed from: X.73Z  reason: invalid class name */
public final class AnonymousClass73Z {
    public static final int[] A00 = {8224, 8224, 8224};

    public static final AnonymousClass5Hv A00() {
        try {
            long[] jArr = new long[3];
            Class.forName("android.os.Process").getMethod("readProcFile", new Class[]{String.class, int[].class, String[].class, long[].class, float[].class}).invoke((Object) null, new Object[]{AnonymousClass00U.A0S("/proc/", "/schedstat", Process.myPid()), A00, null, jArr, null});
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            if (j == 0 && j2 == 0 && j3 == 0) {
                return null;
            }
            return new AnonymousClass5Hv(j, j2, j3);
        } catch (Exception e) {
            AnonymousClass0LU.A0F("SchedStatsCollector", "There was a problem accessing the schedstat data.", e);
            return null;
        }
    }
}
