package X;

import com.fbpay.logging.LoggingContext;

/* renamed from: X.5gW  reason: invalid class name and case insensitive filesystem */
public final class C91615gW extends C886359v {
    public final C143638h4 A00;
    public final C143638h4 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00eb, code lost:
        if (r6 != null) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.AnonymousClass5B5 r10, X.AnonymousClass7Kx r11) {
        /*
            r9 = this;
            r3 = 0
            boolean r7 = X.AnonymousClass0wJ.A1Z(r11, r10)
            boolean r0 = X.AnonymousClass7Kx.A0R(r11)
            if (r0 != 0) goto L_0x0011
            boolean r0 = X.AnonymousClass7Kx.A0P(r11)
            if (r0 == 0) goto L_0x00f1
        L_0x0011:
            java.lang.Object r8 = r11.A01
            if (r8 == 0) goto L_0x00f1
            com.instagram.service.session.UserSession r4 = X.AnonymousClass7HK.A00()
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            r1 = 36317470363094807(0x81068c00220f17, double:3.0306527241118167E-306)
            X.C63803iN.A0E(r0, r4, r1)
            com.instagram.service.session.UserSession r4 = X.AnonymousClass7HK.A00()
            X.0TJ r0 = X.AnonymousClass0TJ.A06
            boolean r0 = X.C63803iN.A0E(r0, r4, r1)
            r1 = 0
            if (r0 == 0) goto L_0x00e4
            r6 = r8
            com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem r6 = (com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem) r6
            if (r6 == 0) goto L_0x00e4
            com.facebook.graphql.impls.PAYLinkableTextFragmentImpl r5 = r6.A00
            if (r5 == 0) goto L_0x00e4
            java.lang.String r4 = X.C86144wL.A0q(r5)
            if (r4 == 0) goto L_0x00ef
            java.lang.Class<com.facebook.graphql.impls.PAYLinkableTextFragmentImpl$Ranges> r2 = com.facebook.graphql.impls.PAYLinkableTextFragmentImpl.Ranges.class
            java.lang.String r0 = "ranges"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r5, r2, r0)
            java.util.List r0 = X.AnonymousClass3JJ.A01(r0, r3, r7)
            X.6p6 r2 = new X.6p6
            r2.<init>(r4, r0)
            X.8h4 r0 = r9.A01
            java.lang.CharSequence r0 = r2.A00(r0, r3)
        L_0x0056:
            com.facebook.graphql.impls.PAYLinkableTextFragmentImpl r6 = r6.A01
            if (r6 == 0) goto L_0x0099
            java.lang.String r5 = X.C86144wL.A0q(r6)
            if (r5 == 0) goto L_0x0099
            java.lang.String r4 = "[[cta_text_token]]"
            int r1 = android.text.TextUtils.indexOf(r0, r4)
            if (r1 >= 0) goto L_0x00d1
            java.lang.String r1 = " "
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[]{r0, r1, r5}
            java.lang.CharSequence r4 = android.text.TextUtils.concat(r0)
        L_0x0072:
            java.lang.Class<com.facebook.graphql.impls.PAYLinkableTextFragmentImpl$Ranges> r1 = com.facebook.graphql.impls.PAYLinkableTextFragmentImpl.Ranges.class
            java.lang.String r0 = "ranges"
            com.google.common.collect.ImmutableList r2 = X.C18230wP.A0P(r6, r1, r0)
            java.lang.String r1 = r4.toString()
            int r0 = android.text.TextUtils.indexOf(r4, r5)
            java.lang.String r0 = X.C18230wP.A0s(r1, r3, r0)
            int r0 = X.AnonymousClass2C6.A00(r0)
            java.util.List r0 = X.AnonymousClass3JJ.A01(r2, r0, r3)
            X.6p6 r1 = new X.6p6
            r1.<init>(r4, r0)
            X.8h4 r0 = r9.A00
            java.lang.CharSequence r1 = r1.A00(r0, r3)
        L_0x0099:
            com.facebookpay.widget.disclaimer.DisclaimerLayout r0 = r10.A00
            r0.setPrimaryLinkableText(r1)
            com.facebookpay.widget.accessibility.AccessibleTextView r2 = r0.getPrimaryTextView()
            android.content.Context r1 = r0.getContext()
            r0 = 2131826369(0x7f1116c1, float:1.928562E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0k(r1, r0)
            r2.A00(r0)
        L_0x00b0:
            com.facebookpay.widget.disclaimer.DisclaimerLayout r2 = r10.A00
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A01
            if (r0 == 0) goto L_0x0125
            r1 = 8
            r0.setVisibility(r1)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A02
            if (r0 == 0) goto L_0x0122
            r0.setVisibility(r1)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A03
            if (r0 == 0) goto L_0x011f
            r0.setVisibility(r1)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A04
            if (r0 == 0) goto L_0x0128
            r0.setVisibility(r1)
            return
        L_0x00d1:
            android.text.SpannableStringBuilder r2 = X.C18200wM.A0E(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = X.AnonymousClass8bP.A0J(r0, r4, r3, r3)
            int r0 = r1 + 18
            android.text.SpannableStringBuilder r4 = r2.replace(r1, r0, r5)
            goto L_0x0072
        L_0x00e4:
            com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem r8 = (com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem) r8
            r6 = r8
            if (r8 == 0) goto L_0x00ef
            java.lang.String r0 = r8.A04
        L_0x00eb:
            if (r6 == 0) goto L_0x0099
            goto L_0x0056
        L_0x00ef:
            r0 = r1
            goto L_0x00eb
        L_0x00f1:
            boolean r0 = X.AnonymousClass7Kx.A0P(r11)
            if (r0 == 0) goto L_0x00b0
            com.facebookpay.widget.disclaimer.DisclaimerLayout r1 = r10.A00
            com.facebook.shimmer.ShimmerFrameLayout r0 = r1.A01
            if (r0 == 0) goto L_0x0125
            r0.setVisibility(r3)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r1.A02
            if (r0 == 0) goto L_0x0122
            r0.setVisibility(r3)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r1.A03
            if (r0 == 0) goto L_0x011f
            r0.setVisibility(r3)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r1.A04
            if (r0 == 0) goto L_0x0128
            r0.setVisibility(r3)
            com.facebookpay.widget.accessibility.AccessibleTextView r1 = r1.getPrimaryTextView()
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x011f:
            java.lang.String r0 = "shimmerRow3"
            goto L_0x012a
        L_0x0122:
            java.lang.String r0 = "shimmerRow2"
            goto L_0x012a
        L_0x0125:
            java.lang.String r0 = "shimmerRow1"
            goto L_0x012a
        L_0x0128:
            java.lang.String r0 = "shimmerRow4"
        L_0x012a:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91615gW.A0A(X.5B5, X.7Kx):void");
    }

    public C91615gW(C143638h4 r3, C143638h4 r4, LoggingContext loggingContext) {
        super(AnonymousClass69U.A0f, loggingContext, false);
        this.A01 = r3;
        this.A00 = r4;
    }
}
