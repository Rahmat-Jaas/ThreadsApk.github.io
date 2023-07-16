package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.4Ht  reason: invalid class name and case insensitive filesystem */
public final class C71164Ht implements C82924qU {
    public final UserSession A00;
    public final WeakReference A01;

    public final void BN1(Uri uri, Bundle bundle) {
        C04220Ms.A0B(uri, 0);
        Activity activity = (Activity) this.A01.get();
        AnonymousClass268 r1 = AnonymousClass268.A0B;
        String obj = uri.toString();
        UserSession userSession = this.A00;
        if (r1.A02(obj) && activity != null) {
            String queryParameter = uri.getQueryParameter("loggingSurface");
            String queryParameter2 = uri.getQueryParameter("loggingMechanism");
            AnonymousClass3DW r12 = AnonymousClass30L.A00;
            if (queryParameter == null) {
                queryParameter = "ig_direct";
            }
            if (queryParameter2 == null) {
                queryParameter2 = "ig_direct_avatar_qp_button";
            }
            r12.A00(activity, (C27930Evg) null, userSession, queryParameter, queryParameter2, (String) null, (List) null, false);
        }
    }

    public C71164Ht(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = userSession;
        this.A01 = new WeakReference(fragmentActivity);
    }
}
