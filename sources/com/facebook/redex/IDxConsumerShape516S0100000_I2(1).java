package com.facebook.redex;

import X.C002301a;
import X.C12560m7;
import android.content.Intent;
import android.content.res.Configuration;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.Iterator;

public class IDxConsumerShape516S0100000_I2 implements C002301a {
    public Object A00;
    public final int A01;

    public IDxConsumerShape516S0100000_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void accept(Object obj) {
        switch (this.A01) {
            case 0:
                ((FragmentActivity) this.A00).m5lambda$init$2$androidxfragmentappFragmentActivity((Intent) obj);
                return;
            case 1:
                ((FragmentActivity) this.A00).m4lambda$init$1$androidxfragmentappFragmentActivity((Configuration) obj);
                return;
            case 2:
                C12560m7 r1 = (C12560m7) this.A00;
                Configuration configuration = (Configuration) obj;
                if (C12560m7.A0G(r1)) {
                    for (Fragment fragment : r1.A0T.A04()) {
                        if (fragment != null) {
                            fragment.onConfigurationChanged(configuration);
                        }
                    }
                    return;
                }
                return;
            case 3:
                C12560m7 r12 = (C12560m7) this.A00;
                if (C12560m7.A0G(r12)) {
                    Iterator it = r12.A0T.A04().iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    return;
                }
                return;
            case 4:
                C12560m7 r13 = (C12560m7) this.A00;
                if (C12560m7.A0G(r13)) {
                    Iterator it2 = r13.A0T.A04().iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                    return;
                }
                return;
            default:
                C12560m7 r2 = (C12560m7) this.A00;
                Number number = (Number) obj;
                if (C12560m7.A0G(r2) && number.intValue() == 80) {
                    for (Fragment fragment2 : r2.A0T.A04()) {
                        if (fragment2 != null) {
                            fragment2.onLowMemory();
                        }
                    }
                    return;
                }
                return;
        }
    }
}
