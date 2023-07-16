package com.instagram.nux.fragment;

import X.AnonymousClass006;
import X.AnonymousClass0RA;
import X.AnonymousClass0wJ;
import X.AnonymousClass1TP;
import X.AnonymousClass1fG;
import X.AnonymousClass265;
import X.AnonymousClass269;
import X.AnonymousClass3FR;
import X.AnonymousClass3GF;
import X.AnonymousClass3HN;
import X.AnonymousClass3HV;
import X.AnonymousClass3R8;
import X.AnonymousClass3Wh;
import X.AnonymousClass3X6;
import X.AnonymousClass3YT;
import X.AnonymousClass45A;
import X.AnonymousClass7FY;
import X.C04220Ms;
import X.C07530bf;
import X.C09140ev;
import X.C10300i6;
import X.C11630kW;
import X.C121687Hl;
import X.C13330nS;
import X.C14030oh;
import X.C15430rJ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C18250wR;
import X.C18330wh;
import X.C209216q;
import X.C24691jq;
import X.C25828Dsm;
import X.C313625r;
import X.C32165H8c;
import X.C34640IcN;
import X.C38040KHr;
import X.C58453Fr;
import X.C62713aZ;
import X.C62733ac;
import X.C63163fI;
import X.C63213h0;
import X.C63383hO;
import X.C63533hk;
import X.C63553hn;
import X.C63683i7;
import X.C63873iU;
import X.C63883iV;
import X.C70224Dh;
import X.C82394pY;
import X.C84634tZ;
import X.C85964w3;
import X.H1T;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2;
import com.facebook.redex.IDxCListenerShape20S1100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.api.base.IDxACallbackShape2S1200000_1_I2;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.fx.access.constants.FxcalAccountType;
import com.instagram.login.onetap.callback.IDxLCallbackShape57S0200000_1_I2;
import com.instagram.nux.ui.NetzDgTermsTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OneTapLoginLandingFragment extends C34640IcN implements C11630kW, C84634tZ {
    public AnonymousClass3FR A00;
    public AnonymousClass1fG A01;
    public AnonymousClass3HV A02;
    public C07530bf A03;
    public boolean A04 = false;
    public C70224Dh A05;
    public AnonymousClass3HN A06;
    public final C82394pY A07 = C18220wO.A0P(this, 55);
    public ViewGroup mRootView;

    public final void BjS(String str, String str2) {
        Iterator it = C63533hk.A02(this.A03).A08(this.A03).iterator();
        while (it.hasNext()) {
            C62733ac A0Q = C18250wR.A0Q(it);
            if (A0Q.A06.equals(str)) {
                Context requireContext = requireContext();
                C07530bf r4 = this.A03;
                String str3 = A0Q.A03;
                String str4 = A0Q.A05;
                H1T A0N = AnonymousClass0wJ.A0N(r4);
                A0N.A0J("accounts/one_tap_app_login/");
                A0N.A0O("login_nonce", str3);
                C63383hO.A02(requireContext, A0N);
                C18250wR.A17(A0N, str4);
                C18180wK.A1J(A0N, r4, "adid", C63883iV.A0H());
                A0N.A0P("stop_deletion_token", str2);
                C32165H8c A0S = C18180wK.A0S(A0N);
                A0S.A00 = new IDxLCallbackShape57S0200000_1_I2(this, this, this, this, this.A03, A0Q, AnonymousClass265.ONE_TAP, A0Q.A06, A0Q.A05);
                schedule(A0S);
                return;
            }
        }
    }

    public final /* synthetic */ void C5y(C58453Fr r2) {
        r2.A00(false);
    }

    public final /* synthetic */ void CM7() {
    }

    public final String getModuleName() {
        return "one_tap";
    }

    public static List A00(OneTapLoginLandingFragment oneTapLoginLandingFragment) {
        ImageUrl imageUrl;
        String str;
        List A08 = C63533hk.A02(oneTapLoginLandingFragment.A03).A08(oneTapLoginLandingFragment.A03);
        AnonymousClass3FR r1 = oneTapLoginLandingFragment.A00;
        if (r1 != null && !r1.A00(oneTapLoginLandingFragment.mArguments).isEmpty()) {
            for (C209216q r4 : oneTapLoginLandingFragment.A00.A00(oneTapLoginLandingFragment.mArguments)) {
                Iterator it = A08.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C18250wR.A0Q(it).A05.equals(r4.A04)) {
                            break;
                        }
                    } else {
                        String str2 = r4.A03;
                        if (str2 != null && (imageUrl = r4.A00) != null) {
                            KtCSuperShape0S4100000_I2 ktCSuperShape0S4100000_I2 = (KtCSuperShape0S4100000_I2) r4.A02;
                            if (ktCSuperShape0S4100000_I2.A03 != null && (str = ktCSuperShape0S4100000_I2.A01) != null) {
                                A08.add(new C62733ac(imageUrl, ktCSuperShape0S4100000_I2.A04, str2, str, true));
                            }
                        }
                    }
                }
            }
        }
        if (A08.size() > 1) {
            return A08;
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (!A08.isEmpty()) {
            A0v.add(C18240wQ.A0b(A08));
        }
        return A0v;
    }

    public static void A01(OneTapLoginLandingFragment oneTapLoginLandingFragment, List list) {
        oneTapLoginLandingFragment.mRootView.removeAllViews();
        if (list.size() == 1) {
            C62733ac r2 = (C62733ac) list.get(0);
            C18180wK.A0C(oneTapLoginLandingFragment.mRootView).inflate(R.layout.one_tap_login_landing_single_user, oneTapLoginLandingFragment.mRootView);
            IgImageView A0M = C18250wR.A0M(oneTapLoginLandingFragment.mRootView, R.id.avatar_image_view);
            ImageUrl imageUrl = r2.A02;
            if (imageUrl != null) {
                A0M.setUrl(imageUrl, oneTapLoginLandingFragment);
            } else {
                C18180wK.A0r(oneTapLoginLandingFragment.getContext(), A0M, R.drawable.profile_anonymous_user);
            }
            ViewGroup A0J = C18220wO.A0J(oneTapLoginLandingFragment.mRootView, R.id.avatar_login_button_container);
            C18180wK.A0C(A0J).inflate(R.layout.ig_one_tap_log_in_button, A0J);
            C18250wR.A0s(A0M, oneTapLoginLandingFragment, r2, 150);
            TextView A0L = AnonymousClass0wJ.A0L(oneTapLoginLandingFragment.mRootView, R.id.one_tap_log_in_button);
            C18250wR.A0s(A0L, oneTapLoginLandingFragment, r2, 151);
            View requireViewById = oneTapLoginLandingFragment.mRootView.requireViewById(R.id.remove_text_link);
            C18250wR.A0s(requireViewById, oneTapLoginLandingFragment, r2, 152);
            AnonymousClass3X6.A01((TextView) requireViewById);
            View requireViewById2 = oneTapLoginLandingFragment.mRootView.requireViewById(R.id.login_landing_logo);
            ((LinearLayout.LayoutParams) requireViewById2.getLayoutParams()).bottomMargin = AnonymousClass0wJ.A0B(oneTapLoginLandingFragment).getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height);
            requireViewById2.requestLayout();
            ((LinearLayout.LayoutParams) A0M.getLayoutParams()).bottomMargin = 0;
            A0M.requestLayout();
            TextView A0L2 = AnonymousClass0wJ.A0L(oneTapLoginLandingFragment.mRootView, R.id.username);
            A0L2.setText(r2.A06);
            A0L2.setVisibility(0);
            C18250wR.A0s(oneTapLoginLandingFragment.mRootView.requireViewById(R.id.avatar_login_button_container), oneTapLoginLandingFragment, r2, 153);
            View requireViewById3 = oneTapLoginLandingFragment.mRootView.requireViewById(R.id.remove_text_container);
            ((LinearLayout.LayoutParams) requireViewById3.getLayoutParams()).topMargin = AnonymousClass0wJ.A0B(oneTapLoginLandingFragment).getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
            requireViewById3.requestLayout();
            A0L.setText(2131830105);
        } else {
            C18180wK.A0C(oneTapLoginLandingFragment.mRootView).inflate(R.layout.one_tap_login_landing_multiple_users, oneTapLoginLandingFragment.mRootView);
            AnonymousClass1fG r0 = new AnonymousClass1fG(oneTapLoginLandingFragment, oneTapLoginLandingFragment);
            oneTapLoginLandingFragment.A01 = r0;
            r0.A09(list);
            ((AbsListView) oneTapLoginLandingFragment.mRootView.requireViewById(16908298)).setAdapter(oneTapLoginLandingFragment.A01);
        }
        ((NetzDgTermsTextView) oneTapLoginLandingFragment.mRootView.requireViewById(R.id.netz_dg_terms_text_view)).A00(oneTapLoginLandingFragment.A03);
        TextView A0L3 = AnonymousClass0wJ.A0L(oneTapLoginLandingFragment.mRootView, R.id.left_button);
        C18180wK.A10(A0L3, oneTapLoginLandingFragment, 2131836487);
        Integer num = AnonymousClass006.A01;
        AnonymousClass7FY.A02(A0L3, num);
        AnonymousClass0wJ.A17(A0L3, 16, oneTapLoginLandingFragment);
        TextView A0L4 = AnonymousClass0wJ.A0L(oneTapLoginLandingFragment.mRootView, R.id.right_button);
        C18180wK.A10(A0L4, oneTapLoginLandingFragment, 2131831926);
        AnonymousClass7FY.A02(A0L4, num);
        AnonymousClass0wJ.A17(A0L4, 17, oneTapLoginLandingFragment);
        AnonymousClass3X6.A01(A0L3, A0L4);
        C63163fI.A00(oneTapLoginLandingFragment.getContext(), C18220wO.A0K(oneTapLoginLandingFragment.mRootView, R.id.login_landing_logo));
    }

    public final void A02(C62733ac r23) {
        C32165H8c A042;
        C63873iU iDxLCallbackShape57S0200000_1_I2;
        String str;
        C62713aZ r14 = C62713aZ.A00;
        C07530bf r15 = this.A03;
        AnonymousClass265 r13 = AnonymousClass265.ONE_TAP;
        C62733ac r12 = r23;
        String str2 = r12.A05;
        C04220Ms.A0B(r15, 0);
        r14.A02(r15, (C313625r) null, false, (Boolean) null, (Integer) null, "sso", str2);
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(this, this.A03), "one_tap_login_account_clicked"), 2463);
        AnonymousClass0wJ.A1A(A0I, A002, A003);
        AnonymousClass269.A08(A0I, "sso");
        C18240wQ.A15(A0I, "one_tap");
        C18180wK.A1B(A0I, A002);
        C18200wM.A1K(A0I, A003);
        A0I.A0S("num_accounts", C18230wP.A0f(C63533hk.A02(this.A03).A08(this.A03).size()));
        C63683i7.A08(A0I);
        A0I.A0T("instagram_id", r12.A05);
        C63683i7.A09(A0I, this.A03);
        A0I.Bb4();
        if (r12.A08) {
            Context requireContext = requireContext();
            C07530bf r142 = this.A03;
            String str3 = r12.A05;
            FxcalAccountType fxcalAccountType = FxcalAccountType.INSTAGRAM;
            String str4 = r12.A03;
            Bundle bundle = this.mArguments;
            if (bundle != null) {
                str = bundle.getString("current_user_id");
            } else {
                str = null;
            }
            A042 = C63883iV.A09(r142, C63883iV.A0G(fxcalAccountType, str4, str), (Boolean) null, str3, C09140ev.A00(requireContext), C18230wP.A0i(requireContext), "account_switcher", (String) null);
            String str5 = r12.A06;
            C18330wh A012 = C18330wh.A01(this);
            C18330wh.A03(this, A012, 2131830126);
            iDxLCallbackShape57S0200000_1_I2 = new IDxACallbackShape2S1200000_1_I2(A012, this, str5, 6);
        } else {
            A042 = C63883iV.A04(getContext(), this.A03, r12.A03, r12.A05, r12.A00());
            iDxLCallbackShape57S0200000_1_I2 = new IDxLCallbackShape57S0200000_1_I2(this, this, this, this, this.A03, r12, r13, r12.A06, r12.A05);
        }
        A042.A00 = iDxLCallbackShape57S0200000_1_I2;
        schedule(A042);
    }

    public final void A03(C62733ac r6) {
        C25828Dsm A0W;
        String str;
        String string;
        AnonymousClass3Wh.A02(this.A03, AnonymousClass265.ONE_TAP, r6.A05);
        if (r6.A08) {
            Bundle bundle = this.mArguments;
            if (bundle != null) {
                str = bundle.getString("current_username");
            } else {
                str = null;
            }
            A0W = C18190wL.A0W(requireActivity());
            if (!C121687Hl.A03(str)) {
                string = AnonymousClass0wJ.A0o(this, str, 2131827784);
            } else {
                string = getString(2131827783);
            }
            A0W.A02 = string;
            C18230wP.A1B(this, A0W, 2131827793);
            A0W.A0c((DialogInterface.OnClickListener) null, getString(2131831976));
        } else {
            String str2 = r6.A05;
            A0W = C18190wL.A0W(getActivity());
            A0W.A0L(2131834608);
            C18230wP.A1B(this, A0W, 2131834609);
            A0W.A0P(new IDxCListenerShape20S1100000_1_I2(str2, (Object) this, 3), 2131834607);
            A0W.A0O(new IDxCListenerShape20S1100000_1_I2(str2, (Object) this, 2), 2131823054);
        }
        AnonymousClass0wJ.A1K(A0W);
    }

    public final void C5R() {
    }

    public final void C8f() {
    }

    public final void CJu() {
    }

    public final void CJv() {
    }

    public final void CJw() {
    }

    public final void CM6(AnonymousClass1TP r2, C07530bf r3) {
        this.A05.CM6(r2, r3);
    }

    public final C10300i6 getSession() {
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-958745445);
        super.onCreate(bundle);
        C07530bf A042 = AnonymousClass0RA.A0C.A04(this.mArguments);
        this.A03 = A042;
        registerLifecycleListener(new C24691jq(getActivity(), this, A042, AnonymousClass265.ONE_TAP));
        AnonymousClass3HN r0 = new AnonymousClass3HN(this, this.A03);
        this.A06 = r0;
        r0.A00();
        this.A05 = new C70224Dh(getActivity());
        Context requireContext = requireContext();
        AnonymousClass3HV r5 = AnonymousClass3HV.A04;
        if (r5 == null) {
            AnonymousClass3R8.A00(requireContext);
            r5 = new AnonymousClass3HV();
            AnonymousClass3HV.A04 = r5;
        }
        this.A02 = r5;
        r5.A00(getContext(), this, this.A03, C18240wQ.A0O(getContext(), this), (C85964w3) null);
        FragmentActivity requireActivity = requireActivity();
        C07530bf r2 = this.A03;
        C04220Ms.A0B(r2, 2);
        this.A00 = new AnonymousClass3FR(requireActivity, r2, false);
        C14030oh.A09(-2130233287, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        int i;
        String A0i;
        String queryParameter;
        int A022 = C14030oh.A02(821342675);
        this.mRootView = (ViewGroup) AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.one_tap_login_landing_fragment);
        List A002 = A00(this);
        if (!A002.isEmpty()) {
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null && (A0i = C18190wL.A0i(bundle2)) != null && (queryParameter = C15430rJ.A01(A0i).getQueryParameter(C63213h0.A00())) != null) {
                Iterator it = A002.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C18250wR.A0Q(it).A06.equals(queryParameter)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                AnonymousClass3YT.A00.A02(this.A03, "sso");
                A01(this, A002);
                viewGroup2 = this.mRootView;
                i = -673345754;
                C14030oh.A09(i, A022);
                return viewGroup2;
            }
        }
        C63553hn.A04(this.mArguments, this.mFragmentManager);
        viewGroup2 = null;
        i = -367497839;
        C14030oh.A09(i, A022);
        return viewGroup2;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1615538625);
        super.onDestroyView();
        C38040KHr.A01.A04(this.A07, AnonymousClass45A.class);
        C14030oh.A09(329104545, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-961620385);
        this.A04 = true;
        super.onPause();
        C14030oh.A09(805243369, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1426368350);
        this.A04 = false;
        super.onResume();
        C14030oh.A09(1550725863, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C38040KHr.A01.A03(this.A07, AnonymousClass45A.class);
    }

    public final void CLz(AnonymousClass3GF r1) {
    }
}
