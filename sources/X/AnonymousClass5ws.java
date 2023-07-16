package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape205S0100000_4_I2;
import com.instagram.barcelona.R;
import com.instagram.ui.text.IDxCSpanShape188S0100000_2_I2;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1;
import kotlin.jvm.internal.KtLambdaShape21S0200000_I2_5;
import kotlin.jvm.internal.KtLambdaShape41S0100000_I2_21;

/* renamed from: X.5ws  reason: invalid class name */
public final class AnonymousClass5ws extends C34640IcN {
    public static final String __redex_internal_original_name = "PromoteFbPreviewFragment";
    public View A00;
    public View A01;
    public C148838sG A02;
    public final C04530Oa A03 = AnonymousClass3W9.A00(this);
    public final C04530Oa A04;

    public final String getModuleName() {
        return "promote_fb_preview";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = view.requireViewById(R.id.main_container);
        this.A00 = view.requireViewById(R.id.loading_spinner);
        C04530Oa r6 = this.A04;
        C86114wI.A1A(getViewLifecycleOwner(), ((C881857b) r6.getValue()).A00, this, 285);
        ViewGroup viewGroup = (ViewGroup) AnonymousClass0wJ.A0J(view, R.id.ad_preview_options_container);
        viewGroup.removeAllViews();
        for (AnonymousClass69A r4 : ((C881857b) r6.getValue()).A07) {
            View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.promote_fb_preview_option, viewGroup, false);
            C86104wH.A1D(inflate, 64, r4, this);
            AnonymousClass0wJ.A0L(inflate, R.id.preview_option_title).setText(r4.A01);
            C18200wM.A0J(inflate, R.id.preview_option_icon).setImageDrawable(requireActivity().getDrawable(r4.A00));
            viewGroup.addView(inflate);
        }
        if (((C881857b) r6.getValue()).A0B) {
            if (C63803iN.A0E(AnonymousClass0TJ.A05, ((C881857b) r6.getValue()).A04, 36321808277838892L)) {
                View A0K = AnonymousClass0wJ.A0K(view, R.id.edit_caption);
                A0K.setVisibility(0);
                A0K.setOnClickListener(new IDxCListenerShape205S0100000_4_I2((Object) this, 61));
                FragmentActivity requireActivity = requireActivity();
                C28161tl A012 = AnonymousClass3WS.A01(((C881857b) r6.getValue()).A04);
                if (!A012.A00.getBoolean(I17.A00(240), false)) {
                    C25553Dnn dnn = new C25553Dnn(requireActivity, new C26431qd(2131833398));
                    dnn.A01(A0K);
                    dnn.A03(D0f.BELOW_ANCHOR);
                    A0K.postDelayed(new AnonymousClass81Y(dnn.A00(), A012), 500);
                }
            }
        }
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.promote_preview_disclaimer);
        String A0g = C18180wK.A0g(this, 2131833603);
        String A0o = AnonymousClass0wJ.A0o(this, A0g, 2131833601);
        C04220Ms.A06(A0o);
        SpannableStringBuilder A0E = C18200wM.A0E(A0o);
        AnonymousClass3Zw.A01(A0E, new IDxCSpanShape188S0100000_2_I2(this, C18180wK.A00(this), 6), A0g);
        textView.setText(A0E);
        C18180wK.A0z(textView);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public AnonymousClass5ws() {
        KtLambdaShape41S0100000_I2_21 ktLambdaShape41S0100000_I2_21 = new KtLambdaShape41S0100000_I2_21(this, 35);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape41S0100000_I2_21(new KtLambdaShape41S0100000_I2_21(this, 32), 33));
        this.A04 = C18220wO.A0M(new KtLambdaShape41S0100000_I2_21(A012, 34), ktLambdaShape41S0100000_I2_21, new KtLambdaShape21S0200000_I2_5(9, A012, (Object) null), C18210wN.A0l(C881857b.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1575284821);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_fragment_fb_preview, viewGroup, false);
        C14030oh.A09(-250325321, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(123931913);
        super.onDestroyView();
        this.A01 = null;
        this.A00 = null;
        C14030oh.A09(959920878, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(1824468022);
        super.onStart();
        this.A02 = C25817DsW.A06(AnonymousClass3J3.A00(getLifecycle()), C86154wM.A0O(new KtSLambdaShape6S0200000_I2_1(this, (C146958n9) null, 44), ((C881857b) this.A04.getValue()).A09));
        C14030oh.A09(881049089, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(-1270816532);
        super.onStop();
        C148838sG r1 = this.A02;
        if (r1 != null) {
            r1.AC7((CancellationException) null);
        }
        this.A02 = null;
        C14030oh.A09(-1998898775, A022);
    }
}
