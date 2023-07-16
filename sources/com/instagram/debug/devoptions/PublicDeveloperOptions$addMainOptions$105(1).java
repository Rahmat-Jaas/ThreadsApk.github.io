package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3WS;
import X.C14030oh;
import X.C28161tl;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$105 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$105(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-541604897);
        AnonymousClass0wJ.A11(C28161tl.A02(AnonymousClass3WS.A01(this.$userSession)), "restrict_block_upsell_snackbar_shown_count", 0);
        C63813iO.A03(this.$context, (String) null, 2131825478, 0);
        C14030oh.A0C(-209398536, A05);
    }
}
