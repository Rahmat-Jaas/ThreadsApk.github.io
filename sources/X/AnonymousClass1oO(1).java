package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.1oO  reason: invalid class name */
public final class AnonymousClass1oO extends AnonymousClass5x3 {
    public static final String __redex_internal_original_name = "EncryptedBackupsGDriveOnboardingFlowSetupFragment";
    public IgdsBottomButtonLayout A00;

    public final void A02() {
    }

    public final void A04(GoogleSignInAccount googleSignInAccount) {
        C04220Ms.A0B(googleSignInAccount, 0);
        ((C8C) this.A01.getValue()).A09(googleSignInAccount);
    }

    public final String getModuleName() {
        return "encrypted_backups_gdrive_onboarding_flow_setup";
    }

    public final void A05(boolean z) {
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionIsLoading(z);
        }
    }

    public final void A03() {
        A01();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        int A02 = C14030oh.A02(-1969107885);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_eb_gdrive_onboarding_flow_settings_layout, viewGroup, false);
        ((IgdsHeadline) AnonymousClass0wJ.A0J(inflate, R.id.headline)).A09(C18190wL.A0H(this, 333), 2131829574);
        IgdsBottomButtonLayout A0W = C18230wP.A0W(inflate, R.id.bottom_buttons);
        this.A00 = A0W;
        if (A0W != null) {
            A0W.setPrimaryActionOnClickListener(C18190wL.A0H(this, 334));
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A00;
        if (igdsBottomButtonLayout2 != null) {
            igdsBottomButtonLayout2.setSecondaryActionOnClickListener(C18190wL.A0H(this, 335));
        }
        Bundle bundle2 = this.mArguments;
        if (!(bundle2 == null || !bundle2.getBoolean("BUNDLE_HIDE_MORE_OPTIONS", false) || (igdsBottomButtonLayout = this.A00) == null)) {
            igdsBottomButtonLayout.setSecondaryActionText((CharSequence) null);
        }
        C14030oh.A09(1223222401, A02);
        return inflate;
    }

    public final void onDestroyView() {
        int A02 = C14030oh.A02(1045257161);
        this.A00 = null;
        super.onDestroyView();
        C14030oh.A09(-1581566460, A02);
    }

    public final void onResume() {
        View view;
        int A02 = C14030oh.A02(-1498969233);
        super.onResume();
        if (!AnonymousClass2MX.A00(AnonymousClass0wJ.A0X(this.A00)).A05() && (view = this.mView) != null) {
            view.post(new C72584Ox(this));
        }
        C14030oh.A09(453534386, A02);
    }
}
