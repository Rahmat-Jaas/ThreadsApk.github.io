package com.instagram.debug.devoptions;

import X.AnonymousClass3Ie;
import X.C05030Qo;
import X.C14030oh;
import X.C61823Vx;
import X.C63813iO;
import X.C67603zp;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$getQuickExperimentOptions$5 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C61823Vx $qeFactory;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$getQuickExperimentOptions$5(C61823Vx r1, UserSession userSession, Context context) {
        this.$qeFactory = r1;
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        AnonymousClass3Ie A04;
        int A05 = C14030oh.A05(432356569);
        C61823Vx r1 = this.$qeFactory;
        UserSession userSession = this.$userSession;
        if (!(userSession == null || (A04 = r1.A04(C05030Qo.A02(userSession))) == null)) {
            C67603zp r0 = A04.A01.A00;
            r0.A0A();
            r0.A06().updateEmergencyPushConfigs();
        }
        C63813iO.A0C(this.$context, "Emergency push is done.");
        C14030oh.A0C(-2050764951, A05);
    }
}
