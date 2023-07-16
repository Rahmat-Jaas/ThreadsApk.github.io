package com.instagram.debug.devoptions;

import X.AnonymousClass3WS;
import X.C14030oh;
import X.C18180wK;
import X.C18200wM;
import X.C18250wR;
import X.C63813iO;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$113 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$113(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(695750161);
        SharedPreferences sharedPreferences = AnonymousClass3WS.A01(this.$userSession).A00;
        C18180wK.A0u(sharedPreferences.edit(), "featured_accounts_tooltip_shown_account_set");
        C18250wR.A0p(sharedPreferences.edit(), "featured_accounts_tooltip_shown_account_set", C18200wM.A0u());
        C63813iO.A03(this.$context, (String) null, 2131825443, 0);
        C14030oh.A0C(507790610, A05);
    }
}
