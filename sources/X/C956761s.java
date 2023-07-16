package X;

import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxObjectShape432S0100000_2_I2;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape158S0100000_I2_13;

/* renamed from: X.61s  reason: invalid class name and case insensitive filesystem */
public final class C956761s extends AnonymousClass5xI implements C82034oy {
    public static final String __redex_internal_original_name = "IGBSCContainerFragment";
    public C114986uF A00;
    public final AnonymousClass0YY A01 = new KtLambdaShape158S0100000_I2_13(this, 43);

    public final void configureActionBar(AnonymousClass4u2 r4) {
        C04220Ms.A0B(r4, 0);
        C114986uF r2 = this.A00;
        r4.CtO(AnonymousClass0wJ.A1W(r2));
        r4.CtT(true);
        if (r2 != null && getContext() != null) {
            r4.setTitle(String.valueOf(r2.A00.BEM(requireContext())));
        }
    }

    public final void onResume() {
        int A02 = C14030oh.A02(58535589);
        super.onResume();
        Fragment A0L = getChildFragmentManager().A0L(R.id.container_fragment);
        if (A0L instanceof C143558gw) {
            M5J BH5 = ((C143558gw) A0L).BH5();
            AnonymousClass0YY r2 = this.A01;
            BH5.A0F(new IDxObjectShape432S0100000_2_I2(1, r2));
            BH5.A0C(this, new IDxObjectShape432S0100000_2_I2(1, r2));
        }
        C14030oh.A09(-806954593, A02);
    }
}
