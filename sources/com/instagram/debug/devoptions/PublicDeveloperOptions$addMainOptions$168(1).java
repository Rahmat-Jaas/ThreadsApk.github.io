package com.instagram.debug.devoptions;

import X.C14030oh;
import X.C18180wK;
import X.C25786Drz;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$168 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$168(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$fragmentActivity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-760894037);
        C25786Drz A0Q = C18180wK.A0Q(this.$fragmentActivity, this.$userSession);
        A0Q.A03 = new DeviceComputePlatformFragment();
        A0Q.A05();
        C14030oh.A0C(147387218, A05);
    }
}
