package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxFunctionShape230S0200000_4_I2;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.1oN  reason: invalid class name */
public final class AnonymousClass1oN extends AnonymousClass5x3 {
    public static final String __redex_internal_original_name = "EncryptedBackupsGDriveRestoreFlowFragment";
    public IgdsBottomButtonLayout A00;

    public final void A03() {
    }

    public final void A04(GoogleSignInAccount googleSignInAccount) {
        C04220Ms.A0B(googleSignInAccount, 0);
        C8C c8c = (C8C) this.A01.getValue();
        c8c.A07.D7t(C22871Chj.A00);
        c8c.A01.A02(AnonymousClass47P.A00, c8c.A00.A0E(new IDxFunctionShape230S0200000_4_I2(googleSignInAccount, c8c, 2)));
    }

    public final String getModuleName() {
        return "encrypted_backups_gdrive_restore_flow";
    }

    public final void A05(boolean z) {
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionIsLoading(z);
        }
    }

    public final void A02() {
        A01();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-282853501);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_eb_gdrive_restore_flow_layout, viewGroup, false);
        IgdsBottomButtonLayout A0W = C18230wP.A0W(inflate, R.id.bottom_buttons);
        this.A00 = A0W;
        if (A0W != null) {
            A0W.setPrimaryActionOnClickListener(C18190wL.A0H(this, 336));
        }
        C14030oh.A09(303039783, A02);
        return inflate;
    }

    public final void onDestroyView() {
        int A02 = C14030oh.A02(1854039167);
        this.A00 = null;
        super.onDestroyView();
        C14030oh.A09(-323504165, A02);
    }
}
