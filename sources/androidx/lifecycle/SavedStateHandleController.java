package androidx.lifecycle;

import X.AnonymousClass060;
import X.AnonymousClass062;
import X.AnonymousClass066;
import X.AnonymousClass070;
import X.AnonymousClass0wJ;
import X.C121177En;
import X.C14260p5;
import X.C18180wK;

public final class SavedStateHandleController implements C14260p5 {
    public boolean A00;
    public final C121177En A01;
    public final String A02;

    public final void A00(AnonymousClass062 r3, AnonymousClass070 r4) {
        if (!this.A00) {
            this.A00 = true;
            r3.A07(this);
            r4.A03(this.A01.A00, this.A02);
            return;
        }
        throw C18180wK.A0a("Already attached to lifecycleOwner");
    }

    public SavedStateHandleController(C121177En r1, String str) {
        this.A02 = str;
        this.A01 = r1;
    }

    public final void CMI(AnonymousClass060 r3, AnonymousClass066 r4) {
        boolean A1Y = AnonymousClass0wJ.A1Y(r4, r3);
        if (r3 == AnonymousClass060.ON_DESTROY) {
            this.A00 = A1Y;
            r4.getLifecycle().A08(this);
        }
    }
}
