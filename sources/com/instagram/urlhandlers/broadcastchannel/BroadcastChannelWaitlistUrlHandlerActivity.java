package com.instagram.urlhandlers.broadcastchannel;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.AnonymousClass4J7;
import X.C04220Ms;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18240wQ;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class BroadcastChannelWaitlistUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        Bundle A0B;
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        Intent intent = getIntent();
        if (intent != null && (A0B = C18210wN.A0B(intent)) != null) {
            return r1.A02(A0B);
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        Bundle A0B;
        int A00 = C14030oh.A00(209032310);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (A0B = C18210wN.A0B(intent)) == null) {
            finish();
            i = -918486139;
        } else {
            String A0i = C18190wL.A0i(A0B);
            if (!(A0i == null || A0i.length() == 0 || C18240wQ.A03(C15430rJ.A01(A0i)) != 2)) {
                if (!(getSession() instanceof UserSession)) {
                    AnonymousClass3YR.A00.A02(this, A0B, getSession());
                } else {
                    C10300i6 session = getSession();
                    C18200wM.A1R(session);
                    AnonymousClass4J7 r1 = new AnonymousClass4J7(this, (UserSession) session, true);
                    Uri parse = Uri.parse("instagram://broadcast_channel_waitlist_info");
                    C04220Ms.A06(parse);
                    r1.BN1(parse, (Bundle) null);
                    i = -1748068310;
                }
            }
            finish();
            i = -1748068310;
        }
        C14030oh.A07(i, A00);
    }
}
