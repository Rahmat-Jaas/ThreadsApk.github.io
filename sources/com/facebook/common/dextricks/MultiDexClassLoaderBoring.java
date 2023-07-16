package com.facebook.common.dextricks;

import X.AnonymousClass082;
import com.facebook.common.dextricks.MultiDexClassLoader;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.facebook.common.dextricks.stats.ClassLoadingStats;
import com.facebook.profilo.logger.api.ProfiloLogger;
import dalvik.system.DexFile;
import java.util.ArrayList;

public final class MultiDexClassLoaderBoring extends MultiDexClassLoader {
    public final ClassLoadingStats mClassLoadingStats;
    public DexFile[] mDexFiles;

    public String toString() {
        return "MultiDexClassLoaderBoring";
    }

    public void configure(MultiDexClassLoader.Configuration configuration) {
        this.mConfig = configuration;
        ArrayList arrayList = configuration.mDexFiles;
        this.mDexFiles = (DexFile[]) arrayList.toArray(new DexFile[arrayList.size()]);
        configureArtHacks(configuration);
    }

    public MultiDexClassLoaderBoring() {
        AnonymousClass082 r1 = new AnonymousClass082();
        ClassLoadingStats.A00.getAndSet(r1);
        this.mClassLoadingStats = r1;
    }

    public DexFile[] doGetConfiguredDexFiles() {
        return this.mDexFiles;
    }

    /* JADX INFO: finally extract failed */
    public Class findClass(String str) {
        ProfiloLogger.classLoadStart();
        ClassTracingLogger.beginClassLoad(str);
        this.mClassLoadingStats.incrementClassLoadsAttempted();
        int i = 0;
        Class cls = null;
        int i2 = 0;
        while (true) {
            try {
                DexFile[] dexFileArr = this.mDexFiles;
                if (i < dexFileArr.length) {
                    DexFile dexFile = dexFileArr[i];
                    i2++;
                    cls = dexFile.loadClass(str, this.mPutativeLoader);
                    if (cls != null) {
                        observeDexFileLoad(dexFile, cls);
                        this.mClassLoadingStats.incrementDexFileQueries(i2);
                        ClassTracingLogger.classLoaded(cls);
                        ProfiloLogger.classLoadEnd(cls);
                        return cls;
                    }
                    i++;
                } else {
                    this.mClassLoadingStats.incrementDexFileQueries(i2);
                    ClassTracingLogger.classNotFound();
                    ProfiloLogger.classLoadFailed();
                    this.mClassLoadingStats.incrementClassLoadsFailed();
                    throw new ClassNotFoundException(str);
                }
            } catch (Throwable th) {
                this.mClassLoadingStats.incrementDexFileQueries(i2);
                if (cls != null) {
                    ClassTracingLogger.classLoaded(cls);
                    ProfiloLogger.classLoadEnd(cls);
                    throw th;
                }
                ClassTracingLogger.classNotFound();
                ProfiloLogger.classLoadFailed();
                this.mClassLoadingStats.incrementClassLoadsFailed();
                throw th;
            }
        }
    }
}
