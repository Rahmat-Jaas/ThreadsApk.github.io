package X;

import android.app.NotificationManager;
import android.content.Context;

/* renamed from: X.7zP  reason: invalid class name and case insensitive filesystem */
public final class C135407zP implements Runnable {
    public final /* synthetic */ C129347lj A00;

    public C135407zP(C129347lj r1) {
        this.A00 = r1;
    }

    public final void run() {
        Context context = this.A00.A0B;
        if (!AnonymousClass7D4.A02.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }
}
