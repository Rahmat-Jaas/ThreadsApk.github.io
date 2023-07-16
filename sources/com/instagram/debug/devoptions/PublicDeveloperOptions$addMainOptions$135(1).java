package com.instagram.debug.devoptions;

import X.C04220Ms;
import X.C14030oh;
import X.C18180wK;
import X.C18220wO;
import X.C28161tl;
import X.C63813iO;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.instagram.service.session.UserSession;
import java.util.Iterator;

public final class PublicDeveloperOptions$addMainOptions$135 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$135(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(48713078);
        SharedPreferences A04 = C28161tl.A04(this.$userSession);
        SharedPreferences.Editor edit = A04.edit();
        Iterator A0x = C18220wO.A0x(A04.getAll());
        while (A0x.hasNext()) {
            String A0k = C18180wK.A0k(A0x);
            C04220Ms.A04(A0k);
            if (C18220wO.A1V("proactive_warning_banner_dismissed", 1, A0k)) {
                edit.remove(A0k);
            }
        }
        edit.apply();
        C63813iO.A03(this.$context, (String) null, 2131825484, 0);
        C14030oh.A0C(74970226, A05);
    }
}
