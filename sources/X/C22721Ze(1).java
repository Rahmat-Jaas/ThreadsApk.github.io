package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxTListenerShape545S0100000_1_I2;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape22S0201000_I2_8;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0501000_I2;
import kotlin.jvm.internal.KtLambdaShape116S0100000_I2_96;
import kotlin.jvm.internal.KtLambdaShape34S0200000_I2_18;

/* renamed from: X.1Ze  reason: invalid class name and case insensitive filesystem */
public final class C22721Ze extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "ContentLanguageSettingsFragment";
    public final C04530Oa A00 = C80644m9.A00(this);
    public final C04530Oa A01;
    public final C11630kW A02 = AnonymousClass44H.A00;

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131824348);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C62793ak A0N = C18200wM.A0N(this.A01);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape22S0201000_I2_8((C146958n9) null, (Object) A0N, 19), AnonymousClass3J5.A00(A0N), 3);
        C196210u r5 = new C196210u(new AnonymousClass36B(this));
        r5.setHasStableIds(true);
        C63393hP.A02(view, this).A06 = new IDxTListenerShape545S0100000_1_I2(this, 2);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.language_locale_list);
        recyclerView.setAdapter(r5);
        requireContext();
        C18200wM.A1H(recyclerView, 1);
        recyclerView.A0U = true;
        View A0K = AnonymousClass0wJ.A0K(view, R.id.content_language_error_message);
        AnonymousClass061 r8 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape4S0501000_I2(r5, viewLifecycleOwner, this, r8, A0K, (C146958n9) null, 42), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public final String getModuleName() {
        return C18230wP.A0n(this.A02);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public C22721Ze() {
        KtLambdaShape116S0100000_I2_96 ktLambdaShape116S0100000_I2_96 = new KtLambdaShape116S0100000_I2_96(this, 3);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape116S0100000_I2_96(new KtLambdaShape116S0100000_I2_96(this, 0), 1));
        this.A01 = C18220wO.A0M(new KtLambdaShape116S0100000_I2_96(A012, 2), ktLambdaShape116S0100000_I2_96, new KtLambdaShape34S0200000_I2_18(1, (Object) null, A012), C18210wN.A0l(C19220zV.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1370411230);
        requireArguments();
        super.onCreate(bundle);
        C14030oh.A09(1567612148, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(431336243);
        View A0H = AnonymousClass0wJ.A0H(C18230wP.A0F(this), viewGroup, R.layout.language_locale_menu);
        C04220Ms.A06(A0H);
        C14030oh.A09(1739195892, A022);
        return A0H;
    }

    public final void onPause() {
        int A022 = C14030oh.A02(1674091534);
        super.onPause();
        C09860go.A0I(requireView());
        C14030oh.A09(-857516506, A022);
    }
}
