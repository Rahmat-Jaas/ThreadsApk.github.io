package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass00U;
import X.C04220Ms;
import X.C10300i6;
import X.C10450iM;
import X.C12560m7;
import X.C18230wP;
import X.C18240wQ;
import X.C37359JqC;
import X.C39690KyC;
import X.C40322Lcc;
import X.C61873Wd;
import X.C63813iO;
import android.os.Bundle;
import com.instagram.challenge.activity.ChallengeActivity;
import com.instagram.challenge.selfiecaptchachallenge.IgSelfieCaptchaChallengeManagerImpl;

public class IDxCCallbackShape583S0100000_1_I2 implements C39690KyC {
    public Object A00;
    public final int A01;

    public IDxCCallbackShape583S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onFailure(String str) {
        if (this.A01 != 0) {
            ChallengeActivity challengeActivity = (ChallengeActivity) this.A00;
            C63813iO.A0A(challengeActivity.getApplicationContext(), 2131835455, 1);
            C10450iM.A03("Challenge", "downloading selfie captcha module failed");
            C61873Wd.A01(challengeActivity.A01);
            return;
        }
        C04220Ms.A0B(str, 0);
        C10450iM.A03("Challenge", AnonymousClass00U.A0L("Bloks - downloading selfie captcha module failed ", str));
    }

    public final void onSuccess() {
        if (this.A01 != 0) {
            try {
                ChallengeActivity challengeActivity = (ChallengeActivity) this.A00;
                C37359JqC.A02(C40322Lcc.SCREEN_GENERATED, challengeActivity.A02, AnonymousClass006.A01, "selfie_captcha", "selfie_captcha_start");
                C10300i6 r9 = challengeActivity.A02;
                C12560m7 r8 = challengeActivity.A01;
                Bundle bundle = challengeActivity.A00;
                ((IgSelfieCaptchaChallengeManagerImpl) C18230wP.A0g("com.instagram.challenge.selfiecaptchachallenge.IgSelfieCaptchaChallengeManagerImpl")).A00(challengeActivity, bundle, r8, r9, challengeActivity.A03, challengeActivity.A04, challengeActivity.A06, challengeActivity.A05, bundle.getString("challenge_use_case"));
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
                C10450iM.A03("Challenge", "reflection loading of selfie captcha module failed");
                C61873Wd.A01(((ChallengeActivity) this.A00).A01);
            }
        } else {
            try {
                C18240wQ.A1G(this.A00);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                C10450iM.A06("Challenge", "Bloks - reflection loading of selfie captcha module failed", e);
            }
        }
    }
}
