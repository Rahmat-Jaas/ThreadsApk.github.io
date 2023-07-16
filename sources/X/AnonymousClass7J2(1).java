package X;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7J2  reason: invalid class name */
public final class AnonymousClass7J2 {
    public static final Object A00;
    public static final Method A01;
    public static final Method A02;
    public static final String SHARED_SECRETS_CLASSNAME = "sun.misc.SharedSecrets";

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0077, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0078, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0062 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0077 A[ExcHandler: ThreadDeath (r0v1 'e' java.lang.ThreadDeath A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    static {
        /*
            r6 = 0
            java.lang.String r0 = "sun.misc.SharedSecrets"
            r3 = 0
            java.lang.Class r2 = java.lang.Class.forName(r0, r3, r6)     // Catch:{ ThreadDeath -> 0x0077, all -> 0x0016 }
            java.lang.String r1 = "getJavaLangAccess"
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ ThreadDeath -> 0x0077, all -> 0x0016 }
            java.lang.reflect.Method r1 = r2.getMethod(r1, r0)     // Catch:{ ThreadDeath -> 0x0077, all -> 0x0016 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ ThreadDeath -> 0x0077, all -> 0x0016 }
            java.lang.Object r6 = r1.invoke(r6, r0)     // Catch:{ ThreadDeath -> 0x0077, all -> 0x0016 }
        L_0x0016:
            A00 = r6
            r5 = 0
            if (r6 != 0) goto L_0x0021
            r2 = r5
        L_0x001c:
            A02 = r2
            if (r6 == 0) goto L_0x0074
            goto L_0x0038
        L_0x0021:
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Class[] r4 = new java.lang.Class[]{r1, r0}
            java.lang.String r3 = "getStackTraceElement"
            r2 = 0
            java.lang.String r1 = "sun.misc.JavaLangAccess"
            r0 = 0
            java.lang.Class r0 = java.lang.Class.forName(r1, r0, r5)     // Catch:{ ThreadDeath -> 0x0077, all -> 0x001c }
            java.lang.reflect.Method r2 = r0.getMethod(r3, r4)     // Catch:{ ThreadDeath -> 0x0077, all -> 0x001c }
            goto L_0x001c
        L_0x0038:
            java.lang.String r2 = "getStackTraceDepth"
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r6 = 0
            java.lang.Class[] r1 = new java.lang.Class[]{r0}     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0074 }
            java.lang.String r0 = "sun.misc.JavaLangAccess"
            java.lang.Class r0 = java.lang.Class.forName(r0, r6, r5)     // Catch:{ ThreadDeath -> 0x0071 }
            java.lang.reflect.Method r4 = r0.getMethod(r2, r1)     // Catch:{ ThreadDeath -> 0x0071 }
            if (r4 == 0) goto L_0x0074
            r3 = 0
            java.lang.String r0 = "sun.misc.SharedSecrets"
            java.lang.Class r2 = java.lang.Class.forName(r0, r6, r5)     // Catch:{ ThreadDeath -> 0x006f, all -> 0x0062 }
            java.lang.String r1 = "getJavaLangAccess"
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ ThreadDeath -> 0x006f, all -> 0x0062 }
            java.lang.reflect.Method r1 = r2.getMethod(r1, r0)     // Catch:{ ThreadDeath -> 0x006f, all -> 0x0062 }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ ThreadDeath -> 0x006f, all -> 0x0062 }
            java.lang.Object r3 = r1.invoke(r5, r0)     // Catch:{ ThreadDeath -> 0x006f, all -> 0x0062 }
        L_0x0062:
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0074 }
            r0.<init>()     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0074 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0074 }
            r4.invoke(r3, r0)     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0074 }
            goto L_0x0073
        L_0x006f:
            r0 = move-exception
            throw r0     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0074 }
        L_0x0071:
            r0 = move-exception
            throw r0     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0074 }
        L_0x0073:
            r5 = r4
        L_0x0074:
            A01 = r5
            return
        L_0x0077:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7J2.<clinit>():void");
    }

    public static Throwable A00(Throwable th) {
        boolean z = false;
        Throwable th2 = th;
        while (true) {
            Throwable cause = th.getCause();
            if (cause == null) {
                return th;
            }
            if (cause != th2) {
                if (z) {
                    th2 = th2.getCause();
                }
                z = !z;
                th = cause;
            } else {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause);
            }
        }
    }

    public static List A01(Throwable th) {
        ArrayList A0k = C18240wQ.A0k(4);
        A0k.add(th);
        boolean z = false;
        Throwable th2 = th;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return Collections.unmodifiableList(A0k);
            }
            A0k.add(th);
            if (th != th2) {
                if (z) {
                    th2 = th2.getCause();
                }
                z = !z;
            } else {
                throw new IllegalArgumentException("Loop in causal chain detected.", th);
            }
        }
    }

    public static void A03(Throwable th) {
        Class<IOException> cls = IOException.class;
        if (cls.isInstance(th)) {
            throw cls.cast(th);
        } else if ((th instanceof RuntimeException) || (th instanceof Error)) {
            throw th;
        }
    }

    public static void A02(Throwable th) {
        th.getClass();
        if ((th instanceof RuntimeException) || (th instanceof Error)) {
            throw th;
        }
        throw C86114wI.A0k(th);
    }
}
