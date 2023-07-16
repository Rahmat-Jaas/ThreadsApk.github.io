package com.facebook.redex;

import X.AnonymousClass134;
import X.AnonymousClass1aS;
import X.AnonymousClass1x1;
import X.AnonymousClass2AI;
import X.AnonymousClass601;
import X.C04220Ms;
import X.C109326jp;
import X.C14030oh;
import X.C23421do;
import X.C62733ac;
import X.C72144Mm;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.igds.components.mediabutton.IgdsMediaToggleButton;
import com.instagram.nux.fragment.OneTapLoginLandingFragment;
import com.instagram.service.session.UserSession;

public class IDxCListenerShape70S0200000_1_I2 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape70S0200000_1_I2(AnonymousClass1aS r1, C72144Mm r2, int i) {
        this.A02 = i;
        switch (i) {
            case 138:
            case 139:
                this.A00 = r1;
                this.A01 = r2;
                return;
            default:
                this.A00 = r1;
                this.A01 = r2;
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.1ZK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.1ZJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: X.1ZK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: X.1ZK} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a6, code lost:
        if (r2.equals(r1) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a8, code lost:
        r7 = r0;
        X.AnonymousClass2T7.A00(r3, r0, r4, new X.C28311u3((android.view.ViewGroup) null, r7, r0, r0.A00.A00, r0.A02));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r2 = X.AnonymousClass3WT.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f7, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f9, code lost:
        r3.setArguments(X.AnonymousClass2T8.A00(r0.A00.A00, r2, false));
        r0 = X.C18180wK.A0Q(r0.getActivity(), r0.A02);
        r0.A03 = r3;
        r0.A0B = true;
        r0.A0D = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0129, code lost:
        X.C10450iM.A03("IG-QP", X.AnonymousClass00U.A0L("Error parsing QuickPromotion for fullscreen interstitial: ", r4.A0D));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0136, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.view.View r17, com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r18) {
        /*
            r0 = r18
            java.lang.Object r2 = r0.A00
            X.11E r2 = (X.AnonymousClass11E) r2
            java.lang.Object r0 = r0.A01
            X.M5O r0 = (X.M5O) r0
            int r0 = r0.getBindingAdapterPosition()
            int r1 = r0 + -1
            java.util.List r0 = r2.A02
            java.lang.Object r1 = r0.get(r1)
            X.3Ab r1 = (X.C57183Ab) r1
            if (r1 == 0) goto L_0x008c
            X.1ZH r0 = r2.A01
            X.3Cq r2 = r1.A02
            X.Lct r1 = r1.A01
            com.instagram.quickpromotion.intf.QuickPromotionSurface r3 = r1.A00
            com.instagram.service.session.UserSession r1 = r0.A02
            java.lang.String r7 = r1.getUserId()
            X.3GI r5 = r2.A02
            java.util.List r1 = r5.A06
            r1.getClass()
            r8 = 0
            java.lang.Object r4 = r1.get(r8)
            X.1tt r4 = (X.C28221tt) r4
            boolean r2 = r2.A04
            java.lang.String r1 = r5.A05
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.3Ye r6 = new X.3Ye
            r6.<init>(r7, r1, r11)
            r9 = 0
            r13 = r9
            r15 = r8
            r16 = r2
            X.1u0 r4 = X.C36802Ss.A00(r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r16)
            int r2 = r3.ordinal()
            if (r2 == r8) goto L_0x0116
            r1 = 10
            if (r2 == r1) goto L_0x0116
            r5 = 1
            if (r2 == r5) goto L_0x0137
            r1 = 2
            if (r2 == r1) goto L_0x008d
            r1 = 5
            if (r2 != r1) goto L_0x008c
            X.3HO r1 = r0.A00
            com.instagram.quickpromotion.intf.QuickPromotionSlot r1 = r1.A00
            X.1ZJ r3 = new X.1ZJ
            r3.<init>()
            int r1 = r1.ordinal()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "QP_SLOT"
            android.os.Bundle r1 = X.C18180wK.A09(r1, r2)
            r3.setArguments(r1)
            r3.A00 = r4
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
        L_0x0081:
            com.instagram.service.session.UserSession r0 = r0.A02
            X.Drz r0 = X.C18180wK.A0Q(r1, r0)
            r0.A03 = r3
        L_0x0089:
            r0.A05()
        L_0x008c:
            return
        L_0x008d:
            X.3Gy r1 = r4.A09
            java.lang.String r2 = r1.A00
            android.content.Context r3 = r0.getContext()
            int r1 = r2.hashCode()
            switch(r1) {
                case -677595213: goto L_0x00e6;
                case -341373439: goto L_0x00d8;
                case -5352129: goto L_0x00bc;
                case 533984576: goto L_0x00a0;
                case 1300038126: goto L_0x009d;
                default: goto L_0x009c;
            }
        L_0x009c:
            return
        L_0x009d:
            java.lang.String r1 = "iig_large_social_context_dialog"
            goto L_0x00a2
        L_0x00a0:
            java.lang.String r1 = "iig_dialog"
        L_0x00a2:
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x008c
            com.instagram.service.session.UserSession r2 = r0.A02
            X.3HO r1 = r0.A00
            com.instagram.quickpromotion.intf.QuickPromotionSlot r1 = r1.A00
            r6 = 0
            X.1u3 r5 = new X.1u3
            r8 = r0
            r7 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            X.AnonymousClass2T7.A00(r3, r0, r4, r5)
            return
        L_0x00bc:
            java.lang.String r1 = "instagram_app_rating_dialog"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x008c
            com.instagram.service.session.UserSession r2 = r0.A02
            X.3HO r1 = r0.A00
            com.instagram.quickpromotion.intf.QuickPromotionSlot r1 = r1.A00
            r6 = 0
            X.1u3 r5 = new X.1u3
            r8 = r0
            r7 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            X.AnonymousClass2T6.A00(r3, r4, r5)
            return
        L_0x00d8:
            java.lang.String r1 = "iig_fullscreen_bloks"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x008c
            X.1uE r3 = new X.1uE
            r3.<init>()
            goto L_0x00f3
        L_0x00e6:
            java.lang.String r1 = "iig_fullscreen"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x008c
            X.1uF r3 = new X.1uF
            r3.<init>()
        L_0x00f3:
            java.lang.String r2 = X.AnonymousClass3WT.A00(r4)     // Catch:{ IOException -> 0x0129 }
            if (r2 == 0) goto L_0x008c
            X.3HO r1 = r0.A00
            com.instagram.quickpromotion.intf.QuickPromotionSlot r1 = r1.A00
            android.os.Bundle r1 = X.AnonymousClass2T8.A00(r1, r2, r8)
            r3.setArguments(r1)
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            com.instagram.service.session.UserSession r0 = r0.A02
            X.Drz r0 = X.C18180wK.A0Q(r1, r0)
            r0.A03 = r3
            r0.A0B = r5
            r0.A0D = r5
            goto L_0x0089
        L_0x0116:
            X.1ZK r3 = new X.1ZK
            r3.<init>()
            r3.A01 = r4
            X.3HO r1 = r0.A00
            com.instagram.quickpromotion.intf.QuickPromotionSlot r1 = r1.A00
            r3.A02 = r1
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            goto L_0x0081
        L_0x0129:
            java.lang.String r1 = "Error parsing QuickPromotion for fullscreen interstitial: "
            java.lang.String r0 = r4.A0D
            java.lang.String r1 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.String r0 = "IG-QP"
            X.C10450iM.A03(r0, r1)
            return
        L_0x0137:
            X.1tz r4 = (X.C28281tz) r4
            java.lang.String r3 = r4.A02
            java.lang.Integer r2 = r4.A01
            java.lang.Integer r1 = X.AnonymousClass006.A00
            if (r2 != r1) goto L_0x014e
            X.D0f r2 = X.D0f.BELOW_ANCHOR
        L_0x0143:
            X.4Sy r1 = new X.4Sy
            r4 = r17
            r1.<init>(r4, r2, r0, r3)
            r4.post(r1)
            return
        L_0x014e:
            X.D0f r2 = X.D0f.ABOVE_ANCHOR
            goto L_0x0143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape70S0200000_1_I2.A00(android.view.View, com.facebook.redex.IDxCListenerShape70S0200000_1_I2):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: int} */
    /* JADX WARNING: type inference failed for: r0v47 */
    /* JADX WARNING: type inference failed for: r0v49 */
    /* JADX WARNING: type inference failed for: r0v97 */
    /* JADX WARNING: type inference failed for: r0v101 */
    /* JADX WARNING: type inference failed for: r0v114 */
    /* JADX WARNING: type inference failed for: r0v121 */
    /* JADX WARNING: type inference failed for: r0v125 */
    /* JADX WARNING: type inference failed for: r0v128 */
    /* JADX WARNING: type inference failed for: r0v131 */
    /* JADX WARNING: type inference failed for: r0v134 */
    /* JADX WARNING: type inference failed for: r0v135 */
    /* JADX WARNING: type inference failed for: r0v137 */
    /* JADX WARNING: type inference failed for: r0v144 */
    /* JADX WARNING: type inference failed for: r0v145 */
    /* JADX WARNING: type inference failed for: r0v148 */
    /* JADX WARNING: type inference failed for: r0v150 */
    /* JADX WARNING: type inference failed for: r0v152 */
    /* JADX WARNING: type inference failed for: r0v155 */
    /* JADX WARNING: type inference failed for: r0v165 */
    /* JADX WARNING: type inference failed for: r0v172 */
    /* JADX WARNING: type inference failed for: r0v175 */
    /* JADX WARNING: type inference failed for: r0v178 */
    /* JADX WARNING: type inference failed for: r0v187 */
    /* JADX WARNING: type inference failed for: r0v225 */
    /* JADX WARNING: type inference failed for: r0v238 */
    /* JADX WARNING: type inference failed for: r0v246 */
    /* JADX WARNING: type inference failed for: r0v258 */
    /* JADX WARNING: type inference failed for: r0v266 */
    /* JADX WARNING: type inference failed for: r0v272 */
    /* JADX WARNING: type inference failed for: r0v276 */
    /* JADX WARNING: type inference failed for: r0v279 */
    /* JADX WARNING: type inference failed for: r0v284 */
    /* JADX WARNING: type inference failed for: r0v288 */
    /* JADX WARNING: type inference failed for: r0v292 */
    /* JADX WARNING: type inference failed for: r0v311 */
    /* JADX WARNING: type inference failed for: r0v314 */
    /* JADX WARNING: type inference failed for: r0v317 */
    /* JADX WARNING: type inference failed for: r0v320 */
    /* JADX WARNING: type inference failed for: r0v323 */
    /* JADX WARNING: type inference failed for: r0v348 */
    /* JADX WARNING: type inference failed for: r0v351 */
    /* JADX WARNING: type inference failed for: r0v353 */
    /* JADX WARNING: type inference failed for: r0v355 */
    /* JADX WARNING: type inference failed for: r0v359 */
    /* JADX WARNING: type inference failed for: r0v364 */
    /* JADX WARNING: type inference failed for: r0v366 */
    /* JADX WARNING: type inference failed for: r0v368 */
    /* JADX WARNING: type inference failed for: r0v370 */
    /* JADX WARNING: type inference failed for: r0v372 */
    /* JADX WARNING: type inference failed for: r0v374 */
    /* JADX WARNING: type inference failed for: r0v376 */
    /* JADX WARNING: type inference failed for: r0v377 */
    /* JADX WARNING: type inference failed for: r0v379 */
    /* JADX WARNING: type inference failed for: r0v390 */
    /* JADX WARNING: type inference failed for: r0v433 */
    /* JADX WARNING: type inference failed for: r0v448 */
    /* JADX WARNING: type inference failed for: r0v498 */
    /* JADX WARNING: type inference failed for: r0v533 */
    /* JADX WARNING: type inference failed for: r0v536 */
    /* JADX WARNING: type inference failed for: r0v538 */
    /* JADX WARNING: type inference failed for: r0v550 */
    /* JADX WARNING: type inference failed for: r0v553 */
    /* JADX WARNING: type inference failed for: r0v559 */
    /* JADX WARNING: type inference failed for: r0v564 */
    /* JADX WARNING: type inference failed for: r0v566 */
    /* JADX WARNING: type inference failed for: r0v567 */
    /* JADX WARNING: type inference failed for: r0v597 */
    /* JADX WARNING: type inference failed for: r0v601 */
    /* JADX WARNING: type inference failed for: r0v604 */
    /* JADX WARNING: type inference failed for: r0v607 */
    /* JADX WARNING: type inference failed for: r0v611 */
    /* JADX WARNING: type inference failed for: r0v619 */
    /* JADX WARNING: type inference failed for: r0v623 */
    /* JADX WARNING: type inference failed for: r0v627 */
    /* JADX WARNING: type inference failed for: r0v634 */
    /* JADX WARNING: type inference failed for: r0v679 */
    /* JADX WARNING: type inference failed for: r0v681 */
    /* JADX WARNING: type inference failed for: r0v683 */
    /* JADX WARNING: type inference failed for: r0v686 */
    /* JADX WARNING: type inference failed for: r0v688 */
    /* JADX WARNING: type inference failed for: r0v689 */
    /* JADX WARNING: type inference failed for: r0v690 */
    /* JADX WARNING: type inference failed for: r0v691 */
    /* JADX WARNING: type inference failed for: r0v692 */
    /* JADX WARNING: type inference failed for: r0v693 */
    /* JADX WARNING: type inference failed for: r0v694 */
    /* JADX WARNING: type inference failed for: r0v695 */
    /* JADX WARNING: type inference failed for: r0v700 */
    /* JADX WARNING: type inference failed for: r0v709 */
    /* JADX WARNING: type inference failed for: r0v715 */
    /* JADX WARNING: type inference failed for: r0v718 */
    /* JADX WARNING: type inference failed for: r0v722 */
    /* JADX WARNING: type inference failed for: r0v725 */
    /* JADX WARNING: type inference failed for: r0v728 */
    /* JADX WARNING: type inference failed for: r0v732 */
    /* JADX WARNING: type inference failed for: r0v736 */
    /* JADX WARNING: type inference failed for: r0v739 */
    /* JADX WARNING: type inference failed for: r0v742 */
    /* JADX WARNING: type inference failed for: r0v745 */
    /* JADX WARNING: type inference failed for: r0v783 */
    /* JADX WARNING: type inference failed for: r0v791 */
    /* JADX WARNING: type inference failed for: r0v796 */
    /* JADX WARNING: type inference failed for: r0v804 */
    /* JADX WARNING: type inference failed for: r0v807 */
    /* JADX WARNING: type inference failed for: r0v813 */
    /* JADX WARNING: type inference failed for: r0v818 */
    /* JADX WARNING: type inference failed for: r0v825 */
    /* JADX WARNING: type inference failed for: r0v833 */
    /* JADX WARNING: type inference failed for: r0v843 */
    /* JADX WARNING: type inference failed for: r0v855 */
    /* JADX WARNING: type inference failed for: r0v860 */
    /* JADX WARNING: type inference failed for: r0v870 */
    /* JADX WARNING: type inference failed for: r0v876 */
    /* JADX WARNING: type inference failed for: r0v879 */
    /* JADX WARNING: type inference failed for: r0v882 */
    /* JADX WARNING: type inference failed for: r0v884 */
    /* JADX WARNING: type inference failed for: r0v908 */
    /* JADX WARNING: type inference failed for: r0v911 */
    /* JADX WARNING: type inference failed for: r0v914 */
    /* JADX WARNING: type inference failed for: r0v917 */
    /* JADX WARNING: type inference failed for: r0v922 */
    /* JADX WARNING: type inference failed for: r0v923 */
    /* JADX WARNING: type inference failed for: r0v928 */
    /* JADX WARNING: type inference failed for: r0v933 */
    /* JADX WARNING: type inference failed for: r0v935 */
    /* JADX WARNING: type inference failed for: r0v940 */
    /* JADX WARNING: type inference failed for: r0v945 */
    /* JADX WARNING: type inference failed for: r0v946 */
    /* JADX WARNING: type inference failed for: r0v948 */
    /* JADX WARNING: type inference failed for: r0v953 */
    /* JADX WARNING: type inference failed for: r0v956 */
    /* JADX WARNING: type inference failed for: r0v960 */
    /* JADX WARNING: type inference failed for: r0v972 */
    /* JADX WARNING: type inference failed for: r0v973 */
    /* JADX WARNING: type inference failed for: r0v974 */
    /* JADX WARNING: type inference failed for: r0v998 */
    /* JADX WARNING: type inference failed for: r0v1001 */
    /* JADX WARNING: type inference failed for: r0v1003 */
    /* JADX WARNING: type inference failed for: r0v1009 */
    /* JADX WARNING: type inference failed for: r0v1051 */
    /* JADX WARNING: type inference failed for: r0v1061 */
    /* JADX WARNING: type inference failed for: r0v1064 */
    /* JADX WARNING: type inference failed for: r0v1099 */
    /* JADX WARNING: type inference failed for: r0v1100 */
    /* JADX WARNING: type inference failed for: r0v1109 */
    /* JADX WARNING: type inference failed for: r0v1180 */
    /* JADX WARNING: type inference failed for: r0v1192 */
    /* JADX WARNING: type inference failed for: r0v1208 */
    /* JADX WARNING: type inference failed for: r0v1219 */
    /* JADX WARNING: type inference failed for: r0v1220 */
    /* JADX WARNING: type inference failed for: r0v1221 */
    /* JADX WARNING: type inference failed for: r0v1222 */
    /* JADX WARNING: type inference failed for: r0v1229 */
    /* JADX WARNING: type inference failed for: r0v1238 */
    /* JADX WARNING: type inference failed for: r0v1249 */
    /* JADX WARNING: type inference failed for: r0v1264 */
    /* JADX WARNING: type inference failed for: r0v1277 */
    /* JADX WARNING: type inference failed for: r0v1300 */
    /* JADX WARNING: type inference failed for: r0v1301 */
    /* JADX WARNING: type inference failed for: r0v1306 */
    /* JADX WARNING: type inference failed for: r0v1309 */
    /* JADX WARNING: type inference failed for: r0v1310 */
    /* JADX WARNING: type inference failed for: r0v1318 */
    /* JADX WARNING: type inference failed for: r0v1319 */
    /* JADX WARNING: type inference failed for: r0v1327 */
    /* JADX WARNING: type inference failed for: r0v1328 */
    /* JADX WARNING: type inference failed for: r0v1331 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:1047:0x330b, code lost:
        if (X.C50492t5.A00(r0.A04).size() != 1) goto L_0x330d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1065:0x33e4, code lost:
        X.C14030oh.A0C(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1066:0x33e7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1091:0x3532, code lost:
        r3 = new com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2(r1, r0, r8);
        r0 = r2.A0E.A0M;
        r0.getClass();
        X.AnonymousClass3LR.A00(r3, r4, r5, r6, r7, r0.A33(), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1092:0x3545, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0163, code lost:
        r6.A0O((android.content.DialogInterface.OnClickListener) null, r1);
        r1 = r6.A0G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0187, code lost:
        r3.A07(r0);
        r3.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0b21, code lost:
        X.C04220Ms.A0E("adId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0b26, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x018d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0e66, code lost:
        X.C14030oh.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0e69, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0e98, code lost:
        X.C14030oh.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0e9b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x151f, code lost:
        X.AnonymousClass1fM.A00(r2);
        r2.D92();
        X.AnonymousClass1aS.A01(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x1528, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x02ad, code lost:
        X.C13950oZ.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02b0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:689:0x21be, code lost:
        if (r1 != 2) goto L_0x222e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:690:0x21c0, code lost:
        r7 = r6.requireArguments();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:691:0x21c9, code lost:
        if (r6.A04.A00 != 2) goto L_0x21dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:692:0x21cb, code lost:
        r1 = r6.A05;
        r0 = r6.A02;
        r0.getClass();
        r1.A01 = X.C18230wP.A0f(r0.A00 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:693:0x21dc, code lost:
        r1 = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - r6.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:0x21e9, code lost:
        if (r4 == false) goto L_0x2220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:0x21eb, code lost:
        X.AnonymousClass1dN.A04(r6, r1, "upgrade_started", "upgrade");
        r6.A03.A00.setPrimaryButtonEnabled(false);
        r6.A03.A00.setPrimaryActionIsLoading(true);
        r5 = X.C63473hX.A01(r6.A07);
        r4 = r6.A05;
        r4.A00 = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - r6.A00);
        r4.A05 = "upgrade";
        r5.A07(new X.AnonymousClass1p1(r7, r6), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:696:0x221f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:697:0x2220, code lost:
        X.AnonymousClass1dN.A04(r6, r1, "upgrade_screen_declined", "upgrade");
        X.AnonymousClass1dN.A00(r7, r6, X.AnonymousClass006.A01);
        X.AnonymousClass1dN.A01(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:698:0x222d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:699:0x222e, code lost:
        X.AnonymousClass1dN.A03(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:700:0x2231, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:704:0x2263, code lost:
        if (r4.A0A.getValue() != X.AnonymousClass20y.A02) goto L_0x2265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:753:0x2527, code lost:
        X.C14030oh.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:754:0x252a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:861:0x2a29, code lost:
        X.C14030oh.A0C(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:862:0x2a2c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:867:0x2a39, code lost:
        r0 = "adsManagerLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:868:0x2a3c, code lost:
        r0 = "mediaId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:869:0x2a3e, code lost:
        X.C04220Ms.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:870:0x2a41, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:877:0x2a77, code lost:
        r7 = "promoteLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:917:0x2ca9, code lost:
        r4.A04.A01(r6.A05.toLowerCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:918:0x2cb4, code lost:
        if (r10 == null) goto L_0x2d02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:919:0x2cb6, code lost:
        r6 = r10.mArguments;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:920:0x2cb8, code lost:
        if (r6 != null) goto L_0x2cbe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:921:0x2cba, code lost:
        r6 = X.C18180wK.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:922:0x2cbe, code lost:
        r6.putAll(X.C18250wR.A07(r4));
        r0 = r4.A04.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:923:0x2cc9, code lost:
        if (r0 == null) goto L_0x2d07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:924:0x2ccb, code lost:
        r3 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:926:0x2cd3, code lost:
        if (r3.hasNext() == false) goto L_0x2d07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:927:0x2cd5, code lost:
        r2 = (X.AnonymousClass3HW) r3.next();
        r0 = r2.A05;
        X.C04220Ms.A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:928:0x2ce4, code lost:
        if (X.AnonymousClass2K7.A00(r0) != r5) goto L_0x2ccf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:929:0x2ce6, code lost:
        r2 = "complete".equals(r2.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:930:0x2cee, code lost:
        r6.putBoolean("ARG_CHECKLIST_ITEM_COMPLETED", r2);
        r10.setArguments(r6);
        r4.A01.A00(r10, r4.getActivity(), r4.A03, r13, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:931:0x2d02, code lost:
        r0 = -990054362(0xffffffffc4fcf826, float:-2023.7546);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:932:0x2d07, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:958:0x2e2a, code lost:
        r2.putString("ARG_TITLE", r8);
        r2.putString("ARG_SUB_TITLE", r7);
        r10.setArguments(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:968:0x2f03, code lost:
        X.C04220Ms.A0E(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:969:0x2f07, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0566, code lost:
        if (r1 == X.AnonymousClass006.A0N) goto L_0x0568;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:980:0x2f8c, code lost:
        X.C14030oh.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:981:0x2f8f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:995:0x3071, code lost:
        X.C67313zL.A02(r4, r2, r3, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:996:0x3074, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r25) {
        /*
            r24 = this;
            r0 = r24
            int r1 = r0.A02
            r3 = r25
            switch(r1) {
                case 0: goto L_0x33c5;
                case 1: goto L_0x32bc;
                case 2: goto L_0x325d;
                case 3: goto L_0x323f;
                case 4: goto L_0x321f;
                case 5: goto L_0x320f;
                case 6: goto L_0x31e2;
                case 7: goto L_0x0203;
                case 8: goto L_0x31a9;
                case 9: goto L_0x318c;
                case 10: goto L_0x311f;
                case 11: goto L_0x3108;
                case 12: goto L_0x30e9;
                case 13: goto L_0x30d2;
                case 14: goto L_0x30bb;
                case 15: goto L_0x3098;
                case 16: goto L_0x3075;
                case 17: goto L_0x3060;
                case 18: goto L_0x3051;
                case 19: goto L_0x01a8;
                case 20: goto L_0x3020;
                case 21: goto L_0x3008;
                case 22: goto L_0x2fec;
                case 23: goto L_0x2fd5;
                case 24: goto L_0x2fbe;
                case 25: goto L_0x2fa7;
                case 26: goto L_0x2f90;
                case 27: goto L_0x2f64;
                case 28: goto L_0x2f3b;
                case 29: goto L_0x2f19;
                case 30: goto L_0x2edd;
                case 31: goto L_0x2ec4;
                case 32: goto L_0x2e9e;
                case 33: goto L_0x2e5b;
                case 34: goto L_0x2c83;
                case 35: goto L_0x2c6c;
                case 36: goto L_0x2bfc;
                case 37: goto L_0x2b63;
                case 38: goto L_0x2b44;
                case 39: goto L_0x34a4;
                case 40: goto L_0x2b0a;
                case 41: goto L_0x2aea;
                case 42: goto L_0x2acf;
                case 43: goto L_0x2a9c;
                case 44: goto L_0x2a7b;
                case 45: goto L_0x2a42;
                case 46: goto L_0x29f8;
                case 47: goto L_0x29ba;
                case 48: goto L_0x298d;
                case 49: goto L_0x297a;
                case 50: goto L_0x2967;
                case 51: goto L_0x2954;
                case 52: goto L_0x2941;
                case 53: goto L_0x2909;
                case 54: goto L_0x34c2;
                case 55: goto L_0x2866;
                case 56: goto L_0x284f;
                case 57: goto L_0x2838;
                case 58: goto L_0x27cb;
                case 59: goto L_0x2770;
                case 60: goto L_0x273d;
                case 61: goto L_0x2722;
                case 62: goto L_0x2707;
                case 63: goto L_0x26ec;
                case 64: goto L_0x26d1;
                case 65: goto L_0x26b6;
                case 66: goto L_0x269b;
                case 67: goto L_0x2680;
                case 68: goto L_0x2657;
                case 69: goto L_0x2638;
                case 70: goto L_0x2494;
                case 71: goto L_0x2472;
                case 72: goto L_0x240e;
                case 73: goto L_0x23d6;
                case 74: goto L_0x2345;
                case 75: goto L_0x2232;
                case 76: goto L_0x21ae;
                case 77: goto L_0x219a;
                case 78: goto L_0x2180;
                case 79: goto L_0x2169;
                case 80: goto L_0x20fa;
                case 81: goto L_0x20e3;
                case 82: goto L_0x20cc;
                case 83: goto L_0x207d;
                case 84: goto L_0x2026;
                case 85: goto L_0x2008;
                case 86: goto L_0x1fde;
                case 87: goto L_0x1f6b;
                case 88: goto L_0x1f0f;
                case 89: goto L_0x1ef6;
                case 90: goto L_0x1edd;
                case 91: goto L_0x3487;
                case 92: goto L_0x1ec4;
                case 93: goto L_0x1e70;
                case 94: goto L_0x1e2a;
                case 95: goto L_0x1dcd;
                case 96: goto L_0x1daa;
                case 97: goto L_0x1d87;
                case 98: goto L_0x1bfb;
                case 99: goto L_0x1bb8;
                case 100: goto L_0x1b8f;
                case 101: goto L_0x1b66;
                case 102: goto L_0x3455;
                case 103: goto L_0x1b62;
                case 104: goto L_0x1b0e;
                case 105: goto L_0x1b02;
                case 106: goto L_0x1af6;
                case 107: goto L_0x1aea;
                case 108: goto L_0x1ade;
                case 109: goto L_0x1ad2;
                case 110: goto L_0x1ac6;
                case 111: goto L_0x1aba;
                case 112: goto L_0x1aae;
                case 113: goto L_0x1a4a;
                case 114: goto L_0x1a20;
                case 115: goto L_0x1a08;
                case 116: goto L_0x19ed;
                case 117: goto L_0x19d2;
                case 118: goto L_0x19b4;
                case 119: goto L_0x1992;
                case 120: goto L_0x197f;
                case 121: goto L_0x1963;
                case 122: goto L_0x1926;
                case 123: goto L_0x1904;
                case 124: goto L_0x18e2;
                case 125: goto L_0x18cb;
                case 126: goto L_0x180f;
                case 127: goto L_0x17ed;
                case 128: goto L_0x17ba;
                case 129: goto L_0x1770;
                case 130: goto L_0x1733;
                case 131: goto L_0x1712;
                case 132: goto L_0x16c2;
                case 133: goto L_0x1698;
                case 134: goto L_0x164c;
                case 135: goto L_0x1600;
                case 136: goto L_0x15a6;
                case 137: goto L_0x1529;
                case 138: goto L_0x150f;
                case 139: goto L_0x14fe;
                case 140: goto L_0x14e7;
                case 141: goto L_0x0009;
                case 142: goto L_0x0009;
                case 143: goto L_0x14db;
                case 144: goto L_0x1492;
                case 145: goto L_0x147b;
                case 146: goto L_0x1464;
                case 147: goto L_0x144d;
                case 148: goto L_0x141f;
                case 149: goto L_0x1382;
                case 150: goto L_0x136b;
                case 151: goto L_0x1354;
                case 152: goto L_0x133d;
                case 153: goto L_0x1326;
                case 154: goto L_0x12a0;
                case 155: goto L_0x1274;
                case 156: goto L_0x1246;
                case 157: goto L_0x122b;
                case 158: goto L_0x121a;
                case 159: goto L_0x018e;
                case 160: goto L_0x11f0;
                case 161: goto L_0x11c6;
                case 162: goto L_0x11c2;
                case 163: goto L_0x11a4;
                case 164: goto L_0x1186;
                case 165: goto L_0x016d;
                case 166: goto L_0x1178;
                case 167: goto L_0x1155;
                case 168: goto L_0x00a6;
                case 169: goto L_0x112e;
                case 170: goto L_0x1106;
                case 171: goto L_0x10f0;
                case 172: goto L_0x10af;
                case 173: goto L_0x1090;
                case 174: goto L_0x1071;
                case 175: goto L_0x102a;
                case 176: goto L_0x100f;
                case 177: goto L_0x0087;
                case 178: goto L_0x0fce;
                case 179: goto L_0x004b;
                case 180: goto L_0x0fa7;
                case 181: goto L_0x0f9b;
                case 182: goto L_0x0015;
                case 183: goto L_0x0f69;
                case 184: goto L_0x0f44;
                case 185: goto L_0x0f12;
                case 186: goto L_0x0ede;
                case 187: goto L_0x0ea7;
                case 188: goto L_0x0e75;
                case 189: goto L_0x0e47;
                case 190: goto L_0x0e31;
                case 191: goto L_0x0e04;
                case 192: goto L_0x0dd7;
                case 193: goto L_0x0db5;
                case 194: goto L_0x0d9d;
                case 195: goto L_0x0d68;
                case 196: goto L_0x343a;
                case 197: goto L_0x341f;
                case 198: goto L_0x3404;
                case 199: goto L_0x33e8;
                case 200: goto L_0x0d16;
                case 201: goto L_0x0d0a;
                case 202: goto L_0x0cb8;
                case 203: goto L_0x0c85;
                case 204: goto L_0x0c6c;
                case 205: goto L_0x0bb5;
                case 206: goto L_0x0b8c;
                case 207: goto L_0x0b80;
                case 208: goto L_0x0b74;
                case 209: goto L_0x0b5d;
                case 210: goto L_0x0b46;
                case 211: goto L_0x0b27;
                case 212: goto L_0x0a48;
                case 213: goto L_0x08ed;
                case 214: goto L_0x085c;
                case 215: goto L_0x07fc;
                case 216: goto L_0x07f0;
                case 217: goto L_0x07a8;
                case 218: goto L_0x073d;
                case 219: goto L_0x0731;
                case 220: goto L_0x0725;
                case 221: goto L_0x0719;
                case 222: goto L_0x06ea;
                case 223: goto L_0x06cb;
                case 224: goto L_0x0688;
                case 225: goto L_0x060d;
                case 226: goto L_0x05b2;
                case 227: goto L_0x25b8;
                case 228: goto L_0x0584;
                case 229: goto L_0x054a;
                case 230: goto L_0x0511;
                case 231: goto L_0x04ce;
                case 232: goto L_0x0417;
                case 233: goto L_0x03f9;
                case 234: goto L_0x03e2;
                case 235: goto L_0x03cb;
                case 236: goto L_0x036d;
                case 237: goto L_0x030f;
                case 238: goto L_0x02e8;
                case 239: goto L_0x02b1;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r0.A00
            com.instagram.nux.fragment.OneTapLoginLandingFragment r1 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r1
            java.lang.Object r0 = r0.A01
            X.3ac r0 = (X.C62733ac) r0
            r1.A02(r0)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r5 = r0.A00
            X.3Vj r5 = (X.C61783Vj) r5
            java.lang.Object r4 = r0.A01
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0014
            X.266 r0 = X.AnonymousClass266.A05
            r3 = 2131836493(0x7f113e4d, float:1.9306154E38)
            r2 = 2131836491(0x7f113e4b, float:1.930615E38)
            r1 = 2131836492(0x7f113e4c, float:1.9306152E38)
            if (r4 != r0) goto L_0x0035
            r3 = 2131836510(0x7f113e5e, float:1.9306189E38)
            r2 = 2131836508(0x7f113e5c, float:1.9306185E38)
            r1 = 2131836509(0x7f113e5d, float:1.9306187E38)
        L_0x0035:
            androidx.fragment.app.FragmentActivity r0 = r5.A01
            X.Dsm r6 = X.C18190wL.A0W(r0)
            r6.A0L(r3)
            r6.A0K(r2)
            r0 = 55
            X.C18190wL.A1R(r6, r5, r4, r0, r1)
            r1 = 2131823054(0x7f1109ce, float:1.9278897E38)
            goto L_0x0163
        L_0x004b:
            java.lang.Object r5 = r0.A00
            X.3Bj r5 = (X.C57523Bj) r5
            java.lang.Object r9 = r0.A01
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            com.instagram.service.session.UserSession r6 = r5.A02
            java.lang.String r1 = "ads"
            java.lang.String r0 = "ad_topics_entered"
            r8 = 0
            X.C62423Zt.A03(r6, r1, r0)
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0014
            r0 = 1
            r5.A00 = r0
            X.C62423Zt.A02(r6)
            java.lang.String r4 = "ad_topics_settings_phase_1"
            java.lang.String r3 = "ad_topics"
            r2 = 0
            X.0TJ r7 = X.AnonymousClass0TJ.A05
            r0 = 36316409504336996(0x81059500060c64, double:3.0299818327616416E-306)
            boolean r0 = X.C63803iN.A0E(r7, r6, r0)
            if (r0 == 0) goto L_0x34e0
            if (r9 == 0) goto L_0x34e0
            boolean r0 = r9.booleanValue()
            if (r0 == 0) goto L_0x34e0
            X.1wh r0 = r5.A03
            X.C63013bK.A02(r0, r6, r4, r3, r2)
            return
        L_0x0087:
            java.lang.Object r1 = r0.A00
            X.3Bj r1 = (X.C57523Bj) r1
            java.lang.Object r0 = r0.A01
            X.4vR r0 = (X.C85584vR) r0
            java.lang.String r4 = r0.B3E()
            if (r4 == 0) goto L_0x0014
            android.content.Context r2 = r3.getContext()
            com.instagram.service.session.UserSession r1 = r1.A02
            X.9wF r0 = X.C171209wF.A04
            X.Jpy r3 = new X.Jpy
            r3.<init>((android.content.Context) r2, (com.instagram.service.session.UserSession) r1, (X.C171209wF) r0, (java.lang.String) r4)
            java.lang.String r0 = "settings_ads_options"
            goto L_0x0187
        L_0x00a6:
            java.lang.Object r1 = r0.A00
            X.114 r1 = (X.AnonymousClass114) r1
            java.lang.Object r3 = r0.A01
            X.22s r3 = (X.C307422s) r3
            X.38x r1 = r1.A01
            X.BPz r0 = r1.A01
            X.Av2 r2 = r1.A00
            com.instagram.user.model.User r8 = r2.A0F
            r8.getClass()
            r0.A01 = r3
            X.IcN r4 = r0.A04
            android.content.Context r1 = r4.getContext()
            X.C18210wN.A0p(r1)
            int r1 = r3.ordinal()
            switch(r1) {
                case 1: goto L_0x00cc;
                case 2: goto L_0x354a;
                case 3: goto L_0x3546;
                case 4: goto L_0x3546;
                case 5: goto L_0x00cb;
                case 6: goto L_0x350f;
                case 7: goto L_0x3521;
                default: goto L_0x00cb;
            }
        L_0x00cb:
            return
        L_0x00cc:
            X.C20134BPz.A02(r0, r8)
            android.content.Context r10 = X.C18230wP.A0A(r4)
            com.instagram.service.session.UserSession r11 = r0.A09
            X.C2o r1 = r0.A06
            java.lang.String r14 = r1.getModuleName()
            r1 = 0
            com.facebook.redex.IDxRCallbackShape112S0300000_1_I2 r13 = new com.facebook.redex.IDxRCallbackShape112S0300000_1_I2
            r13.<init>(r1, r8, r0, r2)
            java.lang.String r15 = r8.Ak1()
            X.AnonymousClass0wJ.A1O(r11, r14)
            r0 = 5
            X.C04220Ms.A0B(r15, r0)
            X.KXd r9 = new X.KXd
            r12 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0 = 180(0xb4, float:2.52E-43)
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r3 = X.C18220wO.A0O(r9, r0)
            X.Dsm r6 = X.C18190wL.A0W(r10)
            r0 = 2131825658(0x7f1113fa, float:1.9284178E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r10, r15, r0)
            r6.A02 = r0
            java.lang.StringBuilder r4 = X.C18200wM.A0r()
            r0 = 2131825650(0x7f1113f2, float:1.9284162E38)
            X.C18210wN.A0u(r10, r4, r0)
            java.lang.String r2 = "\n\n"
            r4.append(r2)
            r0 = 2131825651(0x7f1113f3, float:1.9284164E38)
            X.C18210wN.A0u(r10, r4, r0)
            java.lang.String r1 = "\n"
            r4.append(r1)
            r0 = 2131825652(0x7f1113f4, float:1.9284166E38)
            X.C18210wN.A0u(r10, r4, r0)
            r4.append(r1)
            r0 = 2131825653(0x7f1113f5, float:1.9284168E38)
            X.C18210wN.A0u(r10, r4, r0)
            r4.append(r1)
            r0 = 2131825654(0x7f1113f6, float:1.928417E38)
            X.C18210wN.A0u(r10, r4, r0)
            r4.append(r1)
            r0 = 2131825655(0x7f1113f7, float:1.9284172E38)
            X.C18210wN.A0u(r10, r4, r0)
            r4.append(r1)
            r0 = 2131825656(0x7f1113f8, float:1.9284174E38)
            X.C18210wN.A0u(r10, r4, r0)
            r4.append(r2)
            r0 = 2131825657(0x7f1113f9, float:1.9284176E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r10, r15, r0)
            java.lang.String r0 = X.C18180wK.A0i(r0, r4)
            r6.A0p(r0)
            r0 = 2131825649(0x7f1113f1, float:1.928416E38)
            r6.A0P(r3, r0)
            r1 = 2131829269(0x7f112215, float:1.9291502E38)
        L_0x0163:
            r0 = 0
            r6.A0O(r0, r1)
            android.app.Dialog r1 = r6.A0G()
            goto L_0x02ad
        L_0x016d:
            java.lang.Object r1 = r0.A00
            X.1br r1 = (X.C23061br) r1
            java.lang.Object r0 = r0.A01
            X.3CQ r0 = (X.AnonymousClass3CQ) r0
            java.lang.String r3 = r0.A03
            if (r3 == 0) goto L_0x0014
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            com.instagram.service.session.UserSession r1 = r1.A06
            X.9wF r0 = X.C171209wF.A2V
            X.Jpy r3 = X.C18230wP.A0Y(r2, r1, r0, r3)
            java.lang.String r0 = "quick promotion"
        L_0x0187:
            r3.A07(r0)
            r3.A04()
            return
        L_0x018e:
            java.lang.Object r3 = r0.A00
            X.1bD r3 = (X.AnonymousClass1bD) r3
            java.lang.Object r2 = r0.A01
            android.os.Bundle r2 = (android.os.Bundle) r2
            X.3Hj r1 = r3.A03
            boolean r0 = r1.A02(r2)
            if (r0 == 0) goto L_0x0014
            android.widget.EditText r0 = r3.A00
            java.lang.String r0 = X.AnonymousClass0wJ.A0n(r0)
            r1.A01(r2, r0)
            return
        L_0x01a8:
            java.lang.Object r9 = r0.A00
            androidx.fragment.app.Fragment r9 = (androidx.fragment.app.Fragment) r9
            java.lang.Object r6 = r0.A01
            X.7qT r6 = (X.C130667qT) r6
            android.content.Context r0 = r9.getContext()
            if (r0 == 0) goto L_0x0014
            java.util.HashMap r7 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r5 = X.AnonymousClass0wJ.A0y()
            r8 = 2
            java.util.BitSet r4 = new java.util.BitSet
            r4.<init>(r8)
            r0 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "some_required_int_param"
            r7.put(r0, r1)
            r0 = 0
            r4.set(r0)
            java.lang.String r1 = "Test"
            java.lang.String r0 = "some_required_string_param"
            r7.put(r0, r1)
            r0 = 1
            r4.set(r0)
            android.content.Context r3 = r9.getContext()
            r0 = 0
            com.facebook.redex.IDxACallbackShape855S0100000_1_I2 r2 = new com.facebook.redex.IDxACallbackShape855S0100000_1_I2
            r2.<init>(r9, r0)
            int r0 = r4.nextClearBit(r0)
            if (r0 < r8) goto L_0x3579
            java.lang.String r0 = "com.bloks.www.bloks.demo.testnativeactionbuilder"
            X.3Fe r1 = new X.3Fe
            r1.<init>(r0)
            java.util.HashMap r0 = X.C37067Jjv.A02(r7)
            r1.A02 = r0
            r1.A01 = r5
            r1.A00 = r2
            r1.A00(r3, r6)
            return
        L_0x0203:
            java.lang.Object r4 = r0.A00
            X.4Aj r4 = (X.AnonymousClass4Aj) r4
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            X.29g r0 = X.C318629g.REMOVE_CURRENT_PHOTO
            X.AnonymousClass4Aj.A0B = r0
            com.instagram.service.session.UserSession r10 = r4.A09
            X.29S r6 = X.AnonymousClass29S.PROFILE_PICTURE_BOTTOM_SHEET_ITEM_CLICKED
            X.296 r7 = X.AnonymousClass4Aj.A0A
            X.2A6 r9 = X.AnonymousClass2A6.A06
            java.lang.String r0 = r10.getUserId()
            java.lang.Long.parseLong(r0)
            X.29g r8 = X.AnonymousClass4Aj.A0B
            r11 = 0
            r12 = r11
            X.C35712On.A00(r6, r7, r8, r9, r10, r11, r12)
            X.43x r3 = r4.A08
            if (r3 == 0) goto L_0x0230
            X.24Z r1 = r4.A07
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            r3.A00(r1, r0)
        L_0x0230:
            r7 = 1
            com.facebook.redex.IDxListenerShape854S0100000_1_I2 r6 = new com.facebook.redex.IDxListenerShape854S0100000_1_I2
            r6.<init>(r4, r7)
            com.instagram.graphql.instagramschema.IGFxImBusinessReminderQueryResponseImpl$FxIdentityManagement$BciReminderContent r0 = X.AnonymousClass312.A00()
            if (r0 == 0) goto L_0x3580
            java.lang.Class<com.instagram.graphql.instagramschema.IGFxImBusinessReminderQueryResponseImpl$FxIdentityManagement$BciReminderContent$DeletePhotoReminder> r3 = com.instagram.graphql.instagramschema.IGFxImBusinessReminderQueryResponseImpl.FxIdentityManagement.BciReminderContent.DeletePhotoReminder.class
            java.lang.String r1 = "delete_photo_reminder(identity_id:$identity_id)"
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r1, r3)
            if (r0 == 0) goto L_0x3580
            com.instagram.graphql.instagramschema.IGFxImBusinessReminderQueryResponseImpl$FxIdentityManagement$BciReminderContent r0 = X.AnonymousClass312.A00()
            if (r0 == 0) goto L_0x3594
            com.facebook.pando.TreeJNI r9 = r0.getTreeValue(r1, r3)
            if (r9 == 0) goto L_0x3594
            java.lang.String r1 = "header"
            java.lang.String r0 = r9.getStringValue(r1)
            if (r0 == 0) goto L_0x3594
            java.lang.String r4 = "confirm_cta"
            java.lang.String r0 = r9.getStringValue(r4)
            if (r0 == 0) goto L_0x3594
            java.lang.String r8 = "cancel_cta"
            java.lang.String r0 = r9.getStringValue(r8)
            if (r0 == 0) goto L_0x3594
            java.lang.String r3 = "subtext"
            java.lang.String r0 = r9.getStringValue(r3)
            if (r0 == 0) goto L_0x3594
            X.29l r5 = X.C319129l.BIZ_REMOVE_PHOTO
            java.lang.String r1 = r9.getStringValue(r1)
            java.lang.String r0 = r9.getStringValue(r3)
            java.lang.String r4 = r9.getStringValue(r4)
            java.lang.String r3 = r9.getStringValue(r8)
            if (r2 == 0) goto L_0x0014
            X.Dsm r2 = X.C18190wL.A0W(r2)
            r2.A02 = r1
            r2.A0p(r0)
            r0 = 25
            com.facebook.redex.IDxCListenerShape48S0300000_1_I2 r1 = X.C18250wR.A0E(r6, r5, r10, r0)
            X.25l r0 = X.AnonymousClass25l.DEFAULT
            r2.A0Y(r1, r0, r4, r7)
            r1 = 29
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r10)
            r2.A0b(r0, r3)
            android.app.Dialog r1 = r2.A0G()
            X.2A7 r0 = X.AnonymousClass2A7.A0D
            X.C63243h6.A02(r0, r5, r10)
        L_0x02ad:
            X.C13950oZ.A00(r1)
            return
        L_0x02b1:
            r1 = 1079511420(0x4058097c, float:3.3755789)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r6 = r0.A00
            X.Ica r6 = (X.C34650Ica) r6
            java.lang.String r2 = "mute_user"
            X.C34650Ica.A05(r6, r2)
            com.instagram.service.session.UserSession r2 = r6.A03
            X.Jj9 r2 = X.C18210wN.A0L(r2)
            X.Jqm r5 = r2.A00()
            com.instagram.service.session.UserSession r4 = r6.A03
            java.lang.Object r3 = r0.A01
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            X.1ym r2 = new X.1ym
            r2.<init>(r0)
            java.lang.String r0 = "support_detail_ticket"
            X.IcN r2 = X.C63373hN.A00(r4, r3, r2, r0)
            android.content.Context r0 = r6.requireContext()
            X.C37383Jqm.A00(r0, r2, r5)
            r0 = 900958734(0x35b38a0e, float:1.3376718E-6)
            goto L_0x33e4
        L_0x02e8:
            r1 = -291988816(0xffffffffee989ab0, float:-2.3614364E28)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A00
            X.Ica r4 = (X.C34650Ica) r4
            java.lang.String r2 = "unfollow_user"
            X.C34650Ica.A05(r4, r2)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            com.instagram.service.session.UserSession r3 = r4.A03
            java.lang.Object r5 = r0.A01
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            java.lang.String r6 = "support_inbox_detail_fragment"
            r8 = 0
            r9 = 0
            r7 = r6
            X.C63373hN.A02(r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 1850986761(0x6e53d109, float:1.6388511E28)
            goto L_0x33e4
        L_0x030f:
            r1 = 209992497(0xc843b31, float:2.0373445E-31)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A00
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            boolean r2 = r4.A2w()
            if (r2 == 0) goto L_0x0368
            java.lang.Object r5 = r0.A01
            X.1ae r5 = (X.AnonymousClass1ae) r5
            X.0Oa r0 = r5.A0I
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            boolean r0 = X.C63823iP.A0C(r0)
            if (r0 != 0) goto L_0x0368
            X.3Ui r6 = X.AnonymousClass1ae.A01(r5)
            X.3DJ r7 = X.C696349j.A02(r5)
            java.lang.String r2 = r5.A0D
            r0 = 1
            X.C04220Ms.A0B(r2, r0)
            java.lang.String r16 = "ig_quiet_mode_custom_end_time_open"
            r8 = 0
            r19 = 4088(0xff8, float:5.729E-42)
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r17 = r2
            r18 = r8
            X.AnonymousClass3Ui.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.0Oa r0 = r5.A0I
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            long r2 = X.C63823iP.A03(r0, r4)
            X.4ND r0 = new X.4ND
            r0.<init>(r4, r5)
            X.AnonymousClass1ae.A04(r0, r5, r2)
            r0 = -69736678(0xfffffffffbd7e71a, float:-2.2420622E36)
            goto L_0x33e4
        L_0x0368:
            r0 = 788842295(0x2f04c737, float:1.2076105E-10)
            goto L_0x33e4
        L_0x036d:
            r1 = 1982322565(0x7627d785, float:8.510594E32)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A00
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            boolean r2 = r4.A2w()
            if (r2 == 0) goto L_0x03c6
            java.lang.Object r5 = r0.A01
            X.1ae r5 = (X.AnonymousClass1ae) r5
            X.0Oa r0 = r5.A0I
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            boolean r0 = X.C63823iP.A0C(r0)
            if (r0 != 0) goto L_0x03c6
            X.3Ui r6 = X.AnonymousClass1ae.A01(r5)
            X.3DJ r7 = X.C696349j.A02(r5)
            java.lang.String r2 = r5.A0D
            r0 = 1
            X.C04220Ms.A0B(r2, r0)
            java.lang.String r16 = "ig_quiet_mode_custom_start_time_open"
            r8 = 0
            r19 = 4088(0xff8, float:5.729E-42)
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r17 = r2
            r18 = r8
            X.AnonymousClass3Ui.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.0Oa r0 = r5.A0I
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            long r2 = X.C63823iP.A04(r0, r4)
            X.4NC r0 = new X.4NC
            r0.<init>(r4, r5)
            X.AnonymousClass1ae.A04(r0, r5, r2)
            r0 = 864269925(0x3383b665, float:6.13334E-8)
            goto L_0x33e4
        L_0x03c6:
            r0 = -638759939(0xffffffffd9ed4bfd, float:-8.3491399E15)
            goto L_0x33e4
        L_0x03cb:
            r1 = 1531489017(0x5b48aaf9, float:5.6482982E16)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.1aX r2 = (X.AnonymousClass1aX) r2
            java.lang.Object r0 = r0.A01
            android.content.Context r0 = (android.content.Context) r0
            X.AnonymousClass1aX.A02(r0, r2)
            r0 = -1357855405(0xffffffffaf10c553, float:-1.3166827E-10)
            goto L_0x33e4
        L_0x03e2:
            r1 = -184238(0xfffffffffffd3052, float:NaN)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.1aX r2 = (X.AnonymousClass1aX) r2
            java.lang.Object r0 = r0.A01
            android.content.Context r0 = (android.content.Context) r0
            X.AnonymousClass1aX.A01(r0, r2)
            r0 = 1413464093(0x543fc01d, float:3.29424752E12)
            goto L_0x33e4
        L_0x03f9:
            r1 = 738510497(0x2c04c6a1, float:1.886859E-12)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A01
            X.3DN r3 = (X.AnonymousClass3DN) r3
            boolean r2 = r3.A0B
            if (r2 == 0) goto L_0x0412
            r2 = 0
            r3.A09 = r2
            java.lang.Object r0 = r0.A00
            X.4sn r0 = (X.C84244sn) r0
            r0.Btw(r3)
        L_0x0412:
            r0 = -1740533420(0xffffffff98419154, float:-2.5018037E-24)
            goto L_0x33e4
        L_0x0417:
            r1 = 805612372(0x3004ab54, float:4.826479E-10)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r5 = r0.A00
            X.1dd r5 = (X.C23351dd) r5
            java.lang.Object r6 = r0.A01
            X.3DN r6 = (X.AnonymousClass3DN) r6
            com.instagram.service.session.UserSession r0 = r5.A00
            java.lang.String r8 = r0.token
            android.os.Bundle r7 = X.C18180wK.A06()
            java.lang.String r2 = r6.A06
            java.lang.String r0 = "id"
            r7.putString(r0, r2)
            float r2 = r6.A00
            java.lang.String r0 = "latitude"
            r7.putFloat(r0, r2)
            float r2 = r6.A01
            java.lang.String r0 = "longitude"
            r7.putFloat(r0, r2)
            long r2 = r6.A04
            java.lang.String r0 = "timestamp"
            r7.putLong(r0, r2)
            long r2 = r6.A03
            java.lang.String r0 = "status_update_timestamp"
            r7.putLong(r0, r2)
            java.lang.String r2 = r6.A05
            java.lang.String r0 = "device"
            r7.putString(r0, r2)
            java.lang.String r2 = r6.A07
            java.lang.String r0 = "location"
            r7.putString(r0, r2)
            boolean r2 = r6.A09
            java.lang.String r0 = "is_confirmed"
            r7.putBoolean(r0, r2)
            int r2 = r6.A02
            java.lang.String r0 = "position"
            r7.putInt(r0, r2)
            boolean r2 = r6.A0A
            java.lang.String r0 = "is_current"
            r7.putBoolean(r0, r2)
            boolean r2 = r6.A0B
            java.lang.String r0 = "is_suspicious_login"
            r7.putBoolean(r0, r2)
            java.lang.String r4 = r6.A08
            r3 = 9
            r2 = 8
            r0 = 111(0x6f, float:1.56E-43)
            java.lang.String r0 = X.C61973Wo.A01(r3, r2, r0)
            r7.putString(r0, r4)
            X.1dD r4 = new X.1dD
            r4.<init>()
            X.C18190wL.A13(r7, r8)
            r4.setArguments(r7)
            com.instagram.service.session.UserSession r0 = r5.A00
            X.Jj9 r3 = X.C18210wN.A0L(r0)
            android.content.Context r2 = r5.requireContext()
            r0 = 2131830131(0x7f112573, float:1.929325E38)
            X.C18230wP.A10(r2, r3, r0)
            android.content.Context r2 = r5.requireContext()
            r0 = 2131830141(0x7f11257d, float:1.929327E38)
            java.lang.String r0 = r2.getString(r0)
            r3.A0R = r0
            r0 = 231(0xe7, float:3.24E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r6, r5, r0)
            r3.A0A = r0
            X.Jqm r2 = r3.A00()
            r0 = 1
            r2.A0I(r0)
            android.app.Activity r0 = r5.getRootActivity()
            X.C37383Jqm.A00(r0, r4, r2)
            r0 = 1037075927(0x3dd085d7, float:0.10181778)
            goto L_0x33e4
        L_0x04ce:
            r1 = 569468383(0x21f165df, float:1.635776E-18)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r7 = r0.A00
            X.1dd r7 = (X.C23351dd) r7
            com.instagram.service.session.UserSession r3 = r7.A00
            java.lang.Object r2 = r0.A01
            X.3DN r2 = (X.AnonymousClass3DN) r2
            java.lang.String r6 = r2.A06
            if (r6 != 0) goto L_0x04e5
            java.lang.String r6 = ""
        L_0x04e5:
            X.H1T r5 = X.AnonymousClass0wJ.A0N(r3)
            r4 = 97
            r3 = 38
            r2 = 51
            java.lang.String r2 = X.C61973Wo.A01(r4, r3, r2)
            X.C18200wM.A1N(r5, r2)
            r4 = 174(0xae, float:2.44E-43)
            r3 = 10
            r2 = 9
            java.lang.String r2 = X.C61973Wo.A01(r4, r3, r2)
            X.H8c r3 = X.C18200wM.A0T(r5, r2, r6)
            r2 = 181(0xb5, float:2.54E-43)
            X.C63873iU.A0E(r3, r0, r2)
            r7.schedule(r3)
            r0 = -1840248640(0xffffffff925008c0, float:-6.5644013E-28)
            goto L_0x33e4
        L_0x0511:
            java.lang.Object r5 = r0.A00
            X.CUH r5 = (X.CUH) r5
            java.lang.Object r4 = r0.A01
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            r0 = 53
            com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2 r3 = new com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2
            r3.<init>(r0, r5, r4)
            com.instagram.service.session.UserSession r0 = r5.A04
            X.Drj r2 = X.C37088JkK.A00(r0)
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            com.instagram.service.session.UserSession r0 = r5.A04
            r2.A07(r1, r3, r0, r4)
            java.lang.String r2 = r4.getId()
            X.0nS r1 = r5.A01
            java.lang.String r0 = "remove_follower_dialog_confirmed"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2631(0xa47, float:3.687E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            java.lang.String r0 = "target_id"
            r1.A0T(r0, r2)
            r1.Bb4()
            return
        L_0x054a:
            r1 = -2047741011(0xffffffff85f1f3ad, float:-2.2753043E-35)
            int r3 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.1jp r2 = (X.C24681jp) r2
            java.lang.Object r0 = r0.A01
            X.39E r0 = (X.AnonymousClass39E) r0
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 == r0) goto L_0x0568
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r1 == r0) goto L_0x0568
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            r8 = 0
            if (r1 != r0) goto L_0x0569
        L_0x0568:
            r8 = 1
        L_0x0569:
            java.lang.Integer r7 = X.AnonymousClass006.A00
            boolean r9 = X.C18180wK.A1Z(r1, r7)
            com.instagram.service.session.UserSession r6 = r2.A07
            androidx.fragment.app.Fragment r4 = r2.A02
            if (r4 != 0) goto L_0x0577
            androidx.fragment.app.Fragment r4 = r2.A01
        L_0x0577:
            X.0kW r5 = r2.A03
            X.AnonymousClass3h4.A03(r4, r5, r6, r7, r8, r9)
            r2.A00()
            r0 = -900584602(0xffffffffca522b66, float:-3443417.5)
            goto L_0x2f8c
        L_0x0584:
            r1 = 1761052131(0x68f785e3, float:9.3511544E24)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.1jp r2 = (X.C24681jp) r2
            java.lang.Object r7 = r0.A00
            android.app.Activity r7 = (android.app.Activity) r7
            com.instagram.service.session.UserSession r6 = r2.A07
            java.lang.Class<com.instagram.modal.ModalActivity> r5 = com.instagram.modal.ModalActivity.class
            X.23u r4 = X.C309923u.DISCOVER_PEOPLE
            r3 = 0
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r0 = "NametagFragment.ARGUMENT_ENTRY_POINT"
            r2.putSerializable(r0, r4)
            java.lang.String r0 = "NametagFragment.ARGUMENT_SCAN_MODE"
            r2.putBoolean(r0, r3)
            java.lang.String r0 = "nametag"
            X.C63863iT.A09(r7, r2, r6, r5, r0)
            r0 = 2005517353(0x7789c429, float:5.588463E33)
            goto L_0x33e4
        L_0x05b2:
            r1 = -980783305(0xffffffffc58a6f37, float:-4429.902)
            int r3 = X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A01
            X.1kr r1 = (X.C24931kr) r1
            X.3IU r7 = r1.A01
            java.lang.Object r0 = r0.A00
            X.1lH r0 = (X.AnonymousClass1lH) r0
            X.3TH r0 = r0.A00
            com.instagram.unifiedfeedback.api.graphql.FBFeedbackImpl$OwningProfile r6 = r0.A03
            r5 = 0
            if (r6 == 0) goto L_0x05ce
            java.lang.String r5 = X.C18250wR.A0X(r6)
        L_0x05ce:
            java.lang.String r4 = "Required value was null."
            if (r5 == 0) goto L_0x05fa
            if (r6 == 0) goto L_0x0602
            java.lang.String r2 = X.C18220wO.A0l(r6)
            if (r2 == 0) goto L_0x0602
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.FBFeedbackImpl$OwningProfile$ProfilePicture> r1 = com.instagram.unifiedfeedback.api.graphql.FBFeedbackImpl.OwningProfile.ProfilePicture.class
            java.lang.String r0 = "profile_picture(scale:1,width:150)"
            com.facebook.pando.TreeJNI r0 = r6.getTreeValue(r0, r1)
            if (r0 == 0) goto L_0x05f2
            java.lang.String r0 = X.C18250wR.A0Y(r0)
            if (r0 == 0) goto L_0x05f2
            r7.A03(r5, r2, r0)
            r0 = -1530895218(0xffffffffa4c0648e, float:-8.343707E-17)
            goto L_0x2f8c
        L_0x05f2:
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r4)
            r0 = -276760593(0xffffffffef80f7ef, float:-7.982763E28)
            goto L_0x0609
        L_0x05fa:
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r4)
            r0 = -747012905(0xffffffffd3797cd7, float:-1.07154132E12)
            goto L_0x0609
        L_0x0602:
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r4)
            r0 = -1362529963(0xffffffffaec97155, float:-9.1605536E-11)
        L_0x0609:
            X.C14030oh.A0C(r0, r3)
            throw r1
        L_0x060d:
            r1 = -235484498(0xfffffffff1f6caae, float:-2.4441068E30)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.1kf r2 = (X.C24811kf) r2
            X.3IU r2 = r2.A00
            java.lang.Object r0 = r0.A00
            X.12a r0 = (X.C198312a) r0
            android.view.View r4 = r0.A00
            r11 = 0
            X.1dM r2 = r2.A00
            r0 = 2131835764(0x7f113b74, float:1.9304676E38)
            java.lang.String r10 = X.C18180wK.A0g(r2, r0)
            android.content.Context r3 = r4.getContext()
            r0 = 2131232973(0x7f0808cd, float:1.808207E38)
            android.graphics.drawable.Drawable r6 = r3.getDrawable(r0)
            X.4Cp r8 = new X.4Cp
            r8.<init>(r2)
            r7 = 0
            r13 = 1
            X.JP4 r5 = new X.JP4
            r9 = r7
            r12 = r11
            r14 = r11
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = 2131832019(0x7f112cd3, float:1.929708E38)
            java.lang.String r19 = X.C18180wK.A0g(r2, r0)
            r0 = 2131232607(0x7f08075f, float:1.8081328E38)
            android.graphics.drawable.Drawable r15 = r3.getDrawable(r0)
            X.4Cq r0 = new X.4Cq
            r0.<init>(r4, r2)
            X.JP4 r14 = new X.JP4
            r16 = r7
            r17 = r0
            r18 = r7
            r20 = r11
            r21 = r11
            r22 = r13
            r23 = r11
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.JP4[] r0 = new X.JP4[]{r5, r14}
            java.util.List r5 = X.C06750aI.A17(r0)
            X.0Oa r0 = r2.A0I
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r0)
            X.C75 r0 = new X.C75
            r0.<init>(r3, r2, r7, r11)
            r0.A00(r5)
            r0.showAsDropDown(r4)
            r0 = -1078754261(0xffffffffbfb3842b, float:-1.402471)
            goto L_0x33e4
        L_0x0688:
            r1 = 2073284538(0x7b93cfba, float:1.5349617E36)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A01
            X.1dM r4 = (X.AnonymousClass1dM) r4
            java.lang.Object r0 = r0.A00
            X.3Vc r0 = (X.C61723Vc) r0
            X.AnonymousClass1dM.A01(r4, r0)
            java.util.Set r0 = r4.A0H
            r0.clear()
            X.AnonymousClass1dM.A00(r4)
            X.3iD r3 = X.C63733iD.A01()
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r4)
            r0 = 2131824158(0x7f110e1e, float:1.9281136E38)
            java.lang.String r0 = r2.getString(r0)
            r3.A0A = r0
            android.view.View r0 = r4.A00
            if (r0 != 0) goto L_0x06bb
            java.lang.String r7 = "composerView"
            goto L_0x2f03
        L_0x06bb:
            int r0 = r0.getHeight()
            int r0 = r0 + 2
            r3.A02 = r0
            X.C63733iD.A0A(r3)
            r0 = 513181424(0x1e9686f0, float:1.5937677E-20)
            goto L_0x33e4
        L_0x06cb:
            r1 = -1302921629(0xffffffffb256fe63, float:-1.251428E-8)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.1dM r2 = (X.AnonymousClass1dM) r2
            java.lang.Object r0 = r0.A00
            X.3Vc r0 = (X.C61723Vc) r0
            X.AnonymousClass1dM.A01(r2, r0)
            java.util.Set r0 = r2.A0H
            r0.clear()
            X.AnonymousClass1dM.A00(r2)
            r0 = 858000823(0x33240db7, float:3.81967E-8)
            goto L_0x33e4
        L_0x06ea:
            r1 = -1699418408(0xffffffff9ab4eed8, float:-7.483213E-23)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.48N r2 = (X.AnonymousClass48N) r2
            X.3Vc r4 = r2.A00
            com.instagram.unifiedfeedback.api.graphql.FBCommentImpl r2 = r4.A05
            if (r2 == 0) goto L_0x0714
            com.instagram.unifiedfeedback.api.graphql.FBCommentImpl$Feedback r2 = r2.A00()
            if (r2 == 0) goto L_0x0714
            java.lang.String r3 = X.C18220wO.A0m(r2)
            if (r3 == 0) goto L_0x0714
            java.lang.Object r0 = r0.A01
            X.1l3 r0 = (X.AnonymousClass1l3) r0
            X.3IU r2 = r0.A02
            int r0 = r4.A00()
            r2.A02(r3, r0)
        L_0x0714:
            r0 = 493124811(0x1d647ccb, float:3.0240065E-21)
            goto L_0x33e4
        L_0x0719:
            r1 = 1553797703(0x5c9d1247, float:3.5369334E17)
            int r1 = X.AnonymousClass1lO.A00(r3, r0, r1)
            r0 = -728772414(0xffffffffd48fd0c2, float:-4.9414616E12)
            goto L_0x33e4
        L_0x0725:
            r1 = 2068055601(0x7b440631, float:1.0178158E36)
            int r1 = X.AnonymousClass1lO.A00(r3, r0, r1)
            r0 = 229977571(0xdb52de3, float:1.1166033E-30)
            goto L_0x33e4
        L_0x0731:
            r1 = -170618552(0xfffffffff5d49148, float:-5.3892265E32)
            int r1 = X.AnonymousClass1lO.A00(r3, r0, r1)
            r0 = 366824043(0x15dd4a6b, float:8.93786E-26)
            goto L_0x33e4
        L_0x073d:
            r1 = -1140942892(0xffffffffbbfe97d4, float:-0.007769564)
            int r6 = X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A01
            X.1l3 r1 = (X.AnonymousClass1l3) r1
            X.3IU r8 = r1.A02
            java.lang.Object r7 = r0.A00
            com.facebook.pando.TreeJNI r7 = (com.facebook.pando.TreeJNI) r7
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.FBCommentImpl$Author> r2 = com.instagram.unifiedfeedback.api.graphql.FBCommentImpl.Author.class
            java.lang.String r1 = "author"
            com.facebook.pando.TreeJNI r0 = r7.getTreeValue(r1, r2)
            r5 = 0
            if (r0 == 0) goto L_0x075d
            java.lang.String r5 = X.C18250wR.A0X(r0)
        L_0x075d:
            java.lang.String r4 = "Required value was null."
            if (r5 == 0) goto L_0x0795
            com.facebook.pando.TreeJNI r0 = r7.getTreeValue(r1, r2)
            if (r0 == 0) goto L_0x078d
            java.lang.String r3 = X.C18220wO.A0l(r0)
            if (r3 == 0) goto L_0x078d
            com.facebook.pando.TreeJNI r2 = r7.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x079d
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.FBCommentImpl$Author$ProfilePicture100> r1 = com.instagram.unifiedfeedback.api.graphql.FBCommentImpl.Author.ProfilePicture100.class
            java.lang.String r0 = "profile_picture(scale:1,width:100)"
            com.facebook.pando.TreeJNI r0 = r2.getTreeValue(r0, r1)
            if (r0 == 0) goto L_0x079d
            java.lang.String r0 = X.C18250wR.A0Y(r0)
            if (r0 == 0) goto L_0x079d
            r8.A03(r5, r3, r0)
            r0 = -1303706967(0xffffffffb24b02a9, float:-1.181676E-8)
            X.C14030oh.A0C(r0, r6)
            return
        L_0x078d:
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r4)
            r0 = -263622414(0xfffffffff04970f2, float:-2.4937212E29)
            goto L_0x07a4
        L_0x0795:
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r4)
            r0 = 773043321(0x2e13b479, float:3.3584222E-11)
            goto L_0x07a4
        L_0x079d:
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r4)
            r0 = -1606391775(0xffffffffa0406821, float:-1.6297486E-19)
        L_0x07a4:
            X.C14030oh.A0C(r0, r6)
            throw r1
        L_0x07a8:
            r1 = 707533296(0x2a2c19f0, float:1.5285668E-13)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A00
            X.CUH r3 = (X.CUH) r3
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            com.instagram.service.session.UserSession r0 = r3.A04
            X.Drz r2 = X.AnonymousClass0wJ.A0Q(r2, r0)
            X.Dpo r0 = X.C25667Dpo.A02
            X.Dmu r4 = r0.A01()
            com.instagram.service.session.UserSession r5 = r3.A04
            r6 = 1
            r7 = 0
            r8 = r7
            r9 = r7
            r10 = r7
            androidx.fragment.app.Fragment r0 = r4.A02(r5, r6, r7, r8, r9, r10)
            r2.A03 = r0
            r2.A05()
            X.0nS r2 = r3.A01
            java.lang.String r0 = "follow_request_entrypoint_tapped"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r0)
            r0 = 657(0x291, float:9.2E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r0)
            java.lang.String r0 = r3.getModuleName()
            X.C18230wP.A1H(r2, r0)
            r2.Bb4()
            r0 = -2030853569(0xffffffff86f3a23f, float:-9.164484E-35)
            goto L_0x33e4
        L_0x07f0:
            java.lang.Object r1 = r0.A00
            X.4qk r1 = (X.C83074qk) r1
            java.lang.Object r0 = r0.A01
            X.3hu r0 = (X.C63613hu) r0
            r1.BjF(r0)
            return
        L_0x07fc:
            r1 = 188219489(0xb380061, float:3.5437396E-32)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            android.view.View r2 = (android.view.View) r2
            r0 = 2131299932(0x7f090e5c, float:1.821788E38)
            android.view.View r0 = r2.requireViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r5 = X.AnonymousClass0wJ.A0n(r0)
            r0 = 2131299931(0x7f090e5b, float:1.8217877E38)
            android.view.View r0 = r2.requireViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r4 = X.AnonymousClass0wJ.A0n(r0)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0857
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0857
            int r0 = java.lang.Integer.parseInt(r5)
            X.C25296DjH.A01 = r0
            int r0 = java.lang.Integer.parseInt(r4)
            X.C25296DjH.A00 = r0
            android.content.Context r3 = r2.getContext()
            java.lang.String r0 = "Set duration push: "
            java.lang.StringBuilder r2 = X.C18190wL.A0s(r0)
            r2.append(r5)
            r0 = 10
            r2.append(r0)
            java.lang.String r0 = "Set duration pop: "
            r2.append(r0)
            java.lang.String r0 = X.C18180wK.A0i(r4, r2)
            X.C63813iO.A01(r3, r0)
        L_0x0857:
            r0 = 1166553946(0x4588335a, float:4358.419)
            goto L_0x33e4
        L_0x085c:
            r1 = 422650591(0x193122df, float:9.157728E-24)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r9 = r0.A00
            X.1d0 r9 = (X.AnonymousClass1d0) r9
            java.lang.Object r0 = r0.A01
            X.3CY r0 = (X.AnonymousClass3CY) r0
            java.util.List r2 = r0.A04
            if (r2 == 0) goto L_0x08e9
            java.lang.String r11 = "fb_profile"
            r8 = 0
            android.content.Context r0 = r9.requireContext()
            com.instagram.model.androidlink.AndroidLink r7 = X.C19425Aw7.A02(r0, r2)
            if (r7 == 0) goto L_0x08ad
            X.9vP r6 = X.C18762Aky.A00(r7)
            if (r6 == 0) goto L_0x08ad
            int r5 = r6.ordinal()
            java.lang.String r4 = "Required value was null."
            java.lang.String r3 = "adId"
            java.lang.String r2 = "userSession"
            r17 = 0
            if (r5 == r8) goto L_0x08b2
            r0 = 2
            if (r5 != r0) goto L_0x08ad
            com.instagram.service.session.UserSession r10 = r9.A03
            if (r10 == 0) goto L_0x08e5
            java.lang.String r13 = r7.A0C
            java.lang.String r14 = r9.A06
            if (r14 == 0) goto L_0x08e1
            java.lang.String r15 = r9.A08
            java.lang.String r12 = "deeplink"
            X.C19606Az7.A0Q(r9, r10, r11, r12, r13, r14, r15)
            androidx.fragment.app.FragmentActivity r0 = r9.requireActivity()
            if (r13 == 0) goto L_0x08d7
            X.C37412JrW.A04(r0, r6, r13)
        L_0x08ad:
            r0 = -2020310974(0xffffffff87948042, float:-2.2343948E-34)
            goto L_0x33e4
        L_0x08b2:
            com.instagram.service.session.UserSession r10 = r9.A03
            if (r10 == 0) goto L_0x08e5
            java.lang.String r13 = r7.A0K
            java.lang.String r14 = r9.A06
            if (r14 == 0) goto L_0x08e1
            java.lang.String r15 = r9.A08
            java.lang.String r12 = "webclick"
            X.C19606Az7.A0Q(r9, r10, r11, r12, r13, r14, r15)
            androidx.fragment.app.FragmentActivity r14 = r9.requireActivity()
            com.instagram.service.session.UserSession r15 = r9.A03
            if (r15 == 0) goto L_0x08e5
            if (r13 == 0) goto L_0x08dc
            X.9wF r16 = X.C171209wF.A1r
            java.lang.String r19 = "political_ad_info_sheet"
            r18 = r13
            X.C37412JrW.A06(r14, r15, r16, r17, r18, r19)
            goto L_0x08ad
        L_0x08d7:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r4)
            throw r0
        L_0x08dc:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r4)
            throw r0
        L_0x08e1:
            X.C04220Ms.A0E(r3)
            throw r17
        L_0x08e5:
            X.C04220Ms.A0E(r2)
            throw r17
        L_0x08e9:
            java.lang.String r7 = "pageLinks"
            goto L_0x2f03
        L_0x08ed:
            r1 = -1445922854(0xffffffffa9d0f7da, float:-9.280051E-14)
            int r2 = X.C14030oh.A05(r1)
            java.lang.Object r8 = r0.A00
            X.1d0 r8 = (X.AnonymousClass1d0) r8
            java.lang.Object r3 = r0.A01
            X.1Tt r3 = (X.C22201Tt) r3
            com.instagram.service.session.UserSession r9 = r8.A03
            java.lang.String r7 = "userSession"
            if (r9 == 0) goto L_0x2f03
            r12 = 0
            java.lang.String r13 = r8.A06
            if (r13 == 0) goto L_0x0b21
            java.lang.String r14 = r8.A08
            java.lang.String r10 = "expanded_political_ad_info_sheet"
            java.lang.String r11 = "tap"
            X.C19606Az7.A0Q(r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r0 = r8.A07
            if (r0 == 0) goto L_0x0963
            com.instagram.service.session.UserSession r1 = r8.A03
            if (r1 != 0) goto L_0x091c
            X.C04220Ms.A0E(r7)
            throw r12
        L_0x091c:
            X.43w r0 = new X.43w
            r0.<init>(r1)
            java.lang.String r6 = r8.A09
            if (r6 != 0) goto L_0x092b
            java.lang.String r0 = "userId"
            X.C04220Ms.A0E(r0)
            throw r12
        L_0x092b:
            java.lang.Boolean r5 = r8.A05
            X.0nS r1 = r0.A00
            java.lang.String r0 = "ig_authenticity_consumer"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 801(0x321, float:1.122E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18180wK.A0I(r1, r0)
            X.FgO r0 = X.C29014FgO.STATE_RUN_MEDIA
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "product"
            r4.A0T(r0, r1)
            X.29i r0 = X.C318829i.TAPPED_LEARN_MORE
            X.C18220wO.A1E(r0, r4)
            X.Fgb r1 = X.C29027Fgb.SIEP_BOTTOMSHEET
            java.lang.String r0 = "screen"
            r4.A0O(r1, r0)
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r6)
            java.lang.String r0 = "target_user_id"
            r4.A0S(r0, r1)
            java.lang.String r0 = "target_location_shared"
            r4.A0Q(r0, r5)
            r4.Bb4()
        L_0x0963:
            android.os.Bundle r5 = r8.requireArguments()
            java.lang.String r1 = r3.A0B
            if (r1 == 0) goto L_0x0a3f
            java.lang.String r0 = "header_title"
            r5.putString(r0, r1)
            java.lang.String r1 = r3.A07
            if (r1 == 0) goto L_0x0a3c
            java.lang.String r0 = "byline_text"
            r5.putString(r0, r1)
            java.lang.String r1 = r3.A06
            if (r1 == 0) goto L_0x0a39
            java.lang.String r0 = "ad_library_url"
            r5.putString(r0, r1)
            java.lang.String r1 = r3.A02
            if (r1 == 0) goto L_0x0a36
            java.lang.String r0 = "about_ads_text"
            r5.putString(r0, r1)
            java.lang.String r1 = r3.A03
            if (r1 == 0) goto L_0x0a33
            java.lang.String r0 = "about_ads_url"
            r5.putString(r0, r1)
            java.lang.String r1 = r3.A09
            if (r1 == 0) goto L_0x0a30
            java.lang.String r0 = "funding_disclaimer_short"
            r5.putString(r0, r1)
            java.lang.String r1 = r3.A05
            if (r1 == 0) goto L_0x0a2d
            java.lang.String r0 = "ads_about_politics_header"
            r5.putString(r0, r1)
            java.lang.String r1 = r3.A04
            if (r1 == 0) goto L_0x0a42
            java.lang.String r0 = "ads_about_politics_description"
            r5.putString(r0, r1)
            java.lang.String r1 = r3.A0G
            java.lang.String r0 = "tax_id"
            r5.putString(r0, r1)
            X.3Aw r6 = r3.A01
            if (r6 == 0) goto L_0x09d7
            java.lang.String r4 = r6.A01
            r3 = 43
            r1 = 12
            r0 = 14
            java.lang.String r0 = X.AnonymousClass3QC.A00(r3, r1, r0)
            r5.putString(r0, r4)
            java.lang.String r1 = r6.A00
            java.lang.String r0 = "email"
            r5.putString(r0, r1)
            java.lang.String r1 = r6.A02
            java.lang.String r0 = "website"
            r5.putString(r0, r1)
        L_0x09d7:
            java.lang.String r1 = r8.A07
            java.lang.String r0 = "state_run_media_country"
            r5.putString(r0, r1)
            int r1 = r8.A00
            r0 = 2
            if (r1 == r0) goto L_0x0a02
            r0 = 3
            if (r1 == r0) goto L_0x0a02
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            com.instagram.service.session.UserSession r0 = r8.A03
            if (r0 != 0) goto L_0x09f2
            X.C04220Ms.A0E(r7)
            throw r12
        L_0x09f2:
            X.Drz r1 = X.C18180wK.A0Q(r1, r0)
            X.1cy r0 = new X.1cy
            r0.<init>()
            r0.setArguments(r5)
            X.C18180wK.A17(r0, r1)
            goto L_0x0a19
        L_0x0a02:
            com.instagram.service.session.UserSession r4 = r8.A03
            if (r4 != 0) goto L_0x0a0a
            X.C04220Ms.A0E(r7)
            throw r12
        L_0x0a0a:
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            java.lang.String r0 = "political_ad_expanded_info_sheet"
            X.3iT r0 = X.C63863iT.A05(r1, r5, r4, r3, r0)
            X.C63863iT.A0D(r8, r0)
        L_0x0a19:
            X.GVD r1 = X.C25745DrH.A00
            android.content.Context r0 = r8.getContext()
            X.DrH r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0a28
            r0.A0C()
        L_0x0a28:
            r0 = -2099563358(0xffffffff82db34a2, float:-3.2209368E-37)
            goto L_0x0e98
        L_0x0a2d:
            java.lang.String r0 = "adsAboutPoliticsHeader"
            goto L_0x0a44
        L_0x0a30:
            java.lang.String r0 = "fundingDisclaimerShort"
            goto L_0x0a44
        L_0x0a33:
            java.lang.String r0 = "aboutPoliticalAdsUrl"
            goto L_0x0a44
        L_0x0a36:
            java.lang.String r0 = "aboutAdsTitle"
            goto L_0x0a44
        L_0x0a39:
            java.lang.String r0 = "archiveUrl"
            goto L_0x0a44
        L_0x0a3c:
            java.lang.String r0 = "description"
            goto L_0x0a44
        L_0x0a3f:
            java.lang.String r0 = "headerTitle"
            goto L_0x0a44
        L_0x0a42:
            java.lang.String r0 = "adsAboutPoliticsDescription"
        L_0x0a44:
            X.C04220Ms.A0E(r0)
            throw r12
        L_0x0a48:
            r1 = -1501786631(0xffffffffa67c8df9, float:-8.762247E-16)
            int r3 = X.C14030oh.A05(r1)
            java.lang.Object r8 = r0.A00
            X.1d0 r8 = (X.AnonymousClass1d0) r8
            java.lang.Object r2 = r0.A01
            X.1Tt r2 = (X.C22201Tt) r2
            com.instagram.service.session.UserSession r0 = r8.A03
            java.lang.String r7 = "userSession"
            if (r0 == 0) goto L_0x2f03
            X.H1T r4 = X.AnonymousClass0wJ.A0O(r0)
            java.lang.String r0 = "interest/set_sensitive_topics/?referer=political_ad_info_sheet"
            r4.A0J(r0)
            java.lang.String r1 = "sensitive_topic_id"
            java.lang.String r0 = "4"
            r4.A0O(r1, r0)
            java.lang.String r1 = "enable_as_sensitive"
            r0 = 1
            r4.A0R(r1, r0)
            X.H8c r0 = X.AnonymousClass0wJ.A0S(r4)
            r8.schedule(r0)
            com.instagram.service.session.UserSession r9 = r8.A03
            if (r9 == 0) goto L_0x2f03
            r12 = 0
            java.lang.String r13 = r8.A06
            if (r13 == 0) goto L_0x0b21
            java.lang.String r14 = r8.A08
            java.lang.String r10 = "see_fewer_ads_like_this"
            java.lang.String r11 = "tap"
            X.C19606Az7.A0Q(r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r0 = r8.A07
            if (r0 == 0) goto L_0x0adf
            com.instagram.service.session.UserSession r1 = r8.A03
            if (r1 != 0) goto L_0x0a98
            X.C04220Ms.A0E(r7)
            throw r12
        L_0x0a98:
            X.43w r0 = new X.43w
            r0.<init>(r1)
            java.lang.String r6 = r8.A09
            if (r6 != 0) goto L_0x0aa7
            java.lang.String r0 = "userId"
            X.C04220Ms.A0E(r0)
            throw r12
        L_0x0aa7:
            java.lang.Boolean r5 = r8.A05
            X.0nS r1 = r0.A00
            java.lang.String r0 = "ig_authenticity_consumer"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 801(0x321, float:1.122E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18180wK.A0I(r1, r0)
            X.FgO r0 = X.C29014FgO.STATE_RUN_MEDIA
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "product"
            r4.A0T(r0, r1)
            X.29i r0 = X.C318829i.TAPPED_SEE_FEWER_ADS
            X.C18220wO.A1E(r0, r4)
            X.Fgb r1 = X.C29027Fgb.SIEP_BOTTOMSHEET
            java.lang.String r0 = "screen"
            r4.A0O(r1, r0)
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r6)
            java.lang.String r0 = "target_user_id"
            r4.A0S(r0, r1)
            java.lang.String r0 = "target_location_shared"
            r4.A0Q(r0, r5)
            r4.Bb4()
        L_0x0adf:
            android.os.Bundle r4 = r8.requireArguments()
            java.lang.String r1 = r2.A0F
            if (r1 == 0) goto L_0x0b1b
            java.lang.String r0 = "see_fewer_political_ads_confirmation_text"
            r4.putString(r0, r1)
            java.lang.String r1 = r2.A0H
            if (r1 == 0) goto L_0x0b15
            java.lang.String r0 = "visit_ad_topic_preferences_text"
            r4.putString(r0, r1)
            com.instagram.service.session.UserSession r0 = r8.A03
            if (r0 != 0) goto L_0x0afd
            X.C04220Ms.A0E(r7)
            throw r12
        L_0x0afd:
            X.Jj9 r2 = X.C18210wN.A0L(r0)
            X.Jqm r1 = r8.A02
            if (r1 == 0) goto L_0x0b10
            X.1cw r0 = new X.1cw
            r0.<init>()
            r0.setArguments(r4)
            r1.A09(r0, r2)
        L_0x0b10:
            r0 = -1737952308(0xffffffff9868f3cc, float:-3.0108383E-24)
            goto L_0x2f8c
        L_0x0b15:
            java.lang.String r0 = "visitAdTopicPreferencesText"
            X.C04220Ms.A0E(r0)
            throw r12
        L_0x0b1b:
            java.lang.String r0 = "seeFewerPoliticalAdsConfirmationText"
            X.C04220Ms.A0E(r0)
            throw r12
        L_0x0b21:
            java.lang.String r0 = "adId"
            X.C04220Ms.A0E(r0)
            throw r12
        L_0x0b27:
            r1 = -1868635603(0xffffffff909ee22d, float:-6.266849E-29)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A01
            X.1d0 r4 = (X.AnonymousClass1d0) r4
            com.instagram.ui.widget.spinner.SpinnerImageView r3 = r4.A04
            if (r3 == 0) goto L_0x0b3a
            r2 = 0
            r3.setOnClickListener(r2)
        L_0x0b3a:
            java.lang.Object r0 = r0.A00
            android.view.View r0 = (android.view.View) r0
            X.AnonymousClass1d0.A00(r0, r4)
            r0 = 885167820(0x34c296cc, float:3.6245035E-7)
            goto L_0x33e4
        L_0x0b46:
            r1 = 1975964640(0x75c6d3e0, float:5.0408795E32)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A00
            X.4qg r1 = (X.C83034qg) r1
            java.lang.Object r0 = r0.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.Bj9(r0)
            r0 = 1689144157(0x64ae4b5d, float:2.5721312E22)
            goto L_0x0e66
        L_0x0b5d:
            r1 = -1693549979(0xffffffff9b0e7a65, float:-1.1785513E-22)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A00
            X.IcN r1 = (X.C34640IcN) r1
            java.lang.Object r0 = r0.A01
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.C49292r9.A00(r1, r0)
            r0 = -1098085316(0xffffffffbe8c8c3c, float:-0.2745074)
            goto L_0x0e66
        L_0x0b74:
            r1 = -967576802(0xffffffffc653f31e, float:-13564.779)
            int r1 = X.AnonymousClass11J.A00(r0, r1)
            r0 = 747981850(0x2c954c1a, float:4.2432837E-12)
            goto L_0x33e4
        L_0x0b80:
            r1 = -672364399(0xffffffffd7ec8891, float:-5.20142585E14)
            int r1 = X.AnonymousClass11J.A00(r0, r1)
            r0 = 1105078356(0x41de2854, float:27.769691)
            goto L_0x33e4
        L_0x0b8c:
            r1 = -951518103(0xffffffffc748fc69, float:-51452.41)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A00
            X.2AI r4 = (X.AnonymousClass2AI) r4
            java.lang.Object r3 = r0.A01
            X.1x1 r3 = (X.AnonymousClass1x1) r3
            X.1q7 r2 = r3.A01
            if (r2 != 0) goto L_0x0ba3
            java.lang.String r7 = "fxCalController"
            goto L_0x2f03
        L_0x0ba3:
            X.264 r1 = X.AnonymousClass1x1.A0B(r3)
            X.0Oa r0 = r3.A04
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            r4.A03(r3, r2, r0, r1)
            r0 = -1665988292(0xffffffff9cb3093c, float:-1.1847613E-21)
            goto L_0x0e66
        L_0x0bb5:
            r1 = 1819592379(0x6c74c6bb, float:1.1836655E27)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A01
            X.1x1 r4 = (X.AnonymousClass1x1) r4
            X.264 r2 = X.AnonymousClass1x1.A0B(r4)
            java.lang.Object r9 = r0.A00
            X.2AI r9 = (X.AnonymousClass2AI) r9
            X.2AI r10 = X.AnonymousClass2AI.A04
            r7 = 0
            if (r9 != r10) goto L_0x0bdd
            X.0Oa r0 = r4.A04
            X.0i6 r8 = X.AnonymousClass0wJ.A0U(r0)
            java.lang.String r6 = r2.A00()
            r1 = 1
            java.lang.String r0 = "facebook_cross_posting_settings_clicked"
            X.C35772Ot.A00(r8, r0, r6, r7, r1)
        L_0x0bdd:
            r1 = 0
            if (r9 != r10) goto L_0x0bf4
            X.0Oa r0 = r4.A04
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            boolean r0 = r9.A0A(r0)
            if (r0 == 0) goto L_0x0bf4
            X.AnonymousClass1x1.A0D(r4, r1)
        L_0x0bef:
            r0 = 656687834(0x272442da, float:2.2795812E-15)
            goto L_0x0e66
        L_0x0bf4:
            X.0Oa r10 = r4.A04
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r10)
            X.C04220Ms.A0B(r0, r1)
            boolean r0 = r9.A09(r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0c55
            X.C04220Ms.A07(r3)
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L_0x0bef
            X.Dsm r6 = X.C18190wL.A0W(r0)
            r0 = 2131837309(0x7f11417d, float:1.930781E38)
            java.lang.String r8 = r4.getString(r0)
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L_0x0c52
            android.content.Context r2 = r4.getContext()
            if (r2 == 0) goto L_0x0c67
            X.0Ok r1 = X.C06810aP.A01
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r10)
            com.instagram.user.model.User r0 = r1.A01(r0)
            java.lang.String r0 = r9.A00(r2, r0)
        L_0x0c33:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r8.getClass()
            java.lang.String r0 = java.lang.String.format(r7, r8, r0)
            r6.A02 = r0
            r0 = 2131823054(0x7f1109ce, float:1.9278897E38)
            r6.A0O(r7, r0)
            r1 = 2131837308(0x7f11417c, float:1.9307807E38)
            r0 = 57
            X.C18190wL.A1R(r6, r4, r3, r0, r1)
            X.AnonymousClass0wJ.A1K(r6)
            goto L_0x0bef
        L_0x0c52:
            java.lang.String r0 = ""
            goto L_0x0c33
        L_0x0c55:
            X.1q7 r1 = r4.A01
            if (r1 != 0) goto L_0x0c5f
            java.lang.String r0 = "fxCalController"
            X.C04220Ms.A0E(r0)
            throw r7
        L_0x0c5f:
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r10)
            r9.A03(r4, r1, r0, r2)
            goto L_0x0bef
        L_0x0c67:
            java.lang.IllegalStateException r7 = X.AnonymousClass0wJ.A0b()
            throw r7
        L_0x0c6c:
            r1 = -1367028110(0xffffffffae84ce72, float:-6.039337E-11)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A01
            X.10v r1 = (X.C196310v) r1
            X.4qc r1 = r1.A00
            java.lang.Object r0 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r0
            r1.C4B(r0)
            r0 = 687916272(0x2900c4f0, float:2.8592525E-14)
            goto L_0x0e66
        L_0x0c85:
            r1 = 251950075(0xf0473fb, float:6.5304395E-30)
            int r1 = X.C18200wM.A01(r1, r3)
            java.lang.Object r2 = r0.A00
            X.4vY r2 = (X.C85654vY) r2
            java.lang.String r5 = r2.B3E()
            if (r5 == 0) goto L_0x0cb3
            android.content.Context r4 = r3.getContext()
            java.lang.Object r0 = r0.A01
            X.1x2 r0 = (X.AnonymousClass1x2) r0
            X.0Oa r0 = r0.A0L
            com.instagram.service.session.UserSession r3 = X.AnonymousClass0wJ.A0X(r0)
            X.9wF r0 = X.C171209wF.A04
            X.Jpy r2 = new X.Jpy
            r2.<init>((android.content.Context) r4, (com.instagram.service.session.UserSession) r3, (X.C171209wF) r0, (java.lang.String) r5)
            java.lang.String r0 = "settings_category_options"
            r2.A07(r0)
            r2.A04()
        L_0x0cb3:
            r0 = 1796174904(0x6b0f7438, float:1.7342522E26)
            goto L_0x33e4
        L_0x0cb8:
            r1 = -725162526(0xffffffffd4c6e5e2, float:-6.8340825E12)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A01
            X.3DA r3 = (X.AnonymousClass3DA) r3
            com.instagram.service.session.UserSession r4 = r3.A04
            X.0kW r2 = r3.A02
            java.lang.String r0 = "options_logout_all_tapped"
            X.0rn r0 = X.C15730rn.A00(r2, r0)
            X.C18180wK.A1K(r0, r4)
            X.0Oa r3 = r3.A06
            java.lang.Object r0 = r3.getValue()
            X.3iC r0 = (X.C63723iC) r0
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x0cfa
            java.util.UUID r0 = X.C03480Iw.A00()
            java.lang.String r2 = X.C18190wL.A0n(r0)
            X.0et r0 = X.C18190wL.A0X()
            r0.A0F(r2)
            java.lang.String r5 = "logout_all_accounts_button_clicked"
            java.lang.String r6 = "logout_spi"
            java.lang.String r7 = "logout"
            java.lang.String r8 = "home_page"
            r9 = 0
            r10 = r9
            X.AnonymousClass3LL.A00(r4, r5, r6, r7, r8, r9, r10)
        L_0x0cfa:
            java.lang.Object r2 = r3.getValue()
            X.3iC r2 = (X.C63723iC) r2
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            r2.A0C(r0)
            r0 = -2100706287(0xffffffff82c9c411, float:-2.9646832E-37)
            goto L_0x33e4
        L_0x0d0a:
            java.lang.Object r1 = r0.A00
            X.3HD r1 = (X.AnonymousClass3HD) r1
            java.lang.Object r0 = r0.A01
            X.4vT r0 = (X.C85604vT) r0
            r1.A00(r3, r0)
            return
        L_0x0d16:
            r1 = 894368235(0x354ef9eb, float:7.710466E-7)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.111 r2 = (X.AnonymousClass111) r2
            X.1Yx r4 = r2.A00
            java.lang.Object r0 = r0.A00
            X.3CU r0 = (X.AnonymousClass3CU) r0
            X.250 r3 = r0.A03
            r2 = 0
            X.0Oa r0 = r4.A0O
            java.lang.Object r0 = r0.getValue()
            X.0zs r0 = (X.C19440zs) r0
            X.4wE r0 = r0.A00
            r0.CrC(r3)
            X.3Eb r5 = r4.A09
            if (r5 != 0) goto L_0x0d41
            java.lang.String r0 = "birthdayLogger"
            X.C04220Ms.A0E(r0)
            throw r2
        L_0x0d41:
            X.0Oa r2 = r4.A0N
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r2)
            long r9 = X.C18200wM.A0B(r0)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r2)
            long r11 = X.C18200wM.A0B(r0)
            X.250 r0 = X.AnonymousClass250.CLOSE_FRIENDS
            if (r3 != r0) goto L_0x0d65
            java.lang.String r8 = "selected_close_friends"
        L_0x0d59:
            java.lang.String r6 = "qp"
            java.lang.String r7 = "visibility"
            r5.A00(r6, r7, r8, r9, r11)
            r0 = -753684120(0xffffffffd313b168, float:-6.3433658E11)
            goto L_0x33e4
        L_0x0d65:
            java.lang.String r8 = "selected_reciprocal_follows"
            goto L_0x0d59
        L_0x0d68:
            r1 = 357438518(0x154e1436, float:4.1617312E-26)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A00
            X.1cP r3 = (X.AnonymousClass1cP) r3
            java.lang.Object r0 = r0.A01
            X.3Bl r0 = (X.AnonymousClass3Bl) r0
            X.Ayd r0 = r0.A03
            android.view.View r1 = X.C18230wP.A0G(r0)
            com.instagram.common.ui.base.IgCheckBox r1 = (com.instagram.common.ui.base.IgCheckBox) r1
            boolean r0 = r3 instanceof X.C28731ut
            if (r0 == 0) goto L_0x0d98
            X.1ut r3 = (X.C28731ut) r3
            boolean r0 = r1.isChecked()
            r2 = r0 ^ 1
            r1.setChecked(r2)
            X.3zC r1 = r3.A05
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r1.A05(r0, r2)
            X.C28731ut.A03(r3)
        L_0x0d98:
            r0 = -602564856(0xffffffffdc159708, float:-1.68423329E17)
            goto L_0x0e66
        L_0x0d9d:
            java.lang.Object r1 = r0.A00
            X.3T7 r1 = (X.AnonymousClass3T7) r1
            java.lang.Object r0 = r0.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.Axa r4 = X.C19513Axa.A00
            androidx.fragment.app.FragmentActivity r3 = r1.A01
            com.instagram.service.session.UserSession r2 = r1.A02
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "shopping_business_settings"
            r4.A17(r3, r2, r1, r0)
            return
        L_0x0db5:
            r1 = -619532481(0xffffffffdb12af3f, float:-4.1288032E16)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A00
            X.3Hd r1 = (X.C58773Hd) r1
            com.instagram.service.session.UserSession r3 = r1.A05
            X.C62423Zt.A02(r3)
            android.app.Activity r2 = r1.A01
            java.lang.Object r0 = r0.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2) r0
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r0.A04
            X.C63493hb.A04(r2, r3, r1, r0)
            r0 = 920901216(0x36e3d660, float:6.7900837E-6)
            goto L_0x0e66
        L_0x0dd7:
            r1 = 416643734(0x18d57a96, float:5.518299E-24)
            int r5 = X.C14030oh.A05(r1)
            android.os.Bundle r6 = X.C18180wK.A06()
            java.lang.String r2 = "entrypoint"
            java.lang.String r1 = "notifications"
            r6.putString(r2, r1)
            java.lang.Object r4 = r0.A01
            X.0i6 r4 = (X.C10300i6) r4
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            java.lang.Object r2 = r0.A00
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            java.lang.String r0 = "quiet_mode_settings"
            X.3iT r0 = X.C63863iT.A04(r1, r6, r4, r3, r0)
            X.C63863iT.A0D(r2, r0)
            r0 = -1529515428(0xffffffffa4d5725c, float:-9.256776E-17)
            goto L_0x0e66
        L_0x0e04:
            java.lang.Object r2 = r0.A00
            X.3Ug r2 = (X.C61573Ug) r2
            java.lang.Object r5 = r0.A01
            X.3Ey r5 = (X.C58313Ey) r5
            com.instagram.service.session.UserSession r4 = r2.A01
            X.C62423Zt.A02(r4)
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "com.instagram.pro_home.monetization_platform.support.monetization_help_screen"
            X.3iE r3 = X.C63743iE.A02(r0, r1)
            X.1dm r0 = r2.A02
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            r2 = 0
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.C18190wL.A0N(r4)
            r3.A0C(r1, r0)
            X.29T r1 = X.AnonymousClass29T.MONETIZATION_HELP
            X.28e r0 = X.C315828e.ENTER
            r5.A00(r0, r1, r2)
            return
        L_0x0e31:
            r1 = 1279841428(0x4c48d494, float:5.264648E7)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.3Va r2 = (X.C61713Va) r2
            java.lang.String r1 = "invite_story"
            java.lang.Object r0 = r0.A01
            X.C61713Va.A00(r2, r0, r1)
            r0 = -309885400(0xffffffffed878628, float:-5.2428327E27)
            goto L_0x0e66
        L_0x0e47:
            r1 = 1917165772(0x7245a0cc, float:3.914428E30)
            int r5 = X.C14030oh.A05(r1)
            java.lang.Object r0 = r0.A01
            X.3z5 r0 = (X.C67193z5) r0
            com.instagram.service.session.UserSession r4 = r0.A04
            X.C62423Zt.A02(r4)
            java.lang.String r3 = r0.A08
            com.instagram.base.activity.BaseFragmentActivity r2 = r0.A01
            if (r2 == 0) goto L_0x0e6a
            r1 = 1
            java.lang.String r0 = "setting"
            X.AnonymousClass3ib.A0L(r2, r4, r3, r0, r1)
            r0 = 458183672(0x1b4f53f8, float:1.714977E-22)
        L_0x0e66:
            X.C14030oh.A0C(r0, r5)
            return
        L_0x0e6a:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0b()
            r0 = -460255273(0xffffffffe4910fd7, float:-2.1407354E22)
            X.C14030oh.A0C(r0, r5)
            throw r1
        L_0x0e75:
            r1 = 1884186267(0x704e669b, float:2.5551182E29)
            int r2 = X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A01
            X.3z5 r1 = (X.C67193z5) r1
            com.instagram.service.session.UserSession r4 = r1.A04
            X.C62423Zt.A02(r4)
            java.lang.Object r5 = r0.A00
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            java.lang.String r6 = r1.A08
            com.instagram.base.activity.BaseFragmentActivity r3 = r1.A01
            if (r3 == 0) goto L_0x0e9c
            r8 = 1
            java.lang.String r7 = "setting"
            X.AnonymousClass3ib.A0D(r3, r4, r5, r6, r7, r8)
            r0 = -546412463(0xffffffffdf6e6851, float:-1.717907E19)
        L_0x0e98:
            X.C14030oh.A0C(r0, r2)
            return
        L_0x0e9c:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0b()
            r0 = 2139464088(0x7f85a198, float:NaN)
            X.C14030oh.A0C(r0, r2)
            throw r1
        L_0x0ea7:
            r1 = 392377967(0x1763366f, float:7.341636E-25)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r5 = r0.A01
            X.3z5 r5 = (X.C67193z5) r5
            com.instagram.service.session.UserSession r4 = r5.A04
            X.C62423Zt.A02(r4)
            java.lang.Object r0 = r0.A00
            X.0kW r0 = (X.C11630kW) r0
            X.3Ru r3 = new X.3Ru
            r3.<init>(r0, r4)
            X.Iuu r2 = X.C35425Iuu.ICEBREAKER_SETTINGS_ROW_CLICK
            r0 = 0
            X.C61073Ru.A00(r2, r3, r0, r0)
            X.C18190wL.A10()
            com.instagram.direct.fragment.icebreaker.DirectIceBreakerSettingFragment r2 = new com.instagram.direct.fragment.icebreaker.DirectIceBreakerSettingFragment
            r2.<init>()
            com.instagram.base.activity.BaseFragmentActivity r0 = r5.A01
            X.Drz r0 = X.AnonymousClass0wJ.A0Q(r0, r4)
            r0.A03 = r2
            r0.A05()
            r0 = 1130818857(0x4366ed29, float:230.9264)
            goto L_0x33e4
        L_0x0ede:
            r1 = -882123366(0xffffffffcb6bdd9a, float:-1.545769E7)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.3z5 r2 = (X.C67193z5) r2
            com.instagram.service.session.UserSession r3 = r2.A04
            X.C62423Zt.A02(r3)
            com.instagram.base.activity.BaseFragmentActivity r2 = r2.A01
            X.Drz r3 = X.AnonymousClass0wJ.A0Q(r2, r3)
            X.C18190wL.A10()
            X.1wS r2 = new X.1wS
            r2.<init>()
            r3.A03 = r2
            r3.A05()
            java.lang.Object r4 = r0.A00
            X.3Ey r4 = (X.C58313Ey) r4
            X.29T r3 = X.AnonymousClass29T.CREATOR_SETTINGS_HELP
            X.28e r2 = X.C315828e.ENTER
            r0 = 0
            r4.A00(r2, r3, r0)
            r0 = -1869871059(0xffffffff908c082d, float:-5.523286E-29)
            goto L_0x33e4
        L_0x0f12:
            r1 = 380438935(0x16ad0997, float:2.795571E-25)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.3z5 r2 = (X.C67193z5) r2
            com.instagram.service.session.UserSession r3 = r2.A04
            X.C62423Zt.A02(r3)
            com.instagram.base.activity.BaseFragmentActivity r2 = r2.A01
            X.Drz r4 = X.AnonymousClass0wJ.A0Q(r2, r3)
            X.3Ek r2 = X.AnonymousClass2S8.A00()
            r2.A00()
            java.lang.Object r3 = r0.A00
            X.1bQ r2 = new X.1bQ
            r2.<init>()
            java.lang.String r0 = "ARGUMENT_PRODUCT_ELIGIBILITY_LIST"
            android.os.Bundle r0 = X.C18180wK.A09(r0, r3)
            X.C18180wK.A0x(r0, r2, r4)
            r0 = -1335276784(0xffffffffb0694b10, float:-8.4871576E-10)
            goto L_0x33e4
        L_0x0f44:
            r1 = -1418835497(0xffffffffab6e49d7, float:-8.465706E-13)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.3z5 r2 = (X.C67193z5) r2
            com.instagram.service.session.UserSession r5 = r2.A04
            X.C62423Zt.A02(r5)
            com.instagram.base.activity.BaseFragmentActivity r4 = r2.A01
            java.lang.Object r3 = r0.A00
            X.0kW r3 = (X.C11630kW) r3
            X.CTd r2 = r2.A02
            X.C62883b4.A01()
            java.lang.String r0 = "setting"
            X.C67243zD.A00(r4, r2, r3, r5, r0)
            r0 = -2033013930(0xffffffff86d2ab56, float:-7.9244976E-35)
            goto L_0x33e4
        L_0x0f69:
            java.lang.Object r4 = r0.A00
            X.3Vj r4 = (X.C61783Vj) r4
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            com.instagram.service.session.UserSession r0 = r4.A07
            X.3Iu r3 = new X.3Iu
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0f7c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0f90
            java.lang.Object r0 = r2.next()
            X.3Xg r0 = (X.C62133Xg) r0
            int r1 = r0.A01
            android.view.View$OnClickListener r0 = r0.A03
            r3.A03(r0, r1)
            goto L_0x0f7c
        L_0x0f90:
            X.3ag r1 = new X.3ag
            r1.<init>(r3)
            androidx.fragment.app.FragmentActivity r0 = r4.A01
            r1.A02(r0)
            return
        L_0x0f9b:
            java.lang.Object r1 = r0.A00
            X.3Vj r1 = (X.C61783Vj) r1
            java.lang.Object r0 = r0.A01
            X.24p r0 = (X.C311924p) r0
            r1.A01(r0)
            return
        L_0x0fa7:
            java.lang.Object r2 = r0.A00
            X.3Bj r2 = (X.C57523Bj) r2
            java.lang.Object r3 = r0.A01
            com.instagram.service.session.UserSession r1 = r2.A02
            X.C62423Zt.A02(r1)
            androidx.fragment.app.FragmentActivity r0 = r2.A01
            X.Drz r2 = X.AnonymousClass0wJ.A0Q(r0, r1)
            X.3Ek r0 = X.AnonymousClass2S8.A00()
            r0.A00()
            X.1bQ r1 = new X.1bQ
            r1.<init>()
            java.lang.String r0 = "ARGUMENT_PRODUCT_ELIGIBILITY_LIST"
            android.os.Bundle r0 = X.C18180wK.A09(r0, r3)
            X.C18180wK.A0x(r0, r1, r2)
            return
        L_0x0fce:
            java.lang.Object r8 = r0.A00
            X.3Bj r8 = (X.C57523Bj) r8
            java.lang.Object r7 = r0.A01
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            java.lang.String r6 = "ad_interests"
            java.lang.String r5 = "ad_topics"
            r3 = 0
            com.instagram.service.session.UserSession r4 = r8.A02
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36316409504336996(0x81059500060c64, double:3.0299818327616416E-306)
            boolean r0 = X.C63803iN.A0E(r2, r4, r0)
            if (r0 == 0) goto L_0x0ff8
            if (r7 == 0) goto L_0x0ff8
            boolean r0 = r7.booleanValue()
            if (r0 == 0) goto L_0x0ff8
            X.1wh r0 = r8.A03
            X.C63013bK.A02(r0, r4, r6, r5, r3)
            return
        L_0x0ff8:
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "com.instagram.ads.ads_interests.ads_interests_screen"
            X.3iE r3 = X.C63743iE.A02(r0, r1)
            androidx.fragment.app.FragmentActivity r2 = r8.A01
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r4)
            r0 = 2131821008(0x7f1101d0, float:1.9274747E38)
            X.C63743iE.A08(r2, r1, r3, r0)
            return
        L_0x100f:
            java.lang.Object r1 = r0.A00
            X.392 r1 = (X.AnonymousClass392) r1
            java.lang.Object r0 = r0.A01
            X.4vD r0 = (X.C85454vD) r0
            X.1dm r4 = r1.A01
            com.instagram.service.session.UserSession r3 = r1.A00
            X.25Z r0 = r0.Axd()
            java.lang.String r2 = r0.toString()
            java.lang.String r1 = "settings_search"
            r0 = 0
            X.C63013bK.A02(r4, r3, r1, r2, r0)
            return
        L_0x102a:
            r1 = 258456636(0xf67bc3c, float:1.1425432E-29)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r6 = r0.A00
            X.1xr r6 = (X.C29371xr) r6
            java.lang.String r5 = r6.A06
            X.0nS r3 = r6.A03
            java.lang.String r2 = "change_privacy_setting_confirmation_tapped"
            X.0A2 r3 = X.AnonymousClass0wJ.A0M(r3, r2)
            r2 = 150(0x96, float:2.1E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18180wK.A0I(r3, r2)
            java.lang.String r3 = "public"
            java.lang.String r2 = "change_privacy_option_to"
            r4.A0T(r2, r3)
            java.lang.String r2 = "qpid"
            r4.A0T(r2, r5)
            java.lang.String r2 = "privacy_updater"
            X.C18210wN.A1C(r4, r2)
            X.CTd r2 = r6.A02
            android.content.Context r3 = r2.getContext()
            X.GVD r2 = X.C25745DrH.A00
            X.DrH r3 = r2.A02(r3)
            if (r3 == 0) goto L_0x106c
            r2 = 8
            X.C18240wQ.A1K(r0, r2, r3)
            r3.A0C()
        L_0x106c:
            r0 = 979006417(0x3a5a73d1, float:8.333298E-4)
            goto L_0x33e4
        L_0x1071:
            r1 = -208653435(0xfffffffff3903385, float:-2.28496E31)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            androidx.fragment.app.FragmentActivity r2 = X.C18240wQ.A0I(r2)
            X.DrH r3 = X.C18220wO.A0b(r2)
            if (r3 == 0) goto L_0x108b
            r2 = 6
            X.C18240wQ.A1K(r0, r2, r3)
            r3.A0C()
        L_0x108b:
            r0 = -1120737978(0xffffffffbd32e546, float:-0.043675683)
            goto L_0x33e4
        L_0x1090:
            r1 = -120970205(0xfffffffff8ca2423, float:-3.2799278E34)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            androidx.fragment.app.FragmentActivity r2 = X.C18240wQ.A0I(r2)
            X.DrH r3 = X.C18220wO.A0b(r2)
            if (r3 == 0) goto L_0x10aa
            r2 = 5
            X.C18240wQ.A1K(r0, r2, r3)
            r3.A0C()
        L_0x10aa:
            r0 = 1090265403(0x40fc213b, float:7.8790565)
            goto L_0x33e4
        L_0x10af:
            java.lang.Object r4 = r0.A00
            X.0i6 r4 = (X.C10300i6) r4
            java.lang.Object r3 = r0.A01
            com.instagram.base.activity.IgFragmentActivity r3 = (com.instagram.base.activity.IgFragmentActivity) r3
            X.C62423Zt.A02(r4)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36319635024385297(0x81088400001511, double:3.032021664628314E-306)
            boolean r0 = X.C63803iN.A0E(r2, r4, r0)
            if (r0 == 0) goto L_0x10db
            X.24F r0 = X.AnonymousClass24F.BLUEBADGE
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.H8c r1 = X.C54472zV.A00(r4, r0)
            X.0m7 r0 = r3.getSupportFragmentManager()
            X.C28591uf.A00(r0, r3, r1, r4)
            return
        L_0x10db:
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "com.instagram.verification.blue_badge_verification_form"
            X.3iE r2 = X.C63743iE.A02(r0, r1)
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r4)
            r0 = 2131834844(0x7f1137dc, float:1.930281E38)
            X.C63743iE.A08(r3, r1, r2, r0)
            return
        L_0x10f0:
            java.lang.Object r2 = r0.A00
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            java.lang.Object r0 = r0.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.C62423Zt.A02(r2)
            X.433 r1 = new X.433
            r1.<init>(r0, r2)
            X.24t r0 = X.C312224t.SETTINGS
            r1.BaO(r0)
            return
        L_0x1106:
            r1 = -540277605(0xffffffffdfcc049b, float:-2.940209E19)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.0i6 r2 = (X.C10300i6) r2
            X.C62423Zt.A02(r2)
            java.lang.Object r0 = r0.A00
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.Drz r2 = X.AnonymousClass0wJ.A0Q(r0, r2)
            X.C18190wL.A10()
            X.1wM r0 = new X.1wM
            r0.<init>()
            r2.A03 = r0
            r2.A05()
            r0 = 1081850063(0x407bb8cf, float:3.9331548)
            goto L_0x33e4
        L_0x112e:
            r1 = 106721819(0x65c721b, float:4.1461233E-35)
            int r1 = X.C14030oh.A05(r1)
            X.0t2 r2 = X.C16420t2.A00()
            X.059 r3 = r2.A09()
            java.lang.Object r2 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2002000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2002000_I2) r2
            java.lang.String r2 = r2.A02
            android.content.Intent r2 = X.C18190wL.A0B(r2)
            java.lang.Object r0 = r0.A01
            android.content.Context r0 = X.C18220wO.A0A(r0)
            r3.A09(r0, r2)
            r0 = -2040625731(0xffffffff865e85bd, float:-4.1851815E-35)
            goto L_0x33e4
        L_0x1155:
            r1 = -1881930437(0xffffffff8fd4053b, float:-2.0906829E-29)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r5 = r0.A01
            X.0i6 r5 = (X.C10300i6) r5
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r4 = com.instagram.modal.TransparentModalActivity.class
            android.os.Bundle r3 = X.C18180wK.A06()
            java.lang.Object r2 = r0.A00
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.String r0 = "universal_creation_live_camera"
            X.3iT r0 = X.C63863iT.A03(r2, r3, r5, r4, r0)
            r0.A0I(r2)
            r0 = 514183098(0x1ea5cfba, float:1.7555968E-20)
            goto L_0x33e4
        L_0x1178:
            java.lang.Object r2 = r0.A00
            X.1br r2 = (X.C23061br) r2
            java.lang.Object r1 = r0.A01
            X.1u0 r1 = (X.C28291u0) r1
            X.1u4 r0 = r2.A05
            r0.CEA(r1)
            return
        L_0x1186:
            r1 = 1343235769(0x501026b9, float:9.6738273E9)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.1bu r2 = (X.C23091bu) r2
            X.1u4 r4 = r2.A08
            if (r4 == 0) goto L_0x119f
            java.lang.Object r3 = r0.A00
            X.1u0 r3 = (X.C28291u0) r3
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            r0 = 0
            r4.CE9(r3, r2, r0)
        L_0x119f:
            r0 = 148677874(0x8dca4f2, float:1.3279547E-33)
            goto L_0x33e4
        L_0x11a4:
            r1 = 1582540221(0x5e53a5bd, float:3.81270088E18)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.1bu r2 = (X.C23091bu) r2
            X.1u4 r4 = r2.A08
            if (r4 == 0) goto L_0x11bd
            java.lang.Object r3 = r0.A00
            X.1u0 r3 = (X.C28291u0) r3
            java.lang.Integer r2 = X.AnonymousClass006.A01
            r0 = 0
            r4.CE9(r3, r2, r0)
        L_0x11bd:
            r0 = 48112322(0x2de22c2, float:3.2639918E-37)
            goto L_0x33e4
        L_0x11c2:
            A00(r3, r0)
            return
        L_0x11c6:
            r1 = -1091162485(0xffffffffbef62e8b, float:-0.48082384)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r0 = r0.A01
            X.0i6 r0 = (X.C10300i6) r0
            X.Drz r4 = X.C18180wK.A0Q(r2, r0)
            r3 = 1
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r0 = "MEMORY_TYPE"
            r2.putInt(r0, r3)
            X.1wd r0 = new X.1wd
            r0.<init>()
            X.C18180wK.A0x(r2, r0, r4)
            r0 = -147804867(0xfffffffff730ad3d, float:-3.5834294E33)
            goto L_0x33e4
        L_0x11f0:
            r1 = 200468445(0xbf2e7dd, float:9.356388E-32)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r0 = r0.A01
            X.0i6 r0 = (X.C10300i6) r0
            X.Drz r4 = X.C18180wK.A0Q(r2, r0)
            r3 = 0
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r0 = "MEMORY_TYPE"
            r2.putInt(r0, r3)
            X.1wd r0 = new X.1wd
            r0.<init>()
            X.C18180wK.A0x(r2, r0, r4)
            r0 = 400604092(0x17e0bbbc, float:1.4523052E-24)
            goto L_0x33e4
        L_0x121a:
            r1 = -1541124970(0xffffffffa4244c96, float:-3.5626702E-17)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r0 = r0.A01
            r0.getClass()
            r0 = 1567001293(0x5d668acd, float:1.03826972E18)
            goto L_0x33e4
        L_0x122b:
            r1 = 1257140630(0x4aee7196, float:7813323.0)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.0YY r2 = (X.AnonymousClass0YY) r2
            java.lang.Object r0 = r0.A01
            X.4o5 r0 = (X.C81614o5) r0
            X.4FB r0 = (X.AnonymousClass4FB) r0
            com.instagram.api.schemas.IGRevShareProductType r0 = r0.A01
            r2.invoke(r0)
            r0 = -705925730(0xffffffffd5ec6d9e, float:-3.24944433E13)
            goto L_0x33e4
        L_0x1246:
            r1 = -1381315870(0xffffffffadaacae2, float:-1.941686E-11)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r5 = r0.A00
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.content.Context r4 = r5.getContext()
            java.lang.Object r3 = r0.A01
            X.0i6 r3 = (X.C10300i6) r3
            java.lang.String r0 = "/legal/terms/"
            java.lang.String r0 = X.AnonymousClass3h3.A02(r0)
            java.lang.String r0 = X.AnonymousClass3W8.A02(r4, r0)
            X.JhV r2 = new X.JhV
            r2.<init>((java.lang.String) r0)
            java.lang.String r0 = X.C18210wN.A0c(r5)
            X.C18210wN.A0t(r4, r3, r2, r0)
            r0 = -1277148505(0xffffffffb3e042a7, float:-1.0442937E-7)
            goto L_0x33e4
        L_0x1274:
            r1 = -1406867410(0xffffffffac24e82e, float:-2.3434687E-12)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A01
            android.app.Dialog r4 = (android.app.Dialog) r4
            X.C13950oZ.A00(r4)
            android.view.Window r3 = r4.getWindow()
            r2 = 32
            r3.setSoftInputMode(r2)
            android.view.Window r2 = r4.getWindow()
            r3 = 5
            r2.setSoftInputMode(r3)
            com.facebook.redex.IDxDListenerShape320S0100000_1_I2 r2 = new com.facebook.redex.IDxDListenerShape320S0100000_1_I2
            r2.<init>(r0, r3)
            r4.setOnDismissListener(r2)
            r0 = 652193077(0x26dfad35, float:1.5520681E-15)
            goto L_0x33e4
        L_0x12a0:
            r1 = 255604201(0xf3c35e9, float:9.279498E-30)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r8 = r0.A00
            X.3GA r8 = (X.AnonymousClass3GA) r8
            com.instagram.registration.model.RegFlowExtras r2 = r8.A04
            java.lang.String r2 = r2.A04
            if (r2 == 0) goto L_0x1323
            long r13 = java.lang.Long.parseLong(r2)
        L_0x12b5:
            X.25r r2 = r8.A07
            if (r2 == 0) goto L_0x1320
            java.lang.String r12 = r2.A00
        L_0x12bb:
            X.0bf r11 = r8.A05
            X.265 r2 = r8.A08
            java.lang.String r10 = r2.A01
            java.lang.String r9 = "username_sign_up"
            X.AnonymousClass0wJ.A1N(r11, r10)
            r2 = 3
            X.C04220Ms.A0B(r12, r2)
            double r2 = X.C18200wM.A00()
            double r5 = X.AnonymousClass269.A00()
            X.0nS r7 = X.C13330nS.A02(r11)
            java.lang.String r4 = "refresh_username_suggestion"
            X.0A2 r7 = X.AnonymousClass0wJ.A0M(r7, r4)
            r4 = 2611(0xa33, float:3.659E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18180wK.A0I(r7, r4)
            X.AnonymousClass0wJ.A1A(r4, r2, r5)
            X.C18210wN.A19(r4, r12)
            java.lang.String r2 = "containermodule"
            r4.A0T(r2, r9)
            X.AnonymousClass269.A08(r4, r10)
            X.C18180wK.A1A(r4, r5)
            X.C63683i7.A09(r4, r11)
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            java.lang.String r2 = "actor_id"
            r4.A0S(r2, r3)
            r4.Bb4()
            com.instagram.ui.widget.searchedittext.SearchEditText r4 = r8.A06
            java.lang.Object r3 = r0.A01
            java.util.List r3 = (java.util.List) r3
            java.util.Random r2 = r8.A02
            int r0 = r3.size()
            int r0 = r2.nextInt(r0)
            java.lang.Object r0 = r3.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.setText(r0)
            r0 = 1763525789(0x691d449d, float:1.1882836E25)
            goto L_0x33e4
        L_0x1320:
            java.lang.String r12 = ""
            goto L_0x12bb
        L_0x1323:
            r13 = 0
            goto L_0x12b5
        L_0x1326:
            r1 = -1575801660(0xffffffffa2132cc4, float:-1.9945914E-18)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            com.instagram.nux.fragment.OneTapLoginLandingFragment r2 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r2
            java.lang.Object r0 = r0.A01
            X.3ac r0 = (X.C62733ac) r0
            r2.A02(r0)
            r0 = -1579479277(0xffffffffa1db0f13, float:-1.4844007E-18)
            goto L_0x33e4
        L_0x133d:
            r1 = -921870299(0xffffffffc90d6025, float:-579074.3)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            com.instagram.nux.fragment.OneTapLoginLandingFragment r2 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r2
            java.lang.Object r0 = r0.A01
            X.3ac r0 = (X.C62733ac) r0
            r2.A03(r0)
            r0 = -20385779(0xfffffffffec8f00d, float:-1.3354601E38)
            goto L_0x33e4
        L_0x1354:
            r1 = -1258661107(0xffffffffb4fa5b0d, float:-4.6632377E-7)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            com.instagram.nux.fragment.OneTapLoginLandingFragment r2 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r2
            java.lang.Object r0 = r0.A01
            X.3ac r0 = (X.C62733ac) r0
            r2.A02(r0)
            r0 = -499562401(0xffffffffe239485f, float:-8.544656E20)
            goto L_0x33e4
        L_0x136b:
            r1 = 1446282279(0x56348427, float:4.9619921E13)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            com.instagram.nux.fragment.OneTapLoginLandingFragment r2 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r2
            java.lang.Object r0 = r0.A01
            X.3ac r0 = (X.C62733ac) r0
            r2.A02(r0)
            r0 = -132989018(0xfffffffff812bfa6, float:-1.1905663E34)
            goto L_0x33e4
        L_0x1382:
            java.lang.Object r1 = r0.A00
            X.1Yv r1 = (X.C22631Yv) r1
            java.lang.Object r0 = r0.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.9tz r3 = r0.A0e()
            X.3aZ r5 = X.C62713aZ.A00
            com.instagram.service.session.UserSession r6 = r1.A02
            java.lang.String r11 = "nux_account_privacy"
            java.lang.String r12 = r6.getUserId()
            java.lang.Boolean r8 = X.C18180wK.A0X()
            android.widget.RadioButton r0 = r1.A00
            boolean r0 = r0.isChecked()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            r7 = 0
            r10 = r7
            r5.A02(r6, r7, r8, r9, r10, r11, r12)
            com.instagram.service.session.UserSession r6 = r1.A02
            java.lang.String r5 = r6.getUserId()
            android.widget.RadioButton r0 = r1.A00
            boolean r0 = r0.isChecked()
            r2 = 1
            X.C04220Ms.A0B(r5, r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "android_pbd_nux_confirmation"
            X.C54152yz.A00(r6, r4, r7, r5, r0)
            r0 = 107(0x6b, float:1.5E-43)
            com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2 r5 = X.C63873iU.A06(r1, r0)
            X.9tz r0 = X.C169839tz.PrivacyStatusPrivate
            if (r3 == r0) goto L_0x13fd
            android.widget.RadioButton r0 = r1.A00
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x13fd
            com.instagram.service.session.UserSession r4 = r1.A02
            X.H1T r3 = X.AnonymousClass0wJ.A0N(r4)
            java.lang.String r0 = "accounts/set_private/"
            r3.A0J(r0)
            java.lang.String r0 = "default_to_private"
            r3.A0R(r0, r2)
            java.lang.String r0 = "new_registration_user"
            r3.A0R(r0, r2)
            r2 = 6
        L_0x13ec:
            com.instagram.common.api.base.IDxRParserShape118S0100000_1_I2 r0 = new com.instagram.common.api.base.IDxRParserShape118S0100000_1_I2
            r0.<init>(r4, r2)
            r3.A01 = r0
            X.H8c r0 = X.C18190wL.A0Q(r3)
            r0.A00 = r5
            r1.schedule(r0)
            return
        L_0x13fd:
            X.9tz r0 = X.C169839tz.PrivacyStatusPublic
            if (r3 == r0) goto L_0x141b
            android.widget.RadioButton r0 = r1.A01
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x141b
            com.instagram.service.session.UserSession r4 = r1.A02
            X.H1T r3 = X.AnonymousClass0wJ.A0N(r4)
            java.lang.String r0 = "accounts/set_public/"
            r3.A0J(r0)
            java.lang.String r0 = "new_registration_user"
            r3.A0R(r0, r2)
            r2 = 5
            goto L_0x13ec
        L_0x141b:
            X.C22631Yv.A02(r1)
            return
        L_0x141f:
            r1 = -1529542617(0xffffffffa4d50827, float:-9.2387836E-17)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A00
            android.view.View r3 = (android.view.View) r3
            r2 = 0
            r3.setEnabled(r2)
            X.3aZ r3 = X.C62713aZ.A00
            java.lang.Object r2 = r0.A01
            X.1bo r2 = (X.C23031bo) r2
            X.0Oa r0 = r2.A0C
            X.0i6 r4 = X.AnonymousClass0wJ.A0U(r0)
            java.lang.String r9 = "aymh_password_input"
            java.lang.String r10 = r2.A06
            r5 = 0
            r6 = r5
            r7 = r5
            r8 = r5
            r3.A02(r4, r5, r6, r7, r8, r9, r10)
            X.C23031bo.A00(r2)
            r0 = 1599774472(0x5f5a9f08, float:1.5753319E19)
            goto L_0x33e4
        L_0x144d:
            r1 = 1586648460(0x5e92558c, float:5.272244E18)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.4rn r2 = (X.C83674rn) r2
            java.lang.Object r0 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r0
            r2.D7r(r0)
            r0 = -1395422437(0xffffffffacd38b1b, float:-6.0124245E-12)
            goto L_0x33e4
        L_0x1464:
            r1 = -1263530388(0xffffffffb4b00e6c, float:-3.2793048E-7)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.4rn r2 = (X.C83674rn) r2
            java.lang.Object r0 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r0
            r2.D7q(r0)
            r0 = 1991863270(0x76b96be6, float:1.8803972E33)
            goto L_0x33e4
        L_0x147b:
            r1 = 211906227(0xca16eb3, float:2.4872602E-31)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.4rn r2 = (X.C83674rn) r2
            java.lang.Object r0 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r0
            r2.D7q(r0)
            r0 = -290355999(0xffffffffeeb184e1, float:-2.7469744E28)
            goto L_0x33e4
        L_0x1492:
            r1 = -2125285583(0xffffffff8152b731, float:-3.8702342E-38)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A00
            X.1b1 r4 = (X.AnonymousClass1b1) r4
            java.lang.Object r0 = r0.A01
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            r0 = r0 ^ 1
            X.1fI r3 = r4.A00
            java.util.Set r2 = r3.A00
            if (r0 == 0) goto L_0x14d7
            X.3Gx r0 = r3.A04
            r2.add(r0)
            X.3Gx r0 = r3.A03
            r2.add(r0)
            X.3Gx r0 = r3.A02
            r2.add(r0)
        L_0x14ba:
            r3.A09()
            r3.D92()
            com.instagram.ui.widget.progressbutton.ProgressButton r3 = r4.A03
            X.1fI r0 = r4.A00
            java.util.Set r0 = r0.A00
            int r2 = r0.size()
            r0 = 3
            boolean r0 = X.AnonymousClass0wJ.A1T(r2, r0)
            r3.setEnabled(r0)
            r0 = -149675746(0xfffffffff714211e, float:-3.0044204E33)
            goto L_0x33e4
        L_0x14d7:
            r2.clear()
            goto L_0x14ba
        L_0x14db:
            java.lang.Object r1 = r0.A00
            com.instagram.nux.fragment.OneTapLoginLandingFragment r1 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r1
            java.lang.Object r0 = r0.A01
            X.3ac r0 = (X.C62733ac) r0
            r1.A03(r0)
            return
        L_0x14e7:
            r1 = -501815376(0xffffffffe216e7b0, float:-6.959266E20)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.1aS r2 = (X.AnonymousClass1aS) r2
            java.lang.Object r0 = r0.A01
            X.4Mm r0 = (X.C72144Mm) r0
            r2.A03(r0)
            r0 = 2147204115(0x7ffbbc13, float:NaN)
            goto L_0x33e4
        L_0x14fe:
            java.lang.Object r3 = r0.A00
            X.1aS r3 = (X.AnonymousClass1aS) r3
            java.lang.Object r1 = r0.A01
            X.1fM r2 = r3.A01
            r2.getClass()
            java.util.Set r0 = r2.A03
            r0.add(r1)
            goto L_0x151f
        L_0x150f:
            java.lang.Object r3 = r0.A00
            X.1aS r3 = (X.AnonymousClass1aS) r3
            java.lang.Object r1 = r0.A01
            X.1fM r2 = r3.A01
            r2.getClass()
            java.util.Set r0 = r2.A03
            r0.remove(r1)
        L_0x151f:
            X.AnonymousClass1fM.A00(r2)
            r2.D92()
            X.AnonymousClass1aS.A01(r3)
            return
        L_0x1529:
            r1 = 1658718604(0x62de098c, float:2.0479326E21)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A01
            X.1de r4 = (X.C23361de) r4
            java.lang.Object r9 = r0.A00
            com.instagram.service.session.UserSession r0 = r4.A03
            X.3Gj r6 = new X.3Gj
            r6.<init>(r0)
            X.0nS r0 = r6.A00
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A02(r0)
            java.lang.String r2 = "multiple_account"
            java.lang.String r0 = "flow_name"
            r3.A0T(r0, r2)
            java.lang.String r0 = "primary_click"
            X.C18200wM.A1I(r3, r0)
            java.lang.String r2 = "NDX_IG4A_MA_FEATURE"
            java.lang.String r0 = "ig_ndx_source"
            r3.A0T(r0, r2)
            r3.Bb4()
            X.35T r8 = new X.35T
            r8.<init>()
            X.0RG r0 = X.AnonymousClass0RA.A0C
            X.0bf r10 = r0.A05(r4)
            androidx.fragment.app.FragmentActivity r5 = r4.requireActivity()
            android.content.Context r4 = r4.A00
            r3 = 3
            X.C04220Ms.A0B(r4, r3)
            X.0wh r7 = new X.0wh
            r7.<init>(r4)
            android.content.res.Resources r2 = r4.getResources()
            r0 = 2131830126(0x7f11256e, float:1.929324E38)
            java.lang.String r0 = r2.getString(r0)
            r7.A04(r0)
            X.C13950oZ.A00(r7)
            r12 = 0
            X.E5N r2 = X.C18250wR.A0J(r12, r3)
            r0 = 1638176555(0x61a4972b, float:3.7951985E20)
            X.4qz r2 = X.C84874u0.A00(r2, r0, r3)
            r0 = 45
            kotlin.jvm.internal.KtLambdaShape45S0200000_I2_6 r11 = new kotlin.jvm.internal.KtLambdaShape45S0200000_I2_6
            r11.<init>((int) r0, (java.lang.Object) r4, (java.lang.Object) r5)
            r13 = 18
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S0601000_I2 r5 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S0601000_I2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            X.C25237DiI.A00(r12, r12, r5, r2, r3)
            r0 = 47770357(0x2d8eaf5, float:3.1873206E-37)
            goto L_0x33e4
        L_0x15a6:
            r1 = -1669264613(0xffffffff9c810b1b, float:-8.539375E-22)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r7 = r0.A01
            X.1Zb r7 = (X.C22691Zb) r7
            X.0Oa r2 = r7.A03
            X.3ak r6 = X.C18200wM.A0N(r2)
            X.4qz r5 = X.AnonymousClass3J5.A00(r6)
            r4 = 0
            r2 = 14
            kotlin.coroutines.jvm.internal.KtSLambdaShape12S0101000_I2_9 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape12S0101000_I2_9
            r3.<init>(r6, r4, r2)
            r2 = 3
            X.C25237DiI.A00(r4, r4, r3, r5, r2)
            X.0Oa r2 = r7.A05
            com.instagram.service.session.UserSession r4 = X.AnonymousClass0wJ.A0X(r2)
            java.lang.Object r0 = r0.A00
            X.IcN r0 = (X.C34640IcN) r0
            X.0nS r2 = X.C18220wO.A0V(r0, r4)
            java.lang.String r0 = "ig_branded_content_opt_in_request_sent"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r0)
            r0 = 824(0x338, float:1.155E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r2, r0)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r4)
            X.266 r0 = r0.A0g()
            if (r0 != 0) goto L_0x15ed
            X.266 r0 = X.AnonymousClass266.A07
        L_0x15ed:
            int r0 = r0.A00
            java.lang.Long r2 = X.C18230wP.A0f(r0)
            java.lang.String r0 = "account_type"
            r3.A0S(r0, r2)
            r3.Bb4()
            r0 = -1357454210(0xffffffffaf16e47e, float:-1.3723597E-10)
            goto L_0x33e4
        L_0x1600:
            r1 = 986153030(0x3ac78046, float:0.0015220724)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r5 = r0.A00
            X.1ZI r5 = (X.AnonymousClass1ZI) r5
            java.lang.Object r2 = r0.A01
            com.instagram.login.api.AssistAccountRecoveryResponse$UhlAccount r2 = (com.instagram.login.api.AssistAccountRecoveryResponse$UhlAccount) r2
            android.content.Context r6 = r5.getContext()
            X.0bf r0 = r5.A01
            java.lang.String r2 = r2.A02
            boolean r4 = r5.A03
            X.H1T r3 = X.AnonymousClass0wJ.A0N(r0)
            java.lang.String r0 = "accounts/assisted_account_recovery/"
            r3.A0J(r0)
            java.lang.String r0 = "user_id"
            X.C63213h0.A02(r6, r3, r0, r2)
            java.lang.String r2 = "multi_account"
            java.lang.String r0 = "source"
            r3.A0O(r0, r2)
            java.lang.String r0 = "present_as_modal"
            r3.A0R(r0, r4)
            java.lang.Class<X.1Ts> r2 = X.C22191Ts.class
            java.lang.Class<X.3Mt> r0 = X.C59873Mt.class
            X.H8c r3 = X.C18180wK.A0T(r3, r2, r0)
            X.0bf r2 = r5.A01
            X.1uR r0 = new X.1uR
            r0.<init>(r5, r2)
            r3.A00 = r0
            r5.schedule(r3)
            r0 = -959659223(0xffffffffc6ccc329, float:-26209.58)
            goto L_0x33e4
        L_0x164c:
            r1 = -353482511(0xffffffffeaee48f1, float:-1.440344E26)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r5 = r0.A00
            X.1dO r5 = (X.AnonymousClass1dO) r5
            java.lang.Object r3 = r0.A01
            com.instagram.login.twofac.model.TrustedDevice r3 = (com.instagram.login.twofac.model.TrustedDevice) r3
            r2 = 0
            r5.A00 = r3
            X.3aT r0 = X.C62653aT.A02
            r0.A03()
            X.0Oa r4 = r5.A03
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r4)
            X.C04220Ms.A0B(r0, r2)
            android.os.Bundle r2 = X.AnonymousClass0wJ.A0E(r0)
            java.lang.String r0 = "trusted_device"
            r2.putParcelable(r0, r3)
            X.1Y5 r3 = new X.1Y5
            r3.<init>()
            r3.setArguments(r2)
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r4)
            X.Jj9 r2 = X.C18210wN.A0L(r0)
            r0 = 2131837164(0x7f1140ec, float:1.9307515E38)
            java.lang.String r0 = r5.getString(r0)
            r2.A0O = r0
            r2.A0I = r5
            X.C18220wO.A19(r5, r3, r2)
            r0 = 1311164480(0x4e26c840, float:6.9953536E8)
            goto L_0x33e4
        L_0x1698:
            r1 = -873446734(0xffffffffcbf042b2, float:-3.1491428E7)
            int r1 = X.C14030oh.A05(r1)
            X.3Hi r4 = X.C62653aT.A01()
            java.lang.Object r3 = r0.A00
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r2 = 0
            androidx.fragment.app.Fragment r3 = r4.A02(r3, r2)
            java.lang.Object r0 = r0.A01
            X.1wc r0 = (X.C29041wc) r0
            androidx.fragment.app.FragmentActivity r2 = r0.getActivity()
            X.0Oa r0 = r0.A01
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.AnonymousClass0wJ.A19(r3, r2, r0)
            r0 = 1704664950(0x659b1f76, float:9.1568395E22)
            goto L_0x33e4
        L_0x16c2:
            r1 = 1738444417(0x679e8e81, float:1.4975253E24)
            int r1 = X.C14030oh.A05(r1)
            X.3aT r2 = X.C62653aT.A02
            r2.A03()
            java.lang.Object r6 = r0.A01
            X.1wr r6 = (X.AnonymousClass1wr) r6
            android.os.Bundle r2 = r6.requireArguments()
            X.1c0 r5 = new X.1c0
            r5.<init>()
            r5.setArguments(r2)
            android.os.Bundle r4 = r6.A00
            if (r4 != 0) goto L_0x16e6
            java.lang.String r7 = "twoFacResponseBundle"
            goto L_0x2f03
        L_0x16e6:
            java.lang.Object r3 = r0.A00
            com.instagram.login.twofac.model.TotpSeed r3 = (com.instagram.login.twofac.model.TotpSeed) r3
            r2 = 1
            java.lang.String r0 = "is_renaming"
            r4.putBoolean(r0, r2)
            java.lang.String r2 = r3.A01
            java.lang.String r0 = X.C63833iQ.A01()
            r4.putString(r0, r2)
            java.lang.String r2 = r3.A02
            java.lang.String r0 = "rename_totp_seed_id"
            r4.putString(r0, r2)
            androidx.fragment.app.FragmentActivity r2 = X.C18210wN.A0F(r4, r5, r6)
            X.0Oa r0 = r6.A02
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.AnonymousClass0wJ.A19(r5, r2, r0)
            r0 = -165217960(0xfffffffff626f958, float:-8.4665876E32)
            goto L_0x33e4
        L_0x1712:
            r1 = -548362031(0xffffffffdf50a8d1, float:-1.5035497E19)
            int r1 = X.C14030oh.A05(r1)
            X.KHr r4 = X.C38040KHr.A01
            java.lang.Object r3 = r0.A00
            java.lang.Integer r3 = (java.lang.Integer) r3
            X.45G r2 = new X.45G
            r2.<init>(r3)
            r4.CWx(r2)
            java.lang.Object r0 = r0.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.C18180wK.A12(r0)
            r0 = 857766141(0x332078fd, float:3.736294E-8)
            goto L_0x33e4
        L_0x1733:
            r1 = -1322014565(0xffffffffb133a89b, float:-2.614377E-9)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A00
            com.instagram.ui.widget.progressbutton.ProgressButton r3 = (com.instagram.ui.widget.progressbutton.ProgressButton) r3
            r2 = 1
            r3.setShowProgressBar(r2)
            java.lang.Object r5 = r0.A01
            X.1ZN r5 = (X.AnonymousClass1ZN) r5
            X.0Oa r0 = r5.A05
            com.instagram.service.session.UserSession r4 = X.AnonymousClass0wJ.A0X(r0)
            java.lang.Integer r3 = X.AnonymousClass006.A15
            com.instagram.igds.components.form.IgFormField r0 = r5.A00
            if (r0 != 0) goto L_0x1756
            java.lang.String r7 = "emailFormField"
            goto L_0x2f03
        L_0x1756:
            android.widget.EditText r0 = r0.A00
            java.lang.String r2 = X.AnonymousClass0wJ.A0n(r0)
            android.content.Context r0 = r5.requireContext()
            X.H8c r2 = X.C63503hc.A02(r0, r4, r3, r2)
            com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2 r0 = r5.A04
            r2.A00 = r0
            r5.schedule(r2)
            r0 = 609154846(0x244ef71e, float:4.4878446E-17)
            goto L_0x33e4
        L_0x1770:
            r1 = 121346338(0x73b9922, float:1.4113318E-34)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.Object r5 = r0.A01
            java.util.AbstractCollection r5 = (java.util.AbstractCollection) r5
            android.content.Context r2 = r2.getContext()
            java.lang.String r0 = "clipboard"
            java.lang.Object r4 = r2.getSystemService(r0)
            android.content.ClipboardManager r4 = (android.content.ClipboardManager) r4
            java.lang.StringBuilder r3 = X.C18200wM.A0r()
            java.util.Iterator r2 = r5.iterator()
        L_0x1793:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x17a6
            java.lang.String r0 = X.C18180wK.A0k(r2)
            r3.append(r0)
            java.lang.String r0 = "\n"
            r3.append(r0)
            goto L_0x1793
        L_0x17a6:
            java.lang.String r2 = r3.toString()
            java.lang.String r0 = "backup_codes"
            X.C18250wR.A0n(r4, r0, r2)
            r0 = 2131821834(0x7f11050a, float:1.9276422E38)
            X.C63813iO.A04(r0)
            r0 = 227640720(0xd918590, float:8.968469E-31)
            goto L_0x33e4
        L_0x17ba:
            r1 = 777022521(0x2e506c39, float:4.7389846E-11)
            int r1 = X.C14030oh.A05(r1)
            X.C63463hW.A03()
            java.lang.Object r2 = r0.A01
            X.1U1 r2 = (X.AnonymousClass1U1) r2
            java.util.ArrayList r3 = r2.A04
            android.os.Bundle r4 = X.C18180wK.A06()
            java.lang.String r2 = "backup_codes_key"
            r4.putStringArrayList(r2, r3)
            X.1xa r3 = new X.1xa
            r3.<init>()
            r3.setArguments(r4)
            java.lang.Object r0 = r0.A00
            X.1xV r0 = (X.C29211xV) r0
            androidx.fragment.app.FragmentActivity r2 = r0.getActivity()
            com.instagram.service.session.UserSession r0 = r0.A01
            X.AnonymousClass0wJ.A19(r3, r2, r0)
            r0 = -403571095(0xffffffffe7f1fe69, float:-2.2855667E24)
            goto L_0x33e4
        L_0x17ed:
            r1 = -1778436335(0xffffffff95ff3711, float:-1.0308056E-25)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A00
            X.1wQ r3 = (X.AnonymousClass1wQ) r3
            X.4q2 r2 = r3.A00
            if (r2 == 0) goto L_0x1807
            java.lang.Object r0 = r0.A01
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            r2.BpC(r0)
        L_0x1807:
            X.C18180wK.A12(r3)
            r0 = 1148467646(0x447439be, float:976.9022)
            goto L_0x33e4
        L_0x180f:
            r1 = -898582481(0xffffffffca70b82f, float:-3943947.8)
            int r3 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.34y r2 = (X.C558834y) r2
            java.lang.Object r0 = r0.A00
            X.3BV r0 = (X.AnonymousClass3BV) r0
            java.lang.Integer r0 = r0.A01
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x18aa
            r0 = 5
            if (r1 == r0) goto L_0x1882
            r0 = 4
            if (r1 == r0) goto L_0x1847
            r0 = 6
            if (r1 != r0) goto L_0x1840
            X.1fP r0 = r2.A00
            X.34z r0 = r0.A06
            X.1dg r0 = r0.A00
            android.content.Context r2 = r0.getContext()
            java.lang.String r1 = r0.A06
            r0 = 0
            X.C09830gl.A01(r2, r1, r0)
        L_0x1840:
            r0 = -1246505470(0xffffffffb5b3d602, float:-1.3398824E-6)
            X.C14030oh.A0C(r0, r3)
            return
        L_0x1847:
            X.1fP r0 = r2.A00
            X.34z r0 = r0.A06
            X.1dg r5 = r0.A00     // Catch:{ MalformedURLException -> 0x1840 }
            X.1U8 r0 = r5.A01     // Catch:{ MalformedURLException -> 0x1840 }
            java.lang.String r1 = r0.A0A     // Catch:{ MalformedURLException -> 0x1840 }
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x1840 }
            r0.<init>(r1)     // Catch:{ MalformedURLException -> 0x1840 }
            androidx.fragment.app.FragmentActivity r4 = r5.getActivity()     // Catch:{ MalformedURLException -> 0x1840 }
            com.instagram.service.session.UserSession r2 = r5.A05     // Catch:{ MalformedURLException -> 0x1840 }
            java.lang.String r1 = r0.toExternalForm()     // Catch:{ MalformedURLException -> 0x1840 }
            X.9wF r0 = X.C171209wF.A1X     // Catch:{ MalformedURLException -> 0x1840 }
            X.Jpy r1 = X.C18230wP.A0Y(r4, r2, r0, r1)     // Catch:{ MalformedURLException -> 0x1840 }
            com.instagram.service.session.UserSession r0 = r5.A05     // Catch:{ MalformedURLException -> 0x1840 }
            java.lang.String r0 = r0.getUserId()     // Catch:{ MalformedURLException -> 0x1840 }
            r1.A06(r0)     // Catch:{ MalformedURLException -> 0x1840 }
            java.lang.String r0 = "location_page_info_page"
            r1.A07(r0)     // Catch:{ MalformedURLException -> 0x1840 }
            r1.A04()     // Catch:{ MalformedURLException -> 0x1840 }
            java.lang.Integer r0 = X.AnonymousClass006.A0Y     // Catch:{ MalformedURLException -> 0x1840 }
            X.C23381dg.A05(r5, r0)     // Catch:{ MalformedURLException -> 0x1840 }
            java.lang.String r0 = "website"
            X.C23381dg.A07(r5, r0)     // Catch:{ MalformedURLException -> 0x1840 }
            goto L_0x1840
        L_0x1882:
            X.1fP r0 = r2.A00
            X.34z r0 = r0.A06
            java.lang.String r1 = "tel:"
            X.1dg r4 = r0.A00
            X.1U8 r0 = r4.A01
            java.lang.String r0 = r0.A09
            java.lang.String r2 = X.AnonymousClass00U.A0L(r1, r0)
            java.lang.String r0 = "android.intent.action.DIAL"
            android.content.Intent r1 = X.C18210wN.A09(r0)
            android.net.Uri r0 = X.C15430rJ.A01(r2)
            r1.setData(r0)
            X.C10650ih.A0C(r1, r4)
            java.lang.Integer r0 = X.AnonymousClass006.A0j
            X.C23381dg.A05(r4, r0)
            java.lang.String r0 = "call"
            goto L_0x18c6
        L_0x18aa:
            X.1fP r0 = r2.A00
            X.34z r0 = r0.A06
            X.1dg r4 = r0.A00
            android.content.Context r5 = r4.getContext()
            X.1U8 r0 = r4.A01
            java.lang.String r2 = r0.A05
            java.lang.String r1 = r0.A07
            java.lang.String r0 = r0.A0B
            X.C62933bA.A04(r5, r2, r1, r0)
            java.lang.Integer r0 = X.AnonymousClass006.A00
            X.C23381dg.A05(r4, r0)
            java.lang.String r0 = "address"
        L_0x18c6:
            X.C23381dg.A07(r4, r0)
            goto L_0x1840
        L_0x18cb:
            r1 = -2124629127(0xffffffff815cbb79, float:-4.0542123E-38)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.4ri r2 = (X.C83624ri) r2
            java.lang.Object r0 = r0.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r0
            r2.C2v(r0)
            r0 = -624615256(0xffffffffdac520a8, float:-2.77432382E16)
            goto L_0x33e4
        L_0x18e2:
            r1 = 146972281(0x8c29e79, float:1.1713207E-33)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r6 = r0.A01
            X.3ak r6 = (X.C62793ak) r6
            X.4qz r5 = X.AnonymousClass3J5.A00(r6)
            java.lang.Object r4 = r0.A00
            r3 = 0
            r0 = 40
            kotlin.coroutines.jvm.internal.KtSLambdaShape20S0201000_I2_6 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape20S0201000_I2_6
            r2.<init>(r4, r6, r3, r0)
            r0 = 3
            X.C25237DiI.A00(r3, r3, r2, r5, r0)
            r0 = 1994430352(0x76e09790, float:2.2776339E33)
            goto L_0x33e4
        L_0x1904:
            r1 = 739797928(0x2c186ba8, float:2.166026E-12)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r6 = r0.A01
            X.3ak r6 = (X.C62793ak) r6
            X.4qz r5 = X.AnonymousClass3J5.A00(r6)
            java.lang.Object r4 = r0.A00
            r3 = 0
            r0 = 39
            kotlin.coroutines.jvm.internal.KtSLambdaShape20S0201000_I2_6 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape20S0201000_I2_6
            r2.<init>(r4, r6, r3, r0)
            r0 = 3
            X.C25237DiI.A00(r3, r3, r2, r5, r0)
            r0 = 1175927651(0x46173b63, float:9678.847)
            goto L_0x33e4
        L_0x1926:
            r1 = -1919812248(0xffffffff8d91fd68, float:-8.99732E-31)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r6 = r0.A01
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            X.Dsm r5 = X.AnonymousClass0wJ.A0V(r6)
            r2 = 2131828887(0x7f112097, float:1.9290728E38)
            r5.A0L(r2)
            r2 = 2131828886(0x7f112096, float:1.9290726E38)
            r5.A0K(r2)
            r4 = 2131828889(0x7f112099, float:1.9290732E38)
            java.lang.Object r3 = r0.A00
            r2 = 9
            com.facebook.redex.IDxCListenerShape79S0200000_3_I2 r0 = new com.facebook.redex.IDxCListenerShape79S0200000_3_I2
            r0.<init>(r2, r3, r6)
            X.AnonymousClass25l.A00(r0, r5, r4)
            r2 = 2131828885(0x7f112095, float:1.9290723E38)
            r0 = 0
            r5.A0O(r0, r2)
            r0 = 1
            r5.A0r(r0)
            X.AnonymousClass0wJ.A1K(r5)
            r0 = 1586966131(0x5e972e73, float:5.4468855E18)
            goto L_0x33e4
        L_0x1963:
            r1 = -1422678477(0xffffffffab33a633, float:-6.382422E-13)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.K6u r2 = (X.K6u) r2
            java.lang.Object r0 = r0.A00
            X.3TR r0 = (X.AnonymousClass3TR) r0
            r2.A06(r0)
            android.view.View r0 = r0.A04
            X.AnonymousClass7JU.A00(r0)
            r0 = -1585202982(0xffffffffa183b8da, float:-8.925835E-19)
            goto L_0x33e4
        L_0x197f:
            r1 = 1686472641(0x648587c1, float:1.9705592E22)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r0 = r0.A00
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r3)
            r0 = 1472118719(0x57bebfbf, float:4.19461505E14)
            goto L_0x33e4
        L_0x1992:
            r1 = -402488539(0xffffffffe8028325, float:-2.4653073E24)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            if (r2 == 0) goto L_0x19a2
            r2.onClick(r3)
        L_0x19a2:
            java.lang.Object r2 = r0.A01
            android.view.View r2 = (android.view.View) r2
            boolean r0 = r2.isSelected()
            r0 = r0 ^ 1
            r2.setSelected(r0)
            r0 = -922613253(0xffffffffc90209fb, float:-532639.7)
            goto L_0x33e4
        L_0x19b4:
            r1 = 2001276873(0x77490fc9, float:4.078015E33)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A00
            X.3ag r3 = (X.C62763ag) r3
            r2 = -1
            r3.A00 = r2
            java.lang.Object r0 = r0.A01
            android.view.View r0 = (android.view.View) r0
            r3.A01 = r0
            X.Jqm r0 = r3.A02
            r0.A06()
            r0 = 2018383054(0x784e14ce, float:1.6719299E34)
            goto L_0x33e4
        L_0x19d2:
            r1 = 2134893804(0x7f3fe4ec, float:2.5507118E38)
            int r1 = X.C14030oh.A05(r1)
            X.AhH r3 = X.C36052Pv.A00()
            java.lang.Object r2 = r0.A00
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r0 = r0.A01
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            r3.A07(r2, r0)
            r0 = -191887959(0xfffffffff49005a9, float:-9.128486E31)
            goto L_0x33e4
        L_0x19ed:
            r1 = -1949460675(0xffffffff8bcd973d, float:-7.9190686E-32)
            int r1 = X.C14030oh.A05(r1)
            X.AhH r3 = X.C36052Pv.A00()
            java.lang.Object r2 = r0.A00
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r0 = r0.A01
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            r3.A07(r2, r0)
            r0 = 1892486452(0x70cd0d34, float:5.076831E29)
            goto L_0x33e4
        L_0x1a08:
            java.lang.Object r1 = r0.A00
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Object r0 = r0.A01
            java.lang.Number r0 = (java.lang.Number) r0
            android.content.Context r4 = r3.getContext()
            double r2 = r1.doubleValue()
            double r0 = r0.doubleValue()
            X.C62933bA.A02(r4, r2, r0)
            return
        L_0x1a20:
            r1 = -1256810421(0xffffffffb516984b, float:-5.610097E-7)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A00
            android.widget.EditText r4 = (android.widget.EditText) r4
            java.lang.String r2 = X.AnonymousClass0wJ.A0n(r4)
            java.util.List r3 = X.C120707Cc.A00(r2)
            java.lang.Object r2 = r0.A01
            X.1YD r2 = (X.AnonymousClass1YD) r2
            java.util.Set r0 = r2.A03
            r0.addAll(r3)
            X.C09860go.A0I(r4)
            r0 = 1
            r2.A01 = r0
            X.C18180wK.A14(r2)
            r0 = 830937349(0x31871905, float:3.9318615E-9)
            goto L_0x33e4
        L_0x1a4a:
            r1 = 422177259(0x1929e9eb, float:8.7843346E-24)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.34Y r2 = (X.AnonymousClass34Y) r2
            java.lang.Object r3 = r0.A01
            X.BKU r3 = (X.BKU) r3
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            X.CWB r0 = r2.A00
            X.0zZ r6 = r0.A02
            X.48w r0 = r6.A00
            X.4wG r0 = r0.A04
            java.lang.Object r2 = r0.getValue()
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L_0x1a8a
            X.4wE r5 = r6.A07
            java.lang.Object r0 = r5.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x1a78
            r2 = r0
        L_0x1a78:
            java.util.ArrayList r4 = X.C18200wM.A0s(r2)
            java.lang.String r3 = r3.A0N
            boolean r0 = r4.contains(r3)
            if (r0 == 0) goto L_0x1a8f
            r4.remove(r3)
        L_0x1a87:
            r5.CrC(r4)
        L_0x1a8a:
            r0 = -855519183(0xffffffffcd01d031, float:-1.36119056E8)
            goto L_0x33e4
        L_0x1a8f:
            int r2 = r4.size()
            r0 = 3
            if (r2 >= r0) goto L_0x1a9d
            X.C04220Ms.A06(r3)
            r4.add(r3)
            goto L_0x1a87
        L_0x1a9d:
            X.4wE r3 = r6.A08
            java.lang.Object[] r2 = X.C18210wN.A1X(r0)
            r0 = 2131835431(0x7f113a27, float:1.9304E38)
            X.1kC r0 = X.AnonymousClass1kC.A00(r2, r0)
            r3.CrC(r0)
            goto L_0x1a87
        L_0x1aae:
            r1 = -2065218201(0xffffffff84e74567, float:-5.4371575E-36)
            int r1 = X.C62723ab.A00(r0, r1)
            r0 = -759715126(0xffffffffd2b7aaca, float:-3.9442219E11)
            goto L_0x33e4
        L_0x1aba:
            r1 = -1125724496(0xffffffffbce6ceb0, float:-0.028174728)
            int r1 = X.C62723ab.A00(r0, r1)
            r0 = -630959218(0xffffffffda64538e, float:-1.6067041E16)
            goto L_0x33e4
        L_0x1ac6:
            r1 = 7010875(0x6afa3b, float:9.824328E-39)
            int r1 = X.C62723ab.A00(r0, r1)
            r0 = -1238423355(0xffffffffb62f28c5, float:-2.6100763E-6)
            goto L_0x33e4
        L_0x1ad2:
            r1 = -1354963174(0xffffffffaf3ce71a, float:-1.7180604E-10)
            int r1 = X.C62723ab.A00(r0, r1)
            r0 = -1035833046(0xffffffffc242712a, float:-48.61051)
            goto L_0x33e4
        L_0x1ade:
            r1 = -85665376(0xfffffffffae4d9a0, float:-5.9412882E35)
            int r1 = X.C62723ab.A00(r0, r1)
            r0 = -769441054(0xffffffffd22342e2, float:-1.75300444E11)
            goto L_0x33e4
        L_0x1aea:
            r1 = -1260604896(0xffffffffb4dcb220, float:-4.1107796E-7)
            int r1 = X.C62723ab.A00(r0, r1)
            r0 = -1222858637(0xffffffffb71ca873, float:-9.337545E-6)
            goto L_0x33e4
        L_0x1af6:
            r1 = 1828771336(0x6d00d608, float:2.4920518E27)
            int r1 = X.C62723ab.A00(r0, r1)
            r0 = 1392051440(0x52f904f0, float:5.34764847E11)
            goto L_0x33e4
        L_0x1b02:
            r1 = -1691365283(0xffffffff9b2fd05d, float:-1.4542987E-22)
            int r1 = X.C62723ab.A00(r0, r1)
            r0 = 1517531009(0x5a73af81, float:1.7147847E16)
            goto L_0x33e4
        L_0x1b0e:
            r1 = 974512015(0x3a15df8f, float:5.717212E-4)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r6 = r0.A01
            X.1c1 r6 = (X.AnonymousClass1c1) r6
            X.Dsm r5 = X.AnonymousClass0wJ.A0V(r6)
            X.0Oa r3 = r6.A05
            X.23Z r2 = X.C62793ak.A08(r3)
            java.lang.String r2 = X.AnonymousClass1c1.A00(r2, r6)
            r5.A02 = r2
            X.23Z r2 = X.C62793ak.A08(r3)
            int r3 = r2.ordinal()
            r2 = 0
            if (r3 == r2) goto L_0x1b59
            r2 = 1
            if (r3 != r2) goto L_0x1b5d
            r2 = 2131837652(0x7f1142d4, float:1.9308505E38)
        L_0x1b3a:
            r5.A0K(r2)
            r4 = 2131837644(0x7f1142cc, float:1.9308489E38)
            java.lang.Object r3 = r0.A00
            r0 = 27
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r2 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r2.<init>((int) r0, (java.lang.Object) r3, (java.lang.Object) r6)
            X.25l r0 = X.AnonymousClass25l.BLUE_BOLD
            r5.A0T(r2, r0, r4)
            X.C18200wM.A1P(r5)
            X.AnonymousClass0wJ.A1K(r5)
            r0 = -1516799009(0xffffffffa5977bdf, float:-2.6278263E-16)
            goto L_0x33e4
        L_0x1b59:
            r2 = 2131837620(0x7f1142b4, float:1.930844E38)
            goto L_0x1b3a
        L_0x1b5d:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x1b62:
            A01(r0)
            return
        L_0x1b66:
            r1 = -61885203(0xfffffffffc4fb4ed, float:-4.3139002E36)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.1dq r2 = (X.C23441dq) r2
            X.0Oa r2 = r2.A03
            X.3ak r4 = X.C18200wM.A0N(r2)
            java.lang.Object r5 = r0.A00
            r8 = 1
            X.4qz r2 = X.AnonymousClass3J5.A00(r4)
            r6 = 0
            r7 = 10
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0211000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0211000_I2
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = 3
            X.C25237DiI.A00(r6, r6, r3, r2, r0)
            r0 = -84829833(0xfffffffffaf19977, float:-6.272281E35)
            goto L_0x33e4
        L_0x1b8f:
            r1 = -1682871635(0xffffffff9bb16aad, float:-2.9351131E-22)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.1dq r2 = (X.C23441dq) r2
            X.0Oa r2 = r2.A03
            X.3ak r4 = X.C18200wM.A0N(r2)
            java.lang.Object r5 = r0.A00
            r8 = 0
            X.4qz r2 = X.AnonymousClass3J5.A00(r4)
            r6 = 0
            r7 = 10
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0211000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0211000_I2
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = 3
            X.C25237DiI.A00(r6, r6, r3, r2, r0)
            r0 = 259128901(0xf71fe45, float:1.1931188E-29)
            goto L_0x33e4
        L_0x1bb8:
            r1 = -1653925450(0xffffffff9d6b19b6, float:-3.1115283E-21)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r6 = r0.A01
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r6 = (com.instagram.fanclub.consideration.FanClubConsiderationViewModel) r6
            com.instagram.service.session.UserSession r5 = r6.A07
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r4 = com.instagram.modal.TransparentModalActivity.class
            android.os.Bundle r3 = X.C18180wK.A06()
            java.lang.Object r2 = r0.A00
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.String r0 = "REEL_USER_PAY_SUBSCRIBE_STORY_STICKER"
            X.3iT r0 = X.C63863iT.A06(r2, r3, r5, r4, r0)
            r0.A0I(r2)
            X.495 r2 = r6.A02
            java.lang.String r0 = r6.A08
            long r3 = java.lang.Long.parseLong(r0)
            X.0nS r2 = r2.A00
            java.lang.String r0 = "ig_digital_fan_club_share_as_story_sticker_click"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r0)
            r0 = 1159(0x487, float:1.624E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r0)
            java.lang.String r0 = "creator_management_consideration"
            X.C18190wL.A1J(r2, r0, r3)
            r2.Bb4()
            r0 = -1701469823(0xffffffff9a95a181, float:-6.188588E-23)
            goto L_0x33e4
        L_0x1bfb:
            r1 = 1295385215(0x4d36027f, float:1.90851056E8)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A01
            X.1bp r3 = (X.C23041bp) r3
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r2 = X.C23041bp.A00(r3)
            androidx.fragment.app.FragmentActivity r7 = r3.requireActivity()
            java.lang.Object r3 = r0.A00
            X.1pG r3 = (X.AnonymousClass1pG) r3
            java.lang.String r0 = r3.A05
            java.lang.String r6 = r3.A06
            java.lang.String r9 = r3.A07
            java.lang.String r10 = r3.A08
            r5 = 0
            r4 = 1
            java.lang.Integer r3 = r2.A00
            int r3 = r3.intValue()
            if (r3 == r5) goto L_0x1d59
            if (r3 == r4) goto L_0x1c5d
            r0 = 2
            if (r3 != r0) goto L_0x1c58
            X.495 r5 = r2.A02
            java.lang.String r0 = r2.A08
            long r3 = java.lang.Long.parseLong(r0)
            X.0nS r5 = r5.A00
            java.lang.String r0 = "ig_fan_club_view_member_list_button_tapped"
            X.0A2 r5 = X.AnonymousClass0wJ.A0M(r5, r0)
            r0 = 1216(0x4c0, float:1.704E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = X.C18180wK.A0I(r5, r0)
            java.lang.String r0 = "creator_management_consideration"
            X.C18190wL.A1J(r5, r0, r3)
            r5.Bb4()
            com.instagram.service.session.UserSession r5 = r2.A07
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            java.lang.String r2 = "ARGUMENT_ENTRY_POINT"
            java.lang.String r0 = "PROFILE"
            android.os.Bundle r3 = X.C18180wK.A09(r2, r0)
            java.lang.String r0 = "fan_club_member_list"
        L_0x1c55:
            X.C63863iT.A09(r7, r3, r5, r4, r0)
        L_0x1c58:
            r0 = 1873664502(0x6fadd9f6, float:1.0760881E29)
            goto L_0x33e4
        L_0x1c5d:
            X.490 r14 = r2.A04
            X.4wE r3 = r2.A0B
            java.lang.Object r8 = r3.getValue()
            java.lang.String r3 = "Required value was null."
            if (r8 == 0) goto L_0x1d82
            if (r10 == 0) goto L_0x1d7d
            r12 = 3
            X.3Xe r6 = r14.A00
            r11 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S2401000_I2 r5 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S2401000_I2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.4tk r6 = X.C25239DiK.A00(r5)
            X.4qz r5 = r14.A03
            X.8n7 r4 = X.AnonymousClass74I.A00
            r3 = 2147483647(0x7fffffff, float:NaN)
            X.Ezi r15 = X.C25753DrP.A01(r5, r6, r4, r3)
            java.util.Map r4 = r14.A02
            kotlin.Pair r3 = X.C18180wK.A0p(r8, r9)
            r4.put(r3, r15)
            r19 = 10
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S1301000_I2 r13 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S1301000_I2
            r16 = r8
            r17 = r9
            r18 = r11
            r13.<init>((java.lang.Object) r14, (java.lang.Object) r15, (java.lang.Object) r16, (java.lang.String) r17, (X.C146958n9) r18, (int) r19)
            X.C25237DiI.A00(r11, r11, r13, r5, r12)
            X.4qz r5 = X.AnonymousClass3J5.A00(r2)
            X.4u0 r3 = r2.A01
            X.E5N r3 = (X.E5N) r3
            X.EgD r4 = r3.A03
            r17 = 9
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S2101000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S2101000_I2
            r12 = r3
            r13 = r2
            r14 = r0
            r15 = r9
            r16 = r11
            r12.<init>((java.lang.Object) r13, (java.lang.String) r14, (java.lang.String) r15, (X.C146958n9) r16, (int) r17)
            r0 = 2
            X.C25237DiI.A00(r11, r4, r3, r5, r0)
            java.lang.String r5 = r2.A09
            java.lang.Integer r0 = X.AnonymousClass006.A04
            java.lang.String r0 = X.AnonymousClass3R0.A00(r0)
            boolean r0 = X.C04220Ms.A0I(r5, r0)
            if (r0 == 0) goto L_0x1cd7
            com.instagram.service.session.UserSession r0 = r2.A07
            X.49J r10 = X.AnonymousClass2M0.A00(r0)
            X.29s r9 = X.C319829s.STORY
            X.29t r7 = X.C319929t.SUBSCRIBE_TO_CREATOR
            X.28X r6 = X.AnonymousClass28X.TAP
            X.29u r8 = X.C320029u.SUBSCRIBE_TO_JOIN_CHAT_SHEET
            X.AnonymousClass49J.A00(r6, r7, r8, r9, r10, r11)
            goto L_0x1c58
        L_0x1cd7:
            java.lang.Integer r0 = X.AnonymousClass006.A0E
            java.lang.String r0 = X.AnonymousClass3R0.A00(r0)
            boolean r0 = X.C04220Ms.A0I(r5, r0)
            if (r0 != 0) goto L_0x1cfb
            java.lang.Integer r0 = X.AnonymousClass006.A0F
            java.lang.String r0 = X.AnonymousClass3R0.A00(r0)
            boolean r0 = X.C04220Ms.A0I(r5, r0)
            if (r0 != 0) goto L_0x1cfb
            java.lang.Integer r0 = X.AnonymousClass006.A0G
            java.lang.String r0 = X.AnonymousClass3R0.A00(r0)
            boolean r0 = X.C04220Ms.A0I(r5, r0)
            if (r0 == 0) goto L_0x1c58
        L_0x1cfb:
            com.instagram.service.session.UserSession r0 = r2.A07
            X.49Y r6 = X.AnonymousClass3Zh.A01(r0)
            java.lang.String r2 = r2.A08
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.AnonymousClass49Y.A00(r6)
            boolean r0 = X.AnonymousClass0wJ.A1U(r4)
            if (r0 == 0) goto L_0x1c58
            java.util.HashMap r3 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "creator_igid"
            r3.put(r0, r2)
            java.lang.Integer r0 = X.AnonymousClass006.A0G
            java.lang.String r0 = X.AnonymousClass3R0.A00(r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x1d47
            java.lang.String r2 = "reels"
        L_0x1d24:
            java.lang.String r0 = "entrypoint"
            r3.put(r0, r2)
            X.AnonymousClass49Y.A03(r4, r6)
            X.2AE r0 = X.AnonymousClass2AE.A0X
            X.AnonymousClass2A4.A00(r0, r4)
            X.Lci r0 = X.C40328Lci.A0U
            X.C18230wP.A1D(r0, r4)
            X.2AA r0 = X.AnonymousClass2AA.A0G
            X.C18240wQ.A13(r0, r4)
            X.2AG r2 = X.AnonymousClass2AG.SUBSCRIBER_BROADCAST
            java.lang.String r0 = "parent_surface"
            r4.A0O(r2, r0)
            X.C18200wM.A1J(r4, r3)
            goto L_0x1c58
        L_0x1d47:
            java.lang.Integer r0 = X.AnonymousClass006.A0F
            java.lang.String r0 = X.AnonymousClass3R0.A00(r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x1d56
            java.lang.String r2 = "message_in_story"
            goto L_0x1d24
        L_0x1d56:
            java.lang.String r2 = "join_chat_sticker"
            goto L_0x1d24
        L_0x1d59:
            com.instagram.service.session.UserSession r5 = r2.A07
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r3 = X.C18180wK.A06()
            java.lang.String r2 = r2.A08
            java.lang.String r0 = "creator_user_id"
            r3.putString(r0, r2)
            java.lang.String r0 = "fan_club_name"
            r3.putString(r0, r6)
            java.lang.String r0 = "sku"
            r3.putString(r0, r9)
            java.lang.String r2 = "fan_management_consideration"
            java.lang.String r0 = "origin"
            r3.putString(r0, r2)
            java.lang.String r0 = "fan_club_subscriptions_detail"
            goto L_0x1c55
        L_0x1d7d:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r3)
            throw r0
        L_0x1d82:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r3)
            throw r0
        L_0x1d87:
            r1 = 523333380(0x1f316f04, float:3.7573038E-20)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A01
            X.1bp r4 = (X.C23041bp) r4
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r3 = X.C23041bp.A00(r4)
            java.lang.Object r0 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2) r0
            java.lang.Object r2 = r0.A03
            java.lang.Integer r2 = (java.lang.Integer) r2
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            r3.A09(r0, r2)
            r0 = -744906029(0xffffffffd399a2d3, float:-1.31972347E12)
            goto L_0x33e4
        L_0x1daa:
            r1 = -1603012763(0xffffffffa073f765, float:-2.0664757E-19)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A01
            X.1bp r4 = (X.C23041bp) r4
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r3 = X.C23041bp.A00(r4)
            java.lang.Object r0 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2) r0
            java.lang.Object r2 = r0.A03
            java.lang.Integer r2 = (java.lang.Integer) r2
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            r3.A09(r0, r2)
            r0 = 993825830(0x3b3c9426, float:0.0028774827)
            goto L_0x33e4
        L_0x1dcd:
            r1 = 1163819660(0x455e7a8c, float:3559.6592)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r5 = r0.A01
            X.1aM r5 = (X.AnonymousClass1aM) r5
            X.0Oa r2 = r5.A03
            X.0i6 r2 = X.AnonymousClass0wJ.A0U(r2)
            X.3Iu r4 = new X.3Iu
            r4.<init>(r2)
            android.content.Context r3 = r5.requireContext()
            r2 = 2131820907(0x7f11016b, float:1.9274542E38)
            java.lang.Object r6 = r0.A00
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            java.lang.String r0 = r6.BK7()
            java.lang.String r3 = X.AnonymousClass0wJ.A0l(r3, r0, r2)
            android.content.Context r2 = r5.requireContext()
            r0 = 2131820906(0x7f11016a, float:1.927454E38)
            java.lang.String r0 = r2.getString(r0)
            r4.A0A(r3, r0)
            com.instagram.common.typedurl.ImageUrl r2 = r6.B4M()
            X.3hu r0 = r4.A03
            if (r0 == 0) goto L_0x1e0e
            r0.A08 = r2
        L_0x1e0e:
            android.content.Context r2 = r5.requireContext()
            r0 = 2131834607(0x7f1136ef, float:1.930233E38)
            java.lang.String r2 = r2.getString(r0)
            r0 = 94
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r5, r6, r0)
            r4.A08(r2, r0)
            X.C62763ag.A00(r5, r4)
            r0 = 1874591134(0x6fbbfd9e, float:1.163606E29)
            goto L_0x33e4
        L_0x1e2a:
            r1 = -421321242(0xffffffffe6e325e6, float:-5.3633815E23)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A01
            X.1aM r4 = (X.AnonymousClass1aM) r4
            X.0Oa r2 = r4.A04
            X.3ak r6 = X.C18200wM.A0N(r2)
            android.os.Bundle r3 = r4.requireArguments()
            java.lang.String r2 = "event_id"
            java.lang.String r7 = r3.getString(r2)
            java.lang.Object r3 = r0.A00
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            java.lang.String r8 = r3.getId()
            r0 = 1
            X.C04220Ms.A0B(r8, r0)
            X.4qz r2 = X.AnonymousClass3J5.A00(r6)
            r9 = 0
            r10 = 8
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S2101000_I2 r5 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S2101000_I2
            r5.<init>((java.lang.Object) r6, (java.lang.String) r7, (java.lang.String) r8, (X.C146958n9) r9, (int) r10)
            r0 = 3
            X.C25237DiI.A00(r9, r9, r5, r2, r0)
            java.util.List r0 = r4.A01
            if (r0 == 0) goto L_0x1e68
            r0.remove(r3)
        L_0x1e68:
            X.AnonymousClass1aM.A01(r4)
            r0 = 1907168544(0x71ad1520, float:1.7141262E30)
            goto L_0x33e4
        L_0x1e70:
            r1 = 594244044(0x236b71cc, float:1.2763473E-17)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A01
            X.1aM r4 = (X.AnonymousClass1aM) r4
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            X.0Oa r2 = r4.A03
            X.0i6 r2 = X.AnonymousClass0wJ.A0U(r2)
            X.Drz r9 = X.C18180wK.A0Q(r3, r2)
            X.DaD r2 = X.AnonymousClass2O0.A00()
            r2.A00()
            android.os.Bundle r2 = r4.requireArguments()
            java.lang.String r8 = "event_id"
            java.lang.String r7 = r2.getString(r8)
            java.lang.Object r6 = r0.A00
            X.253 r6 = (X.AnonymousClass253) r6
            android.os.Bundle r0 = r4.requireArguments()
            java.lang.String r5 = "is_private"
            boolean r4 = r0.getBoolean(r5)
            X.1aM r3 = new X.1aM
            r3.<init>()
            android.os.Bundle r2 = X.C18180wK.A06()
            r2.putString(r8, r7)
            java.lang.String r0 = "response_page_type"
            r2.putSerializable(r0, r6)
            r2.putBoolean(r5, r4)
            X.C18180wK.A0x(r2, r3, r9)
            r0 = 464976559(0x1bb6faaf, float:3.0271375E-22)
            goto L_0x33e4
        L_0x1ec4:
            r1 = 1935873545(0x73631609, float:1.7991612E31)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.1lN r2 = (X.AnonymousClass1lN) r2
            X.4rd r2 = r2.A01
            java.lang.Object r0 = r0.A00
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r2.C7j(r0)
            r0 = 1509467101(0x59f8a3dd, float:8.7482455E15)
            goto L_0x33e4
        L_0x1edd:
            r1 = 66837240(0x3fbdaf8, float:1.4802727E-36)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.1xg r2 = (X.C29281xg) r2
            java.lang.Object r0 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2) r0
            java.lang.String r0 = r0.A01
            X.C29281xg.A0B(r2, r0)
            r0 = -1695274310(0xffffffff9af42aba, float:-1.00985063E-22)
            goto L_0x33e4
        L_0x1ef6:
            r1 = 1438701771(0x55c0d8cb, float:2.65046689E13)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.1xg r2 = (X.C29281xg) r2
            java.lang.Object r0 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2) r0
            java.lang.String r0 = r0.A01
            X.C29281xg.A0B(r2, r0)
            r0 = -290170128(0xffffffffeeb45af0, float:-2.790862E28)
            goto L_0x33e4
        L_0x1f0f:
            r1 = 998279178(0x3b80880a, float:0.003922467)
            int r3 = X.C14030oh.A05(r1)
            java.lang.Object r6 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2 r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2) r6
            java.lang.Object r1 = r6.A00
            int r2 = X.AnonymousClass0wJ.A04(r1)
            r1 = 1
            if (r2 == r1) goto L_0x1f4d
            r1 = 2
            if (r2 != r1) goto L_0x1f48
            java.lang.Object r0 = r0.A01
            X.1dH r0 = (X.AnonymousClass1dH) r0
            X.0Oa r0 = r0.A06
            java.lang.Object r5 = r0.getValue()
            com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel r5 = (com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel) r5
            X.3Ue r4 = r5.A01
            java.lang.String r1 = r6.A04
            java.lang.String r0 = r6.A03
            X.0cU r2 = X.AnonymousClass3Ue.A00(r4, r1, r0)
            if (r2 == 0) goto L_0x1f45
            com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore r1 = r4.A00
            java.lang.String r0 = r6.A02
            r1.putOverriddenParameter(r2, r0)
        L_0x1f45:
            com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel.A03(r5)
        L_0x1f48:
            r0 = 371104899(0x161e9c83, float:1.2812525E-25)
            goto L_0x2f8c
        L_0x1f4d:
            java.lang.Object r0 = r0.A01
            X.1dH r0 = (X.AnonymousClass1dH) r0
            X.0Oa r0 = r0.A06
            java.lang.Object r5 = r0.getValue()
            com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel r5 = (com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel) r5
            X.3Ue r2 = r5.A01
            java.lang.String r1 = r6.A04
            java.lang.String r0 = r6.A03
            X.0cU r1 = X.AnonymousClass3Ue.A00(r2, r1, r0)
            if (r1 == 0) goto L_0x1f45
            com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore r0 = r2.A00
            r0.removeOverriddenParameter(r1)
            goto L_0x1f45
        L_0x1f6b:
            r1 = 1669172332(0x637d8c6c, float:4.6771447E21)
            int r4 = X.C14030oh.A05(r1)
            java.lang.Object r5 = r0.A01
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            java.lang.Object r6 = r0.A00
            X.19K r6 = (X.AnonymousClass19K) r6
            java.util.List r8 = r6.A08
            java.util.Iterator r2 = r8.iterator()
            r9 = 0
            r7 = 0
        L_0x1f82:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x1f97
            java.lang.Object r1 = r2.next()
            java.lang.String r0 = r6.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x1f98
            int r7 = r7 + 1
            goto L_0x1f82
        L_0x1f97:
            r7 = -1
        L_0x1f98:
            X.0MZ r3 = new X.0MZ
            r3.<init>()
            r3.A00 = r7
            android.content.Context r0 = r5.requireContext()
            X.Luf r2 = new X.Luf
            r2.<init>(r0)
            java.lang.String r1 = "Select variant for "
            java.lang.String r0 = r6.A03
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)
            r2.A08(r0)
            java.lang.String[] r0 = new java.lang.String[r9]
            java.lang.Object[] r1 = r8.toArray(r0)
            java.lang.CharSequence[] r1 = (java.lang.CharSequence[]) r1
            r0 = 57
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r0 = X.C18220wO.A0O(r3, r0)
            r2.A06(r0, r1, r7)
            java.lang.String r1 = "Cancel"
            X.3jr r0 = X.C64203jr.A00
            r2.A04(r0, r1)
            java.lang.String r1 = "Select"
            r0 = 18
            com.facebook.redex.IDxCListenerShape48S0300000_1_I2 r0 = X.C18250wR.A0E(r6, r3, r5, r0)
            r2.A05(r0, r1)
            r2.A01()
            r0 = -1628858749(0xffffffff9ee99683, float:-2.4732085E-20)
            goto L_0x2527
        L_0x1fde:
            r1 = -1059650070(0xffffffffc0d705ea, float:-6.719472)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5010000_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5010000_I2) r4
            boolean r2 = r4.A00()
            if (r2 == 0) goto L_0x2003
            java.lang.Object r2 = r0.A01
            X.1dH r2 = (X.AnonymousClass1dH) r2
            X.0Oa r0 = r2.A06
            java.lang.Object r3 = r0.getValue()
            com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel r3 = (com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel) r3
            android.content.Context r2 = r2.requireContext()
            r0 = 1
            r3.A04(r2, r4, r0)
        L_0x2003:
            r0 = 863863169(0x337d8181, float:5.9023936E-8)
            goto L_0x33e4
        L_0x2008:
            r1 = -840963303(0xffffffffcddfeb19, float:-4.69590816E8)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.1dH r2 = (X.AnonymousClass1dH) r2
            X.0Oa r2 = r2.A04
            r2.getValue()
            java.lang.Object r2 = r0.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r0 = "https://www.internalfb.com/intern/mobile_builds/instagram_for_android/"
            X.C37412JrW.A01(r2, r0)
            r0 = -1068372569(0xffffffffc051eda7, float:-3.2801301)
            goto L_0x33e4
        L_0x2026:
            r1 = 318772551(0x13001547, float:1.6166362E-27)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.3yl r2 = (X.C67033yl) r2
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r7 = r2.A01
            androidx.fragment.app.FragmentActivity r6 = r7.requireActivity()
            X.0m7 r12 = r7.getParentFragmentManager()
            java.lang.Object r8 = r0.A01
            com.instagram.model.venue.Venue r8 = (com.instagram.model.venue.Venue) r8
            X.06E r4 = X.AnonymousClass06E.A00(r7)
            com.instagram.service.session.UserSession r9 = r2.A02
            com.instagram.model.venue.LocationDict r0 = r8.A00
            java.lang.String r10 = r0.A0K
            java.lang.String r3 = "map_location_detail_overflow_menu"
            r11 = 1
            com.facebook.redex.IDxFunctionShape10S1400000_1_I2 r5 = new com.facebook.redex.IDxFunctionShape10S1400000_1_I2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.String r2 = "qr_code"
            java.lang.String r0 = r8.getId()
            X.C63673i6.A04(r7, r9, r0, r3, r2)
            X.1uc r10 = new X.1uc
            r11 = r6
            r13 = r5
            r14 = r7
            r15 = r8
            r16 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.lang.String r3 = r8.getId()
            java.lang.Integer r2 = X.AnonymousClass006.A00
            java.lang.String r0 = r7.getModuleName()
            X.H8c r0 = X.C36912Td.A00(r9, r2, r3, r0)
            r0.A00 = r10
            X.C31155GhB.A01(r6, r4, r0)
            r0 = -13256071(0xffffffffff35ba79, float:-2.4155849E38)
            goto L_0x33e4
        L_0x207d:
            r1 = -797889916(0xffffffffd0712a84, float:-1.61843814E10)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.3EM r2 = (X.AnonymousClass3EM) r2
            java.lang.Object r7 = r0.A01
            com.instagram.discovery.mediamap.model.MediaMapPin r7 = (com.instagram.discovery.mediamap.model.MediaMapPin) r7
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r4 = r2.A00
            X.JrN r3 = X.C18220wO.A0a(r4)
            com.instagram.discovery.mediamap.intf.MediaMapQuery r2 = r4.A02
            java.lang.String r0 = "instagram_map_location_detail_tap_direct_share"
            X.C18230wP.A1L(r2, r3, r7, r0)
            androidx.fragment.app.Fragment r6 = r4.requireParentFragment()
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r6 = (com.instagram.discovery.mediamap.fragment.MediaMapFragment) r6
            X.1XX r0 = new X.1XX
            r0.<init>()
            X.3HF r5 = new X.3HF
            r5.<init>(r6, r0)
            com.instagram.service.session.UserSession r4 = r6.A0Q
            java.lang.String r3 = r7.getId()
            java.lang.Integer r2 = X.AnonymousClass006.A0Y
            r0 = 609(0x261, float:8.53E-43)
            java.lang.String r0 = X.I17.A00(r0)
            X.H8c r3 = X.C36912Td.A00(r4, r2, r3, r0)
            r2 = 9
            com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2 r0 = new com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2
            r0.<init>((int) r2, (java.lang.Object) r7, (java.lang.Object) r5, (java.lang.Object) r6)
            r3.A00 = r0
            r6.schedule(r3)
            r0 = 1004544362(0x3be0216a, float:0.0068399208)
            goto L_0x33e4
        L_0x20cc:
            r1 = -636593417(0xffffffffda0e5af7, float:-1.00173659E16)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.3EM r2 = (X.AnonymousClass3EM) r2
            java.lang.Object r0 = r0.A01
            com.instagram.discovery.mediamap.model.MediaMapPin r0 = (com.instagram.discovery.mediamap.model.MediaMapPin) r0
            r2.A00(r0)
            r0 = -1751681261(0xffffffff97977713, float:-9.788205E-25)
            goto L_0x33e4
        L_0x20e3:
            r1 = -1980364251(0xffffffff89f60a25, float:-5.9231886E-33)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.3EM r2 = (X.AnonymousClass3EM) r2
            java.lang.Object r0 = r0.A01
            com.instagram.discovery.mediamap.model.MediaMapPin r0 = (com.instagram.discovery.mediamap.model.MediaMapPin) r0
            r2.A00(r0)
            r0 = -383924787(0xffffffffe91dc5cd, float:-1.1920965E25)
            goto L_0x33e4
        L_0x20fa:
            r1 = -66698931(0xfffffffffc06414d, float:-2.788369E36)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.3EM r2 = (X.AnonymousClass3EM) r2
            java.lang.Object r9 = r0.A01
            com.instagram.discovery.mediamap.model.MediaMapPin r9 = (com.instagram.discovery.mediamap.model.MediaMapPin) r9
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r4 = r2.A00
            X.JrN r3 = X.C18220wO.A0a(r4)
            com.instagram.discovery.mediamap.intf.MediaMapQuery r2 = r4.A02
            java.lang.String r0 = "instagram_map_location_detail_tap_directions"
            X.C18230wP.A1L(r2, r3, r9, r0)
            X.3A9 r8 = r4.mDirectionsBottomSheetController
            androidx.fragment.app.FragmentActivity r7 = r4.requireActivity()
            com.instagram.discovery.mediamap.model.LocationPageInformation r6 = r9.A06
            if (r6 == 0) goto L_0x2164
            X.3Xy r0 = r8.A00
            com.instagram.service.session.UserSession r0 = r0.A00
            X.3Iu r5 = new X.3Iu
            r5.<init>(r0)
            r4 = 0
            com.facebook.redex.IDxObjectShape174S0000000_1_I2 r0 = new com.facebook.redex.IDxObjectShape174S0000000_1_I2
            r0.<init>(r4)
            r5.A02 = r0
            r3 = 2131832023(0x7f112cd7, float:1.9297088E38)
            r2 = 33
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r0.<init>((int) r2, (java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r7)
            r5.A03(r0, r3)
            java.lang.String r0 = r6.A05
            if (r0 == 0) goto L_0x215c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x215c
            java.lang.String r0 = X.C62243Xy.A00(r6, r4)
            r5.A07(r0)
            r3 = 2131824417(0x7f110f21, float:1.9281661E38)
            r2 = 32
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r0.<init>((int) r2, (java.lang.Object) r8, (java.lang.Object) r6, (java.lang.Object) r7)
            r5.A03(r0, r3)
        L_0x215c:
            X.3ag r0 = new X.3ag
            r0.<init>(r5)
            r0.A02(r7)
        L_0x2164:
            r0 = 1535428072(0x5b84c5e8, float:7.4744594E16)
            goto L_0x33e4
        L_0x2169:
            r1 = 1909874834(0x71d66092, float:2.1230892E30)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.1cq r2 = (X.C23251cq) r2
            java.lang.Object r0 = r0.A00
            android.widget.EditText r0 = (android.widget.EditText) r0
            X.C23251cq.A00(r0, r2)
            r0 = 1582320763(0x5e504c7b, float:3.75237672E18)
            goto L_0x33e4
        L_0x2180:
            r1 = 1702018048(0x6572bc00, float:7.1642542E22)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.1cq r2 = (X.C23251cq) r2
            java.lang.Object r0 = r0.A00
            android.widget.EditText r0 = (android.widget.EditText) r0
            X.C23251cq.A00(r0, r2)
            X.C18210wN.A14(r2)
            r0 = -2090904388(0xffffffff835f54bc, float:-6.563108E-37)
            goto L_0x33e4
        L_0x219a:
            java.lang.Object r6 = r0.A00
            X.1dN r6 = (X.AnonymousClass1dN) r6
            java.lang.Object r2 = r0.A01
            X.3BM r2 = (X.AnonymousClass3BM) r2
            X.3hG r0 = r6.A04
            int r1 = r0.A00
            r0 = 1
            if (r1 == r0) goto L_0x21ac
            r0 = 2
            if (r1 != r0) goto L_0x222e
        L_0x21ac:
            r4 = 0
            goto L_0x21c0
        L_0x21ae:
            java.lang.Object r6 = r0.A00
            X.1dN r6 = (X.AnonymousClass1dN) r6
            java.lang.Object r2 = r0.A01
            X.3BM r2 = (X.AnonymousClass3BM) r2
            X.3hG r0 = r6.A04
            int r1 = r0.A00
            r4 = 1
            if (r1 == r4) goto L_0x21c0
            r0 = 2
            if (r1 != r0) goto L_0x222e
        L_0x21c0:
            android.os.Bundle r7 = r6.requireArguments()
            X.3hG r0 = r6.A04
            int r1 = r0.A00
            r0 = 2
            if (r1 != r0) goto L_0x21dc
            X.3DE r1 = r6.A05
            X.1cr r0 = r6.A02
            r0.getClass()
            int r0 = r0.A00
            int r0 = r0 + 1
            java.lang.Long r0 = X.C18230wP.A0f(r0)
            r1.A01 = r0
        L_0x21dc:
            java.lang.String r8 = "upgrade"
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r6.A00
            long r2 = r2 - r0
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            if (r4 == 0) goto L_0x2220
            java.lang.String r0 = "upgrade_started"
            X.AnonymousClass1dN.A04(r6, r1, r0, r8)
            X.34F r0 = r6.A03
            r1 = 0
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r0.A00
            r0.setPrimaryButtonEnabled(r1)
            X.34F r0 = r6.A03
            r1 = 1
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r0.A00
            r0.setPrimaryActionIsLoading(r1)
            com.instagram.service.session.UserSession r0 = r6.A07
            X.3hX r5 = X.C63473hX.A01(r0)
            X.3DE r4 = r6.A05
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r6.A00
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A00 = r0
            r4.A05 = r8
            X.1p1 r0 = new X.1p1
            r0.<init>(r7, r6)
            r5.A07(r0, r4)
            return
        L_0x2220:
            java.lang.String r0 = "upgrade_screen_declined"
            X.AnonymousClass1dN.A04(r6, r1, r0, r8)
            java.lang.Integer r0 = X.AnonymousClass006.A01
            X.AnonymousClass1dN.A00(r7, r6, r0)
            X.AnonymousClass1dN.A01(r6)
            return
        L_0x222e:
            X.AnonymousClass1dN.A03(r6, r2)
            return
        L_0x2232:
            r1 = 608114293(0x243f1675, float:4.1435545E-17)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A01
            X.1bs r4 = (X.C23071bs) r4
            X.0zW r2 = X.C23071bs.A00(r4)
            X.4wG r2 = r2.A0E
            java.lang.Object r5 = r2.getValue()
            X.24x r5 = (X.C312624x) r5
            X.0zW r2 = X.C23071bs.A00(r4)
            X.4wG r2 = r2.A0D
            java.lang.Object r2 = r2.getValue()
            int r3 = X.AnonymousClass0wJ.A04(r2)
            r2 = 2
            if (r3 != r2) goto L_0x2265
            X.0Oa r2 = r4.A0A
            java.lang.Object r6 = r2.getValue()
            X.20y r3 = X.AnonymousClass20y.Social
            r2 = 1
            if (r6 == r3) goto L_0x2266
        L_0x2265:
            r2 = 0
        L_0x2266:
            java.lang.Object r0 = r0.A00
            X.34D r0 = (X.AnonymousClass34D) r0
            r9 = 0
            X.C04220Ms.A0B(r5, r9)
            X.1aq r3 = new X.1aq
            r3.<init>()
            r3.A00 = r0
            r3.A01 = r5
            r3.A02 = r2
            X.0Oa r0 = r4.A0K
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.Jj9 r2 = X.C18210wN.A0L(r0)
            r7 = 0
            r11 = 4095(0xfff, float:5.738E-42)
            X.17a r6 = new X.17a
            r8 = r7
            r10 = r9
            r12 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0 = 2131825841(0x7f1114b1, float:1.928455E38)
            java.lang.String r0 = r4.getString(r0)
            r6.A06 = r0
            r0 = 365(0x16d, float:5.11E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r4, r0)
            r6.A04 = r0
            X.JPd r0 = r6.A01()
            r2.A0G = r0
            X.17a r6 = new X.17a
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0 = 2131825838(0x7f1114ae, float:1.9284543E38)
            java.lang.String r0 = r4.getString(r0)
            r6.A06 = r0
            r0 = 74
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r4, r5, r0)
            r6.A04 = r0
            X.JPd r0 = r6.A01()
            r2.A0F = r0
            r0 = 2131825842(0x7f1114b2, float:1.9284552E38)
            java.lang.String r0 = r4.getString(r0)
            r2.A0O = r0
            X.C18220wO.A19(r4, r3, r2)
            X.0Oa r3 = r4.A0A
            java.lang.Object r2 = r3.getValue()
            X.20y r0 = X.AnonymousClass20y.Broadcast
            if (r2 != r0) goto L_0x230c
            X.0Oa r0 = r4.A0I
            X.49Y r4 = X.C18240wQ.A0P(r0)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.AnonymousClass49Y.A00(r4)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x2307
            com.instagram.service.session.UserSession r0 = r4.A03
            java.lang.String r0 = r0.getUserId()
            java.lang.Long r2 = X.AnonymousClass0wJ.A0d(r0)
            java.lang.String r0 = "actor_id"
            r3.A0S(r0, r2)
            X.2AE r0 = X.AnonymousClass2AE.A03
            X.AnonymousClass2A4.A00(r0, r3)
            X.Lci r0 = X.C40328Lci.A06
            java.lang.String r0 = X.AnonymousClass2AG.A00(r0, r3, r4)
        L_0x2301:
            X.C62443a0.A01(r3, r0)
            r3.Bb4()
        L_0x2307:
            r0 = -161037806(0xfffffffff666c212, float:-1.1700825E33)
            goto L_0x33e4
        L_0x230c:
            java.lang.Object r2 = r3.getValue()
            X.20y r0 = X.AnonymousClass20y.Social
            if (r2 != r0) goto L_0x2307
            X.0Oa r0 = r4.A0J
            java.lang.Object r4 = r0.getValue()
            X.49W r4 = (X.AnonymousClass49W) r4
            X.0nS r0 = r4.A02
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A0D(r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x2307
            com.instagram.service.session.UserSession r0 = r4.A03
            java.lang.String r0 = r0.getUserId()
            java.lang.Long r2 = X.AnonymousClass0wJ.A0d(r0)
            java.lang.String r0 = "actor_id"
            r3.A0S(r0, r2)
            X.2AB r2 = X.AnonymousClass2AB.A02
            java.lang.String r0 = "event"
            X.AnonymousClass2A3.A00(r2, r3, r0)
            X.Lcg r0 = X.C40326Lcg.A06
            java.lang.String r0 = X.AnonymousClass2AH.A00(r0, r3, r4)
            goto L_0x2301
        L_0x2345:
            r1 = 642654481(0x264e2111, float:7.151542E-16)
            int r3 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A01
            X.1bs r4 = (X.C23071bs) r4
            X.0zW r2 = X.C23071bs.A00(r4)
            java.lang.Object r1 = r0.A00
            X.4wE r0 = r2.A08
            r0.CrC(r1)
            X.C18180wK.A12(r4)
            X.0Oa r2 = r4.A0A
            java.lang.Object r1 = r2.getValue()
            X.20y r0 = X.AnonymousClass20y.Broadcast
            if (r1 != r0) goto L_0x239d
            X.0Oa r0 = r4.A0I
            X.49Y r4 = X.C18240wQ.A0P(r0)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.AnonymousClass49Y.A00(r4)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x2398
            com.instagram.service.session.UserSession r0 = r4.A03
            java.lang.String r0 = r0.getUserId()
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r0)
            java.lang.String r0 = "actor_id"
            r2.A0S(r0, r1)
            X.2AE r0 = X.AnonymousClass2AE.A0W
            X.AnonymousClass2A4.A00(r0, r2)
            X.Lci r0 = X.C40328Lci.A04
            java.lang.String r0 = X.AnonymousClass2AG.A00(r0, r2, r4)
        L_0x2392:
            X.C62443a0.A02(r2, r0)
            r2.Bb4()
        L_0x2398:
            r0 = -2027533263(0xffffffff87264c31, float:-1.2510843E-34)
            goto L_0x2f8c
        L_0x239d:
            java.lang.Object r1 = r2.getValue()
            X.20y r0 = X.AnonymousClass20y.Social
            if (r1 != r0) goto L_0x2398
            X.0Oa r0 = r4.A0J
            java.lang.Object r4 = r0.getValue()
            X.49W r4 = (X.AnonymousClass49W) r4
            X.0nS r0 = r4.A02
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A0D(r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x2398
            com.instagram.service.session.UserSession r0 = r4.A03
            java.lang.String r0 = r0.getUserId()
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r0)
            java.lang.String r0 = "actor_id"
            r2.A0S(r0, r1)
            X.2AB r1 = X.AnonymousClass2AB.A0O
            java.lang.String r0 = "event"
            X.AnonymousClass2A3.A00(r1, r2, r0)
            X.Lcg r0 = X.C40326Lcg.A04
            java.lang.String r0 = X.AnonymousClass2AH.A00(r0, r2, r4)
            goto L_0x2392
        L_0x23d6:
            r1 = 2001146368(0x77471200, float:4.0376256E33)
            int r1 = X.C14030oh.A05(r1)
            android.os.Bundle r4 = X.C18180wK.A06()
            java.lang.Object r2 = r0.A00
            java.lang.Integer r2 = (java.lang.Integer) r2
            X.AnonymousClass3M9.A01(r4, r2)
            java.lang.String r3 = "WAITLIST_INFO_NUX"
            java.lang.String r2 = "waitlistJoinSourceKey"
            r4.putString(r2, r3)
            java.lang.Object r0 = r0.A01
            X.1bE r0 = (X.AnonymousClass1bE) r0
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.0Oa r0 = r0.A03
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.Drz r2 = X.C18180wK.A0Q(r2, r0)
            X.1b3 r0 = new X.1b3
            r0.<init>()
            X.C18240wQ.A0u(r4, r0, r2)
            r0 = -566624427(0xffffffffde39ff55, float:-3.35063112E18)
            goto L_0x33e4
        L_0x240e:
            r1 = 464719982(0x1bb3106e, float:2.9623683E-22)
            int r3 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A01
            X.1xC r4 = (X.C29161xC) r4
            X.10b r1 = X.C29161xC.A0C(r4)
            X.1oT r2 = r1.A05
            java.lang.String r1 = "TURN_ON_SECURE_STORAGE"
            r2.A02(r1)
            java.lang.Integer r1 = X.AnonymousClass006.A00
            r2.A01(r1)
            X.10b r7 = X.C29161xC.A0C(r4)
            androidx.fragment.app.FragmentActivity r5 = r4.requireActivity()
            java.lang.Object r0 = r0.A00
            X.22a r0 = (X.C305922a) r0
            r1 = 1
            r6 = 0
            int r0 = r0.ordinal()
            if (r0 == r6) goto L_0x2462
            if (r0 != r1) goto L_0x245d
            com.instagram.service.session.UserSession r1 = r7.A07
            X.DdJ r0 = X.AnonymousClass6RJ.A00(r5, r1)
            r1.getUserId()
            X.Jil r4 = r7.A03
            X.Gh5 r2 = r0.A00(r4)
            X.4wE r1 = r7.A0E
            X.20x r0 = X.C304020x.ON
            r1.D7t(r0)
            com.facebook.redex.IDxConsumerShape141S0200000_1_I2 r0 = new com.facebook.redex.IDxConsumerShape141S0200000_1_I2
            r0.<init>(r6, r5, r7)
            r4.A02(r0, r2)
        L_0x245d:
            r0 = -1561798728(0xffffffffa2e8d7b8, float:-6.3112127E-18)
            goto L_0x2f8c
        L_0x2462:
            com.instagram.service.session.UserSession r0 = r7.A07
            X.3Gu r4 = X.AnonymousClass2MW.A00(r0)
            java.lang.Integer r2 = X.AnonymousClass006.A0u
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            X.20v r0 = X.C303820v.FULLSCREEN_MODAL
            r4.A01(r5, r0, r2, r1)
            goto L_0x245d
        L_0x2472:
            r1 = 1388699428(0x52c5df24, float:4.24926118E11)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r0 = r0.A01
            X.0i6 r0 = (X.C10300i6) r0
            X.Drz r2 = X.C18180wK.A0Q(r2, r0)
            X.1wl r0 = new X.1wl
            r0.<init>()
            r2.A03 = r0
            r2.A05()
            r0 = -1812207329(0xffffffff93fbe91f, float:-6.3591183E-27)
            goto L_0x33e4
        L_0x2494:
            r1 = -1521428074(0xffffffffa550d996, float:-1.8114845E-16)
            int r4 = X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A01
            X.1ky r1 = (X.C25001ky) r1
            X.1ap r8 = r1.A02
            java.lang.Object r9 = r0.A00
            X.197 r9 = (X.AnonymousClass197) r9
            java.lang.String r5 = r9.A05
            java.lang.Integer r3 = r9.A04
            r7 = 1
            if (r3 == 0) goto L_0x252d
            int r1 = r3.intValue()
            r0 = 28
            if (r1 != r0) goto L_0x252d
            X.DrH r0 = X.C18230wP.A0a(r8)
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x25b3
            androidx.fragment.app.Fragment r1 = r0.A08()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.igds.components.bottomsheet.BottomSheetFragment"
            X.C04220Ms.A0C(r1, r0)
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            X.Jqm r6 = r1.A02
            if (r6 == 0) goto L_0x25ae
            X.4Bf r3 = new X.4Bf
            r3.<init>(r8, r6)
            java.lang.String r2 = r9.A08
            X.0Oa r0 = r8.A02
            java.lang.Object r0 = r0.getValue()
            X.0zm r0 = (X.C19380zm) r0
            X.Dnj r1 = r0.A00
            java.lang.String r0 = r0.A01
            com.instagram.user.model.User r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x252b
            X.4tY r0 = r0.A0I()
            if (r0 == 0) goto L_0x252b
            java.lang.String r1 = r0.AhE()
        L_0x24ee:
            X.1dV r5 = new X.1dV
            r5.<init>()
            r5.A08 = r3
            java.lang.String r0 = "GroupPreviewFragment.PINNED_SSC_THREAD_ID"
            kotlin.Pair r3 = X.C18180wK.A0p(r0, r2)
            java.lang.String r0 = "GroupPreviewFragment.FAN_CLUB_ID"
            kotlin.Pair r2 = X.C18180wK.A0p(r0, r1)
            X.22u r1 = X.C307522u.PROFILE
            java.lang.String r0 = "GroupPreviewFragment.JOINING_SURFACE"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r3, r2, r0}
            android.os.Bundle r0 = X.C98316Fa.A00(r0)
            r5.setArguments(r0)
            r6.A05()
            X.0Oa r0 = r8.A01
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.Jj9 r0 = X.C18200wM.A0Y(r0, r7)
            r6.A09(r5, r0)
        L_0x2524:
            r0 = 1630334539(0x612cee4b, float:1.9937567E20)
        L_0x2527:
            X.C14030oh.A0C(r0, r4)
            return
        L_0x252b:
            r1 = 0
            goto L_0x24ee
        L_0x252d:
            if (r5 != 0) goto L_0x2537
            java.lang.String r1 = "ChannelsListFragment"
            java.lang.String r0 = "Invite link was not present on channel preview object."
            X.C10450iM.A03(r1, r0)
            goto L_0x2524
        L_0x2537:
            android.os.Bundle r2 = r8.requireArguments()
            java.lang.String r1 = "ChannelsListFragment.ENTRY_POINT"
            r0 = 0
            java.lang.String r1 = r2.getString(r1, r0)
            if (r1 != 0) goto L_0x2546
            java.lang.String r1 = "channel_link_bottom_sheet"
        L_0x2546:
            java.lang.String r0 = "s"
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "st"
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r0, r1)
            X.0Oa r0 = r8.A02
            java.lang.Object r0 = r0.getValue()
            X.0zm r0 = (X.C19380zm) r0
            java.lang.String r2 = r0.A01
            java.lang.String r1 = "cid"
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r1, r2)
            android.util.Pair[] r0 = new android.util.Pair[]{r6, r3, r0}
            java.util.List r1 = X.C06750aI.A17(r0)
            android.net.Uri r0 = android.net.Uri.parse(r5)
            android.net.Uri$Builder r3 = r0.buildUpon()
            java.util.Iterator r2 = r1.iterator()
        L_0x257d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x2595
            java.lang.Object r0 = r2.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            r3.appendQueryParameter(r1, r0)
            goto L_0x257d
        L_0x2595:
            android.net.Uri r0 = r3.build()
            java.lang.String r3 = X.C18190wL.A0n(r0)
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            X.0Oa r0 = r8.A01
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r0)
            java.lang.String r0 = "channels_sheet"
            X.C37412JrW.A08(r2, r1, r3, r0)
            goto L_0x2524
        L_0x25ae:
            java.lang.IllegalArgumentException r2 = X.C18190wL.A0a(r2)
            throw r2
        L_0x25b3:
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r2)
            throw r2
        L_0x25b8:
            r1 = -1190011459(0xffffffffb911ddbd, float:-1.3910882E-4)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.1ks r2 = (X.C24941ks) r2
            X.36U r6 = r2.A01
            java.lang.Object r0 = r0.A00
            X.48T r0 = (X.AnonymousClass48T) r0
            com.instagram.unifiedfeedback.api.graphql.FBReactorOfContentImpl r5 = r0.A00
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.FBReactorOfContentImpl$Node> r3 = com.instagram.unifiedfeedback.api.graphql.FBReactorOfContentImpl.Node.class
            java.lang.String r2 = "node"
            com.facebook.pando.TreeJNI r0 = r5.getTreeValue(r2, r3)
            r7 = 0
            if (r0 == 0) goto L_0x25da
            java.lang.String r7 = X.C18250wR.A0X(r0)
        L_0x25da:
            java.lang.String r4 = "Required value was null."
            if (r7 == 0) goto L_0x2625
            com.facebook.pando.TreeJNI r0 = r5.getTreeValue(r2, r3)
            if (r0 == 0) goto L_0x261d
            java.lang.String r8 = X.C18220wO.A0l(r0)
            if (r8 == 0) goto L_0x261d
            com.facebook.pando.TreeJNI r3 = r5.getTreeValue(r2, r3)
            if (r3 == 0) goto L_0x262d
            java.lang.Class<com.instagram.unifiedfeedback.api.graphql.FBReactorOfContentImpl$Node$ProfilePicture100> r2 = com.instagram.unifiedfeedback.api.graphql.FBReactorOfContentImpl.Node.ProfilePicture100.class
            java.lang.String r0 = "profile_picture(height:200,width:200)"
            com.facebook.pando.TreeJNI r0 = r3.getTreeValue(r0, r2)
            if (r0 == 0) goto L_0x262d
            java.lang.String r9 = X.C18250wR.A0Y(r0)
            if (r9 == 0) goto L_0x262d
            X.1dK r5 = r6.A00
            X.43y r3 = r5.A04
            if (r3 != 0) goto L_0x260d
            java.lang.String r0 = "navigationController"
            X.C04220Ms.A0E(r0)
            r2 = 0
            throw r2
        L_0x260d:
            X.BKU r6 = r5.A02
            if (r6 == 0) goto L_0x2618
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            r3.A00(r4, r5, r6, r7, r8, r9)
        L_0x2618:
            r0 = -1528598427(0xffffffffa4e37065, float:-9.863596E-17)
            goto L_0x33e4
        L_0x261d:
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r4)
            r0 = 1720343194(0x668a5a9a, float:3.2667894E23)
            goto L_0x2634
        L_0x2625:
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r4)
            r0 = -1370259827(0xffffffffae537e8d, float:-4.8088245E-11)
            goto L_0x2634
        L_0x262d:
            java.lang.IllegalStateException r2 = X.C18180wK.A0a(r4)
            r0 = 347584161(0x14b7b6a1, float:1.8550312E-26)
        L_0x2634:
            X.C14030oh.A0C(r0, r1)
            throw r2
        L_0x2638:
            r1 = -1356414871(0xffffffffaf26c069, float:-1.516597E-10)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A00
            X.3Ip r3 = (X.C58943Ip) r3
            java.lang.Object r2 = r0.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            X.4tC r0 = r3.A01
            if (r0 != 0) goto L_0x264f
            java.lang.String r7 = "delegate"
            goto L_0x2f03
        L_0x264f:
            r0.D9j(r2)
            r0 = -102017833(0xfffffffff9eb54d7, float:-1.5273881E35)
            goto L_0x33e4
        L_0x2657:
            r1 = -1052780206(0xffffffffc13fd952, float:-11.990557)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A00
            X.1dj r3 = (X.C23391dj) r3
            com.instagram.service.session.UserSession r2 = r3.A05
            X.49i r4 = X.C63073bQ.A00(r2)
            androidx.fragment.app.FragmentActivity r6 = r3.requireActivity()
            android.content.Context r5 = r3.requireContext()
            java.lang.Object r7 = r0.A01
            X.4se r7 = (X.C84164se) r7
            com.instagram.service.session.UserSession r8 = r3.A05
            java.lang.String r9 = "advanced_setting"
            r4.A0A(r5, r6, r7, r8, r9)
            r0 = -1441103125(0xffffffffaa1a82eb, float:-1.3723369E-13)
            goto L_0x33e4
        L_0x2680:
            r1 = -1660853220(0xffffffff9d01641c, float:-1.7124763E-21)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A01
            X.3ht r3 = (X.C63603ht) r3
            java.lang.Object r2 = r0.A00
            X.D3Q r2 = (X.D3Q) r2
            java.lang.Boolean r0 = X.C18180wK.A0Y()
            X.C63603ht.A01(r2, r3, r0)
            r0 = 674878490(0x2839d41a, float:1.0315555E-14)
            goto L_0x33e4
        L_0x269b:
            r1 = -275565950(0xffffffffef933282, float:-9.111071E28)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A01
            X.3ht r3 = (X.C63603ht) r3
            java.lang.Object r2 = r0.A00
            X.D3Q r2 = (X.D3Q) r2
            java.lang.Boolean r0 = X.C18180wK.A0X()
            X.C63603ht.A01(r2, r3, r0)
            r0 = 2094062339(0x7cd0db03, float:8.6755187E36)
            goto L_0x33e4
        L_0x26b6:
            r1 = -381100508(0xffffffffe948de24, float:-1.5177137E25)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A01
            X.3ht r3 = (X.C63603ht) r3
            java.lang.Object r2 = r0.A00
            X.D3Q r2 = (X.D3Q) r2
            java.lang.Boolean r0 = X.C18180wK.A0X()
            X.C63603ht.A02(r2, r3, r0)
            r0 = 1416338500(0x546b9c44, float:4.04775607E12)
            goto L_0x33e4
        L_0x26d1:
            r1 = 821786660(0x30fb7824, float:1.82968E-9)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A01
            X.3ht r3 = (X.C63603ht) r3
            java.lang.Object r2 = r0.A00
            X.D3Q r2 = (X.D3Q) r2
            java.lang.Boolean r0 = X.C18180wK.A0X()
            X.C63603ht.A01(r2, r3, r0)
            r0 = 1460775686(0x5711ab06, float:1.60163726E14)
            goto L_0x33e4
        L_0x26ec:
            r1 = -202076769(0xfffffffff3f48d9f, float:-3.8751003E31)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A01
            X.3ht r3 = (X.C63603ht) r3
            java.lang.Object r2 = r0.A00
            X.D3Q r2 = (X.D3Q) r2
            java.lang.Boolean r0 = X.C18180wK.A0Y()
            X.C63603ht.A01(r2, r3, r0)
            r0 = -1321757730(0xffffffffb13793de, float:-2.6714058E-9)
            goto L_0x33e4
        L_0x2707:
            r1 = -783555715(0xffffffffd14be37d, float:-5.4730936E10)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A01
            X.3ht r3 = (X.C63603ht) r3
            java.lang.Object r2 = r0.A00
            X.D3Q r2 = (X.D3Q) r2
            java.lang.Boolean r0 = X.C18180wK.A0Y()
            X.C63603ht.A02(r2, r3, r0)
            r0 = 891634631(0x352543c7, float:6.156592E-7)
            goto L_0x33e4
        L_0x2722:
            r1 = -1399694486(0xffffffffac925b6a, float:-4.1597186E-12)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A01
            X.3ht r3 = (X.C63603ht) r3
            java.lang.Object r2 = r0.A00
            X.D3Q r2 = (X.D3Q) r2
            java.lang.Boolean r0 = X.C18180wK.A0Y()
            X.C63603ht.A01(r2, r3, r0)
            r0 = 1096163253(0x41561fb5, float:13.382741)
            goto L_0x33e4
        L_0x273d:
            r1 = 1628842251(0x6116290b, float:1.7312307E20)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r5 = r0.A01
            X.1Yu r5 = (X.C22621Yu) r5
            java.lang.Object r0 = r0.A00
            X.252 r0 = (X.AnonymousClass252) r0
            X.C22621Yu.A01(r5, r0)
            boolean r0 = r5.A0E
            if (r0 != 0) goto L_0x276b
            X.0Oa r0 = r5.A0G
            X.0i6 r4 = X.AnonymousClass0wJ.A0U(r0)
            X.0TJ r0 = X.C18180wK.A0J(r4)
            r2 = 36325235662005252(0x810d9c00042404, double:3.035563530411131E-306)
            boolean r0 = X.C63803iN.A0E(r0, r4, r2)
            if (r0 == 0) goto L_0x276b
            X.C22621Yu.A00(r5)
        L_0x276b:
            r0 = -1975796935(0xffffffff8a3bbb39, float:-9.038935E-33)
            goto L_0x33e4
        L_0x2770:
            r1 = -1394622196(0xffffffffacdfc10c, float:-6.3594737E-12)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r7 = r0.A01
            X.37m r7 = (X.C565137m) r7
            X.22c r6 = X.C306022c.DEFAULT
            android.content.Context r3 = r7.A00
            r2 = 2131823350(0x7f110af6, float:1.9279497E38)
            java.lang.String r5 = X.AnonymousClass0wJ.A0k(r3, r2)
            r2 = 2131823349(0x7f110af5, float:1.9279495E38)
            java.lang.String r4 = r3.getString(r2)
            java.lang.String r2 = "acr_camera_roll_access_denied"
            X.3iD r3 = X.C63733iD.A01()
            r3.A0F(r6)
            r3.A0E = r2
            r3.A0A = r5
            r3.A0F = r4
            r2 = 10000(0x2710, float:1.4013E-41)
            r3.A01 = r2
            r2 = 1
            r3.A0G = r2
            X.C63733iD.A0A(r3)
            com.instagram.service.session.UserSession r5 = r7.A01
            X.1tl r2 = X.AnonymousClass3WS.A01(r5)
            r4 = 0
            android.content.SharedPreferences$Editor r3 = X.C28161tl.A02(r2)
            java.lang.String r2 = "has_allowed_acr_camera_roll_access"
            X.AnonymousClass0wJ.A13(r3, r2, r4)
            X.Dsp r4 = X.C25567Do3.A02(r5)
            X.D3P r3 = X.D3P.A0o
            X.D3Q r2 = X.D3Q.ACR_BROWSER
            X.C25831Dsp.A0d(r3, r2, r4)
            java.lang.Object r0 = r0.A00
            X.AnonymousClass3Z9.A01(r0)
            r0 = -1685895476(0xffffffff9b8346cc, float:-2.1717883E-22)
            goto L_0x33e4
        L_0x27cb:
            r1 = -665198663(0xffffffffd859dfb9, float:-9.5821962E14)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r8 = r0.A01
            X.37m r8 = (X.C565137m) r8
            X.22c r7 = X.C306022c.DEFAULT
            android.content.Context r6 = r8.A00
            r2 = 2131823348(0x7f110af4, float:1.9279493E38)
            java.lang.String r5 = X.AnonymousClass0wJ.A0k(r6, r2)
            r2 = 2131823347(0x7f110af3, float:1.9279491E38)
            java.lang.String r4 = r6.getString(r2)
            java.lang.String r2 = "acr_camera_roll_access_granted"
            X.3iD r3 = X.C63733iD.A01()
            r3.A0F(r7)
            r3.A0E = r2
            r3.A0A = r5
            r3.A0F = r4
            r2 = 10000(0x2710, float:1.4013E-41)
            r3.A01 = r2
            r4 = 1
            r3.A0G = r4
            X.C63733iD.A0A(r3)
            com.instagram.service.session.UserSession r5 = r8.A01
            android.content.SharedPreferences$Editor r3 = X.C28161tl.A03(r5)
            java.lang.String r2 = "has_allowed_acr_camera_roll_access"
            X.AnonymousClass0wJ.A13(r3, r2, r4)
            X.Dsp r4 = X.C25567Do3.A02(r5)
            X.D3P r3 = X.D3P.A09
            X.D3Q r2 = X.D3Q.ACR_BROWSER
            X.C25831Dsp.A0d(r3, r2, r4)
            android.content.Context r4 = r6.getApplicationContext()
            r2 = 18
            kotlin.jvm.internal.KtLambdaShape28S0200000_I2_12 r3 = new kotlin.jvm.internal.KtLambdaShape28S0200000_I2_12
            r3.<init>((int) r2, (java.lang.Object) r4, (java.lang.Object) r5)
            java.lang.Class<X.47r> r2 = X.C692847r.class
            java.lang.Object r3 = r5.A01(r2, r3)
            X.47r r3 = (X.C692847r) r3
            r2 = 0
            r3.A01(r2)
            java.lang.Object r0 = r0.A00
            X.AnonymousClass3Z9.A01(r0)
            r0 = -905375175(0xffffffffca091239, float:-2245774.2)
            goto L_0x33e4
        L_0x2838:
            r1 = 935561504(0x37c38920, float:2.3309665E-5)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.IcN r2 = (X.C34640IcN) r2
            java.lang.Object r0 = r0.A01
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.C49292r9.A00(r2, r0)
            r0 = 1334661048(0x4f8d4fb8, float:4.7416238E9)
            goto L_0x33e4
        L_0x284f:
            r1 = 878894325(0x3462dcf5, float:2.1128274E-7)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.IcN r2 = (X.C34640IcN) r2
            java.lang.Object r0 = r0.A01
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.C49292r9.A00(r2, r0)
            r0 = -1122007453(0xffffffffbd1f8663, float:-0.03894652)
            goto L_0x33e4
        L_0x2866:
            r1 = 12817111(0xc392d7, float:1.7960598E-38)
            int r3 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A01
            X.1gc r4 = (X.C23931gc) r4
            X.0nS r2 = r4.A03
            java.lang.String r1 = "comments_from_facebook_cta_click"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 424(0x1a8, float:5.94E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r7 = X.C18180wK.A0I(r2, r1)
            java.lang.Object r8 = r0.A00
            X.BKU r8 = (X.BKU) r8
            java.lang.String r0 = r8.A33()
            X.C04220Ms.A06(r0)
            long r0 = X.AnonymousClass4n2.A00(r0)
            X.C18210wN.A18(r7, r0)
            X.36V r0 = r4.A05
            android.content.SharedPreferences r6 = r0.A00
            java.lang.String r2 = "has_clicked_comments_from_fb_cta"
            r5 = 0
            boolean r0 = r6.getBoolean(r2, r5)
            java.lang.Boolean r1 = X.C18240wQ.A0X(r0)
            java.lang.String r0 = "is_nux"
            r7.A0Q(r0, r1)
            r7.Bb4()
            r9 = 1
            android.content.SharedPreferences$Editor r0 = r6.edit()
            X.AnonymousClass0wJ.A13(r0, r2, r9)
            com.instagram.service.session.UserSession r2 = r4.A04
            X.C04220Ms.A0B(r2, r5)
            r0 = 36
            kotlin.jvm.internal.KtLambdaShape132S0100000_I2_112 r1 = new kotlin.jvm.internal.KtLambdaShape132S0100000_I2_112
            r1.<init>(r2, r0)
            java.lang.Class<X.43y> r0 = X.C684743y.class
            java.lang.Object r7 = r2.A01(r0, r1)
            X.43y r7 = (X.C684743y) r7
            android.app.Activity r6 = r4.A00
            r0 = 48
            kotlin.jvm.internal.KtLambdaShape49S0100000_I2_29 r2 = new kotlin.jvm.internal.KtLambdaShape49S0100000_I2_29
            r2.<init>(r4, r0)
            X.1dM r5 = new X.1dM
            r5.<init>()
            com.instagram.service.session.UserSession r1 = r7.A02
            X.Jj9 r4 = X.C18210wN.A0L(r1)
            r0 = 1060320051(0x3f333333, float:0.7)
            r4.A00 = r0
            X.C18250wR.A1B(r4, r9)
            r4.A0Z = r9
            r4.A0I = r5
            com.facebook.redex.IDxDListenerShape104S0300000_1_I2 r0 = new com.facebook.redex.IDxDListenerShape104S0300000_1_I2
            r0.<init>(r9, r8, r7, r2)
            r4.A0J = r0
            android.os.Bundle r2 = X.AnonymousClass0wJ.A0E(r1)
            X.BKN r0 = r8.A0f
            java.lang.String r1 = r0.A4Y
            java.lang.String r0 = "CommentThreadFragment.MEDIA_ID"
            r2.putString(r0, r1)
            r5.setArguments(r2)
            X.Jqm r0 = r4.A00()
            r7.A00 = r0
            X.C37383Jqm.A00(r6, r5, r0)
            r0 = 763804903(0x2d86bce7, float:1.5317926E-11)
            goto L_0x2f8c
        L_0x2909:
            r1 = -1663963069(0xffffffff9cd1f043, float:-1.3892566E-21)
            int r3 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.9Ou r2 = (X.C156689Ou) r2
            X.Jqm r1 = r2.A07
            java.lang.Object r0 = r0.A00
            X.3Iu r0 = (X.C58963Iu) r0
            if (r1 == 0) goto L_0x293d
            X.3ag r4 = new X.3ag
            r4.<init>(r0, r1)
            X.0Oa r0 = r2.A0G
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.Jj9 r2 = X.C18210wN.A0L(r0)
            r0 = 1
            r2.A0e = r0
            X.Jqm r1 = r4.A02
            X.1cu r0 = r4.A04
            r1.A09(r0, r2)
            X.C62763ag.A01(r4)
        L_0x2938:
            r0 = -12414713(0xffffffffff429107, float:-2.5862326E38)
            goto L_0x2f8c
        L_0x293d:
            X.C62763ag.A00(r2, r0)
            goto L_0x2938
        L_0x2941:
            r1 = 1849818092(0x6e41fbec, float:1.500879E28)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r0 = r0.A01
            X.4vz r0 = (X.C85924vz) r0
            r0.CVG()
            r0 = -1257112964(0xffffffffb511fa7c, float:-5.438121E-7)
            goto L_0x33e4
        L_0x2954:
            r1 = -1607521081(0xffffffffa02f2cc7, float:-1.4837892E-19)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r0 = r0.A01
            X.4vz r0 = (X.C85924vz) r0
            r0.C8b()
            r0 = 1316897089(0x4e7e4141, float:1.06642234E9)
            goto L_0x33e4
        L_0x2967:
            r1 = 1248554777(0x4a6b6f19, float:3857350.2)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r0 = r0.A01
            X.4vz r0 = (X.C85924vz) r0
            r0.Bk3()
            r0 = 231618209(0xdce36a1, float:1.2708882E-30)
            goto L_0x33e4
        L_0x297a:
            r1 = -286207607(0xffffffffeef0d189, float:-3.7264857E28)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r0 = r0.A01
            X.4vz r0 = (X.C85924vz) r0
            r0.CAn()
            r0 = -495247358(0xffffffffe27b2002, float:-1.1581098E21)
            goto L_0x33e4
        L_0x298d:
            r1 = -145014246(0xfffffffff75b421a, float:-4.4470848E33)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r5 = r0.A01
            X.IbL r5 = (X.C34590IbL) r5
            X.K2b r4 = r5.A05
            if (r4 == 0) goto L_0x2a77
            X.Iu2 r3 = r5.A04
            if (r3 != 0) goto L_0x29a4
            java.lang.String r7 = "currentStep"
            goto L_0x2f03
        L_0x29a4:
            java.lang.String r2 = "messaging_app_education_bottom_sheet_ok_button"
            r4.A0I(r3, r2)
            r5.A05()
            java.lang.Object r0 = r0.A00
            X.DrH r0 = (X.C25745DrH) r0
            if (r0 == 0) goto L_0x29b5
            r0.A0C()
        L_0x29b5:
            r0 = 98037456(0x5d7eed0, float:2.0306229E-35)
            goto L_0x33e4
        L_0x29ba:
            r1 = -1491675327(0xffffffffa716d741, float:-2.0933371E-15)
            int r7 = X.C14030oh.A05(r1)
            java.lang.Object r6 = r0.A01
            X.1bq r6 = (X.C23051bq) r6
            X.Jjm r5 = r6.A01
            r4 = 0
            if (r5 == 0) goto L_0x2a39
            X.Iu2 r1 = X.C35394Iu2.A12
            java.lang.String r3 = r1.toString()
            java.lang.String r2 = r6.A05
            if (r2 == 0) goto L_0x2a3c
            java.lang.String r1 = "primary_action_button"
            r5.A09(r3, r1, r2, r4)
            java.lang.Object r0 = r0.A00
            com.instagram.business.promote.model.PromoteButtonAction r0 = (com.instagram.business.promote.model.PromoteButtonAction) r0
            com.instagram.business.promote.model.PromoteButtonActionType r1 = r0.A00
            if (r1 == 0) goto L_0x29f2
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x29ec
            X.C23051bq.A00(r6, r1, r0)
            r0 = -1241137247(0xffffffffb605bfa1, float:-1.9930087E-6)
            goto L_0x2a29
        L_0x29ec:
            java.lang.String r0 = "link"
            X.C04220Ms.A0E(r0)
            throw r4
        L_0x29f2:
            java.lang.String r0 = "type"
            X.C04220Ms.A0E(r0)
            throw r4
        L_0x29f8:
            r1 = 2023446868(0x789b5954, float:2.5206806E34)
            int r7 = X.C14030oh.A05(r1)
            java.lang.Object r6 = r0.A01
            X.1bq r6 = (X.C23051bq) r6
            X.Jjm r5 = r6.A01
            r4 = 0
            if (r5 == 0) goto L_0x2a39
            X.Iu2 r1 = X.C35394Iu2.A12
            java.lang.String r3 = r1.toString()
            java.lang.String r2 = r6.A05
            if (r2 == 0) goto L_0x2a3c
            java.lang.String r1 = "primary_action_button"
            r5.A09(r3, r1, r2, r4)
            java.lang.Object r0 = r0.A00
            com.instagram.business.promote.model.PromoteButtonAction r0 = (com.instagram.business.promote.model.PromoteButtonAction) r0
            com.instagram.business.promote.model.PromoteButtonActionType r1 = r0.A00
            if (r1 == 0) goto L_0x2a33
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x2a2d
            X.C23051bq.A00(r6, r1, r0)
            r0 = 1932696080(0x73329a10, float:1.4150293E31)
        L_0x2a29:
            X.C14030oh.A0C(r0, r7)
            return
        L_0x2a2d:
            java.lang.String r0 = "link"
            X.C04220Ms.A0E(r0)
            throw r4
        L_0x2a33:
            java.lang.String r0 = "type"
            X.C04220Ms.A0E(r0)
            throw r4
        L_0x2a39:
            java.lang.String r0 = "adsManagerLogger"
            goto L_0x2a3e
        L_0x2a3c:
            java.lang.String r0 = "mediaId"
        L_0x2a3e:
            X.C04220Ms.A0E(r0)
            throw r4
        L_0x2a42:
            r1 = 956818665(0x3907e4e9, float:1.2959879E-4)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A00
            android.view.View r3 = (android.view.View) r3
            r2 = 0
            r3.setClickable(r2)
            java.lang.Object r4 = r0.A01
            X.IcH r4 = (X.C34637IcH) r4
            X.K2b r3 = r4.A00
            if (r3 == 0) goto L_0x2a77
            X.Iu2 r2 = X.C35394Iu2.A0U
            java.lang.String r0 = "use_credit_button"
            r3.A0I(r2, r0)
            androidx.fragment.app.Fragment r2 = r4.requireParentFragment()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.igds.components.bottomsheet.BottomSheetFragment"
            X.C04220Ms.A0C(r2, r0)
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r2 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r2
            X.Jqm r0 = r2.A02
            if (r0 == 0) goto L_0x2a72
            r0.A06()
        L_0x2a72:
            r0 = 1955799454(0x7493219e, float:9.325555E31)
            goto L_0x33e4
        L_0x2a77:
            java.lang.String r7 = "promoteLogger"
            goto L_0x2f03
        L_0x2a7b:
            r1 = -1819466682(0xffffffff938d2446, float:-3.5629172E-27)
            int r1 = X.C14030oh.A05(r1)
            X.C62883b4.A03()
            X.IbM r3 = new X.IbM
            r3.<init>()
            java.lang.Object r2 = r0.A00
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            java.lang.Object r0 = r0.A01
            com.instagram.business.promote.model.PromoteData r0 = (com.instagram.business.promote.model.PromoteData) r0
            com.instagram.service.session.UserSession r0 = r0.A0v
            X.AnonymousClass0wJ.A19(r3, r2, r0)
            r0 = 219679769(0xd180c19, float:4.685318E-31)
            goto L_0x33e4
        L_0x2a9c:
            r1 = 544421596(0x207336dc, float:2.0601052E-19)
            int r1 = X.C14030oh.A05(r1)
            X.C62883b4.A03()
            java.lang.Object r2 = r0.A01
            com.instagram.business.promote.model.PromoteData r2 = (com.instagram.business.promote.model.PromoteData) r2
            com.instagram.service.session.UserSession r4 = r2.A0v
            X.C04220Ms.A05(r4)
            r3 = 0
            r2 = 6
            androidx.fragment.app.Fragment r3 = X.C24018D5t.A00(r4, r2, r3, r3)
            java.lang.Object r0 = r0.A00
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.Drz r2 = X.C18180wK.A0Q(r0, r4)
            r2.A03 = r3
            X.Iu2 r0 = X.C35394Iu2.A0q
            java.lang.String r0 = r0.toString()
            r2.A07 = r0
            r2.A05()
            r0 = -936257410(0xffffffffc831d87e, float:-182113.97)
            goto L_0x33e4
        L_0x2acf:
            r1 = -1110392492(0xffffffffbdd0c154, float:-0.101931244)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A01
            X.3Id r3 = (X.C58923Id) r3
            r2 = 1
            r3.A04(r2)
            java.lang.Object r0 = r0.A00
            X.4pK r0 = (X.C82254pK) r0
            r0.BjA()
            r0 = 1756905767(0x68b84127, float:6.960938E24)
            goto L_0x33e4
        L_0x2aea:
            r1 = 277913235(0x10909e93, float:5.704231E-29)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r5 = r0.A01
            X.Ibt r5 = (X.C34620Ibt) r5
            java.lang.Object r0 = r0.A00
            X.ItV r0 = (X.C35367ItV) r0
            java.lang.String r4 = X.C37397Jr6.A01(r0)
            r3 = 0
            java.lang.String r2 = "highlights_hub_reels"
            java.lang.String r0 = "ads_manager_highlights_hub"
            X.C34620Ibt.A0B(r5, r3, r2, r0, r4)
            r0 = -1359318990(0xffffffffaefa7032, float:-1.1388614E-10)
            goto L_0x33e4
        L_0x2b0a:
            r1 = 1398869384(0x53610d88, float:9.6659466E11)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A01
            X.IbB r4 = (X.C34583IbB) r4
            X.Jjm r3 = r4.A00
            if (r3 != 0) goto L_0x2b1d
            java.lang.String r7 = "adsManagerLogger"
            goto L_0x2f03
        L_0x2b1d:
            java.lang.Object r0 = r0.A00
            X.ItV r0 = (X.C35367ItV) r0
            java.lang.String r2 = X.C37397Jr6.A01(r0)
            r7 = 0
            java.lang.String r0 = "ads_manager_highlights_hub"
            r3.A09(r0, r2, r7, r7)
            X.JjS r3 = X.AnonymousClass2K0.A00()
            X.0Oa r0 = r4.A0A
            com.instagram.service.session.UserSession r5 = X.AnonymousClass0wJ.A0X(r0)
            androidx.fragment.app.FragmentActivity r4 = r4.requireActivity()
            java.lang.String r6 = "highlights_hub_reels"
            r8 = 0
            r3.A04(r4, r5, r6, r7, r8)
            r0 = -561459323(0xffffffffde88cf85, float:-4.9291222E18)
            goto L_0x33e4
        L_0x2b44:
            r1 = 139012816(0x8492ad0, float:6.0536563E-34)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A00
            X.4nc r3 = (X.C81334nc) r3
            java.lang.Object r2 = r0.A01
            X.3IK r2 = (X.AnonymousClass3IK) r2
            X.1fO r3 = (X.AnonymousClass1fO) r3
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x2b5e
            X.4sY r0 = r3.A04
            r0.CA7(r2)
        L_0x2b5e:
            r0 = -844325782(0xffffffffcdac9c6a, float:-3.61991488E8)
            goto L_0x33e4
        L_0x2b63:
            r1 = 722287464(0x2b0d3b68, float:5.0175706E-13)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A00
            X.1fW r3 = (X.AnonymousClass1fW) r3
            java.lang.Object r4 = r0.A01
            X.3IK r4 = (X.AnonymousClass3IK) r4
            r3.A01(r4)
            com.instagram.business.fragment.FBPageListWithPreviewFragment r5 = r3.A01
            X.0i6 r2 = r5.A07
            boolean r0 = r2 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x2be7
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r2)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r0)
            boolean r0 = r4.A00(r0)
            if (r0 == 0) goto L_0x2be7
            java.lang.String r2 = r4.A09
            r2.getClass()
            android.content.Context r0 = r5.requireContext()
            X.C67353zP.A06(r0, r2)
        L_0x2b97:
            X.42s r6 = r5.A04
            X.3IK r0 = r6.A04
            if (r0 != 0) goto L_0x2be4
            r0 = 0
        L_0x2b9e:
            java.lang.String r5 = r4.A08
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()
            java.lang.String r2 = "prev_page_id"
            r4.put(r2, r0)
            java.lang.String r0 = "current_page_id"
            r4.put(r0, r5)
            android.os.Bundle r4 = X.AnonymousClass3z8.A02(r4)
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = r6.A03
            if (r0 == 0) goto L_0x2bbf
            java.lang.String r2 = r0.A07
            if (r2 == 0) goto L_0x2bbf
            java.lang.String r0 = "prior_step"
            r4.putString(r0, r2)
        L_0x2bbf:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r6.A01
            if (r0 == 0) goto L_0x2bdc
            java.util.HashMap r11 = X.AnonymousClass0wJ.A0y()
            X.C18250wR.A1E(r5, r11)
            java.lang.String r5 = "page_selection"
            r8 = 0
            java.lang.String r6 = r6.A08
            java.lang.String r7 = "page"
            X.JrQ r4 = new X.JrQ
            r9 = r8
            r10 = r8
            r12 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.Be5(r4)
        L_0x2bdc:
            r3.A00()
            r0 = 1435874892(0x5595b64c, float:2.0576274E13)
            goto L_0x33e4
        L_0x2be4:
            java.lang.String r0 = r0.A08
            goto L_0x2b9e
        L_0x2be7:
            X.3IK r2 = r5.A05
            r5.A06 = r2
            r5.A05 = r4
            X.42s r0 = r5.A04
            r0.A04 = r4
            r0.A05 = r2
            X.1fW r0 = r5.A00
            r0.A01(r4)
            r0.A00()
            goto L_0x2b97
        L_0x2bfc:
            r1 = 945130623(0x38558c7f, float:5.0914005E-5)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.1df r2 = (X.C23371df) r2
            java.lang.Object r4 = r0.A00
            X.386 r4 = (X.AnonymousClass386) r4
            androidx.fragment.app.Fragment r6 = r2.getTargetFragment()
            X.1c6 r6 = (X.AnonymousClass1c6) r6
            java.lang.String r9 = r4.A01
            java.lang.String r10 = r4.A00
            android.widget.EditText r0 = r6.A00
            java.lang.String r8 = X.AnonymousClass0wJ.A0n(r0)
            android.widget.TextView r0 = r6.A01
            java.lang.String r11 = X.C18210wN.A0c(r0)
            android.content.Context r5 = r6.getContext()
            android.widget.EditText r0 = r6.A00
            java.lang.String r3 = X.AnonymousClass0wJ.A0n(r0)
            android.widget.TextView r0 = r6.A01
            java.lang.String r0 = X.C18210wN.A0c(r0)
            java.lang.String r12 = X.C67353zP.A04(r5, r3, r0, r9)
            com.instagram.model.business.Address r7 = new com.instagram.model.business.Address
            r7.<init>(r8, r9, r10, r11, r12)
            r6.A04 = r7
            X.AnonymousClass1c6.A02(r6)
            r0 = 1
            r2.A06 = r0
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r2.A02
            if (r0 == 0) goto L_0x2c64
            java.util.HashMap r10 = X.AnonymousClass0wJ.A0y()
            java.lang.String r3 = r4.A01
            java.lang.String r0 = "city"
            r10.put(r0, r3)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r2.A02
            java.lang.String r4 = "page_import_info_city_town"
            r6 = 0
            java.lang.String r5 = r2.A05
            X.JrQ r3 = new X.JrQ
            r7 = r6
            r8 = r6
            r9 = r6
            r11 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.BcE(r3)
        L_0x2c64:
            X.C18180wK.A12(r2)
            r0 = 1217638368(0x4893afe0, float:302463.0)
            goto L_0x33e4
        L_0x2c6c:
            r1 = -1411228579(0xffffffffabe25c5d, float:-1.6083902E-12)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            com.instagram.business.fragment.CategorySearchFragment r2 = (com.instagram.business.fragment.CategorySearchFragment) r2
            java.lang.Object r0 = r0.A00
            X.48S r0 = (X.AnonymousClass48S) r0
            r2.A0M(r0)
            r0 = 1074982044(0x4012ec9c, float:2.2956915)
            goto L_0x33e4
        L_0x2c83:
            r1 = 376600636(0x1672783c, float:1.9586544E-25)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.1ki r2 = (X.C24841ki) r2
            com.instagram.business.fragment.OnboardingCheckListFragment r4 = r2.A00
            java.lang.Object r0 = r0.A00
            X.48A r0 = (X.AnonymousClass48A) r0
            X.3HW r6 = r0.A00
            java.lang.String r0 = r6.A05
            java.lang.Integer r5 = X.AnonymousClass2K7.A00(r0)
            java.lang.String r8 = r6.A02
            java.lang.String r7 = r6.A01
            int r0 = r5.intValue()
            r13 = 0
            switch(r0) {
                case 0: goto L_0x2d81;
                case 1: goto L_0x2d88;
                case 2: goto L_0x2d36;
                case 3: goto L_0x2d09;
                case 4: goto L_0x2d4e;
                case 5: goto L_0x2d59;
                case 6: goto L_0x2ca8;
                case 7: goto L_0x2e39;
                case 8: goto L_0x2ca8;
                case 9: goto L_0x2e49;
                case 10: goto L_0x2e40;
                default: goto L_0x2ca8;
            }
        L_0x2ca8:
            r10 = r13
        L_0x2ca9:
            X.3IJ r2 = r4.A04
            java.lang.String r0 = r6.A05
            java.lang.String r0 = r0.toLowerCase()
            r2.A01(r0)
            if (r10 == 0) goto L_0x2d02
            android.os.Bundle r6 = r10.mArguments
            if (r6 != 0) goto L_0x2cbe
            android.os.Bundle r6 = X.C18180wK.A06()
        L_0x2cbe:
            android.os.Bundle r0 = X.C18250wR.A07(r4)
            r6.putAll(r0)
            X.3IJ r0 = r4.A04
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x2d07
            java.util.Iterator r3 = r0.iterator()
        L_0x2ccf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x2d07
            java.lang.Object r2 = r3.next()
            X.3HW r2 = (X.AnonymousClass3HW) r2
            java.lang.String r0 = r2.A05
            X.C04220Ms.A06(r0)
            java.lang.Integer r0 = X.AnonymousClass2K7.A00(r0)
            if (r0 != r5) goto L_0x2ccf
            java.lang.String r2 = r2.A03
            java.lang.String r0 = "complete"
            boolean r2 = r0.equals(r2)
        L_0x2cee:
            java.lang.String r0 = "ARG_CHECKLIST_ITEM_COMPLETED"
            r6.putBoolean(r0, r2)
            r10.setArguments(r6)
            X.3Db r9 = r4.A01
            androidx.fragment.app.FragmentActivity r11 = r4.getActivity()
            r14 = 1
            X.33f r12 = r4.A03
            r9.A00(r10, r11, r12, r13, r14)
        L_0x2d02:
            r0 = -990054362(0xffffffffc4fcf826, float:-2023.7546)
            goto L_0x33e4
        L_0x2d07:
            r2 = 0
            goto L_0x2cee
        L_0x2d09:
            X.AhA r3 = X.AnonymousClass3LM.A00()
            com.instagram.service.session.UserSession r2 = r4.A07
            X.9zz r0 = X.C171799zz.A2n
            X.AfR r0 = r3.A04(r0, r2)
            r2 = 1
            r0.A0g = r2
            android.os.Bundle r8 = r0.A00()
            java.lang.String r0 = "modal_dismiss_on_cancel"
            r8.putBoolean(r0, r2)
            com.instagram.service.session.UserSession r7 = r4.A07
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r3 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            java.lang.String r0 = "clips_camera"
            X.3iT r2 = X.C63863iT.A03(r2, r8, r7, r3, r0)
            r0 = 102(0x66, float:1.43E-43)
            r2.A0J(r4, r0)
            goto L_0x2ca8
        L_0x2d36:
            X.1bi r10 = new X.1bi
            r10.<init>()
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r0 = "ARG_TITLE"
            r2.putString(r0, r8)
            java.lang.String r0 = "ARG_SUB_TITLE"
            r2.putString(r0, r7)
            r10.setArguments(r2)
            goto L_0x2ca9
        L_0x2d4e:
            com.instagram.business.fragment.InviteFollowersV2Fragment r10 = new com.instagram.business.fragment.InviteFollowersV2Fragment
            r10.<init>()
            android.os.Bundle r2 = X.C18180wK.A06()
            goto L_0x2e2a
        L_0x2d59:
            X.3BH r0 = r6.A00
            if (r0 == 0) goto L_0x2ca8
            java.lang.String r0 = r0.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x2ca8
            java.lang.String r7 = r4.A08
            X.3BH r0 = r6.A00
            java.lang.String r3 = r0.A02
            X.1bf r10 = new X.1bf
            r10.<init>()
            android.os.Bundle r2 = X.C18180wK.A06()
            X.C18210wN.A0x(r2, r7)
            java.lang.String r0 = "ARG_TARGET_USER_ID"
            r2.putString(r0, r3)
            r10.setArguments(r2)
            goto L_0x2ca9
        L_0x2d81:
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r10 = new com.instagram.profile.edit.fragment.CompleteYourProfileFragment
            r10.<init>()
            goto L_0x2ca9
        L_0x2d88:
            com.instagram.service.session.UserSession r9 = r4.A07
            r0 = 0
            X.C04220Ms.A0B(r9, r0)
            boolean r0 = X.C63483hZ.A05(r9)
            if (r0 == 0) goto L_0x2da1
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            r2 = 36318458203345350(0x810772000011c6, double:3.0312774382639735E-306)
            boolean r0 = X.C63803iN.A0E(r0, r9, r2)
            if (r0 != 0) goto L_0x2db4
        L_0x2da1:
            boolean r0 = X.C63483hZ.A06(r9)
            if (r0 == 0) goto L_0x2df3
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            r2 = 36318462498312648(0x810773000011c8, double:3.031280154418587E-306)
            boolean r0 = X.C63803iN.A0E(r0, r9, r2)
            if (r0 == 0) goto L_0x2df3
        L_0x2db4:
            android.net.Uri$Builder r2 = X.C18220wO.A0D()
            java.lang.String r0 = "pro_inspiration"
            android.net.Uri$Builder r3 = r2.authority(r0)
            java.lang.String r2 = "entry_point"
            java.lang.String r0 = "onboarding_checklist"
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r2, r0)
            java.lang.String r2 = "should_show_promotion_content"
            java.lang.String r0 = "true"
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r2, r0)
            java.lang.String r2 = X.C18180wK.A0e()
            java.lang.String r0 = "dummy_param"
            android.net.Uri r5 = X.C18220wO.A0F(r3, r0, r2)
            X.3Yi r3 = X.C62333Yi.A01()
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            android.content.Intent r0 = r3.A03(r2, r0)
            android.content.Intent r2 = r0.setData(r5)
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            X.C10650ih.A02(r0, r2)
            goto L_0x2d02
        L_0x2df3:
            java.lang.String r9 = r4.A08
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x2e06
            android.content.Context r2 = r4.requireContext()
            r0 = 2131829573(0x7f112345, float:1.9292119E38)
            java.lang.String r8 = r2.getString(r0)
        L_0x2e06:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x2e17
            android.content.Context r2 = r4.requireContext()
            r0 = 2131829572(0x7f112344, float:1.9292117E38)
            java.lang.String r7 = r2.getString(r0)
        L_0x2e17:
            java.lang.String r3 = "onboarding_checklist_render"
            com.instagram.business.fragment.SuggestBusinessFragment r10 = new com.instagram.business.fragment.SuggestBusinessFragment
            r10.<init>()
            android.os.Bundle r2 = X.C18180wK.A06()
            X.C18210wN.A0x(r2, r9)
            java.lang.String r0 = "suggested_business_fetch_entry_point"
            r2.putString(r0, r3)
        L_0x2e2a:
            java.lang.String r0 = "ARG_TITLE"
            r2.putString(r0, r8)
            java.lang.String r0 = "ARG_SUB_TITLE"
            r2.putString(r0, r7)
            r10.setArguments(r2)
            goto L_0x2ca9
        L_0x2e39:
            X.1bz r10 = new X.1bz
            r10.<init>()
            goto L_0x2ca9
        L_0x2e40:
            X.1bh r10 = new X.1bh
            r10.<init>()
            java.lang.String r13 = "BusinessObjectives"
            goto L_0x2ca9
        L_0x2e49:
            X.JjS r9 = X.AnonymousClass2K0.A00()
            com.instagram.service.session.UserSession r11 = r4.A07
            androidx.fragment.app.FragmentActivity r10 = r4.requireActivity()
            r14 = 0
            java.lang.String r12 = "onboarding_checklist"
            r9.A04(r10, r11, r12, r13, r14)
            goto L_0x2ca8
        L_0x2e5b:
            r1 = 1282016107(0x4c6a036b, float:6.1345196E7)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r5 = r0.A01
            X.11L r5 = (X.AnonymousClass11L) r5
            X.3In r4 = r5.A06
            java.lang.Integer r3 = X.AnonymousClass006.A0N
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            r4.A05(r3, r2)
            java.lang.Object r0 = r0.A00
            X.BKU r0 = (X.BKU) r0
            X.BKN r0 = r0.A0f
            java.lang.String r4 = r0.A4Y
            X.C04220Ms.A06(r4)
            android.content.Context r3 = r5.A04
            X.0kW r0 = r5.A07
            java.lang.String r2 = X.C18230wP.A0n(r0)
            java.lang.String r0 = "HAMBURGER"
            X.Asv r0 = X.C62363Zb.A00(r3, r4, r2, r0)
            androidx.fragment.app.Fragment r3 = r0.A02()
            androidx.fragment.app.FragmentActivity r2 = r5.A05
            com.instagram.service.session.UserSession r0 = r5.A08
            X.Drz r0 = X.AnonymousClass0wJ.A0Q(r2, r0)
            r0.A03 = r3
            r0.A05()
            r0 = -1629514039(0xffffffff9edf96c9, float:-2.3673407E-20)
            goto L_0x33e4
        L_0x2e9e:
            r1 = -1211749485(0xffffffffb7c62b93, float:-2.362373E-5)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r6 = r0.A01
            X.11L r6 = (X.AnonymousClass11L) r6
            X.3In r3 = r6.A06
            java.lang.Integer r2 = X.AnonymousClass006.A0N
            r3.A05(r2, r2)
            androidx.fragment.app.FragmentActivity r5 = r6.A05
            android.content.Context r4 = r6.A04
            com.instagram.service.session.UserSession r3 = r6.A08
            X.0kW r2 = r6.A07
            java.lang.Object r0 = r0.A00
            X.BKU r0 = (X.BKU) r0
            X.C62363Zb.A02(r4, r5, r2, r0, r3)
            r0 = 11278491(0xac189b, float:1.5804532E-38)
            goto L_0x33e4
        L_0x2ec4:
            r1 = -2050879058(0xffffffff85c211ae, float:-1.8250167E-35)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.1fK r2 = (X.AnonymousClass1fK) r2
            com.instagram.business.fragment.CategorySearchFragment r2 = r2.A02
            java.lang.Object r0 = r0.A01
            X.48S r0 = (X.AnonymousClass48S) r0
            r2.A0M(r0)
            r0 = 885513829(0x34c7de65, float:3.7228452E-7)
            goto L_0x33e4
        L_0x2edd:
            r1 = 494429386(0x1d7864ca, float:3.2874633E-21)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A01
            X.1a5 r3 = (X.AnonymousClass1a5) r3
            java.lang.Object r2 = r0.A00
            X.3GE r2 = (X.AnonymousClass3GE) r2
            r0 = 0
            r2.A04 = r0
            r0 = 1
            r2.A08 = r0
            com.instagram.bugreporter.BugReportComposerViewModel r0 = r2.A00()
            r3.A01 = r0
            X.3IL r2 = new X.3IL
            r2.<init>()
            com.instagram.bugreporter.BugReport r0 = r3.A00
            if (r0 != 0) goto L_0x2f08
            java.lang.String r7 = "bugReport"
        L_0x2f03:
            X.C04220Ms.A0E(r7)
            r0 = 0
            throw r0
        L_0x2f08:
            r2.A02(r0)
            com.instagram.bugreporter.BugReport r0 = r2.A00()
            r3.A00 = r0
            X.AnonymousClass1a5.A00(r3)
            r0 = -1636003113(0xffffffff9e7c92d7, float:-1.3371135E-20)
            goto L_0x33e4
        L_0x2f19:
            r1 = -65159720(0xfffffffffc1dbdd8, float:-3.2761644E36)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A01
            X.1a5 r3 = (X.AnonymousClass1a5) r3
            java.lang.Object r2 = r0.A00
            X.3GE r2 = (X.AnonymousClass3GE) r2
            r0 = 1
            r2.A04 = r0
            r2.A08 = r0
            com.instagram.bugreporter.BugReportComposerViewModel r0 = r2.A00()
            r3.A01 = r0
            X.AnonymousClass1a5.A00(r3)
            r0 = 1007309876(0x3c0a5434, float:0.008442927)
            goto L_0x33e4
        L_0x2f3b:
            r1 = 1526409044(0x5afb2754, float:3.53467304E16)
            int r3 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.3EX r2 = (X.AnonymousClass3EX) r2
            X.29m r1 = X.C319229m.DROPOUT_SEVERITY
            r2.A00(r1)
            X.GVD r2 = X.C25745DrH.A00
            java.lang.Object r1 = r0.A01
            com.instagram.bugreporter.BugReportSevereSwitchView r1 = (com.instagram.bugreporter.BugReportSevereSwitchView) r1
            android.app.Activity r0 = com.instagram.bugreporter.BugReportSevereSwitchView.A00(r1)
            X.C18200wM.A12(r0, r2)
            com.instagram.igds.components.switchbutton.IgSwitch r1 = r1.A00
            if (r1 == 0) goto L_0x2f60
            r0 = 0
            r1.setChecked(r0)
        L_0x2f60:
            r0 = -1174888920(0xffffffffb9f89e28, float:-4.7420082E-4)
            goto L_0x2f8c
        L_0x2f64:
            r1 = -1263699232(0xffffffffb4ad7ae0, float:-3.2313164E-7)
            int r3 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.3EX r2 = (X.AnonymousClass3EX) r2
            X.29m r1 = X.C319229m.CONFIRM_SEVERITY
            r2.A00(r1)
            X.GVD r2 = X.C25745DrH.A00
            java.lang.Object r1 = r0.A01
            com.instagram.bugreporter.BugReportSevereSwitchView r1 = (com.instagram.bugreporter.BugReportSevereSwitchView) r1
            android.app.Activity r0 = com.instagram.bugreporter.BugReportSevereSwitchView.A00(r1)
            X.C18200wM.A12(r0, r2)
            com.instagram.igds.components.switchbutton.IgSwitch r1 = r1.A00
            if (r1 == 0) goto L_0x2f89
            r0 = 1
            r1.setChecked(r0)
        L_0x2f89:
            r0 = 1290751788(0x4cef4f2c, float:1.25466976E8)
        L_0x2f8c:
            X.C14030oh.A0C(r0, r3)
            return
        L_0x2f90:
            r1 = 1922086350(0x7290b5ce, float:5.7325606E30)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.58F r2 = (X.AnonymousClass58F) r2
            java.lang.Object r0 = r0.A00
            X.2Jg r0 = (X.C34362Jg) r0
            X.AnonymousClass58F.A02(r0, r2)
            r0 = 350623376(0x14e61690, float:2.3232964E-26)
            goto L_0x33e4
        L_0x2fa7:
            r1 = 527471471(0x1f70936f, float:5.094393E-20)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.0A8 r2 = (X.AnonymousClass0A8) r2
            X.0YY r2 = (X.AnonymousClass0YY) r2
            java.lang.Object r0 = r0.A01
            r2.invoke(r0)
            r0 = 2142397571(0x7fb26483, float:NaN)
            goto L_0x33e4
        L_0x2fbe:
            r1 = -1321647509(0xffffffffb139426b, float:-2.6958797E-9)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.0A8 r2 = (X.AnonymousClass0A8) r2
            X.0YY r2 = (X.AnonymousClass0YY) r2
            java.lang.Object r0 = r0.A01
            r2.invoke(r0)
            r0 = -308246160(0xffffffffeda08970, float:-6.210469E27)
            goto L_0x33e4
        L_0x2fd5:
            r1 = -576082517(0xffffffffdda9adab, float:-1.52832707E18)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.0A8 r2 = (X.AnonymousClass0A8) r2
            X.0YY r2 = (X.AnonymousClass0YY) r2
            java.lang.Object r0 = r0.A01
            r2.invoke(r0)
            r0 = 656233228(0x271d530c, float:2.1833147E-15)
            goto L_0x33e4
        L_0x2fec:
            r1 = 1950545521(0x7442f671, float:6.1786134E31)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.17Q r2 = (X.AnonymousClass17Q) r2
            X.6jp r3 = r2.A01
            if (r3 == 0) goto L_0x3003
            java.lang.Object r2 = r0.A01
            X.1c7 r2 = (X.AnonymousClass1c7) r2
            r0 = 0
            X.AnonymousClass1c7.A01(r2, r3, r0)
        L_0x3003:
            r0 = -1720045724(0xffffffff997a2f64, float:-1.29342675E-23)
            goto L_0x33e4
        L_0x3008:
            r1 = -1219945498(0xffffffffb7491be6, float:-1.1987029E-5)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A01
            X.1c7 r3 = (X.AnonymousClass1c7) r3
            java.lang.Object r2 = r0.A00
            X.6jp r2 = (X.C109326jp) r2
            r0 = 1
            X.AnonymousClass1c7.A01(r3, r2, r0)
            r0 = 995326356(0x3b537994, float:0.003226851)
            goto L_0x33e4
        L_0x3020:
            java.lang.Object r3 = r0.A00
            X.1wa r3 = (X.C29031wa) r3
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            r5 = 0
            java.lang.Integer r13 = X.C66883yU.A0F
            java.lang.Integer r14 = X.AnonymousClass006.A00
            java.lang.Integer r11 = X.AnonymousClass006.A01
            r1 = 1
            com.facebook.redex.IDxCRunnableShape615S0100000_1_I2 r0 = new com.facebook.redex.IDxCRunnableShape615S0100000_1_I2
            r0.<init>((android.content.Context) r2, (int) r1)
            com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenCallerDismissCallback r6 = new com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenCallerDismissCallback
            r6.<init>(r0)
            r17 = 0
            X.3yU r4 = new X.3yU
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r12 = r11
            r15 = r5
            r16 = r5
            r18 = r17
            r19 = r17
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.C29031wa.A0B(r4, r3)
            return
        L_0x3051:
            java.lang.Object r1 = r0.A00
            X.1wa r1 = (X.C29031wa) r1
            java.lang.Object r4 = r0.A01
            android.content.Context r4 = (android.content.Context) r4
            com.instagram.service.session.UserSession r3 = r1.A00
            X.29q r2 = X.C319629q.UNKNOWN
            r1 = 0
            r0 = 1
            goto L_0x3071
        L_0x3060:
            java.lang.Object r1 = r0.A00
            X.1wa r1 = (X.C29031wa) r1
            java.lang.Object r4 = r0.A01
            android.content.Context r4 = (android.content.Context) r4
            com.instagram.service.session.UserSession r3 = r1.A00
            X.29q r2 = X.C319629q.UNKNOWN
            r1 = 0
            boolean r0 = X.C63793iM.A06()
        L_0x3071:
            X.C67313zL.A02(r4, r2, r3, r1, r0)
            return
        L_0x3075:
            r1 = -2041860568(0xffffffff864bae28, float:-3.8308006E-35)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A01
            X.7h3 r4 = (X.C127397h3) r4
            r3 = 35
            X.6jp r2 = r4.A0L(r3)
            if (r2 == 0) goto L_0x3093
            java.lang.Object r2 = r0.A00
            X.1c8 r2 = (X.AnonymousClass1c8) r2
            X.6jp r0 = r4.A0L(r3)
            X.AnonymousClass1c8.A03(r2, r4, r0)
        L_0x3093:
            r0 = 147784971(0x8cf050b, float:1.2459545E-33)
            goto L_0x33e4
        L_0x3098:
            r1 = -207188409(0xfffffffff3a68e47, float:-2.6391815E31)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A01
            X.7h3 r4 = (X.C127397h3) r4
            r3 = 35
            X.6jp r2 = r4.A0L(r3)
            if (r2 == 0) goto L_0x30b6
            java.lang.Object r2 = r0.A00
            X.1c8 r2 = (X.AnonymousClass1c8) r2
            X.6jp r0 = r4.A0L(r3)
            X.AnonymousClass1c8.A03(r2, r4, r0)
        L_0x30b6:
            r0 = 1590749531(0x5ed0e95b, float:7.5268316E18)
            goto L_0x33e4
        L_0x30bb:
            r1 = 1822464329(0x6ca09949, float:1.553216E27)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.601 r2 = (X.AnonymousClass601) r2
            java.lang.Object r0 = r0.A01
            X.6jp r0 = (X.C109326jp) r0
            X.C63893iY.A0G(r2, r0)
            r0 = 48469393(0x2e39591, float:3.34405E-37)
            goto L_0x33e4
        L_0x30d2:
            r1 = -645366252(0xffffffffd9887e14, float:-4.8024026E15)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A01
            X.601 r2 = (X.AnonymousClass601) r2
            java.lang.Object r0 = r0.A00
            X.6jp r0 = (X.C109326jp) r0
            X.C63893iY.A0G(r2, r0)
            r0 = 1618116941(0x6072814d, float:6.989733E19)
            goto L_0x33e4
        L_0x30e9:
            r1 = -1706913137(0xffffffff9a42928f, float:-4.023665E-23)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A00
            X.7h3 r3 = (X.C127397h3) r3
            r2 = 36
            X.6jp r3 = r3.A0L(r2)
            X.3iY r2 = X.C63893iY.A01
            java.lang.Object r0 = r0.A01
            X.601 r0 = (X.AnonymousClass601) r0
            X.C61043Rr.A00(r0, r2, r3)
            r0 = 255397794(0xf390fa2, float:9.124215E-30)
            goto L_0x33e4
        L_0x3108:
            r1 = -1282784605(0xffffffffb38a42a3, float:-6.438247E-8)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r2 = r0.A00
            X.601 r2 = (X.AnonymousClass601) r2
            java.lang.Object r0 = r0.A01
            X.6jp r0 = (X.C109326jp) r0
            X.C63893iY.A0G(r2, r0)
            r0 = 1824304273(0x6cbcac91, float:1.8247438E27)
            goto L_0x33e4
        L_0x311f:
            r1 = -1228666783(0xffffffffb6c40861, float:-5.8422306E-6)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r6 = r0.A01
            X.47I r6 = (X.AnonymousClass47I) r6
            java.lang.Object r10 = r0.A00
            com.instagram.service.session.UserSession r10 = (com.instagram.service.session.UserSession) r10
            X.3HX r5 = r6.A07
            r2 = 0
            com.facebook.redex.IDxLListenerShape686S0100000_1_I2 r0 = new com.facebook.redex.IDxLListenerShape686S0100000_1_I2
            r0.<init>(r6, r2)
            X.C63913ic.A0O(r5, r0)
            X.4CK r4 = new X.4CK
            r4.<init>(r6)
            java.lang.String r11 = X.C18180wK.A0e()
            X.C04220Ms.A06(r11)
            X.7h3 r3 = r6.A08
            r2 = 41
            java.lang.String r0 = ""
            java.lang.String r7 = r3.A0O(r2, r0)
            java.lang.String r3 = "profile_shop"
            X.0nS r2 = X.C13330nS.A01(r4, r10)
            java.lang.String r0 = "instagram_shopping_shop_manager_edit_products_entry_tap"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r0)
            r0 = 2256(0x8d0, float:3.161E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r2)
            if (r0 == 0) goto L_0x3172
            X.C18250wR.A0y(r2, r11)
            java.lang.String r0 = "submodule"
            r2.A0T(r0, r3)
            X.C18240wQ.A16(r2, r7)
        L_0x3172:
            X.Axa r7 = X.C19513Axa.A00
            X.0Oa r0 = r6.A09
            java.lang.Object r8 = r0.getValue()
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.fragment.app.Fragment r9 = X.C63913ic.A00(r5)
            java.lang.String r12 = r4.getModuleName()
            r7.A0Y(r8, r9, r10, r11, r12)
            r0 = -22682765(0xfffffffffea5e373, float:-1.102518E38)
            goto L_0x33e4
        L_0x318c:
            r1 = 343197609(0x1474c7a9, float:1.2358228E-26)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r5 = r0.A01
            X.47I r5 = (X.AnonymousClass47I) r5
            X.7h3 r4 = r5.A08
            java.lang.Object r3 = r0.A00
            X.6jp r3 = (X.C109326jp) r3
            X.3iY r2 = X.C63893iY.A01
            X.3HX r0 = r5.A07
            X.C122047Jt.A03(r0, r4, r2, r3)
            r0 = 1000431445(0x3ba15f55, float:0.0049246945)
            goto L_0x33e4
        L_0x31a9:
            java.lang.Object r1 = r0.A00
            X.4Aj r1 = (X.AnonymousClass4Aj) r1
            X.29g r0 = X.C318629g.MANAGE_SYNC_SETTINGS
            X.AnonymousClass4Aj.A0B = r0
            com.instagram.service.session.UserSession r6 = r1.A09
            X.29S r2 = X.AnonymousClass29S.PROFILE_PICTURE_BOTTOM_SHEET_ITEM_CLICKED
            X.296 r3 = X.AnonymousClass4Aj.A0A
            X.2A6 r5 = X.AnonymousClass2A6.A05
            java.lang.String r0 = r6.getUserId()
            java.lang.Long.parseLong(r0)
            X.29g r4 = X.AnonymousClass4Aj.A0B
            r7 = 0
            r8 = r7
            X.C35712On.A00(r2, r3, r4, r5, r6, r7, r8)
            androidx.fragment.app.Fragment r2 = r1.A05
            X.2A7 r1 = X.AnonymousClass2A7.A0C
            X.29l r0 = X.C319129l.EDIT_PHOTO_REMINDER
            X.C63243h6.A03(r1, r0, r6)
            X.39J r0 = X.AnonymousClass39J.A02
            X.1q6 r1 = new X.1q6
            r1.<init>((androidx.fragment.app.Fragment) r2, (X.C10300i6) r6)
            r0.A00 = r1
            java.lang.String r0 = "PHOTO_SETTINGS"
            r1.A04(r0, r7, r7)
            X.AnonymousClass4Aj.A00()
            return
        L_0x31e2:
            java.lang.Object r6 = r0.A00
            X.4Aj r6 = (X.AnonymousClass4Aj) r6
            java.lang.Object r5 = r0.A01
            android.content.Context r5 = (android.content.Context) r5
            com.instagram.creation.base.ui.mediatabbar.Tab r0 = X.GQE.A00
            com.instagram.service.session.UserSession r4 = r6.A09
            androidx.fragment.app.Fragment r3 = r6.A05
            java.lang.Integer r2 = X.AnonymousClass006.A00
            X.4CX r1 = new X.4CX
            r1.<init>(r6, r0)
            boolean r0 = X.C63713iA.A01
            if (r0 == 0) goto L_0x320b
            boolean r0 = X.C63713iA.A0A()
            if (r0 == 0) goto L_0x320b
            r0 = 26
            com.facebook.redex.IDxCListenerShape48S0300000_1_I2 r0 = X.C18250wR.A0E(r4, r3, r2, r0)
            X.AnonymousClass2P0.A00(r5, r0, r1, r4, r2)
            return
        L_0x320b:
            r1.BrW()
            return
        L_0x320f:
            java.lang.Object r1 = r0.A00
            com.instagram.archive.fragment.ArchiveHomeFragment r1 = (com.instagram.archive.fragment.ArchiveHomeFragment) r1
            java.lang.Object r2 = r0.A01
            android.app.Activity r2 = (android.app.Activity) r2
            com.instagram.service.session.UserSession r1 = r1.A02
            X.D1j r0 = X.C23921D1j.ARCHIVE
            X.C25746DrI.A04(r2, r0, r1)
            return
        L_0x321f:
            r1 = -1837495338(0xffffffff927a0bd6, float:-7.890068E-28)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A01
            android.content.DialogInterface$OnCancelListener r3 = (android.content.DialogInterface.OnCancelListener) r3
            r2 = 0
            r3.onCancel(r2)
            java.lang.Object r0 = r0.A00
            X.37K r0 = (X.AnonymousClass37K) r0
            android.app.Dialog r0 = r0.A00
            r0.getClass()
            r0.dismiss()
            r0 = -717734349(0xffffffffd5383e33, float:-1.26610802E13)
            goto L_0x33e4
        L_0x323f:
            r1 = -2135100006(0xffffffff80bcf59a, float:-1.7353179E-38)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A01
            X.3Iu r3 = (X.C58963Iu) r3
            X.3ag r2 = new X.3ag
            r2.<init>(r3)
            java.lang.Object r0 = r0.A00
            androidx.fragment.app.FragmentActivity r0 = X.C18240wQ.A0I(r0)
            r2.A02(r0)
            r0 = -829741952(0xffffffffce8b2480, float:-1.16721254E9)
            goto L_0x33e4
        L_0x325d:
            java.lang.Object r6 = r0.A00
            X.1bc r6 = (X.C22921bc) r6
            java.lang.Object r4 = r0.A01
            X.4Mm r4 = (X.C72144Mm) r4
            com.instagram.service.session.UserSession r1 = r6.A02
            X.2A2 r0 = X.AnonymousClass2A2.A03
            java.lang.String r3 = r0.toString()
            X.AnonymousClass0wJ.A1N(r1, r3)
            X.2AF r0 = X.AnonymousClass2AF.A0g
            r2 = 0
            X.C63003bJ.A00(r0, r1, r3, r2)
            com.instagram.service.session.UserSession r1 = r6.A02
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.2AF r0 = X.AnonymousClass2AF.A0f
            X.C63003bJ.A00(r0, r1, r3, r2)
            com.instagram.service.session.UserSession r1 = r6.A02
            java.lang.String r0 = r4.A01()
            X.C35792Ov.A00(r1, r3, r0)
            X.3Fo r3 = r6.A01
            com.instagram.service.session.UserSession r0 = r3.A04
            X.KHq r2 = X.AnonymousClass3LY.A00(r0)
            java.lang.Class<X.46B> r1 = X.AnonymousClass46B.class
            X.4pY r0 = r3.A03
            r2.A01(r0, r1)
            X.3Ej r1 = X.C35762Os.A00()
            X.2Or r0 = r1.A00
            if (r0 != 0) goto L_0x32a8
            X.2Or r0 = new X.2Or
            r0.<init>()
            r1.A00 = r0
        L_0x32a8:
            X.1q9 r5 = new X.1q9
            r5.<init>()
            com.instagram.service.session.UserSession r7 = r6.A02
            java.lang.String r9 = r4.A01()
            java.lang.String r8 = "igpc_login_info"
            r10 = 51738(0xca1a, float:7.25E-41)
            r5.A00(r6, r7, r8, r9, r10)
            return
        L_0x32bc:
            r1 = -190201481(0xfffffffff4a9c177, float:-1.0759547E32)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A01
            X.1cB r4 = (X.AnonymousClass1cB) r4
            java.lang.Object r5 = r0.A00
            X.378 r5 = (X.AnonymousClass378) r5
            boolean r0 = r4.A05
            if (r0 != 0) goto L_0x335d
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x3389
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            if (r0 == 0) goto L_0x335d
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L_0x335d
            X.4Mm r7 = r5.A01
            com.instagram.user.model.MicroUserDict r0 = r7.A00
            com.instagram.api.schemas.HasPasswordState r2 = r0.A01
            if (r2 != 0) goto L_0x32e9
            com.instagram.api.schemas.HasPasswordState r2 = com.instagram.api.schemas.HasPasswordState.UNKNOWN
        L_0x32e9:
            com.instagram.api.schemas.HasPasswordState r0 = com.instagram.api.schemas.HasPasswordState.FALSE
            r8 = 1
            boolean r3 = X.C18180wK.A1Z(r2, r0)
            X.3an r0 = r4.A01
            java.lang.String r2 = r7.A01()
            java.util.Map r0 = r0.A02
            java.lang.Object r0 = r0.get(r2)
            com.instagram.accountlinking.model.AccountFamily r0 = (com.instagram.accountlinking.model.AccountFamily) r0
            if (r0 == 0) goto L_0x330d
            java.util.List r0 = r0.A04
            java.util.List r0 = X.C50492t5.A00(r0)
            int r0 = r0.size()
            r2 = 1
            if (r0 == r8) goto L_0x330e
        L_0x330d:
            r2 = 0
        L_0x330e:
            if (r3 == 0) goto L_0x3387
            if (r2 == 0) goto L_0x3387
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            r2 = 18299382474606268(0x410331000206bc, double:1.892699716232584E-307)
            boolean r0 = X.C63173fJ.A05(r0, r2)
            if (r0 == 0) goto L_0x3387
        L_0x331f:
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            android.content.res.Resources r6 = r0.getResources()
            if (r8 == 0) goto L_0x3362
            r3 = 2131820850(0x7f110132, float:1.9274427E38)
            java.lang.String r2 = r7.A02()
            com.instagram.service.session.UserSession r0 = r4.A03
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r0)
            java.lang.String r0 = r0.BK7()
            java.lang.String[] r0 = new java.lang.String[]{r2, r0}
            android.text.Spanned r6 = X.C16370sw.A01(r6, r0, r3)
            X.3j0 r3 = new X.3j0
            r3.<init>(r5, r4)
            r2 = 0
        L_0x3348:
            android.content.Context r0 = r4.getContext()
            X.AnonymousClass3JQ.A01(r0, r3, r2, r6)
            java.lang.String r0 = "ig_manage_main_account_remove_dialog_impression"
            X.0rn r2 = X.C15730rn.A00(r4, r0)
            X.AnonymousClass1cB.A02(r4, r2)
            com.instagram.service.session.UserSession r0 = r4.A03
            X.C32592Cl.A00(r2, r0)
        L_0x335d:
            r0 = 1252562946(0x4aa89802, float:5524481.0)
            goto L_0x33e4
        L_0x3362:
            r3 = 2131820848(0x7f110130, float:1.9274423E38)
            java.lang.String r2 = r7.A02()
            com.instagram.service.session.UserSession r0 = r4.A03
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r0)
            java.lang.String r0 = r0.BK7()
            java.lang.String[] r0 = new java.lang.String[]{r2, r0}
            android.text.Spanned r6 = X.C16370sw.A01(r6, r0, r3)
            r0 = 3
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r3 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r3.<init>((int) r0, (java.lang.Object) r4, (java.lang.Object) r5)
            r0 = 4
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r2 = X.C18220wO.A0O(r4, r0)
            goto L_0x3348
        L_0x3387:
            r8 = 0
            goto L_0x331f
        L_0x3389:
            X.1fJ r0 = r4.A00
            java.util.Set r0 = r0.A04
            int r2 = r0.size()
            r0 = 4
            r3 = 1
            if (r2 != r0) goto L_0x33b6
            android.content.Context r0 = r4.getContext()
            X.Dsm r2 = X.C18190wL.A0W(r0)
            r0 = 2131820868(0x7f110144, float:1.9274463E38)
            r2.A0L(r0)
            r0 = 2131820867(0x7f110143, float:1.9274461E38)
            r2.A0K(r0)
            X.C18180wK.A1M(r2)
            r2.A0q(r3)
            r2.A0r(r3)
            X.AnonymousClass0wJ.A1K(r2)
            goto L_0x335d
        L_0x33b6:
            X.1fJ r2 = r4.A00
            X.4Mm r0 = r5.A01
            java.lang.String r0 = r0.A01()
            r2.A09(r0, r3)
            X.AnonymousClass1cB.A00(r5, r4)
            goto L_0x335d
        L_0x33c5:
            r1 = 2147083669(0x7ff9e595, float:NaN)
            int r1 = X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A00
            X.3Cw r4 = (X.C57893Cw) r4
            android.os.Handler r3 = r4.A02
            X.4O8 r2 = new X.4O8
            r2.<init>(r4)
            r3.post(r2)
            java.lang.Object r0 = r0.A01
            X.4oP r0 = (X.C81794oP) r0
            r0.CFA()
            r0 = 469760121(0x1bfff879, float:4.2346783E-22)
        L_0x33e4:
            X.C14030oh.A0C(r0, r1)
            return
        L_0x33e8:
            r1 = -743754349(0xffffffffd3ab3593, float:-1.47067647E12)
            X.C14030oh.A05(r1)
            java.lang.Object r0 = r0.A01
            X.115 r0 = (X.AnonymousClass115) r0
            X.1Yh r0 = r0.A02
            r1 = 0
            r0.requireActivity()
            X.0Oa r0 = r0.A05
            r0.getValue()
            java.lang.String r0 = "Must call setInstanceSupplier first"
            X.AnonymousClass7Ko.A0E(r1, r0)
            r0 = 0
            throw r0
        L_0x3404:
            r1 = -2122748262(0xffffffff81796e9a, float:-4.581343E-38)
            X.C14030oh.A05(r1)
            java.lang.Object r0 = r0.A01
            X.115 r0 = (X.AnonymousClass115) r0
            X.1Yh r0 = r0.A02
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            X.0Oa r0 = r0.A05
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.C60113Ns.A01(r1, r0)
            r0 = 0
            throw r0
        L_0x341f:
            r1 = -928282676(0xffffffffc8ab87cc, float:-351294.38)
            X.C14030oh.A05(r1)
            java.lang.Object r0 = r0.A01
            X.115 r0 = (X.AnonymousClass115) r0
            X.1Yh r0 = r0.A02
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            X.0Oa r0 = r0.A05
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.C60113Ns.A01(r1, r0)
            r0 = 0
            throw r0
        L_0x343a:
            r1 = 146421366(0x8ba3676, float:1.12072715E-33)
            X.C14030oh.A05(r1)
            java.lang.Object r0 = r0.A01
            X.115 r0 = (X.AnonymousClass115) r0
            X.1Yh r0 = r0.A02
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            X.0Oa r0 = r0.A05
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.C60113Ns.A01(r1, r0)
            r0 = 0
            throw r0
        L_0x3455:
            r1 = 560418823(0x21675007, float:7.837176E-19)
            X.C14030oh.A05(r1)
            java.lang.Object r3 = r0.A01
            X.1dq r3 = (X.C23441dq) r3
            X.0Oa r0 = r3.A02
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.Jj9 r2 = X.C18210wN.A0L(r0)
            java.lang.Boolean r0 = X.C18180wK.A0Y()
            r2.A0M = r0
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r3)
            r0 = 2131831590(0x7f112b26, float:1.929621E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0O = r0
            r2.A00()
            r3.requireActivity()
            X.C60113Ns.A00()
            r0 = 0
            throw r0
        L_0x3487:
            r1 = 2102467590(0x7d511c06, float:1.7372135E37)
            X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A01
            X.1lN r1 = (X.AnonymousClass1lN) r1
            X.4rd r1 = r1.A01
            java.lang.Object r0 = r0.A00
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.CSX(r0)
            r0 = 0
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x34a4:
            r1 = -901120467(0xffffffffca49fe2d, float:-3309451.2)
            X.C14030oh.A05(r1)
            java.lang.Object r1 = r0.A00
            X.33h r1 = (X.C554633h) r1
            java.lang.Object r0 = r0.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r0.getId()
            com.instagram.business.fragment.SuggestBusinessFragment r0 = r1.A00
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            com.instagram.service.session.UserSession r0 = r0.A04
            X.C60113Ns.A01(r1, r0)
            r0 = 0
            throw r0
        L_0x34c2:
            r1 = 824009975(0x311d64f7, float:2.2903899E-9)
            X.C14030oh.A05(r1)
            java.lang.Object r4 = r0.A00
            X.L2R r4 = (X.L2R) r4
            java.lang.Object r3 = r0.A01
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            java.lang.String r2 = "comment_caption_header"
            r1 = 0
            r0 = 0
            r4.CSG(r3, r2, r1, r0)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x34e0:
            X.1wh r4 = r5.A03
            X.7qT r3 = X.C130667qT.A02(r4, r6, r8)
            java.lang.String r1 = "referer"
            java.lang.String r0 = "settings_ad_options"
            java.util.Map r2 = java.util.Collections.singletonMap(r1, r0)
            r0 = 36312226205860731(0x8101c70001037b, double:3.027336297960461E-306)
            boolean r0 = X.C63803iN.A0E(r7, r6, r0)
            if (r0 == 0) goto L_0x350c
            java.util.Map r2 = X.C63753iH.A01()
            java.lang.String r0 = "com.bloks.www.fx.settings.individual_setting.async"
        L_0x34ff:
            X.4A9 r1 = X.C63263h8.A00(r6, r0, r2)
            r0 = 15
            X.AnonymousClass4A9.A01(r1, r3, r5, r0)
            r4.schedule(r1)
            return
        L_0x350c:
            java.lang.String r0 = "com.instagram.sensitive_topics.sensitive_topics.ad_topic_preferences_view"
            goto L_0x34ff
        L_0x350f:
            com.instagram.service.session.UserSession r4 = r0.A09
            X.C2o r1 = r0.A06
            java.lang.String r5 = r1.getModuleName()
            java.lang.String r6 = "self_reel_dashboard"
            java.lang.String r7 = r8.getId()
            r9 = 0
            r1 = 33
            goto L_0x3532
        L_0x3521:
            com.instagram.service.session.UserSession r4 = r0.A09
            X.C2o r1 = r0.A06
            java.lang.String r5 = r1.getModuleName()
            java.lang.String r6 = "self_reel_dashboard"
            java.lang.String r7 = r8.getId()
            r9 = 1
            r1 = 32
        L_0x3532:
            com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2 r3 = new com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2
            r3.<init>(r1, r0, r8)
            X.BKH r0 = r2.A0E
            X.BKU r0 = r0.A0M
            r0.getClass()
            java.lang.String r8 = r0.A33()
            X.AnonymousClass3LR.A00(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x3546:
            r0.CPI(r8)
            return
        L_0x354a:
            X.0nS r2 = r0.A05
            java.lang.String r3 = r8.getId()
            java.lang.String r1 = "remove_follower_button_tapped"
            X.0A2 r2 = X.AnonymousClass0wJ.A0M(r2, r1)
            r1 = 2629(0xa45, float:3.684E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r2, r1)
            java.lang.String r1 = "target_id"
            r2.A0T(r1, r3)
            r2.Bb4()
            android.content.Context r3 = r4.getContext()
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()
            com.instagram.service.session.UserSession r6 = r0.A09
            X.C2o r5 = r0.A06
            X.4Ml r7 = new X.4Ml
            r7.<init>(r0, r8)
            X.C50432sz.A00(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x3579:
            java.lang.String r0 = "Missing Required Props"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x3580:
            androidx.fragment.app.Fragment r3 = r4.A05
            java.lang.Integer r1 = X.AnonymousClass006.A0N
            boolean r0 = X.C63713iA.A0A()
            if (r0 == 0) goto L_0x3594
            r0 = 26
            com.facebook.redex.IDxCListenerShape48S0300000_1_I2 r0 = X.C18250wR.A0E(r10, r3, r1, r0)
            X.AnonymousClass2P0.A00(r2, r0, r6, r10, r1)
            return
        L_0x3594:
            r6.BrW()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape70S0200000_1_I2.onClick(android.view.View):void");
    }

    public static final void A01(IDxCListenerShape70S0200000_1_I2 iDxCListenerShape70S0200000_1_I2) {
        int A05 = C14030oh.A05(605805859);
        C23421do r2 = ((AnonymousClass134) iDxCListenerShape70S0200000_1_I2.A01).A01;
        Integer num = (Integer) iDxCListenerShape70S0200000_1_I2.A00;
        C04220Ms.A0B(num, 0);
        C23421do.A00(r2, num);
        C14030oh.A0C(-501816980, A05);
    }

    public IDxCListenerShape70S0200000_1_I2(OneTapLoginLandingFragment oneTapLoginLandingFragment, C62733ac r2, int i) {
        this.A02 = i;
        switch (i) {
            case 141:
            case 142:
            case 143:
                this.A00 = oneTapLoginLandingFragment;
                this.A01 = r2;
                return;
            default:
                this.A00 = oneTapLoginLandingFragment;
                this.A01 = r2;
                return;
        }
    }

    public IDxCListenerShape70S0200000_1_I2(AnonymousClass601 r1, C109326jp r2, int i) {
        this.A02 = i;
        switch (i) {
            case 11:
            case 14:
                this.A00 = r1;
                this.A01 = r2;
                break;
            default:
                this.A01 = r1;
                this.A00 = r2;
                break;
        }
    }

    public IDxCListenerShape70S0200000_1_I2(Activity activity, UserSession userSession, int i) {
        this.A02 = i;
        if (167 - i != 0) {
            this.A00 = userSession;
            this.A01 = activity;
            return;
        }
        this.A01 = userSession;
        this.A00 = activity;
    }

    public IDxCListenerShape70S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public IDxCListenerShape70S0200000_1_I2(AnonymousClass2AI r1, AnonymousClass1x1 r2, int i) {
        this.A02 = i;
        if (205 - i != 0) {
            this.A00 = r1;
            this.A01 = r2;
        } else {
            this.A01 = r2;
            this.A00 = r1;
        }
    }

    public IDxCListenerShape70S0200000_1_I2(FragmentActivity fragmentActivity, PromoteData promoteData, int i) {
        this.A02 = i;
        if (43 - i != 0) {
            this.A00 = fragmentActivity;
            this.A01 = promoteData;
        } else {
            this.A01 = promoteData;
            this.A00 = fragmentActivity;
        }
    }

    public IDxCListenerShape70S0200000_1_I2(View.OnClickListener onClickListener, IgdsMediaToggleButton igdsMediaToggleButton, int i) {
        this.A02 = i;
        this.A00 = onClickListener;
        this.A01 = igdsMediaToggleButton;
    }
}
