package X;

import android.content.Context;
import android.util.Pair;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.02g  reason: invalid class name and case insensitive filesystem */
public final class C005002g extends AnonymousClass0JP {
    public final Context A00;

    public static void A01(Buffer buffer, String str, String str2, int i) {
        Buffer buffer2 = buffer;
        int writeStandardEntry = BufferLogger.writeStandardEntry(buffer2, 6, 52, 0, 0, i, 0, 0);
        if (str != null) {
            writeStandardEntry = BufferLogger.writeBytesEntry(buffer2, 0, 56, writeStandardEntry, str);
        }
        BufferLogger.writeBytesEntry(buffer2, 0, 57, writeStandardEntry, str2);
    }

    private void A00(Buffer buffer) {
        String A01 = C30760GTu.A00(this.A00.getFilesDir()).A01();
        if (A01 != null) {
            A01(buffer, "PERF_TEST_INFO", A01, 8126489);
        }
    }

    public static void A02(String str) {
        Buffer buffer;
        C05680Uw r0 = C05680Uw.A0A;
        if (r0 != null) {
            for (TraceContext traceContext : r0.A06()) {
                if (!((traceContext.A03 & 2) == 0 || (buffer = traceContext.A09) == null)) {
                    buffer.updateId(str);
                }
            }
        }
    }

    public final void CPt(TraceContext traceContext) {
        Buffer buffer = traceContext.A09;
        Pair A02 = AnonymousClass0fS.A02(AnonymousClass0fS.A01(this.A00));
        A01(buffer, TraceFieldType.NetworkType, (String) A02.first, 8126485);
        A01(buffer, "network_subtype", (String) A02.second, 8126486);
        A00(buffer);
    }

    public C005002g(Context context) {
        this.A00 = context;
        A02(AnonymousClass0MI.A01());
    }

    public final void BrS() {
        AnonymousClass0Vt.A00().A04("IgProfiloTraceListener", "Start after config update");
        AnonymousClass0UF.A02();
    }

    public final void CPr(TraceContext traceContext) {
        A02(AnonymousClass0MI.A01());
    }
}
