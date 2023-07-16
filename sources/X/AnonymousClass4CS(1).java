package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.4CS  reason: invalid class name */
public final class AnonymousClass4CS implements C21320BsR {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void Bpb(String str, String str2) {
        String str3 = str;
        if (str != null) {
            FragmentActivity fragmentActivity = this.A00;
            UserSession userSession = this.A01;
            if (C18220wO.A1V("instagram://", 1, str3)) {
                C37412JrW.A01(fragmentActivity, str3);
            } else {
                SimpleWebViewActivity.A01.A02(fragmentActivity, userSession, new SimpleWebViewConfig(AnonymousClass3W8.A02(fragmentActivity, AnonymousClass3h3.A02(str3)), (String) null, (String) null, str2, false, false, true, true, false, true, false, true, false, false, false));
            }
        }
    }

    public AnonymousClass4CS(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
