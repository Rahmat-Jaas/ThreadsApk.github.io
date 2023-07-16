package com.instagram.debug.devoptions;

import X.C14030oh;
import X.C63813iO;
import X.EAW;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$68 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$68(FragmentActivity fragmentActivity, UserSession userSession, Context context) {
        this.$fragmentActivity = fragmentActivity;
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1560690816);
        EAW.A0I.A00(this.$fragmentActivity, this.$userSession).A0U(true);
        C63813iO.A02(this.$context, "All uploads were cancelled", (String) null, 0);
        C14030oh.A0C(-1200050883, A05);
    }
}
