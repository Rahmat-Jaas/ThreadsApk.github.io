package X;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Queue;

/* renamed from: X.0MC  reason: invalid class name */
public final class AnonymousClass0MC {
    public int A00;
    public Notification.Builder A01;
    public String A02 = "";
    public Queue A03;
    public final Context A04;
    public final int A05;
    public final NotificationManager A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    private Notification.InboxStyle A00() {
        Notification.InboxStyle summaryText = new Notification.InboxStyle().setBigContentTitle(AnonymousClass00U.A0V("[", this.A07, "]")).setSummaryText(this.A08);
        for (CharSequence addLine : this.A03) {
            summaryText.addLine(addLine);
        }
        return summaryText;
    }

    public final void A01(String str) {
        int i;
        int i2;
        if (!this.A09) {
            try {
                this.A06.cancel("MqttDiagnosticNotification", this.A05);
            } catch (RuntimeException unused) {
            }
        } else {
            synchronized (this) {
                this.A00 = 0;
                this.A02 = str;
                if ("CONNECTED".equals(str)) {
                    i2 = 17301611;
                    i = -16711936;
                } else {
                    i2 = 17301608;
                    i = -65536;
                    if ("CONNECTING".equals(str)) {
                        i2 = 17301607;
                        i = -256;
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("vrshell_aui_persist", false);
                Context context = this.A04;
                Notification.Builder smallIcon = new Notification.Builder(context).setChannelId("debug_channel").setSmallIcon(i2);
                C16230sh r1 = new C16230sh();
                r1.A0D = true;
                Notification.Builder extras = smallIcon.setContentIntent(r1.A01(context, 0, 0)).setContentTitle(AnonymousClass00U.A0V("[", this.A07, "]")).setContentText(str).setExtras(bundle);
                this.A01 = extras;
                extras.setColor(i);
                this.A01.setStyle(A00());
                this.A06.notify("MqttDiagnosticNotification", this.A05, this.A01.getNotification());
            }
        }
    }

    public final void A02(String str) {
        if (!this.A09) {
            try {
                this.A06.cancel("MqttDiagnosticNotification", this.A05);
            } catch (RuntimeException unused) {
            }
        } else if (this.A01 != null) {
            synchronized (this) {
                Notification.Builder builder = this.A01;
                int i = this.A00 + 1;
                this.A00 = i;
                builder.setSubText(String.valueOf(i));
                String A0V = AnonymousClass00U.A0V(new SimpleDateFormat("h:mm:ss a").format(new Date()), " ", str);
                Queue queue = this.A03;
                queue.add(A0V);
                if (queue.size() > 8) {
                    queue.poll();
                }
                this.A01.setContentText(this.A02);
                this.A01.setStyle(A00());
                this.A06.notify("MqttDiagnosticNotification", this.A05, this.A01.getNotification());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040 A[Catch:{ all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0051 A[EDGE_INSN: B:28:0x0051->B:17:0x0051 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0MC(android.content.Context r7, X.C12800mV r8, java.lang.String r9, boolean r10) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.String r0 = ""
            r6.A02 = r0
            r2 = 0
            r6.A00 = r2
            r6.A07 = r9
            r6.A04 = r7
            java.lang.Class<android.app.NotificationManager> r0 = android.app.NotificationManager.class
            java.lang.String r4 = "notification"
            java.lang.Object r1 = r7.getSystemService(r4)     // Catch:{ Exception -> 0x001f }
            if (r1 == 0) goto L_0x001f
            boolean r0 = r0.isInstance(r1)     // Catch:{ Exception -> 0x001f }
            if (r0 == 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            r6.A06 = r1
            int r5 = android.os.Process.myPid()     // Catch:{ all -> 0x0051 }
            android.content.Context r1 = r6.A04     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ all -> 0x0051 }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ all -> 0x0051 }
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch:{ all -> 0x0051 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0051 }
        L_0x003a:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0051
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x0051 }
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch:{ all -> 0x0051 }
            int r0 = r1.pid     // Catch:{ all -> 0x0051 }
            if (r0 != r5) goto L_0x003a
            java.lang.String r0 = r1.processName     // Catch:{ all -> 0x0051 }
            int r0 = r0.hashCode()     // Catch:{ all -> 0x0051 }
            goto L_0x0053
        L_0x0051:
            r0 = 42
        L_0x0053:
            r6.A05 = r0
            java.lang.String r3 = "Started on "
            java.lang.String r0 = "M/d h:mm:ss a"
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r0 = r1.format(r0)
            java.lang.String r0 = X.AnonymousClass00U.A0L(r3, r0)
            r6.A08 = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r6.A03 = r0
            java.lang.Integer r0 = X.AnonymousClass006.A06
            X.0mU r0 = r8.A00(r0)
            if (r10 != 0) goto L_0x0086
            java.lang.String r1 = "is_on"
            android.content.SharedPreferences r0 = r0.A00
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L_0x0087
        L_0x0086:
            r2 = 1
        L_0x0087:
            r6.A09 = r2
            if (r2 == 0) goto L_0x009e
            r3 = 2
            java.lang.String r2 = "debug_channel"
            java.lang.String r0 = "Debugging Information"
            android.app.NotificationChannel r1 = new android.app.NotificationChannel
            r1.<init>(r2, r0, r3)
            java.lang.Object r0 = r7.getSystemService(r4)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            r0.createNotificationChannel(r1)
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0MC.<init>(android.content.Context, X.0mV, java.lang.String, boolean):void");
    }
}
