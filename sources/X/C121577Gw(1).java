package X;

import com.facebook.endtoend.EndToEnd;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.redex.IDxCallableShape274S0100000_5_I2;
import com.facebook.redex.IDxContinuationShape526S0100000_5_I2;
import com.facebook.redex.IDxFunctionShape243S0200000_2_I2;
import com.facebook.redex.IDxFunctionShape362S0100000_2_I2;
import com.facebook.redex.IDxObserverShape8S1300000_2_I2;
import com.facebook.redex.IDxSCallbackShape852S0100000_2_I2;
import com.fbpay.w3c.security.SecurityProviderEphemeral;
import com.instagram.graphql.instagramschemagraphservices.BindCreditCardResponseImpl;
import com.instagram.service.session.UserSession;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1;

/* renamed from: X.7Gw  reason: invalid class name and case insensitive filesystem */
public final class C121577Gw {
    public final C31580Grx A00;
    public final UserSession A01;

    public C121577Gw(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AnonymousClass3WK.A01(userSession);
    }

    public final C145388kQ A03(String str, String str2) {
        String str3 = str2;
        C04220Ms.A0B(str3, 1);
        C129017kq r3 = new C129017kq();
        String str4 = str;
        if (C63803iN.A0E(AnonymousClass0TJ.A06, AnonymousClass7HK.A00(), 36310512516726905L)) {
            C93015kU r2 = new C93015kU(this.A01.getUserId());
            String A012 = r2.A01();
            String A0X = AnonymousClass00U.A0X("proof.", A012, str3, '.');
            LinkedHashMap A0y = C18220wO.A0y();
            A0y.put("cred_id", str4);
            A0y.put("secret_and_key", A0X);
            A0y.put("device_key", A012);
            HashSet A0u = C18200wM.A0u();
            A0u.add("secret_and_key");
            AnonymousClass7HL A002 = AnonymousClass76O.A00();
            M5J A003 = C92975kL.A00(C120977Dl.A00(new IDxSCallbackShape852S0100000_2_I2(A002, 1), new C107406gh(A0y, A0u), "SEND_E2EE_DATA", (String) null, (String) null, (String) null, (String) null, AnonymousClass4WJ.A0A(), (Set) null));
            C04220Ms.A06(A003);
            AnonymousClass7Kx.A0H(A003, new IDxObserverShape8S1300000_2_I2(r3, this, r2, str4, 3));
            return r3;
        }
        GXN gxn = new GXN();
        gxn.A05(I17.A00(308), AnonymousClass00U.A0X("proof.", new C93015kU(this.A01.getUserId()).A01(), str3, '.'));
        C32165H8c A004 = A00(gxn);
        A004.A00 = new C95015yd(r3, this, new KtLambdaShape4S1200000_I2_1(r3, this, str4, 16));
        C31155GhB.A03(A004);
        return r3;
    }

    public static final void A01(C129017kq r2, C111826oU r3, C93015kU r4, C121577Gw r5, String str, String str2, String str3, String str4) {
        if (r4 == null) {
            r4 = new C93015kU(r5.A01.getUserId());
        }
        if (r3 == null) {
            r3 = (C111826oU) ((AnonymousClass8HI) SecurityProviderEphemeral.A00).invoke();
        }
        AnonymousClass8Jm r1 = new AnonymousClass8Jm(r2, r3, r4, r5, str, str2, str3, str4);
        synchronized (r3) {
            r1.invoke(r3.A00);
        }
    }

    public static final void A02(C129017kq r17, C93015kU r18, C121577Gw r19, String str, String str2, String str3) {
        C121577Gw r4 = r19;
        C93015kU r1 = r18;
        if (r18 == null) {
            r1 = new C93015kU(r4.A01.getUserId());
        }
        String A012 = r1.A01();
        GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
        A0L.A0D(str, "credit_card_id");
        A0L.A0D(A012, "device_key_pub");
        GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
        A002.A0F(str2, "sensitive_string_value");
        A0L.A0B(A002, "partner_api_secret");
        String str4 = str3;
        if (str3 != null) {
            GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
            A003.A0F(str4, "sensitive_string_value");
            A0L.A0B(A003, "platform_trust_token");
        }
        C67463zb A004 = C67463zb.A00();
        C67463zb A005 = C67463zb.A00();
        C67463zb.A01(A0L, A004);
        C129017kq r5 = r17;
        new C92935kG(r4.A00, new PandoGraphQLRequest(C63233h2.A01(), "BindCreditCard", A004.getParamsCopy(), A005.getParamsCopy(), BindCreditCardResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 64, (String) null, "add_credit_card_proof_to_autofill"), new IDxFunctionShape362S0100000_2_I2(r5, 13), new IDxFunctionShape243S0200000_2_I2(2, r5, r4));
    }

    public static final C32165H8c A00(GXN gxn) {
        if (EndToEnd.isRunningEndToEndTest() || EndToEnd.A02()) {
            gxn.A05("payment_dev_cycle", "test");
        }
        return new C32165H8c(new FR3(new IDxCallableShape274S0100000_5_I2((Object) gxn, 53), 747).A02(new IDxContinuationShape526S0100000_5_I2((Object) null, 3), 747, 2, true, false).A02(C132587uA.A00, 748, 2, false, false), C28174Ezk.A00(421), C28174Ezk.A00(21));
    }
}
