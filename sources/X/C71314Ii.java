package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;
import com.instagram.user.recommended.FollowListData;

/* renamed from: X.4Ii  reason: invalid class name and case insensitive filesystem */
public final class C71314Ii implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        String queryParameter = uri.getQueryParameter("order");
        C23937D1z d1z = C23937D1z.FOLLOWING;
        UserSession userSession = this.A01;
        String userId = userSession.getUserId();
        C04220Ms.A0B(d1z, 0);
        String A0e = C18180wK.A0e();
        C04220Ms.A06(A0e);
        C25210Dhq.A00(this.A00.getActivity(), userSession, new FollowListData(d1z, userId, A0e, queryParameter, false), false).A05();
    }

    public C71314Ii(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
