package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3WS;
import X.AnonymousClass3Zs;
import X.C14030oh;
import X.C18190wL;
import X.C28161tl;
import X.C63813iO;
import X.D2R;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$110 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$110(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1119518648);
        C18190wL.A11(AnonymousClass3Zs.A03(this.$userSession).A01(D2R.A1c));
        AnonymousClass0wJ.A13(C28161tl.A02(AnonymousClass3WS.A01(this.$userSession)), "direct_cf_hub_notes_creation_banner", false);
        AnonymousClass0wJ.A13(C28161tl.A03(this.$userSession), "direct_cf_hub_avatar_notes_nux", false);
        C63813iO.A03(this.$context, (String) null, 2131825468, 0);
        C14030oh.A0C(-29136677, A05);
    }
}
