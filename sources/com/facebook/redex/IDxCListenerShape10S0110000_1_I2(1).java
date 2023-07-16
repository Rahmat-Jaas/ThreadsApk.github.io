package com.facebook.redex;

import X.AnonymousClass006;
import X.C04220Ms;
import X.C15730rn;
import X.C18180wK;
import X.C29061we;
import X.C30618GNg;
import X.C63723iC;
import android.content.DialogInterface;

public class IDxCListenerShape10S0110000_1_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public boolean A01;
    public final int A02;

    public IDxCListenerShape10S0110000_1_I2(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A02;
        Object obj = this.A00;
        if (i2 != 0) {
            C63723iC r3 = (C63723iC) obj;
            C18180wK.A1K(C15730rn.A00(r3.A03, "logout_d2_logout_tapped"), r3.A08);
            r3.A0D(AnonymousClass006.A00, this.A01);
            return;
        }
        C29061we r32 = (C29061we) obj;
        if (r32.A00 == null) {
            C04220Ms.A0E("analyticsLogger");
            throw null;
        }
        C30618GNg.A00(2, "settings");
        C29061we.A0B(r32, this.A01);
    }
}
