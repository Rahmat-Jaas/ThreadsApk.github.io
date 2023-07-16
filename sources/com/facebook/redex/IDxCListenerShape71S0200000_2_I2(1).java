package com.facebook.redex;

import android.view.View;

public class IDxCListenerShape71S0200000_2_I2 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape71S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0a7e, code lost:
        if (r1 != r2) goto L_0x0a80;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0259, code lost:
        r4 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        X.C14030oh.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x11b9, code lost:
        X.C14030oh.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x11bc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0319, code lost:
        if (r1 == false) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0037, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x17b6, code lost:
        X.C04220Ms.A0E("mediaId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x17bc, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x1848, code lost:
        X.C04220Ms.A0E(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x184c, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x190b, code lost:
        r4 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x1927, code lost:
        X.C14030oh.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x192a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x1968, code lost:
        X.C14030oh.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x196b, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x098a  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x099d  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x09c3  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0c96  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0caa  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0cc6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r28) {
        /*
            r27 = this;
            r1 = r27
            int r0 = r1.A02
            r5 = r28
            switch(r0) {
                case 0: goto L_0x0239;
                case 1: goto L_0x0276;
                case 2: goto L_0x0329;
                case 3: goto L_0x0356;
                case 4: goto L_0x03f5;
                case 5: goto L_0x040c;
                case 6: goto L_0x0423;
                case 7: goto L_0x043a;
                case 8: goto L_0x0451;
                case 9: goto L_0x0468;
                case 10: goto L_0x0483;
                case 11: goto L_0x04a2;
                case 12: goto L_0x04b9;
                case 13: goto L_0x04d0;
                case 14: goto L_0x04e7;
                case 15: goto L_0x04fe;
                case 16: goto L_0x0515;
                case 17: goto L_0x052c;
                case 18: goto L_0x0547;
                case 19: goto L_0x055e;
                case 20: goto L_0x05b2;
                case 21: goto L_0x05eb;
                case 22: goto L_0x0632;
                case 23: goto L_0x067f;
                case 24: goto L_0x06d1;
                case 25: goto L_0x07a1;
                case 26: goto L_0x083f;
                case 27: goto L_0x08d8;
                case 28: goto L_0x0647;
                case 29: goto L_0x0a49;
                case 30: goto L_0x0ab3;
                case 31: goto L_0x0b23;
                case 32: goto L_0x0b4f;
                case 33: goto L_0x0b93;
                case 34: goto L_0x0d05;
                case 35: goto L_0x0d18;
                case 36: goto L_0x0e18;
                case 37: goto L_0x0ec2;
                case 38: goto L_0x0f46;
                case 39: goto L_0x0fb4;
                case 40: goto L_0x1022;
                case 41: goto L_0x1064;
                case 42: goto L_0x1143;
                case 43: goto L_0x121d;
                case 44: goto L_0x1269;
                case 45: goto L_0x1285;
                case 46: goto L_0x12d6;
                case 47: goto L_0x132d;
                case 48: goto L_0x134a;
                case 49: goto L_0x13c1;
                case 50: goto L_0x1439;
                case 51: goto L_0x1512;
                case 52: goto L_0x1542;
                case 53: goto L_0x1578;
                case 54: goto L_0x15c2;
                case 55: goto L_0x15f4;
                case 56: goto L_0x1709;
                case 57: goto L_0x1738;
                case 58: goto L_0x177a;
                case 59: goto L_0x1798;
                case 60: goto L_0x17bd;
                case 61: goto L_0x0038;
                case 62: goto L_0x0052;
                case 63: goto L_0x1858;
                case 64: goto L_0x006c;
                case 65: goto L_0x010d;
                case 66: goto L_0x012a;
                case 67: goto L_0x18f2;
                case 68: goto L_0x013f;
                case 69: goto L_0x017a;
                case 70: goto L_0x192b;
                case 71: goto L_0x196e;
                case 72: goto L_0x01b1;
                case 73: goto L_0x01d5;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = -175097977(0xfffffffff5903787, float:-3.656333E32)
            int r3 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r1.A00
            X.Ica r5 = (X.C34650Ica) r5
            java.lang.String r0 = "block_user"
            X.C34650Ica.A05(r5, r0)
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            com.instagram.service.session.UserSession r10 = r5.A03
            java.lang.Object r11 = r1.A01
            com.instagram.user.model.User r11 = (com.instagram.user.model.User) r11
            r6 = 0
            r0 = 2
            X.C04220Ms.A0B(r10, r0)
            r7 = r6
            r8 = r6
            r9 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            X.C102446Vf.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = -1983546878(0xffffffff89c57a02, float:-4.754076E-33)
        L_0x0034:
            X.C14030oh.A0C(r0, r3)
            return
        L_0x0038:
            r0 = -1058569975(0xffffffffc0e78109, float:-7.2345014)
            int r3 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r1.A00
            X.5yI r2 = (X.AnonymousClass5yI) r2
            java.lang.Object r0 = r1.A01
            X.5tw r0 = (X.C94215tw) r0
            X.5KP r0 = r0.A00
            if (r0 == 0) goto L_0x1983
            r2.A01(r0)
            r0 = -211623475(0xfffffffff362e1cd, float:-1.7975447E31)
            goto L_0x0034
        L_0x0052:
            r0 = 1331772960(0x4f613e20, float:3.77894502E9)
            int r3 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r1.A00
            X.5yI r2 = (X.AnonymousClass5yI) r2
            java.lang.Object r0 = r1.A01
            X.5tw r0 = (X.C94215tw) r0
            X.5KP r0 = r0.A00
            if (r0 == 0) goto L_0x1990
            r2.A01(r0)
            r0 = -338219826(0xffffffffebd72cce, float:-5.2026127E26)
            goto L_0x0034
        L_0x006c:
            r0 = -807785123(0xffffffffcfda2d5d, float:-7.320812E9)
            int r3 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.5ws r0 = (X.AnonymousClass5ws) r0
            X.0Oa r0 = r0.A04
            java.lang.Object r6 = r0.getValue()
            X.57b r6 = (X.C881857b) r6
            java.lang.Object r7 = r1.A00
            X.69A r7 = (X.AnonymousClass69A) r7
            r9 = 0
            X.C04220Ms.A0B(r7, r9)
            com.instagram.service.session.UserSession r14 = r6.A04
            java.lang.String r12 = r6.A05
            java.lang.String r13 = r6.A06
            com.instagram.api.schemas.CallToAction r1 = r6.A01
            boolean r10 = r6.A0C
            com.instagram.api.schemas.ApiAdFormats r11 = r7.A02
            X.K2b r2 = r6.A03
            r4 = 1
            r8 = 2
            r0 = 5
            X.C04220Ms.A0B(r11, r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = r2.A03
            X.H1T r2 = X.AnonymousClass0wJ.A0N(r14)
            java.lang.String r0 = "ads/promote/fetch_ad_preview_url_v2/"
            r2.A0J(r0)
            java.lang.String r0 = "instagram_media_id"
            r2.A0O(r0, r13)
            r0 = 1050(0x41a, float:1.471E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r2.A0O(r0, r12)
            java.lang.String r0 = "call_to_action"
            r2.A0O(r0, r1)
            java.lang.String r1 = r11.A00
            java.lang.String r0 = "ad_format"
            r2.A0O(r0, r1)
            r0 = 731(0x2db, float:1.024E-42)
            java.lang.String r0 = X.I17.A00(r0)
            r2.A0R(r0, r10)
            r0 = 371(0x173, float:5.2E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r2.A0P(r0, r5)
            java.lang.Class<X.5tS> r1 = X.AnonymousClass5tS.class
            java.lang.Class<X.6zw> r0 = X.C118216zw.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r1 = 1018893372(0x3cbb143c, float:0.022836797)
            r0 = 14
            r5 = 0
            X.4tk r1 = X.C63623hv.A03(r2, r1, r9, r0)
            kotlin.coroutines.jvm.internal.KtSLambdaShape13S0100000_I2_2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape13S0100000_I2_2
            r0.<init>(r4, r5)
            X.4tk r4 = X.AnonymousClass2L9.A00(r0, r1)
            kotlin.coroutines.jvm.internal.KtSLambdaShape13S0100000_I2_2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape13S0100000_I2_2
            r1.<init>(r8, r5)
            r0 = 3
            com.facebook.redex.IDxFlowShape93S0200000_1_I2 r2 = new com.facebook.redex.IDxFlowShape93S0200000_1_I2
            r2.<init>((X.AnonymousClass0YP) r1, (X.C84714tk) r4, (int) r0)
            r0 = 12
            kotlin.coroutines.jvm.internal.KtSLambdaShape10S0301000_I2_2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape10S0301000_I2_2
            r1.<init>((X.C146958n9) r5, (java.lang.Object) r7, (java.lang.Object) r6, (int) r0)
            r0 = 34
            X.AnonymousClass3J5.A01(r6, r1, r2, r0)
            r0 = -707833443(0xffffffffd5cf519d, float:-2.84936792E13)
            goto L_0x0034
        L_0x010d:
            r0 = 775831472(0x2e3e3fb0, float:4.3257564E-11)
            int r3 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.9FA r0 = (X.AnonymousClass9FA) r0
            X.B48 r5 = r0.A01
            X.9CZ r4 = r0.A00
            X.94O r2 = r0.A03
            java.lang.Object r0 = r1.A00
            X.5Ms r0 = (X.C90615Ms) r0
            r5.A0Y(r4, r2, r0)
            r0 = -2069981986(0xffffffff849e94de, float:-3.7282334E-36)
            goto L_0x0034
        L_0x012a:
            r0 = -1923591505(0xffffffff8d5852af, float:-6.6659666E-31)
            int r3 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r1.A00
            X.0YY r2 = (X.AnonymousClass0YY) r2
            java.lang.Object r0 = r1.A01
            r2.invoke(r0)
            r0 = -473054525(0xffffffffe3cdc2c3, float:-7.591233E21)
            goto L_0x0034
        L_0x013f:
            r0 = -1255107207(0xffffffffb5309579, float:-6.578262E-7)
            int r3 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.Dsm r4 = X.AnonymousClass0wJ.A0V(r0)
            r0 = 2131828161(0x7f111dc1, float:1.9289255E38)
            r4.A0L(r0)
            r2 = 2131824870(0x7f1110e6, float:1.928258E38)
            java.lang.Object r1 = r1.A01
            r0 = 56
            com.facebook.redex.IDxCListenerShape218S0100000_2_I2 r1 = X.C86154wM.A0N(r1, r0)
            X.25l r0 = X.AnonymousClass25l.RED
            r4.A0T(r1, r0, r2)
            r1 = 2131823054(0x7f1109ce, float:1.9278897E38)
            r0 = 0
            r4.A0N(r0, r1)
            r0 = 1
            r4.A0q(r0)
            r4.A0r(r0)
            X.AnonymousClass0wJ.A1K(r4)
            r0 = 813478234(0x307cb15a, float:9.19291E-10)
            goto L_0x0034
        L_0x017a:
            r0 = -689039764(0xffffffffd6ee166c, float:-1.30890034E14)
            int r3 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A00
            X.IM8 r0 = (X.IM8) r0
            java.lang.String r2 = r0.A0N
            java.lang.String r0 = "financial_entity_id"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r2)
            java.util.HashMap r2 = X.C86124wJ.A0z(r0)
            java.lang.String r0 = "com.instagram.pro_home.monetization_platform.payout_transactions"
            X.3iE r2 = X.C63743iE.A02(r0, r2)
            java.lang.Object r0 = r1.A01
            X.5x9 r0 = (X.AnonymousClass5x9) r0
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            X.0Oa r0 = r0.A0C
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.C18190wL.A0N(r0)
            r2.A0C(r1, r0)
            r0 = 1946442508(0x74045b0c, float:4.194518E31)
            goto L_0x0034
        L_0x01b1:
            r0 = 1438481321(0x55bd7ba9, float:2.60423517E13)
            int r3 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A00
            X.6fA r0 = (X.C106516fA) r0
            java.lang.Object r4 = r1.A01
            com.instagram.model.shopping.Product r4 = (com.instagram.model.shopping.Product) r4
            com.instagram.shopping.fragment.postpurchase.ProductSharePickerFragment r0 = r0.A00
            com.instagram.service.session.UserSession r2 = r0.A00
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            X.Af4 r0 = new X.Af4
            r0.<init>(r1, r4, r2)
            r0.A00()
            r0 = 672967814(0x281cac86, float:8.69715E-15)
            goto L_0x0034
        L_0x01d5:
            r0 = 643105890(0x26550462, float:7.390516E-16)
            int r3 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r1.A01
            android.view.View r6 = (android.view.View) r6
            r0 = 2131304060(0x7f091e7c, float:1.8226252E38)
            android.view.View r0 = r6.requireViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r4 = X.AnonymousClass0wJ.A0n(r0)
            r0 = 2131304062(0x7f091e7e, float:1.8226256E38)
            android.view.View r0 = r6.requireViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r2 = X.AnonymousClass0wJ.A0n(r0)
            r0 = 2131304061(0x7f091e7d, float:1.8226254E38)
            android.view.View r0 = r6.requireViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r1 = X.AnonymousClass0wJ.A0n(r0)
            r0 = 2131304063(0x7f091e7f, float:1.8226258E38)
            android.view.View r0 = r6.requireViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r0 = X.AnonymousClass0wJ.A0n(r0)
            float r5 = java.lang.Float.parseFloat(r4)
            float r4 = java.lang.Float.parseFloat(r2)
            float r2 = java.lang.Float.parseFloat(r1)
            float r1 = java.lang.Float.parseFloat(r0)
            android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
            r0.<init>(r5, r4, r2, r1)
            X.C25296DjH.A02 = r0
            android.content.Context r1 = r6.getContext()
            java.lang.String r0 = "Set Custom Path Interpolator"
            X.C63813iO.A01(r1, r0)
            r0 = 1891491260(0x70bdddbc, float:4.700858E29)
            goto L_0x0034
        L_0x0239:
            r0 = 357608637(0x1550acbd, float:4.2141532E-26)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r7 = r1.A01
            X.5EV r7 = (X.AnonymousClass5EV) r7
            X.0ZU r2 = r7.A04
            if (r2 == 0) goto L_0x024b
            r2.invoke()
        L_0x024b:
            com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload r2 = r7.A01
            if (r2 == 0) goto L_0x0271
            java.lang.String r6 = r2.A01
            if (r6 == 0) goto L_0x0271
            java.lang.Object r5 = r1.A00
            X.56y r1 = r7.A02
            if (r1 == 0) goto L_0x0271
            X.6gW r4 = r1.A00
            X.6ci r3 = r4.A00
            r2 = 2
            com.facebook.redex.IDxFunctionShape30S1100000_2_I2 r1 = new com.facebook.redex.IDxFunctionShape30S1100000_2_I2
            r1.<init>(r6, r4, r2)
            X.M5J r2 = X.AnonymousClass5k7.A00(r1, r3)
            if (r2 == 0) goto L_0x0271
            r1 = 0
            com.facebook.redex.IDxObserverShape99S0200000_2_I2 r1 = X.C86164wN.A0O(r7, r5, r1)
            r2.A0C(r7, r1)
        L_0x0271:
            r1 = -1847136965(0xffffffff91e6ed3b, float:-3.6433806E-28)
            goto L_0x1968
        L_0x0276:
            r0 = 1508081458(0x59e37f32, float:8.0043341E15)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r1.A00
            X.5EY r5 = (X.AnonymousClass5EY) r5
            com.facebook.browser.lite.extensions.autofill.base.AutofillSharedJSBridgeProxy r2 = r5.A01
            if (r2 == 0) goto L_0x0324
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r2 = r5.A03
            if (r2 == 0) goto L_0x0324
            java.lang.Object r2 = r1.A01
            com.instagram.ui.widget.radiogroup.IgRadioGroup r2 = (com.instagram.ui.widget.radiogroup.IgRadioGroup) r2
            int r1 = r2.A00
            android.view.View r1 = r2.requireViewById(r1)
            java.lang.Object r7 = r1.getTag()
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r7 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r7
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r1 = r5.A03
            java.lang.String r4 = "callbackID"
            java.lang.Object r2 = X.C86114wI.A0f(r1, r4)
            java.lang.String r2 = (java.lang.String) r2
            org.json.JSONObject r1 = r7.A01()
            android.os.Bundle r3 = X.C18180wK.A06()
            r3.putString(r4, r2)
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "callback_result"
            r3.putString(r1, r2)
            com.facebook.browser.lite.extensions.autofill.base.AutofillSharedJSBridgeProxy r2 = r5.A01
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r1 = r5.A03
            r2.A09(r3, r1)
            X.5Ej r6 = r5.A02
            X.Kys r2 = r6.A03
            r1 = r2
            com.facebook.browser.lite.BrowserLiteFragment r1 = (com.facebook.browser.lite.BrowserLiteFragment) r1
            java.lang.String r4 = r1.A0e
            java.util.Map r3 = r6.A0d
            r1 = 0
            if (r2 == 0) goto L_0x02cd
            r1 = r4
        L_0x02cd:
            java.lang.String r1 = X.AnonymousClass7K0.A00(r1)
            r2 = 1
            X.C86154wM.A1U(r1, r3, r2)
            java.util.Map r1 = r6.A0g
            r1.put(r4, r7)
            r6.A0W = r2
            java.util.Map r2 = r7.A00
            java.lang.String r1 = "id"
            java.lang.String r1 = X.C18220wO.A0r(r1, r2)
            r6.A0E = r1
            java.lang.String r1 = "ent_id"
            java.lang.String r1 = X.C18220wO.A0r(r1, r2)
            r6.A0D = r1
            X.5Ej r2 = r5.A02
            java.lang.String r1 = "ACCEPTED_AUTOFILL"
            X.78Q r4 = r2.A02(r1)
            java.lang.String r1 = r5.A05
            r4.A08 = r1
            java.lang.String r1 = r5.A04
            r4.A06 = r1
            java.util.List r1 = r5.A06
            int r1 = r1.size()
            r4.A00 = r1
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r1 = r5.A03
            X.AnonymousClass5EY.A00(r5, r4, r1)
            boolean r3 = X.AnonymousClass5EY.A01(r5, r4)
            boolean r1 = r5.A0A
            if (r1 != 0) goto L_0x031b
            boolean r2 = r5.A09
            boolean r1 = r5.A07
            if (r2 == 0) goto L_0x031c
            if (r1 != 0) goto L_0x031c
        L_0x031b:
            r3 = 1
        L_0x031c:
            r4.A0L = r3
            X.AnonymousClass78Q.A00(r4)
            r5.A06()
        L_0x0324:
            r1 = -965295725(0xffffffffc676c193, float:-15792.394)
            goto L_0x1968
        L_0x0329:
            r0 = 984895735(0x3ab450f7, float:0.001375704)
            int r2 = X.C14030oh.A05(r0)
            android.os.Bundle r4 = X.C18180wK.A06()
            java.lang.Object r0 = r1.A01
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r0
            org.json.JSONObject r0 = r0.A01()
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRING"
            r4.putString(r0, r3)
            java.lang.String r3 = "BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE"
            java.lang.String r0 = "save_autofill_request_fragment"
            r4.putString(r3, r0)
            java.lang.Object r0 = r1.A00
            X.C86124wJ.A1D(r4, r0)
            r0 = 1403057514(0x53a0f56a, float:1.38262426E12)
            goto L_0x1927
        L_0x0356:
            r0 = 806795634(0x3016b972, float:5.4833216E-10)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r1.A01
            X.5Eh r2 = (X.C89385Eh) r2
            com.instagram.service.session.UserSession r9 = r2.A03
            java.lang.Object r1 = r1.A00
            X.L3B r1 = (X.L3B) r1
            androidx.fragment.app.FragmentActivity r7 = r1.getActivity()
            X.C04220Ms.A06(r7)
            com.facebook.browser.lite.extensions.igcallextension.IGCallExtensionModel r1 = r2.A02
            java.lang.String r4 = r1.A01
            java.lang.String r2 = "tel: +"
            java.lang.String r1 = r1.A00
            java.lang.String r6 = X.AnonymousClass00U.A0L(r2, r1)
            java.lang.String r3 = "ig_iab_sticky_footer_clicked"
            r8 = 0
            r2 = 1
            r1 = 3
            X.C04220Ms.A0B(r6, r1)
            X.7sP r5 = new X.7sP
            r5.<init>(r9, r4, r3)
            java.lang.String r1 = "android.permission.CALL_PHONE"
            int r1 = r7.checkSelfPermission(r1)
            boolean r1 = X.C18180wK.A1W(r1)
            r5.A03(r1)
            X.Dsm r4 = new X.Dsm
            r4.<init>(r7)
            r4.A0r(r2)
            r3 = 2131822824(0x7f1108e8, float:1.927843E38)
            java.lang.String r2 = "tel:"
            java.lang.String r1 = ""
            java.lang.String r2 = X.AnonymousClass8bQ.A0l(r6, r2, r1, r8)
            java.util.Locale r1 = X.C31103Gfm.A02()
            java.lang.String r1 = r1.getCountry()
            java.lang.String r1 = android.telephony.PhoneNumberUtils.formatNumber(r2, r1)
            X.C04220Ms.A06(r1)
            java.lang.String r2 = X.AnonymousClass0wJ.A0l(r7, r1, r3)
            X.7LU r1 = new X.7LU
            r1.<init>(r7, r5, r6)
            r4.A0c(r1, r2)
            X.7LQ r1 = new X.7LQ
            r1.<init>(r5)
            r4.A0M(r1)
            android.app.Dialog r4 = r4.A0G()
            android.view.Window r3 = r4.getWindow()
            if (r3 == 0) goto L_0x03e4
            android.view.WindowManager$LayoutParams r2 = r3.getAttributes()
            if (r2 == 0) goto L_0x03e1
            r1 = 80
            r2.gravity = r1
            r1 = -1
            r2.width = r1
        L_0x03e1:
            r3.setAttributes(r2)
        L_0x03e4:
            X.C13950oZ.A00(r4)
            r1 = 864(0x360, float:1.211E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.C131567sP.A02(r5, r1)
            r1 = -76139397(0xfffffffffb76347b, float:-1.27836946E36)
            goto L_0x1968
        L_0x03f5:
            r0 = -797862409(0xffffffffd07195f7, float:-1.62125486E10)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.5ga r0 = (X.C91655ga) r0
            X.0YY r3 = r0.A02
            java.lang.Object r0 = r1.A00
            r3.invoke(r0)
            r0 = 912289038(0x36606d0e, float:3.344208E-6)
            goto L_0x1927
        L_0x040c:
            r0 = -1328578539(0xffffffffb0cf8015, float:-1.5097635E-9)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.5ge r0 = (X.C91695ge) r0
            X.0YY r3 = r0.A02
            java.lang.Object r0 = r1.A00
            r3.invoke(r0)
            r0 = 2034347423(0x7941ad9f, float:6.285217E34)
            goto L_0x1927
        L_0x0423:
            r0 = -1370381335(0xffffffffae51a3e9, float:-4.766668E-11)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.5gb r0 = (X.C91665gb) r0
            X.0YY r3 = r0.A02
            java.lang.Object r0 = r1.A00
            r3.invoke(r0)
            r0 = -733648158(0xffffffffd4456ae2, float:-3.39160701E12)
            goto L_0x1927
        L_0x043a:
            r0 = -1497306150(0xffffffffa6c0ebda, float:-1.3386604E-15)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.5gc r0 = (X.C91675gc) r0
            X.0YY r3 = r0.A02
            java.lang.Object r0 = r1.A00
            r3.invoke(r0)
            r0 = 1140452697(0x43f9ed59, float:499.85428)
            goto L_0x1927
        L_0x0451:
            r0 = -596357052(0xffffffffdc745044, float:-2.75072589E17)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.5g7 r0 = (X.C91365g7) r0
            X.0YY r3 = r0.A00
            java.lang.Object r0 = r1.A00
            r3.invoke(r0)
            r0 = 619810918(0x24f19066, float:1.0476171E-16)
            goto L_0x1927
        L_0x0468:
            r0 = -307491097(0xffffffffedac0ee7, float:-6.6561797E27)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.5gM r0 = (X.C91515gM) r0
            X.0YY r3 = r0.A01
            java.lang.Object r0 = r1.A00
            com.facebookpay.common.recyclerview.adapteritems.ConfirmationPaymentSectionItem r0 = (com.facebookpay.common.recyclerview.adapteritems.ConfirmationPaymentSectionItem) r0
            java.lang.String r0 = r0.A00
            r3.invoke(r0)
            r0 = -12509700(0xffffffffff411dfc, float:-2.566967E38)
            goto L_0x1927
        L_0x0483:
            r0 = 1675964809(0x63e53189, float:8.4557476E21)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r1.A00
            com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellItem r4 = (com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellItem) r4
            java.lang.String r3 = r4.A02
            if (r3 == 0) goto L_0x049d
            java.lang.Object r1 = r1.A01
            X.5g8 r1 = (X.C91375g8) r1
            X.0YP r2 = r1.A00
            java.lang.String r1 = r4.A00
            r2.invoke(r3, r1)
        L_0x049d:
            r1 = -996726399(0xffffffffc4972981, float:-1209.297)
            goto L_0x1968
        L_0x04a2:
            r0 = 1082846167(0x408aebd7, float:4.341289)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.5gA r0 = (X.C91395gA) r0
            X.0YY r3 = r0.A00
            java.lang.Object r0 = r1.A00
            r3.invoke(r0)
            r0 = 1114641108(0x427012d4, float:60.018387)
            goto L_0x1927
        L_0x04b9:
            r0 = -970683370(0xffffffffc6248c16, float:-10531.021)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.5gC r0 = (X.C91415gC) r0
            X.0YY r3 = r0.A00
            java.lang.Object r0 = r1.A00
            r3.invoke(r0)
            r0 = 2006675130(0x779b6eba, float:6.305092E33)
            goto L_0x1927
        L_0x04d0:
            r0 = -859591882(0xffffffffccc3ab36, float:-1.025868E8)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.5gE r0 = (X.C91435gE) r0
            X.0YY r3 = r0.A00
            java.lang.Object r0 = r1.A00
            r3.invoke(r0)
            r0 = 1646350174(0x62214f5e, float:7.439112E20)
            goto L_0x1927
        L_0x04e7:
            r0 = 792858197(0x2f420e55, float:1.7649289E-10)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.5gF r0 = (X.C91445gF) r0
            X.0YY r3 = r0.A00
            java.lang.Object r0 = r1.A00
            r3.invoke(r0)
            r0 = -1597659378(0xffffffffa0c5a70e, float:-3.3483646E-19)
            goto L_0x1927
        L_0x04fe:
            r0 = -1620906637(0xffffffff9f62ed73, float:-4.8053775E-20)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.5gG r0 = (X.C91455gG) r0
            X.0YY r3 = r0.A00
            java.lang.Object r0 = r1.A00
            r3.invoke(r0)
            r0 = -749637432(0xffffffffd35170c8, float:-8.9954032E11)
            goto L_0x1927
        L_0x0515:
            r0 = -120962922(0xfffffffff8ca4096, float:-3.281731E34)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.5gG r0 = (X.C91455gG) r0
            X.0YY r3 = r0.A00
            java.lang.Object r0 = r1.A00
            r3.invoke(r0)
            r0 = -73641631(0xfffffffffb9c5161, float:-1.6232977E36)
            goto L_0x1927
        L_0x052c:
            r0 = -1857294102(0xffffffff914bf0ea, float:-1.6088114E-28)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.59v r0 = (X.C886359v) r0
            android.view.View$OnClickListener r3 = r0.A00
            java.lang.Object r0 = r1.A00
            X.5B6 r0 = (X.AnonymousClass5B6) r0
            com.facebookpay.widget.paybutton.FBPayAnimationButton r0 = r0.A00
            r3.onClick(r0)
            r0 = 2124435701(0x7ea050f5, float:1.0654842E38)
            goto L_0x1927
        L_0x0547:
            r0 = 914953331(0x36891473, float:4.0852988E-6)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.5gR r0 = (X.C91565gR) r0
            X.0YY r3 = r0.A00
            java.lang.Object r0 = r1.A00
            r3.invoke(r0)
            r0 = 2129443871(0x7eecbc1f, float:1.5733729E38)
            goto L_0x1927
        L_0x055e:
            r0 = -1311809332(0xffffffffb1cf60cc, float:-6.0354974E-9)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r1.A01
            com.facebookpay.msc.appdialog.viewmodel.AppDialogViewModel r5 = (com.facebookpay.msc.appdialog.viewmodel.AppDialogViewModel) r5
            java.lang.Object r2 = r1.A00
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            java.lang.String r1 = "cta_uri"
            java.lang.String r3 = r2.getStringValue(r1)
            com.facebook.graphql.impls.TopLevelDialogImpl r2 = r5.A00
            if (r2 != 0) goto L_0x057e
            java.lang.String r0 = "topLevelDialog"
            X.C04220Ms.A0E(r0)
            r10 = 0
            throw r10
        L_0x057e:
            java.lang.String r1 = "is_hard_block"
            boolean r4 = r2.getBooleanValue(r1)
            if (r3 == 0) goto L_0x05a2
            boolean r1 = X.AnonymousClass8bQ.A0n(r3)
            if (r1 != 0) goto L_0x05a2
            java.lang.String r2 = "user_click_payouthub_atomic"
            java.lang.String r1 = "payouthub_update_dialogue_accept_click"
            com.facebookpay.msc.appdialog.viewmodel.AppDialogViewModel.A00(r5, r2, r1, r3)
            X.56q r2 = r5.A03
            X.7jR r1 = new X.7jR
            r1.<init>(r3)
        L_0x059a:
            X.AnonymousClass7JD.A02(r2, r1)
            r1 = -1329112134(0xffffffffb0c75bba, float:-1.4505226E-9)
            goto L_0x1968
        L_0x05a2:
            java.lang.String r3 = "user_click_payouthub_atomic"
            java.lang.String r2 = "payouthub_update_dialogue_dismiss_click"
            r1 = 0
            com.facebookpay.msc.appdialog.viewmodel.AppDialogViewModel.A00(r5, r3, r2, r1)
            X.56q r2 = r5.A03
            X.7jQ r1 = new X.7jQ
            r1.<init>(r4)
            goto L_0x059a
        L_0x05b2:
            r0 = -657712084(0xffffffffd8cc1c2c, float:-1.79537095E15)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r1.A01
            X.0YY r4 = (X.AnonymousClass0YY) r4
            java.lang.Object r3 = r1.A00
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            java.lang.Class<com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl$Ranges> r2 = com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl.Ranges.class
            java.lang.String r1 = "ranges"
            com.google.common.collect.ImmutableList r1 = X.C18230wP.A0P(r3, r2, r1)
            java.lang.Object r3 = X.AnonymousClass00J.A0D(r1)
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            if (r3 == 0) goto L_0x05e9
            java.lang.Class<com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl$Ranges$Entity> r2 = com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl.Ranges.Entity.class
            java.lang.String r1 = "entity"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x05e9
            java.lang.String r1 = "url"
            java.lang.String r1 = r2.getStringValue(r1)
        L_0x05e1:
            r4.invoke(r1)
            r1 = 456626289(0x1b379071, float:1.5184077E-22)
            goto L_0x1968
        L_0x05e9:
            r1 = 0
            goto L_0x05e1
        L_0x05eb:
            r0 = 1837890039(0x6d8bf9f7, float:5.4150757E27)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r1.A01
            com.facebookpay.msc.earningdetail.viewmodel.EarningsDetailViewModel r4 = (com.facebookpay.msc.earningdetail.viewmodel.EarningsDetailViewModel) r4
            java.lang.Object r3 = r1.A00
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            java.lang.Class<com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl$Ranges> r2 = com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl.Ranges.class
            java.lang.String r1 = "ranges"
            com.google.common.collect.ImmutableList r1 = X.C18230wP.A0P(r3, r2, r1)
            java.lang.Object r3 = X.AnonymousClass00J.A0D(r1)
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            if (r3 == 0) goto L_0x062d
            java.lang.Class<com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl$Ranges$Entity> r2 = com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl.Ranges.Entity.class
            java.lang.String r1 = "entity"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x062d
            java.lang.String r1 = "url"
            java.lang.String r3 = r2.getStringValue(r1)
            if (r3 == 0) goto L_0x062d
            java.lang.String r2 = "user_click_payouthub_atomic"
            java.lang.String r1 = "payouthub_link_click"
            com.facebookpay.msc.earningdetail.viewmodel.EarningsDetailViewModel.A00(r4, r2, r1, r3)
            X.56q r2 = r4.A03
            X.7jR r1 = new X.7jR
            r1.<init>(r3)
            X.AnonymousClass7JD.A02(r2, r1)
        L_0x062d:
            r1 = -1927773487(0xffffffff8d1882d1, float:-4.699608E-31)
            goto L_0x1968
        L_0x0632:
            r0 = -223697511(0xfffffffff2aaa599, float:-6.760019E30)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r1.A01
            X.0YY r3 = (X.AnonymousClass0YY) r3
            java.lang.Object r0 = r1.A00
            r3.invoke(r0)
            r0 = -352784492(0xffffffffeaf8ef94, float:-1.5047249E26)
            goto L_0x1927
        L_0x0647:
            r0 = -1065381858(0xffffffffc07f901e, float:-3.9931712)
            int r4 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.5j7 r0 = (X.AnonymousClass5j7) r0
            X.58M r3 = r0.A09
            if (r3 != 0) goto L_0x065a
            java.lang.String r4 = "ecpViewModel"
            goto L_0x1848
        L_0x065a:
            java.lang.Object r2 = r1.A00
            X.69U r2 = (X.AnonymousClass69U) r2
            androidx.fragment.app.Fragment r1 = r0.mParentFragment
            if (r1 == 0) goto L_0x0674
            android.view.ContextThemeWrapper r0 = r0.A00
            if (r0 != 0) goto L_0x066a
            java.lang.String r4 = "viewContext"
            goto L_0x1848
        L_0x066a:
            r3.A0y(r0, r1, r2)
            r0 = 1755643903(0x68a4ffff, float:6.233523E24)
            X.C14030oh.A0C(r0, r4)
            return
        L_0x0674:
            java.lang.IllegalStateException r10 = X.AnonymousClass0wJ.A0b()
            r0 = 554685453(0x210fd40d, float:4.873093E-19)
            X.C14030oh.A0C(r0, r4)
            throw r10
        L_0x067f:
            r0 = -1180527348(0xffffffffb9a2950c, float:-3.1010096E-4)
            int r5 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r1.A01
            com.facebookpay.msc.feselector.viewmodel.FeSelectorViewModel r4 = (com.facebookpay.msc.feselector.viewmodel.FeSelectorViewModel) r4
            java.lang.Object r0 = r1.A00
            X.56r r1 = r4.A05
            r1.A0H(r0)
            X.8h9 r3 = X.AnonymousClass7Kz.A08()
            com.facebookpay.msc.logging.LoggingData r0 = r4.A02
            if (r0 == 0) goto L_0x06cd
            java.util.HashMap r2 = X.AnonymousClass6IH.A00(r0)
            java.lang.Object r0 = r1.A08()
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            if (r0 == 0) goto L_0x06c8
            java.lang.String r0 = X.C86144wL.A0r(r0)
            if (r0 == 0) goto L_0x06c8
            X.C86164wN.A1I(r0, r2)
            java.lang.String r1 = "target_name"
            java.lang.String r0 = "payouthub_financial_entity_choose_option_click"
            r2.put(r1, r0)
            java.lang.String r1 = r4.A06()
            java.lang.String r0 = "view_name"
            r2.put(r0, r1)
            java.lang.String r0 = "user_click_payouthub_atomic"
            r3.Bb8(r0, r2)
            r0 = 371035280(0x161d8c90, float:1.2726713E-25)
            goto L_0x11b9
        L_0x06c8:
            java.lang.IllegalStateException r10 = X.AnonymousClass0wJ.A0b()
            throw r10
        L_0x06cd:
            java.lang.String r4 = "loggingData"
            goto L_0x1848
        L_0x06d1:
            r0 = -25412340(0xfffffffffe7c3d0c, float:-8.3820607E37)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r1.A01
            com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel r6 = (com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel) r6
            java.lang.Object r2 = r1.A00
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            java.lang.Class<com.facebook.graphql.impls.NotificationFragmentImpl$Action> r3 = com.facebook.graphql.impls.NotificationFragmentImpl.Action.class
            java.lang.String r1 = "action"
            com.facebook.pando.TreeJNI r3 = r2.getTreeValue(r1, r3)
            r12 = 0
            if (r3 == 0) goto L_0x0770
            java.lang.Class<com.facebook.graphql.impls.NotificationActionFragmentImpl> r1 = com.facebook.graphql.impls.NotificationActionFragmentImpl.class
            com.facebook.pando.TreeJNI r4 = r3.reinterpret(r1)
            if (r4 == 0) goto L_0x0770
            X.1zo r3 = X.C30091zo.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "type"
            java.lang.Enum r1 = X.C86104wH.A0a(r4, r3, r1)
            X.1zo r1 = (X.C30091zo) r1
            if (r1 == 0) goto L_0x0770
            int r3 = r1.ordinal()
            r1 = 4
            if (r3 != r1) goto L_0x0770
            java.lang.String r1 = "PAYObjectNotificationActionURL"
            boolean r1 = r4.isFulfilled(r1)
            if (r1 == 0) goto L_0x071c
            java.lang.Class<com.facebook.graphql.impls.NotificationActionFragmentImpl$InlinePAYObjectNotificationActionURL> r1 = com.facebook.graphql.impls.NotificationActionFragmentImpl.InlinePAYObjectNotificationActionURL.class
            com.facebook.pando.TreeJNI r3 = r4.reinterpret(r1)
            if (r3 == 0) goto L_0x071c
            java.lang.String r1 = "redirect_url"
            java.lang.String r12 = r3.getStringValue(r1)
        L_0x071c:
            java.lang.String r1 = "notification_identifier"
            java.lang.String r9 = r2.getStringValue(r1)
            X.21j r5 = X.C304521j.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r4 = "notification_source"
            java.lang.Enum r1 = X.C86104wH.A0a(r2, r5, r4)
            java.lang.String r10 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "button_content"
            java.lang.String r11 = r2.getStringValue(r1)
            java.lang.String r1 = "header_content"
            java.lang.String r17 = r2.getStringValue(r1)
            java.lang.String r7 = "user_click_payouthub_atomic"
            java.lang.String r8 = "notification_hub_action_click"
            r13 = 0
            r20 = 4032(0xfc0, float:5.65E-42)
            r14 = r13
            r15 = r13
            r16 = r13
            r18 = r13
            r19 = r13
            com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r12 == 0) goto L_0x076b
            java.lang.Enum r3 = X.C86104wH.A0a(r2, r5, r4)
            X.21j r1 = X.C304521j.PAYOUT_HOLD
            if (r3 == r1) goto L_0x075e
            java.lang.Enum r2 = X.C86104wH.A0a(r2, r5, r4)
            X.21j r1 = X.C304521j.TASKLESS_INTERVIEW_INCOMPLETE
            if (r2 != r1) goto L_0x0761
        L_0x075e:
            X.AnonymousClass7Kz.A0P()
        L_0x0761:
            X.56r r2 = r6.A08
            X.7jR r1 = new X.7jR
            r1.<init>(r12)
            X.AnonymousClass7JD.A02(r2, r1)
        L_0x076b:
            r1 = 1563831620(0x5d362d44, float:8.2045145E17)
            goto L_0x1968
        L_0x0770:
            java.lang.String r1 = "notification_identifier"
            java.lang.String r9 = r2.getStringValue(r1)
            X.21j r3 = X.C304521j.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "notification_source"
            java.lang.Enum r1 = X.C86104wH.A0a(r2, r3, r1)
            java.lang.String r10 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "button_content"
            java.lang.String r11 = r2.getStringValue(r1)
            java.lang.String r1 = "header_content"
            java.lang.String r17 = r2.getStringValue(r1)
            r20 = 4064(0xfe0, float:5.695E-42)
            java.lang.String r7 = "user_click_payouthub_atomic"
            java.lang.String r8 = "notification_hub_action_click"
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r18 = r12
            r19 = r12
            com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x076b
        L_0x07a1:
            r0 = 639647552(0x26203f40, float:5.559687E-16)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r7 = r1.A01
            com.facebookpay.msc.payoutdetails.viewmodel.PayoutDetailsViewModelV2 r7 = (com.facebookpay.msc.payoutdetails.viewmodel.PayoutDetailsViewModelV2) r7
            java.lang.Object r0 = r1.A00
            com.facebook.pando.TreeJNI r0 = (com.facebook.pando.TreeJNI) r0
            java.lang.String r6 = "payout_record_id"
            java.lang.String r11 = r0.getStringValue(r6)
            if (r11 == 0) goto L_0x083a
            r10 = 0
            r17 = 500(0x1f4, float:7.0E-43)
            java.lang.String r8 = "user_click_payouthub_atomic"
            java.lang.String r9 = "payouthub_earnings_detail_view_click"
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            com.facebookpay.msc.payoutdetails.viewmodel.PayoutDetailsViewModelV2.A03(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Integer r0 = X.AnonymousClass4n2.A01(r11)
            if (r0 == 0) goto L_0x07df
            int r5 = r0.intValue()
        L_0x07d2:
            X.AnonymousClass7Kz.A06()
            java.lang.String r4 = r7.A03
            if (r4 != 0) goto L_0x07e1
            java.lang.String r0 = "financialID"
            X.C04220Ms.A0E(r0)
            throw r10
        L_0x07df:
            r5 = 0
            goto L_0x07d2
        L_0x07e1:
            java.lang.String r3 = r7.A04
            java.lang.String r1 = "payout_details"
            r0 = 667750821(0x27cd11a5, float:5.691806E-15)
            com.facebook.quicklog.MarkerEditor r1 = X.AnonymousClass7Kz.A03(r1, r0, r5)
            java.lang.String r5 = "financial_entity_id"
            r1.annotate((java.lang.String) r5, (java.lang.String) r4)
            r1.annotate((java.lang.String) r6, (java.lang.String) r11)
            if (r3 == 0) goto L_0x07fb
            java.lang.String r0 = "managed_merchant_account_id"
            r1.annotate((java.lang.String) r0, (java.lang.String) r3)
        L_0x07fb:
            r1.markerEditingCompleted()
            X.56q r4 = r7.A03
            kotlin.Pair r3 = X.C18180wK.A0p(r6, r11)
            com.facebookpay.msc.logging.LoggingData r1 = r7.A01
            if (r1 != 0) goto L_0x080e
            java.lang.String r0 = "loggingData"
        L_0x080a:
            X.C04220Ms.A0E(r0)
            throw r10
        L_0x080e:
            java.lang.String r0 = "logging_data"
            kotlin.Pair r1 = X.C18180wK.A0p(r0, r1)
            java.lang.String r0 = r7.A03
            if (r0 != 0) goto L_0x081b
            java.lang.String r0 = "financialID"
            goto L_0x080a
        L_0x081b:
            kotlin.Pair r0 = X.C18180wK.A0p(r5, r0)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r3, r1, r0}
            android.os.Bundle r3 = X.C98316Fa.A00(r0)
            java.lang.String r1 = r7.A04
            if (r1 == 0) goto L_0x0830
            java.lang.String r0 = "managed_merchant_account_id"
            r3.putString(r0, r1)
        L_0x0830:
            java.lang.String r1 = "earnings_details_v2_fragment"
            X.7jS r0 = new X.7jS
            r0.<init>(r3, r1)
            X.AnonymousClass7JD.A02(r4, r0)
        L_0x083a:
            r0 = 1503684983(0x59a06977, float:5.6439945E15)
            goto L_0x1927
        L_0x083f:
            r0 = 757175434(0x2d21948a, float:9.184773E-12)
            int r5 = X.C14030oh.A05(r0)
            java.lang.Object r8 = r1.A01
            com.facebookpay.msc.payouts.viewmodel.PayoutsViewModel r8 = (com.facebookpay.msc.payouts.viewmodel.PayoutsViewModel) r8
            java.lang.Object r9 = r1.A00
            X.8rE r9 = (X.C148528rE) r9
            X.AnonymousClass7Kz.A0P()
            r0 = 0
            java.lang.String r3 = r9.B0P()
            if (r3 == 0) goto L_0x08d3
            java.lang.String r2 = "user_click_payouthub_atomic"
            java.lang.String r1 = "payouthub_payouts_view_click"
            com.facebookpay.msc.payouts.viewmodel.PayoutsViewModel.A00(r8, r2, r3, r1)
            java.lang.String r11 = r9.getId()
            if (r11 == 0) goto L_0x08cc
            java.lang.Integer r1 = X.AnonymousClass4n2.A01(r11)
            if (r1 == 0) goto L_0x08cc
            int r4 = r1.intValue()
        L_0x086f:
            X.AnonymousClass7Kz.A06()
            X.56q r10 = r8.A03
            java.lang.Object r1 = r10.A08()
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1
            if (r1 == 0) goto L_0x08ce
            java.lang.String r7 = "financial_id"
            java.lang.String r3 = r1.getStringValue(r7)
            if (r3 == 0) goto L_0x08ce
            java.lang.String r2 = "payouthub_payouts"
            r1 = 667750653(0x27cd10fd, float:5.691735E-15)
            com.facebook.quicklog.MarkerEditor r2 = X.AnonymousClass7Kz.A03(r2, r1, r4)
            java.lang.String r6 = "financial_entity_id"
            r2.annotate((java.lang.String) r6, (java.lang.String) r3)
            if (r11 == 0) goto L_0x0899
            java.lang.String r1 = "batch_item_id"
            r2.annotate((java.lang.String) r1, (java.lang.String) r11)
        L_0x0899:
            r2.markerEditingCompleted()
            X.56q r4 = r8.A03
            java.lang.String r3 = "payout_details_v2_fragment"
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.Object r1 = r10.A08()
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1
            if (r1 == 0) goto L_0x08b0
            java.lang.String r0 = r1.getStringValue(r7)
        L_0x08b0:
            r2.putString(r6, r0)
            X.C86164wN.A17(r2, r8)
            java.lang.String r1 = r9.getId()
            java.lang.String r0 = "payout_release_id"
            r2.putString(r0, r1)
            X.7jS r0 = new X.7jS
            r0.<init>(r2, r3)
            X.AnonymousClass7JD.A02(r4, r0)
            r0 = 1630383453(0x612dad5d, float:2.0023618E20)
            goto L_0x11b9
        L_0x08cc:
            r4 = 0
            goto L_0x086f
        L_0x08ce:
            java.lang.IllegalStateException r10 = X.AnonymousClass0wJ.A0b()
            throw r10
        L_0x08d3:
            java.lang.IllegalStateException r10 = X.AnonymousClass0wJ.A0b()
            throw r10
        L_0x08d8:
            r0 = -963581595(0xffffffffc690e965, float:-18548.697)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r9 = r1.A01
            com.facebookpay.msc.transactions.viewmodel.TransactionsViewModel r9 = (com.facebookpay.msc.transactions.viewmodel.TransactionsViewModel) r9
            java.lang.Object r3 = r1.A00
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            java.lang.Class<com.facebook.graphql.impls.TransactionLabelImpl> r2 = com.facebook.graphql.impls.TransactionLabelImpl.class
            com.facebook.pando.TreeJNI r5 = r3.reinterpret(r2)
            if (r5 == 0) goto L_0x0a32
            X.20c r4 = X.C302220c.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "transaction_type"
            java.lang.Enum r1 = X.C86104wH.A0a(r5, r4, r1)
            X.20c r1 = (X.C302220c) r1
            if (r1 == 0) goto L_0x0a32
            int r1 = r1.ordinal()
        L_0x08ff:
            r4 = 2
            java.lang.String r5 = "Required value was null."
            if (r1 == r4) goto L_0x09cb
            r4 = 1
            if (r1 != r4) goto L_0x0970
            r10 = 0
            com.facebook.pando.TreeJNI r1 = r3.reinterpret(r2)
            java.lang.String r4 = "transaction_id"
            java.lang.String r14 = r1.getStringValue(r4)
            if (r14 == 0) goto L_0x0a3a
            r22 = 4084(0xff4, float:5.723E-42)
            java.lang.String r11 = "user_click_payouthub_atomic"
            java.lang.String r12 = "earnings_details_view_click"
            r13 = r10
            r15 = r10
            r16 = r10
            r17 = r10
            r18 = r10
            r19 = r10
            r20 = r10
            r21 = r10
            com.facebookpay.msc.transactions.viewmodel.TransactionsViewModel.A03(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r1 = X.C86124wJ.A0u(r3, r2, r4)
            if (r1 == 0) goto L_0x09c8
            java.lang.Integer r1 = X.AnonymousClass4n2.A01(r1)
            if (r1 == 0) goto L_0x09c8
            int r7 = r1.intValue()
        L_0x093b:
            java.lang.String r8 = X.C86124wJ.A0u(r3, r2, r4)
            java.lang.String r6 = "transactions"
            r5 = 667750821(0x27cd11a5, float:5.691806E-15)
            X.AnonymousClass7Kz.A06()
            com.facebook.pando.TreeJNI r1 = X.C86144wL.A0N(r9)
            if (r1 == 0) goto L_0x0a35
            java.lang.String r4 = X.C86144wL.A0r(r1)
            if (r4 == 0) goto L_0x0a35
            com.facebook.quicklog.MarkerEditor r5 = X.AnonymousClass7Kz.A02(r5, r7)
            java.lang.String r1 = "entry_point"
            r5.annotate((java.lang.String) r1, (java.lang.String) r6)
            java.lang.String r1 = "entry_point_clicked"
            r5.point(r1)
            java.lang.String r1 = "financial_entity_id"
            r5.annotate((java.lang.String) r1, (java.lang.String) r4)
            if (r8 == 0) goto L_0x096d
            java.lang.String r1 = "payout_record_id"
        L_0x096a:
            r5.annotate((java.lang.String) r1, (java.lang.String) r8)
        L_0x096d:
            r5.markerEditingCompleted()
        L_0x0970:
            r4 = 0
            com.facebook.pando.TreeJNI r6 = r3.reinterpret(r2)
            if (r6 == 0) goto L_0x09be
            X.20c r5 = X.C302220c.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "transaction_type"
            java.lang.Enum r1 = X.C86104wH.A0a(r6, r5, r1)
            X.20c r1 = (X.C302220c) r1
            if (r1 == 0) goto L_0x09be
            int r5 = r1.ordinal()
            r1 = 2
            if (r5 == r1) goto L_0x09c3
            r1 = 1
            if (r5 != r1) goto L_0x09be
            java.lang.String r8 = "earnings_details_v2_fragment"
            java.lang.String r7 = "payout_record_id"
        L_0x0991:
            X.56q r6 = r9.A03
            android.os.Bundle r5 = X.C18180wK.A06()
            com.facebook.pando.TreeJNI r1 = X.C86144wL.A0N(r9)
            if (r1 == 0) goto L_0x09a1
            java.lang.String r4 = X.C86144wL.A0r(r1)
        L_0x09a1:
            java.lang.String r1 = "financial_entity_id"
            r5.putString(r1, r4)
            X.C86164wN.A17(r5, r9)
            com.facebook.pando.TreeJNI r2 = r3.reinterpret(r2)
            java.lang.String r1 = "transaction_id"
            java.lang.String r1 = r2.getStringValue(r1)
            r5.putString(r7, r1)
            X.7jS r1 = new X.7jS
            r1.<init>(r5, r8)
            X.AnonymousClass7JD.A02(r6, r1)
        L_0x09be:
            r1 = 1871799743(0x6f9165bf, float:8.999666E28)
            goto L_0x1968
        L_0x09c3:
            java.lang.String r8 = "payout_details_v2_fragment"
            java.lang.String r7 = "payout_release_id"
            goto L_0x0991
        L_0x09c8:
            r7 = 0
            goto L_0x093b
        L_0x09cb:
            com.facebook.pando.TreeJNI r1 = r3.reinterpret(r2)
            java.lang.String r4 = "transaction_id"
            java.lang.String r13 = r1.getStringValue(r4)
            if (r13 == 0) goto L_0x0a44
            r10 = 0
            r22 = 4088(0xff8, float:5.729E-42)
            java.lang.String r11 = "user_click_payouthub_atomic"
            java.lang.String r12 = "payouts_details_view_click"
            r14 = r10
            r15 = r10
            r16 = r10
            r17 = r10
            r18 = r10
            r19 = r10
            r20 = r10
            r21 = r10
            com.facebookpay.msc.transactions.viewmodel.TransactionsViewModel.A03(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r1 = X.C86124wJ.A0u(r3, r2, r4)
            if (r1 == 0) goto L_0x0a30
            java.lang.Integer r1 = X.AnonymousClass4n2.A01(r1)
            if (r1 == 0) goto L_0x0a30
            int r7 = r1.intValue()
        L_0x09ff:
            java.lang.String r8 = X.C86124wJ.A0u(r3, r2, r4)
            java.lang.String r6 = "transactions"
            r5 = 667750653(0x27cd10fd, float:5.691735E-15)
            X.AnonymousClass7Kz.A06()
            com.facebook.pando.TreeJNI r1 = X.C86144wL.A0N(r9)
            if (r1 == 0) goto L_0x0a3f
            java.lang.String r4 = X.C86144wL.A0r(r1)
            if (r4 == 0) goto L_0x0a3f
            com.facebook.quicklog.MarkerEditor r5 = X.AnonymousClass7Kz.A02(r5, r7)
            java.lang.String r1 = "entry_point"
            r5.annotate((java.lang.String) r1, (java.lang.String) r6)
            java.lang.String r1 = "entry_point_clicked"
            r5.point(r1)
            java.lang.String r1 = "financial_entity_id"
            r5.annotate((java.lang.String) r1, (java.lang.String) r4)
            if (r8 == 0) goto L_0x096d
            java.lang.String r1 = "batch_item_id"
            goto L_0x096a
        L_0x0a30:
            r7 = 0
            goto L_0x09ff
        L_0x0a32:
            r1 = -1
            goto L_0x08ff
        L_0x0a35:
            java.lang.IllegalStateException r10 = X.AnonymousClass0wJ.A0b()
            throw r10
        L_0x0a3a:
            java.lang.IllegalStateException r10 = X.C18180wK.A0a(r5)
            throw r10
        L_0x0a3f:
            java.lang.IllegalStateException r10 = X.AnonymousClass0wJ.A0b()
            throw r10
        L_0x0a44:
            java.lang.IllegalStateException r10 = X.C18180wK.A0a(r5)
            throw r10
        L_0x0a49:
            r0 = -536561549(0xffffffffe004b873, float:-3.825408E19)
            int r5 = X.C14030oh.A05(r0)
            java.lang.Object r7 = r1.A01
            X.5j8 r7 = (X.AnonymousClass5j8) r7
            X.58J r4 = r7.A0L
            if (r4 != 0) goto L_0x0a5f
            java.lang.String r0 = "nuxViewModel"
            X.C04220Ms.A0E(r0)
            r10 = 0
            throw r10
        L_0x0a5f:
            java.lang.Object r3 = r1.A00
            com.facebook.graphql.impls.PaymentMethodComponentImpl$NewPaymentCredentialOptions r3 = (com.facebook.graphql.impls.PaymentMethodComponentImpl.NewPaymentCredentialOptions) r3
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            X.56r r0 = r4.A0F
            r0.A0H(r3)
            r4.A08()
            X.LcE r2 = X.C40307LcE.A04
            java.lang.Object r0 = r0.A08()
            com.facebook.graphql.impls.PaymentMethodComponentImpl$NewPaymentCredentialOptions r0 = (com.facebook.graphql.impls.PaymentMethodComponentImpl.NewPaymentCredentialOptions) r0
            if (r0 == 0) goto L_0x0a80
            X.LcE r1 = X.C122157Kv.A0I(r0)
            r0 = 1
            if (r1 == r2) goto L_0x0a81
        L_0x0a80:
            r0 = 0
        L_0x0a81:
            X.56q r2 = r4.A0A
            if (r0 == 0) goto L_0x0aa8
            int r0 = X.AnonymousClass58J.A00(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r0)
        L_0x0a91:
            r2.A0H(r0)
            X.LcE r6 = X.C122157Kv.A0I(r3)
            r9 = 0
            r12 = 50
            java.lang.String r8 = "user_click_credential_atomic"
            java.lang.String r10 = "new_credential_option_nux"
            r11 = r9
            X.AnonymousClass5j8.A07(r6, r7, r8, r9, r10, r11, r12)
            r0 = -415676243(0xffffffffe73948ad, float:-8.749784E23)
            goto L_0x11b9
        L_0x0aa8:
            X.7Kx r1 = X.C86104wH.A0R(r2)
            r0 = 14
            X.7Kx r0 = X.AnonymousClass7Kx.A06(r1, r4, r0)
            goto L_0x0a91
        L_0x0ab3:
            r0 = -218282079(0xfffffffff2fd47a1, float:-1.00334466E31)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r1.A01
            X.5j8 r2 = (X.AnonymousClass5j8) r2
            X.58J r3 = r2.A0L
            java.lang.String r4 = "nuxViewModel"
            if (r3 == 0) goto L_0x1848
            X.588 r3 = r3.A0R
            java.util.List r10 = r3.A04()
            X.58J r3 = r2.A0L
            if (r3 == 0) goto L_0x1848
            X.588 r3 = r3.A0R
            java.util.List r11 = r3.A06()
            X.7H3 r5 = X.AnonymousClass7H3.A00
            android.view.ContextThemeWrapper r6 = r2.A00
            if (r6 != 0) goto L_0x0ade
            java.lang.String r4 = "wrapperContext"
            goto L_0x1848
        L_0x0ade:
            androidx.fragment.app.Fragment r7 = r2.mParentFragment
            if (r7 == 0) goto L_0x0b18
            java.lang.Object r1 = r1.A00
            X.59v r1 = (X.C886359v) r1
            com.fbpay.logging.LoggingContext r9 = r1.A03
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = r2.A0J
            if (r1 != 0) goto L_0x0af0
            java.lang.String r4 = "ecpPaymentRequest"
            goto L_0x1848
        L_0x0af0:
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r1 = r1.A04
            X.69R r8 = r1.A01
            r1 = 202(0xca, float:2.83E-43)
            java.lang.String r1 = X.C18170wI.A00(r1)
            X.C04220Ms.A0C(r10, r1)
            r1 = 49
            kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4 r12 = X.C86164wN.A0r(r2, r1)
            r1 = 0
            kotlin.jvm.internal.KtLambdaShape150S0100000_I2_5 r13 = X.C86164wN.A0s(r2, r1)
            X.58J r1 = r2.A0L
            if (r1 == 0) goto L_0x1848
            X.588 r1 = r1.A0R
            boolean r14 = r1.A02
            r5.A02(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = -596166800(0xffffffffdc773770, float:-2.78341094E17)
            goto L_0x1968
        L_0x0b18:
            java.lang.IllegalStateException r10 = X.AnonymousClass0wJ.A0b()
            r1 = -1295449779(0xffffffffb2c9014d, float:-2.3400071E-8)
            X.C14030oh.A0C(r1, r0)
            throw r10
        L_0x0b23:
            r0 = -1361785223(0xffffffffaed4ce79, float:-9.677321E-11)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r1.A01
            com.facebookpay.widget.listcell.ListCell r3 = (com.facebookpay.widget.listcell.ListCell) r3
            com.fbpay.logging.LoggingContext r0 = r3.A0O
            if (r0 == 0) goto L_0x0b43
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r0 = r3.A0J
            if (r0 == 0) goto L_0x0b43
            X.7ke r4 = X.AnonymousClass7JJ.A01()
            java.util.Map r3 = X.AnonymousClass6I7.A00(r3)
            java.lang.String r0 = "user_click_fbpayui_atomic"
            r4.Bb8(r0, r3)
        L_0x0b43:
            java.lang.Object r0 = r1.A00
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r5)
            r0 = 1111294350(0x423d018e, float:47.25152)
            goto L_0x1927
        L_0x0b4f:
            r0 = -799778848(0xffffffffd05457e0, float:-1.42501151E10)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.6p6 r0 = (X.C112166p6) r0
            java.util.List r3 = r0.A01
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0b8e
            java.lang.Object r4 = X.C18240wQ.A0b(r3)
            X.6j7 r4 = (X.C108886j7) r4
            if (r4 == 0) goto L_0x0b8e
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r3 = X.C18250wR.A05(r0)
            java.lang.String r0 = r4.A02
            r0.getClass()
            android.content.Intent r4 = X.C86164wN.A0B(r3, r0)
            X.0t2 r0 = X.C16420t2.A00()
            X.05P r3 = r0.A05()
            java.lang.Object r0 = r1.A00
            com.facebook.redex.IDxObserverShape211S0100000_2_I2 r0 = (com.facebook.redex.IDxObserverShape211S0100000_2_I2) r0
            java.lang.Object r0 = r0.A00
            androidx.fragment.app.FragmentActivity r0 = X.C18240wQ.A0I(r0)
            r3.A09(r0, r4)
        L_0x0b8e:
            r0 = -1160970864(0xffffffffbaccfd90, float:-0.0015639532)
            goto L_0x1927
        L_0x0b93:
            r0 = 593363351(0x235e0197, float:1.2034981E-17)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r1.A00
            X.561 r3 = (X.AnonymousClass561) r3
            X.57q r8 = r3.A01
            androidx.fragment.app.FragmentActivity r6 = r3.requireActivity()
            android.os.Bundle r2 = r3.requireArguments()
            java.lang.Object r1 = r1.A01
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r7 = r1.isChecked()
            java.lang.String r5 = "logger_data"
            android.os.Parcelable r1 = X.C18240wQ.A0D(r2, r5)
            com.fbpay.logging.FBPayLoggerData r1 = (com.fbpay.logging.FBPayLoggerData) r1
            java.util.Map r4 = X.C122037Js.A06(r1)
            X.6BC r2 = X.AnonymousClass6BC.BIO
            java.lang.String r1 = "auth_factor_type"
            r4.put(r1, r2)
            if (r7 == 0) goto L_0x0d01
            X.6BK r2 = X.AnonymousClass6BK.TURN_OFF_USE_BIO_ID
        L_0x0bc7:
            java.lang.String r1 = "target_name"
            X.8h9 r2 = X.C121817Ig.A02(r1, r2, r4)
            java.lang.String r1 = "user_click_auth_atomic"
            r2.Bb8(r1, r4)
            X.583 r14 = r8.A06
            X.M5J r7 = r14.A02
            X.7Kx r4 = X.C86104wH.A0R(r7)
            if (r4 == 0) goto L_0x0bfd
            boolean r1 = X.AnonymousClass7Kx.A0R(r4)
            if (r1 == 0) goto L_0x0c15
            java.lang.String r5 = X.C883357q.A00(r8)
            android.os.Bundle r4 = r8.A00
            X.56q r1 = r14.A03
            X.7Kx r1 = X.C86104wH.A0R(r1)
            boolean r1 = X.AnonymousClass7Kx.A0P(r1)
            if (r1 != 0) goto L_0x0bfd
            r2 = 2
            com.facebook.redex.IDxObserverShape24S1200000_2_I2 r1 = new com.facebook.redex.IDxObserverShape24S1200000_2_I2
            r1.<init>(r4, r14, r5, r2)
            X.AnonymousClass7Kx.A0H(r7, r1)
        L_0x0bfd:
            android.os.Bundle r4 = r3.requireArguments()
            java.lang.String r3 = "fbpay_use_faceid_click"
            X.79t r1 = X.AnonymousClass7Kz.A07()
            X.8h9 r2 = r1.A07
            java.util.Map r1 = X.C121257Ff.A00(r4)
            r2.Bb8(r3, r1)
            r1 = -2063885562(0xffffffff84fb9b06, float:-5.9152183E-36)
            goto L_0x1968
        L_0x0c15:
            boolean r1 = X.AnonymousClass7Kx.A0O(r4)
            if (r1 == 0) goto L_0x0bfd
            java.lang.Throwable r2 = r4.A02
            boolean r1 = r2 instanceof X.C1373588g
            if (r1 == 0) goto L_0x0bfd
            r2.getClass()
            X.88g r2 = (X.C1373588g) r2
            int r2 = r2.A00
            r1 = 102(0x66, float:1.43E-43)
            if (r2 != r1) goto L_0x0c3e
            java.lang.Object r1 = r4.A01
            if (r1 == 0) goto L_0x0c73
            java.lang.String r4 = X.C883357q.A00(r8)
            X.7Dk r1 = (X.C120967Dk) r1
            java.lang.String r2 = r1.A06
            android.os.Bundle r1 = r8.A00
            r14.A03(r4, r2, r1)
            goto L_0x0bfd
        L_0x0c3e:
            r1 = 11
            if (r2 != r1) goto L_0x0c73
            X.56r r4 = r8.A05
            X.6n7 r5 = new X.6n7
            r5.<init>()
            r1 = 2131821642(0x7f11044a, float:1.9276033E38)
            r5.A07 = r1
            r1 = 2131821641(0x7f110449, float:1.927603E38)
            r5.A00 = r1
            r1 = 2131821644(0x7f11044c, float:1.9276037E38)
            r5.A06 = r1
            r1 = 2131821643(0x7f11044b, float:1.9276035E38)
            r5.A02 = r1
            r2 = 0
            com.facebook.redex.IDxCListenerShape77S0200000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape77S0200000_1_I2
            r1.<init>((int) r2, (java.lang.Object) r8, (java.lang.Object) r6)
            r5.A0B = r1
            X.6sZ r7 = new X.6sZ
            r7.<init>(r5)
        L_0x0c6a:
            X.7JD r1 = new X.7JD
            r1.<init>(r7)
        L_0x0c6f:
            r4.A0G(r1)
            goto L_0x0bfd
        L_0x0c73:
            r7 = 1
            r1 = 12
            if (r2 == r1) goto L_0x0bfd
            if (r2 == r7) goto L_0x0bfd
            X.M5J r1 = r8.A01
            X.7Kx r2 = X.C86104wH.A0R(r1)
            boolean r1 = X.AnonymousClass7Kx.A0R(r2)
            if (r1 == 0) goto L_0x0cc6
            java.lang.Object r1 = X.AnonymousClass7Kx.A0D(r2)
            X.6cb r1 = (X.C104926cb) r1
            java.lang.String r2 = r1.A00
            java.lang.String r1 = "DELETED"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x0cc6
            java.lang.String r15 = "SETUP_PIN_TO_CREATE_BIO_HUB"
        L_0x0c98:
            java.lang.String r6 = X.C883357q.A00(r8)
            android.os.Bundle r13 = r8.A00
            X.56q r4 = r14.A04
            X.7Kx r1 = X.C86104wH.A0R(r4)
            boolean r1 = X.AnonymousClass7Kx.A0P(r1)
            if (r1 != 0) goto L_0x0bfd
            r8 = 0
            X.7Kx r1 = X.AnonymousClass7Kx.A09(r8)
            r4.A0G(r1)
            X.7Gx r2 = r14.A01
            r1 = 15
            int r2 = r2.A03(r1)
            if (r2 == 0) goto L_0x0cc9
            X.88g r1 = new X.88g
            r1.<init>(r2)
            X.7Kx r1 = X.AnonymousClass7Kx.A0B(r8, r1)
            goto L_0x0c6f
        L_0x0cc6:
            java.lang.String r15 = "VERIFY_PIN_TO_ENABLE_BIO_HUB"
            goto L_0x0c98
        L_0x0cc9:
            com.facebook.redex.IDxACallbackShape2S2200000_2_I2 r11 = new com.facebook.redex.IDxACallbackShape2S2200000_2_I2
            r12 = r11
            r16 = r6
            r17 = r7
            r12.<init>(r13, r14, r15, r16, r17)
            android.os.Parcelable r1 = X.C18240wQ.A0D(r13, r5)
            com.fbpay.logging.FBPayLoggerData r1 = (com.fbpay.logging.FBPayLoggerData) r1
            X.6gT r12 = X.AnonymousClass7BN.A01(r1, r6)
            android.os.Bundle r2 = r12.A01
            X.AnonymousClass7Hq.A03(r2, r15)
            if (r13 == 0) goto L_0x0ceb
            android.os.Parcelable r1 = r13.getParcelable(r5)
            r2.putParcelable(r5, r1)
        L_0x0ceb:
            java.lang.String r1 = "CREATE_AUTH_TICKET_BASED_FACTOR"
            X.C86154wM.A1C(r2, r1)
            X.56r r4 = r14.A05
            X.6ci r1 = r14.A09
            X.85p r1 = r1.A00
            java.util.concurrent.Executor r13 = r1.A03
            X.6sP r7 = new X.6sP
            r9 = r8
            r10 = r8
            r7.<init>(r8, r9, r10, r11, r12, r13)
            goto L_0x0c6a
        L_0x0d01:
            X.6BK r2 = X.AnonymousClass6BK.TURN_ON_USE_BIO_ID
            goto L_0x0bc7
        L_0x0d05:
            r0 = 2054666974(0x7a77bade, float:3.2157186E35)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r5)
            r0 = -895907890(0xffffffffca9987ce, float:-5030887.0)
            goto L_0x1927
        L_0x0d18:
            r0 = -825916332(0xffffffffcec58454, float:-1.6568919E9)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r1.A00
            X.561 r5 = (X.AnonymousClass561) r5
            X.57q r7 = r5.A01
            android.os.Bundle r2 = r5.requireArguments()
            java.lang.Object r1 = r1.A01
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r6 = r1.isChecked()
            java.lang.String r4 = "logger_data"
            android.os.Parcelable r1 = X.C18240wQ.A0D(r2, r4)
            com.fbpay.logging.FBPayLoggerData r1 = (com.fbpay.logging.FBPayLoggerData) r1
            java.util.Map r3 = X.C122037Js.A06(r1)
            X.6BC r2 = X.AnonymousClass6BC.PIN
            java.lang.String r1 = "auth_factor_type"
            r3.put(r1, r2)
            if (r6 == 0) goto L_0x0e14
            X.6BK r2 = X.AnonymousClass6BK.TURN_OFF_ALWAYS_ASK_FOR_PIN
        L_0x0d48:
            java.lang.String r1 = "target_name"
            X.8h9 r2 = X.C121817Ig.A02(r1, r2, r3)
            java.lang.String r1 = "user_click_auth_atomic"
            r2.Bb8(r1, r3)
            X.M5J r2 = r7.A01
            X.7Kx r1 = X.C86104wH.A0R(r2)
            boolean r1 = X.AnonymousClass7Kx.A0R(r1)
            if (r1 == 0) goto L_0x0da9
            java.lang.Object r1 = r2.A08()
            r1.getClass()
            X.7Kx r1 = (X.AnonymousClass7Kx) r1
            java.lang.Object r3 = r1.A01
            X.6cb r3 = (X.C104926cb) r3
            if (r3 == 0) goto L_0x0da9
            X.56r r6 = r7.A04
            java.lang.String r2 = X.C883357q.A00(r7)
            android.os.Bundle r1 = r7.A00
            r1.getClass()
            android.os.Parcelable r1 = X.C18240wQ.A0D(r1, r4)
            com.fbpay.logging.FBPayLoggerData r1 = (com.fbpay.logging.FBPayLoggerData) r1
            X.6gT r4 = X.AnonymousClass7BN.A01(r1, r2)
            java.lang.String r2 = r3.A00
            java.lang.String r1 = "ACTIVE"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x0dc1
            android.os.Bundle r3 = r4.A01
            java.lang.String r1 = "VERIFY_PIN_TO_DISABLE_PIN_HUB"
            X.AnonymousClass7Hq.A03(r3, r1)
            java.lang.String r2 = "DISABLE_PIN"
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0da1
            java.lang.String r1 = "AUTH_EXTENSION_ID"
            r3.putString(r1, r2)
        L_0x0da1:
            java.lang.String r1 = "DISABLE_FBPAY_PIN"
            X.C86154wM.A1C(r3, r1)
        L_0x0da6:
            X.AnonymousClass7JD.A03(r6, r4)
        L_0x0da9:
            android.os.Bundle r4 = r5.requireArguments()
            java.lang.String r3 = "fbpay_always_ask_for_pin_click"
            X.79t r1 = X.AnonymousClass7Kz.A07()
            X.8h9 r2 = r1.A07
            java.util.Map r1 = X.C121257Ff.A00(r4)
            r2.Bb8(r3, r1)
            r1 = 1638021574(0x61a239c6, float:3.7406694E20)
            goto L_0x1968
        L_0x0dc1:
            java.lang.String r1 = "DELETED"
            boolean r1 = r1.equalsIgnoreCase(r2)
            java.lang.String r7 = "ENABLE_FBPAY_PIN"
            if (r1 == 0) goto L_0x0dd6
            android.os.Bundle r2 = r4.A01
            X.C86154wM.A1C(r2, r7)
            java.lang.String r1 = "CREATE_PIN_FROM_HUB"
        L_0x0dd2:
            X.AnonymousClass7Hq.A03(r2, r1)
            goto L_0x0da6
        L_0x0dd6:
            java.lang.String r1 = "DISABLED"
            boolean r1 = r1.equalsIgnoreCase(r2)
            java.lang.String r3 = "ENABLE_PIN"
            if (r1 == 0) goto L_0x0df5
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x0ded
            android.os.Bundle r2 = r4.A01
            java.lang.String r1 = "AUTH_EXTENSION_ID"
            r2.putString(r1, r3)
        L_0x0ded:
            android.os.Bundle r2 = r4.A01
            X.C86154wM.A1C(r2, r7)
            java.lang.String r1 = "VERIFY_PIN_TO_ENABLE_PIN_HUB"
            goto L_0x0dd2
        L_0x0df5:
            java.lang.String r1 = "LOCKED"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x0da6
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x0e0a
            android.os.Bundle r2 = r4.A01
            java.lang.String r1 = "AUTH_EXTENSION_ID"
            r2.putString(r1, r3)
        L_0x0e0a:
            android.os.Bundle r2 = r4.A01
            java.lang.String r1 = "RESET_FBPAY_PIN"
            X.C86154wM.A1C(r2, r1)
            java.lang.String r1 = "LOCKED_PIN_RECOVER_WITH_PASSWORD_HUB"
            goto L_0x0dd2
        L_0x0e14:
            X.6BK r2 = X.AnonymousClass6BK.TURN_ON_ALWAYS_ASK_FOR_PIN
            goto L_0x0d48
        L_0x0e18:
            r0 = -588562543(0xffffffffdceb3f91, float:-5.29732092E17)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A00
            X.5jt r0 = (X.C92805jt) r0
            java.lang.Object r5 = r1.A01
            com.facebook.pando.TreeJNI r5 = (com.facebook.pando.TreeJNI) r5
            com.fbpay.logging.FBPayLoggerData r1 = r0.A01
            java.util.Map r6 = X.C122037Js.A06(r1)
            java.lang.String r4 = "id"
            java.lang.String r1 = r5.getStringValue(r4)
            r1.getClass()
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r1)
            r6.put(r4, r1)
            X.8h9 r3 = r0.A04
            java.lang.String r1 = "user_edit_shippingaddress_enter"
            r3.Bb8(r1, r6)
            com.fbpay.logging.FBPayLoggerData r3 = r0.A01
            java.lang.String r17 = r5.getStringValue(r4)
            java.lang.String r18 = X.C86154wM.A0j(r5)
            java.lang.String r1 = "care_of"
            java.lang.String r19 = r5.getStringValue(r1)
            java.lang.String r1 = "street1"
            java.lang.String r20 = r5.getStringValue(r1)
            java.lang.String r1 = "street2"
            java.lang.String r21 = r5.getStringValue(r1)
            java.lang.String r1 = "city_name"
            java.lang.String r22 = r5.getStringValue(r1)
            java.lang.String r1 = "postal_code"
            java.lang.String r23 = r5.getStringValue(r1)
            java.lang.String r1 = "state_name"
            java.lang.String r24 = r5.getStringValue(r1)
            java.lang.String r1 = "country_name"
            java.lang.String r25 = r5.getStringValue(r1)
            com.facebookpay.form.model.AddressFormFieldsConfig r1 = r0.A00
            r1.getClass()
            java.lang.String r4 = "is_default"
            boolean r26 = r5.getBooleanValue(r4)
            java.lang.String r8 = "fbpay_edit_shipping_address_display"
            java.lang.String r14 = "fbpay_edit_shipping_address_click"
            java.lang.String r5 = "fbpay_edit_shipping_address_cancel"
            java.lang.String r13 = "fbpay_edit_shipping_address_api_init"
            java.lang.String r16 = "fbpay_edit_shipping_address_success"
            java.lang.String r15 = "fbpay_edit_shipping_address_failure"
            java.lang.String r10 = "fbpay_delete_shipping_address_display"
            java.lang.String r7 = "fbpay_delete_shipping_address_click"
            java.lang.String r6 = "fbpay_delete_shipping_address_cancel"
            java.lang.String r9 = "fbpay_delete_shipping_address_api_init"
            java.lang.String r12 = "fbpay_delete_shipping_address_success"
            java.lang.String r11 = "fbpay_delete_shipping_address_failure"
            com.fbpay.hub.form.params.FormLogEvents r4 = new com.fbpay.hub.form.params.FormLogEvents
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r15 = r4
            r16 = r3
            r14 = r1
            com.fbpay.hub.form.params.FormParams r3 = X.C99196Im.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            android.os.Bundle r4 = X.C18180wK.A06()
            java.lang.String r1 = "form_params"
            r4.putParcelable(r1, r3)
            X.56r r3 = r0.A06
            java.lang.String r1 = "form"
            X.76N r0 = new X.76N
            r0.<init>(r1, r4)
            X.AnonymousClass7JD.A02(r3, r0)
            r0 = -167640481(0xfffffffff602025f, float:-6.592253E32)
            goto L_0x1927
        L_0x0ec2:
            r0 = -629043796(0xffffffffda818dac, float:-1.82330209E16)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A00
            X.5jt r0 = (X.C92805jt) r0
            java.lang.Object r1 = r1.A01
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            boolean r26 = r1.isEmpty()
            com.fbpay.logging.FBPayLoggerData r1 = r0.A01
            java.util.Map r4 = X.C122037Js.A06(r1)
            X.8h9 r3 = r0.A04
            java.lang.String r1 = "user_add_shippingaddress_enter"
            r3.Bb8(r1, r4)
            com.fbpay.logging.FBPayLoggerData r3 = r0.A01
            com.facebookpay.form.model.AddressFormFieldsConfig r1 = r0.A00
            r1.getClass()
            X.7Ig r4 = X.AnonymousClass7Kz.A0K()
            com.instagram.service.session.UserSession r4 = r4.A09
            com.instagram.user.model.User r4 = X.AnonymousClass0wJ.A0Y(r4)
            java.lang.String r19 = r4.Ak1()
            r17 = 0
            java.lang.String r8 = "fbpay_add_shipping_address_display"
            java.lang.String r14 = "fbpay_add_shipping_address_click"
            java.lang.String r5 = "fbpay_add_shipping_address_cancel"
            java.lang.String r13 = "fbpay_add_shipping_address_api_init"
            java.lang.String r16 = "fbpay_add_shipping_address_success"
            java.lang.String r15 = "fbpay_add_shipping_address_failure"
            java.lang.String r10 = "fbpay_delete_shipping_address_display"
            java.lang.String r7 = "fbpay_delete_shipping_address_click"
            java.lang.String r6 = "fbpay_delete_shipping_address_cancel"
            java.lang.String r9 = "fbpay_delete_shipping_address_api_init"
            java.lang.String r12 = "fbpay_delete_shipping_address_success"
            java.lang.String r11 = "fbpay_delete_shipping_address_failure"
            com.fbpay.hub.form.params.FormLogEvents r4 = new com.fbpay.hub.form.params.FormLogEvents
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r15 = r4
            r16 = r3
            r18 = r17
            r20 = r17
            r21 = r17
            r22 = r17
            r23 = r17
            r24 = r17
            r25 = r17
            r14 = r1
            com.fbpay.hub.form.params.FormParams r3 = X.C99196Im.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            android.os.Bundle r4 = X.C18180wK.A06()
            java.lang.String r1 = "form_params"
            r4.putParcelable(r1, r3)
            X.56r r3 = r0.A06
            java.lang.String r1 = "form"
            X.76N r0 = new X.76N
            r0.<init>(r1, r4)
            X.AnonymousClass7JD.A02(r3, r0)
            r0 = -556023607(0xffffffffdedbc0c9, float:-7.9174386E18)
            goto L_0x1927
        L_0x0f46:
            r0 = -672648997(0xffffffffd7e830db, float:-5.10593061E14)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A00
            X.5k0 r0 = (X.AnonymousClass5k0) r0
            java.lang.Object r7 = r1.A01
            com.facebook.pando.TreeJNI r7 = (com.facebook.pando.TreeJNI) r7
            com.fbpay.logging.FBPayLoggerData r1 = r0.A01
            java.util.Map r4 = X.C122037Js.A06(r1)
            java.lang.String r6 = "id"
            java.lang.String r1 = r7.getStringValue(r6)
            r1.getClass()
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r1)
            r4.put(r6, r1)
            java.lang.String r3 = "target_name"
            java.lang.String r1 = "edit_email"
            r4.put(r3, r1)
            X.8h9 r3 = r0.A03
            java.lang.String r1 = "user_edit_contact_enter"
            r3.Bb8(r1, r4)
            com.fbpay.logging.FBPayLoggerData r5 = r0.A01
            java.lang.String r1 = "normalized_email_address"
            java.lang.String r4 = r7.getStringValue(r1)
            java.lang.String r1 = "is_default"
            boolean r3 = r7.getBooleanValue(r1)
            java.lang.String r1 = r7.getStringValue(r6)
            java.lang.String r10 = "fbpay_edit_email_display"
            java.lang.String r16 = "fbpay_edit_email_click"
            java.lang.String r7 = "fbpay_edit_email_cancel"
            java.lang.String r15 = "fbpay_edit_email_api_init"
            java.lang.String r18 = "fbpay_edit_email_success"
            java.lang.String r17 = "fbpay_edit_email_failure"
            java.lang.String r12 = "fbpay_delete_email_display"
            java.lang.String r9 = "fbpay_delete_email_click"
            java.lang.String r8 = "fbpay_delete_email_cancel"
            java.lang.String r11 = "fbpay_delete_email_api_init"
            java.lang.String r14 = "fbpay_delete_email_success"
            java.lang.String r13 = "fbpay_delete_email_failure"
            com.fbpay.hub.form.params.FormLogEvents r6 = new com.fbpay.hub.form.params.FormLogEvents
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.fbpay.hub.form.params.FormParams r1 = X.C99216Io.A00(r6, r5, r4, r1, r3)
            X.AnonymousClass5k0.A00(r0, r1)
            r0 = -870837652(0xffffffffcc18126c, float:-3.9864752E7)
            goto L_0x1927
        L_0x0fb4:
            r0 = -786682584(0xffffffffd11c2d28, float:-4.1923281E10)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A00
            X.5k0 r0 = (X.AnonymousClass5k0) r0
            java.lang.Object r7 = r1.A01
            com.facebook.pando.TreeJNI r7 = (com.facebook.pando.TreeJNI) r7
            com.fbpay.logging.FBPayLoggerData r1 = r0.A01
            java.util.Map r4 = X.C122037Js.A06(r1)
            java.lang.String r6 = "id"
            java.lang.String r1 = r7.getStringValue(r6)
            r1.getClass()
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r1)
            r4.put(r6, r1)
            java.lang.String r3 = "target_name"
            java.lang.String r1 = "edit_phone"
            r4.put(r3, r1)
            X.8h9 r3 = r0.A03
            java.lang.String r1 = "user_edit_contact_enter"
            r3.Bb8(r1, r4)
            com.fbpay.logging.FBPayLoggerData r5 = r0.A01
            java.lang.String r1 = "normalized_phone_number"
            java.lang.String r4 = r7.getStringValue(r1)
            java.lang.String r1 = "is_default"
            boolean r3 = r7.getBooleanValue(r1)
            java.lang.String r1 = r7.getStringValue(r6)
            java.lang.String r10 = "fbpay_edit_phone_display"
            java.lang.String r16 = "fbpay_edit_phone_click"
            java.lang.String r7 = "fbpay_edit_phone_cancel"
            java.lang.String r15 = "fbpay_edit_phone_api_init"
            java.lang.String r18 = "fbpay_edit_phone_success"
            java.lang.String r17 = "fbpay_edit_phone_failure"
            java.lang.String r12 = "fbpay_delete_phone_display"
            java.lang.String r9 = "fbpay_delete_phone_click"
            java.lang.String r8 = "fbpay_delete_phone_cancel"
            java.lang.String r11 = "fbpay_delete_phone_api_init"
            java.lang.String r14 = "fbpay_delete_phone_success"
            java.lang.String r13 = "fbpay_delete_phone_failure"
            com.fbpay.hub.form.params.FormLogEvents r6 = new com.fbpay.hub.form.params.FormLogEvents
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.fbpay.hub.form.params.FormParams r1 = X.C99226Ip.A00(r6, r5, r4, r1, r3)
            X.AnonymousClass5k0.A00(r0, r1)
            r0 = 85901543(0x51ec0e7, float:7.464555E-36)
            goto L_0x1927
        L_0x1022:
            r0 = -1848067717(0xffffffff91d8b97b, float:-3.4193102E-28)
            int r5 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r1.A01
            com.fbpay.hub.orders.api.FBPayOrder r6 = (com.fbpay.hub.orders.api.FBPayOrder) r6
            java.lang.String r2 = r6.A05
            java.lang.String r0 = "CHEXOrderItem"
            boolean r4 = r2.equals(r0)
            android.os.Bundle r3 = X.C18180wK.A06()
            if (r4 == 0) goto L_0x1061
            java.lang.String r2 = "order_id"
        L_0x103d:
            java.lang.String r0 = r6.A03
            r3.putString(r2, r0)
            java.lang.Object r2 = r1.A00
            X.5jq r2 = (X.C92775jq) r2
            com.fbpay.logging.FBPayLoggerData r0 = r2.A00
            X.C86154wM.A1E(r3, r0)
            if (r4 == 0) goto L_0x105e
            java.lang.String r0 = "order_detail"
        L_0x104f:
            X.76N r1 = new X.76N
            r1.<init>(r0, r3)
            X.56r r0 = r2.A06
            X.AnonymousClass7JD.A02(r0, r1)
            r0 = 927265768(0x3744f3e8, float:1.1739299E-5)
            goto L_0x11b9
        L_0x105e:
            java.lang.String r0 = "transaction_details"
            goto L_0x104f
        L_0x1061:
            java.lang.String r2 = "transaction_id"
            goto L_0x103d
        L_0x1064:
            r0 = 484562413(0x1ce1d5ed, float:1.494455E-21)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r1.A00
            X.5jp r5 = (X.C92765jp) r5
            java.lang.Object r0 = r1.A01
            com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod r0 = (com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod) r0
            android.os.Bundle r4 = X.C18180wK.A06()
            com.fbpay.logging.FBPayLoggerData r7 = r5.A00
            java.lang.String r9 = r0.A06
            java.lang.String r8 = r0.A07
            java.lang.String r0 = "%s • %s"
            java.lang.String r6 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r9, r8)
            r13 = 0
            r3 = 0
            com.google.common.collect.ImmutableList$Builder r10 = X.C86164wN.A0Q()
            java.lang.String r16 = "mcom_payout_method_display"
            com.fbpay.hub.form.params.FormLogEvents r12 = new com.fbpay.hub.form.params.FormLogEvents
            r14 = r13
            r15 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            r20 = r13
            r21 = r13
            r22 = r13
            r23 = r13
            r24 = r13
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = 17
            X.5h0 r1 = new X.5h0
            r1.<init>(r0)
            r0 = 2131823180(0x7f110a4c, float:1.9279152E38)
            r1.A03 = r0
            com.facebookpay.form.cell.label.LabelCellParams r0 = r1.A00()
            r10.add((java.lang.Object) r0)
            r0 = 2
            X.5h1 r1 = new X.5h1
            r1.<init>(r0)
            r1.A0F = r9
            r0 = 2131823181(0x7f110a4d, float:1.9279154E38)
            r1.A03 = r0
            r1.A03 = r3
            com.facebookpay.form.cell.text.TextCellParams r0 = r1.A00()
            r10.add((java.lang.Object) r0)
            r0 = 18
            X.5h1 r1 = new X.5h1
            r1.<init>(r0)
            java.lang.String r0 = "•••• %s"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r0, (java.lang.Object) r8)
            r1.A0F = r0
            r0 = 2131823178(0x7f110a4a, float:1.9279148E38)
            r1.A03 = r0
            r1.A03 = r3
            com.facebookpay.form.cell.text.TextCellParams r0 = r1.A00()
            r10.add((java.lang.Object) r0)
            r0 = 19
            X.5h0 r11 = new X.5h0
            r11.<init>(r0)
            r0 = 2131823179(0x7f110a4b, float:1.927915E38)
            r11.A03 = r0
            java.lang.String r8 = "https://www.facebook.com/policy.php"
            java.lang.String r3 = "[[facebook_privacy_policy_token]]"
            r1 = 2131827003(0x7f11193b, float:1.9286906E38)
            com.fbpay.hub.common.link.LinkParams r0 = new com.fbpay.hub.common.link.LinkParams
            r0.<init>(r3, r1, r8)
            com.google.common.collect.ImmutableList$Builder r9 = r11.A08
            r9.add((java.lang.Object) r0)
            java.lang.String r8 = "https://www.kasikornglobalpayment.com/th/privacy-policy"
            java.lang.String r3 = "[[kasikorn_global_payment_privacy_policy_token]]"
            r1 = 2131829268(0x7f112214, float:1.92915E38)
            com.fbpay.hub.common.link.LinkParams r0 = new com.fbpay.hub.common.link.LinkParams
            r0.<init>(r3, r1, r8)
            r9.add((java.lang.Object) r0)
            com.facebookpay.form.cell.label.LabelCellParams r0 = r11.A00()
            r10.add((java.lang.Object) r0)
            com.google.common.collect.ImmutableList r3 = r10.build()
            boolean r1 = X.C18250wR.A1K(r3)
            java.lang.String r0 = "Provide at least one cell params"
            X.AnonymousClass7Ko.A0D(r1, r0)
            com.fbpay.hub.form.params.FormParams r1 = new com.fbpay.hub.form.params.FormParams
            r1.<init>(r12, r7, r3, r6)
            java.lang.String r0 = "form_params"
            r4.putParcelable(r0, r1)
            X.56r r3 = r5.A06
            java.lang.String r1 = "form"
            X.76N r0 = new X.76N
            r0.<init>(r1, r4)
            X.AnonymousClass7JD.A02(r3, r0)
            r0 = 513211049(0x1e96faa9, float:1.5985538E-20)
            goto L_0x1927
        L_0x1143:
            r0 = -1285233985(0xffffffffb364e2bf, float:-5.329161E-8)
            int r5 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r1.A00
            X.5jz r3 = (X.C92865jz) r3
            java.lang.Object r6 = r1.A01
            com.facebook.pando.TreeJNI r6 = (com.facebook.pando.TreeJNI) r6
            com.fbpay.logging.FBPayLoggerData r0 = r3.A02
            java.util.Map r4 = X.C122037Js.A06(r0)
            java.lang.String r2 = "transaction_id"
            java.lang.String r0 = r6.getStringValue(r2)
            r0.getClass()
            java.lang.Long r0 = X.AnonymousClass0wJ.A0d(r0)
            r4.put(r2, r0)
            X.8h9 r1 = r3.A09
            java.lang.String r0 = "fbpay_transactions_details_click"
            r1.Bb8(r0, r4)
            java.lang.Class<com.facebook.graphql.impls.FBPayTransactionsQueryFragmentImpl$TransactionHubHistoryQuery$Transactions$OpenReceiptAction> r9 = com.facebook.graphql.impls.FBPayTransactionsQueryFragmentImpl.TransactionHubHistoryQuery.Transactions.OpenReceiptAction.class
            java.lang.String r8 = "open_receipt_action"
            com.facebook.pando.TreeJNI r0 = r6.getTreeValue(r8, r9)
            java.lang.String r7 = "logger_data"
            if (r0 == 0) goto L_0x11bd
            com.facebook.pando.TreeJNI r0 = r6.getTreeValue(r8, r9)
            java.lang.Class<com.facebook.graphql.impls.FBPayTransactionsQueryFragmentImpl$TransactionHubHistoryQuery$Transactions$OpenReceiptAction$ActionData> r4 = com.facebook.graphql.impls.FBPayTransactionsQueryFragmentImpl.TransactionHubHistoryQuery.Transactions.OpenReceiptAction.ActionData.class
            java.lang.String r1 = "action_data"
            com.facebook.pando.TreeJNI r0 = r0.getTreeValue(r1, r4)
            if (r0 == 0) goto L_0x11bd
            com.facebook.pando.TreeJNI r4 = X.C86114wI.A0O(r6, r9, r4, r8, r1)
            X.25a r1 = X.C312925a.A02
            java.lang.String r0 = "action_type"
            java.lang.Enum r1 = X.C86104wH.A0a(r4, r1, r0)
            X.25a r0 = X.C312925a.A01
            if (r1 != r0) goto L_0x11bd
            android.os.Bundle r4 = X.C18180wK.A06()
            com.fbpay.logging.FBPayLoggerData r0 = r3.A02
            r4.putParcelable(r7, r0)
            java.lang.String r0 = r6.getStringValue(r2)
            r4.putString(r2, r0)
            r1 = 2
            java.lang.String r0 = "transaction_details_bloks"
            X.76N r2 = new X.76N
            r2.<init>(r1, r0, r4)
        L_0x11b1:
            X.56r r1 = r3.A06
        L_0x11b3:
            X.AnonymousClass7JD.A02(r1, r2)
        L_0x11b6:
            r0 = 1102886619(0x41bcb6db, float:23.589285)
        L_0x11b9:
            X.C14030oh.A0C(r0, r5)
            return
        L_0x11bd:
            java.lang.String r0 = "show_legacy_receipt_view"
            boolean r0 = r6.getBooleanValue(r0)
            if (r0 == 0) goto L_0x1205
            java.lang.String r1 = "legacy_receipt_view_uri"
            java.lang.String r0 = r6.getStringValue(r1)
            if (r0 == 0) goto L_0x1205
            java.lang.String r0 = r6.getStringValue(r1)
            if (r0 == 0) goto L_0x11b6
            java.lang.String r0 = r6.getStringValue(r1)
            android.net.Uri r0 = X.C15430rJ.A01(r0)
            android.net.Uri$Builder r2 = r0.buildUpon()
            r2.getClass()
            com.fbpay.logging.FBPayLoggerData r0 = r3.A02
            java.lang.String r1 = r0.A00()
            r1.getClass()
            java.lang.String r0 = X.C61953Wm.A00()
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            X.AnonymousClass7Kz.A0K()
            java.lang.String r1 = "Instagram"
            java.lang.String r0 = "transaction_source"
            android.net.Uri r0 = X.C18220wO.A0F(r2, r0, r1)
            X.56r r1 = r3.A0A
            java.lang.String r2 = r0.toString()
            goto L_0x11b3
        L_0x1205:
            android.os.Bundle r1 = X.C18180wK.A06()
            com.fbpay.logging.FBPayLoggerData r0 = r3.A02
            r1.putParcelable(r7, r0)
            java.lang.String r0 = r6.getStringValue(r2)
            r1.putString(r2, r0)
            java.lang.String r0 = "transaction_details"
            X.76N r2 = new X.76N
            r2.<init>(r0, r1)
            goto L_0x11b1
        L_0x121d:
            r0 = -227984644(0xfffffffff2693afc, float:-4.6196042E30)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r1.A01
            X.58H r4 = (X.AnonymousClass58H) r4
            java.lang.Object r0 = r1.A00
            X.6LM r0 = (X.AnonymousClass6LM) r0
            X.5ug r0 = (X.C94315ug) r0
            X.5HR r1 = r0.A00
            X.7Jo r5 = r4.A00
            java.lang.Integer r10 = X.AnonymousClass006.A01
            java.lang.Integer r11 = X.AnonymousClass006.A07
            boolean r0 = r1.A04
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r1.A01
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r1.A02
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r1.A03
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            r12 = 0
            r15 = 304(0x130, float:4.26E-43)
            r13 = r12
            r14 = r12
            X.C122027Jo.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.4qz r3 = X.AnonymousClass3J5.A00(r4)
            r0 = 41
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2 r1 = X.C86164wN.A0o(r4, r12, r0)
            r0 = 3
            X.C25237DiI.A00(r12, r12, r1, r3, r0)
            r0 = -1278795875(0xffffffffb3c71f9d, float:-9.27241E-8)
            goto L_0x1927
        L_0x1269:
            r0 = 995578788(0x3b5753a4, float:0.003285625)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r1.A01
            X.58H r3 = (X.AnonymousClass58H) r3
            java.lang.Object r0 = r1.A00
            X.6LM r0 = (X.AnonymousClass6LM) r0
            X.5ug r0 = (X.C94315ug) r0
            X.5HR r1 = r0.A00
            r0 = 0
            X.AnonymousClass58H.A01(r0, r1, r3)
            r0 = -2046717638(0xffffffff8601913a, float:-2.43689E-35)
            goto L_0x1927
        L_0x1285:
            r0 = -64114186(0xfffffffffc2db1f6, float:-3.6075073E36)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r1.A01
            X.58H r4 = (X.AnonymousClass58H) r4
            java.lang.Object r0 = r1.A00
            X.6LM r0 = (X.AnonymousClass6LM) r0
            X.5uh r0 = (X.AnonymousClass5uh) r0
            X.5HR r3 = r0.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2 r1 = r0.A00
            X.7Jo r5 = r4.A00
            java.lang.Integer r10 = X.AnonymousClass006.A01
            java.lang.Integer r11 = X.AnonymousClass006.A0j
            boolean r0 = r3.A04
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r3.A01
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r12 = r1.A00
            java.util.Map r12 = (java.util.Map) r12
            boolean r0 = r3.A02
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r3.A03
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            r13 = 0
            r15 = 288(0x120, float:4.04E-43)
            r14 = r13
            X.C122027Jo.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.4qz r3 = X.AnonymousClass3J5.A00(r4)
            r0 = 40
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2 r1 = X.C86164wN.A0o(r4, r13, r0)
            r0 = 3
            X.C25237DiI.A00(r13, r13, r1, r3, r0)
            r0 = -189117355(0xfffffffff4ba4c55, float:-1.1808049E32)
            goto L_0x1927
        L_0x12d6:
            r0 = -1351324715(0xffffffffaf746bd5, float:-2.222998E-10)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r1.A01
            X.58H r4 = (X.AnonymousClass58H) r4
            java.lang.Object r7 = r1.A00
            X.6LM r7 = (X.AnonymousClass6LM) r7
            X.5uh r7 = (X.AnonymousClass5uh) r7
            X.5HR r1 = r7.A01
            boolean r6 = r1.A02
            boolean r5 = r1.A04
            boolean r0 = r1.A01
            boolean r3 = r1.A03
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2 r1 = r7.A00
            java.lang.Object r14 = r1.A00
            java.util.Map r14 = (java.util.Map) r14
            X.7Jo r7 = r4.A00
            java.lang.Integer r12 = X.AnonymousClass006.A01
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            r15 = 0
            r17 = 288(0x120, float:4.04E-43)
            r13 = r12
            r16 = r15
            X.C122027Jo.A02(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.4qz r3 = X.AnonymousClass3J5.A00(r4)
            r9 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0221000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0221000_I2
            r7 = r14
            r8 = r15
            r10 = r5
            r11 = r0
            r5 = r1
            r6 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0 = 3
            X.C25237DiI.A00(r15, r15, r1, r3, r0)
            r0 = -1601277134(0xffffffffa08e7332, float:-2.4131966E-19)
            goto L_0x1927
        L_0x132d:
            r0 = 1841682031(0x6dc5d66f, float:7.6534727E27)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r1.A01
            X.58H r3 = (X.AnonymousClass58H) r3
            java.lang.Object r0 = r1.A00
            X.6LM r0 = (X.AnonymousClass6LM) r0
            X.5uh r0 = (X.AnonymousClass5uh) r0
            X.5HR r1 = r0.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2 r0 = r0.A00
            X.AnonymousClass58H.A01(r0, r1, r3)
            r0 = 522555352(0x1f258fd8, float:3.5059094E-20)
            goto L_0x1927
        L_0x134a:
            r0 = 1736947100(0x6787b59c, float:1.2817392E24)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r1.A01
            X.60O r2 = (X.AnonymousClass60O) r2
            X.5xc r3 = r2.A00
            java.lang.Object r1 = r1.A00
            X.7sv r1 = (X.C131857sv) r1
            java.lang.String r4 = r1.A04
            java.lang.Long r2 = r1.A01
            java.lang.Long r1 = r1.A00
            if (r2 == 0) goto L_0x13bf
            if (r1 == 0) goto L_0x13bf
            kotlin.Pair r1 = X.C18180wK.A0p(r2, r1)
            java.util.Map r13 = X.AnonymousClass4WK.A0O(r1)
        L_0x136d:
            android.os.Bundle r1 = r3.requireArguments()
            com.instagram.appreciation.analytics.creator.CreatorLoggingData r2 = X.AnonymousClass6LK.A00(r1)
            X.0Oa r1 = r3.A00
            java.lang.Object r5 = r1.getValue()
            X.7Jo r5 = (X.C122027Jo) r5
            java.lang.Integer r10 = X.AnonymousClass006.A1C
            java.lang.Integer r11 = X.AnonymousClass006.A05
            boolean r1 = r2.A01
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r2.A02
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            java.util.Map r12 = r2.A00
            r8 = 0
            java.lang.String r2 = "media_id"
            kotlin.Pair r1 = X.C18180wK.A0p(r2, r4)
            java.util.Map r14 = X.AnonymousClass4WK.A0O(r1)
            r15 = 192(0xc0, float:2.69E-43)
            r9 = r8
            X.C122027Jo.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            kotlin.Pair r1 = X.C18180wK.A0p(r2, r4)
            java.util.Map r4 = X.AnonymousClass4WK.A0O(r1)
            X.0Oa r1 = r3.A01
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r1)
            X.6oY r2 = new X.6oY
            r2.<init>(r1)
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            r2.A00(r3, r1, r4)
            r1 = -374808901(0xffffffffe9a8debb, float:-2.551892E25)
            goto L_0x1968
        L_0x13bf:
            r13 = 0
            goto L_0x136d
        L_0x13c1:
            r0 = 293616023(0x11803997, float:2.0230332E-28)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.60E r0 = (X.AnonymousClass60E) r0
            X.6dH r3 = r0.A00
            java.lang.Object r0 = r1.A00
            X.7sw r0 = (X.C131867sw) r0
            java.lang.String r9 = r0.A03
            java.lang.String r7 = r0.A02
            r1 = 1
            X.5xb r5 = r3.A00
            android.os.Bundle r4 = r5.requireArguments()
            java.lang.String r0 = "arg_appreciation_logging_fan_data"
            android.os.Parcelable r3 = r4.getParcelable(r0)
            if (r3 == 0) goto L_0x1434
            com.instagram.appreciation.analytics.LoggingFanData r3 = (com.instagram.appreciation.analytics.LoggingFanData) r3
            X.0Oa r0 = r5.A08
            java.lang.Object r6 = r0.getValue()
            X.57a r6 = (X.C881757a) r6
            java.lang.String r0 = "ext_balance"
            int r15 = r4.getInt(r0)
            java.util.List r13 = r5.A02
            X.0Oa r0 = r5.A07
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            java.lang.String r10 = r0.getUserId()
            java.lang.String r11 = r3.A02
            java.lang.String r12 = r3.A03
            r3 = 3
            X.C18180wK.A1Q(r13, r3, r10)
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x142f
            r6.A00 = r1
            java.util.Locale r0 = X.C31103Gfm.A02()
            java.text.NumberFormat r1 = java.text.NumberFormat.getNumberInstance(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            java.lang.String r8 = r1.format(r0)
            X.C04220Ms.A06(r8)
            X.4qz r0 = X.AnonymousClass3J5.A00(r6)
            r14 = 0
            com.instagram.appreciation.funding.AppreciationFundingViewModel$onPackClicked$1 r5 = new com.instagram.appreciation.funding.AppreciationFundingViewModel$onPackClicked$1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.C25237DiI.A00(r14, r14, r5, r0, r3)
        L_0x142f:
            r0 = -250354425(0xfffffffff113e507, float:-7.323388E29)
            goto L_0x1927
        L_0x1434:
            java.lang.IllegalStateException r10 = X.AnonymousClass0wJ.A0b()
            throw r10
        L_0x1439:
            r0 = 449443035(0x1ac9f4db, float:8.352724E-23)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.60Q r0 = (X.AnonymousClass60Q) r0
            X.6hF r4 = r0.A00
            java.lang.Object r3 = r1.A00
            X.7sy r3 = (X.C131887sy) r3
            androidx.recyclerview.widget.RecyclerView r0 = r4.A00
            X.Luu r1 = r0.A0F
            r0 = 7
            java.lang.String r0 = X.I17.A00(r0)
            X.C04220Ms.A0C(r1, r0)
            X.8wA r1 = (X.C150388wA) r1
            java.lang.String r0 = r3.getKey()
            int r7 = r1.A02(r0)
            X.5wz r0 = r4.A01
            X.0Oa r0 = r0.A01
            java.lang.Object r10 = r0.getValue()
            X.57j r10 = (X.C882657j) r10
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r8 = r3.A00
            X.9zv r9 = X.C171759zv.A0J
            X.9zw r11 = X.C171769zw.A0M
            X.6hG r1 = r10.A01
            java.util.UUID r4 = r10.A00
            java.lang.Object r0 = r8.A01
            X.98i r0 = (X.C1535598i) r0
            if (r0 == 0) goto L_0x1501
            java.lang.String r5 = r0.A0B
        L_0x147c:
            com.instagram.service.session.UserSession r0 = r1.A01
            X.0kW r6 = r1.A00
            X.0nS r1 = X.C13330nS.A01(r6, r0)
            r0 = 69
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1879(0x757, float:2.633E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            X.C18240wQ.A14(r3, r6)
            java.lang.String r1 = ""
            r0 = 1224(0x4c8, float:1.715E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r3.A0T(r0, r1)
            java.lang.String r0 = "action_source"
            r3.A0O(r11, r0)
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r5)
            java.lang.String r0 = "target_id"
            r3.A0S(r0, r1)
            java.lang.String r1 = X.C18180wK.A0e()
            java.lang.String r0 = "media_tap_token"
            r3.A0T(r0, r1)
            java.lang.Long r1 = X.C18230wP.A0f(r7)
            r0 = 194(0xc2, float:2.72E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r3.A0S(r0, r1)
            java.lang.String r1 = r4.toString()
            r0 = 1485(0x5cd, float:2.081E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r3.A0T(r0, r1)
            r0 = 122(0x7a, float:1.71E-43)
            java.lang.String r0 = X.I17.A00(r0)
            r3.A0O(r9, r0)
            java.lang.String r1 = r4.toString()
            r0 = 64
            java.lang.String r0 = X.I17.A00(r0)
            r3.A0T(r0, r1)
            r3.Bb4()
            X.4qz r1 = X.AnonymousClass3J5.A00(r10)
            r12 = 0
            r13 = 19
            kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2 r7 = new kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0 = 3
            X.C25237DiI.A00(r12, r12, r7, r1, r0)
            r0 = 1670925041(0x63984af1, float:5.6186104E21)
            goto L_0x1927
        L_0x1501:
            java.lang.Object r0 = r8.A02
            com.instagram.api.schemas.TrackData r0 = (com.instagram.api.schemas.TrackData) r0
            if (r0 == 0) goto L_0x150d
            java.lang.String r5 = r0.A05
            if (r5 == 0) goto L_0x150d
            goto L_0x147c
        L_0x150d:
            java.lang.IllegalStateException r10 = X.AnonymousClass0wJ.A0b()
            throw r10
        L_0x1512:
            r0 = 1170212724(0x45c00774, float:6144.9316)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.60Q r0 = (X.AnonymousClass60Q) r0
            X.6hF r0 = r0.A00
            java.lang.Object r1 = r1.A00
            X.7sy r1 = (X.C131887sy) r1
            X.5wz r0 = r0.A01
            X.0Oa r0 = r0.A01
            X.3ak r6 = X.C18200wM.A0N(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r5 = r1.A00
            X.4qz r4 = X.AnonymousClass3J5.A00(r6)
            r3 = 0
            r0 = 17
            kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1
            r1.<init>((java.lang.Object) r6, (java.lang.Object) r5, (X.C146958n9) r3, (int) r0)
            r0 = 3
            X.C25237DiI.A00(r3, r3, r1, r4, r0)
            r0 = -571066614(0xffffffffddf6370a, float:-2.21770753E18)
            goto L_0x1927
        L_0x1542:
            r0 = 2001067094(0x7745dc56, float:4.0130915E33)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.60G r0 = (X.AnonymousClass60G) r0
            X.6dQ r3 = r0.A00
            java.lang.Object r0 = r1.A00
            X.7sr r0 = (X.C131817sr) r0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000100_I2 r1 = r0.A00
            X.5wj r0 = r3.A00
            X.0Oa r0 = r0.A01
            java.lang.Object r5 = r0.getValue()
            X.580 r5 = (X.AnonymousClass580) r5
            X.48v r0 = r5.A02
            X.4wE r0 = r0.A02
            X.4qz r4 = X.C86154wM.A17(r5, r1, r0)
            r3 = 0
            r0 = 12
            kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1
            r1.<init>(r5, r3, r0)
            r0 = 3
            X.C25237DiI.A00(r3, r3, r1, r4, r0)
            r0 = -1200166154(0xffffffffb876eaf6, float:-5.8869795E-5)
            goto L_0x1927
        L_0x1578:
            r0 = -1279750083(0xffffffffb3b8903d, float:-8.5944045E-8)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r1.A00
            X.5xQ r4 = (X.AnonymousClass5xQ) r4
            android.os.Bundle r3 = r4.requireArguments()
            java.lang.String r2 = "BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE"
            java.lang.String r3 = r3.getString(r2)
            java.lang.String r2 = "multiple_contact_add_contact_info_fragment"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x15b1
            java.lang.Object r1 = r1.A01
            X.4u2 r1 = (X.AnonymousClass4u2) r1
            r3 = 0
            r1.AJh(r3, r3)
            android.widget.ScrollView r2 = r4.A01
            r1 = 1056964608(0x3f000000, float:0.5)
            r2.setAlpha(r1)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r4.A04
            r1.setVisibility(r3)
            X.AnonymousClass5xQ.A01(r4)
        L_0x15ac:
            r1 = 1525937945(0x5af3f719, float:3.4335053E16)
            goto L_0x1968
        L_0x15b1:
            X.AnonymousClass5xQ.A01(r4)
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            r2 = -1
            android.content.Intent r1 = r4.A00
            r3.setResult(r2, r1)
            X.C18180wK.A12(r4)
            goto L_0x15ac
        L_0x15c2:
            r0 = 147836809(0x8cfcf89, float:1.2507151E-33)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r1.A01
            X.5wi r6 = (X.C94765wi) r6
            X.6hV r5 = r6.A00
            if (r5 == 0) goto L_0x15ef
            java.lang.Object r0 = r1.A00
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r4 = X.AnonymousClass0wJ.A0n(r0)
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            X.601 r3 = r5.A00
            X.6jp r1 = r5.A01
            X.3iY r0 = X.C86114wI.A0V(r4)
            X.C61043Rr.A00(r3, r0, r1)
            X.0m7 r0 = r6.getParentFragmentManager()
            r0.A16()
        L_0x15ef:
            r0 = 1900950137(0x714e3279, float:1.0210389E30)
            goto L_0x1927
        L_0x15f4:
            r0 = -1934533249(0xffffffff8cb15d7f, float:-2.732744E-31)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r6 = r1.A01
            X.60V r6 = (X.AnonymousClass60V) r6
            com.instagram.service.session.UserSession r8 = r6.A04
            X.0kW r7 = r6.A03
            java.lang.Object r1 = r1.A00
            X.5MP r1 = (X.AnonymousClass5MP) r1
            java.lang.String r9 = r1.A03
            java.lang.String r10 = r1.A04
            java.lang.String r11 = r6.A05
            java.lang.String r12 = "image_preview"
            X.AnonymousClass3WB.A00(r7, r8, r9, r10, r11, r12)
            X.6mg r5 = r1.A00
            if (r5 == 0) goto L_0x16d4
            androidx.fragment.app.FragmentActivity r1 = r6.A01
            X.Drz r4 = X.C18180wK.A0Q(r1, r8)
            X.C24016D5r.A00()
            r10 = 0
            java.io.StringWriter r8 = X.C18230wP.A0d()
            X.MMp r3 = X.C18180wK.A0K(r8)
            boolean r2 = r5.A07
            java.lang.String r1 = "is_delivering"
            r3.A0e(r1, r2)
            java.lang.String r2 = r5.A04
            if (r2 == 0) goto L_0x16cb
            java.lang.String r1 = "timestamp"
            r3.A0d(r1, r2)
            java.lang.String r2 = r5.A03
            if (r2 == 0) goto L_0x1645
            r1 = 55
            java.lang.String r1 = X.C18170wI.A00(r1)
            r3.A0d(r1, r2)
        L_0x1645:
            java.lang.String r2 = r5.A01
            if (r2 == 0) goto L_0x164e
            java.lang.String r1 = "call_to_action"
            r3.A0d(r1, r2)
        L_0x164e:
            java.lang.String r2 = r5.A05
            if (r2 == 0) goto L_0x1657
            java.lang.String r1 = "url"
            r3.A0d(r1, r2)
        L_0x1657:
            java.lang.String r1 = "placements"
            r3.A0U(r1)
            r3.A0I()
            java.util.ArrayList r1 = r5.A06
            java.util.Iterator r7 = r1.iterator()
        L_0x1665:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x169a
            java.lang.Object r6 = r7.next()
            X.6jY r6 = (X.C109156jY) r6
            if (r6 == 0) goto L_0x1665
            r3.A0J()
            X.68h r1 = r6.A00
            if (r1 == 0) goto L_0x16ce
            java.lang.String r2 = r1.A00
            java.lang.String r1 = "placement"
            r3.A0d(r1, r2)
            java.lang.String r2 = r6.A01
            if (r2 == 0) goto L_0x1697
            java.lang.String r1 = "media_id"
            r3.A0d(r1, r2)
            java.lang.String r2 = r6.A02
            if (r2 == 0) goto L_0x1693
            java.lang.String r1 = "reel_id"
            r3.A0d(r1, r2)
        L_0x1693:
            r3.A0G()
            goto L_0x1665
        L_0x1697:
            java.lang.String r0 = "mediaId"
            goto L_0x16d0
        L_0x169a:
            r3.A0F()
            java.lang.String r2 = r5.A00
            if (r2 == 0) goto L_0x16a6
            java.lang.String r1 = "adgroup_id"
            r3.A0d(r1, r2)
        L_0x16a6:
            java.lang.String r2 = r5.A02
            if (r2 == 0) goto L_0x16af
            java.lang.String r1 = "dynamic_ad_type"
            r3.A0d(r1, r2)
        L_0x16af:
            r3.A0G()
            r3.close()
            java.lang.String r3 = X.C18190wL.A0n(r8)
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r1 = "ad_detail"
            r2.putString(r1, r3)
            X.5x4 r1 = new X.5x4
            r1.<init>()
            r1.setArguments(r2)
            goto L_0x16ff
        L_0x16cb:
            java.lang.String r0 = "timestamp"
            goto L_0x16d0
        L_0x16ce:
            java.lang.String r0 = "placementName"
        L_0x16d0:
            X.C04220Ms.A0E(r0)
            throw r10
        L_0x16d4:
            java.lang.String r2 = r1.A02
            androidx.fragment.app.FragmentActivity r1 = r6.A01
            X.Drz r4 = X.C18180wK.A0Q(r1, r8)
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            X.AxR r3 = new X.AxR
            r3.<init>()
            r3.A04 = r2
            java.lang.String r1 = r7.getModuleName()
            r3.A06 = r1
            X.9w0 r1 = X.C171059w0.A02
            r3.A02 = r1
            android.content.Context r2 = r6.A00
            r1 = 2131822642(0x7f110832, float:1.9278061E38)
            java.lang.String r1 = r2.getString(r1)
            r3.A08 = r1
            androidx.fragment.app.Fragment r1 = r3.A05()
        L_0x16ff:
            r4.A03 = r1
            r4.A05()
            r1 = -1303880744(0xffffffffb2485bd8, float:-1.1662415E-8)
            goto L_0x1968
        L_0x1709:
            r0 = -1184702747(0xffffffffb962dee5, float:-2.1636074E-4)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r1.A01
            X.60U r3 = (X.AnonymousClass60U) r3
            java.lang.Object r0 = r1.A00
            X.7su r0 = (X.C131847su) r0
            java.lang.String r5 = r0.A03
            com.instagram.common.typedurl.ImageUrl r4 = r0.A02
            androidx.fragment.app.FragmentActivity r1 = r3.A01
            com.instagram.service.session.UserSession r0 = r3.A03
            X.Drz r3 = X.C18180wK.A0Q(r1, r0)
            X.C24016D5r.A00()
            r1 = 0
            java.lang.String r0 = "approve_sponsor_boost"
            androidx.fragment.app.Fragment r0 = X.C25802DsG.A03(r4, r5, r0, r1)
            r3.A03 = r0
            r3.A05()
            r0 = -736655497(0xffffffffd4178777, float:-2.60325114E12)
            goto L_0x1927
        L_0x1738:
            r0 = -717518248(0xffffffffd53b8a58, float:-1.28876785E13)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r1.A01
            X.60U r0 = (X.AnonymousClass60U) r0
            android.content.Context r3 = r0.A00
            X.Dsm r5 = new X.Dsm
            r5.<init>(r3)
            r0 = 2131822594(0x7f110802, float:1.9277964E38)
            r5.A0L(r0)
            r0 = 2131822595(0x7f110803, float:1.9277966E38)
            r5.A0K(r0)
            r0 = 2131822539(0x7f1107cb, float:1.9277852E38)
            java.lang.String r4 = r3.getString(r0)
            java.lang.Object r1 = r1.A00
            r0 = 41
            com.facebook.redex.IDxCListenerShape218S0100000_2_I2 r3 = X.C86154wM.A0N(r1, r0)
            X.25l r1 = X.AnonymousClass25l.RED_BOLD
            r0 = 1
            r5.A0Y(r3, r1, r4, r0)
            r1 = 2131823054(0x7f1109ce, float:1.9278897E38)
            r0 = 0
            r5.A0O(r0, r1)
            X.AnonymousClass0wJ.A1K(r5)
            r0 = -1515268726(0xffffffffa5aed58a, float:-3.0328888E-16)
            goto L_0x1927
        L_0x177a:
            r0 = 1713419480(0x6620b4d8, float:1.8972865E23)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r1.A01
            X.5x4 r3 = (X.AnonymousClass5x4) r3
            java.lang.Object r0 = r1.A00
            X.6jY r0 = (X.C109156jY) r0
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x17b6
            r0 = 2131832151(0x7f112d57, float:1.9297348E38)
            X.AnonymousClass5x4.A00(r3, r1, r0)
            r0 = -1750911791(0xffffffff97a334d1, float:-1.0546961E-24)
            goto L_0x1927
        L_0x1798:
            r0 = 1761500022(0x68fe5b76, float:9.609346E24)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r1.A01
            X.5x4 r3 = (X.AnonymousClass5x4) r3
            java.lang.Object r0 = r1.A00
            X.6jY r0 = (X.C109156jY) r0
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x17b6
            r0 = 2131832152(0x7f112d58, float:1.929735E38)
            X.AnonymousClass5x4.A00(r3, r1, r0)
            r0 = 469692836(0x1bfef1a4, float:4.2176932E-22)
            goto L_0x1927
        L_0x17b6:
            java.lang.String r0 = "mediaId"
            X.C04220Ms.A0E(r0)
            r10 = 0
            throw r10
        L_0x17bd:
            r0 = 181876180(0xad735d4, float:2.0723995E-32)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r1.A00
            java.util.AbstractMap r3 = (java.util.AbstractMap) r3
            X.68h r0 = X.C971968h.STORIES
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L_0x184d
            X.6jY r3 = (X.C109156jY) r3
            X.C19554AyF.A02()
            X.DnV r4 = new X.DnV
            r4.<init>()
            java.lang.String r0 = r3.A02
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.ArrayList r0 = X.C06750aI.A14(r0)
            r4.A0N = r0
            java.lang.String r0 = r3.A02
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.ArrayList r0 = X.C06750aI.A14(r0)
            r4.A0O = r0
            X.9wH r0 = X.C171229wH.A0K
            r4.A05 = r0
            java.lang.String r0 = X.C18180wK.A0e()
            r4.A0M = r0
            X.Djv r0 = new X.Djv
            r0.<init>()
            r4.A03 = r0
            java.lang.String r3 = r3.A01
            if (r3 == 0) goto L_0x1846
            java.lang.String r0 = "media_id"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r3)
            java.util.HashMap r0 = X.C86124wJ.A0z(r0)
            r4.A0P = r0
            java.lang.Object r0 = r1.A01
            X.5x4 r0 = (X.AnonymousClass5x4) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0Oa r0 = r0.A01
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.Drz r3 = X.C18180wK.A0Q(r1, r0)
            X.C19554AyF.A02()
            android.os.Bundle r1 = r4.A01()
            com.instagram.reels.fragment.ReelViewerFragment r0 = new com.instagram.reels.fragment.ReelViewerFragment
            r0.<init>()
            r0.setArguments(r1)
            r3.A03 = r0
            r0 = 22
            java.lang.String r0 = X.I17.A00(r0)
            r3.A07 = r0
            r3.A05()
            r0 = 86152261(0x5229445, float:7.644436E-36)
            goto L_0x1927
        L_0x1846:
            java.lang.String r4 = "mediaId"
        L_0x1848:
            X.C04220Ms.A0E(r4)
            r10 = 0
            throw r10
        L_0x184d:
            java.lang.IllegalStateException r10 = X.AnonymousClass0wJ.A0b()
            r0 = 551290964(0x20dc0854, float:3.727496E-19)
            X.C14030oh.A0C(r0, r2)
            throw r10
        L_0x1858:
            r0 = -378597171(0xffffffffe96f10cd, float:-1.8063288E25)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r1.A00
            X.5yH r2 = (X.AnonymousClass5yH) r2
            java.lang.Object r4 = r1.A01
            X.6jd r4 = (X.C109206jd) r4
            com.instagram.business.fragment.SupportServicePartnerSelectionFragment r3 = r2.A02
            X.8mR r1 = r3.A00
            if (r1 == 0) goto L_0x18f0
            java.lang.String r2 = r1.AQz()
            java.lang.String r1 = r4.A00
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x18f0
            X.8mR r1 = r3.A00
            java.lang.String r13 = r1.getUrl()
        L_0x187f:
            X.7IV r12 = r3.A03
            com.instagram.api.schemas.SMBPartnerType r11 = r3.A01
            boolean r10 = r3.A08
            java.lang.String r9 = r4.A00
            java.lang.String r8 = r4.A01
            r1 = 0
            X.C04220Ms.A0B(r11, r1)
            X.AnonymousClass0wJ.A1Q(r9, r8)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r7 = X.AnonymousClass7IV.A00(r12)
            java.lang.String r1 = "flow_select_partner"
            X.C18190wL.A1I(r7, r1)
            java.lang.String r1 = "tap"
            X.C18210wN.A1A(r7, r1)
            java.lang.String r6 = r12.A03
            r5 = 106(0x6a, float:1.49E-43)
            r2 = 10
            r1 = 104(0x68, float:1.46E-43)
            java.lang.String r1 = X.C63213h0.A01(r5, r2, r1)
            X.AnonymousClass7IV.A01(r7, r12, r1, r6, r10)
            java.lang.String r2 = r11.toString()
            java.lang.String r1 = "service_type"
            r7.A0T(r1, r2)
            java.lang.Long r2 = X.AnonymousClass0wJ.A0d(r9)
            java.lang.String r1 = "partner_id"
            r7.A0S(r1, r2)
            java.lang.String r1 = "partner_name"
            r7.A0T(r1, r8)
            r7.Bb4()
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            com.instagram.service.session.UserSession r1 = r3.A04
            X.Drz r2 = X.C18180wK.A0Q(r2, r1)
            X.DeW r7 = X.C86144wL.A0U()
            java.lang.String r9 = r3.A06
            java.lang.String r10 = r4.A00
            java.lang.String r11 = r4.A01
            java.lang.String r12 = X.C121877Ip.A03(r4)
            java.lang.String r14 = r3.A05
            com.instagram.api.schemas.SMBPartnerType r8 = r3.A01
            androidx.fragment.app.Fragment r1 = r7.A02(r8, r9, r10, r11, r12, r13, r14)
            r2.A03 = r1
            r2.A05()
            r1 = 1892112340(0x70c757d4, float:4.9354956E29)
            goto L_0x1968
        L_0x18f0:
            r13 = 0
            goto L_0x187f
        L_0x18f2:
            r0 = -1992875383(0xffffffff89372289, float:-2.2044062E-33)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r7 = r1.A01
            X.5jD r7 = (X.AnonymousClass5jD) r7
            com.facebookpay.connect.models.ConnectPayload r0 = r7.A08
            if (r0 == 0) goto L_0x1924
            java.lang.String r6 = r0.A02
            if (r6 == 0) goto L_0x1924
            java.lang.Object r5 = r1.A00
            X.56y r0 = r7.A09
            if (r0 == 0) goto L_0x1924
            X.6gW r4 = r0.A00
            X.6ci r3 = r4.A00
            r1 = 2
            com.facebook.redex.IDxFunctionShape30S1100000_2_I2 r0 = new com.facebook.redex.IDxFunctionShape30S1100000_2_I2
            r0.<init>(r6, r4, r1)
            X.M5J r1 = X.AnonymousClass5k7.A00(r0, r3)
            if (r1 == 0) goto L_0x1924
            r0 = 37
            com.facebook.redex.IDxObserverShape99S0200000_2_I2 r0 = X.C86164wN.A0O(r7, r5, r0)
            r1.A0C(r7, r0)
        L_0x1924:
            r0 = 714057125(0x2a8fa5a5, float:2.5516842E-13)
        L_0x1927:
            X.C14030oh.A0C(r0, r2)
            return
        L_0x192b:
            r0 = -1162692243(0xffffffffbab2b96d, float:-0.0013635583)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r1.A00
            X.8qm r2 = (X.C148288qm) r2
            X.8r8 r2 = r2.Axc()
            if (r2 == 0) goto L_0x196c
            java.lang.String r3 = r2.getId()
        L_0x1940:
            java.lang.String r2 = "payout_transaction_id"
            kotlin.Pair r2 = X.C18180wK.A0p(r2, r3)
            java.util.HashMap r3 = X.C86124wJ.A0z(r2)
            java.lang.String r2 = "com.instagram.pro_home.monetization_platform.payout_transaction_details"
            X.3iE r3 = X.C63743iE.A02(r2, r3)
            java.lang.Object r1 = r1.A01
            X.5x9 r1 = (X.AnonymousClass5x9) r1
            androidx.fragment.app.FragmentActivity r2 = r1.getActivity()
            X.0Oa r1 = r1.A0C
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r1)
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.C18190wL.A0N(r1)
            r3.A0C(r2, r1)
            r1 = -1556844616(0xffffffffa3346fb8, float:-9.781477E-18)
        L_0x1968:
            X.C14030oh.A0C(r1, r0)
            return
        L_0x196c:
            r3 = 0
            goto L_0x1940
        L_0x196e:
            java.lang.Object r2 = r1.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r1.A01
            X.C3T r1 = (X.C3T) r1
            r0 = 751(0x2ef, float:1.052E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C63813iO.A01(r2, r0)
            r1.CeG()
            return
        L_0x1983:
            java.lang.String r0 = "Partner should not be null if row enabled"
            java.lang.IllegalStateException r10 = X.C18180wK.A0a(r0)
            r0 = -1325791964(0xffffffffb0fa0524, float:-1.8191355E-9)
            X.C14030oh.A0C(r0, r3)
            throw r10
        L_0x1990:
            java.lang.String r0 = "Partner should not be null if row enabled"
            java.lang.IllegalStateException r10 = X.C18180wK.A0a(r0)
            r0 = 591209237(0x233d2315, float:1.02531394E-17)
            X.C14030oh.A0C(r0, r3)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape71S0200000_2_I2.onClick(android.view.View):void");
    }
}
