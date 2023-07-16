package X;

import android.os.Bundle;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.1wH  reason: invalid class name */
public final class AnonymousClass1wH extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "FollowAndInviteOptionsFragment";
    public UserSession A00;

    public final String getModuleName() {
        return "settings_follow_and_invite_options";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C23411dm.A04(this, r2, 2131827585);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1514449706);
        super.onCreate(bundle);
        this.A00 = C18180wK.A0V(this.mArguments);
        C14030oh.A09(754060516, A02);
    }

    public final void onResume() {
        int A02 = C14030oh.A02(-947963742);
        super.onResume();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C61713Va r1 = new C61713Va(this, this, this.A00, true);
        r1.A00 = null;
        r1.A01(A0v);
        setItems(A0v);
        C14030oh.A09(-2025366424, A02);
    }
}
