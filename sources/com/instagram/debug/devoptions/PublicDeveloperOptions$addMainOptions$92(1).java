package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3WS;
import X.C14030oh;
import X.C28161tl;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$92 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$92(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1531205664);
        AnonymousClass0wJ.A12(C28161tl.A03(this.$userSession), "respectful_comment_nudge_last_seen_time_ms", 0);
        C28161tl A01 = AnonymousClass3WS.A01(this.$userSession);
        AnonymousClass0wJ.A12(C28161tl.A02(A01), "m21_nudge_last_request_time_ms", 0);
        C28161tl.A07(A01, AnonymousClass0wJ.A0v());
        C63813iO.A03(this.$context, (String) null, 2131825474, 0);
        C14030oh.A0C(898320371, A05);
    }
}
