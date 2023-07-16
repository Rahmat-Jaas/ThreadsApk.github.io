package com.instagram.debug.devoptions.section.newusernux;

import X.AnonymousClass0wJ;
import X.AnonymousClass9Ne;
import X.C14030oh;
import X.C18180wK;
import X.C63463hW;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public final class NewUserNuxOptions$getItems$9 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public NewUserNuxOptions$getItems$9(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-487424476);
        Bundle A06 = C18180wK.A06();
        C63463hW.A03();
        AnonymousClass9Ne r2 = new AnonymousClass9Ne();
        r2.setArguments(A06);
        AnonymousClass0wJ.A19(r2, this.$activity, this.$userSession);
        C14030oh.A0C(-575428042, A05);
    }
}
