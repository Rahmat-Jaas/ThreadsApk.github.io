package X;

import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;

/* renamed from: X.0Uk  reason: invalid class name */
public abstract class AnonymousClass0Uk {
    public TraceContext A00;
    public String A01;
    public boolean A02;
    public int A03;
    public MultiBufferLogger A04;
    public volatile boolean A05;

    public boolean A07() {
        return false;
    }

    public abstract void disable();

    public abstract void enable();

    public abstract int getSupportedProviders();

    public abstract int getTracingProviders();

    public void onTraceEnded(TraceContext traceContext, C08000cZ r2) {
    }

    public void onTraceStarted(TraceContext traceContext, C08000cZ r2) {
    }

    public final MultiBufferLogger A03() {
        if (!this.A05) {
            synchronized (this) {
                if (!this.A05) {
                    this.A04 = new MultiBufferLogger();
                    this.A05 = true;
                }
            }
        }
        return this.A04;
    }

    /* JADX INFO: finally extract failed */
    public final void A04() {
        if (!this.A02) {
            synchronized (this) {
                if (!this.A02) {
                    MultiBufferLogger A032 = A03();
                    try {
                        int writeStandardEntry = A032.writeStandardEntry(6, 21, 0, 0, 0, 0, 0);
                        String str = this.A01;
                        A032.writeBytesEntry(0, 83, writeStandardEntry, AnonymousClass00U.A0L("ensureSoLibLoaded: ", str));
                        C15020qa.A0A(str);
                        this.A02 = true;
                        A032.writeStandardEntry(6, 22, 0, 0, 0, 0, 0);
                    } catch (Throwable th) {
                        A032.writeStandardEntry(6, 22, 0, 0, 0, 0, 0);
                        throw th;
                    }
                }
            }
        }
    }

    public AnonymousClass0Uk(String str) {
        this.A01 = str;
        this.A02 = str == null;
    }

    private void A02(TraceContext traceContext) {
        int supportedProviders = getSupportedProviders() & TraceEvents.sProviders;
        int i = this.A03;
        if (i == 0 || (TraceEvents.sProviders & i) != (i = this.A03)) {
            if (i != 0) {
                disable();
                this.A00 = null;
            }
            if (supportedProviders != 0) {
                this.A00 = traceContext;
                enable();
            }
            this.A03 = supportedProviders;
        }
    }

    public final void A05(TraceContext traceContext, C08000cZ r5) {
        int i;
        int A032 = C14030oh.A03(565695267);
        if (this.A03 == 0 || (traceContext.A02 & getSupportedProviders()) == 0) {
            i = 1976702663;
        } else {
            A04();
            onTraceEnded(traceContext, r5);
            A02(traceContext);
            A03().removeBuffer(traceContext.A09);
            i = -886804755;
        }
        C14030oh.A0A(i, A032);
    }

    public final void A06(TraceContext traceContext, C08000cZ r5) {
        int i;
        int A032 = C14030oh.A03(-968538987);
        if ((traceContext.A02 & getSupportedProviders()) == 0) {
            i = 1275317900;
        } else {
            A03().addBuffer(traceContext.A09);
            A04();
            A02(traceContext);
            onTraceStarted(traceContext, r5);
            i = 1881992226;
        }
        C14030oh.A0A(i, A032);
    }

    public AnonymousClass0Uk() {
        this((String) null);
    }
}
