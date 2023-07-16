package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3zR  reason: invalid class name and case insensitive filesystem */
public final class C67373zR implements CallerContextable {
    public static final CallerContext A00;
    public static final KtCSuperShape0S4100000_I2 A01;
    public static final String __redex_internal_original_name = "CrossPostToFacebookUtil";

    public static final String A00(UserSession userSession) {
        String str;
        String A03;
        C04220Ms.A0B(userSession, 0);
        AnonymousClass266 A0g = AnonymousClass0wJ.A0Y(userSession).A0g();
        if (A0g == AnonymousClass266.A06 || A0g == AnonymousClass266.A05) {
            C29681z6 A002 = C35692Ol.A00(userSession);
            CallerContext callerContext = A00;
            if (A002.A05(callerContext, "ig_android_linking_cache_ig_to_fb_crossposting_eligibility_check") && A0I(userSession)) {
                AnonymousClass3VW A02 = C49222r2.A00(userSession).A02();
                String str2 = null;
                if (A02 != null) {
                    str = A02.A01;
                } else {
                    str = null;
                }
                if (C04220Ms.A0I(str, "FB_PAGE")) {
                    A03 = A02.A00;
                } else {
                    if (A02 != null) {
                        str2 = A02.A01;
                    }
                    if (C04220Ms.A0I(str2, "FB_USER")) {
                        String str3 = A02.A02;
                        if (!AnonymousClass8bQ.A0n(str3)) {
                            return str3;
                        }
                    }
                    A03 = C35692Ol.A00(userSession).A03(callerContext, "ig_android_linking_cache_ig_to_fb_crossposting_eligibility_check");
                }
                if (A03 != null) {
                    return A03;
                }
                return "";
            }
        }
        if (A0g == AnonymousClass266.A04) {
            return C67363zQ.A00(userSession).A01;
        }
        return "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(com.instagram.service.session.UserSession r8) {
        /*
            r0 = 0
            X.C04220Ms.A0B(r8, r0)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r8)
            X.266 r1 = r0.A0g()
            X.266 r0 = X.AnonymousClass266.A06
            java.lang.String r2 = ""
            if (r1 == r0) goto L_0x0016
            X.266 r0 = X.AnonymousClass266.A05
            if (r1 != r0) goto L_0x0071
        L_0x0016:
            X.1z6 r0 = X.C35692Ol.A00(r8)
            com.facebook.common.callercontext.CallerContext r7 = A00
            java.lang.String r6 = "ig_android_linking_cache_ig_to_fb_crossposting_eligibility_check"
            boolean r0 = r0.A05(r7, r6)
            if (r0 == 0) goto L_0x0071
            boolean r0 = A0I(r8)
            if (r0 == 0) goto L_0x0071
            X.49c r5 = X.C49222r2.A00(r8)
            X.3VW r4 = r5.A02()
            r1 = 0
            if (r4 == 0) goto L_0x006f
            java.lang.String r3 = r4.A01
        L_0x0037:
            java.lang.String r0 = "FB_PAGE"
            boolean r0 = X.C04220Ms.A0I(r3, r0)
            if (r0 != 0) goto L_0x0062
            if (r4 == 0) goto L_0x0043
            java.lang.String r1 = r4.A01
        L_0x0043:
            java.lang.String r0 = "FB_USER"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r4.A02
            boolean r0 = X.AnonymousClass8bQ.A0n(r0)
            if (r0 == 0) goto L_0x0062
        L_0x0053:
            X.1z6 r0 = X.C35692Ol.A00(r8)
            fxcache.model.FxCalAccount r0 = r0.A01(r7, r6)
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = r0.A04
        L_0x005f:
            if (r0 == 0) goto L_0x007c
            return r0
        L_0x0062:
            com.instagram.graphql.instagramschemagraphservices.CustomServiceDataObjectImpl$InlineCrossPostingCustomClientServiceData$DestinationMetadataServiceData r1 = r5.A01()
            if (r1 == 0) goto L_0x007c
            java.lang.String r0 = "destination_name"
            java.lang.String r0 = r1.getStringValue(r0)
            goto L_0x005f
        L_0x006f:
            r3 = r1
            goto L_0x0037
        L_0x0071:
            X.266 r0 = X.AnonymousClass266.A04
            if (r1 != r0) goto L_0x007c
            X.1j1 r0 = X.C67363zQ.A00(r8)
            java.lang.String r2 = r0.A02
            return r2
        L_0x007c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67373zR.A01(com.instagram.service.session.UserSession):java.lang.String");
    }

    public static final void A03(C11630kW r1, UserSession userSession, boolean z) {
        String str;
        C04220Ms.A0B(userSession, 0);
        C62423Zt.A02(userSession);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r1, userSession), "settings_ig_fb_story_sharing"), 2692);
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        A0I.A0T("to_value", str);
        A0I.Bb4();
    }

    public static final boolean A05(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        if (!A08(userSession) || !A06(userSession)) {
            return false;
        }
        return true;
    }

    public static final boolean A06(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        if ((A0D(userSession) || !AnonymousClass0wJ.A0Y(userSession).Apo()) && A0B(userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A07(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        AnonymousClass266 A012 = C04660Oo.A01(userSession);
        if (AnonymousClass266.A06 == A012) {
            return !AnonymousClass0wJ.A0Y(userSession).A3Z();
        }
        if (AnonymousClass266.A04 == A012) {
            return A0C(userSession);
        }
        if (AnonymousClass266.A05 != A012) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0015 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A08(com.instagram.service.session.UserSession r3) {
        /*
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            boolean r0 = X.C60343Oq.A01(r3)
            r2 = 0
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = A00(r3)
            boolean r0 = X.AnonymousClass8bQ.A0n(r0)
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r2 = 1
        L_0x0016:
            return r2
        L_0x0017:
            boolean r0 = A04(r3)
            if (r0 != 0) goto L_0x002f
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r3)
            X.266 r1 = r0.A0g()
            X.266 r0 = X.AnonymousClass266.A04
            if (r0 != r1) goto L_0x0036
            boolean r0 = A0C(r3)
            if (r0 == 0) goto L_0x0036
        L_0x002f:
            boolean r0 = A0B(r3)
            if (r0 == 0) goto L_0x0016
            goto L_0x0015
        L_0x0036:
            boolean r0 = A0G(r3)
            if (r0 != 0) goto L_0x002f
            boolean r0 = A0F(r3)
            if (r0 == 0) goto L_0x0016
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67373zR.A08(com.instagram.service.session.UserSession):boolean");
    }

    public static final boolean A0A(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        if (AnonymousClass0wJ.A0Y(userSession).Apo() || !A0E(userSession)) {
            return false;
        }
        return true;
    }

    public static final boolean A0D(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        if (C60343Oq.A01(userSession)) {
            return C18180wK.A1W(AnonymousClass8bQ.A0n(A02(userSession)) ? 1 : 0);
        }
        return C67363zQ.A0H(userSession);
    }

    public static final boolean A0E(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        AnonymousClass266 A0g = AnonymousClass0wJ.A0Y(userSession).A0g();
        if (A0g == AnonymousClass266.A06 || A0g == AnonymousClass266.A05) {
            return true;
        }
        return false;
    }

    public static final boolean A0H(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        if (AnonymousClass266.A06 == C04660Oo.A01(userSession) && A08(userSession) && !C67253zE.A02(userSession) && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36326674475787995L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0J(UserSession userSession, boolean z) {
        C04220Ms.A0B(userSession, 0);
        if (A0A(userSession)) {
            return A08(userSession);
        }
        C04620Ok r1 = C06810aP.A01;
        if (!C18200wM.A1X(userSession, r1)) {
            return A04(userSession);
        }
        if (C60343Oq.A01(userSession)) {
            if (AnonymousClass8bQ.A0n(A02(userSession))) {
                return false;
            }
        } else if (C67363zQ.A01(userSession).A00.length() <= 0) {
            return false;
        }
        if (!z || !A0K(r1.A01(userSession))) {
            return true;
        }
        return false;
    }

    static {
        CallerContext A002 = CallerContext.A00(C67373zR.class);
        A00 = A002;
        A01 = new KtCSuperShape0S4100000_I2(A002, "ig_android_ig_to_fb_crossposting", "ig_android_ig_to_fb_crossposting", "crossposting", "loading");
    }

    public static final boolean A0C(UserSession userSession) {
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36324222049460606L)) {
            AnonymousClass3BJ r0 = (AnonymousClass3BJ) AnonymousClass3LA.A01(userSession).AbO(A01);
            if (r0 == null || r0.A00 == null) {
                return false;
            }
        } else {
            String A17 = AnonymousClass0wJ.A0Y(userSession).A17();
            if (A17 == null || A17.length() == 0) {
                return false;
            }
        }
        return true;
    }

    public static final String A02(UserSession userSession) {
        String str;
        AnonymousClass266 A0g = AnonymousClass0wJ.A0Y(userSession).A0g();
        if ((A0g == AnonymousClass266.A06 || A0g == AnonymousClass266.A05) && A04(userSession) && A0I(userSession)) {
            AnonymousClass3VW A02 = C49222r2.A00(userSession).A02();
            if (A02 != null) {
                str = A02.A01;
            } else {
                str = null;
            }
            if (C04220Ms.A0I(str, "FB_PAGE")) {
                return A02.A00;
            }
        }
        if (A0g == AnonymousClass266.A04) {
            return C67363zQ.A00(userSession).A01;
        }
        return "";
    }

    public static boolean A04(UserSession userSession) {
        return C35692Ol.A00(userSession).A05(A00, "ig_android_linking_cache_ig_to_fb_crossposting_eligibility_check");
    }

    public static final boolean A09(UserSession userSession) {
        boolean A04;
        C04620Ok A0V = C18240wQ.A0V(userSession);
        boolean A2l = A0V.A01(userSession).A2l();
        if (A0A(userSession)) {
            A04 = A08(userSession);
        } else {
            A04 = A04(userSession);
        }
        if (A04) {
            return true;
        }
        if (!C18200wM.A1X(userSession, A0V) || !A0D(userSession) || !A2l || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36313952782780162L)) {
            return false;
        }
        return true;
    }

    public static final boolean A0B(UserSession userSession) {
        if (C60343Oq.A01(userSession)) {
            return true;
        }
        C04620Ok r1 = C06810aP.A01;
        C84024sQ A002 = C67303zK.A00(userSession, r1.A01(userSession));
        if (A002 == null || A002.AsH() == null || C18200wM.A0b(userSession, r1) == AnonymousClass266.A04) {
            return true;
        }
        C84524tI AsH = A002.AsH();
        if (AsH != null) {
            return AsH.BMs();
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final boolean A0F(UserSession userSession) {
        C04620Ok A0V = C18240wQ.A0V(userSession);
        AnonymousClass266 A0b = C18200wM.A0b(userSession, A0V);
        C84024sQ A002 = C67303zK.A00(userSession, A0V.A01(userSession));
        if (AnonymousClass266.A05 != A0b || A002 == null) {
            return false;
        }
        String A003 = C59123Jp.A00(A002);
        if ((A003 == null && (A003 = C59123Jp.A01(A002)) == null) || A003.length() == 0 || !A0I(userSession)) {
            return false;
        }
        return true;
    }

    public static final boolean A0G(UserSession userSession) {
        String A002;
        C04620Ok A0V = C18240wQ.A0V(userSession);
        AnonymousClass266 A0b = C18200wM.A0b(userSession, A0V);
        C84024sQ A003 = C67303zK.A00(userSession, A0V.A01(userSession));
        if (AnonymousClass266.A06 != A0b || !A0I(userSession) || A003 == null || (((A002 = C59123Jp.A00(A003)) == null && (A002 = C59123Jp.A01(A003)) == null) || A002.length() == 0)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r1.getBoolean(r0, false) == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0I(com.instagram.service.session.UserSession r4) {
        /*
            X.1tl r3 = X.AnonymousClass3WS.A01(r4)
            r2 = 0
            X.266 r0 = X.C04660Oo.A01(r4)
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0028
            r0 = 3
            if (r1 != r0) goto L_0x001d
            android.content.SharedPreferences r1 = r3.A00
            java.lang.String r0 = "creator_account_fb_destination_backfilling_completed"
        L_0x0017:
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x0026
        L_0x001d:
            X.49e r0 = X.C60333Op.A00(r4)
            boolean r1 = r0.A00
            r0 = 0
            if (r1 == 0) goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            return r0
        L_0x0028:
            android.content.SharedPreferences r1 = r3.A00
            java.lang.String r0 = "personal_account_fb_page_id_backfilling_completed"
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67373zR.A0I(com.instagram.service.session.UserSession):boolean");
    }

    public static final boolean A0K(User user) {
        String A17 = user.A17();
        if (((A17 == null || A17.length() == 0) && user.A3Z()) || user.A2j()) {
            return true;
        }
        return false;
    }
}
