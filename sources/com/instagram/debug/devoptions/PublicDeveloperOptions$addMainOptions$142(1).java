package com.instagram.debug.devoptions;

import X.C14030oh;
import X.C63713iA;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$142 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$142(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-2047037927);
        C63713iA.A09(this.$userSession, false);
        C63713iA.A01 = true;
        C63813iO.A03(this.$context, (String) null, 2131825445, 0);
        C14030oh.A0C(-1054970913, A05);
    }
}
