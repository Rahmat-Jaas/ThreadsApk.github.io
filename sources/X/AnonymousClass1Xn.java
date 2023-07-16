package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape143S0100000_I2_123;

/* renamed from: X.1Xn  reason: invalid class name */
public final class AnonymousClass1Xn extends C34640IcN {
    public static final String __redex_internal_original_name = "UserPayEstimatedEarningsDefinitionBottomSheetFragment";
    public final C04530Oa A00 = C62373Zc.A03(new KtLambdaShape143S0100000_I2_123(this, 1));

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(107574790);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.iglive_user_pay_estimated_earnings_definition_bottom_sheet, viewGroup, false);
        C14030oh.A09(254058123, A02);
        return inflate;
    }
}
