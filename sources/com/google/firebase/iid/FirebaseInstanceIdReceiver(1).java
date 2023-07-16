package com.google.firebase.iid;

import X.AnonymousClass7M5;
import X.C112726q5;
import X.C14030oh;
import X.C86154wM;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;

public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {
    public static int A00 = 1;
    public static AnonymousClass7M5 A01;
    public static final SparseArray A02 = C86154wM.A0D();

    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(android.content.Context r10, android.content.Intent r11) {
        /*
            r9 = this;
            r0 = 0
            r11.setComponent(r0)
            java.lang.String r0 = r10.getPackageName()
            r11.setPackage(r0)
            java.lang.String r0 = "from"
            java.lang.String r1 = r11.getStringExtra(r0)
            java.lang.String r0 = "google.com/iid"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009e
            java.lang.String r0 = "CMD"
            java.lang.String r2 = r11.getStringExtra(r0)
            if (r2 == 0) goto L_0x01f5
            r1 = 3
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x0038
            android.os.Bundle r0 = r11.getExtras()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String.valueOf(r2)
            java.lang.String.valueOf(r0)
        L_0x0038:
            java.lang.String r0 = "RST"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0091
            java.lang.String r0 = "RST_FULL"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0091
            java.lang.String r0 = "SYNC"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01f5
            X.7Id r0 = X.C121787Id.A00()
            com.google.firebase.iid.FirebaseInstanceId r6 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r0)
            X.7EE r5 = com.google.firebase.iid.FirebaseInstanceId.A08
            java.lang.String r0 = ""
            monitor-enter(r5)
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "|T|"
            java.lang.String r4 = r1.concat(r0)     // Catch:{ all -> 0x008e }
            android.content.SharedPreferences r0 = r5.A01     // Catch:{ all -> 0x008e }
            android.content.SharedPreferences$Editor r3 = r0.edit()     // Catch:{ all -> 0x008e }
            java.util.Map r0 = r0.getAll()     // Catch:{ all -> 0x008e }
            java.util.Iterator r2 = X.C18220wO.A0x(r0)     // Catch:{ all -> 0x008e }
        L_0x0075:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0089
            java.lang.String r1 = X.C18180wK.A0k(r2)     // Catch:{ all -> 0x008e }
            boolean r0 = r1.startsWith(r4)     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0075
            r3.remove(r1)     // Catch:{ all -> 0x008e }
            goto L_0x0075
        L_0x0089:
            r3.commit()     // Catch:{ all -> 0x008e }
            goto L_0x01f1
        L_0x008e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0091:
            X.7Id r0 = X.C121787Id.A00()
            com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r0)
            r0.A06()
            goto L_0x01f5
        L_0x009e:
            java.lang.String r2 = "gcm.rawData64"
            java.lang.String r1 = r11.getStringExtra(r2)
            if (r1 == 0) goto L_0x00b3
            r0 = 0
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r0 = "rawData"
            r11.putExtra(r0, r1)
            r11.removeExtra(r2)
        L_0x00b3:
            r3 = 1
            android.content.pm.ApplicationInfo r0 = r10.getApplicationInfo()
            int r1 = r0.targetSdkVersion
            r0 = 26
            boolean r2 = X.C86114wI.A1U(r1, r0)
            int r1 = r11.getFlags()
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            if (r1 != 0) goto L_0x00ca
            r3 = 0
        L_0x00ca:
            if (r2 == 0) goto L_0x00d4
            if (r3 != 0) goto L_0x00d4
            int r0 = A00(r9, r10, r11)
            goto L_0x01f6
        L_0x00d4:
            X.785 r4 = X.AnonymousClass785.A00()
            java.lang.String r3 = "FirebaseInstanceId"
            r6 = 3
            android.util.Log.isLoggable(r3, r6)
            java.util.Queue r0 = r4.A03
            r0.offer(r11)
            java.lang.String r0 = "com.google.firebase.MESSAGING_EVENT"
            android.content.Intent r2 = X.C18250wR.A05(r0)
            java.lang.String r0 = r10.getPackageName()
            r2.setPackage(r0)
            monitor-enter(r4)
            java.lang.String r1 = r4.A02     // Catch:{ all -> 0x0200 }
            if (r1 != 0) goto L_0x015b
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ all -> 0x0200 }
            r0 = 0
            android.content.pm.ResolveInfo r0 = r1.resolveService(r2, r0)     // Catch:{ all -> 0x0200 }
            r1 = 0
            if (r0 == 0) goto L_0x0131
            android.content.pm.ServiceInfo r7 = r0.serviceInfo     // Catch:{ all -> 0x0200 }
            if (r7 == 0) goto L_0x0131
            java.lang.String r0 = r10.getPackageName()     // Catch:{ all -> 0x0200 }
            java.lang.String r8 = r7.packageName     // Catch:{ all -> 0x0200 }
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x0200 }
            if (r0 == 0) goto L_0x0134
            java.lang.String r5 = r7.name     // Catch:{ all -> 0x0200 }
            if (r5 == 0) goto L_0x0134
            java.lang.String r0 = "."
            boolean r0 = r5.startsWith(r0)     // Catch:{ all -> 0x0200 }
            if (r0 == 0) goto L_0x012e
            java.lang.String r0 = r10.getPackageName()     // Catch:{ all -> 0x0200 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0200 }
            java.lang.String r0 = r7.name     // Catch:{ all -> 0x0200 }
            java.lang.String r1 = X.C86104wH.A0u(r0, r1)     // Catch:{ all -> 0x0200 }
            r4.A02 = r1     // Catch:{ all -> 0x0200 }
            goto L_0x015b
        L_0x012e:
            r4.A02 = r5     // Catch:{ all -> 0x0200 }
            goto L_0x015a
        L_0x0131:
            java.lang.String r0 = "Failed to resolve target intent service, skipping classname enforcement"
            goto L_0x0156
        L_0x0134:
            java.lang.String r7 = r7.name     // Catch:{ all -> 0x0200 }
            int r0 = X.C86104wH.A0A(r8)     // Catch:{ all -> 0x0200 }
            int r5 = r0 + 94
            int r0 = X.C86104wH.A0A(r7)     // Catch:{ all -> 0x0200 }
            int r5 = r5 + r0
            java.lang.StringBuilder r5 = X.C86114wI.A0s(r5)     // Catch:{ all -> 0x0200 }
            java.lang.String r0 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            r5.append(r0)     // Catch:{ all -> 0x0200 }
            r5.append(r8)     // Catch:{ all -> 0x0200 }
            java.lang.String r0 = "/"
            r5.append(r0)     // Catch:{ all -> 0x0200 }
            java.lang.String r0 = X.C18180wK.A0i(r7, r5)     // Catch:{ all -> 0x0200 }
        L_0x0156:
            android.util.Log.e(r3, r0)     // Catch:{ all -> 0x0200 }
            goto L_0x015b
        L_0x015a:
            r1 = r5
        L_0x015b:
            monitor-exit(r4)
            if (r1 == 0) goto L_0x016e
            boolean r0 = android.util.Log.isLoggable(r3, r6)
            if (r0 == 0) goto L_0x0167
            java.lang.String.valueOf(r1)
        L_0x0167:
            java.lang.String r0 = r10.getPackageName()
            r2.setClassName(r0, r1)
        L_0x016e:
            boolean r0 = r4.A01(r10)     // Catch:{ SecurityException -> 0x01e8, IllegalStateException -> 0x01c7 }
            if (r0 == 0) goto L_0x01b9
            android.util.SparseArray r5 = A02     // Catch:{ SecurityException -> 0x01e8, IllegalStateException -> 0x01c7 }
            monitor-enter(r5)     // Catch:{ SecurityException -> 0x01e8, IllegalStateException -> 0x01c7 }
            int r6 = A00     // Catch:{ all -> 0x01b6 }
            int r0 = r6 + 1
            A00 = r0     // Catch:{ all -> 0x01b6 }
            r7 = 1
            if (r0 > 0) goto L_0x0182
            A00 = r7     // Catch:{ all -> 0x01b6 }
        L_0x0182:
            java.lang.String r0 = "androidx.contentpager.content.wakelockid"
            r2.putExtra(r0, r6)     // Catch:{ all -> 0x01b6 }
            android.content.ComponentName r4 = r10.startService(r2)     // Catch:{ all -> 0x01b6 }
            if (r4 != 0) goto L_0x018f
            r4 = 0
            goto L_0x01b4
        L_0x018f:
            java.lang.String r0 = "power"
            java.lang.Object r2 = r10.getSystemService(r0)     // Catch:{ all -> 0x01b6 }
            android.os.PowerManager r2 = (android.os.PowerManager) r2     // Catch:{ all -> 0x01b6 }
            java.lang.String r1 = "androidx.core:wake:"
            java.lang.String r0 = r4.flattenToShortString()     // Catch:{ all -> 0x01b6 }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ all -> 0x01b6 }
            android.os.PowerManager$WakeLock r2 = X.C13750oF.A00(r2, r0, r7)     // Catch:{ all -> 0x01b6 }
            X.C13750oF.A03(r2)     // Catch:{ all -> 0x01b6 }
            r0 = 60000(0xea60, double:2.9644E-319)
            r2.acquire(r0)     // Catch:{ all -> 0x01b6 }
            X.AnonymousClass0DB.A01(r2, r0)     // Catch:{ all -> 0x01b6 }
            r5.put(r6, r2)     // Catch:{ all -> 0x01b6 }
        L_0x01b4:
            monitor-exit(r5)     // Catch:{ all -> 0x01b6 }
            goto L_0x01bd
        L_0x01b6:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01b6 }
            throw r0     // Catch:{ SecurityException -> 0x01e8, IllegalStateException -> 0x01c7 }
        L_0x01b9:
            android.content.ComponentName r4 = r10.startService(r2)     // Catch:{ SecurityException -> 0x01e8, IllegalStateException -> 0x01c7 }
        L_0x01bd:
            if (r4 != 0) goto L_0x01f5
            java.lang.String r0 = "Error while delivering the message: ServiceIntent not found."
            android.util.Log.e(r3, r0)     // Catch:{ SecurityException -> 0x01e8, IllegalStateException -> 0x01c7 }
            r0 = 404(0x194, float:5.66E-43)
            goto L_0x01f6
        L_0x01c7:
            r0 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = X.C86104wH.A0A(r2)
            int r0 = r0 + 45
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)
            java.lang.String r0 = "Failed to start service while in background: "
            r1.append(r0)
            java.lang.String r0 = X.C18180wK.A0i(r2, r1)
            android.util.Log.e(r3, r0)
            A00(r9, r10, r11)
            r0 = 403(0x193, float:5.65E-43)
            goto L_0x01f6
        L_0x01e8:
            r1 = move-exception
            java.lang.String r0 = "Error while delivering the message to the serviceIntent"
            android.util.Log.e(r3, r0, r1)
            r0 = 401(0x191, float:5.62E-43)
            goto L_0x01f6
        L_0x01f1:
            monitor-exit(r5)
            com.google.firebase.iid.FirebaseInstanceId.A03(r6)
        L_0x01f5:
            r0 = -1
        L_0x01f6:
            boolean r1 = r9.isOrderedBroadcast()
            if (r1 == 0) goto L_0x01ff
            r9.setResultCode(r0)
        L_0x01ff:
            return
        L_0x0200:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdReceiver.A01(android.content.Context, android.content.Intent):void");
    }

    public static int A00(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        AnonymousClass7M5 r4;
        Log.isLoggable("FirebaseInstanceId", 3);
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        synchronized (FirebaseInstanceIdReceiver.class) {
            r4 = A01;
            if (r4 == null) {
                r4 = new AnonymousClass7M5(context);
                A01 = r4;
            }
        }
        BroadcastReceiver.PendingResult goAsync = broadcastReceiver.goAsync();
        synchronized (r4) {
            Log.isLoggable("EnhancedIntentService", 3);
            r4.A04.add(new C112726q5(goAsync, intent, r4.A05));
            AnonymousClass7M5.A00(r4);
        }
        return -1;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        Intent intent2;
        int A012 = C14030oh.A01(-952371940);
        if (intent == null) {
            i = 7726294;
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (!(parcelableExtra instanceof Intent) || (intent2 = (Intent) parcelableExtra) == null) {
                A01(context, intent);
                i = -1700168424;
            } else {
                A01(context, intent2);
                i = 928610916;
            }
        }
        C14030oh.A0E(i, A012, intent);
    }
}
