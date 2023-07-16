package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0sF  reason: invalid class name and case insensitive filesystem */
public final class C15960sF implements C08860eQ, C16800tl {
    public int A00;
    public C13460nk A01 = null;
    public ArrayList A02 = new ArrayList();
    public ScheduledFuture A03 = null;
    public final Context A04;
    public final SharedPreferences A05;
    public final ScheduledExecutorService A06;
    public final SimpleDateFormat A07;

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C15960sF r8, boolean r9) {
        /*
            monitor-enter(r8)
            java.util.ArrayList r2 = r8.A02     // Catch:{ all -> 0x008f }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            r8.A02 = r0     // Catch:{ all -> 0x008f }
            if (r9 == 0) goto L_0x0014
            java.util.concurrent.ScheduledFuture r1 = r8.A03     // Catch:{ all -> 0x008f }
            if (r1 == 0) goto L_0x0014
            r0 = 0
            r1.cancel(r0)     // Catch:{ all -> 0x008f }
        L_0x0014:
            r0 = 0
            r8.A03 = r0     // Catch:{ all -> 0x008f }
            monitor-exit(r8)     // Catch:{ all -> 0x008f }
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x008e
            android.content.Context r6 = r8.A04
            java.io.File r1 = r6.getCacheDir()
            java.lang.String r5 = "fbnslite_log"
            int r0 = r8.A00
            java.lang.String r0 = X.AnonymousClass00U.A0J(r5, r0)
            java.io.File r4 = new java.io.File
            r4.<init>(r1, r0)
            r7 = 1
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch:{ IOException -> 0x005a }
            r3.<init>(r4, r7)     // Catch:{ IOException -> 0x005a }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0055 }
        L_0x003b:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0051
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0055 }
            r0 = 10
            java.lang.String r0 = X.AnonymousClass00U.A0A(r1, r0)     // Catch:{ all -> 0x0055 }
            r3.write(r0)     // Catch:{ all -> 0x0055 }
            goto L_0x003b
        L_0x0051:
            r3.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005a
        L_0x0055:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0059 }
        L_0x0059:
            throw r0     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            long r3 = r4.length()
            r1 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x008e
            int r0 = r8.A00
            if (r0 == 0) goto L_0x0069
            r7 = 0
        L_0x0069:
            r8.A00 = r7
            android.content.SharedPreferences r0 = r8.A05
            android.content.SharedPreferences$Editor r2 = r0.edit()
            int r1 = r8.A00
            java.lang.String r0 = "CurrentFile"
            android.content.SharedPreferences$Editor r0 = r2.putInt(r0, r1)
            r0.commit()
            java.io.File r2 = r6.getCacheDir()
            int r0 = r8.A00
            java.lang.String r1 = X.AnonymousClass00U.A0J(r5, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            r0.delete()
        L_0x008e:
            return
        L_0x008f:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x008f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15960sF.A00(X.0sF, boolean):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle AIQ(android.content.Context r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.0nk r0 = r8.A01
            if (r0 == 0) goto L_0x0063
            com.facebook.rti.mqtt.manager.MqttPushServiceDelegate r5 = r0.A00
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r1 = "is_mqtt_direct"
            java.lang.String r0 = "false"
            r3.put(r1, r0)
            X.00d r0 = r5.A09
            long r0 = r0.A00
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0050
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
            java.lang.String r1 = r2.toString()
        L_0x002a:
            java.lang.String r0 = "last_connection_time"
            r3.put(r0, r1)
            X.00d r0 = r5.A09
            long r1 = r0.A03
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x004b
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            java.lang.String r1 = r0.toString()
        L_0x0040:
            java.lang.String r0 = "last_network_changed_time"
            r3.put(r0, r1)
            X.00d r0 = r5.A09
            java.util.Map r2 = r0.A0W
            monitor-enter(r2)
            goto L_0x0055
        L_0x004b:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x0040
        L_0x0050:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            goto L_0x002a
        L_0x0055:
            java.util.Set r1 = r2.keySet()     // Catch:{ all -> 0x0060 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0060 }
            r0.<init>(r1)     // Catch:{ all -> 0x0060 }
            monitor-exit(r2)     // Catch:{ all -> 0x0060 }
            goto L_0x0069
        L_0x0060:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0060 }
            throw r0
        L_0x0063:
            java.lang.String r0 = "SystemDumper not connected"
            r8.Bb6(r0)
            goto L_0x0080
        L_0x0069:
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "subscribed_topics"
            r3.put(r0, r1)
            java.lang.String r1 = com.facebook.rti.mqtt.manager.MqttPushServiceDelegate.A05(r5)
            java.lang.String r0 = "mqtt_health_stats"
            r3.put(r0, r1)
            java.lang.String r0 = "DumpSys"
            r8.Bb8(r0, r3)
        L_0x0080:
            java.util.concurrent.ScheduledExecutorService r1 = r8.A06
            X.0tk r0 = new X.0tk
            r0.<init>(r8)
            java.util.concurrent.Future r0 = r1.submit(r0)
            r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x008e }
        L_0x008e:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r1 = r8.A00
            r0 = 0
            if (r1 != 0) goto L_0x0099
            r0 = 1
        L_0x0099:
            android.content.Context r5 = r8.A04
            java.io.File r2 = r5.getCacheDir()
            java.lang.String r3 = "fbnslite_log"
            java.lang.String r0 = X.AnonymousClass00U.A0J(r3, r0)
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x00b3
            r6.add(r1)
        L_0x00b3:
            java.io.File r2 = r5.getCacheDir()
            int r0 = r8.A00
            java.lang.String r0 = X.AnonymousClass00U.A0J(r3, r0)
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x00cb
            r6.add(r1)
        L_0x00cb:
            java.util.Iterator r5 = r6.iterator()
        L_0x00cf:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x010d
            java.lang.Object r2 = r5.next()
            java.io.File r2 = (java.io.File) r2
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x00f8 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x00f8 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00f8 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00f8 }
        L_0x00e5:
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x00ef
            r4.add(r0)     // Catch:{ all -> 0x00f3 }
            goto L_0x00e5
        L_0x00ef:
            r1.close()     // Catch:{ IOException -> 0x00f8 }
            goto L_0x00cf
        L_0x00f3:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00f7 }
        L_0x00f7:
            throw r0     // Catch:{ IOException -> 0x00f8 }
        L_0x00f8:
            r0 = move-exception
            java.lang.String r3 = "Error reading file "
            java.lang.String r2 = r2.getName()
            java.lang.String r1 = " - "
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = X.AnonymousClass00U.A0d(r3, r2, r1, r0)
            r4.add(r0)
            goto L_0x00cf
        L_0x010d:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "flytrap"
            r1.putStringArrayList(r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15960sF.AIQ(android.content.Context, android.os.Bundle):android.os.Bundle");
    }

    public final void AIW(Context context, Bundle bundle) {
        throw new IllegalArgumentException("not implemented for FbnsLiteFlytrapLogger");
    }

    public final void Bb7(String str, String str2) {
        Bb6(AnonymousClass00U.A0d("[", str, "] ", str2));
    }

    public final void Bb8(String str, Map map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append((String) entry.getValue());
            sb.append("; ");
        }
        Bb6(AnonymousClass00U.A0d("[", str, "] ", sb.toString()));
    }

    public C15960sF(Context context) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        this.A07 = simpleDateFormat;
        this.A04 = context;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        this.A05 = context.getSharedPreferences("Fbnslite_Flytrap", 0);
        this.A06 = Executors.newSingleThreadScheduledExecutor();
        this.A00 = this.A05.getInt("CurrentFile", 0);
    }

    public final void Bb6(String str) {
        String A0V = AnonymousClass00U.A0V(this.A07.format(new Date(System.currentTimeMillis())), " ", str);
        synchronized (this) {
            if (A0V.length() > 500) {
                A0V = A0V.substring(0, 500);
            }
            this.A02.add(A0V);
            if (this.A03 == null) {
                this.A03 = this.A06.schedule(new C16780tj(this), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS, TimeUnit.MILLISECONDS);
            }
        }
    }
}
