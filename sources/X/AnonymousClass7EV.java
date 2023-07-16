package X;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.Set;

/* renamed from: X.7EV  reason: invalid class name */
public final class AnonymousClass7EV {
    public static AnonymousClass7MJ A02;
    public static String A03;
    public static Set A04 = C18200wM.A0u();
    public static final Object A05 = C86144wL.A0d();
    public static final Object A06 = C86144wL.A0d();
    public final NotificationManager A00;
    public final Context A01;

    public static AnonymousClass7EV A00(Context context) {
        return new AnonymousClass7EV(context);
    }

    public final void A01(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.A00.notify(str, i, notification);
            return;
        }
        Context context = this.A01;
        AnonymousClass7ZQ r3 = new AnonymousClass7ZQ(notification, context.getPackageName(), str, i);
        synchronized (A06) {
            AnonymousClass7MJ r1 = A02;
            if (r1 == null) {
                r1 = new AnonymousClass7MJ(context.getApplicationContext());
                A02 = r1;
            }
            r1.A02.obtainMessage(0, r3).sendToTarget();
        }
        this.A00.cancel(str, i);
    }

    public final boolean A02() {
        return this.A00.areNotificationsEnabled();
    }

    public AnonymousClass7EV(Context context) {
        this.A01 = context;
        this.A00 = (NotificationManager) context.getSystemService("notification");
    }
}
