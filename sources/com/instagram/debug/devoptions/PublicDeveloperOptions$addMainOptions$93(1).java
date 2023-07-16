package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C14030oh;
import X.C28161tl;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$93 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$93(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(952720044);
        AnonymousClass0wJ.A11(C28161tl.A03(this.$userSession), "hidden_word_settings_info_nux_shown_count", 0);
        C63813iO.A03(this.$context, (String) null, 2131825450, 0);
        C14030oh.A0C(708769171, A05);
    }
}
