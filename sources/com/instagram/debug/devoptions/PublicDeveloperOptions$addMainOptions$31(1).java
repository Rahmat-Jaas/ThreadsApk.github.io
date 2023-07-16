package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3WS;
import X.C14030oh;
import X.C28161tl;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$31 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$31(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(686134519);
        AnonymousClass0wJ.A13(C28161tl.A02(AnonymousClass3WS.A01(this.$userSession)), "clips_share_sheet_smart_cover_banner_nux", false);
        C63813iO.A03(this.$context, (String) null, 2131825433, 0);
        C14030oh.A0C(-670412157, A05);
    }
}
