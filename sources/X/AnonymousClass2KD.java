package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2;

/* renamed from: X.2KD  reason: invalid class name */
public final class AnonymousClass2KD {
    public static final GQLCallInputCInputShape0S0000000 A00(KtCSuperShape0S4100000_I2 ktCSuperShape0S4100000_I2, C81354ne r7) {
        String str = ((CallerContext) ktCSuperShape0S4100000_I2.A00).A02;
        C04220Ms.A06(str);
        GQLCallInputCInputShape0S0000000 A00 = GraphQlCallInput.A00();
        GraphQlCallInput.A05(A00, str, "caller");
        GraphQlCallInput.A05(A00, "function_credential", "function_credential");
        GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
        GraphQlCallInput.A05(A002, "1L1D", "key");
        A002.A0B(A00, "caller_context");
        if (r7 instanceof C210618t) {
            GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
            GQLCallInputCInputShape0S0000000 A004 = GraphQlCallInput.A00();
            GraphQlCallInput.A05(A004, "token", "sensitive_string_value");
            A003.A0B(A004, "facebook_token_auth_from_cal");
            GraphQlCallInput.A05(A003, false, "fallback_to_business_person");
            A002.A0B(A003, "fb_token_auth");
        }
        return A002;
    }
}
