package com.instagram.debug.devoptions;

import X.C14030oh;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.helper.DevOptionsHelper;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$88 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$88(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$fragmentActivity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-207115040);
        DevOptionsHelper.Companion.launchFragment(this.$userSession, this.$fragmentActivity, "com.instagram.analytics.eventlog.EventLogListFragment");
        C14030oh.A0C(-760116766, A05);
    }
}
