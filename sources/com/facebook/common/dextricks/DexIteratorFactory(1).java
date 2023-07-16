package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import X.C14400pL;
import X.C14420pO;
import X.C14550pe;
import android.content.Context;
import com.facebook.common.dextricks.SuperpackInputDexIterator;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;

public class DexIteratorFactory {
    public static final String SECONDARY_XZS_FILENAME = "secondary.dex.jar.xzs";
    public static final String XZS_EXTENSION = ".dex.jar.xzs";
    public final ResProvider mResProvider;

    private SuperpackInputDexIterator openSuperpackDexIterator(DexManifest dexManifest, C14400pL r8, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        SuperpackInputDexIterator.Builder builder = new SuperpackInputDexIterator.Builder(dexManifest, lightweightQuickPerformanceLogger);
        String archiveExtension = SuperpackInputDexIterator.getArchiveExtension(builder);
        for (int i = 0; i < dexManifest.superpackFiles; i++) {
            builder.addRawArchive(this.mResProvider.open(AnonymousClass00U.A0S("store-", archiveExtension, i)));
        }
        for (int i2 = 0; i2 < dexManifest.dexes.length; i2++) {
            builder.assignDexToArchive(i2, i2 % dexManifest.superpackFiles);
        }
        if (r8 != null) {
            builder.patchingStrategy = r8;
        }
        return builder.build();
    }

    public InputDexIterator openDexIterator(String str, DexManifest dexManifest, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, Context context) {
        synchronized (C14550pe.class) {
        }
        return openDexIterator(str, dexManifest, (C14420pO) null, lightweightQuickPerformanceLogger, context);
    }

    public DexIteratorFactory(ResProvider resProvider) {
        this.mResProvider = resProvider;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.common.dextricks.InputDexIterator openDexIterator(java.lang.String r9, com.facebook.common.dextricks.DexManifest r10, X.C14420pO r11, com.facebook.quicklog.LightweightQuickPerformanceLogger r12, android.content.Context r13) {
        /*
            r8 = this;
            r5 = r12
            if (r12 == 0) goto L_0x000d
            if (r11 == 0) goto L_0x000d
            java.lang.String r1 = "toString"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
        L_0x000c:
            throw r0
        L_0x000d:
            com.facebook.common.dextricks.DexStore.findOpened((java.lang.String) r9)
            r4 = 0
            if (r11 == 0) goto L_0x002b
            r3 = 47448065(0x2d40001, float:3.1150603E-37)
            if (r12 == 0) goto L_0x001b
            r12.markerStart(r3)
        L_0x001b:
            r2 = 2
            java.lang.String r1 = "getStrategy"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0024 }
            r0.<init>(r1)     // Catch:{ all -> 0x0024 }
            throw r0     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r0 = move-exception
            if (r12 == 0) goto L_0x000c
            r12.markerEnd(r3, r2)
            throw r0
        L_0x002b:
            r3 = r10
            int r0 = r10.superpackFiles
            if (r0 <= 0) goto L_0x0035
            com.facebook.common.dextricks.SuperpackInputDexIterator r2 = r8.openSuperpackDexIterator(r10, r4, r12)
            return r2
        L_0x0035:
            if (r9 == 0) goto L_0x0046
            java.lang.String r0 = "dex"
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = ".dex.jar.xzs"
            java.lang.String r2 = r9.concat(r0)     // Catch:{ all -> 0x007c }
            goto L_0x0048
        L_0x0046:
            java.lang.String r2 = "secondary.dex.jar.xzs"
        L_0x0048:
            com.facebook.common.dextricks.ResProvider r0 = r8.mResProvider     // Catch:{ FileNotFoundException -> 0x0061 }
            java.io.InputStream r7 = r0.open(r2)     // Catch:{ FileNotFoundException -> 0x0061 }
            if (r7 == 0) goto L_0x0062
            java.lang.String r1 = "using solid xz dex store at %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r2}     // Catch:{ all -> 0x0073 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x0073 }
            com.facebook.common.dextricks.ResProvider r6 = r8.mResProvider     // Catch:{ all -> 0x0073 }
            com.facebook.common.dextricks.SolidXzInputDexIterator r2 = new com.facebook.common.dextricks.SolidXzInputDexIterator     // Catch:{ all -> 0x0073 }
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0073 }
            goto L_0x007a
        L_0x0061:
            r7 = r4
        L_0x0062:
            java.lang.String r1 = "using discrete file inputs for store, no file at %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r2}     // Catch:{ all -> 0x0073 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x0073 }
            com.facebook.common.dextricks.ResProvider r0 = r8.mResProvider     // Catch:{ all -> 0x0073 }
            com.facebook.common.dextricks.DiscreteFileInputDexIterator r2 = new com.facebook.common.dextricks.DiscreteFileInputDexIterator     // Catch:{ all -> 0x0073 }
            r2.<init>(r10, r4, r12, r0)     // Catch:{ all -> 0x0073 }
            goto L_0x007b
        L_0x0073:
            r0 = move-exception
            if (r7 == 0) goto L_0x000c
            com.facebook.common.dextricks.Fs.safeClose((java.io.Closeable) r7)
            throw r0
        L_0x007a:
            return r2
        L_0x007b:
            return r2
        L_0x007c:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexIteratorFactory.openDexIterator(java.lang.String, com.facebook.common.dextricks.DexManifest, X.0pO, com.facebook.quicklog.LightweightQuickPerformanceLogger, android.content.Context):com.facebook.common.dextricks.InputDexIterator");
    }
}
