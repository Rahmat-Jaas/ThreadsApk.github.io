package com.instagram.urlhandlers.smbsupportlinksetup;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C62883b4;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.fragment.SupportLinksFragment;
import com.instagram.service.session.UserSession;

public class SmbSupportLinkSetupUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(-1530529355);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0B = C18210wN.A0B(intent);
        A0B.getClass();
        this.A00 = C18190wL.A0S(A0B);
        String A0e = C18180wK.A0e();
        String stringExtra = intent.getStringExtra("entrypoint");
        C10300i6 r2 = this.A00;
        if (r2 == null || !(r2 instanceof UserSession)) {
            AnonymousClass3YR.A00(this, A0B, r2);
        } else {
            C62883b4.A04();
            AnonymousClass0wJ.A1N(stringExtra, A0e);
            Bundle A06 = C18180wK.A06();
            A06.putString("args_entry_point", stringExtra);
            A06.putString("args_session_id", A0e);
            SupportLinksFragment supportLinksFragment = new SupportLinksFragment();
            supportLinksFragment.setArguments(A06);
            C18180wK.A16(supportLinksFragment, this, r2);
        }
        C14030oh.A07(-2022586262, A002);
    }
}
