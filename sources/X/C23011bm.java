package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.1bm  reason: invalid class name and case insensitive filesystem */
public final class C23011bm extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "TwoFacAuthenticatorAppConfirmFragment";
    public boolean A00;
    public final C04530Oa A01 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        r2.Crs(getString(2131837013));
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public static final void A00(C23011bm r6) {
        C58803Hi A012 = C62653aT.A01();
        Bundle requireArguments = r6.requireArguments();
        Integer num = AnonymousClass006.A01;
        AnonymousClass0wJ.A19(A012.A00(requireArguments, num, num, "", false), r6.requireActivity(), AnonymousClass0wJ.A0U(r6.A01));
    }

    public final String getModuleName() {
        return C63833iQ.A05();
    }

    public final boolean onBackPressed() {
        C63833iQ.A0B(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-346998489);
        super.onCreate(bundle);
        AnonymousClass3WQ.A02(AnonymousClass0wJ.A0X(this.A01), "enter_code_from_auth_app");
        C14030oh.A09(2031026664, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(425497743);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_authenticator_app_fragment, viewGroup, false);
        IgdsHeadline A0S = C18240wQ.A0S(inflate, R.id.two_factor_headline);
        A0S.A08(R.drawable.ig_illustrations_illo_2fac_code, false);
        A0S.setHeadline(2131837015);
        A0S.setBody(AnonymousClass0wJ.A0o(this, requireArguments().getString("arg_two_fac_app_name"), 2131837014), (View.OnClickListener) null);
        IgdsBottomButtonLayout A0W = C18230wP.A0W(inflate, R.id.next_bottom_button);
        C18210wN.A15(this, A0W, 2131831737);
        A0W.setPrimaryActionOnClickListener(C18190wL.A0H(this, 521));
        A0W.setSecondaryAction(getText(2131837023), C18190wL.A0H(this, 522));
        C24731jw.A02(this);
        C14030oh.A09(319297835, A02);
        return inflate;
    }

    public final void onStart() {
        FragmentActivity activity;
        int A02 = C14030oh.A02(-1212020503);
        super.onStart();
        String string = requireArguments().getString("arg_totp_seed", "");
        if (!this.A00 && string != null) {
            this.A00 = true;
            Intent A0B = C18190wL.A0B(AnonymousClass00U.A0h("otpauth://totp/Instagram:", C18200wM.A0k(AnonymousClass0wJ.A0X(this.A01), C06810aP.A01), "?secret=", string, "&issuer=Instagram"));
            if (isAdded() && (activity = getActivity()) != null) {
                C10650ih.A01(activity, A0B);
            }
        }
        C14030oh.A09(-869669048, A02);
    }
}
