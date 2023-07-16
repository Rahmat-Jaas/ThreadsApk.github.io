package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.service.session.UserSession;

/* renamed from: X.1ZC  reason: invalid class name */
public final class AnonymousClass1ZC extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "QuickPromotionTestFragment";
    public View A00;
    public UserSession A01;

    public final void configureActionBar(AnonymousClass4u2 r2) {
        r2.CtT(true);
        AnonymousClass4u2.A02(this, r2, 2131825603);
    }

    public final String getModuleName() {
        return "qp_test_surface";
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1857399109);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A01 = C18180wK.A0V(bundle2);
            if (getContext() != null) {
                int A03 = C18190wL.A03(getContext());
                C63873iU.A0C(this, C60933Rd.A00(QuickPromotionSlot.A0c, this.A01, AnonymousClass006.A01, A03), 126);
            }
        }
        C14030oh.A09(433648046, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1844801176);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.quick_promotion_test_fragment);
        C14030oh.A09(-1925601918, A02);
        return A0H;
    }
}
