package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1Z6  reason: invalid class name */
public final class AnonymousClass1Z6 extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "BcPartnershipMessageRequestInformationFragment";

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131822243);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0wJ.A0L(view, R.id.opt_out_instructions).setText(2131824618);
        AnonymousClass0wJ.A0L(view, R.id.message_request_information).setText(2131824619);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return C18180wK.A0W(this, AnonymousClass0RA.A0C);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-864289269);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.bc_partnership_message_request_information, viewGroup, false);
        C14030oh.A09(-1756531292, A02);
        return inflate;
    }
}
