package X;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.barcelona.R;
import com.instagram.fanclub.gifting.FanClubGiftingViewModel;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S1401000_I2;
import kotlin.jvm.internal.KtLambdaShape69S0100000_I2_49;

/* renamed from: X.1bS  reason: invalid class name */
public final class AnonymousClass1bS extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "FanClubPurchaseProcessingFragment";
    public final C04530Oa A00;
    public final C04530Oa A01;
    public final C04530Oa A02;
    public final C04530Oa A03;
    public final C04530Oa A04 = C80644m9.A00(this);
    public final C04530Oa A05;

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        r3.Cqb(2131827984);
        r3.CtU(C18190wL.A0H(this, HttpStatus.SC_EXPECTATION_FAILED), true);
    }

    public final String getModuleName() {
        return "FanClubPurchaseProcessFragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String A0q;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((SpinnerImageView) view.requireViewById(R.id.loading_spinner)).setLoadingStatus(AnonymousClass69F.LOADING);
        Object value = this.A00.getValue();
        if (value != null && (A0q = C18200wM.A0q(this.A03)) != null) {
            AnonymousClass061 r4 = AnonymousClass061.STARTED;
            AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S1401000_I2(viewLifecycleOwner, r4, this, value, A0q, (C146958n9) null, 4), AnonymousClass067.A00(viewLifecycleOwner), 3);
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A04);
    }

    public AnonymousClass1bS() {
        KtLambdaShape69S0100000_I2_49 A0f = C18250wR.A0f(this, 27);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, C18250wR.A0f(C18250wR.A0f(this, 24), 25));
        this.A05 = C18220wO.A0M(C18250wR.A0f(A012, 26), A0f, C18250wR.A0d(A012, (Object) null, 43), C18210wN.A0l(FanClubGiftingViewModel.class));
        this.A00 = C62373Zc.A01(this, 20);
        this.A02 = C62373Zc.A01(this, 22);
        this.A03 = C62373Zc.A01(this, 23);
        this.A01 = C62373Zc.A01(this, 21);
    }

    public final boolean onBackPressed() {
        C25828Dsm A0W = C18190wL.A0W(requireActivity());
        A0W.A0L(2131827166);
        A0W.A0K(2131827981);
        A0W.A0P((DialogInterface.OnClickListener) null, 2131827164);
        A0W.A0R(C18220wO.A0O(this, 65), AnonymousClass25l.RED, 2131827163);
        AnonymousClass0wJ.A1K(A0W);
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1446244777);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fan_club_purchase_processing, viewGroup, false);
        C14030oh.A09(-276876014, A022);
        return inflate;
    }
}
