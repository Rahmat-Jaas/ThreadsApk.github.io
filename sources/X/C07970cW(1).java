package X;

import com.facebook.profilo.ipc.TraceContext;

/* renamed from: X.0cW  reason: invalid class name and case insensitive filesystem */
public abstract class C07970cW extends AnonymousClass0Uk {
    public void A08(TraceContext traceContext, C08000cZ r2) {
    }

    public final int getSupportedProviders() {
        return -1;
    }

    public final int getTracingProviders() {
        return 0;
    }

    public void logOnTraceEnd(TraceContext traceContext, C08000cZ r2) {
    }

    public final void onTraceEnded(TraceContext traceContext, C08000cZ r4) {
        if (traceContext.A00 != 2) {
            logOnTraceEnd(traceContext, r4);
        }
    }

    public final void disable() {
        C14030oh.A0A(-1885709404, C14030oh.A03(-507039351));
    }

    public final void enable() {
        C14030oh.A0A(286608778, C14030oh.A03(1361811259));
    }

    public C07970cW(String str) {
        super(str);
    }

    public final void onTraceStarted(TraceContext traceContext, C08000cZ r2) {
        A08(traceContext, r2);
    }

    public C07970cW() {
        super((String) null);
    }
}
