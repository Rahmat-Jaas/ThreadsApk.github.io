package com.facebook.profilo.provider.aslsession;

import X.AnonymousClass0MI;
import X.C07970cW;
import X.C08000cZ;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;

public class AslSessionIdProvider extends C07970cW {
    public AslSessionIdProvider() {
        super((String) null);
    }

    static {
        ProvidersRegistry.A00.A02("asl_session");
    }

    public final void A08(TraceContext traceContext, C08000cZ r16) {
        Buffer buffer = traceContext.A09;
        BufferLogger.writeBytesEntry(buffer, 0, 57, BufferLogger.writeBytesEntry(buffer, 0, 56, BufferLogger.writeStandardEntry(buffer, 6, 52, 0, 0, 8134124, 0, 0), "Asl Session Id"), AnonymousClass0MI.A01());
    }
}
