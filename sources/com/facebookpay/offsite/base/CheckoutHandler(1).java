package com.facebookpay.offsite.base;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.AnonymousClass4WJ;
import X.AnonymousClass4x8;
import X.AnonymousClass68R;
import X.AnonymousClass6XV;
import X.AnonymousClass7AE;
import X.AnonymousClass7JJ;
import X.AnonymousClass7Kx;
import X.AnonymousClass7Kz;
import X.C04220Ms;
import X.C06750aI;
import X.C110336lW;
import X.C110766mE;
import X.C110996mc;
import X.C114006sX;
import X.C114966uD;
import X.C115316ur;
import X.C121437Gd;
import X.C128137iw;
import X.C128557jn;
import X.C146668mf;
import X.C146958n9;
import X.C148838sG;
import X.C18180wK;
import X.C18220wO;
import X.C18240wQ;
import X.C25237DiI;
import X.C27952Ew2;
import X.C86124wJ;
import X.C86134wK;
import X.C880856r;
import X.C969767l;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl;
import com.facebook.pando.TreeJNI;
import com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields;
import com.facebookpay.expresscheckout.models.ECPAvailabilityRequestParams;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.offsite.models.message.MessageType$Companion;
import com.facebookpay.offsite.models.message.PaymentError;
import com.facebookpay.offsite.models.message.PaymentMode;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.facebookpay.offsite.models.message.PaymentRequestContent;
import com.facebookpay.offsite.models.message.PaymentResponse;
import com.facebookpay.offsite.models.message.PaymentResponseContent;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1;

public abstract class CheckoutHandler {
    public C114966uD A00;
    public DefaultPaymentMethodFields A01;
    public ECPAvailabilityRequestParams A02;
    public C146668mf A03;
    public PaymentMode A04;
    public AnonymousClass4x8 A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public Map A0G = AnonymousClass4WJ.A0A();
    public C148838sG A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public final Fragment A0O;
    public final FragmentActivity A0P;
    public final C880856r A0Q = C880856r.A03();
    public final C880856r A0R = C880856r.A03();
    public final C880856r A0S = C880856r.A03();
    public final C880856r A0T = C880856r.A02();
    public final C128137iw A0U;
    public final C110766mE A0V;
    public final C114006sX A0W;
    public final AtomicReference A0X = new AtomicReference("0");
    public final AtomicReference A0Y = new AtomicReference("0");
    public final boolean A0Z;
    public final C110996mc A0a;

    public final void A0H() {
        this.A0E = null;
        this.A0C = null;
        this.A09 = null;
        this.A0X.set("0");
        this.A0Y.set("0");
        this.A0G = AnonymousClass4WJ.A0A();
        this.A0A = null;
        this.A01 = null;
        this.A0K = false;
        this.A0J = false;
        this.A0L = false;
        this.A0M = false;
        if (this.A03 != null) {
            A0C().clear();
        }
        C148838sG r0 = this.A0H;
        if (r0 != null) {
            r0.AC7((CancellationException) null);
        }
    }

    public final void A0I(AnonymousClass68R r3, Map map) {
        String A032;
        C04220Ms.A0B(r3, 0);
        if (this.A0Z) {
            if (!(this.A03 == null || map.containsKey("PRODUCT_ID") || (A032 = A03(this)) == null || A032.length() == 0 || !TextUtils.isDigitsOnly(A03(this)))) {
                map.put("PRODUCT_ID", AnonymousClass0wJ.A0d(A03(this)));
            }
            AnonymousClass7Kz.A05().A0F.Bb8(r3.name(), map);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0226, code lost:
        if (r6.length() == 0) goto L_0x0228;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(com.facebookpay.expresscheckout.models.ECPPaymentRequest r30, com.facebookpay.expresscheckout.models.TransactionInfo r31, com.facebookpay.offsite.base.CheckoutHandler r32, com.facebookpay.offsite.models.message.PaymentRequest r33, java.lang.String r34, java.lang.String r35) {
        /*
            r0 = 119(0x77, float:1.67E-43)
            r1 = r32
            com.facebook.redex.IDxObserverShape211S0100000_2_I2 r7 = X.C86114wI.A0Q(r1, r0)
            X.56r r11 = X.C880856r.A03()
            X.8mf r0 = r1.A0C()
            boolean r2 = r0.BT0()
            r4 = 1
            java.lang.String r3 = "SECURITY_ORIGIN"
            r10 = 0
            r0 = 0
            r13 = r30
            r17 = r31
            r6 = r33
            r12 = r34
            r5 = r35
            if (r2 == 0) goto L_0x01dc
            X.6mc r14 = r1.A0a
            java.lang.String r2 = r13.A0A
            r21 = r2
            com.facebookpay.offsite.models.message.PaymentRequestContent r2 = r6.content
            java.lang.String r9 = X.AnonymousClass6IW.A00(r2)
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r2 = r13.A04
            r22 = r2
            java.lang.String r2 = r13.A09
            r20 = r2
            java.lang.String r2 = r13.A07
            r19 = r2
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r8 = r13.A05
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r7 = r13.A01
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r2 = r13.A03
            com.facebookpay.offsite.models.message.PaymentRequestContent r6 = r6.content
            r16 = 2
            kotlin.Pair r5 = X.C18180wK.A0p(r3, r5)
            X.7AE r3 = A02(r1)
            X.6ur r3 = r3.A03
            if (r3 == 0) goto L_0x01d9
            java.lang.String r15 = r3.A01
        L_0x0055:
            java.lang.String r3 = "AD_ID"
            kotlin.Pair r3 = X.C18180wK.A0p(r3, r15)
            kotlin.Pair[] r3 = new kotlin.Pair[]{r5, r3}
            java.util.List r31 = X.C121717Hp.A04(r6, r3)
            com.fbpay.logging.LoggingPolicy r3 = r13.A06
            r18 = r3
            com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration r15 = r13.A02
            r3 = r20
            X.C18180wK.A1P(r9, r4, r3)
            r3 = 16
            X.C04220Ms.A0B(r12, r3)
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r3 = X.AnonymousClass7JJ.A02()
            if (r8 == 0) goto L_0x01d6
            java.lang.String r4 = r8.A02
        L_0x007b:
            X.77W r3 = r3.A09
            X.6ly r6 = r3.A00(r9, r4)
            com.facebookpay.expresscheckout.models.CheckoutResponse r3 = X.C122157Kv.A09(r6)
            if (r3 == 0) goto L_0x0135
            X.56r r2 = X.C880856r.A04(r3)
        L_0x008b:
            java.lang.Object r2 = r2.A08()
            r11.A0H(r2)
        L_0x0092:
            java.lang.Object r2 = r11.A08()
            com.facebookpay.expresscheckout.models.CheckoutResponse r2 = (com.facebookpay.expresscheckout.models.CheckoutResponse) r2
            if (r2 == 0) goto L_0x0132
            java.lang.String r3 = r2.A00
        L_0x009c:
            java.lang.String r2 = "CHECKOUT_NOT_AVAILABLE"
            boolean r2 = X.C04220Ms.A0I(r3, r2)
            if (r2 == 0) goto L_0x012f
            java.lang.String r9 = r13.A0A
            java.lang.String r8 = r13.A08
            java.lang.String r6 = r13.A07
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r2 = r13.A05
            if (r2 == 0) goto L_0x00b0
            java.lang.String r0 = r2.A02
        L_0x00b0:
            r2 = 2131826475(0x7f11172b, float:1.9285835E38)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            r2 = 2131826474(0x7f11172a, float:1.9285833E38)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r2)
            X.68y r11 = X.C973368y.A04
            r13 = 0
            r5 = r13
            com.facebookpay.common.models.ErrorDialogContent r2 = new com.facebookpay.common.models.ErrorDialogContent
            r10 = r2
            r12 = r13
            r14 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            r20 = r13
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.77R r4 = X.AnonymousClass7Kz.A0M()
            androidx.fragment.app.FragmentActivity r3 = r1.A0P
            X.7Ec r11 = X.AnonymousClass7Kz.A0G()
            r10 = 46
            r7 = 41
            android.graphics.drawable.Drawable r10 = r11.A04(r3, r10, r7)
            java.lang.String r16 = r2.A05(r3)
            java.lang.String r17 = r2.A02(r3)
            java.lang.String r18 = r2.A03(r3)
            r22 = 2131826365(0x7f1116bd, float:1.9285612E38)
            X.67N r11 = r2.A00()
            boolean r7 = r2.A06()
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r7)
            X.6iz r7 = r2.A00
            if (r7 == 0) goto L_0x0105
            java.lang.String r5 = r7.A02
        L_0x0105:
            java.lang.String r20 = r2.A04(r3)
            X.67N r12 = r2.A01()
            X.6iz r2 = r2.A01
            if (r2 == 0) goto L_0x0130
            java.lang.String r2 = r2.A02
        L_0x0113:
            X.7kn r14 = new X.7kn
            r23 = r14
            r24 = r1
            r25 = r9
            r26 = r8
            r27 = r6
            r28 = r0
            r23.<init>(r24, r25, r26, r27, r28)
            r19 = r5
            r21 = r2
            X.6sZ r0 = X.C117016xz.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.AnonymousClass77R.A00(r3, r0, r4)
        L_0x012f:
            return
        L_0x0130:
            r2 = 0
            goto L_0x0113
        L_0x0132:
            r3 = r0
            goto L_0x009c
        L_0x0135:
            com.facebookpay.expresscheckout.handler.ECPHandler r5 = r14.A00
            X.7Kx r3 = X.AnonymousClass7Kx.A0A(r17)
            r5.Cqk(r3)
            X.0m7 r4 = r14.A01
            androidx.fragment.app.IDxLCallbacksShape42S0100000_2_I2 r3 = new androidx.fragment.app.IDxLCallbacksShape42S0100000_2_I2
            r3.<init>(r14, r10)
            r4.A0u(r3, r10)
            if (r7 != 0) goto L_0x0152
            if (r6 == 0) goto L_0x01d3
            com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl r3 = r6.A00
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r7 = X.C122157Kv.A08(r3)
        L_0x0152:
            if (r2 != 0) goto L_0x015c
            if (r6 == 0) goto L_0x01d1
            com.facebook.graphql.impls.FBPayPaymentConfigImpl r2 = r6.A03
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r2 = X.C122157Kv.A0C(r2, r0, r0)
        L_0x015c:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = new com.facebookpay.expresscheckout.models.ECPPaymentRequest
            r23 = r8
            r24 = r18
            r25 = r21
            r26 = r9
            r27 = r20
            r28 = r19
            r29 = r10
            r30 = r10
            r18 = r3
            r19 = r7
            r20 = r15
            r21 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r7 = X.AnonymousClass7JJ.A02()
            X.56r r2 = r7.A00
            X.AnonymousClass7Kx.A0I(r2, r3)
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r2 = r3.A05
            if (r2 == 0) goto L_0x01cf
            java.lang.String r6 = r2.A02
            if (r6 == 0) goto L_0x01cf
            java.lang.String r4 = r3.A08
            X.77W r2 = r7.A09
            X.6ly r4 = r2.A00(r4, r6)
            if (r4 == 0) goto L_0x01cf
            r2 = r17
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r4 = X.C122157Kv.A0F(r4, r3, r2)
        L_0x019a:
            X.066 r6 = r14.A02
            androidx.lifecycle.LifecycleCoroutineScopeImpl r9 = X.AnonymousClass067.A00(r6)
            X.EgD r8 = X.C121437Gd.A00()
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S1411000_I2 r7 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S1411000_I2
            r27 = r7
            r28 = r3
            r29 = r14
            r30 = r17
            r32 = r0
            r33 = r0
            r34 = r10
            r35 = r10
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35)
            r2 = r16
            X.C25237DiI.A00(r0, r8, r7, r9, r2)
            X.6uD r2 = r14.A04
            X.M5J r3 = r2.A02(r4, r12)
            X.8gC r2 = r14.A03
            r3.A0C(r6, r2)
            X.M5J r2 = r5.ACm()
            goto L_0x008b
        L_0x01cf:
            r4 = r3
            goto L_0x019a
        L_0x01d1:
            r2 = r0
            goto L_0x015c
        L_0x01d3:
            r7 = r0
            goto L_0x0152
        L_0x01d6:
            r4 = r0
            goto L_0x007b
        L_0x01d9:
            r15 = r0
            goto L_0x0055
        L_0x01dc:
            X.8mf r2 = r1.A0C()
            boolean r2 = r2.BW9()
            if (r2 == 0) goto L_0x02ae
            X.6mc r4 = r1.A0a
            java.lang.String r2 = r13.A0A
            r22 = r2
            java.lang.String r2 = r13.A09
            r18 = r2
            com.facebookpay.offsite.models.message.PaymentRequestContent r2 = r6.content
            java.lang.String r7 = X.AnonymousClass6IW.A00(r2)
            java.lang.String r2 = r13.A07
            r16 = r2
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r8 = r13.A05
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r2 = r13.A04
            r15 = r2
            com.facebookpay.offsite.models.message.PaymentRequestContent r6 = r6.content
            kotlin.Pair r2 = X.C18180wK.A0p(r3, r5)
            kotlin.Pair[] r2 = new kotlin.Pair[]{r2}
            java.util.List r29 = X.C121717Hp.A04(r6, r2)
            r14 = 2
            r2 = 10
            X.C04220Ms.A0B(r12, r2)
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r9 = X.AnonymousClass7JJ.A02()
            if (r8 == 0) goto L_0x02ab
            java.lang.String r6 = r8.A02
        L_0x021b:
            X.0MJ r5 = X.C86144wL.A17()
            if (r6 == 0) goto L_0x0228
            int r2 = r6.length()
            r3 = 0
            if (r2 != 0) goto L_0x0229
        L_0x0228:
            r3 = 1
        L_0x0229:
            r2 = 0
            if (r3 != 0) goto L_0x0236
            X.6rH r3 = r9.A0A
            X.6lW r3 = r3.A00(r7, r6)
            if (r3 == 0) goto L_0x0236
            com.facebook.graphql.impls.FBPayECPAvailabilityImpl r2 = r3.A01
        L_0x0236:
            r5.A00 = r2
            if (r2 == 0) goto L_0x0260
            java.lang.String r3 = "is_ecp_available"
            boolean r2 = r2.getBooleanValue(r3)
            if (r2 != 0) goto L_0x0260
            java.lang.Object r3 = r5.A00
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            java.lang.String r2 = "ecp_availability_reason"
            java.lang.String r4 = r3.getStringValue(r2)
            java.lang.String r3 = "CHECKOUT_NOT_AVAILABLE"
            com.facebookpay.expresscheckout.models.CheckoutResponse r2 = new com.facebookpay.expresscheckout.models.CheckoutResponse
            r2.<init>(r0, r0, r3, r4)
            X.56r r2 = X.C880856r.A04(r2)
        L_0x0257:
            java.lang.Object r2 = r2.A08()
            r11.A0H(r2)
            goto L_0x0092
        L_0x0260:
            if (r31 == 0) goto L_0x026b
            com.facebookpay.expresscheckout.handler.ECPHandler r3 = r4.A00
            X.7Kx r2 = X.AnonymousClass7Kx.A0A(r17)
            r3.Cqk(r2)
        L_0x026b:
            X.0m7 r3 = r4.A01
            androidx.fragment.app.IDxLCallbacksShape42S0100000_2_I2 r2 = new androidx.fragment.app.IDxLCallbacksShape42S0100000_2_I2
            r2.<init>(r4, r10)
            r3.A0u(r2, r10)
            X.066 r2 = r4.A02
            androidx.lifecycle.LifecycleCoroutineScopeImpl r10 = X.AnonymousClass067.A00(r2)
            X.EgD r3 = X.C121437Gd.A00()
            com.facebookpay.expresscheckout.checkouthelper.ECPCheckoutHelper$showCheckoutBottomSheet$2 r2 = new com.facebookpay.expresscheckout.checkouthelper.ECPCheckoutHelper$showCheckoutBottomSheet$2
            r24 = r16
            r25 = r0
            r26 = r12
            r27 = r18
            r28 = r6
            r30 = r0
            r31 = r5
            r17 = r0
            r18 = r13
            r19 = r15
            r20 = r8
            r21 = r9
            r23 = r7
            r15 = r2
            r16 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.C25237DiI.A00(r0, r3, r2, r10, r14)
            com.facebookpay.expresscheckout.handler.ECPHandler r2 = r4.A00
            X.M5J r2 = r2.ACm()
            goto L_0x0257
        L_0x02ab:
            r6 = r0
            goto L_0x021b
        L_0x02ae:
            X.6uD r2 = r1.A00
            X.M5J r3 = r2.A02(r13, r12)
            androidx.fragment.app.FragmentActivity r2 = r1.A0P
            r3.A0C(r2, r7)
            goto L_0x0092
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.offsite.base.CheckoutHandler.A05(com.facebookpay.expresscheckout.models.ECPPaymentRequest, com.facebookpay.expresscheckout.models.TransactionInfo, com.facebookpay.offsite.base.CheckoutHandler, com.facebookpay.offsite.models.message.PaymentRequest, java.lang.String, java.lang.String):void");
    }

    public static final void A06(CheckoutHandler checkoutHandler) {
        AnonymousClass7Kx.A0J(checkoutHandler.A0T, (Object) null);
        checkoutHandler.A0S.A0H((Object) null);
        checkoutHandler.A0Q.A0H((Object) null);
        checkoutHandler.A0R.A0H((Object) null);
        checkoutHandler.A0B = null;
        checkoutHandler.A0H();
    }

    public static final void A09(CheckoutHandler checkoutHandler, String str, String str2, Map map, Map map2) {
        C880856r r1 = checkoutHandler.A0R;
        String A0y = C86124wJ.A0y(C128557jn.A08);
        String str3 = checkoutHandler.A0E;
        if (str3 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String A0f = C18240wQ.A0f(str2, (AbstractMap) AnonymousClass6XV.A00.getValue());
            if (A0f == null) {
                A0f = AnonymousClass000.A00(267);
            }
            r1.A0H(new PaymentResponse(A0y, str3, (PaymentResponseContent) null, currentTimeMillis, str, MessageType$Companion.PAYMENT_RESPONSE, new PaymentError(str2, A0f)));
            if (map != null) {
                map.put("ERROR_CODE", str2);
                AnonymousClass68R r3 = AnonymousClass68R.CLIENT_LOAD_OFFSITEPAYMENTREQUEST_FAIL;
                Map A0G2 = checkoutHandler.A0G("CLIENT_LOAD_OFFSITEPAYMENTREQUEST_FAIL");
                if (map2 != null) {
                    Iterator A0z = AnonymousClass0wJ.A0z(A0G2);
                    while (A0z.hasNext()) {
                        Map.Entry A0o = C18180wK.A0o(A0z);
                        map2.put(A0o.getKey(), A0o.getValue());
                    }
                } else {
                    map.put("EVENT_EXTRA", A0G2);
                }
                checkoutHandler.A0I(r3, map);
                return;
            }
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final void A0A(CheckoutHandler checkoutHandler, String str, Map map) {
        if (checkoutHandler.A0Z) {
            AnonymousClass7JJ.A01().Bb8(str, map);
        }
    }

    public static final boolean A0B(CheckoutHandler checkoutHandler) {
        if (checkoutHandler.A06 == null || checkoutHandler.A08 == null || checkoutHandler.A07 == null || checkoutHandler.A04 == null || checkoutHandler.A03 == null) {
            return false;
        }
        return true;
    }

    public final C146668mf A0C() {
        C146668mf r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C04220Ms.A0E("selectedProductConfig");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0D(X.C880856r r27, com.facebookpay.offsite.models.message.PaymentRequest r28, X.C115316ur r29, java.util.List r30, java.util.Map r31, java.util.Map r32, X.C146958n9 r33) {
        /*
            r26 = this;
            r3 = r28
            r4 = r27
            r5 = r29
            r6 = r31
            r7 = r32
            r12 = 0
            r8 = r33
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0801000_I2.A00(r12, r8)
            r13 = r26
            if (r0 == 0) goto L_0x0188
            r11 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape0S0801000_I2 r11 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0801000_I2) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0188
            int r2 = r2 - r1
            r11.A00 = r2
        L_0x0023:
            java.lang.Object r14 = r11.A07
            X.D0E r10 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r11.A00
            java.lang.String r18 = "Required value was null."
            r16 = 0
            r9 = 1
            r8 = 2
            if (r0 == 0) goto L_0x011f
            if (r0 != r9) goto L_0x0199
            java.lang.Object r7 = r11.A06
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r6 = r11.A05
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r5 = r11.A04
            X.6ur r5 = (X.C115316ur) r5
            java.lang.Object r4 = r11.A03
            X.56r r4 = (X.C880856r) r4
            java.lang.Object r3 = r11.A02
            com.facebookpay.offsite.models.message.PaymentRequest r3 = (com.facebookpay.offsite.models.message.PaymentRequest) r3
            java.lang.Object r10 = r11.A01
            com.facebookpay.offsite.base.CheckoutHandler r10 = (com.facebookpay.offsite.base.CheckoutHandler) r10
            X.AnonymousClass0OU.A00(r14)
        L_0x004e:
            X.7Kx r14 = (X.AnonymousClass7Kx) r14
            X.7AE r0 = A02(r10)
            r0.A01 = r3
            X.7AE r0 = A02(r10)
            r0.A04 = r14
            X.68R r2 = X.AnonymousClass68R.CLIENT_LOAD_OFFSITEAVAILABILITY_FAIL
            X.67Q r0 = r14.A00
            if (r0 != 0) goto L_0x0119
            r0 = -1
        L_0x0063:
            java.lang.String r1 = "NOT_AVAILABLE"
            if (r0 == r8) goto L_0x00e6
            java.lang.String r17 = "ERROR_CODE"
            if (r0 == r9) goto L_0x010e
            if (r0 != r12) goto L_0x0194
            java.lang.Object r11 = r14.A01
            com.facebookpay.expresscheckout.models.CheckoutAvailability r11 = (com.facebookpay.expresscheckout.models.CheckoutAvailability) r11
            if (r11 == 0) goto L_0x018f
            X.6ly r8 = r11.A00
            com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl r0 = r8.A00
            r18 = r0
            X.7AE r16 = A02(r10)
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r13 = X.AnonymousClass7JJ.A02()
            com.google.common.collect.ImmutableList r0 = X.AnonymousClass69P.A00(r18)
            X.C04220Ms.A06(r0)
            java.util.Set r12 = X.C122157Kv.A0N(r0)
            X.1ze r15 = X.C29991ze.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r14 = "request_fields"
            r0 = r18
            com.google.common.collect.ImmutableList r0 = r0.getEnumList(r14, r15)
            X.C04220Ms.A06(r0)
            java.util.Set r14 = X.C122157Kv.A0O(r0)
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r3.content
            java.lang.String r0 = X.AnonymousClass6IW.A00(r0)
            boolean r0 = r13.A0A(r0, r12, r14)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            r0 = r16
            r0.A05 = r12
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r12 = X.AnonymousClass7JJ.A02()
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r3.content
            java.lang.String r0 = X.AnonymousClass6IW.A00(r0)
            com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields r0 = r12.A04(r0)
            r10.A01 = r0
            java.lang.String r11 = r11.A01
            if (r11 == 0) goto L_0x00c9
            X.7AE r0 = A02(r10)
            r0.A06 = r11
        L_0x00c9:
            X.8mf r0 = r10.A0C()
            boolean r0 = r0.B3a()
            if (r0 == 0) goto L_0x0111
            com.facebook.graphql.impls.FBPayECPAvailabilityImpl r8 = r8.A01
            java.lang.String r0 = "is_ecp_available"
            boolean r0 = r8.getBooleanValue(r0)
            if (r0 != r9) goto L_0x0111
            A08(r10, r5, r7)
            X.68R r2 = X.AnonymousClass68R.CLIENT_LOAD_OFFSITEAVAILABILITY_SUCCESS
            r10.A0I = r9
            java.lang.String r16 = "AVAILABLE"
        L_0x00e6:
            r1 = r16
        L_0x00e8:
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r5 = X.AnonymousClass7JJ.A02()
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r3.content
            java.lang.String r0 = X.AnonymousClass6IW.A00(r0)
            boolean r0 = r5.A09(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "CACHE_AVAILABLE"
            r6.put(r0, r5)
            if (r1 == 0) goto L_0x010b
            if (r4 == 0) goto L_0x0108
            java.lang.String r0 = r3.msgId
            A04(r4, r10, r1, r0)
        L_0x0108:
            r10.A0I(r2, r6)
        L_0x010b:
            kotlin.Unit r10 = kotlin.Unit.A00
        L_0x010d:
            return r10
        L_0x010e:
            java.lang.String r5 = "UNKNOWN"
            goto L_0x0113
        L_0x0111:
            java.lang.String r5 = "AVAILABILITY_PRODUCT_VERIFICATION"
        L_0x0113:
            r0 = r17
            r7.put(r0, r5)
            goto L_0x00e8
        L_0x0119:
            int r0 = r0.ordinal()
            goto L_0x0063
        L_0x011f:
            X.AnonymousClass0OU.A00(r14)
            java.lang.String r2 = r13.A0B
            if (r2 == 0) goto L_0x019e
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r3.content
            java.lang.String r21 = X.AnonymousClass6IW.A00(r0)
            X.7AE r0 = A02(r13)
            java.lang.String r15 = r0.A06
            X.8mf r0 = r13.A0C()
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = X.AnonymousClass6IT.A00(r0, r3)
            if (r0 == 0) goto L_0x0160
            java.lang.String r1 = r0.A02
        L_0x013e:
            com.facebookpay.offsite.models.message.PaymentRequestContent r0 = r3.content
            com.facebookpay.offsite.models.message.PaymentConfiguration r0 = r0.paymentConfiguration
            com.facebookpay.offsite.models.message.PaymentMode r0 = r0.mode
            if (r0 == 0) goto L_0x0163
            java.lang.String r14 = r0.toString()
            X.C04220Ms.A0B(r14, r12)
            java.util.Map r0 = X.C971368b.A01
            java.lang.Object r0 = r0.get(r14)
            if (r0 != 0) goto L_0x0163
            java.lang.String r0 = "PaymentEnv is not found for identifier => "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r14)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0160:
            r1 = r16
            goto L_0x013e
        L_0x0163:
            r11.A01 = r13
            r11.A02 = r3
            r11.A03 = r4
            r11.A04 = r5
            r11.A05 = r6
            r11.A06 = r7
            r11.A00 = r9
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r19 = X.AnonymousClass7JJ.A02()
            r24 = r30
            r25 = r11
            r20 = r2
            r22 = r15
            r23 = r1
            java.lang.Object r14 = r19.A08(r20, r21, r22, r23, r24, r25)
            if (r14 == r10) goto L_0x010d
            r10 = r13
            goto L_0x004e
        L_0x0188:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0801000_I2 r11 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0801000_I2
            r11.<init>(r13, r8, r12)
            goto L_0x0023
        L_0x018f:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r18)
            throw r0
        L_0x0194:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0199:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x019e:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.offsite.base.CheckoutHandler.A0D(X.56r, com.facebookpay.offsite.models.message.PaymentRequest, X.6ur, java.util.List, java.util.Map, java.util.Map, X.8n9):java.lang.Object");
    }

    public final String A0E() {
        String str = this.A06;
        if (str != null) {
            return str;
        }
        C04220Ms.A0E("availabilityRequestDomain");
        throw null;
    }

    public final Map A0F(PaymentRequest paymentRequest, C115316ur r11) {
        PaymentRequestContent paymentRequestContent = paymentRequest.content;
        String A032 = A03(this);
        String str = this.A0B;
        if (str != null) {
            String str2 = paymentRequest.msgId;
            long j = paymentRequest.timeStamp;
            Map A0A2 = AnonymousClass4WJ.A0A();
            AnonymousClass0wJ.A1N(paymentRequestContent, A032);
            C04220Ms.A0B(str2, 3);
            LinkedHashMap A0y = C18220wO.A0y();
            C86134wK.A1S(str, A032, A0y);
            A0y.put("MERCHANT_REQUEST_ID", str2);
            A0y.put("PARTNER_MERCHANT_ID", paymentRequestContent.paymentConfiguration.partnerMerchantId);
            A0y.put("PARTNER_ID", paymentRequestContent.paymentConfiguration.partnerId);
            A0y.put("REQUEST_TIMESTAMP", Long.valueOf(j));
            A0y.put("EVENT_EXTRA", A0A2);
            String str3 = r11.A01;
            if (str3 != null) {
                A0y.put("AD_ID", str3);
            }
            return A0y;
        }
        throw AnonymousClass0wJ.A0b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006f, code lost:
        if (X.C63803iN.A0E(X.AnonymousClass0TJ.A06, r7.A06, 36317470361390858L) == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0099, code lost:
        if (X.C63803iN.A0E(X.AnonymousClass0TJ.A06, r7.A06, 36317470361784078L) == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0188, code lost:
        if (r1.A01 == null) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01f5, code lost:
        if (r1.equals("CLIENT_LOAD_OFFSITEPAYMENTREQUEST_FAIL") == false) goto L_0x01e0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A0G(java.lang.String r19) {
        /*
            r18 = this;
            r6 = r18
            X.5iw r6 = (X.C92615iw) r6
            r5 = 0
            r1 = r19
            X.C04220Ms.A0B(r1, r5)
            java.util.LinkedHashMap r4 = X.C18220wO.A0y()
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEAVAILABILITY_SUCCESS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01e7
            X.6ql r7 = r6.A02
            X.0Oa r8 = r7.A0A
            android.content.SharedPreferences r1 = X.C86154wM.A0B(r8)
            java.lang.String r0 = "awareness_prompt_show_count"
            int r9 = r1.getInt(r0, r5)
            long r2 = java.lang.System.currentTimeMillis()
            boolean r17 = r7.A00(r2)
            android.content.SharedPreferences r1 = X.C86154wM.A0B(r8)
            java.lang.String r0 = "awareness_prompt_last_time_shown_ms"
            long r15 = X.C18180wK.A05(r1, r0)
            X.7AE r0 = A02(r6)
            java.lang.Boolean r1 = r0.A05
            java.lang.String r13 = "AVAILABLE"
            boolean r0 = r13.equals(r13)
            r14 = 0
            if (r0 == 0) goto L_0x005e
            boolean r0 = X.C18190wL.A1Z(r1, r5)
            if (r0 == 0) goto L_0x005e
            boolean r0 = r7.A00(r2)
            if (r0 != 0) goto L_0x005e
            X.0Oa r0 = r7.A09
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            if (r9 >= r0) goto L_0x005e
            r14 = 1
        L_0x005e:
            r12 = 1
            if (r14 == 0) goto L_0x0071
            com.instagram.service.session.UserSession r10 = r7.A06
            X.0TJ r8 = X.AnonymousClass0TJ.A06
            r0 = 36317470361390858(0x81068c00080f0a, double:3.0306527230342325E-306)
            boolean r0 = X.C63803iN.A0E(r8, r10, r0)
            r11 = 1
            if (r0 != 0) goto L_0x0072
        L_0x0071:
            r11 = 0
        L_0x0072:
            boolean r0 = r13.equals(r13)
            if (r0 == 0) goto L_0x01e4
            boolean r0 = r7.A00(r2)
            if (r0 != 0) goto L_0x01e4
            X.0Oa r0 = r7.A09
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            r10 = 1
            if (r9 >= r0) goto L_0x01e4
            com.instagram.service.session.UserSession r3 = r7.A06
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 36317470361784078(0x81068c000e0f0e, double:3.0306527232829064E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            r8 = 1
            if (r0 != 0) goto L_0x009c
        L_0x009b:
            r8 = 0
        L_0x009c:
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "awarenessPromptShowCount"
            r4.put(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r17)
            java.lang.String r0 = "awarenessPromptCooldownActive"
            r4.put(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r15)
            java.lang.String r0 = "awarenessPromptCooldownStartTimeMs"
            r4.put(r0, r1)
            com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields r0 = r6.A01
            if (r0 == 0) goto L_0x01e1
            com.facebookpay.expresscheckout.models.DefaultCreditCardFields r1 = r0.A00
            if (r1 == 0) goto L_0x01e1
            X.69W r0 = r1.A00
            if (r0 == 0) goto L_0x01e1
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L_0x01e1
        L_0x00c7:
            java.lang.String r1 = java.lang.String.valueOf(r12)
            java.lang.String r0 = "awarenessPromptHasValidPaymentMethod"
            r4.put(r0, r1)
            com.instagram.service.session.UserSession r3 = r7.A06
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 36317470361390858(0x81068c00080f0a, double:3.0306527230342325E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "awarenessPromptPuxIsGKEnabled"
            r4.put(r0, r1)
            r0 = 36317470361784078(0x81068c000e0f0e, double:3.0306527232829064E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "awarenessPromptRebrandingIsGKEnabled"
            r4.put(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r14)
            java.lang.String r0 = "awarenessPromptPuxEligibleWithoutGK"
            r4.put(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r11)
            java.lang.String r0 = "awarenessPromptPuxEligibleWithGK"
            r4.put(r0, r1)
            r0 = 36317470362046226(0x81068c00120f12, double:3.03065272344869E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "awarenessPromptPuxCardMessageVariationEnabled"
            r4.put(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r10)
            java.lang.String r0 = "awarenessPromptRebrandingEligibleWithoutGK"
            r4.put(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "awarenessPromptRebrandingEligibleWithGK"
            r4.put(r0, r1)
        L_0x012e:
            long r8 = java.lang.System.currentTimeMillis()
            X.6sX r10 = r6.A01
            X.0Oa r3 = r10.A09
            android.content.SharedPreferences r0 = X.C86154wM.A0B(r3)
            java.lang.String r7 = "proactive_checkout_cooldown_start_time_ms"
            long r0 = X.C18180wK.A05(r0, r7)
            long r8 = r8 - r0
            X.0Oa r0 = r10.A04
            java.lang.Object r0 = r0.getValue()
            long r1 = X.C18190wL.A08(r0)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            boolean r9 = X.C86124wJ.A1X(r0)
            android.content.SharedPreferences r0 = X.C86154wM.A0B(r3)
            long r7 = X.C18180wK.A05(r0, r7)
            android.content.SharedPreferences r1 = X.C86154wM.A0B(r3)
            java.lang.String r0 = "proactive_checkout_should_stop_showing_banner"
            boolean r3 = r1.getBoolean(r0, r5)
            java.util.List r2 = r10.A00()
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "proactiveCheckoutCooldownActive"
            r4.put(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "proactiveCheckoutCooldownStartTimeMs"
            r4.put(r0, r1)
            com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields r0 = r6.A01
            if (r0 == 0) goto L_0x018a
            com.facebookpay.expresscheckout.models.DefaultCreditCardFields r1 = r0.A00
            if (r1 == 0) goto L_0x018a
            X.69W r0 = r1.A00
            if (r0 == 0) goto L_0x018a
            java.lang.String r1 = r1.A01
            r0 = 1
            if (r1 != 0) goto L_0x018b
        L_0x018a:
            r0 = 0
        L_0x018b:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "proactiveCheckoutHasValidPaymentMethod"
            r4.put(r0, r1)
            boolean r0 = r6.A0M
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "proactiveCheckoutShouldShowBanner"
            r4.put(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "proactiveCheckoutShouldStopShowingBanner"
            r4.put(r0, r1)
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            java.lang.String r1 = r0.A08(r2)
            X.C04220Ms.A06(r1)
            java.lang.String r0 = "proactiveCheckoutSessionList"
            r4.put(r0, r1)
            X.8mf r0 = r6.A0C()
            boolean r0 = r0.B0w()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "proactiveCheckoutIsGKEnabled"
            r4.put(r0, r1)
            boolean r0 = r6.A0K
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "proactiveCheckoutEligibleWithoutGK"
            r4.put(r0, r1)
            boolean r0 = r6.A0J
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "proactiveCheckoutEligibleWithGK"
            r4.put(r0, r1)
        L_0x01e0:
            return r4
        L_0x01e1:
            r12 = 0
            goto L_0x00c7
        L_0x01e4:
            r10 = 0
            goto L_0x009b
        L_0x01e7:
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTREQUEST_SUCCESS"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x012e
            java.lang.String r0 = "CLIENT_LOAD_OFFSITEPAYMENTREQUEST_FAIL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01e0
            goto L_0x012e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.offsite.base.CheckoutHandler.A0G(java.lang.String):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        if (r2.equals(r0) == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J(com.facebookpay.offsite.models.message.PaymentRequestContent r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.A0B
            if (r0 == 0) goto L_0x003d
            boolean r0 = A0B(r3)
            if (r0 == 0) goto L_0x0044
            java.lang.String r2 = r3.A07
            r0 = 0
            if (r2 != 0) goto L_0x0015
            java.lang.String r1 = "availabilityRequestMerchantId"
            X.C04220Ms.A0E(r1)
            throw r0
        L_0x0015:
            if (r4 == 0) goto L_0x002d
            com.facebookpay.offsite.models.message.PaymentConfiguration r1 = r4.paymentConfiguration
            if (r1 == 0) goto L_0x002d
            java.lang.String r1 = r1.partnerMerchantId
        L_0x001d:
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x003d
            java.lang.String r2 = r3.A08
            if (r2 != 0) goto L_0x002f
            java.lang.String r1 = "availabilityRequestPartnerId"
            X.C04220Ms.A0E(r1)
            throw r0
        L_0x002d:
            r1 = r0
            goto L_0x001d
        L_0x002f:
            if (r4 == 0) goto L_0x0037
            com.facebookpay.offsite.models.message.PaymentConfiguration r1 = r4.paymentConfiguration
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = r1.partnerId
        L_0x0037:
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0044
        L_0x003d:
            java.lang.String r0 = X.C122037Js.A01()
        L_0x0041:
            r3.A0B = r0
            return
        L_0x0044:
            java.lang.String r0 = r3.A0B
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.offsite.base.CheckoutHandler.A0J(com.facebookpay.offsite.models.message.PaymentRequestContent):void");
    }

    public CheckoutHandler(Fragment fragment, FragmentActivity fragmentActivity, C110766mE r5, C114006sX r6, boolean z) {
        this.A0O = fragment;
        this.A0P = fragmentActivity;
        this.A0Z = z;
        this.A0W = r6;
        this.A0V = r5;
        C128137iw r1 = new C128137iw(this);
        this.A0U = r1;
        AnonymousClass7Kz.A05();
        this.A00 = new C114966uD(fragment, fragmentActivity);
        this.A0a = new C110996mc(fragment, fragmentActivity, r1);
        this.A05 = AnonymousClass4x8.A00(fragmentActivity);
    }

    public static final C969767l A00() {
        List<C969767l> list;
        FBPayCheckoutScreenConfigImpl fBPayCheckoutScreenConfigImpl;
        TreeJNI treeValue;
        C110336lW r0 = AnonymousClass7JJ.A02().A01;
        if (r0 == null || (fBPayCheckoutScreenConfigImpl = r0.A00) == null || (treeValue = fBPayCheckoutScreenConfigImpl.getTreeValue("ecp_banner_config", FBPayCheckoutScreenConfigImpl.EcpBannerConfig.class)) == null || (list = treeValue.getEnumList("nux", C969767l.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) == null) {
            list = C18180wK.A0n(C969767l.META_PAY_BANNER);
        }
        C969767l r3 = null;
        for (C969767l ordinal : list) {
            if (ordinal.ordinal() == 4) {
                r3 = C969767l.META_PAY_BANNER;
            }
        }
        return r3;
    }

    public static final C969767l A01(boolean z) {
        List<C969767l> list;
        FBPayCheckoutScreenConfigImpl fBPayCheckoutScreenConfigImpl;
        TreeJNI treeValue;
        C110336lW r0 = AnonymousClass7JJ.A02().A01;
        if (r0 == null || (fBPayCheckoutScreenConfigImpl = r0.A00) == null || (treeValue = fBPayCheckoutScreenConfigImpl.getTreeValue("ecp_banner_config", FBPayCheckoutScreenConfigImpl.EcpBannerConfig.class)) == null) {
            list = null;
        } else {
            list = treeValue.getEnumList("pux", C969767l.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        }
        if (list == null) {
            list = C06750aI.A17(C969767l.CREDENTIAL_ACQUISITION_SOURCE_BANNER, C969767l.PROACTIVE_CHECKOUT_BANNER);
        }
        C969767l r2 = null;
        for (C969767l ordinal : list) {
            if (ordinal.ordinal() == 6 && z) {
                r2 = C969767l.PROACTIVE_CHECKOUT_BANNER;
            }
        }
        return r2;
    }

    public static AnonymousClass7AE A02(CheckoutHandler checkoutHandler) {
        return checkoutHandler.A0C().AXJ();
    }

    public static String A03(CheckoutHandler checkoutHandler) {
        return checkoutHandler.A0C().B3n();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r0.A01 == null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r5 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006f, code lost:
        if (r10.A0C().B0w() == false) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C880856r r9, com.facebookpay.offsite.base.CheckoutHandler r10, java.lang.String r11, java.lang.String r12) {
        /*
            long r6 = java.lang.System.currentTimeMillis()
            X.6sX r4 = r10.A0W
            com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields r2 = r10.A01
            X.8mf r0 = r10.A0C()
            boolean r1 = r0.B7d()
            X.7AE r0 = A02(r10)
            X.6ur r0 = r0.A03
            if (r0 == 0) goto L_0x0095
            java.lang.String r5 = r0.A01
        L_0x001a:
            r8 = 0
            if (r2 == 0) goto L_0x0093
            com.facebookpay.expresscheckout.models.DefaultCreditCardFields r0 = r2.A00
            if (r0 == 0) goto L_0x0093
            X.69W r0 = r0.A00
        L_0x0023:
            r3 = 0
            if (r0 == 0) goto L_0x002f
            com.facebookpay.expresscheckout.models.DefaultCreditCardFields r0 = r2.A00
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = r0.A01
            r2 = 1
            if (r0 != 0) goto L_0x0030
        L_0x002f:
            r2 = 0
        L_0x0030:
            if (r1 == 0) goto L_0x0035
            r1 = 0
            if (r5 == 0) goto L_0x0036
        L_0x0035:
            r1 = 1
        L_0x0036:
            java.lang.String r0 = "AVAILABLE"
            boolean r0 = X.C04220Ms.A0I(r11, r0)
            if (r0 == 0) goto L_0x0062
            if (r2 == 0) goto L_0x0062
            if (r1 == 0) goto L_0x0062
            X.0Oa r0 = r4.A09
            android.content.SharedPreferences r1 = X.C86154wM.A0B(r0)
            java.lang.String r0 = "proactive_checkout_cooldown_start_time_ms"
            long r0 = X.C18180wK.A05(r1, r0)
            long r6 = r6 - r0
            X.0Oa r0 = r4.A04
            java.lang.Object r0 = r0.getValue()
            long r1 = X.C18190wL.A08(r0)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            boolean r0 = X.C86124wJ.A1X(r0)
            if (r0 != 0) goto L_0x0062
            r3 = 1
        L_0x0062:
            r10.A0K = r3
            if (r3 == 0) goto L_0x0071
            X.8mf r0 = r10.A0C()
            boolean r1 = r0.B0w()
            r0 = 1
            if (r1 != 0) goto L_0x0072
        L_0x0071:
            r0 = 0
        L_0x0072:
            r10.A0J = r0
            java.util.concurrent.atomic.AtomicLong r0 = X.C128557jn.A08
            java.lang.String r2 = X.C86124wJ.A0y(r0)
            boolean r1 = r10.A0K
            java.lang.String r0 = r10.A0F
            com.facebookpay.offsite.models.message.AvailableMessageContent r3 = new com.facebookpay.offsite.models.message.AvailableMessageContent
            r3.<init>(r11, r1, r0)
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = "fbpayAvailableResponse"
            com.facebookpay.offsite.models.message.AvailabilityResponse r1 = new com.facebookpay.offsite.models.message.AvailabilityResponse
            r6 = r12
            r1.<init>(r2, r3, r4, r6, r7, r8)
            r9.A0H(r1)
            return
        L_0x0093:
            r0 = r8
            goto L_0x0023
        L_0x0095:
            r5 = 0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.offsite.base.CheckoutHandler.A04(X.56r, com.facebookpay.offsite.base.CheckoutHandler, java.lang.String, java.lang.String):void");
    }

    public static final void A07(CheckoutHandler checkoutHandler) {
        ECPPaymentResponseParams eCPPaymentResponseParams = A02(checkoutHandler).A00;
        if (A0B(checkoutHandler) && eCPPaymentResponseParams != null) {
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape15S0201000_I2_1((Object) checkoutHandler, (Object) eCPPaymentResponseParams, (C146958n9) null, 2), C121437Gd.A01(), 3);
        }
    }

    public static final void A08(CheckoutHandler checkoutHandler, C115316ur r3, Map map) {
        map.put("isNuxUser", String.valueOf(A02(checkoutHandler).A05));
        map.put("clickSourceFromIAW", r3.A00);
        Map map2 = r3.A04;
        if (map2 != null) {
            map.putAll(map2);
        }
        map.putAll(checkoutHandler.A0G("CLIENT_LOAD_OFFSITEAVAILABILITY_SUCCESS"));
    }
}
