package com.instagram.debug.devoptions;

import X.C14030oh;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.helper.DevOptionsHelper;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$87 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$87(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$fragmentActivity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-84636673);
        DevOptionsHelper.Companion.launchFragment(this.$userSession, this.$fragmentActivity, "com.instagram.adshistory.fragment.RecentAdActivityFragment");
        C14030oh.A0C(-1728563480, A05);
    }
}
