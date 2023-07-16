package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.4H8  reason: invalid class name */
public final class AnonymousClass4H8 implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        HashMap A0y;
        String str;
        if (bundle == null) {
            bundle = C18180wK.A06();
        }
        bundle.putString("entry_source", "quick_promotion");
        Fragment fragment = this.A00;
        bundle.putString(DialogModule.KEY_TITLE, fragment.getString(2131827929));
        UserSession userSession = this.A01;
        IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
        if (!AnonymousClass0wJ.A0Y(userSession).Apo() || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36321241342155395L)) {
            boolean A0E = C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36319579189810409L);
            A0y = AnonymousClass0wJ.A0y();
            if (A0E) {
                str = "com.bloks.www.bloks.ig.activity_status_screen";
            } else {
                str = "com.instagram.portable_settings.privacy.activity_status";
            }
        } else {
            A0y = AnonymousClass0wJ.A0y();
            str = "com.instagram.portable_settings.privacy.business_activity_status";
        }
        C63863iT.A0C(C62853b1.A00(A0N, C63743iE.A02(str, A0y)), fragment, userSession);
    }

    public AnonymousClass4H8(Fragment fragment, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = fragment;
    }
}
