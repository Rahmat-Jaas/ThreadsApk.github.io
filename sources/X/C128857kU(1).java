package X;

import android.util.SparseArray;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.instagram.service.session.UserSession;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.7kU  reason: invalid class name and case insensitive filesystem */
public final class C128857kU implements C145368kO {
    public final UserSession A00;

    public final C145388kQ Cc3(SparseArray sparseArray, C113806sA r8) {
        String userId = this.A00.getUserId();
        String A0m = C86114wI.A0m(sparseArray, 22);
        McB mcB = C103226Yh.A00;
        GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
        A0L.A0D((String) C86124wJ.A0k(sparseArray, 12), "phone_id");
        C86154wM.A1M(A0L);
        A0L.A0D(C18230wP.A0h(), "client_mutation_id");
        if (userId != null) {
            A0L.A0D(userId, "actor_id");
        }
        if (A0m != null) {
            A0L.A0D(A0m, "logging_id");
        }
        try {
            C126527fO r2 = (C126527fO) C86104wH.A0p("create", C116396wu.class);
            r2.A00.A02(A0L, "data");
            r2.A02 = true;
            return C92935kG.A00(r8, C1370385p.A00(), r2.AB4(), C86164wN.A0N(17), mcB);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C86114wI.A0k(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (X.AnonymousClass0wJ.A1X(r10.get(3)) == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C145388kQ Ch4(android.util.SparseArray r10, X.C113806sA r11) {
        /*
            r9 = this;
            r2 = 12
            java.lang.Object r1 = r10.get(r2)
            com.instagram.service.session.UserSession r0 = r9.A00
            java.lang.String r7 = r0.getUserId()
            r0 = 22
            java.lang.String r6 = X.C86114wI.A0m(r10, r0)
            X.McB r4 = X.C103226Yh.A00
            if (r1 != 0) goto L_0x0058
            r2 = 3
            java.lang.Object r0 = r10.get(r2)
            r1 = 0
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r10.get(r2)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            r2 = 1
            if (r0 != 0) goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            java.lang.Object r1 = X.C86124wJ.A0k(r10, r1)
            java.lang.String r1 = (java.lang.String) r1
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r3 = X.C86154wM.A0L()
            java.lang.String r0 = "raw_phone_number"
            X.C86104wH.A1M(r3, r1, r0, r2)
            if (r7 == 0) goto L_0x0040
            java.lang.String r0 = "actor_id"
            r3.A0D(r7, r0)
        L_0x0040:
            if (r6 == 0) goto L_0x0047
            java.lang.String r0 = "logging_id"
            r3.A0D(r6, r0)
        L_0x0047:
            java.lang.Class<X.6wl> r1 = X.C116306wl.class
            java.lang.String r0 = "create"
            java.lang.Object r2 = X.C86104wH.A0p(r0, r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0052 }
            X.7fI r2 = (X.C126467fI) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0052 }
            goto L_0x00b2
        L_0x0052:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x0058:
            java.lang.Object r8 = X.C86124wJ.A0k(r10, r2)
            java.lang.String r8 = (java.lang.String) r8
            r5 = 0
            java.lang.Object r2 = X.C86124wJ.A0k(r10, r5)
            java.lang.String r2 = (java.lang.String) r2
            r1 = 3
            java.lang.Object r0 = r10.get(r1)
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r10.get(r1)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x0077
            r5 = 1
        L_0x0077:
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r3 = X.C86154wM.A0L()
            java.lang.String r0 = "phone_id"
            r3.A0D(r8, r0)
            java.lang.String r0 = "raw_phone_number"
            X.C86104wH.A1M(r3, r2, r0, r5)
            if (r7 == 0) goto L_0x008c
            java.lang.String r0 = "actor_id"
            r3.A0D(r7, r0)
        L_0x008c:
            if (r6 == 0) goto L_0x0093
            java.lang.String r0 = "logging_id"
            r3.A0D(r6, r0)
        L_0x0093:
            java.lang.Class<X.6x5> r1 = X.C116506x5.class
            java.lang.String r0 = "create"
            java.lang.Object r2 = X.C86104wH.A0p(r0, r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00cf }
            X.7fW r2 = (X.C126607fW) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00cf }
            X.3zb r1 = r2.A00
            java.lang.String r0 = "data"
            r1.A02(r3, r0)
            r0 = 1
            r2.A02 = r0
            X.4vi r2 = r2.AB4()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r1 = X.C1370385p.A00()
            r0 = 16
            goto L_0x00c6
        L_0x00b2:
            X.3zb r1 = r2.A00
            java.lang.String r0 = "data"
            r1.A02(r3, r0)
            r0 = 1
            r2.A02 = r0
            X.4vi r2 = r2.AB4()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r1 = X.C1370385p.A00()
            r0 = 15
        L_0x00c6:
            com.facebook.redex.IDxFunctionShape101S0000000_2_I2 r0 = X.C86164wN.A0N(r0)
            X.5kG r0 = X.C92935kG.A00(r11, r1, r2, r0, r4)
            return r0
        L_0x00cf:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128857kU.Ch4(android.util.SparseArray, X.6sA):X.8kQ");
    }

    public C128857kU(UserSession userSession) {
        this.A00 = userSession;
    }
}
