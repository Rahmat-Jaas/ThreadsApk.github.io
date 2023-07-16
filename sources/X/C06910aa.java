package X;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;
import com.facebook.redex.IDxEHandlerShape806S0100000_I2;
import java.io.File;
import java.util.Map;

/* renamed from: X.0aa  reason: invalid class name and case insensitive filesystem */
public final class C06910aa implements AnonymousClass0PC {
    public static MultiSignalANRDetector A0B;
    public static C06890aY A0C;
    public static boolean A0D;
    public int A00 = 0;
    public boolean A01;
    public final C019809f A02;
    public final C06870aW A03;
    public final C04090Mf A04;
    public final C04100Mg A05;
    public final C06930ac A06;
    public final AnonymousClass0Q4 A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public static void A00(C04050Mb r1, C04100Mg r2, AnonymousClass0ND r3) {
        AnonymousClass0PC r0 = (AnonymousClass0PC) r2.A03(C06910aa.class);
        if (r0 == null) {
            AnonymousClass0LU.A0C("lacrima", "Cannot find registered detector");
        } else {
            r2.A05(r1, r3, r0);
        }
    }

    public static void A01(C06910aa r16, C16650tV r17) {
        AnonymousClass0NQ r11;
        File file;
        synchronized (C06910aa.class) {
            C06910aa r4 = r16;
            AnonymousClass0Q4 r12 = r4.A07;
            C06040Xk r2 = r12.A03;
            C002801h.A02(r2, "Did you call SessionManager.init()?");
            AnonymousClass0NN r3 = new AnonymousClass0NN(r2.A00.A02);
            char A022 = r3.A02();
            boolean A012 = AnonymousClass0NO.A01(A022);
            C16650tV r5 = r17;
            String name = r5.name();
            C16650tV r10 = C16650tV.DURING_ANR;
            if (r5 == r10 || r5 == C16650tV.SIGQUIT_RECEIVED_AM_CONFIRMED_MT_BLOCKED || r5 == C16650tV.SIGQUIT_RECEIVED_AM_CONFIRMED_MT_UNBLOCKED || r5 == C16650tV.SIGQUIT_RECEIVED_AM_EXPIRED_MT_BLOCKED || r5 == C16650tV.SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_BLOCKED || r5 == C16650tV.SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_UNBLOCKED || r5 == C16650tV.NO_SIGQUIT_AM_CONFIRMED_MT_BLOCKED || r5 == C16650tV.NO_SIGQUIT_AM_CONFIRMED_MT_UNBLOCKED || r5 == C16650tV.ANR_RECOVERED) {
                switch (r5.ordinal()) {
                    case 1:
                    case 4:
                        r11 = AnonymousClass0NQ.A04;
                        break;
                    case 3:
                        r11 = AnonymousClass0NQ.A0A;
                        break;
                    case 6:
                        r11 = AnonymousClass0NQ.A08;
                        break;
                    case 7:
                        r11 = AnonymousClass0NQ.A07;
                        break;
                    case 8:
                        r11 = AnonymousClass0NQ.A05;
                        break;
                    case 9:
                        r11 = AnonymousClass0NQ.A06;
                        break;
                    default:
                        r11 = AnonymousClass0NQ.A09;
                        break;
                }
                r2.A0A(r11);
                if (r5 == r10 || r5 == C16650tV.SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_BLOCKED || r5 == C16650tV.NO_SIGQUIT_AM_CONFIRMED_MT_BLOCKED) {
                    A0D = true;
                    int i = r4.A00 + 1;
                    r4.A00 = i;
                    C06870aW r7 = r4.A03;
                    r7.A02 = i;
                    File file2 = r7.A0T.A04;
                    C002801h.A02(file2, "Did you call SessionManager.init()?");
                    r7.A0B = new File(file2, AnonymousClass00U.A0S("anr_report_", ".dmp", r7.A02));
                    r4.A01 = A012;
                    boolean z = r4.A0A;
                    if (!z || A012) {
                        C04170Mn r52 = new C04170Mn((Throwable) null);
                        try {
                            r52.A02(AnonymousClass0MU.A1K, Long.valueOf(System.currentTimeMillis() / 1000));
                            r52.A00(AnonymousClass0MU.A01, r4.A01);
                            r52.A03(AnonymousClass0MU.A3d, name);
                            r52.A02(AnonymousClass0MU.A2O, Long.valueOf(SystemClock.uptimeMillis() - r12.A01));
                            r52.A03(AnonymousClass0MU.A3e, String.valueOf(r11.A01));
                            r52.A03(AnonymousClass0MU.A5E, Character.toString(A022));
                            r52.A03(AnonymousClass0MU.A5D, r3.A05(r4.A02));
                        } catch (Throwable th) {
                            C04790Pd.A00();
                            r52.A03(AnonymousClass0MU.A5Z, th.getMessage());
                        }
                        C04100Mg r32 = r4.A05;
                        AnonymousClass0ND r0 = AnonymousClass0ND.CRITICAL_REPORT;
                        r32.A0C(r0, r4);
                        r32.A06(r52, r0, r4);
                        r32.A0B(r0, r4);
                        if (r4.A09 && ((r4.A01 || !z) && (file = r7.A0B) != null)) {
                            AnonymousClass0MY r02 = AnonymousClass0MY.A02;
                            AnonymousClass0ND r1 = AnonymousClass0ND.LARGE_REPORT;
                            r52.A04(r02, r1, file);
                            r32.A0C(r1, r4);
                            AnonymousClass0ND r8 = r1;
                            C06910aa r9 = r4;
                            C04100Mg r6 = r32;
                            C04170Mn r72 = r52;
                            r6.A08(r72, r8, r9, r4.As3(), (Integer) null, r4.A00);
                            r32.A0B(r1, r4);
                        }
                    }
                }
            } else if (r5 == C16650tV.NO_ANR_DETECTED) {
                A0D = false;
                r4.A04.C9M(AnonymousClass0ND.LARGE_REPORT, r4);
                r2.A0A(AnonymousClass0NQ.A0B);
                r4.A01 = false;
            } else {
                AnonymousClass0LU.A0O("lacrima", "Ignored anr state: %s", name);
            }
        }
    }

    public final void start() {
        C017108d r2;
        C06890aY r10 = new C06890aY(this);
        A0C = r10;
        C06930ac r4 = this.A06;
        String str = this.A08;
        C06870aW r9 = this.A03;
        Application application = r4.A00;
        AnonymousClass0NG r6 = new AnonymousClass0NG(application, new Handler(Looper.getMainLooper()), r9, r10, str, application.getDir("traces", 0).getPath(), r4.A02);
        AnonymousClass0N5 r3 = r4.A01;
        Map map = MultiSignalANRDetector.A0d;
        MultiSignalANRDetector multiSignalANRDetector = (MultiSignalANRDetector) map.get(r6);
        if (multiSignalANRDetector == null) {
            multiSignalANRDetector = new MultiSignalANRDetector(r3, r6);
            map.put(r6, multiSignalANRDetector);
        }
        multiSignalANRDetector.A0C = AnonymousClass00U.A0L("MultiSignalANRDetector", "Lacrima");
        multiSignalANRDetector.A09 = new C06920ab(r4);
        new Thread(new AnonymousClass0PG(multiSignalANRDetector)).start();
        A0B = multiSignalANRDetector;
        AnonymousClass0LU.A0O("lacrima", "Start AnrDetector... %s", multiSignalANRDetector.getClass().getName());
        MultiSignalANRDetector multiSignalANRDetector2 = A0B;
        synchronized (multiSignalANRDetector2.A0W) {
            if (!multiSignalANRDetector2.A0K) {
                AnonymousClass0LU.A0C(multiSignalANRDetector2.A0C, "Starting");
                multiSignalANRDetector2.A0K = true;
                multiSignalANRDetector2.A02 = SystemClock.uptimeMillis();
                C017408g r102 = multiSignalANRDetector2.A0A;
                C05010Qj r92 = multiSignalANRDetector2.A0R;
                AnonymousClass0LU.A0O("ProcessAnrErrorMonitor", "startMonitoring with delay: %d", 0L);
                ActivityManager activityManager = (ActivityManager) r102.A04.getSystemService("activity");
                synchronized (r102) {
                    C017108d r22 = r102.A01;
                    if (r22 == null || r22.A07 != null) {
                        Integer num = r102.A02;
                        Integer num2 = AnonymousClass006.A00;
                        if (!(num == num2 || (r2 = r102.A01) == null)) {
                            Object obj = r2.A05;
                            synchronized (obj) {
                                try {
                                    r2.A02 = true;
                                    obj.notifyAll();
                                } catch (Throwable th) {
                                    th = th;
                                }
                            }
                        }
                        long j = r102.A00 + 1;
                        r102.A00 = j;
                        C017108d r7 = new C017108d(activityManager, r92, r102, j);
                        r102.A01 = r7;
                        if (r92 != null) {
                            num2 = AnonymousClass006.A01;
                        }
                        r102.A02 = num2;
                        r7.start();
                    } else if (r92 != null) {
                        C017108d r23 = r102.A01;
                        Object obj2 = r23.A05;
                        synchronized (obj2) {
                            try {
                                r23.A07 = r92;
                                obj2.notifyAll();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    } else {
                        th = new IllegalArgumentException("Listener cannot be null");
                        throw th;
                    }
                }
                multiSignalANRDetector2.A0Q.post(new AnonymousClass08Q(multiSignalANRDetector2, multiSignalANRDetector2.A0V.A00));
            }
        }
        AnonymousClass0IR.A03(new IDxEHandlerShape806S0100000_I2(this, 0), 100);
    }

    public C06910aa(C019809f r2, C04090Mf r3, C04100Mg r4, C06930ac r5, AnonymousClass0Q4 r6, String str, C04560Oe r8, C04560Oe r9, C04560Oe r10, boolean z, boolean z2) {
        this.A07 = r6;
        this.A05 = r4;
        this.A06 = r5;
        this.A08 = str;
        this.A0A = z;
        this.A09 = z2;
        this.A02 = r2;
        this.A04 = r3;
        this.A03 = new C06870aW(r6, r8, r9, r10);
    }

    public final /* synthetic */ C06820aQ As3() {
        return null;
    }

    public final AnonymousClass0PD Awx() {
        return AnonymousClass0PD.ANR;
    }
}
