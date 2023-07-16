package com.instagram.debug.devoptions;

import X.C14030oh;
import X.C61823Vx;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$getQuickExperimentOptions$4 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C61823Vx $qeFactory;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$getQuickExperimentOptions$4(C61823Vx r1, UserSession userSession, Context context) {
        this.$qeFactory = r1;
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(908587490);
        this.$qeFactory.A08(this.$userSession, true);
        C63813iO.A02(this.$context, "Uploaded launcher/mobileconfig consistency logging data", (String) null, 1);
        C14030oh.A0C(-358288783, A05);
    }
}
