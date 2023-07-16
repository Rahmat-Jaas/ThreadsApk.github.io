package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass2SN;
import X.C14030oh;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$119 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$119(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-62155651);
        AnonymousClass0wJ.A13(AnonymousClass2SN.A00(this.$userSession).A00.edit(), "avatar_sticker_asset_picker_tooltip_has_seen", false);
        C63813iO.A03(this.$context, (String) null, 2131825419, 0);
        C14030oh.A0C(-468213081, A05);
    }
}
