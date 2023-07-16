package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Set;

/* renamed from: X.07A  reason: invalid class name */
public final class AnonymousClass07A extends AnonymousClass0JP {
    public final void CDm(TraceContext traceContext, int i) {
        Set<String> A03 = ProvidersRegistry.A00.A03(i);
        StringBuilder sb = new StringBuilder();
        for (String str : A03) {
            if (sb.length() != 0) {
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            sb.append(str);
        }
        Buffer buffer = traceContext.A09;
        BufferLogger.writeBytesEntry(buffer, 0, 57, BufferLogger.writeBytesEntry(buffer, 0, 56, BufferLogger.writeStandardEntry(buffer, 6, 52, 0, 0, 8126514, 0, 0), "Active providers"), sb.toString());
    }

    public final void CDl(TraceContext traceContext) {
        long nanoTime = System.nanoTime();
        Buffer buffer = traceContext.A09;
        BufferLogger.writeBytesEntry(buffer, 0, 83, BufferLogger.writeStandardEntry(buffer, 4, 21, nanoTime, 0, 0, 0, 0), "Profilo.ProvidersInitialized");
        BufferLogger.writeStandardEntry(buffer, 4, 22, nanoTime, 0, 0, 0, 0);
    }
}
