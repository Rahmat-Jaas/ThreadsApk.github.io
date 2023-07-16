package com.google.android.gms.signin.internal;

import X.AnonymousClass819;
import X.C129347lj;
import X.C129387ln;
import X.C14030oh;
import X.C86124wJ;
import X.C93435lb;
import com.google.android.gms.common.api.internal.zaar;
import com.google.android.gms.common.api.internal.zact;

public abstract class zac extends zad {
    public final void DBa(zak zak) {
        int A03;
        int i;
        if (this instanceof zact) {
            zact zact = (zact) this;
            A03 = C14030oh.A03(1139740329);
            zact.A03.post(new AnonymousClass819(zact, zak));
            i = 111042279;
        } else {
            A03 = C14030oh.A03(1474510984);
            C129347lj r1 = (C129347lj) ((zaar) this).A00.get();
            if (r1 == null) {
                i = -1937852179;
            } else {
                C129387ln r0 = r1.A0D;
                C86124wJ.A1E(r0.A08, new C93435lb(r1, r1, zak), 1);
                i = 579599609;
            }
        }
        C14030oh.A0A(i, A03);
    }

    public zac() {
        C14030oh.A0A(-1966103298, C14030oh.A03(530411139));
    }
}
