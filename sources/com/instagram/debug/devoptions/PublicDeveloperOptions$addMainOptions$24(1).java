package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3WS;
import X.C14030oh;
import X.C28161tl;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$24 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$24(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-93949119);
        AnonymousClass0wJ.A13(C28161tl.A02(AnonymousClass3WS.A01(this.$userSession)), "explore_controls_upsell_tooltip_shown", false);
        C63813iO.A0C(this.$context, "Multi hide upsell has been reset");
        C14030oh.A0C(-1708871979, A05);
    }
}
