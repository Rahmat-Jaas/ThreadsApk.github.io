package com.facebook.cameracore.ardelivery.xplatcache;

import X.C15020qa;
import com.facebook.jni.HybridClassBase;
import java.nio.ByteBuffer;

public class ARDFileResourceMeta extends HybridClassBase {
    public native ByteBuffer getExtra();

    static {
        C15020qa.A0A("ardcache-jni");
    }
}
