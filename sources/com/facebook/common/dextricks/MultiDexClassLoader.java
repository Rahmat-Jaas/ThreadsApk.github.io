package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import X.AnonymousClass0E9;
import X.AnonymousClass0Ht;
import X.AnonymousClass0JB;
import X.AnonymousClass0KY;
import X.AnonymousClass0M5;
import X.AnonymousClass0M6;
import X.C04560Oe;
import android.content.Context;
import android.os.Build;
import android.os.SystemProperties;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class MultiDexClassLoader extends ClassLoader implements ColdStartAwareClassLoader, DexFileAccessLoggingClassLoader {
    public static final ClassLoader APP_CLASSLOADER;
    public static final int BASE_DEX_RETRY_WAIT_MS = 500;
    public static final Field CLASSLOADER_PARENT_FIELD;
    public static final Object INSTALL_LOCK = new Object();
    public static final int MAX_LOAD_DEX_RETRY = 3;
    public static final ClassLoader SYSTEM_CLASSLOADER;
    public static final String TAG = "MultiDexClassLoader";
    public static final boolean USE_DALVIK_NATIVE_LOADER = true;
    public static final boolean USE_FANCY_LOADER = true;
    public static volatile AnonymousClass0Ht sFallbackDexLoader;
    public static Throwable sFancyLoaderFailure;
    public static volatile ClassLoader sInstalledClassLoader;
    public DexFileAccessListener dexFileAccessListener = null;
    public Configuration mConfig;
    public final ClassLoader mPutativeLoader = APP_CLASSLOADER;
    public DexFile[] subscribedDexFiles = null;

    public final class Configuration {
        public static final int LOAD_SECONDARY = 4;
        public static final int SUPPORTS_LOCATORS = 2;
        public final ArrayList coldstartDexBaseNames = new ArrayList();
        public final int coldstartDexCount;
        public int configFlags;
        public final boolean disableVerifier;
        public final ArrayList mDexFiles = new ArrayList();

        private void appendColdstartDexBaseName(File file) {
            if (this.coldstartDexBaseNames.size() < this.coldstartDexCount) {
                String name = file.getName();
                String substring = name.substring(0, name.indexOf(46));
                this.coldstartDexBaseNames.add(substring);
                DalvikInternals.addDexBaseNames(substring);
            }
        }

        public void addDex(DexFile dexFile) {
            this.mDexFiles.add(dexFile);
        }

        public int getNumberConfiguredDexFiles() {
            return this.mDexFiles.size();
        }

        public Configuration(int i, int i2, boolean z) {
            this.configFlags = i;
            this.coldstartDexCount = i2;
            this.disableVerifier = z;
        }

        public int getConfigFlags() {
            return this.configFlags;
        }

        public void setConfigFlags(int i) {
            this.configFlags = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            if (r1 != null) goto L_0x0026;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
            r8.mDexFiles.add(r1);
            appendColdstartDexBaseName(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
            throw new java.io.IOException(X.AnonymousClass00U.A0L("Could not load dex file ", r4));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void addDex(java.io.File r9, java.io.File r10, boolean r11) {
            /*
                r8 = this;
                java.lang.String r4 = r9.getAbsolutePath()
                r5 = 0
                if (r10 == 0) goto L_0x000b
                java.lang.String r5 = r10.getAbsolutePath()
            L_0x000b:
                int r1 = android.os.Build.VERSION.SDK_INT
                r0 = 33
                r6 = 0
                if (r1 < r0) goto L_0x0015
                r9.setWritable(r6)
            L_0x0015:
                r3 = 0
            L_0x0016:
                int r3 = r3 + 1
                r7 = 3
                java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ IOException -> 0x003f }
                dalvik.system.DexFile r1 = dalvik.system.DexFile.loadDex(r0, r5, r6)     // Catch:{ IOException -> 0x003f }
                if (r11 == 0) goto L_0x0024
                goto L_0x002f
            L_0x0024:
                if (r1 == 0) goto L_0x0033
            L_0x0026:
                java.util.ArrayList r0 = r8.mDexFiles
                r0.add(r1)
                r8.appendColdstartDexBaseName(r9)
                return
            L_0x002f:
                if (r1 != 0) goto L_0x0026
                if (r3 <= r7) goto L_0x0053
            L_0x0033:
                java.lang.String r0 = "Could not load dex file "
                java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r4)
                java.io.IOException r0 = new java.io.IOException
                r0.<init>(r1)
                throw r0
            L_0x003f:
                r2 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[]{r4}
                java.lang.String r0 = "Failed loading dex ( %s )"
                java.lang.String r1 = java.lang.String.format(r0, r1)
                java.lang.String r0 = "MultiDexClassLoader"
                android.util.Log.w(r0, r1, r2)
                if (r11 == 0) goto L_0x0064
                if (r7 < r3) goto L_0x0064
            L_0x0053:
                if (r3 <= 0) goto L_0x0016
                int r0 = r3 * 500
                long r0 = (long) r0
                java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x005c }
                goto L_0x0016
            L_0x005c:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L_0x0016
            L_0x0064:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.MultiDexClassLoader.Configuration.addDex(java.io.File, java.io.File, boolean):void");
        }

        public void addDex(File file, File file2) {
            addDex(file, file2, false);
        }

        public void addDex(File file) {
            addDex(file, false);
        }

        public void addDex(File file, boolean z) {
            addDex(file, (File) null, z);
        }
    }

    public static void clearFancyLoaderFailure() {
        sFancyLoaderFailure = null;
    }

    public abstract DexFile[] doGetConfiguredDexFiles();

    public String[] getRecentFailedClasses() {
        return new String[0];
    }

    public void onColdstartDone() {
    }

    public String verboseDescription() {
        return TAG;
    }

    static {
        try {
            ClassLoader classLoader = MultiDexClassLoader.class.getClassLoader();
            APP_CLASSLOADER = classLoader;
            Field declaredField = ClassLoader.class.getDeclaredField("parent");
            CLASSLOADER_PARENT_FIELD = declaredField;
            declaredField.setAccessible(true);
            SYSTEM_CLASSLOADER = (ClassLoader) declaredField.get(classLoader);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MultiDexClassLoader() {
        super(SYSTEM_CLASSLOADER);
    }

    public static boolean classInLongtailModule(String str) {
        if (sInstalledClassLoader instanceof MultiDexClassLoaderJava) {
            return MultiDexClassLoaderJava.classInLongtailModule(str);
        }
        return false;
    }

    public static ClassLoader createMultiDexClassLoader(Context context, ArrayList arrayList, ArrayList arrayList2) {
        Context context2 = context;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        if (!"true".equals(SystemProperties.get("com.facebook.force_mdclj")) && !"Amazon".equals(Build.BRAND)) {
            try {
                if (!AnonymousClass0JB.A00) {
                    return new MultiDexClassLoaderDalvikNative(context2, arrayList, arrayList2);
                }
                if (AnonymousClass0KY.A00().A03()) {
                    return new MultiDexClassLoaderArtNative(context2, SYSTEM_CLASSLOADER, arrayList3, arrayList4, true, "true".equals(SystemProperties.get("com.facebook.force_mdclan")));
                }
            } catch (Exception | NoSuchFieldError e) {
                Log.w(TAG, "unable to use native MDCL: falling back to Java impl", e);
                sFancyLoaderFailure = e;
            }
        }
        return new MultiDexClassLoaderJava(context2, arrayList3, arrayList4);
    }

    public static void forceLoadProfiloIfPresent() {
        try {
            Class.forName("com.facebook.profilo.logger.api.ProfiloClassLoadTracer");
        } catch (ClassNotFoundException unused) {
        }
    }

    public static Configuration getConfiguration() {
        ClassLoader classLoader = sInstalledClassLoader;
        if (!(classLoader instanceof MultiDexClassLoader)) {
            return null;
        }
        return ((MultiDexClassLoader) classLoader).mConfig;
    }

    public static DexFile[] getConfiguredDexFiles() {
        ClassLoader classLoader = sInstalledClassLoader;
        if (!(classLoader instanceof MultiDexClassLoader)) {
            return new DexFile[0];
        }
        return ((MultiDexClassLoader) classLoader).doGetConfiguredDexFiles();
    }

    public static ClassLoader install(Context context, ArrayList arrayList, ArrayList arrayList2) {
        ClassLoader classLoader;
        RuntimeException runtimeException;
        ClassLoader classLoader2 = sInstalledClassLoader;
        if (classLoader2 != null) {
            return classLoader2;
        }
        synchronized (INSTALL_LOCK) {
            classLoader = sInstalledClassLoader;
            if (classLoader == null) {
                try {
                    Class.forName("com.facebook.common.dextricks.FatalDexError");
                    Class.forName("com.facebook.common.dextricks.DexFileLoadOld");
                    Class.forName("com.facebook.common.dextricks.DexFileLoadNew");
                    Class.forName("com.facebook.common.dextricks.stats.ClassLoadingStats");
                    Class.forName("com.facebook.common.dextricks.stats.ClassLoadingStats$SnapshotStats");
                    Class.forName("com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger");
                    Class.forName("com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerNativeHolder");
                    Class.forName("com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerLite");
                    Class.forName("com.facebook.common.dextricks.coverage.logger.ClassCoverageLogger");
                    Class.forName("com.facebook.common.dextricks.benchmarkhelper.ClassloadNameCollector");
                    Class.forName("com.facebook.common.dextricks.classid.ClassId");
                    Class.forName("com.facebook.common.dextricks.StringTreeSet");
                    forceLoadProfiloIfPresent();
                    AnonymousClass0M5 r2 = AnonymousClass0M6.A00;
                    if (r2 != null) {
                        r2.CYX("recentClassLoadFailures", new C04560Oe() {
                            public String get() {
                                ClassLoader classLoader = MultiDexClassLoader.sInstalledClassLoader;
                                if (classLoader instanceof MultiDexClassLoader) {
                                    return Arrays.toString(((MultiDexClassLoader) classLoader).getRecentFailedClasses());
                                }
                                return "";
                            }
                        });
                        r2.CYX("multiDexClassLoader", new C04560Oe() {
                            public String get() {
                                return MultiDexClassLoader.sInstalledClassLoader.toString();
                            }
                        });
                    }
                    classLoader = createMultiDexClassLoader(context, arrayList, arrayList2);
                    try {
                        CLASSLOADER_PARENT_FIELD.set(((MultiDexClassLoader) classLoader).mPutativeLoader, classLoader);
                        sInstalledClassLoader = classLoader;
                    } catch (IllegalAccessException e) {
                        runtimeException = new RuntimeException(e);
                    }
                } catch (ClassNotFoundException e2) {
                    runtimeException = new RuntimeException(e2);
                    throw runtimeException;
                }
            }
        }
        return classLoader;
    }

    public static final boolean maybeFallbackLoadDexes(String str, Throwable th) {
        AnonymousClass0Ht r4 = sFallbackDexLoader;
        if (r4 == null) {
            return false;
        }
        classInLongtailModule(str);
        AnonymousClass0E9 r42 = (AnonymousClass0E9) r4;
        synchronized (r42) {
            r42.A04.contains(Long.valueOf(Thread.currentThread().getId()));
        }
        return false;
    }

    public void configureArtHacks(Configuration configuration) {
        if (configuration.disableVerifier) {
            DalvikInternals.installArtHacks(4, Build.VERSION.SDK_INT);
        }
    }

    public void observeDexFileLoad(DexFile dexFile, Class cls) {
        DexFile[] dexFileArr;
        DexFileAccessListener dexFileAccessListener2;
        if (cls != null && (dexFileArr = this.subscribedDexFiles) != null && (dexFileAccessListener2 = this.dexFileAccessListener) != null) {
            for (DexFile dexFile2 : dexFileArr) {
                if (dexFile == dexFile2) {
                    dexFileAccessListener2.onClassLoadedFromDexFile(cls, dexFile);
                    return;
                }
            }
        }
    }

    public void subscribeToDexFileAccesses(DexFile[] dexFileArr, DexFileAccessListener dexFileAccessListener2) {
        this.subscribedDexFiles = dexFileArr;
        this.dexFileAccessListener = dexFileAccessListener2;
    }

    public static ClassLoader get() {
        return sInstalledClassLoader;
    }

    public static Throwable getFancyLoaderFailure() {
        return sFancyLoaderFailure;
    }

    public static boolean isArt() {
        return true;
    }

    public Configuration getConfig() {
        return this.mConfig;
    }

    public final Class maybeFallbackLoadClass(String str, Throwable th) {
        try {
            maybeFallbackLoadDexes(str, th);
            if (th instanceof ClassNotFoundException) {
                throw ((ClassNotFoundException) th);
            }
            throw new ClassNotFoundException(str, th);
        } catch (RuntimeException e) {
            throw new ClassNotFoundException(AnonymousClass00U.A0L("Fallback class load failed for ", str), e);
        }
    }

    public static void setFallbackDexLoader(AnonymousClass0Ht r0) {
        sFallbackDexLoader = r0;
    }

    public void configure(Configuration configuration) {
        this.mConfig = configuration;
    }
}
