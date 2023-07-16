package com.instagram.common.bloks.mutations;

import X.AnonymousClass0wJ;
import X.C111556ns;
import X.C121727Ht;
import X.C127397h3;
import X.C144588ik;
import android.util.Log;
import android.util.Pair;
import java.util.List;

public class IDxUOperationShape42S0200000_2_I2 extends C111556ns {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxUOperationShape42S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ void A00(Object obj) {
        C127397h3 r4 = (C127397h3) obj;
        if (this.A02 != 0) {
            Pair A012 = C121727Ht.A01(r4, (C144588ik) this.A01);
            int A04 = AnonymousClass0wJ.A04(A012.second);
            if (A04 < 0) {
                Log.w("ComponentTree", "replaceChild: No existing child found with specified ID in parent. New children have not been added to parent.");
                return;
            }
            List list = (List) A012.first;
            list.remove(A04);
            list.addAll(A04, C121727Ht.A03((List) this.A00));
            return;
        }
        r4.A04.put(31, this.A01);
    }
}
