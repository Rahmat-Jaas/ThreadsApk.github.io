package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.KtLambdaShape100S0100000_I2_80;
import kotlin.jvm.internal.KtLambdaShape169S0100000_I2_2;

/* renamed from: X.1bC  reason: invalid class name */
public final class AnonymousClass1bC extends C34640IcN implements C82424pb {
    public static final String __redex_internal_original_name = "LockoutFragment";
    public boolean A00 = true;
    public final C04530Oa A01 = C62373Zc.A03(new KtLambdaShape100S0100000_I2_80(this, 0));
    public final C04530Oa A02 = C80644m9.A00(this);

    public final String getModuleName() {
        return "dogfooding_lockout";
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final boolean onBackPressed() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1917041907);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A00 = bundle2.getBoolean("com.instagram.release.lockout.disable_back_press", true);
        }
        ((AnonymousClass3EY) this.A01.getValue()).A00(AnonymousClass294.PRESENT_PROD_LOCKOUT_SCREEN);
        C14030oh.A09(-148081326, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1549766711);
        ComposeView A0L = C18200wM.A0L(this, new KtLambdaShape169S0100000_I2_2(this, 33), 409145347);
        C14030oh.A09(-173750079, A022);
        return A0L;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(604424277);
        super.onDestroyView();
        getRootActivity();
        C14030oh.A09(-154165670, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(1408102525);
        super.onStart();
        getRootActivity();
        C14030oh.A09(-500217301, A022);
    }
}
