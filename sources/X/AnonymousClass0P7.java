package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.DeadObjectException;
import android.os.Handler;

/* renamed from: X.0P7  reason: invalid class name */
public final class AnonymousClass0P7 {
    public static final AnonymousClass0P7 A00 = new AnonymousClass0P7();

    public final boolean A04(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter, Handler handler) {
        try {
            context.registerReceiver(broadcastReceiver, intentFilter, (String) null, handler);
            return true;
        } catch (IllegalArgumentException | SecurityException e) {
            AnonymousClass0LU.A0F("RtiGracefulSystemMethodHelper", "Failed to registerReceiver", e);
            return false;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof DeadObjectException) {
                return false;
            }
            throw e2;
        }
    }

    public final void A01(AlarmManager alarmManager, PendingIntent pendingIntent, int i, long j) {
        try {
            alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
        } catch (SecurityException e) {
            AnonymousClass0LU.A0F("RtiGracefulSystemMethodHelper", "Failed to setAndAllowWhileIdle", e);
        } catch (RuntimeException e2) {
            if (!(e2.getCause() instanceof DeadObjectException)) {
                throw e2;
            }
        }
    }

    public final void A02(AlarmManager alarmManager, PendingIntent pendingIntent, Context context, int i, long j) {
        try {
            if (C02600Cb.A00(alarmManager, context)) {
                alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
            } else {
                alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
            }
        } catch (SecurityException e) {
            AnonymousClass0LU.A0F("RtiGracefulSystemMethodHelper", "Failed to set alarm", e);
        } catch (IllegalStateException | NullPointerException unused) {
        } catch (RuntimeException e2) {
            if (!(e2.getCause() instanceof DeadObjectException)) {
                throw e2;
            }
        }
    }

    public final boolean A03(BroadcastReceiver broadcastReceiver, Context context) {
        try {
            context.unregisterReceiver(broadcastReceiver);
            return true;
        } catch (SecurityException e) {
            AnonymousClass0LU.A0F("RtiGracefulSystemMethodHelper", "Failed to unregisterReceiver", e);
            return false;
        } catch (IllegalArgumentException e2) {
            AnonymousClass0LU.A0H("RtiGracefulSystemMethodHelper", "failed to unregisterReceiver", e2);
            return false;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof DeadObjectException) {
                return false;
            }
            throw e3;
        }
    }

    public final void A00(AlarmManager alarmManager, PendingIntent pendingIntent) {
        try {
            alarmManager.cancel(pendingIntent);
        } catch (SecurityException unused) {
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof DeadObjectException)) {
                throw e;
            }
        }
    }
}
