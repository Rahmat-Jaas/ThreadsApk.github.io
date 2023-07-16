package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.7M4  reason: invalid class name */
public final class AnonymousClass7M4 implements ServiceConnection {
    public C107516gs A00;
    public int A01 = 0;
    public final Messenger A02 = new Messenger(new C86874zG(Looper.getMainLooper(), new AnonymousClass7MF(this)));
    public final Queue A03 = new ArrayDeque();
    public final SparseArray A04 = C86154wM.A0D();
    public final /* synthetic */ C120897Da A05;

    public final synchronized void A00() {
        if (this.A01 == 2 && this.A03.isEmpty() && this.A04.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.A01 = 3;
            AnonymousClass7Gs.A00().A02(this.A05.A02, this);
        }
    }

    public final synchronized void A01(int i, String str) {
        SparseArray sparseArray;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String.valueOf(str);
        }
        int i2 = this.A01;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.A01 = 4;
            AnonymousClass7Gs.A00().A02(this.A05.A02, this);
            AnonymousClass6CH r3 = new AnonymousClass6CH(i, str);
            Queue<C113836sE> queue = this.A03;
            for (C113836sE A002 : queue) {
                A002.A00(r3);
            }
            queue.clear();
            int i3 = 0;
            while (true) {
                sparseArray = this.A04;
                if (i3 >= sparseArray.size()) {
                    break;
                }
                ((C113836sE) sparseArray.valueAt(i3)).A00(r3);
                i3++;
            }
            sparseArray.clear();
        } else if (i2 == 3) {
            this.A01 = 4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A02(X.C113836sE r10) {
        /*
            r9 = this;
            r5 = r9
            monitor-enter(r5)
            int r0 = r9.A01     // Catch:{ all -> 0x0070 }
            r1 = 2
            r2 = 0
            r8 = 1
            if (r0 == 0) goto L_0x0027
            if (r0 == r8) goto L_0x0021
            if (r0 == r1) goto L_0x000f
            monitor-exit(r5)
            return r2
        L_0x000f:
            java.util.Queue r0 = r9.A03     // Catch:{ all -> 0x0070 }
            r0.add(r10)     // Catch:{ all -> 0x0070 }
            X.7Da r0 = r9.A05     // Catch:{ all -> 0x0070 }
            java.util.concurrent.ScheduledExecutorService r1 = r0.A03     // Catch:{ all -> 0x0070 }
            X.7zY r0 = new X.7zY     // Catch:{ all -> 0x0070 }
            r0.<init>(r9)     // Catch:{ all -> 0x0070 }
            r1.execute(r0)     // Catch:{ all -> 0x0070 }
            goto L_0x0068
        L_0x0021:
            java.util.Queue r0 = r9.A03     // Catch:{ all -> 0x0070 }
            r0.add(r10)     // Catch:{ all -> 0x0070 }
            goto L_0x0068
        L_0x0027:
            java.util.Queue r0 = r9.A03     // Catch:{ all -> 0x0070 }
            r0.add(r10)     // Catch:{ all -> 0x0070 }
            int r0 = r9.A01     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x006a
            java.lang.String r0 = "MessengerIpcClient"
            android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0070 }
            r9.A01 = r8     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            android.content.Intent r4 = X.C18250wR.A05(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "com.google.android.gms"
            r4.setPackage(r0)     // Catch:{ all -> 0x0070 }
            X.7Gs r6 = X.AnonymousClass7Gs.A00()     // Catch:{ all -> 0x0070 }
            X.7Da r1 = r9.A05     // Catch:{ all -> 0x0070 }
            android.content.Context r3 = r1.A02     // Catch:{ all -> 0x0070 }
            java.lang.String r7 = X.C18220wO.A0q(r3)     // Catch:{ all -> 0x0070 }
            boolean r0 = X.AnonymousClass7Gs.A01(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = "Unable to bind to service"
            r9.A01(r2, r0)     // Catch:{ all -> 0x0070 }
            goto L_0x0068
        L_0x005a:
            java.util.concurrent.ScheduledExecutorService r4 = r1.A03     // Catch:{ all -> 0x0070 }
            X.7zZ r3 = new X.7zZ     // Catch:{ all -> 0x0070 }
            r3.<init>(r9)     // Catch:{ all -> 0x0070 }
            r1 = 30
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0070 }
            r4.schedule(r3, r1, r0)     // Catch:{ all -> 0x0070 }
        L_0x0068:
            monitor-exit(r5)
            return r8
        L_0x006a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0070 }
            r0.<init>()     // Catch:{ all -> 0x0070 }
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7M4.A02(X.6sE):boolean");
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String str;
        Log.isLoggable("MessengerIpcClient", 2);
        if (iBinder == null) {
            str = "Null service connection";
        } else {
            try {
                this.A00 = new C107516gs(iBinder);
                this.A01 = 2;
                this.A05.A03.execute(new C135477zY(this));
            } catch (RemoteException e) {
                str = e.getMessage();
            }
        }
        A01(0, str);
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        A01(2, "Service disconnected");
    }

    public AnonymousClass7M4(C120897Da r4) {
        this.A05 = r4;
    }
}
