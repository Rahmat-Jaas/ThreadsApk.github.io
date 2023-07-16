package X;

import android.content.Context;
import android.text.format.Time;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Pattern;

/* renamed from: X.0tf  reason: invalid class name and case insensitive filesystem */
public final class C16740tf implements AnonymousClass0IT {
    public static final AtomicInteger A0P = new AtomicInteger();
    public static final ReentrantReadWriteLock A0Q = new ReentrantReadWriteLock();
    public static final Pattern A0R = Pattern.compile("^Cmd line: (.*)", 8);
    public final Time A00 = new Time();
    public final AnonymousClass09N A01 = new AnonymousClass09N();
    public final ArrayList A02 = new ArrayList();
    public final Map A03 = new HashMap();
    public final Set A04 = new HashSet();
    public final AtomicReference A05 = new AtomicReference();
    public final AtomicReference A06 = new AtomicReference();
    public volatile long A07;
    public volatile long A08;
    public volatile Context A09;
    public volatile String A0A;
    public volatile String A0B;
    public volatile Map A0C;
    public volatile boolean A0D;
    public volatile long A0E;
    public volatile AnonymousClass07s A0F;
    public volatile C016707z A0G;
    public volatile C09620fp A0H;
    public volatile C019008w A0I;
    public volatile File A0J;
    public volatile String A0K;
    public volatile String A0L;
    public volatile boolean A0M;
    public volatile boolean A0N;
    public volatile byte[] A0O;

    public final void handleUncaughtException(Thread thread, Throwable th, AnonymousClass0IN r6) {
        new C016207r[1][0] = C016207r.A06;
        AnonymousClass0LU.A0B("ACRA", "Trying to get ACRA reports but ACRA is not initialized.");
        throw new NullPointerException("getMaxPendingJavaCrashReports");
    }

    static {
        new Object();
    }

    public static void A00(String str, String str2) {
        AnonymousClass091.A00.Cjp(str, str2, new Object[0]);
    }

    public final void A01(C015507f r3, String str) {
        Map map = this.A03;
        synchronized (map) {
            map.put(str, r3);
        }
    }

    public C16740tf() {
        if (AnonymousClass0M6.A00 != null) {
            AnonymousClass0LU.A0C("ErrorReporter", "ErrorReportingDiagnosticData.setInstance already set.");
            return;
        }
        AnonymousClass0M6.A00 = new C17120uK();
        C17140uM r0 = new C17140uM();
        synchronized (AnonymousClass0ML.class) {
            AnonymousClass0ML.A00 = r0;
        }
    }
}
