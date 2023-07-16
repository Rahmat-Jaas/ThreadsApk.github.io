package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.redex.IDxPObserverShape674S0100000_2_I2;
import com.instagram.common.task.IDxLTaskShape29S0300000_2_I2;
import com.instagram.fbpay.hub.contactinfo.graphql.IGFBPayShareableContactInfoQueryResponseImpl;
import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;

/* renamed from: X.6mq  reason: invalid class name and case insensitive filesystem */
public final class C111136mq {
    public C145388kQ A00;
    public final C145388kQ A01;
    public final C145388kQ A02;
    public final C145388kQ A03;
    public final C143718hC A04 = new IDxPObserverShape674S0100000_2_I2(this, 4);
    public final C556434a A05;
    public final IGPaymentMethodsAPI A06;
    public final C121577Gw A07;
    public final C92945kH A08 = new C92945kH(this);

    public C111136mq(C111576nu r18, AnonymousClass34Z r19, C556434a r20, IGPaymentMethodsAPI iGPaymentMethodsAPI, C121577Gw r22) {
        this.A05 = r20;
        this.A07 = r22;
        IGPaymentMethodsAPI iGPaymentMethodsAPI2 = iGPaymentMethodsAPI;
        C04220Ms.A0B(iGPaymentMethodsAPI2, 0);
        C31155GhB.A03(new IDxLTaskShape29S0300000_2_I2(1, (Object) null, iGPaymentMethodsAPI2, C18250wR.A0c(C969867m.CREDIT_CARD)));
        this.A02 = C99246Ir.A00(iGPaymentMethodsAPI2.A01, AnonymousClass8NE.A00);
        this.A03 = C99246Ir.A00(new C92935kG(r19.A00, new PandoGraphQLRequest(C63233h2.A01(), "IGFBPayShareableContactInfoQuery", GraphQlCallInput.A00().A07(), GraphQlCallInput.A00().A07(), IGFBPayShareableContactInfoQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, (String) null), C103626Zx.A01, C103226Yh.A00), C86164wN.A0s(this, 15));
        this.A01 = C99246Ir.A00(r18.A00((C113806sA) null), AnonymousClass8ND.A00);
        this.A06 = iGPaymentMethodsAPI2;
    }
}
