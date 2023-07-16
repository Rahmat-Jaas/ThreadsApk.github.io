package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S2101000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S1101000_I2_1;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0401000_I2_1;
import kotlin.jvm.internal.KtLambdaShape67S0100000_I2_47;

/* renamed from: X.1Zk  reason: invalid class name and case insensitive filesystem */
public final class C22771Zk extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "EventDetailsFragment";
    public boolean A00;
    public AnonymousClass4u2 A01;
    public final View.OnClickListener A02 = C18190wL.A0H(this, HttpStatus.SC_NOT_FOUND);
    public final View.OnClickListener A03 = C18190wL.A0H(this, HttpStatus.SC_NOT_ACCEPTABLE);
    public final View.OnClickListener A04 = C18190wL.A0H(this, HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED);
    public final View.OnClickListener A05 = C18190wL.A0H(this, HttpStatus.SC_REQUEST_TIMEOUT);
    public final String A06 = "invited";
    public final C04530Oa A07 = C80644m9.A00(this);
    public final C04530Oa A08 = C18220wO.A0M(new KtLambdaShape67S0100000_I2_47(this, 35), new KtLambdaShape67S0100000_I2_47(this, 36), C18250wR.A0d(this, (Object) null, 29), C18210wN.A0l(AnonymousClass10G.class));

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        this.A01 = r2;
        r2.CtT(true);
    }

    public final String getModuleName() {
        return "event_details_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass061 r2 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        LifecycleCoroutineScopeImpl A002 = AnonymousClass067.A00(viewLifecycleOwner);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape5S0401000_I2_1(r2, this, view, viewLifecycleOwner, (C146958n9) null, 18), A002, 3);
        if (requireArguments().getBoolean("argument_auto_launch_invite")) {
            String A0j = C18220wO.A0j(this);
            C18240wQ.A1I(A0j);
            AnonymousClass10G r8 = (AnonymousClass10G) this.A08.getValue();
            String str = this.A06;
            AnonymousClass0wJ.A1N(A0j, str);
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S2101000_I2(r8, A0j, str, (C146958n9) null, 5), AnonymousClass3J5.A00(r8), 3);
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A07);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1800767703);
        super.onCreate(bundle);
        C62793ak A0N = C18200wM.A0N(this.A08);
        String A0j = C18220wO.A0j(this);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape2S1101000_I2_1(A0N, A0j, (C146958n9) null, 3), AnonymousClass3J5.A00(A0N), 3);
        C14030oh.A09(474203680, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-555946631);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.event_details_fragment, viewGroup, false);
        C14030oh.A09(-98815072, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(849229148);
        super.onDestroyView();
        C14030oh.A09(1856079756, A022);
    }
}
