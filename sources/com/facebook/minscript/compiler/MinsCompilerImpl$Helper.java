package com.facebook.minscript.compiler;

import X.C15020qa;
import java.nio.ByteBuffer;

public class MinsCompilerImpl$Helper {
    public static native ByteBuffer doCompile(byte[] bArr);

    static {
        C15020qa.A0A("minscompiler-jni");
    }
}
