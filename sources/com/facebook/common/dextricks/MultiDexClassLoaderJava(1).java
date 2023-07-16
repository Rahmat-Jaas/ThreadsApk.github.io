package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import X.AnonymousClass082;
import android.content.Context;
import android.util.Log;
import android.util.Pair;
import com.facebook.common.dextricks.MultiDexClassLoader;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.facebook.common.dextricks.coverage.logger.ClassCoverageLogger;
import com.facebook.common.dextricks.stats.ClassLoadingStats;
import com.facebook.profilo.logger.api.ProfiloClassLoadTracer;
import com.facebook.profilo.logger.api.ProfiloLogger;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.concurrent.atomic.AtomicInteger;

public final class MultiDexClassLoaderJava extends MultiDexClassLoader {
    public static final byte API_FALLBACK = 3;
    public static final byte API_NEW_WORKS = 1;
    public static final byte API_OLD_WORKS = 2;
    public static final byte API_UNTESTED = 0;
    public static final int HIGH_WATER_MARK_CLASS_NAME_LEN_RENAME = 6;
    public static byte sApiDetectionState;
    public static String sEncodedLongtailUnrenamedTypes;
    public final DexFile[] mAuxiliaryDexes;
    public final ClassLoadingStats mClassLoadingStats;
    public Pair[] mDexFiles = new Pair[0];
    public final String[] mDexLoadFailureHistory = new String[4];
    public int mDexLoadFailurePosition;
    public final AtomicInteger mLastLoadedDexIndex = new AtomicInteger(1);
    public final DexFile[] mPrimaryDexes;

    public static boolean classInLongtailModule(String str) {
        try {
            String str2 = sEncodedLongtailUnrenamedTypes;
            if (str2 != null && StringTreeSet.search(str, str2)) {
                return true;
            }
        } catch (IndexOutOfBoundsException e) {
            Log.e(MultiDexClassLoader.TAG, AnonymousClass00U.A0L("StringTreeSet search out of bounds for class: ", str), e);
        }
        return str.startsWith("store5ccc.") && str.endsWith(".Canary");
    }

    public static int getDexLength(Pair[] pairArr) {
        return (pairArr.length - 1) >> 1;
    }

    public static int getFirstIndexOfFixedDexes(Pair[] pairArr) {
        return (pairArr.length + 1) >> 1;
    }

    public static int getFixedDexIndex(int i, int i2) {
        return i2 + i + 1;
    }

    private Class loadInnerFallbackApiClass(String str, Pair[] pairArr, int i) {
        Class cls = null;
        int i2 = 1;
        try {
            ClassLoader classLoader = this.mPutativeLoader;
            Pair pair = pairArr[0];
            if (pair != null) {
                DexFile dexFile = (DexFile) pair.first;
                cls = dexFile.loadClass(str, classLoader);
                observeDexFileLoad(dexFile, cls);
            } else {
                onNoDexInThePromotedFrontDexSpot();
            }
            int i3 = 1;
            while (cls == null && i3 < i) {
                try {
                    DexFile dexFile2 = (DexFile) pairArr[i3].first;
                    cls = dexFile2.loadClass(str, classLoader);
                    if (cls != null && i3 > 1) {
                        promoteDexFile(dexFile2, i3);
                    }
                    observeDexFileLoad(dexFile2, cls);
                    i3++;
                } catch (Throwable th) {
                    th = th;
                    i2 = i3;
                    this.mClassLoadingStats.incrementDexFileQueries(i2);
                    throw th;
                }
            }
            this.mClassLoadingStats.incrementDexFileQueries(i3);
            return cls;
        } catch (Throwable th2) {
            th = th2;
            this.mClassLoadingStats.incrementDexFileQueries(i2);
            throw th;
        }
    }

    private Class loadInnerNewApiClass(String str, Pair[] pairArr, int i) {
        Class cls = null;
        int i2 = 1;
        try {
            ClassLoader classLoader = this.mPutativeLoader;
            Pair pair = pairArr[0];
            if (pair == null) {
                onNoDexInThePromotedFrontDexSpot();
            } else if (!((Boolean) pair.second).booleanValue() || mayBeRedexRenamedOrStoreCanary(str)) {
                DexFile dexFile = (DexFile) pair.first;
                cls = DexFileLoadNew.loadClassBinaryName(dexFile, str, classLoader);
                observeDexFileLoad(dexFile, cls);
            }
            int i3 = 1;
            while (cls == null && i3 < i) {
                try {
                    Pair pair2 = pairArr[i3];
                    if (!((Boolean) pair2.second).booleanValue() || mayBeRedexRenamedOrStoreCanary(str)) {
                        DexFile dexFile2 = (DexFile) pair2.first;
                        cls = DexFileLoadNew.loadClassBinaryName(dexFile2, str, classLoader);
                        if (cls != null && i3 > 1) {
                            promoteDexFile(dexFile2, i3);
                        }
                        observeDexFileLoad(dexFile2, cls);
                    }
                    i3++;
                } catch (Throwable th) {
                    th = th;
                    i2 = i3;
                    this.mClassLoadingStats.incrementDexFileQueries(i2);
                    throw th;
                }
            }
            this.mClassLoadingStats.incrementDexFileQueries(i3);
            return cls;
        } catch (Throwable th2) {
            th = th2;
            this.mClassLoadingStats.incrementDexFileQueries(i2);
            throw th;
        }
    }

    private Class loadInnerOldApiClass(String str, Pair[] pairArr, int i) {
        Class cls = null;
        int i2 = 1;
        try {
            ClassLoader classLoader = this.mPutativeLoader;
            Pair pair = pairArr[0];
            if (pair != null) {
                DexFile dexFile = (DexFile) pair.first;
                cls = DexFileLoadOld.loadClassBinaryName(dexFile, str, classLoader);
                observeDexFileLoad(dexFile, cls);
            } else {
                onNoDexInThePromotedFrontDexSpot();
            }
            int i3 = 1;
            while (cls == null && i3 < i) {
                try {
                    DexFile dexFile2 = (DexFile) pairArr[i3].first;
                    cls = DexFileLoadOld.loadClassBinaryName(dexFile2, str, classLoader);
                    if (cls != null && i3 > 1) {
                        promoteDexFile(dexFile2, i3);
                    }
                    observeDexFileLoad(dexFile2, cls);
                    i3++;
                } catch (Throwable th) {
                    th = th;
                    i2 = i3;
                    this.mClassLoadingStats.incrementDexFileQueries(i2);
                    throw th;
                }
            }
            this.mClassLoadingStats.incrementDexFileQueries(i3);
            return cls;
        } catch (Throwable th2) {
            th = th2;
            this.mClassLoadingStats.incrementDexFileQueries(i2);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0071, code lost:
        if (r10 >= 13) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean shouldAskParent(java.lang.String r15) {
        /*
            r3 = 0
            int r10 = r15.length()     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            r11 = 6
            if (r10 <= r11) goto L_0x00a3
            char r12 = r15.charAt(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            r6 = 120(0x78, float:1.68E-43)
            r8 = 117(0x75, float:1.64E-43)
            r14 = 115(0x73, float:1.61E-43)
            r9 = 12
            r1 = 8
            r2 = 46
            r5 = 97
            r4 = 1
            if (r12 == r5) goto L_0x001e
            goto L_0x0088
        L_0x001e:
            java.lang.String r7 = "test."
            r12 = 9
            r11 = 7
            r0 = 10
            if (r10 < r0) goto L_0x011f
            char r0 = r15.charAt(r11)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r0 != r6) goto L_0x0042
            char r0 = r15.charAt(r1)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r0 != r2) goto L_0x0042
            java.lang.String r0 = "ndroidx."
            boolean r0 = r15.startsWith(r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r0 == 0) goto L_0x00a2
            boolean r0 = r15.startsWith(r7, r12)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r0 == 0) goto L_0x00a3
            goto L_0x00a2
        L_0x0042:
            r6 = 16
            if (r10 < r6) goto L_0x006f
            char r0 = r15.charAt(r1)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r0 != r14) goto L_0x0073
            char r0 = r15.charAt(r12)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r0 != r8) goto L_0x0073
            r0 = 15
            char r0 = r15.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r0 != r2) goto L_0x0073
            char r0 = r15.charAt(r11)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r0 != r2) goto L_0x0073
            java.lang.String r0 = "ndroid.support"
            boolean r0 = r15.startsWith(r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r0 == 0) goto L_0x00a2
            boolean r0 = r15.startsWith(r7, r6)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r0 == 0) goto L_0x00a3
            goto L_0x00a2
        L_0x006f:
            r0 = 13
            if (r10 < r0) goto L_0x011f
        L_0x0073:
            char r0 = r15.charAt(r1)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r0 != r5) goto L_0x011f
            char r0 = r15.charAt(r9)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r0 != r2) goto L_0x011f
            java.lang.String r0 = "ndroid.arch."
            boolean r0 = r15.startsWith(r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            r0 = r0 ^ 1
            return r0
        L_0x0088:
            r13 = 106(0x6a, float:1.49E-43)
            if (r12 == r13) goto L_0x0116
            r0 = 108(0x6c, float:1.51E-43)
            if (r12 == r0) goto L_0x011f
            r0 = 111(0x6f, float:1.56E-43)
            r8 = 4
            r7 = 5
            if (r12 == r0) goto L_0x00e4
            if (r12 == r14) goto L_0x00dc
            r0 = 99
            if (r12 == r0) goto L_0x00a4
            r0 = 100
            if (r12 != r0) goto L_0x00a3
            if (r10 < r1) goto L_0x00a3
        L_0x00a2:
            r3 = 1
        L_0x00a3:
            return r3
        L_0x00a4:
            r0 = 29
            r6 = 110(0x6e, float:1.54E-43)
            if (r10 < r0) goto L_0x00cf
            char r0 = r15.charAt(r8)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r0 != r5) goto L_0x00cf
            char r0 = r15.charAt(r7)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r0 != r6) goto L_0x00cf
            char r1 = r15.charAt(r9)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            r0 = 105(0x69, float:1.47E-43)
            if (r1 != r0) goto L_0x00cf
            r0 = 27
            char r0 = r15.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r0 != r2) goto L_0x00cf
            java.lang.String r0 = "om.android.installreferrer."
            boolean r0 = r15.startsWith(r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            r0 = r0 ^ 1
            return r0
        L_0x00cf:
            char r0 = r15.charAt(r8)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r0 != r5) goto L_0x00a3
            char r0 = r15.charAt(r7)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r0 != r6) goto L_0x00a3
            goto L_0x0115
        L_0x00dc:
            r0 = 3
            char r0 = r15.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r0 != r2) goto L_0x00a3
            goto L_0x00a2
        L_0x00e4:
            char r1 = r15.charAt(r8)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r1 == r5) goto L_0x00fc
            if (r1 == r13) goto L_0x011f
            r0 = 119(0x77, float:1.67E-43)
            if (r1 == r0) goto L_0x00f3
            if (r1 == r6) goto L_0x011f
            return r3
        L_0x00f3:
            char r1 = r15.charAt(r7)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            r0 = 51
            if (r1 != r0) goto L_0x00a3
            goto L_0x00a2
        L_0x00fc:
            if (r10 < r9) goto L_0x00a3
            char r1 = r15.charAt(r7)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            r0 = 112(0x70, float:1.57E-43)
            if (r1 != r0) goto L_0x00a3
            char r0 = r15.charAt(r11)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r0 != r5) goto L_0x00a3
            r0 = 10
            char r0 = r15.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r0 != r2) goto L_0x00a3
            goto L_0x00a2
        L_0x0115:
            return r4
        L_0x0116:
            char r0 = r15.charAt(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0120 }
            if (r0 == r5) goto L_0x011f
            if (r0 == r8) goto L_0x011f
            return r3
        L_0x011f:
            return r4
        L_0x0120:
            r2 = move-exception
            java.lang.String r0 = "Class out of bounds: "
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r15)
            java.lang.String r0 = "MultiDexClassLoader"
            android.util.Log.e(r0, r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.MultiDexClassLoaderJava.shouldAskParent(java.lang.String):boolean");
    }

    public String toString() {
        return "MultiDexClassLoaderJava";
    }

    private boolean canPromoteDexesAndUpdateState(int i, int i2) {
        int i3;
        if (i2 <= i) {
            return false;
        }
        do {
            i3 = this.mLastLoadedDexIndex.get();
            if (i3 >= i || this.mLastLoadedDexIndex.compareAndSet(i3, i)) {
                return true;
            }
            i3 = this.mLastLoadedDexIndex.get();
            return true;
        } while (this.mLastLoadedDexIndex.compareAndSet(i3, i));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0 = r5[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r0 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r7 = com.facebook.common.dextricks.DexFileLoadOld.loadClassBinaryName((dalvik.system.DexFile) r0.first, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        onNoDexInThePromotedFrontDexSpot();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        if (r7 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        r7 = com.facebook.common.dextricks.DexFileLoadOld.loadClassBinaryName((dalvik.system.DexFile) r5[r1].first, r9, r3);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        sApiDetectionState = 2;
        r8.mClassLoadingStats.incrementDexFileQueries(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        sApiDetectionState = 3;
        r0 = r5[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r0 != null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        r7 = ((dalvik.system.DexFile) r0.first).loadClass(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        if (r7 == null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
        r7 = ((dalvik.system.DexFile) r5[r2].first).loadClass(r9, r3);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        onNoDexInThePromotedFrontDexSpot();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        r8.mClassLoadingStats.incrementDexFileQueries(r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Class findClassSlowPath(java.lang.String r9) {
        /*
            r8 = this;
            android.util.Pair[] r5 = r8.mDexFiles
            int r4 = r5.length
            r7 = 0
            if (r4 == 0) goto L_0x008a
            java.lang.ClassLoader r3 = r8.mPutativeLoader
            r6 = 0
            r2 = 1
            r0 = r5[r6]     // Catch:{ NoSuchMethodError -> 0x0036 }
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r0.first     // Catch:{ NoSuchMethodError -> 0x0036 }
            dalvik.system.DexFile r0 = (dalvik.system.DexFile) r0     // Catch:{ NoSuchMethodError -> 0x0036 }
            java.lang.Class r7 = com.facebook.common.dextricks.DexFileLoadNew.loadClassBinaryName(r0, r9, r3)     // Catch:{ NoSuchMethodError -> 0x0036 }
            goto L_0x001a
        L_0x0017:
            r8.onNoDexInThePromotedFrontDexSpot()     // Catch:{ NoSuchMethodError -> 0x0036 }
        L_0x001a:
            r1 = 1
        L_0x001b:
            if (r7 != 0) goto L_0x002c
            if (r1 >= r4) goto L_0x002c
            r0 = r5[r1]     // Catch:{ NoSuchMethodError -> 0x0036 }
            java.lang.Object r0 = r0.first     // Catch:{ NoSuchMethodError -> 0x0036 }
            dalvik.system.DexFile r0 = (dalvik.system.DexFile) r0     // Catch:{ NoSuchMethodError -> 0x0036 }
            java.lang.Class r7 = com.facebook.common.dextricks.DexFileLoadNew.loadClassBinaryName(r0, r9, r3)     // Catch:{ NoSuchMethodError -> 0x0036 }
            int r1 = r1 + 1
            goto L_0x001b
        L_0x002c:
            if (r4 <= r2) goto L_0x0030
            sApiDetectionState = r2     // Catch:{ NoSuchMethodError -> 0x0036 }
        L_0x0030:
            com.facebook.common.dextricks.stats.ClassLoadingStats r0 = r8.mClassLoadingStats     // Catch:{ NoSuchMethodError -> 0x0036 }
            r0.incrementDexFileQueries(r1)     // Catch:{ NoSuchMethodError -> 0x0036 }
            return r7
        L_0x0036:
            r0 = r5[r6]     // Catch:{ NoSuchMethodError -> 0x0061 }
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = r0.first     // Catch:{ NoSuchMethodError -> 0x0061 }
            dalvik.system.DexFile r0 = (dalvik.system.DexFile) r0     // Catch:{ NoSuchMethodError -> 0x0061 }
            java.lang.Class r7 = com.facebook.common.dextricks.DexFileLoadOld.loadClassBinaryName(r0, r9, r3)     // Catch:{ NoSuchMethodError -> 0x0061 }
            goto L_0x0046
        L_0x0043:
            r8.onNoDexInThePromotedFrontDexSpot()     // Catch:{ NoSuchMethodError -> 0x0061 }
        L_0x0046:
            r1 = 1
        L_0x0047:
            if (r7 != 0) goto L_0x0058
            if (r1 >= r4) goto L_0x0058
            r0 = r5[r1]     // Catch:{ NoSuchMethodError -> 0x0061 }
            java.lang.Object r0 = r0.first     // Catch:{ NoSuchMethodError -> 0x0061 }
            dalvik.system.DexFile r0 = (dalvik.system.DexFile) r0     // Catch:{ NoSuchMethodError -> 0x0061 }
            java.lang.Class r7 = com.facebook.common.dextricks.DexFileLoadOld.loadClassBinaryName(r0, r9, r3)     // Catch:{ NoSuchMethodError -> 0x0061 }
            int r1 = r1 + 1
            goto L_0x0047
        L_0x0058:
            r0 = 2
            sApiDetectionState = r0     // Catch:{ NoSuchMethodError -> 0x0061 }
            com.facebook.common.dextricks.stats.ClassLoadingStats r0 = r8.mClassLoadingStats     // Catch:{ NoSuchMethodError -> 0x0061 }
            r0.incrementDexFileQueries(r1)     // Catch:{ NoSuchMethodError -> 0x0061 }
            return r7
        L_0x0061:
            r0 = 3
            sApiDetectionState = r0
            r0 = r5[r6]
            if (r0 == 0) goto L_0x0081
            java.lang.Object r0 = r0.first
            dalvik.system.DexFile r0 = (dalvik.system.DexFile) r0
            java.lang.Class r7 = r0.loadClass(r9, r3)
        L_0x0070:
            if (r7 != 0) goto L_0x0085
            if (r2 >= r4) goto L_0x0085
            r0 = r5[r2]
            java.lang.Object r0 = r0.first
            dalvik.system.DexFile r0 = (dalvik.system.DexFile) r0
            java.lang.Class r7 = r0.loadClass(r9, r3)
            int r2 = r2 + 1
            goto L_0x0070
        L_0x0081:
            r8.onNoDexInThePromotedFrontDexSpot()
            goto L_0x0070
        L_0x0085:
            com.facebook.common.dextricks.stats.ClassLoadingStats r0 = r8.mClassLoadingStats
            r0.incrementDexFileQueries(r2)
        L_0x008a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.MultiDexClassLoaderJava.findClassSlowPath(java.lang.String):java.lang.Class");
    }

    private void noteClassLoadFailure(String str) {
        String[] strArr = this.mDexLoadFailureHistory;
        synchronized (strArr) {
            int i = this.mDexLoadFailurePosition;
            this.mDexLoadFailurePosition = i + 1;
            strArr[i % strArr.length] = str;
        }
    }

    private boolean oldShouldAskBootClassLoader(String str) {
        return !str.startsWith("com.facebook.");
    }

    private void onNoDexInThePromotedFrontDexSpot() {
        this.mClassLoadingStats.decrementDexFileQueries();
    }

    private void promoteDexFile(DexFile dexFile, int i) {
        Pair[] pairArr = this.mDexFiles;
        if (canPromoteDexesAndUpdateState(i, (pairArr.length + 1) >> 1)) {
            synchronized (pairArr) {
                if (pairArr[1].first != dexFile) {
                    Pair pair = pairArr[i];
                    if (pair.first == dexFile) {
                        pairArr[0] = pair;
                        while (i >= 1) {
                            pairArr[i] = pairArr[i - 1];
                            i--;
                        }
                        pairArr[0] = null;
                    }
                }
            }
        }
    }

    public void configure(MultiDexClassLoader.Configuration configuration) {
        this.mConfig = configuration;
        int length = this.mPrimaryDexes.length;
        int size = configuration.mDexFiles.size();
        int length2 = this.mAuxiliaryDexes.length;
        int i = length + size + length2;
        Pair[] pairArr = new Pair[((i << 1) + 1)];
        int i2 = 0;
        pairArr[0] = null;
        int i3 = 0;
        int i4 = 1;
        while (i3 < length) {
            Pair create = Pair.create(this.mPrimaryDexes[i3], Boolean.FALSE);
            pairArr[i4] = create;
            pairArr[i4 + i] = create;
            i3++;
            i4++;
        }
        int i5 = 0;
        while (i5 < size) {
            Pair createPair = createPair((DexFile) configuration.mDexFiles.get(i5));
            pairArr[i4] = createPair;
            pairArr[i4 + i] = createPair;
            i5++;
            i4++;
        }
        while (i2 < length2) {
            Pair createPair2 = createPair(this.mAuxiliaryDexes[i2]);
            pairArr[i4] = createPair2;
            pairArr[i4 + i] = createPair2;
            i2++;
            i4++;
        }
        this.mDexFiles = pairArr;
        configureArtHacks(configuration);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: dalvik.system.DexFile[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public dalvik.system.DexFile[] doGetConfiguredDexFiles() {
        /*
            r5 = this;
            android.util.Pair[] r4 = r5.mDexFiles
            int r0 = r4.length
            int r0 = r0 + -1
            int r3 = r0 >> 1
            dalvik.system.DexFile[] r2 = new dalvik.system.DexFile[r3]
            r1 = 0
        L_0x000a:
            if (r1 >= r3) goto L_0x0019
            int r0 = r3 + r1
            int r0 = r0 + 1
            r0 = r4[r0]
            java.lang.Object r0 = r0.first
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x000a
        L_0x0019:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.MultiDexClassLoaderJava.doGetConfiguredDexFiles():dalvik.system.DexFile[]");
    }

    public Class findClass(String str) {
        Pair[] pairArr = this.mDexFiles;
        int length = pairArr.length;
        if (length != 0) {
            ProfiloClassLoadTracer profiloClassLoadTracer = ProfiloClassLoadTracer.sTracer;
            if (profiloClassLoadTracer != null) {
                ProfiloLogger.classLoadStart();
            }
            ClassTracingLogger.beginClassLoad(str);
            this.mClassLoadingStats.incrementClassLoadsAttempted();
            Class cls = null;
            try {
                byte b = sApiDetectionState;
                if (b == 0) {
                    cls = findClassSlowPath(str);
                } else if (b == 1) {
                    cls = loadInnerNewApiClass(str, pairArr, this.mLastLoadedDexIndex.get());
                    if (cls == null) {
                        cls = loadInnerNewApiClass(str, pairArr, length);
                    }
                } else if (b == 2) {
                    cls = loadInnerOldApiClass(str, pairArr, this.mLastLoadedDexIndex.get());
                    if (cls == null) {
                        cls = loadInnerOldApiClass(str, pairArr, length);
                    }
                } else if (b == 3 && (cls = loadInnerFallbackApiClass(str, pairArr, this.mLastLoadedDexIndex.get())) == null) {
                    cls = loadInnerFallbackApiClass(str, pairArr, length);
                }
                if (cls != null) {
                    ClassTracingLogger.classLoaded(cls);
                    String name = cls.getName();
                    if (ClassCoverageLogger.A01 == null || ClassCoverageLogger.A01.isEmpty() || !name.startsWith(ClassCoverageLogger.A01)) {
                        if (ClassCoverageLogger.A02) {
                            ClassCoverageLogger.A00.add(name);
                        }
                        if (profiloClassLoadTracer != null) {
                            ProfiloLogger.classLoadEnd(cls);
                        }
                    } else {
                        throw new UnsupportedOperationException(AnonymousClass00U.A0L("Class load disallowed: ", name));
                    }
                }
                if (cls != null) {
                    return cls;
                }
                throw new ClassNotFoundException(str);
            } finally {
                ClassTracingLogger.classNotFound();
                if (profiloClassLoadTracer != null) {
                    ProfiloLogger.classLoadFailed();
                }
                this.mClassLoadingStats.incrementClassLoadsFailed();
            }
        } else {
            throw new ClassNotFoundException(str);
        }
    }

    public String[] getRecentFailedClasses() {
        String[] strArr = this.mDexLoadFailureHistory;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        synchronized (strArr) {
            int i = this.mDexLoadFailurePosition;
            if (i < length) {
                i += length;
            }
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                strArr2[i2] = strArr[(i - i3) % length];
                i2 = i3;
            }
        }
        return strArr2;
    }

    public String verboseDescription() {
        StringBuilder sb = new StringBuilder();
        Pair[] pairArr = this.mDexFiles;
        int length = (pairArr.length - 1) >> 1;
        appendLine(sb, AnonymousClass00U.A0J("Number of dex files ", length));
        for (int i = 0; i < length; i++) {
            Pair pair = pairArr[length + i + 1];
            String name = ((DexFile) pair.first).getName();
            if (name != null) {
                long length2 = new File(name).length();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(name);
                sb2.append("|renamed_only=");
                sb2.append(pair.second);
                sb2.append("|file_size=");
                sb2.append(length2);
                appendLine(sb, sb2.toString());
                if (name.contains("longtail")) {
                    try {
                        appendLine(sb, AnonymousClass00U.A0L("longtail dex sha1: ", DexStoreUtils.sha1ForFile(name)));
                    } catch (IOException | NoSuchAlgorithmException e) {
                        StringBuilder sb3 = new StringBuilder("Could not compute sha1 for longtail dex! ");
                        sb3.append(e);
                        appendLine(sb, sb3.toString());
                    }
                    Enumeration<String> entries = ((DexFile) pair.first).entries();
                    int i2 = 0;
                    while (entries.hasMoreElements()) {
                        String nextElement = entries.nextElement();
                        if (i2 <= 50) {
                            appendLine(sb, AnonymousClass00U.A0L("longtail entry: ", nextElement));
                        }
                        i2++;
                    }
                    appendLine(sb, AnonymousClass00U.A0J("total entries count ", i2));
                    if (i2 >= 50) {
                        appendLine(sb, "more entries truncated.");
                    }
                }
            }
        }
        return sb.toString();
    }

    public MultiDexClassLoaderJava(Context context, ArrayList arrayList, ArrayList arrayList2) {
        this.mPrimaryDexes = (DexFile[]) arrayList.toArray(new DexFile[arrayList.size()]);
        this.mAuxiliaryDexes = (DexFile[]) arrayList2.toArray(new DexFile[arrayList2.size()]);
        AnonymousClass082 r1 = new AnonymousClass082();
        ClassLoadingStats.A00.getAndSet(r1);
        this.mClassLoadingStats = r1;
    }

    private void appendLine(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(System.lineSeparator());
    }

    public static boolean containsOnlyRenamedClasses(DexFile dexFile) {
        String obj = dexFile.toString();
        if (obj == null || !obj.contains("modules/longtail")) {
            return false;
        }
        return true;
    }

    public static Pair createPair(DexFile dexFile) {
        return Pair.create(dexFile, Boolean.valueOf(containsOnlyRenamedClasses(dexFile)));
    }

    private Class loadParentBootLoaderClass(String str) {
        if (getParent() == null) {
            return null;
        }
        try {
            return getParent().loadClass(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static boolean mayBeRedexRenamedOrStoreCanary(String str) {
        int length = str.length();
        if (length <= 6) {
            if (length > 2 && str.charAt(0) == 'X' && str.charAt(1) == '.') {
                return true;
            }
        } else if (length == 22 && str.charAt(0) == 's' && str.charAt(1) == 't' && str.charAt(9) == '.' && str.charAt(10) == 'd' && str.charAt(15) == '.' && str.charAt(16) == 'C' && str.charAt(21) == 'y') {
            return true;
        }
        return classInLongtailModule(str);
    }

    public Class loadClass(String str, boolean z) {
        Class loadParentBootLoaderClass;
        boolean z2 = false;
        if (shouldAskParent(str)) {
            z2 = true;
            Class loadParentBootLoaderClass2 = loadParentBootLoaderClass(str);
            if (loadParentBootLoaderClass2 != null) {
                return loadParentBootLoaderClass2;
            }
        }
        try {
            return findClass(str);
        } catch (ClassNotFoundException e) {
            e = e;
            if (z2 || !(!str.startsWith("com.facebook.")) || (loadParentBootLoaderClass = loadParentBootLoaderClass(str)) == null) {
                try {
                    MultiDexClassLoader.maybeFallbackLoadDexes(str, e);
                } catch (RuntimeException e2) {
                    e = new ClassNotFoundException(AnonymousClass00U.A0L("Fallback dex load failed for ", str), e2);
                }
                noteClassLoadFailure(str);
                throw e;
            }
            this.mClassLoadingStats.incrementIncorrectDfaGuesses();
            Log.w(MultiDexClassLoader.TAG, AnonymousClass00U.A0V("Class ", str, " was loaded on fallback. This should be fixed and added to the shouldAskParent method."));
            return loadParentBootLoaderClass;
        }
    }
}
