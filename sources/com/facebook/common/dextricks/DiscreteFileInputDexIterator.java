package com.facebook.common.dextricks;

import X.C14400pL;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.Closeable;
import java.io.InputStream;

public final class DiscreteFileInputDexIterator extends InputDexIterator {
    public final ResProvider mResProvider;

    public InputDex nextImpl(DexManifest.Dex dex) {
        InputStream open = this.mResProvider.open(dex.assetName);
        try {
            return new InputDex(dex, open);
        } catch (Throwable th) {
            Fs.safeClose((Closeable) open);
            throw th;
        }
    }

    public DiscreteFileInputDexIterator(DexManifest dexManifest, C14400pL r2, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, ResProvider resProvider) {
        super(dexManifest, r2, lightweightQuickPerformanceLogger);
        this.mResProvider = resProvider;
    }
}
