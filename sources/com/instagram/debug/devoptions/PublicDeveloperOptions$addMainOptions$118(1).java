package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass2SN;
import X.C14030oh;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$118 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$118(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1348167736);
        AnonymousClass0wJ.A13(AnonymousClass2SN.A00(this.$userSession).A00.edit(), "KEY_HAS_SEEN_MUSIC_TOOLTIP", false);
        C63813iO.A03(this.$context, (String) null, 2131825411, 0);
        C14030oh.A0C(1209860367, A05);
    }
}
