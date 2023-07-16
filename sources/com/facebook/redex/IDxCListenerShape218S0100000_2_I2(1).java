package com.facebook.redex;

import X.AnonymousClass0YP;
import X.C04220Ms;
import android.content.DialogInterface;

public class IDxCListenerShape218S0100000_2_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape218S0100000_2_I2(IDxCListenerShape203S0100000_2_I2 iDxCListenerShape203S0100000_2_I2, int i) {
        this.A01 = i;
        if (1 - i != 0) {
            this.A00 = iDxCListenerShape203S0100000_2_I2;
        } else {
            this.A00 = iDxCListenerShape203S0100000_2_I2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: com.facebookpay.form.fragment.model.FormClickEvent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: com.facebookpay.form.fragment.model.FormClickEvent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: X.5jv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: X.5jy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: X.5jv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: X.5jv} */
    /* JADX WARNING: type inference failed for: r0v20, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: type inference failed for: r0v30 */
    /* JADX WARNING: type inference failed for: r0v178 */
    /* JADX WARNING: type inference failed for: r0v179 */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x03d6, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03dc, code lost:
        X.C04220Ms.A0E("formParams");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03e1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03f8, code lost:
        r1.A0H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03fb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = (X.AnonymousClass0ZU) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0300, code lost:
        X.C880856r.A05(r2, r1, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0303, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0321, code lost:
        r1.Bb8(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0395, code lost:
        r12.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0398, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r12, int r13) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x03fc;
                case 1: goto L_0x03e2;
                case 2: goto L_0x0399;
                case 3: goto L_0x035a;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x034e;
                case 7: goto L_0x034e;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                case 16: goto L_0x0005;
                case 17: goto L_0x0005;
                case 18: goto L_0x0005;
                case 19: goto L_0x0005;
                case 20: goto L_0x0005;
                case 21: goto L_0x0005;
                case 22: goto L_0x0005;
                case 23: goto L_0x0005;
                case 24: goto L_0x0005;
                case 25: goto L_0x0005;
                case 26: goto L_0x000c;
                case 27: goto L_0x0395;
                case 28: goto L_0x0395;
                case 29: goto L_0x00f0;
                case 30: goto L_0x0337;
                case 31: goto L_0x0407;
                case 32: goto L_0x0325;
                case 33: goto L_0x0304;
                case 34: goto L_0x02c8;
                case 35: goto L_0x02a3;
                case 36: goto L_0x025c;
                case 37: goto L_0x0395;
                case 38: goto L_0x0244;
                case 39: goto L_0x022c;
                case 40: goto L_0x000c;
                case 41: goto L_0x00e6;
                case 42: goto L_0x01ed;
                case 43: goto L_0x01e3;
                case 44: goto L_0x0395;
                case 45: goto L_0x01c4;
                case 46: goto L_0x01c4;
                case 47: goto L_0x0193;
                case 48: goto L_0x0014;
                case 49: goto L_0x000d;
                case 50: goto L_0x000d;
                case 51: goto L_0x000d;
                case 52: goto L_0x018b;
                case 53: goto L_0x017e;
                case 54: goto L_0x0172;
                case 55: goto L_0x0165;
                case 56: goto L_0x010d;
                case 57: goto L_0x0104;
                case 58: goto L_0x000c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A00
        L_0x0007:
            X.0ZU r0 = (X.AnonymousClass0ZU) r0
        L_0x0009:
            r0.invoke()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r0 = r11.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2) r0
            java.lang.Object r0 = r0.A00
            goto L_0x0007
        L_0x0014:
            java.lang.Object r3 = r11.A00
            com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome r3 = (com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome) r3
            java.lang.CharSequence[] r2 = r3.getMenuOptions()
            r1 = r2[r13]
            android.content.Context r4 = r3.getContext()
            r0 = 2131829117(0x7f11217d, float:1.9291194E38)
            java.lang.String r0 = r4.getString(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0060
            com.instagram.service.session.UserSession r0 = r3.A09
            android.content.SharedPreferences r2 = X.C28161tl.A04(r0)
            android.content.SharedPreferences$Editor r1 = r2.edit()
            java.lang.String r0 = "ix_autofill_name"
            X.C18180wK.A0u(r1, r0)
            android.content.SharedPreferences$Editor r1 = r2.edit()
            java.lang.String r0 = "ix_autofill_phone"
            X.C18180wK.A0u(r1, r0)
            android.content.SharedPreferences$Editor r1 = r2.edit()
            java.lang.String r0 = "ix_autofill_address"
            X.C18180wK.A0u(r1, r0)
            android.content.SharedPreferences$Editor r1 = r2.edit()
            java.lang.String r0 = "ix_autofill_email"
            X.C18180wK.A0u(r1, r0)
            r0 = 2131829116(0x7f11217c, float:1.9291192E38)
        L_0x005c:
            X.C63813iO.A00(r4, r0)
            return
        L_0x0060:
            r1 = r2[r13]
            r0 = 2131829122(0x7f112182, float:1.9291204E38)
            java.lang.String r0 = r4.getString(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007d
            X.7Gm r0 = r3.A08
            java.util.Stack r0 = r0.A0D
            java.lang.Object r0 = r0.peek()
            android.webkit.WebView r0 = (android.webkit.WebView) r0
            r0.reload()
            return
        L_0x007d:
            r1 = r2[r13]
            r0 = 2131829118(0x7f11217e, float:1.9291196E38)
            java.lang.String r0 = r4.getString(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a5
            java.lang.String r0 = "clipboard"
            java.lang.Object r2 = r4.getSystemService(r0)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            java.lang.String r1 = X.C121507Gm.A01(r3)
            java.lang.String r0 = "Instant Experiences Link URL"
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r1)
            r2.setPrimaryClip(r0)
            r0 = 2131829120(0x7f112180, float:1.92912E38)
            goto L_0x005c
        L_0x00a5:
            r1 = r2[r13]
            r0 = 2131829121(0x7f112181, float:1.9291202E38)
            java.lang.String r0 = r4.getString(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000c
            android.content.Intent r2 = X.C18230wP.A0B()
            java.lang.String r0 = "android.intent.action.VIEW"
            r2.setAction(r0)
            X.7Gm r0 = r3.A08
            java.util.Stack r0 = r0.A0D
            java.lang.Object r0 = r0.peek()
            if (r0 == 0) goto L_0x00d8
            java.lang.String r0 = X.C121507Gm.A01(r3)
            if (r0 == 0) goto L_0x00d8
            java.lang.String r0 = X.C121507Gm.A01(r3)
            android.net.Uri r0 = X.C15430rJ.A01(r0)
            r2.setData(r0)
        L_0x00d8:
            X.0t2 r0 = X.C16420t2.A00()
            X.059 r1 = r0.A09()
            android.content.Context r0 = r3.A00
            r1.A09(r0, r2)
            return
        L_0x00e6:
            java.lang.Object r0 = r11.A00
            X.7su r0 = (X.C131847su) r0
            X.6hX r0 = r0.A01
            X.0ZU r0 = r0.A01
            goto L_0x0009
        L_0x00f0:
            java.lang.Object r2 = r11.A00
            X.57v r2 = (X.C883857v) r2
            com.fbpay.hub.form.params.FormParams r1 = r2.A01
            com.fbpay.logging.FBPayLoggerData r0 = r1.A02
            if (r0 == 0) goto L_0x000c
            com.fbpay.hub.form.params.FormLogEvents r0 = r1.A01
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = r0.A01
            X.C86124wJ.A1P(r2, r0)
            return
        L_0x0104:
            java.lang.Object r1 = r11.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 1
            r1.setEnabled(r0)
            return
        L_0x010d:
            java.lang.Object r6 = r11.A00
            X.AhI r6 = (X.C18542AhI) r6
            X.IcN r2 = r6.A00
            X.0wh r5 = X.C18330wh.A01(r2)
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r2)
            r0 = 2131828163(0x7f111dc3, float:1.928926E38)
            java.lang.String r0 = r1.getString(r0)
            r5.A04(r0)
            X.C13950oZ.A00(r5)
            androidx.fragment.app.FragmentActivity r4 = r2.requireActivity()
            X.06E r3 = X.AnonymousClass06E.A00(r2)
            java.lang.String r2 = "Required value was null."
            com.instagram.service.session.UserSession r1 = r6.A04
            java.lang.String r0 = r6.A04()
            if (r0 == 0) goto L_0x0160
            X.H1T r2 = X.AnonymousClass0wJ.A0N(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "guides/guide/%s/delete/"
            java.lang.String r0 = X.C18180wK.A0j(r0, r1)
            r2.A0J(r0)
            java.lang.Class<X.4vo> r1 = X.C85814vo.class
            java.lang.Class<X.3Za> r0 = X.AnonymousClass3Za.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r1 = 13
            com.instagram.common.api.base.IDxACallbackShape37S0200000_3_I2 r0 = new com.instagram.common.api.base.IDxACallbackShape37S0200000_3_I2
            r0.<init>(r1, r6, r5)
            r2.A00 = r0
            X.C31155GhB.A01(r4, r3, r2)
            return
        L_0x0160:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r2)
            throw r0
        L_0x0165:
            java.lang.Object r0 = r11.A00
            X.5xV r0 = (X.AnonymousClass5xV) r0
            X.56W r1 = X.AnonymousClass5xV.A00(r0)
            r0 = 0
            r1.A0J(r0)
            return
        L_0x0172:
            java.lang.Object r0 = r11.A00
            X.5xV r0 = (X.AnonymousClass5xV) r0
            X.56W r0 = X.AnonymousClass5xV.A00(r0)
            r0.A09()
            return
        L_0x017e:
            java.lang.Object r0 = r11.A00
            X.5xV r0 = (X.AnonymousClass5xV) r0
            X.56W r1 = X.AnonymousClass5xV.A00(r0)
            r0 = 0
            r1.A0H(r0)
            return
        L_0x018b:
            java.lang.Object r0 = r11.A00
            X.5xV r0 = (X.AnonymousClass5xV) r0
            X.AnonymousClass5xV.A02(r0)
            return
        L_0x0193:
            java.lang.Object r5 = r11.A00
            com.instagram.business.fragment.SupportServiceEditUrlFragment r5 = (com.instagram.business.fragment.SupportServiceEditUrlFragment) r5
            com.instagram.service.session.UserSession r1 = r5.A03
            com.instagram.api.schemas.SMBPartnerType r4 = r5.A01
            r0 = 6
            com.instagram.common.api.base.IDxACallbackShape112S0100000_2_I2 r3 = new com.instagram.common.api.base.IDxACallbackShape112S0100000_2_I2
            r3.<init>(r5, r0)
            X.H1T r2 = X.AnonymousClass0wJ.A0N(r1)
            java.lang.String r0 = "accounts/delete_smb_partner/"
            r2.A0J(r0)
            java.lang.Class<X.5u8> r1 = X.AnonymousClass5u8.class
            java.lang.Class<X.6zr> r0 = X.C118166zr.class
            r2.A0B(r1, r0)
            r2.A06()
            java.lang.String r1 = r4.toString()
            java.lang.String r0 = "smb_partner_type"
            X.H8c r0 = X.C18200wM.A0T(r2, r0, r1)
            r0.A00 = r3
            r5.schedule(r0)
            return
        L_0x01c4:
            java.lang.Object r3 = r11.A00
            com.instagram.business.fragment.SupportServiceEditUrlFragment r3 = (com.instagram.business.fragment.SupportServiceEditUrlFragment) r3
            X.0wh r0 = r3.A04
            r0.dismiss()
            r12.dismiss()
            android.content.Context r2 = r3.getContext()
            com.instagram.api.schemas.SMBPartnerType r1 = r3.A01
            java.lang.String r0 = r3.A0A
            java.lang.String r0 = X.C121877Ip.A01(r2, r1, r0)
            X.C86134wK.A1C(r3, r0)
            com.instagram.business.fragment.SupportServiceEditUrlFragment.A01(r3)
            return
        L_0x01e3:
            java.lang.Object r1 = r11.A00
            X.5x7 r1 = (X.AnonymousClass5x7) r1
            java.lang.String r0 = "stop_ad_cancel"
            X.AnonymousClass5x7.A01(r1, r0)
            return
        L_0x01ed:
            java.lang.Object r5 = r11.A00
            X.5x7 r5 = (X.AnonymousClass5x7) r5
            X.0Oa r0 = r5.A0A
            X.0i6 r2 = X.AnonymousClass0wJ.A0U(r0)
            X.0Oa r0 = r5.A07
            java.lang.String r4 = X.C86114wI.A0r(r0)
            r1 = 0
            X.C04220Ms.A0B(r2, r1)
            X.H1T r3 = X.AnonymousClass0wJ.A0O(r2)
            java.lang.String r2 = "business/branded_content/stop_ad/"
            java.lang.String r0 = "_"
            java.lang.String[] r0 = X.C18190wL.A1b(r4, r0, r1)
            r1 = r0[r1]
            r0 = 47
            java.lang.String r0 = X.AnonymousClass00U.A0M(r2, r1, r0)
            r3.A0J(r0)
            java.lang.Class<X.4vo> r1 = X.C85814vo.class
            java.lang.Class<X.3Za> r0 = X.AnonymousClass3Za.class
            X.H8c r2 = X.AnonymousClass0wJ.A0T(r3, r1, r0)
            r1 = 3
            com.instagram.common.api.base.IDxACallbackShape112S0100000_2_I2 r0 = new com.instagram.common.api.base.IDxACallbackShape112S0100000_2_I2
            r0.<init>(r5, r1)
            r2.A00 = r0
            r5.schedule(r2)
            return
        L_0x022c:
            java.lang.Object r1 = r11.A00
            X.7JF r1 = (X.AnonymousClass7JF) r1
            java.lang.Integer r4 = X.AnonymousClass006.A00
            java.lang.Integer r5 = X.AnonymousClass006.A15
            r2 = 0
            r10 = 252(0xfc, float:3.53E-43)
            r3 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            X.5Cg r0 = X.AnonymousClass7JF.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.AnonymousClass7JF.A03(r0, r1)
            return
        L_0x0244:
            java.lang.Object r0 = r11.A00
            X.5xc r0 = (X.AnonymousClass5xc) r0
            X.0Oa r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.57S r0 = (X.AnonymousClass57S) r0
            X.7Jo r3 = r0.A00
            java.lang.Integer r2 = X.AnonymousClass006.A04
            java.lang.Integer r1 = X.AnonymousClass006.A09
            com.instagram.appreciation.analytics.creator.CreatorLoggingData r0 = r0.A01
            X.C122027Jo.A01(r3, r0, r2, r1)
            return
        L_0x025c:
            java.lang.Object r0 = r11.A00
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r0 = (com.facebook.redex.IDxCListenerShape203S0100000_2_I2) r0
            java.lang.Object r6 = r0.A00
            X.5jy r6 = (X.C92855jy) r6
            com.fbpay.logging.FBPayLoggerData r0 = r6.A02
            java.util.Map r2 = X.C122037Js.A06(r0)
            java.lang.String r1 = "target_name"
            java.lang.String r0 = "remove_shoppay_save"
            X.C86134wK.A1N(r1, r0, r2)
            com.fbpay.hub.paymentmethods.api.FbPayShopPay r0 = r6.A01
            java.lang.String r0 = r0.A00
            java.lang.Long r0 = X.AnonymousClass0wJ.A0d(r0)
            X.C86164wN.A1J(r0, r2)
            X.8h9 r1 = r6.A07
            java.lang.String r0 = "user_remove_credential_submit"
            r1.Bb8(r0, r2)
            X.6q3 r5 = r6.A06
            com.fbpay.hub.paymentmethods.api.FbPayShopPay r0 = r6.A01
            java.lang.String r4 = r0.A00
            com.fbpay.logging.FBPayLoggerData r0 = r6.A02
            java.lang.String r3 = r0.A00()
            r3.getClass()
            X.6ci r2 = r5.A00
            r1 = 3
            com.facebook.redex.IDxFunctionShape0S2100000_2_I2 r0 = new com.facebook.redex.IDxFunctionShape0S2100000_2_I2
            r0.<init>(r5, r4, r3, r1)
            X.M5J r2 = X.AnonymousClass5k7.A00(r0, r2)
            X.56q r1 = r6.A03
            r0 = 253(0xfd, float:3.55E-43)
            goto L_0x0300
        L_0x02a3:
            java.lang.Object r0 = r11.A00
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r0 = (com.facebook.redex.IDxCListenerShape203S0100000_2_I2) r0
            java.lang.Object r2 = r0.A00
            X.5jy r2 = (X.C92855jy) r2
            com.fbpay.logging.FBPayLoggerData r0 = r2.A02
            java.util.Map r3 = X.C122037Js.A06(r0)
            java.lang.String r1 = "target_name"
            java.lang.String r0 = "remove_shoppay_cancel"
            X.C86134wK.A1N(r1, r0, r3)
            com.fbpay.hub.paymentmethods.api.FbPayShopPay r0 = r2.A01
            java.lang.String r0 = r0.A00
            java.lang.Long r0 = X.AnonymousClass0wJ.A0d(r0)
            X.C86164wN.A1J(r0, r3)
            X.8h9 r1 = r2.A07
            java.lang.String r0 = "user_remove_credential_exit"
            goto L_0x0321
        L_0x02c8:
            java.lang.Object r0 = r11.A00
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r0 = (com.facebook.redex.IDxCListenerShape203S0100000_2_I2) r0
            java.lang.Object r6 = r0.A00
            X.5jv r6 = (X.C92825jv) r6
            com.fbpay.logging.FBPayLoggerData r0 = r6.A02
            java.util.Map r2 = X.C122037Js.A06(r0)
            com.fbpay.hub.paymentmethods.api.FbPayPayPal r0 = r6.A01
            java.lang.String r0 = r0.A00
            java.lang.Long r0 = X.AnonymousClass0wJ.A0d(r0)
            X.C86164wN.A1J(r0, r2)
            X.8h9 r1 = r6.A05
            java.lang.String r0 = "fbpay_remove_paypal_save"
            r1.Bb8(r0, r2)
            X.6q3 r4 = r6.A04
            com.fbpay.hub.paymentmethods.api.FbPayPayPal r0 = r6.A01
            java.lang.String r3 = r0.A02
            X.6ci r2 = r4.A00
            r1 = 4
            com.facebook.redex.IDxFunctionShape30S1100000_2_I2 r0 = new com.facebook.redex.IDxFunctionShape30S1100000_2_I2
            r0.<init>(r3, r4, r1)
            X.M5J r2 = X.AnonymousClass5k7.A00(r0, r2)
            r6.A00 = r2
            X.56q r1 = r6.A03
            r0 = 249(0xf9, float:3.49E-43)
        L_0x0300:
            X.C880856r.A05(r2, r1, r6, r0)
            return
        L_0x0304:
            java.lang.Object r0 = r11.A00
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r0 = (com.facebook.redex.IDxCListenerShape203S0100000_2_I2) r0
            java.lang.Object r1 = r0.A00
            X.5jv r1 = (X.C92825jv) r1
            com.fbpay.logging.FBPayLoggerData r0 = r1.A02
            java.util.Map r3 = X.C122037Js.A06(r0)
            com.fbpay.hub.paymentmethods.api.FbPayPayPal r0 = r1.A01
            java.lang.String r0 = r0.A00
            java.lang.Long r0 = X.AnonymousClass0wJ.A0d(r0)
            X.C86164wN.A1J(r0, r3)
            X.8h9 r1 = r1.A05
            java.lang.String r0 = "fbpay_remove_paypal_cancel"
        L_0x0321:
            r1.Bb8(r0, r3)
            goto L_0x0395
        L_0x0325:
            java.lang.Object r0 = r11.A00
            X.5js r0 = (X.C92795js) r0
            X.8h9 r2 = r0.A02
            com.fbpay.logging.FBPayLoggerData r0 = r0.A00
            java.util.Map r1 = X.C122037Js.A06(r0)
            java.lang.String r0 = "mcom_disable_payments_cancel"
            r2.Bb8(r0, r1)
            return
        L_0x0337:
            java.lang.Object r2 = r11.A00
            X.57v r2 = (X.C883857v) r2
            com.fbpay.hub.form.params.FormParams r1 = r2.A01
            com.fbpay.logging.FBPayLoggerData r0 = r1.A02
            if (r0 == 0) goto L_0x034a
            com.fbpay.hub.form.params.FormLogEvents r0 = r1.A01
            if (r0 == 0) goto L_0x034a
            java.lang.String r0 = r0.A02
            X.C86124wJ.A1P(r2, r0)
        L_0x034a:
            X.56r r1 = r2.A06
            goto L_0x03d6
        L_0x034e:
            java.lang.Object r1 = r11.A00
            X.0YP r1 = (X.AnonymousClass0YP) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r1.invoke(r12, r0)
            return
        L_0x035a:
            java.lang.Object r6 = r11.A00
            X.58G r6 = (X.AnonymousClass58G) r6
            com.facebookpay.form.fragment.model.FormParams r5 = r6.A01
            r0 = 0
            if (r5 == 0) goto L_0x03dc
            com.facebookpay.form.fragment.model.FormLoggingEvents r1 = r5.A09
            if (r1 == 0) goto L_0x0369
            com.facebookpay.form.fragment.model.FormClickEvent r0 = r1.A00
        L_0x0369:
            X.6IA r4 = r6.A0E
            if (r4 == 0) goto L_0x0376
            com.fbpay.logging.LoggingContext r3 = r6.A04
            r2 = 0
            if (r3 != 0) goto L_0x037a
            X.C86124wJ.A19()
            throw r2
        L_0x0376:
            X.AnonymousClass58G.A02(r0, r6)
            goto L_0x0395
        L_0x037a:
            java.lang.String r0 = r5.A0H
            if (r0 == 0) goto L_0x0382
            java.lang.Long r2 = X.AnonymousClass0wJ.A0d(r0)
        L_0x0382:
            X.587 r0 = r6.A06()
            java.util.LinkedHashMap r1 = X.AnonymousClass7Kr.A07(r0)
            boolean r0 = r4 instanceof X.C92255hs
            if (r0 == 0) goto L_0x0395
            X.7ke r0 = X.AnonymousClass7JJ.A00()
            r0.A0D(r3, r2, r1)
        L_0x0395:
            r12.dismiss()
            return
        L_0x0399:
            java.lang.Object r6 = r11.A00
            X.58G r6 = (X.AnonymousClass58G) r6
            com.facebookpay.form.fragment.model.FormParams r5 = r6.A01
            r0 = 0
            if (r5 == 0) goto L_0x03dc
            com.facebookpay.form.fragment.model.FormLoggingEvents r1 = r5.A09
            if (r1 == 0) goto L_0x03a8
            com.facebookpay.form.fragment.model.FormClickEvent r0 = r1.A02
        L_0x03a8:
            X.6IA r4 = r6.A0E
            if (r4 == 0) goto L_0x03d1
            com.fbpay.logging.LoggingContext r3 = r6.A04
            r2 = 0
            if (r3 != 0) goto L_0x03b5
            X.C86124wJ.A19()
            throw r2
        L_0x03b5:
            java.lang.String r0 = r5.A0H
            if (r0 == 0) goto L_0x03bd
            java.lang.Long r2 = X.AnonymousClass0wJ.A0d(r0)
        L_0x03bd:
            X.587 r0 = r6.A06()
            java.util.LinkedHashMap r1 = X.AnonymousClass7Kr.A07(r0)
            boolean r0 = r4 instanceof X.C92255hs
            if (r0 == 0) goto L_0x03d4
            X.7ke r0 = X.AnonymousClass7JJ.A00()
            r0.A0F(r3, r2, r1)
            goto L_0x03d4
        L_0x03d1:
            X.AnonymousClass58G.A02(r0, r6)
        L_0x03d4:
            X.56r r1 = r6.A0C
        L_0x03d6:
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x03f8
        L_0x03dc:
            java.lang.String r1 = "formParams"
            X.C04220Ms.A0E(r1)
            throw r0
        L_0x03e2:
            java.lang.Object r0 = r11.A00
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r0 = (com.facebook.redex.IDxCListenerShape203S0100000_2_I2) r0
            java.lang.Object r0 = r0.A00
            X.5hy r0 = (X.C92315hy) r0
            X.5hO r0 = r0.A00
            X.56q r1 = r0.A05
            com.google.common.collect.ImmutableList r0 = r0.A02
            java.lang.Object r0 = r0.get(r13)
            com.facebookpay.form.model.FormCountry r0 = (com.facebookpay.form.model.FormCountry) r0
            com.facebook.common.locale.Country r0 = r0.A00
        L_0x03f8:
            r1.A0H(r0)
            return
        L_0x03fc:
            java.lang.Object r0 = r11.A00
            androidx.biometric.FingerprintDialogFragment r0 = (androidx.biometric.FingerprintDialogFragment) r0
            X.586 r1 = r0.A04
            r0 = 1
            r1.A04(r0)
            return
        L_0x0407:
            java.lang.Object r0 = r11.A00
            X.5js r0 = (X.C92795js) r0
            X.8h9 r2 = r0.A02
            com.fbpay.logging.FBPayLoggerData r0 = r0.A00
            java.util.Map r1 = X.C122037Js.A06(r0)
            java.lang.String r0 = "mcom_disable_payments_click"
            r2.Bb8(r0, r1)
            java.lang.String r0 = "sendDisablePaymentsMutation"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape218S0100000_2_I2.onClick(android.content.DialogInterface, int):void");
    }

    public IDxCListenerShape218S0100000_2_I2(AnonymousClass0YP r2, int i) {
        this.A01 = i;
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public IDxCListenerShape218S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
