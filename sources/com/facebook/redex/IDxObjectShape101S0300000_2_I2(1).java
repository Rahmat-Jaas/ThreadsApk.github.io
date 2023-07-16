package com.facebook.redex;

import X.AnonymousClass0YY;
import kotlin.Function;

public class IDxObjectShape101S0300000_2_I2 implements Function, AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxObjectShape101S0300000_2_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: X.6p6} */
    /* JADX WARNING: type inference failed for: r13v0 */
    /* JADX WARNING: type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: type inference failed for: r13v10, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r13v12 */
    /* JADX WARNING: type inference failed for: r13v15 */
    /* JADX WARNING: type inference failed for: r13v16 */
    /* JADX WARNING: type inference failed for: r13v17 */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03c3, code lost:
        throw X.C18190wL.A0a(X.AnonymousClass00U.A0L("Unsupported authentication step type:", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x07b3, code lost:
        r1.A00 = r2.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x07bd, code lost:
        return r1.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x07e6, code lost:
        X.C1199777w.A00(r2, r1, 2131827259);
        r1.A01 = r2.getString(2131827258);
        r0 = 2131827244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0897, code lost:
        r1.A05 = r3.getString(r0);
        r0 = 2131827210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x08a0, code lost:
        r1.A03 = r3.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x08a6, code lost:
        r0 = java.util.Collections.unmodifiableList(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x08aa, code lost:
        r1.A07 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x08ac, code lost:
        r1.A04 = r3.getString(2131821647);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x08b9, code lost:
        return r1.A01();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r24) {
        /*
            r23 = this;
            r4 = r23
            r3 = r24
            int r0 = r4.A03
            if (r0 == 0) goto L_0x001b
            java.lang.Object r2 = r4.A00
            X.M5p r2 = (X.C41253M5p) r2
            java.lang.Object r1 = r4.A01
            X.GDr r1 = (X.C30441GDr) r1
            java.lang.Object r0 = r4.A02
            X.GBb r0 = (X.C30378GBb) r0
            X.8n9 r3 = (X.C146958n9) r3
            java.lang.Object r13 = X.C41253M5p.A00(r1, r2, r0, r3)
        L_0x001a:
            return r13
        L_0x001b:
            X.7Kx r3 = (X.AnonymousClass7Kx) r3
            java.lang.Object r0 = r4.A01
            X.6c4 r0 = (X.C104616c4) r0
            android.os.Bundle r0 = r0.A00
            java.lang.String r9 = "BUNDLE_KEY_TERTIARY_FLOW_TYPE"
            java.lang.String r8 = "NONE"
            java.lang.String r1 = r0.getString(r9, r8)
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x0155
            java.lang.String r2 = r0.getString(r9, r8)
        L_0x0035:
            java.lang.String r1 = r0.getString(r9, r8)
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x0141
            java.lang.String r1 = "BUNDLE_KEY_TERTIARY_FLOW_STEP_TYPE"
        L_0x0041:
            java.lang.String r1 = r0.getString(r1, r8)
            java.lang.Object r5 = r3.A01
            r13 = 0
            if (r5 == 0) goto L_0x037c
            X.79P r5 = (X.AnonymousClass79P) r5
            java.lang.Object r6 = r5.A00
            if (r6 == 0) goto L_0x037c
            java.lang.Object r10 = r5.A01
            if (r10 == 0) goto L_0x037c
            com.facebook.graphql.impls.FBPayAuthenticationFlowImpl r6 = (com.facebook.graphql.impls.FBPayAuthenticationFlowImpl) r6
            com.facebook.graphql.impls.FBPayAuthFlowsContentQueryFragmentImpl$FbpayAuthenticationInformationQuery$AuthenticationInformation r10 = (com.facebook.graphql.impls.FBPayAuthFlowsContentQueryFragmentImpl.FbpayAuthenticationInformationQuery.AuthenticationInformation) r10
            java.lang.String r12 = "BUNDLE_KEY_SECONDARY_FLOW_TYPE"
            java.lang.String r5 = r0.getString(r12, r8)
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x010f
            java.lang.String r5 = "BUNDLE_KEY_PRIMARY_FLOW_STEP_TYPE"
            java.lang.String r5 = r0.getString(r5, r8)
            com.facebook.graphql.impls.FBPayAuthenticationFlowImpl$Steps r6 = X.AnonymousClass7IP.A01(r6, r5)
        L_0x006e:
            if (r6 == 0) goto L_0x037c
            X.1zh r9 = X.C30021zh.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r7 = "screen_type"
            java.lang.Enum r5 = X.C86104wH.A0a(r6, r9, r7)
            if (r5 == 0) goto L_0x037c
            X.69I r11 = X.AnonymousClass69I.A01
            java.lang.String r8 = "content_type"
            java.lang.Enum r5 = X.C86104wH.A0a(r6, r11, r8)
            if (r5 == 0) goto L_0x037c
            java.lang.Enum r5 = X.C86104wH.A0a(r6, r9, r7)
            X.1zh r5 = (X.C30021zh) r5
            int r7 = r5.ordinal()
            r5 = 2
            if (r7 == r5) goto L_0x022b
            r5 = 3
            if (r7 == r5) goto L_0x01a4
            r5 = 1
            if (r7 == r5) goto L_0x031f
            r5 = 4
            if (r7 != r5) goto L_0x037c
            java.lang.Class<com.facebook.graphql.impls.FBPayAuthFlowsContentQueryFragmentImpl$FbpayAuthenticationInformationQuery$AuthenticationInformation$VerificationScreens> r7 = com.facebook.graphql.impls.FBPayAuthFlowsContentQueryFragmentImpl.FbpayAuthenticationInformationQuery.AuthenticationInformation.VerificationScreens.class
            java.lang.String r5 = "verification_screens"
            X.83w r10 = X.C18250wR.A0G(r10, r7, r5)
        L_0x00a2:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x037c
            com.facebook.pando.TreeJNI r7 = X.C18210wN.A0G(r10)
            java.lang.Class<com.facebook.graphql.impls.VerificationScreenImpl> r5 = com.facebook.graphql.impls.VerificationScreenImpl.class
            com.facebook.pando.TreeJNI r7 = r7.reinterpret(r5)
            java.lang.Enum r9 = X.C86104wH.A0a(r6, r11, r8)
            java.lang.Enum r5 = X.C86104wH.A0a(r7, r11, r8)
            if (r9 != r5) goto L_0x00a2
            java.lang.Class<com.facebook.graphql.impls.VerificationScreenImpl$Title> r8 = com.facebook.graphql.impls.VerificationScreenImpl.Title.class
            java.lang.String r6 = "title"
            com.facebook.pando.TreeJNI r5 = r7.getTreeValue(r6, r8)
            if (r5 == 0) goto L_0x010c
            com.facebook.pando.TreeJNI r5 = r7.getTreeValue(r6, r8)
            java.lang.String r21 = X.C86144wL.A0q(r5)
        L_0x00ce:
            java.lang.Class<com.facebook.graphql.impls.VerificationScreenImpl$Subtitle> r6 = com.facebook.graphql.impls.VerificationScreenImpl.Subtitle.class
            java.lang.String r5 = "subtitle"
            java.lang.String r19 = X.C86104wH.A0s(r7, r6, r5)
            java.lang.Class<com.facebook.graphql.impls.VerificationScreenImpl$Description> r6 = com.facebook.graphql.impls.VerificationScreenImpl.Description.class
            java.lang.String r5 = "description"
            java.lang.String r17 = X.C86104wH.A0s(r7, r6, r5)
            java.lang.Class<com.facebook.graphql.impls.VerificationScreenImpl$ButtonLabel> r6 = com.facebook.graphql.impls.VerificationScreenImpl.ButtonLabel.class
            java.lang.String r5 = "button_label"
            java.lang.String r16 = X.C86104wH.A0s(r7, r6, r5)
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
            java.lang.Class<com.facebook.graphql.impls.VerificationScreenImpl$ErrorMessages> r6 = com.facebook.graphql.impls.VerificationScreenImpl.ErrorMessages.class
            java.lang.String r5 = "error_messages"
            X.83w r10 = X.C18250wR.A0G(r7, r6, r5)
        L_0x00f2:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x015d
            com.facebook.pando.TreeJNI r8 = X.C18210wN.A0G(r10)
            java.lang.String r6 = "text"
            java.lang.String r5 = r8.getStringValue(r6)
            if (r5 == 0) goto L_0x08d3
            java.lang.String r5 = r8.getStringValue(r6)
            r9.add(r5)
            goto L_0x00f2
        L_0x010c:
            r21 = r13
            goto L_0x00ce
        L_0x010f:
            java.lang.String r5 = r0.getString(r9, r8)
            boolean r11 = r8.equals(r5)
            java.lang.String r5 = "BUNDLE_KEY_PRIMARY_FLOW_STEP_TYPE"
            java.lang.String r5 = r0.getString(r5, r8)
            com.facebook.graphql.impls.FBPayAuthenticationFlowImpl$Steps r7 = X.AnonymousClass7IP.A01(r6, r5)
            java.lang.String r6 = r0.getString(r12, r8)
            java.lang.String r5 = "BUNDLE_KEY_SECONDARY_FLOW_STEP_TYPE"
            java.lang.String r5 = r0.getString(r5, r8)
            if (r11 != 0) goto L_0x013b
            com.facebook.graphql.impls.FBPayAuthenticationFlowImpl$Steps r7 = X.AnonymousClass7IP.A00(r10, r7, r6, r5)
            java.lang.String r6 = r0.getString(r9, r8)
            java.lang.String r5 = "BUNDLE_KEY_TERTIARY_FLOW_STEP_TYPE"
            java.lang.String r5 = r0.getString(r5, r8)
        L_0x013b:
            com.facebook.graphql.impls.FBPayAuthenticationFlowImpl$Steps r6 = X.AnonymousClass7IP.A00(r10, r7, r6, r5)
            goto L_0x006e
        L_0x0141:
            java.lang.String r1 = "BUNDLE_KEY_SECONDARY_FLOW_TYPE"
            java.lang.String r1 = r0.getString(r1, r8)
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x0151
            java.lang.String r1 = "BUNDLE_KEY_SECONDARY_FLOW_STEP_TYPE"
            goto L_0x0041
        L_0x0151:
            java.lang.String r1 = "BUNDLE_KEY_PRIMARY_FLOW_STEP_TYPE"
            goto L_0x0041
        L_0x0155:
            java.lang.String r1 = "BUNDLE_KEY_SECONDARY_FLOW_TYPE"
            java.lang.String r2 = r0.getString(r1, r8)
            goto L_0x0035
        L_0x015d:
            java.util.List r5 = java.util.Collections.unmodifiableList(r9)
            java.util.List r22 = java.util.Collections.unmodifiableList(r5)
            java.lang.Class<com.facebook.graphql.impls.VerificationScreenImpl$EditTextFieldTitle> r6 = com.facebook.graphql.impls.VerificationScreenImpl.EditTextFieldTitle.class
            java.lang.String r5 = "edit_text_field_title"
            java.lang.String r18 = X.C86104wH.A0s(r7, r6, r5)
            java.lang.Class<com.facebook.graphql.impls.VerificationScreenImpl$Terms> r6 = com.facebook.graphql.impls.VerificationScreenImpl.Terms.class
            java.lang.String r8 = "terms"
            com.facebook.pando.TreeJNI r5 = r7.getTreeValue(r8, r6)
            if (r5 == 0) goto L_0x0185
            com.facebook.pando.TreeJNI r8 = r7.getTreeValue(r8, r6)
            java.lang.Class<com.facebook.graphql.impls.FBPayLinkableTextImpl> r5 = com.facebook.graphql.impls.FBPayLinkableTextImpl.class
            com.facebook.pando.TreeJNI r5 = r8.reinterpret(r5)
            java.lang.String r13 = X.C86144wL.A0q(r5)
        L_0x0185:
            X.6p6 r15 = X.C86114wI.A0S(r7, r6)
            boolean r5 = android.text.TextUtils.isEmpty(r21)
            if (r5 != 0) goto L_0x08da
            boolean r5 = android.text.TextUtils.isEmpty(r19)
            if (r5 != 0) goto L_0x08da
            boolean r5 = android.text.TextUtils.isEmpty(r17)
            if (r5 != 0) goto L_0x08da
            X.6ma r14 = new X.6ma
            r20 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x037b
        L_0x01a4:
            java.lang.Class<com.facebook.graphql.impls.FBPayAuthFlowsContentQueryFragmentImpl$FbpayAuthenticationInformationQuery$AuthenticationInformation$RecoveryScreens> r7 = com.facebook.graphql.impls.FBPayAuthFlowsContentQueryFragmentImpl.FbpayAuthenticationInformationQuery.AuthenticationInformation.RecoveryScreens.class
            java.lang.String r5 = "recovery_screens"
            X.83w r10 = X.C18250wR.A0G(r10, r7, r5)
        L_0x01ac:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x037c
            com.facebook.pando.TreeJNI r7 = X.C18210wN.A0G(r10)
            java.lang.Class<com.facebook.graphql.impls.PINRecoveryWithPasswordScreenImpl> r5 = com.facebook.graphql.impls.PINRecoveryWithPasswordScreenImpl.class
            com.facebook.pando.TreeJNI r5 = r7.reinterpret(r5)
            java.lang.Enum r9 = X.C86104wH.A0a(r6, r11, r8)
            java.lang.Enum r7 = X.C86104wH.A0a(r5, r11, r8)
            if (r9 != r7) goto L_0x01ac
            java.lang.Class<com.facebook.graphql.impls.PINRecoveryWithPasswordScreenImpl$Title> r9 = com.facebook.graphql.impls.PINRecoveryWithPasswordScreenImpl.Title.class
            java.lang.String r8 = "title"
            com.facebook.pando.TreeJNI r7 = r5.getTreeValue(r8, r9)
            r18 = 0
            if (r7 == 0) goto L_0x01da
            com.facebook.pando.TreeJNI r7 = r5.getTreeValue(r8, r9)
            java.lang.String r13 = X.C86144wL.A0q(r7)
        L_0x01da:
            java.lang.Class<com.facebook.graphql.impls.PINRecoveryWithPasswordScreenImpl$Subtitle> r8 = com.facebook.graphql.impls.PINRecoveryWithPasswordScreenImpl.Subtitle.class
            java.lang.String r7 = "subtitle"
            java.lang.String r20 = X.C86104wH.A0s(r5, r8, r7)
            java.lang.Class<com.facebook.graphql.impls.PINRecoveryWithPasswordScreenImpl$Description> r8 = com.facebook.graphql.impls.PINRecoveryWithPasswordScreenImpl.Description.class
            java.lang.String r7 = "description"
            java.lang.String r16 = X.C86104wH.A0s(r5, r8, r7)
            java.lang.Class<com.facebook.graphql.impls.PINRecoveryWithPasswordScreenImpl$ActionText> r8 = com.facebook.graphql.impls.PINRecoveryWithPasswordScreenImpl.ActionText.class
            java.lang.String r7 = "action_text"
            java.lang.String r15 = X.C86104wH.A0s(r5, r8, r7)
            java.lang.String r19 = X.AnonymousClass7IP.A03(r6)
            java.lang.Class<com.facebook.graphql.impls.PINRecoveryWithPasswordScreenImpl$EditFieldHint> r7 = com.facebook.graphql.impls.PINRecoveryWithPasswordScreenImpl.EditFieldHint.class
            java.lang.String r6 = "edit_field_hint"
            java.lang.String r17 = X.C86104wH.A0s(r5, r7, r6)
            java.lang.Class<com.facebook.graphql.impls.PINRecoveryWithPasswordScreenImpl$ErrorMessage> r8 = com.facebook.graphql.impls.PINRecoveryWithPasswordScreenImpl.ErrorMessage.class
            java.lang.String r7 = "error_message"
            com.facebook.pando.TreeJNI r6 = r5.getTreeValue(r7, r8)
            if (r6 == 0) goto L_0x0210
            com.facebook.pando.TreeJNI r5 = r5.getTreeValue(r7, r8)
            java.lang.String r18 = X.C86144wL.A0q(r5)
        L_0x0210:
            boolean r5 = android.text.TextUtils.isEmpty(r13)
            if (r5 != 0) goto L_0x08e1
            boolean r5 = android.text.TextUtils.isEmpty(r20)
            if (r5 != 0) goto L_0x08e1
            boolean r5 = android.text.TextUtils.isEmpty(r16)
            if (r5 != 0) goto L_0x08e1
            X.6mP r14 = new X.6mP
            r21 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x037b
        L_0x022b:
            java.lang.Class<com.facebook.graphql.impls.FBPayAuthFlowsContentQueryFragmentImpl$FbpayAuthenticationInformationQuery$AuthenticationInformation$PinScreens> r7 = com.facebook.graphql.impls.FBPayAuthFlowsContentQueryFragmentImpl.FbpayAuthenticationInformationQuery.AuthenticationInformation.PinScreens.class
            java.lang.String r5 = "pin_screens"
            X.83w r10 = X.C18250wR.A0G(r10, r7, r5)
        L_0x0233:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x037c
            com.facebook.pando.TreeJNI r7 = X.C18210wN.A0G(r10)
            java.lang.Class<com.facebook.graphql.impls.PINScreenImpl> r5 = com.facebook.graphql.impls.PINScreenImpl.class
            com.facebook.pando.TreeJNI r9 = r7.reinterpret(r5)
            java.lang.Enum r5 = X.C86104wH.A0a(r9, r11, r8)
            r5.getClass()
            java.lang.Enum r7 = X.C86104wH.A0a(r6, r11, r8)
            java.lang.Enum r5 = X.C86104wH.A0a(r9, r11, r8)
            if (r7 != r5) goto L_0x0233
            X.78I r8 = new X.78I
            r8.<init>()
            java.lang.Class<com.facebook.graphql.impls.PINScreenImpl$Title> r10 = com.facebook.graphql.impls.PINScreenImpl.Title.class
            java.lang.String r7 = "title"
            com.facebook.pando.TreeJNI r5 = r9.getTreeValue(r7, r10)
            if (r5 == 0) goto L_0x02df
            com.facebook.pando.TreeJNI r5 = r9.getTreeValue(r7, r10)
            java.lang.String r5 = X.C86144wL.A0q(r5)
        L_0x026b:
            r8.A06 = r5
            java.lang.Class<com.facebook.graphql.impls.PINScreenImpl$Subtitle> r7 = com.facebook.graphql.impls.PINScreenImpl.Subtitle.class
            java.lang.String r5 = "subtitle"
            java.lang.String r5 = X.C86104wH.A0s(r9, r7, r5)
            r8.A05 = r5
            java.lang.Class<com.facebook.graphql.impls.PINScreenImpl$Description> r11 = com.facebook.graphql.impls.PINScreenImpl.Description.class
            java.lang.String r10 = "description"
            com.facebook.pando.TreeJNI r5 = r9.getTreeValue(r10, r11)
            if (r5 == 0) goto L_0x02dd
            com.facebook.pando.TreeJNI r7 = r9.getTreeValue(r10, r11)
            java.lang.Class<com.facebook.graphql.impls.FBPayLinkableTextImpl> r5 = com.facebook.graphql.impls.FBPayLinkableTextImpl.class
            com.facebook.pando.TreeJNI r5 = r7.reinterpret(r5)
            java.lang.String r5 = X.C86144wL.A0q(r5)
        L_0x028f:
            r8.A03 = r5
            com.facebook.pando.TreeJNI r5 = r9.getTreeValue(r10, r11)
            if (r5 == 0) goto L_0x02b5
            com.facebook.pando.TreeJNI r5 = r9.getTreeValue(r10, r11)
            java.lang.Class<com.facebook.graphql.impls.FBPayLinkableTextImpl> r7 = com.facebook.graphql.impls.FBPayLinkableTextImpl.class
            com.facebook.pando.TreeJNI r5 = r5.reinterpret(r7)
            java.lang.String r5 = X.C86144wL.A0q(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x02b5
            com.facebook.pando.TreeJNI r5 = X.C86144wL.A0M(r9, r11, r7, r10)
            com.facebook.graphql.impls.FBPayLinkableTextImpl r5 = (com.facebook.graphql.impls.FBPayLinkableTextImpl) r5
            X.6p6 r13 = X.AnonymousClass7IP.A02(r5)
        L_0x02b5:
            r8.A00 = r13
            java.util.ArrayList r12 = X.AnonymousClass0wJ.A0v()
            java.lang.Class<com.facebook.graphql.impls.PINScreenImpl$ErrorMessages> r7 = com.facebook.graphql.impls.PINScreenImpl.ErrorMessages.class
            java.lang.String r5 = "error_messages"
            X.83w r11 = X.C18250wR.A0G(r9, r7, r5)
        L_0x02c3:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x02e1
            com.facebook.pando.TreeJNI r10 = X.C18210wN.A0G(r11)
            java.lang.String r7 = "text"
            java.lang.String r5 = r10.getStringValue(r7)
            if (r5 == 0) goto L_0x08e8
            java.lang.String r5 = r10.getStringValue(r7)
            r12.add(r5)
            goto L_0x02c3
        L_0x02dd:
            r5 = r13
            goto L_0x028f
        L_0x02df:
            r5 = r13
            goto L_0x026b
        L_0x02e1:
            java.util.List r5 = java.util.Collections.unmodifiableList(r12)
            java.util.List r5 = java.util.Collections.unmodifiableList(r5)
            r8.A07 = r5
            java.lang.String r5 = X.AnonymousClass7IP.A03(r6)
            r8.A02 = r5
            java.lang.Class<com.facebook.graphql.impls.PINScreenImpl$EditTextFieldTitle> r6 = com.facebook.graphql.impls.PINScreenImpl.EditTextFieldTitle.class
            java.lang.String r5 = "edit_text_field_title"
            java.lang.String r5 = X.C86104wH.A0s(r9, r6, r5)
            r8.A04 = r5
            java.lang.Class<com.facebook.graphql.impls.PINScreenImpl$Terms> r7 = com.facebook.graphql.impls.PINScreenImpl.Terms.class
            java.lang.String r6 = "terms"
            com.facebook.pando.TreeJNI r5 = r9.getTreeValue(r6, r7)
            if (r5 == 0) goto L_0x0314
            com.facebook.pando.TreeJNI r6 = r9.getTreeValue(r6, r7)
            java.lang.Class<com.facebook.graphql.impls.FBPayLinkableTextImpl> r5 = com.facebook.graphql.impls.FBPayLinkableTextImpl.class
            com.facebook.pando.TreeJNI r6 = r6.reinterpret(r5)
            java.lang.String r5 = "text"
            r6.getStringValue(r5)
        L_0x0314:
            X.6p6 r5 = X.C86114wI.A0S(r9, r7)
            r8.A01 = r5
            X.6mb r14 = r8.A01()
            goto L_0x037b
        L_0x031f:
            java.lang.Class<com.facebook.graphql.impls.FBPayAuthFlowsContentQueryFragmentImpl$FbpayAuthenticationInformationQuery$AuthenticationInformation$DialogScreens> r7 = com.facebook.graphql.impls.FBPayAuthFlowsContentQueryFragmentImpl.FbpayAuthenticationInformationQuery.AuthenticationInformation.DialogScreens.class
            java.lang.String r5 = "dialog_screens"
            X.83w r10 = X.C18250wR.A0G(r10, r7, r5)
        L_0x0327:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x037c
            com.facebook.pando.TreeJNI r7 = X.C18210wN.A0G(r10)
            java.lang.Class<com.facebook.graphql.impls.AuthDialogScreenImpl> r5 = com.facebook.graphql.impls.AuthDialogScreenImpl.class
            com.facebook.pando.TreeJNI r9 = r7.reinterpret(r5)
            java.lang.Enum r7 = X.C86104wH.A0a(r6, r11, r8)
            java.lang.Enum r5 = X.C86104wH.A0a(r9, r11, r8)
            if (r7 != r5) goto L_0x0327
            X.77w r8 = new X.77w
            r8.<init>()
            java.lang.Class<com.facebook.graphql.impls.AuthDialogScreenImpl$Title> r6 = com.facebook.graphql.impls.AuthDialogScreenImpl.Title.class
            java.lang.String r5 = "title"
            java.lang.String r5 = X.C86104wH.A0s(r9, r6, r5)
            r8.A02 = r5
            java.lang.Class<com.facebook.graphql.impls.AuthDialogScreenImpl$Subtitle> r6 = com.facebook.graphql.impls.AuthDialogScreenImpl.Subtitle.class
            java.lang.String r5 = "subtitle"
            java.lang.String r5 = X.C86104wH.A0s(r9, r6, r5)
            r8.A01 = r5
            java.lang.Class<com.facebook.graphql.impls.AuthDialogScreenImpl$Option1> r6 = com.facebook.graphql.impls.AuthDialogScreenImpl.Option1.class
            java.lang.String r5 = "option1"
            java.lang.String r5 = X.C86104wH.A0s(r9, r6, r5)
            r8.A00 = r5
            java.lang.Class<com.facebook.graphql.impls.AuthDialogScreenImpl$Option2> r7 = com.facebook.graphql.impls.AuthDialogScreenImpl.Option2.class
            java.lang.String r6 = "option2"
            com.facebook.pando.TreeJNI r5 = r9.getTreeValue(r6, r7)
            if (r5 == 0) goto L_0x0377
            com.facebook.pando.TreeJNI r6 = r9.getTreeValue(r6, r7)
            java.lang.String r5 = "text"
            r6.getStringValue(r5)
        L_0x0377:
            X.6it r14 = r8.A01()
        L_0x037b:
            r13 = r14
        L_0x037c:
            java.lang.Object r9 = r4.A00
            X.7IP r9 = (X.AnonymousClass7IP) r9
            if (r13 == 0) goto L_0x08cf
            java.lang.String r8 = "auth_flows_dynamic_content_display"
        L_0x0384:
            java.lang.String r5 = "BUNDLE_KEY_PAYMENT_TYPE"
            java.lang.String r7 = r0.getString(r5)
            java.lang.Throwable r6 = r3.A02
            java.lang.Object r5 = r4.A02
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()
            java.lang.String r3 = "logger_data"
            r4.put(r3, r5)
            if (r6 == 0) goto L_0x039e
            java.lang.String r3 = "throwable"
            r4.put(r3, r6)
        L_0x039e:
            java.lang.String r3 = "product"
            r4.put(r3, r7)
            X.8h9 r3 = r9.A00
            r3.Bb8(r8, r4)
            if (r13 != 0) goto L_0x001a
            X.6eS r3 = r9.A01
            java.lang.String r4 = "BUNDLE_KEY_PRIMARY_FLOW_TYPE"
            java.lang.String r4 = r0.getString(r4)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1796307114: goto L_0x085f;
                case -1523000326: goto L_0x07f9;
                case -546650078: goto L_0x078a;
                case -546648707: goto L_0x072e;
                case -546636625: goto L_0x0645;
                case 1374462462: goto L_0x05f5;
                case 1657309561: goto L_0x05ab;
                case 1840465042: goto L_0x0420;
                case 1855579941: goto L_0x07d7;
                case 1855593394: goto L_0x03c4;
                default: goto L_0x03b9;
            }
        L_0x03b9:
            java.lang.String r0 = "Unsupported authentication step type:"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r1)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x03c4:
            java.lang.String r0 = "CREATE_PIN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03b9
            java.lang.String r0 = "PIN_LOCKED"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0412
            java.lang.String r0 = "FORGOT_PIN"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0412
            java.lang.String r0 = "CHANGE_PIN_USING_OLD_PIN"
            boolean r0 = r0.equals(r4)
            X.78I r1 = new X.78I
            r1.<init>()
            X.4x8 r3 = r3.A00
            if (r0 == 0) goto L_0x0402
            X.AnonymousClass78I.A00(r3, r1)
            r0 = 2131827211(0x7f111a0b, float:1.9287328E38)
        L_0x03f1:
            java.lang.String r0 = r3.getString(r0)
            r1.A05 = r0
            r0 = 2131827212(0x7f111a0c, float:1.928733E38)
        L_0x03fa:
            java.lang.String r0 = r3.getString(r0)
            r1.A03 = r0
            goto L_0x08ac
        L_0x0402:
            X.AnonymousClass78I.A00(r3, r1)
            r0 = 2131827209(0x7f111a09, float:1.9287324E38)
            java.lang.String r0 = r3.getString(r0)
            r1.A05 = r0
            r0 = 2131827210(0x7f111a0a, float:1.9287326E38)
            goto L_0x03fa
        L_0x0412:
            X.78I r1 = new X.78I
            r1.<init>()
            X.4x8 r3 = r3.A00
            X.AnonymousClass78I.A00(r3, r1)
            r0 = 2131827236(0x7f111a24, float:1.9287379E38)
            goto L_0x03f1
        L_0x0420:
            java.lang.String r0 = "CONFIRMATION_DIALOG"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03b9
            java.lang.String r0 = "CANCEL_OUT_OF_FLOW"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x04c4
            java.lang.String r0 = "CONNECT_FROM_HUB_PIN_VERIFICATION"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0487
            java.lang.String r0 = "CONNECT_FROM_CHECKOUT_PIN_VERIFICATION"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0487
            java.lang.String r0 = "CONNECT_FROM_HUB_CVV_VERIFICATION"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x04a1
            java.lang.String r0 = "CONNECT_FROM_CHECKOUT_CVV_VERIFICATION"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x04a1
            java.lang.String r0 = "CONNECT_FROM_HUB_PAYPAL_VERIFICATION"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0587
            java.lang.String r0 = "CONNECT_FROM_CHECKOUT_PAYPAL_VERIFICATION"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0587
            X.77w r1 = new X.77w
            r1.<init>()
            X.4x8 r2 = r3.A00
            r0 = 2131827220(0x7f111a14, float:1.9287346E38)
            X.C1199777w.A00(r2, r1, r0)
            r0 = 2131827219(0x7f111a13, float:1.9287344E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A01 = r0
            r0 = 2131827236(0x7f111a24, float:1.9287379E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A00 = r0
            r0 = 2131827243(0x7f111a2b, float:1.9287393E38)
        L_0x0482:
            r2.getString(r0)
            goto L_0x07b9
        L_0x0487:
            X.77w r1 = new X.77w
            r1.<init>()
            X.4x8 r2 = r3.A00
            r0 = 2131827227(0x7f111a1b, float:1.928736E38)
            X.C1199777w.A00(r2, r1, r0)
            r0 = 2131827226(0x7f111a1a, float:1.9287359E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A01 = r0
            r0 = 2131827225(0x7f111a19, float:1.9287357E38)
            goto L_0x04ba
        L_0x04a1:
            X.77w r1 = new X.77w
            r1.<init>()
            X.4x8 r2 = r3.A00
            r0 = 2131827223(0x7f111a17, float:1.9287353E38)
            X.C1199777w.A00(r2, r1, r0)
            r0 = 2131827222(0x7f111a16, float:1.928735E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A01 = r0
            r0 = 2131827221(0x7f111a15, float:1.9287349E38)
        L_0x04ba:
            java.lang.String r0 = r2.getString(r0)
            r1.A00 = r0
            r0 = 2131827224(0x7f111a18, float:1.9287355E38)
            goto L_0x0482
        L_0x04c4:
            java.lang.String r0 = "VERIFY_PIN_TO_DISABLE_PIN_HUB"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x04d3
            java.lang.String r0 = "Not implemented yet!"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x04d3:
            java.lang.String r0 = "UNABLE_TO_CONNECT_FROM_CHECKOUT"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x04f6
            X.77w r1 = new X.77w
            r1.<init>()
            X.4x8 r2 = r3.A00
            r0 = 2131827255(0x7f111a37, float:1.9287417E38)
            X.C1199777w.A00(r2, r1, r0)
            r0 = 2131827256(0x7f111a38, float:1.928742E38)
        L_0x04eb:
            java.lang.String r0 = r2.getString(r0)
            r1.A01 = r0
            r0 = 2131821644(0x7f11044c, float:1.9276037E38)
            goto L_0x07b3
        L_0x04f6:
            java.lang.String r0 = "UNABLE_TO_CONNECT_FROM_HUB"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x050f
            X.77w r1 = new X.77w
            r1.<init>()
            X.4x8 r2 = r3.A00
            r0 = 2131827255(0x7f111a37, float:1.9287417E38)
            X.C1199777w.A00(r2, r1, r0)
            r0 = 2131827257(0x7f111a39, float:1.9287422E38)
            goto L_0x04eb
        L_0x050f:
            java.lang.String r0 = "CONNECT_WITH_CVV_AFTER_PIN_FAILURE_FROM_CHECKOUT_DIALOG"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x056d
            java.lang.String r0 = "CONNECT_WITH_CVV_AFTER_PIN_FAILURE_FROM_HUB_DIALOG"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x056d
            java.lang.String r0 = "CONNECT_WITH_PAYPAL_AFTER_PIN_FAILURE_FROM_CHECKOUT_DIALOG"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0553
            java.lang.String r0 = "CONNECT_WITH_PAYPAL_AFTER_PIN_FAILURE_FROM_HUB_DIALOG"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0553
            X.77w r1 = new X.77w
            r1.<init>()
            X.4x8 r2 = r3.A00
            r0 = 2131827254(0x7f111a36, float:1.9287415E38)
            X.C1199777w.A00(r2, r1, r0)
            r0 = 2131827253(0x7f111a35, float:1.9287413E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A01 = r0
            r0 = 2131827209(0x7f111a09, float:1.9287324E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A00 = r0
            r0 = 2131827242(0x7f111a2a, float:1.9287391E38)
            goto L_0x0482
        L_0x0553:
            X.77w r1 = new X.77w
            r1.<init>()
            X.4x8 r2 = r3.A00
            r0 = 2131827208(0x7f111a08, float:1.9287322E38)
            X.C1199777w.A00(r2, r1, r0)
            r0 = 2131827207(0x7f111a07, float:1.928732E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A01 = r0
            r0 = 2131827206(0x7f111a06, float:1.9287318E38)
            goto L_0x05a0
        L_0x056d:
            X.77w r1 = new X.77w
            r1.<init>()
            X.4x8 r2 = r3.A00
            r0 = 2131827204(0x7f111a04, float:1.9287314E38)
            X.C1199777w.A00(r2, r1, r0)
            r0 = 2131827203(0x7f111a03, float:1.9287312E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A01 = r0
            r0 = 2131827205(0x7f111a05, float:1.9287316E38)
            goto L_0x05a0
        L_0x0587:
            X.77w r1 = new X.77w
            r1.<init>()
            X.4x8 r2 = r3.A00
            r0 = 2131827230(0x7f111a1e, float:1.9287367E38)
            X.C1199777w.A00(r2, r1, r0)
            r0 = 2131827229(0x7f111a1d, float:1.9287365E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A01 = r0
            r0 = 2131827228(0x7f111a1c, float:1.9287363E38)
        L_0x05a0:
            java.lang.String r0 = r2.getString(r0)
            r1.A00 = r0
            r0 = 2131827214(0x7f111a0e, float:1.9287334E38)
            goto L_0x0482
        L_0x05ab:
            java.lang.String r0 = "VERIFY_PAYPAL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03b9
            r14 = 0
            X.4x8 r1 = r3.A00
            r0 = 2131827235(0x7f111a23, float:1.9287377E38)
            java.lang.String r20 = r1.getString(r0)
            r0 = 2131827268(0x7f111a44, float:1.9287444E38)
            java.lang.String r18 = r1.getString(r0)
            r0 = 2131827267(0x7f111a43, float:1.9287442E38)
            java.lang.String r16 = r1.getString(r0)
            r0 = 2131827231(0x7f111a1f, float:1.9287369E38)
            java.lang.String r19 = r1.getString(r0)
            r0 = 2131827266(0x7f111a42, float:1.928744E38)
            java.lang.String r15 = r1.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r20)
            if (r0 != 0) goto L_0x08ef
            boolean r0 = android.text.TextUtils.isEmpty(r18)
            if (r0 != 0) goto L_0x08ef
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            if (r0 != 0) goto L_0x08ef
            X.6ma r13 = new X.6ma
            r17 = r14
            r21 = r14
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            return r13
        L_0x05f5:
            java.lang.String r0 = "PIN_CREATED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03b9
            X.4x8 r3 = r3.A00
            r0 = 2131827199(0x7f1119ff, float:1.9287304E38)
            java.lang.String r0 = r3.getString(r0)
            java.util.List r5 = java.util.Collections.singletonList(r0)
            java.lang.String r0 = "PIN_LOCKED"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x062f
            java.lang.String r0 = "FORGOT_PIN"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x062f
            java.lang.String r0 = "CHANGE_PIN_USING_OLD_PIN"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x062f
            X.78I r1 = new X.78I
            r1.<init>()
            X.AnonymousClass78I.A00(r3, r1)
            r0 = 2131827233(0x7f111a21, float:1.9287373E38)
            goto L_0x0897
        L_0x062f:
            X.78I r1 = new X.78I
            r1.<init>()
            X.AnonymousClass78I.A00(r3, r1)
            r0 = 2131827200(0x7f111a00, float:1.9287306E38)
            java.lang.String r0 = r3.getString(r0)
            r1.A05 = r0
            r0 = 2131827232(0x7f111a20, float:1.928737E38)
            goto L_0x08a0
        L_0x0645:
            java.lang.String r0 = "VERIFY_PIN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03b9
            java.lang.String r0 = "CHANGE_PIN_USING_OLD_PIN"
            boolean r0 = r0.equals(r4)
            java.lang.String r2 = "VERIFY_PIN_TO_PAY"
            if (r0 != 0) goto L_0x06bf
            boolean r0 = r2.equals(r4)
            if (r0 != 0) goto L_0x06bf
            java.lang.String r0 = "CONNECT_FROM_HUB_PIN_VERIFICATION"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x069f
            java.lang.String r0 = "CONNECT_FROM_CHECKOUT_PIN_VERIFICATION"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x069f
            X.78I r1 = new X.78I
            r1.<init>()
            X.4x8 r3 = r3.A00
            X.AnonymousClass78I.A00(r3, r1)
            r0 = 2131827274(0x7f111a4a, float:1.9287456E38)
            java.lang.String r0 = r3.getString(r0)
            r1.A05 = r0
            r0 = 2131827272(0x7f111a48, float:1.9287452E38)
            java.lang.String r0 = r3.getString(r0)
            r1.A03 = r0
            r0 = 2131827271(0x7f111a47, float:1.928745E38)
            java.lang.String r0 = r3.getString(r0)
            r1.A02 = r0
            r0 = 2131827273(0x7f111a49, float:1.9287454E38)
        L_0x0695:
            java.lang.String r0 = r3.getString(r0)
            java.util.List r5 = java.util.Collections.singletonList(r0)
            goto L_0x08a6
        L_0x069f:
            X.78I r1 = new X.78I
            r1.<init>()
            X.4x8 r3 = r3.A00
            X.AnonymousClass78I.A00(r3, r1)
            r0 = 2131827270(0x7f111a46, float:1.9287448E38)
            java.lang.String r0 = r3.getString(r0)
            r1.A05 = r0
            r0 = 2131827202(0x7f111a02, float:1.928731E38)
            java.lang.String r0 = r3.getString(r0)
            r1.A03 = r0
            r0 = 2131827269(0x7f111a45, float:1.9287446E38)
            goto L_0x0695
        L_0x06bf:
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            X.4x8 r3 = r3.A00
            r0 = 2131827278(0x7f111a4e, float:1.9287464E38)
            X.C86154wM.A1A(r3, r5, r0)
            r0 = 2131827279(0x7f111a4f, float:1.9287466E38)
            X.C86154wM.A1A(r3, r5, r0)
            r0 = 2131827282(0x7f111a52, float:1.9287472E38)
            X.C86154wM.A1A(r3, r5, r0)
            r0 = 2131827280(0x7f111a50, float:1.9287468E38)
            X.C86154wM.A1A(r3, r5, r0)
            r0 = 2131827277(0x7f111a4d, float:1.9287462E38)
            X.C86154wM.A1A(r3, r5, r0)
            r0 = 2131827281(0x7f111a51, float:1.928747E38)
            X.C86154wM.A1A(r3, r5, r0)
            X.78I r1 = new X.78I
            r1.<init>()
            X.AnonymousClass78I.A00(r3, r1)
            r0 = 2131827274(0x7f111a4a, float:1.9287456E38)
            java.lang.String r0 = r3.getString(r0)
            r1.A05 = r0
            boolean r0 = r2.equals(r4)
            boolean r2 = X.AnonymousClass7HK.A01()
            if (r0 == 0) goto L_0x0725
            r0 = 2131827276(0x7f111a4c, float:1.928746E38)
            if (r2 == 0) goto L_0x070c
            r0 = 2131830512(0x7f1126f0, float:1.9294023E38)
        L_0x070c:
            java.lang.String r0 = r3.getString(r0)
            r1.A03 = r0
            r0 = 2131827271(0x7f111a47, float:1.928745E38)
            java.lang.String r0 = r3.getString(r0)
            r1.A02 = r0
            java.util.List r0 = java.util.Collections.unmodifiableList(r5)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            goto L_0x08aa
        L_0x0725:
            r0 = 2131827275(0x7f111a4b, float:1.9287458E38)
            if (r2 == 0) goto L_0x070c
            r0 = 2131830511(0x7f1126ef, float:1.9294021E38)
            goto L_0x070c
        L_0x072e:
            java.lang.String r0 = "VERIFY_CVV"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03b9
            r14 = 0
            X.4x8 r1 = r3.A00
            r0 = 2131827235(0x7f111a23, float:1.9287377E38)
            java.lang.String r20 = r1.getString(r0)
            r0 = 2131827265(0x7f111a41, float:1.9287438E38)
            java.lang.String r18 = r1.getString(r0)
            r0 = 2131827202(0x7f111a02, float:1.928731E38)
            java.lang.String r16 = r1.getString(r0)
            r0 = 2131827231(0x7f111a1f, float:1.9287369E38)
            java.lang.String r19 = r1.getString(r0)
            r0 = 2131827263(0x7f111a3f, float:1.9287434E38)
            java.lang.String r17 = r1.getString(r0)
            r0 = 2131827262(0x7f111a3e, float:1.9287432E38)
            java.lang.String r15 = r1.getString(r0)
            r0 = 2131827264(0x7f111a40, float:1.9287436E38)
            java.lang.String r0 = r1.getString(r0)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.util.List r21 = java.util.Collections.unmodifiableList(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r20)
            if (r0 != 0) goto L_0x08f6
            boolean r0 = android.text.TextUtils.isEmpty(r18)
            if (r0 != 0) goto L_0x08f6
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            if (r0 != 0) goto L_0x08f6
            X.6ma r13 = new X.6ma
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            return r13
        L_0x078a:
            java.lang.String r0 = "VERIFY_BIO"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03b9
            java.lang.String r0 = "VERIFY_BIO_TO_DISABLE_BIO_HUB"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x07be
            X.77w r1 = new X.77w
            r1.<init>()
            X.4x8 r2 = r3.A00
            r0 = 2131827216(0x7f111a10, float:1.9287338E38)
            X.C1199777w.A00(r2, r1, r0)
            r0 = 2131827215(0x7f111a0f, float:1.9287336E38)
        L_0x07aa:
            java.lang.String r0 = r2.getString(r0)
            r1.A01 = r0
            r0 = 2131827245(0x7f111a2d, float:1.9287397E38)
        L_0x07b3:
            java.lang.String r0 = r2.getString(r0)
            r1.A00 = r0
        L_0x07b9:
            X.6it r13 = r1.A01()
            return r13
        L_0x07be:
            java.lang.String r0 = "VERIFY_BIO_TO_PAY"
            boolean r0 = r0.equals(r4)
            X.77w r1 = new X.77w
            r1.<init>()
            X.4x8 r2 = r3.A00
            if (r0 == 0) goto L_0x07e6
            r0 = 2131827261(0x7f111a3d, float:1.928743E38)
            X.C1199777w.A00(r2, r1, r0)
            r0 = 2131827260(0x7f111a3c, float:1.9287428E38)
            goto L_0x07aa
        L_0x07d7:
            java.lang.String r0 = "CREATE_BIO"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03b9
            X.77w r1 = new X.77w
            r1.<init>()
            X.4x8 r2 = r3.A00
        L_0x07e6:
            r0 = 2131827259(0x7f111a3b, float:1.9287426E38)
            X.C1199777w.A00(r2, r1, r0)
            r0 = 2131827258(0x7f111a3a, float:1.9287424E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A01 = r0
            r0 = 2131827244(0x7f111a2c, float:1.9287395E38)
            goto L_0x07b3
        L_0x07f9:
            java.lang.String r0 = "RECOVER_PIN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03b9
            java.lang.String r0 = "FORGOT_PIN"
            boolean r0 = r0.equals(r2)
            X.4x8 r1 = r3.A00
            if (r0 == 0) goto L_0x0854
            r0 = 2131827235(0x7f111a23, float:1.9287377E38)
            java.lang.String r20 = r1.getString(r0)
            r0 = 2131827217(0x7f111a11, float:1.928734E38)
        L_0x0815:
            java.lang.String r19 = r1.getString(r0)
            r0 = 2131827239(0x7f111a27, float:1.9287385E38)
            java.lang.String r15 = r1.getString(r0)
            r0 = 2131827237(0x7f111a25, float:1.928738E38)
            java.lang.String r14 = r1.getString(r0)
            r0 = 2131827238(0x7f111a26, float:1.9287383E38)
            java.lang.String r18 = r1.getString(r0)
            r0 = 2131827240(0x7f111a28, float:1.9287387E38)
            java.lang.String r16 = r1.getString(r0)
            r0 = 2131827241(0x7f111a29, float:1.928739E38)
            java.lang.String r17 = r1.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r20)
            if (r0 != 0) goto L_0x08fd
            boolean r0 = android.text.TextUtils.isEmpty(r19)
            if (r0 != 0) goto L_0x08fd
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x08fd
            X.6mP r13 = new X.6mP
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            return r13
        L_0x0854:
            r0 = 2131827235(0x7f111a23, float:1.9287377E38)
            java.lang.String r20 = r1.getString(r0)
            r0 = 2131827236(0x7f111a24, float:1.9287379E38)
            goto L_0x0815
        L_0x085f:
            java.lang.String r0 = "CONFIRM_PIN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03b9
            X.4x8 r3 = r3.A00
            r0 = 2131827199(0x7f1119ff, float:1.9287304E38)
            java.lang.String r0 = r3.getString(r0)
            java.util.List r5 = java.util.Collections.singletonList(r0)
            java.lang.String r0 = "PIN_LOCKED"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x08ba
            java.lang.String r0 = "FORGOT_PIN"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x08ba
            java.lang.String r0 = "CHANGE_PIN_USING_OLD_PIN"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x08ba
            X.78I r1 = new X.78I
            r1.<init>()
            X.AnonymousClass78I.A00(r3, r1)
            r0 = 2131827201(0x7f111a01, float:1.9287308E38)
        L_0x0897:
            java.lang.String r0 = r3.getString(r0)
            r1.A05 = r0
            r0 = 2131827210(0x7f111a0a, float:1.9287326E38)
        L_0x08a0:
            java.lang.String r0 = r3.getString(r0)
            r1.A03 = r0
        L_0x08a6:
            java.util.List r0 = java.util.Collections.unmodifiableList(r5)
        L_0x08aa:
            r1.A07 = r0
        L_0x08ac:
            r0 = 2131821647(0x7f11044f, float:1.9276043E38)
            java.lang.String r0 = r3.getString(r0)
            r1.A04 = r0
            X.6mb r13 = r1.A01()
            return r13
        L_0x08ba:
            X.78I r1 = new X.78I
            r1.<init>()
            X.AnonymousClass78I.A00(r3, r1)
            r0 = 2131827200(0x7f111a00, float:1.9287306E38)
            java.lang.String r0 = r3.getString(r0)
            r1.A05 = r0
            r0 = 2131827212(0x7f111a0c, float:1.928733E38)
            goto L_0x08a0
        L_0x08cf:
            java.lang.String r8 = "auth_flows_local_content_display"
            goto L_0x0384
        L_0x08d3:
            java.lang.String r0 = "The error message of PIN screen is null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x08da:
            java.lang.String r0 = "The title, subtitle and description of verification screen should NOT be empty."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x08e1:
            java.lang.String r0 = "The title, subtitle and description of PIN recovery screen should NOT be empty."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x08e8:
            java.lang.String r0 = "The error message of PIN screen is null."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x08ef:
            java.lang.String r0 = "The title, subtitle and description of verification screen should NOT be empty."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x08f6:
            java.lang.String r0 = "The title, subtitle and description of verification screen should NOT be empty."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x08fd:
            java.lang.String r0 = "The title, subtitle and description of PIN recovery screen should NOT be empty."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxObjectShape101S0300000_2_I2.invoke(java.lang.Object):java.lang.Object");
    }
}
