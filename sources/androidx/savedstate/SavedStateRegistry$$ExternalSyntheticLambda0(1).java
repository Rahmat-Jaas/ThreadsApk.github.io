package androidx.savedstate;

import X.AnonymousClass060;
import X.AnonymousClass066;
import X.AnonymousClass070;
import X.C04220Ms;
import X.C14260p5;

public final /* synthetic */ class SavedStateRegistry$$ExternalSyntheticLambda0 implements C14260p5 {
    public final /* synthetic */ AnonymousClass070 A00;

    public /* synthetic */ SavedStateRegistry$$ExternalSyntheticLambda0(AnonymousClass070 r1) {
        this.A00 = r1;
    }

    public final void CMI(AnonymousClass060 r4, AnonymousClass066 r5) {
        AnonymousClass070 r2 = this.A00;
        C04220Ms.A0B(r4, 2);
        if (r4 == AnonymousClass060.ON_START) {
            r2.A02 = true;
        } else if (r4 == AnonymousClass060.ON_STOP) {
            r2.A02 = false;
        }
    }
}
