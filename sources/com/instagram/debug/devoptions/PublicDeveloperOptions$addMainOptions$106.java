package com.instagram.debug.devoptions;

import X.C14030oh;
import X.C18180wK;
import X.C18200wM;
import X.C18250wR;
import X.C28161tl;
import X.C63813iO;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$106 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$106(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(788682826);
        SharedPreferences A04 = C28161tl.A04(this.$userSession);
        C18180wK.A0u(A04.edit(), "long_press_follow_tooltip_shown_account_set");
        C18250wR.A0p(A04.edit(), "long_press_follow_tooltip_shown_account_set", C18200wM.A0u());
        C63813iO.A03(this.$context, (String) null, 2131825456, 0);
        C14030oh.A0C(-1961339003, A05);
    }
}
