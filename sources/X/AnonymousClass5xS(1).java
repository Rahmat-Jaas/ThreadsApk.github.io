package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.KtLambdaShape169S0100000_I2_2;
import kotlin.jvm.internal.KtLambdaShape28S0200000_I2_12;
import kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56;
import kotlin.jvm.internal.KtLambdaShape77S0100000_I2_57;

/* renamed from: X.5xS  reason: invalid class name */
public final class AnonymousClass5xS extends C34640IcN implements C21735BzM {
    public static final String __redex_internal_original_name = "GroupProfileCustomizeBottomsheetFragment";
    public boolean A00;
    public final C04530Oa A01 = AnonymousClass3W9.A00(this);
    public final C04530Oa A02;

    public final String getModuleName() {
        return "group_profile_customize_bottomsheet";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public final boolean isScrolledToTop() {
        return this.A00;
    }

    public AnonymousClass5xS() {
        KtLambdaShape77S0100000_I2_57 A12 = C86164wN.A12(this, 1);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape76S0100000_I2_56(new KtLambdaShape76S0100000_I2_56(this, 48), 49));
        this.A02 = C18220wO.A0M(C86164wN.A12(A012, 0), A12, new KtLambdaShape28S0200000_I2_12(26, (Object) null, (Object) A012), C18210wN.A0l(AnonymousClass57T.class));
        this.A00 = true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-524255043);
        ComposeView A0L = C18200wM.A0L(this, new KtLambdaShape169S0100000_I2_2(this, 11), -1117822020);
        C14030oh.A09(1222527611, A022);
        return A0L;
    }
}
