package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import com.facebook.endtoend.EndToEnd;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class DexLibLoader {
    public static final int LOAD_ALL_ASYNC_OPTIMIZATION = 4;
    public static final int LOAD_ALL_BETA_BUILD = 1;
    public static final int LOAD_ALL_INSTRUMENTATION_TEST = 16;
    public static final int LOAD_ALL_OPEN_ONLY = 2;
    public static final int LOAD_ALL_PEEK_REGEN = 32;
    public static final int LOAD_SECONDARY = 8;
    public static DexStore sMainDexStore;

    public final class ApkResProvider extends ResProvider {
        public static final String SECONDARY_PROGRAM_DEX_JARS = "secondary-program-dex-jars";
        public ZipFile mApkZip;
        public final Context mContext;

        public void close() {
            Fs.safeClose(this.mApkZip);
        }

        public void markRootRelative() {
            if (this.mApkZip == null) {
                Context context = this.mContext;
                try {
                    context = context.createPackageContext(context.getPackageName(), 0);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                this.mApkZip = new ZipFile(context.getApplicationInfo().sourceDir);
            }
        }

        public InputStream open(String str) {
            ZipFile zipFile = this.mApkZip;
            if (zipFile == null || DexStoreUtils.SECONDARY_DEX_MANIFEST.equals(str)) {
                return this.mContext.getAssets().open(AnonymousClass00U.A0L("secondary-program-dex-jars/", str));
            }
            ZipEntry entry = zipFile.getEntry(str);
            if (entry != null) {
                return this.mApkZip.getInputStream(entry);
            }
            throw new FileNotFoundException(AnonymousClass00U.A0L("cannot find root-relative resource: ", str));
        }

        public ApkResProvider(Context context) {
            this.mContext = context;
        }
    }

    public final class ExoPackageResProvider extends ResProvider {
        public static final String EXOPACKAGE_DIR = "/data/local/tmp/exopackage";
        public final File mDirectory;

        public InputStream open(String str) {
            return new FileInputStream(new File(this.mDirectory, str));
        }

        public ExoPackageResProvider(Context context) {
            this.mDirectory = new File(AnonymousClass00U.A0V("/data/local/tmp/exopackage/", context.getPackageName(), "/secondary-dex"));
        }
    }

    public interface ResProviderShim {
        ResProvider install(ResProvider resProvider);
    }

    public static int loadAll(Context context) {
        return loadAll(context, 1, (LightweightQuickPerformanceLogger) null);
    }

    public static ResProvider obtainResProviderInternal(Context context, boolean z) {
        ApkResProvider apkResProvider = new ApkResProvider(context);
        try {
            apkResProvider.open(DexStoreUtils.SECONDARY_DEX_MANIFEST).close();
            return apkResProvider;
        } catch (Resources.NotFoundException | FileNotFoundException unused) {
            if (z) {
                ExoPackageResProvider exoPackageResProvider = new ExoPackageResProvider(context);
                try {
                    exoPackageResProvider.open(DexStoreUtils.SECONDARY_DEX_MANIFEST).close();
                    Mlog.safeFmt("using exopackage", new Object[0]);
                    return exoPackageResProvider;
                } catch (FileNotFoundException unused2) {
                    Mlog.safeFmt("using exo res provider failed", new Object[0]);
                    return null;
                }
            }
            return null;
        }
    }

    public class CanaryLoaderImpl implements Runnable {
        public void run() {
            try {
                for (DexStore dexStoreListHead = DexStore.dexStoreListHead(); dexStoreListHead != null; dexStoreListHead = dexStoreListHead.next) {
                    DexManifest dexManifest = dexStoreListHead.mLoadedManifest;
                    if (dexManifest != null) {
                        for (DexManifest.Dex dex : dexManifest.dexes) {
                            Class.forName(dex.canaryClass);
                        }
                    }
                }
            } catch (Throwable th) {
                throw Fs.runtimeExFrom(th);
            }
        }
    }

    public static synchronized DexStore getMainDexStore() {
        DexStore dexStore;
        synchronized (DexLibLoader.class) {
            dexStore = sMainDexStore;
            if (dexStore == null) {
                throw new IllegalStateException("main dex store not loaded");
            }
        }
        return dexStore;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:17|(1:19)(1:20)|21|22|23|24|25|26|27|(9:29|(3:31|(4:33|(1:35)(2:37|(2:48|116)(1:47))|36|118)(1:117)|49)|115|(2:51|52)|53|72|(2:74|(1:76)(2:113|114))|77|(4:79|80|81|82)(5:83|(11:85|(1:87)|88|(1:90)|91|(1:93)|94|(1:96)|97|(1:99)|100)(2:101|(1:103))|104|105|106))(4:54|55|56|57)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0072 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c1 A[Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148, all -> 0x014f }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int loadAllImpl(android.content.Context r21, int r22, com.facebook.quicklog.LightweightQuickPerformanceLogger r23, com.facebook.common.dextricks.DexLibLoader.ResProviderShim r24, com.facebook.common.dextricks.DexStore.Config r25) {
        /*
            r20 = r22 & 1
            r13 = 1
            r12 = 0
            r11 = 0
            if (r20 == 0) goto L_0x0008
            r11 = 1
        L_0x0008:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "DLL.loadAll betaBuild:%s flags:0x%08x"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            r0 = r22 & 16
            r14 = r21
            r2 = r25
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.String r0 = "DLL.loadAll instrumentation test mode"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            setupMainDexStoreConfigForInstrumentationTests(r14, r2)
        L_0x002b:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r19 = r14
            goto L_0x0042
        L_0x0038:
            if (r25 == 0) goto L_0x002b
            java.lang.String r0 = "Do not specify a config outside of test mode."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x0042:
            java.lang.String r0 = r14.getPackageName()     // Catch:{ NameNotFoundException -> 0x004a }
            android.content.Context r19 = r14.createPackageContext(r0, r12)     // Catch:{ NameNotFoundException -> 0x004a }
        L_0x004a:
            java.lang.Class<com.facebook.common.dextricks.DexLibLoader> r0 = com.facebook.common.dextricks.DexLibLoader.class
            java.lang.ClassLoader r2 = r0.getClassLoader()     // Catch:{ 0Hz -> 0x0170 }
            java.lang.String r8 = "Setup multi dex took %d ms."
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ 0Hz -> 0x0170 }
            boolean r0 = X.C03380Ib.A01     // Catch:{ 0Hz -> 0x0170 }
            if (r0 == 0) goto L_0x0153
            android.os.StrictMode$VmPolicy r7 = android.os.StrictMode.getVmPolicy()     // Catch:{ 0Hz -> 0x0170 }
            if (r7 == 0) goto L_0x0066
            android.os.StrictMode$VmPolicy$Builder r3 = new android.os.StrictMode$VmPolicy$Builder     // Catch:{ 0Hz -> 0x0170 }
            r3.<init>(r7)     // Catch:{ 0Hz -> 0x0170 }
            goto L_0x006b
        L_0x0066:
            android.os.StrictMode$VmPolicy$Builder r3 = new android.os.StrictMode$VmPolicy$Builder     // Catch:{ 0Hz -> 0x0170 }
            r3.<init>()     // Catch:{ 0Hz -> 0x0170 }
        L_0x006b:
            java.lang.reflect.Method r1 = X.C03380Ib.A00     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0072 }
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0072 }
            r1.invoke(r3, r0)     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0072 }
        L_0x0072:
            android.os.StrictMode$VmPolicy r0 = r3.build()     // Catch:{ 0Hz -> 0x0170 }
            android.os.StrictMode.setVmPolicy(r0)     // Catch:{ 0Hz -> 0x0170 }
            java.lang.String r0 = "dalvik.system.BaseDexClassLoader"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            java.lang.String r0 = "pathList"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            r0.setAccessible(r13)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            java.lang.String r0 = "dalvik.system.DexPathList"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            java.lang.String r0 = "dexElements"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            r0.setAccessible(r13)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            java.lang.Object r6 = r0.get(r2)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            java.lang.String r0 = "dalvik.system.DexPathList$Element"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            java.lang.String r0 = "dexFile"
            java.lang.reflect.Field r5 = r1.getDeclaredField(r0)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            r5.setAccessible(r13)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            android.content.pm.ApplicationInfo r0 = r19.getApplicationInfo()     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            java.lang.String r4 = r0.sourceDir     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            java.lang.String r1 = "primary dex name: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r4}     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            java.lang.String.format(r1, r0)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            if (r4 == 0) goto L_0x0140
            java.io.File r0 = new java.io.File     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            r0.<init>(r4)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            boolean r16 = r0.exists()     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            int r15 = r6.length     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            r3 = 0
        L_0x00cc:
            if (r3 >= r15) goto L_0x0129
            r0 = r6[r3]     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            java.lang.Object r2 = r5.get(r0)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            dalvik.system.DexFile r2 = (dalvik.system.DexFile) r2     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            if (r2 == 0) goto L_0x0126
            java.lang.String r0 = r2.getName()     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            boolean r1 = r4.equals(r0)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            if (r1 == 0) goto L_0x00ef
            java.lang.String r1 = "Found primary dex %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
        L_0x00e8:
            java.lang.String.format(r1, r0)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            r10.add(r2)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            goto L_0x0126
        L_0x00ef:
            boolean r1 = r10.isEmpty()     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            if (r1 == 0) goto L_0x011a
            if (r16 != 0) goto L_0x011a
            if (r0 == 0) goto L_0x011a
            java.lang.String r1 = "/data/app/"
            boolean r1 = r0.startsWith(r1)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            if (r1 == 0) goto L_0x011a
            java.lang.String r1 = "/base.apk"
            boolean r1 = r0.endsWith(r1)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            if (r1 == 0) goto L_0x011a
            java.lang.String r1 = r19.getPackageName()     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            boolean r1 = r0.contains(r1)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            if (r1 == 0) goto L_0x011a
            java.lang.String r1 = "Found primary dex via search %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            goto L_0x00e8
        L_0x011a:
            java.lang.String r1 = "Found system/other dex %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            java.lang.String.format(r1, r0)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            r9.add(r2)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
        L_0x0126:
            int r3 = r3 + 1
            goto L_0x00cc
        L_0x0129:
            if (r7 == 0) goto L_0x012e
            android.os.StrictMode.setVmPolicy(r7)     // Catch:{ 0Hz -> 0x0170 }
        L_0x012e:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ 0Hz -> 0x0170 }
            long r0 = r0 - r17
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ 0Hz -> 0x0170 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ 0Hz -> 0x0170 }
            java.lang.String.format(r8, r0)     // Catch:{ 0Hz -> 0x0170 }
            goto L_0x017e
        L_0x0140:
            java.lang.String r1 = "Cannot find a primary dex name"
            X.0Hz r0 = new X.0Hz     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            r0.<init>((java.lang.String) r1)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
            throw r0     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x0148 }
        L_0x0148:
            r1 = move-exception
            X.0Hz r0 = new X.0Hz     // Catch:{ all -> 0x014f }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ all -> 0x014f }
            throw r0     // Catch:{ all -> 0x014f }
        L_0x014f:
            r2 = move-exception
            if (r7 == 0) goto L_0x015e
            goto L_0x015b
        L_0x0153:
            java.lang.String r0 = "Cannot call needed hidden apis on this platform"
            X.0Hz r2 = new X.0Hz     // Catch:{ 0Hz -> 0x0170 }
            r2.<init>((java.lang.String) r0)     // Catch:{ 0Hz -> 0x0170 }
            goto L_0x016f
        L_0x015b:
            android.os.StrictMode.setVmPolicy(r7)     // Catch:{ 0Hz -> 0x0170 }
        L_0x015e:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ 0Hz -> 0x0170 }
            long r0 = r0 - r17
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ 0Hz -> 0x0170 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ 0Hz -> 0x0170 }
            java.lang.String.format(r8, r0)     // Catch:{ 0Hz -> 0x0170 }
        L_0x016f:
            throw r2     // Catch:{ 0Hz -> 0x0170 }
        L_0x0170:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.String r0 = "failure to locate primary/auxiliary dexes: perf loss"
            com.facebook.common.dextricks.Mlog.w(r2, r0, r1)
            r10.clear()
            r9.clear()
        L_0x017e:
            java.io.File r3 = com.facebook.common.dextricks.DexStoreUtils.getMainDexStoreLocation(r14)
            android.content.pm.ApplicationInfo r0 = r19.getApplicationInfo()
            java.lang.String r0 = r0.sourceDir
            java.io.File r4 = new java.io.File
            r4.<init>(r0)
            boolean r0 = r4.exists()
            if (r0 != 0) goto L_0x01b5
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0249
            java.lang.Object r0 = r10.get(r12)
            dalvik.system.DexFile r0 = (dalvik.system.DexFile) r0
            java.lang.String r0 = r0.getName()
            java.io.File r4 = new java.io.File
            r4.<init>(r0)
            java.lang.String r0 = r4.getPath()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Main store will use %s as apk file."
            com.facebook.common.dextricks.Mlog.w(r0, r1)
        L_0x01b5:
            r0 = r24
            com.facebook.common.dextricks.ResProvider r2 = obtainResProvider(r14, r0, r11)
            if (r2 != 0) goto L_0x01cd
            java.lang.String r1 = "Nothing to do in DexLibLoader.loadAll: no resProvider"
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ all -> 0x0242 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x0242 }
            com.facebook.common.dextricks.DexErrorRecoveryInfo r0 = new com.facebook.common.dextricks.DexErrorRecoveryInfo     // Catch:{ all -> 0x0242 }
            r0.<init>()     // Catch:{ all -> 0x0242 }
            com.facebook.common.dextricks.DexErrorRecoveryInfo.setMainDexStoreLoadInformation(r0)     // Catch:{ all -> 0x0242 }
            return r12
        L_0x01cd:
            java.lang.String r1 = "opening dex store %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x0242 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x0242 }
            com.facebook.common.dextricks.DexStore r4 = com.facebook.common.dextricks.DexStore.open(r3, r4, r2, r10, r9)     // Catch:{ all -> 0x0242 }
            sMainDexStore = r4     // Catch:{ all -> 0x0242 }
            r0 = r22 & 2
            r5 = r23
            if (r0 != 0) goto L_0x022a
            r3 = 0
            if (r20 == 0) goto L_0x01e6
            r3 = 1
        L_0x01e6:
            r0 = r22 & 8
            if (r0 == 0) goto L_0x01ec
            r3 = r3 | 16
        L_0x01ec:
            r0 = r22 & 4
            if (r0 == 0) goto L_0x01f2
            r3 = r3 | 4
        L_0x01f2:
            com.facebook.endtoend.EndToEnd.A03()     // Catch:{ all -> 0x0242 }
            java.lang.String r1 = "disabling background optimization"
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ all -> 0x0242 }
            com.facebook.common.dextricks.Mlog.w(r1, r0)     // Catch:{ all -> 0x0242 }
            r3 = r3 & -5
            com.facebook.common.dextricks.DexStore$Config r0 = r4.readConfig()     // Catch:{ all -> 0x0242 }
            boolean r1 = r0.enableOatmeal     // Catch:{ all -> 0x0242 }
            r0 = r3 | 1
            if (r1 == 0) goto L_0x020a
            r0 = r3 & -2
        L_0x020a:
            r0 = r0 | 8
            com.facebook.common.dextricks.DexErrorRecoveryInfo r3 = r4.loadAll(r0, r5, r14)     // Catch:{ all -> 0x0242 }
            int r0 = r3.loadResult     // Catch:{ all -> 0x0242 }
            r0 = r0 & 8
            if (r0 == 0) goto L_0x021f
            java.lang.String r1 = "running deoptimized code"
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ all -> 0x0242 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x0242 }
            com.facebook.common.dextricks.DexErrorRecoveryInfo.sDeoptTaint = r13     // Catch:{ all -> 0x0242 }
        L_0x021f:
            java.io.File r0 = r4.getRegenFile()     // Catch:{ all -> 0x0242 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0242 }
            r3.storeRegenFilename = r0     // Catch:{ all -> 0x0242 }
            goto L_0x023b
        L_0x022a:
            java.lang.String r1 = "skipping actual loadAll as requested"
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ all -> 0x0242 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x0242 }
            r3 = 0
            r0 = r22 & 32
            if (r0 == 0) goto L_0x023b
            int r0 = r4.peekMainStoreRegenStatus(r14, r5)     // Catch:{ all -> 0x0242 }
            r12 = r12 | r0
        L_0x023b:
            com.facebook.common.dextricks.DexErrorRecoveryInfo.setMainDexStoreLoadInformation(r3)     // Catch:{ all -> 0x0242 }
            r2.close()
            return r12
        L_0x0242:
            r0 = move-exception
            if (r2 == 0) goto L_0x0248
            r2.close()     // Catch:{ all -> 0x0248 }
        L_0x0248:
            throw r0
        L_0x0249:
            java.lang.String r0 = "Cannot determine base.apk"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexLibLoader.loadAllImpl(android.content.Context, int, com.facebook.quicklog.LightweightQuickPerformanceLogger, com.facebook.common.dextricks.DexLibLoader$ResProviderShim, com.facebook.common.dextricks.DexStore$Config):int");
    }

    public static void ensureConfig(Context context, DexStore.Config config, boolean z) {
        File mainDexStoreLocation = DexStoreUtils.getMainDexStoreLocation(context);
        Fs.mkdirOrThrow(mainDexStoreLocation);
        if (config != null) {
            File file = new File(mainDexStoreLocation, DexStore.CONFIG_FILENAME);
            if (!file.exists() || z) {
                config.writeAndSync(file);
            }
        }
    }

    public static DexErrorRecoveryInfo getMainDexStoreLoadInformation() {
        return DexErrorRecoveryInfo.getMainDexStoreLoadInformation();
    }

    public static void handleUnoptimizedCodeForPerftest(Context context) {
        if (EndToEnd.A03()) {
            throw new IllegalStateException(AnonymousClass00U.A0L("In ct-scan mode, but not running optimized code. Out of disk space? Bad config? Load result: 0x", Integer.toHexString(DexErrorRecoveryInfo.getMainDexStoreLoadInformation().loadResult)));
        }
    }

    public static ResProvider obtainResProvider(Context context, ResProviderShim resProviderShim, boolean z) {
        try {
            ResProvider obtainResProviderInternal = obtainResProviderInternal(context, z);
            if (resProviderShim != null) {
                return resProviderShim.install(obtainResProviderInternal);
            }
            return obtainResProviderInternal;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setupMainDexStoreConfigForInstrumentationTests(Context context, DexStore.Config config) {
        File mainDexStoreLocation = DexStoreUtils.getMainDexStoreLocation(context);
        Fs.deleteRecursive(mainDexStoreLocation);
        Fs.mkdirOrThrow(mainDexStoreLocation);
        if (config != null) {
            config.writeAndSync(new File(mainDexStoreLocation, DexStore.CONFIG_FILENAME));
        }
    }

    public static boolean shouldSynchronouslyGenerateOatFiles() {
        EndToEnd.A03();
        return true;
    }

    public static boolean wasMainDexStoreRegenerated() {
        if ((DexErrorRecoveryInfo.getMainDexStoreLoadInformation().loadResult & 1) == 0) {
            return false;
        }
        return true;
    }

    public static synchronized int loadAll(Context context, int i, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        int loadAll;
        synchronized (DexLibLoader.class) {
            loadAll = loadAll(context, i, lightweightQuickPerformanceLogger, (ResProviderShim) null, (DexStore.Config) null);
        }
        return loadAll;
    }

    public static ResProvider obtainResProvider(Context context, boolean z) {
        return obtainResProvider(context, (ResProviderShim) null, z);
    }

    public static int loadAll(Context context, boolean z) {
        return loadAll(context, 1, (LightweightQuickPerformanceLogger) null);
    }

    public static synchronized int loadAll(Context context, int i, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, ResProviderShim resProviderShim, DexStore.Config config) {
        Throwable th;
        int loadAllImpl;
        synchronized (DexLibLoader.class) {
            if (DexErrorRecoveryInfo.getMainDexStoreLoadInformationNoThrow() == null) {
                try {
                    loadAllImpl = loadAllImpl(context, i, lightweightQuickPerformanceLogger, resProviderShim, config);
                    CanaryLoader.setInstance(new CanaryLoaderImpl());
                    if (DexErrorRecoveryInfo.sDeoptTaint) {
                        handleUnoptimizedCodeForPerftest(context);
                    }
                } catch (IOException e) {
                    th = new RuntimeException(e);
                }
            } else {
                th = new AssertionError("loadAll already loaded dex files");
                throw th;
            }
        }
        return loadAllImpl;
    }

    public static int loadAll(Context context, boolean z, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        return loadAll(context, 1, lightweightQuickPerformanceLogger);
    }
}
