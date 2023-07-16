package X;

import android.os.Process;

/* renamed from: X.88t  reason: invalid class name and case insensitive filesystem */
public final class C1374888t extends Thread {
    public final void run() {
        int myTid = Process.myTid();
        C1199877x r2 = C1199877x.A03;
        Integer valueOf = Integer.valueOf(myTid);
        synchronized (r2) {
            if (valueOf != null) {
                r2.A01.add(valueOf);
            }
        }
        super.run();
        synchronized (r2) {
            if (valueOf != null) {
                r2.A01.remove(valueOf);
                r2.A00.remove(valueOf);
            }
        }
    }

    public C1374888t(Runnable runnable, String str) {
        super(runnable, str);
    }

    public C1374888t(Runnable runnable) {
        super(runnable);
    }

    public C1374888t() {
    }
}
