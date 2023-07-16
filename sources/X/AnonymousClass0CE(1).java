package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Messenger;
import android.os.PowerManager;
import android.os.SystemClock;
import ch.boye.httpclientandroidlib.impl.auth.NTLMEngineImpl;
import com.facebook.analytics2.logger.HighPriUploadRetryReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0CE  reason: invalid class name */
public final class AnonymousClass0CE {
    public static AnonymousClass0CE A02;
    public static final long A03 = TimeUnit.SECONDS.toMillis(90);
    public PowerManager A00;
    public AlarmManager A01;

    private synchronized AlarmManager A00(Context context) {
        AlarmManager alarmManager;
        alarmManager = this.A01;
        if (alarmManager == null) {
            alarmManager = (AlarmManager) context.getSystemService("alarm");
            this.A01 = alarmManager;
        }
        return alarmManager;
    }

    public static AnonymousClass0CE A01() {
        AnonymousClass0CE r0;
        synchronized (AnonymousClass0CE.class) {
            r0 = A02;
            if (r0 == null) {
                r0 = new AnonymousClass0CE();
                A02 = r0;
            }
        }
        return r0;
    }

    public final void A02(Context context, Bundle bundle, C02570By r25, AnonymousClass0CJ r26, String str, int i) {
        PowerManager powerManager;
        List list;
        AnonymousClass0CJ r11 = r26;
        if (r26 == null || (r11.A01 >= 0 && r11.A00 >= 0)) {
            Context context2 = context;
            ComponentName componentName = ((AnonymousClass0Kv) AnonymousClass0CD.A00(context2)).A00;
            synchronized (AnonymousClass0CE.class) {
                powerManager = this.A00;
                if (powerManager == null) {
                    powerManager = (PowerManager) context2.getApplicationContext().getSystemService("power");
                    this.A00 = powerManager;
                }
            }
            int i2 = i;
            PowerManager.WakeLock A002 = C13750oF.A00(powerManager, AnonymousClass00U.A0d("JobSchedulerHack-", componentName.getShortClassName(), "-client-", String.valueOf(i2)), 1);
            C13750oF.A03(A002);
            AnonymousClass0CM r1 = new AnonymousClass0CM(new C02730Cq(A002));
            Messenger messenger = new Messenger(r1);
            synchronized (AnonymousClass0CN.class) {
                list = AnonymousClass0CN.A09;
                if (list == null) {
                    list = Collections.synchronizedList(new ArrayList(1));
                    AnonymousClass0CN.A09 = list;
                }
            }
            list.add(r1);
            C02570By r10 = r25;
            String str2 = str;
            Intent putExtras = new Intent().setComponent(componentName).setAction(str2).putExtras(new AnonymousClass0CN(context2, bundle, messenger, r10, r11, str2, i2).A01());
            long j = A03;
            A002.acquire(j);
            AnonymousClass0DB.A01(A002, j);
            try {
                context2.startService(putExtras);
            } catch (IllegalStateException unused) {
                A03(context2, r10, str2, i2, 0, true);
            }
        } else {
            throw new IllegalStateException("fallback delay ms must be >= 0");
        }
    }

    public final void A03(Context context, C02570By r14, String str, int i, long j, boolean z) {
        ComponentName componentName;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Context context2 = context;
        C02570By r8 = r14;
        AnonymousClass0CN r4 = new AnonymousClass0CN(context2, (Bundle) null, (Messenger) null, r8, new AnonymousClass0CJ(timeUnit.toMillis(15), timeUnit.toMillis(30), str), str, i);
        Intent intent = new Intent();
        if (z) {
            componentName = new ComponentName(context, HighPriUploadRetryReceiver.class);
        } else {
            componentName = ((AnonymousClass0Kv) AnonymousClass0CD.A00(context)).A00;
        }
        Intent putExtras = intent.setComponent(componentName).setAction("com.facebook.analytics2.logger.UPLOAD_NOW").putExtras(r4.A01());
        int i2 = 134217728;
        if (Build.VERSION.SDK_INT >= 30) {
            i2 = 201326592;
        }
        try {
            PendingIntent service = PendingIntent.getService(context, 1, putExtras, i2);
            try {
                if (C02600Cb.A00(A00(context), context)) {
                    A00(context).setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + j, service);
                } else {
                    A00(context).set(2, SystemClock.elapsedRealtime() + j, service);
                }
            } catch (NullPointerException e) {
                AnonymousClass0LU.A0G("JobSchedulerHack", "Unexpected NPE when scheduling alarm. This is most likely an OS bug.", e);
            }
        } catch (SecurityException e2) {
            AnonymousClass0LU.A0O("JobSchedulerHack", "Exception while calling PendingIntent.getService: %s", e2.getMessage());
        }
    }

    public final void A04(Context context, boolean z) {
        ComponentName componentName;
        Intent intent = new Intent();
        if (z) {
            componentName = new ComponentName(context, HighPriUploadRetryReceiver.class);
        } else {
            componentName = ((AnonymousClass0Kv) AnonymousClass0CD.A00(context)).A00;
        }
        Intent action = intent.setComponent(componentName).setAction("com.facebook.analytics2.logger.UPLOAD_NOW");
        int i = Build.VERSION.SDK_INT;
        int i2 = NTLMEngineImpl.FLAG_NEGOTIATE_128;
        if (i >= 30) {
            i2 = 603979776;
        }
        PendingIntent service = PendingIntent.getService(context, 1, action, i2);
        if (service != null) {
            A00(context).cancel(service);
        }
    }
}
