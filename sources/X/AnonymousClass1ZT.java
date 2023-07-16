package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0301000_I2_4;
import kotlin.jvm.internal.KtLambdaShape169S0100000_I2_2;
import kotlin.jvm.internal.KtLambdaShape32S0200000_I2_16;
import kotlin.jvm.internal.KtLambdaShape91S0100000_I2_71;

/* renamed from: X.1ZT  reason: invalid class name */
public final class AnonymousClass1ZT extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "PublisherControlBlockedCategoriesComposeFragment";
    public final C04530Oa A00;
    public final C04530Oa A01 = C80644m9.A00(this);
    public final C04530Oa A02;

    public final String getModuleName() {
        return "publisher_control_blocked_categories_compose_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass061 r4 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape12S0301000_I2_4(viewLifecycleOwner, r4, this, (C146958n9) null, 42), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        if (r3 != null) {
            AnonymousClass4u2.A02(this, r3, 2131828584);
            r3.CtU(C18210wN.A0H(this, 41), true);
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public AnonymousClass1ZT() {
        KtLambdaShape91S0100000_I2_71 ktLambdaShape91S0100000_I2_71 = new KtLambdaShape91S0100000_I2_71(this, 38);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape91S0100000_I2_71(new KtLambdaShape91S0100000_I2_71(this, 35), 36));
        this.A02 = C18220wO.A0M(new KtLambdaShape91S0100000_I2_71(A012, 37), ktLambdaShape91S0100000_I2_71, new KtLambdaShape32S0200000_I2_16(2, (Object) null, A012), C18210wN.A0l(AnonymousClass10M.class));
        this.A00 = C62373Zc.A03(new KtLambdaShape91S0100000_I2_71(this, 34));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(2061257748);
        super.onCreate(bundle);
        C25683Dq7 dq7 = ((AnonymousClass9K7) this.A00.getValue()).A01;
        C04220Ms.A05(dq7);
        C25683Dq7.A00(dq7);
        C14030oh.A09(1504840963, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-367181447);
        ComposeView A0L = C18200wM.A0L(this, new KtLambdaShape169S0100000_I2_2(this, 27), 1315306653);
        C14030oh.A09(-1464080572, A022);
        return A0L;
    }
}
