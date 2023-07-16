package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape267S0100000_1_I2;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2;
import kotlin.jvm.internal.KtLambdaShape30S0100000_I2_10;

/* renamed from: X.1Y2  reason: invalid class name */
public final class AnonymousClass1Y2 extends C34640IcN {
    public static final String __redex_internal_original_name = "ImmersiveAvatarEntrypointProfileBottomSheetFragment";
    public final C04530Oa A00 = C18220wO.A0M(new KtLambdaShape30S0100000_I2_10(this, 38), new KtLambdaShape30S0100000_I2_10(this, 37), new KtLambdaShape18S0200000_I2_2(29, (Object) null, this), C18210wN.A0l(CBS.class));
    public final C04530Oa A01 = C80644m9.A00(this);

    public final String getModuleName() {
        return "immersive_avatar_entrypoint_profile_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        CompoundButton compoundButton = (CompoundButton) AnonymousClass0wJ.A0J(view, R.id.coin_flip_switch);
        C18180wK.A0r(requireContext(), (ImageView) AnonymousClass0wJ.A0J(view, R.id.row_icon), R.drawable.instagram_eye_pano_outline_24);
        C18200wM.A17(AnonymousClass0wJ.A0B(this), (TextView) AnonymousClass0wJ.A0J(view, R.id.row_label), 2131821725);
        compoundButton.setChecked(requireArguments().getBoolean("coin_flip_enabled"));
        compoundButton.setOnCheckedChangeListener(new IDxCListenerShape267S0100000_1_I2((Object) this, 1));
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(163469071);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.avatar_immersive_home_profile_bottom_sheet_item, viewGroup, false);
        C14030oh.A09(138718520, A02);
        return inflate;
    }
}
