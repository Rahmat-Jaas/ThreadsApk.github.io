package com.instagram.urlhandlers.professionalonboardingchecklistexternal;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C62883b4;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.fragment.OnboardingCheckListFragment;
import com.instagram.service.session.UserSession;

public class ProfessionalOnboardingChecklistExternalUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(245879421);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        C10300i6 A0S = C18190wL.A0S(A0C);
        this.A00 = A0S;
        if (!(A0S instanceof UserSession)) {
            AnonymousClass3YR.A00(this, A0C, A0S);
        } else {
            C18190wL.A13(A0C, C05030Qo.A02(A0S).token);
            A0C.putString("entry_point", "deep_link");
            C62883b4.A04();
            OnboardingCheckListFragment onboardingCheckListFragment = new OnboardingCheckListFragment();
            onboardingCheckListFragment.setArguments(A0C);
            onboardingCheckListFragment.setArguments(A0C);
            C18180wK.A16(onboardingCheckListFragment, this, A0S);
        }
        C14030oh.A07(-1651149157, A002);
    }
}
