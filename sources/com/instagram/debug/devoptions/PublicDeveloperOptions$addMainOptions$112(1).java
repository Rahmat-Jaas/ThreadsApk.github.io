package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass2SO;
import X.C14030oh;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$112 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$112(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1980393162);
        AnonymousClass0wJ.A11(AnonymousClass2SO.A00(this.$userSession).A00.edit(), "direct_avatar_sticker_nux_count", 0);
        C63813iO.A03(this.$context, (String) null, 2131825417, 0);
        C14030oh.A0C(-735383279, A05);
    }
}
