package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.monetization.impl.MonetizationFragmentFactoryImpl;
import com.instagram.service.session.UserSession;

/* renamed from: X.4I8  reason: invalid class name */
public final class AnonymousClass4I8 implements C82924qU {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        String str;
        if (uri != null) {
            str = uri.getQueryParameter("product");
        } else {
            str = null;
        }
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(fragmentActivity, userSession);
        A0Q.A07 = "QP";
        C24182DCb.A00();
        A0Q.A03 = new MonetizationFragmentFactoryImpl().A00(AnonymousClass2FJ.A00(str), userSession, (String) null, false);
        A0Q.A05();
    }

    public AnonymousClass4I8(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
