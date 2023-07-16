package com.facebook.redex;

import X.C14030oh;
import X.C22771Zk;
import X.C58753Hb;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import ch.boye.httpclientandroidlib.util.LangUtils;

public class IDxCListenerShape14S1100000_1_I2 implements View.OnClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxCListenerShape14S1100000_1_I2(C22771Zk r1, String str, int i) {
        this.A02 = i;
        if (5 - i != 0) {
            this.A00 = r1;
            this.A01 = str;
        } else {
            this.A01 = str;
            this.A00 = r1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0498, code lost:
        X.C14030oh.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x049b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x04cc, code lost:
        X.C14030oh.A0C(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x04cf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x04f7, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A02
            switch(r0) {
                case 0: goto L_0x0009;
                case 1: goto L_0x002b;
                case 2: goto L_0x0045;
                case 3: goto L_0x0084;
                case 4: goto L_0x00bc;
                case 5: goto L_0x0182;
                case 6: goto L_0x00d1;
                case 7: goto L_0x0102;
                case 8: goto L_0x0136;
                case 9: goto L_0x0160;
                case 10: goto L_0x01a3;
                case 11: goto L_0x0200;
                case 12: goto L_0x0222;
                case 13: goto L_0x0242;
                case 14: goto L_0x04d0;
                case 15: goto L_0x0267;
                case 16: goto L_0x0298;
                case 17: goto L_0x0308;
                case 18: goto L_0x0336;
                case 19: goto L_0x037a;
                case 20: goto L_0x039e;
                case 21: goto L_0x03d2;
                case 22: goto L_0x0417;
                case 23: goto L_0x042b;
                case 24: goto L_0x044d;
                case 25: goto L_0x0477;
                case 26: goto L_0x049c;
                default: goto L_0x0005;
            }
        L_0x0005:
            A00(r12)
            return
        L_0x0009:
            r0 = -1420820408(0xffffffffab500048, float:-7.3896835E-13)
            int r6 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r12.A00
            X.3ak r5 = (X.C62793ak) r5
            java.lang.String r4 = r12.A01
            X.4qz r3 = X.AnonymousClass3J5.A00(r5)
            r2 = 0
            r0 = 25
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2
            r1.<init>(r5, r4, r2, r0)
            r0 = 3
            X.C25237DiI.A00(r2, r2, r1, r3, r0)
            r0 = -2065474947(0xffffffff84e35a7d, float:-5.3450544E-36)
            goto L_0x04cc
        L_0x002b:
            r0 = 1407778956(0x53e9008c, float:2.00147311E12)
            int r6 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r12.A00
            X.58F r2 = (X.AnonymousClass58F) r2
            java.lang.String r1 = r12.A01
            X.1eZ r0 = new X.1eZ
            r0.<init>(r1)
            X.AnonymousClass58F.A02(r0, r2)
            r0 = -1425083664(0xffffffffab0ef2f0, float:-5.078568E-13)
            goto L_0x04cc
        L_0x0045:
            r0 = -204087686(0xfffffffff3d5de7a, float:-3.3888904E31)
            int r6 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r12.A00
            X.1c2 r4 = (X.AnonymousClass1c2) r4
            java.lang.String r2 = r12.A01
            androidx.fragment.app.FragmentActivity r3 = r4.getActivity()
            r3.getClass()
            com.instagram.service.session.UserSession r0 = r4.A0B
            java.lang.String r0 = r0.token
            android.os.Bundle r1 = X.C18180wK.A06()
            X.C18190wL.A13(r1, r0)
            java.lang.String r0 = "VideoPreviewFragment.videoPath"
            r1.putString(r0, r2)
            X.9Pg r2 = new X.9Pg
            r2.<init>()
            r2.setArguments(r1)
            com.instagram.service.session.UserSession r0 = r4.A0B
            X.Drz r1 = X.C18180wK.A0Q(r3, r0)
            r1.A03 = r2
            r0 = 1
            r1.A0D = r0
            r1.A05()
            r0 = 256218355(0xf4594f3, float:9.7415365E-30)
            goto L_0x04cc
        L_0x0084:
            r0 = 623369861(0x2527de85, float:1.4560334E-16)
            int r6 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r12.A00
            X.1c2 r4 = (X.AnonymousClass1c2) r4
            java.lang.String r2 = r12.A01
            androidx.fragment.app.FragmentActivity r3 = r4.getActivity()
            r3.getClass()
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "ImageAnnotationFragment.imagePath"
            r1.putString(r0, r2)
            X.1ZW r2 = new X.1ZW
            r2.<init>()
            r2.setArguments(r1)
            com.instagram.service.session.UserSession r0 = r4.A0B
            X.Drz r1 = X.C18180wK.A0Q(r3, r0)
            r1.A03 = r2
            r0 = 1
            r1.A0D = r0
            r1.A05()
            r0 = -1124313333(0xffffffffbcfc570b, float:-0.030803224)
            goto L_0x04cc
        L_0x00bc:
            r0 = -401348968(0xffffffffe813e698, float:-2.7937663E24)
            int r6 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r12.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.String r0 = r12.A01
            r1.invoke(r0)
            r0 = -1646234758(0xffffffff9de0737a, float:-5.9411706E-21)
            goto L_0x04cc
        L_0x00d1:
            r0 = 752403882(0x2cd8c5aa, float:6.1610344E-12)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r12.A00
            X.1Zk r1 = (X.C22771Zk) r1
            X.0Oa r0 = r1.A08
            java.lang.Object r4 = r0.getValue()
            X.10G r4 = (X.AnonymousClass10G) r4
            java.lang.String r5 = X.C18220wO.A0j(r1)
            java.lang.String r6 = r12.A01
            r0 = 1
            X.C04220Ms.A0B(r6, r0)
            X.4qz r1 = X.AnonymousClass3J5.A00(r4)
            r7 = 0
            r8 = 6
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S2101000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S2101000_I2
            r3.<init>((X.AnonymousClass10G) r4, (java.lang.String) r5, (java.lang.String) r6, (X.C146958n9) r7, (int) r8)
            r0 = 3
            X.C25237DiI.A00(r7, r7, r3, r1, r0)
            r0 = 543324891(0x20627adb, float:1.9183594E-19)
            goto L_0x0498
        L_0x0102:
            r0 = 1070387325(0x3fccd07d, float:1.6001126)
            int r2 = X.C14030oh.A05(r0)
            android.os.Bundle r6 = X.C18180wK.A06()
            java.lang.String r1 = r12.A01
            java.lang.String r0 = "argument_event_id"
            r6.putString(r0, r1)
            java.lang.Object r5 = r12.A00
            X.1YL r5 = (X.AnonymousClass1YL) r5
            X.0Oa r0 = r5.A01
            X.0i6 r4 = X.AnonymousClass0wJ.A0U(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            java.lang.String r0 = "event_details_page"
            X.3iT r1 = X.C63863iT.A05(r1, r6, r4, r3, r0)
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            r1.A0I(r0)
            r0 = -1997906901(0xffffffff88ea5c2b, float:-1.4105031E-33)
            goto L_0x0498
        L_0x0136:
            r0 = -1551707913(0xffffffffa382d0f7, float:-1.4183128E-17)
            int r6 = X.C14030oh.A05(r0)
            X.GVD r1 = X.C25745DrH.A00
            java.lang.Object r0 = r12.A00
            android.app.Activity r0 = (android.app.Activity) r0
            X.DrH r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0157
            X.Jqm r2 = X.C37383Jqm.A02(r0)
            if (r2 == 0) goto L_0x0157
            java.lang.String r1 = r12.A01
            if (r1 == 0) goto L_0x015c
            r0 = 0
            r2.A0G(r1, r0)
        L_0x0157:
            r0 = -2112150332(0xffffffff821b24c4, float:-1.1398153E-37)
            goto L_0x04cc
        L_0x015c:
            r2.A06()
            goto L_0x0157
        L_0x0160:
            r0 = 1381085716(0x5251b214, float:2.25158955E11)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r12.A00
            X.3ak r6 = (X.C62793ak) r6
            X.4qz r5 = X.AnonymousClass3J5.A00(r6)
            java.lang.String r4 = r12.A01
            r3 = 0
            r0 = 15
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S1101000_I2_1 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S1101000_I2_1
            r1.<init>(r6, r4, r3, r0)
            r0 = 3
            X.C25237DiI.A00(r3, r3, r1, r5, r0)
            r0 = -688292115(0xffffffffd6f97eed, float:-1.37161769E14)
            goto L_0x0498
        L_0x0182:
            r0 = 808535410(0x30314572, float:6.449091E-10)
            int r2 = X.C14030oh.A05(r0)
            java.lang.String r0 = r12.A01
            if (r0 == 0) goto L_0x019e
            java.lang.Object r0 = r12.A00
            X.1Zk r0 = (X.C22771Zk) r0
            r0.requireActivity()
            X.0Oa r0 = r0.A07
            r0.getValue()
            X.C18240wQ.A0o()
            goto L_0x04f6
        L_0x019e:
            r0 = -253200269(0xfffffffff0e87873, float:-5.755691E29)
            goto L_0x0498
        L_0x01a3:
            r0 = 1515547362(0x5a556ae2, float:1.50179222E16)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r12.A00
            X.1fP r1 = (X.AnonymousClass1fP) r1
            com.instagram.service.session.UserSession r0 = r1.A07
            r11 = 0
            com.instagram.bloks.hosting.IgBloksScreenConfig r10 = X.C18190wL.A0N(r0)
            X.1U8 r0 = r1.A05
            java.lang.String r0 = r0.A08
            r10.A0S = r0
            java.lang.String r9 = "com.bloks.www.bloks.crowdsourcing.suggestedits"
            r10.A0P = r9
            android.content.Context r8 = r1.A03
            java.util.HashMap r7 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r6 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r5 = X.AnonymousClass0wJ.A0y()
            r4 = 1
            java.util.BitSet r3 = new java.util.BitSet
            r3.<init>(r4)
            java.lang.String r1 = r12.A01
            java.lang.String r0 = "page_id"
            r7.put(r0, r1)
            r0 = 0
            r3.set(r0)
            int r0 = r3.nextClearBit(r0)
            if (r0 < r4) goto L_0x01f9
            X.3iE r0 = X.C63743iE.A03(r9, r7, r6)
            r0.A03 = r11
            r0.A02 = r11
            r0.A04 = r11
            r0.A0G(r5)
            r0.A0C(r8, r10)
            r0 = 1413820543(0x5445307f, float:3.38768875E12)
            goto L_0x0498
        L_0x01f9:
            java.lang.String r0 = "Missing Required Props"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0200:
            r0 = 568713102(0x21e5df8e, float:1.5576818E-18)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r12.A00
            androidx.recyclerview.widget.IDxAdapterShape3S0300000_1_I2 r0 = (androidx.recyclerview.widget.IDxAdapterShape3S0300000_1_I2) r0
            java.lang.Object r0 = r0.A00
            X.3GA r0 = (X.AnonymousClass3GA) r0
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r0.A06
            java.lang.String r0 = r12.A01
            r1.setText(r0)
            int r0 = r0.length()
            r1.setSelection(r0)
            r0 = 1423665707(0x54db6a2b, float:7.5390323E12)
            goto L_0x0498
        L_0x0222:
            r0 = 1232953412(0x497d6044, float:1037828.25)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r12.A00
            X.1wA r3 = (X.AnonymousClass1wA) r3
            X.3EX r1 = r3.A05
            X.29m r0 = X.C319229m.MANUAL_UPDATE
            r1.A00(r0)
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            java.lang.String r0 = r12.A01
            X.C37412JrW.A01(r1, r0)
            r0 = 1453514356(0x56a2de74, float:8.9538156E13)
            goto L_0x0498
        L_0x0242:
            java.lang.Object r1 = r12.A00
            X.3YG r1 = (X.AnonymousClass3YG) r1
            java.lang.String r4 = r12.A01
            com.instagram.service.session.UserSession r3 = r1.A05
            X.C62423Zt.A02(r3)
            java.lang.String r0 = "video_subtitles_settings_entered"
            X.C62423Zt.A03(r3, r4, r0)
            androidx.fragment.app.FragmentActivity r0 = r1.A01
            X.Drz r2 = X.AnonymousClass0wJ.A0Q(r0, r3)
            X.C18190wL.A10()
            r1 = 1
            r0 = 0
            X.1wn r0 = X.C29141wn.A0B(r3, r4, r0, r1, r0)
            r2.A03 = r0
            r2.A05()
            return
        L_0x0267:
            r0 = -1243056436(0xffffffffb5e876cc, float:-1.7319921E-6)
            int r2 = X.C14030oh.A05(r0)
            java.lang.String r3 = r12.A01
            java.lang.Object r5 = r12.A00
            X.3z5 r5 = (X.C67193z5) r5
            com.instagram.service.session.UserSession r4 = r5.A04
            java.lang.String r1 = "promotion_payments_entered_from_business_settings"
            r0 = 0
            X.C62423Zt.A01(r0, r4, r3, r1, r0)
            X.C18190wL.A10()
            X.Ipr r3 = new X.Ipr
            r3.<init>()
            com.instagram.base.activity.BaseFragmentActivity r0 = r5.A01
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r0, r4)
            r1.A03 = r3
            java.lang.String r0 = "PromotePaymentsInterstitialFragment.BACK_STACK_NAME"
            r1.A07 = r0
            r1.A05()
            r0 = 1452960107(0x569a696b, float:8.4888779E13)
            goto L_0x0498
        L_0x0298:
            r0 = -667167020(0xffffffffd83bd6d4, float:-8.2612542E14)
            int r6 = X.C14030oh.A05(r0)
            java.lang.String r0 = r12.A01
            android.net.Uri r2 = X.C15430rJ.A01(r0)
            java.lang.String r0 = r2.getPath()
            if (r0 == 0) goto L_0x0303
            java.lang.String r1 = r2.getPath()
            java.lang.String r0 = "bloks"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0303
            java.lang.Object r5 = r12.A00
            X.1xe r5 = (X.C29261xe) r5
            java.lang.String r0 = "bloks_app_id"
            java.lang.String r4 = r2.getQueryParameter(r0)
            java.lang.String r0 = "params"
            java.lang.String r3 = r2.getQueryParameter(r0)
            android.content.Context r0 = r5.getContext()
            if (r4 == 0) goto L_0x0303
            if (r0 == 0) goto L_0x0303
            X.0wh r2 = X.C18330wh.A00(r0)
            r0 = 0
            r2.setCancelable(r0)
            X.C13950oZ.A00(r2)
            com.instagram.service.session.UserSession r1 = r5.A02
            if (r3 == 0) goto L_0x02eb
            X.0Ot r0 = X.C04690Os.A02     // Catch:{ IOException -> 0x02f0 }
            X.0Os r0 = r0.A04(r1, r3)     // Catch:{ IOException -> 0x02f0 }
            java.util.HashMap r0 = X.AnonymousClass2LR.A00(r0)     // Catch:{ IOException -> 0x02f0 }
            if (r0 == 0) goto L_0x02eb
            goto L_0x02f7
        L_0x02eb:
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()     // Catch:{ IOException -> 0x02f0 }
            goto L_0x02f7
        L_0x02f0:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x02f7:
            X.4A9 r1 = X.C63263h8.A00(r1, r4, r0)
            r0 = 19
            X.AnonymousClass4A9.A01(r1, r2, r5, r0)
            r5.schedule(r1)
        L_0x0303:
            r0 = 1726302687(0x66e549df, float:5.413923E23)
            goto L_0x04cc
        L_0x0308:
            r0 = 1608974849(0x5fe70201, float:3.3291737E19)
            int r2 = X.C14030oh.A05(r0)
            java.lang.String r5 = r12.A01
            java.lang.Object r4 = r12.A00
            X.3Hb r4 = (X.C58753Hb) r4
            com.instagram.service.session.UserSession r3 = r4.A05
            X.0kW r1 = r4.A04
            java.lang.String r0 = "account_settings_entered"
            X.C62423Zt.A00(r1, r3, r5, r0)
            com.instagram.base.activity.IgFragmentActivity r0 = r4.A03
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r0, r3)
            X.C18190wL.A10()
            X.1wm r0 = new X.1wm
            r0.<init>()
            r1.A03 = r0
            r1.A05()
            r0 = -2075890132(0xffffffff84446e2c, float:-2.3090278E-36)
            goto L_0x0498
        L_0x0336:
            r0 = 459749912(0x1b673a18, float:1.9126643E-22)
            int r6 = X.C14030oh.A05(r0)
            java.lang.String r2 = r12.A01
            java.lang.Object r4 = r12.A00
            X.3Hb r4 = (X.C58753Hb) r4
            com.instagram.service.session.UserSession r3 = r4.A05
            X.0kW r1 = r4.A04
            java.lang.String r0 = "ads_settings_entered"
            X.C62423Zt.A00(r1, r3, r2, r0)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36316409504795752(0x810595000d0c68, double:3.029981833051761E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0366
            X.1x2 r2 = r4.A06
            r1 = 0
            java.lang.String r0 = "ad_preferences"
            X.C63013bK.A02(r2, r3, r0, r0, r1)
        L_0x0361:
            r0 = 1062963269(0x3f5b8845, float:0.85754806)
            goto L_0x04cc
        L_0x0366:
            com.instagram.base.activity.IgFragmentActivity r0 = r4.A03
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r0, r3)
            X.C18190wL.A10()
            X.1wh r0 = new X.1wh
            r0.<init>()
            r1.A03 = r0
            r1.A05()
            goto L_0x0361
        L_0x037a:
            r0 = -518660934(0xffffffffe115dcba, float:-1.7277937E20)
            int r2 = X.C14030oh.A05(r0)
            java.lang.String r5 = r12.A01
            java.lang.Object r4 = r12.A00
            X.3Hb r4 = (X.C58753Hb) r4
            com.instagram.service.session.UserSession r3 = r4.A05
            X.0kW r1 = r4.A04
            java.lang.String r0 = "business_settings_entered"
            X.C62423Zt.A00(r1, r3, r5, r0)
            com.instagram.base.activity.IgFragmentActivity r0 = r4.A03
            X.Drz r0 = X.AnonymousClass0wJ.A0Q(r0, r3)
            X.C23411dm.A06(r0)
            r0 = -711396766(0xffffffffd598f262, float:-2.10208492E13)
            goto L_0x0498
        L_0x039e:
            r0 = -1583830322(0xffffffffa198aace, float:-1.0345132E-18)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r12.A00
            X.3Hb r6 = (X.C58753Hb) r6
            com.instagram.service.session.UserSession r5 = r6.A05
            java.lang.String r4 = "payment_settings_entered"
            X.C62423Zt.A02(r5)
            java.lang.String r3 = r12.A01
            X.0kW r1 = r6.A04
            r0 = 0
            X.C62423Zt.A01(r1, r5, r3, r4, r0)
            com.instagram.base.activity.IgFragmentActivity r0 = r6.A03
            X.Drz r3 = X.AnonymousClass0wJ.A0Q(r0, r5)
            X.C18190wL.A10()
            android.os.Bundle r1 = X.C18180wK.A06()
            com.instagram.settings.common.PaymentOptionsFragment r0 = new com.instagram.settings.common.PaymentOptionsFragment
            r0.<init>()
            X.C18180wK.A0x(r1, r0, r3)
            r0 = 1975403390(0x75be437e, float:4.8237564E32)
            goto L_0x0498
        L_0x03d2:
            r0 = -1013544495(0xffffffffc39689d1, float:-301.0767)
            int r2 = X.C14030oh.A05(r0)
            java.lang.String r3 = r12.A01
            java.lang.Object r6 = r12.A00
            X.3Hb r6 = (X.C58753Hb) r6
            com.instagram.service.session.UserSession r5 = r6.A05
            X.0kW r1 = r6.A04
            java.lang.String r0 = "security_settings_entered"
            X.C62423Zt.A00(r1, r5, r3, r0)
            X.0Oa r0 = r6.A09
            java.lang.Object r0 = r0.getValue()
            X.3F8 r0 = (X.AnonymousClass3F8) r0
            java.lang.String r4 = "security_and_login"
            r3 = 857808781(0x33211f8d, float:3.751443E-8)
            X.01V r1 = r0.A00
            r1.markerStart(r3)
            java.lang.String r0 = "node_identifier"
            r1.markerAnnotate((int) r3, (java.lang.String) r0, (java.lang.String) r4)
            com.instagram.base.activity.IgFragmentActivity r0 = r6.A03
            X.Drz r1 = X.AnonymousClass0wJ.A0Q(r0, r5)
            X.C18190wL.A10()
            X.1wk r0 = new X.1wk
            r0.<init>()
            r1.A03 = r0
            r1.A05()
            r0 = 1938937041(0x7391d4d1, float:2.3107894E31)
            goto L_0x0498
        L_0x0417:
            r0 = 1220231215(0x48bb402f, float:383489.47)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r12.A00
            X.1ir r1 = (X.C24471ir) r1
            java.lang.String r0 = r12.A01
            r1.A02(r0)
            r0 = -2128072378(0xffffffff81283146, float:-3.089208E-38)
            goto L_0x0498
        L_0x042b:
            r0 = -1510206421(0xffffffffa5fc142b, float:-4.3728698E-16)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r12.A00
            android.view.View r0 = (android.view.View) r0
            android.content.Context r4 = r0.getContext()
            java.lang.String r1 = r12.A01
            java.lang.String r0 = "email"
            X.C09830gl.A01(r4, r1, r0)
            r3 = 0
            r1 = 2131826738(0x7f111832, float:1.9286369E38)
            r0 = 0
            X.C63813iO.A03(r4, r3, r1, r0)
            r0 = -201571077(0xfffffffff3fc44fb, float:-3.997369E31)
            goto L_0x0498
        L_0x044d:
            r0 = 666077879(0x27b38ab7, float:4.9832875E-15)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r12.A00
            android.view.View r0 = (android.view.View) r0
            android.content.Context r5 = r0.getContext()
            java.lang.String r4 = r12.A01
            r3 = 43
            r1 = 12
            r0 = 14
            java.lang.String r0 = X.AnonymousClass3QC.A00(r3, r1, r0)
            X.C09830gl.A01(r5, r4, r0)
            r3 = 0
            r1 = 2131832465(0x7f112e91, float:1.9297985E38)
            r0 = 0
            X.C63813iO.A03(r5, r3, r1, r0)
            r0 = -1306028960(0xffffffffb2279460, float:-9.754416E-9)
            goto L_0x0498
        L_0x0477:
            r0 = 957262540(0x390eaacc, float:1.3605802E-4)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r12.A00
            android.view.View r0 = (android.view.View) r0
            android.content.Context r4 = r0.getContext()
            java.lang.String r1 = r12.A01
            java.lang.String r0 = "tax_id"
            X.C09830gl.A01(r4, r1, r0)
            r3 = 0
            r1 = 2131824415(0x7f110f1f, float:1.9281657E38)
            r0 = 0
            X.C63813iO.A03(r4, r3, r1, r0)
            r0 = -1348574659(0xffffffffaf9e623d, float:-2.8809835E-10)
        L_0x0498:
            X.C14030oh.A0C(r0, r2)
            return
        L_0x049c:
            r0 = -374670858(0xffffffffe9aaf9f6, float:-2.5837225E25)
            int r6 = X.C14030oh.A05(r0)
            java.lang.String r2 = r12.A01
            android.net.Uri r1 = android.net.Uri.parse(r2)
            java.lang.String r0 = r1.getScheme()
            if (r0 != 0) goto L_0x04b9
            java.lang.String r0 = "http://"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r2)
            android.net.Uri r1 = android.net.Uri.parse(r0)
        L_0x04b9:
            X.C04220Ms.A06(r1)
            java.lang.Object r2 = r12.A00
            X.4qh r2 = (X.C83044qh) r2
            java.lang.String r1 = X.C18190wL.A0n(r1)
            java.lang.String r0 = "fev_external_website"
            r2.CVi(r1, r0)
            r0 = -577082255(0xffffffffdd9a6c71, float:-1.39092413E18)
        L_0x04cc:
            X.C14030oh.A0C(r0, r6)
            return
        L_0x04d0:
            java.lang.Object r5 = r12.A00
            X.3YG r5 = (X.AnonymousClass3YG) r5
            java.lang.String r1 = r12.A01
            com.instagram.service.session.UserSession r4 = r5.A05
            java.lang.String r0 = "personal_information_entered"
            X.C62423Zt.A03(r4, r1, r0)
            X.3F8 r0 = new X.3F8
            r0.<init>(r4)
            java.lang.String r3 = "personal_info"
            r2 = 857808781(0x33211f8d, float:3.751443E-8)
            X.01V r1 = r0.A00
            r1.markerStart(r2)
            java.lang.String r0 = "node_identifier"
            r1.markerAnnotate((int) r2, (java.lang.String) r0, (java.lang.String) r3)
            androidx.fragment.app.FragmentActivity r0 = r5.A01
            X.C60113Ns.A01(r0, r4)
        L_0x04f6:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape14S1100000_1_I2.onClick(android.view.View):void");
    }

    public static final void A00(IDxCListenerShape14S1100000_1_I2 iDxCListenerShape14S1100000_1_I2) {
        int A05 = C14030oh.A05(1428160830);
        TextView textView = (TextView) iDxCListenerShape14S1100000_1_I2.A00;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setText(iDxCListenerShape14S1100000_1_I2.A01);
        C14030oh.A0C(267995053, A05);
    }

    public IDxCListenerShape14S1100000_1_I2(C58753Hb r1, String str, int i) {
        this.A02 = i;
        switch (i) {
            case LangUtils.HASH_SEED /*17*/:
            case 18:
            case 19:
            case 21:
                this.A01 = str;
                this.A00 = r1;
                break;
            default:
                this.A00 = r1;
                this.A01 = str;
                break;
        }
    }

    public IDxCListenerShape14S1100000_1_I2(String str, Object obj, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }
}
