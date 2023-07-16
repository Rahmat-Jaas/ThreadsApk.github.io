package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.MultiBufferLogger;

/* renamed from: X.0JF  reason: invalid class name */
public final class AnonymousClass0JF extends AnonymousClass0Uk implements AnonymousClass0S8, C07620bo {
    public static final int A00 = ProvidersRegistry.A00.A02("frameworks");
    public static final AnonymousClass0JF A01 = new AnonymousClass0JF();

    public AnonymousClass0JF() {
        super((String) null);
    }

    public final Integer BI0() {
        if (TraceEvents.isEnabled(A00)) {
            return AnonymousClass006.A00;
        }
        return AnonymousClass006.A0C;
    }

    public final int getTracingProviders() {
        return A00 & TraceEvents.sProviders;
    }

    public final void BjR(C05190Ru r19) {
        String str;
        MultiBufferLogger A03 = A03();
        int writeStandardEntry = A03.writeStandardEntry(7, 21, 0, 0, 0, 0, 0);
        C05190Ru r6 = r19;
        String tag = r6.getTag();
        int BIZ = r6.BIZ();
        A03.writeBytesEntry(1, 83, writeStandardEntry, tag);
        int writeBytesEntry = A03.writeBytesEntry(1, 56, writeStandardEntry, "runnable_parent");
        if (!r6.BOQ() || (str = String.valueOf(r6.B04())) == null) {
            str = "null";
        }
        A03.writeBytesEntry(1, 57, writeBytesEntry, str);
        A03.writeBytesEntry(1, 57, A03.writeBytesEntry(1, 56, writeStandardEntry, "runnable_identifier"), String.valueOf(r6.Abd()));
        A03.writeBytesEntry(1, 57, A03.writeBytesEntry(1, 56, writeStandardEntry, "app_custom_type"), String.valueOf(BIZ));
        if (!r6.BUI(1)) {
            A03.writeBytesEntry(1, 57, A03.writeBytesEntry(1, 56, writeStandardEntry, "indirect_edge"), Boolean.TRUE.toString());
        }
        if (r6.BUI(2)) {
            A03.writeBytesEntry(1, 57, A03.writeBytesEntry(1, 56, writeStandardEntry, "manual_point"), Boolean.TRUE.toString());
        }
    }

    public final void BtC(C05190Ru r11) {
        A03().writeStandardEntry(7, 22, 0, 0, 0, 0, 0);
    }

    public final void disable() {
        C14030oh.A0A(1367702729, C14030oh.A03(490300291));
    }

    public final void enable() {
        C14030oh.A0A(-121883827, C14030oh.A03(-369493429));
    }

    public final int getSupportedProviders() {
        return A00;
    }
}
