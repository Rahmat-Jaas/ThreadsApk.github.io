package com.facebook.redex;

import X.C120977Dl;
import X.C121157Ek;
import X.C142618fJ;

public class IDxFunctionShape17S1200000_2_I2 implements C142618fJ {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public IDxFunctionShape17S1200000_2_I2(C121157Ek r1, C120977Dl r2, String str, int i) {
        this.A03 = i;
        this.A00 = r1;
        switch (i) {
            case 7:
            case 8:
                this.A02 = str;
                this.A01 = r2;
                break;
            default:
                this.A01 = r2;
                this.A02 = str;
                break;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0201, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x021a, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        return r2.A00(r12, r3, r11.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x02a2, code lost:
        r1 = X.C1370385p.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x02ae, code lost:
        return X.AnonymousClass6BW.A00(r2, r1, r3, X.C86164wN.A0N(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
        r3 = (com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000) r11.A00;
        r3.A0D("", "platform_trust_token");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A03
            switch(r0) {
                case 2: goto L_0x0047;
                case 3: goto L_0x0077;
                case 4: goto L_0x001c;
                case 5: goto L_0x00a4;
                case 6: goto L_0x002f;
                case 7: goto L_0x010e;
                case 8: goto L_0x0125;
                case 9: goto L_0x013c;
                case 10: goto L_0x01a8;
                case 11: goto L_0x0260;
                case 12: goto L_0x02b5;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.6sA r12 = (X.C113806sA) r12
            r0 = 0
            X.C04220Ms.A0B(r12, r0)
            java.lang.Object r0 = r11.A01
            X.7j5 r0 = (X.AnonymousClass7j5) r0
            X.6oR r2 = r0.A03
            java.lang.Object r3 = r11.A00
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r3 = (com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000) r3
        L_0x0015:
            java.lang.String r0 = r11.A02
            X.8kQ r2 = r2.A00(r12, r3, r0)
            return r2
        L_0x001c:
            X.6sA r12 = (X.C113806sA) r12
            r0 = 0
            X.C04220Ms.A0B(r12, r0)
            java.lang.Object r0 = r11.A01
            X.7Dd r0 = (X.C120927Dd) r0
            X.0Oa r0 = r0.A02
            java.lang.Object r2 = r0.getValue()
            X.6oR r2 = (X.C111806oR) r2
            goto L_0x003b
        L_0x002f:
            X.6sA r12 = (X.C113806sA) r12
            r0 = 0
            X.C04220Ms.A0B(r12, r0)
            java.lang.Object r0 = r11.A01
            X.7j4 r0 = (X.C128167j4) r0
            X.6oR r2 = r0.A03
        L_0x003b:
            java.lang.Object r3 = r11.A00
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r3 = (com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000) r3
            java.lang.String r1 = ""
            java.lang.String r0 = "platform_trust_token"
            r3.A0D(r1, r0)
            goto L_0x0015
        L_0x0047:
            X.6uC r12 = (X.C114956uC) r12
            X.C04220Ms.A07(r12)
            X.6ua r0 = r12.A00
            java.lang.Object r6 = r11.A00
            java.util.List r6 = (java.util.List) r6
            java.lang.String r5 = r11.A02
            java.lang.Object r2 = r11.A01
            X.6tk r2 = (X.C114696tk) r2
            r4 = 0
            com.facebook.graphql.impls.FBPayFormFieldImpl r1 = r0.A00
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            X.6ua r3 = new X.6ua
            r3.<init>(r1, r2, r5, r6)
            X.6ub r0 = r12.A02
            java.util.List r2 = r0.A03
            com.facebook.graphql.impls.FBPayFormFieldImpl r0 = r0.A00
            X.6ub r1 = new X.6ub
            r1.<init>(r0, r4, r4, r2)
            X.6tj r0 = r12.A01
            X.6uC r2 = new X.6uC
            r2.<init>(r3, r0, r1)
            return r2
        L_0x0077:
            X.6uC r12 = (X.C114956uC) r12
            X.6ub r0 = r12.A02
            java.lang.Object r6 = r11.A00
            java.util.List r6 = (java.util.List) r6
            java.lang.String r5 = r11.A02
            java.lang.Object r2 = r11.A01
            X.6tk r2 = (X.C114696tk) r2
            r4 = 0
            com.facebook.graphql.impls.FBPayFormFieldImpl r1 = r0.A00
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            X.6ub r3 = new X.6ub
            r3.<init>(r1, r2, r5, r6)
            X.6ua r0 = r12.A00
            java.util.List r2 = r0.A03
            com.facebook.graphql.impls.FBPayFormFieldImpl r0 = r0.A00
            X.6ua r1 = new X.6ua
            r1.<init>(r0, r4, r4, r2)
            X.6tj r0 = r12.A01
            X.6uC r2 = new X.6uC
            r2.<init>(r1, r0, r3)
            return r2
        L_0x00a4:
            X.6sA r12 = (X.C113806sA) r12
            java.lang.Object r0 = r11.A01
            X.7jO r0 = (X.C128327jO) r0
            X.0Oa r0 = r0.A00
            r0.getValue()
            java.lang.String r6 = r11.A02
            java.lang.String r5 = "IG_ANDROID"
            java.lang.Object r1 = r11.A00
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            boolean r4 = X.C18200wM.A1Z(r1)
            java.lang.Class<X.6xN> r1 = X.C116686xN.class
            java.lang.String r0 = "create"
            java.lang.Object r3 = X.C86104wH.A0p(r0, r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0108 }
            X.7f6 r3 = (X.C126357f6) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0108 }
            X.3zb r2 = r3.A00
            java.lang.String r0 = "id"
            r2.A05(r0, r6)
            r3.A02 = r4
            java.lang.String r0 = "interface_type"
            r2.A05(r0, r5)
            r3.A03 = r4
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "include_account_admins"
            r2.A03(r0, r1)
            java.lang.String r0 = "include_payout_account_info"
            r2.A03(r0, r1)
            java.lang.String r0 = "include_payout_methods"
            r2.A03(r0, r1)
            java.lang.String r0 = "include_tax_info"
            r2.A03(r0, r1)
            java.lang.String r0 = "include_edit_links"
            r2.A03(r0, r1)
            java.lang.String r0 = "include_payout_owner"
            r2.A03(r0, r1)
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r2 = X.C1370385p.A00()
            X.8mD r1 = r3.build()
            X.7nN r0 = X.AnonymousClass7nN.A00
            X.5kG r2 = X.AnonymousClass6BW.A00(r12, r2, r1, r0)
            return r2
        L_0x0108:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x010e:
            X.79P r12 = (X.AnonymousClass79P) r12
            java.lang.Object r0 = r11.A00
            X.7Ek r0 = (X.C121157Ek) r0
            X.6i1 r0 = r0.A02
            java.lang.Object r2 = r12.A01
            X.6sA r2 = (X.C113806sA) r2
            X.4vi r3 = X.AnonymousClass79P.A00(r12, r11, r0)
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r1 = X.C1370385p.A00()
            r4 = 3
            goto L_0x02a6
        L_0x0125:
            X.79P r12 = (X.AnonymousClass79P) r12
            java.lang.Object r0 = r11.A00
            X.7Ek r0 = (X.C121157Ek) r0
            X.6i1 r0 = r0.A02
            java.lang.Object r2 = r12.A01
            X.6sA r2 = (X.C113806sA) r2
            X.4vi r3 = X.AnonymousClass79P.A00(r12, r11, r0)
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r1 = X.C1370385p.A00()
            r4 = 4
            goto L_0x02a6
        L_0x013c:
            X.79P r12 = (X.AnonymousClass79P) r12
            java.lang.Object r0 = r11.A00
            X.7Ek r0 = (X.C121157Ek) r0
            X.6i1 r1 = r0.A02
            java.lang.Object r2 = r12.A01
            X.6sA r2 = (X.C113806sA) r2
            java.lang.Object r0 = r11.A01
            X.7Dl r0 = (X.C120977Dl) r0
            java.lang.String r6 = r11.A02
            java.lang.Object r8 = r12.A00
            r8.getClass()
            java.lang.String r8 = (java.lang.String) r8
            java.util.Map r0 = r0.A07
            r5 = 0
            java.util.Map r7 = java.util.Collections.unmodifiableMap(r0)
            com.instagram.service.session.UserSession r0 = r1.A01
            java.lang.String r4 = r0.getUserId()
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r3 = X.C86154wM.A0L()
            java.lang.String r1 = X.C18230wP.A0h()
            java.lang.String r0 = "client_mutation_id"
            r3.A0D(r1, r0)
            java.lang.String r1 = "NUM_4_DIGITS"
            r0 = 353(0x161, float:4.95E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C122037Js.A07(r3, r1, r0, r7)
            java.lang.String r0 = "actor_id"
            r3.A0D(r4, r0)
            java.lang.String r0 = "platform_trust_token"
            r3.A0D(r8, r0)
            java.lang.String r0 = "payment_type"
            r3.A0D(r6, r0)
            java.lang.Class<X.6wq> r1 = X.C116356wq.class
            java.lang.String r0 = "create"
            r4 = 0
            java.lang.Object r1 = X.C86114wI.A0g(r5, r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x01a2 }
            X.7fK r1 = (X.C126487fK) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x01a2 }
            X.3zb r0 = r1.A00
            X.C67463zb.A01(r3, r0)
            r0 = 1
            r1.A02 = r0
            X.4vi r3 = r1.AB4()
            goto L_0x02a2
        L_0x01a2:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x01a8:
            X.79P r12 = (X.AnonymousClass79P) r12
            java.lang.Object r0 = r11.A00
            X.7Ek r0 = (X.C121157Ek) r0
            X.6i1 r1 = r0.A02
            java.lang.Object r3 = r12.A01
            X.6sA r3 = (X.C113806sA) r3
            java.lang.Object r0 = r11.A01
            X.7Dl r0 = (X.C120977Dl) r0
            java.lang.String r6 = r0.A04
            java.lang.String r10 = r11.A02
            java.lang.Object r8 = r12.A00
            r8.getClass()
            java.lang.String r8 = (java.lang.String) r8
            java.util.Map r0 = r0.A07
            r5 = 0
            java.util.Map r9 = java.util.Collections.unmodifiableMap(r0)
            com.instagram.service.session.UserSession r0 = r1.A01
            java.lang.String r7 = r0.getUserId()
            r0 = 5
            com.facebook.redex.IDxFunctionShape362S0100000_2_I2 r4 = new com.facebook.redex.IDxFunctionShape362S0100000_2_I2
            r4.<init>(r1, r0)
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r2 = X.C86154wM.A0L()
            java.lang.String r1 = X.C18230wP.A0h()
            java.lang.String r0 = "client_mutation_id"
            X.C122037Js.A07(r2, r1, r0, r9)
            java.lang.String r0 = "payment_type"
            r2.A0D(r10, r0)
            java.lang.String r0 = "platform_trust_token"
            r2.A0D(r8, r0)
            java.lang.String r8 = "logger_data"
            boolean r0 = r9.containsKey(r8)
            if (r0 == 0) goto L_0x0234
            java.lang.Object r0 = X.C86104wH.A0h(r8, r9)
            com.fbpay.logging.FBPayLoggerData r0 = (com.fbpay.logging.FBPayLoggerData) r0
            java.lang.String r1 = r0.A02
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0234
        L_0x0203:
            java.lang.String r0 = "product_id"
            r2.A0D(r1, r0)
            boolean r0 = r9.containsKey(r8)
            if (r0 == 0) goto L_0x0232
            java.lang.Object r0 = X.C86104wH.A0h(r8, r9)
            com.fbpay.logging.FBPayLoggerData r0 = (com.fbpay.logging.FBPayLoggerData) r0
            java.lang.String r1 = r0.A03
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0232
        L_0x021c:
            java.lang.String r0 = "receiver_id"
            r2.A0D(r1, r0)
            java.lang.String r0 = "actor_id"
            r2.A0D(r7, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0236
            java.lang.String r0 = "target_account_id"
            r2.A0D(r6, r0)
            goto L_0x0236
        L_0x0232:
            r1 = 0
            goto L_0x021c
        L_0x0234:
            r1 = 0
            goto L_0x0203
        L_0x0236:
            java.lang.Class<X.6x6> r1 = X.C116516x6.class
            java.lang.String r0 = "create"
            java.lang.Object r1 = X.C86114wI.A0g(r5, r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x025a }
            X.7fX r1 = (X.C126617fX) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x025a }
            X.3zb r0 = r1.A00
            X.C67463zb.A01(r2, r0)
            r0 = 1
            r1.A02 = r0
            X.4vi r2 = r1.AB4()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r1 = X.C1370385p.A00()
            r0 = 6
            com.facebook.redex.IDxFunctionShape101S0000000_2_I2 r0 = X.C86164wN.A0N(r0)
            X.5kG r2 = X.C92935kG.A00(r3, r1, r2, r0, r4)
            return r2
        L_0x025a:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x0260:
            X.79P r12 = (X.AnonymousClass79P) r12
            java.lang.Object r0 = r11.A00
            X.7Ek r0 = (X.C121157Ek) r0
            X.6i1 r1 = r0.A02
            java.lang.Object r2 = r12.A01
            X.6sA r2 = (X.C113806sA) r2
            java.lang.Object r0 = r11.A01
            X.7Dl r0 = (X.C120977Dl) r0
            java.lang.String r7 = r11.A02
            java.lang.Object r6 = r12.A00
            java.lang.String r6 = (java.lang.String) r6
            java.util.Map r0 = r0.A07
            r3 = 0
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r0)
            com.instagram.service.session.UserSession r0 = r1.A01
            java.lang.String r4 = r0.getUserId()
            java.lang.Class<X.6wx> r1 = X.C116426wx.class
            java.lang.String r0 = "create"
            java.lang.Object r3 = X.C86114wI.A0g(r3, r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x02af }
            X.7fR r3 = (X.C126557fR) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x02af }
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r1 = X.C86114wI.A0L(r4, r6)
            java.lang.String r0 = "payment_type"
            X.C122037Js.A07(r1, r7, r0, r5)
            X.3zb r0 = r3.A00
            X.C67463zb.A01(r1, r0)
            r4 = 1
            r3.A02 = r4
            X.4vi r3 = r3.AB4()
        L_0x02a2:
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r1 = X.C1370385p.A00()
        L_0x02a6:
            com.facebook.redex.IDxFunctionShape101S0000000_2_I2 r0 = X.C86164wN.A0N(r4)
            X.5kG r2 = X.AnonymousClass6BW.A00(r2, r1, r3, r0)
            return r2
        L_0x02af:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x02b5:
            X.79P r12 = (X.AnonymousClass79P) r12
            java.lang.Object r0 = r11.A00
            X.7Ek r0 = (X.C121157Ek) r0
            X.6i1 r1 = r0.A02
            java.lang.Object r4 = r12.A01
            X.6sA r4 = (X.C113806sA) r4
            java.lang.Object r0 = r11.A01
            X.7Dl r0 = (X.C120977Dl) r0
            java.lang.String r7 = r11.A02
            java.lang.Object r6 = r12.A00
            java.lang.String r6 = (java.lang.String) r6
            java.util.Map r0 = r0.A07
            r2 = 0
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r0)
            com.instagram.service.session.UserSession r0 = r1.A01
            java.lang.String r3 = r0.getUserId()
            java.lang.Class<X.6wv> r1 = X.C116406wv.class
            java.lang.String r0 = "create"
            java.lang.Object r2 = X.C86114wI.A0g(r2, r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0305 }
            X.7fP r2 = (X.C126537fP) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0305 }
            com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000 r1 = X.C86114wI.A0L(r3, r6)
            java.lang.String r0 = "payment_type"
            X.C122037Js.A07(r1, r7, r0, r5)
            X.3zb r0 = r2.A00
            X.C67463zb.A01(r1, r0)
            r0 = 1
            r2.A02 = r0
            X.4vi r2 = r2.AB4()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r1 = X.C1370385p.A00()
            r0 = 2
            com.facebook.redex.IDxFunctionShape101S0000000_2_I2 r0 = X.C86164wN.A0N(r0)
            X.5kG r2 = X.AnonymousClass6BW.A00(r4, r1, r2, r0)
            return r2
        L_0x0305:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFunctionShape17S1200000_2_I2.apply(java.lang.Object):java.lang.Object");
    }

    public IDxFunctionShape17S1200000_2_I2(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A01 = obj2;
        this.A00 = obj;
        this.A02 = str;
    }
}
