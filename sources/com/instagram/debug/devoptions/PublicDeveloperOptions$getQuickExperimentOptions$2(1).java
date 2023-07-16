package com.instagram.debug.devoptions;

import X.AnonymousClass3LY;
import X.C07940cT;
import X.C08380dH;
import X.C09120et;
import X.C14030oh;
import X.C18180wK;
import X.C61823Vx;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.debug.devoptions.refresh.DevOptionsRefreshEvent;
import com.instagram.debug.quickexperiment.QuickExperimentHelper$$ExternalSyntheticLambda7;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$getQuickExperimentOptions$2 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C61823Vx $qeFactory;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$getQuickExperimentOptions$2(Context context, C61823Vx r2, UserSession userSession) {
        this.$context = context;
        this.$qeFactory = r2;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        Context context;
        String str;
        int i;
        int A05 = C14030oh.A05(1298706631);
        C08380dH r1 = C09120et.A3D;
        if (r1.A00().A0M() || r1.A00().A0N()) {
            context = this.$context;
            str = null;
            i = 2131825563;
        } else {
            if (r1.A00().A0O()) {
                context = this.$context;
                str = null;
                i = 2131825006;
            }
            this.$qeFactory.A02(this.$userSession, C07940cT.Device).A00(new QuickExperimentHelper$$ExternalSyntheticLambda7(this.$context, C18180wK.A0X()));
            AnonymousClass3LY.A00(this.$userSession).CWx(DevOptionsRefreshEvent.INSTANCE);
            C14030oh.A0C(1052812341, A05);
        }
        C63813iO.A03(context, str, i, 1);
        this.$qeFactory.A02(this.$userSession, C07940cT.Device).A00(new QuickExperimentHelper$$ExternalSyntheticLambda7(this.$context, C18180wK.A0X()));
        AnonymousClass3LY.A00(this.$userSession).CWx(DevOptionsRefreshEvent.INSTANCE);
        C14030oh.A0C(1052812341, A05);
    }
}
