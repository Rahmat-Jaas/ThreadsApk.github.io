package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.SystemClock;
import com.facebook.errorreporting.nightwatch.Nightwatch$NightwatchNative;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0QI  reason: invalid class name */
public final class AnonymousClass0QI implements Runnable {
    public long A00;
    public C06120Xt A01;
    public final ActivityManager.RunningAppProcessInfo A02;
    public final Object A03 = new Object();
    public final List A04 = new CopyOnWriteArrayList();
    public final Context A05;
    public volatile boolean A06;

    public AnonymousClass0QI(Context context) {
        this.A05 = context;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        this.A02 = runningAppProcessInfo;
        runningAppProcessInfo.importance = 0;
        this.A01 = null;
    }

    public static boolean A00(AnonymousClass0QI r10) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        Integer num;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = r10.A02;
        synchronized (runningAppProcessInfo) {
            i = runningAppProcessInfo.importance;
            try {
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                z = true;
            } catch (RuntimeException e) {
                AnonymousClass0LU.A0E("ProcessImportanceProvider", "Could not get current importance", e);
                z = false;
            }
            if (z) {
                r10.A00 = SystemClock.uptimeMillis();
                i2 = runningAppProcessInfo.importance;
            } else {
                i2 = i;
            }
        }
        synchronized (r10.A03) {
            C06120Xt r0 = r10.A01;
            if (r0 != null) {
                C06150Xw r7 = r0.A00;
                synchronized (r7) {
                    if (r7.A0E != null) {
                        if (!z || r7.A00 == i2) {
                            C06150Xw.A00(r7);
                        } else {
                            Integer num2 = (Integer) C06150Xw.A0J.get(Integer.valueOf(i2));
                            if (num2 == null) {
                                num = AnonymousClass006.A15;
                            } else {
                                num = AnonymousClass006.A0u;
                            }
                            C06150Xw.A02(r7, num, num2 == null ? new byte[]{(byte) (i2 >>> 8), (byte) i2} : new byte[]{num2.byteValue()});
                            r7.A00 = i2;
                        }
                    }
                }
            }
        }
        if (z && i != i2) {
            Iterator it = r10.A04.iterator();
            while (it.hasNext()) {
                it.next();
                synchronized (AnonymousClass0QA.A02) {
                    z2 = AnonymousClass0QA.A01;
                }
                if (z2) {
                    Nightwatch$NightwatchNative.recordDataInNightWatch((long) i2, 9);
                }
            }
        }
        return z;
    }

    public final void run() {
        while (true) {
            A00(this);
            try {
                Thread.sleep((long) 0);
            } catch (InterruptedException unused) {
            }
        }
    }
}
