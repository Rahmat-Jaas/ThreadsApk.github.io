package com.instagram.debug.devoptions;

import X.C14030oh;
import X.C18180wK;
import X.C61823Vx;
import android.content.Context;
import android.view.View;
import com.instagram.debug.quickexperiment.QuickExperimentHelper;
import com.instagram.debug.quickexperiment.QuickExperimentHelper$$ExternalSyntheticLambda7;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$getQuickExperimentOptions$3 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C61823Vx $qeFactory;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$getQuickExperimentOptions$3(Context context, C61823Vx r2, UserSession userSession) {
        this.$context = context;
        this.$qeFactory = r2;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1676573865);
        Context context = this.$context;
        QuickExperimentHelper.forceUserQESync(context, this.$qeFactory, this.$userSession, new QuickExperimentHelper$$ExternalSyntheticLambda7(context, C18180wK.A0X()));
        C14030oh.A0C(-1014306139, A05);
    }
}
