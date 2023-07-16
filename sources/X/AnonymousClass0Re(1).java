package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.redex.IDxBReceiverShape6S0100000_I2;
import com.facebook.rti.common.time.RealtimeSinceBootClock;

/* renamed from: X.0Re  reason: invalid class name */
public final class AnonymousClass0Re {
    public static final String A0D = AnonymousClass00U.A0L(AnonymousClass0Re.class.getCanonicalName(), ".ACTION_ALARM.");
    public boolean A00;
    public boolean A01;
    public final AlarmManager A02;
    public final PendingIntent A03;
    public final BroadcastReceiver A04;
    public final Context A05;
    public final Handler A06;
    public final AnonymousClass0P7 A07;
    public final String A08;
    public final int A09;
    public final RealtimeSinceBootClock A0A;
    public final AnonymousClass0Z1 A0B;
    public volatile Runnable A0C;

    public final synchronized void A00() {
        PendingIntent pendingIntent;
        if (this.A00 && (pendingIntent = this.A03) != null) {
            this.A00 = false;
            this.A07.A00(this.A02, pendingIntent);
        }
    }

    public final synchronized void A01() {
        synchronized (this) {
            if (!this.A01) {
                this.A01 = this.A07.A04(this.A04, this.A05, new IntentFilter(this.A08), this.A06);
            }
            if (!this.A00) {
                long AjS = (long) ((this.A0B.AjS() + this.A09) * 1000);
                PendingIntent pendingIntent = this.A03;
                if (pendingIntent != null) {
                    this.A00 = true;
                    long elapsedRealtime = SystemClock.elapsedRealtime() + AjS;
                    try {
                        this.A07.A02(this.A02, pendingIntent, this.A05, 2, elapsedRealtime);
                    } catch (Throwable th) {
                        this.A00 = false;
                        AnonymousClass0LU.A0L("PingUnreceivedAlarm", "alarm_failed; intervalSec=%s", th, Long.valueOf(AjS / 1000));
                    }
                }
            }
        }
        return;
    }

    public AnonymousClass0Re(Context context, Handler handler, RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass0P7 r7, AnonymousClass0OX r8, AnonymousClass0Z1 r9, String str) {
        PendingIntent pendingIntent;
        this.A05 = context;
        StringBuilder sb = new StringBuilder(A0D);
        sb.append(str);
        String packageName = context.getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            sb.append('.');
            sb.append(packageName);
        }
        String obj = sb.toString();
        this.A08 = obj;
        C09740gb A002 = r8.A00(AlarmManager.class, "alarm");
        if (A002.A01()) {
            this.A02 = (AlarmManager) A002.A00();
            this.A0A = realtimeSinceBootClock;
            this.A06 = handler;
            this.A0B = r9;
            this.A07 = r7;
            this.A09 = r9.B1e();
            this.A04 = new IDxBReceiverShape6S0100000_I2(this, 7);
            Intent intent = new Intent(obj);
            intent.setPackage(context.getPackageName());
            try {
                C16230sh r2 = new C16230sh();
                r2.A06(intent, (ClassLoader) null);
                r2.A05();
                pendingIntent = r2.A02(context, 0, 134217728);
            } catch (SecurityException unused) {
                pendingIntent = null;
            }
            this.A03 = pendingIntent;
            return;
        }
        throw new IllegalArgumentException("Cannot acquire Alarm service");
    }
}
