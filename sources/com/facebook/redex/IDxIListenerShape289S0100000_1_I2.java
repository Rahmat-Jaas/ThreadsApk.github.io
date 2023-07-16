package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18240wQ;
import X.C19587Ayn;
import X.C21232Br0;
import X.C58443Fq;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;

public class IDxIListenerShape289S0100000_1_I2 implements C21232Br0 {
    public Object A00;
    public final int A01;

    public IDxIListenerShape289S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void C2O(View view) {
        if (this.A01 != 0) {
            view.setBackground(C19587Ayn.A00(view.getContext(), R.color.igds_primary_button));
            return;
        }
        C58443Fq r1 = (C58443Fq) this.A00;
        C04220Ms.A07(view);
        r1.A00 = (IgTextView) AnonymousClass0wJ.A0I(view, R.id.primary_text);
        r1.A01 = (IgTextView) AnonymousClass0wJ.A0I(view, R.id.secondary_text);
        AnonymousClass0wJ.A16(view, 468, r1);
        for (Object A1G : r1.A03) {
            C18240wQ.A1G(A1G);
        }
    }
}
