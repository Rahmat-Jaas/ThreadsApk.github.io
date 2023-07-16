package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebookpay.otc.models.OtcInput;

/* renamed from: X.6xr  reason: invalid class name and case insensitive filesystem */
public final class C116936xr {
    public static final GQLCallInputCInputShape0S0000000 A00(OtcInput otcInput) {
        if (otcInput == null) {
            return null;
        }
        GQLCallInputCInputShape0S0000000 A00 = GraphQlCallInput.A00();
        A00.A0F(otcInput.A00, "otc_session_id");
        A00.A0F(otcInput.A01, "otc_type");
        return A00;
    }

    public static void A01(GQLCallInputCInputShape1S0000000 gQLCallInputCInputShape1S0000000, OtcInput otcInput) {
        gQLCallInputCInputShape1S0000000.A0D(String.valueOf(AnonymousClass73F.A00.getAndIncrement()), "client_mutation_id");
        gQLCallInputCInputShape1S0000000.A0B(A00(otcInput), "one_time_checkout_input");
        String str = AnonymousClass7Kz.A05().A0G;
        if (str != null && !AnonymousClass8bQ.A0n(str)) {
            gQLCallInputCInputShape1S0000000.A0D(str, "actor_id");
        }
    }
}
