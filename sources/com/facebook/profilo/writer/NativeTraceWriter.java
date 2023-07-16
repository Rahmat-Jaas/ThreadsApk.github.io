package com.facebook.profilo.writer;

import X.C15020qa;
import com.facebook.jni.HybridData;
import com.facebook.profilo.mmapbuf.core.Buffer;

public final class NativeTraceWriter {
    public HybridData mHybridData;

    public static native HybridData initHybrid(Buffer buffer, String str, String str2, NativeTraceWriterCallbacks nativeTraceWriterCallbacks);

    public native void dump(long j);

    public native String getTraceFolder(long j);

    public native void loop();

    static {
        C15020qa.A0A("profilo");
    }

    public NativeTraceWriter(Buffer buffer, String str, String str2, NativeTraceWriterCallbacks nativeTraceWriterCallbacks) {
        this.mHybridData = initHybrid(buffer, str, str2, nativeTraceWriterCallbacks);
    }
}
