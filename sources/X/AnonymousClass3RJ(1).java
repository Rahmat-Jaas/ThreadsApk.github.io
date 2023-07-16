package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.3RJ  reason: invalid class name */
public final class AnonymousClass3RJ {
    public static final C16240si A00 = C18190wL.A0I();

    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C04220Ms.A0B(userSession, 0);
        SimpleWebViewConfig A002 = new C36941JhV(str).A00();
        Bundle A06 = C18180wK.A06();
        A06.putParcelable("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", A002);
        C18190wL.A13(A06, userSession.token);
        C34608Ibe ibe = new C34608Ibe();
        ibe.setArguments(A06);
        AnonymousClass0wJ.A19(ibe, fragmentActivity, userSession);
    }
}
