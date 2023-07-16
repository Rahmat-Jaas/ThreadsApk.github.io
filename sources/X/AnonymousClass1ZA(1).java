package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.1ZA  reason: invalid class name */
public final class AnonymousClass1ZA extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "EncryptedBackupsPinSetupNuxFragment";
    public IgdsBottomButtonLayout A00;
    public final C04530Oa A01 = C80644m9.A00(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsBottomButtonLayout A0W = C18230wP.A0W(view, R.id.bottom_buttons);
        this.A00 = A0W;
        if (A0W != null) {
            A0W.setSecondaryActionOnClickListener(C18190wL.A0H(this, 343));
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-761490380);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.enable_eb_setup_pin_nux_layout, viewGroup, false);
        ((IgdsBottomButtonLayout) AnonymousClass0wJ.A0J(inflate, R.id.bottom_buttons)).setPrimaryActionOnClickListener(C18190wL.A0H(this, 342));
        C14030oh.A09(696781232, A02);
        return inflate;
    }

    public final void configureActionBar(AnonymousClass4u2 r1) {
        AnonymousClass4u2.A05(r1);
    }
}
