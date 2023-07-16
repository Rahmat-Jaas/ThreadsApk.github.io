package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.2KS  reason: invalid class name */
public final class AnonymousClass2KS {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        C04220Ms.A0B(userSession, 0);
        SimpleWebViewConfig A0P = C18250wR.A0P(str2, str);
        Bundle A06 = C18180wK.A06();
        A06.putParcelable("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", A0P);
        C18190wL.A13(A06, userSession.token);
        C34608Ibe ibe = new C34608Ibe();
        ibe.setArguments(A06);
        C18230wP.A19(ibe, C18180wK.A0Q(fragmentActivity, userSession));
    }
}
