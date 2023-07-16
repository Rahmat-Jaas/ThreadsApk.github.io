package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.7M5  reason: invalid class name */
public final class AnonymousClass7M5 implements ServiceConnection {
    public boolean A00 = false;
    public AnonymousClass4yW A01;
    public final Context A02;
    public final Intent A03;
    public final Queue A04 = new ArrayDeque();
    public final ScheduledExecutorService A05;

    public static final synchronized void A00(AnonymousClass7M5 r10) {
        Queue queue;
        AnonymousClass7M5 r7 = r10;
        synchronized (r7) {
            Log.isLoggable("EnhancedIntentService", 3);
            while (true) {
                queue = r10.A04;
                if (queue.isEmpty()) {
                    break;
                }
                Log.isLoggable("EnhancedIntentService", 3);
                AnonymousClass4yW r0 = r10.A01;
                if (r0 == null || !r0.isBinderAlive()) {
                    Log.isLoggable("EnhancedIntentService", 3);
                } else {
                    Log.isLoggable("EnhancedIntentService", 3);
                    C112726q5 r3 = (C112726q5) queue.poll();
                    AnonymousClass4yW r2 = r10.A01;
                    if (Binder.getCallingUid() == Process.myUid()) {
                        Log.isLoggable("EnhancedIntentService", 3);
                        C86254wp r1 = r2.A00;
                        if (r1.A02(r3.A01)) {
                            r3.A00();
                        } else {
                            Log.isLoggable("EnhancedIntentService", 3);
                            r1.A03.execute(new AnonymousClass81N(r3, r2));
                        }
                    } else {
                        throw new SecurityException("Binding only allowed within app");
                    }
                }
            }
            Log.isLoggable("EnhancedIntentService", 3);
            if (!r10.A00) {
                r10.A00 = true;
                try {
                    AnonymousClass7Gs A002 = AnonymousClass7Gs.A00();
                    Context context = r10.A02;
                    if (!AnonymousClass7Gs.A01(context, r10.A03, r7, A002, C18220wO.A0q(context), 65)) {
                        Log.e("EnhancedIntentService", "binding to the service failed");
                        r7.A00 = false;
                        while (!queue.isEmpty()) {
                            ((C112726q5) queue.poll()).A00();
                        }
                    }
                } catch (SecurityException e) {
                    Log.e("EnhancedIntentService", "Exception while binding the service", e);
                }
            }
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C86114wI.A1N("EnhancedIntentService", componentName);
        this.A00 = false;
        if (!(iBinder instanceof AnonymousClass4yW)) {
            String valueOf = String.valueOf(iBinder);
            StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(valueOf) + 28);
            A0s.append("Invalid service connection: ");
            Log.e("EnhancedIntentService", C18180wK.A0i(valueOf, A0s));
            while (true) {
                Queue queue = this.A04;
                if (queue.isEmpty()) {
                    break;
                }
                ((C112726q5) queue.poll()).A00();
            }
        } else {
            this.A01 = (AnonymousClass4yW) iBinder;
            A00(this);
        }
    }

    public AnonymousClass7M5(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new AnonymousClass85P("Firebase-FirebaseInstanceIdServiceConnection"));
        Context applicationContext = context.getApplicationContext();
        this.A02 = applicationContext;
        this.A03 = C18250wR.A05("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.A05 = scheduledThreadPoolExecutor;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C86114wI.A1N("EnhancedIntentService", componentName);
        A00(this);
    }
}
