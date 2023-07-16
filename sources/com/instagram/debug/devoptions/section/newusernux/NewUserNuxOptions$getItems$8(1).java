package com.instagram.debug.devoptions.section.newusernux;

import X.C14030oh;
import X.C313625r;
import X.C63463hW;
import X.C63813iO;
import X.C82834qL;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class NewUserNuxOptions$getItems$8 implements View.OnClickListener {
    public final /* synthetic */ UserSession $userSession;
    public final /* synthetic */ NewUserNuxOptions this$0;

    public NewUserNuxOptions$getItems$8(NewUserNuxOptions newUserNuxOptions, UserSession userSession) {
        this.this$0 = newUserNuxOptions;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1296716181);
        C63463hW A02 = C63463hW.A02();
        final NewUserNuxOptions newUserNuxOptions = this.this$0;
        A02.A09(newUserNuxOptions.context, new C82834qL() {
            public final void onFinished() {
                C63813iO.A0C(NewUserNuxOptions.this.context, "Nux finished!  Huzzah!");
            }
        }, this.$userSession, C313625r.SAC, false);
        C14030oh.A0C(1826284861, A05);
    }
}
