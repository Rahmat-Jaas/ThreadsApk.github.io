package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2;
import kotlin.jvm.internal.KtLambdaShape29S0100000_I2_9;

/* renamed from: X.5wl  reason: invalid class name and case insensitive filesystem */
public final class C94795wl extends C34640IcN {
    public static final String __redex_internal_original_name = "ArchiveReelComposeFragment";
    public final C04530Oa A00 = AnonymousClass0OY.A02(new KtLambdaShape29S0100000_I2_9(this, 9));
    public final C04530Oa A01 = AnonymousClass3W9.A00(this);
    public final C04530Oa A02;

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        UserSession A0X = AnonymousClass0wJ.A0X(this.A01);
        ((AnonymousClass58C) this.A02.getValue()).A02(C63803iN.A0E(C18180wK.A0J(A0X), A0X, 36322924969401890L), true);
    }

    public final String getModuleName() {
        int i;
        if (AnonymousClass0wJ.A1X(this.A00.getValue())) {
            i = 441;
        } else {
            i = 124;
        }
        return AnonymousClass000.A00(i);
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public C94795wl() {
        KtLambdaShape29S0100000_I2_9 ktLambdaShape29S0100000_I2_9 = new KtLambdaShape29S0100000_I2_9(this, 13);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape29S0100000_I2_9(new KtLambdaShape29S0100000_I2_9(this, 10), 11));
        this.A02 = C18220wO.A0M(new KtLambdaShape29S0100000_I2_9(A012, 12), ktLambdaShape29S0100000_I2_9, new KtLambdaShape18S0200000_I2_2(11, (Object) null, A012), C18210wN.A0l(AnonymousClass58C.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1662617455);
        ComposeView A0L = C18200wM.A0L(this, C86164wN.A0u(this, 49), -323336107);
        C14030oh.A09(-699316860, A022);
        return A0L;
    }
}
