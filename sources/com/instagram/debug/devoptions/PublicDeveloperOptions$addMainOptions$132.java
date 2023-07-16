package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3Za;
import X.C14030oh;
import X.C18180wK;
import X.C18220wO;
import X.C31155GhB;
import X.C85814vo;
import X.H1T;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$132 implements View.OnClickListener {
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$132(UserSession userSession) {
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-276113276);
        H1T A0P = C18180wK.A0P(this.$userSession);
        C18220wO.A1K(A0P, "authenticity/proactive_id_verification/trigger_user_restriction/");
        C31155GhB.A03(AnonymousClass0wJ.A0T(A0P, C85814vo.class, AnonymousClass3Za.class));
        C14030oh.A0C(-36361085, A05);
    }
}
