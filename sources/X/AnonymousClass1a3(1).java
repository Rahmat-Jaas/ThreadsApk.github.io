package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxDelegateShape749S0100000_1_I2;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape6S0101000_I2_3;
import kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4;
import kotlin.jvm.internal.KtLambdaShape39S0100000_I2_19;

/* renamed from: X.1a3  reason: invalid class name */
public final class AnonymousClass1a3 extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "BrandedContentAdsFragment";
    public boolean A00;
    public final C04530Oa A01 = C18190wL.A0w(this, 13);
    public final C04530Oa A02;

    public final void onViewCreated(View view, Bundle bundle) {
        M5J m5j;
        AnonymousClass066 viewLifecycleOwner;
        int i;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C18489AgL A0Y = C18220wO.A0Y(this);
        A0Y.A01(new C158609Xi((AnonymousClass9Pd) null, new IDxDelegateShape749S0100000_1_I2(this, 1)));
        C04530Oa r4 = this.A01;
        A0Y.A01(new C40199LXy(requireContext(), requireActivity(), this, AnonymousClass0wJ.A0X(r4)));
        A0Y.A01(new FQK(requireContext(), requireActivity(), this, AnonymousClass0wJ.A0X(r4)));
        C150388wA A0Z = C18220wO.A0Z(A0Y, new AnonymousClass9VR());
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0J(view, R.id.recycler_view);
        recyclerView.setAdapter(A0Z);
        requireContext();
        C18200wM.A1H(recyclerView, 1);
        boolean z = this.A00;
        LAE lae = (LAE) this.A02.getValue();
        if (z) {
            m5j = lae.A02;
            viewLifecycleOwner = getViewLifecycleOwner();
            i = 3;
        } else {
            m5j = lae.A00;
            viewLifecycleOwner = getViewLifecycleOwner();
            i = 4;
        }
        C18190wL.A1C(viewLifecycleOwner, m5j, A0Z, i);
    }

    public static final void A00(AnonymousClass1a3 r4) {
        int i;
        boolean z = r4.A00;
        C62793ak A0N = C18200wM.A0N(r4.A02);
        C83224qz A002 = AnonymousClass3J5.A00(A0N);
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape6S0101000_I2_3(A0N, (C146958n9) null, i), A002, 3);
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        if (r3 != null) {
            int i = 2131822522;
            if (this.A00) {
                i = 2131822600;
            }
            AnonymousClass4u2.A07(r3, i);
        }
    }

    public final String getModuleName() {
        if (this.A00) {
            return "bc_inactive_ads";
        }
        return "bc_active_ads";
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public AnonymousClass1a3() {
        KtLambdaShape39S0100000_I2_19 ktLambdaShape39S0100000_I2_19 = new KtLambdaShape39S0100000_I2_19(this, 14);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape39S0100000_I2_19(new KtLambdaShape39S0100000_I2_19(this, 10), 11));
        this.A02 = C18220wO.A0M(new KtLambdaShape39S0100000_I2_19(A012, 12), ktLambdaShape39S0100000_I2_19, new KtLambdaShape20S0200000_I2_4(45, (Object) null, (Object) A012), C18210wN.A0l(LAE.class));
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass0A2 A0M;
        int i;
        int A022 = C14030oh.A02(67236455);
        super.onCreate(bundle);
        String A0k = C18190wL.A0k(this);
        if (A0k != null) {
            this.A00 = A0k.equals("bca_creator_setting_inactive_ads");
            A00(this);
            boolean z = this.A00;
            C13330nS A012 = C13330nS.A01(this, AnonymousClass0wJ.A0U(this.A01));
            if (z) {
                A0M = AnonymousClass0wJ.A0M(A012, "instagram_bc_inactive_ads_entry");
                i = 1709;
            } else {
                A0M = AnonymousClass0wJ.A0M(A012, "instagram_bc_active_ads_entry");
                i = 1692;
            }
            C18240wQ.A16(C18180wK.A0I(A0M, i), A0k);
            C14030oh.A09(1489952309, A022);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A09(1012771217, A022);
        throw A0b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-2131121627);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview, viewGroup, false);
        C14030oh.A09(1189059186, A022);
        return inflate;
    }
}
