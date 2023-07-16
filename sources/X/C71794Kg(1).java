package X;

import com.facebook.redex.IDxCListenerShape205S0100000_4_I2;
import com.instagram.creation.fragment.FollowersShareFragment;
import com.instagram.pendingmedia.model.PendingMedia;

/* renamed from: X.4Kg  reason: invalid class name and case insensitive filesystem */
public final class C71794Kg implements C83794s0 {
    public final /* synthetic */ IDxCListenerShape205S0100000_4_I2 A00;

    public final void CMm(boolean z) {
    }

    public C71794Kg(IDxCListenerShape205S0100000_4_I2 iDxCListenerShape205S0100000_4_I2) {
        this.A00 = iDxCListenerShape205S0100000_4_I2;
    }

    public final void Bye(boolean z) {
        int i;
        FollowersShareFragment followersShareFragment = (FollowersShareFragment) this.A00.A00;
        if (z) {
            C696049g A002 = C62173Xp.A00(followersShareFragment.A0T);
            C696049g.A00(A002);
            AnonymousClass3CV r0 = A002.A02;
            if (r0 != null) {
                boolean equals = "FB_USER".equals(r0.A00);
                i = 2131827389;
                if (equals) {
                    i = 2131827390;
                }
            }
            PendingMedia pendingMedia = followersShareFragment.A0P;
            pendingMedia.getClass();
            pendingMedia.A4H = z;
            FollowersShareFragment.A0O(followersShareFragment);
        }
        i = 2131827393;
        followersShareFragment.A0e = followersShareFragment.getString(i);
        PendingMedia pendingMedia2 = followersShareFragment.A0P;
        pendingMedia2.getClass();
        pendingMedia2.A4H = z;
        FollowersShareFragment.A0O(followersShareFragment);
    }
}
