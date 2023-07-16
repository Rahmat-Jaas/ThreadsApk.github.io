package X;

import android.app.Dialog;
import android.os.Bundle;

/* renamed from: X.55w  reason: invalid class name */
public class AnonymousClass55w extends AnonymousClass099 {
    public final void A09(Dialog dialog, int i) {
        if (dialog instanceof C39918L7q) {
            C39918L7q l7q = (C39918L7q) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            l7q.A01().A0M(1);
            return;
        }
        super.A09(dialog, i);
    }

    public Dialog A0C(Bundle bundle) {
        return new C39918L7q(getContext(), A04());
    }
}
