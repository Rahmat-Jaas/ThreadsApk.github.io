package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import X.AnonymousClass0JR;
import X.C03500Iz;
import X.C03750Kp;
import X.C03760Kq;
import X.C13850oP;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.MultiDexClassLoader;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.facebook.common.dextricks.storer.Storer;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.VMRuntime;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public class OdexSchemeOreo extends OdexScheme {
    public static final Set sForceUnpackSet = new HashSet();
    public static final Map sOurAddedDexElements = new HashMap();
    public static C03760Kq sRegisteredClassLoaderCallback;
    public Context mContext;
    public HashMap mDexNameMap;
    public int mNumDexes;
    public LightweightQuickPerformanceLogger mQplCollector;
    public long mStorer;
    public IOException[] mSuppressedExceptions;
    public File mZipFile;

    public final class OreoCompiler extends OdexScheme.Compiler {
        public HashMap mDexNameMap;
        public long mStorer;

        public void compile(InputDex inputDex) {
            C13850oP.A01(32, "OdexSchemeOreo.compile", 180903662);
            try {
                String str = (String) this.mDexNameMap.get(inputDex.dex.hash);
                if (str != null) {
                    Storer.start(this.mStorer, str, 4);
                    long j = this.mStorer;
                    InputStream dexContents = inputDex.getDexContents();
                    byte[] bArr = new byte[32768];
                    while (true) {
                        int read = dexContents.read(bArr);
                        if (read >= 0) {
                            Storer.write(j, bArr, read);
                        } else {
                            Storer.finish(this.mStorer);
                            return;
                        }
                    }
                } else {
                    throw new RuntimeException("Unexpected input dex!");
                }
            } finally {
                C13850oP.A00(32, -2078960940);
            }
        }

        public OreoCompiler(long j, HashMap hashMap) {
            this.mStorer = j;
            this.mDexNameMap = hashMap;
        }
    }

    public OdexSchemeOreo(DexManifest.Dex[] dexArr, File file, Context context, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        super(1, new String[]{file.getName()});
        this.mContext = context;
        this.mZipFile = file;
        this.mQplCollector = lightweightQuickPerformanceLogger;
        this.mDexNameMap = makeNameMap(dexArr);
        this.mNumDexes = dexArr.length;
    }

    public static HashMap makeNameMap(DexManifest.Dex[] dexArr) {
        String str;
        int length = dexArr.length;
        HashMap hashMap = new HashMap(length);
        for (int i = 0; i < length; i++) {
            String str2 = dexArr[i].hash;
            if (i != 0) {
                str = AnonymousClass00U.A0S("classes", DexManifest.DEX_EXT, i + 1);
            } else {
                str = "classes.dex";
            }
            hashMap.put(str2, str);
        }
        return hashMap;
    }

    public void configureClassLoader(File file, MultiDexClassLoader.Configuration configuration) {
    }

    public String getSchemeName() {
        return "OdexSchemeOreo";
    }

    public void serializeDex2ChecksumMap(File file) {
        Object[] objArr;
        String str;
        try {
            ZipFile zipFile = new ZipFile(this.mZipFile);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            HashMap hashMap = new HashMap();
            while (entries.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                if (zipEntry != null) {
                    hashMap.put(zipEntry.getName(), Integer.valueOf((int) zipEntry.getCrc()));
                }
            }
            zipFile.close();
            if (!hashMap.isEmpty()) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(file.getParentFile(), AnonymousClass00U.A0L(this.mZipFile.getName(), ".checksum")));
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    objectOutputStream.writeObject(hashMap);
                    objectOutputStream.close();
                    fileOutputStream.close();
                } catch (IOException unused) {
                    Mlog.w("fail to write checksum file ", new Object[0]);
                }
            } else {
                objArr = new Object[0];
                str = "dexname2ChecksumMap has nothing";
                Mlog.w(str, objArr);
            }
        } catch (ZipException e) {
            objArr = new Object[]{e};
            str = "Megazip file cannot be opened as a ZipFile, exception %s";
        } catch (IOException e2) {
            objArr = new Object[]{e2};
            str = "Megazip file io failed in serializeDex2ChecksumMap %s";
        }
    }

    private String buildPrimaryDexDecoyFilename() {
        return AnonymousClass00U.A0V("p-", getPrimaryDexIdentifierString(this.mContext), ".zip");
    }

    public static void enableTracingIfNeeded() {
        C03750Kp A00;
        if (ClassTracingLogger.sEnabled && (A00 = C03750Kp.A00()) != null && sRegisteredClassLoaderCallback == null) {
            C03500Iz r0 = new C03500Iz();
            sRegisteredClassLoaderCallback = r0;
            A00.A01(r0);
        }
    }

    private File getProfileFileAndInfo(boolean z) {
        File parentFile = this.mZipFile.getParentFile();
        if (parentFile == null) {
            return null;
        }
        File profileFile = getProfileFile(parentFile);
        if (profileFile != null && z && AnonymousClass0JR.A06) {
            serializeDex2ChecksumMap(profileFile);
        }
        return profileFile;
    }

    public static boolean isUnpackRequested(String str) {
        Set set = sForceUnpackSet;
        if (!set.contains(str)) {
            return false;
        }
        set.remove(str);
        return true;
    }

    private void registerCodeAndProfileBgDexopt() {
        if (Build.VERSION.SDK_INT == 29) {
            registerCodeAndProfileBgDexoptWithPrimary();
            return;
        }
        BaseDexClassLoader baseDexClassLoader = (BaseDexClassLoader) OdexSchemeOreo.class.getClassLoader();
        boolean isXiaomiDevice = isXiaomiDevice();
        if (isXiaomiDevice) {
            Achilles.simulateReportClassLoaderChainR(baseDexClassLoader, this.mContext.getPackageName(), VMRuntime.getRuntime().vmInstructionSet(), this.mContext.getPackageManager(), isXiaomiDevice);
        } else {
            Achilles.reportClassLoaderChain(baseDexClassLoader);
        }
    }

    private void registerCodeAndProfileBgDexoptWithPrimary() {
        BaseDexClassLoader baseDexClassLoader = (BaseDexClassLoader) OdexSchemeOreo.class.getClassLoader();
        File file = new File(getMainDexStoreLocation(), buildPrimaryDexDecoyFilename());
        if (!file.exists()) {
            try {
                createDecoy(file, this.mContext.getApplicationInfo().publicSourceDir);
            } catch (IOException e) {
                Mlog.w(e, "Unable to unpack decoy, continuing without!!!!", new Object[0]);
            }
        }
        String A0V = AnonymousClass00U.A0V(file.getAbsolutePath(), File.pathSeparator, this.mZipFile.getAbsolutePath());
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseDexClassLoader);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(A0V);
        Achilles.simulateReportClassLoaderChainQ(new String[]{this.mZipFile.getAbsolutePath()}, baseDexClassLoader, arrayList, arrayList2, this.mContext.getPackageName(), VMRuntime.getRuntime().vmInstructionSet(), this.mContext.getPackageManager(), isXiaomiDevice());
    }

    public static Object[] removeFromOldElements(Class cls, Object[] objArr, Object obj) {
        int length;
        if (!(obj == null || objArr == null || (length = objArr.length) == 0)) {
            int i = 0;
            for (Object obj2 : objArr) {
                if (obj == obj2) {
                    Object[] objArr2 = (Object[]) Array.newInstance(cls, length - 1);
                    int i2 = 0;
                    do {
                        Object obj3 = objArr[i];
                        if (obj != obj3) {
                            objArr2[i2] = obj3;
                            i2++;
                        }
                        i++;
                    } while (i < length);
                    return objArr2;
                }
            }
        }
        return objArr;
    }

    public static void requestUnpack(String str) {
        sForceUnpackSet.add(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r2.A04 == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setupErrorReportingFields() {
        /*
            X.0M5 r3 = X.AnonymousClass0M6.A00
            if (r3 == 0) goto L_0x0032
            com.facebook.common.dextricks.OdexSchemeOreo$1 r1 = new com.facebook.common.dextricks.OdexSchemeOreo$1
            r1.<init>()
            java.lang.String r0 = "multiDexClassLoader"
            r3.CYX(r0, r1)
            X.0Kp r2 = X.C03750Kp.A07
            if (r2 == 0) goto L_0x001d
            r1 = r2
            monitor-enter(r1)
            boolean r0 = r2.A04     // Catch:{ all -> 0x0017 }
            goto L_0x001a
        L_0x0017:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x001a:
            monitor-exit(r1)
            if (r0 != 0) goto L_0x002d
        L_0x001d:
            java.lang.Class<com.facebook.common.dextricks.OdexSchemeOreo> r0 = com.facebook.common.dextricks.OdexSchemeOreo.class
            java.lang.ClassLoader r2 = r0.getClassLoader()
            if (r2 != 0) goto L_0x002d
            java.lang.String r1 = ""
        L_0x0027:
            java.lang.String r0 = "oreoClassLoader"
            r3.CYW(r0, r1)
            return
        L_0x002d:
            java.lang.String r1 = r2.toString()
            goto L_0x0027
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeOreo.setupErrorReportingFields():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.IOException[] threadSafeAddDexPath(dalvik.system.BaseDexClassLoader r12, java.io.File r13) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 0
            r0 = 33
            if (r1 < r0) goto L_0x000a
            r13.setWritable(r6)
        L_0x000a:
            java.lang.String r0 = "dalvik.system.DexPathList"
            java.lang.Class r5 = java.lang.Class.forName(r0)
            java.lang.String r0 = "dalvik.system.DexPathList$Element"
            java.lang.Class r11 = java.lang.Class.forName(r0)
            java.lang.Class<dalvik.system.BaseDexClassLoader> r2 = dalvik.system.BaseDexClassLoader.class
            java.lang.Class<java.util.List> r3 = java.util.List.class
            java.lang.Class<java.io.File> r1 = java.io.File.class
            r9 = 1
            java.lang.Class<java.lang.ClassLoader> r0 = java.lang.ClassLoader.class
            java.lang.Class[] r1 = new java.lang.Class[]{r3, r1, r3, r0}
            java.lang.String r0 = "makeDexElements"
            java.lang.reflect.Method r3 = r5.getDeclaredMethod(r0, r1)
            r3.setAccessible(r9)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r9)
            r0.add(r13)
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r8, r12}
            java.lang.Object r10 = r3.invoke(r1, r0)
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            if (r10 == 0) goto L_0x00c1
            int r4 = r10.length
            if (r4 != r9) goto L_0x00c1
            r0 = r10[r6]
            java.lang.Object r1 = recordAddedDexElement(r13, r0)
            java.lang.String r0 = "pathList"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)
            r0.setAccessible(r9)
            java.lang.Object r7 = r0.get(r12)
            java.lang.String r0 = "dexElements"
            java.lang.reflect.Field r3 = r5.getDeclaredField(r0)
            r3.setAccessible(r9)
            java.lang.Object r2 = r3.get(r7)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            if (r2 == 0) goto L_0x0086
            int r0 = r2.length
            if (r0 <= 0) goto L_0x0076
            java.lang.Object[] r2 = removeFromOldElements(r11, r2, r1)
            if (r2 == 0) goto L_0x0086
        L_0x0076:
            int r1 = r2.length
            if (r1 <= 0) goto L_0x0086
            int r0 = r1 + 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r11, r0)
            java.lang.System.arraycopy(r2, r6, r0, r6, r1)
            java.lang.System.arraycopy(r10, r6, r0, r1, r4)
            r10 = r0
        L_0x0086:
            r3.set(r7, r10)
            java.lang.String r0 = "dexElementsSuppressedExceptions"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r0)
            r5.setAccessible(r9)
            int r4 = r8.size()
            if (r4 <= 0) goto L_0x00ba
            java.io.IOException[] r0 = new java.io.IOException[r4]
            java.lang.Object[] r0 = r8.toArray(r0)
            java.io.IOException[] r0 = (java.io.IOException[]) r0
            java.lang.Object r3 = r5.get(r7)
            java.io.IOException[] r3 = (java.io.IOException[]) r3
            if (r3 == 0) goto L_0x00b6
            int r2 = r3.length
            if (r2 <= 0) goto L_0x00b6
            int r1 = r2 + r4
            java.io.IOException[] r1 = new java.io.IOException[r1]
            java.lang.System.arraycopy(r3, r6, r1, r6, r2)
            java.lang.System.arraycopy(r0, r6, r1, r2, r4)
            r0 = r1
        L_0x00b6:
            r5.set(r7, r0)
            return r0
        L_0x00ba:
            java.lang.Object r0 = r5.get(r7)
            java.io.IOException[] r0 = (java.io.IOException[]) r0
            return r0
        L_0x00c1:
            java.lang.String r1 = "got null or too large array"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeOreo.threadSafeAddDexPath(dalvik.system.BaseDexClassLoader, java.io.File):java.io.IOException[]");
    }

    public void finalizeZip() {
        long j = this.mStorer;
        if (j != 0) {
            Storer.cleanup(j);
            this.mStorer = 0;
        }
    }

    public File getMainDexStoreLocation() {
        try {
            return DexStoreUtils.getMainDexStoreLocation(this.mContext);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public File getProfileFile(File file) {
        File file2 = new File(file, OdexSchemeArtTurbo.OREO_ODEX_DIR);
        if (file2.exists() || file2.mkdir()) {
            File file3 = new File(file2, AnonymousClass00U.A0L(this.mZipFile.getName(), ".cur.prof"));
            try {
                if (file3.createNewFile()) {
                    Mlog.w("Created new profile file: %s", file3);
                }
                return file3;
            } catch (IOException e) {
                DexTricksErrorReporter.reportSampledSoftError("RegisterProf", "Failed to touch new profile file", e);
                return null;
            }
        } else {
            StringBuilder sb = new StringBuilder("Failed to mkdir for prof dir: ");
            sb.append(file2);
            DexTricksErrorReporter.reportSampledSoftError("RegisterProf", sb.toString(), (Throwable) null);
            return null;
        }
    }

    public void initializeClassLoader() {
        RuntimeException th;
        Throwable e;
        Object obj;
        ClassLoader classLoader = OdexSchemeOreo.class.getClassLoader();
        if (classLoader instanceof BaseDexClassLoader) {
            if (!DalvikInternals.toggleBlockDex2Oat(true)) {
                DexTricksErrorReporter.reportSampledSoftError("FBDex101", "Failed to block dex2oat", (Throwable) null);
            }
            try {
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.mQplCollector;
                if (lightweightQuickPerformanceLogger != null) {
                    lightweightQuickPerformanceLogger.markerStart(8914508);
                }
                boolean isXiaomiDevice = isXiaomiDevice();
                if (isXiaomiDevice) {
                    try {
                        obj = Achilles.getDexLoadReporter();
                        Achilles.setDexLoadReporter((Object) null);
                    } catch (Throwable th2) {
                        th = th2;
                        obj = null;
                    }
                } else {
                    obj = null;
                }
                try {
                    this.mSuppressedExceptions = threadSafeAddDexPath((BaseDexClassLoader) classLoader, this.mZipFile);
                    LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = this.mQplCollector;
                    if (lightweightQuickPerformanceLogger2 != null) {
                        lightweightQuickPerformanceLogger2.markerEnd(8914508, 2);
                    }
                    if (isXiaomiDevice) {
                        Achilles.setDexLoadReporter(obj);
                    }
                    if (!DalvikInternals.toggleBlockDex2Oat(false)) {
                        DexTricksErrorReporter.reportSampledSoftError("FBDex101", "Failed to unblock dex2oat", (Throwable) null);
                    }
                    enableTracingIfNeeded();
                    setupErrorReportingFields();
                } catch (Throwable th3) {
                    th = th3;
                    LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger3 = this.mQplCollector;
                    if (lightweightQuickPerformanceLogger3 != null) {
                        lightweightQuickPerformanceLogger3.markerEnd(8914508, 2);
                    }
                    if (isXiaomiDevice) {
                        Achilles.setDexLoadReporter(obj);
                    }
                    throw th;
                }
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e2) {
                e = e2;
                DexTricksErrorReporter.reportSampledSoftError("FBDex101", "Failed to merge dex elements", e);
                if (!DalvikInternals.toggleBlockDex2Oat(false)) {
                    DexTricksErrorReporter.reportSampledSoftError("FBDex101", "Failed to unblock dex2oat", (Throwable) null);
                }
            } catch (Throwable th4) {
                th = th4;
                if (!DalvikInternals.toggleBlockDex2Oat(false)) {
                    DexTricksErrorReporter.reportSampledSoftError("FBDex101", "Failed to unblock dex2oat", (Throwable) null);
                    throw th;
                }
            }
        } else {
            String A0L = AnonymousClass00U.A0L("Unknown Application ClassLoader: ", classLoader.toString());
            DexTricksErrorReporter.reportSampledSoftError("FBDex101", A0L, (Throwable) null);
            e = new RuntimeException(A0L);
            th = new RuntimeException("[FBDex101] Unknown Application ClassLoader or failed to merge dex, app bound to crash with NoClassDef", e);
            throw th;
        }
    }

    public boolean isXiaomiDevice() {
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i > 30) {
            return false;
        }
        return Achilles.existsNotifyDexLoadWithStatus();
    }

    public OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        long open = Storer.open(this.mZipFile.getPath(), HttpStatus.SC_METHOD_FAILURE);
        this.mStorer = open;
        return new OreoCompiler(open, this.mDexNameMap);
    }

    public int markLoadResult(int i, boolean z) {
        int i2 = i | 8;
        if (OreoFileUtils.hasVdexOdex(this.mZipFile)) {
            i2 = i | 512 | 524288;
        }
        File file = this.mZipFile;
        if (z) {
            if (OreoFileUtils.getOdex(file).length() < 4194304) {
                return i2;
            }
        } else if (!OreoFileUtils.getReferenceProfile(file).exists()) {
            return i2;
        }
        return i2 | 32768;
    }

    public boolean needsUnpack() {
        if (isUnpackRequested(this.mZipFile.getAbsolutePath()) || !this.mZipFile.exists()) {
            return true;
        }
        if (!OreoFileUtils.isTruncated(this.mZipFile)) {
            return false;
        }
        return !OreoFileUtils.hasVdexOdex(this.mZipFile);
    }

    public void requestDexUnpack() {
        requestUnpack(this.mZipFile.getAbsolutePath());
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0040 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void createDecoy(java.io.File r5, java.lang.String r6) {
        /*
            java.lang.String r1 = r5.getPath()
            r0 = 420(0x1a4, float:5.89E-43)
            long r2 = com.facebook.common.dextricks.storer.Storer.open(r1, r0)
            java.lang.String r1 = "classes.dex"
            r0 = 4
            com.facebook.common.dextricks.storer.Storer.start(r2, r1, r0)
            java.util.zip.ZipFile r5 = new java.util.zip.ZipFile
            r5.<init>(r6)
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0041 }
            r0.<init>(r1)     // Catch:{ all -> 0x0041 }
            java.io.InputStream r4 = r5.getInputStream(r0)     // Catch:{ all -> 0x0041 }
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x003a }
        L_0x0023:
            int r0 = r4.read(r1)     // Catch:{ all -> 0x003a }
            if (r0 < 0) goto L_0x002d
            com.facebook.common.dextricks.storer.Storer.write(r2, r1, r0)     // Catch:{ all -> 0x003a }
            goto L_0x0023
        L_0x002d:
            r4.close()     // Catch:{ all -> 0x0041 }
            r5.close()
            com.facebook.common.dextricks.storer.Storer.finish(r2)
            com.facebook.common.dextricks.storer.Storer.cleanup(r2)
            return
        L_0x003a:
            r0 = move-exception
            if (r4 == 0) goto L_0x0040
            r4.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeOreo.createDecoy(java.io.File, java.lang.String):void");
    }

    private Object disableReporter() {
        Object dexLoadReporter = Achilles.getDexLoadReporter();
        Achilles.setDexLoadReporter((Object) null);
        return dexLoadReporter;
    }

    public static String getPrimaryDexIdentifierString(Context context) {
        return String.valueOf(DexStore.getApkIdentifier(new File(context.getApplicationInfo().publicSourceDir), false));
    }

    public static Object recordAddedDexElement(File file, Object obj) {
        return sOurAddedDexElements.put(file.getAbsolutePath(), obj);
    }

    public void addEmptyDex(Context context) {
        AssetManager assets = context.getAssets();
        String A0S = AnonymousClass00U.A0S("classes", DexManifest.DEX_EXT, this.mNumDexes + 1);
        InputStream open = assets.open("secondary-program-dex-jars/empty.dex");
        try {
            Storer.start_unaligned(this.mStorer, A0S, 4);
            long j = this.mStorer;
            byte[] bArr = new byte[32768];
            while (true) {
                int read = open.read(bArr);
                if (read >= 0) {
                    Storer.write(j, bArr, read);
                } else {
                    Storer.finish(this.mStorer);
                    open.close();
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        throw th;
    }

    public IOException[] getSuppressedExceptions() {
        return this.mSuppressedExceptions;
    }

    public void registerCodeAndProfile(boolean z, boolean z2) {
        File profileFileAndInfo = getProfileFileAndInfo(z2);
        if (z) {
            registerCodeAndProfileBgDexopt();
        } else if (profileFileAndInfo != null) {
            String path = profileFileAndInfo.getPath();
            String[] strArr = {this.mZipFile.getPath()};
            try {
                Method declaredMethod = VMRuntime.class.getDeclaredMethod("registerAppInfo", new Class[]{String.class, String[].class});
                declaredMethod.setAccessible(true);
                declaredMethod.invoke((Object) null, new Object[]{path, strArr});
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
                Achilles.registerAppInfo(path, strArr);
            }
        }
    }

    private void enableReporter(Object obj) {
        Achilles.setDexLoadReporter(obj);
    }
}
