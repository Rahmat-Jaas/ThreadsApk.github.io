package X;

import android.app.Activity;

/* renamed from: X.4On  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C72534On implements Runnable {
    public final /* synthetic */ FOH A00;

    public /* synthetic */ C72534On(FOH foh) {
        this.A00 = foh;
    }

    public final void run() {
        FOH foh = this.A00;
        if (foh.A01 != null) {
            C25553Dnn A01 = AnonymousClass4DS.A01((Activity) foh.requireContext(), foh.requireContext().getString(2131824581));
            A01.A03(D0f.BELOW_ANCHOR);
            A01.A01(foh.A01);
            A01.A04(AnonymousClass3TC.A06);
            C18200wM.A1Q(A01);
        }
    }
}
