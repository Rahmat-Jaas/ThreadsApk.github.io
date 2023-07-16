package com.instagram.request;

import X.AnonymousClass9UH;
import X.C12560m7;

public class IDxDCallbackShape173S0100000_1_I2 extends AnonymousClass9UH {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxDCallbackShape173S0100000_1_I2(C12560m7 r1, Object obj, int i) {
        super(r1);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0185, code lost:
        r0 = "twoFacResponseBundle";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0187, code lost:
        X.C04220Ms.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x018b, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        X.C14030oh.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.AnonymousClass3XX r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x0170;
                case 1: goto L_0x015b;
                case 2: goto L_0x013f;
                case 3: goto L_0x0116;
                case 4: goto L_0x00ea;
                case 5: goto L_0x00d3;
                case 6: goto L_0x00bc;
                case 7: goto L_0x009d;
                case 8: goto L_0x0080;
                case 9: goto L_0x0062;
                case 10: goto L_0x004e;
                case 11: goto L_0x0036;
                case 12: goto L_0x001e;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = -534812250(0xffffffffe01f69a6, float:-4.594758E19)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            com.instagram.ui.text.IDxCSpanShape63S0200000_1_I2 r0 = (com.instagram.ui.text.IDxCSpanShape63S0200000_1_I2) r0
            java.lang.Object r0 = r0.A00
            android.content.Context r0 = (android.content.Context) r0
            X.C62973bE.A02(r0, r6)
            r0 = 1116569560(0x428d7fd8, float:70.749695)
        L_0x001a:
            X.C14030oh.A0A(r0, r3)
            return
        L_0x001e:
            r0 = -164061601(0xfffffffff6389e5f, float:-9.361277E32)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r0 = (com.facebook.redex.IDxCListenerShape217S0100000_1_I2) r0
            java.lang.Object r0 = r0.A00
            android.content.Context r0 = X.C18220wO.A0A(r0)
            X.C62973bE.A02(r0, r6)
            r0 = -1198379557(0xffffffffb8922ddb, float:-6.970364E-5)
            goto L_0x001a
        L_0x0036:
            r0 = -1738846019(0xffffffff985b50bd, float:-2.8345849E-24)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r0 = (com.facebook.redex.IDxCListenerShape217S0100000_1_I2) r0
            java.lang.Object r0 = r0.A00
            android.content.Context r0 = X.C18220wO.A0A(r0)
            X.C62973bE.A02(r0, r6)
            r0 = -917149144(0xffffffffc9556a28, float:-874146.5)
            goto L_0x001a
        L_0x004e:
            r0 = 664915958(0x27a1cff6, float:4.491195E-15)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r5.A00
            X.1aX r1 = (X.AnonymousClass1aX) r1
            java.lang.Integer r0 = X.AnonymousClass006.A01
            X.AnonymousClass1aX.A03(r1, r0)
            r0 = 1821994963(0x6c996fd3, float:1.4839498E27)
            goto L_0x001a
        L_0x0062:
            r0 = -668679187(0xffffffffd824c3ed, float:-7.2464561E14)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r5.A00
            X.1Y5 r2 = (X.AnonymousClass1Y5) r2
            com.instagram.login.twofac.model.TrustedDevice r1 = r2.A00
            if (r1 != 0) goto L_0x0075
            java.lang.String r0 = "trustedDevice"
            goto L_0x0187
        L_0x0075:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            r1.A03 = r0
            X.C18180wK.A14(r2)
            r0 = 645696944(0x267c8db0, float:8.7622086E-16)
            goto L_0x001a
        L_0x0080:
            r0 = 1914468769(0x721c79a1, float:3.099309E30)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r5.A00
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            android.content.Context r0 = r1.getContext()
            if (r0 == 0) goto L_0x0098
            android.content.Context r0 = r1.requireContext()
            X.C62973bE.A01(r0)
        L_0x0098:
            r0 = 1401170522(0x53842a5a, float:1.13529245E12)
            goto L_0x001a
        L_0x009d:
            r0 = -1096137976(0xffffffffbeaa4308, float:-0.33254266)
            int r3 = X.AnonymousClass0wJ.A00(r0, r6)
            java.lang.Object r2 = r5.A00
            X.1wc r2 = (X.C29041wc) r2
            android.content.Context r1 = r2.requireContext()
            X.0Oa r0 = r2.A01
            r0.getValue()
            X.C62973bE.A02(r1, r6)
            X.C29041wc.A0B(r2)
            r0 = 1931303853(0x731d5bad, float:1.2467194E31)
            goto L_0x001a
        L_0x00bc:
            r0 = 1184788649(0x469e70a9, float:20280.33)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            android.content.Context r0 = X.C18240wQ.A0C(r0)
            if (r0 == 0) goto L_0x00ce
            X.C62973bE.A01(r0)
        L_0x00ce:
            r0 = -1922228697(0xffffffff8d6d1e27, float:-7.306756E-31)
            goto L_0x001a
        L_0x00d3:
            r0 = -2094656073(0xffffffff832615b7, float:-4.8807943E-37)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            android.content.Context r0 = X.C18240wQ.A0C(r0)
            if (r0 == 0) goto L_0x00e5
            X.C62973bE.A01(r0)
        L_0x00e5:
            r0 = -1283468468(0xffffffffb37fd34c, float:-5.9563988E-8)
            goto L_0x001a
        L_0x00ea:
            r0 = 469772507(0x1c0028db, float:4.240445E-22)
            int r3 = X.C14030oh.A03(r0)
            r4 = 0
            X.C04220Ms.A0B(r6, r4)
            java.lang.Object r2 = r5.A00
            X.1xY r2 = (X.C29231xY) r2
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            X.0Oa r0 = r2.A07
            r0.getValue()
            X.C62973bE.A02(r1, r6)
            android.os.Bundle r1 = r2.A00
            if (r1 == 0) goto L_0x0185
            java.lang.String r0 = "is_whatsapp_two_factor_enabled"
            r1.putBoolean(r0, r4)
            X.C29231xY.A0B(r2)
            r0 = -1843423430(0xffffffff921f973a, float:-5.0357955E-28)
            goto L_0x001a
        L_0x0116:
            r0 = -19859698(0xfffffffffed0f70e, float:-1.388811E38)
            int r3 = X.AnonymousClass0wJ.A00(r0, r6)
            java.lang.Object r4 = r5.A00
            X.1xY r4 = (X.C29231xY) r4
            android.os.Bundle r2 = r4.A00
            if (r2 == 0) goto L_0x0185
            r1 = 1
            java.lang.String r0 = "is_whatsapp_two_factor_enabled"
            r2.putBoolean(r0, r1)
            X.C29231xY.A0B(r4)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.0Oa r0 = r4.A07
            r0.getValue()
            X.C62973bE.A02(r1, r6)
            r0 = 517604309(0x1eda03d5, float:2.3083233E-20)
            goto L_0x001a
        L_0x013f:
            r0 = -438116032(0xffffffffe5e2e140, float:-1.3392624E23)
            int r3 = X.AnonymousClass0wJ.A00(r0, r6)
            java.lang.Object r0 = r5.A00
            X.1bx r0 = (X.C23121bx) r0
            android.content.Context r1 = r0.requireContext()
            X.0Oa r0 = r0.A08
            r0.getValue()
            X.C62973bE.A02(r1, r6)
            r0 = -812940148(0xffffffffcf8b848c, float:-4.6814392E9)
            goto L_0x001a
        L_0x015b:
            r0 = 58341807(0x37a39af, float:7.3534614E-37)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            android.content.Context r0 = X.C18240wQ.A0C(r0)
            X.C62973bE.A02(r0, r6)
            r0 = -27678484(0xfffffffffe59a8ec, float:-7.232989E37)
            goto L_0x001a
        L_0x0170:
            r0 = 380380972(0x16ac272c, float:2.781282E-25)
            int r3 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r5.A00
            android.content.Context r0 = X.C18220wO.A0A(r0)
            X.C62973bE.A01(r0)
            r0 = 1992905889(0x76c954a1, float:2.0417347E33)
            goto L_0x001a
        L_0x0185:
            java.lang.String r0 = "twoFacResponseBundle"
        L_0x0187:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.request.IDxDCallbackShape173S0100000_1_I2.onFail(X.3XX):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003f, code lost:
        X.C14030oh.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0295, code lost:
        r0 = "twoFacResponseBundle";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x02bc, code lost:
        X.C04220Ms.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x02c0, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0042, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x039b;
                case 1: goto L_0x0302;
                case 2: goto L_0x0298;
                case 3: goto L_0x026b;
                case 4: goto L_0x01f8;
                case 5: goto L_0x01b2;
                case 6: goto L_0x0192;
                case 7: goto L_0x0165;
                case 8: goto L_0x0129;
                case 9: goto L_0x00fd;
                case 10: goto L_0x00b9;
                case 11: goto L_0x006c;
                case 12: goto L_0x0043;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = -393689188(0xffffffffe888c79c, float:-5.167392E24)
            int r3 = X.C14030oh.A03(r0)
            X.1U1 r13 = (X.AnonymousClass1U1) r13
            r0 = -292791087(0xffffffffee8c5cd1, float:-2.1720055E28)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r12.A00
            com.instagram.ui.text.IDxCSpanShape63S0200000_1_I2 r0 = (com.instagram.ui.text.IDxCSpanShape63S0200000_1_I2) r0
            java.lang.Object r1 = r0.A00
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            java.lang.Object r0 = r0.A01
            X.0i6 r0 = (X.C10300i6) r0
            X.Drz r2 = X.C18180wK.A0Q(r1, r0)
            X.3aT r0 = X.C62653aT.A02
            r0.A03()
            android.os.Bundle r1 = r13.A00()
            X.1wc r0 = new X.1wc
            r0.<init>()
            X.C18180wK.A0x(r1, r0, r2)
            r0 = 1439617085(0x55ced03d, float:2.84242215E13)
            X.C14030oh.A0A(r0, r4)
            r0 = 1404617778(0x53b8c432, float:1.58713119E12)
        L_0x003f:
            X.C14030oh.A0A(r0, r3)
            return
        L_0x0043:
            r0 = -24104681(0xfffffffffe903117, float:-9.583186E37)
            int r3 = X.C14030oh.A03(r0)
            X.1Tw r13 = (X.C22221Tw) r13
            r0 = 1513964055(0x5a3d4217, float:1.33178593E16)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r12.A00
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r0 = (com.facebook.redex.IDxCListenerShape217S0100000_1_I2) r0
            java.lang.Object r1 = r0.A00
            X.1aX r1 = (X.AnonymousClass1aX) r1
            java.lang.Integer r0 = r13.A00()
            X.AnonymousClass1aX.A03(r1, r0)
            r0 = -191471029(0xfffffffff496624b, float:-9.531716E31)
            X.C14030oh.A0A(r0, r2)
            r0 = -115268575(0xfffffffff9212421, float:-5.2293286E34)
            goto L_0x003f
        L_0x006c:
            r0 = -1960243234(0xffffffff8b290fde, float:-3.2560153E-32)
            int r3 = X.C14030oh.A03(r0)
            X.1Tw r13 = (X.C22221Tw) r13
            r0 = 1047466601(0x3e6f1269, float:0.23346867)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r12.A00
            com.facebook.redex.IDxCListenerShape217S0100000_1_I2 r0 = (com.facebook.redex.IDxCListenerShape217S0100000_1_I2) r0
            java.lang.Object r4 = r0.A00
            X.1aX r4 = (X.AnonymousClass1aX) r4
            java.lang.Integer r0 = r13.A00()
            X.AnonymousClass1aX.A03(r4, r0)
            X.3Vf r2 = X.C63463hW.A01()
            com.instagram.service.session.UserSession r1 = r4.A04
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            java.lang.String r0 = X.C36152Qf.A00(r0)
            androidx.fragment.app.Fragment r2 = r2.A04(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            com.instagram.service.session.UserSession r0 = r4.A04
            X.Drz r1 = X.C18180wK.A0Q(r1, r0)
            r1.A03 = r2
            r0 = 168(0xa8, float:2.35E-43)
            r1.A0C(r4, r0)
            r1.A05()
            r0 = -646326362(0xffffffffd979d7a6, float:-4.39527357E15)
            X.C14030oh.A0A(r0, r5)
            r0 = -746955234(0xffffffffd37a5e1e, float:-1.07532085E12)
            goto L_0x003f
        L_0x00b9:
            r0 = -1887749820(0xffffffff8f7b3944, float:-1.23862844E-29)
            int r3 = X.C14030oh.A03(r0)
            X.1Tw r13 = (X.C22221Tw) r13
            r0 = 530177894(0x1f99df66, float:6.51676E-20)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Integer r1 = r13.A00()
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            java.lang.Object r4 = r12.A00
            X.1aX r4 = (X.AnonymousClass1aX) r4
            if (r1 == r0) goto L_0x00e5
            java.lang.Integer r0 = X.AnonymousClass006.A00
            X.AnonymousClass1aX.A03(r4, r0)
        L_0x00da:
            r0 = 204965027(0xc3784a3, float:1.4137721E-31)
            X.C14030oh.A0A(r0, r5)
            r0 = -1157866202(0xffffffffbafc5d26, float:-0.0019253835)
            goto L_0x003f
        L_0x00e5:
            android.content.Context r2 = r4.requireContext()
            java.lang.Integer r0 = r4.A05
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x00f9
            r0 = 2
            if (r1 != r0) goto L_0x00da
            X.AnonymousClass1aX.A02(r2, r4)
            goto L_0x00da
        L_0x00f9:
            X.AnonymousClass1aX.A01(r2, r4)
            goto L_0x00da
        L_0x00fd:
            r0 = 1860956107(0x6eebefcb, float:3.6509435E28)
            int r3 = X.C14030oh.A03(r0)
            r0 = 210150426(0xc86a41a, float:2.0744734E-31)
            int r4 = X.C14030oh.A03(r0)
            java.lang.Object r2 = r12.A00
            X.1Y5 r2 = (X.AnonymousClass1Y5) r2
            com.instagram.login.twofac.model.TrustedDevice r1 = r2.A00
            if (r1 != 0) goto L_0x0117
            java.lang.String r0 = "trustedDevice"
            goto L_0x02bc
        L_0x0117:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r1.A03 = r0
            X.C18180wK.A14(r2)
            r0 = -598128457(0xffffffffdc5948b7, float:-2.44640083E17)
            X.C14030oh.A0A(r0, r4)
            r0 = 2144676297(0x7fd529c9, float:NaN)
            goto L_0x003f
        L_0x0129:
            r0 = 1460078330(0x570706fa, float:1.48464034E14)
            int r3 = X.C14030oh.A03(r0)
            r0 = -340337762(0xffffffffebb6db9e, float:-4.4212322E26)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r12.A00
            X.1wW r4 = (X.AnonymousClass1wW) r4
            X.0Oa r0 = r4.A00
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.C62423Zt.A02(r0)
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "is_two_factor_enabled"
            r2 = 0
            r1.putBoolean(r0, r2)
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "is_whatsapp_two_factor_enabled"
            r1.putBoolean(r0, r2)
            X.AnonymousClass1wW.A0B(r4)
            r0 = -346128278(0xffffffffeb5e806a, float:-2.6898795E26)
            X.C14030oh.A0A(r0, r5)
            r0 = 97670843(0x5d256bb, float:1.9780165E-35)
            goto L_0x003f
        L_0x0165:
            r0 = -1262708164(0xffffffffb4bc9a3c, float:-3.512995E-7)
            int r3 = X.C14030oh.A03(r0)
            X.1St r13 = (X.C21941St) r13
            r0 = -454262833(0xffffffffe4ec7fcf, float:-3.490113E22)
            int r5 = X.AnonymousClass0wJ.A00(r0, r13)
            java.lang.Object r4 = r12.A00
            X.1wc r4 = (X.C29041wc) r4
            android.os.Bundle r2 = r4.A00
            if (r2 == 0) goto L_0x0295
            boolean r1 = r13.A00
            java.lang.String r0 = "is_trusted_notifications_enabled"
            r2.putBoolean(r0, r1)
            X.C29041wc.A0B(r4)
            r0 = -129318559(0xfffffffff84ac161, float:-1.6449471E34)
            X.C14030oh.A0A(r0, r5)
            r0 = 1548182484(0x5c4763d4, float:2.2449313E17)
            goto L_0x003f
        L_0x0192:
            r0 = -64949633(0xfffffffffc20f27f, float:-3.3427436E36)
            int r3 = X.C14030oh.A03(r0)
            r0 = 702148862(0x29d9f0fe, float:9.678541E-14)
            int r1 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r12.A00
            X.1wr r0 = (X.AnonymousClass1wr) r0
            r0.A0D()
            r0 = 565355613(0x21b2a45d, float:1.2105256E-18)
            X.C14030oh.A0A(r0, r1)
            r0 = -1650268912(0xffffffff9da2e510, float:-4.311789E-21)
            goto L_0x003f
        L_0x01b2:
            r0 = -1104832813(0xffffffffbe2596d3, float:-0.16170816)
            int r3 = X.C14030oh.A03(r0)
            r0 = -988159858(0xffffffffc519e08e, float:-2462.0347)
            int r7 = X.C14030oh.A03(r0)
            java.lang.Object r6 = r12.A00
            X.1wr r6 = (X.AnonymousClass1wr) r6
            X.0Oa r5 = r6.A02
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r5)
            X.C62423Zt.A02(r0)
            android.os.Bundle r1 = r6.A00
            if (r1 == 0) goto L_0x0295
            java.lang.String r0 = "is_totp_two_factor_enabled"
            r4 = 0
            r1.putBoolean(r0, r4)
            X.3Hi r2 = X.C62653aT.A01()
            r1 = 1
            java.lang.Integer r0 = X.AnonymousClass006.A0j
            androidx.fragment.app.Fragment r2 = r2.A01(r0, r1, r4)
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r5)
            X.AnonymousClass0wJ.A19(r2, r1, r0)
            r0 = -434433974(0xffffffffe61b104a, float:-1.8306682E23)
            X.C14030oh.A0A(r0, r7)
            r0 = -660152870(0xffffffffd8a6ddda, float:-1.4677742E15)
            goto L_0x003f
        L_0x01f8:
            r0 = 299545765(0x11dab4a5, float:3.4505666E-28)
            int r3 = X.C14030oh.A03(r0)
            X.1T5 r13 = (X.AnonymousClass1T5) r13
            r0 = 1077762395(0x403d595b, float:2.9585788)
            int r4 = X.C14030oh.A03(r0)
            r11 = 0
            X.C04220Ms.A0B(r13, r11)
            boolean r0 = r13.A01
            if (r0 == 0) goto L_0x0244
            X.3Hi r6 = X.C62653aT.A01()
            java.lang.Object r5 = r12.A00
            X.1xY r5 = (X.C29231xY) r5
            android.os.Bundle r7 = r5.requireArguments()
            android.os.Bundle r0 = r5.A00
            if (r0 == 0) goto L_0x0295
            java.lang.String r10 = X.C63833iQ.A08(r0)
            java.lang.Integer r8 = X.AnonymousClass006.A0C
            java.lang.Integer r9 = X.AnonymousClass006.A0Y
            androidx.fragment.app.Fragment r2 = r6.A00(r7, r8, r9, r10, r11)
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.0Oa r0 = r5.A07
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.AnonymousClass0wJ.A19(r2, r1, r0)
        L_0x0239:
            r0 = -1237848752(0xffffffffb637ed50, float:-2.740726E-6)
            X.C14030oh.A0A(r0, r4)
            r0 = -1595729529(0xffffffffa0e31987, float:-3.8472188E-19)
            goto L_0x003f
        L_0x0244:
            java.lang.Object r5 = r12.A00
            X.1xY r5 = (X.C29231xY) r5
            android.content.Context r2 = r5.requireContext()
            android.content.Context r1 = r5.requireContext()
            r0 = 2131826851(0x7f1118a3, float:1.9286598E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = r13.getErrorMessage()
            X.C62973bE.A04(r2, r0, r1)
            android.os.Bundle r1 = r5.A00
            if (r1 == 0) goto L_0x0295
            java.lang.String r0 = "is_whatsapp_two_factor_enabled"
            r1.putBoolean(r0, r11)
            X.C29231xY.A0B(r5)
            goto L_0x0239
        L_0x026b:
            r0 = -165294507(0xfffffffff625ce55, float:-8.407362E32)
            int r3 = X.C14030oh.A03(r0)
            r0 = -1898323679(0xffffffff8ed9e121, float:-5.371142E-30)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r4 = r12.A00
            X.1xY r4 = (X.C29231xY) r4
            android.os.Bundle r2 = r4.A00
            if (r2 == 0) goto L_0x0295
            r1 = 0
            java.lang.String r0 = "is_whatsapp_two_factor_enabled"
            r2.putBoolean(r0, r1)
            X.C29231xY.A0B(r4)
            r0 = -1415831966(0xffffffffab9c1e62, float:-1.10929E-12)
            X.C14030oh.A0A(r0, r5)
            r0 = 693578553(0x29572b39, float:4.777708E-14)
            goto L_0x003f
        L_0x0295:
            java.lang.String r0 = "twoFacResponseBundle"
            goto L_0x02bc
        L_0x0298:
            r0 = 865744120(0x339a34f8, float:7.180819E-8)
            int r3 = X.C14030oh.A03(r0)
            X.1U1 r13 = (X.AnonymousClass1U1) r13
            r0 = -1310643695(0xffffffffb1e12a11, float:-6.5531442E-9)
            int r5 = X.AnonymousClass0wJ.A00(r0, r13)
            java.lang.Object r6 = r12.A00
            X.1bx r6 = (X.C23121bx) r6
            android.os.Bundle r0 = r13.A00()
            r6.A00 = r0
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x02c1
            android.widget.TextView r2 = r6.A02
            if (r2 != 0) goto L_0x02e7
            java.lang.String r0 = "backupCodesTextView"
        L_0x02bc:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x02c1:
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x02f4
            boolean r0 = r13.A0B
            r4 = r0 ^ 1
            android.view.View r2 = r6.A01
            if (r2 != 0) goto L_0x02d0
            java.lang.String r0 = "divider"
            goto L_0x02bc
        L_0x02d0:
            r1 = 0
            int r0 = X.C18190wL.A00(r4)
            r2.setVisibility(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r6.A03
            if (r0 != 0) goto L_0x02df
            java.lang.String r0 = "nextButton"
            goto L_0x02bc
        L_0x02df:
            if (r4 != 0) goto L_0x02e3
            r1 = 8
        L_0x02e3:
            r0.setVisibility(r1)
            goto L_0x02f4
        L_0x02e7:
            java.util.ArrayList r1 = r13.A04
            if (r1 == 0) goto L_0x02ff
            java.lang.String r0 = "\n"
            java.lang.String r0 = X.C18200wM.A0l(r0, r1)
        L_0x02f1:
            r2.setText(r0)
        L_0x02f4:
            r0 = 542749596(0x2059b39c, float:1.8440043E-19)
            X.C14030oh.A0A(r0, r5)
            r0 = -1710412475(0xffffffff9a0d2d45, float:-2.9194685E-23)
            goto L_0x003f
        L_0x02ff:
            java.lang.String r0 = ""
            goto L_0x02f1
        L_0x0302:
            r0 = -631329532(0xffffffffda5ead04, float:-1.56694194E16)
            int r3 = X.C14030oh.A03(r0)
            X.1U1 r13 = (X.AnonymousClass1U1) r13
            r0 = 703637788(0x29f0a91c, float:1.0687477E-13)
            int r4 = X.C14030oh.A03(r0)
            boolean r0 = r13.A08
            r7 = 0
            if (r0 == 0) goto L_0x0344
            java.lang.Object r1 = r12.A00
            X.1co r1 = (X.C23231co) r1
            android.widget.TextView r0 = r1.A01
            r0.setVisibility(r7)
            android.widget.TextView r8 = r1.A01
            r0 = 2131837140(0x7f1140d4, float:1.9307467E38)
            java.lang.String r6 = r1.getString(r0)
            r0 = 2131837139(0x7f1140d3, float:1.9307465E38)
            java.lang.String r5 = r1.getString(r0)
            androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
            r0 = 2131100091(0x7f0601bb, float:1.7812554E38)
            int r2 = r1.getColor(r0)
            r1 = 6
            com.instagram.ui.text.IDxCSpanShape63S0200000_1_I2 r0 = new com.instagram.ui.text.IDxCSpanShape63S0200000_1_I2
            r0.<init>((int) r2, (int) r1, (java.lang.Object) r12, (java.lang.Object) r13)
            X.AnonymousClass3Zw.A03(r0, r8, r6, r5)
        L_0x0344:
            java.lang.Object r6 = r12.A00
            X.1co r6 = (X.C23231co) r6
            boolean r0 = r13.A0D
            if (r0 == 0) goto L_0x0390
            boolean r0 = r13.A0G
            r6.A0C = r0
            android.view.View r0 = r6.A00
            r0.setVisibility(r7)
            com.instagram.common.ui.base.IgTextView r0 = r6.A02
            r0.setVisibility(r7)
            com.instagram.common.ui.base.IgTextView r7 = r6.A02
            r0 = 2131829577(0x7f112349, float:1.9292127E38)
            java.lang.String r5 = r6.getString(r0)
            r0 = 2131835949(0x7f113c2d, float:1.930505E38)
            java.lang.String r2 = r6.getString(r0)
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            r0 = 2131100091(0x7f0601bb, float:1.7812554E38)
            int r1 = r1.getColor(r0)
            r0 = 29
            com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2 r0 = X.C18730xl.A00(r12, r1, r0)
            X.AnonymousClass3Zw.A03(r0, r7, r5, r2)
            com.instagram.igds.components.switchbutton.IgSwitch r1 = r6.A03
            boolean r0 = r6.A0C
            r1.setChecked(r0)
            com.instagram.igds.components.switchbutton.IgSwitch r2 = r6.A03
            r1 = 17
            com.facebook.redex.IDxTListenerShape295S0100000_1_I2 r0 = new com.facebook.redex.IDxTListenerShape295S0100000_1_I2
            r0.<init>(r12, r1)
            r2.A07 = r0
        L_0x0390:
            r0 = 1045613557(0x3e52cbf5, float:0.20585616)
            X.C14030oh.A0A(r0, r4)
            r0 = 2025419401(0x78b97289, float:3.0090561E34)
            goto L_0x003f
        L_0x039b:
            r0 = -886274652(0xffffffffcb2c85a4, float:-1.1306404E7)
            int r3 = X.C14030oh.A03(r0)
            X.4vm r13 = (X.C85794vm) r13
            r0 = -1795983211(0xffffffff94f37895, float:-2.4584291E-26)
            int r5 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r13.D7H()
            X.33B r0 = (X.AnonymousClass33B) r0
            java.lang.Integer r0 = r0.A00
            if (r0 == 0) goto L_0x03ed
            java.lang.Object r0 = r13.D7H()
            X.33B r0 = (X.AnonymousClass33B) r0
            java.lang.Integer r0 = r0.A00
            int r0 = r0.intValue()
            long r1 = (long) r0
            java.util.Locale r4 = X.C31103Gfm.A02()
            java.lang.String r0 = "MM/dd/yy"
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
            r6.<init>(r0, r4)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r4.convert(r1, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r4 = r6.format(r0)
            java.lang.Object r2 = r12.A00
            X.1aw r2 = (X.AnonymousClass1aw) r2
            com.instagram.igds.components.form.IgFormField r1 = r2.A01
            r0 = 2131824693(0x7f111035, float:1.9282221E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0o(r2, r4, r0)
            r1.setLabelText(r0)
        L_0x03ed:
            r0 = 51925738(0x31852ea, float:4.4763966E-37)
            X.C14030oh.A0A(r0, r5)
            r0 = -1308777848(0xffffffffb1fda288, float:-7.3817468E-9)
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.request.IDxDCallbackShape173S0100000_1_I2.onSuccess(java.lang.Object):void");
    }
}
