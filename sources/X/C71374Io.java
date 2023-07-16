package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Io  reason: invalid class name and case insensitive filesystem */
public final class C71374Io implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        String str;
        String str2;
        String str3 = null;
        if (uri != null) {
            str = uri.getQueryParameter("product");
            str2 = uri.getQueryParameter("created_deal_id");
            str3 = uri.getQueryParameter("fe_id");
        } else {
            str = null;
            str2 = null;
        }
        C102006Tl.A00((Fragment) null, this.A00, AnonymousClass2FJ.A00(str), this.A01, "ResumePayoutOnboardingActionHandler", "QP", str2, str3, (String) null);
    }

    public C71374Io(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
