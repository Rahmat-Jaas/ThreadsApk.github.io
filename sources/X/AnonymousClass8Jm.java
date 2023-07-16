package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.redex.IDxFunctionShape148S0300000_2_I2;
import com.instagram.graphql.instagramschemagraphservices.GetEncryptedCardNumberResponseImpl;
import kotlin.Unit;

/* renamed from: X.8Jm  reason: invalid class name */
public final class AnonymousClass8Jm extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ C129017kq A00;
    public final /* synthetic */ C111826oU A01;
    public final /* synthetic */ C93015kU A02;
    public final /* synthetic */ C121577Gw A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Jm(C129017kq r2, C111826oU r3, C93015kU r4, C121577Gw r5, String str, String str2, String str3, String str4) {
        super(1);
        this.A04 = str;
        this.A05 = str2;
        this.A02 = r4;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass7E9 r1 = (AnonymousClass7E9) obj;
        C04220Ms.A0B(r1, 0);
        GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
        A002.A0F(this.A04, "credit_card_id");
        GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
        A003.A0F(this.A05, "sensitive_string_value");
        A002.A0B(A003, "csc");
        C93015kU r6 = this.A02;
        A002.A0F(r6.A01(), "device_key_pub");
        A002.A0F(r1.A01(), "encryption_key_pub");
        String str = this.A06;
        if (str == null) {
            str = AnonymousClass7E9.A00(r6, r1.A01.getPublic().getEncoded());
        }
        A002.A0F(str, "encryption_key_signature");
        String str2 = this.A07;
        if (str2 != null) {
            GQLCallInputCInputShape0S0000000 A004 = GraphQlCallInput.A00();
            A004.A0F(str2, "sensitive_string_value");
            A002.A0B(A004, "platform_trust_token");
        }
        C67463zb A005 = C67463zb.A00();
        C67463zb A006 = C67463zb.A00();
        C67463zb.A01(A002, A005);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C63233h2.A01(), "GetEncryptedCardNumber", A005.getParamsCopy(), A006.getParamsCopy(), GetEncryptedCardNumberResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "autofill_encrypted_credit_card");
        C121577Gw r62 = this.A03;
        C31580Grx grx = r62.A00;
        C129017kq r4 = this.A00;
        C111826oU r3 = this.A01;
        new C92935kG(grx, pandoGraphQLRequest, new IDxFunctionShape148S0300000_2_I2(0, r4, r3, r1), new IDxFunctionShape148S0300000_2_I2(1, r3, r62, r4));
        return Unit.A00;
    }
}
