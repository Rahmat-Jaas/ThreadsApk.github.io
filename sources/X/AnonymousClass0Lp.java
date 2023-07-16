package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0Lp  reason: invalid class name */
public final class AnonymousClass0Lp {
    public final AnonymousClass0LW A00;
    public final C11070jQ A01;
    public final ConcurrentMap A02 = new ConcurrentHashMap();
    public final Context A03;
    public final C12800mV A04;
    public final RealtimeSinceBootClock A05;
    public final C12830mZ A06;
    public final AnonymousClass0PW A07;
    public final AnonymousClass0OX A08;
    public final AnonymousClass068 A09;
    public final C004201y A0A;
    public final String A0B;
    public final HashMap A0C;
    public final HashMap A0D;
    public final boolean A0E;
    public volatile Integer A0F;
    public volatile String A0G;
    public volatile String A0H;
    public volatile String A0I;
    public volatile String A0J;
    public volatile String A0K;

    public static synchronized AtomicLong A04(C03950Lq r2, AnonymousClass0Lp r3) {
        AtomicLong atomicLong;
        synchronized (r3) {
            HashMap hashMap = r3.A0C;
            if (!hashMap.containsKey(r2)) {
                hashMap.put(r2, new AtomicLong());
            }
            atomicLong = (AtomicLong) hashMap.get(r2);
        }
        return atomicLong;
    }

    public final synchronized AnonymousClass0LD A05(Class cls) {
        String name;
        HashMap hashMap;
        Object obj;
        try {
            name = cls.getName();
            hashMap = this.A0D;
            if (!hashMap.containsKey(name)) {
                if (cls == C03090Eh.class) {
                    Context context = this.A03;
                    String str = this.A0B;
                    obj = new C03090Eh(context, this.A05, this.A06, str, this.A0E);
                } else if (cls == AnonymousClass0EX.class) {
                    Context context2 = this.A03;
                    String str2 = this.A0B;
                    obj = new AnonymousClass0EX(context2, this.A05, this.A06, str2, this.A0E);
                } else if (cls == C03020Ea.class) {
                    Context context3 = this.A03;
                    String str3 = this.A0B;
                    obj = new C03020Ea(context3, this.A05, this.A06, str3, this.A0E);
                } else {
                    obj = (AnonymousClass0LD) cls.newInstance();
                }
                hashMap.put(name, obj);
            }
        } catch (Exception e) {
            throw new RuntimeException("Incorrect stat category used:", e);
        }
        return (AnonymousClass0LD) hashMap.get(name);
    }

    public static C03080Eg A00(AnonymousClass0Lp r7) {
        Map<String, ?> all;
        String str;
        String str2;
        String upperCase;
        String upperCase2;
        String str3;
        String upperCase3;
        String str4;
        C03080Eg r2 = (C03080Eg) r7.A05(C03080Eg.class);
        r2.A02(C12910mh.ServiceName, r7.A0B);
        r2.A02(C12910mh.ClientCoreName, r7.A0G);
        r2.A02(C12910mh.NotificationStoreName, r7.A0I);
        Context context = r7.A03;
        SharedPreferences A002 = C05340Su.A00(context, AnonymousClass006.A01);
        r2.A02(C12910mh.YearClass, String.valueOf(A002.getInt("year_class", 0)));
        C12790mU A003 = r7.A04.A00(AnonymousClass006.A02);
        C12910mh r1 = C12910mh.MqttGKs;
        synchronized (A003) {
            all = A003.A00.getAll();
        }
        r2.A02(r1, A03(all));
        r2.A02(C12910mh.MqttFlags, A03(C05340Su.A00(context, AnonymousClass006.A0Y).getAll()));
        AnonymousClass0PW r0 = r7.A07;
        if (r0 != null) {
            C12910mh r12 = C12910mh.AppState;
            if (((Boolean) r0.get()).booleanValue()) {
                str4 = "fg";
            } else {
                str4 = "bg";
            }
            r2.A02(r12, str4);
        }
        C12910mh r13 = C12910mh.ScreenState;
        if (r7.A0A.A00()) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        r2.A02(r13, str);
        C09740gb A004 = r7.A08.A00(TelephonyManager.class, "phone");
        C12910mh r14 = C12910mh.Country;
        if (A004.A01()) {
            str2 = ((TelephonyManager) A004.A00()).getNetworkCountryIso();
            if (str2 == null) {
                upperCase = null;
            }
            upperCase = str2.toUpperCase();
        } else {
            str2 = "";
            upperCase = str2.toUpperCase();
        }
        r2.A02(r14, upperCase);
        C12910mh r3 = C12910mh.NetworkType;
        AnonymousClass068 r15 = r7.A09;
        String A005 = C07630bp.A00(r15.A03().A02);
        if (A005 == null) {
            upperCase2 = null;
        } else {
            upperCase2 = A005.toUpperCase();
        }
        r2.A02(r3, upperCase2);
        C12910mh r32 = C12910mh.NetworkSubtype;
        NetworkInfo A022 = r15.A02();
        if (A022 == null || TextUtils.isEmpty(A022.getSubtypeName())) {
            str3 = NetInfoModule.CONNECTION_TYPE_NONE;
            upperCase3 = str3.toUpperCase();
        } else {
            str3 = A022.getSubtypeName();
            if (str3 == null) {
                upperCase3 = null;
            }
            upperCase3 = str3.toUpperCase();
        }
        r2.A02(r32, upperCase3);
        r2.A02(C12910mh.IsEmployee, Boolean.valueOf(A002.getBoolean("is_employee", false)));
        r2.A02(C12910mh.ValidCompatibleApps, r7.A0K);
        r2.A02(C12910mh.EnabledCompatibleApps, r7.A0H);
        r2.A02(C12910mh.RegisteredApps, r7.A0J);
        return r2;
    }

    public static C03040Ec A01(AnonymousClass0Lp r9, long j) {
        C03040Ec r4 = (C03040Ec) r9.A05(C03040Ec.class);
        ((AtomicLong) r4.A00(C12940mk.MqttDurationMs)).set(j);
        AtomicLong atomicLong = (AtomicLong) r4.A00(C12940mk.NetworkDurationMs);
        AnonymousClass068 r8 = r9.A09;
        AtomicLong atomicLong2 = r8.A06;
        long j2 = atomicLong2.get();
        long j3 = 0;
        if (j2 != 0) {
            j3 = SystemClock.elapsedRealtime() - j2;
        }
        atomicLong.set(j3);
        AtomicLong atomicLong3 = (AtomicLong) r4.A00(C12940mk.NetworkTotalDurationMs);
        long j4 = r8.A05.get();
        long j5 = atomicLong2.get();
        long j6 = 0;
        if (j5 != 0) {
            j6 = SystemClock.elapsedRealtime() - j5;
        }
        atomicLong3.set(j4 + j6);
        ((AtomicLong) r4.A00(C12940mk.ServiceDurationMs)).set(SystemClock.elapsedRealtime() - A04(C03950Lq.A01, r9).get());
        return r4;
    }

    public static String A03(Map map) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append(";");
            }
            sb.append((String) entry.getKey());
            sb.append("|");
            sb.append(String.valueOf(entry.getValue()));
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r11 != false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.lang.String r13, java.lang.String r14, java.lang.String r15, boolean r16) {
        /*
            r12 = this;
            X.0PW r0 = r12.A07
            if (r0 != 0) goto L_0x00d5
            r11 = 0
        L_0x0005:
            X.0tB r4 = X.C16480tB.A04
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r0 = r4.A01
            long r5 = r5 - r0
            r1 = 17000(0x4268, double:8.399E-320)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r2 = 0
            if (r0 <= 0) goto L_0x0016
            r2 = 1
        L_0x0016:
            java.lang.String r1 = r4.A03
            if (r1 == 0) goto L_0x0024
            if (r16 != 0) goto L_0x00c5
            java.lang.String r0 = "PINGREQ"
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x00cd
        L_0x0024:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r11 == 0) goto L_0x00be
            r1.append(r13)
            java.lang.String r0 = "_FG"
        L_0x0030:
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            java.lang.String r9 = "fg"
            java.lang.String r8 = "bg"
            java.lang.String r7 = "tc"
            r5 = 1
            if (r2 == 0) goto L_0x0095
            java.lang.String r10 = "rw"
            if (r11 == 0) goto L_0x0086
            java.lang.Class<X.0EX> r0 = X.AnonymousClass0EX.class
            X.0LD r3 = r12.A05(r0)
            X.0mf r3 = (X.C12890mf) r3
            java.lang.String[] r2 = new java.lang.String[]{r7, r9, r10, r15}
            r0 = 1
        L_0x0052:
            r3.A03(r0, r2)
            if (r11 == 0) goto L_0x00bc
        L_0x0057:
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "/"
            boolean r0 = r14.startsWith(r0)
            if (r0 == 0) goto L_0x0084
            java.lang.String r6 = r14.substring(r5)
        L_0x0069:
            java.lang.Class<X.0Ea> r0 = X.C03020Ea.class
            X.0LD r3 = r12.A05(r0)
            X.0mf r3 = (X.C12890mf) r3
            java.lang.String[] r2 = new java.lang.String[]{r6, r9}
            r0 = 1
            r3.A03(r0, r2)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.A01 = r0
            java.lang.System.currentTimeMillis()
            return
        L_0x0084:
            r6 = r14
            goto L_0x0069
        L_0x0086:
            r0 = 1
            java.lang.Class<X.0EX> r2 = X.AnonymousClass0EX.class
            X.0LD r3 = r12.A05(r2)
            X.0mf r3 = (X.C12890mf) r3
            java.lang.String[] r2 = new java.lang.String[]{r7, r8, r10, r15}
            goto L_0x0052
        L_0x0095:
            java.lang.String r10 = "nw"
            if (r11 == 0) goto L_0x00ab
            java.lang.Class<X.0EX> r0 = X.AnonymousClass0EX.class
            X.0LD r3 = r12.A05(r0)
            X.0mf r3 = (X.C12890mf) r3
            java.lang.String[] r2 = new java.lang.String[]{r7, r9, r10, r15}
            r0 = 1
            r3.A03(r0, r2)
            goto L_0x0057
        L_0x00ab:
            r1 = 1
            java.lang.Class<X.0EX> r0 = X.AnonymousClass0EX.class
            X.0LD r3 = r12.A05(r0)
            X.0mf r3 = (X.C12890mf) r3
            java.lang.String[] r0 = new java.lang.String[]{r7, r8, r10, r15}
            r3.A03(r1, r0)
        L_0x00bc:
            r9 = r8
            goto L_0x0057
        L_0x00be:
            r1.append(r13)
            java.lang.String r0 = "_BG"
            goto L_0x0030
        L_0x00c5:
            java.lang.String r0 = "PINGRESP"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0024
        L_0x00cd:
            java.lang.String r0 = "_"
            java.lang.String r13 = X.AnonymousClass00U.A0V(r13, r0, r1)
            goto L_0x0024
        L_0x00d5:
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r11 = r0.booleanValue()
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Lp.A06(java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public AnonymousClass0Lp(Context context, C12800mV r3, RealtimeSinceBootClock realtimeSinceBootClock, C12830mZ r5, AnonymousClass0PW r6, AnonymousClass0OX r7, AnonymousClass068 r8, C004201y r9, String str, boolean z) {
        C11070jQ r0 = C11070jQ.A01;
        if (r0 == null) {
            r0 = new C11070jQ();
            C11070jQ.A01 = r0;
        }
        this.A01 = r0;
        this.A0G = "";
        this.A0I = "";
        this.A0K = "";
        this.A0H = "";
        this.A0J = "";
        this.A03 = context;
        this.A08 = r7;
        this.A0B = str;
        this.A09 = r8;
        this.A0A = r9;
        this.A00 = new AnonymousClass0LW(context, realtimeSinceBootClock);
        this.A06 = r5;
        this.A05 = realtimeSinceBootClock;
        this.A07 = r6;
        this.A0C = new HashMap();
        this.A0D = new HashMap();
        this.A0E = z;
        this.A04 = r3;
    }

    public static String A02(List list) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            Map map = ((C12530m4) C17250ua.A00).A06;
            if (map.containsKey(next)) {
                listIterator.set(String.valueOf(map.get(next)));
            } else {
                AnonymousClass0LU.A0O("MqttHealthStatsHelper", "appPkgName %s not found in encoding map", next);
            }
        }
        return TextUtils.join(";", list);
    }
}
