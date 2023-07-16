package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass1wO;
import X.C14030oh;
import X.C18190wL;
import X.C25786Drz;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$175 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$175(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$fragmentActivity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(1582367860);
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(this.$fragmentActivity, this.$userSession);
        C18190wL.A10();
        A0Q.A03 = new AnonymousClass1wO();
        A0Q.A05();
        C14030oh.A0C(-1012110626, A05);
    }
}
