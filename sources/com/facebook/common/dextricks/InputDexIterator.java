package com.facebook.common.dextricks;

import X.C14400pL;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;

public abstract class InputDexIterator implements Iterator, Closeable {
    public int mDexPos = 0;
    public final DexManifest.Dex[] mDexes;
    public final C14400pL mPatchingStrategy;
    public LightweightQuickPerformanceLogger mQplCollector;

    public abstract InputDex nextImpl(DexManifest.Dex dex);

    public final int getLength() {
        return this.mDexes.length;
    }

    public final boolean hasNext() {
        if (this.mDexPos < this.mDexes.length) {
            return true;
        }
        return false;
    }

    public final InputDex next() {
        try {
            DexManifest.Dex[] dexArr = this.mDexes;
            int i = this.mDexPos;
            this.mDexPos = i + 1;
            return nextImpl(dexArr[i]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public InputDexIterator(DexManifest dexManifest, C14400pL r3, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        this.mDexes = dexManifest.dexes;
        this.mPatchingStrategy = r3;
        this.mQplCollector = lightweightQuickPerformanceLogger;
    }

    public void close() {
    }

    public final int getIdx() {
        return this.mDexPos;
    }
}
