package com.facebook.rti.push.service;

import X.AnonymousClass006;
import X.AnonymousClass00U;
import X.AnonymousClass0LU;
import X.AnonymousClass0Lp;
import X.AnonymousClass0P7;
import X.AnonymousClass0YN;
import X.AnonymousClass0g1;
import X.AnonymousClass0s5;
import X.AnonymousClass0v1;
import X.C03040Ec;
import X.C04260Mw;
import X.C09740gb;
import X.C12530m4;
import X.C12610mC;
import X.C12650mG;
import X.C12710mM;
import X.C12730mO;
import X.C12790mU;
import X.C12800mV;
import X.C12880me;
import X.C12940mk;
import X.C13660o5;
import X.C13680o7;
import X.C14380pJ;
import X.C14650pt;
import X.C14810qC;
import X.C15380rE;
import X.C15820rw;
import X.C15960sF;
import X.C15970sG;
import X.C16230sh;
import X.C16460t7;
import X.C16560tJ;
import X.C16580tL;
import X.C16600tN;
import X.C16620tR;
import X.C16630tS;
import X.C16640tT;
import X.C16670tX;
import X.C16680tY;
import X.C16690tZ;
import X.C16700ta;
import X.C16810tm;
import X.C17250ua;
import X.C17260ub;
import X.C17450uv;
import X.C17490uz;
import X.C18080w5;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.push.fbns.ipc.IFbnsAIDLService;
import com.facebook.redex.IDxBReceiverShape6S0100000_I2;
import com.facebook.rti.mqtt.manager.MqttPushServiceDelegate;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

public class FbnsServiceDelegate extends MqttPushServiceDelegate {
    public static FbnsServiceDelegate A0B;
    public static final List A0C = new C16690tZ();
    public static final List A0D = new C16680tY();
    public static final Map A0E;
    public IFbnsAIDLService.Stub A00;
    public C12710mM A01;
    public C16810tm A02;
    public C15960sF A03;
    public C15970sG A04;
    public C16700ta A05;
    public C16670tX A06;
    public C16640tT A07;
    public C16620tR A08;
    public C16600tN A09;
    public String A0A;

    public final String A0L() {
        return "FBNS_ALWAYS";
    }

    public final void A0P() {
        List<C16630tS> A032 = this.A08.A03();
        this.A08.A04();
        A01(this, "credentials_updated", "", "", (String) null, Collections.singletonMap("package_size", String.valueOf(A032.size())));
        Integer num = null;
        C12800mV r0 = this.A0A.A03;
        Integer num2 = AnonymousClass006.A05;
        SharedPreferences sharedPreferences = r0.A00(num2).A00;
        if (sharedPreferences.contains("DELIVERY_RETRY_INTERVAL")) {
            num = Integer.valueOf(sharedPreferences.getInt("DELIVERY_RETRY_INTERVAL", 300));
        }
        A0X(new AnonymousClass0YN((Boolean) null, num), num2);
        for (C16630tS r3 : A032) {
            Intent intent = new Intent("com.facebook.rti.fbns.intent.REGISTER");
            intent.putExtra("pkg_name", r3.A02);
            intent.putExtra("appid", r3.A01);
            intent.setClassName(this.A01.getApplicationContext().getPackageName(), getClass().getName());
            A0c(intent);
        }
    }

    public final boolean A0b(Intent intent) {
        if (intent == null) {
            return true;
        }
        String A002 = C12710mM.A00(intent);
        if (this.A01.getApplicationContext().getPackageName().equals(A002)) {
            return true;
        }
        this.A09.A00("verify_sender_failed", A002);
        return false;
    }

    public final synchronized void A0g(ArrayList arrayList) {
        for (C16630tS r0 : this.A08.A03()) {
            arrayList.add(r0.A02);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        A0E = hashMap;
        hashMap.put("com.instagram.android", 30);
        hashMap.put("com.facebook.lite", 100);
        hashMap.put("com.oculus.horizon", 10);
    }

    public static void A01(FbnsServiceDelegate fbnsServiceDelegate, String str, String str2, String str3, String str4, Map map) {
        FbnsServiceDelegate fbnsServiceDelegate2 = fbnsServiceDelegate;
        String str5 = str2;
        String str6 = str;
        fbnsServiceDelegate2.A09.A01("registrations", new String[]{str6, str5}, 1);
        C16810tm r11 = fbnsServiceDelegate2.A02;
        long j = fbnsServiceDelegate2.A00;
        boolean A002 = fbnsServiceDelegate2.A07.A00();
        long j2 = fbnsServiceDelegate2.A07.A03.get();
        if (str2 == null) {
            str5 = "";
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - r11.A00;
        long j4 = elapsedRealtime - j;
        long j5 = elapsedRealtime - r11.A04.A06.get();
        long j6 = elapsedRealtime - j2;
        if (j2 < 0) {
            j6 = 0;
        }
        C16580tL r16 = new C16580tL(str6, r11.A05, Locale.getDefault().toString(), Build.MODEL, Build.MANUFACTURER);
        r16.A07 = str5;
        r16.A05 = str4;
        r16.A00 = elapsedRealtime;
        r16.A04 = j3;
        r16.A01 = j4;
        r16.A02 = j5;
        r16.A03 = j6;
        r16.A0A = A002;
        r16.A06 = str3;
        r16.A09 = r11.A01.getBoolean("is_employee", false);
        r16.A02(map);
        r16.toString();
        r11.A02.reportEvent(r16);
    }

    public static void A02(FbnsServiceDelegate fbnsServiceDelegate, String str, String str2, String str3, String str4, Map map, long j) {
        FbnsServiceDelegate fbnsServiceDelegate2 = fbnsServiceDelegate;
        String str5 = str;
        String str6 = str3;
        fbnsServiceDelegate2.A09.A01("notifications", new String[]{str5, str6}, 1);
        C16810tm r12 = fbnsServiceDelegate2.A02;
        long j2 = fbnsServiceDelegate2.A00;
        boolean A002 = fbnsServiceDelegate2.A07.A00();
        long j3 = fbnsServiceDelegate2.A07.A03.get();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = elapsedRealtime - r12.A00;
        long j5 = elapsedRealtime - j2;
        long j6 = elapsedRealtime - r12.A04.A06.get();
        long j7 = elapsedRealtime - j3;
        if (j3 < 0) {
            j7 = 0;
        }
        C16560tJ r16 = new C16560tJ(str5, r12.A05, Locale.getDefault().toString(), Build.MODEL, Build.MANUFACTURER);
        r16.A07 = str6;
        r16.A09 = str2;
        r16.A01 = elapsedRealtime;
        r16.A05 = j4;
        r16.A02 = j5;
        r16.A03 = j6;
        r16.A04 = j7;
        r16.A0B = A002;
        r16.A06 = str4;
        r16.A00 = j;
        r16.A0A = r12.A01.getBoolean("is_employee", false);
        r16.A02(map);
        r16.toString();
        r12.A02.reportEvent(r16);
    }

    private void A03(String str, String str2) {
        this.A05.A00(str);
        Intent intent = new Intent("com.facebook.rti.fbns.intent.RECEIVE");
        intent.setPackage(str);
        intent.addCategory(str);
        intent.putExtra("receive_type", "registered");
        if (str2 != null) {
            intent.putExtra("data", str2);
        }
        A0d(intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r0.A00() == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04(java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            r15 = this;
            X.0tN r4 = r15.A09
            r5 = r16
            r6 = r17
            if (r4 == 0) goto L_0x001d
            X.0w5 r0 = r15.A01
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r0 = r0.getPackageName()
            java.lang.String[] r3 = new java.lang.String[]{r5, r0, r6}
            java.lang.String r2 = "services"
            r0 = 1
            r4.A01(r2, r3, r0)
        L_0x001d:
            X.0tm r4 = r15.A02
            if (r4 == 0) goto L_0x0045
            java.util.concurrent.atomic.AtomicBoolean r0 = r15.A0B
            boolean r13 = r0.get()
            long r9 = r15.A00
            X.01y r0 = r15.A07
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.A00()
            r14 = 1
            if (r0 != 0) goto L_0x0035
        L_0x0034:
            r14 = 0
        L_0x0035:
            X.01y r0 = r15.A07
            if (r0 == 0) goto L_0x0046
            java.util.concurrent.atomic.AtomicLong r0 = r0.A03
            long r11 = r0.get()
        L_0x003f:
            r8 = 0
            r7 = r18
            r4.A01(r5, r6, r7, r8, r9, r11, r13, r14)
        L_0x0045:
            return
        L_0x0046:
            r11 = 0
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.push.service.FbnsServiceDelegate.A04(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final IBinder A0B(Intent intent) {
        Intent intent2 = intent;
        intent2.toString();
        A04("bind", intent2.getAction(), intent2.getStringExtra("caller"));
        C12650mG r1 = new C12650mG(intent2, this.A01, "fbns_aidl_auth_domain");
        String A002 = C12710mM.A00(intent2);
        if (!r1.BZk()) {
            AnonymousClass0LU.A0N("FbnsServiceDelegate", "onBind invalid signature: %s", intent2.toString());
            HashMap hashMap = new HashMap();
            hashMap.put("cntr", this.A01.getApplicationContext().getPackageName());
            hashMap.put("clr", A002);
            C12710mM r12 = this.A01;
            int i = 0;
            if (A002 != null) {
                try {
                    PackageManager packageManager = r12.A00.getPackageManager();
                    if (packageManager != null) {
                        i = Integer.parseInt(packageManager.getPackageInfo(A002, 0).versionName.split("\\.", 2)[0]);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    AnonymousClass0LU.A0E("FbnsSecurityContextHelper", "requested package not found on the device", e);
                } catch (NumberFormatException e2) {
                    AnonymousClass0LU.A0K("FbnsSecurityContextHelper", "Failed to parse major version for package: %s", e2, A002);
                }
            }
            hashMap.put("ver", String.valueOf(i));
            C16810tm r9 = this.A02;
            boolean z = this.A0B.get();
            r9.A01("bind", "TRUSTED_APP_AUTH_INVALID", intent2.getAction(), hashMap, this.A00, this.A07.A03.get(), z, this.A07.A00());
            this.A09.A01("fbns_ipc_auth", new String[]{"unauthorized", ClientCookie.SECURE_ATTR, A002, intent2.getAction()}, 1);
            return null;
        }
        this.A09.A01("fbns_ipc_auth", new String[]{"authorised", ClientCookie.SECURE_ATTR, A002, intent2.getAction()}, 1);
        return this.A00;
    }

    public final void A0J(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        try {
            printWriter.println(AnonymousClass00U.A0V("[ ", "FbnsServiceDelegate", " ]"));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            AnonymousClass0s5.A01(this.A01.getApplicationContext(), arrayList, arrayList2);
            ArrayList arrayList3 = new ArrayList();
            A0g(arrayList3);
            StringBuilder sb = new StringBuilder();
            sb.append("validCompatibleApps=");
            sb.append(arrayList);
            printWriter.println(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("enabledCompatibleApps=");
            sb2.append(arrayList2);
            printWriter.println(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("registeredApps=");
            sb3.append(arrayList3);
            printWriter.println(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("notificationCounter=");
            sb4.append(this.A05.A02);
            printWriter.println(sb4.toString());
        } catch (Exception unused) {
        }
        super.A0J(fileDescriptor, printWriter, strArr);
    }

    public final void A0Q() {
        C15970sG r1 = this.A04;
        if (r1.A00 == null) {
            IDxBReceiverShape6S0100000_I2 iDxBReceiverShape6S0100000_I2 = new IDxBReceiverShape6S0100000_I2(r1, 10);
            r1.A00 = iDxBReceiverShape6S0100000_I2;
            AnonymousClass0P7.A00.A04(iDxBReceiverShape6S0100000_I2, r1.A02, new IntentFilter("com.facebook.rti.intent.ACTION_NOTIFICATION_ACK"), (Handler) null);
        }
    }

    public final void A0R() {
        C15970sG r3 = this.A04;
        BroadcastReceiver broadcastReceiver = r3.A00;
        if (broadcastReceiver != null) {
            AnonymousClass0P7.A00.A03(broadcastReceiver, r3.A02);
            r3.A00 = null;
        }
    }

    public final void A0U(int i) {
        this.A04.A01().A00.set(((long) i) * 1000);
    }

    public final void A0V(Intent intent, AnonymousClass0YN r18) {
        String str;
        String str2;
        String str3;
        StringBuilder sb;
        Intent intent2 = intent;
        String action = intent2.getAction();
        String stringExtra = intent2.getStringExtra("appid");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "";
        }
        if ("com.facebook.rti.fbns.intent.REGISTER".equals(action) || "com.facebook.rti.fbns.intent.REGISTER_RETRY".equals(action) || "com.facebook.rti.fbns.intent.UNREGISTER".equals(action)) {
            String stringExtra2 = intent2.getStringExtra("pkg_name");
            String A002 = C12710mM.A00(intent2);
            if ("com.facebook.rti.fbns.intent.UNREGISTER".equals(action)) {
                str2 = "unreg_fail";
            } else {
                str2 = "reg_fail";
            }
            if (TextUtils.isEmpty(stringExtra2)) {
                sb = new StringBuilder("Empty package name for ");
                sb.append(action);
                sb.append(" from ");
                sb.append(A002);
            } else {
                if ("com.facebook.rti.fbns.intent.REGISTER_RETRY".equals(action)) {
                    str3 = this.A01.getApplicationContext().getPackageName();
                } else {
                    str3 = stringExtra2;
                }
                if (!str3.equals(A002)) {
                    sb = new StringBuilder("Package mismatch for ");
                    sb.append(action);
                    sb.append(" from ");
                    sb.append(A002);
                    sb.append(": packageName ");
                    sb.append(str3);
                }
            }
            String obj = sb.toString();
            AnonymousClass0LU.A0C("FbnsServiceDelegate", obj);
            A01(this, str2, stringExtra2, stringExtra, obj, Collections.emptyMap());
            return;
        }
        String action2 = intent2.getAction();
        AnonymousClass0YN r3 = r18;
        if ("com.facebook.rti.fbns.intent.REGISTER".equals(action2)) {
            A0X(r3, AnonymousClass006.A02);
            A0c(intent2);
        } else if ("com.facebook.rti.fbns.intent.REGISTER_RETRY".equals(action2)) {
            A0X(r3, AnonymousClass006.A03);
            A0f(intent2.getStringExtra("pkg_name"), intent2.getStringExtra("appid"));
        } else if ("com.facebook.rti.fbns.intent.UNREGISTER".equals(action2)) {
            A0X(r3, AnonymousClass006.A04);
            String stringExtra3 = intent2.getStringExtra("pkg_name");
            this.A08.A02(stringExtra3);
            C16620tR r1 = this.A08;
            AnonymousClass0g1.A00(!TextUtils.isEmpty(stringExtra3));
            C12800mV r0 = r1.A00;
            Integer num = AnonymousClass006.A1C;
            C16630tS A003 = C16620tR.A00(r0.A00(num), stringExtra3);
            if (A003 == null) {
                str = null;
            } else {
                str = A003.A01;
            }
            C16620tR r12 = this.A08;
            AnonymousClass0g1.A00(!TextUtils.isEmpty(stringExtra3));
            C12790mU A004 = r12.A00.A00(num);
            C16630tS A005 = C16620tR.A00(A004, stringExtra3);
            if (A005 != null && !A005.A04) {
                A005.A04 = true;
                C16620tR.A01(A004, A005, stringExtra3);
            }
            Intent intent3 = new Intent("com.facebook.rti.fbns.intent.RECEIVE");
            intent3.setPackage(stringExtra3);
            intent3.addCategory(stringExtra3);
            intent3.putExtra("receive_type", "unregistered");
            A0d(intent3);
            A01(this, "unreg_called", stringExtra3, str, (String) null, Collections.emptyMap());
        } else {
            AnonymousClass0LU.A0B("FbnsServiceDelegate", "service/doIntent/unrecognized_action");
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        AnonymousClass0s5.A01(this.A01.getApplicationContext(), arrayList, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        A0g(arrayList3);
        AnonymousClass0Lp r13 = this.A05;
        r13.A0K = AnonymousClass0Lp.A02(arrayList);
        r13.A0H = AnonymousClass0Lp.A02(arrayList2);
        r13.A0J = AnonymousClass0Lp.A02(arrayList3);
    }

    public final void A0X(AnonymousClass0YN r4, Integer num) {
        A04("start", C04260Mw.A00(num), r4.A03);
        super.A0X(r4, num);
    }

    public final void A0Y(AnonymousClass0v1 r14) {
        if (AnonymousClass0v1.FAILED_CONNECTION_REFUSED_BAD_USER_NAME_OR_PASSWORD.equals(r14)) {
            C12800mV r0 = this.A08.A00;
            Integer num = AnonymousClass006.A0N;
            if (System.currentTimeMillis() - r0.A00(num).A00.getLong("auto_reg_retry", 0) > 86400000) {
                SharedPreferences.Editor edit = this.A08.A00.A00(num).A00.edit();
                edit.putLong("auto_reg_retry", System.currentTimeMillis());
                edit.apply();
                List<C16630tS> A032 = this.A08.A03();
                this.A08.A04();
                A01(this, "authfail_auto_register", "", "", (String) null, Collections.singletonMap("package_size", String.valueOf(A032.size())));
                for (C16630tS r3 : A032) {
                    Intent intent = new Intent("com.facebook.rti.fbns.intent.REGISTER");
                    intent.putExtra("pkg_name", r3.A02);
                    intent.putExtra("appid", r3.A01);
                    intent.setClassName(this.A01.getApplicationContext().getPackageName(), getClass().getName());
                    A0c(intent);
                }
            }
        }
    }

    public final void A0Z(C17260ub r22) {
        C15970sG r7 = this.A04;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C14380pJ A012 = r7.A01();
        synchronized (A012) {
            arrayList.clear();
            arrayList2.clear();
            SharedPreferences sharedPreferences = A012.A01;
            Map<String, ?> all = sharedPreferences.getAll();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (System.currentTimeMillis() >= sharedPreferences.getLong("key_next_min_retry_ts", 0)) {
                boolean z = false;
                Long l = null;
                for (Map.Entry next : all.entrySet()) {
                    if (!((String) next.getKey()).equals("key_next_min_retry_ts")) {
                        C13680o7 A002 = C13680o7.A00(next.getValue());
                        if (A002 != null) {
                            long j = A002.A01;
                            if (j + 86400000 < System.currentTimeMillis() || j > System.currentTimeMillis()) {
                                arrayList2.add(A002);
                            } else {
                                long j2 = A002.A00;
                                AtomicLong atomicLong = A012.A00;
                                long j3 = j2 + atomicLong.get();
                                if (j3 <= System.currentTimeMillis()) {
                                    String str = A002.A07;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    A002.A00 = currentTimeMillis;
                                    j3 = currentTimeMillis + atomicLong.get();
                                    arrayList.add(A002);
                                    edit.putString(str, A002.A01());
                                    z = true;
                                }
                                if (l == null) {
                                    l = Long.valueOf(j3);
                                } else {
                                    l = Long.valueOf(Math.min(l.longValue(), j3));
                                }
                            }
                        }
                        z = true;
                    }
                }
                if (l != null) {
                    edit.putLong("key_next_min_retry_ts", l.longValue());
                } else if (z) {
                }
                edit.apply();
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C13680o7 r2 = (C13680o7) it.next();
            if (r2 != null) {
                String str2 = r2.A07;
                Intent intent = r2.A02;
                if (intent != null) {
                    r7.A02(new C14810qC(C12730mO.A00, AnonymousClass006.A01), str2, intent.getPackage());
                }
            }
        }
        int i = 0;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C13680o7 r23 = (C13680o7) it2.next();
            String str3 = r23.A07;
            Intent intent2 = r23.A02;
            C09740gb r9 = r23.A03;
            String str4 = r23.A08;
            FbnsServiceDelegate fbnsServiceDelegate = r7.A05;
            String str5 = intent2.getPackage();
            fbnsServiceDelegate.A03.Bb6(AnonymousClass00U.A0d("Redeliver Notif: notifId = ", str3, "; target = ", str5));
            HashMap hashMap = new HashMap();
            if (r9.A01()) {
                hashMap.put("l", String.valueOf(r9.A00()));
            }
            hashMap.put("src", str4);
            A02(fbnsServiceDelegate, "redeliver", str3, str5, (String) null, hashMap, 0);
            C14810qC A003 = C15970sG.A00(intent2, r9, r7, str4);
            Integer num = A003.A01;
            if (C14650pt.A00(num)) {
                r7.A02(A003, str3, intent2.getPackage());
            } else if (!C14650pt.A01(num)) {
                intent2.getPackage();
            }
            if (C14650pt.A01(num)) {
                i++;
            }
        }
        ((AtomicLong) ((C12880me) this.A05.A05(C03040Ec.class)).A00(C12940mk.FbnsLiteNotificationDeliveryRetried)).addAndGet((long) i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0133, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0136;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0c(android.content.Intent r14) {
        /*
            r13 = this;
            java.lang.String r0 = "pkg_name"
            java.lang.String r9 = r14.getStringExtra(r0)
            java.lang.String r0 = "appid"
            java.lang.String r10 = r14.getStringExtra(r0)
            java.lang.String r0 = "local_generation"
            r2 = 0
            boolean r3 = r14.getBooleanExtra(r0, r2)
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            r7 = r13
            X.0ta r0 = r13.A05
            r0.A00(r9)
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.A0B
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0034
            java.lang.String r1 = "FbnsServiceDelegate"
            java.lang.String r0 = "service/register/not_started"
            X.AnonymousClass0LU.A0B(r1, r0)
            java.lang.String r8 = "reg_fail"
            java.lang.String r11 = "service not started"
            A01(r7, r8, r9, r10, r11, r12)
        L_0x0034:
            r11 = 0
            java.lang.String r8 = "reg_called"
            A01(r7, r8, r9, r10, r11, r12)
            X.0tR r0 = r13.A08
            java.lang.String r1 = r0.A02(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x004f
            r13.A03(r9, r1)
            java.lang.String r8 = "cache_hit"
            A01(r7, r8, r9, r10, r11, r12)
            return
        L_0x004f:
            if (r3 == 0) goto L_0x0142
            X.0w5 r0 = r13.A01
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r0 = r0.getPackageName()
            boolean r0 = X.AnonymousClass0s5.A02(r0)
            if (r0 == 0) goto L_0x0142
            java.lang.Object r0 = X.C17250ua.A00
            X.0m4 r0 = (X.C12530m4) r0
            java.util.Set r0 = r0.A08
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0135
            X.00d r0 = r13.A09
            X.0li r0 = r0.A0I
            X.0lk r0 = r0.Aqs()
            java.lang.Object r5 = r0.first
            java.lang.String r5 = (java.lang.String) r5
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0135
            java.lang.String r0 = r13.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0135
            java.lang.String r6 = r13.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x00f0
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x00f0
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x00f0
            java.lang.String r0 = "{"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            java.lang.String r0 = "\"pn\":"
            r4.append(r0)
            java.lang.String r3 = "\""
            java.lang.String r0 = X.AnonymousClass00U.A0V(r3, r9, r3)
            r4.append(r0)
            java.lang.String r1 = ","
            r4.append(r1)
            java.lang.String r0 = "\"di\":"
            r4.append(r0)
            java.lang.String r0 = X.AnonymousClass00U.A0V(r3, r6, r3)
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = "\"ai\":"
            r4.append(r0)
            java.lang.String r0 = "567310203415052"
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = "\"ck\":"
            r4.append(r0)
            java.lang.String r0 = X.AnonymousClass00U.A0V(r3, r5, r3)
            r4.append(r0)
            java.lang.String r0 = "}"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            byte[] r1 = r0.getBytes()     // Catch:{ AssertionError -> 0x00f0 }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ AssertionError -> 0x00f0 }
            goto L_0x00f1
        L_0x00f0:
            r0 = r11
        L_0x00f1:
            java.lang.String r5 = "fbns-b64"
            if (r0 == 0) goto L_0x0140
            java.lang.String r1 = "{"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r1 = "\"k\":"
            r4.append(r1)
            java.lang.String r3 = "\""
            java.lang.String r0 = X.AnonymousClass00U.A0V(r3, r0, r3)
            r4.append(r0)
            java.lang.String r1 = ","
            r4.append(r1)
            java.lang.String r0 = "\"v\":"
            r4.append(r0)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r0 = "\"t\":"
            r4.append(r0)
            java.lang.String r0 = X.AnonymousClass00U.A0V(r3, r5, r3)
            r4.append(r0)
            java.lang.String r0 = "}"
            r4.append(r0)
            java.lang.String r1 = r4.toString()
        L_0x012f:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0136
        L_0x0135:
            r1 = r11
        L_0x0136:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0142
            r13.A03(r9, r1)
            return
        L_0x0140:
            r1 = 0
            goto L_0x012f
        L_0x0142:
            r13.A0f(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.push.service.FbnsServiceDelegate.A0c(android.content.Intent):void");
    }

    public final void A0f(String str, String str2) {
        String str3;
        String str4;
        HashMap hashMap = new HashMap();
        String str5 = str;
        String str6 = str2;
        if (TextUtils.isEmpty(str5) || TextUtils.isEmpty(str6)) {
            str4 = "reg_fail";
            str3 = "invalid input";
        } else {
            C16700ta r6 = this.A05;
            Intent intent = new Intent("com.facebook.rti.fbns.intent.REGISTER_RETRY");
            intent.putExtra("pkg_name", str5);
            intent.putExtra("appid", str6);
            r6.A02.A02(intent);
            C16230sh r1 = new C16230sh();
            Context context = r6.A01;
            r1.A06(intent, context.getClassLoader());
            r1.A05();
            r1.A08 = r6.A07;
            PendingIntent A032 = r1.A03(context, 0, 134217728);
            r6.A05.put(str5, A032);
            SharedPreferences sharedPreferences = r6.A03.A00;
            long j = sharedPreferences.getLong(str5, 120000);
            r6.A04.A02(r6.A00, A032, context, 2, SystemClock.elapsedRealtime() + j);
            long j2 = j * 2;
            if (j2 > 86400000) {
                j2 = 86400000;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong(str5, j2);
            edit.apply();
            C16620tR r62 = this.A08;
            AnonymousClass0g1.A00(!TextUtils.isEmpty(str5));
            AnonymousClass0g1.A00(!TextUtils.isEmpty(str6));
            C16630tS r2 = new C16630tS();
            r2.A02 = str5;
            r2.A01 = str6;
            r2.A00 = Long.valueOf(System.currentTimeMillis());
            C16620tR.A01(r62.A00.A00(AnonymousClass006.A1C), r2, str5);
            Context applicationContext = this.A01.getApplicationContext();
            if (applicationContext == null || !applicationContext.getSharedPreferences("rti.mqtt.oxygen_fbns_config", 0).getBoolean("fbns_secure_auth", false)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putOpt("pkg_name", str5);
                    jSONObject.putOpt("appid", str6);
                    String obj = jSONObject.toString();
                    C16460t7 r5 = new C16460t7(this, str5, str6, hashMap);
                    try {
                        if (this.A09.A04(r5, AnonymousClass006.A01, "/fbns_reg_req", obj.getBytes("UTF-8")) == -1) {
                            str4 = "reg_fail";
                            str3 = "mqtt not connected";
                        } else {
                            return;
                        }
                    } catch (UnsupportedEncodingException unused) {
                        throw new RuntimeException("UTF-8 not supported");
                    } catch (C17450uv unused2) {
                    }
                } catch (JSONException e) {
                    AnonymousClass0LU.A0F("FbnsServiceDelegate", "service/register/serialize_exception", e);
                    A01(this, "reg_fail", str5, str6, "serialization exception: unknown client", hashMap);
                    return;
                }
            } else {
                this.A0A.A0T.BHG();
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
        }
        A01(this, str4, str5, str6, str3, hashMap);
    }

    public static String A00(String str) {
        if (AnonymousClass0s5.A02(str)) {
            return ((C12530m4) C17250ua.A00).A03;
        }
        return FbnsService.class.getName();
    }

    public final void A0C() {
        super.A0C();
    }

    public final void A0D(Intent intent) {
        A04("rebind", intent.getAction(), intent.getStringExtra("caller"));
        super.A0D(intent);
    }

    public final boolean A0E(Intent intent) {
        A04("unbind", intent.getAction(), intent.getStringExtra("caller"));
        return this.A01.A07(intent);
    }

    public final void A0H() {
        super.A0H();
        if (A0B == this) {
            A0B = null;
        }
    }

    public final AnonymousClass0YN A0K(Intent intent, int i, int i2) {
        return super.A0K(intent, i, i2);
    }

    public final Future A0M(C17490uz r4) {
        A04("stop", r4.toString(), (String) null);
        return super.A0M(r4);
    }

    public final void A0N() {
        super.A0N();
        AnonymousClass0Lp r1 = this.A05;
        this.A04.A01();
        r1.A0I = "S";
    }

    public final void A0O() {
        super.A0O();
        C15820rw r0 = (C15820rw) this.A0A;
        C16620tR r8 = r0.A03;
        C16810tm r7 = r0.A01;
        C16700ta r6 = r0.A02;
        C12710mM r5 = r0.A00;
        C15970sG r4 = new C15970sG(r5, r0.A05, this);
        FbnsAIDLService fbnsAIDLService = new FbnsAIDLService(this.A01.getApplicationContext(), new C15380rE(this), this.A03);
        this.A08 = r8;
        this.A02 = r7;
        this.A05 = r6;
        this.A06 = new C16670tX();
        this.A01 = r5;
        this.A04 = r4;
        this.A00 = fbnsAIDLService;
    }

    public final void A0d(Intent intent) {
        String str;
        String str2 = intent.getPackage();
        if (!TextUtils.isEmpty(str2)) {
            C12710mM r2 = this.A01;
            C13660o5 A012 = ((C12530m4) C17250ua.A00).A01(intent, r2);
            if (str2.equals(this.A01.getApplicationContext().getPackageName()) || A012.BZj()) {
                r2.A02(intent);
                C12610mC.A00(intent, r2, str2);
                return;
            }
            C16620tR r1 = this.A08;
            AnonymousClass0g1.A00(!TextUtils.isEmpty(str2));
            C16630tS A002 = C16620tR.A00(r1.A00.A00(AnonymousClass006.A1C), str2);
            if (A002 == null) {
                str = null;
            } else {
                str = A002.A01;
            }
            A01(this, "invalid_receiver", str2, str, (String) null, Collections.emptyMap());
            AnonymousClass0LU.A0C("FbnsServiceDelegate", "service/sendFBNSBroadcast/invalid_receiver");
        }
    }

    public final void A0e(C09740gb r11, String str, String str2, String str3, String str4, String str5) {
        if (!TextUtils.isEmpty(str4)) {
            this.A03.Bb6(str4);
        }
        HashMap hashMap = new HashMap();
        if (r11.A01()) {
            hashMap.put("l", String.valueOf(r11.A00()));
        }
        hashMap.put("src", str5);
        A02(this, RealtimeConstants.SEND_FAIL, str3, str, str2, hashMap, 0);
    }

    public FbnsServiceDelegate(C18080w5 r1) {
        super(r1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: X.0mO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: X.0mR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v50, resolved type: X.0pT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v51, resolved type: java.lang.IllegalStateException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v105, resolved type: X.0mR} */
    /* JADX WARNING: type inference failed for: r20v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03e6 A[Catch:{ UnsupportedEncodingException -> 0x0517, JSONException -> 0x051f }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04f7 A[Catch:{ UnsupportedEncodingException -> 0x0517, JSONException -> 0x051f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0W(X.AnonymousClass0P6 r37, java.lang.Long r38, java.lang.String r39, byte[] r40, int r41, long r42) {
        /*
            r36 = this;
            r8 = 0
            r15 = 1
            r7 = r39
            r2 = r40
            if (r40 != 0) goto L_0x0014
            java.lang.String r2 = "FbnsServiceDelegate"
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "receive/publish/empty_payload; topic=%s"
            X.AnonymousClass0LU.A0N(r2, r0, r1)
        L_0x0013:
            return
        L_0x0014:
            java.lang.String r6 = "FbnsServiceDelegate"
            r19 = 0
            r0 = r36
            java.lang.String r1 = "UTF-8"
            java.lang.String r4 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0517 }
            r4.<init>(r2, r1)     // Catch:{ UnsupportedEncodingException -> 0x0517 }
            r19 = r4
            java.lang.String r1 = "/fbns_msg"
            boolean r1 = r1.equals(r7)     // Catch:{ JSONException -> 0x051f }
            if (r1 != 0) goto L_0x016b
            java.lang.String r1 = "/fbns_msg_hp"
            boolean r1 = r1.equals(r7)     // Catch:{ JSONException -> 0x051f }
            if (r1 != 0) goto L_0x016b
            java.lang.String r1 = "/fbns_reg_resp"
            boolean r1 = r1.equals(r7)     // Catch:{ JSONException -> 0x051f }
            if (r1 == 0) goto L_0x00dd
            r12 = 0
            java.lang.String r8 = ""
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x051f }
            r2.<init>(r4)     // Catch:{ JSONException -> 0x051f }
            java.lang.String r1 = "pkg_name"
            java.lang.String r4 = r2.optString(r1)     // Catch:{ JSONException -> 0x051f }
            java.lang.String r1 = "token"
            java.lang.String r9 = r2.optString(r1)     // Catch:{ JSONException -> 0x051f }
            java.lang.String r1 = "error"
            java.lang.String r13 = r2.optString(r1)     // Catch:{ JSONException -> 0x051f }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ JSONException -> 0x051f }
            if (r1 == 0) goto L_0x0099
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x051f }
            java.lang.String r3 = "resp_fail"
            if (r1 == 0) goto L_0x007d
            java.lang.String r1 = "service/register/response/invalid"
            X.AnonymousClass0LU.A0B(r6, r1)     // Catch:{ JSONException -> 0x051f }
            X.0tN r2 = r0.A09     // Catch:{ JSONException -> 0x051f }
            java.lang.String r1 = "invalid_package_name"
            r2.A00(r3, r1)     // Catch:{ JSONException -> 0x051f }
            java.util.Map r14 = java.util.Collections.emptyMap()     // Catch:{ JSONException -> 0x051f }
            java.lang.String r13 = "server response with invalid package name"
            r9 = r0
            r10 = r3
            r11 = r8
        L_0x0078:
            A01(r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x051f }
            goto L_0x00fd
        L_0x007d:
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch:{ JSONException -> 0x051f }
            if (r1 == 0) goto L_0x00fe
            java.lang.String r1 = "service/register/response/empty_token"
            X.AnonymousClass0LU.A0B(r6, r1)     // Catch:{ JSONException -> 0x051f }
            X.0tN r2 = r0.A09     // Catch:{ JSONException -> 0x051f }
            java.lang.String r1 = "empty_token"
            r2.A00(r3, r1)     // Catch:{ JSONException -> 0x051f }
            java.util.Map r14 = java.util.Collections.emptyMap()     // Catch:{ JSONException -> 0x051f }
            java.lang.String r13 = "server response with invalid token"
            r9 = r0
            r10 = r3
            r11 = r4
            goto L_0x0078
        L_0x0099:
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x051f }
            if (r1 == 0) goto L_0x00af
            r9 = r6
            java.lang.String r1 = "service/register/response/empty_package"
        L_0x00a2:
            X.AnonymousClass0LU.A0B(r9, r1)     // Catch:{ JSONException -> 0x051f }
        L_0x00a5:
            java.util.Map r14 = java.util.Collections.emptyMap()     // Catch:{ JSONException -> 0x051f }
            java.lang.String r10 = "resp_fail"
            r9 = r0
            r11 = r4
            r12 = r8
            goto L_0x0078
        L_0x00af:
            X.0tR r2 = r0.A08     // Catch:{ JSONException -> 0x051f }
            java.lang.String r9 = "RegistrationState"
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x051f }
            r1 = r1 ^ 1
            X.AnonymousClass0g1.A00(r1)     // Catch:{ JSONException -> 0x051f }
            X.0mV r2 = r2.A00     // Catch:{ JSONException -> 0x051f }
            java.lang.Integer r1 = X.AnonymousClass006.A1C     // Catch:{ JSONException -> 0x051f }
            X.0mU r5 = r2.A00(r1)     // Catch:{ JSONException -> 0x051f }
            X.0tS r3 = X.C16620tR.A00(r5, r4)     // Catch:{ JSONException -> 0x051f }
            if (r3 != 0) goto L_0x00cd
            java.lang.String r1 = "Missing entry"
            goto L_0x00a2
        L_0x00cd:
            r3.A03 = r8     // Catch:{ JSONException -> 0x051f }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x051f }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ JSONException -> 0x051f }
            r3.A00 = r1     // Catch:{ JSONException -> 0x051f }
            X.C16620tR.A01(r5, r3, r4)     // Catch:{ JSONException -> 0x051f }
            goto L_0x00a5
        L_0x00dd:
            java.lang.String r1 = "/pp"
            boolean r1 = r1.equals(r7)     // Catch:{ JSONException -> 0x051f }
            if (r1 != 0) goto L_0x0013
            java.lang.String r2 = "receive/publish/wrong_topic; topic=%s"
            java.lang.Object[] r1 = new java.lang.Object[]{r7}     // Catch:{ JSONException -> 0x051f }
            X.AnonymousClass0LU.A0N(r6, r2, r1)     // Catch:{ JSONException -> 0x051f }
            X.0tN r3 = r0.A09     // Catch:{ JSONException -> 0x051f }
            java.lang.Integer r2 = X.AnonymousClass006.A01     // Catch:{ JSONException -> 0x051f }
            java.lang.String r1 = "UNEXPECTED_TOPIC"
            r3.A00(r1, r7)     // Catch:{ JSONException -> 0x051f }
            X.0tm r1 = r0.A02     // Catch:{ JSONException -> 0x051f }
            r1.A00(r2, r7)     // Catch:{ JSONException -> 0x051f }
            goto L_0x016a
        L_0x00fd:
            return
        L_0x00fe:
            X.0tR r2 = r0.A08     // Catch:{ JSONException -> 0x051f }
            java.lang.String r8 = "RegistrationState"
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x051f }
            r1 = r1 ^ 1
            X.AnonymousClass0g1.A00(r1)     // Catch:{ JSONException -> 0x051f }
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch:{ JSONException -> 0x051f }
            r1 = r1 ^ 1
            X.AnonymousClass0g1.A00(r1)     // Catch:{ JSONException -> 0x051f }
            X.0mV r3 = r2.A00     // Catch:{ JSONException -> 0x051f }
            java.lang.Integer r1 = X.AnonymousClass006.A0N     // Catch:{ JSONException -> 0x051f }
            X.0mU r1 = r3.A00(r1)     // Catch:{ JSONException -> 0x051f }
            android.content.SharedPreferences r1 = r1.A00     // Catch:{ JSONException -> 0x051f }
            android.content.SharedPreferences$Editor r2 = r1.edit()     // Catch:{ JSONException -> 0x051f }
            java.lang.String r1 = "auto_reg_retry"
            r2.remove(r1)     // Catch:{ JSONException -> 0x051f }
            r2.apply()     // Catch:{ JSONException -> 0x051f }
            java.lang.Integer r1 = X.AnonymousClass006.A1C     // Catch:{ JSONException -> 0x051f }
            X.0mU r5 = r3.A00(r1)     // Catch:{ JSONException -> 0x051f }
            X.0tS r3 = X.C16620tR.A00(r5, r4)     // Catch:{ JSONException -> 0x051f }
            if (r3 != 0) goto L_0x014d
            java.lang.String r1 = "Missing entry"
            X.AnonymousClass0LU.A0B(r8, r1)     // Catch:{ JSONException -> 0x051f }
        L_0x013b:
            java.lang.String r1 = "service/register/response/cache_update_failed"
            X.AnonymousClass0LU.A0B(r6, r1)     // Catch:{ JSONException -> 0x051f }
            java.util.Map r5 = java.util.Collections.emptyMap()     // Catch:{ JSONException -> 0x051f }
            java.lang.String r1 = "cache_update_fail"
        L_0x0146:
            r2 = r4
            r3 = r12
            r4 = r12
            A01(r0, r1, r2, r3, r4, r5)     // Catch:{ JSONException -> 0x051f }
            goto L_0x0169
        L_0x014d:
            r3.A03 = r9     // Catch:{ JSONException -> 0x051f }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x051f }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ JSONException -> 0x051f }
            r3.A00 = r1     // Catch:{ JSONException -> 0x051f }
            boolean r1 = X.C16620tR.A01(r5, r3, r4)     // Catch:{ JSONException -> 0x051f }
            if (r1 == 0) goto L_0x013b
            r0.A03(r4, r9)     // Catch:{ JSONException -> 0x051f }
            java.util.Map r5 = java.util.Collections.emptyMap()     // Catch:{ JSONException -> 0x051f }
            java.lang.String r1 = "resp_success"
            goto L_0x0146
        L_0x0169:
            return
        L_0x016a:
            return
        L_0x016b:
            r32 = 0
            java.lang.String r25 = ""
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x051f }
            r3.<init>(r4)     // Catch:{ JSONException -> 0x051f }
            java.lang.String r24 = "token"
            r1 = r24
            java.lang.String r23 = r3.optString(r1)     // Catch:{ JSONException -> 0x051f }
            java.lang.String r1 = "ck"
            r3.optString(r1)     // Catch:{ JSONException -> 0x051f }
            java.lang.String r1 = "pn"
            java.lang.String r1 = r3.optString(r1)     // Catch:{ JSONException -> 0x051f }
            java.lang.String r2 = "cp"
            java.lang.String r22 = r3.optString(r2)     // Catch:{ JSONException -> 0x051f }
            java.lang.String r2 = "fbpushnotif"
            java.lang.String r9 = r3.optString(r2)     // Catch:{ JSONException -> 0x051f }
            java.lang.String r2 = "nid"
            java.lang.String r4 = r3.optString(r2)     // Catch:{ JSONException -> 0x051f }
            java.lang.String r2 = "bu"
            r3.optString(r2)     // Catch:{ JSONException -> 0x051f }
            java.lang.String r11 = "l"
            boolean r2 = r3.has(r11)     // Catch:{ JSONException -> 0x051f }
            if (r2 == 0) goto L_0x01d1
            boolean r2 = r3.isNull(r11)     // Catch:{ JSONException -> 0x051f }
            if (r2 != 0) goto L_0x01d1
            boolean r2 = r3.getBoolean(r11)     // Catch:{ JSONException -> 0x051f }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ JSONException -> 0x051f }
            r2.getClass()     // Catch:{ JSONException -> 0x051f }
            X.0mR r5 = new X.0mR     // Catch:{ JSONException -> 0x051f }
            r5.<init>(r2)     // Catch:{ JSONException -> 0x051f }
        L_0x01bc:
            java.lang.String r2 = "qt"
            long r16 = r3.optLong(r2)     // Catch:{ JSONException -> 0x051f }
            java.lang.String r2 = "j"
            java.lang.String r27 = r3.optString(r2)     // Catch:{ JSONException -> 0x051f }
            java.lang.String r2 = "at"
            int r10 = r3.optInt(r2, r8)     // Catch:{ JSONException -> 0x051f }
            if (r10 == r15) goto L_0x01da
            goto L_0x01d4
        L_0x01d1:
            X.0mO r5 = X.C12730mO.A00     // Catch:{ JSONException -> 0x051f }
            goto L_0x01bc
        L_0x01d4:
            r2 = 2
            if (r10 == r2) goto L_0x01dd
            java.lang.Integer r21 = X.AnonymousClass006.A00     // Catch:{ JSONException -> 0x051f }
            goto L_0x01df
        L_0x01da:
            java.lang.Integer r21 = X.AnonymousClass006.A01     // Catch:{ JSONException -> 0x051f }
            goto L_0x01df
        L_0x01dd:
            java.lang.Integer r21 = X.AnonymousClass006.A0C     // Catch:{ JSONException -> 0x051f }
        L_0x01df:
            java.lang.String r10 = "s"
            java.lang.String r2 = "MQTT"
            java.lang.String r14 = r3.optString(r10, r2)     // Catch:{ JSONException -> 0x051f }
            java.lang.String r2 = "mt"
            boolean r10 = r3.has(r2)     // Catch:{ JSONException -> 0x051f }
            if (r10 == 0) goto L_0x0211
            long r2 = r3.getLong(r2)     // Catch:{ JSONException -> 0x051f }
            java.lang.Long r3 = java.lang.Long.valueOf(r2)     // Catch:{ JSONException -> 0x051f }
            r3.getClass()     // Catch:{ JSONException -> 0x051f }
            X.0mR r20 = new X.0mR     // Catch:{ JSONException -> 0x051f }
            r2 = r20
            r2.<init>(r3)     // Catch:{ JSONException -> 0x051f }
        L_0x0201:
            X.0tT r10 = r0.A07     // Catch:{ JSONException -> 0x051f }
            boolean r2 = r5.A01()     // Catch:{ JSONException -> 0x051f }
            if (r2 != 0) goto L_0x0253
            java.lang.String r3 = "LOG_SR"
            java.lang.String r5 = "/"
            r2 = r1
            if (r1 != 0) goto L_0x0216
            goto L_0x0214
        L_0x0211:
            X.0mO r20 = X.C12730mO.A00     // Catch:{ JSONException -> 0x051f }
            goto L_0x0201
        L_0x0214:
            r2 = r25
        L_0x0216:
            java.lang.String r2 = X.AnonymousClass00U.A0V(r3, r5, r2)     // Catch:{ JSONException -> 0x051f }
            android.content.SharedPreferences r10 = r10.A00     // Catch:{ JSONException -> 0x051f }
            boolean r5 = r10.contains(r2)     // Catch:{ JSONException -> 0x051f }
            r12 = 0
            if (r5 == 0) goto L_0x0236
            int r5 = r10.getInt(r2, r8)     // Catch:{ JSONException -> 0x051f }
        L_0x0227:
            java.util.Random r3 = new java.util.Random     // Catch:{ JSONException -> 0x051f }
            r3.<init>()     // Catch:{ JSONException -> 0x051f }
            r2 = 10000(0x2710, float:1.4013E-41)
            int r2 = r3.nextInt(r2)     // Catch:{ JSONException -> 0x051f }
            r3 = 0
            if (r2 >= r5) goto L_0x023c
            goto L_0x023b
        L_0x0236:
            int r5 = r10.getInt(r3, r8)     // Catch:{ JSONException -> 0x051f }
            goto L_0x0227
        L_0x023b:
            r3 = 1
        L_0x023c:
            java.lang.String r2 = "is_employee"
            boolean r2 = r10.getBoolean(r2, r8)     // Catch:{ JSONException -> 0x051f }
            if (r2 != 0) goto L_0x0246
            if (r3 == 0) goto L_0x0247
        L_0x0246:
            r12 = 1
        L_0x0247:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)     // Catch:{ JSONException -> 0x051f }
            r2.getClass()     // Catch:{ JSONException -> 0x051f }
            X.0mR r5 = new X.0mR     // Catch:{ JSONException -> 0x051f }
            r5.<init>(r2)     // Catch:{ JSONException -> 0x051f }
        L_0x0253:
            r2 = 0
            int r8 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x027b
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x051f }
            long r12 = r12 - r16
            int r8 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r8 < 0) goto L_0x0264
            r2 = r12
        L_0x0264:
            X.0tN r12 = r0.A09     // Catch:{ JSONException -> 0x051f }
            X.0w5 r8 = r0.A01     // Catch:{ JSONException -> 0x051f }
            android.content.Context r8 = r8.getApplicationContext()     // Catch:{ JSONException -> 0x051f }
            java.lang.String r10 = r8.getPackageName()     // Catch:{ JSONException -> 0x051f }
            java.lang.String r8 = "receive"
            java.lang.String[] r10 = new java.lang.String[]{r8, r10, r1}     // Catch:{ JSONException -> 0x051f }
            java.lang.String r8 = "fbns_e2e_latency"
            r12.A01(r8, r10, r2)     // Catch:{ JSONException -> 0x051f }
        L_0x027b:
            X.0sF r12 = r0.A03     // Catch:{ JSONException -> 0x051f }
            java.lang.String r10 = "===Received Notif: target = "
            java.lang.String r8 = "; notifId = "
            java.lang.String r8 = X.AnonymousClass00U.A0d(r10, r1, r8, r4)     // Catch:{ JSONException -> 0x051f }
            r12.Bb6(r8)     // Catch:{ JSONException -> 0x051f }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ JSONException -> 0x051f }
            r10.<init>()     // Catch:{ JSONException -> 0x051f }
            boolean r18 = r5.A01()     // Catch:{ JSONException -> 0x051f }
            if (r18 == 0) goto L_0x029e
            java.lang.Object r8 = r5.A00()     // Catch:{ JSONException -> 0x051f }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ JSONException -> 0x051f }
            r10.put(r11, r8)     // Catch:{ JSONException -> 0x051f }
        L_0x029e:
            java.lang.String r8 = "src"
            r10.put(r8, r14)     // Catch:{ JSONException -> 0x051f }
            r12 = r23
            java.lang.String r12 = X.AnonymousClass00U.A0V(r9, r1, r12)     // Catch:{ JSONException -> 0x051f }
            int r12 = r12.hashCode()     // Catch:{ JSONException -> 0x051f }
            java.lang.String r13 = java.lang.String.valueOf(r12)     // Catch:{ JSONException -> 0x051f }
            java.lang.String r12 = "hash"
            r10.put(r12, r13)     // Catch:{ JSONException -> 0x051f }
            java.lang.String r29 = "receive"
            r28 = r0
            r30 = r4
            r31 = r1
            r33 = r10
            r34 = r2
            A02(r28, r29, r30, r31, r32, r33, r34)     // Catch:{ JSONException -> 0x051f }
            X.0tX r2 = r0.A06     // Catch:{ JSONException -> 0x051f }
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x051f }
            if (r3 != 0) goto L_0x0316
            android.util.Pair r3 = new android.util.Pair     // Catch:{ JSONException -> 0x051f }
            r3.<init>(r4, r1)     // Catch:{ JSONException -> 0x051f }
            java.util.LinkedList r2 = r2.A00     // Catch:{ JSONException -> 0x051f }
            boolean r10 = r2.contains(r3)     // Catch:{ JSONException -> 0x051f }
            if (r10 == 0) goto L_0x030b
            java.lang.Long r2 = java.lang.Long.valueOf(r16)     // Catch:{ JSONException -> 0x051f }
            r2.getClass()     // Catch:{ JSONException -> 0x051f }
            X.0sF r3 = r0.A03     // Catch:{ JSONException -> 0x051f }
            java.lang.String r2 = "Duplicated Notif: notifId = "
            java.lang.String r2 = X.AnonymousClass00U.A0L(r2, r4)     // Catch:{ JSONException -> 0x051f }
            r3.Bb6(r2)     // Catch:{ JSONException -> 0x051f }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ JSONException -> 0x051f }
            r3.<init>()     // Catch:{ JSONException -> 0x051f }
            if (r18 == 0) goto L_0x02fe
            java.lang.Object r2 = r5.A00()     // Catch:{ JSONException -> 0x051f }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ JSONException -> 0x051f }
            r3.put(r11, r2)     // Catch:{ JSONException -> 0x051f }
        L_0x02fe:
            r3.put(r8, r14)     // Catch:{ JSONException -> 0x051f }
            r34 = 0
            java.lang.String r29 = "duplicate"
            r33 = r3
            A02(r28, r29, r30, r31, r32, r33, r34)     // Catch:{ JSONException -> 0x051f }
            return
        L_0x030b:
            int r10 = r2.size()     // Catch:{ JSONException -> 0x051f }
            r8 = 100
            if (r10 > r8) goto L_0x0372
            r2.add(r3)     // Catch:{ JSONException -> 0x051f }
        L_0x0316:
            X.0tX r2 = r0.A06     // Catch:{ JSONException -> 0x051f }
            java.util.LinkedList r8 = r2.A00     // Catch:{ JSONException -> 0x051f }
            int r3 = r8.size()     // Catch:{ JSONException -> 0x051f }
            r2 = 100
            if (r3 <= r2) goto L_0x0369
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x051f }
            java.lang.Object[] r3 = new java.lang.Object[]{r2}     // Catch:{ JSONException -> 0x051f }
            java.lang.String r2 = "notifications %d size limit reached"
            X.AnonymousClass0LU.A0O(r6, r2, r3)     // Catch:{ JSONException -> 0x051f }
            java.lang.Object r2 = r8.removeFirst()     // Catch:{ JSONException -> 0x051f }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ JSONException -> 0x051f }
            if (r2 == 0) goto L_0x0369
            X.0sG r12 = r0.A04     // Catch:{ JSONException -> 0x051f }
            java.lang.Object r11 = r2.first     // Catch:{ JSONException -> 0x051f }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ JSONException -> 0x051f }
            java.lang.Object r10 = r2.second     // Catch:{ JSONException -> 0x051f }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ JSONException -> 0x051f }
            java.lang.Integer r8 = X.AnonymousClass006.A01     // Catch:{ JSONException -> 0x051f }
            java.lang.String r2 = "Oldest"
            X.0mR r3 = new X.0mR     // Catch:{ JSONException -> 0x051f }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x051f }
            X.0qC r2 = new X.0qC     // Catch:{ JSONException -> 0x051f }
            r2.<init>(r3, r8)     // Catch:{ JSONException -> 0x051f }
            r12.A02(r2, r11, r10)     // Catch:{ JSONException -> 0x051f }
            X.0tN r11 = r0.A09     // Catch:{ JSONException -> 0x051f }
            X.0w5 r2 = r0.A01     // Catch:{ JSONException -> 0x051f }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ JSONException -> 0x051f }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ JSONException -> 0x051f }
            java.lang.String[] r10 = new java.lang.String[]{r2, r1}     // Catch:{ JSONException -> 0x051f }
            r2 = 1
            java.lang.String r8 = "notifications_store_limit_reached"
            r11.A01(r8, r10, r2)     // Catch:{ JSONException -> 0x051f }
        L_0x0369:
            java.lang.String r2 = "message"
            int r3 = r21.intValue()     // Catch:{ JSONException -> 0x051f }
            if (r3 == r15) goto L_0x037e
            goto L_0x0378
        L_0x0372:
            java.lang.String r2 = "Limit reached: Ignore notification. Missing limitSize() call?"
            X.AnonymousClass0LU.A0C(r6, r2)     // Catch:{ JSONException -> 0x051f }
            goto L_0x0316
        L_0x0378:
            r8 = 2
            if (r3 == r8) goto L_0x0381
            java.lang.String r3 = "com.facebook.rti.fbns.intent.RECEIVE"
            goto L_0x0383
        L_0x037e:
            java.lang.String r3 = "com.facebook.rti.fbns.intent.RECEIVE_RTC"
            goto L_0x0383
        L_0x0381:
            java.lang.String r3 = "com.facebook.rti.fbns.intent.RECEIVE_VR"
        L_0x0383:
            android.content.Intent r8 = new android.content.Intent     // Catch:{ JSONException -> 0x051f }
            r8.<init>(r3)     // Catch:{ JSONException -> 0x051f }
            r8.setPackage(r1)     // Catch:{ JSONException -> 0x051f }
            r8.addCategory(r1)     // Catch:{ JSONException -> 0x051f }
            java.lang.String r3 = "receive_type"
            r8.putExtra(r3, r2)     // Catch:{ JSONException -> 0x051f }
            if (r9 == 0) goto L_0x039a
            java.lang.String r2 = "data"
            r8.putExtra(r2, r9)     // Catch:{ JSONException -> 0x051f }
        L_0x039a:
            boolean r2 = android.text.TextUtils.isEmpty(r23)     // Catch:{ JSONException -> 0x051f }
            if (r2 != 0) goto L_0x03a7
            r3 = r24
            r2 = r23
            r8.putExtra(r3, r2)     // Catch:{ JSONException -> 0x051f }
        L_0x03a7:
            boolean r2 = android.text.TextUtils.isEmpty(r22)     // Catch:{ JSONException -> 0x051f }
            if (r2 != 0) goto L_0x03b4
            java.lang.String r3 = "collapse_key"
            r2 = r22
            r8.putExtra(r3, r2)     // Catch:{ JSONException -> 0x051f }
        L_0x03b4:
            X.0sG r9 = r0.A04     // Catch:{ JSONException -> 0x051f }
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x051f }
            if (r2 == 0) goto L_0x044e
            com.facebook.rti.push.service.FbnsServiceDelegate r2 = r9.A05     // Catch:{ JSONException -> 0x051f }
            java.lang.String r26 = "null pnid"
            r23 = r2
            r24 = r5
            r27 = r32
            r28 = r32
            r29 = r14
            r23.A0e(r24, r25, r26, r27, r28, r29)     // Catch:{ JSONException -> 0x051f }
            java.lang.Integer r2 = X.AnonymousClass006.A00     // Catch:{ JSONException -> 0x051f }
            java.lang.String r3 = "Missing pnid"
        L_0x03d1:
            r3.getClass()     // Catch:{ JSONException -> 0x051f }
        L_0x03d4:
            X.0mR r8 = new X.0mR     // Catch:{ JSONException -> 0x051f }
            r8.<init>(r3)     // Catch:{ JSONException -> 0x051f }
        L_0x03d9:
            X.0qC r3 = new X.0qC     // Catch:{ JSONException -> 0x051f }
            r3.<init>(r8, r2)     // Catch:{ JSONException -> 0x051f }
        L_0x03de:
            java.lang.Integer r3 = r3.A01     // Catch:{ JSONException -> 0x051f }
            boolean r2 = X.C14650pt.A01(r3)     // Catch:{ JSONException -> 0x051f }
            if (r2 != 0) goto L_0x0406
            int r2 = r3.intValue()     // Catch:{ JSONException -> 0x051f }
            switch(r2) {
                case 1: goto L_0x0424;
                case 2: goto L_0x0427;
                case 3: goto L_0x042a;
                case 4: goto L_0x042d;
                case 5: goto L_0x0430;
                case 6: goto L_0x0433;
                case 7: goto L_0x0436;
                case 8: goto L_0x0439;
                case 9: goto L_0x043c;
                case 10: goto L_0x043f;
                case 11: goto L_0x0442;
                case 12: goto L_0x0445;
                case 13: goto L_0x0448;
                case 14: goto L_0x044b;
                default: goto L_0x03ed;
            }     // Catch:{ JSONException -> 0x051f }
        L_0x03ed:
            java.lang.String r8 = "DATA_INVALID"
        L_0x03ef:
            java.lang.String r3 = "Error: Delivery helper failed notifId = "
            java.lang.String r2 = "; reason = "
            java.lang.String r25 = X.AnonymousClass00U.A0d(r3, r4, r2, r8)     // Catch:{ JSONException -> 0x051f }
            r20 = r0
            r21 = r5
            r22 = r1
            r23 = r8
            r24 = r4
            r26 = r14
            r20.A0e(r21, r22, r23, r24, r25, r26)     // Catch:{ JSONException -> 0x051f }
        L_0x0406:
            java.lang.Long r2 = java.lang.Long.valueOf(r16)     // Catch:{ JSONException -> 0x051f }
            r2.getClass()     // Catch:{ JSONException -> 0x051f }
            X.0Lp r2 = r0.A05     // Catch:{ JSONException -> 0x051f }
            java.util.concurrent.ConcurrentMap r3 = r2.A02     // Catch:{ JSONException -> 0x051f }
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ JSONException -> 0x051f }
            r2.<init>()     // Catch:{ JSONException -> 0x051f }
            r3.putIfAbsent(r1, r2)     // Catch:{ JSONException -> 0x051f }
            java.lang.Object r1 = r3.get(r1)     // Catch:{ JSONException -> 0x051f }
            java.util.concurrent.atomic.AtomicLong r1 = (java.util.concurrent.atomic.AtomicLong) r1     // Catch:{ JSONException -> 0x051f }
            r1.incrementAndGet()     // Catch:{ JSONException -> 0x051f }
            goto L_0x0516
        L_0x0424:
            java.lang.String r8 = "DATA_EXPIRED"
            goto L_0x03ef
        L_0x0427:
            java.lang.String r8 = "NOTIF_ACKED"
            goto L_0x03ef
        L_0x042a:
            java.lang.String r8 = "NOTIF_DUPED"
            goto L_0x03ef
        L_0x042d:
            java.lang.String r8 = "BROADCAST_SENT"
            goto L_0x03ef
        L_0x0430:
            java.lang.String r8 = "BROADCAST_FAILED"
            goto L_0x03ef
        L_0x0433:
            java.lang.String r8 = "PACKAGE_FAILED"
            goto L_0x03ef
        L_0x0436:
            java.lang.String r8 = "PACKAGE_INVALID"
            goto L_0x03ef
        L_0x0439:
            java.lang.String r8 = "PACKAGE_UNSUPPORTED"
            goto L_0x03ef
        L_0x043c:
            java.lang.String r8 = "PACKAGE_INCOMPATIBLE"
            goto L_0x03ef
        L_0x043f:
            java.lang.String r8 = "PACKAGE_NOT_INSTALLED"
            goto L_0x03ef
        L_0x0442:
            java.lang.String r8 = "PACKAGE_DISABLED"
            goto L_0x03ef
        L_0x0445:
            java.lang.String r8 = "PACKAGE_NOT_TRUSTED"
            goto L_0x03ef
        L_0x0448:
            java.lang.String r8 = "PACKAGE_TRUSTED"
            goto L_0x03ef
        L_0x044b:
            java.lang.String r8 = "PROCESSOR_FAILED"
            goto L_0x03ef
        L_0x044e:
            java.lang.String r10 = r8.getPackage()     // Catch:{ JSONException -> 0x051f }
            if (r10 == 0) goto L_0x04fb
            boolean r2 = r10.isEmpty()     // Catch:{ JSONException -> 0x051f }
            if (r2 != 0) goto L_0x04fb
            java.lang.Object r3 = X.C17250ua.A00     // Catch:{ JSONException -> 0x051f }
            X.0m4 r3 = (X.C12530m4) r3     // Catch:{ JSONException -> 0x051f }
            X.0mM r2 = r9.A03     // Catch:{ JSONException -> 0x051f }
            X.0o5 r2 = r3.A01(r8, r2)     // Catch:{ JSONException -> 0x051f }
            r2.DAV()     // Catch:{ 0pT -> 0x04ea }
            android.content.Context r2 = r9.A02     // Catch:{ JSONException -> 0x051f }
            java.lang.String r3 = r2.getPackageName()     // Catch:{ JSONException -> 0x051f }
            java.lang.String r2 = "extra_notification_sender"
            r8.putExtra(r2, r3)     // Catch:{ JSONException -> 0x051f }
            java.lang.String r2 = "extra_notification_id"
            r8.putExtra(r2, r4)     // Catch:{ JSONException -> 0x051f }
            X.0pJ r11 = r9.A01()     // Catch:{ IllegalStateException -> 0x04ee }
            r12 = 0
            int r2 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0485
            X.0mO r3 = X.C12730mO.A00     // Catch:{ IllegalStateException -> 0x04ee }
        L_0x0483:
            monitor-enter(r11)     // Catch:{ IllegalStateException -> 0x04ee }
            goto L_0x0492
        L_0x0485:
            java.lang.Long r2 = java.lang.Long.valueOf(r16)     // Catch:{ IllegalStateException -> 0x04ee }
            r2.getClass()     // Catch:{ IllegalStateException -> 0x04ee }
            X.0mR r3 = new X.0mR     // Catch:{ IllegalStateException -> 0x04ee }
            r3.<init>(r2)     // Catch:{ IllegalStateException -> 0x04ee }
            goto L_0x0483
        L_0x0492:
            android.content.SharedPreferences r2 = r11.A01     // Catch:{ all -> 0x04e7 }
            boolean r12 = r2.contains(r4)     // Catch:{ all -> 0x04e7 }
            if (r12 != 0) goto L_0x04c6
            long r29 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04e7 }
            X.0o7 r21 = new X.0o7     // Catch:{ all -> 0x04e7 }
            r22 = r8
            r23 = r5
            r24 = r3
            r25 = r20
            r26 = r4
            r28 = r14
            r31 = r29
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r31)     // Catch:{ all -> 0x04e7 }
            java.lang.String r3 = r21.A01()     // Catch:{ all -> 0x04e7 }
            boolean r12 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04e7 }
            if (r12 != 0) goto L_0x04c6
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x04e7 }
            android.content.SharedPreferences$Editor r2 = r2.putString(r4, r3)     // Catch:{ all -> 0x04e7 }
            r2.apply()     // Catch:{ all -> 0x04e7 }
        L_0x04c6:
            monitor-exit(r11)     // Catch:{ IllegalStateException -> 0x04ee }
            X.0qC r3 = X.C15970sG.A00(r8, r5, r9, r14)     // Catch:{ JSONException -> 0x051f }
            java.lang.Integer r8 = r3.A01     // Catch:{ JSONException -> 0x051f }
            boolean r2 = X.C14650pt.A00(r8)     // Catch:{ JSONException -> 0x051f }
            if (r2 == 0) goto L_0x04d8
            r9.A02(r3, r4, r10)     // Catch:{ JSONException -> 0x051f }
            goto L_0x03de
        L_0x04d8:
            boolean r2 = X.C14650pt.A01(r8)     // Catch:{ JSONException -> 0x051f }
            if (r2 != 0) goto L_0x03de
            java.lang.Long r2 = java.lang.Long.valueOf(r16)     // Catch:{ JSONException -> 0x051f }
            r2.getClass()     // Catch:{ JSONException -> 0x051f }
            goto L_0x03de
        L_0x04e7:
            r2 = move-exception
            monitor-exit(r11)     // Catch:{ IllegalStateException -> 0x04ee }
            throw r2     // Catch:{ IllegalStateException -> 0x04ee }
        L_0x04ea:
            r3 = move-exception
            java.lang.Integer r2 = r3.A00     // Catch:{ JSONException -> 0x051f }
            goto L_0x04f1
        L_0x04ee:
            r3 = move-exception
            java.lang.Integer r2 = X.AnonymousClass006.A00     // Catch:{ JSONException -> 0x051f }
        L_0x04f1:
            java.lang.String r3 = r3.getMessage()     // Catch:{ JSONException -> 0x051f }
            if (r3 != 0) goto L_0x03d4
            X.0mO r8 = X.C12730mO.A00     // Catch:{ JSONException -> 0x051f }
            goto L_0x03d9
        L_0x04fb:
            java.lang.String r2 = "Error: invalid receiver = "
            java.lang.String r3 = X.AnonymousClass00U.A0L(r2, r10)     // Catch:{ JSONException -> 0x051f }
            com.facebook.rti.push.service.FbnsServiceDelegate r2 = r9.A05     // Catch:{ JSONException -> 0x051f }
            java.lang.String r26 = "invalid dpn"
            r23 = r2
            r24 = r5
            r27 = r4
            r28 = r3
            r29 = r14
            r23.A0e(r24, r25, r26, r27, r28, r29)     // Catch:{ JSONException -> 0x051f }
            java.lang.Integer r2 = X.AnonymousClass006.A15     // Catch:{ JSONException -> 0x051f }
            goto L_0x03d1
        L_0x0516:
            return
        L_0x0517:
            java.lang.String r2 = "UTF-8 not supported"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ JSONException -> 0x051f }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x051f }
            throw r1     // Catch:{ JSONException -> 0x051f }
        L_0x051f:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[]{r7}
            java.lang.String r1 = "receive/publish/payload_exception; topic=%s"
            X.AnonymousClass0LU.A0K(r6, r1, r3, r2)
            X.0tN r3 = r0.A09
            java.lang.Integer r2 = X.AnonymousClass006.A00
            java.lang.String r1 = "JSON_PARSE_ERROR"
            r3.A00(r1, r7)
            X.0tm r1 = r0.A02
            r1.A00(r2, r7)
            X.0sF r2 = r0.A03
            java.lang.String r1 = "Error: invalid payload = "
            r0 = r19
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            r2.Bb6(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.push.service.FbnsServiceDelegate.A0W(X.0P6, java.lang.Long, java.lang.String, byte[], int, long):void");
    }
}
