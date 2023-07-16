package com.instagram.debug.devoptions;

import X.AnonymousClass3Zs;
import X.C14030oh;
import X.C18190wL;
import X.C63813iO;
import X.D2R;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$32 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$32(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(332968061);
        C18190wL.A11(AnonymousClass3Zs.A03(this.$userSession).A01(D2R.A0Z));
        C63813iO.A03(this.$context, (String) null, 2131825432, 0);
        C14030oh.A0C(-2068110424, A05);
    }
}
