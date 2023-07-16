package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import android.content.Context;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import dalvik.system.VMRuntime;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class OdexSchemeNougat extends OdexSchemeOreo {
    public String getSchemeName() {
        return "OdexSchemeNougat";
    }

    private int markLoadResult(int i) {
        int i2 = i | 8;
        if (OreoFileUtils.hasOdex(this.mZipFile)) {
            i2 = i | 524288 | 512;
        }
        if (OreoFileUtils.getReferenceProfile(this.mZipFile).exists()) {
            return i2 | 32768;
        }
        return i2;
    }

    public File getForeignDexProfileDir(File file) {
        File file2 = new File(file, "foreign-dex");
        if (!file2.isDirectory()) {
            file2.delete();
        }
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file2;
    }

    public boolean needsUnpack() {
        if (!OdexSchemeOreo.isUnpackRequested(this.mZipFile.getAbsolutePath())) {
            return !this.mZipFile.exists();
        }
        return true;
    }

    public void registerCodeAndProfile(boolean z, boolean z2) {
        File profileFile;
        String str;
        File parentFile = this.mZipFile.getParentFile();
        if (parentFile != null && (profileFile = getProfileFile(parentFile)) != null) {
            String path = profileFile.getPath();
            String[] strArr = {this.mZipFile.getPath()};
            String str2 = this.mContext.getApplicationInfo().dataDir;
            try {
                str = getForeignDexProfileDir(parentFile).getCanonicalPath();
            } catch (IOException unused) {
                str = AnonymousClass00U.A0L(str2, "/dex/foreign-dex");
            }
            Class<String> cls = String.class;
            try {
                Method declaredMethod = VMRuntime.class.getDeclaredMethod("registerAppInfo", new Class[]{cls, cls, String[].class, cls});
                declaredMethod.setAccessible(true);
                declaredMethod.invoke((Object) null, new Object[]{path, str2, strArr, str});
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
    }

    public OdexSchemeNougat(DexManifest.Dex[] dexArr, File file, Context context, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        super(dexArr, file, context, lightweightQuickPerformanceLogger);
    }

    public int markLoadResult(int i, boolean z) {
        return markLoadResult(i);
    }
}
