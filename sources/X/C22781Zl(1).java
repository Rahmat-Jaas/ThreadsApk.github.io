package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.redex.IDxEListenerShape223S0100000_1_I2;
import com.facebook.redex.IDxHDelegateShape496S0100000_1_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0301000_I2_3;
import kotlin.jvm.internal.KtLambdaShape168S0100000_I2_1;
import kotlin.jvm.internal.KtLambdaShape67S0100000_I2_47;

/* renamed from: X.1Zl  reason: invalid class name and case insensitive filesystem */
public final class C22781Zl extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "EventCreationFragment";
    public C82394pY A00;
    public C84584tU A01;
    public final C04530Oa A02 = C80644m9.A00(this);
    public final C04530Oa A03 = C18220wO.A0M(new KtLambdaShape67S0100000_I2_47(this, 33), new KtLambdaShape67S0100000_I2_47(this, 34), C18250wR.A0d(this, (Object) null, 28), C18210wN.A0l(AnonymousClass10I.class));
    public final IDxHDelegateShape496S0100000_1_I2 A04 = new IDxHDelegateShape496S0100000_1_I2(this, 3);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131826877);
        AnonymousClass4u2.A06(r2);
    }

    public final String getModuleName() {
        return "event_creation_fragment";
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C04220Ms.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C84584tU r0 = this.A01;
        if (r0 == null) {
            C04220Ms.A0E("captureFlowHelper");
            throw null;
        } else {
            r0.onSaveInstanceState(bundle);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IDxEListenerShape223S0100000_1_I2 A0P = C18220wO.A0P(this, 31);
        C04530Oa r4 = this.A02;
        AnonymousClass3LY.A00(AnonymousClass0wJ.A0U(r4)).A01(A0P, E65.class);
        this.A00 = A0P;
        C84584tU A022 = C25529DnJ.A02.A02(requireContext(), this.A04, AnonymousClass0wJ.A0X(r4));
        this.A01 = A022;
        A022.CH2(bundle);
        AnonymousClass061 r42 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape11S0301000_I2_3((Object) viewLifecycleOwner, (Object) r42, (Object) this, (C146958n9) null, 37), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C84584tU r0 = this.A01;
        if (r0 == null) {
            C04220Ms.A0E("captureFlowHelper");
            throw null;
        } else {
            r0.onActivityResult(i, i2, intent);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(599841318);
        ComposeView A0L = C18200wM.A0L(this, new KtLambdaShape168S0100000_I2_1(this, 43), -1442904821);
        C14030oh.A09(-1608406734, A022);
        return A0L;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-191264254);
        super.onDestroyView();
        C82394pY r2 = this.A00;
        if (r2 == null) {
            C04220Ms.A0E("venueSelectedListener");
            throw null;
        }
        AnonymousClass3LY.A00(AnonymousClass0wJ.A0U(this.A02)).A02(r2, E65.class);
        C14030oh.A09(-1853576869, A022);
    }
}
