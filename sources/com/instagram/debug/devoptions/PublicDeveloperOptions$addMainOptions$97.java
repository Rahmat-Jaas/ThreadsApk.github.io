package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3WS;
import X.C14030oh;
import X.C28161tl;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$97 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$97(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-2085933442);
        AnonymousClass0wJ.A11(C28161tl.A02(AnonymousClass3WS.A01(this.$userSession)), "hidden_comments_tooltip_count", 0);
        C63813iO.A03(this.$context, (String) null, 2131825449, 0);
        C14030oh.A0C(-1517070867, A05);
    }
}
