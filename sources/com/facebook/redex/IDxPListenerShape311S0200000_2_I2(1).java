package com.facebook.redex;

import X.AnonymousClass0MJ;
import X.C146368m8;
import X.C33521HpH;
import X.C86054wC;
import com.instagram.pendingmedia.model.PendingMedia;

public class IDxPListenerShape311S0200000_2_I2 implements C33521HpH {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxPListenerShape311S0200000_2_I2(AnonymousClass0MJ r1, C86054wC r2, int i) {
        this.A02 = i;
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void CDJ(PendingMedia pendingMedia) {
        Object obj = ((AnonymousClass0MJ) this.A01).A00;
        if (obj != null) {
            ((C146368m8) this.A00).D7w(obj);
        }
    }
}
