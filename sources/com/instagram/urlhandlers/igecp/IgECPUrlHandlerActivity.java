package com.instagram.urlhandlers.igecp;

import X.C10300i6;
import X.C104836cS;
import X.C18230wP;
import com.instagram.base.activity.IgFragmentActivity;

public final class IgECPUrlHandlerActivity extends IgFragmentActivity {
    public final C104836cS A00 = new C104836cS();

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return C18230wP.A0Z();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: com.fbpay.logging.LoggingPolicy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: com.fbpay.logging.LoggingPolicy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: com.facebookpay.expresscheckout.models.CheckoutConfiguration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: com.fbpay.logging.LoggingPolicy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: com.facebookpay.expresscheckout.models.CheckoutConfiguration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v7, resolved type: com.facebookpay.expresscheckout.models.CheckoutConfiguration} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r32) {
        /*
            r31 = this;
            r0 = -1564255181(0xffffffffa2c35c33, float:-5.2952476E-18)
            int r17 = X.C14030oh.A00(r0)
            r2 = r31
            r0 = r32
            super.onCreate(r0)
            X.6cS r3 = r2.A00
            r1 = 31
            kotlin.jvm.internal.KtLambdaShape133S0100000_I2_113 r16 = new kotlin.jvm.internal.KtLambdaShape133S0100000_I2_113
            r0 = r16
            r0.<init>(r2, r1)
            r0 = 0
            com.instagram.service.session.UserSession r6 = X.AnonymousClass7HK.A00()
            X.0TJ r1 = X.AnonymousClass0TJ.A05
            r4 = 36315735194209004(0x8104f800020aec, double:3.0295553963214706E-306)
            boolean r1 = X.C63803iN.A0E(r1, r6, r4)
            if (r1 != 0) goto L_0x0037
            r16.invoke()
        L_0x002e:
            r1 = 1775979009(0x69db4a01, float:3.3138029E25)
            r0 = r17
            X.C14030oh.A07(r1, r0)
            return
        L_0x0037:
            X.6mc r1 = new X.6mc
            r1.<init>(r0, r2, r0)
            r3.A00 = r1
            android.os.Bundle r4 = X.C18190wL.A0C(r2)
            if (r4 == 0) goto L_0x004d
            r1 = 1037(0x40d, float:1.453E-42)
            java.lang.String r1 = X.C18170wI.A00(r1)
            r4.getParcelable(r1)
        L_0x004d:
            X.AnonymousClass7Kz.A0N()
            android.content.Intent r4 = r2.getIntent()
            java.lang.String r1 = "key_uri"
            java.lang.String r5 = r4.getStringExtra(r1)
            java.lang.String r6 = "Required value was null."
            if (r5 == 0) goto L_0x0237
            r1 = 183(0xb7, float:2.56E-43)
            java.lang.String r4 = X.C18170wI.A00(r1)
            r1 = 0
            boolean r4 = X.AnonymousClass8bP.A0j(r5, r4, r1)
            if (r4 == 0) goto L_0x010e
            X.69R r20 = X.AnonymousClass69R.A0Q
            X.69R r21 = X.AnonymousClass69R.A0R
            X.69R r22 = X.AnonymousClass69R.A0W
            X.69R r23 = X.AnonymousClass69R.A0X
            X.69R r24 = X.AnonymousClass69R.A0S
            X.69R r25 = X.AnonymousClass69R.A0Y
            java.lang.Integer r5 = X.AnonymousClass006.A00
            com.facebookpay.expresscheckout.models.ItemDetails r4 = new com.facebookpay.expresscheckout.models.ItemDetails
            r4.<init>(r5, r0)
            X.69R r26 = X.AnonymousClass69R.A0C
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r15 = new com.facebookpay.expresscheckout.models.EcpUIConfiguration
            r18 = r15
            r19 = r0
            r27 = r0
            r28 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x008d:
            java.lang.String r9 = X.C122037Js.A00()
            android.content.Intent r4 = r2.getIntent()
            java.lang.String r12 = "product_id"
            java.lang.String r8 = r4.getStringExtra(r12)
            if (r8 == 0) goto L_0x022b
            android.content.Intent r4 = r2.getIntent()
            java.lang.String r11 = "receiver_id"
            java.lang.String r5 = r4.getStringExtra(r11)
            if (r5 == 0) goto L_0x0226
            android.content.Intent r4 = r2.getIntent()
            java.lang.String r10 = "order_id"
            java.lang.String r7 = r4.getStringExtra(r10)
            if (r7 == 0) goto L_0x0221
            android.os.Bundle r6 = X.C18180wK.A06()
            java.lang.String r4 = X.C61983Wp.A00()
            r6.putString(r4, r9)
            r6.putString(r12, r8)
            r6.putString(r11, r5)
            r6.putString(r10, r7)
            java.lang.String r4 = "ECP_UI_CONFIGURATION"
            r6.putParcelable(r4, r15)
            long r23 = java.lang.Long.parseLong(r8)
            X.84Y r21 = X.AnonymousClass84Y.A00
            com.fbpay.logging.LoggingContext r11 = new com.fbpay.logging.LoggingContext
            r18 = r11
            r20 = r9
            r22 = r21
            r25 = r1
            r18.<init>(r19, r20, r21, r22, r23, r25)
            X.7ke r4 = X.AnonymousClass7JJ.A00()
            java.lang.String r12 = "deeplink_checkout_entry"
            X.09x r10 = r4.A00
            java.lang.String r4 = "user_click_ecpentry_atomic"
            X.0A2 r10 = X.C86104wH.A0K(r10, r4)
            r4 = 2839(0xb17, float:3.978E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r10 = X.C18180wK.A0I(r10, r4)
            r4 = 15
            X.C128957ke.A03(r10, r11, r0, r12, r4)
            X.7HK r4 = X.AnonymousClass7Kz.A0J()
            boolean r10 = r4.A05()
            java.lang.String r4 = "ecpCheckoutHelper"
            X.6mc r12 = r3.A00
            if (r10 == 0) goto L_0x013d
            if (r12 != 0) goto L_0x0162
            X.C04220Ms.A0E(r4)
            throw r0
        L_0x010e:
            java.lang.String r4 = X.AnonymousClass320.A03
            X.C04220Ms.A08(r4)
            boolean r4 = X.AnonymousClass8bP.A0j(r5, r4, r1)
            if (r4 == 0) goto L_0x0230
            X.69R r20 = X.AnonymousClass69R.A0C
            X.69R r21 = X.AnonymousClass69R.A0A
            X.69R r22 = X.AnonymousClass69R.A0D
            X.69R r23 = X.AnonymousClass69R.A0E
            X.69R r24 = X.AnonymousClass69R.A09
            X.69R r25 = X.AnonymousClass69R.A0Z
            java.lang.Integer r5 = X.AnonymousClass006.A00
            com.facebookpay.expresscheckout.models.ItemDetails r4 = new com.facebookpay.expresscheckout.models.ItemDetails
            r4.<init>(r5, r0)
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r15 = new com.facebookpay.expresscheckout.models.EcpUIConfiguration
            r18 = r15
            r19 = r0
            r26 = r20
            r27 = r0
            r28 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x008d
        L_0x013d:
            if (r12 != 0) goto L_0x0143
            X.C04220Ms.A0E(r4)
            throw r0
        L_0x0143:
            X.0m7 r4 = r12.A01
            androidx.fragment.app.IDxLCallbacksShape42S0100000_2_I2 r0 = new androidx.fragment.app.IDxLCallbacksShape42S0100000_2_I2
            r0.<init>(r12, r1)
            r4.A0u(r0, r1)
            X.6uD r0 = r12.A04
            X.M5J r4 = r0.A00(r6)
            X.066 r1 = r12.A02
            X.8gC r0 = r12.A03
            r4.A0C(r1, r0)
            com.facebookpay.expresscheckout.handler.ECPHandler r0 = r12.A00
            X.M5J r5 = r0.ACn()
            r4 = 7
            goto L_0x0187
        L_0x0162:
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r11 = new com.facebookpay.expresscheckout.models.PaymentReceiverInfo
            r11.<init>(r5, r0, r0, r0)
            java.util.UUID r4 = X.C03480Iw.A00()
            java.lang.String r27 = X.C18190wL.A0n(r4)
            r10 = 2
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r4 = X.AnonymousClass7JJ.A02()
            java.lang.String r5 = r11.A02
            X.77W r4 = r4.A09
            X.6ly r13 = r4.A00(r8, r5)
            com.facebookpay.expresscheckout.models.CheckoutResponse r4 = X.C122157Kv.A09(r13)
            if (r4 == 0) goto L_0x0193
            X.56r r5 = X.C880856r.A04(r4)
        L_0x0186:
            r4 = 6
        L_0x0187:
            com.facebook.redex.IDxObserverShape55S0300000_2_I2 r1 = new com.facebook.redex.IDxObserverShape55S0300000_2_I2
            r0 = r16
            r1.<init>((int) r4, (java.lang.Object) r3, (java.lang.Object) r2, (java.lang.Object) r0)
            r5.A0C(r2, r1)
            goto L_0x002e
        L_0x0193:
            com.facebookpay.expresscheckout.handler.ECPHandler r5 = r12.A00
            X.7Kx r4 = X.AnonymousClass7Kx.A0A(r0)
            r5.Cqk(r4)
            X.0m7 r14 = r12.A01
            androidx.fragment.app.IDxLCallbacksShape42S0100000_2_I2 r4 = new androidx.fragment.app.IDxLCallbacksShape42S0100000_2_I2
            r4.<init>(r12, r1)
            r14.A0u(r4, r1)
            if (r13 == 0) goto L_0x021e
            com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl r4 = r13.A00
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r19 = X.C122157Kv.A08(r4)
            com.facebook.graphql.impls.FBPayPaymentConfigImpl r4 = r13.A03
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r21 = X.C122157Kv.A0C(r4, r0, r0)
        L_0x01b4:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r4 = new com.facebookpay.expresscheckout.models.ECPPaymentRequest
            r24 = r0
            r25 = r9
            r26 = r8
            r28 = r7
            r29 = r1
            r30 = r1
            r20 = r0
            r22 = r15
            r23 = r11
            r18 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r11 = X.AnonymousClass7JJ.A02()
            X.56r r7 = r11.A00
            X.AnonymousClass7Kx.A0I(r7, r4)
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r7 = r4.A05
            if (r7 == 0) goto L_0x01eb
            java.lang.String r9 = r7.A02
            if (r9 == 0) goto L_0x01eb
            java.lang.String r8 = r4.A08
            X.77W r7 = r11.A09
            X.6ly r7 = r7.A00(r8, r9)
            if (r7 == 0) goto L_0x01eb
            X.C122157Kv.A0F(r7, r4, r0)
        L_0x01eb:
            X.066 r11 = r12.A02
            androidx.lifecycle.LifecycleCoroutineScopeImpl r9 = X.AnonymousClass067.A00(r11)
            X.EgD r8 = X.C121437Gd.A00()
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S1411000_I2 r7 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S1411000_I2
            r18 = r7
            r19 = r4
            r20 = r12
            r21 = r0
            r22 = r0
            r23 = r0
            r25 = r1
            r26 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            X.C25237DiI.A00(r0, r8, r7, r9, r10)
            X.6uD r0 = r12.A04
            X.M5J r1 = r0.A00(r6)
            X.8gC r0 = r12.A03
            r1.A0C(r11, r0)
            X.M5J r5 = r5.ACm()
            goto L_0x0186
        L_0x021e:
            r21 = r0
            goto L_0x01b4
        L_0x0221:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r6)
            throw r0
        L_0x0226:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r6)
            throw r0
        L_0x022b:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r6)
            throw r0
        L_0x0230:
            java.lang.String r0 = "Unsupported app for ECP deeplink"
            java.lang.UnsupportedOperationException r0 = X.C86134wK.A0s(r0)
            throw r0
        L_0x0237:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.igecp.IgECPUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
