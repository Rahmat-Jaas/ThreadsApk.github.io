package X;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4wp  reason: invalid class name and case insensitive filesystem */
public abstract class C86254wp extends Service {
    public int A00;
    public int A01;
    public Binder A02;
    public final ExecutorService A03;
    public final Object A04;

    public abstract void A01(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        Binder binder;
        Log.isLoggable("EnhancedIntentService", 3);
        binder = this.A02;
        if (binder == null) {
            binder = new AnonymousClass4yW(this);
            this.A02 = binder;
        }
        return binder;
    }

    public static final void A00(Intent intent, C86254wp r4) {
        int intExtra;
        if (!(intent == null || (intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0)) == 0)) {
            SparseArray sparseArray = FirebaseInstanceIdReceiver.A02;
            synchronized (sparseArray) {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray.get(intExtra);
                if (wakeLock != null) {
                    C13750oF.A02(wakeLock);
                    sparseArray.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", AnonymousClass00U.A0J("No active wake lock id #", intExtra));
                }
            }
        }
        synchronized (r4.A04) {
            int i = r4.A01 - 1;
            r4.A01 = i;
            if (i == 0) {
                r4.stopSelfResult(r4.A00);
            }
        }
    }

    public C86254wp() {
        String str;
        String valueOf = String.valueOf(C18210wN.A0e(this));
        if (valueOf.length() != 0) {
            str = "Firebase-".concat(valueOf);
        } else {
            str = new String("Firebase-");
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new AnonymousClass85P(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.A03 = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.A04 = C86144wL.A0d();
        this.A01 = 0;
    }

    public final boolean A02(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (!C117086y6.A01(intent)) {
            return true;
        }
        if (RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(intent.getStringExtra("google.c.a.tc"))) {
            C121787Id A002 = C121787Id.A00();
            C121787Id.A01(A002);
            A002.A02.A03(AnonymousClass8eV.class);
            Log.isLoggable("FirebaseMessaging", 3);
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
        } else {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        C117086y6.A00(intent, "_no");
        return true;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        int A042 = C14030oh.A04(1517681828);
        synchronized (this.A04) {
            try {
                this.A00 = i2;
                this.A01++;
            } catch (Throwable th) {
                while (true) {
                    C14030oh.A0B(738615142, A042);
                    throw th;
                }
            }
        }
        Intent intent2 = (Intent) AnonymousClass785.A00().A03.poll();
        int i4 = 2;
        if (intent2 == null) {
            A00(intent, this);
            i3 = 1602681485;
        } else if (A02(intent2)) {
            A00(intent, this);
            i3 = 1320837126;
        } else {
            this.A03.execute(new AnonymousClass82R(intent2, intent, this));
            i4 = 3;
            i3 = -2060694170;
        }
        C14030oh.A0B(i3, A042);
        return i4;
    }
}
