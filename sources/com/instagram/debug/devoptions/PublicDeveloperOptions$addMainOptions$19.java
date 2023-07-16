package com.instagram.debug.devoptions;

import X.C14030oh;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$19 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$19(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$fragmentActivity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-2058194233);
        PublicDeveloperOptions.INSTANCE.openBloksFragment(this.$fragmentActivity, this.$userSession, "com.instagram.aymt_previews.surface", "bloks-www-shell-dev-options", 2131825003);
        C14030oh.A0C(1488872262, A05);
    }
}
