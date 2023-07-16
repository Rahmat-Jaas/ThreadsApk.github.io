package X;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry$$ExternalSyntheticLambda0;

/* renamed from: X.072  reason: invalid class name */
public final class AnonymousClass072 {
    public boolean A00;
    public final AnonymousClass070 A01 = new AnonymousClass070();
    public final C15750rp A02;

    public final void A00() {
        C15750rp r4 = this.A02;
        AnonymousClass062 lifecycle = r4.getLifecycle();
        if (((C14340pE) lifecycle).A00 == AnonymousClass061.INITIALIZED) {
            lifecycle.A07(new Recreator(r4));
            AnonymousClass070 r1 = this.A01;
            if (!r1.A01) {
                lifecycle.A07(new SavedStateRegistry$$ExternalSyntheticLambda0(r1));
                r1.A01 = true;
                this.A00 = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public final void A01(Bundle bundle) {
        Bundle bundle2;
        if (!this.A00) {
            A00();
        }
        C14340pE r2 = (C14340pE) this.A02.getLifecycle();
        if (!r2.A00.A00(AnonymousClass061.STARTED)) {
            AnonymousClass070 r22 = this.A01;
            if (!r22.A01) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
            } else if (!r22.A03) {
                if (bundle != null) {
                    bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                } else {
                    bundle2 = null;
                }
                r22.A00 = bundle2;
                r22.A03 = true;
            } else {
                throw new IllegalStateException("SavedStateRegistry was already restored.");
            }
        } else {
            StringBuilder sb = new StringBuilder("performRestore cannot be called when owner is ");
            sb.append(r2.A00);
            throw new IllegalStateException(sb.toString());
        }
    }

    public AnonymousClass072(C15750rp r2) {
        this.A02 = r2;
    }
}
