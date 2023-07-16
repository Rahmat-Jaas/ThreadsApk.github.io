package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3WS;
import X.C14030oh;
import X.C28161tl;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$158 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$158(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1388026652);
        AnonymousClass0wJ.A13(C28161tl.A02(AnonymousClass3WS.A01(this.$userSession)), "has_dismissed_moderator_role_nux", false);
        C63813iO.A03(this.$context, (String) null, 2131824981, 0);
        C14030oh.A0C(169980538, A05);
    }
}
