package com.instagram.debug.devoptions;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.C14030oh;
import X.C62803am;
import X.C63043bN;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$26 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$26(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1037722629);
        C62803am r4 = C63043bN.A01;
        boolean z = !C62803am.A01(r4, this.$userSession).getBoolean("BYPASS_QUIET_MODE_UPSELL_CHECKS", false);
        AnonymousClass0wJ.A13(C62803am.A00(r4, this.$userSession), "BYPASS_QUIET_MODE_UPSELL_CHECKS", z);
        C63813iO.A0C(this.$context, AnonymousClass00U.A0o("Bypass quiet mode upsell checks set to:", z));
        C14030oh.A0C(-1049345203, A05);
    }
}
