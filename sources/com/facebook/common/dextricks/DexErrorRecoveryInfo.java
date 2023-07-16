package com.facebook.common.dextricks;

import java.io.File;
import java.io.PrintWriter;

public final class DexErrorRecoveryInfo {
    public static volatile boolean sDeoptTaint;
    public static DexErrorRecoveryInfo sMainStoreLoadInformation;
    public String dex2oatCmdLine;
    public boolean dexoptDuringColdStart;
    public Throwable fallbackCause;
    public int hacksDesired;
    public int hacksInstalled;
    public long loadAllTime;
    public int loadResult;
    public long odexLastModified;
    public String odexSchemeName;
    public long odexSize;
    public Throwable regenRetryCause;
    public String storeRegenFilename;
    public long vdexLastModified;
    public long vdexSize;
    public Throwable xdexFailureCause;

    public static synchronized DexErrorRecoveryInfo getMainDexStoreLoadInformation() {
        DexErrorRecoveryInfo dexErrorRecoveryInfo;
        synchronized (DexErrorRecoveryInfo.class) {
            dexErrorRecoveryInfo = sMainStoreLoadInformation;
            if (dexErrorRecoveryInfo == null) {
                throw new AssertionError("main dex store not yet loaded");
            }
        }
        return dexErrorRecoveryInfo;
    }

    public static synchronized DexErrorRecoveryInfo getMainDexStoreLoadInformationNoThrow() {
        DexErrorRecoveryInfo dexErrorRecoveryInfo;
        synchronized (DexErrorRecoveryInfo.class) {
            dexErrorRecoveryInfo = sMainStoreLoadInformation;
        }
        return dexErrorRecoveryInfo;
    }

    public static synchronized void setMainDexStoreLoadInformation(DexErrorRecoveryInfo dexErrorRecoveryInfo) {
        synchronized (DexErrorRecoveryInfo.class) {
            sMainStoreLoadInformation = dexErrorRecoveryInfo;
        }
    }

    public long getLastCompilationTime() {
        String str = this.storeRegenFilename;
        if (str == null) {
            return 0;
        }
        return new File(str).lastModified();
    }

    public boolean getRegenerated() {
        if ((this.loadResult & 1) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x00c9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x00ce */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r5 = this;
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch:{ IOException -> 0x00cf }
            r2.<init>()     // Catch:{ IOException -> 0x00cf }
            java.io.PrintWriter r3 = new java.io.PrintWriter     // Catch:{ all -> 0x00ca }
            r3.<init>(r2)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "<DexErrorRecoveryInfo"
            r3.append(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = " loadResult=%x"
            int r0 = r5.loadResult     // Catch:{ all -> 0x00c5 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00c5 }
            r3.format(r1, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = " odexSchemeName=%s"
            java.lang.String r0 = r5.odexSchemeName     // Catch:{ all -> 0x00c5 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00c5 }
            r3.format(r1, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = " dexoptDuringColdStart=%b"
            boolean r0 = r5.dexoptDuringColdStart     // Catch:{ all -> 0x00c5 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00c5 }
            r3.format(r1, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = " odexSize=%d"
            long r0 = r5.odexSize     // Catch:{ all -> 0x00c5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00c5 }
            r3.format(r4, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = " odexLastModified=%d"
            long r0 = r5.odexLastModified     // Catch:{ all -> 0x00c5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00c5 }
            r3.format(r4, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = " dex2oatCmdLine=%s"
            java.lang.String r0 = r5.dex2oatCmdLine     // Catch:{ all -> 0x00c5 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00c5 }
            r3.format(r1, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = " vdexSize=%d"
            long r0 = r5.vdexSize     // Catch:{ all -> 0x00c5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00c5 }
            r3.format(r4, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = " vdexLastModified=%d"
            long r0 = r5.vdexLastModified     // Catch:{ all -> 0x00c5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00c5 }
            r3.format(r4, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = " hacksDesired=%d"
            int r0 = r5.hacksDesired     // Catch:{ all -> 0x00c5 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00c5 }
            r3.format(r1, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = " hacksInstalled=%d"
            int r0 = r5.hacksInstalled     // Catch:{ all -> 0x00c5 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00c5 }
            r3.format(r1, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "regenRetryCause"
            java.lang.Throwable r0 = r5.regenRetryCause     // Catch:{ all -> 0x00c5 }
            printExOrNull(r3, r1, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "fallbackCause"
            java.lang.Throwable r0 = r5.fallbackCause     // Catch:{ all -> 0x00c5 }
            printExOrNull(r3, r1, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "xdexFailureCause"
            java.lang.Throwable r0 = r5.xdexFailureCause     // Catch:{ all -> 0x00c5 }
            printExOrNull(r3, r1, r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = ">"
            r3.append(r0)     // Catch:{ all -> 0x00c5 }
            r3.flush()     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00c5 }
            r3.close()     // Catch:{ all -> 0x00ca }
            r2.close()     // Catch:{ IOException -> 0x00cf }
            return r0
        L_0x00c5:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            throw r0     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            throw r0     // Catch:{ IOException -> 0x00cf }
        L_0x00cf:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexErrorRecoveryInfo.toString():java.lang.String");
    }

    public static boolean deoptTaint() {
        return sDeoptTaint;
    }

    public static void printExOrNull(PrintWriter printWriter, String str, Throwable th) {
        String str2;
        printWriter.format(" %s=", new Object[]{str});
        if (th == null) {
            str2 = "null";
        } else {
            printWriter.append("[");
            th.printStackTrace(printWriter);
            str2 = "]";
        }
        printWriter.append(str2);
    }

    public static void setDeoptTaint(boolean z) {
        sDeoptTaint = z;
    }
}
