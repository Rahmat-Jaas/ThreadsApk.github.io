package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.redex.IDxBReceiverShape6S0100000_I2;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.068  reason: invalid class name */
public final class AnonymousClass068 {
    public final BroadcastReceiver A00;
    public final Context A01;
    public final Handler A02;
    public final AnonymousClass0OX A03;
    public final Set A04 = new HashSet();
    public final AtomicLong A05 = new AtomicLong(0);
    public final AtomicLong A06 = new AtomicLong(0);
    public final AtomicLong A07 = new AtomicLong(-1);
    public final C09740gb A08;
    public final C07400bS A09;
    public final RealtimeSinceBootClock A0A;
    public final AtomicLong A0B = new AtomicLong(-1);

    public static synchronized void A00(NetworkInfo networkInfo, AnonymousClass068 r8) {
        AtomicLong atomicLong;
        synchronized (r8) {
            long j = -1;
            if (networkInfo == null || !networkInfo.isConnected()) {
                AtomicLong atomicLong2 = r8.A0B;
                atomicLong2.set(SystemClock.elapsedRealtime());
                long andSet = r8.A06.getAndSet(0);
                if (andSet != 0) {
                    r8.A05.addAndGet(atomicLong2.get() - andSet);
                }
                atomicLong = r8.A07;
            } else {
                AtomicLong atomicLong3 = r8.A06;
                if (atomicLong3.compareAndSet(0, SystemClock.elapsedRealtime())) {
                    AtomicLong atomicLong4 = r8.A0B;
                    if (atomicLong4.get() != -1) {
                        atomicLong = r8.A07;
                        j = atomicLong3.get() - atomicLong4.get();
                    }
                }
            }
            atomicLong.set(j);
        }
    }

    public final NetworkInfo A01() {
        ConnectivityManager connectivityManager;
        C09740gb r1 = this.A08;
        if (!r1.A01() || (connectivityManager = (ConnectivityManager) r1.A00()) == null) {
            return null;
        }
        try {
            return connectivityManager.getNetworkInfo(connectivityManager.getActiveNetwork());
        } catch (Throwable th) {
            AnonymousClass0LU.A0E("NetworkProvider", "Exception in getNetworkInfo", th);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|(2:29|30)(1:31)) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        if (r0 == 0) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r0 = r7.getNetworkInfo(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r0 == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        return X.C07400bS.A00(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
        r0 = r0.getSubtype();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006b, code lost:
        r4 = X.C07400bS.A01(r0);
        r3 = r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x005c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C07460bY A03() {
        /*
            r8 = this;
            X.0gb r1 = r8.A08
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x001d
            java.lang.Object r7 = r1.A00()
            android.net.ConnectivityManager r7 = (android.net.ConnectivityManager) r7
        L_0x000e:
            X.0bS r6 = r8.A09
            if (r7 != 0) goto L_0x001f
            java.lang.Integer r3 = X.AnonymousClass006.A01
            r2 = 0
            r1 = -1
            r0 = 0
            X.0bY r5 = new X.0bY
            r5.<init>(r3, r0, r1, r2)
            return r5
        L_0x001d:
            r7 = 0
            goto L_0x000e
        L_0x001f:
            java.lang.Integer r4 = X.AnonymousClass006.A00
            r3 = 0
            android.net.Network r5 = r7.getActiveNetwork()     // Catch:{ all -> 0x0077 }
            android.net.NetworkCapabilities r1 = r7.getNetworkCapabilities(r5)     // Catch:{ all -> 0x0077 }
            if (r1 != 0) goto L_0x0031
            X.0bY r5 = X.C07400bS.A00(r7)     // Catch:{ all -> 0x0077 }
            return r5
        L_0x0031:
            r2 = 1
            boolean r0 = r1.hasTransport(r2)     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x003b
            java.lang.Integer r4 = X.AnonymousClass006.A0C     // Catch:{ all -> 0x0077 }
            goto L_0x0070
        L_0x003b:
            boolean r0 = r1.hasTransport(r3)     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0070
            android.content.Context r1 = r6.A00     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ all -> 0x0077 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0056
            java.lang.Integer r1 = X.AnonymousClass006.A15     // Catch:{ all -> 0x0077 }
            r0 = 0
            X.0bY r5 = new X.0bY     // Catch:{ all -> 0x0077 }
            r5.<init>(r1, r0, r3, r2)     // Catch:{ all -> 0x0077 }
            return r5
        L_0x0056:
            int r0 = r0.getDataNetworkType()     // Catch:{ SecurityException -> 0x005c }
            if (r0 != 0) goto L_0x006b
        L_0x005c:
            android.net.NetworkInfo r0 = r7.getNetworkInfo(r5)     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0067
            X.0bY r5 = X.C07400bS.A00(r7)     // Catch:{ all -> 0x0077 }
            return r5
        L_0x0067:
            int r0 = r0.getSubtype()     // Catch:{ all -> 0x0077 }
        L_0x006b:
            java.lang.Integer r4 = X.C07400bS.A01(r0)     // Catch:{ all -> 0x0077 }
            r3 = r0
        L_0x0070:
            r0 = 0
            X.0bY r5 = new X.0bY
            r5.<init>(r4, r0, r3, r2)
            return r5
        L_0x0077:
            r1 = move-exception
            r0 = -1
            X.0bY r5 = new X.0bY
            r5.<init>(r4, r1, r0, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass068.A03():X.0bY");
    }

    public AnonymousClass068(Context context, Handler handler, C07400bS r8, RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass0OX r10) {
        this.A03 = r10;
        this.A08 = r10.A00(ConnectivityManager.class, "connectivity");
        this.A01 = context;
        this.A0A = realtimeSinceBootClock;
        this.A02 = handler;
        this.A09 = r8;
        this.A00 = new IDxBReceiverShape6S0100000_I2(this, 3);
        A00(A01(), this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.A01.registerReceiver(this.A00, intentFilter, (String) null, this.A02);
    }

    public final NetworkInfo A02() {
        NetworkInfo A012 = A01();
        if (A012 == null || !A012.isConnected()) {
            return null;
        }
        return A012;
    }
}
