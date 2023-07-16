package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.service.session.UserSession;

/* renamed from: X.1dd  reason: invalid class name and case insensitive filesystem */
public final class C23351dd extends I5x implements C82034oy, C84244sn {
    public static final String __redex_internal_original_name = "LoginActivityFragment";
    public UserSession A00;
    public AnonymousClass1fF A01;
    public final C82394pY A02 = C18220wO.A0P(this, 86);

    public final String getModuleName() {
        return "loginactivity";
    }

    public static void A01(H1T h1t, I5x i5x, String str, long j) {
        h1t.A0B(AnonymousClass1TH.class, C60543Pn.class);
        h1t.A0O(C61973Wo.A01(9, 8, 111), str);
        h1t.A0O(C61973Wo.A01(17, 15, 106), String.valueOf(j));
        i5x.schedule(h1t.A02());
    }

    public final C10300i6 A0I() {
        return this.A00;
    }

    public final void Bm3(AnonymousClass3DN r8) {
        UserSession userSession = this.A00;
        String str = r8.A06;
        if (str == null) {
            str = "";
        }
        long j = r8.A04;
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J(C61973Wo.A01(32, 34, 49));
        A01(A0N, this, str, j);
    }

    public final void Bra(AnonymousClass3DN r8) {
        UserSession userSession = this.A00;
        String str = r8.A06;
        if (str == null) {
            str = "";
        }
        long j = r8.A04;
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J(C61973Wo.A01(135, 39, HttpStatus.SC_SWITCHING_PROTOCOLS));
        A01(A0N, this, str, j);
    }

    public final void Btw(AnonymousClass3DN r2) {
        String str;
        if (r2.A0B) {
            str = r2.A06;
        } else {
            str = r2.A08;
        }
        if (str == null) {
            str = "";
        }
        A02(this, str);
    }

    public static void A02(C23351dd r4, String str) {
        C63463hW.A03();
        UserSession userSession = r4.A00;
        String A002 = C36152Qf.A00(AnonymousClass006.A00);
        Bundle A06 = C18180wK.A06();
        if (A002 != null) {
            A06.putString("change_password_entrypoint", A002);
        }
        if (str != null) {
            A06.putString("change_password_login_id", str);
        }
        C18190wL.A13(A06, userSession.token);
        AnonymousClass1aw r2 = new AnonymousClass1aw();
        C25786Drz A0Q = C18180wK.A0Q(C18210wN.A0F(A06, r2, r4), r4.A00);
        A0Q.A03 = r2;
        A0Q.A0C(r4, 11);
        A0Q.A05();
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131830128);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 11 && i2 == -1 && intent != null) {
            C63813iO.A01(requireContext(), getString(2131830132));
            this.A01.A03();
            C32165H8c A002 = AnonymousClass3RN.A00(getRootActivity(), this.A00);
            A002.A00 = new AnonymousClass1hE(this);
            schedule(A002);
            String stringExtra = intent.getStringExtra("change_password_login_id");
            if (stringExtra != null && stringExtra.length() > 0) {
                H1T A0N = AnonymousClass0wJ.A0N(this.A00);
                C18200wM.A1N(A0N, C61973Wo.A01(66, 31, 13));
                schedule(C18200wM.A0T(A0N, C61973Wo.A01(9, 8, 111), stringExtra));
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1224987671);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0wJ.A0W(this);
        this.A01 = new AnonymousClass1fF(requireContext(), this, this);
        C14030oh.A09(-949329969, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-892183967);
        super.onPause();
        AnonymousClass3LY.A00(this.A00).A02(this.A02, AnonymousClass46S.class);
        C14030oh.A09(-1513357077, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1170533408);
        super.onResume();
        AnonymousClass3LY.A00(this.A00).A01(this.A02, AnonymousClass46S.class);
        C14030oh.A09(1398678323, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(-827768263);
        super.onStart();
        C32165H8c A002 = AnonymousClass3RN.A00(getRootActivity(), this.A00);
        A002.A00 = new AnonymousClass1hE(this);
        schedule(A002);
        C14030oh.A09(1948630461, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        A0F(this.A01);
    }
}
