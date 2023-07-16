package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass25l;
import X.C14030oh;
import X.C18190wL;
import X.C25828Dsm;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape77S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

public final class PublicDeveloperOptions$addMainOptions$130 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$130(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$fragmentActivity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-412759820);
        FragmentActivity fragmentActivity = this.$fragmentActivity;
        UserSession userSession = this.$userSession;
        C25828Dsm A0W = C18190wL.A0W(fragmentActivity);
        A0W.A0i(fragmentActivity.getDrawable(R.drawable.ig_illustrations_illo_security_checkup));
        A0W.A0L(2131835357);
        A0W.A0K(2131835355);
        A0W.A0T(new IDxCListenerShape77S0200000_1_I2(74, (Object) fragmentActivity, (Object) userSession), AnonymousClass25l.BLUE_BOLD, 2131835356);
        A0W.A0N((DialogInterface.OnClickListener) null, 2131835354);
        A0W.A0r(false);
        AnonymousClass0wJ.A1K(A0W);
        C14030oh.A0C(-1641002811, A05);
    }
}
