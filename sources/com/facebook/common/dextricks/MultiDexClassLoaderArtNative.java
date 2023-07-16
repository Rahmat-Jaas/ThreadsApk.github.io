package com.facebook.common.dextricks;

import X.AnonymousClass0SH;
import X.C15020qa;
import android.content.Context;
import android.os.Build;
import com.facebook.common.dextricks.MultiDexClassLoader;
import com.facebook.common.dextricks.stats.ClassLoadingStats;
import com.facebook.common.dextricks.stats.ClassLoadingStatsNative;
import dalvik.system.DexFile;
import java.io.File;
import java.util.ArrayList;

public final class MultiDexClassLoaderArtNative extends MultiDexClassLoader {
    public static final String FAILEDSTART_FILE = "multidexclassloader_artnative_failedstart";
    public final ArrayList mAuxDexes;
    public final ArrayList mPrimaryDexes;

    public MultiDexClassLoaderArtNative(Context context, ClassLoader classLoader, ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2) {
        if (!z2) {
            maybeBail(context);
        }
        this.mPrimaryDexes = arrayList;
        this.mAuxDexes = arrayList2;
        if (arrayList == null || arrayList.isEmpty()) {
            throw new Exception("Bailing: No primary dexes");
        }
        ClassLoadingStatsNative classLoadingStatsNative = new ClassLoadingStatsNative();
        ClassLoadingStats.A00.getAndSet(classLoadingStatsNative);
        try {
            init(classLoader, this.mPutativeLoader, (DexFile[]) arrayList.toArray(new DexFile[arrayList.size()]), classLoadingStatsNative, context.getDir("mdclan", 0).getAbsolutePath(), true, z);
        } catch (Exception e) {
            cleanupFailedInit();
            throw e;
        }
    }

    private native void cleanupFailedInit();

    private native Class init(ClassLoader classLoader, ClassLoader classLoader2, DexFile[] dexFileArr, ClassLoadingStatsNative classLoadingStatsNative, String str, boolean z, boolean z2);

    public static native boolean isFastHooked();

    public static native void nativeConfigure(DexFile[] dexFileArr, int i);

    public native DexFile[] doGetConfiguredDexFiles();

    public native Class findClass(String str);

    public native String[] getRecentFailedClasses();

    public native Class loadClass(String str, boolean z);

    public String toString() {
        return "MultiDexClassLoaderArtNative";
    }

    static {
        C15020qa.A0A("dextricks");
    }

    public static void maybeBail(Context context) {
        String str;
        File fileStreamPath = context.getFileStreamPath(FAILEDSTART_FILE);
        if (!fileStreamPath.exists()) {
            fileStreamPath.createNewFile();
            String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
            if (strArr.length == 0) {
                str = Build.CPU_ABI;
            } else {
                str = strArr[0];
            }
            if ("x86".equals(str)) {
                throw new Exception("Bailing: x86 unsupported");
            } else if (AnonymousClass0SH.A00(context, Experiments.MDCLAN_BLACKLIST_GK_ENABLED_FILENAME, 0) == 1) {
                throw new Exception("Bailing: Blacklisted device model");
            }
        } else {
            fileStreamPath.delete();
            throw new Exception("MDCLAN bailing: Failed to start last time");
        }
    }

    public void configure(MultiDexClassLoader.Configuration configuration) {
        this.mConfig = configuration;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.mPrimaryDexes);
        arrayList.addAll(configuration.mDexFiles);
        arrayList.addAll(this.mAuxDexes);
        nativeConfigure((DexFile[]) arrayList.toArray(new DexFile[arrayList.size()]), configuration.configFlags);
        configureArtHacks(configuration);
    }
}
