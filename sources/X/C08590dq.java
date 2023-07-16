package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import java.io.File;

/* renamed from: X.0dq  reason: invalid class name and case insensitive filesystem */
public final class C08590dq extends AnonymousClass0Uk {
    public static C08590dq A02;
    public static String A03;
    public static final int A04;
    public String A00 = "UNKNOWN_TRACEID";
    public C39731Kyt A01;

    public C08590dq() {
        super((String) null);
    }

    public final synchronized String A08() {
        String str;
        str = this.A00;
        if (str.equals("UNKNOWN_TRACEID")) {
            str = "UNKNOWN_SESSIONID";
        }
        return str;
    }

    public final synchronized void enable() {
        String str;
        int A032 = C14030oh.A03(-1366642477);
        TraceContext traceContext = this.A00;
        if (traceContext != null) {
            str = AnonymousClass00U.A0V(traceContext.A0D, "-", A03);
        } else {
            str = "UNKNOWN_TRACEID";
        }
        this.A00 = str;
        if (!(traceContext == null || this.A01 == null)) {
            File file = null;
            if (C08000cZ.A0A.get() != null) {
                file = C08000cZ.A00().A04(this, traceContext);
            }
            this.A01.CvC(file, false);
        }
        C14030oh.A0A(-1545402783, A032);
    }

    public final synchronized void onTraceEnded(TraceContext traceContext, C08000cZ r7) {
        TraceContext traceContext2 = this.A00;
        if (traceContext2 != null && traceContext.A06 == traceContext2.A06) {
            this.A00 = "UNKNOWN_TRACEID";
            C39731Kyt kyt = this.A01;
            if (kyt != null) {
                kyt.Cw5(r7.A04(this, traceContext));
            }
        }
    }

    static {
        C05630Un r1 = ProvidersRegistry.A00;
        A04 = r1.A02("transient_network_data");
        r1.A02("cell_diagnostic_data");
    }

    public static synchronized C08590dq A00() {
        C08590dq r0;
        synchronized (C08590dq.class) {
            if (A02 == null) {
                A02 = new C08590dq();
                A03 = AnonymousClass0KY.A00().A02();
            }
            r0 = A02;
        }
        return r0;
    }

    public final int getTracingProviders() {
        File file;
        TraceContext traceContext = this.A00;
        if (traceContext == null || C08000cZ.A0A.get() == null) {
            file = null;
        } else {
            file = C08000cZ.A00().A04(this, traceContext);
        }
        C39731Kyt kyt = this.A01;
        if (kyt == null || !kyt.BZC(file)) {
            return 0;
        }
        return A04;
    }

    public final void disable() {
        C14030oh.A0A(408544169, C14030oh.A03(-1367152439));
    }

    public final int getSupportedProviders() {
        return A04;
    }
}
