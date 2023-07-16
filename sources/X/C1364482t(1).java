package X;

import android.os.PowerManager;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.82t  reason: invalid class name and case insensitive filesystem */
public final class C1364482t implements Runnable {
    public final FirebaseInstanceId A00;
    public final long A01;
    public final PowerManager.WakeLock A02;
    public final AnonymousClass762 A03;

    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        X.C18180wK.A0v(r13.edit(), "topic_operation_queue", r1.substring(X.C86104wH.A0w(r15, com.facebook.traffic.knob.InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).length()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        r6.A00++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x023e, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x023f, code lost:
        if (r7 == null) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r7.A00.A0B((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r0 = X.C86154wM.A0V("token not available");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0250, code lost:
        r0 = X.C86154wM.A0V("token not available");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0257, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        r0 = X.C86104wH.A0w(r0.getMessage(), "Topic sync failed: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0262, code lost:
        android.util.Log.e("FirebaseInstanceId", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0272, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r11 = r15.split("!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011f, code lost:
        if (r11.length != 2) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0121, code lost:
        r7 = r11[0];
        r14 = r11[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r1 = r7.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x012b, code lost:
        if (r1 == 83) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012f, code lost:
        if (r1 != 85) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0138, code lost:
        if (r7.equals("S") == false) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013a, code lost:
        r1 = com.google.firebase.iid.FirebaseInstanceId.A00(X.AnonymousClass7HG.A01(r16), "*");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0146, code lost:
        if (r2.A08(r1) != false) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0148, code lost:
        r13 = com.google.firebase.iid.FirebaseInstanceId.A02();
        r12 = r1.A01;
        r11 = X.C18180wK.A06();
        r1 = java.lang.String.valueOf(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015c, code lost:
        if (r1.length() == 0) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015e, code lost:
        r1 = "/topics/".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0162, code lost:
        r11.putString("gcm.topic", r1);
        r13 = X.C120937De.A01(X.C120937De.A00(r11, r10, r13, r12, X.C86104wH.A0w(r14, "/topics/")), r10);
        r1 = X.C103046Xp.A00;
        r0 = new X.C129587m9();
        r12 = new X.AnonymousClass7HU();
        r11 = r13.A03;
        r7 = new X.AnonymousClass7mN(r0, r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0187, code lost:
        r1 = new java.lang.String("/topics/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0193, code lost:
        if (r7.equals("U") == false) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0195, code lost:
        r1 = com.google.firebase.iid.FirebaseInstanceId.A00(X.AnonymousClass7HG.A01(r16), "*");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a1, code lost:
        if (r2.A08(r1) != false) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a3, code lost:
        r12 = com.google.firebase.iid.FirebaseInstanceId.A02();
        r11 = r1.A01;
        r7 = X.C18180wK.A06();
        r1 = java.lang.String.valueOf(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b7, code lost:
        if (r1.length() == 0) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b9, code lost:
        r1 = "/topics/".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01bd, code lost:
        r7.putString("gcm.topic", r1);
        r7.putString("delete", com.instagram.realtimeclient.RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        r13 = X.C120937De.A01(X.C120937De.A00(r7, r10, r12, r11, X.C86104wH.A0w(r14, "/topics/")), r10);
        r1 = X.C103046Xp.A00;
        r0 = new X.C129587m9();
        r12 = new X.AnonymousClass7HU();
        r11 = r13.A03;
        r7 = new X.AnonymousClass7mN(r0, r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e8, code lost:
        r11.A00(r7);
        X.AnonymousClass7HU.A02(r13);
        com.google.firebase.iid.FirebaseInstanceId.A01(r12, r2);
        android.util.Log.isLoggable("FirebaseInstanceId", 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f6, code lost:
        r1 = new java.lang.String("/topics/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r7 = (X.C113426rN) r6.A02.remove(java.lang.Integer.valueOf(r6.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r11 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x020d, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r13 = r11.A01;
        r1 = r13.getString("topic_operation_queue", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0222, code lost:
        if (r1.startsWith(X.C86104wH.A0u(r15, com.facebook.traffic.knob.InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)) == false) goto L_0x0237;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r3 = r17
            X.785 r1 = X.AnonymousClass785.A00()     // Catch:{ all -> 0x0292 }
            com.google.firebase.iid.FirebaseInstanceId r2 = r3.A00     // Catch:{ all -> 0x0292 }
            X.7Id r0 = r2.A02     // Catch:{ all -> 0x0292 }
            r16 = r0
            X.C121787Id.A01(r16)     // Catch:{ all -> 0x0292 }
            android.content.Context r4 = r0.A00     // Catch:{ all -> 0x0292 }
            boolean r0 = r1.A01(r4)     // Catch:{ all -> 0x0292 }
            if (r0 == 0) goto L_0x001c
            android.os.PowerManager$WakeLock r0 = r3.A02     // Catch:{ all -> 0x0292 }
            X.C13750oF.A01(r0)     // Catch:{ all -> 0x0292 }
        L_0x001c:
            r0 = 1
            monitor-enter(r2)     // Catch:{ all -> 0x0292 }
            r2.A01 = r0     // Catch:{ all -> 0x028f }
            monitor-exit(r2)     // Catch:{ all -> 0x0292 }
            X.7De r10 = r2.A00     // Catch:{ all -> 0x0292 }
            X.7HG r0 = r10.A01     // Catch:{ all -> 0x0292 }
            int r0 = r0.A03()     // Catch:{ all -> 0x0292 }
            boolean r0 = X.C18180wK.A1V(r0)
            r9 = 0
            if (r0 == 0) goto L_0x0278
            X.785 r5 = X.AnonymousClass785.A00()     // Catch:{ all -> 0x0292 }
            X.C121787Id.A01(r16)     // Catch:{ all -> 0x0292 }
            java.lang.Boolean r0 = r5.A01     // Catch:{ all -> 0x0292 }
            if (r0 != 0) goto L_0x004f
            r0 = 293(0x125, float:4.1E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0292 }
            int r0 = r4.checkCallingOrSelfPermission(r0)     // Catch:{ all -> 0x0292 }
            boolean r0 = X.C18180wK.A1W(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0292 }
            r5.A01 = r0     // Catch:{ all -> 0x0292 }
        L_0x004f:
            java.lang.Boolean r0 = r5.A00     // Catch:{ all -> 0x0292 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0292 }
            if (r0 != 0) goto L_0x005d
            r1 = 3
            java.lang.String r0 = "FirebaseInstanceId"
            android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0292 }
        L_0x005d:
            java.lang.Boolean r0 = r5.A01     // Catch:{ all -> 0x0292 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0292 }
            if (r0 == 0) goto L_0x00a4
            X.C121787Id.A01(r16)     // Catch:{ all -> 0x0292 }
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r4.getSystemService(r0)     // Catch:{ all -> 0x0292 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ all -> 0x0292 }
            if (r0 == 0) goto L_0x007e
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ all -> 0x0292 }
            if (r0 == 0) goto L_0x007e
            boolean r0 = r0.isConnected()     // Catch:{ all -> 0x0292 }
            if (r0 != 0) goto L_0x00a4
        L_0x007e:
            X.4x0 r2 = new X.4x0     // Catch:{ all -> 0x0292 }
            r2.<init>(r3)     // Catch:{ all -> 0x0292 }
            java.lang.String r1 = "FirebaseInstanceId"
            r0 = 3
            android.util.Log.isLoggable(r1, r0)     // Catch:{ all -> 0x0292 }
            r0 = 46
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0292 }
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ all -> 0x0292 }
            r1.<init>(r0)     // Catch:{ all -> 0x0292 }
            X.82t r0 = r2.A00     // Catch:{ all -> 0x0292 }
            com.google.firebase.iid.FirebaseInstanceId r0 = r0.A00     // Catch:{ all -> 0x0292 }
            X.7Id r0 = r0.A02     // Catch:{ all -> 0x0292 }
            X.C121787Id.A01(r0)     // Catch:{ all -> 0x0292 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0292 }
            r0.registerReceiver(r2, r1)     // Catch:{ all -> 0x0292 }
            goto L_0x027c
        L_0x00a4:
            java.lang.String r5 = "FirebaseInstanceId"
            java.lang.String r0 = X.AnonymousClass7HG.A01(r16)     // Catch:{ all -> 0x0292 }
            java.lang.String r8 = "*"
            X.76F r6 = com.google.firebase.iid.FirebaseInstanceId.A00(r0, r8)     // Catch:{ all -> 0x0292 }
            boolean r0 = r2.A08(r6)     // Catch:{ all -> 0x0292 }
            if (r0 == 0) goto L_0x0105
            java.lang.String r0 = X.AnonymousClass7HG.A01(r16)     // Catch:{ IOException | SecurityException -> 0x00f8 }
            java.lang.String r1 = r2.A05(r0, r8)     // Catch:{ IOException | SecurityException -> 0x00f8 }
            if (r1 != 0) goto L_0x00c7
            java.lang.String r0 = "Token retrieval failed: null"
            android.util.Log.e(r5, r0)     // Catch:{ IOException | SecurityException -> 0x00f8 }
            goto L_0x0265
        L_0x00c7:
            r0 = 3
            android.util.Log.isLoggable(r5, r0)     // Catch:{ IOException | SecurityException -> 0x00f8 }
            if (r6 == 0) goto L_0x00d5
            java.lang.String r0 = r6.A01     // Catch:{ IOException | SecurityException -> 0x00f8 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | SecurityException -> 0x00f8 }
            if (r0 != 0) goto L_0x0105
        L_0x00d5:
            java.lang.String r0 = "com.google.firebase.messaging.NEW_TOKEN"
            android.content.Intent r7 = X.C18250wR.A05(r0)     // Catch:{ IOException | SecurityException -> 0x00f8 }
            java.lang.String r0 = "token"
            r7.putExtra(r0, r1)     // Catch:{ IOException | SecurityException -> 0x00f8 }
            X.C121787Id.A01(r16)     // Catch:{ IOException | SecurityException -> 0x00f8 }
            java.lang.String r6 = "com.google.firebase.MESSAGING_EVENT"
            java.lang.Class<com.google.firebase.iid.FirebaseInstanceIdReceiver> r0 = com.google.firebase.iid.FirebaseInstanceIdReceiver.class
            android.content.Intent r1 = new android.content.Intent     // Catch:{ IOException | SecurityException -> 0x00f8 }
            r1.<init>(r4, r0)     // Catch:{ IOException | SecurityException -> 0x00f8 }
            r1.setAction(r6)     // Catch:{ IOException | SecurityException -> 0x00f8 }
            java.lang.String r0 = "wrapped_intent"
            r1.putExtra(r0, r7)     // Catch:{ IOException | SecurityException -> 0x00f8 }
            r4.sendBroadcast(r1)     // Catch:{ IOException | SecurityException -> 0x00f8 }
            goto L_0x0105
        L_0x00f8:
            r0 = move-exception
            java.lang.String r1 = "Token retrieval failed: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0292 }
            java.lang.String r0 = X.C86104wH.A0w(r0, r1)     // Catch:{ all -> 0x0292 }
            goto L_0x0262
        L_0x0105:
            X.762 r6 = r3.A03     // Catch:{ all -> 0x0292 }
        L_0x0107:
            monitor-enter(r6)     // Catch:{ all -> 0x0292 }
            java.lang.String r15 = X.AnonymousClass762.A00(r6)     // Catch:{ all -> 0x0275 }
            r12 = 1
            if (r15 != 0) goto L_0x0116
            r0 = 3
            android.util.Log.isLoggable(r5, r0)     // Catch:{ all -> 0x0275 }
            monitor-exit(r6)     // Catch:{ all -> 0x0275 }
            goto L_0x0278
        L_0x0116:
            monitor-exit(r6)     // Catch:{ all -> 0x0275 }
            java.lang.String r0 = "!"
            java.lang.String[] r11 = r15.split(r0)     // Catch:{ all -> 0x0292 }
            int r1 = r11.length     // Catch:{ all -> 0x0292 }
            r0 = 2
            if (r1 != r0) goto L_0x01fc
            r7 = r11[r9]     // Catch:{ all -> 0x0292 }
            r14 = r11[r12]     // Catch:{ all -> 0x0292 }
            int r1 = r7.hashCode()     // Catch:{ IOException -> 0x0257 }
            r0 = 83
            if (r1 == r0) goto L_0x0132
            r0 = 85
            if (r1 != r0) goto L_0x01fc
            goto L_0x018d
        L_0x0132:
            java.lang.String r0 = "S"
            boolean r0 = r7.equals(r0)     // Catch:{ IOException -> 0x0257 }
            if (r0 == 0) goto L_0x01fc
            java.lang.String r0 = X.AnonymousClass7HG.A01(r16)     // Catch:{ IOException -> 0x0257 }
            X.76F r1 = com.google.firebase.iid.FirebaseInstanceId.A00(r0, r8)     // Catch:{ IOException -> 0x0257 }
            boolean r0 = r2.A08(r1)     // Catch:{ IOException -> 0x0257 }
            if (r0 != 0) goto L_0x0249
            java.lang.String r13 = com.google.firebase.iid.FirebaseInstanceId.A02()     // Catch:{ IOException -> 0x0257 }
            java.lang.String r12 = r1.A01     // Catch:{ IOException -> 0x0257 }
            android.os.Bundle r11 = X.C18180wK.A06()     // Catch:{ IOException -> 0x0257 }
            java.lang.String r1 = java.lang.String.valueOf(r14)     // Catch:{ IOException -> 0x0257 }
            int r0 = r1.length()     // Catch:{ IOException -> 0x0257 }
            java.lang.String r7 = "/topics/"
            if (r0 == 0) goto L_0x0187
            java.lang.String r1 = r7.concat(r1)     // Catch:{ IOException -> 0x0257 }
        L_0x0162:
            java.lang.String r0 = "gcm.topic"
            r11.putString(r0, r1)     // Catch:{ IOException -> 0x0257 }
            java.lang.String r0 = X.C86104wH.A0w(r14, r7)     // Catch:{ IOException -> 0x0257 }
            X.7HU r0 = X.C120937De.A00(r11, r10, r13, r12, r0)     // Catch:{ IOException -> 0x0257 }
            X.7HU r13 = X.C120937De.A01(r0, r10)     // Catch:{ IOException -> 0x0257 }
            java.util.concurrent.Executor r1 = X.C103046Xp.A00     // Catch:{ IOException -> 0x0257 }
            X.7m9 r0 = new X.7m9     // Catch:{ IOException -> 0x0257 }
            r0.<init>()     // Catch:{ IOException -> 0x0257 }
            X.7HU r12 = new X.7HU     // Catch:{ IOException -> 0x0257 }
            r12.<init>()     // Catch:{ IOException -> 0x0257 }
            X.6s0 r11 = r13.A03     // Catch:{ IOException -> 0x0257 }
            X.7mN r7 = new X.7mN     // Catch:{ IOException -> 0x0257 }
            r7.<init>(r0, r12, r1)     // Catch:{ IOException -> 0x0257 }
            goto L_0x01e8
        L_0x0187:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0257 }
            r1.<init>(r7)     // Catch:{ IOException -> 0x0257 }
            goto L_0x0162
        L_0x018d:
            java.lang.String r0 = "U"
            boolean r0 = r7.equals(r0)     // Catch:{ IOException -> 0x0257 }
            if (r0 == 0) goto L_0x01fc
            java.lang.String r0 = X.AnonymousClass7HG.A01(r16)     // Catch:{ IOException -> 0x0257 }
            X.76F r1 = com.google.firebase.iid.FirebaseInstanceId.A00(r0, r8)     // Catch:{ IOException -> 0x0257 }
            boolean r0 = r2.A08(r1)     // Catch:{ IOException -> 0x0257 }
            if (r0 != 0) goto L_0x0250
            java.lang.String r12 = com.google.firebase.iid.FirebaseInstanceId.A02()     // Catch:{ IOException -> 0x0257 }
            java.lang.String r11 = r1.A01     // Catch:{ IOException -> 0x0257 }
            android.os.Bundle r7 = X.C18180wK.A06()     // Catch:{ IOException -> 0x0257 }
            java.lang.String r1 = java.lang.String.valueOf(r14)     // Catch:{ IOException -> 0x0257 }
            int r0 = r1.length()     // Catch:{ IOException -> 0x0257 }
            java.lang.String r13 = "/topics/"
            if (r0 == 0) goto L_0x01f6
            java.lang.String r1 = r13.concat(r1)     // Catch:{ IOException -> 0x0257 }
        L_0x01bd:
            java.lang.String r0 = "gcm.topic"
            r7.putString(r0, r1)     // Catch:{ IOException -> 0x0257 }
            java.lang.String r1 = "delete"
            java.lang.String r0 = "1"
            r7.putString(r1, r0)     // Catch:{ IOException -> 0x0257 }
            java.lang.String r0 = X.C86104wH.A0w(r14, r13)     // Catch:{ IOException -> 0x0257 }
            X.7HU r0 = X.C120937De.A00(r7, r10, r12, r11, r0)     // Catch:{ IOException -> 0x0257 }
            X.7HU r13 = X.C120937De.A01(r0, r10)     // Catch:{ IOException -> 0x0257 }
            java.util.concurrent.Executor r1 = X.C103046Xp.A00     // Catch:{ IOException -> 0x0257 }
            X.7m9 r0 = new X.7m9     // Catch:{ IOException -> 0x0257 }
            r0.<init>()     // Catch:{ IOException -> 0x0257 }
            X.7HU r12 = new X.7HU     // Catch:{ IOException -> 0x0257 }
            r12.<init>()     // Catch:{ IOException -> 0x0257 }
            X.6s0 r11 = r13.A03     // Catch:{ IOException -> 0x0257 }
            X.7mN r7 = new X.7mN     // Catch:{ IOException -> 0x0257 }
            r7.<init>(r0, r12, r1)     // Catch:{ IOException -> 0x0257 }
        L_0x01e8:
            r11.A00(r7)     // Catch:{ IOException -> 0x0257 }
            X.AnonymousClass7HU.A02(r13)     // Catch:{ IOException -> 0x0257 }
            com.google.firebase.iid.FirebaseInstanceId.A01(r12, r2)     // Catch:{ IOException -> 0x0257 }
            r0 = 3
            android.util.Log.isLoggable(r5, r0)     // Catch:{ IOException -> 0x0257 }
            goto L_0x01fc
        L_0x01f6:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0257 }
            r1.<init>(r13)     // Catch:{ IOException -> 0x0257 }
            goto L_0x01bd
        L_0x01fc:
            monitor-enter(r6)     // Catch:{ all -> 0x0292 }
            java.util.Map r1 = r6.A02     // Catch:{ all -> 0x0272 }
            int r0 = r6.A00     // Catch:{ all -> 0x0272 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0272 }
            java.lang.Object r7 = r1.remove(r0)     // Catch:{ all -> 0x0272 }
            X.6rN r7 = (X.C113426rN) r7     // Catch:{ all -> 0x0272 }
            X.7EE r11 = r6.A01     // Catch:{ all -> 0x0270 }
            monitor-enter(r11)     // Catch:{ all -> 0x0270 }
            android.content.SharedPreferences r13 = r11.A01     // Catch:{ all -> 0x026b }
            java.lang.String r12 = "topic_operation_queue"
            java.lang.String r0 = ""
            java.lang.String r1 = r13.getString(r12, r0)     // Catch:{ all -> 0x026b }
            java.lang.String r14 = ","
            java.lang.String r0 = X.C86104wH.A0u(r15, r14)     // Catch:{ all -> 0x026d }
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x026d }
            if (r0 == 0) goto L_0x0237
            java.lang.String r0 = X.C86104wH.A0w(r15, r14)     // Catch:{ all -> 0x026d }
            int r0 = r0.length()     // Catch:{ all -> 0x026d }
            java.lang.String r1 = r1.substring(r0)     // Catch:{ all -> 0x026d }
            android.content.SharedPreferences$Editor r0 = r13.edit()     // Catch:{ all -> 0x026b }
            X.C18180wK.A0v(r0, r12, r1)     // Catch:{ all -> 0x026b }
        L_0x0237:
            monitor-exit(r11)     // Catch:{ all -> 0x026d }
            int r0 = r6.A00     // Catch:{ all -> 0x0272 }
            int r0 = r0 + 1
            r6.A00 = r0     // Catch:{ all -> 0x0272 }
            monitor-exit(r6)     // Catch:{ all -> 0x0272 }
            if (r7 == 0) goto L_0x0107
            r1 = 0
            X.7HU r0 = r7.A00     // Catch:{ all -> 0x0292 }
            r0.A0B(r1)     // Catch:{ all -> 0x0292 }
            goto L_0x0107
        L_0x0249:
            java.lang.String r0 = "token not available"
            java.io.IOException r0 = X.C86154wM.A0V(r0)     // Catch:{ IOException -> 0x0257 }
            goto L_0x0256
        L_0x0250:
            java.lang.String r0 = "token not available"
            java.io.IOException r0 = X.C86154wM.A0V(r0)     // Catch:{ IOException -> 0x0257 }
        L_0x0256:
            throw r0     // Catch:{ IOException -> 0x0257 }
        L_0x0257:
            r0 = move-exception
            java.lang.String r1 = "Topic sync failed: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0292 }
            java.lang.String r0 = X.C86104wH.A0w(r0, r1)     // Catch:{ all -> 0x0292 }
        L_0x0262:
            android.util.Log.e(r5, r0)     // Catch:{ all -> 0x0292 }
        L_0x0265:
            long r0 = r3.A01     // Catch:{ all -> 0x0292 }
            r2.A07(r0)     // Catch:{ all -> 0x0292 }
            goto L_0x027c
        L_0x026b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x026d }
        L_0x026d:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x026d }
            throw r0     // Catch:{ all -> 0x0270 }
        L_0x0270:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0272 }
        L_0x0272:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0272 }
            goto L_0x0291
        L_0x0275:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0275 }
            goto L_0x0291
        L_0x0278:
            monitor-enter(r2)     // Catch:{ all -> 0x0292 }
            r2.A01 = r9     // Catch:{ all -> 0x028f }
            monitor-exit(r2)     // Catch:{ all -> 0x0292 }
        L_0x027c:
            X.785 r0 = X.AnonymousClass785.A00()
            X.C121787Id.A01(r16)
            boolean r0 = r0.A01(r4)
            if (r0 == 0) goto L_0x028e
            android.os.PowerManager$WakeLock r0 = r3.A02
            X.C13750oF.A02(r0)
        L_0x028e:
            return
        L_0x028f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0292 }
        L_0x0291:
            throw r0     // Catch:{ all -> 0x0292 }
        L_0x0292:
            r2 = move-exception
            X.785 r1 = X.AnonymousClass785.A00()
            com.google.firebase.iid.FirebaseInstanceId r0 = r3.A00
            X.7Id r0 = r0.A02
            X.C121787Id.A01(r0)
            android.content.Context r0 = r0.A00
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x02ab
            android.os.PowerManager$WakeLock r0 = r3.A02
            X.C13750oF.A02(r0)
        L_0x02ab:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1364482t.run():void");
    }

    public C1364482t(FirebaseInstanceId firebaseInstanceId, AnonymousClass762 r5, long j) {
        this.A00 = firebaseInstanceId;
        this.A03 = r5;
        this.A01 = j;
        C121787Id r0 = firebaseInstanceId.A02;
        C121787Id.A01(r0);
        PowerManager.WakeLock A002 = C13750oF.A00((PowerManager) r0.A00.getSystemService("power"), "fiid-sync", 1);
        this.A02 = A002;
        C13750oF.A03(A002);
    }
}
