package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxDelegateShape749S0100000_1_I2;
import com.facebook.redex.IDxObserverShape98S0200000_1_I2;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2;
import kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4;
import kotlin.jvm.internal.KtLambdaShape39S0100000_I2_19;

/* renamed from: X.1a4  reason: invalid class name */
public final class AnonymousClass1a4 extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "BrandedContentAdsByPartnerFragment";
    public AnonymousClass4u2 A00;
    public final C04530Oa A01 = C18190wL.A0w(this, 1);
    public final C04530Oa A02 = C18190wL.A0w(this, 2);
    public final C04530Oa A03 = C18190wL.A0w(this, 6);
    public final C04530Oa A04;

    public final void onViewCreated(View view, Bundle bundle) {
        M5J m5j;
        AnonymousClass066 viewLifecycleOwner;
        IDxObserverShape98S0200000_1_I2 iDxObserverShape98S0200000_1_I2;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C18489AgL A0Y = C18220wO.A0Y(this);
        A0Y.A01(new C158609Xi((AnonymousClass9Pd) null, new IDxDelegateShape749S0100000_1_I2(this, 0)));
        A0Y.A01(new AnonymousClass9VR());
        C150388wA A0Z = C18220wO.A0Z(A0Y, new C40198LXx(requireContext(), requireActivity(), this, AnonymousClass0wJ.A0X(this.A03)));
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0J(view, R.id.recycler_view);
        recyclerView.setAdapter(A0Z);
        requireContext();
        C18200wM.A1H(recyclerView, 1);
        LAE lae = (LAE) this.A04.getValue();
        if (AnonymousClass0wJ.A1X(this.A02.getValue())) {
            m5j = lae.A03;
            viewLifecycleOwner = getViewLifecycleOwner();
            iDxObserverShape98S0200000_1_I2 = new IDxObserverShape98S0200000_1_I2(0, A0Z, this);
        } else {
            m5j = lae.A01;
            viewLifecycleOwner = getViewLifecycleOwner();
            iDxObserverShape98S0200000_1_I2 = new IDxObserverShape98S0200000_1_I2(1, A0Z, this);
        }
        m5j.A0C(viewLifecycleOwner, iDxObserverShape98S0200000_1_I2);
    }

    public static final void A00(AnonymousClass1a4 r6) {
        int i;
        boolean A1X = AnonymousClass0wJ.A1X(r6.A02.getValue());
        C62793ak A0N = C18200wM.A0N(r6.A04);
        String A0q = C18200wM.A0q(r6.A01);
        C04220Ms.A0B(A0q, 0);
        C83224qz A002 = AnonymousClass3J5.A00(A0N);
        if (A1X) {
            i = 21;
        } else {
            i = 20;
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S1101000_I2(A0N, A0q, (C146958n9) null, i), A002, 3);
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        this.A00 = r2;
        if (r2 != null) {
            r2.CtT(true);
        }
    }

    public final String getModuleName() {
        if (AnonymousClass0wJ.A1X(this.A02.getValue())) {
            return "bc_brand_partner_inactive_ads";
        }
        return "bc_brand_partner_active_ads";
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public AnonymousClass1a4() {
        KtLambdaShape39S0100000_I2_19 ktLambdaShape39S0100000_I2_19 = new KtLambdaShape39S0100000_I2_19(this, 7);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape39S0100000_I2_19(new KtLambdaShape39S0100000_I2_19(this, 3), 4));
        this.A04 = C18220wO.A0M(new KtLambdaShape39S0100000_I2_19(A012, 5), ktLambdaShape39S0100000_I2_19, new KtLambdaShape20S0200000_I2_4(44, (Object) null, (Object) A012), C18210wN.A0l(LAE.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1417007218);
        super.onCreate(bundle);
        A00(this);
        C14030oh.A09(-1572218193, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-895033758);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview, viewGroup, false);
        C14030oh.A09(1410032434, A022);
        return inflate;
    }
}
