package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.barcelona.R;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape168S0100000_I2_1;

/* renamed from: X.1bP  reason: invalid class name */
public final class AnonymousClass1bP extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "BrandedContentWelcomeComposeFragment";
    public boolean A00;
    public final List A01 = C06750aI.A17(AnonymousClass0wJ.A10(Integer.valueOf(R.drawable.instagram_settings_pano_outline_24), 2131838052), AnonymousClass0wJ.A10(Integer.valueOf(R.drawable.instagram_tag_down_pano_outline_24), 2131838053), AnonymousClass0wJ.A10(Integer.valueOf(R.drawable.instagram_users_pano_outline_24), 2131838054), AnonymousClass0wJ.A10(Integer.valueOf(R.drawable.instagram_compose_pano_outline_24), 2131838055));
    public final C04530Oa A02 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        r2.Cqb(2131822638);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final boolean onBackPressed() {
        return true;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 16 && !getParentFragmentManager().A15()) {
            C18190wL.A19(this);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1460062748);
        ComposeView A0L = C18200wM.A0L(this, new KtLambdaShape168S0100000_I2_1(this, 25), -1203048828);
        C14030oh.A09(26603529, A022);
        return A0L;
    }
}
