package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C14030oh;
import X.C62803am;
import X.C63043bN;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$22 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$22(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1108269327);
        AnonymousClass0wJ.A13(C62803am.A00(C63043bN.A01, this.$userSession), "HAS_USER_EVER_SET_BREAKS", false);
        C63813iO.A0C(this.$context, "Has seen take a break cleared");
        C14030oh.A0C(-245973611, A05);
    }
}
