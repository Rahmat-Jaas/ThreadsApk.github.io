package com.facebook.common.dextricks;

import X.C14400pL;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;

public final class DirectoryInputDexIterator extends InputDexIterator {
    public final File mDir;

    public InputDex nextImpl(DexManifest.Dex dex) {
        FileInputStream fileInputStream = new FileInputStream(new File(this.mDir, dex.assetName));
        try {
            return new InputDex(dex, fileInputStream);
        } catch (Throwable th) {
            Fs.safeClose((Closeable) fileInputStream);
            throw th;
        }
    }

    public DirectoryInputDexIterator(DexManifest dexManifest, C14400pL r2, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, File file) {
        super(dexManifest, r2, lightweightQuickPerformanceLogger);
        this.mDir = file;
    }
}
