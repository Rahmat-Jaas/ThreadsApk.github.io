package X;

import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.1xd  reason: invalid class name and case insensitive filesystem */
public final class C29251xd extends C23411dm implements C21839C2o, C82034oy {
    public static final String __redex_internal_original_name = "NotificationOptionsRedesignFragment";
    public UserSession A00;
    public AnonymousClass3VR A01;
    public boolean A02;
    public final AnonymousClass366 A03 = new AnonymousClass366(this);

    public final String getModuleName() {
        return "notifications";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C23411dm.A04(this, r2, 2131831918);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1300027173);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = C18180wK.A0V(requireArguments);
        this.A02 = Boolean.TRUE.equals(C18210wN.A0Q(requireArguments, "only_show_push"));
        this.A01 = new AnonymousClass3VR(this, this.A00);
        C14030oh.A09(-1498048344, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-927070838);
        super.onResume();
        new C58773Hd(this, this.A00, this.A01, this.A02).A00(this.A03);
        C14030oh.A09(-563196915, A022);
    }
}
