package X;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.util.Log;

/* renamed from: X.084  reason: invalid class name */
public final class AnonymousClass084 {
    public final NetworkStats.Bucket A00;
    public final NetworkStatsManager A01;

    public static void A00(AnonymousClass084 r8, long[] jArr, int i, int i2) {
        try {
            NetworkStats querySummary = r8.A01.querySummary(i, (String) null, Long.MIN_VALUE, Long.MAX_VALUE);
            while (querySummary.hasNextBucket()) {
                NetworkStats.Bucket bucket = r8.A00;
                querySummary.getNextBucket(bucket);
                int i3 = 4;
                if (bucket.getState() == 2) {
                    i3 = 0;
                }
                int i4 = i2 | i3;
                jArr[i4] = jArr[i4] + bucket.getRxBytes();
                int i5 = i3 | i2 | 1;
                jArr[i5] = jArr[i5] + bucket.getTxBytes();
            }
            querySummary.close();
        } catch (IllegalStateException | SecurityException e) {
            Log.e("NetworkStatsManagerBytesCollector", "NetworkStatsManager throws exception: ", e);
        }
    }

    public AnonymousClass084(Context context) {
        this.A00 = new NetworkStats.Bucket();
        this.A01 = (NetworkStatsManager) context.getSystemService(NetworkStatsManager.class);
    }

    public AnonymousClass084() {
    }
}
