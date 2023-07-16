package com.instagram.debug.devoptions;

import X.C102506Vl;
import X.C14030oh;
import X.C63813iO;
import X.C972868t;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$102 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$102(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-997874928);
        C102506Vl.A00(C972868t.CUSTOM_COMMENT_FILTER).A00(this.$userSession);
        C63813iO.A03(this.$context, (String) null, 2131825436, 0);
        C14030oh.A0C(-1376077772, A05);
    }
}
