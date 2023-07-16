package X;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.7tU  reason: invalid class name and case insensitive filesystem */
public final class C132187tU implements AnonymousClass0i1 {
    public final C113896sL A00;
    public C112816qF flmEffectsDeletionManager;

    public C132187tU(C132157tR r9, H87 h87, FA3 fa3, AnonymousClass0IB r12, C31580Grx grx, ScheduledExecutorService scheduledExecutorService) {
        C132157tR r5 = r9;
        AnonymousClass0wJ.A1Q(r9, h87);
        C31580Grx grx2 = grx;
        C04220Ms.A0B(grx, 5);
        C111726oD r4 = new C111726oD(grx);
        boolean A0E = C63803iN.A0E(AnonymousClass0TJ.A05, fa3.A01, 2342162403719910545L);
        C113896sL r3 = new C113896sL(r4, scheduledExecutorService, A0E);
        this.A00 = r3;
        if (A0E) {
            this.flmEffectsDeletionManager = new C112816qF(r3, h87.A01(), r5, r12, grx2);
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
    }
}
