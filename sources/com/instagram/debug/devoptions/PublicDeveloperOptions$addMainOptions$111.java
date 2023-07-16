package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass2SO;
import X.C14030oh;
import X.C63813iO;
import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$111 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$111(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-959558721);
        AnonymousClass0wJ.A11(AnonymousClass2SO.A00(this.$userSession).A00.edit(), "direct_create_you_avatar_nux_count", 0);
        C63813iO.A03(this.$context, (String) null, 2131825415, 0);
        C14030oh.A0C(-470551511, A05);
    }
}
