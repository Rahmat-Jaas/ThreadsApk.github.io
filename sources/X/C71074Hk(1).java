package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.api.schemas.HasPasswordState;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Hk  reason: invalid class name and case insensitive filesystem */
public final class C71074Hk implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        HasPasswordState hasPasswordState;
        UserSession userSession = this.A01;
        AccountFamily A02 = C62813an.A02(C62813an.A01(userSession), userSession);
        if (!(A02 == null || A02.A00() == null)) {
            C72144Mm A002 = A02.A00();
            if (A002 != null) {
                hasPasswordState = A002.A00.A01;
                if (hasPasswordState == null) {
                    hasPasswordState = HasPasswordState.UNKNOWN;
                }
            } else {
                hasPasswordState = null;
            }
            if (hasPasswordState == HasPasswordState.FALSE) {
                C58163Ei.A01.A00();
                Bundle A0E = AnonymousClass0wJ.A0E(userSession);
                A0E.putBoolean("is_interstitial", true);
                C23131by r1 = new C23131by();
                r1.setArguments(A0E);
                C25786Drz A0Q = AnonymousClass0wJ.A0Q(this.A00, userSession);
                A0Q.A03 = r1;
                A0Q.A05();
                return;
            }
        }
        AnonymousClass3Fo r12 = new AnonymousClass3Fo(userSession);
        if (!(A02 == null || C50492t5.A00(A02.A04).size() == 0)) {
            String A012 = ((C72144Mm) C50492t5.A00(A02.A04).get(0)).A01();
            UserSession userSession2 = r12.A04;
            H1T A0N = AnonymousClass0wJ.A0N(userSession2);
            C18200wM.A1N(A0N, "multiple_accounts/unlink_from_main_accounts/");
            C31155GhB.A05(C18200wM.A0T(A0N, "main_account_ids", A012), 245, 3, true, false);
            AnonymousClass49X.A02(userSession2);
        }
        C18180wK.A0Q(this.A00, userSession).A0D((String) null, 0);
    }

    public C71074Hk(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
