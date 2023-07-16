package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.profilo.provider.perfevents.PerfEventsSession;

/* renamed from: X.0dl  reason: invalid class name and case insensitive filesystem */
public final class C08560dl extends AnonymousClass0Uk {
    public static final int A02 = ProvidersRegistry.A00.A02("faults");
    public PerfEventsSession A00 = null;
    public boolean A01;

    public C08560dl() {
        super("profilo_perfevents");
    }

    public final int getTracingProviders() {
        TraceContext traceContext;
        if (!this.A01 || (traceContext = this.A00) == null) {
            return 0;
        }
        return traceContext.A02 & A02;
    }

    public final void disable() {
        int A03 = C14030oh.A03(2042172352);
        this.A01 = false;
        PerfEventsSession perfEventsSession = this.A00;
        if (perfEventsSession != null) {
            perfEventsSession.stop();
            synchronized (perfEventsSession) {
                long j = perfEventsSession.mNativeHandle;
                if (j != 0) {
                    PerfEventsSession.nativeDetach(j);
                    perfEventsSession.mNativeHandle = 0;
                }
            }
        }
        this.A00 = null;
        C14030oh.A0A(524046475, A03);
    }

    public final void enable() {
        IllegalStateException illegalStateException;
        boolean z;
        int A03 = C14030oh.A03(-1337747942);
        PerfEventsSession perfEventsSession = this.A00;
        if (perfEventsSession == null) {
            perfEventsSession = new PerfEventsSession();
            this.A00 = perfEventsSession;
        }
        int i = this.A00.A02;
        MultiBufferLogger A032 = A03();
        synchronized (perfEventsSession) {
            long j = perfEventsSession.mNativeHandle;
            if (j == 0) {
                z = false;
                if ((i & A02) != 0) {
                    j = PerfEventsSession.nativeAttach(true, 1, 3, 0.5f, A032);
                    perfEventsSession.mNativeHandle = j;
                }
                if (j != 0) {
                    z = true;
                }
            } else {
                illegalStateException = new IllegalStateException("Already attached");
            }
            throw illegalStateException;
        }
        if (z) {
            this.A01 = true;
            synchronized (perfEventsSession) {
                if (perfEventsSession.mThread == null) {
                    Thread thread = new Thread(perfEventsSession.mSessionRunnable, "Prflo:PerfEvt");
                    thread.start();
                    perfEventsSession.mThread = thread;
                } else {
                    illegalStateException = new IllegalStateException("Thread is already running");
                    throw illegalStateException;
                }
            }
        }
        C14030oh.A0A(-1251311378, A03);
    }

    public final int getSupportedProviders() {
        return A02;
    }
}
