package com.instagram.debug.devoptions;

import X.C14030oh;
import X.C18180wK;
import X.C25786Drz;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.cam.CamDevOptionsFragment;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$172 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$172(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$fragmentActivity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1705930549);
        C25786Drz A0Q = C18180wK.A0Q(this.$fragmentActivity, this.$userSession);
        A0Q.A03 = new CamDevOptionsFragment();
        A0Q.A05();
        C14030oh.A0C(192257218, A05);
    }
}
