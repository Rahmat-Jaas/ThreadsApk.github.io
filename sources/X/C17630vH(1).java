package X;

import android.net.NetworkInfo;
import android.os.SystemClock;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0vH  reason: invalid class name and case insensitive filesystem */
public final class C17630vH {
    public static final EnumSet A0d = EnumSet.of(C17640vI.ACKNOWLEDGED_DELIVERY, new C17640vI[]{C17640vI.PROCESSING_LASTACTIVE_PRESENCEINFO, C17640vI.EXACT_KEEPALIVE, C17640vI.DELTA_SENT_MESSAGE_ENABLED, C17640vI.USE_THRIFT_FOR_INBOX, C17640vI.USE_ENUM_TOPIC});
    public static final HashSet A0e = new HashSet(Arrays.asList(new String[]{"/t_rtc", RealtimeConstants.MQTT_TOPIC_RTC_MULTI}));
    public static final AtomicInteger A0f = new AtomicInteger(1);
    public int A00;
    public List A01;
    public final C12720mN A02;
    public final C12770mS A03;
    public final RealtimeSinceBootClock A04;
    public final AnonymousClass0PW A05;
    public final AnonymousClass0PW A06;
    public final AnonymousClass0P3 A07;
    public final C04230Mt A08;
    public final AnonymousClass0MO A09;
    public final AnonymousClass0MC A0A;
    public final AnonymousClass0Lp A0B;
    public final AnonymousClass068 A0C;
    public final C12330li A0D;
    public final C14510pX A0E;
    public final C14580pi A0F;
    public final C17580vB A0G;
    public final Long A0H;
    public final Map A0I = new HashMap();
    public final ExecutorService A0J;
    public final AtomicInteger A0K;
    public final boolean A0L;
    public final C14520pY A0M;
    public final C14610pp A0N;
    public final C14680pw A0O;
    public volatile long A0P;
    public volatile long A0Q = Long.MAX_VALUE;
    public volatile long A0R = Long.MAX_VALUE;
    public volatile long A0S = Long.MAX_VALUE;
    public volatile long A0T = Long.MAX_VALUE;
    public volatile long A0U = Long.MAX_VALUE;
    public volatile long A0V;
    public volatile NetworkInfo A0W;
    public volatile C13080my A0X;
    public volatile Integer A0Y = AnonymousClass006.A0N;
    public volatile String A0Z;
    public volatile String A0a = NetInfoModule.CONNECTION_TYPE_NONE;
    public volatile Map A0b;
    public volatile boolean A0c;

    public static void A02(C17630vH r9) {
        long j = (long) (r9.A0G.A03 * 1000);
        synchronized (r9) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            while (true) {
                Integer num = r9.A0Y;
                if (num != AnonymousClass006.A00 && num != AnonymousClass006.A01) {
                    break;
                }
                long elapsedRealtime2 = j - (SystemClock.elapsedRealtime() - elapsedRealtime);
                if (elapsedRealtime2 <= 0) {
                    break;
                }
                r9.wait(elapsedRealtime2);
            }
        }
    }

    public final boolean A04() {
        Integer num = this.A0Y;
        if (num == AnonymousClass006.A0C || num == AnonymousClass006.A00 || num == AnonymousClass006.A01) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[MqttClient (");
        C17580vB r1 = this.A0G;
        sb.append(r1.A00);
        sb.append(":");
        sb.append(this.A00);
        if (r1.A0N) {
            sb.append(" +ssl");
        }
        sb.append(") ");
        Integer num = this.A0Y;
        if (num != null) {
            str = C17800vZ.A00(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    private C09740gb A00(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j > elapsedRealtime) {
            return C12730mO.A00;
        }
        Long valueOf = Long.valueOf(elapsedRealtime - j);
        valueOf.getClass();
        return new C12760mR(valueOf);
    }

    public static String A01(C17630vH r1, long j) {
        C09740gb A002 = r1.A00(j);
        if (A002.A01()) {
            return new Date(System.currentTimeMillis() - ((Number) A002.A00()).longValue()).toString();
        }
        return "N/A";
    }

    public C17630vH(C12720mN r7, C12770mS r8, RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass0PW r10, AnonymousClass0PW r11, AnonymousClass0P3 r12, C04230Mt r13, AnonymousClass0MO r14, AnonymousClass0MC r15, AnonymousClass0Lp r16, AnonymousClass068 r17, C12330li r18, C14510pX r19, C14610pp r20, C17580vB r21, C14680pw r22, Long l, ExecutorService executorService) {
        String str;
        C14520pY r3 = new C14520pY(this);
        this.A0M = r3;
        C14580pi r1 = new C14580pi(this);
        this.A0F = r1;
        boolean z = false;
        this.A0K = new AtomicInteger(0);
        this.A0C = r17;
        this.A07 = r12;
        this.A09 = r14;
        this.A0B = r16;
        C17580vB r4 = r21;
        this.A0G = r4;
        this.A04 = realtimeSinceBootClock;
        this.A0J = executorService;
        this.A0A = r15;
        this.A02 = r7;
        this.A0N = r20;
        this.A0O = r22;
        C12330li r5 = r18;
        this.A0D = r5;
        this.A08 = r13;
        C14510pX r0 = r19;
        this.A0E = r0;
        this.A06 = r10;
        r0.A0I = r1;
        r0.A0H = r3;
        if ("".equals(r5.AXb()) && (str = r4.A0G) != null && "".equals(str)) {
            z = true;
        }
        this.A0L = z;
        this.A05 = r11;
        this.A03 = r8;
        this.A0H = l;
        this.A0b = new C17710vP();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004d, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        if (r1.hasNext() == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        throw new java.lang.NullPointerException("onMqttNetworkDisconnect");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0063, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        r6.A00.A02.set(android.os.SystemClock.elapsedRealtime());
        ((java.util.concurrent.atomic.AtomicLong) ((X.C12880me) r6.A05(X.C03040Ec.class)).A00(X.C12940mk.MqttTotalDurationMs)).addAndGet(android.os.SystemClock.elapsedRealtime() - r5.A0V);
        r6 = r5.A09;
        r22 = r5.A00(r5.A0Q);
        r21 = r5.A00(r5.A0U);
        r17 = r5.A00(r5.A0T);
        r16 = r5.A00(r5.A0S);
        r1 = r4.toString();
        r1.getClass();
        r0 = new X.C12760mR(r1);
        r1 = r26.toString();
        r1.getClass();
        r0 = new X.C12760mR(r1);
        r8 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c1, code lost:
        if (r28 != null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c3, code lost:
        r9 = X.C12730mO.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c5, code lost:
        r24 = r5.A0V;
        r1 = r5.A0C.A06.get();
        r11 = r5.A0W;
        r0 = r5.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d5, code lost:
        if (r0 != null) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d7, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d9, code lost:
        r10 = new java.util.HashMap();
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00eb, code lost:
        if (android.provider.Settings.Global.getInt(r6.A00.getContentResolver(), "airplane_mode_on", 0) != 0) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ed, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ee, code lost:
        r10.put("is_airplane_mode_on", java.lang.String.valueOf(r13));
        r7 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fa, code lost:
        r18 = ((java.lang.Boolean) r0.get()).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0105, code lost:
        r9 = new X.C12760mR(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r15 = r7.A00.registerReceiver((android.content.BroadcastReceiver) null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0119, code lost:
        if (r15 != null) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011b, code lost:
        r12 = X.C12730mO.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x011e, code lost:
        r7 = r15.getIntExtra(com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, -1);
        r13 = true;
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0129, code lost:
        if (r7 == 2) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x012b, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x012d, code lost:
        if (r7 != 5) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0130, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0131, code lost:
        r7 = r15.getIntExtra("level", -1);
        r0 = r15.getIntExtra("scale", -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x013d, code lost:
        if (r7 == -1) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013f, code lost:
        if (r0 == -1) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0141, code lost:
        r0 = java.lang.Integer.valueOf((int) ((((float) r7) / ((float) r0)) * 100.0f));
        r0.getClass();
        r12 = new X.C12760mR(new X.AnonymousClass07O(new X.C12760mR(r0), r12, r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x015f, code lost:
        r12 = new X.C12760mR(new X.AnonymousClass07O(X.C12730mO.A00, r12, r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x016c, code lost:
        r12 = X.C12730mO.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        r6 = r5.A0B;
        r7 = X.C03100Ei.class;
        r2 = X.C12870md.A07;
        ((X.C12880me) r6.A05(r7)).A02(r2, r4.name());
        r1 = r6.A01;
        X.C04220Ms.A0B(((X.C12880me) r6.A05(r7)).A00(r2).toString(), 0);
        r2 = r1.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C17630vH r25, X.C17540v7 r26, X.C17490uz r27, java.lang.Throwable r28) {
        /*
            java.lang.String r2 = "MqttClient"
            java.lang.String r1 = "connection/disconnecting; reason=%s, operation=%s"
            r23 = 2
            r4 = r27
            r0 = r26
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0}
            X.AnonymousClass0LU.A0O(r2, r1, r0)
            r5 = r25
            monitor-enter(r5)
            boolean r0 = r5.A04()     // Catch:{ all -> 0x02d6 }
            if (r0 != 0) goto L_0x001c
            monitor-exit(r5)     // Catch:{ all -> 0x02d6 }
            return
        L_0x001c:
            X.0my r3 = r5.A0X     // Catch:{ all -> 0x02d6 }
            X.0pX r0 = r5.A0E     // Catch:{ all -> 0x02d6 }
            r0.A02()     // Catch:{ all -> 0x02d6 }
            monitor-exit(r5)     // Catch:{ all -> 0x02d6 }
            X.0Lp r6 = r5.A0B
            java.lang.Class<X.0Ei> r7 = X.C03100Ei.class
            X.0LD r1 = r6.A05(r7)
            X.0me r1 = (X.C12880me) r1
            X.0md r2 = X.C12870md.A07
            java.lang.String r0 = r4.name()
            r1.A02(r2, r0)
            X.0jQ r1 = r6.A01
            X.0LD r0 = r6.A05(r7)
            X.0me r0 = (X.C12880me) r0
            java.lang.Object r0 = r0.A00(r2)
            java.lang.String r0 = r0.toString()
            r7 = 0
            X.C04220Ms.A0B(r0, r7)
            java.util.List r2 = r1.A00
            monitor-enter(r2)
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x02d3 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x02d3 }
            if (r0 == 0) goto L_0x0063
            r1.next()     // Catch:{ all -> 0x02d3 }
            java.lang.String r1 = "onMqttNetworkDisconnect"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x02d3 }
            r0.<init>(r1)     // Catch:{ all -> 0x02d3 }
            throw r0     // Catch:{ all -> 0x02d3 }
        L_0x0063:
            monitor-exit(r2)
            X.0LW r0 = r6.A00
            java.util.concurrent.atomic.AtomicLong r2 = r0.A02
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.set(r0)
            java.lang.Class<X.0Ec> r0 = X.C03040Ec.class
            X.0LD r1 = r6.A05(r0)
            X.0me r1 = (X.C12880me) r1
            X.0mk r0 = X.C12940mk.MqttTotalDurationMs
            java.lang.Object r2 = r1.A00(r0)
            java.util.concurrent.atomic.AtomicLong r2 = (java.util.concurrent.atomic.AtomicLong) r2
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r8 = r5.A0V
            long r0 = r0 - r8
            r2.addAndGet(r0)
            X.0MO r6 = r5.A09
            long r0 = r5.A0Q
            X.0gb r22 = r5.A00(r0)
            long r0 = r5.A0U
            X.0gb r21 = r5.A00(r0)
            long r0 = r5.A0T
            X.0gb r17 = r5.A00(r0)
            long r0 = r5.A0S
            X.0gb r16 = r5.A00(r0)
            java.lang.String r1 = r4.toString()
            r1.getClass()
            X.0mR r20 = new X.0mR
            r0 = r20
            r0.<init>(r1)
            java.lang.String r1 = r26.toString()
            r1.getClass()
            X.0mR r19 = new X.0mR
            r0 = r19
            r0.<init>(r1)
            r8 = r28
            if (r28 != 0) goto L_0x0105
            X.0mO r9 = X.C12730mO.A00
        L_0x00c5:
            long r0 = r5.A0V
            r24 = r0
            X.068 r0 = r5.A0C
            java.util.concurrent.atomic.AtomicLong r0 = r0.A06
            long r1 = r0.get()
            android.net.NetworkInfo r11 = r5.A0W
            X.0PW r0 = r5.A05
            if (r0 != 0) goto L_0x00fa
            r18 = 0
        L_0x00d9:
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            android.content.Context r0 = r6.A00
            r13 = 1
            java.lang.String r12 = "airplane_mode_on"
            android.content.ContentResolver r0 = r0.getContentResolver()
            int r0 = android.provider.Settings.Global.getInt(r0, r12, r7)
            if (r0 != 0) goto L_0x00ee
            r13 = 0
        L_0x00ee:
            java.lang.String r7 = java.lang.String.valueOf(r13)
            java.lang.String r0 = "is_airplane_mode_on"
            r10.put(r0, r7)
            X.071 r7 = r6.A02
            goto L_0x010b
        L_0x00fa:
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r18 = r0.booleanValue()
            goto L_0x00d9
        L_0x0105:
            X.0mR r9 = new X.0mR
            r9.<init>(r8)
            goto L_0x00c5
        L_0x010b:
            java.lang.String r0 = "android.intent.action.BATTERY_CHANGED"
            android.content.IntentFilter r12 = new android.content.IntentFilter     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            r12.<init>(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            android.content.Context r7 = r7.A00     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            r0 = 0
            android.content.Intent r15 = r7.registerReceiver(r0, r12)     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            if (r15 != 0) goto L_0x011e
            X.0mO r12 = X.C12730mO.A00     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            goto L_0x016e
        L_0x011e:
            java.lang.String r0 = "status"
            r14 = -1
            int r7 = r15.getIntExtra(r0, r14)     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            r13 = 1
            r12 = 1
            r0 = r23
            if (r7 == r0) goto L_0x0130
            r12 = 0
            r0 = 5
            if (r7 != r0) goto L_0x0130
            goto L_0x0131
        L_0x0130:
            r13 = 0
        L_0x0131:
            java.lang.String r0 = "level"
            int r7 = r15.getIntExtra(r0, r14)     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            java.lang.String r0 = "scale"
            int r0 = r15.getIntExtra(r0, r14)     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            if (r7 == r14) goto L_0x015f
            if (r0 == r14) goto L_0x015f
            float r7 = (float) r7     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            float r0 = (float) r0     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            float r7 = r7 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 * r0
            int r0 = (int) r7     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            r0.getClass()     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            X.0mR r7 = new X.0mR     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            r7.<init>(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            X.07O r0 = new X.07O     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            r0.<init>(r7, r12, r13)     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            X.0mR r12 = new X.0mR     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            r12.<init>(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            goto L_0x016e
        L_0x015f:
            X.0mO r7 = X.C12730mO.A00     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            X.07O r0 = new X.07O     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            r0.<init>(r7, r12, r13)     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            X.0mR r12 = new X.0mR     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            r12.<init>(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x016c }
            goto L_0x016e
        L_0x016c:
            X.0mO r12 = X.C12730mO.A00
        L_0x016e:
            boolean r0 = r12.A01()
            if (r0 == 0) goto L_0x01ab
            java.lang.Object r0 = r12.A00()
            X.07O r0 = (X.AnonymousClass07O) r0
            boolean r0 = r0.A01
            java.lang.String r7 = "bat"
            if (r0 != 0) goto L_0x02cf
            java.lang.Object r0 = r12.A00()
            X.07O r0 = (X.AnonymousClass07O) r0
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x02cf
            java.lang.Object r0 = r12.A00()
            X.07O r0 = (X.AnonymousClass07O) r0
            X.0gb r0 = r0.A00
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x01ab
            java.lang.Object r0 = r12.A00()
            X.07O r0 = (X.AnonymousClass07O) r0
            X.0gb r0 = r0.A00
            java.lang.Object r0 = r0.A00()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x01a8:
            r10.put(r7, r0)
        L_0x01ab:
            boolean r0 = r22.A01()
            if (r0 == 0) goto L_0x01be
            java.lang.Object r0 = r22.A00()
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "connected_duration_ms"
            r10.put(r0, r7)
        L_0x01be:
            boolean r0 = r21.A01()
            if (r0 == 0) goto L_0x01d1
            java.lang.Object r0 = r21.A00()
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "last_ping_ms_ago"
            r10.put(r0, r7)
        L_0x01d1:
            boolean r0 = r17.A01()
            if (r0 == 0) goto L_0x01e4
            java.lang.Object r0 = r17.A00()
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "last_sent_ms_ago"
            r10.put(r0, r7)
        L_0x01e4:
            boolean r0 = r16.A01()
            if (r0 == 0) goto L_0x01f7
            java.lang.Object r0 = r16.A00()
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "last_received_ms_ago"
            r10.put(r0, r7)
        L_0x01f7:
            boolean r17 = r20.A01()
            java.lang.String r0 = "reason"
            if (r17 == 0) goto L_0x0206
            java.lang.Object r7 = r20.A00()
            r10.put(r0, r7)
        L_0x0206:
            boolean r16 = r19.A01()
            java.lang.String r12 = "operation"
            if (r16 == 0) goto L_0x0215
            java.lang.Object r7 = r19.A00()
            r10.put(r12, r7)
        L_0x0215:
            boolean r15 = r9.A01()
            java.lang.String r7 = "exception"
            if (r15 == 0) goto L_0x023b
            java.lang.Object r13 = r9.A00()
            java.lang.Class r13 = r13.getClass()
            java.lang.String r13 = r13.getSimpleName()
            r10.put(r7, r13)
            java.lang.Object r13 = r9.A00()
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.String r14 = r13.getMessage()
            java.lang.String r13 = "error_message"
            r10.put(r13, r14)
        L_0x023b:
            java.lang.String r14 = java.lang.String.valueOf(r18)
            java.lang.String r13 = "fs"
            r10.put(r13, r14)
            java.lang.String r14 = java.lang.Long.toString(r24)
            java.lang.String r13 = "mqtt_session_id"
            r10.put(r13, r14)
            X.AnonymousClass0MO.A00(r1, r10)
            X.AnonymousClass0MO.A01(r11, r6, r10)
            java.lang.String r2 = "mqtt_disconnection_on_failure"
            r6.A07(r2, r10)
            X.0eQ r10 = r6.A01
            if (r10 == 0) goto L_0x0290
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            if (r17 == 0) goto L_0x026a
            java.lang.Object r11 = r20.A00()
            r1.put(r0, r11)
        L_0x026a:
            if (r16 == 0) goto L_0x0273
            java.lang.Object r0 = r19.A00()
            r1.put(r12, r0)
        L_0x0273:
            if (r15 == 0) goto L_0x0284
            java.lang.Object r0 = r9.A00()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.put(r7, r0)
        L_0x0284:
            X.068 r0 = r6.A03
            android.net.NetworkInfo r0 = r0.A02()
            X.AnonymousClass0MO.A01(r0, r6, r1)
            r10.Bb8(r2, r1)
        L_0x0290:
            if (r3 == 0) goto L_0x02bf
            X.00d r2 = r3.A01
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A0p = r0
            android.util.Pair r1 = new android.util.Pair
            r0 = r26
            r1.<init>(r4, r0)
            r2.A0q = r1
            android.os.Handler r1 = r2.A05
            X.0CT r0 = new X.0CT
            r0.<init>(r3)
            r1.post(r0)
            X.0uz r0 = X.C17490uz.READ_FAILURE_UNCLASSIFIED
            if (r4 == r0) goto L_0x02b5
            X.0uz r0 = X.C17490uz.WRITE_FAILURE_UNCLASSIFIED
            if (r4 != r0) goto L_0x02bf
        L_0x02b5:
            android.os.Handler r1 = r2.A05
            X.09k r0 = new X.09k
            r0.<init>(r3, r8)
            r1.post(r0)
        L_0x02bf:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5.A0Q = r0
            r5.A0U = r0
            r5.A0T = r0
            r5.A0S = r0
            r5.A0R = r0
            return
        L_0x02cf:
            java.lang.String r0 = "crg"
            goto L_0x01a8
        L_0x02d3:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x02d6:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x02d6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17630vH.A03(X.0vH, X.0v7, X.0uz, java.lang.Throwable):void");
    }
}
