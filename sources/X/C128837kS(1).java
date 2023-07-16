package X;

import android.util.SparseArray;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.7kS  reason: invalid class name and case insensitive filesystem */
public final class C128837kS implements C145368kO {
    public final C145388kQ Cc3(SparseArray sparseArray, C113806sA r8) {
        McB mcB = C103226Yh.A00;
        String str = (String) C86124wJ.A0k(sparseArray, 12);
        try {
            C126497fL r3 = (C126497fL) C86104wH.A0p("create", C116366wr.class);
            GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
            A0L.A0D(str, "mailing_address_id");
            C86154wM.A1M(A0L);
            A0L.A0D(C18230wP.A0h(), "client_mutation_id");
            r3.A00.A02(A0L, "data");
            r3.A02 = true;
            return C92935kG.A00(r8, C1370385p.A00(), r3.AB4(), C86164wN.A0N(11), mcB);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C86114wI.A0k(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        if (X.AnonymousClass0wJ.A1X(r15.get(3)) == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0140, code lost:
        if (X.AnonymousClass0wJ.A1X(r15.get(3)) == false) goto L_0x0142;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C145388kQ Ch4(android.util.SparseArray r15, X.C113806sA r16) {
        /*
            r14 = this;
            r0 = 12
            java.lang.Object r4 = r15.get(r0)
            X.McB r3 = X.C103226Yh.A00
            r2 = 4
            java.lang.Object r0 = r15.get(r2)
            java.lang.String r1 = ""
            if (r4 != 0) goto L_0x00e4
            if (r0 != 0) goto L_0x008d
            r12 = r1
        L_0x0014:
            r2 = 2
            java.lang.Object r0 = r15.get(r2)
            if (r0 != 0) goto L_0x0088
            r11 = r1
        L_0x001c:
            r2 = 5
            java.lang.Object r0 = r15.get(r2)
            if (r0 != 0) goto L_0x0083
            r10 = r1
        L_0x0024:
            r2 = 6
            java.lang.Object r0 = r15.get(r2)
            if (r0 != 0) goto L_0x007e
            r9 = r1
        L_0x002c:
            r2 = 7
            java.lang.Object r0 = r15.get(r2)
            if (r0 != 0) goto L_0x0079
            r8 = r1
        L_0x0034:
            r2 = 8
            java.lang.Object r0 = r15.get(r2)
            if (r0 != 0) goto L_0x0074
            r7 = r1
        L_0x003d:
            r2 = 9
            java.lang.Object r0 = r15.get(r2)
            if (r0 == 0) goto L_0x0049
            java.lang.String r1 = X.C86114wI.A0m(r15, r2)
        L_0x0049:
            r2 = 10
            java.lang.Object r0 = r15.get(r2)
            boolean r0 = r0 instanceof com.facebook.common.locale.Country
            java.lang.Object r5 = r15.get(r2)
            if (r0 == 0) goto L_0x0071
            com.facebook.common.locale.LocaleMember r5 = (com.facebook.common.locale.LocaleMember) r5
            java.lang.String r5 = X.C86164wN.A0f(r5)
        L_0x005d:
            r2 = 3
            java.lang.Object r0 = r15.get(r2)
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r15.get(r2)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            r6 = 1
            if (r0 != 0) goto L_0x0092
        L_0x006f:
            r6 = 0
            goto L_0x0092
        L_0x0071:
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x005d
        L_0x0074:
            java.lang.String r7 = X.C86114wI.A0m(r15, r2)
            goto L_0x003d
        L_0x0079:
            java.lang.String r8 = X.C86114wI.A0m(r15, r2)
            goto L_0x0034
        L_0x007e:
            java.lang.String r9 = X.C86114wI.A0m(r15, r2)
            goto L_0x002c
        L_0x0083:
            java.lang.String r10 = X.C86114wI.A0m(r15, r2)
            goto L_0x0024
        L_0x0088:
            java.lang.String r11 = X.C86114wI.A0m(r15, r2)
            goto L_0x001c
        L_0x008d:
            java.lang.String r12 = X.C86114wI.A0m(r15, r2)
            goto L_0x0014
        L_0x0092:
            java.lang.Class<X.6wj> r2 = X.C116286wj.class
            java.lang.String r0 = "create"
            java.lang.Object r4 = X.C86104wH.A0p(r0, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00de }
            X.7fG r4 = (X.C126447fG) r4     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00de }
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r2 = X.C86154wM.A0L()
            java.lang.String r0 = "label"
            r2.A0D(r12, r0)
            java.lang.String r0 = "care_of"
            r2.A0D(r11, r0)
            java.lang.String r0 = "street1"
            r2.A0D(r10, r0)
            java.lang.String r0 = "street2"
            r2.A0D(r9, r0)
            java.lang.String r0 = "city"
            r2.A0D(r8, r0)
            java.lang.String r0 = "state"
            r2.A0D(r7, r0)
            java.lang.String r0 = "postal_code"
            r2.A0D(r1, r0)
            java.lang.String r0 = "country"
            X.C86104wH.A1M(r2, r5, r0, r6)
            X.3zb r1 = r4.A00
            java.lang.String r0 = "data"
            r1.A02(r2, r0)
            r0 = 1
            r4.A02 = r0
            X.4vi r2 = r4.AB4()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r1 = X.C1370385p.A00()
            r0 = 9
            goto L_0x01bd
        L_0x00de:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x00e4:
            if (r0 != 0) goto L_0x0168
            r12 = r1
        L_0x00e7:
            r2 = 2
            java.lang.Object r0 = r15.get(r2)
            if (r0 != 0) goto L_0x0163
            r11 = r1
        L_0x00ef:
            r2 = 5
            java.lang.Object r0 = r15.get(r2)
            if (r0 != 0) goto L_0x015e
            r10 = r1
        L_0x00f7:
            r2 = 6
            java.lang.Object r0 = r15.get(r2)
            if (r0 != 0) goto L_0x0159
            r9 = r1
        L_0x00ff:
            r2 = 7
            java.lang.Object r0 = r15.get(r2)
            if (r0 != 0) goto L_0x0154
            r8 = r1
        L_0x0107:
            r2 = 8
            java.lang.Object r0 = r15.get(r2)
            if (r0 != 0) goto L_0x014f
            r7 = r1
        L_0x0110:
            r2 = 9
            java.lang.Object r0 = r15.get(r2)
            if (r0 == 0) goto L_0x011c
            java.lang.String r1 = X.C86114wI.A0m(r15, r2)
        L_0x011c:
            r2 = 10
            java.lang.Object r0 = r15.get(r2)
            boolean r0 = r0 instanceof com.facebook.common.locale.Country
            java.lang.Object r6 = r15.get(r2)
            if (r0 == 0) goto L_0x014c
            com.facebook.common.locale.LocaleMember r6 = (com.facebook.common.locale.LocaleMember) r6
            java.lang.String r6 = X.C86164wN.A0f(r6)
        L_0x0130:
            r2 = 3
            java.lang.Object r0 = r15.get(r2)
            if (r0 == 0) goto L_0x0142
            java.lang.Object r0 = r15.get(r2)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            r5 = 1
            if (r0 != 0) goto L_0x0143
        L_0x0142:
            r5 = 0
        L_0x0143:
            r0 = 12
            java.lang.Object r13 = X.C86124wJ.A0k(r15, r0)
            java.lang.String r13 = (java.lang.String) r13
            goto L_0x016e
        L_0x014c:
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0130
        L_0x014f:
            java.lang.String r7 = X.C86114wI.A0m(r15, r2)
            goto L_0x0110
        L_0x0154:
            java.lang.String r8 = X.C86114wI.A0m(r15, r2)
            goto L_0x0107
        L_0x0159:
            java.lang.String r9 = X.C86114wI.A0m(r15, r2)
            goto L_0x00ff
        L_0x015e:
            java.lang.String r10 = X.C86114wI.A0m(r15, r2)
            goto L_0x00f7
        L_0x0163:
            java.lang.String r11 = X.C86114wI.A0m(r15, r2)
            goto L_0x00ef
        L_0x0168:
            java.lang.String r12 = X.C86114wI.A0m(r15, r2)
            goto L_0x00e7
        L_0x016e:
            java.lang.Class<X.6x3> r2 = X.C116486x3.class
            java.lang.String r0 = "create"
            java.lang.Object r4 = X.C86104wH.A0p(r0, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x01c8 }
            X.7fU r4 = (X.C126587fU) r4     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x01c8 }
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r2 = X.C86154wM.A0L()
            java.lang.String r0 = "mailing_address_id"
            r2.A0D(r13, r0)
            java.lang.String r0 = "label"
            r2.A0D(r12, r0)
            java.lang.String r0 = "care_of"
            r2.A0D(r11, r0)
            java.lang.String r0 = "street1"
            r2.A0D(r10, r0)
            java.lang.String r0 = "street2"
            r2.A0D(r9, r0)
            java.lang.String r0 = "city"
            r2.A0D(r8, r0)
            java.lang.String r0 = "state"
            r2.A0D(r7, r0)
            java.lang.String r0 = "postal_code"
            r2.A0D(r1, r0)
            java.lang.String r0 = "country"
            X.C86104wH.A1M(r2, r6, r0, r5)
            X.3zb r1 = r4.A00
            java.lang.String r0 = "data"
            r1.A02(r2, r0)
            r0 = 1
            r4.A02 = r0
            X.4vi r2 = r4.AB4()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r1 = X.C1370385p.A00()
            r0 = 10
        L_0x01bd:
            com.facebook.redex.IDxFunctionShape101S0000000_2_I2 r0 = X.C86164wN.A0N(r0)
            r4 = r16
            X.5kG r0 = X.C92935kG.A00(r4, r1, r2, r0, r3)
            return r0
        L_0x01c8:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128837kS.Ch4(android.util.SparseArray, X.6sA):X.8kQ");
    }
}
