package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7Eb  reason: invalid class name and case insensitive filesystem */
public final class C121087Eb {
    public static final Map A0E = AnonymousClass0wJ.A0y();
    public ServiceConnection A00;
    public IInterface A01;
    public boolean A02;
    public final Context A03;
    public final Intent A04;
    public final IBinder.DeathRecipient A05 = new AnonymousClass7MK(this);
    public final AnonymousClass78d A06;
    public final AnonymousClass8eS A07;
    public final Object A08 = C86144wL.A0d();
    public final String A09;
    public final WeakReference A0A;
    public final List A0B = AnonymousClass0wJ.A0v();
    public final Set A0C = C18200wM.A0u();
    public final AtomicInteger A0D = C86144wL.A11();

    public C121087Eb(Context context, Intent intent, AnonymousClass78d r5, AnonymousClass8eS r6) {
        this.A03 = context;
        this.A06 = r5;
        this.A09 = "SplitInstallService";
        this.A04 = intent;
        this.A07 = r6;
        this.A0A = C86144wL.A0w((Object) null);
    }

    public static final void A00(C121087Eb r5) {
        synchronized (r5.A08) {
            Set<C111836oV> set = r5.A0C;
            for (C111836oV A002 : set) {
                A002.A00(C86144wL.A0H(r5.A09));
            }
            set.clear();
        }
    }

    public final Handler A01() {
        Handler handler;
        Map map = A0E;
        synchronized (map) {
            String str = this.A09;
            if (!map.containsKey(str)) {
                HandlerThread handlerThread = new HandlerThread(str, 10);
                handlerThread.start();
                map.put(str, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(str);
        }
        return handler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        A01().post(new X.C93705qw(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C111836oV r5) {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A08
            monitor-enter(r3)
            java.util.Set r0 = r4.A0C     // Catch:{ all -> 0x0036 }
            r0.remove(r5)     // Catch:{ all -> 0x0036 }
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicInteger r1 = r4.A0D     // Catch:{ all -> 0x0033 }
            int r0 = r1.get()     // Catch:{ all -> 0x0033 }
            if (r0 <= 0) goto L_0x0025
            int r0 = r1.decrementAndGet()     // Catch:{ all -> 0x0033 }
            if (r0 <= 0) goto L_0x0025
            X.78d r2 = r4.A06     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "Leaving the connection open for other ongoing calls."
            java.lang.Object[] r0 = X.C86164wN.A1T()     // Catch:{ all -> 0x0033 }
            r2.A01(r1, r0)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0025:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            X.5qw r1 = new X.5qw
            r1.<init>(r4)
            android.os.Handler r0 = r4.A01()
            r0.post(r1)
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        L_0x0036:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121087Eb.A02(X.6oV):void");
    }
}
