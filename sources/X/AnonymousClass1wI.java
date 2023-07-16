package X;

import android.os.Bundle;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.1wI  reason: invalid class name */
public final class AnonymousClass1wI extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "InternalOptionsFragment";
    public UserSession A00;

    public final String getModuleName() {
        return "settings_internal_options";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C23411dm.A04(this, r2, 2131829147);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1696388975);
        super.onCreate(bundle);
        this.A00 = C18180wK.A0V(this.mArguments);
        C14030oh.A09(-1368965558, A02);
    }

    public final void onResume() {
        int A02 = C14030oh.A02(-2039398589);
        super.onResume();
        UserSession userSession = this.A00;
        C57533Bk r6 = new C57533Bk(getContext(), this.mFragmentManager, getActivity(), userSession);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (C63803iN.A05(AnonymousClass0TJ.A05, this.A00, 36313957077616387L).booleanValue()) {
            AnonymousClass4MA.A04(r6, A0v, 171, 2131838096);
        }
        if (C19573AyZ.A02(this.A00)) {
            AnonymousClass4MA.A04(r6, A0v, 170, 2131836657);
        }
        setItems(A0v);
        C14030oh.A09(833242000, A02);
    }
}
