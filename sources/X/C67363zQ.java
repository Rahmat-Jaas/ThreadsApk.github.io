package X;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.instagram.common.api.base.IDxACallbackShape2S1200000_1_I2;
import com.instagram.debug.devoptions.FXPFLinkageCacheDebugFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;
import fxcache.model.FxCalAccount;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3zQ  reason: invalid class name and case insensitive filesystem */
public final class C67363zQ implements CallerContextable {
    public static long A00 = -1;
    public static final CallerContext A01;
    public static final C145538kf A02 = C31155GhB.A00();
    public static final KtCSuperShape0S4100000_I2 A03;
    public static final String __redex_internal_original_name = "FacebookAccount";

    public static AnonymousClass1j1 A02(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return new AnonymousClass1j1(C62953bC.A02(userSession, "page_id"), C62953bC.A02(userSession, "page_name"), C62953bC.A01(userSession));
    }

    public static void A06(Intent intent, C10300i6 r4, C84214sk r5, int i) {
        boolean z;
        LoginClient$Result loginClient$Result;
        String str = null;
        if (!(intent == null || intent.getExtras() == null)) {
            Object obj = intent.getExtras().get("com.facebook.LoginFragment:Result");
            if ((obj instanceof LoginClient$Result) && (loginClient$Result = (LoginClient$Result) obj) != null) {
                LoginClient$Request loginClient$Request = loginClient$Result.A03;
                str = loginClient$Request.A01;
                z = loginClient$Request.A02;
                AnonymousClass2CD.A00(intent, new C66903yX(r4, r5, str, z), i);
            }
        }
        z = false;
        AnonymousClass2CD.A00(intent, new C66903yX(r4, r5, str, z), i);
    }

    public static void A0C(C10300i6 r9, Boolean bool, Integer num) {
        String str;
        String valueOf;
        CallerContext callerContext = A01;
        if (C62963bD.A03(callerContext, r9, "ig_android_token_cache_legacy_token_to_link")) {
            if (bool != null && (r9 instanceof UserSession)) {
                UserSession A022 = C05030Qo.A02(r9);
                AnonymousClass0wJ.A13(AnonymousClass3Zs.A00(A022), "token_has_manage_pages", bool.booleanValue());
            }
            String A012 = C62963bD.A01(callerContext, r9, "ig_android_token_cache_legacy_token_to_link");
            H1T A0N = AnonymousClass0wJ.A0N(r9);
            A0N.A0J("fb/store_token/");
            A0N.A0O("fb_access_token", A012);
            A0N.A0O("share_to_facebook", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            A0N.A0O("fb_has_publish_actions", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            A0N.A0O("suppress_facebook_linked_notification", "0");
            C18240wQ.A18(A0N);
            if (num != null) {
                A0N.A0O("send_credential_surface", String.valueOf(C49262r6.A00(num)));
            }
            C32165H8c A023 = A0N.A02();
            if (r9 != null && (r9 instanceof UserSession)) {
                UserSession A024 = C05030Qo.A02(r9);
                if (num != null) {
                    AnonymousClass264[] values = AnonymousClass264.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            valueOf = String.valueOf(C49262r6.A00(num));
                            break;
                        }
                        AnonymousClass264 r1 = values[i];
                        if (r1.A00 != null && r1.A00.equals(num)) {
                            valueOf = r1.A00();
                            break;
                        }
                        i++;
                    }
                } else {
                    valueOf = null;
                }
                A023.A00 = new IDxACallbackShape2S1200000_1_I2(A024, (Object) null, valueOf, 7);
            }
            A02.schedule(A023);
            if (TextUtils.isEmpty(A012)) {
                boolean equals = "".equals(A012);
                if (num != null) {
                    switch (num.intValue()) {
                        case 1:
                            str = "LOGIN";
                            break;
                        case 2:
                            str = "FIND_FRIEND_NUX";
                            break;
                        case 3:
                            str = "AYSF_FB_CONNECT";
                            break;
                        case 4:
                            str = "BUSINESS_PAGE_LOGIN";
                            break;
                        case 5:
                            str = "FETCH_FB_FRIEND_LIST";
                            break;
                        case 6:
                            str = "DISCOVER_FRIEND_LIST";
                            break;
                        case 7:
                            str = "INVITE_FRIEND_LIST";
                            break;
                        case 8:
                            str = "FB_GRAPHQL_AUTHENTICATION";
                            break;
                        case 9:
                            str = "DOGFOODER";
                            break;
                        case 10:
                            str = "SHARE";
                            break;
                        case 11:
                            str = "MANAGED_PAGES";
                            break;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                            str = "FACEBOOK_ADVANCED_OPTIONS";
                            break;
                        case 13:
                            str = "FB_LOGIN";
                            break;
                        case 14:
                            str = "PROFILE_PICTURE";
                            break;
                        case 15:
                            str = "AD_DETAIL";
                            break;
                        case 16:
                            str = "NUX_MAIN_SCREEN";
                            break;
                        case LangUtils.HASH_SEED /*17*/:
                            str = "MEGAPHONE";
                            break;
                        case 18:
                            str = "BUSINESS_BACK_TO_PERSONAL";
                            break;
                        case 19:
                            str = "CLAIM_PAGE";
                            break;
                        case 20:
                            str = "DELTA_CHALLENGE";
                            break;
                        case 21:
                            str = "REEL_SETTINGS";
                            break;
                        case 22:
                            str = "SHARE_ADVANCED_SETTINGS";
                            break;
                        case 23:
                            str = "REEL_VIEWER_SELF_STORY";
                            break;
                        case 24:
                            str = "MAIN_FEED_FB_SESSION_CHECK";
                            break;
                        case 25:
                            str = "FB_SESSION_CHECK";
                            break;
                        case Rfc3492Idn.tmax /*26*/:
                            str = "AD_CREATION";
                            break;
                        case 27:
                            str = "BUSINESS_CONNECT_FB_PAGE";
                            break;
                        case 28:
                            str = "BUSINESS_EDIT_PROFILE";
                            break;
                        case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                            str = "IGTV_CROSSPOST";
                            break;
                        case 30:
                            str = "UNLINK";
                            break;
                        case 31:
                            str = "REAUTH";
                            break;
                        case 32:
                            str = "QUICK_PROMOTION";
                            break;
                        case 33:
                            str = "TAGGING_SEARCH_FBC_CTA";
                            break;
                        case 34:
                            str = "DIRECT_INBOX_TAB";
                            break;
                        default:
                            str = "UNKNOWN";
                            break;
                    }
                } else {
                    str = "null";
                }
                C10680ik r2 = new C10680ik(r9);
                r2.A02 = "FacebookAccountModule";
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r2.A00(), "ig_android_fb_linking_null_token"), 778);
                if (AnonymousClass0wJ.A1U(A0I)) {
                    A0I.A0T("referrer", str);
                    A0I.A0Q("token_empty_string", C18210wN.A0R(A0I, Boolean.valueOf(r9 instanceof UserSession), "is_logged_in", equals));
                    A0I.A0Q("fb4a_installed", Boolean.valueOf(AnonymousClass0wJ.A1W(C63443hU.A00())));
                    A0I.Bb4();
                }
                C10450iM.A04("fb_account_linking_null_token", C18180wK.A0j("referrer=%s, logged_in=%b, fb4a_installed=%b", new Object[]{str, Boolean.valueOf(r9 instanceof UserSession), Boolean.valueOf(AnonymousClass0wJ.A1W(C63443hU.A00()))}), C63173fJ.A02(AnonymousClass0TJ.A05, 18580917580728312L).intValue());
            }
        }
    }

    static {
        CallerContext A002 = CallerContext.A00(C67363zQ.class);
        A01 = A002;
        A03 = new KtCSuperShape0S4100000_I2(A002, "ig_android_ig_to_fb_crossposting", "ig_android_ig_to_fb_crossposting", "crossposting", "loading");
    }

    public static AnonymousClass1j1 A00(UserSession userSession) {
        AnonymousClass3EH r0;
        String str;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36324222049460606L)) {
            C84134sb A012 = AnonymousClass3LA.A01(userSession);
            KtCSuperShape0S4100000_I2 ktCSuperShape0S4100000_I2 = A03;
            AnonymousClass3BJ r1 = (AnonymousClass3BJ) A012.AbO(ktCSuperShape0S4100000_I2);
            if (r1 == null || (r0 = r1.A00) == null || (str = r1.A02) == null) {
                return new AnonymousClass1j1("", "", "");
            }
            String str2 = (String) r0.A00(ktCSuperShape0S4100000_I2, userSession);
            if (str2 == null) {
                str2 = "";
            }
            return new AnonymousClass1j1(str2, str, "");
        }
        C04620Ok A0V = C18240wQ.A0V(userSession);
        if (AnonymousClass266.A04 == C18200wM.A0b(userSession, A0V) && C67373zR.A0C(userSession)) {
            String A0e = C18240wQ.A0e(userSession, A0V);
            A0e.getClass();
            String A18 = A0V.A01(userSession).A18();
            A18.getClass();
            return new AnonymousClass1j1(A0e, A18, "");
        } else if (C18200wM.A1X(userSession, A0V)) {
            return new AnonymousClass1j1(C62953bC.A02(userSession, "biz_page_id"), C62953bC.A02(userSession, "biz_page_name"), C62953bC.A02(userSession, "biz_page_access_token"));
        } else {
            return A02(userSession);
        }
    }

    public static void A05() {
        synchronized (C62603aO.class) {
            C62603aO.A00.clear();
        }
    }

    public static void A07(Fragment fragment, C10300i6 r8, AnonymousClass22w r9, String str, List list) {
        String str2;
        boolean z = r8 instanceof UserSession;
        if (!z || !C05030Qo.A02(r8).hasEnded()) {
            boolean A032 = C67253zE.A03(r8, r9);
            C35772Ot.A00(r8, "facebook_auth_start", str, (HashMap) null, A032);
            AnonymousClass3XS A012 = AnonymousClass3XS.A01();
            if (z) {
                str2 = C05030Qo.A02(r8).getUserId();
            } else {
                str2 = "fbsdk_logged_out_id";
            }
            LoginClient$Request A002 = AnonymousClass3XS.A00(str2, list);
            A002.A01 = str;
            A002.A02 = A032;
            A002.A00 = r9;
            C67593zo r5 = new C67593zo(fragment);
            A012.A00 = A002;
            Intent A0B = C18230wP.A0B();
            A0B.setClass(C60943Re.A00, FacebookActivity.class);
            Bundle A06 = C18180wK.A06();
            A06.putParcelable("Request", A002);
            A0B.putExtras(A06);
            try {
                if (r5.Cv3(A0B, 64206)) {
                    return;
                }
            } catch (ActivityNotFoundException unused) {
            }
            AnonymousClass4VW r0 = new AnonymousClass4VW("Log in attempt failed: LoginActivity could not be started");
            A012.A00 = null;
            throw r0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r8 == X.AnonymousClass006.A05) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A09(com.facebook.AccessToken r6, X.C10300i6 r7, java.lang.Integer r8) {
        /*
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r8 == r0) goto L_0x0009
            java.lang.Integer r0 = X.AnonymousClass006.A05
            r5 = 0
            if (r8 != r0) goto L_0x000a
        L_0x0009:
            r5 = 1
        L_0x000a:
            java.lang.String r2 = r6.A02
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0058
            java.lang.String r4 = r6.A03
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0058
            java.lang.String r3 = "ig_android_token_cache_legacy_token_to_link"
            com.facebook.common.callercontext.CallerContext r1 = A01
            if (r5 == 0) goto L_0x005e
            java.lang.String r0 = X.C62433Zv.A00(r1, r7, r3)
        L_0x0024:
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0058
            if (r5 == 0) goto L_0x0059
            java.lang.String r0 = X.C62433Zv.A01(r1, r7, r3)
        L_0x0030:
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0058
            A0A(r6, r7, r5)
            java.util.Set r1 = r6.A07
            java.lang.String r0 = "manage_pages"
            boolean r0 = r1.contains(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            A0C(r7, r0, r8)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0058
            X.KHr r1 = X.C38040KHr.A01
            X.45J r0 = new X.45J
            r0.<init>(r2)
            r1.CWx(r0)
        L_0x0058:
            return
        L_0x0059:
            java.lang.String r0 = X.C62963bD.A02(r1, r7, r3)
            goto L_0x0030
        L_0x005e:
            java.lang.String r0 = X.C62963bD.A01(r1, r7, r3)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67363zQ.A09(com.facebook.AccessToken, X.0i6, java.lang.Integer):void");
    }

    public static void A0A(AccessToken accessToken, C10300i6 r8, boolean z) {
        String A012;
        String str = accessToken.A02;
        if (!TextUtils.isEmpty(str)) {
            CallerContext callerContext = A01;
            if (z) {
                A012 = C62433Zv.A00(callerContext, r8, "ig_android_token_cache_fx_internal");
            } else {
                A012 = C62963bD.A01(callerContext, r8, "ig_android_token_cache_fx_internal");
            }
            if (!str.equals(A012)) {
                if (r8 instanceof UserSession) {
                    UserSession A022 = C05030Qo.A02(r8);
                    C62603aO.A01(A022.getUserId()).A02(accessToken);
                    UserSession A023 = C05030Qo.A02(r8);
                    AnonymousClass0wJ.A13(AnonymousClass3Zs.A00(A023), "token_has_manage_pages", accessToken.A07.contains("manage_pages"));
                    C35692Ol.A00(A022).A04(callerContext, (C83954sG) null, FXPFLinkageCacheDebugFragment.callerName);
                } else {
                    C49332rD.A00(r8).A00 = accessToken;
                }
                if (!TextUtils.isEmpty(str)) {
                    C38040KHr.A01.CWx(new AnonymousClass45J(str));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r6 == X.AnonymousClass006.A05) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0D(X.C10300i6 r4, java.lang.Boolean r5, java.lang.Integer r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r6 == r0) goto L_0x0009
            java.lang.Integer r0 = X.AnonymousClass006.A05
            r3 = 0
            if (r6 != r0) goto L_0x000a
        L_0x0009:
            r3 = 1
        L_0x000a:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x003d
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x003d
            java.lang.String r2 = "ig_android_token_cache_legacy_token_to_link"
            com.facebook.common.callercontext.CallerContext r1 = A01
            if (r3 == 0) goto L_0x0053
            java.lang.String r0 = X.C62433Zv.A00(r1, r4, r2)
        L_0x0020:
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x003d
            if (r3 == 0) goto L_0x004e
            java.lang.String r0 = X.C62433Zv.A01(r1, r4, r2)
        L_0x002c:
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x003d
            com.facebook.AccessToken r0 = new com.facebook.AccessToken
            r0.<init>(r7, r8)
            A0A(r0, r4, r3)
            A0C(r4, r5, r6)
        L_0x003d:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x004d
            X.KHr r1 = X.C38040KHr.A01
            X.45J r0 = new X.45J
            r0.<init>(r7)
            r1.CWx(r0)
        L_0x004d:
            return
        L_0x004e:
            java.lang.String r0 = X.C62963bD.A02(r1, r4, r2)
            goto L_0x002c
        L_0x0053:
            java.lang.String r0 = X.C62963bD.A01(r1, r4, r2)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67363zQ.A0D(X.0i6, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String):void");
    }

    public static void A0E(C10300i6 r5, boolean z, boolean z2, boolean z3) {
        String A012;
        if (z) {
            Integer num = AnonymousClass006.A01;
            CallerContext callerContext = A01;
            if (z3) {
                A012 = C62433Zv.A00(callerContext, r5, "ig_android_token_cache_legacy_token_to_unlink");
            } else {
                A012 = C62963bD.A01(callerContext, r5, "ig_android_token_cache_legacy_token_to_unlink");
            }
            H1T h1t = new H1T(r5);
            h1t.A0F(num);
            h1t.A0J("fb/clear_token/");
            h1t.A0O("fb_access_token", A012);
            h1t.A0O("share_to_facebook", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            h1t.A0O("fb_has_publish_actions", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            h1t.A0O("suppress_facebook_linked_notification", "0");
            C32165H8c A0T = AnonymousClass0wJ.A0T(h1t, C85814vo.class, AnonymousClass3Za.class);
            if (r5 != null && (r5 instanceof UserSession)) {
                A0T.A00 = new IDxACallbackShape2S1200000_1_I2(C05030Qo.A02(r5), (Object) null, (String) null, 7);
            }
            A02.schedule(A0T);
        } else if (z2 && (r5 instanceof UserSession)) {
            C35692Ol.A00(C05030Qo.A02(r5)).A04(A01, (C83954sG) null, "ig_android_linking_cache_legacy_unlink_cache_refresh");
        }
        boolean z4 = r5 instanceof UserSession;
        if (z4) {
            UserSession A022 = C05030Qo.A02(r5);
            boolean A04 = C62953bC.A04(A022);
            if (C05030Qo.A04(r5) != null) {
                C18190wL.A11(AnonymousClass3Zs.A02(C05030Qo.A04(r5)));
            }
            if (!z && A04) {
                C62953bC.A03(A022, true);
            }
        } else {
            A05();
            C49332rD.A00(r5).A00 = null;
        }
        A05();
        if (z4) {
            AnonymousClass3LY.A00(C05030Qo.A02(r5));
        }
    }

    public static AnonymousClass1j1 A01(UserSession userSession) {
        String A002;
        String str;
        String str2;
        boolean equals;
        String str3;
        AnonymousClass266 A012 = C04660Oo.A01(userSession);
        if (A012 == AnonymousClass266.A06) {
            if (C67373zR.A0G(userSession)) {
                C84024sQ A003 = C67303zK.A00(userSession, AnonymousClass0wJ.A0Y(userSession));
                A003.getClass();
                A002 = C59123Jp.A00(A003);
                C84044sS AsG = A003.AsG();
                if (AsG != null) {
                    str2 = AsG.getName();
                } else {
                    str2 = null;
                }
                if (!(A002 == null || str2 == null)) {
                    C04220Ms.A0B(userSession, 0);
                    if (A002.equals(C62953bC.A02(userSession, "page_id"))) {
                        equals = C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36311895493313282L);
                    }
                    str3 = "";
                    return new AnonymousClass1j1(A002, str2, str3);
                }
            }
            return A02(userSession);
        } else if (A012 == AnonymousClass266.A04) {
            return A00(userSession);
        } else {
            if (A012 == AnonymousClass266.A05 && C67373zR.A0F(userSession)) {
                C84024sQ A004 = C67303zK.A00(userSession, AnonymousClass0wJ.A0Y(userSession));
                A004.getClass();
                A002 = C59123Jp.A00(A004);
                C84044sS AsG2 = A004.AsG();
                if (AsG2 != null) {
                    str = AsG2.getName();
                } else {
                    str = null;
                }
                if (!(A002 == null || str2 == null)) {
                    C04220Ms.A0B(userSession, 0);
                    equals = A002.equals(C62953bC.A02(userSession, "page_id"));
                }
            }
            return A02(userSession);
        }
        if (equals) {
            str3 = C62953bC.A01(userSession);
            return new AnonymousClass1j1(A002, str2, str3);
        }
        str3 = "";
        return new AnonymousClass1j1(A002, str2, str3);
    }

    public static String A03(UserSession userSession) {
        String str;
        if (A0H(userSession)) {
            return A01(userSession).A01;
        }
        if (C67373zR.A0G(userSession) || C67373zR.A0F(userSession)) {
            C84024sQ A002 = C67303zK.A00(userSession, AnonymousClass0wJ.A0Y(userSession));
            String A003 = C59123Jp.A00(A002);
            if (A003 == null) {
                A003 = C59123Jp.A01(A002);
            }
            A003.getClass();
            return A003;
        }
        FxCalAccount A012 = C35692Ol.A00(userSession).A01(A01, FXPFLinkageCacheDebugFragment.callerName);
        if (A012 == null || (str = A012.A05) == null) {
            return "";
        }
        return str;
    }

    public static String A04(UserSession userSession) {
        String str;
        FxCalAccount A012;
        String str2;
        if (A0H(userSession)) {
            str2 = A01(userSession).A02;
        } else if (C67373zR.A0G(userSession) || C67373zR.A0F(userSession)) {
            C84024sQ A002 = C67303zK.A00(userSession, AnonymousClass0wJ.A0Y(userSession));
            if (A002 != null) {
                C84044sS AsG = A002.AsG();
                if (AsG != null) {
                    str = AsG.getName();
                } else {
                    C84524tI AsH = A002.AsH();
                    if (AsH != null) {
                        str = AsH.getName();
                    }
                }
                str.getClass();
                return str;
            }
            str = null;
            str.getClass();
            return str;
        } else {
            C29681z6 A003 = C35692Ol.A00(userSession);
            CallerContext callerContext = A01;
            if (A003.A05(callerContext, FXPFLinkageCacheDebugFragment.callerName) && (A012 = C35692Ol.A00(userSession).A01(callerContext, FXPFLinkageCacheDebugFragment.callerName)) != null) {
                str2 = A012.A04;
            }
            return "";
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public static void A08(Fragment fragment, C10300i6 r4, AnonymousClass264 r5, C29771zH r6) {
        A07(fragment, r4, C49242r4.A00(r5), r5.A00(), r6.A00);
    }

    public static void A0B(AccessToken accessToken, UserSession userSession) {
        C62603aO.A01(userSession.getUserId()).A02(accessToken);
    }

    public static void A0F(UserSession userSession, AnonymousClass1j1 r6) {
        C28161tl A012 = AnonymousClass3WS.A01(userSession);
        String str = r6.A01;
        C04220Ms.A0B(str, 0);
        C18180wK.A0v(C28161tl.A02(A012), "linked_fb_page_id", str);
        AnonymousClass0wJ.A13(AnonymousClass3Zs.A00(userSession).putString("biz_page_access_token", r6.A00).putString("biz_page_id", str).putString("biz_page_name", r6.A02), "token_has_manage_pages", true);
    }

    public static void A0G(String str) {
        C18190wL.A11(AnonymousClass3Zs.A02(str));
        A05();
    }

    public static boolean A0H(UserSession userSession) {
        return C18210wN.A1U(A01(userSession).A01);
    }
}
