package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.redex.IDxBReceiverShape6S0100000_I2;
import com.facebook.redex.IDxReporterShape810S0100000_I2;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.MediaCodecVideoEncoder;

/* renamed from: X.0eG  reason: invalid class name and case insensitive filesystem */
public final class C08770eG {
    public static final String A0Q = AnonymousClass00U.A0L("KeepaliveManager", ".ACTION_INEXACT_ALARM.");
    public static final List A0R = Collections.unmodifiableList(new C11010jK());
    public static final String A0S = AnonymousClass00U.A0L("KeepaliveManager", ".ACTION_BACKUP_ALARM.");
    public static final String A0T = AnonymousClass00U.A0L("KeepaliveManager", ".ACTION_EXACT_ALARM.");
    public long A00;
    public long A01;
    public long A02 = -1;
    public boolean A03;
    public final int A04;
    public final long A05;
    public final AlarmManager A06;
    public final PendingIntent A07;
    public final PendingIntent A08;
    public final PendingIntent A09;
    public final BroadcastReceiver A0A;
    public final BroadcastReceiver A0B;
    public final BroadcastReceiver A0C;
    public final Context A0D;
    public final Handler A0E;
    public final RealtimeSinceBootClock A0F;
    public final AnonymousClass0P7 A0G;
    public final AnonymousClass0MO A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final boolean A0L;
    public final C16240si A0M = new IDxReporterShape810S0100000_I2(this, 0);
    public final String A0N;
    public final AtomicInteger A0O;
    public volatile Runnable A0P;

    private PendingIntent A00(Context context, Intent intent) {
        try {
            C16230sh r1 = new C16230sh();
            r1.A06(intent, context.getClassLoader());
            r1.A05();
            r1.A08 = this.A0M;
            return r1.A02(context, 0, 134217728);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public final synchronized void A04() {
        PendingIntent pendingIntent;
        if (this.A03) {
            this.A03 = false;
            PendingIntent pendingIntent2 = this.A09;
            if (pendingIntent2 != null) {
                this.A0G.A00(this.A06, pendingIntent2);
            }
            if (!this.A0L && (pendingIntent = this.A07) != null) {
                this.A0G.A00(this.A06, pendingIntent);
            }
            PendingIntent pendingIntent3 = this.A08;
            if (pendingIntent3 != null) {
                this.A0G.A00(this.A06, pendingIntent3);
            }
        }
        this.A00 = this.A05;
        this.A02 = -1;
    }

    public final synchronized void A05() {
        A04();
        if (this.A0P != null) {
            AnonymousClass0P7 r2 = this.A0G;
            Context context = this.A0D;
            r2.A03(this.A0B, context);
            r2.A03(this.A0C, context);
            r2.A03(this.A0A, context);
        }
    }

    public final synchronized void A06() {
        PendingIntent pendingIntent;
        long j;
        PendingIntent pendingIntent2;
        long j2 = ((long) this.A0O.get()) * 1000;
        long j3 = this.A05;
        if (j2 >= j3) {
            boolean z = false;
            if (j2 >= j3) {
                z = true;
            }
            AnonymousClass0g1.A00(z);
            Iterator it = A0R.iterator();
            while (true) {
                if (!it.hasNext()) {
                    j2 = j3;
                    break;
                }
                long longValue = ((Long) it.next()).longValue();
                if (j2 >= longValue) {
                    j2 = longValue;
                    break;
                }
            }
        }
        this.A00 = j2;
        this.A01 = SystemClock.elapsedRealtime() + j2;
        if (this.A03) {
            PendingIntent pendingIntent3 = this.A08;
            if (pendingIntent3 != null) {
                this.A0G.A00(this.A06, pendingIntent3);
            }
            if (!this.A0L && (pendingIntent2 = this.A07) != null) {
                this.A0G.A00(this.A06, pendingIntent2);
            }
        } else {
            this.A03 = true;
        }
        try {
            long j4 = this.A00;
            if (j4 < j3) {
                pendingIntent = this.A08;
                j = this.A01;
            } else {
                if (this.A02 != j4) {
                    this.A02 = j4;
                    PendingIntent pendingIntent4 = this.A09;
                    if (pendingIntent4 != null) {
                        this.A0G.A00(this.A06, pendingIntent4);
                    }
                    A03(pendingIntent4, this, this.A01);
                }
                if (!this.A0L) {
                    pendingIntent = this.A07;
                    j = this.A01 + MediaCodecVideoEncoder.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS;
                }
            }
            A02(pendingIntent, this, j);
        } catch (Throwable unused) {
        }
    }

    private String A01(Context context, String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(this.A0N);
        String packageName = context.getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            sb.append('.');
            sb.append(packageName);
        }
        return sb.toString();
    }

    public static void A02(PendingIntent pendingIntent, C08770eG r4, long j) {
        String str;
        String str2;
        if (pendingIntent != null) {
            try {
                Context context = r4.A0D;
                AlarmManager alarmManager = r4.A06;
                if (!C02600Cb.A00(alarmManager, context)) {
                    A03(pendingIntent, r4, j);
                } else if (r4.A0L) {
                    alarmManager.setExactAndAllowWhileIdle(2, j, pendingIntent);
                } else {
                    alarmManager.setExact(2, j, pendingIntent);
                }
            } catch (SecurityException e) {
                e = e;
                str = "KeepaliveManager";
                str2 = "Failed to set alarm";
                AnonymousClass0LU.A0F(str, str2, e);
            } catch (NullPointerException e2) {
                e = e2;
                str = "KeepaliveManager";
                str2 = "set alarm NullPointerException";
                AnonymousClass0LU.A0F(str, str2, e);
            } catch (RuntimeException e3) {
                e = e3;
                if (e.getCause() instanceof DeadObjectException) {
                    str = "KeepaliveManager";
                    str2 = "set alarm DeadObjectException";
                    AnonymousClass0LU.A0F(str, str2, e);
                }
                throw e;
            }
        }
    }

    public static void A03(PendingIntent pendingIntent, C08770eG r3, long j) {
        String str;
        String str2;
        if (pendingIntent != null) {
            try {
                if (r3.A04 < 23 || !r3.A0L) {
                    r3.A06.set(2, j, pendingIntent);
                } else {
                    r3.A0G.A01(r3.A06, pendingIntent, 2, j);
                }
            } catch (SecurityException e) {
                e = e;
                str = "KeepaliveManager";
                str2 = "Failed to set alarm";
                AnonymousClass0LU.A0F(str, str2, e);
            } catch (NullPointerException e2) {
                e = e2;
                str = "KeepaliveManager";
                str2 = "set alarm NullPointerException";
                AnonymousClass0LU.A0F(str, str2, e);
            } catch (RuntimeException e3) {
                e = e3;
                if (e.getCause() instanceof DeadObjectException) {
                    str = "KeepaliveManager";
                    str2 = "set alarm DeadObjectException";
                    AnonymousClass0LU.A0F(str, str2, e);
                }
                throw e;
            }
        }
    }

    public C08770eG(Context context, Handler handler, RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass0P7 r6, AnonymousClass0OX r7, AnonymousClass0MO r8, String str, AtomicInteger atomicInteger, long j) {
        this.A0D = context;
        this.A0N = str;
        this.A0L = AnonymousClass0s5.A02(context.getPackageName());
        this.A0O = atomicInteger;
        this.A05 = j;
        C09740gb A002 = r7.A00(AlarmManager.class, "alarm");
        if (A002.A01()) {
            this.A06 = (AlarmManager) A002.A00();
            this.A0F = realtimeSinceBootClock;
            this.A04 = Build.VERSION.SDK_INT;
            this.A0E = handler;
            this.A0G = r6;
            this.A0H = r8;
            this.A0B = new IDxBReceiverShape6S0100000_I2(this, 4);
            String A012 = A01(context, A0T);
            this.A0J = A012;
            this.A08 = A00(context, new Intent(A012));
            this.A0C = new IDxBReceiverShape6S0100000_I2(this, 5);
            String A013 = A01(context, A0Q);
            this.A0K = A013;
            this.A09 = A00(context, new Intent(A013));
            this.A0A = new IDxBReceiverShape6S0100000_I2(this, 6);
            String A014 = A01(context, A0S);
            this.A0I = A014;
            this.A07 = A00(context, new Intent(A014));
            return;
        }
        throw new IllegalArgumentException("Cannot acquire Alarm service");
    }
}
