package X;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.redex.IDxObjectShape282S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.1by  reason: invalid class name and case insensitive filesystem */
public final class C23131by extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "AccountLinkingIGPCPasswordCreationScreen";
    public UserSession A00;
    public ProgressButton A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public EditText A05;
    public final TextWatcher A06 = new IDxObjectShape282S0100000_1_I2(this, 1);
    public volatile boolean A07;

    public final void configureActionBar(AnonymousClass4u2 r3) {
        String string;
        r3.CtO(true);
        r3.CtT(true);
        if (this.A02) {
            string = "";
        } else {
            string = requireActivity().getString(2131820851);
        }
        r3.setTitle(string);
    }

    public final String getModuleName() {
        return "account_linking_igpc_password_creation";
    }

    public static void A00(C23131by r4) {
        AnonymousClass2A2 r0;
        boolean z = r4.A02;
        UserSession userSession = r4.A00;
        if (z) {
            r0 = AnonymousClass2A2.A02;
        } else {
            r0 = AnonymousClass2A2.A03;
        }
        String obj = r0.toString();
        AnonymousClass0wJ.A1N(userSession, obj);
        C63003bJ.A00(AnonymousClass2AF.A04, userSession, obj, (String) null);
        UserSession userSession2 = r4.A00;
        String A0f = C18180wK.A0f(r4.A05);
        H1T A0N = AnonymousClass0wJ.A0N(userSession2);
        A0N.A0O("enc_new_password", C62663aU.A00(A0N, userSession2, A0f));
        C63873iU.A0C(r4, AnonymousClass0wJ.A0S(A0N), 0);
    }

    public static void A01(C23131by r4) {
        boolean z = true;
        r4.A05.setEnabled(!r4.A07);
        r4.A01.setShowProgressBar(r4.A07);
        int A012 = AnonymousClass0hA.A01(C18180wK.A0f(r4.A05));
        ProgressButton progressButton = r4.A01;
        if (A012 < 6) {
            z = false;
        }
        progressButton.setEnabled(z);
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final boolean onBackPressed() {
        if (this.A02) {
            return false;
        }
        UserSession userSession = this.A00;
        String obj = AnonymousClass2A2.A03.toString();
        AnonymousClass0wJ.A1N(userSession, obj);
        C63003bJ.A00(AnonymousClass2AF.A03, userSession, obj, (String) null);
        C18190wL.A19(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(94403162);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = requireArguments.getBoolean("is_parent_account");
        this.A02 = requireArguments.getBoolean("is_interstitial");
        this.A00 = C18180wK.A0V(requireArguments);
        C14030oh.A09(-194358046, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AnonymousClass2A2 r0;
        int A022 = C14030oh.A02(-790842623);
        View inflate = layoutInflater.inflate(R.layout.account_linking_setup_igpc_password_creation_fragment, viewGroup, false);
        IgdsHeadline A0S = C18240wQ.A0S(inflate, R.id.igpc_password_creation_headline);
        UserSession userSession = this.A00;
        C04620Ok r3 = C06810aP.A01;
        A0S.setCircularImageUrl(r3.A01(userSession).B4M());
        ProgressButton progressButton = (ProgressButton) inflate.requireViewById(R.id.create_button);
        this.A01 = progressButton;
        if (this.A02) {
            progressButton.setText((CharSequence) getString(2131820857));
            A0S.setHeadline((CharSequence) AnonymousClass0wJ.A0o(this, C18200wM.A0k(this.A00, r3), 2131820854));
            A0S.setBody(AnonymousClass0wJ.A0o(this, C18200wM.A0k(this.A00, r3), 2131820853), (View.OnClickListener) null);
        } else {
            A0S.setHeadline((CharSequence) AnonymousClass0wJ.A0o(this, C18200wM.A0k(this.A00, r3), 2131820856));
        }
        AnonymousClass0wJ.A16(this.A01, 24, this);
        EditText editText = (EditText) inflate.requireViewById(R.id.password_edittext);
        this.A05 = editText;
        editText.setTypeface(Typeface.DEFAULT);
        C18240wQ.A0z(this.A05);
        this.A05.setImeOptions(6);
        this.A05.setInputType(524416);
        C18210wN.A12(this.A05, this, 0);
        if (C18180wK.A0F(this) != null) {
            this.A04 = C18180wK.A0F(this).getAttributes().softInputMode;
            C18180wK.A15(this);
        }
        boolean z = this.A02;
        UserSession userSession2 = this.A00;
        if (z) {
            r0 = AnonymousClass2A2.A02;
        } else {
            r0 = AnonymousClass2A2.A03;
        }
        String obj = r0.toString();
        C04220Ms.A0B(userSession2, 0);
        C04220Ms.A0B(obj, 1);
        C63003bJ.A00(AnonymousClass2AF.A05, userSession2, obj, (String) null);
        C14030oh.A09(-1943599193, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(677025228);
        super.onDestroyView();
        if (C18180wK.A0F(this) != null) {
            C18180wK.A0F(this).setSoftInputMode(this.A04);
        }
        this.A05 = null;
        this.A01 = null;
        C14030oh.A09(1107148209, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(985305727);
        super.onPause();
        this.A05.removeTextChangedListener(this.A06);
        if (C18180wK.A0F(this) != null) {
            C18180wK.A0F(this).setSoftInputMode(this.A04);
        }
        C14030oh.A09(-1644344458, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-667830237);
        super.onResume();
        this.A05.addTextChangedListener(this.A06);
        if (C18180wK.A0F(this) != null) {
            C18180wK.A15(this);
        }
        C14030oh.A09(-964958910, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        A01(this);
    }
}
