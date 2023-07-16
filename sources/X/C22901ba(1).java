package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import kotlin.jvm.internal.KtLambdaShape116S0100000_I2_96;

/* renamed from: X.1ba  reason: invalid class name and case insensitive filesystem */
public final class C22901ba extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "XarDisclosureFragment";
    public final C04530Oa A00 = AnonymousClass0OY.A02(new KtLambdaShape116S0100000_I2_96(this, 27));
    public final C04530Oa A01 = AnonymousClass0OY.A02(new KtLambdaShape116S0100000_I2_96(this, 28));

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        r3.Cqb(2131838135);
        r3.CtT(C18180wK.A1X(getParentFragmentManager().A0I()));
        r3.CtO(true);
    }

    public final String getModuleName() {
        return "xar_disclosure_screen";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.disclosure_text_view_1);
        C18180wK.A0z(textView);
        Context requireContext = requireContext();
        C28791uz r3 = new C28791uz(this);
        String A0g = C18190wL.A0g(requireContext.getResources(), 2131829574);
        SpannableStringBuilder A0E = C18200wM.A0E(C18210wN.A0C(requireContext.getResources(), A0g, 2131838132));
        AnonymousClass3Zw.A01(A0E, r3, A0g);
        textView.setText(A0E);
        TextView textView2 = (TextView) AnonymousClass0wJ.A0J(view, R.id.disclosure_text_view_2);
        C18180wK.A0z(textView2);
        Context requireContext2 = requireContext();
        AnonymousClass1v0 r32 = new AnonymousClass1v0(this);
        String A0g2 = C18190wL.A0g(requireContext2.getResources(), 2131838134);
        SpannableStringBuilder A0E2 = C18200wM.A0E(C18210wN.A0C(requireContext2.getResources(), A0g2, 2131838133));
        AnonymousClass3Zw.A01(A0E2, r32, A0g2);
        textView2.setText(A0E2);
    }

    public final C10300i6 getSession() {
        return C18180wK.A0W(this, AnonymousClass0RA.A0C);
    }

    public final boolean onBackPressed() {
        C25745DrH A0a = C18230wP.A0a(this);
        if ((A0a != null && ((C35189Ipf) A0a).A0M) || getParentFragmentManager().A0I() <= 0) {
            return false;
        }
        C18190wL.A19(this);
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1906600042);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.fragment_xar_disclosure, false);
        C14030oh.A09(-2130950466, A02);
        return A0D;
    }

    public final void onResume() {
        C25745DrH A012;
        Fragment A08;
        int A02 = C14030oh.A02(-259739334);
        super.onResume();
        GVD gvd = C25745DrH.A00;
        C25745DrH A013 = gvd.A01(requireActivity());
        if (!(A013 == null || !((C35189Ipf) A013).A0M || (A012 = gvd.A01(requireActivity())) == null || (A08 = A012.A08()) == null)) {
            ((BottomSheetFragment) A08).A0L(0);
        }
        C14030oh.A09(-165188275, A02);
    }

    public final void onStart() {
        int A02 = C14030oh.A02(1084157578);
        super.onStart();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M((C13330nS) C18190wL.A0f(this.A00), "ig_reels_unified_feedback_disclosure_impression"), 1425);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.Bb4();
        }
        C14030oh.A09(-1110605107, A02);
    }
}
