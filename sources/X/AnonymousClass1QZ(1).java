package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.service.session.UserSession;

/* renamed from: X.1QZ  reason: invalid class name */
public final class AnonymousClass1QZ extends AnonymousClass1cf {
    public static final String __redex_internal_original_name = "CreatePasswordNuxFragment";
    public UserSession A00;

    public final String getModuleName() {
        return "create_password_nux";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1313301853);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0wJ.A0W(this);
        C14030oh.A09(-1408506429, A02);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass3YT.A00.A02(this.A00, "nux_create_password");
    }
}
