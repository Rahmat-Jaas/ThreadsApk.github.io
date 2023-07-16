package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;
import kotlin.jvm.internal.KtLambdaShape38S0100000_I2_18;

/* renamed from: X.1Y3  reason: invalid class name */
public final class AnonymousClass1Y3 extends C34640IcN {
    public static final String __redex_internal_original_name = "BrandedContentAdApproveBrandPartnerFragment";
    public final C04530Oa A00 = AnonymousClass0OY.A02(new KtLambdaShape38S0100000_I2_18(this, 47));
    public final C04530Oa A01 = AnonymousClass0OY.A02(new KtLambdaShape38S0100000_I2_18(this, 48));

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgImageView A0M = C18250wR.A0M(view, R.id.avatar);
        C04530Oa r4 = this.A00;
        C18220wO.A1L(this, A0M, (User) r4.getValue());
        AnonymousClass0wJ.A0L(view, R.id.approve_brand).setText(AnonymousClass0wJ.A0l(requireContext(), ((User) r4.getValue()).BK7(), 2131822524));
        TextView A0L = AnonymousClass0wJ.A0L(view, R.id.description_brand_text);
        boolean A0E = C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass0wJ.A0U(this.A01), 36323728128221218L);
        Context requireContext = requireContext();
        int i = 2131822549;
        if (A0E) {
            i = 2131822550;
        }
        C18200wM.A15(requireContext, A0L, i);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-37276935);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.bca_approve_brand_partner, viewGroup, false);
        C14030oh.A09(1979489253, A02);
        return inflate;
    }
}
