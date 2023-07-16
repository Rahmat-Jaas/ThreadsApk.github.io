package X;

import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.writer.NativeTraceWriterCallbacks;

/* renamed from: X.0cX  reason: invalid class name and case insensitive filesystem */
public final class C07980cX implements NativeTraceWriterCallbacks {
    public final /* synthetic */ AnonymousClass0Uy A00;
    public final /* synthetic */ TraceContext A01;

    public C07980cX(AnonymousClass0Uy r1, TraceContext traceContext) {
        this.A00 = r1;
        this.A01 = traceContext;
    }

    public final void onTraceWriteAbort(long j, int i) {
        this.A00.A02.CPv(this.A01, i);
    }

    public final void onTraceWriteEnd(long j) {
        this.A00.A02.CPw(this.A01);
    }

    public final void onTraceWriteException(long j, Throwable th) {
        this.A00.A02.CPx(this.A01, th);
    }

    public final void onTraceWriteStart(long j, int i) {
        this.A00.A02.CPy(this.A01);
    }
}
