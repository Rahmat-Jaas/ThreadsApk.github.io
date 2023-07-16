package com.google.firebase.messaging;

import X.C86254wp;
import java.util.ArrayDeque;
import java.util.Queue;

public class FirebaseMessagingService extends C86254wp {
    public static final Queue A00 = new ArrayDeque(10);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:193|194|195|196) */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b7, code lost:
        if (r1.equals("deleted_messages") == false) goto L_0x00a7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:195:0x04dd */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0252 A[Catch:{ MalformedURLException -> 0x0190, all -> 0x06f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0295 A[Catch:{ MalformedURLException -> 0x0190, all -> 0x06f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02b2 A[Catch:{ MalformedURLException -> 0x0190, all -> 0x06f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02ef A[SYNTHETIC, Splitter:B:131:0x02ef] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x032b A[Catch:{ MalformedURLException -> 0x0190, all -> 0x06f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0337 A[Catch:{ MalformedURLException -> 0x0190, all -> 0x06f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x037d A[Catch:{ MalformedURLException -> 0x0190, all -> 0x06f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03a5 A[Catch:{ MalformedURLException -> 0x0190, all -> 0x06f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03c7 A[Catch:{ MalformedURLException -> 0x0190, all -> 0x06f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03d9 A[Catch:{ MalformedURLException -> 0x0190, all -> 0x06f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0425 A[Catch:{ MalformedURLException -> 0x0190, all -> 0x06f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0457 A[Catch:{ MalformedURLException -> 0x0190, all -> 0x06f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0496 A[Catch:{ MalformedURLException -> 0x0190, all -> 0x06f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04d4 A[SYNTHETIC, Splitter:B:193:0x04d4] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0504 A[SYNTHETIC, Splitter:B:199:0x0504] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0522 A[Catch:{ MalformedURLException -> 0x0190, all -> 0x06f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x053e A[SYNTHETIC, Splitter:B:211:0x053e] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.Intent r21) {
        /*
            r20 = this;
            r6 = r21
            java.lang.String r1 = r6.getAction()
            java.lang.String r0 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r0 = r0.equals(r1)
            java.lang.String r2 = "FirebaseMessaging"
            r3 = r20
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002e
            boolean r0 = X.C117086y6.A01(r6)
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "_nd"
            X.C117086y6.A00(r6, r0)
        L_0x002d:
            return
        L_0x002e:
            java.lang.String r0 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = "token"
            java.lang.String r1 = r6.getStringExtra(r0)
            boolean r0 = r3 instanceof com.instagram.notifications.push.fcm.IgFirebaseMessagingService
            if (r0 == 0) goto L_0x002d
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.AnonymousClass7GV.A01()
            return
        L_0x0048:
            java.lang.String r0 = r6.getAction()
            java.lang.String.valueOf(r0)
            return
        L_0x0050:
            java.lang.String r8 = "google.message_id"
            java.lang.String r7 = r6.getStringExtra(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x06b4
            r1 = 0
            X.7HU r18 = new X.7HU
            r18.<init>()
            r0 = r18
            r0.A0B(r1)
        L_0x0067:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r5 = 3
            if (r0 != 0) goto L_0x0091
            java.util.Queue r4 = A00
            boolean r0 = r4.contains(r7)
            if (r0 == 0) goto L_0x0083
            boolean r0 = android.util.Log.isLoggable(r2, r5)
            if (r0 == 0) goto L_0x007f
            java.lang.String.valueOf(r7)
        L_0x007f:
            r3 = 1
            goto L_0x06d2
        L_0x0083:
            int r1 = r4.size()
            r0 = 10
            if (r1 < r0) goto L_0x008e
            r4.remove()
        L_0x008e:
            r4.add(r7)
        L_0x0091:
            r0 = 402(0x192, float:5.63E-43)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = r6.getStringExtra(r4)
            java.lang.String r7 = "gcm"
            if (r1 != 0) goto L_0x00a0
            r1 = r7
        L_0x00a0:
            int r0 = r1.hashCode()
            switch(r0) {
                case -2062414158: goto L_0x00b1;
                case 102161: goto L_0x00ba;
                case 814694033: goto L_0x00ff;
                case 814800675: goto L_0x0123;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            java.lang.String r0 = "Received message with unknown type: "
            java.lang.String r0 = X.C86104wH.A0u(r1, r0)
            android.util.Log.w(r2, r0)
            goto L_0x007f
        L_0x00b1:
            java.lang.String r0 = "deleted_messages"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x007f
            goto L_0x00a7
        L_0x00ba:
            boolean r0 = r1.equals(r7)
            if (r0 == 0) goto L_0x00a7
            boolean r0 = X.C117086y6.A01(r6)
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = "_nr"
            X.C117086y6.A00(r6, r0)
        L_0x00cb:
            android.os.Bundle r1 = r6.getExtras()
            if (r1 != 0) goto L_0x00d5
            android.os.Bundle r1 = X.C18180wK.A06()
        L_0x00d5:
            java.lang.String r0 = "androidx.contentpager.content.wakelockid"
            r1.remove(r0)
            java.lang.String r0 = "gcm.n.e"
            java.lang.String r0 = X.AnonymousClass7J6.A02(r1, r0)
            java.lang.String r11 = "1"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x00f0
            java.lang.String r0 = "gcm.n.icon"
            java.lang.String r0 = X.AnonymousClass7J6.A02(r1, r0)
            if (r0 == 0) goto L_0x05a4
        L_0x00f0:
            java.util.concurrent.ExecutorService r19 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r8 = 0
            java.lang.String r0 = r3.getPackageName()
            X.7J6 r9 = new X.7J6
            r9.<init>(r3, r0)
            goto L_0x0130
        L_0x00ff:
            java.lang.String r0 = "send_error"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = r6.getStringExtra(r8)
            if (r0 != 0) goto L_0x0116
            r0 = 93
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            r6.getStringExtra(r0)
        L_0x0116:
            java.lang.String r0 = "error"
            java.lang.String r1 = r6.getStringExtra(r0)
            X.6C8 r0 = new X.6C8
            r0.<init>(r1)
            goto L_0x007f
        L_0x0123:
            java.lang.String r0 = "send_event"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a7
            r6.getStringExtra(r8)
            goto L_0x007f
        L_0x0130:
            java.lang.String r0 = "gcm.n.noui"
            java.lang.String r0 = X.AnonymousClass7J6.A02(r1, r0)     // Catch:{ all -> 0x06f6 }
            boolean r0 = r11.equals(r0)     // Catch:{ all -> 0x06f6 }
            if (r0 != 0) goto L_0x0591
            java.lang.String r0 = "keyguard"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch:{ all -> 0x06f6 }
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0     // Catch:{ all -> 0x06f6 }
            boolean r0 = r0.inKeyguardRestrictedInputMode()     // Catch:{ all -> 0x06f6 }
            r7 = 0
            if (r0 != 0) goto L_0x0179
            int r13 = android.os.Process.myPid()     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch:{ all -> 0x06f6 }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ all -> 0x06f6 }
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch:{ all -> 0x06f6 }
            if (r0 == 0) goto L_0x0179
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x06f6 }
        L_0x0161:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x06f6 }
            if (r0 == 0) goto L_0x0179
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x06f6 }
            android.app.ActivityManager$RunningAppProcessInfo r10 = (android.app.ActivityManager.RunningAppProcessInfo) r10     // Catch:{ all -> 0x06f6 }
            int r0 = r10.pid     // Catch:{ all -> 0x06f6 }
            if (r0 != r13) goto L_0x0161
            int r10 = r10.importance     // Catch:{ all -> 0x06f6 }
            r0 = 100
            if (r10 != r0) goto L_0x0179
            goto L_0x0596
        L_0x0179:
            java.lang.String r0 = "gcm.n.image"
            java.lang.String r6 = X.AnonymousClass7J6.A02(r1, r0)     // Catch:{ all -> 0x06f6 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x06f6 }
            if (r0 != 0) goto L_0x0199
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0190 }
            r0.<init>(r6)     // Catch:{ MalformedURLException -> 0x0190 }
            X.7y4 r4 = new X.7y4     // Catch:{ MalformedURLException -> 0x0190 }
            r4.<init>(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            goto L_0x019b
        L_0x0190:
            java.lang.String r0 = "Not downloading image, bad URL: "
            java.lang.String r0 = X.C86104wH.A0w(r6, r0)     // Catch:{ all -> 0x06f6 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x06f6 }
        L_0x0199:
            r4 = r8
            goto L_0x01b6
        L_0x019b:
            X.84d r12 = new X.84d     // Catch:{ all -> 0x06f6 }
            r12.<init>(r4)     // Catch:{ all -> 0x06f6 }
            java.lang.String r6 = "Executor must not be null"
            r0 = r19
            X.C13320nQ.A02(r0, r6)     // Catch:{ all -> 0x06f6 }
            X.7HU r10 = new X.7HU     // Catch:{ all -> 0x06f6 }
            r10.<init>()     // Catch:{ all -> 0x06f6 }
            X.81H r6 = new X.81H     // Catch:{ all -> 0x06f6 }
            r6.<init>(r10, r12)     // Catch:{ all -> 0x06f6 }
            r0.execute(r6)     // Catch:{ all -> 0x06f6 }
            r4.A00 = r10     // Catch:{ all -> 0x06f6 }
        L_0x01b6:
            android.content.Context r12 = r9.A01     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "gcm.n.android_channel_id"
            java.lang.String r14 = X.AnonymousClass7J6.A02(r1, r0)     // Catch:{ all -> 0x06f6 }
            r6 = 0
            android.content.pm.PackageManager r10 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x01cb }
            java.lang.String r0 = r9.A02     // Catch:{ NameNotFoundException -> 0x01cb }
            android.content.pm.ApplicationInfo r0 = r10.getApplicationInfo(r0, r7)     // Catch:{ NameNotFoundException -> 0x01cb }
            int r6 = r0.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x01cb }
        L_0x01cb:
            r0 = 26
            if (r6 >= r0) goto L_0x01d1
            r14 = r8
            goto L_0x023d
        L_0x01d1:
            java.lang.Class<android.app.NotificationManager> r0 = android.app.NotificationManager.class
            java.lang.Object r15 = r12.getSystemService(r0)     // Catch:{ all -> 0x06f6 }
            android.app.NotificationManager r15 = (android.app.NotificationManager) r15     // Catch:{ all -> 0x06f6 }
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x06f6 }
            if (r0 != 0) goto L_0x0200
            android.app.NotificationChannel r0 = r15.getNotificationChannel(r14)     // Catch:{ all -> 0x06f6 }
            if (r0 != 0) goto L_0x023d
            int r0 = X.C86104wH.A0A(r14)     // Catch:{ all -> 0x06f6 }
            int r0 = r0 + 122
            java.lang.StringBuilder r6 = X.C86114wI.A0s(r0)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "Notification Channel requested ("
            r6.append(r0)     // Catch:{ all -> 0x06f6 }
            r6.append(r14)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = ") has not been created by the app. Manifest configuration, or default, value will be used."
            java.lang.String r0 = X.C18180wK.A0i(r0, r6)     // Catch:{ all -> 0x06f6 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x06f6 }
        L_0x0200:
            android.os.Bundle r6 = X.AnonymousClass7J6.A00(r9)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r14 = r6.getString(r0)     // Catch:{ all -> 0x06f6 }
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x06f6 }
            if (r0 != 0) goto L_0x0253
            android.app.NotificationChannel r0 = r15.getNotificationChannel(r14)     // Catch:{ all -> 0x06f6 }
            if (r0 != 0) goto L_0x023d
            java.lang.String r0 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used."
        L_0x0218:
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x06f6 }
            java.lang.String r14 = "fcm_fallback_notification_channel"
            android.app.NotificationChannel r0 = r15.getNotificationChannel(r14)     // Catch:{ all -> 0x06f6 }
            if (r0 != 0) goto L_0x023d
            android.content.res.Resources r13 = r12.getResources()     // Catch:{ all -> 0x06f6 }
            java.lang.String r10 = r9.A02     // Catch:{ all -> 0x06f6 }
            java.lang.String r6 = "fcm_fallback_notification_channel_label"
            java.lang.String r0 = "string"
            int r0 = r13.getIdentifier(r6, r0, r10)     // Catch:{ all -> 0x06f6 }
            java.lang.String r6 = r12.getString(r0)     // Catch:{ all -> 0x06f6 }
            android.app.NotificationChannel r0 = new android.app.NotificationChannel     // Catch:{ all -> 0x06f6 }
            r0.<init>(r14, r6, r5)     // Catch:{ all -> 0x06f6 }
            r15.createNotificationChannel(r0)     // Catch:{ all -> 0x06f6 }
        L_0x023d:
            X.Gbq r6 = new X.Gbq     // Catch:{ all -> 0x06f6 }
            r6.<init>(r12, r14)     // Catch:{ all -> 0x06f6 }
            r10 = 1
            r6.A0A(r10)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "gcm.n.title"
            java.lang.String r13 = X.AnonymousClass7J6.A01(r1, r9, r0)     // Catch:{ all -> 0x06f6 }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x06f6 }
            if (r0 == 0) goto L_0x0286
            goto L_0x0256
        L_0x0253:
            java.lang.String r0 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used."
            goto L_0x0218
        L_0x0256:
            android.content.pm.PackageManager r13 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0269 }
            java.lang.String r0 = r9.A02     // Catch:{ NameNotFoundException -> 0x0269 }
            android.content.pm.ApplicationInfo r13 = r13.getApplicationInfo(r0, r7)     // Catch:{ NameNotFoundException -> 0x0269 }
            android.content.pm.PackageManager r0 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0269 }
            java.lang.CharSequence r13 = r13.loadLabel(r0)     // Catch:{ NameNotFoundException -> 0x0269 }
            goto L_0x0286
        L_0x0269:
            r0 = move-exception
            java.lang.String r14 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x06f6 }
            int r0 = X.C86104wH.A0A(r14)     // Catch:{ all -> 0x06f6 }
            int r0 = r0 + 35
            java.lang.StringBuilder r13 = X.C86114wI.A0s(r0)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "Couldn't get own application info: "
            r13.append(r0)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = X.C18180wK.A0i(r14, r13)     // Catch:{ all -> 0x06f6 }
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x06f6 }
            java.lang.String r13 = ""
        L_0x0286:
            r6.A08(r13)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "gcm.n.body"
            java.lang.String r14 = X.AnonymousClass7J6.A01(r1, r9, r0)     // Catch:{ all -> 0x06f6 }
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x06f6 }
            if (r0 != 0) goto L_0x02a6
            r6.A07(r14)     // Catch:{ all -> 0x06f6 }
            androidx.core.app.NotificationCompat$BigTextStyle r13 = new androidx.core.app.NotificationCompat$BigTextStyle     // Catch:{ all -> 0x06f6 }
            r13.<init>()     // Catch:{ all -> 0x06f6 }
            java.lang.CharSequence r0 = X.C30949Gbq.A00(r14)     // Catch:{ all -> 0x06f6 }
            r13.A00 = r0     // Catch:{ all -> 0x06f6 }
            r6.A06(r13)     // Catch:{ all -> 0x06f6 }
        L_0x02a6:
            java.lang.String r0 = "gcm.n.icon"
            java.lang.String r14 = X.AnonymousClass7J6.A02(r1, r0)     // Catch:{ all -> 0x06f6 }
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x06f6 }
            if (r0 != 0) goto L_0x02e3
            android.content.res.Resources r15 = r12.getResources()     // Catch:{ all -> 0x06f6 }
            java.lang.String r13 = r9.A02     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "drawable"
            int r0 = r15.getIdentifier(r14, r0, r13)     // Catch:{ all -> 0x06f6 }
            if (r0 != 0) goto L_0x031c
            java.lang.String r0 = "mipmap"
            int r0 = r15.getIdentifier(r14, r0, r13)     // Catch:{ all -> 0x06f6 }
            if (r0 != 0) goto L_0x031c
            int r0 = X.C86104wH.A0A(r14)     // Catch:{ all -> 0x06f6 }
            int r0 = r0 + 61
            java.lang.StringBuilder r13 = X.C86114wI.A0s(r0)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "Icon resource "
            r13.append(r0)     // Catch:{ all -> 0x06f6 }
            r13.append(r14)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = " not found. Notification will use default icon."
            java.lang.String r0 = X.C18180wK.A0i(r0, r13)     // Catch:{ all -> 0x06f6 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x06f6 }
        L_0x02e3:
            android.os.Bundle r13 = X.AnonymousClass7J6.A00(r9)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_icon"
            int r0 = r13.getInt(r0, r7)     // Catch:{ all -> 0x06f6 }
            if (r0 != 0) goto L_0x031c
            android.content.pm.PackageManager r13 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x02fe }
            java.lang.String r0 = r9.A02     // Catch:{ NameNotFoundException -> 0x02fe }
            android.content.pm.ApplicationInfo r0 = r13.getApplicationInfo(r0, r7)     // Catch:{ NameNotFoundException -> 0x02fe }
            int r0 = r0.icon     // Catch:{ NameNotFoundException -> 0x02fe }
            if (r0 == 0) goto L_0x0319
            goto L_0x031c
        L_0x02fe:
            r0 = move-exception
            java.lang.String r14 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x06f6 }
            int r0 = X.C86104wH.A0A(r14)     // Catch:{ all -> 0x06f6 }
            int r0 = r0 + 35
            java.lang.StringBuilder r13 = X.C86114wI.A0s(r0)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "Couldn't get own application info: "
            r13.append(r0)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = X.C18180wK.A0i(r14, r13)     // Catch:{ all -> 0x06f6 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x06f6 }
        L_0x0319:
            r0 = 17301651(0x1080093, float:2.4979667E-38)
        L_0x031c:
            r6.A05(r0)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "gcm.n.sound2"
            java.lang.String r14 = X.AnonymousClass7J6.A02(r1, r0)     // Catch:{ all -> 0x06f6 }
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x06f6 }
            if (r0 == 0) goto L_0x0331
            java.lang.String r0 = "gcm.n.sound"
            java.lang.String r14 = X.AnonymousClass7J6.A02(r1, r0)     // Catch:{ all -> 0x06f6 }
        L_0x0331:
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x06f6 }
            if (r0 != 0) goto L_0x0399
            java.lang.String r0 = "default"
            boolean r0 = r0.equals(r14)     // Catch:{ all -> 0x06f6 }
            if (r0 != 0) goto L_0x0376
            android.content.res.Resources r13 = r12.getResources()     // Catch:{ all -> 0x06f6 }
            java.lang.String r15 = r9.A02     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "raw"
            int r0 = r13.getIdentifier(r14, r0, r15)     // Catch:{ all -> 0x06f6 }
            if (r0 == 0) goto L_0x0376
            int r0 = X.C86104wH.A0A(r15)     // Catch:{ all -> 0x06f6 }
            int r13 = r0 + 24
            int r0 = X.C86104wH.A0A(r14)     // Catch:{ all -> 0x06f6 }
            int r13 = r13 + r0
            java.lang.StringBuilder r13 = X.C86114wI.A0s(r13)     // Catch:{ all -> 0x06f6 }
            r0 = 487(0x1e7, float:6.82E-43)
            java.lang.String r0 = X.I17.A00(r0)     // Catch:{ all -> 0x06f6 }
            r13.append(r0)     // Catch:{ all -> 0x06f6 }
            r13.append(r15)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "/raw/"
            r13.append(r0)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = X.C18180wK.A0i(r14, r13)     // Catch:{ all -> 0x06f6 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x06f6 }
            goto L_0x037b
        L_0x0376:
            r0 = 2
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r0)     // Catch:{ all -> 0x06f6 }
        L_0x037b:
            if (r0 == 0) goto L_0x0399
            android.app.Notification r13 = r6.A09     // Catch:{ all -> 0x06f6 }
            r13.sound = r0     // Catch:{ all -> 0x06f6 }
            r0 = -1
            r13.audioStreamType = r0     // Catch:{ all -> 0x06f6 }
            android.media.AudioAttributes$Builder r14 = new android.media.AudioAttributes$Builder     // Catch:{ all -> 0x06f6 }
            r14.<init>()     // Catch:{ all -> 0x06f6 }
            r0 = 4
            android.media.AudioAttributes$Builder r14 = r14.setContentType(r0)     // Catch:{ all -> 0x06f6 }
            r0 = 5
            android.media.AudioAttributes$Builder r0 = r14.setUsage(r0)     // Catch:{ all -> 0x06f6 }
            android.media.AudioAttributes r0 = r0.build()     // Catch:{ all -> 0x06f6 }
            r13.audioAttributes = r0     // Catch:{ all -> 0x06f6 }
        L_0x0399:
            java.lang.String r0 = "gcm.n.click_action"
            java.lang.String r13 = X.AnonymousClass7J6.A02(r1, r0)     // Catch:{ all -> 0x06f6 }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x06f6 }
            if (r0 != 0) goto L_0x03d9
            android.content.Intent r14 = X.C18250wR.A05(r13)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = r9.A02     // Catch:{ all -> 0x06f6 }
            r14.setPackage(r0)     // Catch:{ all -> 0x06f6 }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r14.setFlags(r0)     // Catch:{ all -> 0x06f6 }
        L_0x03b3:
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r14.addFlags(r0)     // Catch:{ all -> 0x06f6 }
            android.os.Bundle r13 = new android.os.Bundle     // Catch:{ all -> 0x06f6 }
            r13.<init>(r1)     // Catch:{ all -> 0x06f6 }
            java.util.Iterator r16 = X.C86144wL.A0x(r13)     // Catch:{ all -> 0x06f6 }
        L_0x03c1:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x06f6 }
            if (r0 == 0) goto L_0x0418
            java.lang.String r15 = X.C18180wK.A0k(r16)     // Catch:{ all -> 0x06f6 }
            if (r15 == 0) goto L_0x03c1
            java.lang.String r0 = "google.c."
            boolean r0 = r15.startsWith(r0)     // Catch:{ all -> 0x06f6 }
            if (r0 == 0) goto L_0x03c1
            r16.remove()     // Catch:{ all -> 0x06f6 }
            goto L_0x03c1
        L_0x03d9:
            java.lang.String r0 = "gcm.n.link_android"
            java.lang.String r13 = X.AnonymousClass7J6.A02(r1, r0)     // Catch:{ all -> 0x06f6 }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x06f6 }
            if (r0 == 0) goto L_0x03eb
            java.lang.String r0 = "gcm.n.link"
            java.lang.String r13 = X.AnonymousClass7J6.A02(r1, r0)     // Catch:{ all -> 0x06f6 }
        L_0x03eb:
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x06f6 }
            if (r0 != 0) goto L_0x0406
            android.net.Uri r13 = android.net.Uri.parse(r13)     // Catch:{ all -> 0x06f6 }
            if (r13 == 0) goto L_0x0406
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r14 = X.C18250wR.A05(r0)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = r9.A02     // Catch:{ all -> 0x06f6 }
            r14.setPackage(r0)     // Catch:{ all -> 0x06f6 }
            r14.setData(r13)     // Catch:{ all -> 0x06f6 }
            goto L_0x03b3
        L_0x0406:
            android.content.pm.PackageManager r13 = r12.getPackageManager()     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = r9.A02     // Catch:{ all -> 0x06f6 }
            android.content.Intent r14 = r13.getLaunchIntentForPackage(r0)     // Catch:{ all -> 0x06f6 }
            if (r14 != 0) goto L_0x03b3
            java.lang.String r0 = "No activity found to launch app"
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x06f6 }
            goto L_0x043d
        L_0x0418:
            r14.putExtras(r13)     // Catch:{ all -> 0x06f6 }
            java.util.Iterator r15 = X.C86144wL.A0x(r13)     // Catch:{ all -> 0x06f6 }
        L_0x041f:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x06f6 }
            if (r0 == 0) goto L_0x043f
            java.lang.String r13 = X.C18180wK.A0k(r15)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "gcm.n."
            boolean r0 = r13.startsWith(r0)     // Catch:{ all -> 0x06f6 }
            if (r0 != 0) goto L_0x0439
            java.lang.String r0 = "gcm.notification."
            boolean r0 = r13.startsWith(r0)     // Catch:{ all -> 0x06f6 }
            if (r0 == 0) goto L_0x041f
        L_0x0439:
            r14.removeExtra(r13)     // Catch:{ all -> 0x06f6 }
            goto L_0x041f
        L_0x043d:
            r0 = r8
            goto L_0x0488
        L_0x043f:
            java.util.concurrent.atomic.AtomicInteger r16 = X.AnonymousClass7J6.A03     // Catch:{ all -> 0x06f6 }
            int r0 = r16.incrementAndGet()     // Catch:{ all -> 0x06f6 }
            r13 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r12, r0, r14, r13)     // Catch:{ all -> 0x06f6 }
            java.lang.String r14 = "google.c.a.e"
            java.lang.String r14 = r1.getString(r14)     // Catch:{ all -> 0x06f6 }
            boolean r14 = r11.equals(r14)     // Catch:{ all -> 0x06f6 }
            if (r14 == 0) goto L_0x0488
            java.lang.String r14 = "com.google.firebase.messaging.NOTIFICATION_OPEN"
            android.content.Intent r14 = X.C18250wR.A05(r14)     // Catch:{ all -> 0x06f6 }
            X.AnonymousClass7J6.A03(r14, r1)     // Catch:{ all -> 0x06f6 }
            java.lang.String r15 = "pending_intent"
            r14.putExtra(r15, r0)     // Catch:{ all -> 0x06f6 }
            int r17 = r16.incrementAndGet()     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "com.google.firebase.MESSAGING_EVENT"
            android.content.Intent r16 = X.C18250wR.A05(r0)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "com.google.firebase.iid.FirebaseInstanceIdReceiver"
            android.content.ComponentName r15 = new android.content.ComponentName     // Catch:{ all -> 0x06f6 }
            r15.<init>(r12, r0)     // Catch:{ all -> 0x06f6 }
            r0 = r16
            android.content.Intent r15 = r0.setComponent(r15)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "wrapped_intent"
            android.content.Intent r14 = r15.putExtra(r0, r14)     // Catch:{ all -> 0x06f6 }
            r0 = r17
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r12, r0, r14, r13)     // Catch:{ all -> 0x06f6 }
        L_0x0488:
            r6.A0A = r0     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "google.c.a.e"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x06f6 }
            boolean r0 = r11.equals(r0)     // Catch:{ all -> 0x06f6 }
            if (r0 == 0) goto L_0x04c8
            java.lang.String r0 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            android.content.Intent r14 = X.C18250wR.A05(r0)     // Catch:{ all -> 0x06f6 }
            X.AnonymousClass7J6.A03(r14, r1)     // Catch:{ all -> 0x06f6 }
            java.util.concurrent.atomic.AtomicInteger r0 = X.AnonymousClass7J6.A03     // Catch:{ all -> 0x06f6 }
            int r13 = r0.incrementAndGet()     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "com.google.firebase.MESSAGING_EVENT"
            android.content.Intent r15 = X.C18250wR.A05(r0)     // Catch:{ all -> 0x06f6 }
            java.lang.String r11 = "com.google.firebase.iid.FirebaseInstanceIdReceiver"
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ all -> 0x06f6 }
            r0.<init>(r12, r11)     // Catch:{ all -> 0x06f6 }
            android.content.Intent r11 = r15.setComponent(r0)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "wrapped_intent"
            android.content.Intent r11 = r11.putExtra(r0, r14)     // Catch:{ all -> 0x06f6 }
            r0 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r11 = android.app.PendingIntent.getBroadcast(r12, r13, r11, r0)     // Catch:{ all -> 0x06f6 }
            if (r11 == 0) goto L_0x04c8
            android.app.Notification r0 = r6.A09     // Catch:{ all -> 0x06f6 }
            r0.deleteIntent = r11     // Catch:{ all -> 0x06f6 }
        L_0x04c8:
            java.lang.String r0 = "gcm.n.color"
            java.lang.String r13 = X.AnonymousClass7J6.A02(r1, r0)     // Catch:{ all -> 0x06f6 }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x06f6 }
            if (r0 != 0) goto L_0x04f8
            int r0 = android.graphics.Color.parseColor(r13)     // Catch:{ IllegalArgumentException -> 0x04dd }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x04dd }
            goto L_0x0508
        L_0x04dd:
            int r0 = X.C86104wH.A0A(r13)     // Catch:{ all -> 0x06f6 }
            int r0 = r0 + 54
            java.lang.StringBuilder r11 = X.C86114wI.A0s(r0)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "Color "
            r11.append(r0)     // Catch:{ all -> 0x06f6 }
            r11.append(r13)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = " not valid. Notification will use default color."
            java.lang.String r0 = X.C18180wK.A0i(r0, r11)     // Catch:{ all -> 0x06f6 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x06f6 }
        L_0x04f8:
            android.os.Bundle r9 = X.AnonymousClass7J6.A00(r9)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_color"
            int r0 = r9.getInt(r0, r7)     // Catch:{ all -> 0x06f6 }
            if (r0 == 0) goto L_0x0516
            java.lang.Integer r0 = X.C86134wK.A0b(r12, r0)     // Catch:{ NotFoundException -> 0x0511 }
        L_0x0508:
            if (r0 == 0) goto L_0x0516
            int r0 = r0.intValue()     // Catch:{ all -> 0x06f6 }
            r6.A03 = r0     // Catch:{ all -> 0x06f6 }
            goto L_0x0516
        L_0x0511:
            java.lang.String r0 = "Cannot find the color resource referenced in AndroidManifest."
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x06f6 }
        L_0x0516:
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r1 = X.AnonymousClass7J6.A02(r1, r0)     // Catch:{ all -> 0x06f6 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x06f6 }
            if (r0 == 0) goto L_0x0535
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x06f6 }
            r9 = 37
            java.lang.StringBuilder r11 = X.C86114wI.A0s(r9)     // Catch:{ all -> 0x06f6 }
            java.lang.String r9 = "FCM-Notification:"
            r11.append(r9)     // Catch:{ all -> 0x06f6 }
            java.lang.String r1 = X.C86154wM.A0n(r11, r0)     // Catch:{ all -> 0x06f6 }
        L_0x0535:
            X.6gu r9 = new X.6gu     // Catch:{ all -> 0x06f6 }
            r9.<init>(r6, r1)     // Catch:{ all -> 0x06f6 }
            X.Gbq r6 = r9.A00     // Catch:{ all -> 0x06f6 }
            if (r4 == 0) goto L_0x057d
            X.7HU r12 = r4.A00     // Catch:{ ExecutionException -> 0x057d, InterruptedException -> 0x0565, TimeoutException -> 0x0575 }
            X.C13320nQ.A01(r12)     // Catch:{ ExecutionException -> 0x057d, InterruptedException -> 0x0565, TimeoutException -> 0x0575 }
            r0 = 5
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x057d, InterruptedException -> 0x0565, TimeoutException -> 0x0575 }
            java.lang.Object r1 = X.C117056y3.A01(r12, r11, r0)     // Catch:{ ExecutionException -> 0x057d, InterruptedException -> 0x0565, TimeoutException -> 0x0575 }
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ ExecutionException -> 0x057d, InterruptedException -> 0x0565, TimeoutException -> 0x0575 }
            r6.A0C = r1     // Catch:{ ExecutionException -> 0x057d, InterruptedException -> 0x0565, TimeoutException -> 0x0575 }
            androidx.core.app.NotificationCompat$BigPictureStyle r0 = new androidx.core.app.NotificationCompat$BigPictureStyle     // Catch:{ ExecutionException -> 0x057d, InterruptedException -> 0x0565, TimeoutException -> 0x0575 }
            r0.<init>()     // Catch:{ ExecutionException -> 0x057d, InterruptedException -> 0x0565, TimeoutException -> 0x0575 }
            if (r1 == 0) goto L_0x055d
            androidx.core.graphics.drawable.IconCompat r8 = new androidx.core.graphics.drawable.IconCompat     // Catch:{ ExecutionException -> 0x057d, InterruptedException -> 0x0565, TimeoutException -> 0x0575 }
            r8.<init>(r10)     // Catch:{ ExecutionException -> 0x057d, InterruptedException -> 0x0565, TimeoutException -> 0x0575 }
            r8.A06 = r1     // Catch:{ ExecutionException -> 0x057d, InterruptedException -> 0x0565, TimeoutException -> 0x0575 }
        L_0x055d:
            r0.A00 = r8     // Catch:{ ExecutionException -> 0x057d, InterruptedException -> 0x0565, TimeoutException -> 0x0575 }
            r0.A01 = r10     // Catch:{ ExecutionException -> 0x057d, InterruptedException -> 0x0565, TimeoutException -> 0x0575 }
            r6.A06(r0)     // Catch:{ ExecutionException -> 0x057d, InterruptedException -> 0x0565, TimeoutException -> 0x0575 }
            goto L_0x057d
        L_0x0565:
            java.lang.String r0 = "Interrupted while downloading image, showing notification without it"
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x06f6 }
            r4.close()     // Catch:{ all -> 0x06f6 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x06f6 }
            r0.interrupt()     // Catch:{ all -> 0x06f6 }
            goto L_0x057d
        L_0x0575:
            java.lang.String r0 = "Failed to download image in time, showing notification without it"
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x06f6 }
            r4.close()     // Catch:{ all -> 0x06f6 }
        L_0x057d:
            android.util.Log.isLoggable(r2, r5)     // Catch:{ all -> 0x06f6 }
            java.lang.String r0 = "notification"
            java.lang.Object r3 = r3.getSystemService(r0)     // Catch:{ all -> 0x06f6 }
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3     // Catch:{ all -> 0x06f6 }
            java.lang.String r1 = r9.A01     // Catch:{ all -> 0x06f6 }
            android.app.Notification r0 = r6.A01()     // Catch:{ all -> 0x06f6 }
            r3.notify(r1, r7, r0)     // Catch:{ all -> 0x06f6 }
        L_0x0591:
            r19.shutdown()
            goto L_0x007f
        L_0x0596:
            r19.shutdown()
            boolean r0 = X.C117086y6.A01(r6)
            if (r0 == 0) goto L_0x05a4
            java.lang.String r0 = "_nf"
            X.C117086y6.A00(r6, r0)
        L_0x05a4:
            com.google.firebase.messaging.RemoteMessage r5 = new com.google.firebase.messaging.RemoteMessage
            r5.<init>(r1)
            boolean r0 = r3 instanceof com.instagram.notifications.push.fcm.FcmListenerService
            if (r0 == 0) goto L_0x007f
            r12 = 0
            java.util.Map r6 = r5.A01
            if (r6 != 0) goto L_0x05ff
            android.os.Bundle r7 = r5.A00
            X.06f r6 = new X.06f
            r6.<init>()
            java.util.Iterator r8 = X.C86144wL.A0x(r7)
        L_0x05bd:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x05fd
            java.lang.String r3 = X.C18180wK.A0k(r8)
            java.lang.Object r1 = r7.get(r3)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x05bd
            java.lang.String r0 = "google."
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L_0x05bd
            java.lang.String r0 = "gcm."
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L_0x05bd
            java.lang.String r0 = "from"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x05bd
            boolean r0 = r3.equals(r4)
            if (r0 != 0) goto L_0x05bd
            r0 = 1238(0x4d6, float:1.735E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x05bd
            r6.put(r3, r1)
            goto L_0x05bd
        L_0x05fd:
            r5.A01 = r6
        L_0x05ff:
            java.lang.String r1 = "data"
            boolean r0 = r6.containsKey(r1)
            r9 = 0
            if (r0 == 0) goto L_0x061d
            java.lang.String r3 = X.C18220wO.A0r(r1, r6)
            com.instagram.common.notifications.push.intf.PushChannelType r0 = com.instagram.common.notifications.push.intf.PushChannelType.FCM
            java.lang.String r1 = X.AnonymousClass7GV.A00(r0)
            X.MMo r0 = X.C18180wK.A0L(r3)     // Catch:{ IOException -> 0x061f }
            X.GfL r8 = X.AnonymousClass6QK.parseFromJson(r0)     // Catch:{ IOException -> 0x061f }
            r8.A12 = r1     // Catch:{ IOException -> 0x061f }
            goto L_0x0620
        L_0x061d:
            r8 = r9
            goto L_0x0620
        L_0x061f:
            r8 = r9
        L_0x0620:
            java.lang.String r4 = X.C18220wO.A0r(r4, r6)
            if (r8 == 0) goto L_0x06a8
            java.lang.String r0 = r8.A0C
        L_0x0628:
            if (r4 != 0) goto L_0x062b
            r4 = r0
        L_0x062b:
            if (r8 == 0) goto L_0x0636
            java.lang.String r0 = r8.A0U
            X.C04220Ms.A06(r0)
            com.instagram.service.session.UserSession r9 = X.C30843GYs.A00(r0)
        L_0x0636:
            int r1 = r5.A00()
            int r0 = r5.A01()
            int r1 = r1 - r0
            com.instagram.common.notifications.push.intf.PushChannelType r3 = com.instagram.common.notifications.push.intf.PushChannelType.FCM
            boolean r7 = X.C86124wJ.A1X(r1)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            X.K9R r0 = X.K9R.A00
            X.IVw r1 = new X.IVw
            r1.<init>(r0)
            java.lang.String r10 = r3.toString()
            java.lang.String r0 = "push_channel"
            r1.A04(r0, r10)
            if (r6 == 0) goto L_0x0660
            java.lang.String r0 = "priority_lowered"
            r1.A05(r0, r7)
        L_0x0660:
            X.HGC r7 = X.C29620FrP.A00()
            java.lang.String r11 = r1.toString()
            r7.A0F(r8, r9, r10, r11, r12)
            if (r9 == 0) goto L_0x0681
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r0 = 36321705198689270(0x810a6600011bf6, double:3.033330851194069E-306)
            boolean r0 = X.C63803iN.A0E(r6, r9, r0)
            if (r0 == 0) goto L_0x0681
            X.HGC r0 = X.C29620FrP.A00()
            r0.A0C(r8, r3)
        L_0x0681:
            if (r8 == 0) goto L_0x0697
            int r0 = r5.A01()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A09 = r0
            int r0 = r5.A00()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A08 = r0
        L_0x0697:
            if (r9 == 0) goto L_0x06ab
            boolean r0 = X.C30843GYs.A01(r9)
            if (r0 == 0) goto L_0x06ab
            X.GIx r0 = X.C86134wK.A0Y(r9)
            r0.A01(r8, r3, r4)
            goto L_0x007f
        L_0x06a8:
            r0 = r9
            goto L_0x0628
        L_0x06ab:
            X.HGC r0 = X.C29620FrP.A00()
            r0.A0D(r8, r3, r4)
            goto L_0x007f
        L_0x06b4:
            android.os.Bundle r5 = X.C18180wK.A06()
            r5.putString(r8, r7)
            X.7Da r4 = X.C120897Da.A01(r3)
            monitor-enter(r4)
            int r1 = r4.A00     // Catch:{ all -> 0x06fb }
            int r0 = r1 + 1
            r4.A00 = r0     // Catch:{ all -> 0x06fb }
            monitor-exit(r4)
            X.5rv r0 = new X.5rv
            r0.<init>(r1, r5)
            X.7HU r18 = X.C120897Da.A00(r4, r0)
            goto L_0x0067
        L_0x06d2:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x06da }
            r0 = r18
            X.C117056y3.A01(r0, r1, r3)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x06da }
            return
        L_0x06da:
            r0 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r0 = X.C86104wH.A0A(r3)
            int r0 = r0 + 20
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)
            java.lang.String r0 = "Message ack failed: "
            r1.append(r0)
            java.lang.String r0 = X.C18180wK.A0i(r3, r1)
            android.util.Log.w(r2, r0)
            return
        L_0x06f6:
            r0 = move-exception
            r19.shutdown()
            throw r0
        L_0x06fb:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.A01(android.content.Intent):void");
    }
}
