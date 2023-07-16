package com.facebook.profilo.mmapbuf.writer;

import X.C15020qa;
import com.facebook.jni.HybridData;
import com.facebook.profilo.writer.NativeTraceWriterCallbacks;

public class MmapBufferTraceWriter {
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    public native long nativeInitAndVerify(String str);

    public native void nativeWriteTrace(String str, boolean z, String str2, String str3, int i, NativeTraceWriterCallbacks nativeTraceWriterCallbacks, String[] strArr);

    static {
        C15020qa.A0A("profilo_mmap_file_writer");
    }
}
