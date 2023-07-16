package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.47q  reason: invalid class name and case insensitive filesystem */
public final class C692747q implements C10390iG, AnonymousClass0i4, CallerContextable {
    public static final CallerContext A04 = CallerContext.A01(__redex_internal_original_name);
    public static final String __redex_internal_original_name = "FacebookAuthTokenRetriever";
    public C32165H8c A00;
    public C82394pY A01;
    public boolean A02;
    public final UserSession A03;

    public final void onSessionWillEnd() {
        C82394pY r2 = this.A01;
        if (r2 != null) {
            C38040KHr.A01.A04(r2, AnonymousClass45A.class);
        }
        C691847d.A03(this);
        C63643hy.A04(new AnonymousClass4QD(this));
    }

    public C692747q(UserSession userSession) {
        this.A03 = userSession;
        C691847d.A02(this);
        if (C691847d.A05()) {
            onAppBackgrounded();
        } else {
            onAppForegrounded();
        }
    }

    public static final void A00(C692747q r5, String str) {
        String str2;
        AnonymousClass44X A002 = AnonymousClass44X.A00();
        UserSession userSession = r5.A03;
        String A022 = A002.A02(userSession, "ig_android_access_library_crossposting_to_fb");
        String A032 = A002.A03(userSession, "ig_android_access_library_crossposting_to_fb");
        if (AnonymousClass0hA.A08(A022) || AnonymousClass0hA.A08(A032)) {
            str2 = "ig_fbconnected_backend_no_first_party_token";
        } else if (A022 == null) {
            throw C18180wK.A0a("Required value was null.");
        } else if (A032 == null) {
            throw C18180wK.A0a("Required value was null.");
        } else if (!A022.equals(str)) {
            str2 = "ig_first_party_token_mismatch";
        } else if (r5.A00 == null) {
            C18180wK.A1K(C18230wP.A0T("ig_fbconnected_backend_matches_first_party_token"), userSession);
            IDxACallbackShape111S0100000_1_I2 A06 = C63873iU.A06(r5, 163);
            C04220Ms.A0B(userSession, 0);
            H1T A0O = AnonymousClass0wJ.A0O(userSession);
            A0O.A0J("fb/convert_big_blue_token/");
            A0O.A0O("fbid", str);
            A0O.A0O("big_blue_token", A032);
            C63383hO.A03(A0O, C09140ev.A00(C10600ic.A00));
            C32165H8c A0T = C18180wK.A0T(A0O, AnonymousClass1TF.class, C60283Ok.class);
            A0T.A00 = A06;
            r5.A00 = A0T;
            C31155GhB.A03(A0T);
            return;
        } else {
            return;
        }
        C18180wK.A1K(C18230wP.A0T(str2), userSession);
        r5.A02 = false;
    }

    public final void onAppBackgrounded() {
        C14030oh.A0A(1373079416, C14030oh.A03(460044467));
    }

    public final void onAppForegrounded() {
        CallerContext callerContext;
        boolean A032;
        AnonymousClass266 A0g;
        int A033 = C14030oh.A03(1284133471);
        UserSession userSession = this.A03;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36319957147063836L)) {
            C29681z6 A002 = C35692Ol.A00(userSession);
            callerContext = A04;
            A032 = A002.A05(callerContext, "ig_android_linking_cache_auth_token_retriever");
        } else {
            User A0Y = AnonymousClass0wJ.A0Y(userSession);
            boolean z = false;
            if (A0Y.Apo() || ((A0g = A0Y.A0g()) != null && A0g.equals(AnonymousClass266.A04))) {
                z = true;
            }
            callerContext = A04;
            if (z) {
                A032 = C61853Wb.A01(callerContext, userSession, "ig_to_fb_crossposting_token");
            } else {
                A032 = C62963bD.A03(callerContext, userSession, "ig_to_fb_crossposting_token");
            }
        }
        if (!A032 && AnonymousClass0wJ.A1W(C63443hU.A00())) {
            long currentTimeMillis = System.currentTimeMillis();
            C04220Ms.A0B(userSession, 0);
            C696949q A034 = AnonymousClass3Zs.A03(userSession);
            D2R d2r = D2R.A0v;
            if (currentTimeMillis - C18180wK.A05(A034.A01(d2r), "last_first_party_to_third_check") >= 86400000 && !this.A02) {
                this.A02 = true;
                String A022 = C35692Ol.A00(userSession).A02(callerContext, "ig_android_linking_cache_auth_token_retriever");
                if (AnonymousClass0hA.A08(A022)) {
                    this.A02 = false;
                } else {
                    AnonymousClass44X A003 = AnonymousClass44X.A00();
                    if (A003.A02(userSession, "ig_android_access_library_crossposting_to_fb") == null) {
                        AnonymousClass471 r2 = new AnonymousClass471(this, A022);
                        this.A01 = r2;
                        C38040KHr.A01.A03(r2, AnonymousClass45A.class);
                        A003.A04(userSession, (AnonymousClass265) null);
                    } else if (A022 != null) {
                        A00(this, A022);
                    } else {
                        throw C18180wK.A0a("Required value was null.");
                    }
                }
                AnonymousClass0wJ.A12(C696949q.A00(AnonymousClass3Zs.A03(userSession), d2r), "last_first_party_to_third_check", System.currentTimeMillis());
            }
        }
        C14030oh.A0A(-1226971750, A033);
    }
}
