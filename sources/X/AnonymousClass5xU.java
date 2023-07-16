package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.KtLambdaShape169S0100000_I2_2;
import kotlin.jvm.internal.KtLambdaShape28S0200000_I2_12;
import kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56;

/* renamed from: X.5xU  reason: invalid class name */
public final class AnonymousClass5xU extends C34640IcN implements C21735BzM {
    public static final String __redex_internal_original_name = "GroupProfileAdminMenuFragment";
    public String A00;
    public boolean A01;
    public final C04530Oa A02 = AnonymousClass3W9.A00(this);
    public final C04530Oa A03;

    public final String getModuleName() {
        return "group_profile_admin_sheet";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final boolean isScrolledToTop() {
        return this.A01;
    }

    public AnonymousClass5xU() {
        KtLambdaShape76S0100000_I2_56 ktLambdaShape76S0100000_I2_56 = new KtLambdaShape76S0100000_I2_56(this, 32);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape76S0100000_I2_56(new KtLambdaShape76S0100000_I2_56(this, 29), 30));
        this.A03 = C18220wO.A0M(new KtLambdaShape76S0100000_I2_56(A012, 31), ktLambdaShape76S0100000_I2_56, new KtLambdaShape28S0200000_I2_12(25, (Object) null, (Object) A012), C18210wN.A0l(C883557s.class));
        this.A01 = true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(898624818);
        super.onCreate(bundle);
        String string = requireArguments().getString("ARG_GROUP_PROFILE_ID");
        if (string != null) {
            this.A00 = string;
            C14030oh.A09(-712695426, A022);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A09(2130072748, A022);
        throw A0b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(911897940);
        ComposeView A0L = C18200wM.A0L(this, new KtLambdaShape169S0100000_I2_2(this, 10), 1717252892);
        C14030oh.A09(661701541, A022);
        return A0L;
    }
}
