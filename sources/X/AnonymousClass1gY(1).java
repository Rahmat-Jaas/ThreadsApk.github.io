package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1gY  reason: invalid class name */
public final class AnonymousClass1gY extends AnonymousClass436 {
    public final Context A00;
    public final C34640IcN A01;
    public final UserSession A02;
    public final CUV A03;

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r26, android.view.View r27, java.lang.Object r28, java.lang.Object r29) {
        /*
            r25 = this;
            r4 = r28
            r0 = -698658615(0xffffffffd65b50c9, float:-6.0285004E13)
            int r11 = X.C14030oh.A03(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.share.facebook.upsell.feed.FeedShareToFbRowModel"
            X.C04220Ms.A0C(r4, r0)
            X.3Si r4 = (X.C61213Si) r4
            if (r27 == 0) goto L_0x004e
            java.lang.Object r0 = r27.getTag()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r5 = r27.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.share.facebook.upsell.feed.FeedShareToFbRowViewBinder.Holder"
            X.C04220Ms.A0C(r5, r0)
            X.3DL r5 = (X.AnonymousClass3DL) r5
            r1 = r25
            android.content.Context r0 = r1.A00
            r24 = r0
            X.IcN r13 = r1.A01
            com.instagram.service.session.UserSession r3 = r1.A02
            X.CUV r14 = r1.A03
            r2 = 0
            boolean r9 = X.AnonymousClass0wJ.A1Z(r5, r4)
            r10 = 2
            boolean r0 = X.C62183Xq.A00(r3)
            r4.A01 = r0
            boolean r0 = X.C67373zR.A09(r3)
            r4.A00 = r0
            if (r0 == 0) goto L_0x0055
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0055
            android.widget.LinearLayout r1 = r5.A00
            r0 = 8
            r1.setVisibility(r0)
        L_0x004e:
            r0 = -1561618622(0xffffffffa2eb9742, float:-6.385703E-18)
            X.C14030oh.A0A(r0, r11)
            return
        L_0x0055:
            X.BKU r12 = r4.A02
            X.24M r0 = r12.A2I()
            X.24M r8 = X.AnonymousClass24M.SHARED
            boolean r6 = X.C18180wK.A1Z(r0, r8)
            X.Ayd r1 = r5.A05
            r0 = 8
            if (r6 != 0) goto L_0x0068
            r0 = 0
        L_0x0068:
            r1.A09(r0)
            com.instagram.common.ui.base.IgTextView r7 = r5.A02
            r7.setSingleLine(r2)
            X.24M r0 = r12.A2I()
            boolean r0 = X.C18180wK.A1Z(r0, r8)
            if (r0 != 0) goto L_0x01e9
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r0 = 36326382418535967(0x810ea70008261f, double:3.036288743858773E-306)
            boolean r0 = X.C63803iN.A0E(r6, r3, r0)
            if (r0 == 0) goto L_0x01e1
            X.0Ok r15 = X.C06810aP.A01
            X.9tz r1 = X.C18200wM.A0a(r3, r15)
            X.9tz r0 = X.C169839tz.PrivacyStatusPublic
            if (r1 != r0) goto L_0x01b1
            r0 = 36326382418470430(0x810ea70007261e, double:3.036288743817327E-306)
            boolean r0 = X.C63803iN.A0E(r6, r3, r0)
            if (r0 == 0) goto L_0x00b0
            r0 = 36607857395045178(0x820ea70005133a, double:3.2142946524119546E-306)
            int r0 = X.C63803iN.A01(r6, r3, r0)
            if (r0 != r9) goto L_0x01d7
            r7.setVisibility(r2)
            r0 = 2131827448(0x7f111af8, float:1.9287809E38)
        L_0x00ad:
            r7.setText(r0)
        L_0x00b0:
            X.24M r0 = r12.A2I()
            boolean r0 = X.C18180wK.A1Z(r0, r8)
            if (r0 != 0) goto L_0x01a8
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r0 = 36326382418535967(0x810ea70008261f, double:3.036288743858773E-306)
            boolean r0 = X.C63803iN.A0E(r6, r3, r0)
            if (r0 == 0) goto L_0x01a8
            X.0Ok r7 = X.C06810aP.A01
            X.9tz r1 = X.C18200wM.A0a(r3, r7)
            X.9tz r0 = X.C169839tz.PrivacyStatusPublic
            if (r1 != r0) goto L_0x016f
            r0 = 36326382418470430(0x810ea70007261e, double:3.036288743817327E-306)
            boolean r0 = X.C63803iN.A0E(r6, r3, r0)
            if (r0 == 0) goto L_0x0103
            r0 = 36607857395045178(0x820ea70005133a, double:3.2142946524119546E-306)
            int r6 = X.C63803iN.A01(r6, r3, r0)
            X.Ayd r7 = r5.A07
            r7.A09(r2)
            android.view.View r1 = r7.A08()
            r0 = 2131307619(0x7f092c63, float:1.823347E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 8
            if (r6 == r9) goto L_0x01ac
            if (r6 != r10) goto L_0x01ac
            r0 = 2131835677(0x7f113b1d, float:1.93045E38)
        L_0x0100:
            r1.setText(r0)
        L_0x0103:
            X.24M r0 = r12.A2I()
            boolean r0 = X.C18180wK.A1Z(r0, r8)
            X.Ayd r9 = r5.A06
            if (r0 == 0) goto L_0x0127
            r0 = 8
            r9.A09(r0)
        L_0x0114:
            X.24M r0 = r12.A2I()
            boolean r0 = X.C18180wK.A1Z(r0, r8)
            if (r0 != 0) goto L_0x01fc
            X.Ayd r1 = r5.A04
            r0 = 8
            r1.A09(r0)
            goto L_0x004e
        L_0x0127:
            int r0 = r9.A07()
            if (r0 == 0) goto L_0x0140
            X.2AC r7 = X.AnonymousClass2AC.A0H
            X.2AD r6 = X.AnonymousClass2AD.A0W
            X.29W r1 = X.AnonymousClass29W.VIEW
            X.14U r0 = X.AnonymousClass14U.A00()
            X.C61213Si.A00(r0, r4)
            X.C49322rC.A00(r7, r1, r6, r0, r3)
            r9.A09(r2)
        L_0x0140:
            java.util.UUID r0 = X.C03480Iw.A00()
            java.lang.String r23 = X.C18190wL.A0n(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r5.A03
            r0 = 64
            X.C18200wM.A1E(r1, r5, r4, r3, r0)
            com.instagram.igds.components.button.IgdsButton r1 = r5.A09
            r0 = 2131835620(0x7f113ae4, float:1.9304384E38)
            r1.setText((int) r0)
            X.3rn r0 = new X.3rn
            r21 = r5
            r22 = r14
            r19 = r3
            r20 = r4
            r17 = r13
            r18 = r12
            r15 = r0
            r16 = r24
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r1.setOnClickListener(r0)
            goto L_0x0114
        L_0x016f:
            X.9tz r1 = X.C18200wM.A0a(r3, r7)
            X.9tz r0 = X.C169839tz.PrivacyStatusPrivate
            if (r1 != r0) goto L_0x01a8
            r0 = 36326382418404893(0x810ea70006261d, double:3.0362887437758814E-306)
            boolean r0 = X.C63803iN.A0E(r6, r3, r0)
            if (r0 == 0) goto L_0x0103
            r0 = 36607857395045178(0x820ea70005133a, double:3.2142946524119546E-306)
            int r6 = X.C63803iN.A01(r6, r3, r0)
            X.Ayd r7 = r5.A07
            r7.A09(r2)
            android.view.View r1 = r7.A08()
            r0 = 2131307619(0x7f092c63, float:1.823347E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 8
            if (r6 == r9) goto L_0x01ac
            if (r6 != r10) goto L_0x01ac
            r0 = 2131835676(0x7f113b1c, float:1.9304497E38)
            goto L_0x0100
        L_0x01a8:
            X.Ayd r7 = r5.A07
            r0 = 8
        L_0x01ac:
            r7.A09(r0)
            goto L_0x0103
        L_0x01b1:
            X.9tz r1 = X.C18200wM.A0a(r3, r15)
            X.9tz r0 = X.C169839tz.PrivacyStatusPrivate
            if (r1 != r0) goto L_0x01e1
            r0 = 36326382418404893(0x810ea70006261d, double:3.0362887437758814E-306)
            boolean r0 = X.C63803iN.A0E(r6, r3, r0)
            if (r0 == 0) goto L_0x00b0
            r0 = 36607857395045178(0x820ea70005133a, double:3.2142946524119546E-306)
            int r0 = X.C63803iN.A01(r6, r3, r0)
            if (r0 != r9) goto L_0x01d7
            r7.setVisibility(r2)
            r0 = 2131827447(0x7f111af7, float:1.9287807E38)
            goto L_0x00ad
        L_0x01d7:
            if (r0 != r10) goto L_0x01f5
            r7.setVisibility(r2)
            r0 = 2131835681(0x7f113b21, float:1.9304507E38)
            goto L_0x00ad
        L_0x01e1:
            r7.setVisibility(r2)
            r0 = 2131827446(0x7f111af6, float:1.9287805E38)
            goto L_0x00ad
        L_0x01e9:
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x01f5
            r7.setVisibility(r2)
            r0 = 2131827441(0x7f111af1, float:1.9287795E38)
            goto L_0x00ad
        L_0x01f5:
            r0 = 8
            r7.setVisibility(r0)
            goto L_0x00b0
        L_0x01fc:
            X.Ayd r8 = r5.A04
            int r0 = r8.A07()
            if (r0 == 0) goto L_0x0217
            X.2AC r7 = X.AnonymousClass2AC.A0H
            X.2AD r6 = X.AnonymousClass2AD.A0U
            X.29W r1 = X.AnonymousClass29W.VIEW
            X.14U r0 = X.AnonymousClass14U.A00()
            X.C61213Si.A00(r0, r4)
            X.C49322rC.A00(r7, r1, r6, r0, r3)
            r8.A09(r2)
        L_0x0217:
            com.instagram.igds.components.button.IgdsButton r2 = r5.A08
            r0 = 2131838153(0x7f1144c9, float:1.9309521E38)
            r2.setText((int) r0)
            com.instagram.common.ui.base.IgTextView r1 = r5.A01
            r0 = 63
            X.C18200wM.A1E(r1, r5, r4, r3, r0)
            r16 = 5
            com.facebook.redex.IDxCListenerShape5S0500000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape5S0500000_1_I2
            r15 = r0
            r17 = r24
            r18 = r14
            r19 = r5
            r20 = r3
            r21 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r2.setOnClickListener(r0)
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1gY.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        if (r2 != null) {
            r2.A5K(0);
        }
    }

    public AnonymousClass1gY(Context context, C34640IcN icN, UserSession userSession, CUV cuv) {
        this.A00 = context;
        this.A01 = icN;
        this.A02 = userSession;
        this.A03 = cuv;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(2121529739, viewGroup);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.row_share_to_fb_layout);
        C04220Ms.A06(A0H);
        A0H.setTag(new AnonymousClass3DL(A0H));
        C14030oh.A0A(175526356, A002);
        return A0H;
    }
}
