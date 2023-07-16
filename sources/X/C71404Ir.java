package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Ir  reason: invalid class name and case insensitive filesystem */
public final class C71404Ir implements C82924qU {
    public final FragmentActivity A00;
    public final C10300i6 A01;

    public final void BN1(Uri uri, Bundle bundle) {
        C32165H8c A002;
        String queryParameter = uri.getQueryParameter("use_case");
        C10300i6 r3 = this.A01;
        if (queryParameter == null) {
            C04220Ms.A0B(r3, 0);
            H1T A0O = AnonymousClass0wJ.A0O(r3);
            A0O.A0J("security_checkup/start/");
            A002 = AnonymousClass0wJ.A0T(A0O, C22101Tj.class, C60603Pt.class);
        } else {
            A002 = C54472zV.A00(r3, Integer.valueOf(Integer.parseInt(queryParameter)));
        }
        FragmentActivity fragmentActivity = this.A00;
        C28591uf.A00(fragmentActivity.getSupportFragmentManager(), (IgFragmentActivity) fragmentActivity, A002, r3);
    }

    public C71404Ir(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
