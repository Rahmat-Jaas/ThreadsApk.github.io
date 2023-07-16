package X;

import androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1;
import androidx.lifecycle.SavedStateHandleController;

/* renamed from: X.6wI  reason: invalid class name and case insensitive filesystem */
public final class C116026wI {
    public static final void A01(AnonymousClass062 r2, AnonymousClass070 r3) {
        AnonymousClass061 r1 = ((C14340pE) r2).A00;
        if (r1 == AnonymousClass061.INITIALIZED || r1.A00(AnonymousClass061.STARTED)) {
            r3.A04(C125087cP.class);
        } else {
            r2.A07(new LegacySavedStateHandleController$tryToAddRecreator$1(r2, r3));
        }
    }

    public static final void A00(AnonymousClass062 r2, C62793ak r3, AnonymousClass070 r4) {
        AnonymousClass0wJ.A1N(r3, r4);
        C04220Ms.A0B(r2, 2);
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) r3.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.A00) {
            savedStateHandleController.A00(r2, r4);
            A01(r2, r4);
        }
    }
}
