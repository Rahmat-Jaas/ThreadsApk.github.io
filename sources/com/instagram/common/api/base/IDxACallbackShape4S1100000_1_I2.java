package com.instagram.common.api.base;

import X.AnonymousClass0wJ;
import X.AnonymousClass1cM;
import X.AnonymousClass1x6;
import X.AnonymousClass3XX;
import X.AnonymousClass3z8;
import X.AnonymousClass4JS;
import X.AnonymousClass6CK;
import X.C10300i6;
import X.C11590kS;
import X.C14030oh;
import X.C18230wP;
import X.C18250wR;
import X.C37408JrQ;
import X.C60373Ot;
import X.C62973bE;
import X.C63483hZ;
import X.C63873iU;
import X.C67223zB;
import X.C67293zJ;
import X.C696049g;
import X.C84654td;
import android.os.Bundle;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape5S1100000_I2_1;

public class IDxACallbackShape4S1100000_1_I2 extends C63873iU {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxACallbackShape4S1100000_1_I2(String str, Object obj, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void onFail(AnonymousClass3XX r12) {
        int A002;
        int i;
        Throwable th;
        String str;
        switch (this.A02) {
            case 0:
                A002 = C14030oh.A03(332104728);
                AnonymousClass1cM r4 = (AnonymousClass1cM) this.A00;
                String A03 = C63483hZ.A03(r12, C18230wP.A0l(r4));
                String str2 = this.A01;
                HashMap A0y = AnonymousClass0wJ.A0y();
                C18250wR.A1E(str2, A0y);
                A0y.put("error_message", A03);
                Bundle A022 = AnonymousClass3z8.A02(A0y);
                String A003 = AnonymousClass1cM.A00(r4);
                if (A003 != null) {
                    A022.putString("prior_step", A003);
                }
                C10300i6 r2 = r4.A0E;
                C84654td r1 = r4.A08;
                if (r1 != null) {
                    C67223zB.A02(A022, C67223zB.A01(r2), C67293zJ.A02(r1), "fetch_data_error", "import_page_photo");
                }
                i = 1723071614;
                break;
            case 1:
                A002 = C14030oh.A03(1788634695);
                AnonymousClass1cM r42 = (AnonymousClass1cM) this.A00;
                String string = r42.requireContext().getString(2131834837);
                if (!(r12 == null || (th = r12.A01) == null || !(th instanceof AnonymousClass6CK))) {
                    string = ((AnonymousClass6CK) th).A00().getDescription();
                }
                C11590kS r3 = new C11590kS();
                String str3 = this.A01;
                r3.A02("page_name", str3);
                HashMap A0y2 = AnonymousClass0wJ.A0y();
                A0y2.put("page_name", str3);
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r42.A07;
                if (businessFlowAnalyticsLogger != null) {
                    businessFlowAnalyticsLogger.BcB(new C37408JrQ("create_page", r42.A0F, "page_name_validation", string, (String) null, (Map) null, A0y2, (Map) null));
                }
                i = 787037527;
                break;
            case 2:
                A002 = C14030oh.A03(1869303597);
                i = 306432621;
                break;
            case 3:
                A002 = C14030oh.A03(-28174139);
                C62973bE.A02(((AnonymousClass4JS) this.A00).A00, r12);
                i = 161453216;
                break;
            case 4:
                A002 = C14030oh.A03(179650539);
                C62973bE.A02(((AnonymousClass4JS) this.A00).A00, r12);
                i = -1459285049;
                break;
            case 5:
                A002 = AnonymousClass0wJ.A00(-606482495, r12);
                super.onFail(r12);
                AnonymousClass1x6 r43 = (AnonymousClass1x6) this.A00;
                AnonymousClass1x6.A0E(r43, new KtLambdaShape5S1100000_I2_1(this.A01, r43, 3));
                i = -2007406092;
                break;
            default:
                A002 = AnonymousClass0wJ.A00(-2953638, r12);
                Throwable th2 = r12.A01;
                if (th2 == null || (str = th2.getMessage()) == null) {
                    str = "";
                }
                C60373Ot.A01(((C696049g) this.A00).A04, "destinations_fetch_failed", this.A01, str, 0);
                i = 612777594;
                break;
        }
        C14030oh.A0A(i, A002);
    }

    public final void onFinish() {
        if (1 - this.A02 != 0) {
            super.onFinish();
            return;
        }
        int A03 = C14030oh.A03(-1791515190);
        super.onFinish();
        ((AnonymousClass1cM) this.A00).A00.setVisibility(8);
        C14030oh.A0A(925786704, A03);
    }

    public final void onStart() {
        if (1 - this.A02 != 0) {
            super.onStart();
            return;
        }
        int A03 = C14030oh.A03(323656069);
        super.onStart();
        AnonymousClass1cM r2 = (AnonymousClass1cM) this.A00;
        r2.A04.setVisibility(8);
        r2.A00.setVisibility(0);
        C14030oh.A0A(187360654, A03);
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x01f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r7 = r22
            int r1 = r0.A02
            switch(r1) {
                case 0: goto L_0x00a9;
                case 1: goto L_0x0169;
                case 2: goto L_0x0228;
                case 3: goto L_0x02d2;
                case 4: goto L_0x031b;
                case 5: goto L_0x0348;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = -286430364(0xffffffffeeed6b64, float:-3.6738887E28)
            int r2 = X.C14030oh.A03(r1)
            X.5z0 r7 = (X.AnonymousClass5z0) r7
            r1 = 543074808(0x205ea9f8, float:1.886037E-19)
            int r5 = X.AnonymousClass0wJ.A00(r1, r7)
            java.lang.Object r1 = r0.A00
            X.49g r1 = (X.C696049g) r1
            long r3 = java.lang.System.currentTimeMillis()
            r1.A00 = r3
            com.instagram.service.session.UserSession r6 = r1.A04
            com.google.common.collect.ImmutableList$Builder r3 = new com.google.common.collect.ImmutableList$Builder
            r3.<init>()
            java.lang.Object r4 = r7.A01
            X.4v0 r4 = (X.C85404v0) r4
            if (r4 == 0) goto L_0x03a2
            X.4vO r8 = r4.AoD()
            if (r8 == 0) goto L_0x03a2
            X.4vd r7 = r8.AsJ()
            r14 = 0
            if (r7 == 0) goto L_0x0061
            boolean r4 = X.C60343Oq.A01(r6)
            if (r4 == 0) goto L_0x00a4
            java.lang.String r10 = r7.BK3()
        L_0x0047:
            java.lang.String r12 = r7.getName()
            X.20B r4 = r7.BIn()
            if (r4 == 0) goto L_0x00a2
            java.lang.String r11 = r4.toString()
        L_0x0055:
            java.lang.String r13 = r7.B4V()
            X.3CV r9 = new X.3CV
            r9.<init>(r10, r11, r12, r13, r14)
            r3.add((java.lang.Object) r9)
        L_0x0061:
            com.google.common.collect.ImmutableList r4 = r8.Azl()
            X.C04220Ms.A06(r4)
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0w(r4)
            java.util.Iterator r9 = r4.iterator()
        L_0x0070:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x0384
            java.lang.Object r7 = r9.next()
            X.4ve r7 = (X.C85714ve) r7
            java.lang.String r16 = r7.getId()
            java.lang.String r18 = r7.getName()
            X.20B r4 = r7.BIn()
            if (r4 == 0) goto L_0x009f
            java.lang.String r17 = r4.toString()
        L_0x008e:
            java.lang.String r19 = r7.B4V()
            java.lang.String r20 = r7.B1p()
            X.3CV r15 = new X.3CV
            r15.<init>(r16, r17, r18, r19, r20)
            r8.add(r15)
            goto L_0x0070
        L_0x009f:
            r17 = r14
            goto L_0x008e
        L_0x00a2:
            r11 = r14
            goto L_0x0055
        L_0x00a4:
            java.lang.String r10 = r7.getId()
            goto L_0x0047
        L_0x00a9:
            r1 = -1779516855(0xffffffff95eeba49, float:-9.642134E-26)
            int r2 = X.C14030oh.A03(r1)
            X.5z0 r7 = (X.AnonymousClass5z0) r7
            r1 = 97166121(0x5caa329, float:1.9055924E-35)
            int r5 = X.C14030oh.A03(r1)
            java.lang.String r4 = "import_page_photo"
            r1 = 0
            if (r7 == 0) goto L_0x011b
            java.lang.Object r9 = r7.A01
            if (r9 == 0) goto L_0x011b
            X.3Ih r9 = (X.C58933Ih) r9
            java.lang.Class<X.14s> r8 = X.C204514s.class
            java.lang.String r6 = "import_ig_profile_pic_to_page"
            X.3Ih r3 = r9.A00(r8, r6)
            if (r3 == 0) goto L_0x011b
            X.3Ih r3 = r9.A00(r8, r6)
            org.json.JSONObject r6 = r3.A00
            java.lang.String r3 = "result"
            boolean r3 = r6.optBoolean(r3)
            if (r3 == 0) goto L_0x011b
            java.lang.String r3 = r0.A01
            java.util.HashMap r6 = X.AnonymousClass0wJ.A0y()
            X.C18250wR.A1E(r3, r6)
            java.lang.String r3 = "error_message"
            r6.put(r3, r1)
            android.os.Bundle r6 = X.AnonymousClass3z8.A02(r6)
            java.lang.Object r3 = r0.A00
            X.1cM r3 = (X.AnonymousClass1cM) r3
            java.lang.String r1 = X.AnonymousClass1cM.A00(r3)
            if (r1 == 0) goto L_0x00fd
            java.lang.String r0 = "prior_step"
            r6.putString(r0, r1)
        L_0x00fd:
            X.0i6 r1 = r3.A0E
            X.4td r0 = r3.A08
            if (r0 == 0) goto L_0x0110
            X.3zB r3 = X.C67223zB.A01(r1)
            java.lang.String r1 = X.C67293zJ.A02(r0)
            java.lang.String r0 = "fetch_data"
        L_0x010d:
            X.C67223zB.A02(r6, r3, r1, r0, r4)
        L_0x0110:
            r0 = 615727485(0x24b3417d, float:7.773982E-17)
            X.C14030oh.A0A(r0, r5)
            r0 = -640835017(0xffffffffd9cda237, float:-7.2350909E15)
            goto L_0x03c7
        L_0x011b:
            java.lang.String r9 = r0.A01
            if (r7 == 0) goto L_0x0139
            java.lang.Object r8 = r7.A01
            if (r8 == 0) goto L_0x0139
            X.3Ih r8 = (X.C58933Ih) r8
            java.lang.Class<X.14s> r7 = X.C204514s.class
            java.lang.String r6 = "import_ig_profile_pic_to_page"
            X.3Ih r3 = r8.A00(r7, r6)
            if (r3 == 0) goto L_0x0139
            X.3Ih r3 = r8.A00(r7, r6)
            java.lang.String r1 = "error"
            java.lang.String r1 = r3.A05(r1)
        L_0x0139:
            java.util.HashMap r6 = X.AnonymousClass0wJ.A0y()
            X.C18250wR.A1E(r9, r6)
            java.lang.String r3 = "error_message"
            r6.put(r3, r1)
            android.os.Bundle r6 = X.AnonymousClass3z8.A02(r6)
            java.lang.Object r3 = r0.A00
            X.1cM r3 = (X.AnonymousClass1cM) r3
            java.lang.String r1 = X.AnonymousClass1cM.A00(r3)
            if (r1 == 0) goto L_0x0158
            java.lang.String r0 = "prior_step"
            r6.putString(r0, r1)
        L_0x0158:
            X.0i6 r1 = r3.A0E
            X.4td r0 = r3.A08
            if (r0 == 0) goto L_0x0110
            X.3zB r3 = X.C67223zB.A01(r1)
            java.lang.String r1 = X.C67293zJ.A02(r0)
            java.lang.String r0 = "fetch_data_error"
            goto L_0x010d
        L_0x0169:
            r1 = -1074620314(0xffffffffbff29866, float:-1.8952758)
            int r2 = X.C14030oh.A03(r1)
            X.5z0 r7 = (X.AnonymousClass5z0) r7
            r1 = 751858969(0x2cd07519, float:5.924716E-12)
            int r3 = X.C14030oh.A03(r1)
            r11 = 0
            X.0kS r8 = new X.0kS
            r8.<init>()
            java.lang.String r4 = r0.A01
            java.lang.String r1 = "input_page_name"
            r8.A02(r1, r4)
            java.util.HashMap r14 = X.AnonymousClass0wJ.A0y()
            r14.put(r1, r4)
            java.lang.Object r9 = r7.A01
            r1 = 8
            if (r9 == 0) goto L_0x0213
            X.3Ih r9 = (X.C58933Ih) r9
            java.lang.Class<X.14o> r7 = X.C204114o.class
            java.lang.String r6 = "page_name_check"
            X.3Ih r4 = r9.A00(r7, r6)
            if (r4 == 0) goto L_0x0213
            X.3Ih r4 = r9.A00(r7, r6)
            java.lang.String r5 = "suggested_name"
            java.lang.String r4 = r4.A05(r5)
            if (r4 == 0) goto L_0x0213
            java.lang.Object r4 = r0.A00
            X.1cM r4 = (X.AnonymousClass1cM) r4
            android.widget.ImageView r0 = r4.A04
            r0.setVisibility(r1)
            X.3Ih r0 = r9.A00(r7, r6)
            java.lang.String r1 = "error"
            java.lang.String r0 = r0.A05(r1)
            if (r0 == 0) goto L_0x01d8
            X.3Ih r0 = r9.A00(r7, r6)
            java.lang.String r10 = r0.A05(r1)
            android.widget.TextView r0 = r4.A05
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r4.A02
            r0.setVisibility(r1)
            android.widget.TextView r0 = r4.A05
            r0.setText(r10)
        L_0x01d8:
            X.3Ih r0 = r9.A00(r7, r6)
            java.lang.String r0 = r0.A05(r5)
            java.lang.String r1 = "suggested_page_name"
            r8.A02(r1, r0)
            X.3Ih r0 = r9.A00(r7, r6)
            java.lang.String r0 = r0.A05(r5)
            r14.put(r1, r0)
        L_0x01f0:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r4.A07
            if (r0 == 0) goto L_0x0205
            java.lang.String r8 = "create_page"
            java.lang.String r9 = r4.A0F
            java.lang.String r10 = "page_name_validation"
            X.JrQ r7 = new X.JrQ
            r12 = r11
            r13 = r11
            r15 = r11
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r0.BcA(r7)
        L_0x0205:
            X.AnonymousClass1cM.A04(r4)
            r0 = 1469865424(0x579c5dd0, float:3.43853471E14)
            X.C14030oh.A0A(r0, r3)
            r0 = 1940763261(0x73adb27d, float:2.7523423E31)
            goto L_0x03c7
        L_0x0213:
            java.lang.Object r4 = r0.A00
            X.1cM r4 = (X.AnonymousClass1cM) r4
            android.widget.ImageView r5 = r4.A04
            r0 = 0
            r5.setVisibility(r0)
            android.widget.TextView r0 = r4.A05
            r0.setVisibility(r1)
            android.view.View r0 = r4.A02
            r0.setVisibility(r1)
            goto L_0x01f0
        L_0x0228:
            r1 = 1940024838(0x73a26e06, float:2.5738026E31)
            int r2 = X.C14030oh.A03(r1)
            X.5z0 r7 = (X.AnonymousClass5z0) r7
            r1 = -925935315(0xffffffffc8cf592d, float:-424649.4)
            int r6 = X.AnonymousClass0wJ.A00(r1, r7)
            java.lang.Object r3 = r7.A01
            X.4uT r3 = (X.C85074uT) r3
            if (r3 == 0) goto L_0x02ce
            X.4uS r1 = r3.AkM()
            if (r1 == 0) goto L_0x02ce
            X.4uS r1 = r3.AkM()
            if (r1 == 0) goto L_0x0250
            com.google.common.collect.ImmutableList r8 = r1.AW7()
            if (r8 != 0) goto L_0x0257
        L_0x0250:
            com.google.common.collect.ImmutableList r8 = com.google.common.collect.ImmutableList.of()
            X.C04220Ms.A06(r8)
        L_0x0257:
            java.lang.Object r3 = r0.A00
            X.49Q r3 = (X.AnonymousClass49Q) r3
            boolean r1 = r3.A04()
            r7 = 1
            if (r1 == 0) goto L_0x029c
            java.util.Map r5 = r3.A02
            java.lang.String r4 = r0.A01
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0283
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0283
        L_0x0270:
            r7 = 0
        L_0x0271:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r5.put(r4, r0)
        L_0x0278:
            r0 = -1862483590(0xffffffff90fcc17a, float:-9.969457E-29)
        L_0x027b:
            X.C14030oh.A0A(r0, r6)
            r0 = 617458937(0x24cdacf9, float:8.9197605E-17)
            goto L_0x03c7
        L_0x0283:
            java.util.Iterator r3 = r8.iterator()
        L_0x0287:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0270
            java.lang.Object r0 = r3.next()
            X.4uR r0 = (X.C85054uR) r0
            X.25c r1 = r0.AfG()
            X.25c r0 = X.C313025c.A01
            if (r1 != r0) goto L_0x0287
            goto L_0x0271
        L_0x029c:
            java.util.Map r5 = r3.A03
            java.lang.String r4 = "FACEBOOK"
            java.lang.Object r0 = r5.get(r4)
            boolean r0 = X.C18190wL.A1Z(r0, r7)
            if (r0 != 0) goto L_0x0278
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L_0x02b5
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x02b5
            goto L_0x0270
        L_0x02b5:
            java.util.Iterator r3 = r8.iterator()
        L_0x02b9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0270
            java.lang.Object r0 = r3.next()
            X.4uR r0 = (X.C85054uR) r0
            X.25c r1 = r0.AfG()
            X.25c r0 = X.C313025c.A01
            if (r1 != r0) goto L_0x02b9
            goto L_0x0271
        L_0x02ce:
            r0 = 1584197015(0x5e6ced97, float:4.26811695E18)
            goto L_0x027b
        L_0x02d2:
            r1 = -278339337(0xffffffffef68e0f7, float:-7.207249E28)
            int r2 = X.C14030oh.A03(r1)
            X.1T2 r7 = (X.AnonymousClass1T2) r7
            r1 = 412372498(0x18944e12, float:3.8335934E-24)
            int r6 = X.C14030oh.A03(r1)
            java.lang.Integer r3 = r7.A01
            java.lang.Integer r1 = X.AnonymousClass006.A01
            if (r3 != r1) goto L_0x0304
            java.lang.Object r0 = r0.A00
            X.4JS r0 = (X.AnonymousClass4JS) r0
            android.content.Context r3 = r0.A00
            r0 = 2131832470(0x7f112e96, float:1.9297995E38)
            java.lang.String r1 = r3.getString(r0)
            r0 = 1
            X.C63813iO.A0D(r3, r1, r0)
        L_0x02f9:
            r0 = -1095631344(0xffffffffbeb1fe10, float:-0.34764147)
            X.C14030oh.A0A(r0, r6)
            r0 = -1965276726(0xffffffff8adc41ca, float:-2.1209976E-32)
            goto L_0x03c7
        L_0x0304:
            java.lang.Integer r1 = X.AnonymousClass006.A00
            if (r3 != r1) goto L_0x02f9
            java.lang.Object r5 = r0.A00
            X.4JS r5 = (X.AnonymousClass4JS) r5
            java.lang.String r4 = r0.A01
            X.3Um r3 = r7.A00
            android.os.Handler r1 = r5.A01
            X.4Sf r0 = new X.4Sf
            r0.<init>(r3, r5, r4)
            r1.post(r0)
            goto L_0x02f9
        L_0x031b:
            r1 = 1393154536(0x5309d9e8, float:5.9206638E11)
            int r2 = X.C14030oh.A03(r1)
            X.1U3 r7 = (X.AnonymousClass1U3) r7
            r1 = -3117232(0xffffffffffd06f50, float:NaN)
            int r6 = X.C14030oh.A03(r1)
            java.lang.Object r5 = r0.A00
            X.4JS r5 = (X.AnonymousClass4JS) r5
            java.lang.String r4 = r0.A01
            X.3Um r3 = r7.A01
            android.os.Handler r1 = r5.A01
            X.4Sf r0 = new X.4Sf
            r0.<init>(r3, r5, r4)
            r1.post(r0)
            r0 = -237322077(0xfffffffff1dac0a3, float:-2.1664197E30)
            X.C14030oh.A0A(r0, r6)
            r0 = 2077689681(0x7bd70751, float:2.2329844E36)
            goto L_0x03c7
        L_0x0348:
            r1 = -795007798(0xffffffffd09d24ca, float:-2.10914714E10)
            int r2 = X.C14030oh.A03(r1)
            X.4vm r7 = (X.C85794vm) r7
            r1 = -1868929561(0xffffffff909a65e7, float:-6.0899295E-29)
            int r4 = X.AnonymousClass0wJ.A00(r1, r7)
            super.onSuccess(r7)
            java.lang.Object r1 = r0.A00
            X.1x6 r1 = (X.AnonymousClass1x6) r1
            X.AnonymousClass1x6.A0C(r1)
            java.lang.Object r0 = r7.D7H()
            X.32n r0 = (X.AnonymousClass32n) r0
            com.instagram.user.model.User r3 = r0.A00
            X.0Oa r1 = r1.A03
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r1)
            X.C18210wN.A1J(r0, r3)
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r1)
            r3.A1t(r0)
            r0 = -1694506337(0xffffffff9affe29f, float:-1.05831654E-22)
            X.C14030oh.A0A(r0, r4)
            r0 = -1717448012(0xffffffff99a1d2b4, float:-1.6732112E-23)
            goto L_0x03c7
        L_0x0384:
            java.util.ArrayList r9 = X.C18200wM.A0s(r8)
            X.4Tf r7 = X.C73644Tf.A00
            java.lang.String r4 = "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }"
            X.C04220Ms.A0C(r7, r4)
            r4 = 11
            com.facebook.redex.IDxComparatorShape302S0100000_1_I2 r8 = new com.facebook.redex.IDxComparatorShape302S0100000_1_I2
            r8.<init>((int) r4, (java.util.Comparator) r7)
            r7 = 7
            com.facebook.redex.IDxComparatorShape302S0100000_1_I2 r4 = new com.facebook.redex.IDxComparatorShape302S0100000_1_I2
            r4.<init>((int) r7, (java.util.Comparator) r8)
            X.C001300p.A0y(r9, r4)
            r3.addAll((java.lang.Iterable) r9)
        L_0x03a2:
            com.google.common.collect.ImmutableList r7 = X.C18250wR.A0F(r3)
            java.lang.String r9 = "destinations_fetch_succeed"
            int r3 = r7.size()
            long r3 = (long) r3
            java.lang.String r0 = r0.A01
            r11 = 0
            r8 = r6
            r10 = r0
            r12 = r3
            X.C60373Ot.A01(r8, r9, r10, r11, r12)
            boolean r0 = X.C18250wR.A1K(r7)
            if (r0 == 0) goto L_0x03be
            r1.A01 = r7
        L_0x03be:
            r0 = 1288000847(0x4cc5554f, float:1.03459448E8)
            X.C14030oh.A0A(r0, r5)
            r0 = 2144783123(0x7fd6cb13, float:NaN)
        L_0x03c7:
            X.C14030oh.A0A(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.api.base.IDxACallbackShape4S1100000_1_I2.onSuccess(java.lang.Object):void");
    }
}
