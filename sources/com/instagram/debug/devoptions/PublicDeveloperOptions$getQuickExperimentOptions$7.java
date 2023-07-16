package com.instagram.debug.devoptions;

import X.C14030oh;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreManager;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$getQuickExperimentOptions$7 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$getQuickExperimentOptions$7(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-767249990);
        QuickExperimentDebugStoreManager.getOverrideStore(this.$userSession).removeAll();
        C63813iO.A0C(this.$context, "Deleted all launcher/mobileconfig overrides");
        C14030oh.A0C(-1080600799, A05);
    }
}
