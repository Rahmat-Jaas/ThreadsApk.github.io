package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0301000_I2_3;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S1201000_I2_1;
import kotlin.jvm.internal.KtLambdaShape67S0100000_I2_47;

/* renamed from: X.1dH  reason: invalid class name */
public final class AnonymousClass1dH extends C34640IcN implements C21735BzM {
    public static final String __redex_internal_original_name = "DogfoodingAssistantBottomSheetFragment";
    public IgLinearLayout A00;
    public AnonymousClass1fC A01;
    public AnonymousClass1fC A02;
    public RecyclerView A03;
    public final C04530Oa A04 = C62373Zc.A03(new KtLambdaShape67S0100000_I2_47(this, 13));
    public final C04530Oa A05 = C62373Zc.A03(new KtLambdaShape67S0100000_I2_47(this, 17));
    public final C04530Oa A06;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        C04530Oa r3 = this.A05;
        this.A01 = new AnonymousClass1fC(requireContext, AnonymousClass0wJ.A0U(r3), (C11630kW) null);
        this.A02 = new AnonymousClass1fC(requireContext(), AnonymousClass0wJ.A0U(r3), (C11630kW) null);
        this.A00 = (IgLinearLayout) view.requireViewById(R.id.dfa_fixed_top_section);
        RecyclerView recyclerView = (RecyclerView) view.requireViewById(R.id.dfa_recycler_view);
        getContext();
        C18190wL.A1D(recyclerView);
        recyclerView.setAdapter(this.A01);
        this.A03 = recyclerView;
        AnonymousClass061 r4 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape11S0301000_I2_3((Object) viewLifecycleOwner, (Object) r4, (Object) this, (C146958n9) null, 35), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A05);
    }

    public final boolean isScrolledToTop() {
        boolean z;
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            z = recyclerView.canScrollVertically(-1);
        } else {
            z = false;
        }
        return !z;
    }

    public AnonymousClass1dH() {
        KtLambdaShape67S0100000_I2_47 ktLambdaShape67S0100000_I2_47 = new KtLambdaShape67S0100000_I2_47(this, 18);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape67S0100000_I2_47(new KtLambdaShape67S0100000_I2_47(this, 14), 15));
        this.A06 = C18220wO.A0M(new KtLambdaShape67S0100000_I2_47(A012, 16), ktLambdaShape67S0100000_I2_47, C18250wR.A0d(A012, (Object) null, 25), C18210wN.A0l(DogfoodingAssistantViewModel.class));
    }

    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        int A022 = C14030oh.A02(-1264433356);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (string2 = bundle2.getString("dogfooding_assistant_session_id")) == null) {
            DogfoodingAssistantViewModel dogfoodingAssistantViewModel = (DogfoodingAssistantViewModel) this.A06.getValue();
            Bundle bundle3 = this.mArguments;
            if (bundle3 == null || (string = bundle3.getString("dogfooding_assistant_url")) == null) {
                IllegalStateException A0b = AnonymousClass0wJ.A0b();
                C14030oh.A09(1904925481, A022);
                throw A0b;
            }
            C86074wE r7 = dogfoodingAssistantViewModel.A02;
            do {
            } while (!r7.ADi(r7.getValue(), new KtCSuperShape0S0100000_I2((Object) null, 39)));
            String queryParameter = C15430rJ.A01(string).getQueryParameter("id");
            if (queryParameter != null) {
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape2S1201000_I2_1(dogfoodingAssistantViewModel, queryParameter, (C146958n9) null, 4), AnonymousClass3J5.A00(dogfoodingAssistantViewModel), 3);
            } else {
                do {
                } while (!r7.ADi(r7.getValue(), new KtCSuperShape0S0100000_I2((Object) new AnonymousClass19J("Old qr code, please recreate in the dogfooding assistant tool"), 39)));
            }
        } else {
            C62793ak A0N = C18200wM.A0N(this.A06);
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape2S1201000_I2_1(A0N, string2, (C146958n9) null, 4), AnonymousClass3J5.A00(A0N), 3);
        }
        C14030oh.A09(-391125112, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(655064434);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.dfa_bottom_sheet, viewGroup, false);
        C14030oh.A09(-2091675547, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1300184847);
        super.onDestroyView();
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A03 = null;
        C14030oh.A09(-908856425, A022);
    }
}
