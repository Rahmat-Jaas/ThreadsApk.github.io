package com.facebook.redex;

import X.C696149h;
import X.C83804s1;
import com.instagram.creation.fragment.FollowersShareFragment;
import com.instagram.creation.fragment.ShareLaterFragment;

public class IDxListenerShape830S0100000_1_I2 implements C83804s1 {
    public Object A00;
    public final int A01;

    public IDxListenerShape830S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Byp() {
    }

    public final void Byq() {
        switch (this.A01) {
            case 0:
                FollowersShareFragment.A0N((FollowersShareFragment) this.A00);
                return;
            case 1:
                ShareLaterFragment.A02((ShareLaterFragment) this.A00);
                return;
            default:
                C696149h.A01((C696149h) this.A00);
                return;
        }
    }
}
