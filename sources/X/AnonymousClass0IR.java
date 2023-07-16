package X;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0IR  reason: invalid class name */
public final class AnonymousClass0IR implements Thread.UncaughtExceptionHandler {
    public static AnonymousClass0IR A03;
    public static Runnable A04;
    public final Object A00 = new Object();
    public final Thread.UncaughtExceptionHandler A01;
    public volatile List A02 = Collections.unmodifiableList(new ArrayList());
    public byte[] mOomReservation = null;

    public static synchronized AnonymousClass0IR A00() {
        AnonymousClass0IR r0;
        synchronized (AnonymousClass0IR.class) {
            r0 = A03;
            if (r0 == null) {
                AnonymousClass0IR r02 = new AnonymousClass0IR(Thread.getDefaultUncaughtExceptionHandler());
                A03 = r02;
                Thread.setDefaultUncaughtExceptionHandler(r02);
                r0 = A03;
            }
        }
        return r0;
    }

    public static synchronized AnonymousClass0IR A01() {
        AnonymousClass0IR r0;
        synchronized (AnonymousClass0IR.class) {
            r0 = A03;
        }
        return r0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed compute block dominance frontier
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominanceFrontier(BlockProcessor.java:302)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:79)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:47)
        Caused by: java.lang.IndexOutOfBoundsException: Index: 12, Size: 12
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeBlockDF(BlockProcessor.java:327)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominanceFrontier(BlockProcessor.java:300)
        	... 2 more
        */
    public static void A02() {
        /*
            java.lang.Runnable r0 = A04     // Catch:{ all -> 0x000f }
            if (r0 == 0) goto L_0x0007
            r0.run()     // Catch:{ all -> 0x000f }
        L_0x0007:
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x000f }
            android.os.Process.killProcess(r0)     // Catch:{ all -> 0x000f }
            goto L_0x0017
        L_0x000f:
            r2 = move-exception
            java.lang.String r1 = "ExceptionHandlerManager"
            java.lang.String r0 = "Error during exception handling"
            android.util.Log.e(r1, r0, r2)
        L_0x0017:
            r0 = 10
            java.lang.System.exit(r0)     // Catch:{ all -> 0x001d }
            goto L_0x0025
        L_0x001d:
            r2 = move-exception
            java.lang.String r1 = "ExceptionHandlerManager"
            java.lang.String r0 = "Error during exception handling"
            android.util.Log.e(r1, r0, r2)
        L_0x0025:
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IR.A02():void");
    }

    public static synchronized void A03(AnonymousClass0IT r4, int i) {
        synchronized (AnonymousClass0IR.class) {
            AnonymousClass0IR A002 = A00();
            synchronized (A002) {
                ArrayList arrayList = new ArrayList(A002.A02);
                AnonymousClass0IQ r0 = new AnonymousClass0IQ();
                r0.A01 = r4;
                r0.A00 = i;
                arrayList.add(r0);
                Collections.sort(arrayList);
                A002.A02 = Collections.unmodifiableList(arrayList);
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x005e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void uncaughtException(java.lang.Thread r8, java.lang.Throwable r9) {
        /*
            r7 = this;
            java.lang.Object r3 = r7.A00
            monitor-enter(r3)
            r0 = -10
            android.os.Process.setThreadPriority(r0)     // Catch:{ Exception -> 0x0008 }
        L_0x0008:
            r4 = 0
            r7.mOomReservation = r4     // Catch:{ all -> 0x008b }
            java.util.List r6 = r7.A02     // Catch:{ all -> 0x008b }
            r0 = 1
            int r5 = r6.size()     // Catch:{ all -> 0x005e }
            int r5 = r5 - r0
        L_0x0013:
            if (r5 < 0) goto L_0x0038
            java.lang.Object r0 = r6.get(r5)     // Catch:{ all -> 0x005e }
            X.0IQ r0 = (X.AnonymousClass0IQ) r0     // Catch:{ all -> 0x005e }
            X.0IT r0 = r0.A01     // Catch:{ all -> 0x005e }
            r0.handleUncaughtException(r8, r9, r4)     // Catch:{ all -> 0x0021 }
            goto L_0x0035
        L_0x0021:
            r2 = move-exception
            boolean r0 = r9 instanceof java.lang.OutOfMemoryError     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x002e
            java.lang.String r1 = "ExceptionHandlerManager"
            java.lang.String r0 = "Error during handling OOM"
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x005e }
            goto L_0x0035
        L_0x002e:
            java.lang.String r1 = "ExceptionHandlerManager"
            java.lang.String r0 = "Error during exception handling"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x005e }
        L_0x0035:
            int r5 = r5 + -1
            goto L_0x0013
        L_0x0038:
            A04(r9)     // Catch:{ all -> 0x0055 }
            boolean r0 = r9 instanceof X.AnonymousClass0IS     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0045
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.A01     // Catch:{ all -> 0x0055 }
            r0.uncaughtException(r8, r9)     // Catch:{ all -> 0x0055 }
            goto L_0x0083
        L_0x0045:
            java.lang.String r2 = "ExceptionHandlerManager"
            java.lang.String r1 = "Exit: "
            java.lang.String r0 = r9.getMessage()     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ all -> 0x0055 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0055 }
            goto L_0x0083
        L_0x0055:
            r2 = move-exception
            java.lang.String r1 = "ExceptionHandlerManager"
            java.lang.String r0 = "Error during exception handling"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x0087 }
            goto L_0x0083
        L_0x005e:
            A04(r9)     // Catch:{ all -> 0x007b }
            boolean r0 = r9 instanceof X.AnonymousClass0IS     // Catch:{ all -> 0x007b }
            if (r0 != 0) goto L_0x006b
            java.lang.Thread$UncaughtExceptionHandler r0 = r7.A01     // Catch:{ all -> 0x007b }
            r0.uncaughtException(r8, r9)     // Catch:{ all -> 0x007b }
            goto L_0x0083
        L_0x006b:
            java.lang.String r2 = "ExceptionHandlerManager"
            java.lang.String r1 = "Exit: "
            java.lang.String r0 = r9.getMessage()     // Catch:{ all -> 0x007b }
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ all -> 0x007b }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x007b }
            goto L_0x0083
        L_0x007b:
            r2 = move-exception
            java.lang.String r1 = "ExceptionHandlerManager"
            java.lang.String r0 = "Error during exception handling"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x0087 }
        L_0x0083:
            A02()     // Catch:{ all -> 0x008b }
            throw r4     // Catch:{ all -> 0x008b }
        L_0x0087:
            A02()     // Catch:{ all -> 0x008b }
            throw r4     // Catch:{ all -> 0x008b }
        L_0x008b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x008b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IR.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }

    public AnonymousClass0IR(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.A01 = uncaughtExceptionHandler;
        this.mOomReservation = new byte[4096];
    }

    public static void A04(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = length + 1;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
        System.arraycopy(stackTrace, 0, stackTraceElementArr, 0, length);
        stackTraceElementArr[i - 1] = new StackTraceElement("Z", "init", AnonymousClass0MI.A01(), -1);
        th.setStackTrace(stackTraceElementArr);
    }
}
