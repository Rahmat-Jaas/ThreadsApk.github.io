package X;

import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.3wc  reason: invalid class name and case insensitive filesystem */
public final class C65893wc implements C143158gC {
    public final /* synthetic */ C23051bq A00;
    public final /* synthetic */ BusinessNavBar A01;
    public final /* synthetic */ IgTextView A02;
    public final /* synthetic */ IgTextView A03;
    public final /* synthetic */ RoundedCornerImageView A04;
    public final /* synthetic */ SpinnerImageView A05;

    public C65893wc(C23051bq r1, BusinessNavBar businessNavBar, IgTextView igTextView, IgTextView igTextView2, RoundedCornerImageView roundedCornerImageView, SpinnerImageView spinnerImageView) {
        this.A04 = roundedCornerImageView;
        this.A03 = igTextView;
        this.A02 = igTextView2;
        this.A01 = businessNavBar;
        this.A05 = spinnerImageView;
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r12) {
        /*
            r11 = this;
            X.175 r12 = (X.AnonymousClass175) r12
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r4 = r11.A04
            com.instagram.common.ui.base.IgTextView r3 = r11.A03
            com.instagram.common.ui.base.IgTextView r2 = r11.A02
            com.instagram.business.ui.BusinessNavBar r8 = r11.A01
            com.instagram.ui.widget.spinner.SpinnerImageView r6 = r11.A05
            boolean r5 = r12.A01
            r1 = 8
            r0 = 0
            if (r5 == 0) goto L_0x0015
            r0 = 8
        L_0x0015:
            r4.setVisibility(r0)
            r0 = 0
            if (r5 == 0) goto L_0x001d
            r0 = 8
        L_0x001d:
            r3.setVisibility(r0)
            r0 = 0
            if (r5 == 0) goto L_0x0025
            r0 = 8
        L_0x0025:
            r2.setVisibility(r0)
            if (r5 != 0) goto L_0x002b
            r1 = 0
        L_0x002b:
            r8.setVisibility(r1)
            if (r5 == 0) goto L_0x0110
            X.69F r0 = X.AnonymousClass69F.LOADING
        L_0x0032:
            r6.setLoadingStatus(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4300000_I2 r9 = r12.A00
            if (r9 == 0) goto L_0x00c9
            X.1bq r7 = r11.A00
            X.4u2 r1 = r7.A00
            r10 = 0
            if (r1 != 0) goto L_0x0046
            java.lang.String r1 = "configurer"
        L_0x0042:
            X.C04220Ms.A0E(r1)
            throw r10
        L_0x0046:
            java.lang.String r0 = r9.A05
            r1.setTitle(r0)
            java.lang.String r0 = r9.A06
            com.instagram.common.typedurl.SimpleImageUrl r5 = X.C18250wR.A0K(r0)
            java.lang.Object r1 = r9.A00
            com.instagram.business.promote.model.InstagramMediaProductType r0 = com.instagram.business.promote.model.InstagramMediaProductType.STORY
            if (r1 != r0) goto L_0x0069
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            X.C04220Ms.A06(r1)
            int r0 = r1.height
            int r0 = r0 * 9
            int r0 = r0 >> 4
            r1.width = r0
            r4.setLayoutParams(r1)
        L_0x0069:
            X.20n r0 = X.C303120n.CENTER_CROP
            r4.A03 = r0
            r4.setUrl(r5, r7)
            r6 = 0
            r4.setVisibility(r6)
            java.lang.String r0 = r9.A04
            r3.setText(r0)
            java.lang.String r0 = r9.A03
            r2.setText(r0)
            java.lang.Object r5 = r9.A01
            com.instagram.business.promote.model.PromoteButtonAction r5 = (com.instagram.business.promote.model.PromoteButtonAction) r5
            java.lang.String r0 = r5.A01
            if (r0 == 0) goto L_0x0108
            r8.setPrimaryButtonText((java.lang.CharSequence) r0)
            r4 = 1
            android.view.View r0 = r8.A01
            r0.setVisibility(r6)
            com.instagram.service.session.UserSession r0 = r7.A02
            if (r0 != 0) goto L_0x0096
            java.lang.String r1 = "userSession"
            goto L_0x0042
        L_0x0096:
            boolean r0 = X.C37318JpL.A04(r0)
            if (r0 != 0) goto L_0x00ca
            r8.setPrimaryButtonEnabled(r4)
            r0 = 46
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r1 = X.C18200wM.A0R(r7, r5, r0)
        L_0x00a5:
            r8.setPrimaryButtonOnclickListeners(r1)
        L_0x00a8:
            java.lang.Object r1 = r9.A02
            com.instagram.business.promote.model.PromoteButtonAction r1 = (com.instagram.business.promote.model.PromoteButtonAction) r1
            if (r1 == 0) goto L_0x00c9
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L_0x0108
            r8.setSecondaryButtonText((java.lang.CharSequence) r0)
            r8.setSecondaryButtonEnabled(r4)
            com.instagram.common.ui.text.TitleTextView r0 = r8.A03
            r0.setVisibility(r6)
            r8.A00()
            r0 = 47
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r7, r1, r0)
            r8.setSecondaryButtonOnclickListeners(r0)
        L_0x00c9:
            return
        L_0x00ca:
            java.lang.String r0 = r7.A04
            java.lang.String r1 = "adAccountId"
            if (r0 == 0) goto L_0x0042
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0104
            r8.setPrimaryButtonEnabled(r4)
            X.0MJ r3 = new X.0MJ
            r3.<init>()
            java.lang.String r0 = r5.A02
            if (r0 == 0) goto L_0x010c
            r3.A00 = r0
            java.lang.String r2 = r7.A04
            if (r2 == 0) goto L_0x0042
            java.lang.String r1 = "%2C+%22paymentAccountID%22%3A+%22{{ad_account_id}}%22%7D"
            java.lang.String r0 = "{{ad_account_id}}"
            java.lang.String r2 = X.AnonymousClass8bQ.A0l(r1, r0, r2, r6)
            java.lang.Object r1 = r3.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "%7D"
            java.lang.String r0 = X.AnonymousClass8bQ.A0l(r1, r0, r2, r6)
            r3.A00 = r0
            r0 = 14
            com.facebook.redex.IDxCListenerShape41S0300000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape41S0300000_1_I2
            r1.<init>((int) r0, (java.lang.Object) r3, (java.lang.Object) r5, (java.lang.Object) r7)
            goto L_0x00a5
        L_0x0104:
            r8.setPrimaryButtonEnabled(r6)
            goto L_0x00a8
        L_0x0108:
            java.lang.String r1 = "displayText"
            goto L_0x0042
        L_0x010c:
            java.lang.String r1 = "link"
            goto L_0x0042
        L_0x0110:
            X.69F r0 = X.AnonymousClass69F.SUCCESS
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65893wc.onChanged(java.lang.Object):void");
    }
}
