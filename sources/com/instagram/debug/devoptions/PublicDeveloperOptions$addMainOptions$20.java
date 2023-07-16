package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C14030oh;
import X.C210718u;
import X.M4x;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$20 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$20(Context context, UserSession userSession) {
        this.$context = context;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1388346185);
        Context context = this.$context;
        UserSession userSession = this.$userSession;
        AnonymousClass0wJ.A1N(context, userSession);
        M4x.A01(context, new C210718u(userSession), "com.bloks.www.ig.pro_dash.entry_point.hypercard", (String) null, AnonymousClass0wJ.A0y());
        C14030oh.A0C(-762877109, A05);
    }
}
