package androidx.lifecycle;

import X.AnonymousClass060;
import X.AnonymousClass061;
import X.AnonymousClass066;
import X.C112626pv;
import X.C112636pw;
import X.C14260p5;
import X.C14340pE;
import X.C148838sG;
import X.C18180wK;
import X.C18200wM;
import java.util.concurrent.CancellationException;

public final /* synthetic */ class LifecycleController$$ExternalSyntheticLambda0 implements C14260p5 {
    public final /* synthetic */ C112636pw A00;
    public final /* synthetic */ C148838sG A01;

    public /* synthetic */ LifecycleController$$ExternalSyntheticLambda0(C112636pw r1, C148838sG r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void CMI(AnonymousClass060 r7, AnonymousClass066 r8) {
        C112636pw r5 = this.A00;
        C148838sG r4 = this.A01;
        boolean A1Z = C18200wM.A1Z(r8);
        if (((C14340pE) r8.getLifecycle()).A00 == AnonymousClass061.DESTROYED) {
            r4.AC7((CancellationException) null);
            r5.A00();
            return;
        }
        int compareTo = ((C14340pE) r8.getLifecycle()).A00.compareTo(r5.A01);
        C112626pv r1 = r5.A00;
        if (compareTo < 0) {
            r1.A01 = A1Z;
        } else if (!r1.A01) {
        } else {
            if (!r1.A00) {
                r1.A01 = false;
                r1.A00();
                return;
            }
            throw C18180wK.A0a("Cannot resume a finished dispatcher");
        }
    }
}
