package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.Locale;

/* renamed from: X.0cI  reason: invalid class name and case insensitive filesystem */
public final class C07850cI implements AnonymousClass0IT {
    public static int A00 = 2;
    public static int A01 = 5;
    public static int A02 = 30;
    public static int A03 = 40;
    public static int A04 = 45000;
    public static int A05 = -1;
    public static int A06 = -1;
    public static int A07;
    public static long A08;
    public static AnonymousClass0IM A09;
    public static AnonymousClass0IM A0A;
    public static C07850cI A0B;
    public static C05470Tw A0C;
    public static C05470Tw A0D;
    public static boolean A0E;

    public static C05460Tv A00(String str) {
        if (str != null) {
            try {
                C05460Tv r0 = (C05460Tv) Class.forName(str).newInstance();
                if (r0 != null) {
                    return r0;
                }
            } catch (Throwable th) {
                Log.e("CatchMeIfYouCan", "instantiating custom remedy class failed; continuing", th);
            }
        }
        return new C05460Tv();
    }

    public static void A01(Context context) {
        int i;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (next.uid == myUid && (i = next.pid) != myPid) {
                String.format(Locale.US, "killing sibling process %d (%s)", new Object[]{Integer.valueOf(i), next.processName});
                Process.killProcess(next.pid);
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0060 */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.content.Context r9, long r10, boolean r12) {
        /*
            java.lang.String r4 = "CatchMeIfYouCan"
            if (r12 == 0) goto L_0x0009
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
        L_0x0007:
            r6 = 0
            goto L_0x000d
        L_0x0009:
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x0007
        L_0x000d:
            java.io.File r3 = X.C05470Tw.A00(r9, r12)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0061 }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x0061 }
            int r2 = r1.readInt()     // Catch:{ all -> 0x005c }
            r1.close()     // Catch:{ all -> 0x0061 }
            long r0 = r3.lastModified()     // Catch:{ all -> 0x0061 }
            X.0Tw r3 = new X.0Tw     // Catch:{ all -> 0x0061 }
            r3.<init>(r0, r2)     // Catch:{ all -> 0x0061 }
            long r0 = r3.A01
            long r10 = r10 - r0
            boolean r0 = A0E
            if (r0 == 0) goto L_0x0048
            java.util.Locale r5 = java.util.Locale.US
            int r0 = r3.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            java.lang.String r0 = "previous crash remedy level %d applied %d milliseconds ago (remedy applications forgotten after %d milliseconds)"
            java.lang.String.format(r5, r0, r1)
        L_0x0048:
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0054
            java.lang.String r0 = "remedy is from the future!"
            android.util.Log.w(r4, r0)
            goto L_0x0075
        L_0x0054:
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0075
            X.C05470Tw.A01(r9, r12)
            goto L_0x0076
        L_0x005c:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0060 }
        L_0x0060:
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r1 = move-exception
            java.io.File r0 = X.C05470Tw.A00(r9, r12)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = "unable to read remedy log file"
            android.util.Log.w(r4, r0, r1)
        L_0x0071:
            X.C05470Tw.A01(r9, r12)
            r3 = r6
        L_0x0075:
            r6 = r3
        L_0x0076:
            if (r12 == 0) goto L_0x007b
            A0C = r6
            return
        L_0x007b:
            A0D = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07850cI.A02(android.content.Context, long, boolean):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleUncaughtException(java.lang.Thread r6, java.lang.Throwable r7, X.AnonymousClass0IN r8) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.AnonymousClass0IS
            if (r0 != 0) goto L_0x007b
            int r0 = A07
            r0 = r0 & 2
            if (r0 == 0) goto L_0x002c
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = A08
            long r3 = r3 - r0
            int r0 = A04     // Catch:{ all -> 0x0024 }
            long r1 = (long) r0     // Catch:{ all -> 0x0024 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x001e
            X.0IM r0 = A09     // Catch:{ all -> 0x0024 }
            r0.A00()     // Catch:{ all -> 0x0024 }
            goto L_0x002c
        L_0x001e:
            X.0IM r0 = A0A     // Catch:{ all -> 0x0024 }
            r0.A00()     // Catch:{ all -> 0x0024 }
            goto L_0x002c
        L_0x0024:
            r2 = move-exception
            java.lang.String r1 = "CatchMeIfYouCan"
            java.lang.String r0 = "unable to record crash in crash log!"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x002c }
        L_0x002c:
            boolean r0 = A0E     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x005b
            java.lang.String r2 = "Uncaught exception in '"
            X.0KY r0 = X.AnonymousClass0KY.A00()     // Catch:{ all -> 0x005b }
            java.lang.String r1 = r0.A02()     // Catch:{ all -> 0x005b }
            java.lang.String r0 = "':"
            java.lang.String r0 = X.AnonymousClass00U.A0V(r2, r1, r0)     // Catch:{ all -> 0x005b }
            java.lang.String r4 = "CatchMeIfYouCan"
            android.util.Log.e(r4, r0)     // Catch:{ all -> 0x005b }
            java.lang.String r1 = android.util.Log.getStackTraceString(r7)     // Catch:{ all -> 0x005b }
            java.lang.String r0 = "\n"
            java.lang.String[] r3 = r1.split(r0)     // Catch:{ all -> 0x005b }
            int r2 = r3.length     // Catch:{ all -> 0x005b }
            r1 = 0
        L_0x0051:
            if (r1 >= r2) goto L_0x005b
            r0 = r3[r1]     // Catch:{ all -> 0x005b }
            android.util.Log.e(r4, r0)     // Catch:{ all -> 0x005b }
            int r1 = r1 + 1
            goto L_0x0051
        L_0x005b:
            int r0 = A07
            r0 = r0 & 1
            java.lang.String r1 = "CatchMeIfYouCan"
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "CatchMeIfYouCan is killing this process"
            android.util.Log.e(r1, r0)
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            r0 = 10
            java.lang.System.exit(r0)
        L_0x0074:
            goto L_0x0074
        L_0x0076:
            java.lang.String r0 = "Not killing process because SILENT_EXIT flag is not set."
            android.util.Log.e(r1, r0)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07850cI.handleUncaughtException(java.lang.Thread, java.lang.Throwable, X.0IN):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed compute block dominance frontier
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominanceFrontier(BlockProcessor.java:302)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:79)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:47)
        Caused by: java.lang.IndexOutOfBoundsException: Index: 32, Size: 32
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeBlockDF(BlockProcessor.java:327)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominanceFrontier(BlockProcessor.java:300)
        	... 2 more
        */
    public static void A03(android.content.Context r7, java.lang.String r8, int r9, int r10, long r11, boolean r13) {
        /*
            X.0Tv r2 = A00(r8)
            java.lang.String r3 = "number_of_crashes"
            if (r13 == 0) goto L_0x001e
            int r0 = A06
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.Map r0 = java.util.Collections.singletonMap(r3, r0)
            X.0Tx r3 = r2.A03(r7, r0, r9, r10)
        L_0x0017:
            boolean r0 = r3.A01
            java.lang.String r2 = "CatchMeIfYouCan"
            if (r0 == 0) goto L_0x006f
            goto L_0x002e
        L_0x001e:
            int r0 = A05
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.Map r0 = java.util.Collections.singletonMap(r3, r0)
            X.0Tx r3 = r2.A02(r7, r0, r9, r10)
            goto L_0x0017
        L_0x002e:
            X.0Tw r4 = new X.0Tw     // Catch:{ IOException -> 0x0069 }
            r4.<init>(r11, r9)     // Catch:{ IOException -> 0x0069 }
            java.io.File r6 = X.C05470Tw.A00(r7, r13)     // Catch:{ IOException -> 0x0069 }
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0069 }
            r5.<init>(r6, r0)     // Catch:{ IOException -> 0x0069 }
            int r0 = r4.A00     // Catch:{ all -> 0x0064 }
            r5.writeInt(r0)     // Catch:{ all -> 0x0064 }
            long r0 = r5.getFilePointer()     // Catch:{ all -> 0x0064 }
            r5.setLength(r0)     // Catch:{ all -> 0x0064 }
            r5.close()     // Catch:{ IOException -> 0x0069 }
            long r0 = r4.A01     // Catch:{ IOException -> 0x0069 }
            boolean r0 = r6.setLastModified(r0)     // Catch:{ IOException -> 0x0069 }
            if (r0 != 0) goto L_0x005c
            java.lang.String r1 = "CrashLoopRemedyLog"
            java.lang.String r0 = "unable to set remedy log last modified timestamp"
            android.util.Log.w(r1, r0)     // Catch:{ IOException -> 0x0069 }
        L_0x005c:
            if (r13 == 0) goto L_0x0061
            A0C = r4     // Catch:{ IOException -> 0x0069 }
            goto L_0x006f
        L_0x0061:
            A0D = r4     // Catch:{ IOException -> 0x0069 }
            goto L_0x006f
        L_0x0064:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0068 }
        L_0x0068:
            throw r0     // Catch:{ IOException -> 0x0069 }
        L_0x0069:
            r1 = move-exception
            java.lang.String r0 = "error recording remedy log"
            android.util.Log.w(r2, r0, r1)
        L_0x006f:
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x0090
            A01(r7)     // Catch:{ all -> 0x0077 }
            goto L_0x007d
        L_0x0077:
            r1 = move-exception
            java.lang.String r0 = "error killing sibling processes"
            android.util.Log.w(r2, r0, r1)
        L_0x007d:
            java.lang.String r0 = "CatchMeIfYouCan is killing this process"
            android.util.Log.e(r2, r0)
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            r0 = 10
            java.lang.System.exit(r0)
        L_0x008e:
            goto L_0x008e
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07850cI.A03(android.content.Context, java.lang.String, int, int, long, boolean):void");
    }
}
