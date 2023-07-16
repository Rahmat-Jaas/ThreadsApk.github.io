package com.facebook.common.restricks;

import X.AnonymousClass0LU;
import X.C15020qa;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class FBAssetManager {
    public static ConcurrentLinkedQueue fileNames;
    public static final FBAssetManager sInstance = new FBAssetManager();

    public static native void initColorResourceInterceptionProxies();

    public static native void initJNIProxy();

    public static native void initLoadResourceValueProxy();

    public static native void initResourceCoverage();

    public static void onResourceValueLoaded(Object obj, int i) {
        if (obj.equals((Object) null)) {
            throw null;
        }
    }

    public static void onAssetLoaded(String str) {
        fileNames.add(str);
    }

    public FBAssetManager() {
        try {
            C15020qa.A0A("restricks");
            initJNIProxy();
        } catch (Throwable th) {
            AnonymousClass0LU.A0I("FBAssetManager", "Error initializing FBAssetManager", th);
        }
        fileNames = new ConcurrentLinkedQueue();
    }

    public static int interceptLoadedColorValue(int i, int i2) {
        return i2;
    }
}
