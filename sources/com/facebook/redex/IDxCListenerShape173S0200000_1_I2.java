package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass1dM;
import X.AnonymousClass1l3;
import X.AnonymousClass3IU;
import X.AnonymousClass48N;
import X.AnonymousClass4DS;
import X.C18200wM;
import X.C25553Dnn;
import X.C31155GhB;
import X.C61723Vc;
import X.C63813iO;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.common.task.IDxLTaskShape48S0200000_1_I2;
import java.util.Set;

public class IDxCListenerShape173S0200000_1_I2 implements View.OnLongClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape173S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static final boolean A00(IDxCListenerShape173S0200000_1_I2 iDxCListenerShape173S0200000_1_I2) {
        C31155GhB.A03(new IDxLTaskShape48S0200000_1_I2(3, iDxCListenerShape173S0200000_1_I2.A00, iDxCListenerShape173S0200000_1_I2.A01));
        return true;
    }

    public final boolean onLongClick(View view) {
        switch (this.A02) {
            case 0:
                return A00(this);
            case 1:
                Context context = ((View) this.A00).getContext();
                C25553Dnn A012 = AnonymousClass4DS.A01((Activity) context, context.getString(2131832185));
                A012.A01((View) this.A01);
                A012.A05 = new IDxTCallbackShape564S0100000_1_I2(this, 4);
                C18200wM.A1Q(A012);
                return true;
            default:
                AnonymousClass3IU r1 = ((AnonymousClass1l3) this.A01).A02;
                C61723Vc r2 = ((AnonymousClass48N) this.A00).A00;
                AnonymousClass1dM r4 = r1.A00;
                Set set = r4.A0H;
                if (set.contains(r2)) {
                    set.remove(r2);
                } else if (set.size() >= 1) {
                    C63813iO.A02(r4.requireContext(), AnonymousClass0wJ.A0m(AnonymousClass0wJ.A0B(r4), 1, R.plurals.selection_max_reached), (String) null, 0);
                } else {
                    set.add(r2);
                }
                AnonymousClass1dM.A00(r4);
                return true;
        }
    }
}
