package com.instagram.fx.access.sso;

import X.AnonymousClass00J;
import X.AnonymousClass0OY;
import X.AnonymousClass3J5;
import X.AnonymousClass4d6;
import X.AnonymousClass4d7;
import X.AnonymousClass4d9;
import X.C04220Ms;
import X.C04530Oa;
import X.C10300i6;
import X.C146958n9;
import X.C18230wP;
import X.C209216q;
import X.C25237DiI;
import X.C27952Ew2;
import X.C62793ak;
import X.C75934d8;
import X.C75944dA;
import X.C83224qz;
import X.M5J;
import android.content.Context;
import android.os.Bundle;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0401000_I2_1;

public final class FxSsoViewModel extends C62793ak {
    public final C04530Oa A00 = AnonymousClass0OY.A02(AnonymousClass4d6.A00);
    public final C04530Oa A01 = AnonymousClass0OY.A02(AnonymousClass4d7.A00);
    public final C04530Oa A02 = AnonymousClass0OY.A02(C75934d8.A00);
    public final C04530Oa A03 = AnonymousClass0OY.A02(AnonymousClass4d9.A00);
    public final C04530Oa A04 = AnonymousClass0OY.A02(C75944dA.A00);

    public final void A02(Context context, Bundle bundle, C10300i6 r12) {
        C04220Ms.A0B(r12, 0);
        C83224qz A002 = AnonymousClass3J5.A00(this);
        Bundle bundle2 = bundle;
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape5S0401000_I2_1(bundle2, this, r12, context, (C146958n9) null, 27), A002, 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.content.Context r24, android.os.Bundle r25, X.C10300i6 r26, com.instagram.fx.access.sso.FxSsoViewModel r27, X.C146958n9 r28) {
        /*
            r3 = r27
            r4 = r26
            r5 = r25
            r6 = 41
            r7 = r28
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2.A00(r6, r7)
            if (r0 == 0) goto L_0x0288
            r11 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r11 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0288
            int r2 = r2 - r1
            r11.A00 = r2
        L_0x001e:
            java.lang.Object r1 = r11.A04
            X.D0E r10 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r11.A00
            java.lang.String r14 = "cached_ig_access_token"
            r9 = 1
            if (r0 == 0) goto L_0x01f9
            if (r0 != r9) goto L_0x02aa
            java.lang.Object r5 = r11.A03
            android.os.BaseBundle r5 = (android.os.BaseBundle) r5
            java.lang.Object r4 = r11.A02
            X.0i6 r4 = (X.C10300i6) r4
            java.lang.Object r3 = r11.A01
            com.instagram.fx.access.sso.FxSsoViewModel r3 = (com.instagram.fx.access.sso.FxSsoViewModel) r3
            X.AnonymousClass0OU.A00(r1)
        L_0x003a:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x028f
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r0 = r1.A00
            X.1SH r0 = (X.AnonymousClass1SH) r0
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0298
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            if (r0 == 0) goto L_0x0298
            r2 = 10
            java.util.ArrayList r13 = X.AnonymousClass0wJ.A0x(r0, r2)
            java.util.Iterator r18 = r0.iterator()
        L_0x005a:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0299
            java.lang.Object r1 = r18.next()
            X.3BO r1 = (X.AnonymousClass3BO) r1
            if (r1 == 0) goto L_0x01e7
            X.37y r0 = r1.A01
            if (r0 == 0) goto L_0x01e4
            com.instagram.fx.access.constants.FxcalAccountType r0 = r0.A00
        L_0x006e:
            com.instagram.fx.access.constants.FxcalAccountType r15 = com.instagram.fx.access.constants.FxcalAccountType.FACEBOOK
            java.lang.String r17 = ""
            if (r0 != r15) goto L_0x0154
            X.34c r0 = r1.A00
            if (r0 == 0) goto L_0x0085
            java.lang.String r6 = r0.A00
            if (r6 == 0) goto L_0x0085
            X.0Oa r0 = r3.A00
            X.M5J r0 = X.C18230wP.A0J(r0)
            r0.A0H(r6)
        L_0x0085:
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
            java.util.List r0 = r1.A03
            if (r0 == 0) goto L_0x014b
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            if (r0 == 0) goto L_0x014b
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0x(r0, r2)
            java.util.Iterator r16 = r0.iterator()
        L_0x009b:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x014b
            java.lang.Object r10 = r16.next()
            X.3AC r10 = (X.AnonymousClass3AC) r10
            if (r10 == 0) goto L_0x0149
            java.lang.Boolean r0 = r10.A01
            X.C04220Ms.A06(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x010a
            X.3DU r0 = r10.A00
            if (r0 == 0) goto L_0x0144
            com.instagram.common.typedurl.ImageUrl r7 = r0.A02
            java.lang.String r6 = r0.A0F
            java.lang.String r0 = r0.A0A
        L_0x00be:
            java.lang.Integer r25 = X.AnonymousClass006.A0N
            X.44X r11 = X.AnonymousClass44X.A00()
            java.lang.String r12 = "ig_android_growth_fx_access_fb_ig_sso"
            boolean r11 = X.AnonymousClass44X.A01(r4, r11, r12)
            if (r11 == 0) goto L_0x0112
            java.lang.String r11 = r10.A02
            if (r11 != 0) goto L_0x00da
            X.3DU r10 = r10.A00
            if (r10 == 0) goto L_0x00d8
            java.lang.String r11 = r10.A0F
            if (r11 != 0) goto L_0x00da
        L_0x00d8:
            r11 = r17
        L_0x00da:
            X.C04220Ms.A09(r11)
            X.44X r10 = X.AnonymousClass44X.A00()
            java.lang.String r22 = r10.A03(r4, r12)
            r23 = 0
            X.37y r10 = r1.A01
            if (r10 == 0) goto L_0x0110
            java.lang.String r10 = r10.A01
        L_0x00ed:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2 r19 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2
            r24 = r10
            r20 = r15
            r21 = r11
            r19.<init>((com.instagram.fx.access.constants.FxcalAccountType) r20, (java.lang.String) r21, (java.lang.String) r22, (java.lang.String) r23, (java.lang.String) r24)
        L_0x00f8:
            X.16q r10 = new X.16q
            r23 = r10
            r24 = r7
            r26 = r19
            r27 = r6
            r28 = r0
            r23.<init>(r24, r25, r26, r27, r28)
            r9.add(r10)
        L_0x010a:
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x010c:
            r8.add(r0)
            goto L_0x009b
        L_0x0110:
            r10 = 0
            goto L_0x00ed
        L_0x0112:
            java.lang.String r11 = r10.A02
            if (r11 != 0) goto L_0x0120
            X.3DU r10 = r10.A00
            if (r10 == 0) goto L_0x011e
            java.lang.String r11 = r10.A0F
            if (r11 != 0) goto L_0x0120
        L_0x011e:
            r11 = r17
        L_0x0120:
            X.C04220Ms.A09(r11)
            boolean r10 = X.C63693i8.A08(r4)
            if (r10 == 0) goto L_0x0141
            r22 = 0
        L_0x012b:
            r23 = 0
            X.37y r10 = r1.A01
            if (r10 == 0) goto L_0x013f
            java.lang.String r10 = r10.A01
        L_0x0133:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2 r19 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2
            r24 = r10
            r20 = r15
            r21 = r11
            r19.<init>((com.instagram.fx.access.constants.FxcalAccountType) r20, (java.lang.String) r21, (java.lang.String) r22, (java.lang.String) r23, (java.lang.String) r24)
            goto L_0x00f8
        L_0x013f:
            r10 = 0
            goto L_0x0133
        L_0x0141:
            java.lang.String r22 = X.AnonymousClass47l.A02
            goto L_0x012b
        L_0x0144:
            r7 = 0
            r6 = 0
            r0 = 0
            goto L_0x00be
        L_0x0149:
            r0 = 0
            goto L_0x010c
        L_0x014b:
            X.0Oa r0 = r3.A02
            X.M5J r0 = X.C18230wP.A0J(r0)
            r0.A0H(r9)
        L_0x0154:
            X.37y r0 = r1.A01
            if (r0 == 0) goto L_0x01e1
            com.instagram.fx.access.constants.FxcalAccountType r0 = r0.A00
        L_0x015a:
            com.instagram.fx.access.constants.FxcalAccountType r12 = com.instagram.fx.access.constants.FxcalAccountType.INSTAGRAM
            if (r0 != r12) goto L_0x01f2
            java.util.ArrayList r11 = X.AnonymousClass0wJ.A0v()
            java.util.List r0 = r1.A03
            if (r0 == 0) goto L_0x01e9
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            if (r0 == 0) goto L_0x01e9
            java.util.ArrayList r10 = X.AnonymousClass0wJ.A0x(r0, r2)
            java.util.Iterator r15 = r0.iterator()
        L_0x0174:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x01e9
            java.lang.Object r6 = r15.next()
            X.3AC r6 = (X.AnonymousClass3AC) r6
            if (r6 == 0) goto L_0x01df
            java.lang.Boolean r0 = r6.A01
            X.C04220Ms.A06(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01d0
            X.3DU r0 = r6.A00
            if (r0 == 0) goto L_0x01db
            com.instagram.common.typedurl.ImageUrl r9 = r0.A02
            java.lang.String r8 = r0.A0F
            java.lang.String r7 = r0.A0A
        L_0x0197:
            java.lang.Integer r25 = X.AnonymousClass006.A0Y
            if (r0 == 0) goto L_0x01a3
            java.lang.String r6 = r0.A0A
            if (r6 != 0) goto L_0x01a5
            java.lang.String r6 = r0.A0F
            if (r6 != 0) goto L_0x01a5
        L_0x01a3:
            r6 = r17
        L_0x01a5:
            if (r5 == 0) goto L_0x01d8
            java.lang.String r22 = r5.getString(r14)
        L_0x01ab:
            r23 = 0
            X.37y r0 = r1.A01
            if (r0 == 0) goto L_0x01d6
            java.lang.String r0 = r0.A01
        L_0x01b3:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2 r19 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2
            r24 = r0
            r20 = r12
            r21 = r6
            r19.<init>((com.instagram.fx.access.constants.FxcalAccountType) r20, (java.lang.String) r21, (java.lang.String) r22, (java.lang.String) r23, (java.lang.String) r24)
            X.16q r0 = new X.16q
            r23 = r0
            r24 = r9
            r26 = r19
            r27 = r8
            r28 = r7
            r23.<init>(r24, r25, r26, r27, r28)
            r11.add(r0)
        L_0x01d0:
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x01d2:
            r10.add(r0)
            goto L_0x0174
        L_0x01d6:
            r0 = 0
            goto L_0x01b3
        L_0x01d8:
            r22 = 0
            goto L_0x01ab
        L_0x01db:
            r9 = 0
            r8 = 0
            r7 = 0
            goto L_0x0197
        L_0x01df:
            r0 = 0
            goto L_0x01d2
        L_0x01e1:
            r0 = 0
            goto L_0x015a
        L_0x01e4:
            r0 = 0
            goto L_0x006e
        L_0x01e7:
            r0 = 0
            goto L_0x01f4
        L_0x01e9:
            X.0Oa r0 = r3.A03
            X.M5J r0 = X.C18230wP.A0J(r0)
            r0.A0H(r11)
        L_0x01f2:
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x01f4:
            r13.add(r0)
            goto L_0x005a
        L_0x01f9:
            X.AnonymousClass0OU.A00(r1)
            if (r25 == 0) goto L_0x0285
            java.lang.String r0 = "current_user_id"
            java.lang.String r8 = r5.getString(r0)
            java.lang.String r7 = r5.getString(r14)
        L_0x0208:
            X.0ZV r6 = X.AnonymousClass0ZV.A00
            X.44X r0 = X.AnonymousClass44X.A00()
            java.lang.String r13 = "ig_android_growth_fx_access_fb_ig_sso"
            boolean r0 = X.AnonymousClass44X.A01(r4, r0, r13)
            r2 = 0
            if (r0 == 0) goto L_0x0266
            com.instagram.fx.access.constants.FxcalAccountType r12 = com.instagram.fx.access.constants.FxcalAccountType.FACEBOOK
            X.44X r0 = X.AnonymousClass44X.A00()
            java.lang.String r1 = r0.A03(r4, r13)
            X.44X r0 = X.AnonymousClass44X.A00()
            java.lang.String r0 = r0.A02(r4, r13)
        L_0x0229:
            X.3TD r0 = X.C63883iV.A0G(r12, r1, r0)
            java.util.List r6 = X.AnonymousClass00J.A0X(r0, r6)
        L_0x0231:
            if (r8 == 0) goto L_0x023f
            if (r7 == 0) goto L_0x023f
            com.instagram.fx.access.constants.FxcalAccountType r0 = com.instagram.fx.access.constants.FxcalAccountType.INSTAGRAM
            X.3TD r0 = X.C63883iV.A0G(r0, r7, r8)
            java.util.List r6 = X.AnonymousClass00J.A0X(r0, r6)
        L_0x023f:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x02af
            if (r8 == 0) goto L_0x0263
            java.lang.String r0 = "account_switcher"
        L_0x0249:
            r1 = r24
            X.H8c r6 = X.C63883iV.A00(r1, r4, r0, r6)
            r1 = 14
            r11.A01 = r3
            r11.A02 = r4
            r11.A03 = r5
            r11.A00 = r9
            r0 = 1737768369(0x67943db1, float:1.4000965E24)
            java.lang.Object r1 = X.C63623hv.A01(r6, r11, r0, r2, r1)
            if (r1 != r10) goto L_0x003a
            return r10
        L_0x0263:
            java.lang.String r0 = "login"
            goto L_0x0249
        L_0x0266:
            X.47l r0 = X.AnonymousClass47l.A03
            boolean r0 = r0.A00(r4)
            if (r0 == 0) goto L_0x0231
            com.instagram.fx.access.constants.FxcalAccountType r12 = com.instagram.fx.access.constants.FxcalAccountType.FACEBOOK
            boolean r0 = X.C63693i8.A08(r4)
            if (r0 == 0) goto L_0x027f
            r1 = 0
        L_0x0277:
            boolean r0 = X.C63693i8.A08(r4)
            if (r0 == 0) goto L_0x0282
            r0 = 0
            goto L_0x0229
        L_0x027f:
            java.lang.String r1 = X.AnonymousClass47l.A02
            goto L_0x0277
        L_0x0282:
            java.lang.String r0 = X.AnonymousClass47l.A00
            goto L_0x0229
        L_0x0285:
            r8 = 0
            r7 = 0
            goto L_0x0208
        L_0x0288:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2 r11 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2
            r11.<init>(r3, r7, r6)
            goto L_0x001e
        L_0x028f:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x029d
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0298:
            r13 = 0
        L_0x0299:
            X.1jA r1 = X.AnonymousClass1jA.A00(r13)
        L_0x029d:
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x02af
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x02af
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x02aa:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x02af:
            kotlin.Unit r10 = kotlin.Unit.A00
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fx.access.sso.FxSsoViewModel.A00(android.content.Context, android.os.Bundle, X.0i6, com.instagram.fx.access.sso.FxSsoViewModel, X.8n9):java.lang.Object");
    }

    public final String A01() {
        List list;
        C209216q r0;
        M5J A0J = C18230wP.A0J(this.A02);
        if (A0J == null || (list = (List) A0J.A08()) == null || (r0 = (C209216q) AnonymousClass00J.A0D(list)) == null) {
            return null;
        }
        return r0.A04;
    }
}
