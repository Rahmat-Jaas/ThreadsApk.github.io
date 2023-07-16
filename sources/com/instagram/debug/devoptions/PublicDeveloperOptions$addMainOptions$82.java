package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C14030oh;
import X.C18190wL;
import X.C63743iE;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$82 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$82(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$fragmentActivity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1806062293);
        C63743iE A02 = C63743iE.A02("com.instagram.admin.home", AnonymousClass0wJ.A0y());
        FragmentActivity fragmentActivity = this.$fragmentActivity;
        IgBloksScreenConfig A0N = C18190wL.A0N(this.$userSession);
        A0N.A0P = "admin-tool-dev-options";
        A0N.A0S = fragmentActivity.getResources().getString(2131821192);
        C63743iE.A07(fragmentActivity, A0N, A02);
        C14030oh.A0C(1257904757, A05);
    }
}
