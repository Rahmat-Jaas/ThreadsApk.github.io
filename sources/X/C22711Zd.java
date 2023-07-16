package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxTListenerShape545S0100000_1_I2;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0401000_I2_1;
import kotlin.jvm.internal.KtLambdaShape115S0100000_I2_95;
import kotlin.jvm.internal.KtLambdaShape34S0200000_I2_18;

/* renamed from: X.1Zd  reason: invalid class name and case insensitive filesystem */
public final class C22711Zd extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "AppLanguageSettingsFragment";
    public final C11630kW A00 = AnonymousClass44G.A00;
    public final C04530Oa A01 = C80644m9.A00(this);
    public final C04530Oa A02;

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131821351);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C63393hP.A02(view, this).A06 = new IDxTListenerShape545S0100000_1_I2(this, 1);
        C196310v r3 = new C196310v(new C71744Ka(this));
        r3.setHasStableIds(true);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.language_locale_list);
        recyclerView.setAdapter(r3);
        requireContext();
        C18200wM.A1H(recyclerView, 1);
        recyclerView.A0U = true;
        AnonymousClass061 r6 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape5S0401000_I2_1(r3, this, viewLifecycleOwner, r6, (C146958n9) null, 41), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public final String getModuleName() {
        return C18230wP.A0n(this.A00);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public C22711Zd() {
        KtLambdaShape115S0100000_I2_95 ktLambdaShape115S0100000_I2_95 = new KtLambdaShape115S0100000_I2_95(this, 49);
        C04530Oa A0l = C18240wQ.A0l(AnonymousClass006.A0C, new KtLambdaShape115S0100000_I2_95(this, 46), 47);
        this.A02 = C18220wO.A0M(new KtLambdaShape115S0100000_I2_95(A0l, 48), ktLambdaShape115S0100000_I2_95, new KtLambdaShape34S0200000_I2_18(0, (Object) null, A0l), C18210wN.A0l(C19250zY.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(220689989);
        requireArguments();
        super.onCreate(bundle);
        C14030oh.A09(-91974025, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(46268170);
        View A0H = AnonymousClass0wJ.A0H(C18230wP.A0F(this), viewGroup, R.layout.language_locale_menu);
        C04220Ms.A06(A0H);
        C14030oh.A09(-195821257, A022);
        return A0H;
    }

    public final void onPause() {
        int A022 = C14030oh.A02(992423658);
        super.onPause();
        C09860go.A0I(requireView());
        C14030oh.A09(-1918568065, A022);
    }
}
