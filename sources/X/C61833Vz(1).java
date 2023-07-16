package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxObjectShape119S0200000_1_I2;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape95S0100000_I2_75;

/* renamed from: X.3Vz  reason: invalid class name and case insensitive filesystem */
public final class C61833Vz {
    public static C61833Vz A00;

    public final AnonymousClass44Y A02(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return (AnonymousClass44Y) userSession.A01(AnonymousClass44Y.class, new KtLambdaShape95S0100000_I2_75(userSession, 8));
    }

    public final C28301u1 A03(FragmentActivity fragmentActivity, C11630kW r13, AnonymousClass3GL r14, QuickPromotionSlot quickPromotionSlot, UserSession userSession) {
        boolean A1Z = AnonymousClass0wJ.A1Z(fragmentActivity, r13);
        UserSession userSession2 = userSession;
        AnonymousClass0wJ.A1Q(userSession2, quickPromotionSlot);
        AnonymousClass44Y A02 = A02(userSession2);
        C04220Ms.A0B(A02, A1Z ? 1 : 0);
        AnonymousClass4JU r9 = new AnonymousClass4JU(fragmentActivity, A02, userSession2);
        C70794Gd r6 = new C70794Gd(fragmentActivity, userSession2);
        return new C28301u1(fragmentActivity, r13, AnonymousClass2SX.A00(userSession2), r14, r6, new C133877wc(AnonymousClass6JQ.A00(userSession2)), quickPromotionSlot, r9, userSession2);
    }

    public final C28321u4 A04(C34640IcN icN, C11630kW r13, AnonymousClass3GL r14, QuickPromotionSlot quickPromotionSlot, UserSession userSession) {
        UserSession userSession2 = userSession;
        AnonymousClass0wJ.A1O(r13, userSession2);
        C04220Ms.A0B(quickPromotionSlot, 3);
        C34640IcN icN2 = icN;
        AnonymousClass4JV r9 = new AnonymousClass4JV(icN, r13, userSession2);
        C84384t3 A002 = A00(icN.getRootActivity(), userSession2);
        return new C28321u4(icN2, (C130667qT) null, r13, AnonymousClass2SX.A00(userSession2), r14, A002, new C133877wc(AnonymousClass6JQ.A00(userSession2)), quickPromotionSlot, r9, userSession2);
    }

    public final C28321u4 A05(I5x i5x, C11630kW r13, AnonymousClass3GL r14, QuickPromotionSlot quickPromotionSlot, UserSession userSession) {
        UserSession userSession2 = userSession;
        AnonymousClass0wJ.A1Q(userSession2, quickPromotionSlot);
        I5x i5x2 = i5x;
        C11630kW r3 = r13;
        AnonymousClass4JV r9 = new AnonymousClass4JV(i5x, r13, userSession2);
        C84384t3 A002 = A00(i5x.getRootActivity(), userSession2);
        return new C28321u4(i5x2, (C130667qT) null, r3, AnonymousClass2SX.A00(userSession2), r14, A002, new C133877wc(AnonymousClass6JQ.A00(userSession2)), quickPromotionSlot, r9, userSession2);
    }

    public final AnonymousClass47H A07(UserSession userSession, Map map) {
        C04220Ms.A0B(userSession, 0);
        return new AnonymousClass47H(userSession, map);
    }

    public final List A08(C11630kW r5, C84844tx r6, UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return C06750aI.A17(new C24911kp(r5, r6, userSession), new C24881km(r5, r6), new C24901ko(r6, userSession), new C24891kn(r6));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        X.C63863iT.A08(r4, X.AnonymousClass2T8.A00(r10, r1, true), r11, com.instagram.modal.ModalActivity.class, "qp_full_screen");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        r4.setArguments(X.AnonymousClass2T8.A00(r10, r1, false));
        r0 = X.C18180wK.A0Q(r2, r11);
        r0.A03 = r4;
        r0.A0B = true;
        r0.A0D = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b7, code lost:
        r0.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ba, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(android.content.Context r8, X.C81644o8 r9, com.instagram.quickpromotion.intf.QuickPromotionSlot r10, com.instagram.service.session.UserSession r11) {
        /*
            r7 = this;
            r5 = 0
            r3 = 1
            X.AnonymousClass0wJ.A1M(r11, r3, r10)
            java.lang.Class<androidx.fragment.app.FragmentActivity> r0 = androidx.fragment.app.FragmentActivity.class
            java.lang.Object r2 = X.C10050he.A00(r8, r0)
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.Object r4 = X.C10050he.A00(r8, r0)
            android.app.Activity r4 = (android.app.Activity) r4
            X.1u0 r9 = (X.C28291u0) r9
            java.lang.String r1 = X.AnonymousClass3WT.A00(r9)     // Catch:{ IOException -> 0x00bb }
            if (r1 == 0) goto L_0x00c8
            X.3Gy r0 = r9.A09
            java.lang.String r6 = r0.A00
            int r0 = r6.hashCode()
            switch(r0) {
                case -1834320946: goto L_0x0029;
                case -1052567512: goto L_0x0045;
                case -677595213: goto L_0x0053;
                case -341373439: goto L_0x007a;
                case 1190917935: goto L_0x0099;
                default: goto L_0x0028;
            }
        L_0x0028:
            return
        L_0x0029:
            java.lang.String r0 = "iig_fullscreen_rectangular_image"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00c8
            if (r4 == 0) goto L_0x003d
            r0 = 2131302403(0x7f091803, float:1.8222891E38)
            android.view.View r0 = r4.findViewById(r0)
            if (r0 != 0) goto L_0x003d
            goto L_0x0066
        L_0x003d:
            if (r2 == 0) goto L_0x00c8
            X.1uC r4 = new X.1uC
            r4.<init>()
            goto L_0x00a6
        L_0x0045:
            java.lang.String r0 = "iig_celebration_fullscreen"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00c8
            X.1uD r4 = new X.1uD
            r4.<init>()
            goto L_0x00a6
        L_0x0053:
            java.lang.String r0 = "iig_fullscreen"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00c8
            if (r4 == 0) goto L_0x0072
            r0 = 2131302403(0x7f091803, float:1.8222891E38)
            android.view.View r0 = r4.findViewById(r0)
            if (r0 != 0) goto L_0x0072
        L_0x0066:
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r1 = X.AnonymousClass2T8.A00(r10, r1, r3)
            java.lang.String r0 = "qp_full_screen"
            X.C63863iT.A08(r4, r1, r11, r2, r0)
            return
        L_0x0072:
            if (r2 == 0) goto L_0x00c8
            X.1uB r4 = new X.1uB
            r4.<init>()
            goto L_0x00a6
        L_0x007a:
            java.lang.String r0 = "iig_fullscreen_bloks"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00c8
            X.1cO r4 = new X.1cO
            r4.<init>()
            android.os.Bundle r0 = X.AnonymousClass2T8.A00(r10, r1, r5)
            r4.setArguments(r0)
            X.Drz r0 = X.C18180wK.A0Q(r2, r11)
            r0.A03 = r4
            r0.A0B = r3
            r0.A0D = r3
            goto L_0x00b7
        L_0x0099:
            java.lang.String r0 = "iig_fullscreen_bullet_list"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00c8
            X.1br r4 = new X.1br
            r4.<init>()
        L_0x00a6:
            android.os.Bundle r0 = X.AnonymousClass2T8.A00(r10, r1, r5)
            r4.setArguments(r0)
            X.Drz r0 = X.C18180wK.A0Q(r2, r11)
            r0.A03 = r4
            r0.A0B = r3
            r0.A0D = r3
        L_0x00b7:
            r0.A05()
            return
        L_0x00bb:
            java.lang.String r1 = "Error parsing QuickPromotion for fullscreen interstitial: "
            java.lang.String r0 = r9.A0D
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.String r0 = "IG-QP"
            X.C10450iM.A03(r0, r1)
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61833Vz.A0A(android.content.Context, X.4o8, com.instagram.quickpromotion.intf.QuickPromotionSlot, com.instagram.service.session.UserSession):void");
    }

    public final C41882MfV A01(C81644o8 r3) {
        String str;
        C28291u0 r32 = (C28291u0) r3;
        String str2 = r32.A09.A00;
        switch (str2.hashCode()) {
            case -1285049338:
                if (str2.equals("fixed_banner_ig")) {
                    return new AnonymousClass1lD(r32);
                }
                break;
            case 453021476:
                str = "condensed_megaphone";
                break;
            case 897282998:
                if (str2.equals("inline_editing_standard_megaphone_ig")) {
                    return new AnonymousClass1lE(r32);
                }
                break;
            case 1219174331:
                str = "social_context_condensed_megaphone_ig";
                break;
        }
        if (str2.equals(str)) {
            return new AnonymousClass1lC(r32);
        }
        return new AnonymousClass1lF(r32);
    }

    public static final C84384t3 A00(Context context, UserSession userSession) {
        C70814Gf r0 = (C70814Gf) userSession.A01(C70814Gf.class, new IDxObjectShape119S0200000_1_I2(3, context.getApplicationContext(), userSession));
        C04220Ms.A06(r0);
        return r0;
    }

    public final C24101gt A06(Context context, C11630kW r3, C84844tx r4, UserSession userSession) {
        AnonymousClass0wJ.A1N(context, userSession);
        AnonymousClass0wJ.A1Q(r4, r3);
        return new C24101gt(r3, r4, userSession);
    }

    public final void A09(Context context, C11630kW r2, C81644o8 r3, C84844tx r4) {
        AnonymousClass0wJ.A1N(r4, r3);
        AnonymousClass0wJ.A1Q(context, r2);
        AnonymousClass2T7.A00(context, r2, r3, r4);
    }

    public final boolean A0B(QuickPromotionSlot quickPromotionSlot, AnonymousClass3UV r9, UserSession userSession) {
        C62083Xb r1;
        long j;
        Number number;
        Number number2;
        AnonymousClass0wJ.A1N(userSession, quickPromotionSlot);
        C04220Ms.A0B(r9, 2);
        AnonymousClass49C r4 = (AnonymousClass49C) userSession.A01(AnonymousClass49C.class, new KtLambdaShape95S0100000_I2_75(userSession, 18));
        if (r4.A00 == null) {
            UserSession userSession2 = r4.A01;
            if (C18180wK.A05(((AnonymousClass49T) C18180wK.A0c(userSession2, AnonymousClass49T.class, 26)).A00, "qp_cooldown_response_expiration_time") > System.currentTimeMillis()) {
                if (AnonymousClass49T.A00(userSession2) != null) {
                    r4.A00 = C62083Xb.A04.A00(AnonymousClass49T.A00(userSession2));
                } else {
                    C36622Sa.A00().A02(userSession2);
                    C10450iM.A03("quick_promotion", "QP cooldown response listed as unexpired but is null.");
                }
            }
        }
        if (!C63803iN.A0E(AnonymousClass0TJ.A05, r4.A01, 36312097356776278L) || (r1 = r4.A00) == null) {
            return false;
        }
        Map map = r1.A01;
        long j2 = r1.A00;
        if (!(map == null || (number2 = (Number) map.get(quickPromotionSlot)) == null)) {
            j2 = number2.longValue();
        }
        QuickPromotionSurface quickPromotionSurface = r9.A00;
        if (quickPromotionSurface == null || (number = (Number) r9.A01.get(quickPromotionSurface)) == null) {
            j = -1;
        } else {
            j = number.longValue();
        }
        if (j + j2 > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }
}
