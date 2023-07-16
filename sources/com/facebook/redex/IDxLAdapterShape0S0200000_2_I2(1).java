package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass6BO;
import X.C18180wK;
import X.C18190wL;
import X.C18230wP;
import X.C25567Do3;
import X.C25831Dsp;
import X.C28161tl;
import X.C28174Ezk;
import X.HDT;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

public class IDxLAdapterShape0S0200000_2_I2 extends AnimatorListenerAdapter {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxLAdapterShape0S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.A02 != 0) {
            ((View) this.A00).setVisibility(8);
            ((View) this.A01).setVisibility(8);
            return;
        }
        HDT hdt = (HDT) this.A01;
        hdt.A0R = true;
        UserSession userSession = hdt.A1X;
        C25831Dsp A022 = C25567Do3.A02(userSession);
        int i = hdt.A04;
        if (A022.A0K != null) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A022.A0W, "ig_camera_wearable_import_link_banner_impression"), 1108);
            if (AnonymousClass0wJ.A1U(A0I)) {
                AnonymousClass6BO.A00(A0I, A022);
                A0I.A0S("wearable_import_link_media_count", C18230wP.A0f(i));
                C18190wL.A1L(A0I);
                A0I.Bb4();
            }
        }
        AnonymousClass0wJ.A13(C28161tl.A04(userSession).edit(), C28174Ezk.A00(580), true);
    }

    public final void onAnimationStart(Animator animator) {
        if (this.A02 == 0) {
            ((View) this.A00).setVisibility(0);
        }
    }
}
