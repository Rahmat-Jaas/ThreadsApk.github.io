package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.C14030oh;
import X.C18240wQ;
import X.C201413h;
import X.C202413u;
import X.C28291u0;
import X.C32122Ah;
import X.C84844tx;
import android.content.Context;
import android.view.View;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import com.instagram.user.model.User;
import java.util.HashMap;

public class IDxCListenerShape15S0400000_1_I2 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxCListenerShape15S0400000_1_I2(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A04 = i;
        this.A00 = obj3;
        this.A01 = obj4;
        this.A03 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x02b6, code lost:
        X.C14030oh.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x02b9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0343, code lost:
        X.C14030oh.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0346, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            int r0 = r13.A04
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x002c;
                case 2: goto L_0x0030;
                case 3: goto L_0x0034;
                case 4: goto L_0x0054;
                case 5: goto L_0x0074;
                case 6: goto L_0x0099;
                case 7: goto L_0x00b9;
                case 8: goto L_0x00d9;
                case 9: goto L_0x0137;
                case 10: goto L_0x0173;
                case 11: goto L_0x0192;
                case 12: goto L_0x01d0;
                case 13: goto L_0x01ee;
                case 14: goto L_0x0347;
                case 15: goto L_0x022b;
                case 16: goto L_0x0237;
                case 17: goto L_0x0243;
                case 18: goto L_0x0247;
                case 19: goto L_0x0253;
                case 20: goto L_0x02ba;
                case 21: goto L_0x02f1;
                case 22: goto L_0x031e;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r0 = 1238730281(0x49d58629, float:1749189.1)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r13.A02
            X.7h3 r3 = (X.C127397h3) r3
            java.lang.Object r2 = r13.A03
            X.6jp r2 = (X.C109326jp) r2
            X.3VO r0 = X.AnonymousClass3VO.A00()
            java.util.List r0 = r0.A00
            X.3iY r1 = new X.3iY
            r1.<init>(r0)
            java.lang.Object r0 = r13.A01
            X.3HX r0 = (X.AnonymousClass3HX) r0
            X.C122047Jt.A03(r0, r3, r1, r2)
            r0 = -1819016504(0xffffffff939402c8, float:-3.7363195E-27)
            goto L_0x02b6
        L_0x002c:
            A01(r13)
            return
        L_0x0030:
            A02(r13)
            return
        L_0x0034:
            r0 = 2028429371(0x78e7603b, float:3.7542886E34)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r13.A00
            X.AnonymousClass3Z9.A01(r0)
            java.lang.Object r2 = r13.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.Object r1 = r13.A03
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.Object r0 = r13.A02
            X.3TG r0 = (X.AnonymousClass3TG) r0
            X.C63783iL.A05(r2, r1, r0)
            r0 = 22675394(0x159ffc2, float:4.0040103E-38)
            goto L_0x02b6
        L_0x0054:
            r0 = 1721371494(0x669a0b66, float:3.6372735E23)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r13.A00
            X.AnonymousClass3Z9.A01(r0)
            java.lang.Object r2 = r13.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.Object r1 = r13.A03
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            java.lang.Object r0 = r13.A02
            X.3TG r0 = (X.AnonymousClass3TG) r0
            X.C63783iL.A04(r2, r1, r0)
            r0 = 1330415881(0x4f4c8909, float:3.4315328E9)
            goto L_0x02b6
        L_0x0074:
            r0 = -174807887(0xfffffffff594a4b1, float:-3.768556E32)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r13.A03
            X.3ht r2 = (X.C63603ht) r2
            java.lang.Object r1 = r13.A01
            X.D3Q r1 = (X.D3Q) r1
            java.lang.Object r0 = r13.A02
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            X.C63603ht.A03(r1, r2, r0)
            X.C63603ht.A07(r2)
            java.lang.Object r0 = r13.A00
            X.Jqm r0 = (X.C37383Jqm) r0
            r0.A06()
            r0 = 1554761267(0x5cabc633, float:3.86801147E17)
            goto L_0x02b6
        L_0x0099:
            r0 = 121550523(0x73eb6bb, float:1.4347711E-34)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r13.A03
            X.3ht r2 = (X.C63603ht) r2
            java.lang.Object r1 = r13.A00
            X.D3Q r1 = (X.D3Q) r1
            java.lang.Object r0 = r13.A01
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            X.C63603ht.A03(r1, r2, r0)
            java.lang.Object r0 = r13.A02
            X.AnonymousClass3Z9.A01(r0)
            r0 = 1432891563(0x556830ab, float:1.59559828E13)
            goto L_0x02b6
        L_0x00b9:
            r0 = -1903373417(0xffffffff8e8cd397, float:-3.471642E-30)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r13.A03
            X.3ht r2 = (X.C63603ht) r2
            java.lang.Object r1 = r13.A00
            X.D3Q r1 = (X.D3Q) r1
            java.lang.Object r0 = r13.A01
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            X.C63603ht.A02(r1, r2, r0)
            java.lang.Object r0 = r13.A02
            X.AnonymousClass3Z9.A01(r0)
            r0 = -575014067(0xffffffffddb9fb4d, float:-1.67517372E18)
            goto L_0x02b6
        L_0x00d9:
            java.lang.Object r6 = r13.A00
            X.3yl r6 = (X.C67033yl) r6
            java.lang.Object r7 = r13.A01
            androidx.fragment.app.FragmentActivity r7 = (androidx.fragment.app.FragmentActivity) r7
            java.lang.Object r5 = r13.A02
            com.instagram.model.venue.Venue r5 = (com.instagram.model.venue.Venue) r5
            java.lang.Object r4 = r13.A03
            com.instagram.discovery.mediamap.model.LocationPageInformation r4 = (com.instagram.discovery.mediamap.model.LocationPageInformation) r4
            com.instagram.service.session.UserSession r9 = r6.A02
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36317663634395038(0x8106b900000f9e, double:3.030774949660324E-306)
            boolean r0 = X.C63803iN.A0E(r2, r9, r0)
            if (r0 == 0) goto L_0x0113
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r8 = r6.A01
            java.lang.String r12 = r5.A04()
            X.Fg4 r10 = X.C29009Fg4.A0U
            X.Fg3 r11 = X.C29008Fg3.A0T
            X.Jmy r6 = new X.Jmy
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0 = 1
            r6.A08 = r0
            X.25O r0 = X.AnonymousClass25O.REPORT_BUTTON
            r6.A07(r0)
            r6.A06()
            return
        L_0x0113:
            X.1wQ r3 = new X.1wQ
            r3.<init>()
            android.os.Bundle r2 = X.C18180wK.A06()
            com.instagram.user.model.User r0 = r4.A00()
            boolean r1 = X.AnonymousClass0wJ.A1W(r0)
            java.lang.String r0 = "show_linked_business_report_options"
            r2.putBoolean(r0, r1)
            r3.setArguments(r2)
            X.4Df r0 = new X.4Df
            r0.<init>(r7, r6, r5)
            r3.A00 = r0
            X.AnonymousClass0wJ.A19(r3, r7, r9)
            return
        L_0x0137:
            r0 = -1757462867(0xffffffff973f3ead, float:-6.1794536E-25)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r13.A00
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r3 = r13.A02
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            java.lang.String r2 = r3.BK7()
            java.lang.Object r0 = r13.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0170
            com.instagram.model.mediatype.ProductType r1 = com.instagram.model.mediatype.ProductType.CLIPS
        L_0x0154:
            r0 = 0
            X.C63153fH.A00(r5, r0, r1, r2)
            java.lang.Object r0 = r13.A03
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.495 r2 = X.AnonymousClass2O7.A00(r0)
            java.lang.String r0 = r3.getId()
            long r0 = java.lang.Long.parseLong(r0)
            r2.A00(r0)
            r0 = 1366608844(0x5174cbcc, float:6.5711948E10)
            goto L_0x02b6
        L_0x0170:
            com.instagram.model.mediatype.ProductType r1 = com.instagram.model.mediatype.ProductType.FEED
            goto L_0x0154
        L_0x0173:
            r0 = -1149240966(0xffffffffbb7ff97a, float:-0.0039058612)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r13.A00
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            java.lang.Object r2 = r13.A03
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            java.lang.Object r1 = r13.A01
            X.0kW r1 = (X.C11630kW) r1
            java.lang.Object r0 = r13.A02
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.AnonymousClass3MW.A01(r3, r1, r2, r0)
            r0 = -1968068565(0xffffffff8ab1a82b, float:-1.7107738E-32)
            goto L_0x02b6
        L_0x0192:
            r0 = -1621271693(0xffffffff9f5d5b73, float:-4.6874215E-20)
            int r3 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r13.A00
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r6 = r13.A03
            X.0i6 r6 = (X.C10300i6) r6
            java.lang.String r0 = "Required value was null."
            if (r6 == 0) goto L_0x01c5
            java.lang.String r0 = "https://help.instagram.com/581066165581870"
            java.lang.String r8 = X.AnonymousClass3W8.A02(r4, r0)
            X.C04220Ms.A06(r8)
            r0 = 2131836650(0x7f113eea, float:1.9306473E38)
            java.lang.String r9 = r4.getString(r0)
            java.lang.Object r5 = r13.A02
            X.0kW r5 = (X.C11630kW) r5
            java.lang.Object r7 = r13.A01
            X.4px r7 = (X.C82594px) r7
            X.AnonymousClass3Zk.A02(r4, r5, r6, r7, r8, r9)
            r0 = -1353994865(0xffffffffaf4bad8f, float:-1.8524403E-10)
            goto L_0x0343
        L_0x01c5:
            java.lang.IllegalStateException r1 = X.C18180wK.A0a(r0)
            r0 = -546787226(0xffffffffdf68b066, float:-1.6767014E19)
            X.C14030oh.A0C(r0, r3)
            throw r1
        L_0x01d0:
            java.lang.Object r3 = r13.A00
            X.3S7 r3 = (X.AnonymousClass3S7) r3
            java.lang.Object r2 = r13.A02
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r1 = r13.A03
            com.instagram.service.session.UserSession r1 = (com.instagram.service.session.UserSession) r1
            r0 = 2
            r2.setResult(r0)
            r2.finish()
            X.Jqm r0 = r3.A00
            r0.A06()
            java.lang.Integer r0 = X.AnonymousClass006.A01
            X.C35452Nm.A00(r1, r0)
            return
        L_0x01ee:
            r0 = -242913283(0xfffffffff1856ffd, float:-1.3215005E30)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r13.A00
            X.254 r0 = (X.AnonymousClass254) r0
            int r0 = r0.ordinal()
            java.lang.String r2 = "cta"
            switch(r0) {
                case 0: goto L_0x0207;
                case 1: goto L_0x0213;
                case 2: goto L_0x021f;
                default: goto L_0x0202;
            }
        L_0x0202:
            r0 = -1839883783(0xffffffff925599f9, float:-6.7400735E-28)
            goto L_0x02b6
        L_0x0207:
            java.lang.Object r1 = r13.A02
            X.4vu r1 = (X.C85874vu) r1
            java.lang.Object r0 = r13.A03
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.BnK(r0, r2)
            goto L_0x0202
        L_0x0213:
            java.lang.Object r1 = r13.A02
            X.4vu r1 = (X.C85874vu) r1
            java.lang.Object r0 = r13.A03
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.BnL(r0, r2)
            goto L_0x0202
        L_0x021f:
            java.lang.Object r1 = r13.A02
            X.4vu r1 = (X.C85874vu) r1
            java.lang.Object r0 = r13.A03
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.BnJ(r0, r2)
            goto L_0x0202
        L_0x022b:
            r0 = 2112669745(0x7decc831, float:3.9342158E37)
            int r3 = X.C84844tx.A00(r13, r0)
            r0 = 1545696589(0x5c21754d, float:1.81785779E17)
            goto L_0x0343
        L_0x0237:
            r0 = -236896680(0xfffffffff1e13e58, float:-2.2307039E30)
            int r3 = X.C84844tx.A00(r13, r0)
            r0 = -1282431711(0xffffffffb38fa521, float:-6.688993E-8)
            goto L_0x0343
        L_0x0243:
            A00(r13)
            return
        L_0x0247:
            r0 = -896195318(0xffffffffca95250a, float:-4887173.0)
            int r3 = X.C84844tx.A00(r13, r0)
            r0 = -906444691(0xffffffffc9f8c06d, float:-2037773.6)
            goto L_0x0343
        L_0x0253:
            r0 = 2085596295(0x7c4fac87, float:4.313219E36)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r5 = r0.requireContext()
            androidx.fragment.app.Fragment r1 = r0.mParentFragment
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x02b3
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            if (r1 == 0) goto L_0x02b3
            X.Jqm r3 = r1.A02
            if (r3 == 0) goto L_0x02b3
            java.lang.Object r0 = r13.A03
            X.0i6 r0 = (X.C10300i6) r0
            X.Jj9 r2 = X.C18210wN.A0L(r0)
            r0 = 2131834998(0x7f113876, float:1.9303122E38)
            X.C18230wP.A10(r5, r2, r0)
            r9 = 0
            r7 = 0
            r11 = 4095(0xfff, float:5.738E-42)
            X.17a r6 = new X.17a
            r8 = r7
            r10 = r9
            r12 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0 = 2131232411(0x7f08069b, float:1.808093E38)
            r6.A02 = r0
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131821803(0x7f1104eb, float:1.927636E38)
            java.lang.String r0 = X.C18190wL.A0g(r1, r0)
            r6.A07 = r0
            java.lang.Object r1 = r13.A00
            r0 = 66
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r0 = X.C18210wN.A0H(r1, r0)
            r6.A04 = r0
            X.JPd r0 = r6.A01()
            r2.A0F = r0
            java.lang.Object r0 = r13.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r3.A09(r0, r2)
        L_0x02b3:
            r0 = 317276593(0x12e941b1, float:1.4720561E-27)
        L_0x02b6:
            X.C14030oh.A0C(r0, r4)
            return
        L_0x02ba:
            r0 = -1463775179(0xffffffffa8c09035, float:-2.1378822E-14)
            int r3 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r13.A00
            X.1jp r0 = (X.C24681jp) r0
            com.instagram.service.session.UserSession r1 = r0.A07
            X.0kW r0 = r0.A03
            X.0nS r1 = X.C13330nS.A01(r0, r1)
            java.lang.String r0 = "inline_ci_upsell_dismissed"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1578(0x62a, float:2.211E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            r0.Bb4()
            java.lang.Object r4 = r13.A03
            com.instagram.service.session.UserSession r4 = (com.instagram.service.session.UserSession) r4
            java.lang.Object r2 = r13.A01
            X.3D4 r2 = (X.AnonymousClass3D4) r2
            com.instagram.share.facebook.widget.FindPeopleButton r1 = r2.A02
            java.lang.Object r0 = r13.A02
            X.39E r0 = (X.AnonymousClass39E) r0
            X.C67103ys.A00(r4, r1, r2, r0)
            r0 = -1916988357(0xffffffff8dbd143b, float:-1.1652895E-30)
            goto L_0x0343
        L_0x02f1:
            r0 = 1135839654(0x43b389a6, float:359.07538)
            int r3 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r13.A00
            android.content.Context r0 = (android.content.Context) r0
            X.Dsm r2 = X.C18190wL.A0W(r0)
            r0 = 2131830134(0x7f112576, float:1.9293257E38)
            r2.A0L(r0)
            r0 = 2131830133(0x7f112575, float:1.9293255E38)
            r2.A0K(r0)
            r1 = 2131824237(0x7f110e6d, float:1.9281296E38)
            r0 = 184(0xb8, float:2.58E-43)
            X.C18180wK.A1O(r2, r13, r0, r1)
            X.C18200wM.A1P(r2)
            X.AnonymousClass0wJ.A1K(r2)
            r0 = -1852199532(0xffffffff9199ad94, float:-2.424612E-28)
            goto L_0x0343
        L_0x031e:
            r0 = -1502699126(0xffffffffa66ea18a, float:-8.2791764E-16)
            int r3 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r13.A03
            X.0i6 r5 = (X.C10300i6) r5
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            java.lang.Object r2 = r13.A00
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.Object r1 = r13.A02
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "quiet_mode_settings"
            X.3iT r1 = X.C63863iT.A04(r1, r2, r5, r4, r0)
            java.lang.Object r0 = r13.A01
            android.content.Context r0 = (android.content.Context) r0
            r1.A0I(r0)
            r0 = -763555870(0xffffffffd27d0fe2, float:-2.71723299E11)
        L_0x0343:
            X.C14030oh.A0C(r0, r3)
            return
        L_0x0347:
            X.C18240wQ.A0o()
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape15S0400000_1_I2.onClick(android.view.View):void");
    }

    public static final void A00(IDxCListenerShape15S0400000_1_I2 iDxCListenerShape15S0400000_1_I2) {
        int A05 = C14030oh.A05(-1270238589);
        C201413h r5 = (C201413h) iDxCListenerShape15S0400000_1_I2.A01;
        EditPhoneNumberView editPhoneNumberView = r5.A00;
        editPhoneNumberView.getClass();
        try {
            PhoneNumberUtil phoneNumberUtil = editPhoneNumberView.A09;
            if (phoneNumberUtil.A0G(phoneNumberUtil.A0A(editPhoneNumberView.getPhoneNumber(), (String) null))) {
                HashMap A0y = AnonymousClass0wJ.A0y();
                A0y.put("custom_param_phone_number", r5.A00.getPhoneNumber());
                ((C84844tx) iDxCListenerShape15S0400000_1_I2.A03).CE9((C28291u0) iDxCListenerShape15S0400000_1_I2.A02, AnonymousClass006.A01, A0y);
                C14030oh.A0C(-1552636634, A05);
            }
        } catch (C32122Ah unused) {
        }
        Context A0B = C18240wQ.A0B(r5);
        EditPhoneNumberView editPhoneNumberView2 = r5.A00;
        editPhoneNumberView2.A05.A05(A0B.getString(2131829204));
        C14030oh.A0C(-1552636634, A05);
    }

    public static final void A01(IDxCListenerShape15S0400000_1_I2 iDxCListenerShape15S0400000_1_I2) {
        int A05 = C14030oh.A05(1133138824);
        UserSession userSession = (UserSession) iDxCListenerShape15S0400000_1_I2.A02;
        ((C202413u) iDxCListenerShape15S0400000_1_I2.A03).A00.BhN(C18240wQ.A0I(iDxCListenerShape15S0400000_1_I2.A00), userSession, (User) iDxCListenerShape15S0400000_1_I2.A01, "branded_content_people_cell");
        C14030oh.A0C(-405276580, A05);
    }

    public static final void A02(IDxCListenerShape15S0400000_1_I2 iDxCListenerShape15S0400000_1_I2) {
        int A05 = C14030oh.A05(1720064328);
        UserSession userSession = (UserSession) iDxCListenerShape15S0400000_1_I2.A02;
        ((C202413u) iDxCListenerShape15S0400000_1_I2.A03).A00.BhN(C18240wQ.A0I(iDxCListenerShape15S0400000_1_I2.A00), userSession, (User) iDxCListenerShape15S0400000_1_I2.A01, "branded_content_people_cell");
        C14030oh.A0C(661810839, A05);
    }
}
