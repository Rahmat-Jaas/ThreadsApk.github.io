package com.instagram.debug.devoptions;

import X.AnonymousClass00U;
import X.AnonymousClass3YZ;
import X.C14030oh;
import X.C18230wP;
import X.C61173Se;
import X.C62653aT;
import X.C63813iO;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$134 implements View.OnClickListener {
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$134(UserSession userSession) {
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        String str;
        int A05 = C14030oh.A05(-283912944);
        AnonymousClass3YZ A02 = C62653aT.A02();
        String A0q = C18230wP.A0q(this.$userSession);
        AnonymousClass3YZ.A00(A02);
        C61173Se r0 = (C61173Se) A02.A00.get(A0q);
        if (r0 != null) {
            str = r0.A01;
        } else {
            str = null;
        }
        C63813iO.A0F(AnonymousClass00U.A0L("nonce is :", str));
        C14030oh.A0C(-2043736545, A05);
    }
}
