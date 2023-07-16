package X;

import android.app.Service;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.01G  reason: invalid class name */
public abstract class AnonymousClass01G extends Service {
    public static final boolean DEBUG = false;
    public static final String NO_LONGER_RUNNING_MESSAGE = "Caller no longer running";
    public static final String TAG = "JobIntentService";
    public static final HashMap sClassWorkEnqueuer = new HashMap();
    public static final Object sLock = new Object();
    public final ArrayList mCompatQueue = null;
    public AnonymousClass01F mCompatWorkEnqueuer;
    public AnonymousClass01C mCurProcessor;
    public boolean mDestroyed = false;
    public boolean mInterruptIfStopped = false;
    public AnonymousClass01D mJobImpl;
    public boolean mStopped = false;

    public abstract void onHandleWork(Intent intent);

    public boolean onStopCurrentWork() {
        return true;
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent != null) {
            synchronized (sLock) {
                AnonymousClass01F workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
                workEnqueuer.A00(i);
                C010304s r0 = (C010304s) workEnqueuer;
                r0.A01.enqueue(r0.A00, new JobWorkItem(intent));
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    public static AnonymousClass01F getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        HashMap hashMap = sClassWorkEnqueuer;
        AnonymousClass01F r0 = (AnonymousClass01F) hashMap.get(componentName);
        if (r0 != null) {
            return r0;
        }
        if (z) {
            C010304s r02 = new C010304s(componentName, context, i);
            hashMap.put(componentName, r02);
            return r02;
        }
        throw new IllegalArgumentException("Can't be here without a job id");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        if (r2 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2.getIntent().setExtrasClassLoader(r4.A01.getClassLoader());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return new X.AnonymousClass05W(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass01E dequeueWork() {
        /*
            r5 = this;
            X.01D r4 = r5.mJobImpl
            r3 = 0
            if (r4 == 0) goto L_0x0045
            X.05G r4 = (X.AnonymousClass05G) r4     // Catch:{ SecurityException -> 0x002e }
            java.lang.Object r1 = r4.A02     // Catch:{ SecurityException -> 0x002e }
            monitor-enter(r1)     // Catch:{ SecurityException -> 0x002e }
            android.app.job.JobParameters r0 = r4.A00     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0010
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            return r3
        L_0x0010:
            android.app.job.JobWorkItem r2 = r0.dequeueWork()     // Catch:{ all -> 0x002b }
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            if (r2 == 0) goto L_0x002a
            android.content.Intent r1 = r2.getIntent()     // Catch:{ SecurityException -> 0x002e }
            X.01G r0 = r4.A01     // Catch:{ SecurityException -> 0x002e }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ SecurityException -> 0x002e }
            r1.setExtrasClassLoader(r0)     // Catch:{ SecurityException -> 0x002e }
            X.05W r0 = new X.05W     // Catch:{ SecurityException -> 0x002e }
            r0.<init>(r2, r4)     // Catch:{ SecurityException -> 0x002e }
            return r0
        L_0x002a:
            return r3
        L_0x002b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ SecurityException -> 0x002e }
        L_0x002e:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            if (r1 == 0) goto L_0x005b
            java.lang.String r0 = "Caller no longer running"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x005b
            java.lang.String r1 = "JobIntentService"
            java.lang.String r0 = "Captured a \"Caller no longer running\""
            android.util.Log.e(r1, r0, r2)
            return r3
        L_0x0045:
            java.util.ArrayList r4 = r5.mCompatQueue
            monitor-enter(r4)
            java.util.ArrayList r1 = r5.mCompatQueue     // Catch:{ all -> 0x0059 }
            int r0 = r1.size()     // Catch:{ all -> 0x0059 }
            if (r0 <= 0) goto L_0x0057
            r0 = 0
            java.lang.Object r3 = r1.remove(r0)     // Catch:{ all -> 0x0059 }
            X.01E r3 = (X.AnonymousClass01E) r3     // Catch:{ all -> 0x0059 }
        L_0x0057:
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            return r3
        L_0x0059:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
        L_0x005b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01G.dequeueWork():X.01E");
    }

    public boolean doStopCurrentWork() {
        AnonymousClass01C r1 = this.mCurProcessor;
        if (r1 != null) {
            r1.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return true;
    }

    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            AnonymousClass01C r2 = new AnonymousClass01C(this);
            this.mCurProcessor = r2;
            r2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public IBinder onBind(Intent intent) {
        AnonymousClass01D r0 = this.mJobImpl;
        if (r0 != null) {
            return ((AnonymousClass05G) r0).getBinder();
        }
        return null;
    }

    public void processorFinished() {
        ArrayList arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mCurProcessor = null;
                ArrayList arrayList2 = this.mCompatQueue;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ensureProcessorRunningLocked(false);
                }
            }
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    public void onCreate() {
        int A04 = C14030oh.A04(-1748091824);
        super.onCreate();
        this.mJobImpl = new AnonymousClass05G(this);
        this.mCompatWorkEnqueuer = null;
        C14030oh.A0B(-53271393, A04);
    }

    public void onDestroy() {
        int A04 = C14030oh.A04(773526438);
        super.onDestroy();
        ArrayList arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mDestroyed = true;
                } finally {
                    C14030oh.A0B(426055373, A04);
                }
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        int i4;
        int A04 = C14030oh.A04(1529133293);
        ArrayList arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    ArrayList arrayList2 = this.mCompatQueue;
                    if (intent == null) {
                        intent = new Intent();
                    }
                    arrayList2.add(new AnonymousClass05Z(intent, this, i2));
                    ensureProcessorRunningLocked(true);
                } catch (Throwable th) {
                    while (true) {
                        C14030oh.A0B(1622148265, A04);
                        throw th;
                    }
                }
            }
            i3 = 3;
            i4 = 1991930718;
        } else {
            i3 = 2;
            i4 = 1390013199;
        }
        C14030oh.A0B(i4, A04);
        return i3;
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }

    public static void enqueueWork(Context context, Class cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }
}
