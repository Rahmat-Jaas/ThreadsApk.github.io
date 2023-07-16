package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.1bM  reason: invalid class name */
public final class AnonymousClass1bM extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "TwoFacAuthenticatorAppDownloadFragment";
    public final C04530Oa A00 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        r2.Crs(getString(2131837117));
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public final String getModuleName() {
        return C63833iQ.A05();
    }

    public final boolean onBackPressed() {
        C63833iQ.A0B(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-186940611);
        super.onCreate(bundle);
        AnonymousClass3WQ.A02(AnonymousClass0wJ.A0X(this.A00), "install_auth_app");
        C14030oh.A09(-1438090842, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1377734908);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_authenticator_app_fragment, viewGroup, false);
        IgdsHeadline A0S = C18240wQ.A0S(inflate, R.id.two_factor_headline);
        A0S.A08(R.drawable.twofac_password, false);
        A0S.setHeadline(2131837022);
        A0S.setBody(AnonymousClass00U.A0V(C18180wK.A0g(this, 2131837019), "\n\n", C18180wK.A0g(this, 2131837020)), (View.OnClickListener) null);
        IgdsBottomButtonLayout A0W = C18230wP.A0W(inflate, R.id.next_bottom_button);
        C18210wN.A15(this, A0W, 2131837021);
        A0W.setPrimaryActionOnClickListener(C18190wL.A0H(this, 523));
        A0W.setSecondaryAction(getText(2131837023), C18190wL.A0H(this, 524));
        C24731jw.A02(this);
        C14030oh.A09(2139971346, A02);
        return inflate;
    }
}
