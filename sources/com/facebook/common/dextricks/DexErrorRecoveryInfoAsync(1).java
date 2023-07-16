package com.facebook.common.dextricks;

public final class DexErrorRecoveryInfoAsync {
    public static DexErrorRecoveryInfoAsync sMainStoreLoadInformation;
    public final Long baseAppImageSize;
    public final Long baseOdexSize;
    public final Long baseVdexSize;
    public final Long megazipAppImageSize;
    public final Boolean usingBaseAppImage;
    public final Boolean usingBaseOdex;
    public final Boolean usingBaseVdex;
    public final Boolean usingMegazipAppImage;
    public final Boolean usingMegazipOdex;

    public static synchronized DexErrorRecoveryInfoAsync getMainDexStoreLoadInformation() {
        DexErrorRecoveryInfoAsync dexErrorRecoveryInfoAsync;
        synchronized (DexErrorRecoveryInfoAsync.class) {
            dexErrorRecoveryInfoAsync = sMainStoreLoadInformation;
        }
        return dexErrorRecoveryInfoAsync;
    }

    public static synchronized void setMainDexStoreLoadInformation(DexErrorRecoveryInfoAsync dexErrorRecoveryInfoAsync) {
        synchronized (DexErrorRecoveryInfoAsync.class) {
            sMainStoreLoadInformation = dexErrorRecoveryInfoAsync;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch:{ IOException -> 0x0063 }
            r2.<init>()     // Catch:{ IOException -> 0x0063 }
            java.io.PrintWriter r3 = new java.io.PrintWriter     // Catch:{ all -> 0x005e }
            r3.<init>(r2)     // Catch:{ all -> 0x005e }
            java.lang.String r0 = "<DexErrorRecoveryInfoAsync"
            r3.append(r0)     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = " usingBaseAppImage=%s"
            java.lang.Boolean r0 = r4.usingBaseAppImage     // Catch:{ all -> 0x0059 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0059 }
            r3.format(r1, r0)     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = " usingBaseOdex=%s"
            java.lang.Boolean r0 = r4.usingBaseOdex     // Catch:{ all -> 0x0059 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0059 }
            r3.format(r1, r0)     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = " baseOdexSize=%s"
            java.lang.Long r0 = r4.baseOdexSize     // Catch:{ all -> 0x0059 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0059 }
            r3.format(r1, r0)     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = " usingMegazipAppImage=%s"
            java.lang.Boolean r0 = r4.usingMegazipAppImage     // Catch:{ all -> 0x0059 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0059 }
            r3.format(r1, r0)     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = " usingMegazipOdex=%s"
            java.lang.Boolean r0 = r4.usingMegazipOdex     // Catch:{ all -> 0x0059 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0059 }
            r3.format(r1, r0)     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = ">"
            r3.append(r0)     // Catch:{ all -> 0x0059 }
            r3.flush()     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0059 }
            r3.close()     // Catch:{ all -> 0x005e }
            r2.close()     // Catch:{ IOException -> 0x0063 }
            return r0
        L_0x0059:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x005d }
        L_0x005d:
            throw r0     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0062 }
        L_0x0062:
            throw r0     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexErrorRecoveryInfoAsync.toString():java.lang.String");
    }

    public DexErrorRecoveryInfoAsync(Boolean bool, Boolean bool2, Boolean bool3, Long l, Long l2, Long l3) {
        this.usingBaseOdex = bool;
        this.usingBaseVdex = bool2;
        this.usingBaseAppImage = bool3;
        this.baseOdexSize = l;
        this.baseVdexSize = l2;
        this.baseAppImageSize = l3;
        this.usingMegazipOdex = null;
        this.usingMegazipAppImage = null;
        this.megazipAppImageSize = null;
    }

    public DexErrorRecoveryInfoAsync(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Long l, Long l2, Long l3, Long l4) {
        this.usingBaseOdex = bool;
        this.usingBaseVdex = bool2;
        this.usingBaseAppImage = bool3;
        this.usingMegazipOdex = bool4;
        this.usingMegazipAppImage = bool5;
        this.baseOdexSize = l;
        this.baseVdexSize = l2;
        this.baseAppImageSize = l3;
        this.megazipAppImageSize = l4;
    }
}
