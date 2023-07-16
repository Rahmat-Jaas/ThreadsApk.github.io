package X;

import com.facebook.profilo.core.TriggerRegistry;
import java.util.Random;

/* renamed from: X.0Jf  reason: invalid class name and case insensitive filesystem */
public final class C03550Jf extends C07890cN {
    public static final int A01 = TriggerRegistry.A00.A02("black_box");
    public final ThreadLocal A00 = new AnonymousClass0UU(this);

    public final boolean A03() {
        return true;
    }

    public final boolean A04(Object obj, Object obj2, long j, long j2) {
        return j == 0 || j2 == 0 || j == j2;
    }

    public final /* bridge */ /* synthetic */ Object A05(AnonymousClass0UJ r11) {
        AnonymousClass0UJ r4 = r11;
        for (int i : r11.getTraceConfigIdxs("startup", "start")) {
            if (r11.optTraceConfigParamBool(i, "trace_config.is_black_box", false)) {
                AnonymousClass0UV r1 = new AnonymousClass0UV();
                r1.A00 = r11.getTraceConfigParamInt(i, "trace_config.coinflip_sample_rate");
                r1.A02 = i;
                r1.A01 = r4.optTraceConfigTriggerParamInt(i, "qpl", "stop", "trigger.qpl.marker", 0);
                return r1;
            }
        }
        return new AnonymousClass0UV();
    }

    public final int A00(AnonymousClass0UJ r4, Object obj, long j) {
        AnonymousClass0UV r2 = (AnonymousClass0UV) A06(r4);
        if (r2.A02 == -1) {
            return -100;
        }
        if (((Random) this.A00.get()).nextInt(r2.A00) == 0) {
            return r2.A02;
        }
        return -101;
    }
}
