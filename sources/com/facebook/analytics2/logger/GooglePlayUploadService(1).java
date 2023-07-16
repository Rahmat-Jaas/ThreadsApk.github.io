package com.facebook.analytics2.logger;

import X.AnonymousClass00U;
import X.AnonymousClass0BD;
import X.AnonymousClass0BI;
import X.AnonymousClass0CO;
import X.AnonymousClass0CP;
import X.AnonymousClass0FX;
import X.AnonymousClass0LU;
import X.AnonymousClass6GX;
import X.AnonymousClass7IO;
import X.C02570By;
import X.C04240Mu;
import X.C115566vU;
import X.C14030oh;
import X.C16230sh;
import X.C86264wq;
import android.app.AlarmManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.common.gcmcompat.OneoffTask;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class GooglePlayUploadService extends C86264wq {
    public static boolean A01;
    public static boolean A02;
    public static final long A03;
    public static final long A04;
    public static final AtomicInteger A05 = new AtomicInteger(0);
    public AnonymousClass0CP A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0096, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
        X.AnonymousClass0LU.A0G("GooglePlayUploadService", "Misunderstood job extras: %s", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009e, code lost:
        return 2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x007e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0085 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096 A[ExcHandler: 0BI | NumberFormatException (r2v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:18:0x006b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A08(X.C113546rb r11) {
        /*
            r10 = this;
            r9 = 2
            android.os.Bundle r5 = r11.A00()     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            java.lang.String r2 = "GooglePlayUploadService"
            r1 = 0
            if (r5 != 0) goto L_0x0010
            java.lang.String r0 = "Job with no build ID, cancelling job"
            X.AnonymousClass0LU.A0B(r2, r0)     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            return r9
        L_0x0010:
            java.lang.String r0 = "__VERSION_CODE"
            int r1 = r5.getInt(r0, r1)     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            int r0 = X.AnonymousClass0FX.A01()     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            if (r0 == r1) goto L_0x002e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            java.lang.String r0 = "Job with old build ID: %d, cancelling job, expected: %d"
            X.AnonymousClass0LU.A0N(r2, r0, r1)     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            return r9
        L_0x002e:
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            java.lang.String r2 = r11.A01()     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            java.lang.String r1 = "-"
            r0 = 3
            java.lang.String[] r0 = r2.split(r1, r0)     // Catch:{ RuntimeException -> 0x008b, 0BI | NumberFormatException -> 0x0096 }
            r0 = r0[r9]     // Catch:{ RuntimeException -> 0x008b, 0BI | NumberFormatException -> 0x0096 }
            int r7 = java.lang.Integer.parseInt(r0)     // Catch:{ RuntimeException -> 0x008b, 0BI | NumberFormatException -> 0x0096 }
            X.0Ee r0 = new X.0Ee     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            r0.<init>(r5)     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            X.0By r2 = new X.0By     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            r2.<init>(r0)     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            java.lang.String r0 = "action"
            java.lang.String r1 = r5.getString(r0)     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            X.0NK r8 = new X.0NK     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            r8.<init>()     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            X.0CP r0 = r10.A00     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            r6 = 1
            r0.A04(r2, r8, r1, r7)     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ TimeoutException -> 0x0085, 0BI | NumberFormatException -> 0x0096 }
            long r0 = r0 - r3
            long r2 = A03     // Catch:{ TimeoutException -> 0x0085, 0BI | NumberFormatException -> 0x0096 }
            long r2 = r2 - r0
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ TimeoutException -> 0x0085, 0BI | NumberFormatException -> 0x0096 }
            long r4 = r4 + r2
        L_0x006b:
            java.util.concurrent.CountDownLatch r1 = r8.A00     // Catch:{ InterruptedException -> 0x007e }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x007e }
            boolean r0 = r1.await(r2, r0)     // Catch:{ InterruptedException -> 0x007e }
            if (r0 == 0) goto L_0x0078
            boolean r6 = r8.A01     // Catch:{ InterruptedException -> 0x007e }
            return r6
        L_0x0078:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException     // Catch:{ InterruptedException -> 0x007e }
            r0.<init>()     // Catch:{ InterruptedException -> 0x007e }
            throw r0     // Catch:{ InterruptedException -> 0x007e }
        L_0x007e:
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ TimeoutException -> 0x0085, 0BI | NumberFormatException -> 0x0096 }
            long r2 = r4 - r0
            goto L_0x006b
        L_0x0085:
            X.0CP r0 = r10.A00     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            r0.A03(r7)     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            return r6
        L_0x008b:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            X.0BI r0 = new X.0BI     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            r0.<init>(r1)     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
            throw r0     // Catch:{ 0BI | NumberFormatException -> 0x0096 }
        L_0x0096:
            r2 = move-exception
            java.lang.String r1 = "GooglePlayUploadService"
            java.lang.String r0 = "Misunderstood job extras: %s"
            X.AnonymousClass0LU.A0G(r1, r0, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.analytics2.logger.GooglePlayUploadService.A08(X.6rb):int");
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        A03 = timeUnit.toMillis(2);
        A04 = timeUnit.toMillis(5);
    }

    public static Intent A00(Context context, OneoffTask oneoffTask, int i) {
        Intent action = new Intent(context, GooglePlayUploadService.class).setAction(AnonymousClass00U.A0J("com.facebook.analytics2.logger.gms.TRY_SCHEDULE-", i));
        if (oneoffTask != null) {
            action.putExtras(new AnonymousClass0BD(oneoffTask, i).A00());
        }
        return action;
    }

    public static synchronized void A01(Context context) {
        Class<GooglePlayUploadService> cls = GooglePlayUploadService.class;
        synchronized (cls) {
            if (!A01) {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls), 1, 1);
                A01 = true;
            }
        }
    }

    public static synchronized void A02(Context context, C02570By r11, String str, int i, long j, long j2) {
        synchronized (GooglePlayUploadService.class) {
            A01(context);
            long j3 = j / 1000;
            long j4 = j2 / 1000;
            if (j2 < j) {
                AnonymousClass0LU.A0P("GooglePlay-MaxDelay", "MaxDelayms(%d) < MinDelayms(%d)", Long.valueOf(j2), Long.valueOf(j));
            }
            if (j3 >= j4) {
                j4 = 1 + j3;
            }
            C04240Mu r6 = new C04240Mu(new Bundle());
            r6.putString("action", str);
            r6.putInt("__VERSION_CODE", AnonymousClass0FX.A01());
            C115566vU r5 = new C115566vU();
            r5.A02();
            r5.A05(AnonymousClass00U.A0J("analytics2-gcm-", i));
            r5.A03(j3, j4);
            r5.A01();
            r5.A04((Bundle) r11.A00(r6));
            r5.A06(A02);
            A03(context, r5.A00(), i);
            A02 = true;
        }
    }

    public static void A04(Context context, OneoffTask oneoffTask, int i) {
        C16230sh r2 = new C16230sh();
        r2.A06(A00(context, oneoffTask, i), context.getClassLoader());
        ((AlarmManager) context.getSystemService("alarm")).set(2, SystemClock.elapsedRealtime() + A04, r2.A03(context, 0, 134217728));
    }

    public static void A03(Context context, OneoffTask oneoffTask, int i) {
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(context);
        if (isGooglePlayServicesAvailable == 0) {
            try {
                AnonymousClass7IO.A01(context).A03(oneoffTask);
            } catch (IllegalArgumentException e) {
                AnonymousClass6GX.A00(new ComponentName(context, oneoffTask.A02()), context, e);
            }
            A05.set(0);
        } else if (A05.incrementAndGet() == 3) {
            AnonymousClass0LU.A0P("GooglePlayUploadService", "Google Play Services became consistently unavailable after initial check: %s", instance.A04(isGooglePlayServicesAvailable));
        } else {
            instance.A04(isGooglePlayServicesAvailable);
            A04(context, oneoffTask, i);
        }
    }

    public final void onCreate() {
        int A042 = C14030oh.A04(-1030730689);
        super.onCreate();
        this.A00 = AnonymousClass0CP.A00(this);
        C14030oh.A0B(56126258, A042);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        int i4;
        int A042 = C14030oh.A04(906668551);
        if (intent != null) {
            try {
                String action = intent.getAction();
                if (action.startsWith("com.facebook.analytics2.logger.gms.TRY_SCHEDULE")) {
                    AnonymousClass0BD r0 = new AnonymousClass0BD(intent.getExtras());
                    A03(this, r0.A01, r0.A00);
                    C14030oh.A0B(-477882720, A042);
                    return 2;
                }
                if (action.startsWith("com.facebook")) {
                    i3 = this.A00.A02(intent, new AnonymousClass0CO(this, i2));
                    i4 = 456369191;
                } else {
                    i3 = super.onStartCommand(intent, i, i2);
                    i4 = -229868435;
                }
                C14030oh.A0B(i4, A042);
                return i3;
            } catch (AnonymousClass0BI e) {
                AnonymousClass0LU.A0O("GooglePlayUploadService", "Unexpected service start parameters: %s", e.getMessage());
                stopSelf(i2);
                C14030oh.A0B(-758250566, A042);
                return 2;
            }
        } else {
            AnonymousClass0BI r1 = new AnonymousClass0BI("Received a null intent, did you ever return START_STICKY?");
            C14030oh.A0B(-1634905976, A042);
            throw r1;
        }
    }
}
