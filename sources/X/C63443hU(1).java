package X;

import android.os.SystemClock;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3hU  reason: invalid class name and case insensitive filesystem */
public final class C63443hU {
    public static long A00;
    public static AnonymousClass255 A01;
    public static long A02;
    public static AnonymousClass255 A03;
    public static Set A04;
    public static final long A05 = TimeUnit.SECONDS.toMillis(15);

    public static AnonymousClass255 A00() {
        if (SystemClock.elapsedRealtime() - A02 > A05) {
            AnonymousClass255 A012 = A01(A03);
            if (A012 == null || !A012.A02) {
                A012 = null;
            }
            A03 = A012;
            A02 = SystemClock.elapsedRealtime();
        }
        return A03;
    }

    public static AnonymousClass255 A01(AnonymousClass255 r3) {
        if (r3 != null && C10170hq.A02(r3.A01)) {
            return r3;
        }
        for (AnonymousClass255 r1 : A02()) {
            if (r1 != r3 && C10170hq.A02(r1.A01)) {
                return r1;
            }
        }
        return null;
    }

    public static Set A02() {
        Set set = A04;
        LinkedHashSet linkedHashSet = set;
        if (set == null) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            linkedHashSet2.add(AnonymousClass255.KATANA);
            linkedHashSet2.add(AnonymousClass255.WAKIZASHI);
            for (AnonymousClass255 r1 : AnonymousClass255.values()) {
                if (!linkedHashSet2.contains(r1)) {
                    linkedHashSet2.add(r1);
                }
            }
            A04 = linkedHashSet2;
            linkedHashSet = linkedHashSet2;
        }
        return linkedHashSet;
    }

    public static void A03(AnonymousClass0A3 r2, String str) {
        r2.A0Q("fb4a_installed", Boolean.valueOf(A04()));
        r2.A0T("referrer", str);
    }

    public static boolean A04() {
        return AnonymousClass0wJ.A1W(A00());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r1 >= r3.A00) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(android.content.Context r5) {
        /*
            X.255 r0 = A00()
            if (r0 != 0) goto L_0x003f
            long r0 = A00
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r0
            long r1 = A05
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003a
            X.255 r0 = A01
            X.255 r3 = A01(r0)
            if (r3 == 0) goto L_0x0041
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0041
            java.lang.String r2 = r3.A01
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x002d }
            r0 = 0
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x002d }
            int r1 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x002d }
            goto L_0x002e
        L_0x002d:
            r1 = -1
        L_0x002e:
            int r0 = r3.A00
            if (r1 < r0) goto L_0x0041
        L_0x0032:
            A01 = r3
            long r0 = android.os.SystemClock.elapsedRealtime()
            A00 = r0
        L_0x003a:
            X.255 r1 = A01
            r0 = 0
            if (r1 == 0) goto L_0x0040
        L_0x003f:
            r0 = 1
        L_0x0040:
            return r0
        L_0x0041:
            r3 = 0
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63443hU.A05(android.content.Context):boolean");
    }
}
