package com.facebook.redex;

import X.AnonymousClass565;
import X.AnonymousClass56F;
import X.AnonymousClass580;
import X.AnonymousClass584;
import X.C04220Ms;
import X.C86134wK;
import X.C92005hR;
import X.C92325hz;
import X.C94775wj;
import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;

public class IDxObjectShape283S0100000_2_I2 implements NoCopySpan, TextWatcher {
    public Object A00;
    public final int A01;

    public IDxObjectShape283S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void afterTextChanged(Editable editable) {
        switch (this.A01) {
            case 0:
                C92325hz r2 = (C92325hz) this.A00;
                C92005hR r0 = r2.A04;
                r0.A05.A0H(editable.toString());
                C92325hz.A05(r2);
                return;
            case 1:
                AnonymousClass584 r1 = ((AnonymousClass56F) this.A00).A01;
                r1.A02 = editable.toString();
                r1.A06.A0G((Object) null);
                return;
            case 2:
                ((AnonymousClass565) this.A00).A01.A03(editable.toString());
                return;
            case 3:
                String valueOf = String.valueOf(editable);
                C04220Ms.A0B(valueOf, 0);
                ((AnonymousClass580) ((C94775wj) this.A00).A01.getValue()).A03.A0H(valueOf);
                return;
            default:
                C86134wK.A1L(this.A00, editable);
                return;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
