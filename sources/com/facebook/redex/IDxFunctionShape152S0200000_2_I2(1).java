package com.facebook.redex;

import X.C142618fJ;

public class IDxFunctionShape152S0200000_2_I2 implements C142618fJ {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxFunctionShape152S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02c8, code lost:
        return X.AnonymousClass6BW.A00(r4, r5, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a6, code lost:
        r1 = (X.C121207Et) r1.A00;
        r0 = "NETWORK_ONLY";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01b4, code lost:
        return r2.A00(r4, X.AnonymousClass6I0.A00(r0), r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r23) {
        /*
            r22 = this;
            r1 = r22
            r4 = r23
            int r0 = r1.A02
            switch(r0) {
                case 0: goto L_0x0074;
                case 1: goto L_0x0087;
                case 2: goto L_0x009b;
                case 3: goto L_0x00a9;
                case 4: goto L_0x00da;
                case 5: goto L_0x010b;
                case 6: goto L_0x011f;
                case 7: goto L_0x0169;
                case 8: goto L_0x001d;
                case 9: goto L_0x019a;
                case 10: goto L_0x01b5;
                case 11: goto L_0x020a;
                case 12: goto L_0x023b;
                case 13: goto L_0x026b;
                case 14: goto L_0x029b;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A00
            X.6q3 r0 = (X.C112706q3) r0
            com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI r3 = r0.A01
            java.lang.Object r2 = r1.A01
            r1 = 1
            com.instagram.common.task.IDxLTaskShape29S0300000_2_I2 r0 = new com.instagram.common.task.IDxLTaskShape29S0300000_2_I2
            r0.<init>(r1, r4, r3, r2)
            X.C31155GhB.A03(r0)
            X.7kq r6 = r3.A01
        L_0x001c:
            return r6
        L_0x001d:
            com.facebook.pando.TreeJNI r4 = (com.facebook.pando.TreeJNI) r4
            java.lang.Class<com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl$RequestPaymentContainer$NonAuthStepUpError$StepUpRequirements> r2 = com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl.RequestPaymentContainer.NonAuthStepUpError.StepUpRequirements.class
            java.lang.String r0 = "step_up_requirements"
            com.google.common.collect.ImmutableList r0 = r4.getTreeList(r0, r2)
            r6 = 0
            if (r0 == 0) goto L_0x001c
            java.util.Iterator r5 = r0.iterator()
        L_0x002e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r4 = r5.next()
            r2 = r4
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            java.lang.String r0 = "PAYFBPayMIBToCIBStepUp"
            boolean r0 = r2.isFulfilled(r0)
            if (r0 == 0) goto L_0x0070
            java.lang.Class<com.facebook.graphql.impls.FBPayNonAuthStepUpImpl> r0 = com.facebook.graphql.impls.FBPayNonAuthStepUpImpl.class
            com.facebook.pando.TreeJNI r3 = r2.reinterpret(r0)
            if (r3 == 0) goto L_0x0070
            X.20b r2 = X.C302120b.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "step_up_type"
            java.lang.Enum r0 = X.C86104wH.A0a(r3, r2, r0)
        L_0x0053:
            X.20b r2 = X.C302120b.MIB_TO_CIB_PAYPAL
            if (r0 != r2) goto L_0x002e
        L_0x0057:
            com.facebook.pando.TreeJNI r4 = (com.facebook.pando.TreeJNI) r4
            if (r4 == 0) goto L_0x001c
            X.AnonymousClass7Kz.A05()
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r5 = 0
            X.0m7 r2 = r0.getChildFragmentManager()
            if (r2 != 0) goto L_0x02cf
            java.lang.String r0 = "Input fragment or fragmentActivity cannot be null"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0070:
            r0 = r6
            goto L_0x0053
        L_0x0072:
            r4 = r6
            goto L_0x0057
        L_0x0074:
            java.lang.Object r6 = r1.A00
            X.M5J r6 = (X.M5J) r6
            r0 = 0
            X.AnonymousClass7Kx.A0J(r6, r0)
            java.lang.Object r0 = r1.A01
            X.0YY r0 = (X.AnonymousClass0YY) r0
            X.C04220Ms.A07(r4)
            r0.invoke(r4)
            return r6
        L_0x0087:
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.lang.Object r2 = r1.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r1 = r1.A00
            java.lang.Integer r1 = (java.lang.Integer) r1
            X.69U r0 = X.AnonymousClass69U.A0b
            com.facebookpay.common.recyclerview.adapteritems.PuxPriceTableItem r6 = new com.facebookpay.common.recyclerview.adapteritems.PuxPriceTableItem
            r6.<init>(r0, r2, r1, r3)
            return r6
        L_0x009b:
            X.6sA r4 = (X.C113806sA) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.Object r0 = r1.A01
            X.6cT r0 = (X.C104846cT) r0
            X.6oQ r2 = r0.A00
            goto L_0x01a6
        L_0x00a9:
            X.6sA r4 = (X.C113806sA) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.Object r3 = r1.A00
            com.facebook.graphql.calls.GraphQlCallInput r3 = (com.facebook.graphql.calls.GraphQlCallInput) r3
            r2 = 1
            X.C04220Ms.A0B(r3, r2)
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r5 = X.C1370385p.A00()
            java.lang.Class<X.6ww> r1 = X.C116416ww.class
            java.lang.String r0 = "create"
            java.lang.Object r1 = X.C86104wH.A0p(r0, r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00d4 }
            X.7fQ r1 = (X.C126547fQ) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00d4 }
            X.3zb r0 = r1.A00
            X.C67463zb.A01(r3, r0)
            r1.A02 = r2
            X.4vi r1 = r1.AB4()
            X.7nC r0 = X.AnonymousClass7nC.A00
            goto L_0x02c4
        L_0x00d4:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x00da:
            X.6sA r4 = (X.C113806sA) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.Object r3 = r1.A00
            com.facebook.graphql.calls.GraphQlCallInput r3 = (com.facebook.graphql.calls.GraphQlCallInput) r3
            r2 = 1
            X.C04220Ms.A0B(r3, r2)
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r5 = X.C1370385p.A00()
            java.lang.Class<X.6xP> r1 = X.C116706xP.class
            java.lang.String r0 = "create"
            java.lang.Object r1 = X.C86104wH.A0p(r0, r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0105 }
            X.7fc r1 = (X.C126667fc) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0105 }
            X.3zb r0 = r1.A00
            X.C67463zb.A01(r3, r0)
            r1.A02 = r2
            X.4vi r1 = r1.AB4()
            X.7nD r0 = X.AnonymousClass7nD.A00
            goto L_0x02c4
        L_0x0105:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x010b:
            X.6sA r4 = (X.C113806sA) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.Object r0 = r1.A01
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r0 = (com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl) r0
            X.6oQ r2 = r0.A07
            java.lang.Object r1 = r1.A00
            X.7Et r1 = (X.C121207Et) r1
            java.lang.String r0 = "PRODUCT_SDK_DEFAULT_COMPONENT"
            goto L_0x01ac
        L_0x011f:
            X.6sA r4 = (X.C113806sA) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.Object r0 = r1.A01
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r0 = (com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl) r0
            X.6cU r3 = r0.A08
            java.lang.Object r2 = r1.A00
            com.facebook.graphql.calls.GraphQlCallInput r2 = (com.facebook.graphql.calls.GraphQlCallInput) r2
            X.C04220Ms.A05(r2)
            java.lang.Class<X.6xA> r1 = X.C116556xA.class
            java.lang.String r0 = "create"
            java.lang.Object r1 = X.C86104wH.A0p(r0, r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0163 }
            X.7ev r1 = (X.C126297ev) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0163 }
            X.3zb r0 = r1.A00
            X.C67463zb.A01(r2, r0)
            r0 = 1
            r1.A02 = r0
            X.8mD r2 = r1.build()
            java.lang.String r0 = "NETWORK_ONLY"
            X.6p4 r0 = X.AnonymousClass6I0.A00(r0)
            X.C04220Ms.A06(r2)
            r0.A00(r2)
            X.0Oa r0 = r3.A00
            java.lang.Object r1 = r0.getValue()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r1 = (com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor) r1
            X.7nB r0 = X.AnonymousClass7nB.A00
            X.5kG r6 = X.AnonymousClass6BW.A00(r4, r1, r2, r0)
            return r6
        L_0x0163:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x0169:
            X.6sA r4 = (X.C113806sA) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.Object r2 = r1.A00
            com.facebook.graphql.calls.GraphQlCallInput r2 = (com.facebook.graphql.calls.GraphQlCallInput) r2
            X.C04220Ms.A05(r2)
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r5 = X.C1370385p.A00()
            java.lang.Class<X.6xB> r1 = X.C116566xB.class
            java.lang.String r0 = "create"
            java.lang.Object r1 = X.C86104wH.A0p(r0, r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0194 }
            X.7ew r1 = (X.C126307ew) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0194 }
            X.3zb r0 = r1.A00
            X.C67463zb.A01(r2, r0)
            r0 = 1
            r1.A02 = r0
            X.8mD r1 = r1.build()
            X.7nE r0 = X.AnonymousClass7nE.A00
            goto L_0x02c4
        L_0x0194:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x019a:
            X.6sA r4 = (X.C113806sA) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.Object r0 = r1.A01
            X.6cY r0 = (X.C104896cY) r0
            X.6oQ r2 = r0.A00
        L_0x01a6:
            java.lang.Object r1 = r1.A00
            X.7Et r1 = (X.C121207Et) r1
            java.lang.String r0 = "NETWORK_ONLY"
        L_0x01ac:
            X.6p4 r0 = X.AnonymousClass6I0.A00(r0)
            X.8kQ r6 = r2.A00(r4, r0, r1)
            return r6
        L_0x01b5:
            java.lang.Object r0 = r1.A01
            X.587 r0 = (X.AnonymousClass587) r0
            boolean r5 = r0.A03
            java.lang.Object r0 = r1.A00
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            java.lang.Object r6 = r0.A01
            com.facebook.pando.TreeJNI r6 = (com.facebook.pando.TreeJNI) r6
            r1 = 0
            if (r6 == 0) goto L_0x0208
            java.lang.Class<com.facebook.graphql.impls.OtcOptionComponentImpl$Toggle> r2 = com.facebook.graphql.impls.OtcOptionComponentImpl.Toggle.class
            java.lang.String r0 = "toggle"
            com.facebook.pando.TreeJNI r3 = r6.getTreeValue(r0, r2)
            if (r3 == 0) goto L_0x0208
            java.lang.Class<com.facebook.graphql.impls.OtcOptionComponentImpl$Toggle$Title> r2 = com.facebook.graphql.impls.OtcOptionComponentImpl.Toggle.Title.class
            java.lang.String r0 = "title"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r0, r2)
            if (r2 == 0) goto L_0x0208
            java.lang.Class<com.facebook.graphql.impls.PAYLinkableTextFragmentImpl> r0 = com.facebook.graphql.impls.PAYLinkableTextFragmentImpl.class
            com.facebook.pando.TreeJNI r4 = r2.reinterpret(r0)
            com.facebook.graphql.impls.PAYLinkableTextFragmentImpl r4 = (com.facebook.graphql.impls.PAYLinkableTextFragmentImpl) r4
        L_0x01e2:
            if (r6 == 0) goto L_0x0200
            java.lang.Class<com.facebook.graphql.impls.OtcOptionComponentImpl$Toggle> r2 = com.facebook.graphql.impls.OtcOptionComponentImpl.Toggle.class
            java.lang.String r0 = "toggle"
            com.facebook.pando.TreeJNI r3 = r6.getTreeValue(r0, r2)
            if (r3 == 0) goto L_0x0200
            java.lang.Class<com.facebook.graphql.impls.OtcOptionComponentImpl$Toggle$Description> r2 = com.facebook.graphql.impls.OtcOptionComponentImpl.Toggle.Description.class
            java.lang.String r0 = "description"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r0, r2)
            if (r2 == 0) goto L_0x0200
            java.lang.Class<com.facebook.graphql.impls.PAYLinkableTextFragmentImpl> r0 = com.facebook.graphql.impls.PAYLinkableTextFragmentImpl.class
            com.facebook.pando.TreeJNI r1 = r2.reinterpret(r0)
            com.facebook.graphql.impls.PAYLinkableTextFragmentImpl r1 = (com.facebook.graphql.impls.PAYLinkableTextFragmentImpl) r1
        L_0x0200:
            X.69U r0 = X.AnonymousClass69U.A08
            com.facebookpay.common.recyclerview.adapteritems.AnonCheckoutToggleItem r6 = new com.facebookpay.common.recyclerview.adapteritems.AnonCheckoutToggleItem
            r6.<init>(r4, r1, r0, r5)
            return r6
        L_0x0208:
            r4 = r1
            goto L_0x01e2
        L_0x020a:
            X.6sA r4 = (X.C113806sA) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.Object r3 = r1.A00
            com.facebook.graphql.calls.GraphQlCallInput r3 = (com.facebook.graphql.calls.GraphQlCallInput) r3
            r2 = 1
            X.C04220Ms.A0B(r3, r2)
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r5 = X.C1370385p.A00()
            java.lang.Class<X.6wg> r1 = X.C116256wg.class
            java.lang.String r0 = "create"
            java.lang.Object r1 = X.C86104wH.A0p(r0, r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0235 }
            X.7fF r1 = (X.C126437fF) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0235 }
            X.3zb r0 = r1.A00
            X.C67463zb.A01(r3, r0)
            r1.A02 = r2
            X.4vi r1 = r1.AB4()
            X.7nP r0 = X.AnonymousClass7nP.A00
            goto L_0x02c4
        L_0x0235:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x023b:
            X.6sA r4 = (X.C113806sA) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.Object r3 = r1.A00
            com.facebook.graphql.calls.GraphQlCallInput r3 = (com.facebook.graphql.calls.GraphQlCallInput) r3
            r2 = 1
            X.C04220Ms.A0B(r3, r2)
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r5 = X.C1370385p.A00()
            java.lang.Class<X.6xR> r1 = X.C116726xR.class
            java.lang.String r0 = "create"
            java.lang.Object r1 = X.C86104wH.A0p(r0, r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0265 }
            X.7fd r1 = (X.C126677fd) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0265 }
            X.3zb r0 = r1.A00
            X.C67463zb.A01(r3, r0)
            r1.A02 = r2
            X.4vi r1 = r1.AB4()
            X.7nR r0 = X.AnonymousClass7nR.A00
            goto L_0x02c4
        L_0x0265:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x026b:
            X.6sA r4 = (X.C113806sA) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.Object r3 = r1.A00
            com.facebook.graphql.calls.GraphQlCallInput r3 = (com.facebook.graphql.calls.GraphQlCallInput) r3
            r2 = 1
            X.C04220Ms.A0B(r3, r2)
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r5 = X.C1370385p.A00()
            java.lang.Class<X.6xD> r1 = X.C116586xD.class
            java.lang.String r0 = "create"
            java.lang.Object r1 = X.C86104wH.A0p(r0, r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0295 }
            X.7fa r1 = (X.C126647fa) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0295 }
            X.3zb r0 = r1.A00
            X.C67463zb.A01(r3, r0)
            r1.A02 = r2
            X.4vi r1 = r1.AB4()
            X.7nS r0 = X.AnonymousClass7nS.A00
            goto L_0x02c4
        L_0x0295:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x029b:
            X.6sA r4 = (X.C113806sA) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.Object r3 = r1.A00
            com.facebook.graphql.calls.GraphQlCallInput r3 = (com.facebook.graphql.calls.GraphQlCallInput) r3
            r2 = 1
            X.C04220Ms.A0B(r3, r2)
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r5 = X.C1370385p.A00()
            java.lang.Class<X.6x8> r1 = X.C116536x8.class
            java.lang.String r0 = "create"
            java.lang.Object r1 = X.C86104wH.A0p(r0, r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x02c9 }
            X.7fZ r1 = (X.C126637fZ) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x02c9 }
            X.3zb r0 = r1.A00
            X.C67463zb.A01(r3, r0)
            r1.A02 = r2
            X.4vi r1 = r1.AB4()
            X.7nQ r0 = X.AnonymousClass7nQ.A00
        L_0x02c4:
            X.5kG r6 = X.AnonymousClass6BW.A00(r4, r5, r1, r0)
            return r6
        L_0x02c9:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        L_0x02cf:
            java.lang.String r0 = "PAYFBPayMIBToCIBStepUp"
            boolean r0 = r4.isFulfilled(r0)
            if (r0 == 0) goto L_0x032c
            java.lang.Class<com.facebook.graphql.impls.FBPayNonAuthStepUpImpl> r0 = com.facebook.graphql.impls.FBPayNonAuthStepUpImpl.class
            com.facebook.pando.TreeJNI r4 = r4.reinterpret(r0)
            if (r4 == 0) goto L_0x032c
            java.lang.Class<com.facebook.graphql.impls.FBPayNonAuthStepUpImpl$PaypalConsentBottomSheet> r3 = com.facebook.graphql.impls.FBPayNonAuthStepUpImpl.PaypalConsentBottomSheet.class
            java.lang.String r0 = "paypal_consent_bottom_sheet"
            com.facebook.pando.TreeJNI r3 = r4.getTreeValue(r0, r3)
            if (r3 == 0) goto L_0x032c
            java.lang.Class<com.facebook.graphql.impls.ECPPayPalConsentBottomSheetFragmentImpl> r0 = com.facebook.graphql.impls.ECPPayPalConsentBottomSheetFragmentImpl.class
            com.facebook.pando.TreeJNI r3 = r3.reinterpret(r0)
        L_0x02ef:
            java.lang.String r7 = "Required value was null."
            if (r3 == 0) goto L_0x03e6
            java.lang.Object r4 = r1.A01
            X.58M r4 = (X.AnonymousClass58M) r4
            X.56r r1 = r4.A0z
            java.lang.Object r0 = r1.A08()
            if (r0 == 0) goto L_0x03e1
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            java.lang.String r12 = r0.A0A
            java.lang.Object r0 = r1.A08()
            if (r0 == 0) goto L_0x03dc
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            java.lang.String r13 = r0.A08
            X.7Kx r0 = r4.A0M
            java.lang.Object r0 = r0.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r0 = (com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem) r0
            if (r0 == 0) goto L_0x0317
            com.facebookpay.paymentmethod.model.PaymentMethod r6 = r0.A01
        L_0x0317:
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.paymentmethod.model.PayPalCredential"
            X.C04220Ms.A0C(r6, r0)
            com.facebookpay.paymentmethod.model.PayPalCredential r6 = (com.facebookpay.paymentmethod.model.PayPalCredential) r6
            java.lang.String r14 = r6.Aal()
            X.M5J r0 = r4.A01
            if (r0 != 0) goto L_0x032e
            java.lang.String r0 = "_loggingPolicy"
            X.C04220Ms.A0E(r0)
            throw r5
        L_0x032c:
            r3 = r6
            goto L_0x02ef
        L_0x032e:
            java.lang.Object r11 = r0.A08()
            com.fbpay.logging.LoggingPolicy r11 = (com.fbpay.logging.LoggingPolicy) r11
            java.lang.Object r0 = r1.A08()
            if (r0 == 0) goto L_0x03d7
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            boolean r1 = r0.A0B
            r7 = 0
            r0 = 3
            X.C04220Ms.A0B(r14, r0)
            java.lang.Class<com.facebook.graphql.impls.ECPPayPalConsentBottomSheetFragmentImpl$PaypalPolicy> r4 = com.facebook.graphql.impls.ECPPayPalConsentBottomSheetFragmentImpl.PaypalPolicy.class
            java.lang.String r0 = "paypal_policy"
            com.facebook.pando.TreeJNI r4 = r3.getTreeValue(r0, r4)
            java.lang.String r15 = ""
            r10 = 0
            if (r4 == 0) goto L_0x03ad
            java.lang.Class<com.facebook.graphql.impls.PAYLinkableTextFragmentImpl> r0 = com.facebook.graphql.impls.PAYLinkableTextFragmentImpl.class
            com.facebook.pando.TreeJNI r9 = r4.reinterpret(r0)
            if (r9 == 0) goto L_0x03ad
            java.lang.String r6 = X.C86144wL.A0q(r9)
            if (r6 == 0) goto L_0x03ad
            java.lang.String r0 = "description"
            java.lang.String r0 = r3.getStringValue(r0)
            java.lang.Object[] r8 = new java.lang.Object[]{r0, r15}
            java.lang.String r4 = "\n\n"
            java.lang.StringBuilder r0 = X.C18200wM.A0r()
            X.C121687Hl.A01(r5, r4, r0, r8)
            java.lang.String r15 = r0.toString()
            X.C04220Ms.A06(r15)
            java.lang.Class<com.facebook.graphql.impls.PAYLinkableTextFragmentImpl$Ranges> r10 = com.facebook.graphql.impls.PAYLinkableTextFragmentImpl.Ranges.class
            java.lang.String r8 = "ranges"
            com.google.common.collect.ImmutableList r0 = r9.getTreeList(r8, r10)
            java.lang.Object r4 = r0.get(r7)
            com.facebook.pando.TreeJNI r4 = (com.facebook.pando.TreeJNI) r4
            java.lang.String r0 = "length"
            int r5 = r4.getIntValue(r0)
            com.google.common.collect.ImmutableList r0 = r9.getTreeList(r8, r10)
            java.lang.Object r4 = r0.get(r7)
            com.facebook.pando.TreeJNI r4 = (com.facebook.pando.TreeJNI) r4
            java.lang.String r0 = "offset"
            int r4 = r4.getIntValue(r0)
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r9, r10, r8)
            java.util.List r0 = X.AnonymousClass3JJ.A00(r0)
            java.lang.String r0 = X.C18190wL.A0p(r0, r7)
            com.facebookpay.paypal.model.LinkableTextParams r10 = new com.facebookpay.paypal.model.LinkableTextParams
            r10.<init>(r6, r5, r4, r0)
        L_0x03ad:
            java.lang.String r0 = "header"
            java.lang.String r16 = r3.getStringValue(r0)
            java.lang.String r0 = "sub_header"
            java.lang.String r17 = r3.getStringValue(r0)
            java.lang.String r0 = "navigation_title"
            java.lang.String r18 = r3.getStringValue(r0)
            java.lang.String r0 = "primary_button_label"
            java.lang.String r19 = r3.getStringValue(r0)
            java.lang.String r0 = "secondary_button_label"
            java.lang.String r20 = r3.getStringValue(r0)
            com.facebookpay.paypal.model.PaypalConsentLaunchParams r9 = new com.facebookpay.paypal.model.PaypalConsentLaunchParams
            r21 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.M5J r6 = X.C99086Ib.A00(r2, r9)
            return r6
        L_0x03d7:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r7)
            throw r0
        L_0x03dc:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r7)
            throw r0
        L_0x03e1:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r7)
            throw r0
        L_0x03e6:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFunctionShape152S0200000_2_I2.apply(java.lang.Object):java.lang.Object");
    }
}
