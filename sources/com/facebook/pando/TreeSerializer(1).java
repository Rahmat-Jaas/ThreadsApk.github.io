package com.facebook.pando;

import X.AnonymousClass6HT;
import X.C15020qa;
import java.nio.ByteBuffer;

public final class TreeSerializer {
    public static final AnonymousClass6HT Companion = new AnonymousClass6HT();

    public static final native TreeJNI deserializeFromBytesNative(ByteBuffer byteBuffer, Class cls);

    public static final native ByteBuffer serializeAsBytes(TreeJNI treeJNI);

    static {
        C15020qa.A0A("pando-serialize-jni");
    }
}
