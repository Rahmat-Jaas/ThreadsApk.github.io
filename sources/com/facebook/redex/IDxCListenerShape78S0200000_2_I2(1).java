package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass564;
import X.AnonymousClass57S;
import X.AnonymousClass5xc;
import X.AnonymousClass771;
import X.AnonymousClass7G1;
import X.C114026sZ;
import X.C11630kW;
import X.C122027Jo;
import X.C171209wF;
import X.C18220wO;
import X.C30857GZr;
import X.C37412JrW;
import X.C91955hM;
import X.C92305hx;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.fbpay.w3c.CardDetails;

public class IDxCListenerShape78S0200000_2_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape78S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface.OnClickListener onClickListener;
        int i2;
        switch (this.A02) {
            case 0:
                C91955hM r2 = ((C92305hx) ((IDxCListenerShape203S0100000_2_I2) this.A00).A00).A00;
                r2.A05.A0H(((String[]) this.A01)[i]);
                return;
            case 1:
                dialogInterface.cancel();
                onClickListener = ((C114026sZ) this.A01).A07;
                if (onClickListener != null) {
                    i2 = -2;
                    break;
                } else {
                    return;
                }
            case 2:
                dialogInterface.dismiss();
                onClickListener = ((C114026sZ) this.A01).A09;
                if (onClickListener != null) {
                    i2 = -1;
                    break;
                } else {
                    return;
                }
            case 3:
                AnonymousClass564 r4 = (AnonymousClass564) this.A01;
                AnonymousClass771 r5 = (AnonymousClass771) this.A00;
                FragmentActivity activity = r4.getActivity();
                if (activity != null) {
                    activity.setResult(0, AnonymousClass564.A00((CardDetails) null, r4, r5, -1L, -1));
                }
                C18220wO.A18(r4);
                return;
            case 4:
                AnonymousClass5xc r42 = (AnonymousClass5xc) this.A01;
                AnonymousClass57S r0 = (AnonymousClass57S) r42.A02.getValue();
                C122027Jo.A01(r0.A00, r0.A01, AnonymousClass006.A04, AnonymousClass006.A0u);
                C37412JrW.A06((FragmentActivity) this.A00, AnonymousClass0wJ.A0X(r42.A01), C171209wF.A0k, (Long) null, "https://help.instagram.com/523408036294825", AnonymousClass5xc.__redex_internal_original_name);
                return;
            default:
                AnonymousClass7G1.A00((C11630kW) this.A00, ((C30857GZr) this.A01).A07);
                return;
        }
        onClickListener.onClick(dialogInterface, i2);
    }
}
