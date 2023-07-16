package com.facebook.redex;

import X.AnonymousClass264;
import X.C83814s2;
import com.instagram.creation.fragment.FollowersShareFragment;
import com.instagram.creation.fragment.ShareLaterFragment;

public class IDxAListenerShape831S0100000_1_I2 implements C83814s2 {
    public Object A00;
    public final int A01;

    public IDxAListenerShape831S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Blp(AnonymousClass264 r2) {
        if (this.A01 != 0) {
            ShareLaterFragment.A02((ShareLaterFragment) this.A00);
        } else if (r2 == AnonymousClass264.A0b) {
            FollowersShareFragment.A0N((FollowersShareFragment) this.A00);
        }
    }

    public final void onAuthorizeFail() {
    }
}
