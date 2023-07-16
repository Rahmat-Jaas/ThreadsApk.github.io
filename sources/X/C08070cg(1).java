package X;

import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.writer.NativeTraceWriterCallbacks;

/* renamed from: X.0cg  reason: invalid class name and case insensitive filesystem */
public final class C08070cg implements NativeTraceWriterCallbacks {
    public final /* synthetic */ C08000cZ A00;
    public final /* synthetic */ TraceContext A01;

    public C08070cg(TraceContext traceContext, C08000cZ r2) {
        this.A00 = r2;
        this.A01 = traceContext;
    }

    public final void onTraceWriteAbort(long j, int i) {
        this.A00.CPv(this.A01, i);
    }

    public final void onTraceWriteEnd(long j) {
        this.A00.CPw(this.A01);
    }

    public final void onTraceWriteException(long j, Throwable th) {
        this.A00.CPx(this.A01, th);
    }

    public final void onTraceWriteStart(long j, int i) {
        this.A00.CPy(this.A01);
    }
}
