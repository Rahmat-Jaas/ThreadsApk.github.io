package com.instagram.debug.devoptions;

import X.C04220Ms;
import X.C14030oh;
import X.C146958n9;
import X.C25237DiI;
import X.C27952Ew2;
import X.C63813iO;
import X.DYT;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0301000_I2_3;
import kotlin.jvm.internal.KtLambdaShape66S0100000_I2_46;

public final class PublicDeveloperOptions$addMainOptions$136 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$136(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1322254557);
        UserSession userSession = this.$userSession;
        C04220Ms.A0B(userSession, 0);
        DYT dyt = (DYT) userSession.A01(DYT.class, new KtLambdaShape66S0100000_I2_46(userSession, 35));
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape11S0301000_I2_3((Object) dyt, (C146958n9) null, 34), dyt.A09, 3);
        C63813iO.A03(this.$context, (String) null, 2131825039, 0);
        C14030oh.A0C(-858730050, A05);
    }
}
