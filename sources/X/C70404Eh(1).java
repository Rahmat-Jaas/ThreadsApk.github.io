package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2;

/* renamed from: X.4Eh  reason: invalid class name and case insensitive filesystem */
public final class C70404Eh implements C82754qD {
    public final /* bridge */ /* synthetic */ Object BeO(C10300i6 r7, Object obj, String str, String str2, String str3, C146958n9 r12) {
        KtCSuperShape0S4100000_I2 ktCSuperShape0S4100000_I2 = (KtCSuperShape0S4100000_I2) obj;
        String str4 = ktCSuperShape0S4100000_I2.A04;
        String str5 = ktCSuperShape0S4100000_I2.A01;
        String str6 = ktCSuperShape0S4100000_I2.A02;
        if (!(r7 instanceof C07530bf)) {
            return new AnonymousClass1jB(new AnonymousClass1j8(C18180wK.A0a("LoggedOutSession is required for one tap log ins")));
        }
        boolean A1Y = AnonymousClass0wJ.A1Y(r7, str4);
        H1T A0O = AnonymousClass0wJ.A0O(r7);
        A0O.A0J("accounts/one_tap_app_login/");
        A0O.A0O("login_nonce", str5);
        A0O.A0O(C62983bG.A02(A1Y ? 1 : 0), str);
        A0O.A0O("guid", str2);
        C18250wR.A17(A0O, str4);
        C18180wK.A1J(A0O, r7, "adid", C63883iV.A0H());
        A0O.A0P("device_base_login_session", str6);
        return C63623hv.A00(C18180wK.A0S(A0O), r12, 820, A1Y);
    }
}
