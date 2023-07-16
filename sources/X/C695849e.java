package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.49e  reason: invalid class name and case insensitive filesystem */
public final class C695849e implements AnonymousClass0i4, CallerContextable {
    public static final String __redex_internal_original_name = "IGFacebookCrosspostingLinkingManager";
    public boolean A00;
    public final C28161tl A01;
    public final UserSession A02;
    public final CallerContext A03 = CallerContext.A01(__redex_internal_original_name);

    public final void A01(Boolean bool, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        String str5 = str;
        String str6 = str2;
        boolean A1Z = AnonymousClass0wJ.A1Z(str, str2);
        String str7 = str3;
        String str8 = str4;
        C18180wK.A1Q(str7, 2, str8);
        C04620Ok r0 = C06810aP.A01;
        UserSession userSession = this.A02;
        if (!C18200wM.A1X(userSession, r0)) {
            boolean z3 = z;
            boolean z4 = z2;
            if (str.length() == 0) {
                A02(bool, str8, z3, z4);
            } else if (z) {
                USLEBaseShape0S0000000 A0P = C18200wM.A0P(userSession);
                C18180wK.A1E(A0P, userSession, "server_update_attempt", str8, z4);
                A0P.A0T("target_destination_type", "fb_page");
                C18220wO.A1G(A0P, C60333Op.A01(userSession));
                C04220Ms.A0B(userSession, 0);
                H1T A0O = AnonymousClass0wJ.A0O(userSession);
                A0O.A0J("ig_fb_xposting/user_sharing_to_fb_page/set/");
                A0O.A0O("fb_page_id", str);
                A0O.A0C(C85814vo.class, AnonymousClass3Za.class, A1Z);
                if (bool != null) {
                    A0O.A0R("show_xpost_destination_picker", bool.booleanValue());
                }
                C32165H8c A022 = A0O.A02();
                A022.A00 = new AnonymousClass1hZ(this, str8, str5, str6, str7, z4);
                C31155GhB.A03(A022);
            } else {
                A00(this, str, str2, str7, str8, z4);
            }
        }
    }

    public final void A02(Boolean bool, String str, boolean z, boolean z2) {
        String str2;
        C84524tI AsH;
        String str3 = str;
        C04220Ms.A0B(str, 0);
        C04620Ok r5 = C06810aP.A01;
        UserSession userSession = this.A02;
        if (!C18200wM.A1X(userSession, r5)) {
            boolean z3 = z2;
            if (z) {
                USLEBaseShape0S0000000 A0P = C18200wM.A0P(userSession);
                C18180wK.A1E(A0P, userSession, "server_update_attempt", str, z3);
                A0P.A0T("target_destination_type", "fb_user");
                C18220wO.A1G(A0P, C60333Op.A01(userSession));
                if (C60343Oq.A01(userSession)) {
                    str2 = C35692Ol.A00(userSession).A03(this.A03, "ig_android_linking_cache_ig_to_fb_crossposting_destination_picker");
                } else {
                    C84024sQ A002 = C67303zK.A00(userSession, r5.A01(userSession));
                    if (A002 == null || (AsH = A002.AsH()) == null) {
                        str2 = null;
                    } else {
                        str2 = AsH.getId();
                    }
                }
                C04220Ms.A0B(userSession, 0);
                H1T A0O = AnonymousClass0wJ.A0O(userSession);
                A0O.A0J("ig_fb_xposting/account_linking/remove_page_assoc_and_set_personal_destination/");
                A0O.A0O("fb_personal_account_id", str2);
                A0O.A0C(C85814vo.class, AnonymousClass3Za.class, true);
                if (bool != null) {
                    A0O.A0R("show_xpost_destination_picker", bool.booleanValue());
                }
                C32165H8c A022 = A0O.A02();
                A022.A00 = new AnonymousClass1hO(this, str, z3);
                C31155GhB.A03(A022);
                return;
            }
            A00(this, "", "", "", str3, z3);
        }
    }

    public final void onSessionWillEnd() {
    }

    public static final void A00(C695849e r10, String str, String str2, String str3, String str4, boolean z) {
        C84024sQ A002;
        AnonymousClass18S r1;
        String str5;
        UserSession userSession = r10.A02;
        if (C60343Oq.A01(userSession)) {
            C49222r2.A00(userSession).A04((C83804s1) null, str4, (String) null);
        } else {
            C28161tl A012 = AnonymousClass3WS.A01(userSession);
            C04220Ms.A0B(str, 0);
            C18180wK.A0v(C28161tl.A02(A012), "linked_fb_page_id", str);
            AnonymousClass0wJ.A13(AnonymousClass3Zs.A00(userSession).putString("page_access_token", str3).putString("page_id", str).putString("page_name", str2), "token_has_manage_pages", true);
            AnonymousClass0wJ.A12(C28161tl.A03(userSession), "xposting_page_access_token_last_saved_ms", System.currentTimeMillis());
            User A003 = C04660Oo.A00(userSession);
            if (!(A003 == null || (A002 = C67303zK.A00(userSession, A003)) == null)) {
                AnonymousClass18T r5 = null;
                if (C18180wK.A1X(str.length())) {
                    r1 = new AnonymousClass18S(str, str2);
                } else {
                    r1 = null;
                }
                C84524tI AsH = A002.AsH();
                if (AsH != null) {
                    r5 = new AnonymousClass18T(AsH.AhK(), AsH.AsB(), AsH.getId(), AsH.getName(), AsH.BMs());
                }
                A003.A1m(new AnonymousClass18O(r1, r5));
                C18210wN.A1J(userSession, A003);
                A003.A1t(userSession);
            }
        }
        USLEBaseShape0S0000000 A0P = C18200wM.A0P(userSession);
        C18180wK.A1E(A0P, userSession, "local_destination_write", str4, z);
        if (AnonymousClass0hA.A08(str)) {
            str5 = "fb_user";
        } else {
            str5 = "fb_page";
        }
        A0P.A0T("target_destination_type", str5);
        C18220wO.A1G(A0P, C60333Op.A01(userSession));
    }

    public C695849e(UserSession userSession) {
        this.A02 = userSession;
        this.A01 = AnonymousClass3WS.A01(userSession);
    }
}
