package com.facebook.redex;

import X.AnonymousClass3FU;
import X.AnonymousClass3HG;
import X.C09790gg;
import X.C10300i6;
import X.C11630kW;
import X.C18240wQ;
import X.C62353Yv;
import X.C63533hk;
import X.C83894sA;
import android.content.DialogInterface;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.User;
import java.util.Iterator;

public class IDxCListenerShape1S1310000_1_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public boolean A04;
    public final int A05;

    public IDxCListenerShape1S1310000_1_I2(Object obj, Object obj2, Object obj3, String str, int i, boolean z) {
        this.A05 = i;
        this.A02 = obj2;
        this.A03 = str;
        this.A00 = obj;
        this.A01 = obj3;
        this.A04 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A05) {
            case 0:
                C10300i6 r3 = (C10300i6) this.A02;
                C63533hk.A02(r3).A0B((C11630kW) this.A00, r3, (Integer) this.A01, this.A03, true);
                if (!this.A04) {
                    ImmutableList A0J = C18240wQ.A0J(C62353Yv.A00(r3).A01);
                    if (!C09790gg.A00(A0J)) {
                        Iterator it = A0J.iterator();
                        while (it.hasNext()) {
                            ((AnonymousClass3FU) it.next()).A02 = true;
                        }
                        C62353Yv.A00(r3).A04(A0J);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (i != 0) {
                    return;
                }
                break;
        }
        User user = (User) this.A02;
        boolean z = !user.A3C();
        AnonymousClass3HG r32 = (AnonymousClass3HG) this.A00;
        r32.A00(r32.A00, user, Boolean.valueOf(this.A04), this.A03);
        C83894sA r0 = (C83894sA) this.A01;
        if (r0 != null) {
            r0.CEZ();
            r0.CEa(user, z);
        }
    }
}
