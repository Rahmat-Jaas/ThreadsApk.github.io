package com.instagram.business.activity;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C04530Oa;
import X.C10300i6;
import X.C18210wN;
import X.C62883b4;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.fragment.EditBusinessFBPageFragment;

public final class FbConnectPageActivity extends BaseFragmentActivity {
    public final C04530Oa A00 = C18210wN.A0k(this, 6);
    public final C04530Oa A01 = C18210wN.A0k(this, 7);

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public final void A0D(Bundle bundle) {
        C62883b4.A04();
        Bundle bundle2 = (Bundle) this.A00.getValue();
        C04220Ms.A06(bundle2);
        EditBusinessFBPageFragment editBusinessFBPageFragment = new EditBusinessFBPageFragment();
        editBusinessFBPageFragment.setArguments(bundle2);
        AnonymousClass0wJ.A19(editBusinessFBPageFragment, this, AnonymousClass0wJ.A0U(this.A01));
    }
}
