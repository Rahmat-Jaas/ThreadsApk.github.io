package X;

import com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel;

/* renamed from: X.7Zz  reason: invalid class name and case insensitive filesystem */
public final class C123937Zz implements C143158gC {
    public final /* synthetic */ NotificationsViewModel A00;
    public final /* synthetic */ boolean A01;

    public C123937Zz(NotificationsViewModel notificationsViewModel, boolean z) {
        this.A01 = z;
        this.A00 = notificationsViewModel;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r7v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016f, code lost:
        if (r3 != r20) goto L_0x0171;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r31) {
        /*
            r30 = this;
            r6 = r31
            X.7Kx r6 = (X.AnonymousClass7Kx) r6
            r1 = 0
            X.C04220Ms.A0B(r6, r1)
            r2 = r30
            boolean r8 = r2.A01
            r12 = 1
            r11 = r8 ^ 1
            java.lang.Object r4 = r6.A01
            com.facebook.pando.TreeJNI r4 = (com.facebook.pando.TreeJNI) r4
            r15 = 0
            if (r4 == 0) goto L_0x0046
            java.lang.Class<com.facebook.graphql.impls.NotificationHubQueryResponseImpl$XfbBusinessPaymentsNotificationHub> r3 = com.facebook.graphql.impls.NotificationHubQueryResponseImpl.XfbBusinessPaymentsNotificationHub.class
            java.lang.String r0 = "xfb_business_payments_notification_hub(interface_type:$interface_type,view_name:$view_name)"
            com.facebook.pando.TreeJNI r4 = r4.getTreeValue(r0, r3)
            if (r4 == 0) goto L_0x0046
            java.lang.Class<com.facebook.graphql.impls.NotificationHubQueryResponseImpl$XfbBusinessPaymentsNotificationHub$Notifications> r3 = com.facebook.graphql.impls.NotificationHubQueryResponseImpl.XfbBusinessPaymentsNotificationHub.Notifications.class
            java.lang.String r0 = "notifications(fe_id:$fe_id,filter_notifications_for_subtypes:$subtypes_to_filter,session_id:$session_id)"
            com.google.common.collect.ImmutableList r0 = r4.getTreeList(r0, r3)
            if (r0 == 0) goto L_0x0046
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x0032:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0047
            com.facebook.pando.TreeJNI r4 = X.C18210wN.A0G(r5)
            java.lang.Class<com.facebook.graphql.impls.NotificationFragmentImpl> r0 = com.facebook.graphql.impls.NotificationFragmentImpl.class
            com.facebook.pando.TreeJNI r0 = r4.reinterpret(r0)
            r3.add(r0)
            goto L_0x0032
        L_0x0046:
            r3 = r15
        L_0x0047:
            boolean r0 = X.AnonymousClass7Kx.A0R(r6)
            if (r0 == 0) goto L_0x00d7
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            if (r3 == 0) goto L_0x0088
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r10 = r3.iterator()
        L_0x005b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x008a
            com.facebook.pando.TreeJNI r9 = X.C18210wN.A0G(r10)
            X.21j r5 = X.C304521j.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "notification_source"
            java.lang.Enum r5 = X.C86104wH.A0a(r9, r5, r0)
            X.21j r0 = X.C304521j.PAYOUT_HOLD
            if (r5 != r0) goto L_0x007c
            java.lang.String r0 = "notification_identifier"
            java.lang.String r0 = r9.getStringValue(r0)
            if (r0 == 0) goto L_0x007c
            r4.add(r0)
        L_0x007c:
            java.lang.String r0 = "notification_identifier"
            java.lang.String r0 = r9.getStringValue(r0)
            if (r0 == 0) goto L_0x005b
            r7.add(r0)
            goto L_0x005b
        L_0x0088:
            X.0ZV r7 = X.AnonymousClass0ZV.A00
        L_0x008a:
            com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel r13 = r2.A00
            boolean r0 = X.AnonymousClass0wJ.A1W(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r13.A02 = r0
            r27 = 5950(0x173e, float:8.338E-42)
            java.lang.String r14 = "client_fetch_payouthub_success"
            java.lang.String r23 = "BSC_CLIENT_FETCH_NOTIFICATIONS"
            r16 = r15
            r17 = r15
            r18 = r15
            r19 = r15
            r20 = r15
            r21 = r15
            r22 = r15
            r24 = r15
            r25 = r7
            r26 = r4
            com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.String r5 = "fetch_success"
            X.AnonymousClass7Kz.A06()
            r4 = 667758647(0x27cd3037, float:5.6951205E-15)
            r0 = 10
            X.AnonymousClass7BK.A01(r5, r15, r4, r1, r0)
            if (r8 == 0) goto L_0x00d3
            java.util.List r0 = r13.A04
            boolean r0 = X.C04220Ms.A0I(r7, r0)
            if (r0 == 0) goto L_0x00d4
            r13.A02 = r15
            r0 = 2
            X.AnonymousClass7Kz.A06()
            X.AnonymousClass7BK.A00(r4, r1, r0)
        L_0x00d3:
            r12 = r11
        L_0x00d4:
            r13.A04 = r7
            r11 = r12
        L_0x00d7:
            boolean r0 = X.AnonymousClass7Kx.A0O(r6)
            if (r0 == 0) goto L_0x0124
            java.lang.Throwable r0 = r6.A02
            if (r0 == 0) goto L_0x02f6
            java.lang.String r20 = r0.getMessage()
            java.lang.String r21 = X.AnonymousClass721.A00(r0)
            java.lang.Class r0 = r0.getClass()
            if (r0 == 0) goto L_0x00f3
            java.lang.String r15 = r0.getSimpleName()
        L_0x00f3:
            com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel r7 = r2.A00
            r6 = 0
            r27 = 4350(0x10fe, float:6.096E-42)
            java.lang.String r14 = "client_fetch_payouthub_fail"
            java.lang.String r23 = "BSC_CLIENT_FETCH_NOTIFICATIONS"
            r16 = r6
            r17 = r6
            r18 = r6
            r19 = r6
            r22 = r15
            r24 = r6
            r25 = r6
            r26 = r6
            r13 = r7
            r15 = r6
            com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.String r5 = "fetch_fail"
            X.AnonymousClass7Kz.A06()
            r4 = 667758647(0x27cd3037, float:5.6951205E-15)
            r0 = 10
            X.AnonymousClass7BK.A01(r5, r6, r4, r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7.A02 = r0
        L_0x0124:
            if (r11 == 0) goto L_0x0303
            com.facebookpay.msc.notifications.viewmodel.NotificationsViewModel r5 = r2.A00
            X.56q r0 = r5.A07
            r29 = r0
            X.AnonymousClass7Kz.A0P()
            X.AnonymousClass7Kz.A0P()
            if (r3 == 0) goto L_0x02fc
            int r20 = X.C86104wH.A0B(r3)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r20)
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0w(r3)
            java.util.Iterator r18 = r3.iterator()
            r3 = 0
        L_0x0145:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x02fe
            java.lang.Object r9 = r18.next()
            int r17 = r3 + 1
            if (r3 >= 0) goto L_0x0158
            X.C06750aI.A1A()
            r0 = 0
            throw r0
        L_0x0158:
            com.facebook.pando.TreeJNI r9 = (com.facebook.pando.TreeJNI) r9
            java.lang.String r0 = "notification_identifier"
            java.lang.String r6 = r9.getStringValue(r0)
            if (r6 != 0) goto L_0x0166
            java.lang.String r6 = X.C18230wP.A0h()
        L_0x0166:
            X.C04220Ms.A09(r6)
            if (r19 == 0) goto L_0x0171
            r16 = 1
            r0 = r20
            if (r3 == r0) goto L_0x0173
        L_0x0171:
            r16 = 0
        L_0x0173:
            java.lang.String r14 = "header_content"
            java.lang.String r0 = r9.getStringValue(r14)
            X.7it r12 = X.C128107it.A01(r0)
            r3 = 8
            kotlin.jvm.internal.KtLambdaShape5S1200000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape5S1200000_I2
            r0.<init>(r9, r5, r6, r3)
            X.7JD r4 = new X.7JD
            r4.<init>(r0)
            r0 = 34
            X.5iR r7 = X.AnonymousClass5iR.A00(r0)
            X.5iC r15 = new X.5iC
            r15.<init>()
            java.lang.Class<com.facebook.graphql.impls.NotificationFragmentImpl$Icon> r3 = com.facebook.graphql.impls.NotificationFragmentImpl.Icon.class
            java.lang.String r0 = "icon"
            com.facebook.pando.TreeJNI r3 = r9.getTreeValue(r0, r3)
            if (r3 == 0) goto L_0x02f3
            java.lang.Class<com.facebook.graphql.impls.NotificationIconFragmentImpl> r0 = com.facebook.graphql.impls.NotificationIconFragmentImpl.class
            com.facebook.pando.TreeJNI r3 = r3.reinterpret(r0)
            if (r3 == 0) goto L_0x02f3
            java.lang.String r0 = "uri"
            java.lang.String r3 = r3.getStringValue(r0)
        L_0x01ac:
            r11 = 0
            r10 = 1
            X.7iH r0 = new X.7iH
            r0.<init>(r3, r11, r1, r10)
            r15.A01 = r0
            r0 = 23
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r8 = 2131231239(0x7f080207, float:1.8078553E38)
            r3 = 2131165240(0x7f070038, float:1.7944692E38)
            X.7iI r0 = new X.7iI
            r0.<init>(r11, r13, r8, r3)
            r15.A00 = r0
            X.5iF r8 = X.C128387jU.A03(r15, r7)
            java.lang.String r0 = r9.getStringValue(r14)
            if (r0 == 0) goto L_0x01fd
            int r0 = r0.length()
            if (r0 == 0) goto L_0x01fd
            X.69Q r0 = X.AnonymousClass69Q.PRIMARY_TEXT
            X.C121777Ib.A02(r12, r8, r0)
            r25 = 127(0x7f, float:1.78E-43)
            X.7Eo r3 = new X.7Eo
            r21 = r3
            r22 = r11
            r23 = r11
            r24 = r11
            r26 = r1
            r27 = r1
            r28 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r3.A05 = r10
            r3.A01 = r12
            X.7E5 r0 = new X.7E5
            r0.<init>(r3)
            r8.A06 = r0
        L_0x01fd:
            java.lang.String r0 = "body_content"
            X.7it r12 = X.C128107it.A00(r9, r0)
            X.69Q r3 = X.AnonymousClass69Q.A0U
            X.7Ib r0 = new X.7Ib
            r0.<init>(r11, r12, r3)
            r8.A02 = r0
            java.lang.Class<com.facebook.graphql.impls.NotificationFragmentImpl$Action> r3 = com.facebook.graphql.impls.NotificationFragmentImpl.Action.class
            java.lang.String r0 = "action"
            com.facebook.pando.TreeJNI r0 = r9.getTreeValue(r0, r3)
            if (r0 == 0) goto L_0x0251
            java.lang.String r0 = "button_content"
            X.7it r12 = X.C128107it.A00(r9, r0)
            X.69Q r3 = X.AnonymousClass69Q.A12
            X.7Ib r0 = new X.7Ib
            r0.<init>(r11, r12, r3)
            r8.A03 = r0
            r0 = 24
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r0 = X.C86164wN.A0L(r9, r5, r0)
            r8.A00 = r0
            r25 = 127(0x7f, float:1.78E-43)
            X.7Eo r3 = new X.7Eo
            r21 = r3
            r22 = r11
            r23 = r11
            r24 = r11
            r26 = r1
            r27 = r1
            r28 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r3.A01 = r12
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r3.A02 = r0
            r3.A04 = r10
            X.7E5 r0 = new X.7E5
            r0.<init>(r3)
            r8.A05 = r0
        L_0x0251:
            X.AnonymousClass5iL.A01(r7, r8, r10)
            if (r16 != 0) goto L_0x02c5
            X.5iC r8 = new X.5iC
            r8.<init>()
            java.lang.Integer r14 = X.C86154wM.A0X()
            r0 = 22
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            X.7iJ r0 = new X.7iJ
            r0.<init>(r14, r13, r12, r3)
            r8.A01 = r0
            com.facebook.redex.IDxCListenerShape9S1200000_2_I2 r0 = new com.facebook.redex.IDxCListenerShape9S1200000_2_I2
            r0.<init>(r9, r5, r6, r1)
            r8.A00 = r0
            r25 = 127(0x7f, float:1.78E-43)
            X.7Eo r9 = new X.7Eo
            r21 = r9
            r22 = r11
            r23 = r11
            r24 = r11
            r26 = r1
            r27 = r1
            r28 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r9.A02 = r0
            r9.A04 = r10
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0 = 2131824017(0x7f110d91, float:1.928085E38)
            X.C121187Eo.A00(r9, r3, r0)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0 = 2131824050(0x7f110db2, float:1.9280917E38)
            X.7is r0 = X.C128097is.A00(r3, r0)
            r9.A00 = r0
            r0 = 2131303804(0x7f091d7c, float:1.8225733E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A03 = r0
            X.AnonymousClass7E5.A00(r9, r8)
            r0 = 2131299788(0x7f090dcc, float:1.8217587E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A02 = r0
            X.5iH r0 = new X.5iH
            r0.<init>(r8)
            r7.A06 = r0
        L_0x02c5:
            r3 = 35
            kotlin.jvm.internal.KtLambdaShape25S0100000_I2_5 r0 = new kotlin.jvm.internal.KtLambdaShape25S0100000_I2_5
            r0.<init>(r4, r3)
            r7.A04 = r0
            X.5iX r4 = new X.5iX
            r4.<init>(r7)
            X.5iN r3 = new X.5iN
            r3.<init>()
            java.util.List r0 = r3.A00
            r0.add(r4)
            X.AnonymousClass7Kz.A0Q()
            r3.A03 = r6
            r0 = 2131303802(0x7f091d7a, float:1.8225729E38)
            r3.A00 = r0
            X.5iU r0 = new X.5iU
            r0.<init>(r3)
            r2.add(r0)
            r3 = r17
            goto L_0x0145
        L_0x02f3:
            r3 = 0
            goto L_0x01ac
        L_0x02f6:
            r20 = r15
            r21 = r15
            goto L_0x00f3
        L_0x02fc:
            X.0ZV r2 = X.AnonymousClass0ZV.A00
        L_0x02fe:
            r0 = r29
            r0.A0H(r2)
        L_0x0303:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C123937Zz.onChanged(java.lang.Object):void");
    }
}
