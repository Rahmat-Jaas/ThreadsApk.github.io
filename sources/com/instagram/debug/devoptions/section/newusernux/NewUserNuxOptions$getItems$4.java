package com.instagram.debug.devoptions.section.newusernux;

import X.AnonymousClass45T;
import X.C14030oh;
import X.C28161tl;
import X.C313625r;
import X.C38040KHr;
import X.C63463hW;
import android.content.Context;
import android.view.View;
import com.instagram.debug.devoptions.section.newusernux.NewUserNuxOptions;
import com.instagram.service.session.UserSession;

public final class NewUserNuxOptions$getItems$4 implements View.OnClickListener {
    public final /* synthetic */ UserSession $userSession;
    public final /* synthetic */ NewUserNuxOptions this$0;

    public NewUserNuxOptions$getItems$4(NewUserNuxOptions newUserNuxOptions, UserSession userSession) {
        this.this$0 = newUserNuxOptions;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1544246392);
        C38040KHr.A01.A03(new NewUserNuxOptions.OnboardingStatusEventListener(this.this$0.context), AnonymousClass45T.class);
        C63463hW A02 = C63463hW.A02();
        Context context = this.this$0.context;
        UserSession userSession = this.$userSession;
        A02.A07(context, userSession, C313625r.EMAIL, C28161tl.A04(userSession).getBoolean("allow_contacts_sync", false), false, true, false);
        C14030oh.A0C(-1654657204, A05);
    }
}
