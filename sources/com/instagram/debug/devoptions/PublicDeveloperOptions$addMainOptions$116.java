package com.instagram.debug.devoptions;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass2SN;
import X.C04220Ms;
import X.C14030oh;
import X.C24998Ddb;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$116 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$116(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-2046249506);
        C24998Ddb A00 = AnonymousClass2SN.A00(this.$userSession);
        String userId = this.$userSession.getUserId();
        C04220Ms.A0B(userId, 0);
        AnonymousClass0wJ.A13(A00.A00.edit(), AnonymousClass00U.A0L("KEY_HAS_SEEN_COIN_FLIP_NUX_BOTTOM_SHEET", userId), false);
        C63813iO.A03(this.$context, (String) null, 2131825409, 0);
        C14030oh.A0C(-152983404, A05);
    }
}
