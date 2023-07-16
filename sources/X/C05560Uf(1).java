package X;

import com.facebook.profilo.ipc.TraceContext;

/* renamed from: X.0Uf  reason: invalid class name and case insensitive filesystem */
public final class C05560Uf {
    public static void A00(C05680Uw r9) {
        C05680Uw r3 = r9;
        for (TraceContext traceContext : r9.A06()) {
            if ((traceContext.A03 & 2) == 0) {
                C05680Uw.A04(r3, traceContext.A0B, traceContext.A01, 0, 5, traceContext.A05);
            }
        }
    }
}
