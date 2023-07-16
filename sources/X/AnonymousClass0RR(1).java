package X;

import android.content.Context;

/* renamed from: X.0RR  reason: invalid class name */
public final class AnonymousClass0RR implements C04050Mb {
    public final Context A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(23:6|(1:10)|11|(4:12|39|15|(1:17))|18|20|21|(1:23)|24|25|(1:27)|28|29|(1:31)|32|33|(1:35)|(3:36|37|(1:39))|40|(3:43|44|(4:46|(1:48)|51|60))|50|51|60) */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c8, code lost:
        if (r1.hasTransport(0) == false) goto L_0x00ca;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x006f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x007d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x008b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0099 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0079 A[Catch:{ Exception -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087 A[Catch:{ Exception -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0095 A[Catch:{ Exception -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3 A[Catch:{ Exception -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b3 A[SYNTHETIC, Splitter:B:43:0x00b3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CWp(X.C04170Mn r8, X.AnonymousClass0ND r9) {
        /*
            r7 = this;
            android.content.Context r6 = r7.A00
            java.lang.Object r1 = X.AnonymousClass0QA.A02
            monitor-enter(r1)
            boolean r0 = X.AnonymousClass0QA.A01     // Catch:{ all -> 0x00d2 }
            monitor-exit(r1)     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x00d1
            r2 = -1
            java.lang.String r0 = "batterymanager"
            java.lang.Object r1 = r6.getSystemService(r0)
            android.os.BatteryManager r1 = (android.os.BatteryManager) r1
            if (r1 == 0) goto L_0x0021
            r0 = 4
            int r0 = r1.getIntProperty(r0)
            if (r0 <= r2) goto L_0x0021
            long r1 = (long) r0
            r0 = 0
            com.facebook.errorreporting.nightwatch.Nightwatch$NightwatchNative.recordDataInNightWatch(r1, r0)
        L_0x0021:
            java.io.File r0 = android.os.Environment.getDataDirectory()
            java.lang.String r1 = r0.getAbsolutePath()
            android.os.StatFs r0 = new android.os.StatFs
            r0.<init>(r1)
            long r1 = r0.getAvailableBytes()
            r0 = 1
            com.facebook.errorreporting.nightwatch.Nightwatch$NightwatchNative.recordDataInNightWatch(r1, r0)
            r5 = 0
            java.lang.Class<X.0pq> r0 = X.C14620pq.class
            monitor-enter(r0)     // Catch:{ IllegalArgumentException -> 0x0056 }
            monitor-exit(r0)     // Catch:{ IllegalArgumentException -> 0x0056 }
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ IllegalArgumentException -> 0x0056 }
            java.lang.String r1 = r0.getAbsolutePath()     // Catch:{ IllegalArgumentException -> 0x0056 }
            android.os.StatFs r0 = new android.os.StatFs     // Catch:{ IllegalArgumentException -> 0x0056 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0056 }
            long r1 = r0.getAvailableBytes()     // Catch:{ IllegalArgumentException -> 0x0056 }
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0056
            r0 = 2
            com.facebook.errorreporting.nightwatch.Nightwatch$NightwatchNative.recordDataInNightWatch(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0056 }
        L_0x0056:
            r2 = 0
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch:{ SecurityException -> 0x006f }
            r0.<init>(r1)     // Catch:{ SecurityException -> 0x006f }
            android.content.Intent r1 = r6.registerReceiver(r2, r0)     // Catch:{ SecurityException -> 0x006f }
            if (r1 == 0) goto L_0x006f
            java.lang.String r0 = "temperature"
            int r0 = r1.getIntExtra(r0, r5)     // Catch:{ SecurityException -> 0x006f }
            long r1 = (long) r0     // Catch:{ SecurityException -> 0x006f }
            r0 = 3
            com.facebook.errorreporting.nightwatch.Nightwatch$NightwatchNative.recordDataInNightWatch(r1, r0)     // Catch:{ SecurityException -> 0x006f }
        L_0x006f:
            long r1 = android.net.TrafficStats.getTotalRxBytes()     // Catch:{ Exception -> 0x007d }
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x007d
            r0 = 4
            com.facebook.errorreporting.nightwatch.Nightwatch$NightwatchNative.recordDataInNightWatch(r1, r0)     // Catch:{ Exception -> 0x007d }
        L_0x007d:
            long r1 = android.net.TrafficStats.getTotalTxBytes()     // Catch:{ Exception -> 0x008b }
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x008b
            r0 = 5
            com.facebook.errorreporting.nightwatch.Nightwatch$NightwatchNative.recordDataInNightWatch(r1, r0)     // Catch:{ Exception -> 0x008b }
        L_0x008b:
            long r1 = android.net.TrafficStats.getMobileRxBytes()     // Catch:{ Exception -> 0x0099 }
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0099
            r0 = 6
            com.facebook.errorreporting.nightwatch.Nightwatch$NightwatchNative.recordDataInNightWatch(r1, r0)     // Catch:{ Exception -> 0x0099 }
        L_0x0099:
            long r3 = android.net.TrafficStats.getMobileTxBytes()     // Catch:{ Exception -> 0x00a7 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a7
            r0 = 7
            com.facebook.errorreporting.nightwatch.Nightwatch$NightwatchNative.recordDataInNightWatch(r3, r0)     // Catch:{ Exception -> 0x00a7 }
        L_0x00a7:
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r3 = 2
            r2 = 1
            if (r1 == 0) goto L_0x00ca
            android.net.Network r0 = r1.getActiveNetwork()     // Catch:{ Exception -> 0x00d1 }
            android.net.NetworkCapabilities r1 = r1.getNetworkCapabilities(r0)     // Catch:{ Exception -> 0x00d1 }
            if (r1 == 0) goto L_0x00ca
            boolean r0 = r1.hasTransport(r2)     // Catch:{ Exception -> 0x00d1 }
            if (r0 != 0) goto L_0x00cb
            boolean r0 = r1.hasTransport(r5)     // Catch:{ Exception -> 0x00d1 }
            r3 = 1
            if (r0 != 0) goto L_0x00cb
        L_0x00ca:
            r3 = 0
        L_0x00cb:
            long r1 = (long) r3     // Catch:{ Exception -> 0x00d1 }
            r0 = 8
            com.facebook.errorreporting.nightwatch.Nightwatch$NightwatchNative.recordDataInNightWatch(r1, r0)     // Catch:{ Exception -> 0x00d1 }
        L_0x00d1:
            return
        L_0x00d2:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00d2 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0RR.CWp(X.0Mn, X.0ND):void");
    }

    public AnonymousClass0RR(Context context) {
        this.A00 = context;
    }

    public final Integer Awy() {
        return AnonymousClass006.A0x;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
