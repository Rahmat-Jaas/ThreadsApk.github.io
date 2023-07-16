package com.facebook.redex;

import X.AnonymousClass13N;
import X.C33553Hpn;
import X.C83114qo;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;

public class IDxCListenerShape690S0100000_1_I2 implements C33553Hpn {
    public Object A00;
    public final int A01;

    public IDxCListenerShape690S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onSearchCleared(String str) {
        C83114qo r0;
        if (this.A01 != 0) {
            r0 = ((TypeaheadHeader) this.A00).A02;
        } else {
            r0 = ((AnonymousClass13N) this.A00).A02;
        }
        if (r0 != null) {
            r0.onSearchCleared(str);
        }
    }
}
