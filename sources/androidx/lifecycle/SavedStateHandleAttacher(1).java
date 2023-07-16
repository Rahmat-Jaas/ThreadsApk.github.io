package androidx.lifecycle;

import X.AnonymousClass060;
import X.AnonymousClass066;
import X.AnonymousClass0wJ;
import X.C125097cR;
import X.C14260p5;
import X.C18180wK;

public final class SavedStateHandleAttacher implements C14260p5 {
    public final C125097cR A00;

    public SavedStateHandleAttacher(C125097cR r1) {
        this.A00 = r1;
    }

    public final void CMI(AnonymousClass060 r5, AnonymousClass066 r6) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r6, r5);
        if (r5 == AnonymousClass060.ON_CREATE) {
            r6.getLifecycle().A08(this);
            C125097cR r2 = this.A00;
            if (!r2.A01) {
                r2.A00 = r2.A02.A00("androidx.lifecycle.internal.SavedStateHandlesProvider");
                r2.A01 = A1Z;
                r2.A03.getValue();
                return;
            }
            return;
        }
        throw C18180wK.A0a(AnonymousClass0wJ.A0t("Next event must be ON_CREATE, it was ", r5));
    }
}
