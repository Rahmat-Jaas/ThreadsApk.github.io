package com.facebook.profilo.provider.threadmetadata;

import X.C07970cW;
import X.C08000cZ;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.mmapbuf.core.Buffer;

public final class ThreadMetadataProvider extends C07970cW {
    public static native void nativeLogThreadMetadata(Buffer buffer);

    public ThreadMetadataProvider() {
        super("profilo_threadmetadata");
    }

    public void logOnTraceEnd(TraceContext traceContext, C08000cZ r3) {
        nativeLogThreadMetadata(traceContext.A09);
    }
}
