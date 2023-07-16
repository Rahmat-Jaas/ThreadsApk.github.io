package X;

import android.view.View;

/* renamed from: X.6za  reason: invalid class name and case insensitive filesystem */
public final class C117996za {
    public static final C127377h1 A00(M5L m5l, String str, int i, int i2) {
        int i3 = i;
        M5L m5l2 = m5l;
        int i4 = i2;
        if (View.MeasureSpec.getMode(i) == 0 || View.MeasureSpec.getMode(i2) == 0) {
            C30967GcS.A02("UserAvatarBinderUtils", "Measure specs  are UNSPECIFIED for UserAvatar");
            return new C127377h1(m5l2, i3, i4, 0, 0);
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int[] iArr = new int[2];
        if (C100986Pl.A00(str, "image_preview_card")) {
            iArr[0] = size;
        } else {
            size2 = Math.min(size, size2);
            iArr[0] = size2;
        }
        iArr[1] = size2;
        return C127377h1.A01(m5l2, i, i2, iArr[0], size2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c1, code lost:
        if (r0 != null) goto L_0x00c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0181  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C111026mf r16, X.C871850m r17, X.AnonymousClass3HX r18, X.C127397h3 r19, com.instagram.user.model.User r20) {
        /*
            r9 = r17
            r8 = r20
            boolean r11 = X.AnonymousClass0wJ.A1Y(r8, r9)
            r7 = 2
            r20 = r18
            r0 = r20
            X.C04220Ms.A0B(r0, r7)
            r14 = 3
            r0 = 4
            r10 = r16
            X.C04220Ms.A0B(r10, r0)
            X.0i6 r6 = X.C63913ic.A0E(r20)
            boolean r0 = r6 instanceof com.instagram.service.session.UserSession
            r12 = 0
            if (r0 == 0) goto L_0x01be
            com.instagram.service.session.UserSession r6 = (com.instagram.service.session.UserSession) r6
            if (r6 == 0) goto L_0x01be
            java.util.List r1 = r10.A06
            boolean r0 = X.C18190wL.A1a(r1)
            r5 = 0
            if (r0 == 0) goto L_0x0059
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r13 = r1.iterator()
        L_0x0035:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0069
            java.lang.String r3 = X.C18180wK.A0k(r13)
            com.instagram.user.model.User r2 = X.C18210wN.A0P(r6, r3)
            if (r2 == 0) goto L_0x0035
            X.C19554AyF.A02()
            com.instagram.reels.store.ReelStore r1 = com.instagram.reels.store.ReelStore.A02(r6)
            X.BOf r0 = new X.BOf
            r0.<init>(r2)
            com.instagram.model.reels.Reel r0 = r1.A0I(r0, r3, r11)
            r4.add(r0)
            goto L_0x0035
        L_0x0059:
            boolean r1 = r10.A07
            X.AyF r0 = X.C19554AyF.A02()
            if (r1 == 0) goto L_0x01b4
            com.instagram.model.reels.Reel r0 = X.C25749DrL.A00(r6, r8)
        L_0x0065:
            java.util.List r4 = X.C06750aI.A15(r0)
        L_0x0069:
            java.lang.Object r3 = X.AnonymousClass00J.A0G(r4, r11)
            com.instagram.model.reels.Reel r3 = (com.instagram.model.reels.Reel) r3
            if (r3 == 0) goto L_0x00f0
            java.lang.String r1 = r10.A05
            java.lang.String r0 = "image_preview_card"
            boolean r0 = X.C100986Pl.A00(r1, r0)
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = "with_preview_card"
            r9.setRenderType(r0)
            X.9wH r0 = X.C171229wH.A17
            X.Ddu r2 = new X.Ddu
            r2.<init>(r12, r3, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r13 = r9.getPreviewCard()
            X.0kW r1 = X.C63913ic.A09(r20)
            X.C04220Ms.A0B(r13, r11)
            X.C04220Ms.A0B(r1, r14)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r13.setScaleType(r0)
            com.instagram.model.reels.Reel r14 = r2.A03
            boolean r0 = r14.A0s(r6)
            if (r0 != 0) goto L_0x018a
            X.BKH r14 = r14.A08(r6)
            if (r14 == 0) goto L_0x00c6
            X.BKU r15 = r14.A0M
            if (r15 == 0) goto L_0x00b9
            X.JEw r0 = new X.JEw
            r0.<init>()
            r13.A0A = r0
            X.BKN r0 = r15.A0f
            java.lang.String r0 = r0.A4q
            r13.A0M = r0
        L_0x00b9:
            android.content.Context r0 = r13.getContext()
            com.instagram.common.typedurl.ImageUrl r0 = r14.A0C(r0)
        L_0x00c1:
            if (r0 == 0) goto L_0x00c6
        L_0x00c3:
            r13.setUrl(r0, r1)
        L_0x00c6:
            android.widget.TextView r1 = r9.getUsernameLabel()
            r0 = 5
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C04220Ms.A0C(r1, r0)
            r0 = r20
            android.content.Context r13 = r0.A00
            X.C04220Ms.A06(r13)
            java.lang.String r0 = X.DE7.A00(r2, r6)
            r1.setText(r0)
            boolean r0 = r2.A02(r6)
            if (r0 == 0) goto L_0x0181
            r0 = 2131100109(0x7f0601cd, float:1.781259E38)
            int r0 = r13.getColor(r0)
        L_0x00ed:
            r1.setTextColor(r0)
        L_0x00f0:
            com.instagram.common.typedurl.ImageUrl r1 = r8.B4M()
            X.0kW r0 = X.C63913ic.A09(r20)
            r9.setProfilePicUrl(r1, r0)
            java.lang.Integer r14 = r10.A03
            java.lang.Integer r0 = r10.A04
            r13 = 0
            if (r0 != 0) goto L_0x017f
            android.content.Context r2 = X.C18190wL.A0A(r9)
            r1 = 2131886132(0x7f120034, float:1.9406834E38)
            int[] r0 = X.C29934Fwk.A0G
            android.content.res.TypedArray r1 = r2.obtainStyledAttributes(r1, r0)
            X.C04220Ms.A06(r1)
            r0 = 5
            int r13 = r1.getDimensionPixelSize(r0, r11)
        L_0x0117:
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r14 != 0) goto L_0x0131
            if (r1 != 0) goto L_0x012d
            android.content.Context r14 = X.C18190wL.A0A(r9)
            r1 = 2131886132(0x7f120034, float:1.9406834E38)
            int[] r0 = X.C29934Fwk.A0G
            android.content.res.TypedArray r1 = r14.obtainStyledAttributes(r1, r0)
            X.C04220Ms.A06(r1)
        L_0x012d:
            int r2 = r1.getColor(r7, r2)
        L_0x0131:
            if (r13 != 0) goto L_0x0174
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r9.A04
            r0.setStrokeAlpha(r11)
        L_0x0138:
            java.lang.Integer r0 = r10.A02
            r9.setRingSpacing(r0)
            if (r3 == 0) goto L_0x0140
            r5 = 1
        L_0x0140:
            r9.setShowRing(r5)
            r2 = r19
            if (r3 == 0) goto L_0x0166
            boolean r0 = r3.A0t(r6)
            r0 = r0 ^ 1
            r9.setRingActive(r0)
            X.7RO r11 = new X.7RO
            r18 = r8
            r19 = r4
            r16 = r3
            r17 = r6
            r14 = r20
            r15 = r2
            r13 = r9
            r12 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0162:
            r9.setOnClickListener(r11)
            return
        L_0x0166:
            X.6jp r0 = r10.A00
            if (r0 == 0) goto L_0x01ba
            r1 = 13
            com.facebook.redex.IDxCListenerShape42S0300000_2_I2 r11 = new com.facebook.redex.IDxCListenerShape42S0300000_2_I2
            r0 = r20
            r11.<init>((int) r1, (java.lang.Object) r10, (java.lang.Object) r0, (java.lang.Object) r2)
            goto L_0x0162
        L_0x0174:
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r9.A04
            int r0 = r1.A00
            r1.setStrokeAlpha(r0)
            r1.A0F(r13, r2)
            goto L_0x0138
        L_0x017f:
            r1 = 0
            goto L_0x0117
        L_0x0181:
            r0 = 2131100073(0x7f0601a9, float:1.7812517E38)
            int r0 = r13.getColor(r0)
            goto L_0x00ed
        L_0x018a:
            X.BKO r0 = r14.A0B
            if (r0 == 0) goto L_0x01aa
            X.9BJ r15 = r0.A00
            java.lang.String r14 = r15.A03
            if (r14 == 0) goto L_0x019d
            X.JEw r0 = new X.JEw
            r0.<init>()
            r13.A0A = r0
            r13.A0M = r14
        L_0x019d:
            com.instagram.model.mediasize.ImageInfo r14 = r15.A01
            java.lang.Integer r0 = X.AnonymousClass006.A01
            com.instagram.common.typedurl.ImageUrl r0 = X.C122057Ju.A01(r14, r0)
            X.C04220Ms.A06(r0)
            goto L_0x00c3
        L_0x01aa:
            X.C0k r0 = r14.A0V
            if (r0 == 0) goto L_0x00c6
            com.instagram.common.typedurl.ImageUrl r0 = r0.AaK()
            goto L_0x00c1
        L_0x01b4:
            com.instagram.model.reels.Reel r0 = r0.A06(r6, r8)
            goto L_0x0065
        L_0x01ba:
            r9.setOnClickListener(r12)
            return
        L_0x01be:
            java.lang.String r1 = "UserAvatarBinderUtils"
            java.lang.String r0 = "Attempt to render user avatar outside of logged in user context"
            X.C30967GcS.A02(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117996za.A01(X.6mf, X.50m, X.3HX, X.7h3, com.instagram.user.model.User):void");
    }
}
