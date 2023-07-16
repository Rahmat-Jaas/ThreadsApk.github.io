package X;

import android.os.Bundle;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1QY  reason: invalid class name */
public final class AnonymousClass1QY extends AnonymousClass1cf {
    public static final String __redex_internal_original_name = "PasswordCreationForUnlinkingFragment";
    public UserSession A00;
    public User A01;
    public String A02;
    public String A03;

    public final String getModuleName() {
        return "password_creation_unlinking";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1412811580);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = C18180wK.A0V(requireArguments);
        String string = requireArguments.getString("child_user_id_key");
        this.A03 = string;
        this.A01 = this.A00.multipleAccountHelper.A0E(string);
        this.A02 = requireArguments.getString("main_user_id_key");
        C24731jw.A01(this);
        C14030oh.A09(-370070264, A022);
    }
}
