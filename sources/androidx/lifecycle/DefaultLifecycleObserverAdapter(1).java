package androidx.lifecycle;

import X.AnonymousClass060;
import X.AnonymousClass066;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C14260p5;
import X.C147858q2;
import X.C18190wL;

public final class DefaultLifecycleObserverAdapter implements C14260p5 {
    public final C147858q2 A00;
    public final C14260p5 A01;

    public DefaultLifecycleObserverAdapter(C147858q2 r2, C14260p5 r3) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void CMI(AnonymousClass060 r2, AnonymousClass066 r3) {
        AnonymousClass0wJ.A1N(r3, r2);
        switch (r2.ordinal()) {
            case 0:
                this.A00.BsJ(r3);
                break;
            case 2:
                this.A00.CHK(r3);
                break;
            case 3:
                this.A00.CAO(r3);
                break;
            case 5:
                this.A00.Btb(r3);
                break;
            case 6:
                throw C18190wL.A0a("ON_ANY must not been send by anybody");
        }
        C14260p5 r0 = this.A01;
        if (r0 != null) {
            r0.CMI(r2, r3);
        }
    }
}
