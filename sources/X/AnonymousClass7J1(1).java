package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.7J1  reason: invalid class name */
public final class AnonymousClass7J1 {
    public static volatile Handler A00;
    public static volatile Handler A01;

    public static Handler A00() {
        if (A01 == null) {
            synchronized (AnonymousClass7J1.class) {
                if (A01 == null) {
                    A01 = AnonymousClass0wJ.A0F();
                }
            }
        }
        return A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r2 == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A01(java.util.concurrent.Future r7, int r8) {
        /*
            java.lang.String r5 = ", "
            java.lang.String r4 = "Unable to restore priority: "
            int r0 = android.os.Process.myTid()
            r6 = 1
            r3 = 0
            boolean r2 = X.C86114wI.A1T(r8, r0)
            boolean r0 = r7.isDone()
            if (r0 != 0) goto L_0x0017
            r1 = 1
            if (r2 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            boolean r0 = A04()
            if (r0 == 0) goto L_0x0035
            if (r1 == 0) goto L_0x0035
            int r0 = android.os.Process.myTid()
            int r0 = android.os.Process.getThreadPriority(r0)
            int r3 = android.os.Process.getThreadPriority(r8)
        L_0x002c:
            if (r0 >= r3) goto L_0x0036
            android.os.Process.setThreadPriority(r8, r0)     // Catch:{ SecurityException -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            int r0 = r0 + 1
            goto L_0x002c
        L_0x0035:
            r6 = 0
        L_0x0036:
            java.lang.Object r0 = r7.get()     // Catch:{ ExecutionException -> 0x004e, InterruptedException | CancellationException -> 0x004c }
            if (r6 == 0) goto L_0x004b
            android.os.Process.setThreadPriority(r8, r3)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0040 }
            goto L_0x004a
        L_0x0040:
            r1 = move-exception
            java.lang.String r0 = X.AnonymousClass00U.A01(r8, r3, r4, r5)
            java.lang.RuntimeException r0 = X.C86154wM.A0h(r0, r1)
            throw r0
        L_0x004a:
            return r0
        L_0x004b:
            return r0
        L_0x004c:
            r1 = move-exception
            goto L_0x0063
        L_0x004e:
            r2 = move-exception
            java.lang.Throwable r1 = r2.getCause()     // Catch:{ all -> 0x006c }
            boolean r0 = r1 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x005a
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1     // Catch:{ all -> 0x006c }
            goto L_0x006b
        L_0x005a:
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x006c }
            java.lang.RuntimeException r1 = X.C86154wM.A0h(r0, r2)     // Catch:{ all -> 0x006c }
            goto L_0x006b
        L_0x0063:
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x006c }
            java.lang.RuntimeException r1 = X.C86154wM.A0h(r0, r1)     // Catch:{ all -> 0x006c }
        L_0x006b:
            throw r1     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            if (r6 == 0) goto L_0x007d
            android.os.Process.setThreadPriority(r8, r3)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0073 }
            throw r0
        L_0x0073:
            r1 = move-exception
            java.lang.String r0 = X.AnonymousClass00U.A01(r8, r3, r4, r5)
            java.lang.RuntimeException r0 = X.C86154wM.A0h(r0, r1)
            throw r0
        L_0x007d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7J1.A01(java.util.concurrent.Future, int):java.lang.Object");
    }

    public static void A03(String str) {
        if (!C103406Zb.A00 && !A04()) {
            if (str == null) {
                str = AnonymousClass00U.A0L(AnonymousClass000.A00(737), Thread.currentThread().getName());
            }
            throw C18180wK.A0a(str);
        }
    }

    public static void A02(Runnable runnable) {
        if (A04()) {
            runnable.run();
        } else {
            A00().post(runnable);
        }
    }

    public static boolean A04() {
        return C18180wK.A1Z(Looper.getMainLooper().getThread(), Thread.currentThread());
    }
}
