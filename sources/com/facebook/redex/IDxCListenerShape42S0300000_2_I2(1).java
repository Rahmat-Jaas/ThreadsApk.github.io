package com.facebook.redex;

import X.AnonymousClass7Kx;
import X.C88905Bd;
import X.C88915Be;
import X.C91655ga;
import X.C91665gb;
import android.view.View;

public class IDxCListenerShape42S0300000_2_I2 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCListenerShape42S0300000_2_I2(C88905Bd r1, C91655ga r2, AnonymousClass7Kx r3, int i) {
        this.A03 = i;
        if (1 - i != 0) {
            this.A00 = r3;
            this.A01 = r1;
            this.A02 = r2;
        } else {
            this.A02 = r2;
            this.A00 = r3;
            this.A01 = r1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x04c1, code lost:
        X.C14030oh.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x04c4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0542, code lost:
        X.C14030oh.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0545, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r17) {
        /*
            r16 = this;
            r6 = r16
            int r0 = r6.A03
            switch(r0) {
                case 0: goto L_0x0008;
                case 1: goto L_0x0099;
                case 2: goto L_0x0101;
                case 3: goto L_0x0129;
                case 4: goto L_0x0149;
                case 5: goto L_0x0169;
                case 6: goto L_0x0189;
                case 7: goto L_0x01f3;
                case 8: goto L_0x021b;
                case 9: goto L_0x023b;
                case 10: goto L_0x0276;
                case 11: goto L_0x02af;
                case 12: goto L_0x0302;
                case 13: goto L_0x035d;
                case 14: goto L_0x037c;
                case 15: goto L_0x03b1;
                case 16: goto L_0x03ec;
                case 17: goto L_0x0407;
                case 18: goto L_0x0444;
                case 19: goto L_0x0466;
                case 20: goto L_0x04c7;
                case 21: goto L_0x0514;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            r0 = -2002680798(0xffffffff88a18422, float:-9.720899E-34)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r6.A01
            com.instagram.ui.widget.radiogroup.IgRadioGroup r3 = (com.instagram.ui.widget.radiogroup.IgRadioGroup) r3
            r5 = -1
            r1 = 0
            if (r3 == 0) goto L_0x0097
            int r2 = r3.A00
            if (r2 == r5) goto L_0x0097
            android.view.View r2 = r3.requireViewById(r2)
            java.lang.Object r4 = r2.getTag()
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r4 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r4
        L_0x0025:
            java.lang.Object r3 = r6.A02
            com.instagram.ui.widget.radiogroup.IgRadioGroup r3 = (com.instagram.ui.widget.radiogroup.IgRadioGroup) r3
            if (r3 == 0) goto L_0x0037
            int r2 = r3.A00
            if (r2 == r5) goto L_0x0037
            android.view.View r1 = r3.requireViewById(r2)
            X.51w r1 = (X.C873051w) r1
            com.fbpay.w3c.CardDetails r1 = r1.A00
        L_0x0037:
            java.lang.Object r6 = r6.A00
            X.5ES r6 = (X.AnonymousClass5ES) r6
            X.7K3 r5 = r6.A00
            if (r5 == 0) goto L_0x0082
            if (r4 != 0) goto L_0x0091
            if (r1 != 0) goto L_0x0091
            r7 = 0
        L_0x0044:
            X.50v r1 = r5.A01
            if (r1 == 0) goto L_0x0082
            X.IF5 r1 = r5.A04
            if (r1 == 0) goto L_0x0082
            r5.A0C(r7)
            if (r7 == 0) goto L_0x0082
            X.5Ej r4 = r5.A02
            java.lang.Integer r2 = r4.A03()
            java.lang.Integer r1 = X.AnonymousClass006.A00
            if (r2 == r1) goto L_0x008e
            r4.A03()
            java.lang.String r1 = "ACCEPTED_PREFETCH"
        L_0x0060:
            X.78Q r3 = X.AnonymousClass7K3.A00(r4, r5, r1)
            boolean r1 = r4.A0A()
            if (r1 != 0) goto L_0x006d
            r1 = 1
            r4.A0N = r1
        L_0x006d:
            com.fbpay.w3c.CardDetails r2 = r7.A01
            if (r2 == 0) goto L_0x0077
            java.lang.String r1 = r2.A07
            if (r1 == 0) goto L_0x0077
            r3.A0C = r1
        L_0x0077:
            X.AnonymousClass78Q.A00(r3)
            if (r2 == 0) goto L_0x008a
            java.lang.String r2 = r2.A07
            r1 = 0
            X.AnonymousClass7K3.A03(r5, r1, r2)
        L_0x0082:
            r6.A06()
            r1 = -436915421(0xffffffffe5f53323, float:-1.4474039E23)
            goto L_0x04c1
        L_0x008a:
            r5.A0B(r7)
            goto L_0x0082
        L_0x008e:
            java.lang.String r1 = "ACCEPTED_AUTOFILL"
            goto L_0x0060
        L_0x0091:
            X.78k r7 = new X.78k
            r7.<init>(r4, r1)
            goto L_0x0044
        L_0x0097:
            r4 = r1
            goto L_0x0025
        L_0x0099:
            r0 = 72163741(0x44d219d, float:2.4113069E-36)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r8 = r6.A02
            X.5ga r8 = (X.C91655ga) r8
            X.0YM r5 = r8.A05
            java.lang.Object r7 = r6.A00
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            java.lang.Object r4 = r7.A01
            r1 = r4
            com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem r1 = (com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem) r1
            if (r1 == 0) goto L_0x00ff
            java.lang.String r1 = r1.A04
            java.lang.Long r3 = X.AnonymousClass0wJ.A0d(r1)
        L_0x00b7:
            java.lang.String r2 = "user_remove_contact_enter"
            java.lang.String r1 = "remove_email"
            r5.invoke(r2, r1, r3)
            if (r4 == 0) goto L_0x00fa
            java.lang.Object r2 = r6.A01
            X.5Bd r2 = (X.C88905Bd) r2
            com.facebookpay.widget.listcell.ListCell r1 = r2.A01
            android.content.Context r5 = X.C18190wL.A0A(r1)
            r6 = 14
            kotlin.jvm.internal.KtLambdaShape5S0300000_I2 r4 = X.C86154wM.A15(r7, r8, r2, r6)
            r1 = 10
            kotlin.jvm.internal.KtLambdaShape17S0200000_I2_1 r3 = X.C86154wM.A11(r7, r8, r1)
            r12 = 0
            r14 = 2
            X.77R r2 = X.AnonymousClass7Kz.A0M()
            r8 = 2131826501(0x7f111745, float:1.9285888E38)
            r9 = 2131826500(0x7f111744, float:1.9285886E38)
            r10 = 2131826495(0x7f11173f, float:1.9285876E38)
            r11 = 2131826488(0x7f111738, float:1.9285862E38)
            com.facebook.redex.IDxCListenerShape218S0100000_2_I2 r6 = X.C86154wM.A0N(r4, r6)
            r1 = 15
            com.facebook.redex.IDxCListenerShape218S0100000_2_I2 r7 = X.C86154wM.A0N(r3, r1)
            r13 = r12
            X.6sZ r1 = X.C117016xz.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.AnonymousClass77R.A00(r5, r1, r2)
        L_0x00fa:
            r1 = 694584600(0x29668518, float:5.11857E-14)
            goto L_0x04c1
        L_0x00ff:
            r3 = 0
            goto L_0x00b7
        L_0x0101:
            r0 = 1209578725(0x4818b4e5, float:156371.58)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r6.A00
            X.7Kx r2 = (X.AnonymousClass7Kx) r2
            boolean r1 = X.AnonymousClass7Kx.A0R(r2)
            if (r1 == 0) goto L_0x011b
            java.lang.Object r1 = r6.A01
            X.5Bd r1 = (X.C88905Bd) r1
            X.51D r1 = r1.A02
            r1.A00()
        L_0x011b:
            java.lang.Object r1 = r6.A02
            X.5ga r1 = (X.C91655ga) r1
            X.0YY r1 = r1.A04
            r1.invoke(r2)
            r1 = -124432299(0xfffffffff8955055, float:-2.4227549E34)
            goto L_0x04c1
        L_0x0129:
            r0 = -1685495531(0xffffffff9b896115, float:-2.2727487E-22)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r6.A01
            X.5BM r1 = (X.AnonymousClass5BM) r1
            X.51D r1 = r1.A01
            r1.A00()
            java.lang.Object r1 = r6.A02
            X.5gL r1 = (X.C91505gL) r1
            X.0YY r2 = r1.A00
            java.lang.Object r1 = r6.A00
            r2.invoke(r1)
            r1 = 246556453(0xeb22725, float:4.3918083E-30)
            goto L_0x04c1
        L_0x0149:
            r0 = -1333531765(0xffffffffb083eb8b, float:-9.59845E-10)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r6.A01
            X.5BM r1 = (X.AnonymousClass5BM) r1
            X.51D r1 = r1.A01
            r1.A00()
            java.lang.Object r1 = r6.A02
            X.5gL r1 = (X.C91505gL) r1
            X.0YY r2 = r1.A00
            java.lang.Object r1 = r6.A00
            r2.invoke(r1)
            r1 = 1456271835(0x56ccf1db, float:1.12669567E14)
            goto L_0x04c1
        L_0x0169:
            r0 = -1075465644(0xffffffffbfe5b254, float:-1.7945046)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r6.A01
            X.5gk r1 = (X.C91755gk) r1
            X.51D r1 = r1.A02
            r1.A00()
            java.lang.Object r1 = r6.A02
            X.5ge r1 = (X.C91695ge) r1
            X.0YY r2 = r1.A03
            java.lang.Object r1 = r6.A00
            r2.invoke(r1)
            r1 = -1132985266(0xffffffffbc78044e, float:-0.015137745)
            goto L_0x04c1
        L_0x0189:
            r0 = 343956446(0x14805bde, float:1.2960932E-26)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r8 = r6.A02
            X.5gb r8 = (X.C91665gb) r8
            X.0YM r5 = r8.A05
            java.lang.Object r7 = r6.A00
            X.7Kx r7 = (X.AnonymousClass7Kx) r7
            java.lang.Object r4 = r7.A01
            r1 = r4
            com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem r1 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem) r1
            if (r1 == 0) goto L_0x01f1
            java.lang.String r1 = r1.A04
            java.lang.Long r3 = X.AnonymousClass0wJ.A0d(r1)
        L_0x01a7:
            java.lang.String r2 = "user_remove_contact_enter"
            java.lang.String r1 = "remove_phone"
            r5.invoke(r2, r1, r3)
            if (r4 == 0) goto L_0x01ec
            java.lang.Object r2 = r6.A01
            X.5Be r2 = (X.C88915Be) r2
            com.facebookpay.widget.listcell.ListCell r1 = r2.A01
            android.content.Context r4 = X.C18190wL.A0A(r1)
            r1 = 17
            kotlin.jvm.internal.KtLambdaShape5S0300000_I2 r5 = X.C86154wM.A15(r7, r8, r2, r1)
            r1 = 11
            kotlin.jvm.internal.KtLambdaShape17S0200000_I2_1 r3 = X.C86154wM.A11(r7, r8, r1)
            r11 = 0
            r13 = 2
            X.77R r2 = X.AnonymousClass7Kz.A0M()
            r7 = 2131826505(0x7f111749, float:1.9285896E38)
            r8 = 2131826504(0x7f111748, float:1.9285894E38)
            r9 = 2131826495(0x7f11173f, float:1.9285876E38)
            r10 = 2131826488(0x7f111738, float:1.9285862E38)
            r1 = 18
            com.facebook.redex.IDxCListenerShape218S0100000_2_I2 r5 = X.C86154wM.A0N(r5, r1)
            r1 = 19
            com.facebook.redex.IDxCListenerShape218S0100000_2_I2 r6 = X.C86154wM.A0N(r3, r1)
            r12 = r11
            X.6sZ r1 = X.C117016xz.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.AnonymousClass77R.A00(r4, r1, r2)
        L_0x01ec:
            r1 = 2091208543(0x7ca54f5f, float:6.8667105E36)
            goto L_0x04c1
        L_0x01f1:
            r3 = 0
            goto L_0x01a7
        L_0x01f3:
            r0 = 1166080479(0x4580f9df, float:4127.234)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r6.A00
            X.7Kx r2 = (X.AnonymousClass7Kx) r2
            boolean r1 = X.AnonymousClass7Kx.A0R(r2)
            if (r1 == 0) goto L_0x020d
            java.lang.Object r1 = r6.A01
            X.5Be r1 = (X.C88915Be) r1
            X.51D r1 = r1.A02
            r1.A00()
        L_0x020d:
            java.lang.Object r1 = r6.A02
            X.5gb r1 = (X.C91665gb) r1
            X.0YY r1 = r1.A04
            r1.invoke(r2)
            r1 = -35623892(0xfffffffffde06c2c, float:-3.7288591E37)
            goto L_0x04c1
        L_0x021b:
            r0 = 1195930357(0x474872f5, float:51314.957)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r6.A01
            X.5Bf r1 = (X.C88925Bf) r1
            X.51D r1 = r1.A02
            r1.A00()
            java.lang.Object r1 = r6.A02
            X.5gc r1 = (X.C91675gc) r1
            X.0YY r2 = r1.A04
            java.lang.Object r1 = r6.A00
            r2.invoke(r1)
            r1 = -1785949221(0xffffffff958c93db, float:-5.6778824E-26)
            goto L_0x04c1
        L_0x023b:
            r0 = -886160237(0xffffffffcb2e4493, float:-1.1420819E7)
            int r3 = X.C14030oh.A05(r0)
            java.lang.Object r2 = r6.A00
            X.7Kx r2 = (X.AnonymousClass7Kx) r2
            java.lang.Object r0 = r2.A01
            if (r0 == 0) goto L_0x026b
            com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem r0 = (com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem) r0
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 == r0) goto L_0x025b
            java.lang.Object r0 = r6.A01
            X.5Bh r0 = (X.C88945Bh) r0
            X.51D r0 = r0.A02
            r0.A00()
        L_0x025b:
            java.lang.Object r0 = r6.A02
            X.5gA r0 = (X.C91395gA) r0
            X.0YY r0 = r0.A00
            r0.invoke(r2)
            r0 = -1640267997(0xffffffff9e3b7f23, float:-9.925989E-21)
            X.C14030oh.A0C(r0, r3)
            return
        L_0x026b:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0b()
            r0 = -1740180864(0xffffffff9846f280, float:-2.5713331E-24)
            X.C14030oh.A0C(r0, r3)
            throw r1
        L_0x0276:
            r0 = -1331521068(0xffffffffb0a299d4, float:-1.1830772E-9)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r6.A00
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            java.lang.Object r0 = r3.A01
            if (r0 == 0) goto L_0x02a4
            com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem r0 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem) r0
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 == r0) goto L_0x0296
            java.lang.Object r0 = r6.A01
            X.5Bj r0 = (X.C88965Bj) r0
            X.51D r0 = r0.A02
            r0.A00()
        L_0x0296:
            java.lang.Object r0 = r6.A02
            X.5gE r0 = (X.C91435gE) r0
            X.0YY r0 = r0.A00
            r0.invoke(r3)
            r0 = 2095978903(0x7cee1997, float:9.8902854E36)
            goto L_0x0542
        L_0x02a4:
            java.lang.IllegalStateException r1 = X.AnonymousClass0wJ.A0b()
            r0 = -2061428267(0xffffffff852119d5, float:-7.574928E-36)
            X.C14030oh.A0C(r0, r2)
            throw r1
        L_0x02af:
            r0 = 1305130752(0x4dcab700, float:4.2512384E8)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r6.A02
            X.58H r4 = (X.AnonymousClass58H) r4
            java.lang.Object r3 = r6.A01
            X.5HR r3 = (X.AnonymousClass5HR) r3
            java.lang.Object r2 = r6.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2) r2
            X.7Jo r5 = r4.A00
            java.lang.Integer r10 = X.AnonymousClass006.A01
            java.lang.Integer r11 = X.AnonymousClass006.A0Y
            boolean r1 = r3.A04
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r3.A01
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            r13 = 0
            if (r2 == 0) goto L_0x0300
            java.lang.Object r12 = r2.A00
            java.util.Map r12 = (java.util.Map) r12
        L_0x02db:
            boolean r1 = r3.A02
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r3.A03
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
            r15 = 288(0x120, float:4.04E-43)
            r14 = r13
            X.C122027Jo.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.4qz r5 = X.AnonymousClass3J5.A00(r4)
            r1 = 6
            kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1 r2 = new kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1
            r2.<init>((java.lang.Object) r4, (java.lang.Object) r3, (X.C146958n9) r13, (int) r1)
            r1 = 3
            X.C25237DiI.A00(r13, r13, r2, r5, r1)
            r1 = 811817687(0x30635ad7, float:8.271121E-10)
            goto L_0x04c1
        L_0x0300:
            r12 = r13
            goto L_0x02db
        L_0x0302:
            r0 = 574417119(0x223ce8df, float:2.5602032E-18)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r6.A02
            X.60T r1 = (X.AnonymousClass60T) r1
            X.6dJ r2 = r1.A00
            java.lang.Object r1 = r6.A01
            X.7sx r1 = (X.C131877sx) r1
            com.instagram.common.typedurl.ImageUrl r7 = r1.A00
            com.instagram.common.typedurl.ImageUrl r8 = r1.A01
            java.lang.Object r1 = r6.A00
            X.M5O r1 = (X.M5O) r1
            int r10 = r1.getLayoutPosition()
            X.5xa r1 = r2.A00
            X.0Oa r1 = r1.A07
            java.lang.Object r6 = r1.getValue()
            X.57r r6 = (X.C883457r) r6
            X.4wE r1 = r6.A05
            java.lang.Object r5 = r1.getValue()
            X.8ee r5 = (X.C142308ee) r5
            boolean r1 = r5 instanceof X.AnonymousClass5LX
            r11 = 0
            if (r1 == 0) goto L_0x034a
            r1 = r5
            X.5LX r1 = (X.AnonymousClass5LX) r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1201000_I2 r3 = r1.A01
            java.lang.Object r1 = r3.A02
            java.lang.Object r1 = X.C86124wJ.A0p(r1, r10)
            X.5Hc r1 = (X.AnonymousClass5Hc) r1
            int r2 = r1.A00
            int r1 = r3.A00
            if (r2 > r1) goto L_0x034a
            r11 = 1
        L_0x034a:
            X.4qz r2 = X.AnonymousClass3J5.A00(r6)
            r9 = 0
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S0412000_I2 r4 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S0412000_I2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r1 = 3
            X.C25237DiI.A00(r9, r9, r4, r2, r1)
            r1 = 1810668270(0x6bec9aee, float:5.7207626E26)
            goto L_0x04c1
        L_0x035d:
            r0 = 556733134(0x212f12ce, float:5.9317194E-19)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r4 = r6.A01
            X.7h3 r4 = (X.C127397h3) r4
            java.lang.Object r0 = r6.A02
            X.6mf r0 = (X.C111026mf) r0
            X.6jp r3 = r0.A00
            X.3iY r1 = X.C63893iY.A01
            java.lang.Object r0 = r6.A00
            X.3HX r0 = (X.AnonymousClass3HX) r0
            X.C122047Jt.A03(r0, r4, r1, r3)
            r0 = 237447491(0xe272943, float:2.0604206E-30)
            goto L_0x0542
        L_0x037c:
            r0 = 911216765(0x3650107d, float:3.1004013E-6)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r1 = r6.A01
            X.8iZ r1 = (X.C144478iZ) r1
            java.lang.Object r0 = r6.A02
            com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData r0 = (com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData) r0
            r1.Blv(r0)
            java.lang.Object r0 = r6.A00
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "input_method"
            java.lang.Object r3 = r1.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            android.view.View r0 = r1.getCurrentFocus()
            android.os.IBinder r1 = r0.getWindowToken()
            r0 = 0
            r3.hideSoftInputFromWindow(r1, r0)
            r0 = 7628685(0x74678d, float:1.0690065E-38)
            goto L_0x0542
        L_0x03b1:
            r0 = -752794189(0xffffffffd32145b3, float:-6.9265909E11)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r6.A01
            android.view.View r3 = (android.view.View) r3
            int r2 = r3.getVisibility()
            r1 = 0
            if (r2 != 0) goto L_0x03c5
            r1 = 8
        L_0x03c5:
            r3.setVisibility(r1)
            java.lang.Object r4 = r6.A02
            android.widget.TextView r4 = (android.widget.TextView) r4
            int r3 = r3.getVisibility()
            java.lang.Object r1 = r6.A00
            android.view.View r1 = (android.view.View) r1
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131821702(0x7f110486, float:1.9276155E38)
            if (r3 != 0) goto L_0x03e0
            r1 = 2131821700(0x7f110484, float:1.927615E38)
        L_0x03e0:
            java.lang.String r1 = r2.getString(r1)
            r4.setText(r1)
            r1 = 796280781(0x2f7647cd, float:2.2399078E-10)
            goto L_0x04c1
        L_0x03ec:
            r0 = 1989514491(0x769594fb, float:1.5169412E33)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r3 = r6.A02
            X.B48 r3 = (X.B48) r3
            java.lang.Object r1 = r6.A00
            X.9CZ r1 = (X.AnonymousClass9CZ) r1
            java.lang.Object r0 = r6.A01
            X.94O r0 = (X.AnonymousClass94O) r0
            r3.A0V(r1, r0)
            r0 = 727006440(0x2b553ce8, float:7.5757326E-13)
            goto L_0x0542
        L_0x0407:
            r0 = 482698570(0x1cc5654a, float:1.3062549E-21)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r6.A00
            com.instagram.genericsurvey.fragment.GenericSurveyFragment r5 = (com.instagram.genericsurvey.fragment.GenericSurveyFragment) r5
            java.lang.Object r4 = r6.A02
            X.BKU r4 = (X.BKU) r4
            X.AxR r3 = new X.AxR
            r3.<init>()
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r5)
            r0 = 2131827418(0x7f111ada, float:1.9287748E38)
            java.lang.String r0 = r1.getString(r0)
            r3.A08 = r0
            X.BKN r0 = r4.A0f
            java.lang.String r1 = r0.A4Y
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            r3.A04 = r1
            androidx.fragment.app.Fragment r3 = r3.A05()
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            com.instagram.service.session.UserSession r0 = r5.A08
            X.AnonymousClass0wJ.A19(r3, r1, r0)
            r0 = -521596565(0xffffffffe0e9116b, float:-1.3435458E20)
            goto L_0x0542
        L_0x0444:
            r0 = -313274726(0xffffffffed53ce9a, float:-4.096944E27)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r6.A00
            X.6l8 r0 = (X.C110106l8) r0
            android.view.View r1 = r0.A00
            r0 = 8
            r1.setVisibility(r0)
            java.lang.Object r1 = r6.A01
            X.4tx r1 = (X.C84844tx) r1
            java.lang.Object r0 = r6.A02
            X.1u0 r0 = (X.C28291u0) r0
            r1.CEA(r0)
            r0 = 297546627(0x11bc3383, float:2.9692917E-28)
            goto L_0x0542
        L_0x0466:
            r0 = 1764651333(0x692e7145, float:1.31805E25)
            int r0 = X.C14030oh.A05(r0)
            java.lang.Object r7 = r6.A00
            X.9P8 r7 = (X.AnonymousClass9P8) r7
            boolean r1 = r7.A0D
            if (r1 == 0) goto L_0x0494
            com.instagram.service.session.UserSession r5 = r7.A04
            java.lang.Object r4 = r6.A02
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            java.lang.String r3 = r7.A07
            r1 = 0
            X.C04220Ms.A0B(r5, r1)
            java.lang.String r2 = "share_business_bottom_sheet_"
            com.instagram.api.schemas.SMBPartnerType r1 = r4.A0T()
            if (r1 == 0) goto L_0x04c5
            java.lang.String r1 = r1.toString()
        L_0x048d:
            java.lang.String r1 = X.AnonymousClass00U.A0L(r2, r1)
            X.C120727Cf.A00(r7, r5, r4, r3, r1)
        L_0x0494:
            androidx.fragment.app.FragmentActivity r5 = r7.requireActivity()
            com.instagram.service.session.UserSession r4 = r7.A04
            java.lang.Object r1 = r6.A01
            X.8mR r1 = (X.C146558mR) r1
            java.lang.String r3 = r1.getUrl()
            X.9wF r1 = X.C171209wF.A2W
            X.Jpy r2 = new X.Jpy
            r2.<init>((android.app.Activity) r5, (com.instagram.service.session.UserSession) r4, (X.C171209wF) r1, (java.lang.String) r3)
            java.lang.Object r1 = r6.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.String r1 = r1.getId()
            r2.A06(r1)
            java.lang.String r1 = r7.getModuleName()
            r2.A07(r1)
            r2.A04()
            r1 = 1845832340(0x6e052a94, float:1.0303245E28)
        L_0x04c1:
            X.C14030oh.A0C(r1, r0)
            return
        L_0x04c5:
            r1 = 0
            goto L_0x048d
        L_0x04c7:
            r0 = -720166443(0xffffffffd51321d5, float:-1.01108448E13)
            int r2 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r6.A02
            X.9NY r0 = (X.AnonymousClass9NY) r0
            X.0Oa r0 = r0.A03
            java.lang.Object r7 = r0.getValue()
            X.8ut r7 = (X.C149878ut) r7
            java.lang.Object r0 = r6.A01
            X.5N7 r0 = (X.AnonymousClass5N7) r0
            com.instagram.api.schemas.SettingId r9 = r0.A00
            X.ADi r8 = r0.A04
            java.lang.String r11 = r0.A06
            java.lang.Object r0 = r6.A00
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.String r1 = X.C18200wM.A0p(r0)
            r0 = 0
            X.C18180wK.A1P(r9, r0, r1)
            X.0Oa r0 = r7.A02
            r0.getValue()
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = java.lang.Long.parseLong(r1)
            long r3 = r3 + r0
            java.lang.String r10 = java.lang.String.valueOf(r3)
            X.4qz r0 = X.AnonymousClass3J5.A00(r7)
            r12 = 0
            r13 = 3
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S2301000_I2 r6 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S2301000_I2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.C25237DiI.A00(r12, r12, r6, r0, r13)
            r0 = 2009129489(0x77c0e211, float:7.824267E33)
            goto L_0x0542
        L_0x0514:
            r0 = -918862881(0xffffffffc93b43df, float:-767037.94)
            int r2 = X.C14030oh.A05(r0)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            java.lang.Object r3 = r6.A01
            r1 = 1
            com.facebook.redex.IDxLAdapterShape0S0200000_2_I2 r0 = new com.facebook.redex.IDxLAdapterShape0S0200000_2_I2
            r5 = r17
            r0.<init>(r1, r3, r5)
            r4.addListener(r0)
            java.lang.Object r1 = r6.A02
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            java.lang.Object r0 = r6.A00
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            android.animation.Animator[] r0 = new android.animation.Animator[]{r1, r0}
            r4.playTogether(r0)
            r4.start()
            r0 = -1175289706(0xffffffffb9f28096, float:-4.625364E-4)
        L_0x0542:
            X.C14030oh.A0C(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape42S0300000_2_I2.onClick(android.view.View):void");
    }

    public IDxCListenerShape42S0300000_2_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A02 = obj;
        this.A00 = obj2;
        this.A01 = obj3;
    }

    public IDxCListenerShape42S0300000_2_I2(C88915Be r1, C91665gb r2, AnonymousClass7Kx r3, int i) {
        this.A03 = i;
        if (6 - i != 0) {
            this.A00 = r3;
            this.A01 = r1;
            this.A02 = r2;
        } else {
            this.A02 = r2;
            this.A00 = r3;
            this.A01 = r1;
        }
    }
}
