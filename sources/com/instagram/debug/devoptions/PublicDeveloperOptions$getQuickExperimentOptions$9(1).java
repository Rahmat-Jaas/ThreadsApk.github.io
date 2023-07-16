package com.instagram.debug.devoptions;

import X.C05050Qq;
import X.C14030oh;
import X.C18180wK;
import X.C18240wQ;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.landingexperiment.LandingExperimentListFragment;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$getQuickExperimentOptions$9 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$getQuickExperimentOptions$9(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$fragmentActivity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1247481023);
        Bundle A06 = C18180wK.A06();
        C05050Qq.A00(A06, this.$userSession);
        C18240wQ.A0u(A06, new LandingExperimentListFragment(), C18180wK.A0Q(this.$fragmentActivity, this.$userSession));
        C14030oh.A0C(1827337574, A05);
    }
}
