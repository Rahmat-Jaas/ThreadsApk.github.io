package com.instagram.urlhandlers.creatorcontentmanagement;

import X.AnonymousClass006;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass27l;
import X.AnonymousClass3In;
import X.AnonymousClass3YR;
import X.AnonymousClass44K;
import X.C04220Ms;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18240wQ;
import X.C22681Za;
import X.C25786Drz;
import X.C98316Fa;
import X.CRY;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;
import kotlin.Pair;

public final class CreatorContentManagementUrlHandlerActivity extends BaseFragmentActivity {
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
        Object obj;
        char c;
        Fragment cry;
        Pair[] pairArr;
        int i;
        int A00 = C14030oh.A00(271010872);
        super.onCreate(bundle);
        if (bundle != null) {
            i = 507712476;
        } else {
            Bundle A0C = AnonymousClass0wJ.A0C(this);
            if (A0C == null) {
                finish();
                i = -634746262;
            } else {
                String A0i = C18190wL.A0i(A0C);
                if (A0i == null) {
                    finish();
                    i = -2129800531;
                } else {
                    C10300i6 session = getSession();
                    if (!(session instanceof UserSession)) {
                        AnonymousClass3YR.A00(this, A0C, session);
                    } else {
                        Uri A0A = C18210wN.A0A(A0i);
                        UserSession userSession = (UserSession) session;
                        String queryParameter = A0A.getQueryParameter("tool");
                        AnonymousClass44K r2 = AnonymousClass44K.A00;
                        if (C04220Ms.A0I(queryParameter, "scheduled_content")) {
                            new AnonymousClass3In(r2, userSession, AnonymousClass006.A06).A02(AnonymousClass006.A0N);
                            obj = "pro_home";
                            c = 0;
                            cry = new C22681Za();
                            pairArr = new Pair[1];
                        } else if (C04220Ms.A0I(queryParameter, "drafts")) {
                            boolean parseBoolean = Boolean.parseBoolean(A0A.getQueryParameter("should_show_nux"));
                            obj = AnonymousClass27l.PRO_HOME;
                            c = 1;
                            cry = new CRY();
                            pairArr = new Pair[2];
                            pairArr[0] = C18180wK.A0p("should_show_nux", Boolean.valueOf(parseBoolean));
                        } else {
                            finish();
                        }
                        pairArr[c] = C18180wK.A0p("entry_point", obj);
                        cry.setArguments(C98316Fa.A00(pairArr));
                        C25786Drz A0Q = C18180wK.A0Q(this, userSession);
                        A0Q.A03 = cry;
                        A0Q.A08();
                        C18240wQ.A1B(A0Q);
                    }
                    i = -1244782396;
                }
            }
        }
        C14030oh.A07(i, A00);
    }
}
