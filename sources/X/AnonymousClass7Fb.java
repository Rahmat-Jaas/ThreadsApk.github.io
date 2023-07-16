package X;

import com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl;
import com.facebook.graphql.impls.FBPayECPHandleCheckoutEventMutationResponseImpl;
import com.facebook.graphql.impls.SharedPaymentsErrorImpl;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

/* renamed from: X.7Fb  reason: invalid class name */
public final class AnonymousClass7Fb {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        r8 = java.lang.Integer.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass7JD A00(X.C92875kA r12) {
        /*
            r0 = 0
            X.C04220Ms.A0B(r12, r0)
            java.lang.String r10 = r12.A05
            java.lang.String r11 = r12.A04
            X.6iz r4 = r12.A01
            X.6iz r5 = r12.A02
            X.66a r0 = r12.A03
            if (r0 == 0) goto L_0x001b
            int r0 = r0.ordinal()
            java.lang.Integer r8 = X.C86154wM.A0X()
            switch(r0) {
                case 3: goto L_0x002c;
                case 4: goto L_0x001c;
                case 5: goto L_0x0043;
                case 8: goto L_0x002f;
                case 10: goto L_0x0038;
                case 11: goto L_0x0035;
                case 13: goto L_0x001c;
                case 20: goto L_0x003a;
                case 24: goto L_0x0040;
                case 25: goto L_0x003c;
                case 26: goto L_0x003e;
                case 30: goto L_0x0032;
                default: goto L_0x001b;
            }
        L_0x001b:
            r8 = 0
        L_0x001c:
            r2 = 0
            com.facebookpay.common.models.ErrorDialogContent r1 = new com.facebookpay.common.models.ErrorDialogContent
            r3 = r2
            r6 = r2
            r7 = r2
            r9 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.7JD r0 = new X.7JD
            r0.<init>(r1)
            return r0
        L_0x002c:
            r0 = 13
            goto L_0x0044
        L_0x002f:
            r0 = 15
            goto L_0x0044
        L_0x0032:
            r0 = 9
            goto L_0x0044
        L_0x0035:
            r0 = 14
            goto L_0x0044
        L_0x0038:
            r0 = 1
            goto L_0x0044
        L_0x003a:
            r0 = 0
            goto L_0x0044
        L_0x003c:
            r0 = 5
            goto L_0x0044
        L_0x003e:
            r0 = 6
            goto L_0x0044
        L_0x0040:
            r0 = 8
            goto L_0x0044
        L_0x0043:
            r0 = 7
        L_0x0044:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Fb.A00(X.5kA):X.7JD");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        r2 = com.facebook.graphql.impls.ErrorCallToActionImpl.class;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C92875kA A01(com.facebook.graphql.impls.SharedPaymentsErrorImpl r15) {
        /*
            java.lang.String r0 = "error_code"
            int r14 = r15.getIntValue(r0)
            java.lang.String r0 = "error_title"
            java.lang.String r12 = r15.getStringValue(r0)
            java.lang.String r3 = "Required value was null."
            if (r12 == 0) goto L_0x009c
            java.lang.String r0 = "error_description"
            java.lang.String r13 = r15.getStringValue(r0)
            if (r13 == 0) goto L_0x0097
            java.lang.Class<com.facebook.graphql.impls.SharedPaymentsErrorImpl$PrimaryCta> r1 = com.facebook.graphql.impls.SharedPaymentsErrorImpl.PrimaryCta.class
            java.lang.String r0 = "primary_cta"
            com.facebook.pando.TreeJNI r0 = r15.getTreeValue(r0, r1)
            java.lang.String r4 = ""
            r10 = 0
            if (r0 == 0) goto L_0x0092
            java.lang.Class<com.facebook.graphql.impls.ErrorCallToActionImpl> r2 = com.facebook.graphql.impls.ErrorCallToActionImpl.class
            com.facebook.pando.TreeJNI r0 = r0.reinterpret(r2)
            if (r0 == 0) goto L_0x0092
            java.lang.String r7 = "label"
            java.lang.String r8 = r0.getStringValue(r7)
            if (r8 != 0) goto L_0x0036
            r8 = r4
        L_0x0036:
            X.67N r5 = X.AnonymousClass67N.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r6 = "type"
            java.lang.Enum r1 = X.C86104wH.A0a(r0, r5, r6)
            X.67N r1 = (X.AnonymousClass67N) r1
            if (r1 != 0) goto L_0x0043
            r1 = r5
        L_0x0043:
            X.C04220Ms.A09(r1)
            java.lang.String r3 = "link"
            java.lang.String r0 = r0.getStringValue(r3)
            X.6iz r9 = new X.6iz
            r9.<init>(r1, r8, r0)
            java.lang.Class<com.facebook.graphql.impls.SharedPaymentsErrorImpl$SecondaryCta> r1 = com.facebook.graphql.impls.SharedPaymentsErrorImpl.SecondaryCta.class
            java.lang.String r0 = "secondary_cta"
            com.facebook.pando.TreeJNI r0 = r15.getTreeValue(r0, r1)
            if (r0 == 0) goto L_0x007d
            com.facebook.pando.TreeJNI r2 = r0.reinterpret(r2)
            if (r2 == 0) goto L_0x007d
            java.lang.String r0 = r2.getStringValue(r7)
            if (r0 == 0) goto L_0x0068
            r4 = r0
        L_0x0068:
            java.lang.Enum r1 = X.C86104wH.A0a(r2, r5, r6)
            X.67N r1 = (X.AnonymousClass67N) r1
            if (r1 != 0) goto L_0x0071
            r1 = r5
        L_0x0071:
            X.C04220Ms.A09(r1)
            java.lang.String r0 = r2.getStringValue(r3)
            X.6iz r10 = new X.6iz
            r10.<init>(r1, r4, r0)
        L_0x007d:
            X.66a r1 = X.C966166a.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "error_form_field_id"
            java.lang.Enum r11 = X.C86104wH.A0a(r15, r1, r0)
            X.66a r11 = (X.C966166a) r11
            java.lang.String r0 = "extra_data"
            r15.getStringValue(r0)
            X.5kA r8 = new X.5kA
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x0092:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r3)
            throw r0
        L_0x0097:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r3)
            throw r0
        L_0x009c:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Fb.A01(com.facebook.graphql.impls.SharedPaymentsErrorImpl):X.5kA");
    }

    public static final Throwable A02(FBPayComponentDataQueryResponseImpl fBPayComponentDataQueryResponseImpl) {
        TreeJNI A0I;
        TreeJNI A0M;
        SharedPaymentsErrorImpl sharedPaymentsErrorImpl;
        if (fBPayComponentDataQueryResponseImpl == null || (A0I = C86164wN.A0I(fBPayComponentDataQueryResponseImpl)) == null || (A0M = C86154wM.A0M(A0I, FBPayComponentDataQueryResponseImpl.FetchFbpayComponentData.Error.class)) == null || (sharedPaymentsErrorImpl = (SharedPaymentsErrorImpl) C86124wJ.A0T(A0M)) == null) {
            return null;
        }
        return A01(sharedPaymentsErrorImpl);
    }

    public static final Throwable A03(FBPayECPHandleCheckoutEventMutationResponseImpl fBPayECPHandleCheckoutEventMutationResponseImpl) {
        TreeJNI treeValue;
        ImmutableList treeList;
        TreeJNI treeJNI;
        TreeJNI A0M;
        TreeJNI treeValue2;
        SharedPaymentsErrorImpl sharedPaymentsErrorImpl;
        if (fBPayECPHandleCheckoutEventMutationResponseImpl == null || (treeValue = fBPayECPHandleCheckoutEventMutationResponseImpl.getTreeValue("handle_checkout_event(input:$input)", FBPayECPHandleCheckoutEventMutationResponseImpl.HandleCheckoutEvent.class)) == null || (treeList = treeValue.getTreeList("payment_details_updates", FBPayECPHandleCheckoutEventMutationResponseImpl.HandleCheckoutEvent.PaymentDetailsUpdates.class)) == null || (treeJNI = (TreeJNI) treeList.get(0)) == null || (A0M = C86154wM.A0M(treeJNI, FBPayECPHandleCheckoutEventMutationResponseImpl.HandleCheckoutEvent.PaymentDetailsUpdates.Error.class)) == null || (treeValue2 = A0M.getTreeValue("user_facing_error", FBPayECPHandleCheckoutEventMutationResponseImpl.HandleCheckoutEvent.PaymentDetailsUpdates.Error.UserFacingError.class)) == null || (sharedPaymentsErrorImpl = (SharedPaymentsErrorImpl) C86124wJ.A0T(treeValue2)) == null) {
            return null;
        }
        return A01(sharedPaymentsErrorImpl);
    }
}
