package com.facebook.redex;

import X.C34583IbB;
import X.C34620Ibt;
import X.C35367ItV;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public class IDxCListenerShape8S1200000_1_I2 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public IDxCListenerShape8S1200000_1_I2(FragmentActivity fragmentActivity, UserSession userSession, String str, int i) {
        this.A03 = i;
        if (7 - i != 0) {
            this.A01 = userSession;
            this.A00 = fragmentActivity;
            this.A02 = str;
        } else {
            this.A00 = fragmentActivity;
            this.A02 = str;
            this.A01 = userSession;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0421, code lost:
        X.C14030oh.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0424, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0100, code lost:
        X.C04220Ms.A0E("adsManagerLogger");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0106, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0176, code lost:
        X.C04220Ms.A0E("adsManagerLogger");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x017b, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x026b, code lost:
        X.C14030oh.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x026e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02f8, code lost:
        X.C14030oh.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02fb, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r12) {
        /*
            r11 = this;
            int r0 = r11.A03
            switch(r0) {
                case 0: goto L_0x001b;
                case 1: goto L_0x004c;
                case 2: goto L_0x0085;
                case 3: goto L_0x00c4;
                case 4: goto L_0x0107;
                case 5: goto L_0x0145;
                case 6: goto L_0x0190;
                case 7: goto L_0x0211;
                case 8: goto L_0x0243;
                case 9: goto L_0x0273;
                case 10: goto L_0x028c;
                case 11: goto L_0x02cf;
                case 12: goto L_0x0006;
                case 13: goto L_0x02fc;
                case 14: goto L_0x0313;
                case 15: goto L_0x0386;
                case 16: goto L_0x03be;
                case 17: goto L_0x03f3;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r0 = r11.A00
            X.4w1 r0 = (X.C85944w1) r0
            java.lang.Object r3 = r11.A01
            com.instagram.user.follow.FollowButton r3 = (com.instagram.user.follow.FollowButton) r3
            java.lang.String r4 = r11.A02
            r1 = 0
            if (r0 == 0) goto L_0x0005
            r2 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r0.BpV(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x001b:
            r0 = -1076221321(0xffffffffbfda2a77, float:-1.7044209)
            int r3 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r11.A00
            X.4oR r0 = (X.C81814oR) r0
            r0.onCancel()
            java.lang.Object r0 = r11.A01
            X.IEr r0 = (X.C34345IEr) r0
            X.IEq r4 = r0.A01
            java.lang.Integer r5 = X.AnonymousClass006.A0C
            java.lang.String r6 = r0.A02
            java.lang.String r7 = r11.A02
            com.facebook.iabadscontext.IABAdsContext r0 = r0.A02
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x0049
            long r9 = java.lang.Long.parseLong(r0)
        L_0x003f:
            java.lang.String r8 = ""
            r4.A03(r5, r6, r7, r8, r9)
            r0 = 357024130(0x1547c182, float:4.034038E-26)
            goto L_0x026b
        L_0x0049:
            r9 = 0
            goto L_0x003f
        L_0x004c:
            r0 = 236527795(0xe1920b3, float:1.887445E-30)
            int r3 = X.C14030oh.A05(r0)
            java.lang.String r6 = r11.A02
            if (r6 == 0) goto L_0x0080
            java.lang.Object r5 = r11.A01
            X.IbB r5 = (X.C34583IbB) r5
            X.Jjm r4 = r5.A00
            if (r4 == 0) goto L_0x0100
            java.lang.Object r0 = r11.A00
            X.ItV r0 = (X.C35367ItV) r0
            java.lang.String r2 = X.C37397Jr6.A01(r0)
            r1 = 0
            java.lang.String r0 = "ads_manager_highlights_hub"
            r4.A09(r0, r2, r1, r1)
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            X.0Oa r0 = r5.A0A
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r0)
            r1 = 0
            com.facebook.redex.IDxTCallbackShape37S1100000_1_I2 r0 = new com.facebook.redex.IDxTCallbackShape37S1100000_1_I2
            r0.<init>(r6, r5, r1)
            X.C37740K2a.A04(r4, r0, r2, r1)
        L_0x0080:
            r0 = 48960381(0x2eb137d, float:3.4541332E-37)
            goto L_0x026b
        L_0x0085:
            r0 = -1560396576(0xffffffffa2fe3ce0, float:-6.891129E-18)
            int r3 = X.C14030oh.A05(r0)
            java.lang.String r7 = r11.A02
            if (r7 == 0) goto L_0x00bf
            java.lang.Object r6 = r11.A01
            X.IbB r6 = (X.C34583IbB) r6
            X.Jjm r2 = r6.A00
            if (r2 == 0) goto L_0x0100
            java.lang.Object r0 = r11.A00
            X.ItV r0 = (X.C35367ItV) r0
            java.lang.String r1 = X.C37397Jr6.A01(r0)
            r0 = 0
            java.lang.String r5 = "ads_manager_highlights_hub"
            r2.A09(r5, r1, r7, r0)
            X.JjS r4 = X.AnonymousClass2K0.A00()
            X.3E2 r2 = X.AnonymousClass2K1.A00()
            X.0Oa r0 = r6.A0A
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r0)
            android.content.Context r0 = r6.requireContext()
            X.Jhb r0 = r2.A00(r0, r1, r7, r5)
            r4.A02(r6, r0, r6)
        L_0x00bf:
            r0 = 278821688(0x109e7b38, float:6.250986E-29)
            goto L_0x026b
        L_0x00c4:
            r0 = 1051923540(0x3eb31454, float:0.34976447)
            int r5 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r11.A01
            X.IbB r4 = (X.C34583IbB) r4
            X.Jjm r3 = r4.A00
            if (r3 == 0) goto L_0x0100
            java.lang.Object r0 = r11.A00
            X.ItV r0 = (X.C35367ItV) r0
            java.lang.String r2 = X.C37397Jr6.A01(r0)
            r1 = 0
            java.lang.String r0 = "ads_manager_highlights_hub"
            r3.A09(r0, r2, r1, r1)
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            X.0Oa r0 = r4.A0A
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r0)
            java.lang.String r1 = r11.A02
            X.9wF r0 = X.C171209wF.A20
            X.Jpy r1 = X.C18230wP.A0Y(r3, r2, r0, r1)
            java.lang.String r0 = "promote_ads_manager_highlights_hub_see_all_fragment"
            r1.A07(r0)
            r1.A04()
            r0 = -354336211(0xffffffffeae1422d, float:-1.3616041E26)
            goto L_0x02f8
        L_0x0100:
            java.lang.String r0 = "adsManagerLogger"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0107:
            r0 = -157904670(0xfffffffff69690e2, float:-1.5269201E33)
            int r6 = X.C14030oh.A05(r0)
            java.lang.String r5 = r11.A02
            if (r5 == 0) goto L_0x013e
            java.lang.Object r4 = r11.A01
            X.Ibt r4 = (X.C34620Ibt) r4
            X.Jjm r2 = r4.A06
            r7 = 0
            if (r2 == 0) goto L_0x0176
            java.lang.Object r0 = r11.A00
            X.ItV r0 = (X.C35367ItV) r0
            java.lang.String r1 = X.C37397Jr6.A01(r0)
            java.lang.String r0 = "ads_manager_highlights_hub"
            r2.A09(r0, r1, r7, r7)
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            com.instagram.service.session.UserSession r2 = r4.A0J
            if (r2 != 0) goto L_0x0134
            X.C18210wN.A0m()
            throw r7
        L_0x0134:
            r0 = 1
            com.facebook.redex.IDxTCallbackShape37S1100000_1_I2 r1 = new com.facebook.redex.IDxTCallbackShape37S1100000_1_I2
            r1.<init>(r5, r4, r0)
            r0 = 0
            X.C37740K2a.A04(r3, r1, r2, r0)
        L_0x013e:
            r0 = -28304142(0xfffffffffe501cf2, float:-6.915743E37)
            X.C14030oh.A0C(r0, r6)
            return
        L_0x0145:
            r0 = -229253196(0xfffffffff255dfb4, float:-4.2362078E30)
            int r5 = X.C14030oh.A05(r0)
            java.lang.String r8 = r11.A02
            if (r8 == 0) goto L_0x018b
            java.lang.Object r6 = r11.A01
            X.Ibt r6 = (X.C34620Ibt) r6
            X.Jjm r1 = r6.A06
            r7 = 0
            if (r1 == 0) goto L_0x0176
            java.lang.Object r0 = r11.A00
            X.ItV r0 = (X.C35367ItV) r0
            java.lang.String r0 = X.C37397Jr6.A01(r0)
            java.lang.String r4 = "ads_manager_highlights_hub"
            r1.A09(r4, r0, r8, r7)
            X.JjS r3 = X.AnonymousClass2K0.A00()
            X.3E2 r2 = X.AnonymousClass2K1.A00()
            com.instagram.service.session.UserSession r1 = r6.A0J
            if (r1 != 0) goto L_0x017c
            X.C18210wN.A0m()
            throw r7
        L_0x0176:
            java.lang.String r0 = "adsManagerLogger"
            X.C04220Ms.A0E(r0)
            throw r7
        L_0x017c:
            android.content.Context r0 = r6.requireContext()
            X.Jhb r1 = r2.A00(r0, r1, r8, r4)
            boolean r0 = r6.A0V
            r1.A0J = r0
            r3.A02(r6, r1, r6)
        L_0x018b:
            r0 = 979729302(0x3a657b96, float:8.7540725E-4)
            goto L_0x02f8
        L_0x0190:
            r0 = 580121671(0x2293f447, float:4.010307E-18)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r7 = r11.A01
            X.Ibt r7 = (X.C34620Ibt) r7
            X.Jjm r2 = r7.A06
            r8 = 0
            if (r2 != 0) goto L_0x01a6
            java.lang.String r0 = "adsManagerLogger"
            X.C04220Ms.A0E(r0)
            throw r8
        L_0x01a6:
            java.lang.Object r1 = r11.A00
            X.ItV r1 = (X.C35367ItV) r1
            java.lang.String r1 = X.C37397Jr6.A01(r1)
            java.lang.String r9 = "ads_manager_highlights_hub"
            r2.A09(r9, r1, r8, r8)
            java.lang.String r4 = r11.A02
            if (r4 == 0) goto L_0x020c
            java.lang.String r2 = "instagram://"
            r1 = 1
            boolean r1 = X.C18220wO.A1V(r2, r1, r4)
            java.lang.String r6 = "userSession"
            if (r1 == 0) goto L_0x01ee
            android.net.Uri r2 = X.C15430rJ.A01(r4)
            java.lang.String r1 = "media_id"
            java.lang.String r5 = r2.getQueryParameter(r1)
            if (r5 == 0) goto L_0x020c
            X.JjS r4 = X.AnonymousClass2K0.A00()
            X.3E2 r3 = X.AnonymousClass2K1.A00()
            com.instagram.service.session.UserSession r2 = r7.A0J
            if (r2 != 0) goto L_0x01de
            X.C04220Ms.A0E(r6)
            throw r8
        L_0x01de:
            android.content.Context r1 = r7.requireContext()
            X.Jhb r2 = r3.A00(r1, r2, r5, r9)
            boolean r1 = r7.A0V
            r2.A0J = r1
            r4.A02(r7, r2, r7)
            goto L_0x020c
        L_0x01ee:
            androidx.fragment.app.FragmentActivity r3 = r7.requireActivity()
            com.instagram.service.session.UserSession r2 = r7.A0J
            if (r2 != 0) goto L_0x01fa
            X.C04220Ms.A0E(r6)
            throw r8
        L_0x01fa:
            X.9wF r1 = X.C171209wF.A20
            X.Jpy r2 = X.C18230wP.A0Y(r3, r2, r1, r4)
            r1 = 294(0x126, float:4.12E-43)
            java.lang.String r1 = X.I17.A00(r1)
            r2.A07(r1)
            r2.A04()
        L_0x020c:
            r1 = 1355724294(0x50ceb606, float:2.77442847E10)
            goto L_0x0421
        L_0x0211:
            r0 = 1618648837(0x607a9f05, float:7.2236634E19)
            int r3 = X.C14030oh.A05(r0)
            X.GVD r0 = X.C25745DrH.A00
            java.lang.Object r4 = r11.A00
            android.app.Activity r4 = (android.app.Activity) r4
            X.C18200wM.A12(r4, r0)
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = r11.A02
            if (r1 == 0) goto L_0x022e
            java.lang.String r0 = "media_id"
            r2.put(r0, r1)
        L_0x022e:
            java.lang.Object r0 = r11.A01
            X.0i6 r0 = (X.C10300i6) r0
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r0)
            java.lang.String r0 = "com.instagram.creators.achievements.debugger"
            X.3iE r0 = X.C63743iE.A02(r0, r2)
            r0.A0C(r4, r1)
            r0 = -1472709117(0xffffffffa8383e03, float:-1.02274985E-14)
            goto L_0x026b
        L_0x0243:
            r0 = 1293959491(0x4d204143, float:1.68039472E8)
            int r3 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r11.A01
            X.1Zk r5 = (X.C22771Zk) r5
            boolean r0 = r5.A00
            java.lang.Object r4 = r11.A00
            com.instagram.igtv.widget.ExpandableTextView r4 = (com.instagram.igtv.widget.ExpandableTextView) r4
            java.lang.String r2 = r11.A02
            if (r0 == 0) goto L_0x026f
            X.0Oa r0 = r5.A07
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r0)
            r0 = 0
            r4.setExpandableText(r2, r1, r0)
        L_0x0262:
            boolean r0 = r5.A00
            r0 = r0 ^ 1
            r5.A00 = r0
            r0 = 1244695716(0x4a308ca4, float:2892585.0)
        L_0x026b:
            X.C14030oh.A0C(r0, r3)
            return
        L_0x026f:
            r4.setText(r2)
            goto L_0x0262
        L_0x0273:
            r0 = 224535474(0xd6223b2, float:6.9684593E-31)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r11.A01
            X.4pq r3 = (X.C82524pq) r3
            java.lang.Object r2 = r11.A00
            com.instagram.api.schemas.FanClubCategoryType r2 = (com.instagram.api.schemas.FanClubCategoryType) r2
            java.lang.String r1 = r11.A02
            r3.BoR(r2, r1)
            r1 = 752546419(0x2cdaf273, float:6.22285E-12)
            goto L_0x0421
        L_0x028c:
            r0 = 1891309948(0x70bb197c, float:4.6323604E29)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r11.A01
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            X.Dsm r5 = X.AnonymousClass0wJ.A0V(r6)
            r1 = 2131837631(0x7f1142bf, float:1.9308462E38)
            r5.A0L(r1)
            r2 = 2131837629(0x7f1142bd, float:1.9308458E38)
            java.lang.String r1 = r11.A02
            java.lang.String r1 = X.AnonymousClass0wJ.A0o(r6, r1, r2)
            r5.A0p(r1)
            r4 = 2131834607(0x7f1136ef, float:1.930233E38)
            java.lang.Object r3 = r11.A00
            r1 = 25
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r2 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r2.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r6)
            X.25l r1 = X.AnonymousClass25l.RED
            r5.A0R(r2, r1, r4)
            r3 = 2131823054(0x7f1109ce, float:1.9278897E38)
            X.25l r2 = X.AnonymousClass25l.DEFAULT
            r1 = 0
            r5.A0S(r1, r2, r3)
            X.AnonymousClass0wJ.A1K(r5)
            r1 = 357646622(0x1551411e, float:4.2258582E-26)
            goto L_0x0421
        L_0x02cf:
            r0 = 2023561493(0x789d1915, float:2.5490604E34)
            int r5 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r11.A00
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.String r1 = r11.A02
            boolean r0 = r2.isAdded()
            if (r0 == 0) goto L_0x02f5
            android.content.Context r0 = r2.requireContext()
            r3 = 0
            X.C09830gl.A01(r0, r1, r3)
            android.content.Context r2 = r2.requireContext()
            r1 = 2131829646(0x7f11238e, float:1.9292267E38)
            r0 = 0
            X.C63813iO.A03(r2, r3, r1, r0)
        L_0x02f5:
            r0 = 7059772(0x6bb93c, float:9.892848E-39)
        L_0x02f8:
            X.C14030oh.A0C(r0, r5)
            return
        L_0x02fc:
            java.lang.Object r3 = r11.A00
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            java.lang.String r4 = r11.A02
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.String r5 = "message_button"
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            r2 = r0
            X.0kW r2 = (X.C11630kW) r2
            X.AnonymousClass2NP.A00(r0, r1, r2, r3, r4, r5)
            return
        L_0x0313:
            java.lang.Object r6 = r11.A00
            X.3Bj r6 = (X.C57523Bj) r6
            java.lang.String r8 = r11.A02
            java.lang.Object r7 = r11.A01
            java.util.AbstractMap r7 = (java.util.AbstractMap) r7
            com.instagram.service.session.UserSession r5 = r6.A02
            java.lang.String r1 = "ads"
            java.lang.String r0 = "ads_personalization_entered"
            X.C62423Zt.A03(r5, r1, r0)
            X.C62423Zt.A02(r5)
            java.lang.String r4 = "CLOSE"
            java.lang.String r3 = "navbar_action"
            java.lang.String r2 = "app_settings"
            java.lang.String r1 = "entrypoint"
            if (r8 == 0) goto L_0x036c
            java.lang.String r0 = "detailed_version_group"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x035b
            r7.put(r1, r2)
            r7.put(r3, r4)
            java.lang.String r0 = "com.bloks.www.fxcal.settings.ads.data_from_partners_user_grain_detailed_version_introduction"
        L_0x0343:
            X.3iE r4 = X.C63743iE.A02(r0, r7)
            android.content.Context r3 = r12.getContext()
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.C18190wL.A0N(r5)
            androidx.fragment.app.FragmentActivity r1 = r6.A01
            r0 = 2131824762(0x7f11107a, float:1.9282361E38)
            X.C18210wN.A0s(r1, r2, r0)
            r4.A0E(r3, r2)
            return
        L_0x035b:
            java.lang.String r0 = "concise_version_group"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x036c
            r7.put(r1, r2)
            r7.put(r3, r4)
            java.lang.String r0 = "com.bloks.www.fxcal.settings.ads.data_from_partners_user_grain_concise_version_introduction"
            goto L_0x0343
        L_0x036c:
            java.lang.String r1 = "entry_point"
            java.lang.String r0 = "ig_settings_ads_android"
            r7.put(r1, r0)
            java.lang.String r0 = "com.instagram.ads.ads_personalization"
            X.3iE r3 = X.C63743iE.A02(r0, r7)
            androidx.fragment.app.FragmentActivity r2 = r6.A01
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r5)
            r0 = 2131824762(0x7f11107a, float:1.9282361E38)
            X.C63743iE.A08(r2, r1, r3, r0)
            return
        L_0x0386:
            r0 = 1636548105(0x618bbe09, float:3.2222386E20)
            int r0 = X.C14030oh.A05(r0)
            java.lang.String r4 = r11.A02
            java.lang.Object r3 = r11.A01
            com.instagram.service.session.UserSession r3 = (com.instagram.service.session.UserSession) r3
            java.lang.String r2 = "promotion_payments_entered_from_payment_settings"
            r1 = 0
            X.C62423Zt.A01(r1, r3, r4, r2, r1)
            X.C62423Zt.A02(r3)
            java.lang.String r1 = "settings_payment_options"
            X.AnonymousClass3X0.A01(r1, r3)
            java.lang.Object r1 = r11.A00
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            X.Drz r2 = X.AnonymousClass0wJ.A0Q(r1, r3)
            X.C18190wL.A10()
            X.Ipr r1 = new X.Ipr
            r1.<init>()
            r2.A03 = r1
            java.lang.String r1 = "PromotePaymentsInterstitialFragment.BACK_STACK_NAME"
            r2.A07 = r1
            r2.A05()
            r1 = 1426379872(0x5504d460, float:9.1279799E12)
            goto L_0x0421
        L_0x03be:
            r0 = 550957263(0x20d6f0cf, float:3.6412364E-19)
            int r0 = X.C14030oh.A05(r0)
            X.0Ok r1 = X.C06810aP.A01
            java.lang.Object r5 = r11.A01
            com.instagram.service.session.UserSession r5 = (com.instagram.service.session.UserSession) r5
            com.instagram.user.model.User r6 = r1.A01(r5)
            java.lang.String r2 = r11.A02
            r1 = 0
            com.facebook.redex.IDxUCallbackShape33S1200000_1_I2 r7 = new com.facebook.redex.IDxUCallbackShape33S1200000_1_I2
            r7.<init>(r5, r6, r2, r1)
            boolean r10 = X.C63823iP.A0C(r5)
            java.lang.Object r4 = r11.A00
            androidx.core.app.ComponentActivity r4 = (androidx.core.app.ComponentActivity) r4
            androidx.lifecycle.LifecycleCoroutineScopeImpl r2 = X.AnonymousClass067.A00(r4)
            r8 = 0
            r9 = 9
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0411000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0411000_I2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r1 = 3
            X.C25237DiI.A00(r8, r8, r3, r2, r1)
            r1 = 847183168(0x327efd40, float:1.4842328E-8)
            goto L_0x0421
        L_0x03f3:
            r0 = 1766263555(0x69470b03, float:1.5039265E25)
            int r0 = X.C14030oh.A05(r0)
            X.0Ok r1 = X.C06810aP.A01
            java.lang.Object r4 = r11.A01
            com.instagram.service.session.UserSession r4 = (com.instagram.service.session.UserSession) r4
            com.instagram.user.model.User r5 = r1.A01(r4)
            java.lang.String r1 = r11.A02
            r9 = 1
            com.facebook.redex.IDxUCallbackShape33S1200000_1_I2 r6 = new com.facebook.redex.IDxUCallbackShape33S1200000_1_I2
            r6.<init>(r4, r5, r1, r9)
            java.lang.Object r7 = r11.A00
            androidx.core.app.ComponentActivity r7 = (androidx.core.app.ComponentActivity) r7
            androidx.lifecycle.LifecycleCoroutineScopeImpl r2 = X.AnonymousClass067.A00(r7)
            r8 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape6S0401000_I2_2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape6S0401000_I2_2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1 = 3
            X.C25237DiI.A00(r8, r8, r3, r2, r1)
            r1 = -1782336985(0xffffffff95c3b227, float:-7.904095E-26)
        L_0x0421:
            X.C14030oh.A0C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape8S1200000_1_I2.onClick(android.view.View):void");
    }

    public IDxCListenerShape8S1200000_1_I2(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A01 = obj2;
        this.A00 = obj;
        this.A02 = str;
    }

    public IDxCListenerShape8S1200000_1_I2(C34620Ibt ibt, C35367ItV itV, String str, int i) {
        this.A03 = i;
        switch (i) {
            case 4:
            case 5:
                this.A02 = str;
                this.A01 = ibt;
                this.A00 = itV;
                break;
            default:
                this.A01 = ibt;
                this.A00 = itV;
                this.A02 = str;
                break;
        }
    }

    public IDxCListenerShape8S1200000_1_I2(C34583IbB ibB, C35367ItV itV, String str, int i) {
        this.A03 = i;
        switch (i) {
            case 1:
            case 2:
                this.A02 = str;
                this.A01 = ibB;
                this.A00 = itV;
                break;
            default:
                this.A01 = ibB;
                this.A00 = itV;
                this.A02 = str;
                break;
        }
    }
}
