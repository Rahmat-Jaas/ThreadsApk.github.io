package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3WS;
import X.C14030oh;
import X.C28161tl;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$104 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$104(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(321458431);
        AnonymousClass0wJ.A11(C28161tl.A02(AnonymousClass3WS.A01(this.$userSession)), "anti_bully_tooltip_shown_count", 0);
        AnonymousClass0wJ.A11(C28161tl.A03(this.$userSession), "anti_bully_global_tooltip_shown_count", 0);
        AnonymousClass0wJ.A11(C28161tl.A03(this.$userSession), "voter_registration_tooltip_shown_count", 0);
        C63813iO.A03(this.$context, (String) null, 2131825425, 0);
        C14030oh.A0C(-1114880247, A05);
    }
}
