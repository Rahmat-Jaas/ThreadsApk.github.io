package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;
import java.util.AbstractMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.3zL  reason: invalid class name and case insensitive filesystem */
public final class C67313zL implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C67313zL.class);
    public static final AtomicLong A01 = new AtomicLong();
    public static final String __redex_internal_original_name = "CompanyIdentitySwitcherHelper";

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0164, code lost:
        if (r0 != false) goto L_0x0166;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A01(android.content.Context r13, com.instagram.service.session.UserSession r14) {
        /*
            X.0BO r0 = r14.multipleAccountHelper
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            java.util.HashSet r4 = X.C18200wM.A0u()
            X.0RL r0 = r0.A00
            r3 = 0
            java.util.List r0 = r0.A04(r3)
            java.lang.String r9 = r14.getUserId()
            java.util.Iterator r12 = r0.iterator()
        L_0x0019:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0081
            com.instagram.user.model.User r2 = X.C18220wO.A0c(r12)
            int r0 = r2.A01()
            if (r0 <= 0) goto L_0x007e
            com.google.common.collect.ImmutableMap r1 = r2.A07()
            int r0 = r2.A01()
            java.lang.CharSequence r0 = X.AnonymousClass3RW.A00(r13, r1, r0)
            java.lang.String r10 = r0.toString()
        L_0x0039:
            java.lang.String r11 = r2.getId()
            boolean r0 = r11.equals(r9)
            if (r0 == 0) goto L_0x007b
            java.lang.String r8 = "CURRENT"
        L_0x0045:
            r4.add(r11)
            java.lang.String r7 = r2.BK7()
            r2.B4M()
            java.lang.String r6 = X.C18250wR.A0a(r2)
            int r0 = r2.A01()
            java.lang.String r2 = java.lang.Integer.toString(r0)
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            A05(r11, r8, r7, r1)
            if (r6 == 0) goto L_0x0069
            java.lang.String r0 = "company_switcher_row_profile_pic"
            r1.put(r0, r6)
        L_0x0069:
            if (r10 == 0) goto L_0x0070
            java.lang.String r0 = "company_switcher_row_user_badge_text"
            r1.put(r0, r10)
        L_0x0070:
            if (r2 == 0) goto L_0x0077
            java.lang.String r0 = "company_switcher_row_user_badge_count"
            r1.put(r0, r2)
        L_0x0077:
            r5.add(r1)
            goto L_0x0019
        L_0x007b:
            java.lang.String r8 = "LOGGED_IN"
            goto L_0x0045
        L_0x007e:
            java.lang.String r10 = ""
            goto L_0x0039
        L_0x0081:
            X.3Yv r0 = X.C62353Yv.A00(r14)
            java.util.HashMap r0 = r0.A00
            com.google.common.collect.ImmutableList r0 = X.C18240wQ.A0J(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x008f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00db
            java.lang.Object r2 = r8.next()
            X.3H7 r2 = (X.AnonymousClass3H7) r2
            java.lang.String r7 = r2.A00()
            boolean r0 = r4.contains(r7)
            if (r0 != 0) goto L_0x008f
            r4.add(r7)
            java.lang.String r6 = r2.A01()
            X.37A r0 = r2.A00
            com.instagram.user.model.MicroUserDict r0 = r0.A01
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.common.typedurl.ImageUrl r0 = r0.A04
            if (r0 == 0) goto L_0x00d9
            X.37A r0 = r2.A00
            com.instagram.user.model.MicroUserDict r0 = r0.A01
            X.C04220Ms.A0B(r0, r1)
            com.instagram.common.typedurl.ImageUrl r0 = r0.A04
            java.lang.String r2 = r0.getUrl()
        L_0x00c5:
            java.lang.String r0 = "DEFERRED_CHILD"
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            A05(r7, r0, r6, r1)
            if (r2 == 0) goto L_0x00d5
            java.lang.String r0 = "company_switcher_row_profile_pic"
            r1.put(r0, r2)
        L_0x00d5:
            r5.add(r1)
            goto L_0x008f
        L_0x00d9:
            r2 = r3
            goto L_0x00c5
        L_0x00db:
            X.3Yv r0 = X.C62353Yv.A00(r14)
            java.util.HashMap r0 = r0.A00
            com.google.common.collect.ImmutableList r0 = X.C18240wQ.A0J(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x00e9:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0135
            java.lang.Object r2 = r8.next()
            X.3H7 r2 = (X.AnonymousClass3H7) r2
            java.lang.String r7 = r2.A00()
            boolean r0 = r4.contains(r7)
            if (r0 != 0) goto L_0x00e9
            r4.add(r7)
            java.lang.String r6 = r2.A01()
            X.37A r0 = r2.A00
            com.instagram.user.model.MicroUserDict r0 = r0.A01
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.instagram.common.typedurl.ImageUrl r0 = r0.A04
            if (r0 == 0) goto L_0x0133
            X.37A r0 = r2.A00
            com.instagram.user.model.MicroUserDict r0 = r0.A01
            X.C04220Ms.A0B(r0, r1)
            com.instagram.common.typedurl.ImageUrl r0 = r0.A04
            java.lang.String r2 = r0.getUrl()
        L_0x011f:
            java.lang.String r0 = "DEFERRED_RECOVERED"
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            A05(r7, r0, r6, r1)
            if (r2 == 0) goto L_0x012f
            java.lang.String r0 = "company_switcher_row_profile_pic"
            r1.put(r0, r2)
        L_0x012f:
            r5.add(r1)
            goto L_0x00e9
        L_0x0133:
            r2 = r3
            goto L_0x011f
        L_0x0135:
            boolean r0 = X.C63793iM.A02()
            if (r0 != 0) goto L_0x01d8
            boolean r0 = X.C63793iM.A03()
            if (r0 != 0) goto L_0x0166
            boolean r0 = X.C63793iM.A0A(r14)
            if (r0 != 0) goto L_0x01d8
            boolean r0 = X.C63793iM.A04()
            if (r0 == 0) goto L_0x01b2
            boolean r0 = X.C63793iM.A03()
            if (r0 != 0) goto L_0x0166
            boolean r0 = X.C63793iM.A04()
            if (r0 == 0) goto L_0x01d8
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 18307285214370789(0x410a6100011be5, double:1.8958232940131227E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)
        L_0x0164:
            if (r0 == 0) goto L_0x01d8
        L_0x0166:
            X.3hk r1 = X.C63533hk.A02(r14)
            java.util.List r0 = r1.A08(r14)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01d8
            java.util.List r0 = r1.A07()
            java.util.Iterator r8 = r0.iterator()
        L_0x017e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01d8
            X.3ac r1 = X.C18250wR.A0Q(r8)
            java.lang.String r0 = r1.A05
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x017e
            java.lang.String r7 = r1.A05
            java.lang.String r6 = r1.A06
            com.instagram.common.typedurl.ImageUrl r0 = r1.A02
            if (r0 == 0) goto L_0x01b0
            java.lang.String r2 = r0.getUrl()
        L_0x019c:
            java.lang.String r0 = "LOGGED_OUT"
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            A05(r7, r0, r6, r1)
            if (r2 == 0) goto L_0x01ac
            java.lang.String r0 = "company_switcher_row_profile_pic"
            r1.put(r0, r2)
        L_0x01ac:
            r5.add(r1)
            goto L_0x017e
        L_0x01b0:
            r2 = r3
            goto L_0x019c
        L_0x01b2:
            boolean r0 = X.C63793iM.A05()
            if (r0 == 0) goto L_0x0166
            boolean r0 = X.C63793iM.A02()
            if (r0 != 0) goto L_0x01d8
            boolean r0 = X.C63793iM.A03()
            if (r0 != 0) goto L_0x01d8
            boolean r0 = X.C63793iM.A0A(r14)
            if (r0 != 0) goto L_0x01d8
            r0 = 18306671034702330(0x4109d2000b19fa, double:1.895580537953475E-307)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = X.C63793iM.A0F(r0)
            goto L_0x0164
        L_0x01d8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67313zL.A01(android.content.Context, com.instagram.service.session.UserSession):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0072, code lost:
        if (((r0.longValue() / 1000) - r1) >= 0) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.AnonymousClass3D7 r14, com.instagram.service.session.UserSession r15) {
        /*
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r0 = 18587317082328819(0x42091100050ef3, double:2.0065065945721745E-307)
            java.lang.Long r0 = X.C63173fJ.A02(r4, r0)
            long r12 = r0.longValue()
            java.lang.String r5 = "com.bloks.www.fx.company-identity-switcher.v1"
            java.lang.String r1 = "bloks/apps/"
            java.lang.String r0 = "/"
            java.lang.String r11 = X.AnonymousClass00U.A0V(r1, r5, r0)
            java.util.Map r2 = r14.A06
            java.util.HashMap r0 = X.C37067Jjv.A02(r2)
            java.lang.String r0 = X.AnonymousClass2G0.A00(r0, r5, r5)
            java.lang.String r1 = "loaded_screen_query"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r1)
            java.lang.String r3 = X.C32062H3c.A01(r0)
            X.Ifn r8 = X.C34819Ifn.A05
            java.util.HashMap r0 = X.C37067Jjv.A02(r2)
            java.lang.String r0 = X.AnonymousClass2G0.A00(r0, r5, r5)
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r1)
            java.lang.String r10 = X.C32062H3c.A01(r0)
            r6 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r6
            java.lang.Integer r9 = X.AnonymousClass006.A00
            boolean r10 = r8.A03(r9, r10, r11, r12)
            r0 = 19150267035418799(0x440911000000af, double:2.229013980291935E-307)
            X.0cE r2 = X.C63173fJ.A00(r0)
            if (r2 != 0) goto L_0x00c2
            double r0 = X.AnonymousClass0U4.A00(r0)
        L_0x0057:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            long r1 = r0.longValue()
            X.Ifn r0 = X.C34819Ifn.A05
            java.lang.Long r0 = r0.A01(r9, r3)
            if (r0 == 0) goto L_0x0074
            long r4 = r0.longValue()
            long r4 = r4 / r6
            long r4 = r4 - r1
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r9 = 1
            if (r0 < 0) goto L_0x0075
        L_0x0074:
            r9 = 0
        L_0x0075:
            java.lang.String r6 = X.AnonymousClass3QU.A00()
            X.D2R r0 = X.D2R.A15
            java.lang.String r8 = r0.toString()
            android.content.SharedPreferences r0 = X.C08340dC.A01(r8)
            java.lang.String r5 = "switcher_theme"
            r7 = 0
            java.lang.String r0 = r0.getString(r5, r7)
            boolean r0 = r6.equals(r0)
            r4 = r0 ^ 1
            java.util.Locale r0 = X.C31103Gfm.A02()
            java.lang.String r2 = r0.toString()
            android.content.SharedPreferences r0 = X.C08340dC.A01(r8)
            java.lang.String r1 = "switcher_locale"
            java.lang.String r0 = r0.getString(r1, r7)
            boolean r0 = r2.equals(r0)
            r0 = r0 ^ 1
            if (r10 != 0) goto L_0x00b0
            if (r9 != 0) goto L_0x00b0
            if (r4 != 0) goto L_0x00b0
            if (r0 == 0) goto L_0x00c1
        L_0x00b0:
            A04(r14, r15, r3)
            android.content.SharedPreferences$Editor r0 = X.C18220wO.A0C(r8)
            X.C18180wK.A0v(r0, r5, r6)
            android.content.SharedPreferences$Editor r0 = X.C18220wO.A0C(r8)
            X.C18180wK.A0v(r0, r1, r2)
        L_0x00c1:
            return
        L_0x00c2:
            double r0 = r2.Adv(r4, r0)
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67313zL.A03(X.3D7, com.instagram.service.session.UserSession):void");
    }

    public static void A04(AnonymousClass3D7 r5, UserSession userSession, String str) {
        try {
            new C37043JjO(str).A03(C34819Ifn.A05.A00);
        } catch (IllegalStateException unused) {
        }
        C210718u r4 = new C210718u(userSession);
        M4x.A01(r5.A03, r4, "com.bloks.www.fx.company-identity-switcher.v1", r5.A02, C37067Jjv.A02(r5.A06));
    }

    public static void A05(Object obj, Object obj2, Object obj3, AbstractMap abstractMap) {
        abstractMap.put("company_switcher_row_userid", obj);
        abstractMap.put("company_switcher_row_user_type", obj2);
        if (obj3 != null) {
            abstractMap.put("company_switcher_row_username", obj3);
        }
    }

    public static AnonymousClass3D7 A00(Context context, UserSession userSession) {
        String str;
        AnonymousClass3FH A0N = C18220wO.A0N(userSession);
        AnonymousClass3D7 r5 = new AnonymousClass3D7(context);
        if (A0N != null) {
            str = A0N.A01;
        } else {
            str = "";
        }
        r5.A06.put("family_device_id", str);
        AnonymousClass0TJ r4 = AnonymousClass0TJ.A05;
        r5.A01 = C63173fJ.A02(r4, 18587317082328819L).longValue();
        r5.A00 = C63173fJ.A02(r4, 18587317082328819L).longValue();
        return r5;
    }

    public static boolean A06(UserSession userSession) {
        boolean z = false;
        if (!C63793iM.A02()) {
            if (C63793iM.A03()) {
                z = true;
            } else if (!C63793iM.A0A(userSession) && C63793iM.A04()) {
                z = C63173fJ.A05(AnonymousClass0TJ.A05, 18307285214567400L);
            }
        }
        if (z) {
            if (AnonymousClass30T.A00.A00(AnonymousClass00U.A0L(AnonymousClass2G0.A00(AnonymousClass0wJ.A0y(), "com.bloks.www.fx.company-identity-switcher.v1", "com.bloks.www.fx.company-identity-switcher.v1"), "loaded_screen_query")) == null) {
                return false;
            }
            return true;
        } else if (C63793iM.A02()) {
            return true;
        } else {
            if (C63793iM.A03() || (!C63793iM.A0A(userSession) && C63793iM.A04() && C63173fJ.A05(AnonymousClass0TJ.A05, 18307285214501863L))) {
                return C34819Ifn.A05.A04(C32062H3c.A01(AnonymousClass00U.A0L(AnonymousClass2G0.A00(AnonymousClass0wJ.A0y(), "com.bloks.www.fx.company-identity-switcher.v1", "com.bloks.www.fx.company-identity-switcher.v1"), "loaded_screen_query")));
            }
            return true;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00be  */
    public static void A02(android.content.Context r34, X.C319629q r35, com.instagram.service.session.UserSession r36, java.lang.Integer r37, boolean r38) {
        /*
            r15 = 1
            r8 = r36
            r4 = r37
            if (r37 == 0) goto L_0x00c1
            boolean r0 = X.C63793iM.A0B(r8)
            int r2 = X.C59363Kn.A00(r8)
            if (r0 == 0) goto L_0x0016
            java.lang.Integer r0 = X.AnonymousClass006.A00
            r1 = 1
            if (r4 == r0) goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            X.3Tg r0 = X.C550931s.A01
            int r0 = r0.A01(r8, r1)
            if (r2 > 0) goto L_0x0021
            if (r0 <= 0) goto L_0x00c1
        L_0x0021:
            r23 = 1
        L_0x0023:
            boolean r3 = X.C63793iM.A0D(r8)
            boolean r0 = X.C63793iM.A0B(r8)
            int r2 = X.C59363Kn.A00(r8)
            if (r0 == 0) goto L_0x0036
            java.lang.Integer r0 = X.AnonymousClass006.A00
            r1 = 1
            if (r4 == r0) goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            X.3Tg r0 = X.C550931s.A01
            int r0 = r0.A01(r8, r1)
            if (r3 == 0) goto L_0x0040
            int r2 = r2 + r0
        L_0x0040:
            long r0 = (long) r2
        L_0x0041:
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r15)
            boolean r24 = A06(r8)
            boolean r25 = X.C63793iM.A01()
            java.lang.String r2 = r8.getUserId()
            java.lang.Long r19 = X.AnonymousClass0wJ.A0d(r2)
            java.lang.String r2 = r8.getUserId()
            java.lang.Long r20 = X.AnonymousClass0wJ.A0d(r2)
            r16 = r35
            r17 = r8
            r21 = r0
            java.util.HashMap r3 = X.C63453hV.A00(r16, r17, r18, r19, r20, r21, r23, r24, r25)
            java.lang.String r9 = "entry_point"
            java.lang.Object r0 = r3.get(r9)
            if (r0 == 0) goto L_0x00be
            java.lang.String r7 = X.C18240wQ.A0f(r9, r3)
        L_0x0073:
            X.C04220Ms.A0B(r7, r15)
            X.01V r4 = X.AnonymousClass01V.A0p
            X.C04220Ms.A06(r4)
            r6 = 857814227(0x332134d3, float:3.7533777E-8)
            r4.markerStart(r6)
            java.lang.String r2 = X.C63453hV.A06
            r5 = 0
            r1 = 9
            r0 = 25
            java.lang.String r0 = X.C61943Wl.A01(r5, r1, r0)
            r4.markerAnnotate((int) r6, (java.lang.String) r0, (java.lang.String) r2)
            r4.markerAnnotate((int) r6, (java.lang.String) r9, (java.lang.String) r7)
            java.lang.String r1 = "native_or_bloks"
            java.lang.String r0 = "bloks"
            r4.markerAnnotate((int) r6, (java.lang.String) r1, (java.lang.String) r0)
            java.lang.String r1 = "is_custom_marker_for_bloks"
            java.lang.String r0 = "true"
            r4.markerAnnotate((int) r6, (java.lang.String) r1, (java.lang.String) r0)
            X.Ifn r1 = X.C34819Ifn.A05
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()
            java.lang.String r4 = "com.bloks.www.fx.company-identity-switcher.v1"
            java.lang.String r0 = X.AnonymousClass2G0.A00(r0, r4, r4)
            java.lang.String r7 = "loaded_screen_query"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r7)
            java.lang.String r0 = X.C32062H3c.A01(r0)
            boolean r2 = r1.A04(r0)
            java.lang.Class<X.3hV> r12 = X.C63453hV.class
            monitor-enter(r12)
            goto L_0x00c9
        L_0x00be:
            java.lang.String r7 = ""
            goto L_0x0073
        L_0x00c1:
            r23 = 0
            if (r37 != 0) goto L_0x0023
            r0 = 0
            goto L_0x0041
        L_0x00c9:
            X.01V r1 = X.AnonymousClass01V.A0p     // Catch:{ all -> 0x0544 }
            X.C04220Ms.A06(r1)     // Catch:{ all -> 0x0544 }
            boolean r0 = r1.isMarkerOn((int) r6, (int) r5)     // Catch:{ all -> 0x0544 }
            if (r0 == 0) goto L_0x00d9
            java.lang.String r0 = "is_in_disk_cache"
            r1.markerAnnotate((int) r6, (java.lang.String) r0, (boolean) r2)     // Catch:{ all -> 0x0544 }
        L_0x00d9:
            monitor-exit(r12)
            X.Ltd r1 = X.AnonymousClass30T.A00
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = X.AnonymousClass2G0.A00(r0, r4, r4)
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r7)
            X.LoF r0 = r1.A00(r0)
            boolean r2 = X.AnonymousClass0wJ.A1W(r0)
            monitor-enter(r12)
            X.01V r1 = X.AnonymousClass01V.A0p     // Catch:{ all -> 0x0544 }
            X.C04220Ms.A06(r1)     // Catch:{ all -> 0x0544 }
            boolean r0 = r1.isMarkerOn((int) r6, (int) r5)     // Catch:{ all -> 0x0544 }
            if (r0 == 0) goto L_0x0101
            java.lang.String r0 = "is_in_memory_cache"
            r1.markerAnnotate((int) r6, (java.lang.String) r0, (boolean) r2)     // Catch:{ all -> 0x0544 }
        L_0x0101:
            monitor-exit(r12)
            X.1eG r0 = X.C60753Qj.A00()
            boolean r2 = X.AnonymousClass0wJ.A1W(r0)
            monitor-enter(r12)
            X.01V r1 = X.AnonymousClass01V.A0p     // Catch:{ all -> 0x0544 }
            X.C04220Ms.A06(r1)     // Catch:{ all -> 0x0544 }
            boolean r0 = r1.isMarkerOn((int) r6, (int) r5)     // Catch:{ all -> 0x0544 }
            if (r0 == 0) goto L_0x011b
            java.lang.String r0 = "is_in_switcher_cache"
            r1.markerAnnotate((int) r6, (java.lang.String) r0, (boolean) r2)     // Catch:{ all -> 0x0544 }
        L_0x011b:
            monitor-exit(r12)
            long r0 = X.C60753Qj.A00
            monitor-enter(r12)
            X.01V r10 = X.AnonymousClass01V.A0p     // Catch:{ all -> 0x0544 }
            X.C04220Ms.A06(r10)     // Catch:{ all -> 0x0544 }
            boolean r2 = r10.isMarkerOn((int) r6, (int) r5)     // Catch:{ all -> 0x0544 }
            if (r2 == 0) goto L_0x012f
            java.lang.String r2 = "switcher_cache_read_latency"
            r10.markerAnnotate((int) r6, (java.lang.String) r2, (long) r0)     // Catch:{ all -> 0x0544 }
        L_0x012f:
            monitor-exit(r12)
            boolean r2 = X.AnonymousClass2BC.A01
            monitor-enter(r12)
            X.01V r1 = X.AnonymousClass01V.A0p     // Catch:{ all -> 0x0544 }
            X.C04220Ms.A06(r1)     // Catch:{ all -> 0x0544 }
            boolean r0 = r1.isMarkerOn((int) r6, (int) r5)     // Catch:{ all -> 0x0544 }
            if (r0 == 0) goto L_0x0143
            java.lang.String r0 = "has_prefetch_triggered_since_app_start"
            r1.markerAnnotate((int) r6, (java.lang.String) r0, (boolean) r2)     // Catch:{ all -> 0x0544 }
        L_0x0143:
            monitor-exit(r12)
            long r10 = X.AnonymousClass2BC.A00
            r0 = -1
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0151
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r10
        L_0x0151:
            monitor-enter(r12)
            X.01V r10 = X.AnonymousClass01V.A0p     // Catch:{ all -> 0x0544 }
            X.C04220Ms.A06(r10)     // Catch:{ all -> 0x0544 }
            boolean r2 = r10.isMarkerOn((int) r6, (int) r5)     // Catch:{ all -> 0x0544 }
            if (r2 == 0) goto L_0x0162
            java.lang.String r2 = "last_prefetch_time_since_app_start"
            r10.markerAnnotate((int) r6, (java.lang.String) r2, (long) r0)     // Catch:{ all -> 0x0544 }
        L_0x0162:
            monitor-exit(r12)
            X.Ifn r2 = X.C34819Ifn.A05
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = X.AnonymousClass2G0.A00(r0, r4, r4)
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r7)
            java.lang.String r1 = X.C32062H3c.A01(r0)
            java.lang.Integer r22 = X.AnonymousClass006.A00
            r0 = r22
            java.lang.Long r0 = r2.A01(r0, r1)
            if (r0 == 0) goto L_0x0185
            long r0 = r0.longValue()
        L_0x0183:
            monitor-enter(r12)
            goto L_0x0188
        L_0x0185:
            r0 = -1
            goto L_0x0183
        L_0x0188:
            X.01V r7 = X.AnonymousClass01V.A0p     // Catch:{ all -> 0x0544 }
            X.C04220Ms.A06(r7)     // Catch:{ all -> 0x0544 }
            boolean r2 = r7.isMarkerOn((int) r6, (int) r5)     // Catch:{ all -> 0x0544 }
            if (r2 == 0) goto L_0x0198
            java.lang.String r2 = "disk_cache_time"
            r7.markerAnnotate((int) r6, (java.lang.String) r2, (long) r0)     // Catch:{ all -> 0x0544 }
        L_0x0198:
            monitor-exit(r12)
            java.util.ArrayList r14 = X.AnonymousClass0wJ.A0v()
            r11 = r34
            java.util.List r0 = A01(r11, r8)
            java.util.Iterator r7 = r0.iterator()
        L_0x01a7:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0204
            java.lang.Object r6 = r7.next()
            java.util.Map r6 = (java.util.Map) r6
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "company_switcher_row_userid"
            java.lang.Object r1 = r6.get(r0)
            java.lang.String r0 = "USER_ID"
            r2.put(r0, r1)
            java.lang.String r0 = "company_switcher_row_profile_pic"
            java.lang.Object r1 = r6.get(r0)
            java.lang.String r0 = "PROFILE_PICTURE_URL"
            r2.put(r0, r1)
            java.lang.String r1 = "ACCOUNT_TYPE"
            java.lang.String r0 = "INSTAGRAM"
            r2.put(r1, r0)
            java.lang.String r0 = "company_switcher_row_username"
            java.lang.Object r1 = r6.get(r0)
            java.lang.String r0 = "USERNAME"
            r2.put(r0, r1)
            java.lang.String r0 = "company_switcher_row_user_type"
            java.lang.Object r1 = r6.get(r0)
            java.lang.String r0 = "APP_ACCOUNT_STATUS"
            r2.put(r0, r1)
            java.lang.String r0 = "company_switcher_row_user_badge_text"
            java.lang.Object r1 = r6.get(r0)
            java.lang.String r0 = "BADGE_TEXT"
            r2.put(r0, r1)
            java.lang.String r0 = "company_switcher_row_user_badge_count"
            java.lang.Object r1 = r6.get(r0)
            java.lang.String r0 = "BADGE_COUNT"
            r2.put(r0, r1)
            r14.add(r2)
            goto L_0x01a7
        L_0x0204:
            X.1z6 r7 = X.C35692Ol.A00(r8)
            X.1z7 r6 = r7.A00
            fxcache.model.FxCalAccountLinkageInfo r0 = r6.A00
            long r12 = r0.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 18306671035554307(0x4109d200181a03, double:1.895580538290221E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)
            r18 = 0
            if (r0 == 0) goto L_0x023c
            r0 = 18588146012393382(0x4209d2001a0fa6, double:2.006834231266339E-307)
            java.lang.Long r0 = X.C63173fJ.A02(r2, r0)
            long r16 = r0.longValue()
            r0 = 3600(0xe10, double:1.7786E-320)
            long r16 = r16 * r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r16 = r16 * r0
            long r12 = X.C18240wQ.A09(r12)
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x023c
            r18 = 1
        L_0x023c:
            java.lang.String r10 = "fx_company_identity_switcher_linking_cache"
            if (r18 == 0) goto L_0x0246
            com.facebook.common.callercontext.CallerContext r1 = A00
            r0 = 0
            r7.A04(r1, r0, r10)
        L_0x0246:
            com.facebook.common.callercontext.CallerContext r0 = A00
            java.util.List r21 = r7.A00(r0)
            r0 = 18306671035488770(0x4109d200171a02, double:1.8955805382643173E-307)
            java.lang.Boolean r20 = X.C63173fJ.A01(r2, r0)
            boolean r19 = r20.booleanValue()
            r0 = 2342171212697839933(0x2081104f0000293d, double:4.072541738911142E-152)
            boolean r18 = X.C63803iN.A0E(r2, r8, r0)
            if (r19 == 0) goto L_0x03cb
            if (r18 == 0) goto L_0x03cb
            java.util.ArrayList r10 = X.AnonymousClass0wJ.A0v()
        L_0x026a:
            r6.A06()
            java.lang.Integer r1 = r6.A00
            r0 = r22
            if (r1 != r0) goto L_0x03b5
            java.lang.String r0 = "linkage_cache_status_uninitialized_empty"
        L_0x0275:
            java.lang.String r7 = "event_session_id"
            java.lang.String r6 = "start_time"
            if (r38 != 0) goto L_0x0442
            r13 = 0
            java.lang.Integer r32 = X.C66883yU.A0F
            java.lang.Integer r31 = X.AnonymousClass006.A0Y
            java.lang.Integer r30 = X.AnonymousClass006.A01
            X.3yU r1 = new X.3yU
            r23 = r1
            r24 = r13
            r25 = r13
            r26 = r13
            r27 = r13
            r28 = r13
            r29 = r13
            r33 = r22
            r34 = r13
            r35 = r13
            r36 = r5
            r37 = r5
            r38 = r5
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            com.instagram.bloks.hosting.IgBloksScreenConfig r12 = X.C18190wL.A0N(r8)
            r12.A0P = r4
            r12.A01 = r1
            r12.A0j = r15
            boolean r1 = X.C63793iM.A07()
            r12.A0a = r1
            X.3D7 r11 = A00(r11, r8)
            r11.A02 = r4
            X.0gW r5 = X.AnonymousClass0gN.A00()
            X.1mT r1 = new X.1mT
            r1.<init>(r11, r8)
            r5.AKp(r1)
            boolean r1 = r14.isEmpty()
            if (r1 != 0) goto L_0x02d0
            java.util.Map r5 = r11.A05
            java.lang.String r1 = "vertical_local_identity_info"
            r5.put(r1, r14)
        L_0x02d0:
            boolean r1 = X.C63793iM.A09(r8)
            java.util.Map r5 = r11.A05
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = "show_nux_content"
            r5.put(r1, r14)
            boolean r1 = X.C63793iM.A08(r8)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = "show_caa_flows"
            r5.put(r1, r14)
            boolean r1 = X.C63793iM.A00()
            if (r1 == 0) goto L_0x02f6
            if (r19 == 0) goto L_0x03b2
            if (r18 == 0) goto L_0x03b2
        L_0x02f6:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r15)
            java.lang.String r1 = "hide_ac_button"
            r5.put(r1, r14)
            boolean r1 = X.C63793iM.A04()
            if (r1 != 0) goto L_0x0310
            boolean r1 = r10.isEmpty()
            if (r1 != 0) goto L_0x0310
            java.lang.String r1 = "horizontal_local_identity_info"
            r5.put(r1, r10)
        L_0x0310:
            java.lang.String r1 = "linkage_cache_status"
            r5.put(r1, r0)
            java.lang.String r1 = "shared_accounts_flows_enabled"
            r0 = r20
            r5.put(r1, r0)
            r0 = 18308487805345298(0x410b7900031e12, double:1.8962986211223256E-307)
            java.lang.Boolean r1 = X.C63173fJ.A01(r2, r0)
            java.lang.String r0 = "should_trigger_linked_refresh_for_e2e"
            r5.put(r0, r1)
            r0 = 18306671036013063(0x4109d2001f1a07, double:1.8955805384715454E-307)
            java.lang.Boolean r1 = X.C63173fJ.A01(r2, r0)
            java.lang.String r0 = "eligible_to_add_account_max_limit"
            r5.put(r0, r1)
            r0 = 18306671036078600(0x4109d200201a08, double:1.895580538497449E-307)
            java.lang.Boolean r1 = X.C63173fJ.A01(r2, r0)
            java.lang.String r0 = "should_open_sso_settings_on_ac_button"
            r5.put(r0, r1)
            java.lang.Object r0 = r3.get(r6)
            if (r0 == 0) goto L_0x035b
            java.lang.String r0 = X.C18240wQ.A0f(r6, r3)
            float r0 = java.lang.Float.parseFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.put(r6, r0)
        L_0x035b:
            java.lang.Object r0 = r3.get(r7)
            if (r0 == 0) goto L_0x0368
            java.lang.Object r0 = r3.get(r7)
            r5.put(r7, r0)
        L_0x0368:
            java.lang.Object r0 = r3.get(r9)
            if (r0 == 0) goto L_0x0377
            java.lang.Object r1 = r3.get(r9)
            java.lang.String r0 = "entrypoint"
            r5.put(r0, r1)
        L_0x0377:
            java.util.Map r0 = r11.A06
            java.util.HashMap r0 = X.C37067Jjv.A02(r0)
            X.3iE r6 = new X.3iE
            r6.<init>(r0, r5, r4)
            r0 = 857811012(0x33212844, float:3.7522355E-8)
            r6.A00 = r0
            java.lang.String r0 = r11.A02
            r6.A05 = r0
            long r1 = r11.A00
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x043b
            r6.A01 = r1
            r6.A03 = r13
            r6.A02 = r13
            r6.A04 = r13
            java.util.Map r0 = r11.A04
            r6.A0G(r0)
            android.content.Context r0 = r11.A03
            r6.A0E(r0, r12)
            android.os.Handler r1 = X.AnonymousClass0wJ.A0F()
            X.4P4 r0 = new X.4P4
            r0.<init>(r8)
            r1.post(r0)
            return
        L_0x03b2:
            r15 = 0
            goto L_0x02f6
        L_0x03b5:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r1 != r0) goto L_0x03bd
            java.lang.String r0 = "linkage_cache_status_expired_empty"
            goto L_0x0275
        L_0x03bd:
            boolean r0 = r21.isEmpty()
            if (r0 == 0) goto L_0x03c7
            java.lang.String r0 = "linkage_cache_status_ready_empty"
            goto L_0x0275
        L_0x03c7:
            java.lang.String r0 = "linkage_cache_status_ready_non_empty"
            goto L_0x0275
        L_0x03cb:
            java.util.ArrayList r10 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r17 = r21.iterator()
        L_0x03d3:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x026a
            java.lang.Object r13 = r17.next()
            fxcache.model.FxCalAccountWithSwitcherInfo r13 = (fxcache.model.FxCalAccountWithSwitcherInfo) r13
            java.lang.String r1 = r13.A02
            java.lang.String r0 = "INSTAGRAM"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x03d3
            java.lang.String r1 = r13.A01
            java.lang.String r0 = "switcher_tapped_badge_count_"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r1)
            int r1 = r13.A00
            boolean r0 = X.C61393Tg.A00(r8, r0, r1)
            if (r0 != 0) goto L_0x03fa
            r1 = 0
        L_0x03fa:
            java.lang.String r16 = java.lang.Integer.toString(r1)
            java.util.HashMap r12 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = r13.A01
            java.lang.String r0 = "USER_ID"
            r12.put(r0, r1)
            java.lang.String r1 = r13.A06
            java.lang.String r7 = ""
            if (r1 != 0) goto L_0x0410
            r1 = r7
        L_0x0410:
            java.lang.String r0 = "PROFILE_PICTURE_URL"
            r12.put(r0, r1)
            java.lang.String r1 = r13.A02
            java.lang.String r0 = "ACCOUNT_TYPE"
            r12.put(r0, r1)
            java.lang.String r1 = r13.A07
            if (r1 != 0) goto L_0x0421
            r1 = r7
        L_0x0421:
            java.lang.String r0 = "USERNAME"
            r12.put(r0, r1)
            java.lang.String r0 = r13.A04
            if (r0 == 0) goto L_0x042b
            r7 = r0
        L_0x042b:
            java.lang.String r0 = "NAME"
            r12.put(r0, r7)
            java.lang.String r1 = "BADGE_COUNT"
            r0 = r16
            r12.put(r1, r0)
            r10.add(r12)
            goto L_0x03d3
        L_0x043b:
            java.lang.String r0 = "CacheTTL must be positive"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0442:
            X.142 r4 = new X.142
            r4.<init>()
            boolean r1 = r14.isEmpty()
            if (r1 != 0) goto L_0x0454
            java.util.Map r5 = r4.A02
            java.lang.String r1 = "vertical_local_identity_info"
            r5.put(r1, r14)
        L_0x0454:
            boolean r1 = X.C63793iM.A09(r8)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r1)
            if (r12 == 0) goto L_0x0465
            java.util.Map r5 = r4.A02
            java.lang.String r1 = "show_nux_content"
            r5.put(r1, r12)
        L_0x0465:
            boolean r1 = X.C63793iM.A08(r8)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r1)
            if (r12 == 0) goto L_0x0476
            java.util.Map r5 = r4.A02
            java.lang.String r1 = "show_caa_flows"
            r5.put(r1, r12)
        L_0x0476:
            boolean r1 = X.C63793iM.A00()
            if (r1 == 0) goto L_0x0480
            if (r19 == 0) goto L_0x0541
            if (r18 == 0) goto L_0x0541
        L_0x0480:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r15)
            if (r12 == 0) goto L_0x048d
            java.util.Map r5 = r4.A02
            java.lang.String r1 = "hide_ac_button"
            r5.put(r1, r12)
        L_0x048d:
            int r1 = r0.length()
            if (r1 == 0) goto L_0x049a
            java.util.Map r5 = r4.A02
            java.lang.String r1 = "linkage_cache_status"
            r5.put(r1, r0)
        L_0x049a:
            java.util.Map r5 = r4.A02
            java.lang.String r1 = "shared_accounts_flows_enabled"
            r0 = r20
            r5.put(r1, r0)
            r0 = 18306671036013063(0x4109d2001f1a07, double:1.8955805384715454E-307)
            java.lang.Boolean r1 = X.C63173fJ.A01(r2, r0)
            if (r1 == 0) goto L_0x04b3
            java.lang.String r0 = "eligible_to_add_account_max_limit"
            r5.put(r0, r1)
        L_0x04b3:
            boolean r0 = X.C63793iM.A04()
            if (r0 != 0) goto L_0x04c4
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x04c4
            java.lang.String r0 = "horizontal_local_identity_info"
            r5.put(r0, r10)
        L_0x04c4:
            java.lang.Object r0 = r3.get(r6)
            if (r0 == 0) goto L_0x04db
            java.lang.String r0 = X.C18240wQ.A0f(r6, r3)
            float r0 = java.lang.Float.parseFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            if (r0 == 0) goto L_0x04db
            r5.put(r6, r0)
        L_0x04db:
            java.lang.Object r0 = r3.get(r7)
            if (r0 == 0) goto L_0x04f0
            java.lang.String r1 = X.C18240wQ.A0f(r7, r3)
            if (r1 == 0) goto L_0x04f0
            int r0 = r1.length()
            if (r0 == 0) goto L_0x04f0
            r5.put(r7, r1)
        L_0x04f0:
            java.lang.Object r0 = r3.get(r9)
            if (r0 == 0) goto L_0x0507
            java.lang.String r1 = X.C18240wQ.A0f(r9, r3)
            if (r1 == 0) goto L_0x0507
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0507
            java.lang.String r0 = "entrypoint"
            r5.put(r0, r1)
        L_0x0507:
            X.4Ui r2 = new X.4Ui
            r2.<init>(r11, r8)
            r1 = 24
            kotlin.jvm.internal.KtLambdaShape148S0100000_I2_3 r0 = new kotlin.jvm.internal.KtLambdaShape148S0100000_I2_3
            r0.<init>(r2, r1)
            X.7EF r1 = new X.7EF
            r1.<init>(r0)
            java.lang.String r0 = "open_add_account_screen"
            r5.put(r0, r1)
            r0 = 2
            com.facebook.redex.IDxObjectShape132S0200000_1_I2 r2 = new com.facebook.redex.IDxObjectShape132S0200000_1_I2
            r2.<init>(r0, r11, r8)
            r1 = 23
            kotlin.jvm.internal.KtLambdaShape148S0100000_I2_3 r0 = new kotlin.jvm.internal.KtLambdaShape148S0100000_I2_3
            r0.<init>(r2, r1)
            X.7EF r1 = new X.7EF
            r1.<init>(r0)
            java.lang.String r0 = "open_accounts_center"
            r5.put(r0, r1)
            r0 = 2592000(0x278d00, double:1.280618E-317)
            r4.A01 = r0
            r4.A00()
            java.lang.IllegalArgumentException r0 = X.C63203gz.A02(r8, r11, r5)
            throw r0
        L_0x0541:
            r15 = 0
            goto L_0x0480
        L_0x0544:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67313zL.A02(android.content.Context, X.29q, com.instagram.service.session.UserSession, java.lang.Integer, boolean):void");
    }
}
