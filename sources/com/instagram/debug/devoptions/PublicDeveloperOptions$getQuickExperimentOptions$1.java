package com.instagram.debug.devoptions;

import X.C05050Qq;
import X.C08380dH;
import X.C09120et;
import X.C14030oh;
import X.C18180wK;
import X.C18240wQ;
import X.C61823Vx;
import X.C63813iO;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.quickexperiment.QuickExperimentCategoriesFragment;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$getQuickExperimentOptions$1 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ C61823Vx $qeFactory;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$getQuickExperimentOptions$1(C61823Vx r1, UserSession userSession, Context context, FragmentActivity fragmentActivity) {
        this.$qeFactory = r1;
        this.$userSession = userSession;
        this.$context = context;
        this.$fragmentActivity = fragmentActivity;
    }

    public final void onClick(View view) {
        Context context;
        int i;
        int A05 = C14030oh.A05(-1068779661);
        C61823Vx r2 = this.$qeFactory;
        if (r2 != null) {
            r2.A09(this.$userSession, false);
        }
        C08380dH r1 = C09120et.A3D;
        if (r1.A00().A0M() || r1.A00().A0N()) {
            context = this.$context;
            i = 2131825562;
        } else if (r1.A00().A0O()) {
            context = this.$context;
            i = 2131825005;
        } else {
            Bundle A06 = C18180wK.A06();
            C05050Qq.A00(A06, this.$userSession);
            C18240wQ.A0u(A06, new QuickExperimentCategoriesFragment(), C18180wK.A0Q(this.$fragmentActivity, this.$userSession));
            C14030oh.A0C(1809507677, A05);
        }
        C63813iO.A03(context, (String) null, i, 1);
        C14030oh.A0C(1809507677, A05);
    }
}
