package X;

/* renamed from: X.4RC  reason: invalid class name */
public final class AnonymousClass4RC implements Runnable {
    public final /* synthetic */ C63603ht A00;
    public final /* synthetic */ boolean A01;

    public AnonymousClass4RC(C63603ht r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010a, code lost:
        if (r3 != true) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r3 != true) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            boolean r2 = r0.A01
            X.3ht r0 = r0.A00
            X.D3Q r1 = X.D3Q.SHARE_SHEET
            if (r2 == 0) goto L_0x00fe
            r16 = 0
            X.3Z9 r2 = r0.A01
            r4 = 1
            if (r2 == 0) goto L_0x0018
            boolean r3 = r2.A04()
            r2 = 1
            if (r3 == r4) goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            r9 = 0
            java.lang.String r11 = "CurrentPVCCPNux"
            if (r2 == 0) goto L_0x002f
            X.3Z9 r2 = r0.A01
            if (r2 == 0) goto L_0x002d
            com.instagram.ui.primer.PrimerBottomSheetConfig r2 = r2.A05
            java.lang.String r2 = r2.A02
        L_0x0026:
            boolean r2 = X.C04220Ms.A0I(r2, r11)
            if (r2 == 0) goto L_0x002f
        L_0x002c:
            return
        L_0x002d:
            r2 = r9
            goto L_0x0026
        L_0x002f:
            X.3Z9 r2 = r0.A01
            if (r2 == 0) goto L_0x0036
            r2.A02()
        L_0x0036:
            com.instagram.service.session.UserSession r3 = r0.A07
            java.lang.Boolean r2 = X.C59583Lj.A01(r3)
            boolean r5 = r2.booleanValue()
            X.49f r2 = r0.A08
            if (r5 == 0) goto L_0x00f4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2 r2 = r2.A01()
        L_0x0048:
            com.instagram.ui.primer.TitleIcon r10 = X.C18200wM.A0Z()
            r7 = 2
            android.content.Context r5 = r0.A03
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r2.A00
            X.24X r2 = (X.AnonymousClass24X) r2
            int r6 = r2.ordinal()
            if (r6 == r4) goto L_0x00ef
            if (r6 == r7) goto L_0x00ea
            r2 = 3
            if (r6 == r2) goto L_0x00e5
            r2 = 5
            if (r6 != r2) goto L_0x002c
            r2 = 2131834465(0x7f113661, float:1.9302041E38)
        L_0x0066:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            if (r2 == 0) goto L_0x002c
            int r2 = r2.intValue()
            java.lang.String r6 = X.AnonymousClass0wJ.A0k(r5, r2)
            com.instagram.ui.primer.IconConfig$SimpleIconConfig r2 = X.C18230wP.A0b()
            java.lang.Integer r8 = X.C18230wP.A0e()
            com.instagram.ui.primer.InfoItem r7 = new com.instagram.ui.primer.InfoItem
            r7.<init>(r2, r8, r6, r9)
            r2 = 2131834467(0x7f113663, float:1.9302045E38)
            java.lang.String r6 = X.AnonymousClass0wJ.A0k(r5, r2)
            r2 = 2131232915(0x7f080893, float:1.8081953E38)
            com.instagram.ui.primer.InfoItem r2 = X.C18190wL.A0Y(r8, r6, r2)
            com.instagram.ui.primer.InfoItem[] r2 = new com.instagram.ui.primer.InfoItem[]{r7, r2}
            java.util.List r14 = X.AnonymousClass8AP.A0A(r2)
            r2 = 2131831976(0x7f112ca8, float:1.9296993E38)
            java.lang.String r12 = X.AnonymousClass0wJ.A0k(r5, r2)
            r2 = 2131827999(0x7f111d1f, float:1.9288926E38)
            java.lang.String r13 = X.AnonymousClass0wJ.A0k(r5, r2)
            r15 = 2131834468(0x7f113664, float:1.9302047E38)
            com.instagram.ui.primer.PrimerBottomSheetConfig r9 = new com.instagram.ui.primer.PrimerBottomSheetConfig
            r17 = r16
            r18 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            android.text.SpannableString r10 = X.C18180wK.A0B(r5)
            r11 = 28
            X.3Z9 r7 = new X.3Z9
            r8 = r3
            r12 = r16
            r13 = r12
            r14 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r2 = 61
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r2 = X.C18200wM.A0R(r0, r1, r2)
            r7.A00 = r2
            r3 = 19
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r2 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r2.<init>((int) r3, (java.lang.Object) r1, (java.lang.Object) r7, (java.lang.Object) r0)
            r7.A01 = r2
            r2 = 62
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r1 = X.C18200wM.A0R(r0, r1, r2)
            r7.A02 = r1
            android.os.Handler r3 = X.AnonymousClass0wJ.A0F()
            X.4RE r2 = new X.4RE
            r2.<init>(r0, r7)
            goto L_0x01ce
        L_0x00e5:
            r2 = 2131834464(0x7f113660, float:1.930204E38)
            goto L_0x0066
        L_0x00ea:
            r2 = 2131834463(0x7f11365f, float:1.9302037E38)
            goto L_0x0066
        L_0x00ef:
            r2 = 2131834466(0x7f113662, float:1.9302043E38)
            goto L_0x0066
        L_0x00f4:
            X.4wG r2 = r2.A08
            java.lang.Object r2 = r2.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2) r2
            goto L_0x0048
        L_0x00fe:
            r16 = 0
            X.3Z9 r2 = r0.A01
            r6 = 1
            if (r2 == 0) goto L_0x010c
            boolean r3 = r2.A04()
            r2 = 1
            if (r3 == r6) goto L_0x010d
        L_0x010c:
            r2 = 0
        L_0x010d:
            r5 = 0
            java.lang.String r11 = "CurrentPVCCPNux"
            if (r2 == 0) goto L_0x0123
            X.3Z9 r2 = r0.A01
            if (r2 == 0) goto L_0x0121
            com.instagram.ui.primer.PrimerBottomSheetConfig r2 = r2.A05
            java.lang.String r2 = r2.A02
        L_0x011a:
            boolean r2 = X.C04220Ms.A0I(r2, r11)
            if (r2 == 0) goto L_0x0123
            return
        L_0x0121:
            r2 = r5
            goto L_0x011a
        L_0x0123:
            X.3Z9 r2 = r0.A01
            if (r2 == 0) goto L_0x012a
            r2.A02()
        L_0x012a:
            com.instagram.service.session.UserSession r3 = r0.A07
            java.lang.Boolean r2 = X.C59583Lj.A01(r3)
            boolean r4 = r2.booleanValue()
            X.49f r2 = r0.A08
            if (r4 == 0) goto L_0x01e2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2 r2 = r2.A01()
        L_0x013c:
            com.instagram.ui.primer.TitleIcon r10 = X.C18200wM.A0Z()
            r8 = 2
            android.content.Context r4 = r0.A03
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r2.A00
            X.24X r2 = (X.AnonymousClass24X) r2
            int r7 = r2.ordinal()
            if (r7 == r6) goto L_0x01dd
            if (r7 == r8) goto L_0x01d8
            r2 = 3
            if (r7 == r2) goto L_0x01d4
            r2 = 5
            if (r7 != r2) goto L_0x002c
            r2 = 2131834465(0x7f113661, float:1.9302041E38)
        L_0x015a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            if (r2 == 0) goto L_0x002c
            int r2 = r2.intValue()
            java.lang.String r7 = X.AnonymousClass0wJ.A0k(r4, r2)
            com.instagram.ui.primer.IconConfig$SimpleIconConfig r2 = X.C18230wP.A0b()
            java.lang.Integer r9 = X.C18230wP.A0e()
            com.instagram.ui.primer.InfoItem r8 = new com.instagram.ui.primer.InfoItem
            r8.<init>(r2, r9, r7, r5)
            r2 = 2131834467(0x7f113663, float:1.9302045E38)
            java.lang.String r7 = X.AnonymousClass0wJ.A0k(r4, r2)
            r2 = 2131232915(0x7f080893, float:1.8081953E38)
            com.instagram.ui.primer.InfoItem r2 = X.C18190wL.A0Y(r9, r7, r2)
            com.instagram.ui.primer.InfoItem[] r2 = new com.instagram.ui.primer.InfoItem[]{r8, r2}
            java.util.List r14 = X.AnonymousClass8AP.A0A(r2)
            r2 = 2131831976(0x7f112ca8, float:1.9296993E38)
            java.lang.String r12 = X.AnonymousClass0wJ.A0k(r4, r2)
            r2 = 2131829574(0x7f112346, float:1.929212E38)
            java.lang.String r13 = X.AnonymousClass0wJ.A0k(r4, r2)
            r15 = 2131834468(0x7f113664, float:1.9302047E38)
            com.instagram.ui.primer.PrimerBottomSheetConfig r9 = new com.instagram.ui.primer.PrimerBottomSheetConfig
            r17 = r16
            r18 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r10 = 60
            X.3Z9 r4 = new X.3Z9
            r8 = r9
            r9 = r5
            r11 = r6
            r12 = r6
            r13 = r16
            r6 = r4
            r7 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r3 = 20
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r2 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r2.<init>((int) r3, (java.lang.Object) r1, (java.lang.Object) r4, (java.lang.Object) r0)
            r4.A01 = r2
            r2 = 63
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r1 = X.C18200wM.A0R(r0, r1, r2)
            r4.A02 = r1
            android.os.Handler r3 = X.AnonymousClass0wJ.A0F()
            X.4RF r2 = new X.4RF
            r2.<init>(r0, r4)
        L_0x01ce:
            r0 = 400(0x190, double:1.976E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x01d4:
            r2 = 2131834464(0x7f113660, float:1.930204E38)
            goto L_0x015a
        L_0x01d8:
            r2 = 2131834463(0x7f11365f, float:1.9302037E38)
            goto L_0x015a
        L_0x01dd:
            r2 = 2131834466(0x7f113662, float:1.9302043E38)
            goto L_0x015a
        L_0x01e2:
            X.4wG r2 = r2.A08
            java.lang.Object r2 = r2.getValue()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2) r2
            goto L_0x013c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4RC.run():void");
    }
}
