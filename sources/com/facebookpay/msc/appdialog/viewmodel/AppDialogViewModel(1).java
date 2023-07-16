package com.facebookpay.msc.appdialog.viewmodel;

import X.AnonymousClass6IH;
import X.AnonymousClass7Kz;
import X.C04220Ms;
import X.C143688h9;
import X.C86134wK;
import X.C880756q;
import X.C880856r;
import com.facebook.graphql.impls.TopLevelDialogImpl;
import com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel;
import com.facebookpay.msc.logging.LoggingData;
import java.util.HashMap;

public final class AppDialogViewModel extends ListSectionViewModel {
    public TopLevelDialogImpl A00;
    public LoggingData A01;
    public final C880856r A02 = C880756q.A01();

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
        if (r1.getStringValue("uri") == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e4, code lost:
        if (r1 == null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f3, code lost:
        if (r1 == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0122, code lost:
        if (X.AnonymousClass8bQ.A0n(r0) != false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0187, code lost:
        if (r0.booleanValue() != false) goto L_0x0189;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(android.os.Bundle r20) {
        /*
            r19 = this;
            r7 = r19
            r1 = r20
            super.A07(r1)
            if (r20 == 0) goto L_0x003a
            java.lang.String r0 = "logging_data"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.facebookpay.msc.logging.LoggingData r0 = (com.facebookpay.msc.logging.LoggingData) r0
        L_0x0011:
            java.lang.String r18 = "Required value was null."
            if (r0 == 0) goto L_0x01b5
            r7.A01 = r0
            java.lang.String r0 = "top_level_dialog"
            if (r20 == 0) goto L_0x01b0
            android.os.Parcelable r0 = r1.getParcelable(r0)
            if (r0 == 0) goto L_0x01b0
            java.lang.Object r0 = X.C121697Hn.A01(r0)
            if (r0 == 0) goto L_0x01b0
            com.facebook.graphql.impls.TopLevelDialogImpl r0 = (com.facebook.graphql.impls.TopLevelDialogImpl) r0
            r7.A00 = r0
            com.google.common.collect.ImmutableList$Builder r6 = com.google.common.collect.ImmutableList.builder()
            com.facebook.graphql.impls.TopLevelDialogImpl r1 = r7.A00
            java.lang.String r17 = "topLevelDialog"
            r12 = 0
            if (r1 != 0) goto L_0x003c
            X.C04220Ms.A0E(r17)
            throw r12
        L_0x003a:
            r0 = 0
            goto L_0x0011
        L_0x003c:
            java.lang.Class<com.facebook.graphql.impls.TopLevelDialogImpl$ImageSource> r5 = com.facebook.graphql.impls.TopLevelDialogImpl.ImageSource.class
            r0 = 376(0x178, float:5.27E-43)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            com.facebook.pando.TreeJNI r1 = r1.getTreeValue(r4, r5)
            if (r1 == 0) goto L_0x0078
            java.lang.String r0 = "uri"
            java.lang.String r0 = r1.getStringValue(r0)
        L_0x0050:
            r11 = 0
            X.7iH r3 = new X.7iH
            r3.<init>(r0, r12, r11, r11)
            r0 = 52
            X.5iR r2 = X.AnonymousClass5iR.A00(r0)
            X.5iC r1 = new X.5iC
            r1.<init>()
            r1.A01 = r3
            X.5iH r0 = new X.5iH
            r0.<init>(r1)
            r10 = 1
            r2.A05 = r0
            r2.A02 = r10
            X.C92465iX.A01(r2, r6)
            com.facebook.graphql.impls.TopLevelDialogImpl r0 = r7.A00
            if (r0 != 0) goto L_0x007a
            X.C04220Ms.A0E(r17)
            throw r12
        L_0x0078:
            r0 = r12
            goto L_0x0050
        L_0x007a:
            com.facebook.pando.TreeJNI r1 = r0.getTreeValue(r4, r5)
            if (r1 == 0) goto L_0x0089
            java.lang.String r0 = "uri"
            java.lang.String r1 = r1.getStringValue(r0)
            r0 = 1
            if (r1 != 0) goto L_0x008a
        L_0x0089:
            r0 = 0
        L_0x008a:
            X.C86154wM.A1N(r7, r0)
            r0 = 53
            X.5iR r8 = X.AnonymousClass5iR.A00(r0)
            X.5iF r5 = X.C92375iF.A00()
            com.facebook.graphql.impls.TopLevelDialogImpl r0 = r7.A00
            r9 = 0
            if (r0 != 0) goto L_0x00a0
            X.C04220Ms.A0E(r17)
            throw r12
        L_0x00a0:
            java.lang.String r4 = "title"
            java.lang.String r0 = r0.getStringValue(r4)
            if (r0 == 0) goto L_0x01ab
            X.7it r1 = X.C128107it.A01(r0)
            X.69Q r0 = X.AnonymousClass69Q.A19
            X.C121777Ib.A02(r1, r5, r0)
            com.facebook.graphql.impls.TopLevelDialogImpl r0 = r7.A00
            if (r0 == 0) goto L_0x01a7
            java.lang.String r3 = "message"
            java.lang.String r0 = r0.getStringValue(r3)
            if (r0 == 0) goto L_0x01a2
            X.7it r2 = X.C128107it.A01(r0)
            X.69Q r1 = X.AnonymousClass69Q.A0z
            X.7Ib r0 = new X.7Ib
            r0.<init>(r12, r2, r1)
            r5.A02 = r0
            X.5iX r0 = X.AnonymousClass5iL.A00(r8, r5)
            r6.add((java.lang.Object) r0)
            com.facebook.graphql.impls.TopLevelDialogImpl r0 = r7.A00
            if (r0 == 0) goto L_0x01a7
            java.lang.String r0 = r0.getStringValue(r4)
            if (r0 == 0) goto L_0x00e6
            com.facebook.graphql.impls.TopLevelDialogImpl r0 = r7.A00
            if (r0 == 0) goto L_0x01a7
            java.lang.String r1 = r0.getStringValue(r3)
            r0 = 1
            if (r1 != 0) goto L_0x00e7
        L_0x00e6:
            r0 = 0
        L_0x00e7:
            r5 = 1
            if (r0 == 0) goto L_0x00f5
            java.lang.Boolean r0 = r7.A00
            if (r0 == 0) goto L_0x019d
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x00f6
        L_0x00f5:
            r0 = 0
        L_0x00f6:
            X.C86154wM.A1N(r7, r0)
            com.facebook.graphql.impls.TopLevelDialogImpl r0 = r7.A00
            r16 = 0
            if (r0 == 0) goto L_0x0199
            java.lang.Class<com.facebook.graphql.impls.TopLevelDialogImpl$CtaInfo> r9 = com.facebook.graphql.impls.TopLevelDialogImpl.CtaInfo.class
            java.lang.String r8 = "cta_info"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r0, r9, r8)
            java.util.Iterator r15 = r0.iterator()
        L_0x010b:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0171
            com.facebook.pando.TreeJNI r13 = X.C18210wN.A0G(r15)
            java.lang.String r1 = "cta_uri"
            java.lang.String r0 = r13.getStringValue(r1)
            if (r0 == 0) goto L_0x0124
            boolean r0 = X.AnonymousClass8bQ.A0n(r0)
            r14 = 7
            if (r0 == 0) goto L_0x0125
        L_0x0124:
            r14 = 6
        L_0x0125:
            java.lang.String r0 = r13.getStringValue(r1)
            if (r0 == 0) goto L_0x016e
            boolean r0 = X.AnonymousClass8bQ.A0n(r0)
            if (r0 != 0) goto L_0x016e
            X.69Q r2 = X.AnonymousClass69Q.A0A
        L_0x0133:
            r0 = 54
            X.5iR r4 = X.AnonymousClass5iR.A00(r0)
            X.5iB r3 = new X.5iB
            r3.<init>()
            java.lang.String r0 = "cta_text"
            X.7it r1 = X.C128107it.A00(r13, r0)
            X.7Ib r0 = new X.7Ib
            r0.<init>(r12, r1, r2)
            r3.A01 = r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r1 = 2131231138(0x7f0801a2, float:1.8078349E38)
            X.7iI r0 = new X.7iI
            r0.<init>(r2, r12, r1, r11)
            r3.A00 = r0
            r0 = 19
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r0 = X.C86164wN.A0L(r13, r7, r0)
            r3.A00 = r0
            X.5iG r0 = new X.5iG
            r0.<init>(r3)
            r4.A05 = r0
            r4.A02 = r10
            X.C92465iX.A01(r4, r6)
            goto L_0x010b
        L_0x016e:
            X.69Q r2 = X.AnonymousClass69Q.A0x
            goto L_0x0133
        L_0x0171:
            com.facebook.graphql.impls.TopLevelDialogImpl r0 = r7.A00
            if (r0 == 0) goto L_0x0199
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r0, r9, r8)
            boolean r0 = X.C18250wR.A1K(r0)
            if (r0 == 0) goto L_0x0192
            java.lang.Boolean r0 = r7.A00
            if (r0 == 0) goto L_0x0194
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0192
        L_0x0189:
            X.C86154wM.A1N(r7, r5)
            X.56r r0 = r7.A02
            X.C86144wL.A1E(r0, r6)
            return
        L_0x0192:
            r5 = 0
            goto L_0x0189
        L_0x0194:
            java.lang.IllegalStateException r16 = X.C18180wK.A0a(r18)
            throw r16
        L_0x0199:
            X.C04220Ms.A0E(r17)
            throw r16
        L_0x019d:
            java.lang.IllegalStateException r9 = X.C18180wK.A0a(r18)
            throw r9
        L_0x01a2:
            java.lang.IllegalStateException r16 = X.C18180wK.A0a(r18)
            throw r16
        L_0x01a7:
            X.C04220Ms.A0E(r17)
            throw r9
        L_0x01ab:
            java.lang.IllegalStateException r16 = X.C18180wK.A0a(r18)
            throw r16
        L_0x01b0:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r18)
            throw r0
        L_0x01b5:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.msc.appdialog.viewmodel.AppDialogViewModel.A07(android.os.Bundle):void");
    }

    public static final void A00(AppDialogViewModel appDialogViewModel, String str, String str2, String str3) {
        C143688h9 A08 = AnonymousClass7Kz.A08();
        LoggingData loggingData = appDialogViewModel.A01;
        if (loggingData == null) {
            C04220Ms.A0E("loggingData");
            throw null;
        }
        HashMap A002 = AnonymousClass6IH.A00(loggingData);
        C86134wK.A1M("app_level_dialogue_update", str2, A002);
        if (str3 != null) {
            A002.put("target_url", str3);
        }
        A08.Bb8(str, A002);
    }
}
