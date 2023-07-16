package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.service.session.UserSession;

/* renamed from: X.1wT  reason: invalid class name */
public final class AnonymousClass1wT extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "ReelSettingsFragment";
    public AnonymousClass4AX A00;
    public UserSession A01;

    public final void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, this.A00.BH6());
    }

    public final String getModuleName() {
        return this.A00.getModuleName();
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1683855515);
        super.onCreate(bundle);
        this.A01 = C18180wK.A0V(this.mArguments);
        AnonymousClass228 r7 = (AnonymousClass228) requireArguments().getSerializable("ReelSettingsFragment.ARGUMENT_REEL_SETTINGS_MODE");
        if (r7 == null) {
            r7 = AnonymousClass228.ALL_SETTINGS;
        }
        AnonymousClass4AX r3 = new AnonymousClass4AX(requireContext(), AnonymousClass0wJ.A0B(this), requireActivity(), r7, this.A01, this);
        this.A00 = r3;
        r3.A02 = new AnonymousClass4AV(this);
        C14030oh.A09(603933138, A02);
    }

    public final void onDestroy() {
        int A02 = C14030oh.A02(-2082006803);
        super.onDestroy();
        this.A00.onDestroy();
        C14030oh.A09(-797549003, A02);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        setItems(this.A00.A0I);
    }
}
