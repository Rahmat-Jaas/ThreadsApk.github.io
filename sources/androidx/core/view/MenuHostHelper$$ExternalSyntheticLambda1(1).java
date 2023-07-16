package androidx.core.view;

import X.AnonymousClass02Q;
import X.AnonymousClass02V;
import X.AnonymousClass060;
import X.AnonymousClass061;
import X.AnonymousClass066;
import X.C012805y;
import X.C04220Ms;
import X.C14260p5;

public final /* synthetic */ class MenuHostHelper$$ExternalSyntheticLambda1 implements C14260p5 {
    public final /* synthetic */ AnonymousClass02Q A00;
    public final /* synthetic */ AnonymousClass02V A01;
    public final /* synthetic */ AnonymousClass061 A02;

    public /* synthetic */ MenuHostHelper$$ExternalSyntheticLambda1(AnonymousClass02Q r1, AnonymousClass02V r2, AnonymousClass061 r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void CMI(AnonymousClass060 r6, AnonymousClass066 r7) {
        AnonymousClass060 r0;
        AnonymousClass02Q r4 = this.A00;
        AnonymousClass061 r3 = this.A02;
        AnonymousClass02V r2 = this.A01;
        C04220Ms.A0B(r3, 0);
        int ordinal = r3.ordinal();
        if (ordinal == 2) {
            r0 = AnonymousClass060.ON_CREATE;
        } else if (ordinal == 3) {
            r0 = AnonymousClass060.ON_START;
        } else if (ordinal != 4) {
            r0 = null;
        } else {
            r0 = AnonymousClass060.ON_RESUME;
        }
        if (r6 == r0) {
            r4.A02.add(r2);
        } else if (r6 == AnonymousClass060.ON_DESTROY) {
            r4.A02(r2);
            return;
        } else if (r6 == C012805y.A00(r3)) {
            r4.A02.remove(r2);
        } else {
            return;
        }
        r4.A00.run();
    }
}
