package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.creation.fragment.FollowersShareFragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4LT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4LT implements C83024qf {
    public final /* synthetic */ FollowersShareFragment A00;

    public /* synthetic */ AnonymousClass4LT(FollowersShareFragment followersShareFragment) {
        this.A00 = followersShareFragment;
    }

    public final void CGx(Integer num) {
        FollowersShareFragment followersShareFragment = this.A00;
        if (num == AnonymousClass006.A00) {
            FragmentActivity activity = followersShareFragment.getActivity();
            if (activity != null) {
                if (!C63803iN.A05(AnonymousClass0TJ.A05, followersShareFragment.A0T, 36324780395209381L).booleanValue()) {
                    UserSession userSession = followersShareFragment.A0T;
                    AnonymousClass2AC r7 = AnonymousClass2AC.IG_FEED_COMPOSER_SHARE_TO_FACEBOOK_TOGGLE_ENABLE;
                    Context context = followersShareFragment.getContext();
                    AnonymousClass0wJ.A1O(userSession, r7);
                    if (C60423Oz.A01(activity, context, r7, userSession, (C83004qd) null, 96, false)) {
                        return;
                    }
                }
            } else {
                return;
            }
        } else if (num != AnonymousClass006.A01) {
            return;
        }
        FollowersShareFragment.A0S(followersShareFragment);
    }
}
