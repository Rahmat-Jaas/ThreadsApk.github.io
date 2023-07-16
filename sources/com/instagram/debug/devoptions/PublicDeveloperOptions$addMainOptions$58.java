package com.instagram.debug.devoptions;

import X.C14030oh;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$58 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$58(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$fragmentActivity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1318785192);
        PublicDeveloperOptions.INSTANCE.openBloksFragment(this.$fragmentActivity, this.$userSession, "com.bloks.www.fbpay.ecp.playground", "", 2131824955);
        C14030oh.A0C(-1689685696, A05);
    }
}
