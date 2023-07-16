package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebookpay.expresscheckout.models.ECPAvailabilityRequestParams;
import com.facebookpay.otc.models.OtcInput;
import com.fbpay.logging.LoggingContext;
import com.fbpay.logging.LoggingPolicy;
import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2;

/* renamed from: X.7JB  reason: invalid class name */
public final class AnonymousClass7JB {
    public static final AnonymousClass7JB A00 = new AnonymousClass7JB();

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0170, code lost:
        if (r3 != null) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        if (r2 == null) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A01(X.C110336lW r50, com.facebookpay.otc.models.OtcInput r51, com.fbpay.logging.LoggingPolicy r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, boolean r57) {
        /*
            r49 = 0
            r9 = r53
            r4 = r54
            boolean r7 = X.AnonymousClass0wJ.A1Z(r9, r4)
            r6 = 2
            r1 = r50
            r3 = r55
            X.C18180wK.A1P(r3, r6, r1)
            java.util.UUID r0 = X.C03480Iw.A00()
            java.lang.String r19 = X.C18190wL.A0n(r0)
            com.facebook.graphql.impls.FBPayPaymentConfigImpl r0 = r1.A03
            if (r0 == 0) goto L_0x0036
            X.66Y r5 = X.AnonymousClass66Y.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r2 = "payment_mode"
            java.lang.Enum r2 = X.C86104wH.A0a(r0, r5, r2)
            X.66Y r2 = (X.AnonymousClass66Y) r2
            if (r2 == 0) goto L_0x0036
            int r2 = r2.ordinal()
            if (r2 == r7) goto L_0x00d7
            if (r2 != r6) goto L_0x00d7
            X.68b r2 = X.C971368b.TEST
        L_0x0034:
            if (r2 != 0) goto L_0x0038
        L_0x0036:
            X.68b r2 = X.C971368b.LIVE
        L_0x0038:
            r12 = 0
            java.lang.String r2 = r2.A00
            com.google.common.collect.ImmutableList r15 = X.C86134wK.A0T()
            com.google.common.collect.ImmutableList r16 = X.C86134wK.A0T()
            com.google.common.collect.ImmutableList r17 = X.C86134wK.A0T()
            java.lang.String r22 = "REGULAR"
            X.7Et r11 = new X.7Et
            r14 = r51
            r25 = r56
            r13 = r12
            r21 = r2
            r23 = r12
            r24 = r3
            r26 = r12
            r18 = r9
            r20 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            long r47 = java.lang.Long.parseLong(r4)
            com.facebook.graphql.impls.FBPayLoggingPolicyImpl r5 = r1.A02
            if (r5 == 0) goto L_0x006d
            com.fbpay.logging.LoggingPolicy r43 = X.C122157Kv.A0J(r5)
            if (r43 != 0) goto L_0x006f
        L_0x006d:
            r43 = r52
        L_0x006f:
            X.84Y r45 = X.AnonymousClass84Y.A00
            com.fbpay.logging.LoggingContext r42 = new com.fbpay.logging.LoggingContext
            r44 = r9
            r46 = r45
            r42.<init>(r43, r44, r45, r46, r47, r49)
            if (r57 == 0) goto L_0x00a0
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r10 = X.AnonymousClass7JJ.A02()
            java.lang.String r5 = "ONE_TIME_CHECKOUT_OPTION"
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.of(r5)
            X.C04220Ms.A06(r6)
            r5 = 32759(0x7ff7, float:4.5905E-41)
            X.7Et r8 = X.C121207Et.A00(r11, r12, r6, r5)
            X.6ci r7 = X.AnonymousClass7Kz.A0C()
            r6 = 5
            com.facebook.redex.IDxFunctionShape152S0200000_2_I2 r5 = new com.facebook.redex.IDxFunctionShape152S0200000_2_I2
            r5.<init>(r6, r8, r10)
            X.M5J r5 = X.AnonymousClass5k7.A00(r5, r7)
            X.C04220Ms.A06(r5)
        L_0x00a0:
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            if (r0 == 0) goto L_0x016f
            java.lang.String r37 = "PRE_FETCH"
            com.google.common.collect.ImmutableList r30 = X.C86134wK.A0T()
            X.66Z r7 = X.AnonymousClass66Z.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r6 = "supported_container_types"
            com.google.common.collect.ImmutableList r6 = r0.getEnumList(r6, r7)
            X.C04220Ms.A06(r6)
            java.util.ArrayList r6 = X.C122157Kv.A0L(r6)
            r8 = 10
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0x(r6, r8)
            java.util.Iterator r10 = r6.iterator()
        L_0x00c5:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x00db
            java.lang.Object r6 = r10.next()
            X.692 r6 = (X.AnonymousClass692) r6
            java.lang.String r6 = r6.A00
            r7.add(r6)
            goto L_0x00c5
        L_0x00d7:
            X.68b r2 = X.C971368b.LIVE
            goto L_0x0034
        L_0x00db:
            com.google.common.collect.ImmutableList r31 = X.C18220wO.A0S(r7)
            X.66X r7 = X.AnonymousClass66X.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r6 = "payment_action_types"
            com.google.common.collect.ImmutableList r0 = r0.getEnumList(r6, r7)
            X.C04220Ms.A06(r0)
            java.util.ArrayList r0 = X.C122157Kv.A0M(r0)
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0x(r0, r8)
            java.util.Iterator r7 = r0.iterator()
        L_0x00f6:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x010a
            java.lang.Object r0 = r7.next()
            X.67H r0 = (X.AnonymousClass67H) r0
            java.lang.String r0 = r0.name()
            r6.add(r0)
            goto L_0x00f6
        L_0x010a:
            com.google.common.collect.ImmutableList r32 = X.C18220wO.A0S(r6)
            X.7Et r0 = new X.7Et
            r26 = r0
            r27 = r12
            r28 = r12
            r29 = r14
            r33 = r9
            r34 = r19
            r35 = r4
            r36 = r2
            r38 = r12
            r39 = r3
            r40 = r25
            r41 = r12
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            X.7JB r8 = A00
            com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl r3 = r1.A00
            if (r3 == 0) goto L_0x0170
            com.google.common.collect.ImmutableList r1 = X.AnonymousClass69P.A00(r3)
            if (r1 == 0) goto L_0x0170
            java.util.Set r12 = X.C122157Kv.A0N(r1)
        L_0x013b:
            X.1ze r2 = X.C29991ze.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "request_fields"
            com.google.common.collect.ImmutableList r1 = r3.getEnumList(r1, r2)
            if (r1 == 0) goto L_0x0149
            java.util.Set r13 = X.C122157Kv.A0O(r1)
        L_0x0149:
            r9 = r11
            r10 = r0
            r11 = r42
            java.util.ArrayList r1 = r8.A00(r9, r10, r11, r12, r13)
            r5.addAll(r1)
            X.7JJ r1 = X.AnonymousClass7Kz.A05()
            X.78m r2 = r1.A0C
            java.lang.String r1 = "PERSISTENT_UP_TO_DATE"
            X.6p4 r1 = X.AnonymousClass6I0.A00(r1)
            X.M5J r1 = X.C1200978m.A00(r1, r0, r2)
            A02(r1)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.Any>>"
            X.C04220Ms.A0C(r1, r0)
            r5.add(r1)
        L_0x016f:
            return r5
        L_0x0170:
            if (r3 == 0) goto L_0x0149
            goto L_0x013b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JB.A01(X.6lW, com.facebookpay.otc.models.OtcInput, com.fbpay.logging.LoggingPolicy, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):java.util.ArrayList");
    }

    public static final void A02(M5J m5j) {
        m5j.A0E(C86114wI.A0Q(m5j, 28));
    }

    public final void A04(ECPAvailabilityRequestParams eCPAvailabilityRequestParams, String str) {
        ECPAvailabilityRequestParams eCPAvailabilityRequestParams2 = eCPAvailabilityRequestParams;
        String str2 = eCPAvailabilityRequestParams2.A06;
        String str3 = eCPAvailabilityRequestParams2.A04;
        String str4 = eCPAvailabilityRequestParams2.A03;
        String str5 = str;
        C121207Et r4 = new C121207Et((GQLCallInputCInputShape0S0000000) null, (GQLCallInputCInputShape0S0000000) null, (OtcInput) null, C86134wK.A0T(), C86134wK.A0T(), C86134wK.A0T(), str2, str3, str4, "LIVE", "REGULAR", eCPAvailabilityRequestParams2.A01.A02, (String) null, str5, (String) null);
        long parseLong = Long.parseLong(str4);
        LoggingPolicy loggingPolicy = eCPAvailabilityRequestParams2.A02;
        AnonymousClass84Y r12 = AnonymousClass84Y.A00;
        LoggingContext loggingContext = new LoggingContext(loggingPolicy, str2, r12, r12, parseLong, false);
        A00(r4, C122157Kv.A05(eCPAvailabilityRequestParams2, str5), loggingContext, eCPAvailabilityRequestParams2.A07, eCPAvailabilityRequestParams2.A08);
        C1200978m r2 = AnonymousClass7Kz.A05().A0C;
        A02(C1200978m.A00(AnonymousClass6I0.A00("PERSISTENT_UP_TO_DATE"), C122157Kv.A05(eCPAvailabilityRequestParams2, str5), r2));
    }

    private final ArrayList A00(C121207Et r6, C121207Et r7, LoggingContext loggingContext, Set set, Set set2) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        M5J A01 = C128167j4.A01(r7, AnonymousClass7Kz.A05().A0B, loggingContext, "PERSISTENT_UP_TO_DATE");
        A02(A01);
        C04220Ms.A0C(A01, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.Any>>");
        A0v.add(A01);
        if (set == null || set.contains(AnonymousClass68M.UX_SHIPPING_ADDRESS)) {
            M5J A012 = C128157j3.A01(r6, AnonymousClass7Kz.A05().A0D, loggingContext, "PERSISTENT_UP_TO_DATE", false);
            A02(A012);
            C04220Ms.A0C(A012, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.Any>>");
            A0v.add(A012);
        }
        if (set2 == null || set2.contains(AnonymousClass68F.REQUEST_PAYER_NAME) || set2.contains(AnonymousClass68F.REQUEST_PAYER_EMAIL) || set2.contains(AnonymousClass68F.REQUEST_PAYER_PHONE)) {
            M5J A002 = AnonymousClass7j5.A00(AnonymousClass7Kz.A05().A01, r6, loggingContext, "PERSISTENT_UP_TO_DATE", false);
            A02(A002);
            C04220Ms.A0C(A002, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.Any>>");
            A0v.add(A002);
        }
        C1198377e r2 = AnonymousClass7Kz.A05().A0E;
        C1198377e.A00(r6, r2, "PERSISTENT_UP_TO_5_MINS");
        C880756q A003 = AnonymousClass7IT.A00(r2.A00, AnonymousClass6IY.A00(r6));
        A02(A003);
        C04220Ms.A0C(A003, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.Any>>");
        A0v.add(A003);
        return A0v;
    }

    public static final void A03(String str) {
        C121207Et r4 = new C121207Et((GQLCallInputCInputShape0S0000000) null, (GQLCallInputCInputShape0S0000000) null, (OtcInput) null, C86134wK.A0T(), C86134wK.A0T(), C86134wK.A0T(), "upl_1618557386534_067d12c9-7792-40a7-b49a-f88e8c728846", C18190wL.A0n(C03480Iw.A00()), str, "LIVE", "PRE_WARM", (String) null, (String) null, (String) null, (String) null);
        C83224qz A01 = C121437Gd.A01();
        long parseLong = Long.parseLong(r4.A0B);
        LoggingPolicy loggingPolicy = new LoggingPolicy("payments_offsite_partners", AnonymousClass0wJ.A0v());
        AnonymousClass84Y r12 = AnonymousClass84Y.A00;
        LoggingContext loggingContext = new LoggingContext(loggingPolicy, "upl_1618557386534_067d12c9-7792-40a7-b49a-f88e8c728846", r12, r12, parseLong, false);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape5S0200000_I2((Object) loggingContext, (Object) r4, (C146958n9) null, 9), A01, 3);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape5S0200000_I2((Object) loggingContext, (Object) r4, (C146958n9) null, 10), A01, 3);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape5S0200000_I2((Object) loggingContext, (Object) r4, (C146958n9) null, 11), A01, 3);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape11S0100000_I2(r4, (C146958n9) null, 26), A01, 3);
    }
}
