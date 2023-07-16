package com.instagram.debug.devoptions.section.newusernux;

import X.C14030oh;
import X.C18180wK;
import X.C25786Drz;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public final class NewUserNuxOptions$getItems$10 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public NewUserNuxOptions$getItems$10(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(521496712);
        C25786Drz A0Q = C18180wK.A0Q(this.$activity, this.$userSession);
        A0Q.A03 = new NuxSelectionFragment();
        A0Q.A05();
        C14030oh.A0C(-381085643, A05);
    }
}
