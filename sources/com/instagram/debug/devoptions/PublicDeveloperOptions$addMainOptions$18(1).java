package com.instagram.debug.devoptions;

import X.C04220Ms;
import X.C14030oh;
import X.C18190wL;
import X.C63813iO;
import X.C694548p;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape132S0100000_I2_112;

public final class PublicDeveloperOptions$addMainOptions$18 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$18(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1247644215);
        UserSession userSession = this.$userSession;
        C04220Ms.A0B(userSession, 0);
        C18190wL.A11(((C694548p) userSession.A01(C694548p.class, new KtLambdaShape132S0100000_I2_112(userSession, 24))).A00);
        C63813iO.A03(this.$context, (String) null, 2131825390, 1);
        C14030oh.A0C(-1191021361, A05);
    }
}
