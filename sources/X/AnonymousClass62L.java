package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2;
import kotlin.jvm.internal.KtLambdaShape27S0100000_I2_7;

/* renamed from: X.62L  reason: invalid class name */
public final class AnonymousClass62L extends AnonymousClass5xM {
    public static final String __redex_internal_original_name = "AppreciationCreatorSettingsFragment";
    public Dialog A00;
    public final C04530Oa A01 = AnonymousClass0OY.A02(new KtLambdaShape27S0100000_I2_7(this, 43));
    public final C04530Oa A02;

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131824344);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass061 r5 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape8S0301000_I2((Object) this, (Object) viewLifecycleOwner, (Object) r5, (C146958n9) null, 48), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public AnonymousClass62L() {
        KtLambdaShape27S0100000_I2_7 ktLambdaShape27S0100000_I2_7 = new KtLambdaShape27S0100000_I2_7(this, 47);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape27S0100000_I2_7(new KtLambdaShape27S0100000_I2_7(this, 44), 45));
        this.A02 = C18220wO.A0M(new KtLambdaShape27S0100000_I2_7(A012, 46), ktLambdaShape27S0100000_I2_7, C86154wM.A11((Object) null, A012, 45), C18210wN.A0l(AnonymousClass58H.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1766948337);
        super.onCreate(bundle);
        if (!A0E()) {
            A0D(false);
            ((AnonymousClass58H) this.A02.getValue()).A05();
        }
        C14030oh.A09(553755506, A022);
    }
}
