package com.instagram.debug.devoptions;

import X.AnonymousClass006;
import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C12560m7;
import X.C14030oh;
import X.C18180wK;
import X.C18230wP;
import X.C18240wQ;
import X.C28979FfK;
import X.C32059H2y;
import X.C36813Jf5;
import X.C37200JmN;
import X.C39690KyC;
import X.C63813iO;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.challenge.selfiecaptchachallenge.IgSelfieCaptchaChallengeManagerImpl;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

public final class PublicDeveloperOptions$addMainOptions$140 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$140(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$fragmentActivity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1852727324);
        C37200JmN A00 = C37200JmN.A00();
        UserSession userSession = this.$userSession;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C18240wQ.A1Q(A0v, new C28979FfK[]{C28979FfK.IGWB_SELFIE_CAPTCHA_CHALLENGE});
        Integer num = AnonymousClass006.A00;
        final FragmentActivity fragmentActivity = this.$fragmentActivity;
        final UserSession userSession2 = this.$userSession;
        A00.A02(userSession, new C36813Jf5((C12560m7) null, new C39690KyC() {
            public void onFailure(String str) {
                C63813iO.A0C(FragmentActivity.this, "Selfie Capture Failure");
                AnonymousClass0LU.A0B(PublicDeveloperOptions.TAG, "Downloading Selfie Capture module failed");
            }

            public void onSuccess() {
                try {
                    Bundle A06 = C18180wK.A06();
                    A06.putString("head_movements_directions_json", "[1,2,3]");
                    Object A0g = C18230wP.A0g("com.instagram.challenge.selfiecaptchachallenge.IgSelfieCaptchaChallengeManagerImpl");
                    C04220Ms.A0C(A0g, "null cannot be cast to non-null type com.instagram.challenge.intf.IgSelfieCaptchaChallengeManager");
                    FragmentActivity fragmentActivity = FragmentActivity.this;
                    UserSession userSession = userSession2;
                    ((IgSelfieCaptchaChallengeManagerImpl) A0g).A00(fragmentActivity, A06, fragmentActivity.getSupportFragmentManager(), userSession, new C32059H2y(userSession2), "test-challenge", userSession.getUserId(), (String) null, "ig_selfie_test");
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                    AnonymousClass0LU.A0E(PublicDeveloperOptions.TAG, "Exception when launching Selfie Capture", e);
                }
            }
        }, num, A0v));
        C14030oh.A0C(-140813890, A05);
    }
}
