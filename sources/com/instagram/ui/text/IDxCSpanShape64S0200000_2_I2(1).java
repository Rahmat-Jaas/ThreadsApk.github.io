package com.instagram.ui.text;

import X.C10650ih;
import X.C15430rJ;
import X.C18240wQ;
import X.C18730xl;
import X.C25828Dsm;
import android.content.DialogInterface;
import android.view.View;
import com.facebookpay.connect.models.ConnectLearnMoreConfig;

public class IDxCSpanShape64S0200000_2_I2 extends C18730xl {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxCSpanShape64S0200000_2_I2(int i, int i2, Object obj, Object obj2) {
        super(i);
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onClick(View view) {
        if (this.A02 != 0) {
            ((DialogInterface.OnClickListener) this.A01).onClick(((C25828Dsm) this.A00).A05, 0);
            return;
        }
        C10650ih.A06(C18240wQ.A0I(this.A01), C15430rJ.A01(((ConnectLearnMoreConfig) this.A00).A01));
    }
}
