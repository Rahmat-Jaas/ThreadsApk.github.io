package com.facebook.redex;

import X.C62643aS;
import X.C82764qE;

public class IDxDestinationShape710S0100000_1_I2 implements C82764qE {
    public Object A00;
    public final int A01;

    public IDxDestinationShape710S0100000_1_I2(C62643aS r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BMv(androidx.fragment.app.FragmentActivity r25) {
        /*
            r24 = this;
            r1 = r24
            int r0 = r1.A01
            r14 = r25
            switch(r0) {
                case 0: goto L_0x017a;
                case 1: goto L_0x011e;
                case 2: goto L_0x00e2;
                case 3: goto L_0x0065;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.3DH r1 = X.C62643aS.A00(r1, r14)
            X.C63463hW.A03()
            X.16q r0 = r1.A03
            java.lang.String r8 = r0.A04
            java.lang.String r7 = r0.A03
            com.instagram.common.typedurl.ImageUrl r6 = r0.A00
            java.lang.Integer r0 = r0.A01
            java.lang.String r4 = X.C59973Nd.A00(r0)
            X.0bf r3 = r1.A04
            boolean r2 = r1.A07
            X.1bo r5 = new X.1bo
            r5.<init>()
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "USER_ID"
            r1.putString(r0, r8)
            java.lang.String r0 = "USERNAME"
            r1.putString(r0, r7)
            java.lang.String r0 = "PROFILE_PIC_URL"
            r1.putParcelable(r0, r6)
            java.lang.String r0 = "ORIGINATING_ACCOUNT_SOURCE"
            r1.putString(r0, r4)
            java.lang.String r0 = "IgSessionManager.LOGGED_OUT_TOKEN"
            X.C18190wL.A13(r1, r0)
            java.lang.String r0 = "IS_FROM_NDX"
            r1.putBoolean(r0, r2)
            r5.setArguments(r1)
            X.Drz r4 = X.C18180wK.A0Q(r14, r3)
            r3 = 2130772027(0x7f01003b, float:1.714716E38)
            r2 = 2130772023(0x7f010037, float:1.7147153E38)
            r1 = 2130772025(0x7f010039, float:1.7147157E38)
            r0 = 2130772026(0x7f01003a, float:1.7147159E38)
            r4.A09(r3, r2, r1, r0)
            r4.A03 = r5
            r4.A05()
            return
        L_0x0065:
            X.3DH r11 = X.C62643aS.A00(r1, r14)
            X.3b6 r0 = r11.A02
            java.lang.Object r1 = X.C59983Ne.A00(r0)
            X.2L8 r1 = (X.AnonymousClass2L8) r1
            X.3GF r15 = X.C67323zM.A02(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.coroutine.HttpErrorOrException.HttpError<out com.instagram.login.api.TwoFacResponse>"
            X.C04220Ms.A0C(r1, r0)
            X.1j9 r1 = (X.AnonymousClass1j9) r1
            X.8mT r1 = r1.A00
            r0 = r1
            X.1TP r0 = (X.AnonymousClass1TP) r0
            X.3IO r2 = X.C36492Rn.A00(r0)
            boolean r0 = r2 instanceof X.C27241sC
            if (r0 == 0) goto L_0x00d5
            X.1sC r2 = (X.C27241sC) r2
            X.0Oa r0 = r2.A05
            java.lang.String r20 = X.C18200wM.A0q(r0)
        L_0x0091:
            X.0bf r6 = r11.A04
            X.IcN r3 = X.AnonymousClass3XQ.A00(r14)
            if (r3 == 0) goto L_0x00de
            X.265 r7 = r11.A05
            X.0ZU r0 = X.AnonymousClass3XQ.A0A
            X.43b r4 = new X.43b
            r4.<init>(r0)
            r5 = 0
            X.1jz r2 = new X.1jz
            r8 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.43b r10 = new X.43b
            r10.<init>(r0)
            r8 = r14
            com.instagram.base.activity.IgFragmentActivity r8 = (com.instagram.base.activity.IgFragmentActivity) r8
            X.3F0 r0 = new X.3F0
            r0.<init>(r3, r6)
            X.4Di r7 = new X.4Di
            r9 = r3
            r12 = r2
            r13 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.16q r0 = r11.A03
            java.lang.String r2 = r0.A03
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.login.api.LoginResponse"
            X.C04220Ms.A0C(r1, r0)
            X.1qy r1 = (X.C26641qy) r1
            r16 = r1
            r17 = r7
            r18 = r6
            r19 = r2
            X.AnonymousClass3NC.A01(r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x00d5:
            X.1sB r2 = (X.C27231sB) r2
            X.0Oa r0 = r2.A05
            java.lang.String r20 = X.C18200wM.A0q(r0)
            goto L_0x0091
        L_0x00de:
            java.lang.String r1 = "SignInNavigation"
            goto L_0x0163
        L_0x00e2:
            X.3DH r0 = X.C62643aS.A00(r1, r14)
            X.3b6 r1 = r0.A02
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 != 0) goto L_0x0117
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.result.IgResult.Error<com.instagram.common.api.coroutine.HttpErrorOrException<Response of com.instagram.nux.aymh.responsehandlers.LoginParameters>>"
            X.C04220Ms.A0C(r1, r0)
            X.2L8 r1 = X.AnonymousClass1jB.A00(r1)
            boolean r0 = r1 instanceof X.AnonymousClass1j9
            if (r0 != 0) goto L_0x0117
            boolean r0 = r1 instanceof X.AnonymousClass1j8
            if (r0 == 0) goto L_0x0119
            X.1j8 r1 = (X.AnonymousClass1j8) r1
            java.lang.Throwable r0 = r1.A00
            java.lang.Throwable r0 = r0.getCause()
        L_0x0105:
            boolean r2 = r0 instanceof java.lang.SecurityException
            r0 = 2131826851(0x7f1118a3, float:1.9286598E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r14, r0)
            r0 = 2131831662(0x7f112b6e, float:1.9296356E38)
            if (r2 == 0) goto L_0x0172
            r0 = 2131835359(0x7f1139df, float:1.9303854E38)
            goto L_0x0172
        L_0x0117:
            r0 = 0
            goto L_0x0105
        L_0x0119:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x011e:
            X.3DH r3 = X.C62643aS.A00(r1, r14)
            X.3b6 r0 = r3.A02
            java.lang.Object r1 = X.C59983Ne.A00(r0)
            X.2L8 r1 = (X.AnonymousClass2L8) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.coroutine.HttpErrorOrException.HttpError<out com.instagram.login.api.TwoFacResponse>"
            X.C04220Ms.A0C(r1, r0)
            X.1j9 r1 = (X.AnonymousClass1j9) r1
            X.8mT r2 = r1.A00
            r0 = r2
            X.1TP r0 = (X.AnonymousClass1TP) r0
            X.3IO r1 = X.C36492Rn.A00(r0)
            X.0bf r7 = r3.A04
            X.IcN r4 = X.AnonymousClass3XQ.A00(r14)
            if (r4 == 0) goto L_0x0161
            X.265 r8 = r3.A05
            X.0ZU r0 = X.AnonymousClass3XQ.A0A
            X.43b r5 = new X.43b
            r5.<init>(r0)
            r6 = 0
            X.1jz r3 = new X.1jz
            r9 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.login.api.FacebookSignUpResponse"
            X.C04220Ms.A0C(r2, r0)
            X.1qz r2 = (X.C26651qz) r2
            java.lang.String r0 = r1.A02()
            r3.A0B(r2, r0, r6, r6)
            return
        L_0x0161:
            java.lang.String r1 = "FacebookSignInNavigation"
        L_0x0163:
            java.lang.String r0 = "could not find current fragment"
            X.C10450iM.A03(r1, r0)
            r0 = 2131826851(0x7f1118a3, float:1.9286598E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r14, r0)
            r0 = 2131827947(0x7f111ceb, float:1.928882E38)
        L_0x0172:
            java.lang.String r0 = X.AnonymousClass0wJ.A0k(r14, r0)
            X.C62973bE.A04(r14, r0, r1)
            return
        L_0x017a:
            r3 = 0
            X.C04220Ms.A0B(r14, r3)
            java.lang.Object r2 = r1.A00
            X.3aS r2 = (X.C62643aS) r2
            java.lang.Class<X.3DH> r4 = X.AnonymousClass3DH.class
            java.lang.Object r0 = X.C62643aS.A02(r2, r4)
            X.3DH r0 = (X.AnonymousClass3DH) r0
            X.16q r0 = r0.A03
            java.lang.Object r6 = r0.A02
            r5 = 37
            boolean r0 = r6 instanceof com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2
            if (r0 == 0) goto L_0x01f3
            r1 = r6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2) r1
            int r0 = r1.A02
            if (r0 != r5) goto L_0x01f3
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.nux.aymh.accountprovider.credentials.UsernameAndPasswordCredentials"
            X.C04220Ms.A0C(r6, r0)
            java.lang.String r9 = r1.A00
            if (r9 == 0) goto L_0x01f3
            java.lang.Class<com.instagram.user.model.User> r0 = com.instagram.user.model.User.class
            java.lang.Object r1 = X.C62643aS.A02(r2, r0)
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.String r0 = X.C18250wR.A0a(r1)
            android.net.Uri r6 = X.C15430rJ.A01(r0)
            java.lang.String r7 = r1.BK7()
            r10 = 0
            java.lang.String r8 = r1.Ak1()
            java.lang.String r0 = ""
            if (r8 != 0) goto L_0x01c2
            r8 = r0
        L_0x01c2:
            if (r6 != 0) goto L_0x01c8
            android.net.Uri r6 = X.C15430rJ.A01(r0)
        L_0x01c8:
            com.google.android.gms.auth.api.credentials.Credential r5 = new com.google.android.gms.auth.api.credentials.Credential
            r11 = r10
            r12 = r10
            r13 = r10
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            X.1QR r1 = X.AnonymousClass1QR.A00
            X.5lB r0 = new X.5lB
            r0.<init>(r14, r1)
            X.7AL r1 = r0.A05
            java.lang.String r0 = "client must not be null"
            X.C13320nQ.A02(r1, r0)
            X.5pQ r0 = new X.5pQ
            r0.<init>(r5, r1)
            X.5lQ r0 = r1.A04(r0)
            X.7HU r1 = X.AnonymousClass7CP.A00(r0)
            X.417 r0 = new X.417
            r0.<init>(r14)
            r1.A07(r0)
        L_0x01f3:
            java.lang.Object r0 = X.C62643aS.A02(r2, r4)
            X.3DH r0 = (X.AnonymousClass3DH) r0
            boolean r4 = r0.A07
            r15 = 0
            java.lang.Class<com.instagram.service.session.UserSession> r0 = com.instagram.service.session.UserSession.class
            java.lang.Object r2 = X.C62643aS.A02(r2, r0)
            com.instagram.service.session.UserSession r2 = (com.instagram.service.session.UserSession) r2
            X.0ZU r1 = X.AnonymousClass3XQ.A0A
            X.43b r0 = new X.43b
            r0.<init>(r1)
            if (r4 == 0) goto L_0x0221
            double r18 = X.C18200wM.A00()
            r23 = 1
            r20 = r3
            r21 = r3
            r22 = r3
            r16 = r0
            r17 = r2
            X.C67323zM.A07(r14, r15, r16, r17, r18, r20, r21, r22, r23)
            return
        L_0x0221:
            X.C67323zM.A05(r14, r15, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxDestinationShape710S0100000_1_I2.BMv(androidx.fragment.app.FragmentActivity):void");
    }
}
