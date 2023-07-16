package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.fanclub.gifting.FanClubGiftingViewModel;
import com.instagram.fanclub.gifting.FanClubGiftingViewModel$fetchGiftOptions$1;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0301000_I2_3;
import kotlin.jvm.internal.KtLambdaShape69S0100000_I2_49;

/* renamed from: X.1Yn  reason: invalid class name and case insensitive filesystem */
public final class C22551Yn extends C34640IcN {
    public static final String __redex_internal_original_name = "FanClubGiftingPriceSelectionFragment";
    public View A00;
    public C150388wA A01;
    public SpinnerImageView A02;
    public final C04530Oa A03;
    public final C04530Oa A04;
    public final C04530Oa A05;
    public final C04530Oa A06;
    public final C04530Oa A07 = C80644m9.A00(this);
    public final C04530Oa A08;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        SpinnerImageView spinnerImageView = (SpinnerImageView) AnonymousClass0wJ.A0J(view, R.id.loading_spinner);
        spinnerImageView.setLoadingStatus(AnonymousClass69F.LOADING);
        this.A02 = spinnerImageView;
        this.A00 = AnonymousClass0wJ.A0K(view, R.id.price_selection_view);
        IgdsHeadline A0S = C18240wQ.A0S(view, R.id.price_selection_headline);
        Context A0A = C18190wL.A0A(A0S);
        C04530Oa r2 = this.A03;
        A0S.setImageDrawable(C120587Bp.A00(A0A, (User) r2.getValue()));
        A0S.setHeadline(2131827979);
        A0S.setBody(2131827977);
        this.A01 = C18220wO.A0Z(C18220wO.A0Y(this), new AnonymousClass1kG());
        RecyclerView A0L = C18230wP.A0L(view);
        C150388wA r0 = this.A01;
        if (r0 == null) {
            C04220Ms.A0E("recyclerViewAdapter");
            throw null;
        }
        A0L.setAdapter(r0);
        requireContext();
        C18200wM.A1H(A0L, 1);
        TextView A0L2 = AnonymousClass0wJ.A0L(view, R.id.price_selection_footer);
        Context context = A0L2.getContext();
        String A0k = AnonymousClass0wJ.A0k(context, 2131827980);
        SpannableStringBuilder A0E = C18200wM.A0E(AnonymousClass0wJ.A0o(this, A0k, 2131827978));
        C18730xl.A01(A0E, this, A0k, C18210wN.A01(context), 23);
        A0L2.setText(A0E);
        C18180wK.A0z(A0L2);
        AnonymousClass061 r11 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape11S0301000_I2_3((Object) viewLifecycleOwner, (Object) r11, (Object) this, (C146958n9) null, 45), AnonymousClass067.A00(viewLifecycleOwner), 3);
        FanClubGiftingViewModel fanClubGiftingViewModel = (FanClubGiftingViewModel) this.A08.getValue();
        FragmentActivity requireActivity = requireActivity();
        Context requireContext = requireContext();
        User user = (User) r2.getValue();
        String A0q = C18200wM.A0q(this.A06);
        C04220Ms.A06(A0q);
        C04220Ms.A0B(user, 2);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new FanClubGiftingViewModel$fetchGiftOptions$1(requireContext, requireActivity, fanClubGiftingViewModel, user, A0q, (C146958n9) null), AnonymousClass3J5.A00(fanClubGiftingViewModel), 3);
        AnonymousClass066 viewLifecycleOwner2 = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape11S0301000_I2_3((Object) viewLifecycleOwner2, (Object) r11, (Object) this, (C146958n9) null, 46), AnonymousClass067.A00(viewLifecycleOwner2), 3);
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A07);
    }

    public C22551Yn() {
        KtLambdaShape69S0100000_I2_49 A0f = C18250wR.A0f(this, 19);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, C18250wR.A0f(C18250wR.A0f(this, 16), 17));
        this.A08 = C18220wO.A0M(C18250wR.A0f(A012, 18), A0f, C18250wR.A0d(A012, (Object) null, 41), C18210wN.A0l(FanClubGiftingViewModel.class));
        this.A04 = C62373Zc.A01(this, 13);
        this.A06 = C62373Zc.A01(this, 15);
        this.A05 = C62373Zc.A01(this, 14);
        this.A03 = C62373Zc.A01(this, 12);
    }

    public static final void A00(C22551Yn r3) {
        C25828Dsm A0V = AnonymousClass0wJ.A0V(r3);
        A0V.A02 = r3.getString(2131836069);
        C18230wP.A1B(r3, A0V, 2131827063);
        C18180wK.A1O(A0V, r3, 61, 2131831976);
        AnonymousClass0wJ.A1K(A0V);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 6) {
            C18220wO.A18(this);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1915506983);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fan_club_gifting_price_selection, viewGroup, false);
        C14030oh.A09(571108326, A022);
        return inflate;
    }
}
