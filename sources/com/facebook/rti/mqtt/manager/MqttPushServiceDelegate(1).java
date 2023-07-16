package com.facebook.rti.mqtt.manager;

import X.AnonymousClass006;
import X.AnonymousClass00U;
import X.AnonymousClass068;
import X.AnonymousClass06H;
import X.AnonymousClass0EX;
import X.AnonymousClass0LU;
import X.AnonymousClass0LW;
import X.AnonymousClass0Lp;
import X.AnonymousClass0MC;
import X.AnonymousClass0MO;
import X.AnonymousClass0P1;
import X.AnonymousClass0P6;
import X.AnonymousClass0Re;
import X.AnonymousClass0YN;
import X.AnonymousClass0v1;
import X.C000200d;
import X.C004201y;
import X.C008403q;
import X.C02740Cr;
import X.C03020Ea;
import X.C03040Ec;
import X.C03070Ef;
import X.C03080Eg;
import X.C03090Eh;
import X.C03100Ei;
import X.C03950Lq;
import X.C03960Lr;
import X.C04260Mw;
import X.C08770eG;
import X.C08860eQ;
import X.C12730mO;
import X.C12760mR;
import X.C12800mV;
import X.C13000mq;
import X.C13310nP;
import X.C13650o4;
import X.C15960sF;
import X.C17260ub;
import X.C17490uz;
import X.C17630vH;
import X.C17800vZ;
import X.C18080w5;
import X.C18140wF;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.os.Process;
import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.instagram.debug.devoptions.FXPFLinkageCacheDebugFragment;
import java.util.HashMap;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

public abstract class MqttPushServiceDelegate extends MqttBackgroundServiceDelegate {
    public long A00;
    public C08860eQ A01;
    public C12800mV A02;
    public RealtimeSinceBootClock A03;
    public AnonymousClass0MC A04;
    public AnonymousClass0Lp A05;
    public AnonymousClass068 A06;
    public C004201y A07;
    public C13310nP A08;
    public C000200d A09;
    public AnonymousClass0P1 A0A;
    public AtomicBoolean A0B = new AtomicBoolean(false);
    public Integer A0C = AnonymousClass006.A0N;
    public final C008403q A0D = new C13650o4(this);
    public volatile AnonymousClass0MO A0E;

    public AnonymousClass0YN A0K(Intent intent, int i, int i2) {
        String str;
        Integer num = null;
        C12800mV r1 = this.A02;
        Integer num2 = AnonymousClass006.A05;
        SharedPreferences sharedPreferences = r1.A00(num2).A00;
        if (sharedPreferences.contains("DELIVERY_RETRY_INTERVAL")) {
            num = Integer.valueOf(sharedPreferences.getInt("DELIVERY_RETRY_INTERVAL", 300));
        }
        AnonymousClass0YN r12 = new AnonymousClass0YN((Boolean) null, num);
        Intent intent2 = intent;
        if (intent != null) {
            if (intent2.hasExtra("caller")) {
                r12.A03 = intent2.getStringExtra("caller");
            }
            if (intent2.hasExtra("EXPIRED_SESSION")) {
                r12.A00 = intent2.getLongExtra("EXPIRED_SESSION", 0);
            }
            if (intent2.hasExtra("DELIVERY_RETRY_INTERVAL")) {
                Integer valueOf = Integer.valueOf(intent2.getIntExtra("DELIVERY_RETRY_INTERVAL", 300));
                if (!valueOf.equals(r12.A02)) {
                    r12.A02 = valueOf;
                    SharedPreferences.Editor edit = this.A0A.A03.A00(num2).A00.edit();
                    Integer num3 = r12.A02;
                    if (num3 != null) {
                        edit.putInt("DELIVERY_RETRY_INTERVAL", num3.intValue());
                        edit.apply();
                    }
                }
            }
            str = intent2.getAction();
        } else {
            str = FXPFLinkageCacheDebugFragment.nullString;
        }
        Integer valueOf2 = Integer.valueOf(i);
        Integer valueOf3 = Integer.valueOf(i2);
        AnonymousClass0MO r7 = this.A0E;
        String A0N = AnonymousClass00U.A0N(C18140wF.A00(AnonymousClass006.A01), str, '.');
        String A0L = A0L();
        String str2 = r12.A03;
        valueOf2.getClass();
        C12760mR r9 = new C12760mR(valueOf2);
        valueOf3.getClass();
        C12760mR r10 = new C12760mR(valueOf3);
        boolean z = this.A0B.get();
        r7.A02(this.A06.A02(), r9, r10, A0N, A0L, str2, this.A06.A06.get(), z);
        return r12;
    }

    public String A0L() {
        return "N/A";
    }

    public void A0P() {
    }

    public void A0Q() {
    }

    public void A0R() {
    }

    public void A0U(int i) {
    }

    public void A0V(Intent intent, AnonymousClass0YN r2) {
    }

    public void A0W(AnonymousClass0P6 r1, Long l, String str, byte[] bArr, int i, long j) {
    }

    public void A0Y(AnonymousClass0v1 r1) {
    }

    public void A0Z(C17260ub r1) {
    }

    public boolean A0b(Intent intent) {
        return true;
    }

    public static String A05(MqttPushServiceDelegate mqttPushServiceDelegate) {
        long j;
        C17630vH r2 = mqttPushServiceDelegate.A09.A0s;
        if (r2 == null || r2.A0Y != AnonymousClass006.A0C) {
            j = 0;
        } else {
            j = SystemClock.elapsedRealtime() - r2.A0V;
        }
        AnonymousClass0Lp r1 = mqttPushServiceDelegate.A05;
        C03080Eg A002 = AnonymousClass0Lp.A00(r1);
        C03040Ec A012 = AnonymousClass0Lp.A01(r1, j);
        C03100Ei r3 = (C03100Ei) r1.A05(C03100Ei.class);
        try {
            return C03960Lr.A00(r1.A00.A00(false), r3, (C03090Eh) r1.A05(C03090Eh.class), A002, (C03070Ef) null, A012, (C03020Ea) r1.A05(C03020Ea.class), (AnonymousClass0EX) r1.A05(AnonymousClass0EX.class), true, false).toString(2);
        } catch (JSONException unused) {
            return "";
        }
    }

    public static void A06(MqttPushServiceDelegate mqttPushServiceDelegate, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        hashMap.put("pid", String.valueOf(Process.myPid()));
        mqttPushServiceDelegate.A01.Bb8("life_cycle", hashMap);
    }

    public final void A0F() {
        if (this.A0E != null) {
            AnonymousClass0MO r2 = this.A0E;
            String A0L = AnonymousClass00U.A0L(C18140wF.A00(AnonymousClass006.A01), ".SERVICE_ON_DESTROY");
            String A0L2 = A0L();
            C12730mO r4 = C12730mO.A00;
            r2.A02((NetworkInfo) null, r4, r4, A0L, A0L2, (String) null, 0, this.A0B.get());
        }
        super.A0F();
    }

    public void A0H() {
        AnonymousClass0MO r2 = this.A0E;
        String A0L = AnonymousClass00U.A0L(C18140wF.A00(AnonymousClass006.A01), ".SERVICE_DESTROY");
        String A0L2 = A0L();
        C12730mO r4 = C12730mO.A00;
        boolean z = this.A0B.get();
        r2.A02(this.A06.A02(), r4, r4, A0L, A0L2, (String) null, this.A06.A06.get(), z);
        A06(this, "doDestroy");
        ((C15960sF) this.A01).A01 = null;
        A0S();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e5, code lost:
        if (r1 != null) goto L_0x000a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(int r9, int r10, android.content.Intent r11) {
        /*
            r8 = this;
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            if (r11 != 0) goto L_0x00d6
            r1 = 0
            java.lang.String r0 = "intent"
        L_0x000a:
            r2.put(r0, r1)
        L_0x000d:
            X.0eQ r1 = r8.A01
            java.lang.String r0 = "start_command"
            r1.Bb8(r0, r2)
            boolean r0 = r8.A0b(r11)
            if (r0 != 0) goto L_0x001b
            r11 = 0
        L_0x001b:
            X.0YN r2 = r8.A0K(r11, r9, r10)
            if (r11 == 0) goto L_0x006d
            java.lang.String r1 = r11.getAction()
            java.lang.String r0 = "Orca.PERSISTENT_KICK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005c
            java.lang.String r1 = r11.getAction()
            java.lang.String r0 = "Orca.FORCE_KICK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005c
            java.lang.String r1 = r11.getAction()
            java.lang.String r0 = "Orca.PERSISTENT_KICK_SKIP_PING"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005c
            java.lang.String r1 = r11.getAction()
            java.lang.String r0 = "Orca.STOP"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ec
            X.0uz r0 = X.C17490uz.SERVICE_STOP
            r8.A0M(r0)
            X.0w5 r0 = r8.A01
            r0.A03()
        L_0x005b:
            return
        L_0x005c:
            java.lang.String r0 = r11.getAction()
            if (r0 == 0) goto L_0x006d
            java.lang.String r1 = r11.getAction()
            java.lang.String r0 = "Orca.FORCE_KICK"
            boolean r1 = r0.equals(r1)
            goto L_0x006e
        L_0x006d:
            r1 = 0
        L_0x006e:
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.A0B
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x007b
            if (r11 != 0) goto L_0x00e9
            java.lang.Integer r0 = X.AnonymousClass006.A01
            goto L_0x00f6
        L_0x007b:
            if (r1 == 0) goto L_0x008b
            java.lang.Integer r3 = X.AnonymousClass006.A08
        L_0x007f:
            java.lang.String r1 = r2.A03
            X.00d r0 = r8.A09
            if (r1 != 0) goto L_0x0087
            java.lang.String r1 = "MqttPushService"
        L_0x0087:
            r0.A0E(r3, r1)
            return
        L_0x008b:
            boolean r0 = r8.A0a()
            if (r0 == 0) goto L_0x00c3
            X.00d r0 = r8.A09
            X.0vH r0 = r0.A0s
            if (r0 == 0) goto L_0x00c3
            java.lang.Integer r1 = r0.A0Y
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r1 != r0) goto L_0x00c3
            if (r11 == 0) goto L_0x005b
            java.lang.String r1 = r11.getAction()
            java.lang.String r0 = "Orca.PERSISTENT_KICK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005b
            X.00d r7 = r8.A09
            java.lang.String r6 = r2.A03
            X.0L5 r0 = r7.A0E
            X.0K0 r0 = r0.A00()
            int r3 = r0.A0F
            if (r3 < 0) goto L_0x005b
            X.0vH r2 = r7.A0s
            if (r2 == 0) goto L_0x005b
            long r4 = android.os.SystemClock.elapsedRealtime()
            monitor-enter(r2)
            goto L_0x00c6
        L_0x00c3:
            java.lang.Integer r3 = X.AnonymousClass006.A0C
            goto L_0x007f
        L_0x00c6:
            long r0 = r2.A0R     // Catch:{ all -> 0x0129 }
            monitor-exit(r2)
            long r4 = r4 - r0
            long r2 = (long) r3
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x005b
            r7.A0F(r6)
            return
        L_0x00d6:
            java.lang.String r1 = r11.getAction()
            java.lang.String r0 = "action"
            r2.put(r0, r1)
            java.lang.String r0 = "caller"
            java.lang.String r1 = r11.getStringExtra(r0)
            if (r1 == 0) goto L_0x000d
            goto L_0x000a
        L_0x00e9:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            goto L_0x00f6
        L_0x00ec:
            java.lang.String r0 = "Orca.START"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00fa
            java.lang.Integer r0 = X.AnonymousClass006.A00
        L_0x00f6:
            r8.A0X(r2, r0)
            return
        L_0x00fa:
            java.lang.String r0 = "Orca.EXPIRE_CONNECTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0125
            X.00d r7 = r8.A09
            long r4 = r2.A00
            X.0vH r6 = r7.A0s
            X.0Lp r0 = r7.A0D
            java.lang.Integer r3 = X.AnonymousClass006.A0j
            r0.A0F = r3
            if (r6 == 0) goto L_0x0121
            long r1 = r6.A0V
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0121
            java.lang.Integer r1 = X.AnonymousClass006.A0Y
            X.0uz r0 = X.C17490uz.EXPIRE_CONNECTION
            r7.A07(r6, r0, r1)
            X.C000200d.A02(r7)
            return
        L_0x0121:
            r7.A0D(r3)
            return
        L_0x0125:
            r8.A0V(r11, r2)
            return
        L_0x0129:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.mqtt.manager.MqttPushServiceDelegate.A0I(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0185, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0187, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J(java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
            r7 = this;
            java.lang.String r0 = "[ MqttPushService ]"
            r9.println(r0)     // Catch:{ Exception -> 0x0188 }
            java.lang.String r1 = "persistence="
            java.lang.String r0 = r7.A0L()     // Catch:{ Exception -> 0x0188 }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ Exception -> 0x0188 }
            r9.println(r0)     // Catch:{ Exception -> 0x0188 }
            X.00d r0 = r7.A09     // Catch:{ Exception -> 0x0188 }
            long r1 = r0.A03     // Catch:{ Exception -> 0x0188 }
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x003e
            java.util.Date r0 = new java.util.Date     // Catch:{ Exception -> 0x0188 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0188 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0188 }
        L_0x0025:
            java.lang.String r0 = "networkChangedTime="
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r1)     // Catch:{ Exception -> 0x0188 }
            r9.println(r0)     // Catch:{ Exception -> 0x0188 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0188 }
            r3.<init>()     // Catch:{ Exception -> 0x0188 }
            java.lang.String r0 = "subscribedTopics="
            r3.append(r0)     // Catch:{ Exception -> 0x0188 }
            X.00d r0 = r7.A09     // Catch:{ Exception -> 0x0188 }
            java.util.Map r2 = r0.A0W     // Catch:{ Exception -> 0x0188 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0188 }
            goto L_0x0043
        L_0x003e:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0188 }
            goto L_0x0025
        L_0x0043:
            java.util.Set r1 = r2.keySet()     // Catch:{ all -> 0x0182 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0182 }
            r0.<init>(r1)     // Catch:{ all -> 0x0182 }
            monitor-exit(r2)     // Catch:{ all -> 0x0182 }
            r3.append(r0)     // Catch:{ Exception -> 0x0188 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0188 }
            r9.println(r0)     // Catch:{ Exception -> 0x0188 }
            X.0P1 r0 = r7.A0A     // Catch:{ Exception -> 0x0188 }
            X.0PL r0 = r0.A06     // Catch:{ Exception -> 0x0188 }
            boolean r0 = r0.A02     // Catch:{ Exception -> 0x0188 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0062
            return
        L_0x0062:
            X.00d r6 = r7.A09     // Catch:{ Exception -> 0x0188 }
            java.lang.String r2 = "[ "
            java.lang.String r1 = r6.A0U     // Catch:{ Exception -> 0x0188 }
            java.lang.String r0 = " ]"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r2, r1, r0)     // Catch:{ Exception -> 0x0188 }
            r9.println(r0)     // Catch:{ Exception -> 0x0188 }
            java.lang.String r0 = "keepAliveIntervalSeconds="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0188 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0188 }
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A0Z     // Catch:{ Exception -> 0x0188 }
            r1.append(r0)     // Catch:{ Exception -> 0x0188 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0188 }
            r9.println(r0)     // Catch:{ Exception -> 0x0188 }
            X.068 r0 = r6.A0F     // Catch:{ Exception -> 0x0188 }
            android.net.NetworkInfo r0 = r0.A01()     // Catch:{ Exception -> 0x0188 }
            if (r0 == 0) goto L_0x00e4
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0188 }
        L_0x0090:
            java.lang.String r0 = "networkInfo="
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r1)     // Catch:{ Exception -> 0x0188 }
            r9.println(r0)     // Catch:{ Exception -> 0x0188 }
            android.util.Pair r0 = r6.A0q     // Catch:{ Exception -> 0x0188 }
            if (r0 == 0) goto L_0x00de
            android.util.Pair r0 = r6.A0q     // Catch:{ Exception -> 0x0188 }
            java.lang.Object r0 = r0.first     // Catch:{ Exception -> 0x0188 }
            X.0uz r0 = (X.C17490uz) r0     // Catch:{ Exception -> 0x0188 }
            java.lang.String r2 = r0.toString()     // Catch:{ Exception -> 0x0188 }
            java.lang.String r1 = "@"
            android.util.Pair r0 = r6.A0q     // Catch:{ Exception -> 0x0188 }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x0188 }
            X.0v7 r0 = (X.C17540v7) r0     // Catch:{ Exception -> 0x0188 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0188 }
            java.lang.String r5 = X.AnonymousClass00U.A0V(r2, r1, r0)     // Catch:{ Exception -> 0x0188 }
            java.lang.String r4 = "lastConnectLostTime="
            long r0 = r6.A0p     // Catch:{ Exception -> 0x0188 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0188 }
            long r2 = r2 + r0
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0188 }
            long r2 = r2 - r0
            java.util.Date r0 = new java.util.Date     // Catch:{ Exception -> 0x0188 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0188 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0188 }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r4, r0)     // Catch:{ Exception -> 0x0188 }
            r9.println(r0)     // Catch:{ Exception -> 0x0188 }
            java.lang.String r0 = "lastConnectLostReason="
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r5)     // Catch:{ Exception -> 0x0188 }
            r9.println(r0)     // Catch:{ Exception -> 0x0188 }
        L_0x00de:
            X.0vH r5 = r6.A0s     // Catch:{ Exception -> 0x0188 }
            if (r5 == 0) goto L_0x016e
            monitor-enter(r5)     // Catch:{ Exception -> 0x0188 }
            goto L_0x00e7
        L_0x00e4:
            java.lang.String r1 = "null"
            goto L_0x0090
        L_0x00e7:
            java.lang.String r0 = "[ MqttClient ]"
            r9.println(r0)     // Catch:{ all -> 0x0185 }
            java.lang.String r1 = "state="
            java.lang.Integer r0 = r5.A0Y     // Catch:{ all -> 0x0185 }
            if (r0 == 0) goto L_0x013f
            java.lang.String r0 = X.C17800vZ.A00(r0)     // Catch:{ all -> 0x0185 }
        L_0x00f6:
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ all -> 0x0185 }
            r9.println(r0)     // Catch:{ all -> 0x0185 }
            java.lang.String r2 = "lastMessageSent="
            long r0 = r5.A0T     // Catch:{ all -> 0x0185 }
            java.lang.String r0 = X.C17630vH.A01(r5, r0)     // Catch:{ all -> 0x0185 }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r2, r0)     // Catch:{ all -> 0x0185 }
            r9.println(r0)     // Catch:{ all -> 0x0185 }
            java.lang.String r2 = "lastMessageReceived="
            long r0 = r5.A0S     // Catch:{ all -> 0x0185 }
            java.lang.String r0 = X.C17630vH.A01(r5, r0)     // Catch:{ all -> 0x0185 }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r2, r0)     // Catch:{ all -> 0x0185 }
            r9.println(r0)     // Catch:{ all -> 0x0185 }
            java.lang.String r2 = "connectionEstablished="
            long r0 = r5.A0Q     // Catch:{ all -> 0x0185 }
            java.lang.String r0 = X.C17630vH.A01(r5, r0)     // Catch:{ all -> 0x0185 }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r2, r0)     // Catch:{ all -> 0x0185 }
            r9.println(r0)     // Catch:{ all -> 0x0185 }
            java.lang.String r2 = "lastPing="
            long r0 = r5.A0U     // Catch:{ all -> 0x0185 }
            java.lang.String r0 = X.C17630vH.A01(r5, r0)     // Catch:{ all -> 0x0185 }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r2, r0)     // Catch:{ all -> 0x0185 }
            r9.println(r0)     // Catch:{ all -> 0x0185 }
            java.lang.String r4 = "peer="
            X.0pX r3 = r5.A0E     // Catch:{ all -> 0x0185 }
            monitor-enter(r3)     // Catch:{ all -> 0x0185 }
            goto L_0x0142
        L_0x013f:
            java.lang.String r0 = "null"
            goto L_0x00f6
        L_0x0142:
            java.net.Socket r0 = r3.A05     // Catch:{ all -> 0x016b }
            if (r0 == 0) goto L_0x0160
            java.net.SocketAddress r0 = r0.getRemoteSocketAddress()     // Catch:{ all -> 0x016b }
            if (r0 == 0) goto L_0x0160
            java.lang.String r2 = r3.A02     // Catch:{ all -> 0x016b }
            if (r2 == 0) goto L_0x015b
            java.lang.String r1 = "|"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x016b }
            java.lang.String r0 = X.AnonymousClass00U.A0V(r2, r1, r0)     // Catch:{ all -> 0x016b }
            goto L_0x0162
        L_0x015b:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x016b }
            goto L_0x0162
        L_0x0160:
            java.lang.String r0 = "N/A"
        L_0x0162:
            monitor-exit(r3)     // Catch:{ all -> 0x0185 }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r4, r0)     // Catch:{ all -> 0x0185 }
            r9.println(r0)     // Catch:{ all -> 0x0185 }
            goto L_0x0174
        L_0x016b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0185 }
            throw r0     // Catch:{ all -> 0x0185 }
        L_0x016e:
            java.lang.String r0 = "mMqttClient=null"
            r9.println(r0)     // Catch:{ Exception -> 0x0188 }
            goto L_0x0175
        L_0x0174:
            monitor-exit(r5)     // Catch:{ Exception -> 0x0188 }
        L_0x0175:
            java.lang.String r0 = "[ MqttHealthStats ]"
            r9.println(r0)     // Catch:{ Exception -> 0x0188 }
            java.lang.String r0 = A05(r7)     // Catch:{ Exception -> 0x0188 }
            r9.println(r0)     // Catch:{ Exception -> 0x0188 }
            return
        L_0x0182:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0182 }
            goto L_0x0187
        L_0x0185:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ Exception -> 0x0188 }
        L_0x0187:
            throw r0     // Catch:{ Exception -> 0x0188 }
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.mqtt.manager.MqttPushServiceDelegate.A0J(java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public Future A0M(C17490uz r5) {
        C02740Cr r0 = C02740Cr.A01;
        if (!this.A0B.getAndSet(false)) {
            AnonymousClass0LU.A0C("MqttPushService", "service/stop/inactive_connection");
            return r0;
        }
        A0R();
        this.A09.A0B();
        Future A082 = this.A09.A08(r5);
        A0T();
        return A082;
    }

    public void A0N() {
        AnonymousClass0Lp r3 = this.A05;
        C03950Lq r0 = C03950Lq.A01;
        AnonymousClass0Lp.A04(r0, r3).set(SystemClock.elapsedRealtime());
    }

    public void A0O() {
        AnonymousClass0P1 r0 = this.A0A;
        C000200d r9 = r0.A0O;
        AnonymousClass068 r8 = r0.A0I;
        C13000mq r7 = r0.A0K;
        RealtimeSinceBootClock realtimeSinceBootClock = r0.A04;
        AnonymousClass0MO r5 = r0.A0B;
        AnonymousClass0Lp r4 = r0.A0D;
        C004201y r3 = r0.A0J;
        AnonymousClass0MC r2 = r0.A0C;
        C08860eQ r1 = r0.A02;
        C12800mV r02 = r0.A03;
        this.A09 = r9;
        this.A06 = r8;
        this.A08 = r7;
        this.A03 = realtimeSinceBootClock;
        this.A0E = r5;
        this.A05 = r4;
        this.A07 = r3;
        this.A04 = r2;
        this.A01 = r1;
        this.A02 = r02;
    }

    public final void A0S() {
        if (this.A0B.get()) {
            A0M(C17490uz.SERVICE_DESTROY);
        }
        C000200d r1 = this.A09;
        if (r1 != null) {
            r1.A08(C17490uz.SERVICE_DESTROY);
        }
        AnonymousClass0P1 r4 = this.A0A;
        if (r4 != null && !r4.A0W) {
            r4.A0W = true;
            AnonymousClass0Re r3 = r4.A0M;
            if (r3 != null) {
                synchronized (r3) {
                    r3.A00();
                    if (r3.A01) {
                        boolean z = false;
                        if (!r3.A07.A03(r3.A04, r3.A05)) {
                            z = true;
                        }
                        r3.A01 = z;
                    }
                }
            }
            AnonymousClass068 r32 = r4.A0I;
            if (r32 != null) {
                synchronized (r32) {
                    try {
                        r32.A01.unregisterReceiver(r32.A00);
                    } catch (IllegalArgumentException e) {
                        AnonymousClass0LU.A0H("MqttNetworkManager", "Failed to unregister broadcast receiver", e);
                    }
                }
            }
            AnonymousClass06H r0 = r4.A0G;
            if (r0 != null) {
                r0.shutdown();
            }
            C08770eG r02 = r4.A0L;
            if (r02 != null) {
                r02.A05();
            }
            C004201y r33 = r4.A0J;
            if (r33 != null) {
                synchronized (r33) {
                    try {
                        r33.A01.unregisterReceiver(r33.A00);
                    } catch (IllegalArgumentException e2) {
                        AnonymousClass0LU.A0H("ScreenPowerState", "Failed to unregister broadcast receiver", e2);
                    }
                    r33.A04.set((Object) null);
                }
                return;
            }
            return;
        }
        return;
    }

    public final void A0T() {
        Integer num;
        C17630vH r0 = this.A09.A0s;
        if (r0 == null) {
            num = AnonymousClass006.A0N;
        } else {
            num = r0.A0Y;
            if (num == null) {
                return;
            }
        }
        Integer num2 = this.A0C;
        if (num != num2) {
            String A002 = C17800vZ.A00(num2);
            String A003 = C17800vZ.A00(num);
            this.A01.Bb6(AnonymousClass00U.A0d("[state_machine] ", A002, " -> ", A003));
            this.A0C = num;
            this.A04.A01(A003);
        }
    }

    public void A0X(AnonymousClass0YN r5, Integer num) {
        if (!this.A0B.getAndSet(true)) {
            Integer num2 = r5.A02;
            if (num2 != null) {
                A0U(num2.intValue());
            }
            AnonymousClass0Lp r0 = this.A05;
            String A002 = C04260Mw.A00(num);
            AnonymousClass0LW r3 = r0.A00;
            if (r3.A07 == null) {
                r3.A07 = A002;
                r3.A04.set(SystemClock.elapsedRealtime());
                r3.A02.set(SystemClock.elapsedRealtime());
            }
            A0Q();
            this.A09.A0A();
        }
        String str = r5.A03;
        C000200d r02 = this.A09;
        if (str == null) {
            str = "MqttPushService";
        }
        r02.A0E(num, str);
    }

    public final boolean A0a() {
        if (!this.A0B.get()) {
            this.A01.Bb6("MqttPushService/not_started");
            return false;
        }
        HashMap hashMap = new HashMap();
        if (this.A08.CsB(hashMap)) {
            return true;
        }
        this.A01.Bb8("MqttPushService/should_not_connect", hashMap);
        return false;
    }

    public MqttPushServiceDelegate(C18080w5 r3) {
        super(r3);
    }
}
