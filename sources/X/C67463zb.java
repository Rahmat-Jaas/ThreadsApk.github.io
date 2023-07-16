package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import java.util.List;
import java.util.Map;

/* renamed from: X.3zb  reason: invalid class name and case insensitive filesystem */
public final class C67463zb implements C33366HmR {
    public final GQLCallInputCInputShape0S0000000 A00 = GraphQlCallInput.A00();

    public static C67463zb A00() {
        return new C67463zb();
    }

    public static void A01(GraphQlCallInput graphQlCallInput, C67463zb r2) {
        r2.A02(graphQlCallInput, "input");
    }

    public final void A02(GraphQlCallInput graphQlCallInput, String str) {
        if (graphQlCallInput != null) {
            this.A00.A06().A0D(graphQlCallInput.A06(), str);
        }
    }

    public final void A03(String str, Boolean bool) {
        if (bool != null) {
            GraphQlCallInput.A05(this.A00, bool, str);
        }
    }

    public final void A04(String str, Number number) {
        if (number != null) {
            GraphQlCallInput.A05(this.A00, number, str);
        }
    }

    public final void A05(String str, String str2) {
        if (str2 != null) {
            GraphQlCallInput.A05(this.A00, str2, str);
        }
    }

    public final void A06(String str, List list) {
        if (list != null) {
            this.A00.A0A(str, list);
        }
    }

    public final Map getParamsCopy() {
        return GraphQlCallInput.A03(this);
    }
}
