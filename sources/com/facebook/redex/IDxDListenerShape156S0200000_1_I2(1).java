package com.facebook.redex;

import X.AnonymousClass1iH;
import X.C22091Ti;
import X.C27950Ew0;
import X.C58023Dm;
import android.content.DialogInterface;
import com.instagram.user.model.User;

public class IDxDListenerShape156S0200000_1_I2 implements DialogInterface.OnDismissListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxDListenerShape156S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.A02 != 0) {
            ((C27950Ew0) this.A00).Bzk((User) this.A01);
            return;
        }
        C58023Dm r1 = ((AnonymousClass1iH) this.A00).A00;
        if (r1 != null) {
            r1.A00((C22091Ti) this.A01);
        }
    }
}
