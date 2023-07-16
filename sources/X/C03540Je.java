package X;

import com.facebook.profilo.core.TriggerRegistry;
import java.util.Random;

/* renamed from: X.0Je  reason: invalid class name and case insensitive filesystem */
public final class C03540Je extends C07890cN implements C05610Ul {
    public static final int A01 = TriggerRegistry.A00.A02("cold_start");
    public final ThreadLocal A00 = new AnonymousClass0UW(this);

    public final boolean A03() {
        return true;
    }

    public final boolean A04(Object obj, Object obj2, long j, long j2) {
        return ((int) j) == ((int) j2);
    }

    public final /* bridge */ /* synthetic */ Object A05(AnonymousClass0UJ r7) {
        for (int i : r7.getTraceConfigIdxs("qpl", "start")) {
            if (r7.optTraceConfigParamBool(i, "trace_config.is_cold_start", false)) {
                AnonymousClass0UX r1 = new AnonymousClass0UX();
                r1.A01 = i;
                r1.A00 = r7.getTraceConfigParamInt(i, "trace_config.coinflip_sample_rate");
                return r1;
            }
        }
        return new AnonymousClass0UX();
    }

    public final int A00(AnonymousClass0UJ r4, Object obj, long j) {
        AnonymousClass0UX r2 = (AnonymousClass0UX) A06(r4);
        if (r2.A01 == -1) {
            return -100;
        }
        if (((Random) this.A00.get()).nextInt(r2.A00) == 0) {
            return r2.A01;
        }
        return -101;
    }
}
