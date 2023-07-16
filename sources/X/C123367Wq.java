package X;

import android.view.View;
import android.view.autofill.AutofillManager;

/* renamed from: X.7Wq  reason: invalid class name and case insensitive filesystem */
public final class C123367Wq implements C141768cv {
    public final View A00;
    public final AutofillManager A01;
    public final C104106bF A02;

    public C123367Wq(View view, C104106bF r5) {
        boolean A1Z = C18200wM.A1Z(r5);
        this.A00 = view;
        this.A02 = r5;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.A01 = autofillManager;
            view.setImportantForAutofill(A1Z ? 1 : 0);
            return;
        }
        throw C18180wK.A0a("Autofill service could not be located.");
    }
}
