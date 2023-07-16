package X;

import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.barcelona.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;

/* renamed from: X.1cc  reason: invalid class name and case insensitive filesystem */
public final class C23171cc extends C34640IcN implements C82424pb, AnonymousClass4tS {
    public static final String __redex_internal_original_name = "OneClickPasswordResetFragment";
    public EditText A00;
    public NotificationBar A01;
    public C24721jv A02;
    public UserSession A03;
    public String A04;
    public String A05;
    public Uri A06;
    public View A07;
    public ProgressButton A08;

    public final C313625r Aiy() {
        return null;
    }

    public final void CDH(boolean z) {
    }

    public final String getModuleName() {
        return "one_click_password_reset";
    }

    public static void A00(C23171cc r3) {
        C67323zM.A05(r3.getActivity(), r3.A06, r3, r3.A03);
    }

    public final void AHz() {
        this.A08.setEnabled(false);
        this.A07.setEnabled(false);
    }

    public final void AJV() {
        this.A08.setEnabled(true);
        this.A07.setEnabled(true);
    }

    public final AnonymousClass265 BDt() {
        return AnonymousClass265.A12;
    }

    public final boolean BXY() {
        if (C18180wK.A0f(this.A00).length() >= 6) {
            return true;
        }
        return false;
    }

    public final void C9G() {
        this.A01.A02();
        C54232z7.A00(this.A03, "one_click_pwd_reset");
        UserSession userSession = this.A03;
        String A0n = AnonymousClass0wJ.A0n(this.A00);
        String str = this.A04;
        String str2 = this.A05;
        String A0d = C18240wQ.A0d(this);
        String A0k = C18230wP.A0k(this);
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0O("enc_new_password", C62663aU.A00(A0N, userSession, A0n));
        C18250wR.A17(A0N, userSession.getUserId());
        A0N.A0O("access_pw_reset_token", str);
        A0N.A0O("source", str2);
        C63213h0.A04(A0N, A0d);
        A0N.A0O("guid", A0k);
        C32165H8c A0S = AnonymousClass0wJ.A0S(A0N);
        A0S.A00 = new IDxACallbackShape35S0200000_1_I2(25, this, this);
        schedule(A0S);
    }

    public final C10300i6 getSession() {
        return this.A03;
    }

    public final boolean onBackPressed() {
        A00(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1842430290);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = C18180wK.A0V(requireArguments);
        this.A04 = C18190wL.A0j(requireArguments, "argument_token");
        this.A05 = C18190wL.A0j(requireArguments, "argument_source");
        this.A06 = (Uri) requireArguments.getParcelable("argument_redirect_uri");
        AnonymousClass3YT.A00.A02(this.A03, "one_click_pwd_reset");
        C14030oh.A09(1462431658, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1357909530);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.fragment_one_click_password_reset);
        AnonymousClass0wJ.A0L(A0H, R.id.field_title).setText(2131826840);
        this.A01 = C18240wQ.A0U(A0H);
        EditText editText = (EditText) A0H.requireViewById(R.id.new_password);
        this.A00 = editText;
        editText.setTypeface(Typeface.DEFAULT);
        C18240wQ.A0z(this.A00);
        User A0Y = AnonymousClass0wJ.A0Y(this.A03);
        C18220wO.A1L(this, C18250wR.A0M(A0H, R.id.user_profile_picture), A0Y);
        AnonymousClass0wJ.A0L(A0H, R.id.field_detail).setText(AnonymousClass0wJ.A0o(this, A0Y.BK7(), 2131834857));
        ProgressButton A0c = C18230wP.A0c(A0H);
        this.A08 = A0c;
        C24721jv r5 = new C24721jv(this.A00, this.A03, this, A0c, 2131834856);
        this.A02 = r5;
        registerLifecycleListener(r5);
        View requireViewById = A0H.requireViewById(R.id.skip_text);
        this.A07 = requireViewById;
        AnonymousClass0wJ.A16(requireViewById, HttpStatus.SC_SERVICE_UNAVAILABLE, this);
        C14030oh.A09(-1330606596, A022);
        return A0H;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-688851188);
        super.onDestroy();
        C14030oh.A09(-526760338, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(785916726);
        super.onDestroyView();
        this.A00 = null;
        this.A08 = null;
        this.A07 = null;
        this.A01 = null;
        unregisterLifecycleListener(this.A02);
        C14030oh.A09(611071929, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-1250535983);
        super.onPause();
        if (C18250wR.A09(this) != null) {
            C09860go.A0I(C18250wR.A09(this));
        }
        C14030oh.A09(1021350735, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1246472770);
        super.onResume();
        ((BaseFragmentActivity) requireActivity()).A0C();
        C14030oh.A09(2099254657, A022);
    }
}
