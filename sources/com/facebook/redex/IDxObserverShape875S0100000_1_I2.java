package com.facebook.redex;

import X.AnonymousClass35Y;
import X.AnonymousClass3If;
import X.AnonymousClass4A9;
import X.AnonymousClass4S1;
import X.C04220Ms;
import X.C130667qT;
import X.C18220wO;
import X.C24551ja;
import X.C31155GhB;
import X.C37383Jqm;
import X.C40322Lcc;
import X.C555933v;
import X.C61323St;
import X.C62743ad;
import X.C63263h8;
import X.C63643hy;
import X.C82364pV;
import android.util.SparseArray;
import com.instagram.barcelona.R;

public class IDxObserverShape875S0100000_1_I2 implements C82364pV {
    public Object A00;
    public final int A01;

    public IDxObserverShape875S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void CGv(C555933v r8) {
        if (this.A01 != 0) {
            C04220Ms.A0B(r8, 0);
            if (r8 instanceof C24551ja) {
                C61323St A002 = C61323St.A00(((C24551ja) r8).A00);
                C62743ad r6 = (C62743ad) this.A00;
                C62743ad.A00(C40322Lcc.FETCHING_DONE, r6);
                AnonymousClass3If r5 = r6.A08;
                r5.A04(Integer.valueOf(r8.A00.A00));
                r6.A01 = true;
                r6.A02 = false;
                C37383Jqm jqm = r6.A00;
                if (jqm != null) {
                    C130667qT A0T = C18220wO.A0T(r6.A03, r6.A05, r6.A06);
                    SparseArray sparseArray = A0T.A01;
                    sparseArray.put(R.id.bottom_sheet_id, jqm);
                    sparseArray.put(R.id.ixt_event_ended_handler, r5);
                    C63643hy.A04(new AnonymousClass4S1(A0T, A002));
                    return;
                }
                return;
            }
            C62743ad r3 = (C62743ad) this.A00;
            AnonymousClass4A9 A003 = C63263h8.A00(r3.A06, r3.A0A, r3.A0C);
            AnonymousClass4A9.A00(A003, r3, 18);
            C31155GhB.A03(A003);
            return;
        }
        C04220Ms.A0B(r8, 0);
        AnonymousClass35Y r32 = (AnonymousClass35Y) this.A00;
        int i = r8.A00.A00;
        boolean z = true;
        if (!(i == 0 || i == 1 || i == 2)) {
            z = false;
        }
        r32.A00.A01 = z;
    }
}
