package com.facebook.cameracore.ardelivery.compression.tarbrotli;

import X.C15020qa;
import com.facebook.jni.HybridData;

public class TarBrotliDecompressor {
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    private native int unarchiveFile(String str, String str2);

    static {
        C15020qa.A0A("tar-brotli-archive-native");
    }
}
