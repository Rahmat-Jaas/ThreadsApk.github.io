package X;

import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.CompoundButton;
import com.facebook.redex.IDxCListenerShape149S0200000_1_I2;
import com.facebook.redex.IDxCListenerShape70S0200000_1_I2;
import com.facebook.redex.IDxTListenerShape181S0200000_1_I2;
import com.instagram.common.api.base.IDxRParserShape118S0100000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.1x0  reason: invalid class name */
public final class AnonymousClass1x0 extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "AccountPrivacyOptionFragment";
    public Dialog A00;
    public Dialog A01;
    public Dialog A02;
    public Dialog A03;
    public C13330nS A04;
    public AnonymousClass1iH A05;
    public UserSession A06;
    public AnonymousClass4MC A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public final String getModuleName() {
        return "account_privacy_option";
    }

    public static void A0C(AnonymousClass1x0 r6, User user) {
        IDxCListenerShape70S0200000_1_I2 A0R = C18200wM.A0R(user, r6, 173);
        C37032Jj9 A0L = C18210wN.A0L(r6.A06);
        C18230wP.A10(r6.requireActivity(), A0L, 2131835583);
        C18250wR.A1A(A0L, r6, 2);
        A0L.A0R = r6.requireActivity().getString(2131835580);
        A0L.A0A = A0R;
        A0L.A0d = false;
        C37383Jqm A002 = A0L.A00();
        A002.A0I(true);
        C22441Yc r2 = new C22441Yc();
        r2.A01 = new AnonymousClass4KU(A002);
        Bundle A062 = C18180wK.A06();
        A062.putBoolean("ARG_PRIVACY_SWITCH_TO_PRIVATE", false);
        A062.putBoolean("ARG_IS_REDESIGN", true);
        C37383Jqm.A00(C18210wN.A0F(A062, r2, r6), r2, A002);
        r6.A08 = true;
    }

    public static void A0D(AnonymousClass1x0 r1, boolean z) {
        r1.A07.A0C = z;
        if (r1.mView != null) {
            C18210wN.A1G(r1);
        }
    }

    public final C10300i6 getSession() {
        return this.A06;
    }

    public static void A0B(AnonymousClass1x0 r4, C169839tz r5, User user, boolean z) {
        String str;
        user.A20(r5);
        if (r4.isVisible()) {
            r4.A05 = new AnonymousClass1iH(r4.requireContext(), new C27501sc(r4, user, z), r4.A06);
            H1T A0N = AnonymousClass0wJ.A0N(r4.A06);
            if (user.A0e() == C169839tz.PrivacyStatusPrivate) {
                str = "accounts/set_private/";
            } else {
                str = "accounts/set_public/";
            }
            A0N.A0J(str);
            A0N.A01 = new IDxRParserShape118S0100000_1_I2(r4, 2);
            C32165H8c A0Q = C18190wL.A0Q(A0N);
            A0Q.A00 = r4.A05;
            r4.schedule(A0Q);
        }
        C18250wR.A0B(r4).A12("account_privacy_options_fragment_request_key", C18180wK.A06());
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131827928);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1708076526);
        super.onCreate(bundle);
        UserSession A0W = AnonymousClass0wJ.A0W(this);
        this.A06 = A0W;
        this.A04 = C13330nS.A01(this, A0W);
        C04220Ms.A0B(A0W, 0);
        H1T A0P = AnonymousClass0wJ.A0P(A0W);
        A0P.A0J("friendships/pending_follow_requests_count/");
        C63873iU.A0D(AnonymousClass0wJ.A0T(A0P, C21901Sp.class, AnonymousClass3PK.class), A0W, 141);
        C14030oh.A09(1902045060, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(2126517251);
        super.onPause();
        this.A0B = this.A08;
        C14030oh.A09(2034380244, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1943588041);
        super.onResume();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        UserSession userSession = this.A06;
        C04620Ok r6 = C06810aP.A01;
        User A012 = r6.A01(userSession);
        AnonymousClass4MC r0 = new AnonymousClass4MC((CompoundButton.OnCheckedChangeListener) new IDxCListenerShape149S0200000_1_I2(5, A012, this), (C33516HpC) new IDxTListenerShape181S0200000_1_I2(6, (Object) this, (Object) A012), 2131832775, C18180wK.A1Z(A012.A0e(), C169839tz.PrivacyStatusPrivate));
        this.A07 = r0;
        A0v.add(r0);
        A0v.add(new C63293hC(2131833805));
        Uri A013 = C15430rJ.A01(AnonymousClass3W8.A01(requireActivity(), "https://help.instagram.com/116024195217477?ref=igapp"));
        String string = getString(2131829574);
        SpannableStringBuilder A0E = C18200wM.A0E(AnonymousClass0wJ.A0o(this, string, 2131832776));
        AnonymousClass3Zw.A01(A0E, new C18670xb(A013), string);
        C23411dm.A01(A0E, A0v);
        setItems(A0v);
        if (this.A0B && !this.A08) {
            A0C(this, r6.A01(this.A06));
        }
        UserSession userSession2 = this.A06;
        C04220Ms.A0B(userSession2, 0);
        H1T A0P = AnonymousClass0wJ.A0P(userSession2);
        A0P.A0J("users/get_is_eligible_restrict_message_settings/");
        C63873iU.A0C(this, AnonymousClass0wJ.A0T(A0P, C21821Sh.class, C60253Oh.class), 136);
        C14030oh.A09(-1361867913, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(-235647477);
        super.onStop();
        AnonymousClass1iH r1 = this.A05;
        if (r1 != null) {
            r1.A00 = null;
        }
        C14030oh.A09(-1656804753, A022);
    }
}
