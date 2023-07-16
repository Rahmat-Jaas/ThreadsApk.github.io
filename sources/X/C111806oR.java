package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.6oR  reason: invalid class name and case insensitive filesystem */
public final class C111806oR {
    public final C04530Oa A00 = AnonymousClass0OY.A02(C138078Gc.A00);

    public final C145388kQ A00(C113806sA r5, GQLCallInputCInputShape1S0000000 gQLCallInputCInputShape1S0000000, String str) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r5, gQLCallInputCInputShape1S0000000);
        C04220Ms.A0B(str, 2);
        try {
            C126697ff r2 = (C126697ff) C86104wH.A0p("create", C116246wf.class);
            C67463zb r1 = r2.A00;
            C67463zb.A01(gQLCallInputCInputShape1S0000000, r1);
            r2.A02 = A1Z;
            r1.A05("payment_product_id", str);
            r2.A03 = A1Z;
            return AnonymousClass6BW.A00(r5, (FBPayIGGraphQLQueryExecutor) this.A00.getValue(), r2.AB4(), AnonymousClass7nA.A00);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C86114wI.A0k(e);
        }
    }
}
