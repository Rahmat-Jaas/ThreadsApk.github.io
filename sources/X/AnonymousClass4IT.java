package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4IT  reason: invalid class name */
public final class AnonymousClass4IT implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        String queryParameter = uri.getQueryParameter("entry_point");
        if (queryParameter == null) {
            queryParameter = "megaphone";
        }
        FragmentActivity fragmentActivity = this.A00;
        boolean A1W = AnonymousClass0wJ.A1W(fragmentActivity.findViewById(R.id.layout_container_main));
        GU8.A01.A00();
        UserSession userSession = this.A01;
        Integer num = AnonymousClass006.A01;
        if (A1W) {
            GU8.A01.A00();
            C26211qE A002 = C23161cb.A00(C18180wK.A06(), userSession, num, queryParameter, A1W);
            C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, userSession);
            A0Q.A03 = A002;
            A0Q.A07 = "GDPR.Fragment.Entrance";
            A0Q.A0B = true;
            A0Q.A05();
        } else if (C05030Qo.A04(userSession) != null) {
            Bundle A06 = C18180wK.A06();
            A06.putString("GDPR.Fragment.EntryPoint", queryParameter);
            A06.putString("GDPR.Fragment.UserState", AnonymousClass2PB.A00(num));
            A06.putBoolean("GDPR.Fragment.Entrance.Enabled", A1W);
            C05050Qq.A00(A06, userSession);
            C63863iT.A08(fragmentActivity, A06, userSession, ModalActivity.class, "gdpr_consent");
        } else {
            throw C18180wK.A0a("Must call setUserId() with non-null userId first");
        }
    }

    public AnonymousClass4IT(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
