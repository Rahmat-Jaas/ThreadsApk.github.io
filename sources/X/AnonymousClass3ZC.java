package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape116S0100000_I2_96;

/* renamed from: X.3ZC  reason: invalid class name */
public final class AnonymousClass3ZC {
    public static final AnonymousClass1v3 A00(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return (AnonymousClass1v3) userSession.A01(AnonymousClass1v3.class, new KtLambdaShape116S0100000_I2_96(userSession, 31));
    }

    public static /* synthetic */ void A01(Context context, Integer num) {
        int i;
        switch (num.intValue()) {
            case 0:
                i = 2131837282;
                break;
            case 1:
                i = 2131837283;
                break;
            case 2:
                i = 2131837284;
                break;
            case 3:
                i = 2131837263;
                break;
            case 4:
                i = 2131837285;
                break;
            default:
                i = 2131837260;
                break;
        }
        int i2 = 6000;
        if (num == AnonymousClass006.A00) {
            i2 = 3000;
        }
        C63733iD A01 = C63733iD.A01();
        C63733iD.A07(context, A01, i);
        A01.A01 = i2;
        A01.A02 = 0;
        if (context instanceof C82614pz) {
            ((C82614pz) context).BCa().A07(A01.A0B());
        } else {
            C63733iD.A09(C38040KHr.A01, A01);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        if ((X.C18180wK.A04() - r2.longValue()) < X.AnonymousClass8bA.A04(((double) 3600) * X.C63803iN.A00(r8, r10, 37166808733974756L))) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0089, code lost:
        if ((X.C18180wK.A04() - r2.longValue()) < X.AnonymousClass8bA.A04(((double) 3600) * X.C63803iN.A00(r8, r10, 37166808733909219L))) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(com.instagram.service.session.UserSession r10, android.content.Context r11) {
        /*
            r9 = this;
            r0 = 0
            X.C04220Ms.A0B(r10, r0)
            boolean r0 = X.C63363hM.A05(r10)
            if (r0 == 0) goto L_0x00bc
            if (r11 == 0) goto L_0x00bc
            boolean r0 = X.C09650fs.A03(r11)
            if (r0 == 0) goto L_0x00bc
            boolean r0 = X.C67373zR.A08(r10)
            if (r0 == 0) goto L_0x00bc
            X.0TJ r8 = X.AnonymousClass0TJ.A05
            r0 = 2342165393017150787(0x20810b0400001d43, double:4.067607143356405E-152)
            boolean r0 = X.C63803iN.A0E(r8, r10, r0)
            if (r0 == 0) goto L_0x00bc
            X.1v3 r7 = A00(r10)
            r0 = 36322383803653446(0x810b0400031d46, double:3.033760003705937E-306)
            boolean r0 = X.C63803iN.A0E(r8, r10, r0)
            if (r0 == 0) goto L_0x005a
            X.1v3 r0 = A00(r10)
            java.lang.Long r2 = r0.A05
            if (r2 == 0) goto L_0x00d9
            r0 = 3600(0xe10, double:1.7786E-320)
            double r5 = (double) r0
            r0 = 37166808733974756(0x840b04000600e4, double:3.567777729867406E-306)
            double r0 = X.C63803iN.A00(r8, r10, r0)
            double r5 = r5 * r0
            long r3 = X.C18180wK.A04()
            long r0 = r2.longValue()
            long r3 = r3 - r0
            long r1 = X.AnonymousClass8bA.A04(r5)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d9
        L_0x005a:
            r0 = 2342165393017216324(0x20810b0400011d44, double:4.067607143411975E-152)
            boolean r0 = X.C63803iN.A0E(r8, r10, r0)
            if (r0 == 0) goto L_0x008b
            X.1v3 r0 = A00(r10)
            java.lang.Long r2 = r0.A04
            if (r2 == 0) goto L_0x00bd
            r0 = 3600(0xe10, double:1.7786E-320)
            double r5 = (double) r0
            r0 = 37166808733909219(0x840b04000500e3, double:3.56777772982596E-306)
            double r0 = X.C63803iN.A00(r8, r10, r0)
            double r5 = r5 * r0
            long r3 = X.C18180wK.A04()
            long r0 = r2.longValue()
            long r3 = r3 - r0
            long r1 = X.AnonymousClass8bA.A04(r5)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bd
        L_0x008b:
            r0 = 2342165393017281861(0x20810b0400021d45, double:4.067607143467545E-152)
            boolean r0 = X.C63803iN.A0E(r8, r10, r0)
            if (r0 == 0) goto L_0x00bc
            X.1v3 r0 = A00(r10)
            java.lang.Long r2 = r0.A03
            if (r2 == 0) goto L_0x00f6
            r0 = 3600(0xe10, double:1.7786E-320)
            double r5 = (double) r0
            r0 = 37166808733843682(0x840b04000400e2, double:3.567777729784514E-306)
            double r0 = X.C63803iN.A00(r8, r10, r0)
            double r5 = r5 * r0
            long r3 = X.C18180wK.A04()
            long r0 = r2.longValue()
            long r3 = r3 - r0
            long r1 = X.AnonymousClass8bA.A04(r5)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f6
        L_0x00bc:
            return
        L_0x00bd:
            com.instagram.service.session.UserSession r0 = r7.A08
            X.H1T r2 = X.C18180wK.A0P(r0)
            java.lang.String r0 = "ig_fb_xposting/xpost_unified_upsell/impression_cap/"
            X.C18220wO.A1K(r2, r0)
            java.lang.Class<X.1Sl> r1 = X.C21861Sl.class
            java.lang.Class<X.3Ow> r0 = X.C60403Ow.class
            X.H8c r1 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r0 = 165(0xa5, float:2.31E-43)
            X.C63873iU.A0E(r1, r7, r0)
            X.C31155GhB.A03(r1)
            goto L_0x008b
        L_0x00d9:
            com.instagram.service.session.UserSession r0 = r7.A08
            X.H1T r2 = X.C18180wK.A0P(r0)
            java.lang.String r0 = "ig_fb_xposting/xpost_unified_upsell/is_eligible/"
            X.C18220wO.A1K(r2, r0)
            java.lang.Class<X.1Sk> r1 = X.C21851Sk.class
            java.lang.Class<X.3Ov> r0 = X.C60393Ov.class
            X.H8c r1 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r0 = 166(0xa6, float:2.33E-43)
            X.C63873iU.A0E(r1, r7, r0)
            X.C31155GhB.A03(r1)
            goto L_0x005a
        L_0x00f6:
            com.instagram.service.session.UserSession r0 = r7.A08
            X.H1T r2 = X.C18180wK.A0P(r0)
            java.lang.String r0 = "ig_fb_xposting/xpost_unified_upsell/cooldown_threshold_in_hours/"
            X.C18220wO.A1K(r2, r0)
            java.lang.Class<X.1Sj> r1 = X.C21841Sj.class
            java.lang.Class<X.3Ou> r0 = X.C60383Ou.class
            X.H8c r1 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r0 = 164(0xa4, float:2.3E-43)
            X.C63873iU.A0E(r1, r7, r0)
            X.C31155GhB.A03(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ZC.A02(com.instagram.service.session.UserSession, android.content.Context):void");
    }

    public final boolean A03(Activity activity, Context context, AnonymousClass2AC r6, UserSession userSession, C83004qd r8, boolean z) {
        AnonymousClass0wJ.A1Q(r6, r8);
        if (!A04(context, r6, userSession, z)) {
            return false;
        }
        C697049r.A01(activity, r6, userSession, r8, z);
        return true;
    }

    public final boolean A04(Context context, AnonymousClass2AC r8, UserSession userSession, boolean z) {
        Boolean bool;
        boolean A0E;
        boolean A1V = C18210wN.A1V(r8);
        AnonymousClass2AD A00 = C49352rF.A00(r8, userSession, z);
        if (C63363hM.A05(userSession)) {
            AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
            if (!C63803iN.A0E(r3, userSession, 2342165393017609543L) || (context != null && C09650fs.A03(context))) {
                if (z) {
                    if (r8 == AnonymousClass2AC.A0O && !C63803iN.A0E(r3, userSession, 36316869066231153L)) {
                        return false;
                    }
                    A0E = C63423hS.A03(r8, A00, userSession);
                } else if (C67373zR.A08(userSession) && C63423hS.A03(r8, A00, userSession)) {
                    if (!C63363hM.A04(r8, userSession)) {
                        if (C63803iN.A0E(r3, userSession, 2342165393017150787L)) {
                            AnonymousClass1v3 A002 = A00(userSession);
                            if (A002.A00 == null || A002.A02 == null || A002.A01 == null) {
                                A02(userSession, context);
                            }
                        }
                        if (A05(r8, userSession)) {
                            if (C63803iN.A0E(r3, userSession, 2342165393017150787L) && C63803iN.A0E(r3, userSession, 36322383803653446L) && (bool = A00(userSession).A00) != null && !bool.booleanValue()) {
                                return A1V;
                            }
                            if (r8 == AnonymousClass2AC.A0O) {
                                return C63803iN.A0E(r3, userSession, 36316869066231153L);
                            }
                        }
                    } else if (!A05(r8, userSession)) {
                        return false;
                    } else {
                        if (r8 == AnonymousClass2AC.A0O) {
                            A0E = C63803iN.A0E(r3, userSession, 36316869066231153L);
                        }
                    }
                    return true;
                }
                if (A0E) {
                    return true;
                }
                return false;
            }
        }
        return A1V;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
        if (r6 == null) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(X.AnonymousClass2AC r10, com.instagram.service.session.UserSession r11) {
        /*
            r9 = this;
            X.1tl r5 = X.AnonymousClass3WS.A01(r11)
            boolean r0 = X.C63363hM.A04(r10, r11)
            r4 = 0
            r8 = 0
            if (r0 != 0) goto L_0x0068
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 2342165393017150787(0x20810b0400001d43, double:4.067607143356405E-152)
            boolean r0 = X.C63803iN.A0E(r3, r11, r0)
            if (r0 == 0) goto L_0x0068
            X.1v3 r0 = A00(r11)
            java.lang.Integer r2 = r0.A02
            java.lang.Float r7 = r0.A01
            r0 = 2342165393017216324(0x20810b0400011d44, double:4.067607143411975E-152)
            boolean r0 = X.C63803iN.A0E(r3, r11, r0)
            if (r0 == 0) goto L_0x008c
            if (r2 == 0) goto L_0x008c
            X.22j r0 = X.C306522j.UNIFIED_ONBOARDING_UPSELL
            int r1 = X.C63363hM.A00(r5, r0)
            int r0 = r2.intValue()
            boolean r0 = X.C18230wP.A1W(r1, r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
        L_0x0040:
            r0 = 2342165393017281861(0x20810b0400021d45, double:4.067607143467545E-152)
            boolean r0 = X.C63803iN.A0E(r3, r11, r0)
            if (r0 == 0) goto L_0x0066
            if (r7 == 0) goto L_0x0066
            X.22j r0 = X.C306522j.UNIFIED_ONBOARDING_UPSELL
            long r0 = X.C63363hM.A01(r5, r0)
            float r4 = (float) r0
            r2 = 3600(0xe10, double:1.7786E-320)
            float r1 = (float) r2
            float r0 = r7.floatValue()
            float r1 = r1 * r0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r0 = 0
            if (r1 < 0) goto L_0x0062
            r0 = 1
        L_0x0062:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L_0x0066:
            if (r6 != 0) goto L_0x0072
        L_0x0068:
            X.22j r0 = X.C306522j.UNIFIED_ONBOARDING_UPSELL
            boolean r0 = X.C63363hM.A02(r10, r5, r11, r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
        L_0x0072:
            if (r4 != 0) goto L_0x007e
            X.22j r0 = X.C306522j.UNIFIED_ONBOARDING_UPSELL
            boolean r0 = X.C63363hM.A03(r10, r5, r11, r0)
            java.lang.Boolean r4 = X.C18240wQ.A0X(r0)
        L_0x007e:
            boolean r0 = r6.booleanValue()
            if (r0 == 0) goto L_0x008b
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L_0x008b
            r8 = 1
        L_0x008b:
            return r8
        L_0x008c:
            r6 = r4
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ZC.A05(X.2AC, com.instagram.service.session.UserSession):boolean");
    }
}
