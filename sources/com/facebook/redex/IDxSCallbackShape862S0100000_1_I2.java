package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass1v3;
import X.AnonymousClass2AC;
import X.AnonymousClass4AX;
import X.AnonymousClass4LJ;
import X.C23391dj;
import X.C83014qe;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public class IDxSCallbackShape862S0100000_1_I2 implements C83014qe {
    public Object A00;
    public final int A01;

    public IDxSCallbackShape862S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void CGw(boolean z) {
        FragmentActivity activity;
        UserSession userSession;
        AnonymousClass2AC r3;
        Context context;
        if (this.A01 != 0) {
            AnonymousClass4AX r0 = (AnonymousClass4AX) this.A00;
            if (!z) {
                activity = r0.A0D;
                userSession = r0.A0E;
                r3 = AnonymousClass2AC.IG_STORY_SETTINGS_MAIN_CAMERA_SETTINGS_BUTTON;
                context = r0.A0B;
            } else {
                return;
            }
        } else {
            C23391dj r02 = (C23391dj) this.A00;
            activity = r02.getActivity();
            if (activity != null && !z) {
                userSession = r02.A05;
                r3 = AnonymousClass2AC.IG_FEED_COMPOSER_ADVANCED_SETTINGS_TOGGLE_ENABLE;
                context = r02.getContext();
            } else {
                return;
            }
        }
        AnonymousClass0wJ.A1O(userSession, r3);
        AnonymousClass1v3.A06.A03(activity, context, r3, userSession, AnonymousClass4LJ.A00, false);
    }
}
