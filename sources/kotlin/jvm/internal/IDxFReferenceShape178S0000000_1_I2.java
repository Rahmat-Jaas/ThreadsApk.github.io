package kotlin.jvm.internal;

import X.AnonymousClass0YC;
import X.C02250Ak;
import X.C81774oL;

public class IDxFReferenceShape178S0000000_1_I2 extends C02250Ak implements C81774oL, AnonymousClass0YC {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IDxFReferenceShape178S0000000_1_I2(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            if (r9 == 0) goto L_0x0012
            java.lang.Class<X.10c> r3 = X.C195310c.class
            java.lang.String r4 = "getUiState"
            java.lang.String r5 = "getUiState(Lcom/instagram/fanclub/promovideo/FanClubPromoAndWelcomeVideoViewModel$ServerMediaState;Lcom/instagram/fanclub/promovideo/FanClubPromoAndWelcomeVideoViewModel$PendingMediaState;I)Lcom/instagram/fanclub/promovideo/FanClubPromoAndWelcomeVideoViewModel$UiState;"
        L_0x000b:
            r1 = 4
            r2 = r8
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0012:
            java.lang.Class<X.10i> r3 = X.C195610i.class
            java.lang.String r4 = "combineSubscribedTabSections"
            java.lang.String r5 = "combineSubscribedTabSections(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;"
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDxFReferenceShape178S0000000_1_I2.<init>(java.lang.Object, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r14 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r0 != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005b, code lost:
        if (r17 != false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0063, code lost:
        if (r12 == null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r6.A02 != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r24, java.lang.Object r25, java.lang.Object r26, java.lang.Object r27) {
        /*
            r23 = this;
            r1 = r23
            r5 = r26
            r6 = r25
            r9 = r24
            int r0 = r1.A00
            if (r0 == 0) goto L_0x007c
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2 r9 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100100_I2) r9
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2 r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2) r6
            int r4 = X.AnonymousClass0wJ.A04(r5)
            java.lang.Object r1 = r1.receiver
            X.10c r1 = (X.C195310c) r1
            r22 = 0
            if (r4 != 0) goto L_0x0022
            boolean r0 = r6.A02
            r17 = 0
            if (r0 == 0) goto L_0x0024
        L_0x0022:
            r17 = 1
        L_0x0024:
            X.BKU r3 = X.C195310c.A00(r9, r6)
            r13 = 0
            if (r3 == 0) goto L_0x007a
            com.instagram.common.typedurl.ImageUrl r12 = r3.A22()
        L_0x002f:
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0078
            java.lang.String r14 = r6.A01
        L_0x0035:
            if (r12 != 0) goto L_0x003a
            r2 = 0
            if (r14 == 0) goto L_0x003b
        L_0x003a:
            r2 = 1
        L_0x003b:
            boolean r0 = r1.A0D
            if (r0 != 0) goto L_0x0044
            boolean r0 = r1.A0E
            r1 = 0
            if (r0 == 0) goto L_0x0045
        L_0x0044:
            r1 = 1
        L_0x0045:
            if (r3 == 0) goto L_0x004b
            X.BKN r0 = r3.A0f
            java.lang.String r13 = r0.A4Y
        L_0x004b:
            boolean r15 = X.C18180wK.A1V(r4)
            r18 = r2 ^ 1
            if (r2 == 0) goto L_0x0075
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.FIT_CENTER
        L_0x0055:
            r19 = r17 ^ 1
            if (r12 == 0) goto L_0x005d
            r16 = 1
            if (r17 == 0) goto L_0x005f
        L_0x005d:
            r16 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x0065
            r21 = 1
            if (r12 != 0) goto L_0x006d
        L_0x0065:
            r21 = 0
            if (r1 == 0) goto L_0x006d
            if (r12 != 0) goto L_0x006d
            r22 = 1
        L_0x006d:
            X.17E r10 = new X.17E
            r20 = r18
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r10
        L_0x0075:
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.CENTER
            goto L_0x0055
        L_0x0078:
            r14 = r13
            goto L_0x0035
        L_0x007a:
            r12 = r13
            goto L_0x002f
        L_0x007c:
            java.util.List r9 = (java.util.List) r9
            java.util.List r6 = (java.util.List) r6
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r2 = r1.receiver
            X.10i r2 = (X.C195610i) r2
            X.8AN r10 = new X.8AN
            r10.<init>()
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x00a1
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 2131836335(0x7f113daf, float:1.9305834E38)
            X.1kC r1 = X.AnonymousClass1kC.A00(r1, r0)
            X.1lK r0 = new X.1lK
            r0.<init>(r1)
            r10.add(r0)
        L_0x00a1:
            r3 = 0
            r7 = 1
            if (r9 == 0) goto L_0x016f
            boolean r0 = X.C18190wL.A1a(r9)
            if (r0 != r7) goto L_0x0104
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131836323(0x7f113da3, float:1.930581E38)
            X.1kC r4 = X.AnonymousClass1kC.A00(r1, r0)
            r1 = 0
            X.194 r0 = new X.194
            r0.<init>(r1, r4, r1)
            r10.add(r0)
            com.instagram.service.session.UserSession r8 = r2.A04
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r0 = 36326163374679499(0x810e74000025cb, double:3.036150219641924E-306)
            boolean r4 = X.C63803iN.A0E(r4, r8, r0)
            java.util.Iterator r1 = r9.iterator()
        L_0x00ce:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e3
            com.instagram.user.model.User r0 = X.C18220wO.A0c(r1)
            r0.A1f()
            X.198 r0 = X.C195610i.A00(r2, r0, r4)
            r10.add(r0)
            goto L_0x00ce
        L_0x00e3:
            if (r4 == 0) goto L_0x0104
            X.6ew r0 = r2.A03
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = "has_seen_subscription_notification_settings_tooltip"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x0104
            X.4wE r4 = r2.A06
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131836340(0x7f113db4, float:1.9305844E38)
            X.1kC r1 = X.AnonymousClass1kC.A00(r1, r0)
            X.1pM r0 = new X.1pM
            r0.<init>(r1)
            r4.CrC(r0)
        L_0x0104:
            r4 = 0
            if (r6 == 0) goto L_0x016f
            boolean r0 = X.C18190wL.A1a(r6)
            if (r0 != r7) goto L_0x013b
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131836321(0x7f113da1, float:1.9305805E38)
            X.1kC r1 = X.AnonymousClass1kC.A00(r1, r0)
            X.194 r0 = new X.194
            r0.<init>(r4, r1, r4)
            r10.add(r0)
            java.util.List r0 = X.C195610i.A01(r6)
            java.util.Iterator r1 = r0.iterator()
        L_0x0126:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x013b
            com.instagram.user.model.User r0 = X.C18220wO.A0c(r1)
            r0.A1f()
            X.198 r0 = X.C195610i.A00(r2, r0, r3)
            r10.add(r0)
            goto L_0x0126
        L_0x013b:
            boolean r0 = X.C18190wL.A1a(r5)
            if (r0 == 0) goto L_0x016f
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131836320(0x7f113da0, float:1.9305803E38)
            X.1kC r1 = X.AnonymousClass1kC.A00(r1, r0)
            X.194 r0 = new X.194
            r0.<init>(r4, r1, r4)
            r10.add(r0)
            java.util.List r0 = X.C195610i.A01(r5)
            java.util.Iterator r1 = r0.iterator()
        L_0x015a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x016f
            com.instagram.user.model.User r0 = X.C18220wO.A0c(r1)
            r0.A1f()
            X.198 r0 = X.C195610i.A00(r2, r0, r3)
            r10.add(r0)
            goto L_0x015a
        L_0x016f:
            boolean r0 = X.C18190wL.A1a(r10)
            if (r0 == 0) goto L_0x017c
            X.9Y7 r0 = X.AnonymousClass9Y7.A00(r2)
            r10.add(r0)
        L_0x017c:
            X.AnonymousClass0OP.A11(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDxFReferenceShape178S0000000_1_I2.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
