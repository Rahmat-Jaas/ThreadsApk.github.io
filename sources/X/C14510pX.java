package X;

import android.content.Context;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.0pX  reason: invalid class name and case insensitive filesystem */
public final class C14510pX {
    public C17090uH A00;
    public C17080uG A01;
    public String A02;
    public InetAddress A03;
    public InetAddress A04;
    public Socket A05;
    public final Context A06;
    public final C021209x A07;
    public final RealtimeSinceBootClock A08;
    public final AnonymousClass0MO A09;
    public final C12990mp A0A;
    public final C17870vg A0B;
    public final C17580vB A0C;
    public final C17060uE A0D;
    public final String A0E;
    public final ScheduledExecutorService A0F;
    public final C12830mZ A0G;
    public volatile C14520pY A0H;
    public volatile C14580pi A0I;
    public volatile boolean A0J = false;

    public final synchronized void A03(byte[] bArr, int i, int i2, String str) {
        String str2;
        Integer num = (Integer) C05270Sj.A01.get(str);
        if (num != null) {
            str2 = num.toString();
        } else {
            C14580pi r3 = this.A0I;
            String.format((Locale) null, "Failed to encode topic %s", new Object[]{str});
            r3.A02((Throwable) null);
            str2 = str;
        }
        C14720q1 r1 = new C14720q1(new C17320uh(C17290ue.PUBLISH, i), new C17230uY(str2, i2), bArr);
        Integer num2 = this.A0I.A00.A0Y;
        try {
            A01(this, r1, this.A01);
            C021209x r0 = this.A07;
            if (r0 != null) {
                USLEBaseShape0S0000000 A002 = C32442Bv.A00(r0);
                if (A002.A00.isSampled()) {
                    A002.A0T("event_type", "outgoing_publish");
                    A002.A0S(AnonymousClass00T.A00(9, 10, 118), Long.valueOf(this.A0I.A00.A0V));
                    A002.A0T("connection_state", C17800vZ.A00(num2));
                    A002.A0T("client_type", this.A0E);
                    A002.A0T("topic", str);
                    A002.A0S(TraceFieldType.QoS, Long.valueOf((long) i));
                    A002.Bb4();
                }
            }
        } catch (IOException e) {
            C021209x r02 = this.A07;
            if (r02 != null) {
                USLEBaseShape0S0000000 A003 = C32442Bv.A00(r02);
                if (A003.A00.isSampled()) {
                    A003.A0T("event_type", "outgoing_publish");
                    A003.A0S(AnonymousClass00T.A00(9, 10, 118), Long.valueOf(this.A0I.A00.A0V));
                    A003.A0T("connection_state", C17800vZ.A00(num2));
                    A003.A0T("client_type", this.A0E);
                    A003.A0T("topic", str);
                    A003.A0S(TraceFieldType.QoS, Long.valueOf((long) i));
                    A003.A0T("error", e.toString());
                    A003.Bb4();
                }
            }
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r9 = r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r11 = r9.A00;
        r8 = r11.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r8 != X.C17290ue.PUBLISH) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        r0 = r5.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r0 == null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        r6 = X.C32432Bu.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r6.A00.isSampled() == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r1 = (long) r11.A02;
        r6.A0T("event_type", "incoming_publish");
        r6.A0S(X.AnonymousClass00T.A00(9, 10, 118), java.lang.Long.valueOf(r5.A0I.A00.A0V));
        r6.A0T("connection_state", X.C17800vZ.A00(r5.A0I.A00.A0Y));
        r6.A0T("client_type", r5.A0E);
        r10 = ((X.C17230uY) r9.A02).A01;
        r0 = X.C05270Sj.A00(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0074, code lost:
        if (r0 != null) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        r7 = r5.A0I;
        java.lang.String.format((java.util.Locale) null, "Failed to decode topic %s", new java.lang.Object[]{r10});
        r7.A02((java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0085, code lost:
        r6.A0T("topic", r10);
        r6.A0S(com.facebook.proxygen.TraceFieldType.QoS, java.lang.Long.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0097, code lost:
        if (r1 != 1) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0099, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009e, code lost:
        r6.A0Q("acked", r1);
        r6.Bb4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a6, code lost:
        r10 = r5.A0I.A00;
        r12 = X.AnonymousClass0P6.A00;
        r0 = android.os.SystemClock.elapsedRealtime();
        r7 = r10.A0X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b6, code lost:
        switch(r8.ordinal()) {
            case 2: goto L_0x0110;
            case 3: goto L_0x0209;
            case 11: goto L_0x0220;
            default: goto L_0x00b9;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b9, code lost:
        if (r7 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bb, code lost:
        r7.A01.A05.post(new X.C020309l(r7, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c7, code lost:
        r10.A0S = android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cf, code lost:
        if ((r9 instanceof X.C14720q1) == false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d1, code lost:
        r0 = ((X.C17230uY) r9.A02).A01;
        r0.getClass();
        r4 = new X.C12760mR(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00df, code lost:
        r3 = r10.A0A;
        r2 = r8.name();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e9, code lost:
        if (r4.A01() == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00eb, code lost:
        r0 = X.AnonymousClass00U.A0L(" ", (java.lang.String) r4.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x010a, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010d, code lost:
        r4 = X.C12730mO.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0110, code lost:
        r3 = r10.A0E;
        r6 = (X.C17230uY) r9.A02;
        r14 = r6.A01;
        r2 = X.C05270Sj.A00(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011c, code lost:
        if (r2 != null) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011e, code lost:
        r5 = r3.A0I;
        java.lang.String.format((java.util.Locale) null, "Failed to decode topic %s", new java.lang.Object[]{r14});
        r5.A02((java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012d, code lost:
        r6 = r6.A00;
        r5 = r11.A02;
        r15 = (byte[]) r9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0136, code lost:
        if (r7 == null) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013e, code lost:
        if ("/send_message_response".equals(r14) != false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0146, code lost:
        if ("/t_sm_rp".equals(r14) == false) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0148, code lost:
        ((java.util.concurrent.atomic.AtomicLong) ((X.C12880me) r7.A01.A0D.A05(X.C03040Ec.class)).A00(X.C12940mk.MessageSendSuccess)).incrementAndGet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0165, code lost:
        if ("/push_notification".equals(r14) != false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016d, code lost:
        if ("/t_push".equals(r14) == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016f, code lost:
        ((java.util.concurrent.atomic.AtomicLong) ((X.C12880me) r7.A01.A0D.A05(X.C03040Ec.class)).A00(X.C12940mk.FbnsNotificationReceived)).incrementAndGet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x018c, code lost:
        if ("/fbns_msg".equals(r14) == false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x018e, code lost:
        ((java.util.concurrent.atomic.AtomicLong) ((X.C12880me) r7.A01.A0D.A05(X.C03040Ec.class)).A00(X.C12940mk.FbnsLiteNotificationReceived)).incrementAndGet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01a5, code lost:
        r11 = r7.A01;
        ((java.util.concurrent.atomic.AtomicLong) ((X.C12880me) r11.A0D.A05(X.C03040Ec.class)).A00(X.C12940mk.PublishReceived)).incrementAndGet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01be, code lost:
        if (r11.A08 == null) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01c6, code lost:
        if (X.C08860eQ.A00.contains(r14) == false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01c8, code lost:
        r4 = r11.A08;
        r3 = new java.lang.StringBuilder("PUBLISH(topic=");
        r3.append(r14);
        r3.append(", msgId=");
        r3.append(r6);
        r3.append(", time=");
        r3.append(r0);
        r3.append(")");
        r4.Bb7("received", r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01f2, code lost:
        r11.A0M.CDq(r12, (java.lang.Long) null, r14, r15, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01fc, code lost:
        if (r5 != 1) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01fe, code lost:
        r1 = r10.A0J;
        r0 = new X.C17730vR(r10, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0206, code lost:
        r14 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0209, code lost:
        android.text.TextUtils.isEmpty((java.lang.String) r10.A0b.remove(java.lang.Integer.valueOf(((X.C17310ug) r9.A02).A00)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0220, code lost:
        r1 = r10.A0J;
        r0 = new X.C17720vQ(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0227, code lost:
        r1.execute(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x022c, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x022f, code lost:
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0232, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0233, code lost:
        r1 = r5.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0237, code lost:
        if ((r6 instanceof java.util.concurrent.TimeoutException) != false) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x023f, code lost:
        if ((r6 instanceof java.io.EOFException) != false) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0241, code lost:
        r4 = X.C17490uz.READ_EOF;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0243, code lost:
        r3 = X.C17540v7.NETWORK_THREAD_LOOP;
        r2 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x024b, code lost:
        if (r2.A0Y != X.AnonymousClass006.A0N) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x024d, code lost:
        X.C17630vH.A03(r2, r3, r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0260, code lost:
        if ((r6 instanceof java.net.SocketException) != false) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0262, code lost:
        r4 = X.C17490uz.READ_SOCKET;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0267, code lost:
        if ((r6 instanceof javax.net.ssl.SSLException) != false) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0269, code lost:
        r4 = X.C17490uz.READ_SSL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x026e, code lost:
        if ((r6 instanceof java.io.IOException) != false) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0270, code lost:
        r4 = X.C17490uz.READ_IO;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0275, code lost:
        if ((r6 instanceof java.util.zip.DataFormatException) != false) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0277, code lost:
        r4 = X.C17490uz.READ_FORMAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x027a, code lost:
        r4 = X.C17490uz.READ_FAILURE_UNCLASSIFIED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x027d, code lost:
        r4 = X.C17490uz.READ_TIMEOUT;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C14510pX r19) {
        /*
        L_0x0000:
            r5 = r19
            monitor-enter(r5)
            X.0pi r0 = r5.A0I     // Catch:{ all -> 0x0280 }
            java.lang.Integer r1 = X.AnonymousClass006.A0C     // Catch:{ all -> 0x0280 }
            X.0vH r0 = r0.A00     // Catch:{ all -> 0x0280 }
            java.lang.Integer r0 = r0.A0Y     // Catch:{ all -> 0x0280 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0280 }
            if (r0 != 0) goto L_0x0014
            monitor-exit(r5)     // Catch:{ all -> 0x0280 }
            goto L_0x0250
        L_0x0014:
            X.0uH r0 = r5.A00     // Catch:{ all -> 0x0280 }
            monitor-exit(r5)     // Catch:{ all -> 0x0280 }
            X.0ub r9 = r0.A00()     // Catch:{ IOException | DataFormatException | JSONException -> 0x0232 }
            X.0uh r11 = r9.A00
            X.0ue r8 = r11.A03
            X.0ue r0 = X.C17290ue.PUBLISH
            if (r8 != r0) goto L_0x00a6
            X.09x r0 = r5.A07
            if (r0 == 0) goto L_0x00a6
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r6 = X.C32432Bu.A00(r0)
            X.0A2 r0 = r6.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x00a6
            int r0 = r11.A02
            long r1 = (long) r0
            java.lang.String r3 = "incoming_publish"
            java.lang.String r0 = "event_type"
            r6.A0T(r0, r3)
            X.0pi r0 = r5.A0I
            X.0vH r0 = r0.A00
            long r3 = r0.A0V
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            r4 = 9
            r3 = 10
            r0 = 118(0x76, float:1.65E-43)
            java.lang.String r0 = X.AnonymousClass00T.A00(r4, r3, r0)
            r6.A0S(r0, r7)
            X.0pi r0 = r5.A0I
            X.0vH r0 = r0.A00
            java.lang.Integer r0 = r0.A0Y
            java.lang.String r3 = X.C17800vZ.A00(r0)
            java.lang.String r0 = "connection_state"
            r6.A0T(r0, r3)
            java.lang.String r3 = r5.A0E
            java.lang.String r0 = "client_type"
            r6.A0T(r0, r3)
            java.lang.Object r0 = r9.A02
            X.0uY r0 = (X.C17230uY) r0
            java.lang.String r10 = r0.A01
            java.lang.String r0 = X.C05270Sj.A00(r10)
            if (r0 != 0) goto L_0x022f
            X.0pi r7 = r5.A0I
            r4 = 0
            java.lang.Object[] r3 = new java.lang.Object[]{r10}
            java.lang.String r0 = "Failed to decode topic %s"
            java.lang.String.format(r4, r0, r3)
            r7.A02(r4)
        L_0x0085:
            java.lang.String r0 = "topic"
            r6.A0T(r0, r10)
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            java.lang.String r0 = "qos"
            r6.A0S(r0, r3)
            r3 = 1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x022c
            r0 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x009e:
            java.lang.String r0 = "acked"
            r6.A0Q(r0, r1)
            r6.Bb4()
        L_0x00a6:
            X.0pi r0 = r5.A0I
            X.0vH r10 = r0.A00
            X.0P6 r12 = X.AnonymousClass0P6.A00
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.0my r7 = r10.A0X
            int r2 = r8.ordinal()
            switch(r2) {
                case 2: goto L_0x0110;
                case 3: goto L_0x0209;
                case 11: goto L_0x0220;
                default: goto L_0x00b9;
            }
        L_0x00b9:
            if (r7 == 0) goto L_0x00c7
            X.00d r0 = r7.A01
            android.os.Handler r1 = r0.A05
            X.09l r0 = new X.09l
            r0.<init>(r7, r9)
            r1.post(r0)
        L_0x00c7:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r10.A0S = r0
            boolean r0 = r9 instanceof X.C14720q1
            if (r0 == 0) goto L_0x010d
            java.lang.Object r0 = r9.A02
            X.0uY r0 = (X.C17230uY) r0
            java.lang.String r0 = r0.A01
            r0.getClass()
            X.0mR r4 = new X.0mR
            r4.<init>(r0)
        L_0x00df:
            X.0MC r3 = r10.A0A
            java.lang.String r2 = r8.name()
            boolean r0 = r4.A01()
            if (r0 == 0) goto L_0x010a
            java.lang.String r1 = " "
            java.lang.Object r0 = r4.A00()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
        L_0x00f7:
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r0}
            java.lang.String r0 = "I %s%s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r3.A02(r0)
            long r0 = r10.A0S
            r10.A0R = r0
            goto L_0x0000
        L_0x010a:
            java.lang.String r0 = ""
            goto L_0x00f7
        L_0x010d:
            X.0mO r4 = X.C12730mO.A00
            goto L_0x00df
        L_0x0110:
            X.0pX r3 = r10.A0E
            java.lang.Object r6 = r9.A02
            X.0uY r6 = (X.C17230uY) r6
            java.lang.String r14 = r6.A01
            java.lang.String r2 = X.C05270Sj.A00(r14)
            if (r2 != 0) goto L_0x0206
            X.0pi r5 = r3.A0I
            r4 = 0
            java.lang.Object[] r3 = new java.lang.Object[]{r14}
            java.lang.String r2 = "Failed to decode topic %s"
            java.lang.String.format(r4, r2, r3)
            r5.A02(r4)
        L_0x012d:
            int r6 = r6.A00
            int r5 = r11.A02
            java.lang.Object r15 = r9.A01
            byte[] r15 = (byte[]) r15
            r13 = 0
            if (r7 == 0) goto L_0x01fb
            java.lang.String r2 = "/send_message_response"
            boolean r2 = r2.equals(r14)
            if (r2 != 0) goto L_0x0148
            java.lang.String r2 = "/t_sm_rp"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x015f
        L_0x0148:
            X.00d r2 = r7.A01
            X.0Lp r3 = r2.A0D
            java.lang.Class<X.0Ec> r2 = X.C03040Ec.class
            X.0LD r3 = r3.A05(r2)
            X.0me r3 = (X.C12880me) r3
            X.0mk r2 = X.C12940mk.MessageSendSuccess
            java.lang.Object r2 = r3.A00(r2)
            java.util.concurrent.atomic.AtomicLong r2 = (java.util.concurrent.atomic.AtomicLong) r2
            r2.incrementAndGet()
        L_0x015f:
            java.lang.String r2 = "/push_notification"
            boolean r2 = r2.equals(r14)
            if (r2 != 0) goto L_0x016f
            java.lang.String r2 = "/t_push"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x0186
        L_0x016f:
            X.00d r2 = r7.A01
            X.0Lp r3 = r2.A0D
            java.lang.Class<X.0Ec> r2 = X.C03040Ec.class
            X.0LD r3 = r3.A05(r2)
            X.0me r3 = (X.C12880me) r3
            X.0mk r2 = X.C12940mk.FbnsNotificationReceived
            java.lang.Object r2 = r3.A00(r2)
            java.util.concurrent.atomic.AtomicLong r2 = (java.util.concurrent.atomic.AtomicLong) r2
            r2.incrementAndGet()
        L_0x0186:
            java.lang.String r2 = "/fbns_msg"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x01a5
            X.00d r2 = r7.A01
            X.0Lp r3 = r2.A0D
            java.lang.Class<X.0Ec> r2 = X.C03040Ec.class
            X.0LD r3 = r3.A05(r2)
            X.0me r3 = (X.C12880me) r3
            X.0mk r2 = X.C12940mk.FbnsLiteNotificationReceived
            java.lang.Object r2 = r3.A00(r2)
            java.util.concurrent.atomic.AtomicLong r2 = (java.util.concurrent.atomic.AtomicLong) r2
            r2.incrementAndGet()
        L_0x01a5:
            X.00d r11 = r7.A01
            X.0Lp r3 = r11.A0D
            java.lang.Class<X.0Ec> r2 = X.C03040Ec.class
            X.0LD r3 = r3.A05(r2)
            X.0me r3 = (X.C12880me) r3
            X.0mk r2 = X.C12940mk.PublishReceived
            java.lang.Object r2 = r3.A00(r2)
            java.util.concurrent.atomic.AtomicLong r2 = (java.util.concurrent.atomic.AtomicLong) r2
            r2.incrementAndGet()
            X.0eQ r2 = r11.A08
            if (r2 == 0) goto L_0x01f2
            java.util.Set r2 = X.C08860eQ.A00
            boolean r2 = r2.contains(r14)
            if (r2 == 0) goto L_0x01f2
            X.0eQ r4 = r11.A08
            java.lang.String r2 = "PUBLISH(topic="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r14)
            java.lang.String r2 = ", msgId="
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = ", time="
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = ")"
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = "received"
            r4.Bb7(r2, r3)
        L_0x01f2:
            X.03q r11 = r11.A0M
            r17 = r0
            r16 = r6
            r11.CDq(r12, r13, r14, r15, r16, r17)
        L_0x01fb:
            r0 = 1
            if (r5 != r0) goto L_0x00b9
            java.util.concurrent.ExecutorService r1 = r10.A0J
            X.0vR r0 = new X.0vR
            r0.<init>(r10, r6)
            goto L_0x0227
        L_0x0206:
            r14 = r2
            goto L_0x012d
        L_0x0209:
            java.lang.Object r0 = r9.A02
            X.0ug r0 = (X.C17310ug) r0
            int r0 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.util.Map r0 = r10.A0b
            java.lang.Object r0 = r0.remove(r1)
            java.lang.String r0 = (java.lang.String) r0
            android.text.TextUtils.isEmpty(r0)
            goto L_0x00b9
        L_0x0220:
            java.util.concurrent.ExecutorService r1 = r10.A0J
            X.0vQ r0 = new X.0vQ
            r0.<init>(r10)
        L_0x0227:
            r1.execute(r0)
            goto L_0x00b9
        L_0x022c:
            r1 = 0
            goto L_0x009e
        L_0x022f:
            r10 = r0
            goto L_0x0085
        L_0x0232:
            r6 = move-exception
            X.0pi r1 = r5.A0I
            boolean r0 = r6 instanceof java.util.concurrent.TimeoutException
            if (r0 != 0) goto L_0x027d
            boolean r0 = r6 instanceof java.net.SocketTimeoutException
            if (r0 != 0) goto L_0x027d
            boolean r0 = r6 instanceof java.io.EOFException
            if (r0 == 0) goto L_0x025e
            X.0uz r4 = X.C17490uz.READ_EOF
        L_0x0243:
            X.0v7 r3 = X.C17540v7.NETWORK_THREAD_LOOP
            X.0vH r2 = r1.A00
            java.lang.Integer r1 = r2.A0Y
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            if (r1 == r0) goto L_0x0250
            X.C17630vH.A03(r2, r3, r4, r6)
        L_0x0250:
            X.0pi r0 = r5.A0I
            java.lang.Integer r1 = X.AnonymousClass006.A0N
            X.0vH r0 = r0.A00
            r0.A0Y = r1
            X.0pi r0 = r5.A0I
            r0.A00()
            return
        L_0x025e:
            boolean r0 = r6 instanceof java.net.SocketException
            if (r0 == 0) goto L_0x0265
            X.0uz r4 = X.C17490uz.READ_SOCKET
            goto L_0x0243
        L_0x0265:
            boolean r0 = r6 instanceof javax.net.ssl.SSLException
            if (r0 == 0) goto L_0x026c
            X.0uz r4 = X.C17490uz.READ_SSL
            goto L_0x0243
        L_0x026c:
            boolean r0 = r6 instanceof java.io.IOException
            if (r0 == 0) goto L_0x0273
            X.0uz r4 = X.C17490uz.READ_IO
            goto L_0x0243
        L_0x0273:
            boolean r0 = r6 instanceof java.util.zip.DataFormatException
            if (r0 == 0) goto L_0x027a
            X.0uz r4 = X.C17490uz.READ_FORMAT
            goto L_0x0243
        L_0x027a:
            X.0uz r4 = X.C17490uz.READ_FAILURE_UNCLASSIFIED
            goto L_0x0243
        L_0x027d:
            X.0uz r4 = X.C17490uz.READ_TIMEOUT
            goto L_0x0243
        L_0x0280:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0280 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14510pX.A00(X.0pX):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0420, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        r6 = r3.name();
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        if (r5 == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        r6 = "PUBLISH_".concat(((X.C17230uY) ((X.C14720q1) r14).A02).A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        r11 = r15.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        if (r2 < 0) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        r5 = r11.A00;
        ((X.C12890mf) r5.A0B.A05(X.C03090Eh.class)).A03((long) r2, r5.A0a, "m", "s", "b");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
        r8 = r11.A00;
        ((X.C12890mf) r8.A0B.A05(X.C03090Eh.class)).A03(1, r8.A0a, "m", "s", "c");
        X.C16500tD.A02.A00(r2, true);
        r5 = r8.A0X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bb, code lost:
        if (r5 == null) goto L_0x0360;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bd, code lost:
        r5.A01.A0M.Cd4((long) r2, r6, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0152, code lost:
        r2 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x035c, code lost:
        r10 = r10 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x035d, code lost:
        r2 = r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C14510pX r13, X.C17260ub r14, X.C17080uG r15) {
        /*
            if (r15 == 0) goto L_0x0439
            boolean r5 = r14 instanceof X.C14720q1
            if (r5 == 0) goto L_0x002d
            java.lang.Object r0 = r14.A02
            X.0uY r0 = (X.C17230uY) r0
            java.lang.String r0 = r0.A01
            r0.getClass()
            X.0mR r1 = new X.0mR
            r1.<init>(r0)
        L_0x0014:
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r1.A00()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = X.C05270Sj.A00(r0)
            if (r4 != 0) goto L_0x0032
            java.lang.Object r4 = r1.A00()
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0032
        L_0x002d:
            X.0mO r1 = X.C12730mO.A00
            goto L_0x0014
        L_0x0030:
            java.lang.String r4 = ""
        L_0x0032:
            monitor-enter(r15)     // Catch:{ IOException -> 0x0424 }
            X.0uh r6 = r14.A00     // Catch:{ all -> 0x0421 }
            X.0ue r3 = r6.A03     // Catch:{ all -> 0x0421 }
            int r0 = r3.ordinal()     // Catch:{ all -> 0x0421 }
            r2 = 0
            switch(r0) {
                case 0: goto L_0x00f0;
                case 1: goto L_0x0290;
                case 2: goto L_0x0305;
                case 3: goto L_0x0101;
                case 4: goto L_0x003f;
                case 5: goto L_0x003f;
                case 6: goto L_0x003f;
                case 7: goto L_0x0215;
                case 8: goto L_0x01c3;
                case 9: goto L_0x0155;
                case 10: goto L_0x012a;
                case 11: goto L_0x00db;
                case 12: goto L_0x00c7;
                default: goto L_0x003f;
            }     // Catch:{ all -> 0x0421 }
        L_0x003f:
            java.lang.String r7 = "MessageEncoder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0421 }
            r1.<init>()     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = "Unknown message type: "
            r1.append(r0)     // Catch:{ all -> 0x0421 }
            r1.append(r3)     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0421 }
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0421 }
            r6.<init>(r0)     // Catch:{ all -> 0x0421 }
            java.lang.String r1 = "send/unexpected; type=%s"
            java.lang.Object[] r0 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x0421 }
            X.AnonymousClass0LU.A0L(r7, r1, r6, r0)     // Catch:{ all -> 0x0421 }
        L_0x0060:
            java.lang.String r6 = r3.name()     // Catch:{ all -> 0x0421 }
            r3 = r6
            if (r5 == 0) goto L_0x0076
            r0 = r14
            X.0q1 r0 = (X.C14720q1) r0     // Catch:{ all -> 0x0421 }
            java.lang.String r1 = "PUBLISH_"
            java.lang.Object r0 = r0.A02     // Catch:{ all -> 0x0421 }
            X.0uY r0 = (X.C17230uY) r0     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0421 }
            java.lang.String r6 = r1.concat(r0)     // Catch:{ all -> 0x0421 }
        L_0x0076:
            X.0pY r11 = r15.A02     // Catch:{ all -> 0x0421 }
            if (r2 < 0) goto L_0x0096
            X.0vH r5 = r11.A00     // Catch:{ all -> 0x0421 }
            X.0Lp r1 = r5.A0B     // Catch:{ all -> 0x0421 }
            java.lang.Class<X.0Eh> r0 = X.C03090Eh.class
            X.0LD r10 = r1.A05(r0)     // Catch:{ all -> 0x0421 }
            X.0mf r10 = (X.C12890mf) r10     // Catch:{ all -> 0x0421 }
            long r0 = (long) r2     // Catch:{ all -> 0x0421 }
            java.lang.String r9 = r5.A0a     // Catch:{ all -> 0x0421 }
            java.lang.String r8 = "m"
            java.lang.String r7 = "s"
            java.lang.String r5 = "b"
            java.lang.String[] r5 = new java.lang.String[]{r9, r8, r7, r5}     // Catch:{ all -> 0x0421 }
            r10.A03(r0, r5)     // Catch:{ all -> 0x0421 }
        L_0x0096:
            X.0vH r8 = r11.A00     // Catch:{ all -> 0x0421 }
            X.0Lp r1 = r8.A0B     // Catch:{ all -> 0x0421 }
            java.lang.Class<X.0Eh> r0 = X.C03090Eh.class
            X.0LD r9 = r1.A05(r0)     // Catch:{ all -> 0x0421 }
            X.0mf r9 = (X.C12890mf) r9     // Catch:{ all -> 0x0421 }
            java.lang.String r10 = r8.A0a     // Catch:{ all -> 0x0421 }
            java.lang.String r5 = "m"
            r7 = 1
            java.lang.String r1 = "s"
            java.lang.String r0 = "c"
            java.lang.String[] r5 = new java.lang.String[]{r10, r5, r1, r0}     // Catch:{ all -> 0x0421 }
            r0 = 1
            r9.A03(r0, r5)     // Catch:{ all -> 0x0421 }
            X.0tD r0 = X.C16500tD.A02     // Catch:{ all -> 0x0421 }
            r0.A00(r2, r7)     // Catch:{ all -> 0x0421 }
            X.0my r5 = r8.A0X     // Catch:{ all -> 0x0421 }
            if (r5 == 0) goto L_0x0360
            long r0 = (long) r2     // Catch:{ all -> 0x0421 }
            X.00d r2 = r5.A01     // Catch:{ all -> 0x0421 }
            X.03q r2 = r2.A0M     // Catch:{ all -> 0x0421 }
            r2.Cd4(r0, r6, r7)     // Catch:{ all -> 0x0421 }
            goto L_0x0360
        L_0x00c7:
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x0421 }
            int r0 = X.C17100uI.A00(r6)     // Catch:{ all -> 0x0421 }
            r1.writeByte(r0)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.writeByte(r2)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.flush()     // Catch:{ all -> 0x0421 }
            goto L_0x0060
        L_0x00db:
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x0421 }
            int r0 = X.C17100uI.A00(r6)     // Catch:{ all -> 0x0421 }
            r1.writeByte(r0)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.writeByte(r2)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.flush()     // Catch:{ all -> 0x0421 }
            goto L_0x0060
        L_0x00f0:
            boolean r0 = r14 instanceof X.C14700py     // Catch:{ all -> 0x0421 }
            if (r0 == 0) goto L_0x0367
            r2 = r14
            X.0py r2 = (X.C14700py) r2     // Catch:{ all -> 0x0421 }
            X.0uE r1 = r15.A03     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            int r2 = r1.handleConnectMessage(r0, r2)     // Catch:{ all -> 0x0421 }
            goto L_0x0060
        L_0x0101:
            boolean r0 = r14 instanceof X.C14710q0     // Catch:{ all -> 0x0421 }
            if (r0 == 0) goto L_0x037f
            r1 = r14
            X.0q0 r1 = (X.C14710q0) r1     // Catch:{ all -> 0x0421 }
            X.0uh r0 = r1.A00     // Catch:{ all -> 0x0421 }
            java.lang.Object r2 = r1.A02     // Catch:{ all -> 0x0421 }
            X.0ug r2 = (X.C17310ug) r2     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x0421 }
            int r0 = X.C17100uI.A00(r0)     // Catch:{ all -> 0x0421 }
            r1.writeByte(r0)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x0421 }
            r0 = 2
            r1.writeByte(r0)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x0421 }
            int r0 = r2.A00     // Catch:{ all -> 0x0421 }
            r1.writeShort(r0)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.flush()     // Catch:{ all -> 0x0421 }
            goto L_0x0152
        L_0x012a:
            boolean r0 = r14 instanceof X.C14830qE     // Catch:{ all -> 0x0421 }
            if (r0 == 0) goto L_0x0397
            r2 = r14
            X.0qE r2 = (X.C14830qE) r2     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x0421 }
            X.0uh r0 = r2.A00     // Catch:{ all -> 0x0421 }
            int r0 = X.C17100uI.A00(r0)     // Catch:{ all -> 0x0421 }
            r1.writeByte(r0)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x0421 }
            r0 = 2
            r1.writeByte(r0)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x0421 }
            java.lang.Object r0 = r2.A02     // Catch:{ all -> 0x0421 }
            X.0ug r0 = (X.C17310ug) r0     // Catch:{ all -> 0x0421 }
            int r0 = r0.A00     // Catch:{ all -> 0x0421 }
            r1.writeShort(r0)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.flush()     // Catch:{ all -> 0x0421 }
        L_0x0152:
            r2 = 4
            goto L_0x0060
        L_0x0155:
            boolean r0 = r14 instanceof X.C15060qe     // Catch:{ all -> 0x0421 }
            if (r0 == 0) goto L_0x03ae
            r0 = r14
            X.0qe r0 = (X.C15060qe) r0     // Catch:{ all -> 0x0421 }
            X.0uh r9 = r0.A00     // Catch:{ all -> 0x0421 }
            java.lang.Object r7 = r0.A02     // Catch:{ all -> 0x0421 }
            X.0ug r7 = (X.C17310ug) r7     // Catch:{ all -> 0x0421 }
            java.lang.Object r0 = r0.A01     // Catch:{ all -> 0x0421 }
            X.0uS r0 = (X.C17190uS) r0     // Catch:{ all -> 0x0421 }
            java.util.List r6 = r0.A00     // Catch:{ all -> 0x0421 }
            java.util.Iterator r8 = r6.iterator()     // Catch:{ all -> 0x0421 }
            r1 = 0
        L_0x016d:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0421 }
            if (r0 == 0) goto L_0x0182
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0421 }
            byte[] r0 = X.C17100uI.A02(r0)     // Catch:{ all -> 0x0421 }
            int r0 = r0.length     // Catch:{ all -> 0x0421 }
            int r0 = r0 + 2
            int r1 = r1 + r0
            goto L_0x016d
        L_0x0182:
            int r8 = r1 + 2
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x0421 }
            int r0 = X.C17100uI.A00(r9)     // Catch:{ all -> 0x0421 }
            r1.writeByte(r0)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            int r0 = X.C17100uI.A01(r0, r8)     // Catch:{ all -> 0x0421 }
            int r10 = r0 + 1
            int r1 = r7.A00     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.writeShort(r1)     // Catch:{ all -> 0x0421 }
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x0421 }
        L_0x01a0:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0421 }
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0421 }
            byte[] r6 = X.C17100uI.A02(r0)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            int r1 = r6.length     // Catch:{ all -> 0x0421 }
            r0.writeShort(r1)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.write(r6, r2, r1)     // Catch:{ all -> 0x0421 }
            goto L_0x01a0
        L_0x01bc:
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.flush()     // Catch:{ all -> 0x0421 }
            goto L_0x035c
        L_0x01c3:
            boolean r0 = r14 instanceof X.AnonymousClass0q3     // Catch:{ all -> 0x0421 }
            if (r0 == 0) goto L_0x03c5
            r6 = r14
            X.0q3 r6 = (X.AnonymousClass0q3) r6     // Catch:{ all -> 0x0421 }
            java.lang.Object r0 = r6.A01     // Catch:{ all -> 0x0421 }
            X.0uX r0 = (X.C17220uX) r0     // Catch:{ all -> 0x0421 }
            java.util.List r2 = r0.A00     // Catch:{ all -> 0x0421 }
            int r0 = r2.size()     // Catch:{ all -> 0x0421 }
            int r8 = r0 + 2
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x0421 }
            X.0uh r0 = r6.A00     // Catch:{ all -> 0x0421 }
            int r0 = X.C17100uI.A00(r0)     // Catch:{ all -> 0x0421 }
            r1.writeByte(r0)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            int r0 = X.C17100uI.A01(r0, r8)     // Catch:{ all -> 0x0421 }
            int r10 = r0 + 1
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x0421 }
            java.lang.Object r0 = r6.A02     // Catch:{ all -> 0x0421 }
            X.0ug r0 = (X.C17310ug) r0     // Catch:{ all -> 0x0421 }
            int r0 = r0.A00     // Catch:{ all -> 0x0421 }
            r1.writeShort(r0)     // Catch:{ all -> 0x0421 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0421 }
        L_0x01f8:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0421 }
            if (r0 == 0) goto L_0x020e
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0421 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0421 }
            int r1 = r0.intValue()     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.writeByte(r1)     // Catch:{ all -> 0x0421 }
            goto L_0x01f8
        L_0x020e:
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.flush()     // Catch:{ all -> 0x0421 }
            goto L_0x035c
        L_0x0215:
            boolean r0 = r14 instanceof X.C14780q8     // Catch:{ all -> 0x0421 }
            if (r0 == 0) goto L_0x03dc
            r0 = r14
            X.0q8 r0 = (X.C14780q8) r0     // Catch:{ all -> 0x0421 }
            X.0uh r9 = r0.A00     // Catch:{ all -> 0x0421 }
            java.lang.Object r7 = r0.A02     // Catch:{ all -> 0x0421 }
            X.0ug r7 = (X.C17310ug) r7     // Catch:{ all -> 0x0421 }
            java.lang.Object r0 = r0.A01     // Catch:{ all -> 0x0421 }
            X.0uW r0 = (X.C17210uW) r0     // Catch:{ all -> 0x0421 }
            java.util.List r6 = r0.A00     // Catch:{ all -> 0x0421 }
            java.util.Iterator r8 = r6.iterator()     // Catch:{ all -> 0x0421 }
            r1 = 0
        L_0x022d:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0421 }
            if (r0 == 0) goto L_0x0246
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x0421 }
            com.facebook.rti.mqtt.protocol.messages.SubscribeTopic r0 = (com.facebook.rti.mqtt.protocol.messages.SubscribeTopic) r0     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0421 }
            byte[] r0 = X.C17100uI.A02(r0)     // Catch:{ all -> 0x0421 }
            int r0 = r0.length     // Catch:{ all -> 0x0421 }
            int r0 = r0 + 2
            int r1 = r1 + r0
            int r1 = r1 + 1
            goto L_0x022d
        L_0x0246:
            int r8 = r1 + 2
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x0421 }
            int r0 = X.C17100uI.A00(r9)     // Catch:{ all -> 0x0421 }
            r1.writeByte(r0)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            int r0 = X.C17100uI.A01(r0, r8)     // Catch:{ all -> 0x0421 }
            int r10 = r0 + 1
            int r1 = r7.A00     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.writeShort(r1)     // Catch:{ all -> 0x0421 }
            java.util.Iterator r9 = r6.iterator()     // Catch:{ all -> 0x0421 }
        L_0x0264:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0421 }
            if (r0 == 0) goto L_0x0289
            java.lang.Object r7 = r9.next()     // Catch:{ all -> 0x0421 }
            com.facebook.rti.mqtt.protocol.messages.SubscribeTopic r7 = (com.facebook.rti.mqtt.protocol.messages.SubscribeTopic) r7     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = r7.A01     // Catch:{ all -> 0x0421 }
            byte[] r6 = X.C17100uI.A02(r0)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            int r1 = r6.length     // Catch:{ all -> 0x0421 }
            r0.writeShort(r1)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.write(r6, r2, r1)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x0421 }
            int r0 = r7.A00     // Catch:{ all -> 0x0421 }
            r1.write(r0)     // Catch:{ all -> 0x0421 }
            goto L_0x0264
        L_0x0289:
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.flush()     // Catch:{ all -> 0x0421 }
            goto L_0x035c
        L_0x0290:
            boolean r0 = r14 instanceof X.C14690px     // Catch:{ all -> 0x0421 }
            if (r0 == 0) goto L_0x03f3
            r7 = r14
            X.0px r7 = (X.C14690px) r7     // Catch:{ all -> 0x0421 }
            java.lang.Object r0 = r7.A02     // Catch:{ all -> 0x0421 }
            X.0un r0 = (X.C17380un) r0     // Catch:{ all -> 0x0421 }
            byte r6 = r0.A00     // Catch:{ all -> 0x0421 }
            r1 = 1
            r10 = 4
            java.lang.Object r0 = r7.A01     // Catch:{ all -> 0x0421 }
            X.0up r0 = (X.C17400up) r0     // Catch:{ all -> 0x0421 }
            if (r6 != 0) goto L_0x02de
            r0.getClass()     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0421 }
            byte[] r8 = X.C17100uI.A02(r0)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x0421 }
            X.0uh r0 = r7.A00     // Catch:{ all -> 0x0421 }
            int r0 = X.C17100uI.A00(r0)     // Catch:{ all -> 0x0421 }
            r1.writeByte(r0)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x0421 }
            int r7 = r8.length     // Catch:{ all -> 0x0421 }
            int r0 = r7 + 4
            int r0 = X.C17100uI.A01(r1, r0)     // Catch:{ all -> 0x0421 }
            int r1 = r0 + 1
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.writeByte(r2)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.writeByte(r6)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.writeShort(r7)     // Catch:{ all -> 0x0421 }
            int r10 = r1 + 4
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.write(r8)     // Catch:{ all -> 0x0421 }
            int r10 = r10 + r7
            goto L_0x02ff
        L_0x02de:
            if (r0 == 0) goto L_0x02e1
            r1 = 0
        L_0x02e1:
            X.AnonymousClass0g1.A01(r1)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x0421 }
            X.0uh r0 = r7.A00     // Catch:{ all -> 0x0421 }
            int r0 = X.C17100uI.A00(r0)     // Catch:{ all -> 0x0421 }
            r1.writeByte(r0)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x0421 }
            r0 = 2
            r1.writeByte(r0)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.writeByte(r2)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.writeByte(r6)     // Catch:{ all -> 0x0421 }
        L_0x02ff:
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.flush()     // Catch:{ all -> 0x0421 }
            goto L_0x035d
        L_0x0305:
            if (r5 == 0) goto L_0x040a
            r1 = r14
            X.0q1 r1 = (X.C14720q1) r1     // Catch:{ all -> 0x0421 }
            X.0uh r0 = r1.A00     // Catch:{ all -> 0x0421 }
            java.lang.Object r11 = r1.A02     // Catch:{ all -> 0x0421 }
            X.0uY r11 = (X.C17230uY) r11     // Catch:{ all -> 0x0421 }
            java.lang.Object r7 = r1.A01     // Catch:{ all -> 0x0421 }
            byte[] r7 = (byte[]) r7     // Catch:{ all -> 0x0421 }
            int r1 = r15.A01     // Catch:{ all -> 0x0421 }
            r6 = 2
            if (r1 == 0) goto L_0x031d
            byte[] r7 = X.C13340nT.A00(r7)     // Catch:{ all -> 0x0421 }
        L_0x031d:
            java.lang.String r1 = r11.A01     // Catch:{ all -> 0x0421 }
            byte[] r12 = X.C17100uI.A02(r1)     // Catch:{ all -> 0x0421 }
            int r9 = r12.length     // Catch:{ all -> 0x0421 }
            int r8 = r9 + 2
            int r1 = r0.A02     // Catch:{ all -> 0x0421 }
            if (r1 > 0) goto L_0x032b
            r6 = 0
        L_0x032b:
            int r8 = r8 + r6
            int r6 = r7.length     // Catch:{ all -> 0x0421 }
            int r8 = r8 + r6
            java.io.DataOutputStream r10 = r15.A00     // Catch:{ all -> 0x0421 }
            int r0 = X.C17100uI.A00(r0)     // Catch:{ all -> 0x0421 }
            r10.writeByte(r0)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            int r0 = X.C17100uI.A01(r0, r8)     // Catch:{ all -> 0x0421 }
            int r10 = r0 + 1
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.writeShort(r9)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.write(r12, r2, r9)     // Catch:{ all -> 0x0421 }
            if (r1 <= 0) goto L_0x0352
            java.io.DataOutputStream r1 = r15.A00     // Catch:{ all -> 0x0421 }
            int r0 = r11.A00     // Catch:{ all -> 0x0421 }
            r1.writeShort(r0)     // Catch:{ all -> 0x0421 }
        L_0x0352:
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.write(r7, r2, r6)     // Catch:{ all -> 0x0421 }
            java.io.DataOutputStream r0 = r15.A00     // Catch:{ all -> 0x0421 }
            r0.flush()     // Catch:{ all -> 0x0421 }
        L_0x035c:
            int r10 = r10 + r8
        L_0x035d:
            r2 = r10
            goto L_0x0060
        L_0x0360:
            monitor-exit(r15)     // Catch:{ IOException -> 0x0424 }
            X.0pi r0 = r13.A0I
            r0.A01(r3, r4)
            return
        L_0x0367:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0421 }
            r1.<init>()     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = "Unexpected type: "
            r1.append(r0)     // Catch:{ all -> 0x0421 }
            r1.append(r14)     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0421 }
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x0421 }
            r1.<init>(r0)     // Catch:{ all -> 0x0421 }
            goto L_0x0420
        L_0x037f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0421 }
            r1.<init>()     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = "Unexpected type: "
            r1.append(r0)     // Catch:{ all -> 0x0421 }
            r1.append(r14)     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0421 }
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x0421 }
            r1.<init>(r0)     // Catch:{ all -> 0x0421 }
            goto L_0x0420
        L_0x0397:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0421 }
            r1.<init>()     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = "Unexpected type: "
            r1.append(r0)     // Catch:{ all -> 0x0421 }
            r1.append(r14)     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0421 }
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x0421 }
            r1.<init>(r0)     // Catch:{ all -> 0x0421 }
            goto L_0x0420
        L_0x03ae:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0421 }
            r1.<init>()     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = "Unexpected type: "
            r1.append(r0)     // Catch:{ all -> 0x0421 }
            r1.append(r14)     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0421 }
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x0421 }
            r1.<init>(r0)     // Catch:{ all -> 0x0421 }
            goto L_0x0420
        L_0x03c5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0421 }
            r1.<init>()     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = "Unexpected type: "
            r1.append(r0)     // Catch:{ all -> 0x0421 }
            r1.append(r14)     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0421 }
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x0421 }
            r1.<init>(r0)     // Catch:{ all -> 0x0421 }
            goto L_0x0420
        L_0x03dc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0421 }
            r1.<init>()     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = "Unexpected type: "
            r1.append(r0)     // Catch:{ all -> 0x0421 }
            r1.append(r14)     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0421 }
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x0421 }
            r1.<init>(r0)     // Catch:{ all -> 0x0421 }
            goto L_0x0420
        L_0x03f3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0421 }
            r1.<init>()     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = "Unexpected type: "
            r1.append(r0)     // Catch:{ all -> 0x0421 }
            r1.append(r14)     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0421 }
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x0421 }
            r1.<init>(r0)     // Catch:{ all -> 0x0421 }
            goto L_0x0420
        L_0x040a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0421 }
            r1.<init>()     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = "Unexpected type: "
            r1.append(r0)     // Catch:{ all -> 0x0421 }
            r1.append(r14)     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0421 }
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x0421 }
            r1.<init>(r0)     // Catch:{ all -> 0x0421 }
        L_0x0420:
            throw r1     // Catch:{ all -> 0x0421 }
        L_0x0421:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ IOException -> 0x0424 }
            throw r0     // Catch:{ IOException -> 0x0424 }
        L_0x0424:
            r3 = move-exception
            X.0pi r2 = r13.A0I
            X.0uh r0 = r14.A00
            X.0ue r0 = r0.A03
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "-failed"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            r2.A01(r0, r4)
            throw r3
        L_0x0439:
            java.lang.String r1 = "No message encoder"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14510pX.A01(X.0pX, X.0ub, X.0uG):void");
    }

    public final void A02() {
        Socket socket = this.A05;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
        synchronized (this) {
            this.A05 = null;
            this.A02 = null;
            this.A00 = null;
            this.A01 = null;
            this.A0I.A00.A0Y = AnonymousClass006.A0N;
        }
        this.A0I.A00();
    }

    public C14510pX(Context context, C021209x r3, RealtimeSinceBootClock realtimeSinceBootClock, C12830mZ r5, AnonymousClass0MO r6, C12990mp r7, C17870vg r8, C17580vB r9, C17060uE r10, String str, ScheduledExecutorService scheduledExecutorService) {
        this.A0A = r7;
        this.A09 = r6;
        this.A0C = r9;
        this.A08 = realtimeSinceBootClock;
        this.A0G = r5;
        this.A0F = scheduledExecutorService;
        this.A0B = r8;
        this.A0D = r10;
        this.A06 = context;
        this.A07 = r3;
        this.A0E = str == null ? "android_legacy" : str;
    }
}
