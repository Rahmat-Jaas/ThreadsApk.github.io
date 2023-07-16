package com.facebook.redex;

import X.AnonymousClass601;
import X.C109326jp;
import X.C18180wK;
import X.C18240wQ;
import X.C25831Dsp;
import X.C28291u0;
import X.C29351xp;
import X.C63603ht;
import X.C63893iY;
import X.C84844tx;
import X.D3P;
import X.D3Q;
import android.content.DialogInterface;
import android.widget.CompoundButton;

public class IDxCListenerShape177S0200000_1_I2 implements DialogInterface.OnCancelListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape177S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C25831Dsp dsp;
        D3P d3p;
        D3Q d3q;
        Boolean bool;
        switch (this.A02) {
            case 0:
                C63893iY.A0G((AnonymousClass601) this.A00, (C109326jp) this.A01);
                return;
            case 1:
                dsp = ((C63603ht) this.A01).A05;
                d3p = D3P.A1C;
                d3q = (D3Q) this.A00;
                bool = null;
                break;
            case 2:
                dsp = ((C63603ht) this.A01).A05;
                d3p = D3P.A1C;
                d3q = (D3Q) this.A00;
                bool = C18180wK.A0Y();
                break;
            case 5:
                CompoundButton compoundButton = (CompoundButton) this.A01;
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((C29351xp) this.A00).A01;
                C18240wQ.A0y(compoundButton, false);
                compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
                return;
            default:
                ((C84844tx) this.A01).CEA((C28291u0) this.A00);
                return;
        }
        dsp.A1a(d3p, d3q, bool);
    }
}
