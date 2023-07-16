package com.facebook.common.dextricks;

import dalvik.system.DexFile;

public interface DexFileAccessListener {
    void onClassLoadedFromDexFile(Class cls, DexFile dexFile);
}
