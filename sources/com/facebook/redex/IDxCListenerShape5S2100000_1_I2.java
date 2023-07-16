package com.facebook.redex;

import X.C18180wK;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C24751jz;
import X.C28174Ezk;
import X.C36941JhV;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;

public class IDxCListenerShape5S2100000_1_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    public IDxCListenerShape5S2100000_1_I2(Object obj, String str, String str2, int i) {
        this.A03 = i;
        this.A02 = str;
        this.A01 = str2;
        this.A00 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A03 != 0) {
            C24751jz r0 = (C24751jz) this.A00;
            String str = this.A01;
            C18210wN.A0t(r0.A04, r0.A08, new C36941JhV(str), this.A02);
            return;
        }
        String str2 = this.A02;
        C18180wK.A0v(C18220wO.A0C(C28174Ezk.A00(773)).putString(C28174Ezk.A00(680), str2), "pairedStellaUserId", this.A01);
        Intent A0B = C18230wP.A0B();
        A0B.putExtra("userId", str2);
        C18200wM.A10((Activity) this.A00, A0B);
    }
}
