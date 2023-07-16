package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import com.facebook.redex.IDxCListenerShape70S0200000_1_I2;
import com.instagram.common.api.base.IDxRParserShape118S0100000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1xr  reason: invalid class name and case insensitive filesystem */
public final class C29371xr extends AnonymousClass4MC {
    public static boolean A0A;
    public Dialog A00;
    public Dialog A01;
    public C22302CTd A02;
    public C13330nS A03;
    public UserSession A04;
    public AnonymousClass367 A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public AnonymousClass1iH A09;

    public static void A00(C29371xr r8, User user) {
        C22302CTd cTd = r8.A02;
        Object systemService = cTd.requireContext().getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(cTd.requireView().getWindowToken(), 0);
        IDxCListenerShape70S0200000_1_I2 A0R = C18200wM.A0R(user, r8, 175);
        C37032Jj9 A0L = C18210wN.A0L(r8.A04);
        A0L.A0O = cTd.getString(2131835582);
        C18250wR.A1A(A0L, r8, 5);
        A0L.A0R = cTd.getString(2131835579);
        A0L.A0A = A0R;
        A0L.A0d = false;
        C37383Jqm A002 = A0L.A00();
        A002.A0I(true);
        C18190wL.A10();
        Bundle A062 = C18180wK.A06();
        A062.putBoolean("ARG_PRIVACY_SWITCH_TO_PRIVATE", false);
        C22441Yc r1 = new C22441Yc();
        r1.setArguments(A062);
        r1.A00 = A0R;
        r1.A01 = new AnonymousClass4KV(A002, r8);
        C37383Jqm.A00(cTd.requireContext(), r1, A002);
        A0A = true;
    }

    public static void A01(C29371xr r5, User user, boolean z, boolean z2) {
        String str;
        C22302CTd cTd = r5.A02;
        if (cTd.isVisible()) {
            UserSession userSession = r5.A04;
            r5.A09 = new AnonymousClass1iH(cTd.requireContext(), new C27511sd(r5, user, z), userSession);
            H1T A0N = AnonymousClass0wJ.A0N(userSession);
            if (user.A0e() == C169839tz.PrivacyStatusPrivate) {
                str = "accounts/set_private/";
            } else {
                str = "accounts/set_public/";
            }
            A0N.A0J(str);
            A0N.A01 = new IDxRParserShape118S0100000_1_I2(r5, 3);
            if (z2) {
                A0N.A0R("default_to_private", true);
            }
            C32165H8c A0Q = C18190wL.A0Q(A0N);
            A0Q.A00 = r5.A09;
            cTd.schedule(A0Q);
        }
    }

    public static boolean A02(C29371xr r3) {
        if (r3.A08) {
            UserSession userSession = r3.A04;
            if (!C63803iN.A0E(C18180wK.A0J(userSession), userSession, 36326837684610837L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C29371xr(X.C22302CTd r5, com.instagram.service.session.UserSession r6, X.AnonymousClass367 r7, java.lang.String r8, boolean r9, boolean r10) {
        /*
            r4 = this;
            r3 = 2131832775(0x7f112fc7, float:1.9298613E38)
            X.0Ok r2 = X.C06810aP.A01
            X.9tz r1 = X.C18200wM.A0a(r6, r2)
            X.9tz r0 = X.C169839tz.PrivacyStatusPrivate
            boolean r1 = X.C18180wK.A1Z(r1, r0)
            r0 = 0
            r4.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r0, (int) r3, (boolean) r1)
            r4.A05 = r7
            r4.A04 = r6
            r4.A02 = r5
            X.0nS r0 = X.C13330nS.A01(r5, r6)
            r4.A03 = r0
            r4.A06 = r8
            r4.A08 = r10
            com.instagram.user.model.User r2 = r2.A01(r6)
            X.3uz r1 = new X.3uz
            r1.<init>(r4, r2, r9)
            X.4DK r0 = new X.4DK
            r0.<init>(r4, r2, r8, r9)
            r4.A08 = r1
            r4.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29371xr.<init>(X.CTd, com.instagram.service.session.UserSession, X.367, java.lang.String, boolean, boolean):void");
    }
}
