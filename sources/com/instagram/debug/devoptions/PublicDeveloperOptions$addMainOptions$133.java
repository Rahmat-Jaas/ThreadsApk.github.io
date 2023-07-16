package com.instagram.debug.devoptions;

import X.C14030oh;
import X.C62653aT;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$133 implements View.OnClickListener {
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$133(UserSession userSession) {
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1821858557);
        C62653aT.A02().A02(this.$userSession.getUserId(), String.valueOf(System.currentTimeMillis()));
        C14030oh.A0C(-1012429379, A05);
    }
}
