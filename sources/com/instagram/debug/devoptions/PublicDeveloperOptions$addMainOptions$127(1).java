package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C14030oh;
import X.C28161tl;
import X.C63813iO;
import X.I17;
import android.content.Context;
import android.view.View;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$127 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$127(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1793819073);
        AnonymousClass0wJ.A11(C28161tl.A03(this.$userSession), I17.A00(HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION), 0);
        C63813iO.A03(this.$context, (String) null, 2131825430, 0);
        C14030oh.A0C(928470808, A05);
    }
}
