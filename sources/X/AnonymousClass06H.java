package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.redex.IDxBReceiverShape6S0100000_I2;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.06H  reason: invalid class name */
public final class AnonymousClass06H extends AbstractExecutorService implements ExecutorService, ScheduledExecutorService {
    public static final String A0A = AnonymousClass00U.A0L(AnonymousClass06H.class.getCanonicalName(), ".ACTION_ALARM.");
    public final Handler A00;
    public final String A01;
    public final PriorityQueue A02 = new PriorityQueue();
    public final AlarmManager A03;
    public final PendingIntent A04;
    public final BroadcastReceiver A05;
    public final Context A06;
    public final RealtimeSinceBootClock A07;
    public final AnonymousClass0P7 A08;
    public final AtomicLong A09 = new AtomicLong(-1);

    public static void A01(AnonymousClass06H r7) {
        ArrayList<AnonymousClass06P> arrayList;
        synchronized (r7) {
            arrayList = new ArrayList<>();
            while (true) {
                PriorityQueue priorityQueue = r7.A02;
                if (priorityQueue.isEmpty() || ((AnonymousClass086) priorityQueue.peek()).A00 > SystemClock.elapsedRealtime()) {
                    A02(r7);
                } else {
                    arrayList.add(((AnonymousClass086) priorityQueue.remove()).A01);
                }
            }
            A02(r7);
        }
        arrayList.size();
        for (AnonymousClass06P run : arrayList) {
            run.run();
        }
    }

    public final void execute(Runnable runnable) {
        A00(new AnonymousClass06P(this, (Object) null, runnable), this, SystemClock.elapsedRealtime());
        this.A00.post(new AnonymousClass08A(this));
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        AnonymousClass06P r4 = new AnonymousClass06P(this, (Object) null, runnable);
        A00(r4, this, SystemClock.elapsedRealtime() + timeUnit.toMillis(j));
        return r4;
    }

    public static void A02(AnonymousClass06H r11) {
        PendingIntent pendingIntent = r11.A04;
        if (pendingIntent == null) {
            AnonymousClass0LU.A0C("WakingExecutorService", "Pending intent is null, not scheduling intent to run");
            return;
        }
        PriorityQueue priorityQueue = r11.A02;
        if (priorityQueue.isEmpty()) {
            r11.A08.A00(r11.A03, pendingIntent);
            return;
        }
        long j = ((AnonymousClass086) priorityQueue.peek()).A00;
        AtomicLong atomicLong = r11.A09;
        if (atomicLong.get() != j) {
            SystemClock.elapsedRealtime();
            r11.A08.A02(r11.A03, pendingIntent, r11.A06, 2, j);
            atomicLong.set(j);
        }
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final RunnableFuture newTaskFor(Callable callable) {
        return new C002901j(this, callable);
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void shutdown() {
        PendingIntent pendingIntent = this.A04;
        if (pendingIntent != null) {
            this.A08.A00(this.A03, pendingIntent);
        }
        try {
            this.A06.unregisterReceiver(this.A05);
        } catch (IllegalArgumentException e) {
            AnonymousClass0LU.A0H("WakingExecutorService", "Failed to unregister broadcast receiver", e);
        }
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Future submit(Callable callable) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AnonymousClass06P r4 = new AnonymousClass06P(this, callable);
        A00(r4, this, SystemClock.elapsedRealtime() + timeUnit.toMillis(0));
        this.A00.post(new AnonymousClass08C(this));
        return r4;
    }

    public AnonymousClass06H(Context context, Handler handler, RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass0P7 r9, AnonymousClass0OX r10, String str) {
        PendingIntent pendingIntent;
        StringBuilder sb = new StringBuilder(A0A);
        sb.append(str);
        String packageName = context.getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            sb.append('.');
            sb.append(packageName);
        }
        String obj = sb.toString();
        this.A01 = obj;
        this.A06 = context;
        this.A07 = realtimeSinceBootClock;
        C09740gb A002 = r10.A00(AlarmManager.class, "alarm");
        if (A002.A01()) {
            this.A03 = (AlarmManager) A002.A00();
            this.A00 = handler;
            this.A08 = r9;
            Intent intent = new Intent(obj);
            intent.setPackage(context.getPackageName());
            try {
                C16230sh r2 = new C16230sh();
                r2.A06(intent, (ClassLoader) null);
                r2.A05();
                pendingIntent = r2.A02(context, 0, 134217728);
            } catch (SecurityException e) {
                AnonymousClass0LU.A0F("WakingExecutorService", "Failed to create pending intent", e);
                pendingIntent = null;
            }
            this.A04 = pendingIntent;
            IDxBReceiverShape6S0100000_I2 iDxBReceiverShape6S0100000_I2 = new IDxBReceiverShape6S0100000_I2(this, 2);
            this.A05 = iDxBReceiverShape6S0100000_I2;
            this.A06.registerReceiver(iDxBReceiverShape6S0100000_I2, new IntentFilter(this.A01), (String) null, handler);
            return;
        }
        throw new IllegalArgumentException("Cannot acquire Alarm service");
    }

    public static void A00(AnonymousClass06P r2, AnonymousClass06H r3, long j) {
        SystemClock.elapsedRealtime();
        synchronized (r3) {
            r3.A02.add(new AnonymousClass086(r2, j));
            A02(r3);
        }
    }

    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new C002901j(this, obj, runnable);
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        AnonymousClass06P r4 = new AnonymousClass06P(this, callable);
        A00(r4, this, SystemClock.elapsedRealtime() + timeUnit.toMillis(j));
        return r4;
    }

    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        AnonymousClass06P r2 = new AnonymousClass06P(this, obj, runnable);
        A00(r2, this, SystemClock.elapsedRealtime());
        this.A00.post(new AnonymousClass08A(this));
        return r2;
    }

    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        AnonymousClass06P r2 = new AnonymousClass06P(this, (Object) null, runnable);
        A00(r2, this, SystemClock.elapsedRealtime());
        this.A00.post(new AnonymousClass08A(this));
        return r2;
    }
}
