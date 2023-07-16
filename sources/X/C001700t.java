package X;

import kotlin.Unit;

/* renamed from: X.00t  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C001700t extends AnonymousClass019 implements AnonymousClass0ZU {
    public static final C001700t A00 = new C001700t();

    public C001700t() {
        super(0, C09690fw.class, "performThreadInterruptPreCheckRunnable", "performThreadInterruptPreCheckRunnable()V", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String valueOf;
        if (Thread.interrupted()) {
            Object obj = C09690fw.A00.get();
            if (obj == null) {
                valueOf = "Unable to find runnable id.";
            } else {
                valueOf = String.valueOf(obj);
            }
            C10450iM.A00().CuW("IgExecutor-Leaked-Interrupted-State-Pre-Execution", valueOf);
        }
        return Unit.A00;
    }
}
