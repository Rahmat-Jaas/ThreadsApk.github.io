package com.instagram.urlhandlers.learnfromothers;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C554433f;
import X.C57933Db;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape426S0100000_1_I2;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.fragment.SuggestBusinessFragment;
import com.instagram.service.session.UserSession;

public final class LearnFromOthersUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C != null) {
            return r1.A02(A0C);
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void onCreate(Bundle bundle) {
        int A00 = C14030oh.A00(1599082897);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            A0C = C18180wK.A06();
        }
        if (!(getSession() instanceof UserSession)) {
            AnonymousClass3YR.A00.A02(this, A0C, getSession());
        } else {
            getSupportFragmentManager().A0v(new IDxCListenerShape426S0100000_1_I2(this, 10));
            String string = A0C.getString("entry_point");
            if (string == null) {
                string = "professional_onboarding_checklist";
            }
            String string2 = getApplicationContext().getString(2131829573);
            String string3 = getApplicationContext().getString(2131829572);
            SuggestBusinessFragment suggestBusinessFragment = new SuggestBusinessFragment();
            Bundle A06 = C18180wK.A06();
            A06.putString("entry_point", string);
            A06.putString("suggested_business_fetch_entry_point", "onboarding_checklist_render");
            A06.putString("ARG_TITLE", string2);
            A06.putString("ARG_SUB_TITLE", string3);
            suggestBusinessFragment.setArguments(A06);
            Bundle bundle2 = suggestBusinessFragment.mArguments;
            if (bundle2 == null) {
                bundle2 = C18180wK.A06();
            }
            bundle2.putAll(A0C);
            suggestBusinessFragment.setArguments(bundle2);
            new C57933Db().A00(suggestBusinessFragment, this, new C554433f(getSession()), (String) null, true);
        }
        C14030oh.A07(1445152589, A00);
    }
}
