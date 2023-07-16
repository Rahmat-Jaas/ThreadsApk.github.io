package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass3WS;
import X.C18190wL;
import X.C28161tl;
import X.C570839r;
import X.I2G;
import android.animation.Animator;
import android.content.SharedPreferences;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.service.session.UserSession;

public class IDxAListenerShape370S0100000_1_I2 implements Animator.AnimatorListener {
    public Object A00;
    public final int A01;

    public IDxAListenerShape370S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onAnimationEnd(Animator animator) {
        I2G i2g;
        if (this.A01 != 0) {
            UserSession userSession = (UserSession) this.A00;
            SharedPreferences A04 = C28161tl.A04(userSession);
            AnonymousClass0wJ.A11(A04.edit(), "close_friends_badge_animation_count", C18190wL.A04(A04, "close_friends_badge_animation_count") + 1);
            C28161tl A012 = AnonymousClass3WS.A01(userSession);
            AnonymousClass0wJ.A12(C28161tl.A02(A012), "close_friends_badge_last_timestamp", System.currentTimeMillis());
            return;
        }
        C570839r r2 = (C570839r) this.A00;
        if (r2.A01 != null && (i2g = r2.A02) != null) {
            i2g.pause();
            r2.A02.Cgd(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            r2.A01.setVisibility(8);
        }
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
