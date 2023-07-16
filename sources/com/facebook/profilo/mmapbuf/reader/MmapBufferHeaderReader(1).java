package com.facebook.profilo.mmapbuf.reader;

import X.C15020qa;
import com.facebook.jni.HybridData;

public class MmapBufferHeaderReader {
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    public native long readTraceId(String str);

    static {
        C15020qa.A0A("profilo_mmapbuf_rdr");
    }
}
