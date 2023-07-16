package com.instagram.debug.devoptions;

import X.AnonymousClass3WS;
import X.C14030oh;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$23 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$23(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(471976546);
        AnonymousClass3WS.A01(this.$userSession).A0J(System.currentTimeMillis() - (((long) 2) * 86400000));
        C63813iO.A0C(this.$context, "Take a Break upsell last seen time has been updated to two days ago");
        C14030oh.A0C(883532876, A05);
    }
}
