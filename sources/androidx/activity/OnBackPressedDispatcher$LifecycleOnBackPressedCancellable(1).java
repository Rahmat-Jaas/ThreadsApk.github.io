package androidx.activity;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass060;
import X.AnonymousClass062;
import X.AnonymousClass066;
import X.C04220Ms;
import X.C14260p5;

public final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements AnonymousClass001, C14260p5 {
    public AnonymousClass001 A00;
    public final AnonymousClass00C A01;
    public final AnonymousClass062 A02;
    public final /* synthetic */ AnonymousClass00F A03;

    public final void CMI(AnonymousClass060 r3, AnonymousClass066 r4) {
        C04220Ms.A0B(r3, 1);
        if (r3 == AnonymousClass060.ON_START) {
            this.A00 = this.A03.A01(this.A01);
        } else if (r3 == AnonymousClass060.ON_STOP) {
            AnonymousClass001 r0 = this.A00;
            if (r0 != null) {
                r0.cancel();
            }
        } else if (r3 == AnonymousClass060.ON_DESTROY) {
            cancel();
        }
    }

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(AnonymousClass00C r1, AnonymousClass00F r2, AnonymousClass062 r3) {
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r1;
        r3.A07(this);
    }

    public final void cancel() {
        this.A02.A08(this);
        this.A01.A02.remove(this);
        AnonymousClass001 r0 = this.A00;
        if (r0 != null) {
            r0.cancel();
        }
        this.A00 = null;
    }
}
