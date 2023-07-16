package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.58W  reason: invalid class name */
public final class AnonymousClass58W extends C62793ak implements C144018hh {
    public C144018hh A00;
    public final M5J A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final C86074wE A05;
    public final boolean A06;
    public final C62543aG A07;
    public final UserSession A08;

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014c, code lost:
        if (X.C04220Ms.A0I(r7, "3pd_trial_inline_opt_out") != false) goto L_0x014e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x020c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass58W(com.instagram.service.session.UserSession r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            r17 = this;
            r8 = r17
            r8.<init>()
            r0 = r18
            r8.A08 = r0
            r9 = r19
            r8.A02 = r9
            r7 = r20
            r8.A03 = r7
            r0 = r21
            r8.A04 = r0
            X.3aG r6 = new X.3aG
            r6.<init>(r8)
            r8.A07 = r6
            r16 = 0
            r5 = 0
            r4 = 5
            java.lang.Integer r2 = X.C62543aG.A02(r9, r5)
            r3 = 2
            X.3Dd r1 = X.C62543aG.A01(r9, r5)
            X.3Dd r0 = X.C62543aG.A00(r9, r5)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2 r10 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2
            r10.<init>((int) r3, (java.lang.Object) r2, (java.lang.Object) r0, (java.lang.Object) r1)
            r0 = 4
            kotlin.jvm.internal.KtLambdaShape4S1100000_I2 r1 = new kotlin.jvm.internal.KtLambdaShape4S1100000_I2
            r1.<init>(r9, r6, r0)
            X.74w r0 = new X.74w
            r0.<init>(r1)
            X.5MH r2 = new X.5MH
            r2.<init>(r10, r0)
            java.lang.String r1 = "3pd_trial_control"
            boolean r0 = X.C04220Ms.A0I(r9, r1)
            if (r0 != 0) goto L_0x02a4
            java.lang.String r0 = "3pd_trial_inline_opt_in"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 != 0) goto L_0x029f
            java.lang.String r0 = "3pd_trial_go_to_settings"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x027f
            r0 = 2131232973(0x7f0808cd, float:1.808207E38)
        L_0x005d:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
        L_0x0061:
            boolean r0 = X.C04220Ms.A0I(r9, r1)
            if (r0 == 0) goto L_0x0236
            r12 = 2131821196(0x7f11028c, float:1.9275128E38)
        L_0x006a:
            java.lang.Object[] r11 = new java.lang.Object[r5]
            X.1kC r0 = new X.1kC
            r0.<init>(r11, r12)
        L_0x0071:
            r11 = 6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r12 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2
            r12.<init>((int) r11, (java.lang.Object) r10, (java.lang.Object) r0)
            java.lang.String r0 = "body_item_one"
            X.5MF r10 = new X.5MF
            r10.<init>(r12, r0)
            boolean r0 = X.C04220Ms.A0I(r9, r1)
            if (r0 != 0) goto L_0x0231
            java.lang.String r0 = "3pd_trial_inline_opt_in"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 != 0) goto L_0x0231
            java.lang.String r0 = "3pd_trial_go_to_settings"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x020c
            r0 = 2131232357(0x7f080665, float:1.808082E38)
        L_0x0097:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
        L_0x009b:
            boolean r0 = X.C04220Ms.A0I(r9, r1)
            if (r0 == 0) goto L_0x01c3
            r14 = 2131821202(0x7f110292, float:1.927514E38)
        L_0x00a4:
            java.lang.Object[] r13 = new java.lang.Object[r5]
            X.1kC r0 = new X.1kC
            r0.<init>(r13, r14)
        L_0x00ab:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r14 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2
            r14.<init>((int) r11, (java.lang.Object) r12, (java.lang.Object) r0)
            java.lang.String r0 = "body_item_two"
            X.5MF r13 = new X.5MF
            r13.<init>(r14, r0)
            r12 = 3
            boolean r0 = X.C04220Ms.A0I(r9, r1)
            if (r0 != 0) goto L_0x01ba
            java.lang.String r0 = "3pd_trial_inline_opt_in"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 != 0) goto L_0x01ba
            java.lang.String r0 = "3pd_trial_go_to_settings"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 != 0) goto L_0x01ba
            java.lang.String r0 = "fewer_ads_test_group_content"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 != 0) goto L_0x01ba
            java.lang.String r0 = "fewer_ads_control_group_content"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 != 0) goto L_0x01ba
            java.lang.String r0 = "activity_feed_notification_3PD_content"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 != 0) goto L_0x01ba
            r14 = 0
        L_0x00e7:
            boolean r0 = X.C04220Ms.A0I(r9, r1)
            if (r0 == 0) goto L_0x0171
            r15 = 2131821199(0x7f11028f, float:1.9275134E38)
        L_0x00f0:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.1kC r0 = new X.1kC
            r0.<init>(r1, r15)
        L_0x00f7:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2
            r1.<init>((int) r11, (java.lang.Object) r14, (java.lang.Object) r0)
            java.lang.String r0 = "body_item_three"
            X.5MF r11 = new X.5MF
            r11.<init>(r1, r0)
            java.lang.String r1 = "3pd_trial_inline_opt_in"
            boolean r0 = X.C04220Ms.A0I(r9, r1)
            if (r0 == 0) goto L_0x0152
            r14 = 2131821203(0x7f110293, float:1.9275143E38)
        L_0x010e:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            X.1kC r0 = new X.1kC
            r0.<init>(r5, r14)
        L_0x0115:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2 r5 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2
            r5.<init>((java.lang.Object) r0, (int) r3)
            kotlin.jvm.internal.KtLambdaShape4S1100000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape4S1100000_I2
            r0.<init>(r9, r6, r4)
            X.74v r3 = new X.74v
            r3.<init>(r0)
            X.5MG r0 = new X.5MG
            r0.<init>(r5, r3)
            X.MfV[] r0 = new X.C41882MfV[]{r2, r10, r13, r11, r0}
            java.util.List r0 = X.C06750aI.A17(r0)
            X.Enn r2 = X.C18190wL.A0z(r0)
            r8.A05 = r2
            r0 = r16
            X.M5J r0 = X.C29110FiC.A00(r0, r2, r12)
            r8.A01 = r0
            boolean r0 = X.C04220Ms.A0I(r7, r1)
            if (r0 != 0) goto L_0x014e
            java.lang.String r0 = "3pd_trial_inline_opt_out"
            boolean r1 = X.C04220Ms.A0I(r7, r0)
            r0 = 0
            if (r1 == 0) goto L_0x014f
        L_0x014e:
            r0 = 1
        L_0x014f:
            r8.A06 = r0
            return
        L_0x0152:
            java.lang.String r0 = "fewer_ads_test_group_content"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x015e
            r14 = 2131827468(0x7f111b0c, float:1.928785E38)
            goto L_0x010e
        L_0x015e:
            java.lang.String r0 = "fewer_ads_control_group_content"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x016a
            r14 = 2131827461(0x7f111b05, float:1.9287835E38)
            goto L_0x010e
        L_0x016a:
            java.lang.String r0 = ""
            X.3Dd r0 = X.AnonymousClass2LU.A00(r0)
            goto L_0x0115
        L_0x0171:
            java.lang.String r0 = "3pd_trial_inline_opt_in"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x017e
            r15 = 2131821197(0x7f11028d, float:1.927513E38)
            goto L_0x00f0
        L_0x017e:
            java.lang.String r0 = "3pd_trial_go_to_settings"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x018b
            r15 = 2131821198(0x7f11028e, float:1.9275132E38)
            goto L_0x00f0
        L_0x018b:
            java.lang.String r0 = "fewer_ads_test_group_content"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x0198
            r15 = 2131827466(0x7f111b0a, float:1.9287845E38)
            goto L_0x00f0
        L_0x0198:
            java.lang.String r0 = "fewer_ads_control_group_content"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x01a5
            r15 = 2131827459(0x7f111b03, float:1.9287831E38)
            goto L_0x00f0
        L_0x01a5:
            java.lang.String r0 = "activity_feed_notification_3PD_content"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x01b2
            r15 = 2131820966(0x7f1101a6, float:1.9274662E38)
            goto L_0x00f0
        L_0x01b2:
            java.lang.String r0 = ""
            X.3Dd r0 = X.AnonymousClass2LU.A00(r0)
            goto L_0x00f7
        L_0x01ba:
            r0 = 2131232771(0x7f080803, float:1.808166E38)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            goto L_0x00e7
        L_0x01c3:
            java.lang.String r0 = "3pd_trial_inline_opt_in"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x01d0
            r14 = 2131821200(0x7f110290, float:1.9275136E38)
            goto L_0x00a4
        L_0x01d0:
            java.lang.String r0 = "3pd_trial_go_to_settings"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x01dd
            r14 = 2131821201(0x7f110291, float:1.9275138E38)
            goto L_0x00a4
        L_0x01dd:
            java.lang.String r0 = "fewer_ads_test_group_content"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x01ea
            r14 = 2131827467(0x7f111b0b, float:1.9287847E38)
            goto L_0x00a4
        L_0x01ea:
            java.lang.String r0 = "fewer_ads_control_group_content"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x01f7
            r14 = 2131827460(0x7f111b04, float:1.9287833E38)
            goto L_0x00a4
        L_0x01f7:
            java.lang.String r0 = "activity_feed_notification_3PD_content"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x0204
            r14 = 2131820967(0x7f1101a7, float:1.9274664E38)
            goto L_0x00a4
        L_0x0204:
            java.lang.String r0 = ""
            X.3Dd r0 = X.AnonymousClass2LU.A00(r0)
            goto L_0x00ab
        L_0x020c:
            java.lang.String r0 = "fewer_ads_test_group_content"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x0219
            r0 = 2131232459(0x7f0806cb, float:1.8081028E38)
            goto L_0x0097
        L_0x0219:
            java.lang.String r0 = "fewer_ads_control_group_content"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x0226
            r0 = 2131232468(0x7f0806d4, float:1.8081046E38)
            goto L_0x0097
        L_0x0226:
            java.lang.String r0 = "activity_feed_notification_3PD_content"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 != 0) goto L_0x0231
            r12 = 0
            goto L_0x009b
        L_0x0231:
            r0 = 2131232973(0x7f0808cd, float:1.808207E38)
            goto L_0x0097
        L_0x0236:
            java.lang.String r0 = "3pd_trial_inline_opt_in"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x0243
            r12 = 2131821194(0x7f11028a, float:1.9275124E38)
            goto L_0x006a
        L_0x0243:
            java.lang.String r0 = "3pd_trial_go_to_settings"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x0250
            r12 = 2131821195(0x7f11028b, float:1.9275126E38)
            goto L_0x006a
        L_0x0250:
            java.lang.String r0 = "fewer_ads_test_group_content"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x025d
            r12 = 2131827465(0x7f111b09, float:1.9287843E38)
            goto L_0x006a
        L_0x025d:
            java.lang.String r0 = "fewer_ads_control_group_content"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x026a
            r12 = 2131827458(0x7f111b02, float:1.928783E38)
            goto L_0x006a
        L_0x026a:
            java.lang.String r0 = "activity_feed_notification_3PD_content"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x0277
            r12 = 2131820965(0x7f1101a5, float:1.927466E38)
            goto L_0x006a
        L_0x0277:
            java.lang.String r0 = ""
            X.3Dd r0 = X.AnonymousClass2LU.A00(r0)
            goto L_0x0071
        L_0x027f:
            java.lang.String r0 = "fewer_ads_test_group_content"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 != 0) goto L_0x02a4
            java.lang.String r0 = "fewer_ads_control_group_content"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 == 0) goto L_0x0294
            r0 = 2131232637(0x7f08077d, float:1.8081389E38)
            goto L_0x005d
        L_0x0294:
            java.lang.String r0 = "activity_feed_notification_3PD_content"
            boolean r0 = X.C04220Ms.A0I(r9, r0)
            if (r0 != 0) goto L_0x029f
            r10 = 0
            goto L_0x0061
        L_0x029f:
            r0 = 2131232357(0x7f080665, float:1.808082E38)
            goto L_0x005d
        L_0x02a4:
            r0 = 2131232204(0x7f0805cc, float:1.808051E38)
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58W.<init>(com.instagram.service.session.UserSession, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void C1m(String str) {
        C144018hh r0 = this.A00;
        if (r0 != null) {
            r0.C1m(str);
        }
    }
}
