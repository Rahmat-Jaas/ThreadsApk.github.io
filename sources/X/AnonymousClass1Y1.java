package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1Y1  reason: invalid class name */
public final class AnonymousClass1Y1 extends C34640IcN {
    public static final String __redex_internal_original_name = "ReelFundraiserAmountRaisedDisclaimerBottomsheetFragment";
    public C10300i6 A00;

    public final String getModuleName() {
        return "reel_fundraiser_amount_raised_disclaimer_bottomsheet_fragment";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1833373805);
        super.onCreate(bundle);
        this.A00 = C18180wK.A0V(this.mArguments);
        C14030oh.A09(670085060, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-194522572);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.reel_dashboard_fundraiser_results_amount_raised_disclaimer);
        C14030oh.A09(837951213, A02);
        return A0H;
    }
}
