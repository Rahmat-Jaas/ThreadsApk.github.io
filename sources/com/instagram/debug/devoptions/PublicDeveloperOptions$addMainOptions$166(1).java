package com.instagram.debug.devoptions;

import X.C14030oh;
import X.C63343hJ;
import X.C71494Ja;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$166 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$166(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-35527158);
        C63343hJ.getInstance();
        C71494Ja r2 = new C71494Ja(this.$userSession);
        r2.CpK("RNRouteExplorerRoute");
        r2.A07 = this.$context.getResources().getString(2131834049);
        r2.BaN(this.$context);
        C14030oh.A0C(-684057016, A05);
    }
}
