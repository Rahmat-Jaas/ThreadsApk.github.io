package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.3hy  reason: invalid class name and case insensitive filesystem */
public final class C63643hy {
    public static boolean A00;
    public static boolean A01;
    public static Handler A02;

    public static Handler A00() {
        if (A02 == null) {
            synchronized (C63643hy.class) {
                if (A02 == null) {
                    A02 = AnonymousClass0wJ.A0F();
                }
            }
        }
        return A02;
    }

    public static void A01() {
        if (!(!A08())) {
            throw C18180wK.A0a("This operation can't be run on UI thread.");
        }
    }

    public static void A02() {
        A07("This operation must be run on UI thread.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        if (r0 != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(java.lang.Runnable r4) {
        /*
            boolean r0 = A00
            r2 = 0
            if (r0 != 0) goto L_0x001e
            boolean r1 = A01
            boolean r0 = A08()
            if (r1 == 0) goto L_0x0014
            if (r0 == 0) goto L_0x001e
        L_0x0010:
            r4.run()
            return
        L_0x0014:
            if (r0 != 0) goto L_0x0010
            android.os.Handler r0 = A00()
            r0.post(r4)
            return
        L_0x001e:
            android.os.Handler r0 = A00()
            r0.postDelayed(r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63643hy.A04(java.lang.Runnable):void");
    }

    public static void A03(Runnable runnable) {
        A00().removeCallbacks(runnable);
    }

    public static void A05(Runnable runnable) {
        A00().post(runnable);
    }

    public static void A06(Runnable runnable, long j) {
        A00().postDelayed(runnable, j);
    }

    public static void A07(String str) {
        if (!A08()) {
            throw C18180wK.A0a(str);
        }
    }

    public static boolean A08() {
        return C18180wK.A1Z(Looper.getMainLooper(), Looper.myLooper());
    }
}
