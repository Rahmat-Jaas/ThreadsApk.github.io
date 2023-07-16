package X;

import android.app.ActivityManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.0MI  reason: invalid class name */
public final class AnonymousClass0MI {
    public static final List A00 = new ArrayList();
    public static final Set A01 = new HashSet();
    public static final Set A02 = new HashSet();
    public static final ExecutorService A03 = Executors.newSingleThreadExecutor();
    public static volatile AnonymousClass0Z2 A04;
    public static volatile String A05;
    public static volatile boolean A06;

    public static String A00() {
        if (A04 == null) {
            return "";
        }
        return A04.A02;
    }

    public static String A01() {
        String str;
        if (A04 == null || (str = A04.A04) == null) {
            return "unknown";
        }
        return str;
    }

    public static synchronized void A02() {
        synchronized (AnonymousClass0MI.class) {
            if (!(A04 == null || A04 == null)) {
                A04.A00("vma_webview_reserved_freed");
            }
        }
    }

    public static synchronized void A03(AnonymousClass0MD r2) {
        synchronized (AnonymousClass0MI.class) {
            A01.add(r2);
        }
    }

    public static synchronized void A04(AnonymousClass0MF r4, boolean z) {
        synchronized (AnonymousClass0MI.class) {
            A02.add(r4);
            if (z && A06) {
                HashSet hashSet = new HashSet();
                hashSet.add(r4);
                A03.execute(new AnonymousClass0MB(hashSet));
            }
        }
    }

    public static void A05(AnonymousClass0MP r1) {
        if (A04 != null) {
            C04520Nz.A00(new C06350Yy(r1));
        }
    }

    public static void A06(AnonymousClass0MP r1, String str) {
        if (A04 != null) {
            C04520Nz.A00(new AnonymousClass0Z0(r1, str));
        }
    }

    public static boolean A07() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        if (runningAppProcessInfo.importance == 100) {
            return true;
        }
        return false;
    }

    public static boolean A08() {
        if (A04 == null) {
            return false;
        }
        return A04.A05;
    }
}
