package X;

import android.app.ActivityThread;
import android.os.Handler;
import android.util.SparseArray;
import java.lang.reflect.Field;

/* renamed from: X.0Ey  reason: invalid class name and case insensitive filesystem */
public final class C03220Ey {
    public static ActivityThread A03;
    public static Handler.Callback A04;
    public static Handler A05;
    public static C03220Ey A06;
    public static Field A07;
    public static final Handler.Callback A08 = new C03210Ex();
    public static final AnonymousClass0K9 A09 = new AnonymousClass0K9("ActivityThreadHooker");
    public static final Object A0A = new Object();
    public static volatile boolean A0B;
    public static volatile boolean A0C;
    public final SparseArray A00 = new SparseArray();
    public final Object A01 = new Object();
    public final C03410If A02;

    /* JADX WARNING: Removed duplicated region for block: B:39:0x007a A[Catch:{ ClassCastException | IllegalAccessException -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0083 A[Catch:{ ClassCastException | IllegalAccessException -> 0x0057 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C03220Ey A00(X.C03410If r7) {
        /*
            r6 = 0
            boolean r0 = A0C
            if (r0 == 0) goto L_0x0008
            X.0Ey r0 = A06
            return r0
        L_0x0008:
            java.lang.Object r5 = A0A
            monitor-enter(r5)
            boolean r0 = A0C     // Catch:{ all -> 0x008e }
            if (r0 != 0) goto L_0x008a
            android.app.ActivityThread r2 = X.AnonymousClass0Ep.A00()     // Catch:{ all -> 0x008e }
            r4 = 0
            if (r2 != 0) goto L_0x0020
            X.0K9 r2 = A09     // Catch:{ all -> 0x008e }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "Could not find ActivityThread"
        L_0x001c:
            r2.A07(r0, r1)     // Catch:{ all -> 0x008e }
            goto L_0x0073
        L_0x0020:
            A03 = r2     // Catch:{ all -> 0x008e }
            java.lang.Class r1 = r2.getClass()     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "mH"
            java.lang.reflect.Field r0 = r7.A0H(r6, r1, r6, r0)     // Catch:{ Exception -> 0x0069 }
            java.lang.Object r3 = r0.get(r2)     // Catch:{ Exception -> 0x0069 }
            android.os.Handler r3 = (android.os.Handler) r3     // Catch:{ Exception -> 0x0069 }
            if (r3 != 0) goto L_0x003b
            X.0K9 r2 = A09     // Catch:{ all -> 0x008e }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "Got a null ActivityThread Handler mH"
            goto L_0x001c
        L_0x003b:
            A05 = r3     // Catch:{ all -> 0x008e }
            java.lang.Class<android.os.Handler> r2 = android.os.Handler.class
            java.lang.String r1 = "mCallback"
            java.lang.Class<android.os.Handler$Callback> r0 = android.os.Handler.Callback.class
            java.lang.reflect.Field r1 = r7.A0H(r6, r2, r0, r1)     // Catch:{ Exception -> 0x0060 }
            java.lang.Object r0 = r1.get(r3)     // Catch:{ Exception -> 0x0060 }
            android.os.Handler$Callback r0 = (android.os.Handler.Callback) r0     // Catch:{ Exception -> 0x0060 }
            A07 = r1     // Catch:{ all -> 0x008e }
            A04 = r0     // Catch:{ all -> 0x008e }
            android.os.Handler$Callback r0 = A08     // Catch:{ ClassCastException | IllegalAccessException -> 0x0057 }
            r1.set(r3, r0)     // Catch:{ ClassCastException | IllegalAccessException -> 0x0057 }
            goto L_0x0075
        L_0x0057:
            r2 = move-exception
            X.0K9 r1 = A09     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "Could not get hook ActivityThread Handler callback"
            r1.A04(r0, r2)     // Catch:{ all -> 0x008e }
            goto L_0x0073
        L_0x0060:
            r2 = move-exception
            X.0K9 r1 = A09     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "Could not get ActivityThread Handler callback"
            r1.A04(r0, r2)     // Catch:{ all -> 0x008e }
            goto L_0x0073
        L_0x0069:
            r3 = move-exception
            X.0K9 r2 = A09     // Catch:{ all -> 0x008e }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "Could not get ActivityThread Handler mH"
            r2.A0B(r3, r0, r1)     // Catch:{ all -> 0x008e }
        L_0x0073:
            r2 = 0
            goto L_0x0076
        L_0x0075:
            r2 = 1
        L_0x0076:
            r1 = 1
            r0 = 0
            if (r2 != 0) goto L_0x007b
            r0 = 1
        L_0x007b:
            A0B = r0     // Catch:{ all -> 0x008e }
            A0C = r1     // Catch:{ all -> 0x008e }
            boolean r0 = A0B     // Catch:{ all -> 0x008e }
            if (r0 != 0) goto L_0x008a
            X.0Ey r0 = new X.0Ey     // Catch:{ all -> 0x008e }
            r0.<init>(r7)     // Catch:{ all -> 0x008e }
            A06 = r0     // Catch:{ all -> 0x008e }
        L_0x008a:
            X.0Ey r0 = A06     // Catch:{ all -> 0x008e }
            monitor-exit(r5)     // Catch:{ all -> 0x008e }
            return r0
        L_0x008e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x008e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03220Ey.A00(X.0If):X.0Ey");
    }

    public C03220Ey(C03410If r2) {
        this.A02 = r2;
    }
}
