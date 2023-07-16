package X;

/* renamed from: X.4RD  reason: invalid class name */
public final class AnonymousClass4RD implements Runnable {
    public final /* synthetic */ C63603ht A00;
    public final /* synthetic */ boolean A01;

    public AnonymousClass4RD(C63603ht r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c2, code lost:
        if (r3 != true) goto L_0x00c4;
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
            if (r2 == 0) goto L_0x00b6
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
            java.lang.String r11 = "CurrentPVXARNux"
            if (r2 == 0) goto L_0x002e
            X.3Z9 r2 = r0.A01
            if (r2 == 0) goto L_0x002c
            com.instagram.ui.primer.PrimerBottomSheetConfig r2 = r2.A05
            java.lang.String r2 = r2.A02
        L_0x0025:
            boolean r2 = X.C04220Ms.A0I(r2, r11)
            if (r2 == 0) goto L_0x002e
            return
        L_0x002c:
            r2 = 0
            goto L_0x0025
        L_0x002e:
            X.3Z9 r2 = r0.A01
            if (r2 == 0) goto L_0x0035
            r2.A02()
        L_0x0035:
            com.instagram.service.session.UserSession r3 = r0.A07
            com.instagram.ui.primer.TitleIcon r10 = X.C18200wM.A0Z()
            android.content.Context r5 = r0.A03
            r2 = 2131834451(0x7f113653, float:1.9302013E38)
            java.lang.String r9 = X.AnonymousClass0wJ.A0k(r5, r2)
            com.instagram.ui.primer.IconConfig$SimpleIconConfig r6 = X.C18230wP.A0b()
            r2 = 0
            java.lang.Integer r8 = X.C18230wP.A0e()
            com.instagram.ui.primer.InfoItem r7 = new com.instagram.ui.primer.InfoItem
            r7.<init>(r6, r8, r9, r2)
            r2 = 2131834452(0x7f113654, float:1.9302015E38)
            java.lang.String r6 = X.AnonymousClass0wJ.A0k(r5, r2)
            r2 = 2131232915(0x7f080893, float:1.8081953E38)
            com.instagram.ui.primer.InfoItem r2 = X.C18190wL.A0Y(r8, r6, r2)
            com.instagram.ui.primer.InfoItem[] r2 = new com.instagram.ui.primer.InfoItem[]{r7, r2}
            java.util.List r14 = X.AnonymousClass8AP.A0A(r2)
            r2 = 2131831976(0x7f112ca8, float:1.9296993E38)
            java.lang.String r12 = X.AnonymousClass0wJ.A0k(r5, r2)
            r2 = 2131827999(0x7f111d1f, float:1.9288926E38)
            java.lang.String r13 = X.AnonymousClass0wJ.A0k(r5, r2)
            r15 = 2131834453(0x7f113655, float:1.9302017E38)
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
            r2 = 64
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r2 = X.C18200wM.A0R(r0, r1, r2)
            r7.A00 = r2
            r3 = 21
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r2 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r2.<init>((int) r3, (java.lang.Object) r1, (java.lang.Object) r7, (java.lang.Object) r0)
            r7.A01 = r2
            r2 = 65
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r1 = X.C18200wM.A0R(r0, r1, r2)
            r7.A02 = r1
            android.os.Handler r3 = X.AnonymousClass0wJ.A0F()
            X.4RG r2 = new X.4RG
            r2.<init>(r0, r7)
            goto L_0x0157
        L_0x00b6:
            r16 = 0
            X.3Z9 r2 = r0.A01
            r6 = 1
            if (r2 == 0) goto L_0x00c4
            boolean r3 = r2.A04()
            r2 = 1
            if (r3 == r6) goto L_0x00c5
        L_0x00c4:
            r2 = 0
        L_0x00c5:
            java.lang.String r11 = "CurrentPVXARNux"
            if (r2 == 0) goto L_0x00da
            X.3Z9 r2 = r0.A01
            if (r2 == 0) goto L_0x00d8
            com.instagram.ui.primer.PrimerBottomSheetConfig r2 = r2.A05
            java.lang.String r2 = r2.A02
        L_0x00d1:
            boolean r2 = X.C04220Ms.A0I(r2, r11)
            if (r2 == 0) goto L_0x00da
            return
        L_0x00d8:
            r2 = 0
            goto L_0x00d1
        L_0x00da:
            X.3Z9 r2 = r0.A01
            if (r2 == 0) goto L_0x00e1
            r2.A02()
        L_0x00e1:
            com.instagram.service.session.UserSession r5 = r0.A07
            com.instagram.ui.primer.TitleIcon r10 = X.C18200wM.A0Z()
            android.content.Context r4 = r0.A03
            r2 = 2131834451(0x7f113653, float:1.9302013E38)
            java.lang.String r7 = X.AnonymousClass0wJ.A0k(r4, r2)
            com.instagram.ui.primer.IconConfig$SimpleIconConfig r2 = X.C18230wP.A0b()
            r3 = 0
            java.lang.Integer r9 = X.C18230wP.A0e()
            com.instagram.ui.primer.InfoItem r8 = new com.instagram.ui.primer.InfoItem
            r8.<init>(r2, r9, r7, r3)
            r2 = 2131834452(0x7f113654, float:1.9302015E38)
            java.lang.String r7 = X.AnonymousClass0wJ.A0k(r4, r2)
            r2 = 2131232915(0x7f080893, float:1.8081953E38)
            com.instagram.ui.primer.InfoItem r2 = X.C18190wL.A0Y(r9, r7, r2)
            com.instagram.ui.primer.InfoItem[] r2 = new com.instagram.ui.primer.InfoItem[]{r8, r2}
            java.util.List r14 = X.AnonymousClass8AP.A0A(r2)
            r2 = 2131831976(0x7f112ca8, float:1.9296993E38)
            java.lang.String r12 = X.AnonymousClass0wJ.A0k(r4, r2)
            r2 = 2131829574(0x7f112346, float:1.929212E38)
            java.lang.String r13 = X.AnonymousClass0wJ.A0k(r4, r2)
            r15 = 2131834453(0x7f113655, float:1.9302017E38)
            com.instagram.ui.primer.PrimerBottomSheetConfig r9 = new com.instagram.ui.primer.PrimerBottomSheetConfig
            r17 = r16
            r18 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r10 = 60
            X.3Z9 r4 = new X.3Z9
            r8 = r9
            r9 = r3
            r11 = r6
            r12 = r6
            r13 = r16
            r6 = r4
            r7 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r3 = 22
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r2 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r2.<init>((int) r3, (java.lang.Object) r1, (java.lang.Object) r4, (java.lang.Object) r0)
            r4.A01 = r2
            r2 = 66
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r1 = X.C18200wM.A0R(r0, r1, r2)
            r4.A02 = r1
            android.os.Handler r3 = X.AnonymousClass0wJ.A0F()
            X.4RH r2 = new X.4RH
            r2.<init>(r0, r4)
        L_0x0157:
            r0 = 400(0x190, double:1.976E-321)
            r3.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4RD.run():void");
    }
}
