package com.google.android.material.bottomsheet;

import X.AnonymousClass564;
import X.AnonymousClass56X;
import X.AnonymousClass67R;
import X.C04220Ms;
import X.C18220wO;
import X.C18230wP;
import X.C36433JUv;
import android.app.Dialog;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;

public class IDxSCallbackShape97S0100000_2_I2 extends C36433JUv {
    public Object A00;
    public final int A01;

    public IDxSCallbackShape97S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void A02(View view, int i) {
        String str;
        if (this.A01 != 0) {
            if (i == 5) {
                ((Dialog) this.A00).cancel();
            }
        } else if (i == 5) {
            AnonymousClass564 r5 = (AnonymousClass564) this.A00;
            FragmentActivity activity = r5.getActivity();
            if (activity != null) {
                Intent A0B = C18230wP.A0B();
                AnonymousClass56X r0 = r5.A09;
                if (r0 == null) {
                    C04220Ms.A0E("viewModel");
                    throw null;
                }
                if (r0.A07.A08() == AnonymousClass67R.A03) {
                    str = "CANCELED_CARD_VERIFICATION";
                } else {
                    str = "CANCELED_CVV_VERIFICATION";
                }
                A0B.putExtra("keyResultEventName", str);
                activity.setResult(0, A0B);
            }
            C18220wO.A18(r5);
        }
    }

    public final void A01(View view, float f) {
    }
}
