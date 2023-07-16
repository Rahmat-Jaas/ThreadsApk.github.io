package X;

import androidx.fragment.app.Fragment;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.2AT  reason: invalid class name */
public enum AnonymousClass2AT implements C81754oJ {
    A05("email_or_phone", 0),
    A0B("phone_confirmation", 1),
    A09("one_page_registration", 2),
    A0F("username_sign_up", 5),
    A06("username_sign_up", 6),
    A04("username_sign_up", 7),
    A0A("password_too_easy", 8),
    A0D("sac_create_username", 9),
    A0C("sac_create_password", 10),
    A0E("sac_welcome", 11),
    A03("instagram_terms_flow", 12),
    A08("add_birthday", 13),
    A07("enter_age", 14);
    
    public final AnonymousClass265 A00;
    public final String A01;

    public static AnonymousClass3Y3 A00(Fragment fragment, AnonymousClass2AT r2, RegFlowExtras regFlowExtras) {
        regFlowExtras.A0N = r2.A00.name();
        regFlowExtras.A03(regFlowExtras.A01());
        return AnonymousClass3Y3.A00(fragment.getContext());
    }

    /* access modifiers changed from: public */
    AnonymousClass2AT(String str, int i) {
        this.A01 = str;
        this.A00 = r1;
    }
}
