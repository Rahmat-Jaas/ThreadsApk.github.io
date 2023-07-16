package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.creation.fragment.FollowersShareFragment;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Et  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C58273Et {
    public final /* synthetic */ FollowersShareFragment A00;
    public final /* synthetic */ C696149h A01;

    public /* synthetic */ C58273Et(FollowersShareFragment followersShareFragment, C696149h r2) {
        this.A00 = followersShareFragment;
        this.A01 = r2;
    }

    public final void A00(boolean z) {
        String str;
        String A0l;
        FollowersShareFragment followersShareFragment = this.A00;
        C696149h r7 = this.A01;
        if (z) {
            boolean A0G = C63073bQ.A00(followersShareFragment.A0T).A0G(followersShareFragment.A0T);
            AnonymousClass2AI r2 = AnonymousClass2AI.A04;
            PendingMedia pendingMedia = followersShareFragment.A0P;
            pendingMedia.getClass();
            boolean z2 = true;
            if (A0G) {
                z2 = false;
            }
            r2.A05(pendingMedia, z2);
        }
        Context context = followersShareFragment.getContext();
        UserSession userSession = r7.A08;
        if (C35692Ol.A00(userSession).A05(CallerContext.A00(C696149h.class), "ig_android_linking_cache_fx_ig_fb_feed_xpost_ac_upsell") && context != null) {
            if (r7.A01 != AnonymousClass215.ONE_TO_ONE) {
                String BK7 = AnonymousClass0wJ.A0Y(userSession).BK7();
                if (C63803iN.A0E(AnonymousClass0TJ.A06, userSession, 2342162034352853869L)) {
                    int i = 2131837280;
                    if (z) {
                        i = 2131837261;
                    }
                    str = AnonymousClass0wJ.A0l(context, BK7, i);
                } else {
                    A0l = AnonymousClass0wJ.A0l(context, BK7, 2131837262);
                    C04220Ms.A06(str);
                    followersShareFragment.A0e = str;
                }
            } else if (C63803iN.A0E(AnonymousClass0TJ.A06, userSession, 2342162034352853869L)) {
                int i2 = 2131837281;
                if (z) {
                    i2 = 2131837263;
                }
                str = context.getString(i2);
            } else {
                A0l = context.getString(2131837264);
                C04220Ms.A06(str);
                followersShareFragment.A0e = str;
            }
            C04220Ms.A09(str);
            followersShareFragment.A0e = str;
        }
        FollowersShareFragment.A0O(followersShareFragment);
    }
}
