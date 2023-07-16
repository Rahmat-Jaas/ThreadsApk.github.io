package com.facebook.common.lyra;

import X.C15020qa;
import java.util.concurrent.atomic.AtomicBoolean;

public final class LyraManager {
    public static final LyraManager INSTANCE = new LyraManager();
    public static final AtomicBoolean initialized = new AtomicBoolean(false);

    public static final native void installLibraryIdentifierFunction();

    public static final native boolean nativeInstallLyraHook(boolean z);

    static {
        C15020qa.A0A("lyramanager");
    }
}
