package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import com.facebook.common.dextricks.MultiDexClassLoader;
import com.facebook.common.dextricks.OdexScheme;
import java.io.File;

public final class OdexSchemeInvalid extends OdexScheme {
    public final long mStatus;

    public OdexSchemeInvalid(long j) {
        super(2, new String[0]);
        this.mStatus = j;
    }

    public String getSchemeName() {
        return "OdexSchemeInvalid";
    }

    public void configureClassLoader(File file, MultiDexClassLoader.Configuration configuration) {
        throw new UnsupportedOperationException(AnonymousClass00U.A0L("invalid state: ", Long.toHexString(this.mStatus)));
    }

    public OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        throw new UnsupportedOperationException(AnonymousClass00U.A0L("invalid state: ", Long.toHexString(this.mStatus)));
    }
}
